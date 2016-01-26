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

@header
{
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}

@annotations
{
@SuppressWarnings("all")
}

@members
{
// external interface
private Population population = null;

// parent masl parser
private MaslImportParser masl_parser = null;

// argument array to pass to interface
private String[] args = new String[8];

// set the population interface
public void setPopulation ( Population population ) {
    if ( population != null )
        this.population = population;
    else
        this.population = null;

    // fill args initially with empty strings
    for ( int i = 0; i < args.length; i++ ) args[i] = "";
}

// set the parent masl parser
public void setMaslParser( MaslImportParser p ) {
    if ( p != null )
        this.masl_parser = p;
    else
        this.masl_parser = null;
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

    // fill args with empty strings
    for ( int i = 0; i < args.length; i++ ) args[i] = "";
}

// get the current file
private String getFile() {
    return masl_parser.getFile();
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
                                   projectName
                                                            {
                                                              args[0] = $projectName.name;
                                                              populate( "project", args );
                                                            }
                                   ( projectDomainDefinition 
                                   )*
                                   pragmaList)              
                                                            {
                                                              populate( "project", args );  // end project
                                                            }

                              ;

projectDomainDefinition
//returns [ProjectDomain domain]
                              : ^( DOMAIN
                                   projectDomainReference   
                                                            {
                                                                args[0] = $projectDomainReference.ref;
                                                                populate( "domain", args );
                                                            }
                                   ( projectTerminatorDefinition    
                                   )*
                                   pragmaList               
                                 )                          
                                                            {
                                                                populate( "domain", args ); // end domain
                                                            }
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
                                                            {
                                                                args[0] = $domainName.name;
                                                                populate( "domain", args );
                                                            }
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
                                                            {
                                                                populate( "domain", args );
                                                            }
                              ;

domainName
returns [String name]
                              : ^( DOMAIN_NAME
                                   identifier               { $name = $identifier.name; }
                                 )
                              ;

domainReference
returns [String ref]
//returns [Domain.Reference ref]
                              : domainName                  { $ref = $domainName.name; }
                              ;


projectDomainReference
returns [String ref]
//returns [Domain.Reference ref]
                              : domainName                  { $ref = $domainName.name; }
                              ;



optionalDomainReference
returns [String ref]
//returns [Domain.Reference ref, boolean defaulted]
                              : domainReference             { $ref = $domainReference.ref; }
                              | /* blank */                 { $ref = ""; }
                              ;



//---------------------------------------------------------
// Exception Declaration
//---------------------------------------------------------
exceptionDeclaration
                              : ^( EXCEPTION
                                   exceptionName            
                                   exceptionVisibility      
                                                              {
                                                                  args[0] = $exceptionName.name;
                                                                  args[1] = $exceptionVisibility.visibility;
                                                                  populate( "exception", args );
                                                              }
                                   pragmaList               
                                 )                          
                                                              {
                                                                  populate( "exception", args );    // end exception
                                                              }
                              ;

exceptionName
returns [ String name ]
                              : ^( EXCEPTION_NAME
                                   identifier)              { $name = $identifier.name; }
                              ;

exceptionReference
//returns [ExceptionReference ref]
                              : optionalDomainReference
                                exceptionName               
                              ;
                                

exceptionVisibility
returns [String visibility]
//returns [ Visibility visibility ]
                              : PRIVATE                     { $visibility = $PRIVATE.text; }
                              | PUBLIC                      { $visibility = $PUBLIC.text; }
                              ;

//---------------------------------------------------------
// Type Definition
//---------------------------------------------------------

typeForwardDeclaration

                              : ^( TYPE_DECLARATION
                                   typeName                 
                                   typeVisibility
                                                              {
                                                                  args[0] = $typeName.name;
                                                                  args[1] = $typeVisibility.visibility;
                                                                  populate( "type", args );
                                                              }
                                   pragmaList				
                                 )                          
                                                              {
                                                                  populate( "type", args ); // end type
                                                              }
                              ;
                              

typeDeclaration

                              : ^( TYPE
                                   typeName                 
                                   typeVisibility
                                                              {
                                                                  args[0] = $typeName.name;
                                                                  args[1] = $typeVisibility.visibility;
                                                                  populate( "type", args );
                                                              }
                                   pragmaList				
                                   typeDefinition			
                                 )                          
                                                              {
                                                                  populate( "type", args ); // end type
                                                              }
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
returns [String visibility]
//returns [Visibility visibility]
                              : PRIVATE                     { $visibility = $PRIVATE.text; }
                              | PUBLIC                      { $visibility = $PUBLIC.text; }
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
returns [String type]
//returns [BasicType type]
                              : namedTypeRef                { $type = $namedTypeRef.type; }
                              | constrainedArrayTypeRef     { $type = "levi"; }//$constrainedArrayTypeRef.type }
                              | instanceTypeRef             { $type = "levi"; }//$instanceTypeRef.type }
                              | sequenceTypeRef             { $type = "levi"; }//$sequenceTypeRef.type }
                              | arrayTypeRef                { $type = "levi"; }//$arrayTypeRef.type }
                              | setTypeRef                  { $type = "levi"; }//$setTypeRef.type }
                              | bagTypeRef                  { $type = "levi"; }//$bagTypeRef.type }
                              | dictionaryTypeRef           { $type = "levi"; }//$dictionaryTypeRef.type }
                              ;

instanceTypeRef
//returns [InstanceType type]
                              : ^( INSTANCE
                                   objectReference
                                   ANONYMOUS?
                                 )                          
                              ;

namedTypeRef
returns [String type]
//returns [BasicType type]
                              : ^( NAMED_TYPE
                                   optionalDomainReference
                                   typeName
                                   ANONYMOUS?
                                 )                          
                                                            { 
                                                                String t = "";
                                                                if ( $ANONYMOUS != null )
                                                                    t += ( $ANONYMOUS + " " );
                                                                if ( $optionalDomainReference.ref != "" )
                                                                    t += ( $optionalDomainReference.ref + "::" );
                                                                t += $typeName.name;
                                                                $type = t;
                                                            }
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
                                   identifier )             { $name = $identifier.name; }
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
                                                              {
                                                                  args[0] = $terminatorName.name;
                                                                  populate( "terminator", args );
                                                              }
                                   pragmaList                 
                                   ( terminatorServiceDeclaration//[terminator] 
                                   )*
                                 )
                                                              {
                                                                populate( "terminator", args );  // end terminator
                                                              }
                              ;

