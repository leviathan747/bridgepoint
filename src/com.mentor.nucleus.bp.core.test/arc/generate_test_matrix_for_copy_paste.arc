.//=======================================================================
.//
.// File:      $$RCSfile: generate_test_matrix_for_copy_paste.arc,v $$
.// Version:   $$Revision: 1.12 $$
.// Modified:  $$Date: 2013/01/10 22:49:22 $$
.//
.// (c) Copyright 2007-2013 by Mentor Graphics Corp.  All rights reserved.
.//
.//=======================================================================
.// This document contains information proprietary and confidential to
.// Mentor Graphics Corp., and is not for external distribution.
.//=======================================================================
.//
.// This archetype generates a test matrix for copy paste functionality
.//
.invoke full_env = GET_ENV_VAR( "GEN_FULL_TESTS" )
.assign gen_full = full_env.result
.if(gen_full == "")
  .print "Generating partial tests..."
.else
  .print "Generating full tests..."
.end if 
#===========================================================================
#
# Description:
# This test matrix is used to test copy and paste of model elements.
#
#
# WARNING:      Do not edit this generated file
# Generated by: ${info.arch_file_name}
# Version:      $$Revision: 1.12 $$
#
# Notice:
# (C) Copyright 2007-2013 Mentor Graphics Corporation
#     All rights reserved.
#===========================================================================
#
#
.function is_valid_parent
  .param Inst_Ref parent
  .param Inst_Ref child
    .assign attr_result = false
    .assign skip = false
    .if(parent.Key_Lett == "C_C")
      .if(child.Key_Lett == "O_OBJ")
        .// not a possible situation in the UI
        .assign skip = true
      .end if
    .end if
    .if(not skip)
      .select many parents related by child->T_TPS[R1001]->T_TNS[R1000]
      .for each possible_parent in parents
        .if(possible_parent == parent)
          .assign attr_result = true
          .break for
        .end if
      .end for
    .end if
.end function
.function generate_matrix_row
  .param String start
  .param String gen_full
  .param Inst_Ref row_parent
    .assign attr_matrix_row = start
    .assign is_valid = false
    .assign inner_count = 0
    .select many objs from instances of O_OBJ
    .assign attr_test_count = 0
    .assign attr_invalid_location_tests = 0
    .assign handled_invalid = false
    .for each obj in objs
      .select any node from instances of T_TNS where (selected.Key_Lett == obj.Key_Lett)
      .if(not_empty node)
        .invoke is_excluded = is_child_excluded(node.Key_Lett)
        .if(not is_excluded.result)
          .select many parent_nodes related by node->T_TPS[R1001]->T_TNS[R1000]
          .for each parent in parent_nodes
            .select any parent_obj from instances of O_OBJ where (selected.Key_Lett == parent.Key_Lett)
            .if(not_empty parent_obj)
              .select any operation related by parent_obj->O_TFR[R115] where (selected.Name == "paste$r{obj.Name}")
              .if(not_empty operation)
                .assign attr_test_count = attr_test_count + 1
                .invoke is_valid_parent = is_valid_parent(row_parent, node)
                .if(is_valid_parent.result)
                  .assign attr_matrix_row = attr_matrix_row + "R1"
                .else
                  .if((not handled_invalid) or (gen_full != ""))
                    .assign attr_invalid_location_tests = attr_invalid_location_tests + 1
                    .assign attr_matrix_row = attr_matrix_row + "R2"
                    .assign handled_invalid = true
                  .else
                    .assign attr_matrix_row = attr_matrix_row + "X "
                  .end if
                .end if
                .assign inner_count = inner_count + 1
                .if(inner_count < 10)
                  .assign attr_matrix_row = attr_matrix_row + "  "
                .elif(inner_count < 100)
                  .assign attr_matrix_row = attr_matrix_row + "   "
                .else
                  .assign attr_matrix_row = attr_matrix_row + "    "
                .end if
              .end if
            .end if
          .end for
        .end if
      .end if      
    .end for
.end function
.function gen_test_rows
  .param String gen_full
  .assign count = 0
  .assign test_count = 0
  .assign invalid_location_tests = 0
  .select many objs from instances of O_OBJ
  .for each obj in objs
    .select any node from instances of T_TNS where (selected.Key_Lett == obj.Key_Lett)
    .if(not_empty node)
      .select many child_nodes related by node->T_TPS[R1000]->T_TNS[R1001]
      .for each child in child_nodes
        .invoke is_excluded = is_child_excluded(child.Key_Lett)
        .if(not is_excluded.result)
          .select any child_obj from instances of O_OBJ where (selected.Key_Lett == child.Key_Lett)
          .if(not_empty child_obj)
            .select any operation related by obj->O_TFR[R115] where (selected.Name == "paste$r{child_obj.Name}")
            .if(not_empty operation)
              .select any parent_parent_non_package related by node->T_TPS[R1001]->T_TNS[R1000] where (selected.Key_Lett != "EP_PKG")
              .select any parent_parent_package related by node->T_TPS[R1001]->T_TNS[R1000] where (selected.Key_Lett == "EP_PKG")
              .select many parent_parents related by node->T_TPS[R1001]->T_TNS[R1000]
              .if(empty parent_parents)
                .assign count = count + 1
                .// repeat for each source degree of freedom
                .assign start_space = "   ";
                .if(count < 10)
                  .assign start_space = "    "
                .end if
      	        .invoke gmr = generate_matrix_row("B${count}${start_space}", gen_full, node)
      	        .assign test_count = test_count + gmr.test_count
      	        .assign invalid_location_tests = invalid_location_tests + gmr.invalid_location_tests
