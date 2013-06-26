//=====================================================================
//
//File:      $RCSfile: VerifierStaticVariablesInRealizedClassesTest.java,v $
//Version:   $Revision: 1.7 $
//Modified:  $Date: 2013/05/10 04:28:35 $
//
// NOTE: This file was generated, but is maintained by hand.
// Generated by: UnitTestGenerator.pl
// Version:      1.12
// Matrix:       t.txt
//
//(c) Copyright 2007-2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================

package com.mentor.nucleus.bp.debug.ui.test.realizedClasses;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;

import com.mentor.nucleus.bp.core.ComponentInstance_c;
import com.mentor.nucleus.bp.core.Component_c;
import com.mentor.nucleus.bp.core.CorePlugin;
import com.mentor.nucleus.bp.core.Function_c;
import com.mentor.nucleus.bp.core.Ooaofooa;
import com.mentor.nucleus.bp.core.Package_c;
import com.mentor.nucleus.bp.core.PackageableElement_c;
import com.mentor.nucleus.bp.core.SystemModel_c;
import com.mentor.nucleus.bp.core.common.BridgePointPreferencesStore;
import com.mentor.nucleus.bp.core.common.ClassQueryInterface_c;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.ui.Selection;
import com.mentor.nucleus.bp.core.ui.perspective.BridgePointPerspective;
import com.mentor.nucleus.bp.debug.ui.launch.BPDebugUtils;
import com.mentor.nucleus.bp.debug.ui.test.DebugUITestUtilities;
import com.mentor.nucleus.bp.test.TestUtil;
import com.mentor.nucleus.bp.test.common.BaseTest;
import com.mentor.nucleus.bp.test.common.TestingUtilities;
import com.mentor.nucleus.bp.test.common.UITestingUtilities;

