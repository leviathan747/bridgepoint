package com.mentor.nucleus.bp.ui.session;
//=====================================================================
//
// File:      $RCSfile$
// Version:   $Revision$
// Modified:  $Date$
//
//(c) Copyright 2006-2013 by Mentor Graphics Corp.  All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
// This class is responsible for providing the help ids for the
// SessionExplorerPlugin plugin.
//
import org.eclipse.ui.PlatformUI;

/**
 * Help context ids for the SessionExplorerView.
 * <p>
 * This interface contains constants only; it is not intended to be implemented
 * or extended.
 * </p>
 * 
 */
public interface ISessionExplorerHelpContextIds {
  public static final String PREFIX = "com.mentor.nucleus.bp.ui.session."; //$NON-NLS-1$

  // Actions
  public static final String FILTER_SELECTION_ACTION = PREFIX + "filter_selection_action_context"; //$NON-NLS-1$
  public static final String GOTO_RESOURCE_ACTION = PREFIX + "goto_resource_action_context"; //$NON-NLS-1$
  public static final String SessionExplorer_MOVE_ACTION = PREFIX + "SessionExplorer_move_action_context"; //$NON-NLS-1$
  public static final String SessionExplorer_RENAME_ACTION = PREFIX + "SessionExplorer_rename_action_context"; //$NON-NLS-1$
  public static final String SHOW_IN_EXPLORER_ACTION = PREFIX + "show_in_explorer_action_context"; //$NON-NLS-1$
  public static final String SORT_VIEW_ACTION = PREFIX + "sort_view_action_context"; //$NON-NLS-1$
  public static final String COPY_ACTION = PREFIX + "SessionExplorer_copy_action_context"; //$NON-NLS-1$
  public static final String PASTE_ACTION = PREFIX + "SessionExplorer_paste_action_context"; //$NON-NLS-1$
  public static final String COLLAPSE_ALL_ACTION = PREFIX + "collapse_all_action_context"; //$NON-NLS-1$

  // Dialogs
  public static final String GOTO_RESOURCE_DIALOG = PREFIX + "goto_resource_dialog_context"; //$NON-NLS-1$
  
  // Views
  public static final String SessionExplorerViewId = PREFIX + "SessionExplorerViewId"; //$NON-NLS-1$
}