package org.xtuml.bp.cli;

import org.eclipse.ui.PlatformUI;

public class BuildWorkbenchAdvisor extends BPCLIWorkbenchAdvisor {
    
    private BuildExecutor executor;
	
	protected BuildWorkbenchAdvisor(BPCLIPreferences prefs) {
		super(prefs);
		executor = new BuildExecutor(cmdLine);
	}

	/**
	 * This is where we perform the build action.
	 */
	@Override
	public void postStartup() {
		super.postStartup();
		Thread runner = new Thread(new Runnable() {
			@Override
			public void run() {
			    executor.execute();
			    System.out.println("Build complete.  Exiting.");
                // Unless running in debug exit after the build.  Of course if this
                // is prebuidlerOnly there is no workbench to have to close
                if (!debug && !getPrebuilderOnly()) {
                    PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                        
                        @Override
                        public void run() {
                            PlatformUI.getWorkbench().close();
                        }
                    });
                }
			}
		});
		runner.setName("BP CLI Build");
		runner.start();
	}

	protected void performCLIBuild() {
	    executor.performCLIBuild();
	}
	
	public boolean getPrebuilderOnly() {
	    return executor.getPrebuilderOnly();
	}

}
