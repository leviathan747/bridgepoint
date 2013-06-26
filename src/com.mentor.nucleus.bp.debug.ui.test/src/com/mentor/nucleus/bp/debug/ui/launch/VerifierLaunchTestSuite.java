//=====================================================================
//
//File:      $RCSfile$
//Version:   $Revision$
//Modified:  $Date$
//
//(c) Copyright 2008-2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================
package com.mentor.nucleus.bp.debug.ui.launch;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.mentor.nucleus.bp.core.util.WorkspaceUtil;
import com.mentor.nucleus.bp.test.common.TestingUtilities;

/**
* Test all areas of the core
*/
public class VerifierLaunchTestSuite extends TestSuite {

	/**
	 * Returns the suite.  This is required to
	 * use the JUnit Launcher.
	 * @throws CoreException
	 */
	public static Test suite() throws CoreException {
		return new VerifierLaunchTestSuite();
	}
	
	/**
	 * Construct the test suite.
	 */
	public VerifierLaunchTestSuite() throws CoreException {
		
		// turn off auto-build to stop MC-3020 builders from running
		WorkspaceUtil.setAutobuilding(false);   // throws CoreException
		
		addTest(new TestSuite(VerifierLaunchConfigurationTests.class));
		addTest(new TestSuite(VerifierLaunchActionTests.class));
	}
}