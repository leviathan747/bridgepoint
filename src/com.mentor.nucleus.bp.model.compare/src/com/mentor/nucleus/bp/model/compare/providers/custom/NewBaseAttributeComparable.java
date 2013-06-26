package com.mentor.nucleus.bp.model.compare.providers.custom;
//=====================================================================
//
//File:      $RCSfile: NewBaseAttributeComparable.java,v $
//Version:   $Revision: 1.2 $
//Modified:  $Date: 2013/01/17 03:35:46 $
//
//(c) Copyright 2013 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp. and is not for external distribution.
//=====================================================================

import com.mentor.nucleus.bp.core.DerivedBaseAttribute_c;
import com.mentor.nucleus.bp.core.NewBaseAttribute_c;
import com.mentor.nucleus.bp.model.compare.providers.NonRootModelElementComparable;

public class NewBaseAttributeComparable extends NonRootModelElementComparable {

	public NewBaseAttributeComparable(NewBaseAttribute_c realElement) {
		super(realElement);
	}

	@Override
	public boolean treeItemEquals(Object other) {
		if (!super.treeItemEquals(other)) {
			// if the other element is a polymorphic event
			// return true if our state machine event supertypes
			// are equal
			if (other instanceof DerivedBaseAttributeComparable) {
				DerivedBaseAttributeComparable dbaComp = (DerivedBaseAttributeComparable) other;
				DerivedBaseAttribute_c dba = (DerivedBaseAttribute_c) dbaComp.getRealElement();
				NewBaseAttribute_c nba = (NewBaseAttribute_c) getRealElement();
				if(dba.getAttr_idCachedValue().equals(nba.getAttr_idCachedValue())) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	@Override
	public boolean treeItemNameMatches(Object other) {
		return true;
	}

	@Override
	public boolean treeItemTypeEquals(Object other) {
		return true;
	}

	@Override
	public boolean treeItemValueEquals(Object other) {
		if(treeItemEquals(other) && !(other instanceof NewBaseAttributeComparable)) {
			return false;
		}
		return true;
	}

	@Override
	public String getText() {
		return "New Base Attribute";
	}
}
