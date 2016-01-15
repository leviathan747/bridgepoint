---

This work is licensed under the Creative Commons CC0 License

---

# Building a MASL parser
### xtUML Project Analysis Note

1. Abstract
-----------
For MASL import/convert functionality, it is necessary to build a parser that has
the ability to read in MASL input files, and populate the model of the MASL syntax.

2. Document References
----------------------
<a id="2.1"></a>2.1 [Parent issue - Redmine issue 8073: Build MASL parser](https://support.onefact.net/redmine/issues/8073)  
<a id="2.2"></a>2.2 [Redmine issue 8056: Investigate Xtext for use with MASL](https://support.onefact.net/redmine/issues/8056)  
<a id="2.3"></a>2.3 [MASL editor analysis note]()  
<a id="2.4"></a>2.4 [Eclipse Modelling Framework (EMF)](https://eclipse.org/modeling/emf/)  
<a id="2.5"></a>2.5 [Xtext homepage](https://eclipse.org/Xtext/index.html)  
<a id="2.6"></a>2.6 [Redmine issue ####: Model the syntax of MASL]()  
<a id="2.7"></a>2.7 [ANTLR grammar of MASL](https://drive.google.com/open?id=0B834tggB4vylWmNVMXVsYjZ2blU)  

3. Background
-------------
In order to convert MASL models to xtUML, we will follow this flow:

MASL text --> **Parse MASL** --> **Populate model of MASL** --> Populate OOAofOOA from model of MASL

This analysis is concerned with the task of parsing MASL and using the resulting abstract syntax tree
to populate the model of MASL. An editor based on the same grammar will be analyzed in a separate issue
[[2.3]](#2.3).

In issue 8056 [[2.2]](#2.2), Xtext was evaluated for use with MASL to build the parser and the editor.
It was determined that Xtext provides the necessary capability to meet the requirements and is well
supported and documented.

4. Requirements
---------------

4.1 The parser shall run independent of the eclipse GUI in the command line  
4.2 The parser shall be derived from the ANTLR grammar of MASL provided by Tower [[2.7]](#2.7)  
4.2.1 A mechanism shall be defined that provides a clear and direct mapping from the Tower ANTLR grammar
4.2.2 The parser shall support all the artifacts of the original ANTLR grammar
to any derived artifacts  
4.3 The parser shall call into action bodies in the model of MASL  
4.4 The parser and the editor shall use one common grammar of MASL  
4.5 Xtext shall be evaluated as a parser solution  

5. Analysis
-----------

5.1 Xtext

Xtext is a good option for the MASL parser because it has all the functionality we need to parse
as well as built in functionality for the MASL editor. This will satisfy requirement 4.4 and save us
from maintaining two parallel grammars.  

5.1.1 Grammar

5.1.1.1 Xtext implements its own grammar specification language (aptly called xtext). It is possible to
port grammars in EBNF format to xtext with no semantic changes to the grammar. This can be done with
the MASL grammar to create an analogous MASL grammar in xtext.

5.1.1.2 ANTLR supports the ability to define the shape of the abstract syntax tree (AST) in their grammars.
This allows the author of the grammar to have full control of the shape of the language and its semantics.
xtext has similar capabilities, and it is possible to achieve the same AST in xtext. This can be done with
the MASL grammar to mimic the AST defined by Tower engineers.

5.1.1.3 A strong correlation shall be adopted between the ANTLR grammar provided by Tower and our derivative
xtext grammar. The ANTLR grammar has been tested by time and use and by preserving the structure of the grammar
and the AST, the xtext grammar will inherit stability from the original grammar. A mechanism that is defined
to provide the mapping between ANTLR and xtext will provide us with a means to test completion of the work and
to trace any problems back to the original implementation.

5.1.2 Population

5.1.2.1 Xtext relies on Eclipse Modelling Framework (EMF) [[2.4]](#2.4) to build the AST. Xtext populates the AST
with objects that are extensions of EMF objects (EObject, EAttribute, etc).

5.1.2.2 Xtext provides a generator that can get a reference to the root of the AST. It is possible to then
walk down the AST and invoke any arbitrary Java code along the way. This will be the basis of our populate
functionality. As the generator walks the AST, it will make Java function invocations to the appropriate
functions in the model of MASL.

5.1.3 Execution

Xtext projects can be configured to be executed as a Java application. It is possible to export the project
as a java executable .jar file and run it from the commandline.  

5.2 ANTLR

We could use the ANTLR grammar provided by Tower to parser MASL and populate the model of MASL,
however, this is not an optimal choice because it would require us to maintain a separate grammar
for the parser and the editor.  

6. Work Required
----------------

6.1 Port the MASL grammar from the ANTLR specification to xtext  
6.2 Write Java code to walk the AST and make proper calls to the appropriate action bodies in the model of MASL  
6.3 Export the Xtext project as a runnable .jar  

7. Acceptance Test
------------------

7.1 Run the parser with a sample MASL file and the model of MASL and verify that the model of MASL was
correctly populated  
7.2 Diff the ANTLR grammar provided by Tower with the xtext grammar and verify that only syntactic differences
have been made  

End
---

