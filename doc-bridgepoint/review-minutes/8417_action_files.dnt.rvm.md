---

This work is licensed under the Creative Commons CC0 License

---

# Review of 8417_action_files   
### xtUML Project Review Minutes

Reviewed: https://github.com/leviathan747/bridgepoint/blob/8417_oal_test/doc-bridgepoint/notes/8417_action_files/8417_action_files.dnt.md  
          742ff94 
Present:  Cort, Levi, Bob, Keith

<pre>

-- Num Type  Who  Section  Comment
-- 01  min   Bob  5.2       (reference the issue(s) described here and raise new issues as needed.
-- 02  min   Cort  6.2.2      First sentence: import -> load  
-- 03  min   Cort 6.2.2     When this is done, the single file import/export will no longer work. Call this out in this note.
                              
-- 04  min   Bob 6.2.2    Related to observation #3:
                          We need to analyze removal of single-file export/import removal to assure that it's removal will not have 
                          unintended fallout. Additionally, our file_io and steam_pei persistence mechanisms may be able to be 
                          merged at this when single file export/import is removed. Raise an issue to investigate this and 
                          reference it in this note.        
-- 05  min   Cort 6.2.2   Model compilers use the action_semantics, we must determine how to handle this in 
                          the down-steam model compilers. Raise an issue for this, and refernece it in this note.
-- 06  min   Keith 6.2.2  Raise a follow-on issue for removal of single-file export/import. Pehaps observations 3-5 can be 
                          child issues of this.
-- 07  min   Cort  6.2.2.1    Strike this paragraph and remove the requirement.  
                              We will tell people how to do the full load and persist in the release notes.
                              Add a task to the work required to update the release notes so this task is not dropped
-- 08  min   Cort  6.2.3      The questions was asked: What does it mean that action_semantics is annotated with IDs? 
              This is the relocatables. Add the reference to this work.
              -Where will we keep this if there is no action_semantics_internal?
              ---Levi thinks there is a way to create this data in memory. If so, there will be no need for action_semantics_internal
              
              Record this information in the note.

-- 09  min   Bob 6.3 Consider generating the getter/setters into only the NRMEs that have action semantics     

</pre>
   
No major observations, a re-review is not required.


End
---