public class VerifierStaticVariablesInRealizedClassesTest extends BaseTest {
    public static boolean generateResults = false;
    public static String  launchComponentName="";
    private static boolean initialized = false ;
    String test_id = "";
    private static SystemModel_c DuplicateEE_sys;
    private static SystemModel_c LocalEE_sys;
    private static SystemModel_c NoEE_sys;
	
	
 protected void setUp() throws Exception {
        
		if (!initialized) {
		super.setUp();
		CorePlugin.disableParseAllOnResourceChange();

		// set perspective switch dialog on launch
		DebugUIPlugin.getDefault().getPluginPreferences().setValue(
				IDebugUIConstants.PLUGIN_ID + ".switch_to_perspective",
				"always");

		CorePlugin
				.getDefault()
				.getPluginPreferences()
				.setDefault(
						BridgePointPreferencesStore.ALLOW_IMPLICIT_COMPONENT_ADDRESSING,
						true);

	
		loadProject("EERealizedStaticDataTestLibraryDuplicateRealizedEE");
		loadProject("EERealizedStaticDataTestLocalRealizedEE");
		loadProject("EERealizedStaticDataTestNoLocalRealizedEE");
		
		// initialize test model


		
		DuplicateEE_sys = SystemModel_c.SystemModelInstance(Ooaofooa
				.getDefaultInstance(), new ClassQueryInterface_c() {

			public boolean evaluate(Object candidate) {
				return ((SystemModel_c) candidate).getName().equals(
						"EERealizedStaticDataTestLibraryDuplicateRealizedEE");
			}

		});
		LocalEE_sys = SystemModel_c.SystemModelInstance(Ooaofooa
				.getDefaultInstance(), new ClassQueryInterface_c() {
			
			public boolean evaluate(Object candidate) {
				return ((SystemModel_c) candidate).getName().equals(
				"EERealizedStaticDataTestLocalRealizedEE");
			}
			
		});
		NoEE_sys= SystemModel_c.SystemModelInstance(Ooaofooa
				.getDefaultInstance(), new ClassQueryInterface_c() {

			public boolean evaluate(Object candidate) {
				return ((SystemModel_c) candidate).getName().equals(
						"EERealizedStaticDataTestNoLocalRealizedEE");
			}

		});
		CorePlugin.enableParseAllOnResourceChange();

		TestingUtilities.allowJobCompletion();
		while (!ResourcesPlugin.getWorkspace().getRoot().isSynchronized(
				IProject.DEPTH_INFINITE)) {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
					IProject.DEPTH_INFINITE, new NullProgressMonitor());
			while (PlatformUI.getWorkbench().getDisplay().readAndDispatch())
				;
		}

		Ooaofooa.setPersistEnabled(true);
        delayGlobalUpgrade = false;
        modelRoot = (Ooaofooa) m_sys.getModelRoot();
		initialized = true;
	}
}
    
    
    
    
    
    protected String getResultName() {
        return getClass().getSimpleName() + "_" + test_id;
    }



    public VerifierStaticVariablesInRealizedClassesTest(String testName) {
    	super(null, testName);
    }

    protected String getTestId(String src, String dest, String count) {
        return "test_" + count;
    }

  
    protected void tearDown() throws Exception {
    	DebugUITestUtilities.stopSession(DuplicateEE_sys, "EERealizedStaticDataTestLibraryDuplicateRealizedEE");
    	DebugUITestUtilities.stopSession(LocalEE_sys, "EERealizedStaticDataTestLocalRealizedEE");
    	DebugUITestUtilities.stopSession(NoEE_sys, "EERealizedStaticDataTestNoLocalRealizedEE");
		// clear any console output
		DebugUITestUtilities.clearConsoleOutput();
		DebugUITestUtilities.clearDebugView();
		// remove all breakpoints
		DebugUITestUtilities.removeAllBreakpoints();
		// wait for display events to complete
		TestingUtilities.processDisplayEvents();		
    }

	 private void runVerifier(NonRootModelElement[] preSelectedElements) {
	    	  
	    	  openPerspectiveAndView("com.mentor.nucleus.bp.debug.ui.DebugPerspective",BridgePointPerspective.ID_MGC_BP_EXPLORER);
	    	  
	    	  Selection.getInstance().setSelection(new StructuredSelection(preSelectedElements));
	    	  
	    	  Menu menu = m_bp_tree.getControl().getMenu();
	    	  assertTrue(
	    	    "The Launch Verifier action was not present for a component.",
	    	    UITestingUtilities.checkItemStatusInContextMenu(menu,
	    	      "Launch Verifier", "", false));
	    	  MenuItem launchVerifierItem = DebugUITestUtilities.getLaunchVerifierItem(menu);
	    	  assertNotNull(launchVerifierItem);
	    	  ComponentInstance_c[] engines = ComponentInstance_c.ComponentInstanceInstances(preSelectedElements[0].getModelRoot());
	    	  assertTrue("Unexpected test state, there should be no Component Instances.", engines.length == 0);
	    	  
	    	  TestUtil.debugToDialog(200);
	    	  launchVerifierItem.notifyListeners(SWT.Selection, null);
			  TestingUtilities.processDisplayEvents();
			  
			     menu = m_bp_tree.getControl().getMenu();
			  assertFalse(
			    "The Launch Verifier action was present for an unassigned imported component.",
			    UITestingUtilities.menuItemExists(menu, "", "Launch Verifier"));
		}


	 
	public void testSingleProjectDualLocalComponents() {
		doTest("DualLocalComponents", "RealizedStaticDataValuesSingleProjectDualLocalComponents.txt");
	}
	
	public void testSingleProjectComponentAndReference() {
		doTest("LocalComponentLocalReference", "RealizedStaticDataValuesSingleProjectComponentAndReference.txt");
	}
	
	public void testDualProjectLocalComponentIPReferenceNoEE() {
		doTest("LocalComponentIPReferenceNoEE", "RealizedStaticDataValuesDualProjectLocalComponentIPReferenceNoEE.txt");
	}
	
	public void testDualProjectLocalComponentIPReferenceDuplicateEE() {
		doTest("LocalComponentIPReferenceDuplicateEE", "RealizedStaticDataValuesDualProjectLocalComponentIPReferenceDuplicateEE.txt");
	}
	
	private void doTest(String packageName, String resultName) {
		Package_c testPkg = findPackageByName(LocalEE_sys, packageName);

		runVerifier(new NonRootModelElement[] {testPkg});
		DebugUITestUtilities.waitForElementsToStart(2);
		Component_c comp = findComponentByName(testPkg, "Tester");
		Function_c fun = Function_c.getOneS_SYNCOnR8001(PackageableElement_c
				.getManyPE_PEsOnR8000(Package_c
						.getManyEP_PKGsOnR8001(PackageableElement_c
								.getManyPE_PEsOnR8003(comp))));
		BPDebugUtils.setSelectionInSETree(new StructuredSelection(fun));
		Menu menu = DebugUITestUtilities.getMenuInSETree(fun);
		if (UITestingUtilities.checkItemStatusInContextMenu(menu, "Execute",
				"", false)) {
			BPDebugUtils.setSelectionInSETree(new StructuredSelection(
					fun));
			UITestingUtilities.activateMenuItem(menu, "Execute");
			// wait for the execution to complete
			DebugUITestUtilities.waitForBPThreads(m_sys);
			DebugUITestUtilities.waitForExecution();
		}
		while (PlatformUI.getWorkbench().getDisplay().readAndDispatch())
			;
		// compare the trace
		File expectedResults = new File(
				m_workspace_path
						+ "expected_results/verifier/" + resultName);
		String expected_results = TestUtil.getTextFileContents(expectedResults);
		// get the text representation of the debug tree
		String actual_results = DebugUITestUtilities
				.getConsoleText(expected_results);
		assertEquals(expected_results, actual_results);

		// TerminateAndRelaunch
		ComponentInstance_c engine = ComponentInstance_c
				.getOneI_EXEOnR2955(comp);
		assertNotNull(engine);

		// wait for the execution to complete
		DebugUITestUtilities.waitForBPThreads(m_sys);

		IProcess process = DebugUITestUtilities.getProcessForEngine(engine);
		assertNotNull(process);

		DebugUITestUtilities.setSelectionInDebugTree(process);
		menu = DebugUITestUtilities.getMenuForSelectionInDebugView();
		if (menu == null) {
			fail("Failed to get tree viewer in Debug View.");
		}
		UITestingUtilities.activateMenuItem(menu, "Terminate and Relaunch");
		DebugUITestUtilities.processDebugEvents();
		TestingUtilities.processPlatformJobs();
		DebugUITestUtilities.waitForExecution();
		DebugUITestUtilities.waitForBPThreads(m_sys);

		BPDebugUtils.setSelectionInSETree(new StructuredSelection(fun));
		menu = DebugUITestUtilities.getMenuInSETree(fun);
		if (UITestingUtilities.checkItemStatusInContextMenu(menu, "Execute",
				"", false)) {
			BPDebugUtils.setSelectionInSETree(new StructuredSelection(
					fun));
			UITestingUtilities.activateMenuItem(menu, "Execute");
			DebugUITestUtilities.waitForExecution();
			// wait for the execution to complete
			DebugUITestUtilities.waitForBPThreads(m_sys);
			DebugUITestUtilities.waitForExecution();
		}
		// compare the trace
		expectedResults = new File(
				m_workspace_path
						+ "expected_results/verifier/" + resultName);
		expected_results = TestUtil.getTextFileContents(expectedResults);
		// get the text from the console
		actual_results = DebugUITestUtilities.getConsoleText(expected_results);
		assertEquals(expected_results, actual_results);

	}
	
