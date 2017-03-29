package org.xtuml.bp.cli;

public class BuildWorkbenchAdvisor extends BPCLIWorkbenchAdvisor {
	
	protected BuildWorkbenchAdvisor(BPCLIPreferences prefs) {
		super(prefs);
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
			    BuildExecutor executor = new BuildExecutor(cmdLine);
			    executor.execute();
			}
		});
		runner.setName("BP CLI Build");
		runner.start();
	}

}
