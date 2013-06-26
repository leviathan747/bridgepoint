.//=====================================================================
.//
.// File:      $RCSfile: create_metadata_elements_sorters.arc,v $
.// Version:   $Revision: 1.12 $
.// Modified:  $Date: 2013/01/10 22:54:06 $
.//
.// (c) Copyright 2003-2013 Mentor Graphics Corporation All rights reserved.
.//
.//=====================================================================
.// This document contains information proprietary and confidential to
.// Project Technology, Inc. and is not for external distribution.
.//=====================================================================
.//
.// The function declared below is responsible for creating the core.ui
.// action for rename. It is declared here because multiple plugins use
.// the same actions to carry out this task on the metamodel. Takes a
.// path parameter so that the comment correctly displays the generated
.// files location.
.//
./////////////////////////////////////////////////////////////////////////////
.invoke arc_env = GET_ENV_VAR( "PTC_MC_ARC_DIR" )
.assign mc_archetypes = arc_env.result
.if ( mc_archetypes == "" )
  .print "\nERROR: Environment variable PTC_MC_ARC_DIR not set."
  .exit 100
.end if
.//
.include "${mc_archetypes}/arch_utils.inc"
.//
.assign arc_dir = "arc"
.include "${arc_dir}/parse_chain.inc"
.//
.function create_type_sorter 
  .param inst_ref model_class        .//O_OBJ
  .param inst_ref sorting_relation  .//R_REL
  .param string sorting_phrase
  .param string sorter_dir
  .param string core_path
  .param string core_package_name
  .param string manager_name
.//
.invoke cn = get_class_name(model_class)
.assign class_name = cn.body
.assign attr_sorter_class_name = "${class_name}Sorter"
.assign sorter_var_name = "$lr{model_class.Name}"
.//
.//
.select any part_participant related by sorting_relation->R_SIMP[R206]->R_PART[R207]
.assign other_phrase = "${part_participant.Txt_Phrs}" 
.//
.if (other_phrase == sorting_phrase)
   .select any form_participant related by sorting_relation->R_SIMP[R206]->R_FORM[R208]
   .assign other_phrase = "${form_participant.Txt_Phrs}" 
.end if
.//
.invoke nfn_result = get_nav_func_name( model_class, sorting_relation, "one" )
.assign primary_participant_function_name = "${nfn_result.body}$cr{sorting_phrase}"
.assign other_participant_function_name = "${nfn_result.body}$cr{other_phrase}"
.//
.assign attr_config_statement = "sortingManager.setTypeSorter(${class_name}.class, ${manager_name}.createDefaultSorterFactory(""${core_package_name}.${sorter_dir}.${attr_sorter_class_name}"")); //$$NON-NLS-1$$"
.//
package ${core_package_name}.${sorter_dir};

//======================================================================
//
// File: ${core_path}/${sorter_dir}/${attr_sorter_class_name}.java
//
// WARNING:      Do not edit this generated file
// Generated by: ${info.arch_file_name}
// Version:      $$Revision: 1.12 $$
//
// (c) Copyright 2004-2013 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

import ${core_package_name}.${class_name};
import ${core_package_name}.CorePlugin;

public class ${attr_sorter_class_name} extends BaseTypeSpecificSorter {

	public ${attr_sorter_class_name}() {
		super(${class_name}.class);
	}

	public void sort(Object[] elements) {
		if (elements.length < 2) {
			return;
		}
		
		${class_name}[] ${sorter_var_name}s = (${class_name}[]) elements;
		int index = 0;
		${class_name} tail = null;

		// Search from the end as there are fair chances that array is already
		// sorted.
		for (index = ${sorter_var_name}s.length - 1; index >= 0; index--) {
			${class_name} ${sorter_var_name} = ${class_name}.${other_participant_function_name}(${sorter_var_name}s[index]);
			if (${sorter_var_name} == null) {
				tail = ${sorter_var_name}s[index];
				break;
			}
		}

		if ( tail == null )
		{
			CorePlugin.logError("${model_class.Name} ordering relationship R${sorting_relation.Numb} is corrupt", null);
			return;
		}

		for (index = ${sorter_var_name}s.length - 1; index >= 0; index--) {
			${sorter_var_name}s[index] = tail;
			tail = ${class_name}.${primary_participant_function_name}(tail);
		}
	}
}
.end function
./////////////////////////////////////////////////////////////////////////////
.function create_sortering_manager
  .param string sorter_config_statements
  .param string sorter_dir
  .param string core_path
  .param string core_package_name
  .param string manager_name
package ${core_package_name}.${sorter_dir};

