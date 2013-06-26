//=====================================================================
//
//File:      $RCSfile$
//Version:   $Revision$
//Modified:  $Date$
//
//(c) Copyright 2007-2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================
import java.io.File;
import java.io.FileFilter;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.mentor.nucleus.bp.core.Ooaofooa;
import com.mentor.nucleus.bp.test.common.BaseTest;
import com.mentor.nucleus.bp.ui.canvas.test.ModelRecreationTests;

public class ModelRecreationTestSuite extends TestSuite {

	
    public static Test suite() {
        return new ModelRecreationTestSuite();
    }
    
    /**
     * Construct the test suite.
     */
    public ModelRecreationTestSuite() {
    	initializeRecreationSuite(this);
    }
    
   public static void initializeRecreationSuite(TestSuite suite) {
		
		File[] testModels = ModelRecreationTests.getTestModelNames();
		int modelCount = testModels.length;
		for(int i = 0; i < modelCount; i++) {
			ModelRecreationTests test = new ModelRecreationTests("testRecreateModel");
			test.modelNumber = i;
			test.testModel = testModels[i];
			suite.addTest(test);
		}
    }
}
