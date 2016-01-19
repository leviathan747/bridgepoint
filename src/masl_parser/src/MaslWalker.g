tree grammar MaslWalker;

options
{
  tokenVocab=MaslParser;
  ASTLabelType=CommonTree;
}

/*
scope NameScope
{
  NameLookup lookup;
}

scope WhereClauseScope
{
  ObjectDeclaration parentObject;
}
*/

@annotations
{
@SuppressWarnings("all")
}

@members
{
// external interface
private Population population = null;

// argument array to pass to interface
private String[] args = new String[8];

// set the population interface
public void setPopulation ( Population population ) {
    if ( population != null )
        this.population = population;
    else
        this.population = null;
}

// call to the interface with null checking
private void populate( String classname, String[] args ) {
    // check args and interface
    if ( classname == null || args == null ) {
        System.err.println( "Invalid arguments." );
        return;
    }
    if ( population == null ) {
        System.err.println( "No external interface set." );
        return;
    }

    // call the interface
    population.populate( classname, args );

    // null out the args
    for ( int i = 0; i < args.length; i++ ) args[i] = null;
}

}

target                        : definition+;

definition                    : projectDefinition
                              | domainDefinition
                              ;


//---------------------------------------------------------
// Project Definition
//---------------------------------------------------------

identifier
returns [String name]
                              : Identifier                {
                                                              $name = $Identifier.text;
                                                          }
                              ;


projectDefinition
//returns [Project project]

                              : ^( PROJECT
                                   projectName              {
                                                              args[0] = $projectName.name;
                                                              populate( "project", args );
                                                            }
                                   ( projectDomainDefinition 
                                   )*
                                   pragmaList)              
                              ;

projectDomainDefinition
//returns [ProjectDomain domain]
                              : ^( DOMAIN
                                   projectDomainReference   
                                   ( projectTerminatorDefinition    
                                   )*
                                   pragmaList               
                                 )                          
                              ;


projectName
returns [String name]
                              :^( PROJECT_NAME
                                   identifier               { $name = $identifier.name; }
                                )
                              ;


//---------------------------------------------------------
// Domain Definition
//---------------------------------------------------------

domainDefinition
//returns [Domain domain]
                                                                                             
                              : ^( DOMAIN
                                   domainName                    
                                   ( objectDeclaration           
                                   | domainServiceDeclaration    
                                   | domainTerminatorDefinition    
                                   | relationshipDefinition     
                                   | objectDefinition            
                                   | typeDeclaration             
                                   | typeForwardDeclaration             
                                   | exceptionDeclaration        
                                   )*
                                   pragmaList                    
                                 )                              
                              ;

domainName
returns [String name]
                              : ^( DOMAIN_NAME
                                   identifier               { $name = $identifier.name; }
                                 )
                              ;

domainReference
//returns [Domain.Reference ref]
                              : domainName                  
                              ;


projectDomainReference
//returns [Domain.Reference ref]
                              : domainName                  {
                                                                args[0] = $domainName.name;
                                                                populate( "domain", args );
                                                            }
                              ;



optionalDomainReference
//returns [Domain.Reference ref, boolean defaulted]
                              : domainReference             
                              | /* blank */                 
                              ;



//---------------------------------------------------------
// Exception Declaration
//---------------------------------------------------------
exceptionDeclaration
                              : ^( EXCEPTION
                                   exceptionName            
                                   exceptionVisibility      
                                   pragmaList               
                                 )                          
                              ;

exceptionName
returns [ String name ]
                              : ^( EXCEPTION_NAME
                                   identifier)              
                              ;

exceptionReference
//returns [ExceptionReference ref]
                              : optionalDomainReference
                                exceptionName               
                              ;
                                

exceptionVisibility
//returns [ Visibility visibility ]
                              : PRIVATE                     
                              | PUBLIC                      
                              ;

//---------------------------------------------------------
// Type Definition
//---------------------------------------------------------

typeForwardDeclaration

                              : ^( TYPE_DECLARATION
                                   typeName                 
                                   typeVisibility
                                   pragmaList				
                                 )                          
                              ;
                              

typeDeclaration

                              : ^( TYPE
                                   typeName                 
                                   typeVisibility
                                   pragmaList				
                                   typeDefinition			
                                 )                          
                              ;
                              