projectTerminatorDefinition

                              : ^( TERMINATOR_DEFINITION
                                   terminatorName
                                                              {
                                                                  args[0] = $terminatorName.name;
                                                                  populate( "terminator", args );
                                                              }
                                   pragmaList                 
                                   ( projectTerminatorServiceDeclaration//[terminator] 
                                   )*
                                 )
                                                              {
                                                                populate( "terminator", args );  // end terminator
                                                              }
                              ;



terminatorServiceDeclaration//[DomainTerminator terminator]
                              : ^( TERMINATOR_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $TERMINATOR_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )
                                                            {
                                                                  if ( $TERMINATOR_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;

projectTerminatorServiceDeclaration//[ProjectTerminator terminator]
                              : ^( TERMINATOR_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName              
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $TERMINATOR_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   (returnType)?
                                   pragmaList
                                 )
                                                            {
                                                                  if ( $TERMINATOR_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;


//---------------------------------------------------------
// Object Definition
//---------------------------------------------------------

objectName
returns [String name]
                              : ^( OBJECT_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;


objectReference
returns [String ref]
//returns [ObjectNameExpression ref]
                              : optionalDomainReference
                                objectName                  
                                                            { 
                                                                String r = "";
                                                                if ( $optionalDomainReference.ref != "" )
                                                                    r += ( $optionalDomainReference.ref + "::" );
                                                                r += $objectName.name;
                                                                $ref = r;
                                                            }
                              ;

fullObjectReference
//returns [ObjectNameExpression ref]
                              : domainReference
                                objectName                  
                              ;


optionalObjectReference
returns [String ref]
//returns [ObjectNameExpression ref]
                              : objectReference             { $ref = $objectReference.ref; }
                              | /* blank */                 { $ref = ""; }
                              ;
attributeName
returns [String name]
                              : ^( ATTRIBUTE_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;

objectDeclaration
                              : ^( OBJECT_DECLARATION
                                   objectName
                                                            {
                                                                args[0] = $objectName.name;
                                                                populate( "object", args );
                                                            }
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "object", args ); // end object
                                                            }
                                 
                              ;


objectDefinition
                                                                                             
                              : ^( OBJECT_DEFINITION
                                   objectName               
                                                            {
                                                                args[0] = $objectName.name;
                                                                populate( "object", args );
                                                            }
                                   ( attributeDefinition      
                                   | identifierDefinition     
                                   | objectServiceDeclaration 
                                   | eventDefinition          
                                   | stateDeclaration         
                                   | transitionTable          
                                   )*
                                   pragmaList                 
                                 )
                                                            {
                                                                populate( "object", args ); // end object
                                                            }
                              ;

attributeDefinition

                              : ^( ATTRIBUTE_DEFINITION
                                   attributeName            
                                   PREFERRED? UNIQUE?
                                                            {
                                                                args[0] = $attributeName.name;
                                                                if ( $PREFERRED != null )
                                                                    args[1] = "true";
                                                                else args[1] = "false";
                                                                if ( $UNIQUE != null )
                                                                    args[2] = "true";
                                                                else args[2] = "false";
                                                                if ( $ATTRIBUTE_DEFINITION != null )
                                                                    args[3] = $ATTRIBUTE_DEFINITION.text;
                                                                populate( "attribute", args );
                                                            }
                                   ( attReferential         
                                   )*
                                   typeReference
                                                            {
                                                                args[0] = $typeReference.type;
                                                                populate( "typeref", args );
                                                                populate( "typeref", args );  // end type
                                                            }
                                   expression?
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "attribute", args );  // end attribute
                                                            }

                              ;

attReferential
//returns [ReferentialAttributeDefinition ref]
                              : ^( REFERENTIAL
                                   relationshipSpec//[new ObjectNameExpression(null,currentObject),false,false]
                                   attributeName
                                 )                          
                                                            {
                                                                args[0] = $attributeName.name;
                                                                args[1] = $relationshipSpec.spec.get(0);
                                                                args[2] = $relationshipSpec.spec.get(1);
                                                                args[3] = $relationshipSpec.spec.get(2);
                                                                populate( "referential", args );
                                                                populate( "referential", args );    // end referential
                                                            }
                              ;


relationshipSpec//[Expression lhs, boolean allowToAssoc, boolean forceToAssoc]
returns [List<String> spec]
//returns [RelationshipSpecification.Reference rel]
@init
{
    ArrayList<String> s = new ArrayList<String>();
}
                              : ^( RELATIONSHIP_SPEC
                                   relationshipReference    
                                                            {
                                                                s.add( 0, $relationshipReference.ref );
                                                            }
                                   ( objOrRole
                                                            {
                                                                s.add( 1, $objOrRole.name );
                                                            }
                                   ( objectReference
                                                            {
                                                                s.add( 2, $objectReference.ref );
                                                            }
                                   )? 
                                   )?
                                 ) 													
                                                            {
                                                                $spec = s;
                                                            }
                              ;

objOrRole
returns [String name]
                              : identifier                  { $name = $identifier.name; }
                              ;


objectServiceDeclaration
                              : ^( OBJECT_SERVICE_DECLARATION
                                   serviceVisibility
                                   ( INSTANCE
                                     relationshipReference?)?
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $INSTANCE != null )
                                                                      args[2] = $INSTANCE.text;
                                                                  if ( $relationshipReference.ref != null )
                                                                      args[3] = $relationshipReference.ref;
                                                                  if ( $OBJECT_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )                          
                                                            {
                                                                  if ( $OBJECT_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                              ;


identifierDefinition

                              : ^( IDENTIFIER
                                                            {
                                                                args[0] = "this_is_an_identifier";  // TODO figure out what to do with this
                                                                populate( "identifier", args );
                                                            }
                                   ( attributeName          
                                                            {
                                                                args[0] = $attributeName.name;
                                                                populate( "attribute", args );
                                                                populate( "attribute", args );  // end attribute
                                                            }
                                   )+
                                   pragmaList
                                 )                     
                                                            {
                                                                populate( "identifier", args );  // end attribute
                                                            }
                              ;

eventDefinition
                              : ^( EVENT         
                                   eventName                
                                   eventType                
                                                            {
                                                                args[0] = $eventName.name;
                                                                args[1] = $eventType.type;
                                                                populate( "event", args );
                                                            }
                                   parameterList
                                   pragmaList               
                                 )
                                                            {
                                                                populate( "event", args );  // end event
                                                            }
                                                            
                              ;

eventName
returns [String name]
                              : ^( EVENT_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;

eventType
returns [String type]
//returns [EventType type]
                              : ASSIGNER                    { $type = $ASSIGNER.text; }
                              | CREATION                    { $type = $CREATION.text; }
                              | NORMAL                      { $type = "normal"; }
                              ;

stateDeclaration
                              : ^( STATE
                                   stateName                
                                   stateType               
                                                            {
                                                                args[0] = $stateName.name;
                                                                args[1] = $stateType.type;
                                                                populate( "state", args );
                                                            }
                                   parameterList
                                   pragmaList              
                                )                           
                                                            {
                                                                populate( "state", args );  // end state
                                                            }
                              ;

stateName
returns [String name]
                              : ^( STATE_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;

stateType
returns [String type]
//returns [StateType type]
                              : ASSIGNER                    { $type = $ASSIGNER.text; }
                              | START                       { $type = $START.text; }
                              | CREATION                    { $type = $CREATION.text; }
                              | TERMINAL                    { $type = $TERMINAL.text; }
                              | NORMAL                      { $type = "normal"; }
                              ;


transitionTable

                              : ^( TRANSITION_TABLE
                                   transTableType
                                                            {
                                                                args[0] = $transTableType.type;
                                                                populate( "statemachine", args );
                                                            }
                                   ( transitionRow          
                                   )+
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "statemachine", args );   // end statemachine
                                                            }
                              ;


transTableType
returns [String type]
//returns [boolean isAssigner]
                              : ASSIGNER                    { $type = $ASSIGNER.text; }
                              | NORMAL                      { $type = "normal"; }
                              ;

transitionRow
//returns [TransitionRow row]

                              : ^( TRANSITION_ROW
                                   startState
                                   ( transitionOption[$startState.name]
                                   )+
                                                            {
                                                                args[0] = $startState.name;
                                                                populate( "transitionrowpragmalist", args );
                                                            }
                                   pragmaList
                                                            {
                                                                populate( "transitionrowpragmalist", args );    // end transitionrowpragmalist
                                                            }
                                )                           
                              ;

transitionOption[String startState]
//returns [TransitionOption option]
                              : ^( TRANSITION_OPTION
                                   incomingEvent
                                   endState
                                 )                          
                                                            {
                                                                args[0] = startState;
                                                                args[1] = $incomingEvent.ref;
                                                                args[2] = $endState.name;
                                                                populate( "transition", args );
                                                                populate( "transition", args ); // end transition
                                                            }
                              ;

incomingEvent
returns [String ref]
//returns [EventExpression ref]
                              : ^( EVENT
                                   eventReference           { $ref = $eventReference.ref; }
                                 )
                              ;

startState
returns [String name]
                              : NON_EXISTENT                { $name = $NON_EXISTENT.text; }
                              | stateName                   { $name = $stateName.name; }
                              ;

endState
returns [String name]
//returns [String name, TransitionType type]
                              : stateName                   { $name = $stateName.name; }
                              | IGNORE                      { $name = $IGNORE.text; }
                              | CANNOT_HAPPEN               { $name = $CANNOT_HAPPEN.text; }
                              ;

eventReference
returns [String ref]
//returns [EventExpression ref]
                              : optionalObjectReference
                                eventName                   
                                                            { 
                                                                String r = "";
                                                                if ( $optionalObjectReference.ref != "" )
                                                                    r += ( $optionalObjectReference.ref + "::" );
                                                                r += $eventName.name;
                                                                $ref = r;
                                                            }
                              ;


//---------------------------------------------------------
// Service Declaration
//---------------------------------------------------------

domainServiceDeclaration
                              : ^( DOMAIN_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $DOMAIN_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   pragmaList
                                 )
                                                            {
                                                                  if ( $DOMAIN_SERVICE_DECLARATION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;


parameterDefinition
//returns [ParameterDefinition parameter]
                              : ^( PARAMETER_DEFINITION
                                   parameterName
                                   parameterMode
                                                            {
                                                                  args[0] = $parameterName.name;
                                                                  args[1] = $parameterMode.mode;
                                                                  populate( "parameter", args );
                                                            }
                                   parameterType)           
                              ;
                              
parameterList
//returns [List<ParameterDefinition> params]

                              : ( parameterDefinition )*
                                                            {
                                                                  populate( "parameter", args );  // end parameter
                                                            }
                              ;


serviceVisibility
returns [String visibility]
//returns [Visibility visibility]
                              : PRIVATE                     { $visibility = $PRIVATE.text; }
                              | PUBLIC                      { $visibility = $PUBLIC.text; }
                              ;

parameterMode
returns [String mode]
//returns [ParameterModeType mode]
                              : IN                          { $mode = $IN.text; }
                              | OUT                         { $mode = $OUT.text; }
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
                                   typeReference )
                                                              {
                                                                  args[0] = $typeReference.type;
                                                                  populate( "typeref", args );
                                                                  populate( "typeref", args );  // end type
                                                              }
                              ;

returnType
//returns [BasicType type]
                              : ^( RETURN_TYPE
                                   typeReference )
                                                              {
                                                                  args[0] = $typeReference.type;
                                                                  populate( "typeref", args );
                                                                  populate( "typeref", args );  // end type
                                                              }
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
                                                            {
                                                                args[0] = $relationshipName.name;
                                                                populate( "regularrel", args );
                                                            }
                                   leftToRight=halfRelationshipDefinition
                                   rightToLeft=halfRelationshipDefinition
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "participation", args );  // end participation
                                                                populate( "regularrel", args );   // end regularrel
                                                            }
                              ;


assocRelationshipDefinition
                              : ^( ASSOCIATIVE_RELATIONSHIP_DEFINITION
                                   relationshipName
                                                            {
                                                                args[0] = $relationshipName.name;
                                                                populate( "associative", args );
                                                            }
                                   leftToRight=halfRelationshipDefinition
                                   rightToLeft=halfRelationshipDefinition
                                   assocObj=objectReference
                                                            {
                                                                populate( "participation", args );  // end participation

                                                                // update with the associative object
                                                                args[0] = $relationshipName.name;
                                                                args[1] = $assocObj.ref;
                                                                populate( "associative", args );
                                                            }
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "associative", args );   // end associativerelationship
                                                            }

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
                                                            { 
                                                                // populate a side of participation
                                                                args[0] = $from.ref;
                                                                args[1] = $rolePhrase.role;
                                                                args[2] = $conditionality.cond;
                                                                args[3] = $multiplicity.mult;
                                                                args[4] = $to.ref;
                                                                populate( "participation", args );
                                                            }
                              ;


subtypeRelationshipDefinition
//returns [SubtypeRelationshipDeclaration relationship]

                              : ^( SUBTYPE_RELATIONSHIP_DEFINITION
                                   relationshipName
                                                            {
                                                                args[0] = $relationshipName.name;
                                                                populate( "subsuper", args );
                                                            }
                                   supertype=objectReference
                                                            {
                                                                args[0] = $supertype.ref;
                                                                populate( "participation", args );
                                                            }
                                   (subtype=objectReference   
                                                            {
                                                                args[0] = $subtype.ref;
                                                                args[4] = $supertype.ref;
                                                                populate( "participation", args );
                                                                populate( "participation", args );  // end participation
                                                            }
                                   )+
                                   pragmaList
                                 )                          
                                                            {
                                                                populate( "subsuper", args );   // end subsuper
                                                            }

                              ;

rolePhrase
returns [String role]
                              : ^( ROLE_PHRASE
                                   identifier )             { $role = $identifier.name; }
                              ;

conditionality
returns [String cond]
//returns [boolean cond]
                              : UNCONDITIONALLY             { $cond = $UNCONDITIONALLY.text; }
                              | CONDITIONALLY               { $cond = $CONDITIONALLY.text; }
                              ;

multiplicity
returns [String mult]
//returns [MultiplicityType mult]
                              : ONE                         { $mult = $ONE.text; }
                              | MANY                        { $mult = $MANY.text; }
                              ;


relationshipName
returns [String name]
                              : ^( RELATIONSHIP_NAME
                                   RelationshipName  
                                 )                          { $name = $RelationshipName.text; }
                              ;
                              

relationshipReference
returns [String ref]
//returns [RelationshipDeclaration.Reference ref]
                              : optionalDomainReference
                                relationshipName            
                                                            { 
                                                                String r = "";
                                                                if ( $optionalDomainReference.ref != "" )
                                                                    r += ( $optionalDomainReference.ref + "::" );
                                                                r += $relationshipName.name;
                                                                $ref = r;
                                                            }
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
                                                            {
                                                                args[0] = $pragmaName.name;
                                                                populate( "pragma", args );
                                                            }
                                   ( pragmaValue            
                                                            {
                                                                args[0] = $pragmaValue.value;
                                                                populate( "pragmaitem", args );
                                                                populate( "pragmaitem", args ); // end pragmaitem
                                                            } 
                                   )*
                                 )                          
                                                            {
                                                                populate( "pragma", args ); // end pragma
                                                            }
                              ;

pragmaValue
returns [ String value ]
                              : identifier                  { $value = $identifier.name; }
                              | literalExpression           { $value = $literalExpression.exp; }
                              ;

pragmaName
returns [ String name ]
                              : ^( PRAGMA_NAME
                                   identifier               { $name = $identifier.name; }
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
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $DOMAIN_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   codeBlock
                                                            {
                                                                args[0] = getFile();
                                                                populate( "codeblock", args );
                                                                populate( "codeblock", args );  // end codeblock
                                                            }
                                   pragmaList                  
                                 )                                                   
                                                            {
                                                                  if ( $DOMAIN_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;


terminatorServiceDefinition//[DomainTerminatorService service]
//scope NameScope;


                              : ^( TERMINATOR_SERVICE_DEFINITION
                                   serviceVisibility
                                   domainReference
                                   terminatorName
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $TERMINATOR_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                                            {
                                                                args[0] = getFile();
                                                                populate( "codeblock", args );
                                                                populate( "codeblock", args );  // end codeblock
                                                            }
                                   returnType?
                                   codeBlock
                                   pragmaList                  
                                 )                                                   
                                                            {
                                                                  if ( $TERMINATOR_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;


projectTerminatorServiceDefinition//[ProjectTerminatorService service]
//scope NameScope;
                              : ^( TERMINATOR_SERVICE_DEFINITION
                                   serviceVisibility
                                   domainReference
                                   terminatorName
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $TERMINATOR_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   codeBlock         
                                                            {
                                                                args[0] = getFile();
                                                                populate( "codeblock", args );
                                                                populate( "codeblock", args );  // end codeblock
                                                            }
                                   pragmaList                  
                                 )                                                   
                                                            {
                                                                  if ( $TERMINATOR_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                                                            
                              ;



objectServiceDefinition//[ObjectService service]
//scope NameScope;


                              :^( OBJECT_SERVICE_DEFINITION
                                   serviceVisibility
                                   INSTANCE?
                                   fullObjectReference
                                   serviceName
                                                            {
                                                                  args[0] = $serviceVisibility.visibility;
                                                                  args[1] = $serviceName.name;
                                                                  if ( $INSTANCE != null )
                                                                      args[2] = $INSTANCE.text;
                                                                  if ( $OBJECT_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );
                                                                  else
                                                                      populate( "function", args );
                                                            }
                                   parameterList
                                   returnType?
                                   codeBlock
                                                            {
                                                                args[0] = getFile();
                                                                populate( "codeblock", args );
                                                                populate( "codeblock", args );  // end codeblock
                                                            }
                                   pragmaList                           
                                 )                          
                                                            {
                                                                  if ( $OBJECT_SERVICE_DEFINITION.text.equals("service") )
                                                                      populate( "service", args );      // end service
                                                                  else
                                                                      populate( "function", args );     // end function
                                                            }
                              ;


stateDefinition//[State stateDef]
//scope NameScope;


                              : ^( STATE_DEFINITION
                                   stateType
                                   fullObjectReference
                                   stateName
                                                            {
                                                                args[0] = $stateName.name;
                                                                args[1] = $stateType.type;
                                                                populate( "state", args );
                                                            }
                                   parameterList
                                   codeBlock
                                                            {
                                                                args[0] = getFile();
                                                                populate( "codeblock", args );
                                                                populate( "codeblock", args );  // end codeblock
                                                            }
                                   pragmaList                
                                 )                          
                                                            {
                                                                populate( "state", args );  // end state
                                                            }
                              ;



//---------------------------------------------------------
// Statements
//---------------------------------------------------------

statement
//returns [Statement st]
                              : ^( STATEMENT
                                   ( codeBlock       
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

codeBlock
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
returns [String exp]
//returns [Expression exp]
                              : IntegerLiteral              { $exp = $IntegerLiteral.text; }
                              | RealLiteral                 { $exp = $RealLiteral.text; }
                              | CharacterLiteral            { $exp = $CharacterLiteral.text; }
                              | StringLiteral               { $exp = $StringLiteral.text; }
                              | TimestampLiteral            { $exp = $TimestampLiteral.text; }
                              | DurationLiteral             { $exp = $DurationLiteral.text; }
                              | TRUE                        { $exp = $TRUE.text; }
                              | FALSE                       { $exp = $FALSE.text; }
                              | NULL                        { $exp = $NULL.text; }
                              | FLUSH                       { $exp = $FLUSH.text; }
                              | ENDL                        { $exp = $ENDL.text; }
                              | THIS                        { $exp = $THIS.text; }
                              | CONSOLE                     { $exp = $CONSOLE.text; }
                              ; 
