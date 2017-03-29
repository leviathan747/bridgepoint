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
            }
        }
        
        private void handleCommand( String cmd ) {
            // print command
            System.out.println(cmd);
            
            if ( "exit".equals(cmd) ) {
                // terminate the server
                advisor.changeServerState(TERMINATED);
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if ( cmd.startsWith("Import") ) {
                String[] context = cmd.replaceFirst("Import", "").trim().split(" ");
                try {
                    BPCLIPreferences cmdLine = new  BPCLIPreferences(context, Import.getCommandLineOptions());
                    ImportExecutor executor = new ImportExecutor(cmdLine);
                    executor.execute();
                }
                catch ( BPCLIException e ) {
                    BPCLIPreferences.logError("Error during Launch: " + e.getMessage(), null);
                }
            }
        }
    }

}
