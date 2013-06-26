.//====================================================================
.//
.// File:      $RCSfile: create_external_link_evaluator.arc,v $
.// Version:   $Revision: 1.13 $
.// Modified:  $Date: 2013/01/10 23:34:57 $
.//
.// (c) Copyright 2005-2013 by Mentor Graphics Corp.  All rights reserved.
.//
.//====================================================================
.invoke arc_env = GET_ENV_VAR( "PTC_MC_ARC_DIR" )
.assign mc_archetypes = arc_env.result
.if ( mc_archetypes == "" )
  .print "\nERROR: Environment variable PTC_MC_ARC_DIR not set."
  .exit 100
.end if
.invoke arc_env1 = GET_ENV_VAR( "IO_CORE_ARC_DIR" )
.assign io_core_archetypes = arc_env1.result
.if ( io_core_archetypes == "" )
  .print "\nERROR: Environment variable IO_CORE_ARC_DIR not set."
  .exit 100
.end if
.//
.include "${mc_archetypes}/arch_utils.inc"
.include "${io_core_archetypes}/generate_configurable_components.inc"
.//
.//====================================================================
.//
.function is_legacy_containment_assoc
  .param inst_ref rel   .// R_REL
  .assign attr_result = false
  .if ( rel.Numb == 1 )
    .assign attr_result = true
  .elif ( rel.Numb == 8 )
    .assign attr_result = true
  .elif ( rel.Numb == 14 )
    .assign attr_result = true
  .elif ( rel.Numb == 23 )
    .assign attr_result = true
  .end if
.end function
.//
.//====================================================================
.//
.assign class_name = "ExternalLinkEvaluator"
//========================================================================
//
// File: ${class_name}.java
//
// WARNING:      Do not edit this generated file
// Generated by: ${info.arch_file_name}
// Version:      $$Revision: 1.13 $$
//
// (c) Copyright 2005-2013 by Mentor Graphics Corp.  All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//

package com.mentor.nucleus.bp.io.mdl;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.ui.canvas.*;
import com.mentor.nucleus.bp.core.common.IPersistenceHierarchyMetaData;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.common.PersistableModelComponent;
import com.mentor.nucleus.bp.core.common.PersistenceManager;

.// exclude diagrams and repeated EOs
.select many eos from instances of EO
.assign non_graphics_eos = eos - eos
.for each eo in eos
    .invoke result =  firstOccurrence(eo)
    .assign is_first = result.firstOccurrence
    .select one table related by eo->EI[R3]->T[R4]
    .if (not_empty table)
        .if ((table.DomainName != "ooaofgraphics") AND (is_first == true))
            .assign non_graphics_eos = non_graphics_eos | eo
        .end if
    .end if
.end for

public class ${class_name} {

	static IPersistenceHierarchyMetaData metaData = PersistenceManager.getHierarchyMetaData();
	static public Map evaluators = new Hashtable();
	static {
.for each eo in non_graphics_eos
    .invoke eo_class_name = get_class_name(eo)
		evaluators.put(${eo_class_name.body}.class, new ${eo_class_name.body}Evaluator());
.end for
	}
	
	public static HashMap<String, List<NonRootModelElement>> getAssociationMapOfExternalRGOs(
			NonRootModelElement element) {
        IPersistenceHierarchyMetaData metaData = PersistenceManager.getHierarchyMetaData();
        if (element != null) {
            IMEExternalLinkEvaluator evaluator = (IMEExternalLinkEvaluator) evaluators.get(element.getClass());
            if (evaluator != null) {
                return evaluator.getAssociationMapOfExternalRGOs(element);
            }
        }
        return new HashMap<String, List<NonRootModelElement>>();
	}
	
    public static List findExternalRGOs(
            NonRootModelElement modelElement, boolean loadComponent, boolean rgoToComponent, boolean checkSameComponent) {
            List externalLinks = new Vector(){
                public boolean add(Object element){
                    if(!contains(element)){
                        return super.add(element);
                    }
                    return false;
                }
            };
            gatherRGOsExternalTo(modelElement, externalLinks, loadComponent, rgoToComponent, checkSameComponent);
            return externalLinks;
    }
    
    private static void gatherRGOsExternalTo(NonRootModelElement modelElement, List rgos, boolean loadComponent, boolean rgoToComponent, boolean checkSameComponent){
        IPersistenceHierarchyMetaData metaData = PersistenceManager.getHierarchyMetaData();
        if (modelElement != null) {
            IMEExternalLinkEvaluator evaluator = (IMEExternalLinkEvaluator) evaluators.get(modelElement.getClass());
            if (evaluator != null) {
                evaluator.findExternalRGOs(modelElement, rgos, loadComponent, checkSameComponent);
            }
        }
        if(rgoToComponent){
        List children = metaData.getChildren(modelElement, loadComponent);
        for (Iterator iterator = children.iterator(); iterator.hasNext();) {
            NonRootModelElement child = (NonRootModelElement) iterator.next();
            gatherRGOsExternalTo(child, rgos, loadComponent,rgoToComponent, checkSameComponent);
        }
       }
    }
	public static boolean hasExternalRGO(NonRootModelElement modelElement, boolean loadComponent){
		if (modelElement != null) {
			IMEExternalLinkEvaluator evaluator = (IMEExternalLinkEvaluator) evaluators
					..get(modelElement.getClass());
			if (evaluator != null) {
				return evaluator.hasExternalRGO(modelElement, loadComponent);
			}
		}
		return false;
	}
	private final static boolean isComponentSame(
		NonRootModelElement modelElement,
		NonRootModelElement other) { 
		return (PersistenceManager.getComponent(modelElement) == PersistenceManager.getComponent(other));
	}
	