//======================================================================
//
//File: ${core_path}/${sorter_dir}/${manager_name}.java
//
//WARNING:      Do not edit this generated file
//Generated by: ${info.arch_file_name}; create_sortering_manager
//Version:      $$Revision: 1.12 $$
//
//(c) Copyright 2004-2013 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import ${core_package_name}.*;

public class ${manager_name} {
	private Map sorterMap = new HashMap();
	private ISorterFactory defaultSorterFactory = null;

	public void setTypeSorter(Class type, ISorterFactory sorterFactory) {
		sorterMap.put(type, sorterFactory);
	}

	public void setDefaultTypeSorter(ISorterFactory sorterFactory) {
		defaultSorterFactory = sorterFactory;
	}

	public void sort(Object[] elements) {
		if (elements == null || elements.length <= 0) {
			return;
		}

		ISorterFactory sorterFactory = (ISorterFactory) sorterMap.get(elements[0].getClass());

		if (sorterFactory != null) {
			try {
				ISorter sorter = sorterFactory.createSorter(elements);
				sorter.sort(elements);
			} catch (SorterFactoryException e) {
				CorePlugin.logError("Could not create sorter", (Exception)e.getCause());  
			}
		} else if (defaultSorterFactory != null) {
			try {
				ISorter sorter = defaultSorterFactory.createSorter(elements);
				if(sorter.canSort(elements)){
					sorter.sort(elements);
				}
			} catch (SorterFactoryException e) {
				CorePlugin.logError("Could not create sorter", (Exception)e.getCause());	
			}
		}
	}
	
	public static ISorterFactory createDefaultSorterFactory(String className){
		return new DefaultSorterFactory(className);
	}
	
	public static ${manager_name} createDefault(){
		${manager_name} sortingManager = new ${manager_name}();
		${sorter_config_statements} 
		return sortingManager;
	}
	
	public static interface ISorter {
		boolean canSort(Object[] elements);
		void sort(Object[] elements);
	}

	public static interface ISorterFactory {
		ISorter createSorter(Object[] elements) throws SorterFactoryException;
	}
	
	public static class SorterFactoryException extends Exception{
		public SorterFactoryException(String message, Throwable rootCause){
			super(message, rootCause);
		}
	}

	static class DefaultSorterFactory implements ISorterFactory {
		Class sorterClass;
		List sorters = new Vector();

		DefaultSorterFactory(String className) {
			try {
				sorterClass = Class.forName(className);
				if(!ISorter.class.isAssignableFrom(sorterClass)){
					throw new IllegalArgumentException("Class not of type ${manager_name}.ISorter"); 
				}
			} catch (ClassNotFoundException e) {
				throw new IllegalArgumentException("Could not create sorter class: " + e.getMessage()); 
			}
		}
		 
		public ISorter createSorter(Object[] elements) throws SorterFactoryException{
			ISorter sorter = null;
			for (int i = 0; i < sorters.size(); i++) {
				sorter = (ISorter) sorters.get(i);
				if (sorter.canSort(elements)) {
					return sorter;
				}
			}

			try {
				sorter = (ISorter)sorterClass.newInstance();
				sorters.add(sorter);
				return sorter;
			} catch (InstantiationException e) {
				throw new SorterFactoryException("Could not create sorter", e);	
			} catch (IllegalAccessException e) {
				throw new SorterFactoryException("Could not create sorter", e);	
			}

		}
	}
}
.end function
.//
.//
.assign sorter_dir = "sorter"
.assign core_path = "src/com/mentor/nucleus/bp/core"
.assign core_package_name = "com.mentor.nucleus.bp.core"
.assign manager_name = "MetadataSortingManager"
.//
.assign sorter_config_statements = ""
.//
.select many tree_nodes from instances of T_TNS 
.for each node in tree_nodes
  .if(node.SortingRelationNumber >= 0)
    .select any model_class from instances of O_OBJ where (selected.Key_Lett == node.Key_Lett)
    .select any sorting_relation from instances of R_REL where (selected.Numb == node.SortingRelationNumber)
    .invoke result = create_type_sorter(model_class, sorting_relation, node.SortingRelationPhrase, sorter_dir, core_path, core_package_name, manager_name)
${result.body}
    .emit to file "${core_path}/${sorter_dir}/${result.sorter_class_name}.java"  
    .assign sorter_config_statements = "${sorter_config_statements}${result.config_statement}"
  .end if
.end for
.//
.invoke sm_result = create_sortering_manager(sorter_config_statements, sorter_dir, core_path, core_package_name, manager_name)
${sm_result.body}  
.emit to file "${core_path}/${sorter_dir}/${manager_name}.java"