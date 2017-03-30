package org.xtuml.bp.cli;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.concurrent.ConcurrentLinkedDeque;

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
                    SocketHandler socketHandler = new SocketHandler(advisor, server);
                    Thread handlerThread = new Thread(socketHandler);
                    handlerThread.start();
                    while ( RUNNING == server_state ) {
                        try {
                            Socket sock = server.accept();
                            socketHandler.appendTaskQueue(sock);
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
        
        private static final String OK_RESPONSE = "OK";
        private static final String FAILURE_RESPONSE = "FL";

        private ConcurrentLinkedDeque<Command> taskQueue;
        
        private LaunchWorkbenchAdvisor advisor;
        private ServerSocket server;

        public SocketHandler( LaunchWorkbenchAdvisor advisor, ServerSocket server) {
            this.advisor = advisor;
            this.server = server;
            taskQueue = new ConcurrentLinkedDeque<Command>();
        }

        @Override
        public void run() {
            // handle commands
            while ( RUNNING == server_state ) {
                Command command = taskQueue.poll();
                if ( null != command && null != command.getCmd() ) {
                    String response = handleCommand(command.getCmd());
                    command.sendResponse(response);
                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        public void appendTaskQueue( Socket socket ) {
            // get command data
            InputStream in;
            ByteArrayOutputStream data = new ByteArrayOutputStream();
            try {
                in = socket.getInputStream();
                int c;
                // read one line from the socket
                while ( -1 != (c=in.read()) && '\n' != c ) {
                    data.write(c);
                }
                taskQueue.add( new Command(data.toString().trim(), socket) );
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        
        private String handleCommand( String cmd ) {
            if ( null == cmd || "".equals(cmd) ) return FAILURE_RESPONSE;

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
                return OK_RESPONSE;
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
            return OK_RESPONSE;
        }
    }
    
    private class Command {

        private String cmd;
        private Socket socket;

        public Command(String cmd, Socket socket) {
            this.cmd = cmd;
            this.socket = socket;
        }
        
        public String getCmd() {
            return cmd;
        }
        
        public void sendResponse( String msg ) {
            try {
                OutputStream out = socket.getOutputStream();
                out.write(msg.getBytes());
                out.flush();
                socket.close();
            } catch (SocketException e) {
                System.out.println("Socket has been closed by client.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
