---

This work is licensed under the Creative Commons CC0 License

---

# Enhance mechanism for selective core builds
### xtUML Project Implementation Note

1. Abstract
-----------
Issue #8906 [[2.2]](#2.2) introduced a mechanism for running MC-Java on a single
class in a single subsystem. This issue is raised to extend this mechanism to
allow a user to run MC-Java on one or more classes in one or more subsystems
without compiling all of ooaofooa.

2. Document References
----------------------
<a id="2.1"></a>2.1 [#8960 Enhance mechanism for selective core builds](https://support.onefact.net/issues/8960)  
<a id="2.2"></a>2.2 [#8906 Build improvements for 5.8](https://support.onefact.net/issues/8906)  
<a id="2.3"></a>2.3 [Ant-Contrib](http://ant-contrib.sourceforge.net/) A third party library for special Ant tasks  
<a id="2.4"></a>2.4 [ply](https://github.com/dabeaz/ply) Python based lex/yacc project  
<a id="2.5"></a>2.5 [#8442 Build BridgePoint with pyrsl](https://support.onefact.net/issues/8442)

3. Background
-------------

4. Requirements
---------------
4.1 Build one or more classes in one or more subsystems without compiling all of
the OOA of OOA.  

5. Work Required
----------------

5.1 Extended logic in `generate.xml` to determine if a subsystem is in section
1, 2, 3, or 4 of `ooaofooa.sql` from a comma separated list. Previously a simple
string "contains" was used, but is no longer sufficient for lists.

5.1.1 Added Ant-Contrib [[2.3]](#2.3) to BridgePoint to handle some of the
complicated tasks.

5.2 Extend `pyrsl` to be able to split and iterate over comma separated lists.

5.2.1 New string format routine (in `rsl/runtime.py`):
```
@string_formatter('tsplit')
def list_split(value):
    'Replace a comma separated string with a list of strings'
    return value.split(',')
```

5.3 Add `contains` function to MC-Java utils.

5.4 Use `contains` function in `java.arc` to determine whether to build a class
or subsystem.

6. Implementation Comments
--------------------------

6.1 For this work to be complete, Ant-Contrib [[2.3]](#2.3) must be included in
the distribution of BridgePoint

6.2 I was unable to build `gen_erate.pyz` in the modified state of `pyxtuml` and
`pyrsl`. There may be a compatibility problem with the `ply` project
[[2.4]](#2.4). Before this is promoted, BridgePoint must be able to use the
current version of `gen_erate.pyz`. The previous issue for this was #8442
[[2.5]](#2.5). In the `xtuml/pyrsl` and `xtuml/pyxtuml` repositories, there are
`8442_*` branches that represent where the custom build was made. There is also
a design note with the same issue number in `xtuml/bridgepoint`.

6.2.1 I got around this problem by unzipping the `gen_erate.pyz` in my
distribution, adding my modification, and re-zipping it up. Note that this means
my modification is not committed in a repository, so I have included it in
section 5.2.1.

7. Unit Test
------------

8. User Documentation
---------------------

9. Code Changes
---------------
Fork/Repository: leviathan747/bridgepoint
Branch: 8960_enhance_speed

<pre>

 src/MC-Java/arch_utils.inc         | 17 +++++++++
 src/MC-Java/java.arc               |  8 +++--
 src/org.xtuml.bp.core/generate.xml | 72 ++++++++++++++++++++++++++++++++++----
 3 files changed, 88 insertions(+), 9 deletions(-)

</pre>

End
---

