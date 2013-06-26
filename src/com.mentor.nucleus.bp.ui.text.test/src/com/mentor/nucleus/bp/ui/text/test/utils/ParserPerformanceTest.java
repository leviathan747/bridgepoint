//=====================================================================
//
//File:      $RCSfile: ParserPerformanceTest.java,v $
//Version:   $Revision: 1.9 $
//Modified:  $Date: 2013/01/10 22:47:06 $
//
//(c) Copyright 2005-2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================
package com.mentor.nucleus.bp.ui.text.test.utils;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.mentor.nucleus.bp.core.Domain_c;
import com.mentor.nucleus.bp.core.Ooaofooa;
import com.mentor.nucleus.bp.test.TestUtil;
import com.mentor.nucleus.bp.test.common.BaseTest;
import com.mentor.nucleus.bp.ui.text.activity.AllActivityModifier;

public class ParserPerformanceTest extends BaseTest {

	private static Ooaofooa modelRoot = BaseTest.getDefaultTestInstance();
	
	static IFile testModel = null;

	public ParserPerformanceTest(String name) throws Exception {
		super("test", name); //$NON-NLS-1$
	}

	public ParserPerformanceTest(String projectName, String name)
			throws CoreException {
		super("test", name); //$NON-NLS-1$
	}

	protected void setUp() throws Exception {
		if (modelRoot != null && Domain_c.DomainInstance(modelRoot) != null) {
			modelRoot.clearDatabase(new NullProgressMonitor());
		}

		if (testModel == null) {
			TestUtil.copyTestDomainIntoProject("ooaofooa","com.mentor.nucleus.bp.core",getProject());  //$NON-NLS-1$//$NON-NLS-2$
			testModel = getProject().getFile(Ooaofooa.MODELS_DIRNAME + "/ooaofooa." + Ooaofooa.MODELS_EXT); //$NON-NLS-1$
		}

		try {
			modelRoot.setLoadPathForTests(testModel.getLocation().toString());
			importModel(testModel, modelRoot, false, false, false);			
		} catch (IOException e) {
			fail(e.toString());
		}
		super.setUp();
	}

	public void testOalModelParsing(){
		AllActivityModifier aam = new AllActivityModifier(Domain_c.DomainInstance(modelRoot),new NullProgressMonitor());
		long startTime = System.currentTimeMillis();
		aam.processAllActivities(AllActivityModifier.PARSE);
		
		System.out.println("Time taken by the model to parse: " + ((System.currentTimeMillis() - startTime)/1000) + " sec");
	}
}