//=====================================================================
//
//File:      $RCSfile: CoreTest.java,v $
//Version:   $Revision: 1.21 $
//Modified:  $Date: 2013/03/14 02:37:43 $
//
//(c) Copyright 2004-2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================
package com.mentor.nucleus.bp.core.test;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;

import com.mentor.nucleus.bp.core.common.PersistableModelComponent;
import com.mentor.nucleus.bp.core.util.WorkspaceUtil;
import com.mentor.nucleus.bp.test.common.BaseTest;
import com.mentor.nucleus.bp.test.common.TestingUtilities;
import com.mentor.nucleus.bp.utilities.ui.ProjectUtilities;

public class CoreTest extends BaseTest
{
	
	protected static boolean initialized = false;
	
    public CoreTest(String projectName, String name) {
        super(projectName, name);
    }
    
    public CoreTest() {
    	super(null, null);
    }
    
    protected void setUp() throws Exception {
		super.setUp();
		
		WorkspaceUtil.setAutobuilding(false);
    }
    
    protected void initialize(String name) throws Exception {
    	initialize(name, true);
        }
    
    protected PersistableModelComponent initialize(String name, boolean loadDomainOnly) throws Exception {
        PersistableModelComponent pmc = null;
    	switchPerspective("com.mentor.nucleus.bp.core.perspective");
    	m_wp.activate(m_bp_view);
    	ProjectUtilities.allowJobCompletion();    	
    	if(!initialized){
    		project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
    		if (project.exists()) {
    			TestingUtilities.deleteProject(name);
    	        ProjectUtilities.allowJobCompletion();
    	        while ( Display.getCurrent().readAndDispatch() ) ;
    		}
			if(!project.exists()) {
				try {
					project = TestingUtilities.createProject(name);
				} catch (CoreException e) {
					fail(e.getMessage());
				}
				// get the SystemModel_c instance related to the
				// newly created project
				m_sys = getSystemModel(name);
                }

           pmc = ensureAvailableAndLoaded(name, loadDomainOnly, true);
            
            initialized = true;
        }
        m_bp_tree.expandAll();
        ProjectUtilities.allowJobCompletion();
        while ( Display.getCurrent().readAndDispatch() ) ;
        return pmc;
    }
}
