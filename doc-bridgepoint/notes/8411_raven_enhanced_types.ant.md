---

This work is licensed under the Creative Commons CC0 License

---

# Type handling in Raven Enhanced
### xtUML Project Analysis Note

1. Abstract
-----------
This issue is raised to analyze the possible options for handling MASL types in
xtUML. MASL has a much more rich type system than xtUML. We must be able to
store and edit rich MASL types and type references in a convenient way.

2. Document References
----------------------
<a id="2.1"></a>2.1 [#8411 Type and Typeref](https://support.onefact.net/issues/8411) -- Parent issue.  
<a id="2.2"></a>2.2 [MASL Type Idiom](https://docs.google.com/document/d/1kw_8nkSnVK5BAyuoLSqf3VF52yNL--vgIJ0cDYZAL2k/edit#) -- User documentation for the current type editing idiom.  

3. Background
-------------

3.1 Type definitions

We are handling type definitions by storing them as MASL text in `Descrip`
fields, encased in XML tags:
```
<definition>structure
    group_name      : string;
    operation_names : sequence of string;
end structure</definition>
```
This approach is messy and overloads the `Descrip` field.

3.2 Type references

We are handling type references by creating a new type for each complex type
reference. Simple references such as "integer" or "string" can be assigned
simply using the type picker. For more complex references such as collection
types, a new type is created named as the type reference (e.g. "sequence of
integer"). This new type is linked to the typed element via the type picker.

3.3 Type derivation

The MASL to xtUML converter is handling type derivations by deriving each
user-defined type and complex type reference from MASLtype. MASL core types are
created in each package and derived from the appropriate xtUML core types.

3.4 Unique integer

Unique integer types are represented by the type "MASLunique" created by the
MASL to xtUML converter.

3.5 Type visibility

Packaging of types is how type visibility is captured in xtUML. There are three
packages in a project where types exist:

* MASL core types exist in the system level “types” package.  
* The “Shared” package directly under the domain package contains the “public”
  types. Complex type references also exist in this package.  
* The “types” package under the domain component contains the “private” types.  

Currently, all complex type references are "public"

3.6 Instance reference types

Instance reference types are handled as complex type references for MASL. A new
type "instance of <class_name>" is created and linked to the typed model
element.

4. Requirements
---------------

4.1 Round trip equality shall be maintained for converting and exporting MASL
models  
4.2 Type definition information shall be relocated from the `Descrip` field of
the type  
4.2.1 A new location for this data shall be analyzed  
4.2.2 Analysis will be done to decide if it is expedient to store MASL
structures and enumerations as xtUML instances or as MASL text  
4.3 TODO type reference requirement  
4.4 Type definitions and type references shall be properly derived from their
appropriate core types  
4.5 The user shall be able to mark class attributes "unique"  
4.5.1 "MASLunique" shall be removed  
4.6 Type visibility shall be consistent  
4.6.1  Private type references shall be contained in the "types" package under the
component
4.6.2  Public type references shall be contained in the "Shared" package within
the domain package  
4.7 MASL instance reference types shall be stored properly as instance reference
types in xtUML  
4.8 The solution shall be designed to enable type checking in xtUML  

5. Analysis
-----------

5.1 Type definitions

Type definitions are currently stored in the `Descrip` fields as text. There are
five types of MASL type definitions:  
* Enumerations
* Structures
* Constrained type
* Named type reference (including bounded arrays)
* Unconstrained array

Enumerations and structures could conceivably be stored as xtUML instances for
the same. Simple named type references can be parsed and stored as UDTs derived
from the named type.

Since a type reference could be used to define a type, the constrained type and
named type reference could be handled in the same fashion as other type
references (creating a UDT with the type information stored in the name).
Unconstrained array types could be handled this way as well.

The downside to storing type definitions this way is that it would be impossible
to validate constraint information. For example:
```
type Dozen is Egg (12);
```
Could be represented as three UDTs, `Egg` deriving from something else, `Egg
(12)` deriving from `Egg` and `Dozen` derived from `Egg (12)`. With this
derivation chain, BridgePoint could validate that nothing but `Egg` is assigned
to `Dozen`, however it would have no information to validate that indices remain
in the acceptable range, and it would not even have information to prevent a
user from assigning a single `Egg` to a `Dozen` type variable.

For validation to be possible, a more in depth model of type reference is
required. See section 5.2.

An alternative would be to add a string attribute to S_UDT to maintain a
"definition". This could be used to store complex MASL type definitions. It
could be parsed with the MASL editor and edited by the user as text. At export
time, it would simply be transfered to the `.mod` file. Without a type reference
model, this method also suffers inability to validate properly.

5.2 Type references

MASL collection type references cannot be stored in the current xtUML type
system. Currently we store type references as UDTs with all of the extra
information stored in the name of the type (e.g. "sequence of integer"). This
provides us with round trip correctness, however it does not allow BridgePoint
to validate the types and the user experience is poor.

TODO add description of recommended meta-model changes to support type ref. I am
not including it here yet, but it is a big change.

5.3 "Unique" attributes

Class attributes can be marked "unique" by adding a boolean attribute to O_ATTR
to toggle uniqueness. This option may be confusing to current OAL editors that
use the `unique_id` type. Further thought will be given to this problem.

5.4 Other

The rest of the requirements can be implemented without affecting the
meta-model.

6. Work Required
----------------

7. Acceptance Test
------------------

End
---

