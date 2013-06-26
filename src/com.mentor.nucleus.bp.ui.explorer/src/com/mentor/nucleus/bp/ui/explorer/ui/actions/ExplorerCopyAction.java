//========================================================================
//
//File:      $RCSfile: ExplorerCopyAction.java,v $
//Version:   $Revision: 1.6 $
//Modified:  $Date: 2013/01/10 23:15:51 $
//
//(c) Copyright 2005-2013 by Mentor Graphics Corp. All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
package com.mentor.nucleus.bp.ui.explorer.ui.actions;

import org.eclipse.swt.dnd.Transfer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;

import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.common.TransactionManager;
import com.mentor.nucleus.bp.core.ui.CopyAction;
import com.mentor.nucleus.bp.core.ui.Selection;
import com.mentor.nucleus.bp.core.util.CoreUtil;

public class ExplorerCopyAction extends CopyAction {

	private TreeViewer viewer;

	public ExplorerCopyAction(TreeViewer viewer) {
		super();
		this.viewer = viewer;
	}
	
	@Override
	protected NonRootModelElement[] getElementsToBeCopied(
			boolean includeGraphics) {
		return Selection.getInstance().getSelectedNonRootModelElements();
	}

	@Override
	protected TransactionManager getTransactionManager() {
		return TransactionManager.getSingleton();
	}

	@Override
	public boolean isEnabled() {
		return isSelectionCopiable(viewer, getElementsToBeCopied(false));
	}

	static boolean isSelectionCopiable(TreeViewer viewer, NonRootModelElement[] selected) {
		// for each element in the selection
		// ask if the container has a valid paste*
		// operation
		for(int i = 0; i < selected.length; i++) {
			boolean result = CoreUtil.supportsCopy(
					((ITreeContentProvider) viewer
							.getContentProvider())
							.getParent(selected[i]),
							selected[i]);
			if(!result) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected Object getSecondaryClipboardData() {
		return null;
	}

	@Override
	protected Transfer getSecondaryTransfer() {
		return null;
	}

	@Override
	protected boolean onlyIncludeSecondaryData() {
		return false;
	}
	
}