${gmr.matrix_row}
              .else
                .if(gen_full == "")
                  .select many parent_parents from instances of T_TNS where (selected.Key_Lett == "NONE")
                  .if(not_empty parent_parent_non_package)
                    .assign parent_parents = parent_parents | parent_parent_non_package
                  .end if
                  .if(not_empty parent_parent_package)
                    .assign parent_parents = parent_parents | parent_parent_package
                  .end if
                .end if
              .end if
              .for each parent_parent in parent_parents
                .invoke is_excluded = is_parent_excluded(obj.Key_Lett, parent_parent.Key_Lett)
                .if(not is_excluded.result)
                  .assign count = count + 1
                  .// repeat for each source degree of freedom
                  .assign start_space = "   ";
                  .if(count < 10)
                    .assign start_space = "    "
                  .end if
        	        .invoke gmr = generate_matrix_row("B${count}${start_space}", gen_full, node)
        	        .assign test_count = test_count + gmr.test_count
        	        .assign invalid_location_tests = invalid_location_tests + gmr.invalid_location_tests
${gmr.matrix_row}
                .end if
              .end for
              .break for
            .end if
          .end if
        .end if
      .end for
    .end if
  .end for
  .print "Number of tests created: ${test_count}"
  .print "Number of tests for invalid location: ${invalid_location_tests}"
.end function
.function is_child_excluded
  .param String key_lett
  .assign attr_result = false
  .if(((key_lett == "MSG_SM") or (key_lett == "MSG_R")) or (key_lett == "MSG_AM"))
    .assign attr_result = true
  .end if
.end function
.function is_parent_excluded
  .param String parent
  .param String parent_parent
   .assign attr_result = false
  .if(parent_parent == "EP_PKG")
    .if(parent == "UC_UCC")
      .assign attr_result = true
    .end if
    .if(parent == "CP_CP")
      .assign attr_result = true
    .end if
    .if(parent == "IP_IP")
      .assign attr_result = true
    .end if
    .if(parent == "SQ_S")
      .assign attr_result = true
    .end if   
    .if(parent == "COMM_COMM")
      .assign attr_result = true
    .end if
    .if(parent == "A_A")
      .assign attr_result = true
    .end if
    .if(parent == "S_DPK")
      .assign attr_result = true
    .end if
  .elif(parent_parent == "C_C")
    .if(parent == "O_OBJ")
      .assign attr_result = true
    .end if
  .end if
.end function
.function get_parent_child_header
  .param String gen_full
//========================================================================
//
// File: CPSDTParentChildResolver.java
//
// WARNING:      Do not edit this generated file
// Generated by: ${info.arch_file_name}
// Version:      $$Revision: 1.12 $$
//
// (c) Copyright 2007-2013 by Mentor Graphics Corp.  All rights reserved.
//
//========================================================================
//This document contains information proprietary and confidential to
//Mentor Graphics Corp., and is not for external distribution.
//======================================================================== 
//
.if(gen_full == "")
package com.mentor.nucleus.bp.core.test.cpts;
.else
package com.mentor.nucleus.bp.core.test.cpts_full;
.end if
import junit.framework.Assert;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.test.cpts.CPSDTElementResolver.ParentChildContainer;

public class CPSDTParentChildResolver {

	public static ParentChildContainer getParentChildContainer(String name) {
		Class parent_class = null;
		Class child_class = null;
		String parent_key_letters = "";
		String child_key_letters = "";
.end function
.function get_parent_child_footer
		if (parent_class != null && child_class != null) {
			return new ParentChildContainer(parent_class, child_class, parent_key_letters, child_key_letters);
		} else {
			// throw an assert error
			Assert.fail("Unable to find parent and child class for: " + name);
			return null;
		}
	}
}
.end function
.function get_parent_child_resolution
  .param Inst_ref child
  .param Inst_ref parent
  .param String name
  .param integer count
		if (name.equals("${name}${count}")) {
			parent_class = $r{parent.Name}_c.class;
			child_class = $r{child.Name}_c.class;
			parent_key_letters = "${parent.Key_Lett}";
			child_key_letters = "${child.Key_Lett}";
		}