typeDefinition
//returns [TypeDefinition def]
                              : structureTypeDefinition     
                              | enumerationTypeDefinition   
                              | constrainedTypeDefinition   
                              | typeReference               
                              | unconstrainedArrayDefinition
                              ;

typeVisibility
//returns [Visibility visibility]
                              : PRIVATE                     
                              | PUBLIC                      
                              ;



// Constrained Type
constrainedTypeDefinition
//returns [ConstrainedType type]
                              : ^( CONSTRAINED_TYPE
                                   typeReference
                                   typeConstraint
                                 )                          
                              ;

typeConstraint
//returns [TypeConstraint constraint]
                              : rangeConstraint             
                              | deltaConstraint             
                              | digitsConstraint            
                              ;

rangeConstraint
//returns [RangeConstraint range]
                              : ^( RANGE
                                   expression
                                 )                          
                              ;

deltaConstraint
//returns [DeltaConstraint delta]
                              : ^( DELTA
                                   expression
                                   rangeConstraint
                                 )                          
                              ;

digitsConstraint
//returns [DigitsConstraint digits]
                              : ^( DIGITS
                                   expression
                                   rangeConstraint
                                 )                          
                              ;

// Structure Type
structureTypeDefinition
//returns [StructureType type]

                              : ^( STRUCTURE
                                   ( structureComponentDefinition 
                                                            
                                   )+
                                 )                          
                              ;


structureComponentDefinition
//returns [StructureElement element]
                              : ^( COMPONENT_DEFINITION
                                   componentName
                                   typeReference
                                   expression?
                                   pragmaList
                                 )                          
                              ;

componentName
returns [String name]
                              : ^( COMPONENT_NAME
                                   identifier
                                 )                          
                              ;


// Enumeration Type
enumerationTypeDefinition
//returns [EnumerateType type]

                              : ^( ENUM
                                   ( enumerator             
                                   )+
                                 )                          
                              ;

enumerator
//returns [EnumerateItem item]
                              : ^( ENUMERATOR
                                   enumeratorName
                                   expression?
                                 )                          
                              ;

enumeratorName
returns [String name]         : ^( ENUMERATOR_NAME
                                   identifier
                                 )                          
                              ;


// Unconstrained array
unconstrainedArrayDefinition
//returns [UnconstrainedArrayType type]
                              : ^( UNCONSTRAINED_ARRAY
                                   index=typeReference
                                   contained=typeReference
                                 )                          
                              ;

//---------------------------------------------------------
// Type Reference
//---------------------------------------------------------

typeReference
//returns [BasicType type]
                              : namedTypeRef                
                              | constrainedArrayTypeRef     
                              | instanceTypeRef             
                              | sequenceTypeRef             
                              | arrayTypeRef                
                              | setTypeRef                  
                              | bagTypeRef                  
                              | dictionaryTypeRef           
                              ;

instanceTypeRef
//returns [InstanceType type]
                              : ^( INSTANCE
                                   objectReference
                                   ANONYMOUS?
                                 )                          
                              ;

namedTypeRef
//returns [BasicType type]
                              : ^( NAMED_TYPE
                                   optionalDomainReference
                                   typeName
                                   ANONYMOUS?
                                 )                          
                              ;

userDefinedTypeRef
//returns [UserDefinedType type]
                              : ^( NAMED_TYPE
                                   optionalDomainReference
                                   typeName
                                 )                          
                              ;

constrainedArrayTypeRef
//returns [UnconstrainedArraySubtype type]
                              : ^( CONSTRAINED_ARRAY
                                   userDefinedTypeRef
                                   arrayBounds
                                 )                          
                              ;


sequenceTypeRef
//returns [SequenceType type]
                              : ^( SEQUENCE
                                   typeReference
                                   expression?
                                   ANONYMOUS?
                                 )                          
                              ;

arrayTypeRef
//returns [ArrayType type]
                              : ^( ARRAY
                                   typeReference
                                   arrayBounds
                                   ANONYMOUS?
                                 )                          
                              ;

setTypeRef
//returns [SetType type]
                              : ^( SET
                                   typeReference
                                   ANONYMOUS?
                                 )                          
                              ;

bagTypeRef
//returns [BagType type]
                              : ^( BAG
                                   typeReference
                                   ANONYMOUS?
                                 )                          
                              ;

