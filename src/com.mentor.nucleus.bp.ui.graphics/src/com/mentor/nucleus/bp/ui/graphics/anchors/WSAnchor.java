//========================================================================
//
//File:      $RCSfile: WSAnchor.java,v $
//Version:   $Revision: 1.8 $
//Modified:  $Date: 2013/03/14 02:49:32 $
//
//(c) Copyright 2005-2013 by Mentor Graphics Corp. All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
package com.mentor.nucleus.bp.ui.graphics.anchors;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.LocationRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OrthogonalConnectionAnchor;

import com.mentor.nucleus.bp.ui.graphics.parts.ConnectorEditPart;

public class WSAnchor extends AbstractConnectionAnchor implements
		IAdjustableReferencePointAnchor, OrthogonalConnectionAnchor {

	private PrecisionPoint currentPoint;
	public boolean isForRequest = false;

	public WSAnchor(IFigure figure) {
		super(figure);
	}

	Figure figure = new Figure() {

		private Rectangle figureBounds = new Rectangle(0, 0, 16, 16);

		@Override
		public Rectangle getBounds() {
			// create a rectangle the size of the reference point
			figureBounds.setLocation(getRawReferencePoint().x - 8, getRawReferencePoint().y - 8);
			return figureBounds;
		}

		@Override
		public void paint(Graphics graphics) {
			// do not paint
		}
		
	};
	
	@Override
	public IFigure getOwner() {
		if(figure.getParent() == null) {
			figure.setParent(super.getOwner());
		}
		// we need to use an invisible figure, that has the
		// set point on the edge
		return figure;
	}

	public void setLocation(PrecisionPoint point) {
		currentPoint = point;
	}

	@Override
	public Point getLocation(Point reference) {
		return getAdjustedReferencePoint();
	}

	private Point getAdjustedReferencePoint() {
		PrecisionPoint referencePoint = (PrecisionPoint) currentPoint.getCopy();
		getOwner().translateToAbsolute(referencePoint);
		return referencePoint;
	}

	@Override
	public Point getReferencePoint() {
		return getAdjustedReferencePoint();
	}

	public static WSAnchor getWSAnchorFor(Request request, IFigure figure) {
		WSAnchor anchor = new WSAnchor(figure);
		if (request instanceof LocationRequest) {
			Point location = ((LocationRequest) request).getLocation()
					.getCopy();
			PrecisionPoint point = new PrecisionPoint(location);
			figure.translateToRelative(point);
			anchor.setLocation(point);
		} else if (request instanceof CreateRequest) {
			Point location = ((CreateRequest) request).getLocation().getCopy();
			PrecisionPoint point = new PrecisionPoint(location);
			figure.translateToRelative(point);
			anchor.setLocation(point);
		}
		anchor.isForRequest = true;
		return anchor;
	}

	public static WSAnchor getWSAnchorFor(ConnectionEditPart connection,
			IFigure figure, boolean source) {
		WSAnchor anchor = new WSAnchor(figure);
		Point point = ((ConnectorEditPart) connection).getStartPoint();
		if (!source) {
			point = ((ConnectorEditPart) connection).getEndPoint();
		}
		PrecisionPoint pPoint = new PrecisionPoint(point);
		anchor.setLocation(pPoint);
		return anchor;
	}

	@Override
	public PrecisionPoint getRawReferencePoint() {
		return currentPoint;
	}

	@Override
	public Point getOrthogonalLocation(Point orthoReference) {
		if (isForRequest) {
			// do not update if for a request
			//return getAdjustedReferencePoint();
		}
		// adjust the x or y depending on the direction of the
		// line
		PrecisionPoint preciseOrthoRef = new PrecisionPoint(orthoReference);
		getOwner().translateToRelative(preciseOrthoRef);
		PrecisionPoint copy = new PrecisionPoint(currentPoint.getCopy());
		PrecisionRectangle bounds = new PrecisionRectangle(FigureUtilities
				.getAnchorableFigureBounds(getOwner()));
		bounds.expand(0.000001, 0.000001);
		if (preciseOrthoRef.preciseX >= bounds.preciseX
				&& preciseOrthoRef.preciseX <= bounds.preciseX
						+ bounds.preciseWidth) {
			// vertical
			copy.preciseX = preciseOrthoRef.x;
			copy.updateInts();
		} else if (preciseOrthoRef.preciseY >= bounds.preciseY
				&& preciseOrthoRef.preciseY <= bounds.preciseY
						+ bounds.preciseHeight) {
			// horizontal
			copy.preciseY = preciseOrthoRef.y;
			copy.updateInts();
		}
		getOwner().translateToAbsolute(copy);
		return copy;
	}
}
