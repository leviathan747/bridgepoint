//========================================================================
//
//File:      $RCSfile: XYDelegatingLayout.java,v $
//Version:   $Revision: 1.5 $
//Modified:  $Date: 2013/01/10 23:06:00 $
//
//(c) Copyright 2005-2013 by Mentor Graphics Corp. All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
package com.mentor.nucleus.bp.ui.graphics.layout;

import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class XYDelegatingLayout extends XYLayout {

	@Override
	public void layout(IFigure parent) {
		Iterator<?> children = parent.getChildren().iterator();
		IFigure f;
		while (children.hasNext()) {
			f = (IFigure)children.next();
			if(getConstraint(f) instanceof Locator) {
				Locator locator = (Locator) getConstraint(f);
				if (locator != null) {
					locator.relocate(f);
				}
			} else {
				Rectangle bounds = (Rectangle)getConstraint(f);
				if (bounds == null) continue;
	
				if (bounds.width == -1 || bounds.height == -1) {
					Dimension preferredSize = f.getPreferredSize(bounds.width, bounds.height);
					bounds = bounds.getCopy();
					if (bounds.width == -1)
						bounds.width = preferredSize.width;
					if (bounds.height == -1)
						bounds.height = preferredSize.height;
				}
				f.setBounds(bounds);
			}
		}
	}
	
}
