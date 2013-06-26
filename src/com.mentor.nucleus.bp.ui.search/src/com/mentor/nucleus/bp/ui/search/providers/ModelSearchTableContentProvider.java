package com.mentor.nucleus.bp.ui.search.providers;
//========================================================================
//
//File:      $RCSfile: ModelSearchTableContentProvider.java,v $
//Version:   $Revision: 1.5 $
//Modified:  $Date: 2013/01/10 23:13:53 $
//
//Copyright (c) 2005-2013 Mentor Graphics Corporation.  All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
import java.util.Arrays;
import java.util.Comparator;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.mentor.nucleus.bp.core.SearchResult_c;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.search.results.ModelSearchResult;
import com.mentor.nucleus.bp.ui.explorer.ModelLabelProvider;

public class ModelSearchTableContentProvider implements
		IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		final ModelLabelProvider provider = new ModelLabelProvider();
		if(inputElement instanceof ModelSearchResult) {
			SearchResult_c[] results = ((ModelSearchResult) inputElement).getSearchResults();
			Arrays.sort(results, new Comparator<Object>() {
				@Override
				public int compare(Object o1, Object o2) {
					if(o1 instanceof SearchResult_c && o2 instanceof SearchResult_c) {
						Object element1 = ModelSearchResult
								.getElementForResult((SearchResult_c) o1);
						Object element2 = ModelSearchResult
								.getElementForResult((SearchResult_c) o2);
						String element1Name = provider.getText(element1);
						if(element1Name.equals("")) {
							element1Name = ((NonRootModelElement) element1).getName();
						}
						String element2Name = provider.getText(element2);
						if(element2Name.equals("")) {
							element2Name = ((NonRootModelElement) element2).getName();
						}
						return element1Name.compareToIgnoreCase(element2Name);
					}
					return -1;
				}
			});
			provider.dispose();
			return results;
		}
		return new Object[0];
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		viewer.refresh();
	}

}
