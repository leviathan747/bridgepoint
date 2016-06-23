//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
//
package org.xtuml.bp.core.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 *
 */
public abstract class CutCopyPasteAction extends Action {
	protected int COPY_TYPE = 0;

	protected int CUT_TYPE = 1;

	protected int PASTE_TYPE = 2;
	
	protected String transactioName;
	
	protected static boolean MOVE_IS_IN_PROGRESS = false;
	
	protected static IStructuredSelection ELEMENT_MOVE_SOURCE_SELECTION = null;

	public CutCopyPasteAction() {
		if (getActionType() == CUT_TYPE) {
			setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
			setText("Cut");
			setToolTipText("Cut the selected model elements.");
			transactioName = "Cut";
		} else if (getActionType() == COPY_TYPE) {
			setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
			setText("Copy");
			setToolTipText("Copy the selected model elements.");
			transactioName = "Copy";
		} else if (getActionType() == PASTE_TYPE) {
			setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
			setText("Paste");
			setToolTipText("Paste elements from the clipboard");
		}
	
	}
	
	protected abstract void postRun();
	
	protected abstract int getActionType();
	
}