.end function
.// start the contents of the parent child resolver
.invoke pch = get_parent_child_header(gen_full)
.assign parent_child_resolver = pch.body
Degrees of Freedom:
source(A)
.select many objs from instances of O_OBJ
.assign source_count = 0
.for each obj in objs
  .select any node from instances of T_TNS where (selected.Key_Lett == obj.Key_Lett)
  .if(not_empty node)
    .select many parent_nodes related by node->T_TPS[R1001]->T_TNS[R1000]
    .for each parent in parent_nodes
      .invoke is_excluded = is_child_excluded(node.Key_Lett)
      .if(not is_excluded.result)
        .select any parent_obj from instances of O_OBJ where (selected.Key_Lett == parent.Key_Lett)
        .if(not_empty parent_obj)
          .select any operation related by parent_obj->O_TFR[R115] where (selected.Name == "paste$r{obj.Name}")
          .if(not_empty operation)
            .assign source_count = source_count + 1
            .invoke pcr = get_parent_child_resolution(obj, parent_obj, "A", source_count)
            .assign parent_child_resolver = parent_child_resolver + pcr.body
${source_count}. $r{obj.Name} Parent: $r{parent_obj.Name}
          .end if
        .end if
      .end if
    .end for
  .end if
.end for

destination(B)
.assign count = 0
.for each obj in objs
  .select any node from instances of T_TNS where (selected.Key_Lett == obj.Key_Lett)
  .if(not_empty node)
    .select many child_nodes related by node->T_TPS[R1000]->T_TNS[R1001]
    .for each child in child_nodes
      .invoke is_excluded = is_child_excluded(child.Key_Lett)
      .if(not is_excluded.result)
        .select any child_obj from instances of O_OBJ where (selected.Key_Lett == child.Key_Lett)
        .if(not_empty child_obj)
          .select any operation related by obj->O_TFR[R115] where (selected.Name == "paste$r{child_obj.Name}")
          .if(not_empty operation)
            .select any parent_parent_non_package related by node->T_TPS[R1001]->T_TNS[R1000] where (selected.Key_Lett != "EP_PKG")
            .select any parent_parent_package related by node->T_TPS[R1001]->T_TNS[R1000] where (selected.Key_Lett == "EP_PKG")
            .select many parent_parents related by node->T_TPS[R1001]->T_TNS[R1000]
            .if(empty parent_parents)
              .assign count = count + 1
              .// we pass the child as the parent as there
              .// is no parent, the hand written code knows
              .// what to do with parentless children
              .invoke pcr = get_parent_child_resolution(obj, obj, "B", count)
              .assign parent_child_resolver = parent_child_resolver + pcr.body
${count}. $r{obj.Name} - Parent: None
            .else
              .if(gen_full == "")
                .select many parent_parents from instances of T_TNS where (selected.Key_Lett == "NONE")
                .if(not_empty parent_parent_non_package)
                  .assign parent_parents = parent_parents | parent_parent_non_package
                .end if
                .if(not_empty parent_parent_package)
                  .assign parent_parents = parent_parents | parent_parent_package
                .end if
              .end if
            .end if
            .for each parent_parent in parent_parents
              .invoke is_excluded = is_parent_excluded(obj.Key_Lett, parent_parent.Key_Lett)
              .if(not is_excluded.result)
                .select any parent_obj from instances of O_OBJ where (selected.Key_Lett == parent_parent.Key_Lett)
                .assign count = count + 1
                .invoke pcr = get_parent_child_resolution(obj, parent_obj, "B", count)
                .assign parent_child_resolver = parent_child_resolver + pcr.body
${count}. $r{obj.Name} - Parent: $r{parent_obj.Name}
              .end if
            .end for
            .break for
          .end if
        .end if
      .end if
    .end for
  .end if
.end for
.// finish the parent child resolver
.invoke pcf = get_parent_child_footer()
.assign parent_child_resolver = parent_child_resolver + pcf.body
Results:
1. pasteSuccessful          "Paste was allowed but was not successful"
2. pasteNotAllowed          "Paste menu item was available even though destination was invalid"

Matrix:
.assign matrix_row = "      "
.assign count = 0
.while(count < source_count)
  .assign count = count + 1
  .assign matrix_row = matrix_row + "A${count}"
  .assign matrix_row = matrix_row + "  "
.end while
${matrix_row}
.invoke gtr = gen_test_rows(gen_full)
${gtr.body}\
.if(gen_full == "")
  .emit to file "matrices/generated/CopyPasteSourceDestinationTestMatrix.txt"
.else
  .emit to file "matrices/generated/CopyPasteSourceDestinationTestMatrixFull.txt"
.end if
${parent_child_resolver}
.if(gen_full == "")
  .emit to file "src/com/mentor/nucleus/bp/core/test/cpts/CPSDTParentChildResolver.java"
.else
  .emit to file "src/com/mentor/nucleus/bp/core/test/cpts_full/CPSDTParentChildResolver.java"
.end if