/*	public void testRealizedClassesWithSameNameDifferentImplementation(){
		NonRootModelElement[] systemComponent = findComponents(System_sys);
		NonRootModelElement[] libraryComponent = findComponents(Library_sys);
		NonRootModelElement[] preSelectedComponent = {systemComponent[0],libraryComponent[0]};
		
		runVerifier(preSelectedComponent);
		Function_c testFunc1 = findTestFunction(System_sys, "Functions", "TestCase2");
		Function_c testFunc2 = findTestFunction(Library_sys,"Functions", "TestCase1");
		
		
		BPDebugUtils.setSelectionInSETree(new StructuredSelection(testFunc1));
		Menu menu = DebugUITestUtilities.getMenuInSETree(testFunc1);
		assertTrue(
				"The execute menu item was not available for a required operation.",
				UITestingUtilities.checkItemStatusInContextMenu(menu,
						"Execute", "", false));
		UITestingUtilities.activateMenuItem(menu, "Execute");

		DebugUITestUtilities.waitForExecution();

		DebugUITestUtilities.waitForBPThreads(System_sys);
		DebugUITestUtilities.waitForExecution();
		
		BPDebugUtils.setSelectionInSETree(new StructuredSelection(testFunc2));
		menu = DebugUITestUtilities.getMenuInSETree(testFunc2);
		assertTrue(
				"The execute menu item was not available for a required operation.",
				UITestingUtilities.checkItemStatusInContextMenu(menu,
						"Execute", "", false));
		UITestingUtilities.activateMenuItem(menu, "Execute");

		DebugUITestUtilities.waitForExecution();

		DebugUITestUtilities.waitForBPThreads(Library_sys);
		DebugUITestUtilities.waitForExecution();
		
		File expectedResults = new File(
				m_workspace_path
						+ "expected_results/verifier/static_data_values_in_realizedclass_ipr.txt");
		String expected_results = TestUtil.getTextFileContents(expectedResults);
		String actualConsoleText = DebugUITestUtilities.getConsoleText();
		assertEquals(expected_results, actualConsoleText);
		 
	 } */

  private Package_c findPackageByName(SystemModel_c p_sys, String PackageName) {
	Package_c[] roots = Package_c.getManyEP_PKGsOnR1405(p_sys);
	
	Package_c root = null;
	for(int i = 0; i < roots.length; i++) {
		if(roots[i].getName().equalsIgnoreCase(PackageName)) {
			root = roots[i];
		}
	}
	return root;
  }

  private Component_c findComponentByName(Package_c p_pkg, String PackageName) {
		Component_c[] roots = Component_c.getManyC_CsOnR8001(
				              PackageableElement_c.getManyPE_PEsOnR8000(p_pkg));
		Component_c root = null;
		for(int i = 0; i < roots.length; i++) {
			if(roots[i].getName().equalsIgnoreCase(PackageName)) {
				root = roots[i];
			}
		}
		return root;
	  }



  
}
