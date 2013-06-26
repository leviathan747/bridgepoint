//========================================================================
//
//File:      $RCSfile: SetRectilinearRoutingAction.java,v $
//Version:   $Revision: 1.5 $
//Modified:  $Date: 2013/01/10 23:05:57 $
//
//Copyright (c) 2005-2013 Mentor Graphics Corporation.  All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
package com.mentor.nucleus.bp.ui.graphics.actions;

import java.util.Iterator;

import org.eclipse.gef.EditPolicy;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.mentor.nucleus.bp.ui.graphics.figures.DecoratedPolylineConnection;
import com.mentor.nucleus.bp.ui.graphics.parts.ConnectorEditPart;
import com.mentor.nucleus.bp.ui.graphics.parts.DiagramEditPart;
import com.mentor.nucleus.bp.ui.graphics.policies.GraphicsConnectionLineSegPolicy;

public class SetRectilinearRoutingAction implements IActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			for (Iterator<?> iterator = ss.iterator(); iterator.hasNext();) {
				ConnectorEditPart selected = (ConnectorEditPart) iterator
						.next();
				DiagramEditPart diagramPart = (DiagramEditPart) selected
						.getViewer().getContents();
				((DecoratedPolylineConnection) selected.getFigure())
						.internalSetConnectionRouter(diagramPart
								.getRectilinearConnectionRouter());
				selected
						.removeEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE);
				selected.installEditPolicy(
						EditPolicy.CONNECTION_BENDPOINTS_ROLE,
						new GraphicsConnectionLineSegPolicy());
				selected.removeEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				selected.storeRouterSetting();
				selected.refresh();
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