dictionaryTypeRef
//returns [DictionaryType type]
                              : ^( DICTIONARY
                                   (^(KEY   key=typeReference))?
                                   (^(VALUE value=typeReference))?
                                   ANONYMOUS?
                                 )                          
                              ;
typeName
returns [String name]
                              : ^( TYPE_NAME
                                   identifier )             
                              ;

arrayBounds
//returns [Expression exp]
                              : ^( ARRAY_BOUNDS
                                   expression )             
                              ;

//---------------------------------------------------------
// Terminator Definition
//---------------------------------------------------------

terminatorName
returns [String name]
                              : ^( TERMINATOR_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;


domainTerminatorDefinition

                              : ^( TERMINATOR_DEFINITION
                                   terminatorName             
                                   pragmaList                 
                                   ( terminatorServiceDeclaration//[terminator] 
                                   )*
                                 )
                              ;

projectTerminatorDefinition
@init
{
    String terminatorName;
}

                              : ^( TERMINATOR_DEFINITION
                                   terminatorName             {
                                                                  terminatorName = $terminatorName.name;
                                                                  args[0] = $terminatorName.name;
                                                                  populate( "terminator", args );
                                                              }
                                   pragmaList                 
                                   ( projectTerminatorServiceDeclaration[terminatorName]//[terminator] 
                                   )*
                                 )
                              ;



terminatorServiceDeclaration//[DomainTerminator terminator]
                              : ^( TERMINATOR_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )
                                                            
                              ;

projectTerminatorServiceDeclaration[String terminatorName]//[ProjectTerminator terminator]
                              : ^( TERMINATOR_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName              
                                   parameterList
                                   (returnType)?
                                   pragmaList
                                 )
                                                            {
                                                                  args[0] = $serviceName.name;
                                                                  args[1] = terminatorName;
                                                                  if ( $returnType.type == null )
                                                                      args[2] = "service";      // default to service
                                                                  else
                                                                      args[2] = "function";      // default to service
                                                                  populate( "activity", args);
                                                            }
                                                            
                              ;


//---------------------------------------------------------
// Object Definition
//---------------------------------------------------------

objectName
returns [String name]
                              : ^( OBJECT_NAME
                                   identifier )             
                              ;


objectReference
//returns [ObjectNameExpression ref]
                              : optionalDomainReference
                                objectName                  
                              ;

fullObjectReference
//returns [ObjectNameExpression ref]
                              : domainReference
                                objectName                  
                              ;


optionalObjectReference
//returns [ObjectNameExpression ref]
                              : objectReference             
                              | /* blank */                 
                              ;
attributeName
returns [String name]
                              : ^( ATTRIBUTE_NAME
                                   identifier )             
                              ;

objectDeclaration
                              : ^( OBJECT_DECLARATION
                                   objectName 
                                   pragmaList
                                 )                          
                                 
                              ;


objectDefinition
                                                                                             
                              : ^( OBJECT_DEFINITION
                                   objectName               
                                   ( attributeDefinition      
                                   | identifierDefinition     
                                   | objectServiceDeclaration 
                                   | eventDefinition          
                                   | stateDeclaration         
                                   | transitionTable          
                                   )*
                                   pragmaList                 
                                 )
                              ;

attributeDefinition

                              : ^( ATTRIBUTE_DEFINITION
                                   attributeName            
                                   PREFERRED? UNIQUE?
                                   ( attReferential         
                                   )*
                                   typeReference
                                   expression?
                                   pragmaList
                                 )                          

                              ;

attReferential
//returns [ReferentialAttributeDefinition ref]
                              : ^( REFERENTIAL
                                   relationshipSpec//[new ObjectNameExpression(null,currentObject),false,false]
                                   attributeName
                                 )                          
                              ;


relationshipSpec//[Expression lhs, boolean allowToAssoc, boolean forceToAssoc]
//returns [RelationshipSpecification.Reference rel]
                              : ^( RELATIONSHIP_SPEC
                                   relationshipReference    
                                   ( objOrRole objectReference? )?
                                 ) 													
                              ;

objOrRole
returns [String name]
                              : identifier                  
                              ;


objectServiceDeclaration
                              : ^( OBJECT_SERVICE_DECLARATION
                                   serviceVisibility
                                   ( INSTANCE
                                     relationshipReference?)?
                                   serviceName
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )                          
                              ;


identifierDefinition

                              : ^( IDENTIFIER
                                   ( attributeName     
                                   )+
                                   pragmaList
                                 )                     
                              ;

eventDefinition
                              : ^( EVENT         
                                   eventName                
                                   eventType                
                                   parameterList
                                   pragmaList               
                                 )
                                                            
                              ;

eventName
returns [String name]
                              : ^( EVENT_NAME
                                   identifier )             
                              ;

eventType
//returns [EventType type]
                              : ASSIGNER                    
                              | CREATION                    
                              | NORMAL                      
                              ;

stateDeclaration
                              : ^( STATE
                                   stateName                
                                   stateType               
                                   parameterList
                                   pragmaList              
                                )                           
                              ;

stateName
returns [String name]
                              : ^( STATE_NAME
                                   identifier )             
                              ;

stateType
//returns [StateType type]
                              : ASSIGNER                    
                              | START                       
                              | CREATION                    
                              | TERMINAL                    
                              | NORMAL                      
                              ;


transitionTable

                              : ^( TRANSITION_TABLE
                                   transTableType
                                   ( transitionRow          
                                   )+
                                   pragmaList
                                 )                          
                              ;


transTableType
//returns [boolean isAssigner]
                              : ASSIGNER                    
                              | NORMAL                      
                              ;

transitionRow
//returns [TransitionRow row]

                              : ^( TRANSITION_ROW
                                   startState
                                   ( transitionOption       
                                   )+
                                   pragmaList
                                )                           
                              ;

transitionOption
//returns [TransitionOption option]
                              : ^( TRANSITION_OPTION
                                   incomingEvent
                                   endState
                                 )                          
                              ;

incomingEvent
//returns [EventExpression ref]
                              : ^( EVENT
                                   eventReference           
                                 )
                              ;

startState
returns [String name]
                              : NON_EXISTENT
                              | stateName                   
                              ;

endState
//returns [String name, TransitionType type]
                              : stateName                   
                              | IGNORE                      
                              | CANNOT_HAPPEN               
                              ;

eventReference
//returns [EventExpression ref]
                              : optionalObjectReference
                                eventName                   
                              ;


//---------------------------------------------------------
// Service Declaration
//---------------------------------------------------------

domainServiceDeclaration
                              : ^( DOMAIN_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )
                                                            
                              ;


parameterDefinition[String prevParamName]
returns [String name]
//returns [ParameterDefinition parameter]
                              : ^( PARAMETER_DEFINITION
                                   parameterName
                                   parameterMode
                                   parameterType)           {
                                                                  $name = $parameterName.name;
                                                                  args[0] = $parameterName.name;
                                                                  args[1] = $parameterType.type;
                                                                  args[2] = $parameterMode.mode;
                                                                  args[3] = prevParamName;
                                                                  populate( "parameter", args );
                                                            }
                              ;
                              
parameterList
@init
{
    String prevParamName = "";
}
//returns [List<ParameterDefinition> params]

                              : ( parameterDefinition[prevParamName]       { prevParamName = $parameterDefinition.name; }
                                )*
                              ;


serviceVisibility
returns [String visibility]
//returns [Visibility visibility]
                              : PRIVATE                     { $visibility = "private"; }
                              | PUBLIC                      { $visibility = "public"; }
                              ;

parameterMode
returns [String mode]
//returns [ParameterModeType mode]
                              : IN                          { $mode = "in"; }
                              | OUT                         { $mode = "out"; }
                              ;


serviceName
returns [String name]
                              : ^( SERVICE_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;

parameterName
returns [String name]
                              : ^( PARAMETER_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;

parameterType
returns [String type]
//returns [BasicType type]
                              : ^( PARAMETER_TYPE
                                   typeReference )           { $type = "LeviType"; } //TODO hardcoded type
                              ;

returnType
returns [String type]
//returns [BasicType type]
                              : ^( RETURN_TYPE
                                   typeReference )           { $type = "LeviType"; } //TODO hardcoded type
                              ;


//---------------------------------------------------------
// Relationship Definition
//---------------------------------------------------------


relationshipDefinition
                              : regularRelationshipDefinition
                              | assocRelationshipDefinition   
                              | subtypeRelationshipDefinition 
                              ;



regularRelationshipDefinition
                              : ^( REGULAR_RELATIONSHIP_DEFINITION
                                   relationshipName
                                   leftToRight=halfRelationshipDefinition
                                   rightToLeft=halfRelationshipDefinition
                                   pragmaList
                                 )                          
                              ;


assocRelationshipDefinition
                              : ^( ASSOCIATIVE_RELATIONSHIP_DEFINITION
                                   relationshipName
                                   leftToRight=halfRelationshipDefinition
                                   rightToLeft=halfRelationshipDefinition
                                   assocObj=objectReference
                                   pragmaList
                                 )                          

                              ;

halfRelationshipDefinition
//returns [HalfRelationship half]
                              : ^( HALF_RELATIONSHIP
                                   from=objectReference
                                   conditionality
                                   rolePhrase
                                   multiplicity
                                   to=objectReference
                                 )                          
                              ;


subtypeRelationshipDefinition
//returns [SubtypeRelationshipDeclaration relationship]

                              : ^( SUBTYPE_RELATIONSHIP_DEFINITION
                                   relationshipName
                                   supertype=objectReference
                                   (subtype=objectReference   
                                   )+
                                   pragmaList
                                 )                          

                              ;

rolePhrase
returns [String role]
                              : ^( ROLE_PHRASE
                                   identifier )             
                              ;

conditionality
//returns [boolean cond]
                              : UNCONDITIONALLY             
                              | CONDITIONALLY               
                              ;

multiplicity
//returns [MultiplicityType mult]
                              : ONE                         
                              | MANY                        
                              ;


relationshipName
returns [String name]
                              : ^( RELATIONSHIP_NAME
                                   RelationshipName  
                                 )                          
                              ;
                              

relationshipReference
//returns [RelationshipDeclaration.Reference ref]
                              : optionalDomainReference
                                relationshipName            
                              ;


//---------------------------------------------------------
// Pragma Definition
//---------------------------------------------------------


pragmaList
//returns [ PragmaList pragmas ]

                              : ( pragma                    
                                )*                          
                              ;

pragma
//returns [PragmaDefinition def]

                              : ^( PRAGMA
                                   pragmaName
                                   ( pragmaValue            
                                   )*
                                 )                          
                              ;

pragmaValue
returns [ String value ]
                              : identifier                  
                              | literalExpression           
                              ;

pragmaName
returns [ String name ]
                              : ^( PRAGMA_NAME
                                   identifier               
                                 )
                              ;

//---------------------------------------------------------
// Dynamic Behaviour
//---------------------------------------------------------



domainServiceDefinition//[DomainService service]
//scope NameScope;


                              : ^( DOMAIN_SERVICE_DEFINITION
                                   serviceVisibility
                                   domainReference
                                   serviceName
                                   parameterList
                                   returnType?
                                   codeBlock[false]
                                   pragmaList                  
                                 )                                                   
                                                            
                              ;


terminatorServiceDefinition//[DomainTerminatorService service]
//scope NameScope;


                              : ^( TERMINATOR_SERVICE_DEFINITION
                                   serviceVisibility
                                   domainReference
                                   terminatorName
                                   serviceName
                                   parameterList
                                   returnType?
                                   codeBlock[false]
                                   pragmaList                  
                                 )                                                   
                                                            
                              ;


projectTerminatorServiceDefinition//[ProjectTerminatorService service]
//scope NameScope;


                              : ^( TERMINATOR_SERVICE_DEFINITION
                                   serviceVisibility
                                   domainReference
                                   terminatorName
                                   serviceName
                                   parameterList
                                   returnType?
                                   codeBlock[false]
                                   pragmaList                  
                                 )                                                   
                                                            
                              ;



objectServiceDefinition//[ObjectService service]
//scope NameScope;


                              :^( OBJECT_SERVICE_DEFINITION
                                   serviceVisibility
                                   INSTANCE?
                                   fullObjectReference
                                   serviceName
                                   parameterList
                                   returnType?
                                   codeBlock[false]
                                   pragmaList                           
                                 )                          
                              ;


stateDefinition//[State stateDef]
//scope NameScope;


                              : ^( STATE_DEFINITION
                                   stateType
                                   fullObjectReference
                                   stateName
                                   parameterList
                                   codeBlock[false]
                                   pragmaList                
                                 )                          
                              ;



//---------------------------------------------------------
// Statements
//---------------------------------------------------------

statement
//returns [Statement st]
                              : ^( STATEMENT
                                   ( codeBlock[false]       
                                   | assignmentStatement    
                                   | streamStatement        
                                   | callStatement          
                                   | exitStatement          
                                   | returnStatement        
                                   | delayStatement         
                                   | raiseStatement         
                                   | deleteStatement        
                                   | eraseStatement         
                                   | linkStatement          
                                   | scheduleStatement      
                                   | cancelTimerStatement   
                                   | generateStatement      
                                   | ifStatement            
                                   | caseStatement          
                                   | forStatement           
                                   | whileStatement         
                                   |                        
                                   )
                                   pragmaList               
                                 )
                              ;

statementList
//returns [List<Statement> statements = new ArrayList<Statement>()]
                              : ^( STATEMENT_LIST
                                   ( statement                 
                                   )*
                                 )
                              ;


assignmentStatement
//returns [AssignmentStatement st]
                              : ^( ASSIGN
                                   lhs=expression rhs=expression
                                 )                          
                              ;

streamStatement
//returns [IOStreamStatement st]

                              : ^( STREAM_STATEMENT
                                   expression
                                   ( streamOperator         
                                   )+
                                 )                          
                              ;

streamOperator
//returns [IOStreamStatement.IOExpression op]

                              : ^( ( STREAM_IN              
                                   | STREAM_OUT             
                                   | STREAM_LINE_IN         
                                   | STREAM_LINE_OUT        
                                   ) expression
                                 )                          
                              ;

callStatement
//returns [Statement st]

                              : ^( CALL
                                   expression               
                                   ( argument               
                                   )*                       
                                 )                          

                              ;


exitStatement
//returns [ExitStatement st]
                              : ^( EXIT
                                   condition?
                                 )                          
                              ;

returnStatement
//returns [ReturnStatement st]
                              : ^( RETURN
                                   expression              
                                 )                          
                              ;

delayStatement
//returns [DelayStatement st]
                              : ^( DELAY
                                   expression
                                 )                         
                              ;

raiseStatement
//returns [RaiseStatement st]
                              : ^( RAISE
                                   exceptionReference
                                   expression?
                                 )                          
                              ;

deleteStatement
//returns [DeleteStatement st]
                              : ^( DELETE
                                   expression
                                 )                          
                              ;

eraseStatement
//returns [EraseStatement st]
                              : ^( ERASE
                                   expression
                                 )                          
                              ;

linkStatement
//returns [LinkUnlinkStatement st]
                              : ^( linkStatementType
                                   lhs=expression      
                                   relationshipSpec//[$lhs.exp,false,false]
                                   (rhs=expression
                                    assoc=expression? )?
                                 )                          
                              ;

linkStatementType
//returns [LinkUnlinkStatement.Type type, Position pos]
                              : LINK                        
                              | UNLINK                      
                              ;


cancelTimerStatement
//returns [CancelTimerStatement st]
                             : ^( CANCEL
                                  timerId=expression )    
                             ;
                              
scheduleStatement
//returns [ScheduleStatement st]
                              : ^( SCHEDULE
                                   timerId=expression
                                   generateStatement
                                   scheduleType
                                   time=expression
                                   period=expression?
                                 )                         
                              ;
scheduleType
//returns [boolean isAbsolute]
                              : AT											    
                              | DELAY									      
                              ;



generateStatement
//returns [GenerateStatement st]

                              : ^( GENERATE
                                   eventReference
                                   ( argument               
                                   )*                       
                                   expression? )            
                              ;

ifStatement
//returns [IfStatement st]

                              : ^( IF
                                   condition
                                   statementList            
                                   ( elsifBlock             
                                   )*              
                                   ( elseBlock              
                                   )?
                                 )                          
                              ;


elsifBlock
//returns [IfStatement.Branch branch]
                              : ^( ELSIF
                                   condition
                                   statementList )          
                              ;

elseBlock
//returns [IfStatement.Branch branch]
                              : ^( ELSE
                                   statementList )          
                              ;


whileStatement
//returns [WhileStatement st]
                              : ^( WHILE
                                   condition
                                   statementList )          
                              ;

condition
//returns [Expression exp]      
                              : ^( CONDITION
                                   expression )             
                              ;


caseStatement
//returns [CaseStatement st]      

                              :^( CASE
                                  expression
                                  ( caseAlternative         
                                  )*
                                  ( caseOthers              
                                  )?
                                )                           
                              ;

caseAlternative
//returns [CaseStatement.Alternative alt]

                              : ^( WHEN                     
                                   ( choice                 
                                   )+
                                   statementList )         
                              ;

choice
//returns [Expression exp]      
                              : ^( CHOICE
                                   expression)              
                              ;

caseOthers
//returns [CaseStatement.Alternative alt]
                              : ^( OTHERS
                                   statementList )          
                              ;

forStatement
//returns [ForStatement st]
//scope NameScope;
                              : ^( FOR
                                   loopVariableSpec         
                                   ^( STATEMENT_LIST 
                                      ( statement               
                                      )*
                                    ) 
                                 )
                              ;

loopVariableSpec
//returns [LoopSpec spec]
                              : ^( LOOP_VARIABLE
                                   identifier
                                   REVERSE?
                                   expression )             
                              ;



//---------------------------------------------------------
// Code Blocks
//---------------------------------------------------------

codeBlock[boolean topLevel]
//returns [ CodeBlock st ]
//scope NameScope;
                              :^( CODE_BLOCK                
                                  ( variableDeclaration     
                                  )*     
                                  ^(STATEMENT_LIST ( statement               
                                  )* )
                                  ( exceptionHandler        
                                  )*
                                  ( otherHandler            
                                  )?
                                )
                              ;



variableDeclaration
//returns [VariableDefinition var]
                              : ^( VARIABLE_DECLARATION
                                   variableName
                                   READONLY?
                                   typeReference
                                   expression?
                                   pragmaList )             
                              ;


exceptionHandler
//returns [ExceptionHandler handler]
                              : ^( EXCEPTION_HANDLER
                                   exceptionReference       
                                   ^(STATEMENT_LIST ( statement               
                                   )* )
                                 )
                              ;

otherHandler
//returns [ExceptionHandler handler]
                              : ^( OTHER_HANDLER            
                                   ^(STATEMENT_LIST ( statement              
                                   )* )
                                 )
                              ;

variableName
returns [String name]
                              : ^( VARIABLE_NAME
                                   identifier )             
                              ;

//---------------------------------------------------------
// Expression Definition
//---------------------------------------------------------


expression
//returns [Expression exp]
                              : binaryExpression            
                              | unaryExpression             
                              | rangeExpression             
                              | aggregateExpression         
                              | linkExpression              
                              | navigateExpression          
                              | correlateExpression         
                              | orderByExpression           
                              | createExpression            
                              | findExpression              
                              | dotExpression               
                              | terminatorServiceExpression 
                              | callExpression              
                              | sliceExpression             
                              | primeExpression             
                              | nameExpression              
                              | literalExpression           
                              ;

binaryExpression
//returns [BinaryExpression exp]
                              : ^( binaryOperator
                                   lhs=expression
                                   rhs=expression
                                 )                          
                              ;


binaryOperator
//returns [BinaryExpression.OperatorRef op]
                              : AND                                        
                              | CONCATENATE                 
                              | DISUNION                    
                              | DIVIDE                      
                              | EQUAL                       
                              | GT                          
                              | GTE                         
                              | INTERSECTION                
                              | LT                          
                              | LTE                         
                              | MINUS                       
                              | MOD                         
                              | NOT_EQUAL                   
                              | NOT_IN                      
                              | OR                          
                              | PLUS                        
                              | POWER                       
                              | REM                         
                              | TIMES                       
                              | UNION                       
                              | XOR                         
                              ;

unaryExpression
//returns [UnaryExpression exp]
                              :^( unaryOperator 
                                  expression
                                )                           
                              ;

unaryOperator
//returns [UnaryExpression.OperatorRef op]
                              : UNARY_PLUS                  
                              | UNARY_MINUS                 
                              | NOT                         
                              | ABS                         
                              ;


rangeExpression
//returns [MinMaxRange exp]
                              : ^( RANGE_DOTS
                                   from=expression
                                   to=expression
                                 )                          
                              ;




aggregateExpression
//returns [StructureAggregate exp]

                              : ^( AGGREGATE
                                   ( expression             
                                   )+ 
                                 )                          
                              ;


linkExpression
//returns [LinkUnlinkExpression exp]
                              : ^( linkExpressionType
                                   lhs=expression      
                                   relationshipSpec//[$lhs.exp,false,false]
                                   rhs=expression?
                                 )                          
                              ;
linkExpressionType
//returns [LinkUnlinkExpression.Type type, Position pos]
                              : LINK                        
                              | UNLINK                      
                              ;


navigateExpression
//returns [NavigationExpression exp]
//scope WhereClauseScope;
                              : ^( NAVIGATE
                                   expression
                                   relationshipSpec//[$expression.exp,true,false]
                                                            
                                   ( whereClause           
                                   )?
                                 )                          
                                                                                          
                              ;

correlateExpression
//returns [CorrelatedNavExpression exp]
                              : ^( CORRELATE
                                   lhs=expression
                                   rhs=expression
                                   relationshipSpec//[$lhs.exp,true,true]
                                 )                          
                              ;



orderByExpression
//returns [OrderingExpression exp]

                              : ^( ( ORDERED_BY             
                                   | REVERSE_ORDERED_BY     
                                   ) 
                                   expression               
                                   ( sortOrder              
                                   )* 
                                 )                          
                              ;

sortOrder
//returns [String component, boolean reverse]
                              : ^( SORT_ORDER_COMPONENT
                                   REVERSE?
                                   identifier               
                                 )
                              ;

createExpression
//returns [CreateExpression exp]

                              : ^( CREATE
                                   objectReference 
                                   ( createArgument//[$objectReference.ref]         
                                   )*
                                 )                          
                              ;

createArgument //[ObjectNameExpression object]
//returns [CreateExpression.CreateAggregateValue arg]
                              : ^( CREATE_ARGUMENT
                                   attributeName
                                   expression )              
                              | ^( CURRENT_STATE
                                   stateName )               
                              ;

findExpression
//returns [FindExpression exp]
//scope WhereClauseScope;
                              : ^( findType
                                   expression               
                                   whereClause
                                 )                          
                              ;

whereClause
//returns [Expression exp]
                              : ^( WHERE
                                   ( expression             
                                   )?
                                 )
                              ;

findType
//returns [ FindExpression.ImplType type, Position pos ]
                              : FIND                        
                              | FIND_ONE                    
                              | FIND_ONLY                   
                              ;


dotExpression
//returns [Expression exp]
                              : ^( DOT
                                   expression
                                   identifier
                                 )                          
                              ;

terminatorServiceExpression
//returns [Expression exp]
                              : ^( TERMINATOR_SCOPE
                                   expression
                                   identifier
                                 )                          
                              ;

callExpression
//returns [Expression exp]

                              : ^( CALL
                                   expression               
                                   ( argument               
                                   )*                       
                                 )                          

                              ;

nameExpression
//returns [Expression exp]      
                              : ^( NAME
                                   identifier
                                 )                                
                              | ^( NAME
                                   domainReference
                                   identifier
                                 )                          
                              | ^( FIND_ATTRIBUTE
                                   identifier )             
                              | compoundTypeName            
                              ;


compoundTypeName
//returns [BasicType type]  
                              : instanceTypeRef             
                              | sequenceTypeRef             
                              | arrayTypeRef                
                              | setTypeRef                  
                              | bagTypeRef                  
                              ;


argument
//returns [Expression arg]
                              : ^( ARGUMENT
                                   expression
                                 )                          
                              ;

sliceExpression
//returns [Expression exp]
                              : ^( SLICE
                                   prefix=expression
                                   slice=expression
                                 )                          
                              ;

primeExpression
//returns [Expression exp]

                              : ^( PRIME
	                                 expression
                                   identifier
                                   ( argument               
                                   )*                       
                                 )                          
                              ;

literalExpression
//returns [Expression exp]
                              : IntegerLiteral              
                              | RealLiteral                 
                              | CharacterLiteral            
                              | StringLiteral               
                              | TimestampLiteral            
                              | DurationLiteral             
                              | TRUE                        
                              | FALSE                       
                              | NULL                        
                              | FLUSH                       
                              | ENDL                        
                              | THIS                        
                              | CONSOLE                     
                              ; 