	interface IMEExternalLinkEvaluator {
		public void findExternalRGOs(NonRootModelElement modelElement, List externalMEs, boolean loadComponent, boolean checkSameComponent);
		public boolean hasExternalRGO(NonRootModelElement modelElement, boolean loadComponent);
		public HashMap<String, List<NonRootModelElement>> getAssociationMapOfExternalRGOs(NonRootModelElement element);
	}

.for each eo in non_graphics_eos
    .assign root_eo = eo
    .if (eo.componentRoot != true)
        .invoke result = get_parent_component_of_eo (eo)
        .assign root_eo = result.parent_component_of_eo
    .end if
    
    .invoke result = children_of_component(root_eo)
    .assign component_elements = result.children_list
    .invoke eo_class_name = get_class_name(eo)
    
    .print "generating class {${eo_class_name.body}Evaluator} with parent {${root_eo.Name}}"
    
	static class ${eo_class_name.body}Evaluator implements IMEExternalLinkEvaluator{
		public HashMap<String, List<NonRootModelElement>> getAssociationMapOfExternalRGOs(NonRootModelElement element) {
			HashMap<String, List<NonRootModelElement>> map = new HashMap<String, List<NonRootModelElement>>();
			NonRootModelElement[] externalMEs = new NonRootModelElement[0];
    .assign rgoCntr = 0;
    .select any model_class from instances of O_OBJ where (selected.Name == eo.Name)
    .select many rto_set related by model_class->R_OIR[R201]->R_RTO[R203]
    .for each rto in rto_set
        .select one relation related by rto->R_OIR[R203]->R_REL[R201]
          .select many rgo_set related by relation->R_OIR[R201]->R_RGO[R203]
          .for each rgo in rgo_set
              .select one related_class related by rgo->R_OIR[R203]->O_OBJ[R201]
              .invoke result = is_member_of_component(related_class, component_elements)
              .assign member_of_same_component = result.is_member
              .assign card = -1
              .assign relation_type = "other"
              .assign phrase = ""
              .select any form related by rgo->R_FORM[R205]
              .if(not_empty form)
                  .assign card = form.Mult
                  .invoke result = is_reflexive(relation)
                  .if (result.result)
                    .assign phrase = "$cr{form.Txt_phrs}"
                  .end if
                  .assign relation_type = "formalizer"
              .else
	              .select any assr related by rgo->R_ASSR[R205]
	              .if(not_empty assr)
	                .assign card = 1
	                .assign relation_type = "class_as_link"
	              .else
		            .select any sub related by rgo->R_SUB[R205]
		            .if(not_empty sub)
		                .assign card = 0
		                .assign relation_type = "class_as_subtype"
		            .end if
                  .end if
              .end if
              .invoke related_class_name = get_class_name(related_class)
              .if (card == 0)
                .invoke nav = get_nav_func_name(related_class, relation, "one")
                .assign varName = "inst$Cr{related_class.Name}${rgoCntr}"
            ${related_class_name.body} ${varName} = ${related_class_name.body}.${nav.body}$cr{phrase}((${eo_class_name.body})element, true);
                .assign condition = "${varName} != null"
            if(${condition}){
            	List<NonRootModelElement> R${relation.Numb}List = new ArrayList<NonRootModelElement>();
            	R${relation.Numb}List.add(${varName});
                map.put("R${relation.Numb}", R${relation.Numb}List);
            }
                .assign rgoCntr = rgoCntr + 1
              .else
                .invoke nav = get_nav_func_name(related_class, relation, "many")
            List<NonRootModelElement> R${relation.Numb}List = new ArrayList<NonRootModelElement>();
            externalMEs = ${related_class_name.body}.${nav.body}${phrase}((${eo_class_name.body})element, true);
            for(int i=0; i<externalMEs.length; i++){
                R${relation.Numb}List.add(externalMEs[i]);
            }
            map.put("R${relation.Numb}", R${relation.Numb}List);
              .end if
          .end for
    .end for
    		return map;
		}
		public void findExternalRGOs(NonRootModelElement modelElement, List externalMEList, boolean loadComponent, boolean checkSameComponent){
    NonRootModelElement[] externalMEs;

    .assign rgoCntr = 0;
    .select any model_class from instances of O_OBJ where (selected.Name == eo.Name)
    .select many rto_set related by model_class->R_OIR[R201]->R_RTO[R203]
    .for each rto in rto_set
        .select one relation related by rto->R_OIR[R203]->R_REL[R201]

          .select many rgo_set related by relation->R_OIR[R201]->R_RGO[R203]
          .for each rgo in rgo_set
              .select one related_class related by rgo->R_OIR[R203]->O_OBJ[R201]
              .invoke result = is_member_of_component(related_class, component_elements)
              .assign member_of_same_component = result.is_member
              .assign card = -1
              .assign relation_type = "other"
              .assign phrase = ""
              .select any form related by rgo->R_FORM[R205]
              .if(not_empty form)
                  .assign card = form.Mult
                  .invoke result = is_reflexive(relation)
                  .if (result.result)
                    .assign phrase = "$cr{form.Txt_phrs}"
                  .end if
                  .assign relation_type = "formalizer"
              .else
	              .select any assr related by rgo->R_ASSR[R205]
	              .if(not_empty assr)
	                .assign card = 1
	                .assign relation_type = "class_as_link"
	              .else
		            .select any sub related by rgo->R_SUB[R205]
		            .if(not_empty sub)
		                .assign card = 0
		                .assign relation_type = "class_as_subtype"
		            .end if
                  .end if
              .end if
              .invoke related_class_name = get_class_name(related_class)
              .if (card == 0)
                .invoke nav = get_nav_func_name(related_class, relation, "one")
                .assign varName = "inst$Cr{related_class.Name}${rgoCntr}"
            ${related_class_name.body} ${varName} = ${related_class_name.body}.${nav.body}$cr{phrase}((${eo_class_name.body})modelElement, loadComponent);
                .assign condition = "${varName} != null"
              .if(member_of_same_component)
                .assign condition = "${condition} && (!checkSameComponent || !isComponentSame(modelElement, ${varName}))"
              .end if
            if(${condition}){
                externalMEList.add(${varName});
            }
                .assign rgoCntr = rgoCntr + 1
              .else
                .invoke nav = get_nav_func_name(related_class, relation, "many")
            externalMEs = ${related_class_name.body}.${nav.body}${phrase}((${eo_class_name.body})modelElement, loadComponent);
            for(int i=0; i<externalMEs.length; i++){
                  .if(member_of_same_component)
                if(!checkSameComponent || !isComponentSame(modelElement, externalMEs[i])){
                  .end if
                externalMEList.add(externalMEs[i]);
                  .if(member_of_same_component)
                }
                  .end if
            }
              .end if
          .end for
    .end for
    .//
    .select many relations related by model_class->R_OIR[R201]->R_REL[R201]
    .for each relation in relations
            // ${model_class.Name} ->R${relation.Numb}
        .select many related_classes related by relation->R_OIR[R201]->O_OBJ[R201] where (selected.Obj_ID != model_class.Obj_ID)
        .for each related_class in related_classes
          .invoke ilc = is_legacy_containment_assoc(relation)
          .if (ilc.result)
           //                      ->R${relation.Numb} -- ${related_class.Name} <<Legacy Containment>>
          .else
            .invoke result = is_member_of_component(related_class, component_elements)
            .if (not result.is_member)
           //                      ->R${relation.Numb} -- ${related_class.Name} <<DEFINITE EXTERNAL LINK>>
            .else
           //                      ->R${relation.Numb} -- ${related_class.Name}  
            .end if
          .end if
        .end for
    .end for
		}
		public boolean hasExternalRGO(NonRootModelElement modelElement, boolean loadComponent){
			NonRootModelElement  inst=null;
    .for each rto in rto_set
        .select one relation related by rto->R_OIR[R203]->R_REL[R201]
          .select many rgo_set related by relation->R_OIR[R201]->R_RGO[R203]
          .for each rgo in rgo_set
              .select one related_class related by rgo->R_OIR[R203]->O_OBJ[R201]
              .invoke result = is_member_of_component(related_class, component_elements)
              .assign member_of_same_component = result.is_member
              .assign phrase = ""
              .select any form related by rgo->R_FORM[R205]
              .invoke result = is_reflexive(relation)
              .if (result.result)
                    .assign phrase = "$cr{form.Txt_phrs}"
              .end if
              .invoke related_class_name = get_class_name(related_class)
              .invoke nav = get_nav_func_name(related_class, relation, "one")
				inst = ${related_class_name.body}.${nav.body}$cr{phrase}((${eo_class_name.body})modelElement, loadComponent);
              .assign condition = "inst != null"
              .if(member_of_same_component)
              .assign condition = "${condition} && !isComponentSame(modelElement, inst)"
              .end if
            if(${condition}){
                return true;
            }
          .end for
    .end for
	    return false;
	}
 }
.end for
}
.//
.emit to file "src/com/mentor/nucleus/bp/io/mdl/${class_name}.java"