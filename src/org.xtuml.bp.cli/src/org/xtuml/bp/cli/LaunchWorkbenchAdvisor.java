package org.xtuml.bp.cli;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

import org.eclipse.ui.PlatformUI;

public class LaunchWorkbenchAdvisor extends BPCLIWorkbenchAdvisor {
    
    private static int IDLE = 0;
    private static int RUNNING = 1;
    private static int TERMINATED = 2;
    
    private int server_state = IDLE;

    protected LaunchWorkbenchAdvisor(BPCLIPreferences prefs) {
        super(prefs);
    }

    @Override
    public void postStartup() {
        super.postStartup();
        final LaunchWorkbenchAdvisor advisor = this;
        Thread runner = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ServerSocket server = new ServerSocket();
                    server.bind(new InetSocketAddress(0));
                    server_state = RUNNING;
                    System.out.printf( "Server started and listening on port: %d\n", server.getLocalPort() );
                    while ( RUNNING == server_state ) {
                        try {
                            Socket sock = server.accept();
                            Thread socketHandler = new Thread(new SocketHandler(sock, advisor, server));
                            socketHandler.start();
                        } catch ( SocketException e ) {/* do nothing */}
                    }
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println("Launch complete. Exiting.");
                    if (!debug) {
                        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                            @Override
                            public void run() {
                                PlatformUI.getWorkbench().close();
                            }
                        });
                    }
                }
            }
        });
        runner.setName("BP CLI Launch");
        runner.start();
    }
    
    public void changeServerState( int state ) {
        server_state = state;
    }
    
    private class SocketHandler implements Runnable {
        
        private static final int BUF_SIZE = 1024;
        
        private LaunchWorkbenchAdvisor advisor;
        private ServerSocket server;

        private Socket socket;
        private InputStream in;
        
        public SocketHandler( Socket socket, LaunchWorkbenchAdvisor advisor, ServerSocket server) {
            this.socket = socket;
            this.advisor = advisor;
            this.server = server;
        }

        @Override
        public void run() {
            // get command data
            ByteArrayOutputStream data = new ByteArrayOutputStream();
            byte[] buffer = new byte[BUF_SIZE];
            String[] commands = {};
            try {
                in = socket.getInputStream();
                while ( -1 != in.read(buffer, 0, BUF_SIZE) ) data.write(buffer);
                commands = data.toString().split("\n");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            // handle commands
            for ( String command : commands ) {
                handleCommand(command.trim());
                if ( TERMINATED == server_state ) return;
            }
        }
        
        private void handleCommand( String cmd ) {
            if ( null == cmd || "".equals(cmd) ) return;

            // print command
            System.out.println("Executing command: " + cmd);
            
            // Check for exit command
            if ( "exit".equals(cmd) ) {
                // terminate the server
                advisor.changeServerState(TERMINATED);
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }
            
            // execute the command
            Executor executor = null;
            if ( cmd.startsWith("Import") ) {
                String[] context = cmd.replaceFirst("Import", "").trim().split(" ");
                try {
                    BPCLIPreferences cmdLine = new  BPCLIPreferences(context, Import.getCommandLineOptions());
                    executor = new ImportExecutor(cmdLine);
                }
                catch ( BPCLIException e ) {
                    BPCLIPreferences.logError("Error during Launch: " + e.getMessage(), null);
                }
            }
            else if ( cmd.startsWith("Build") ) {
                String[] context = cmd.replaceFirst("Build", "").trim().split(" ");
                try {
                    BPCLIPreferences cmdLine = new  BPCLIPreferences(context, Build.getCommandLineOptions());
                    executor = new BuildExecutor(cmdLine);
                }
                catch ( BPCLIException e ) {
                    BPCLIPreferences.logError("Error during Launch: " + e.getMessage(), null);
                }
            }
            else {
                System.out.println("Unrecognized command");
            }
            if ( null != executor ) executor.execute();
        }
    }

}
