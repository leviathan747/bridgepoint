package org.xtuml.bp.cli;

import org.eclipse.ui.PlatformUI;

public class ImportWorkbenchAdvisor extends BPCLIWorkbenchAdvisor {

	protected ImportWorkbenchAdvisor(BPCLIPreferences prefs) {
		super(prefs);
	}

	@Override
	public void postStartup() {
		super.postStartup();
		Thread runner = new Thread(new Runnable() {
			@Override
			public void run() {
			    ImportExecutor executor = new ImportExecutor(cmdLine);
			    executor.execute();
			    System.out.println("Import complete.  Exiting.");
			    // Unless running in debug exit after the build
			    if (!debug) {
			        PlatformUI.getWorkbench().getDisplay().asyncExec(
                        new Runnable() {

                            @Override
                            public void run() {
                                PlatformUI.getWorkbench().close();
                            }
                        });
			    }
			}
		});
		runner.setName("BP CLI Import");
		runner.start();
	}
	
}
