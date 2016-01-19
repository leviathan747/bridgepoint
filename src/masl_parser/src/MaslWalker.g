tree grammar MaslWalker;

options
{
  tokenVocab=MaslParser;
  ASTLabelType=CommonTree;
}

@annotations
{
@SuppressWarnings("all")
}

@header
{
import java.util.Collections;
}

@members
{
// external interface
private Population population = null;

// set the population interface
public void setPopulation ( Population population ) {
    if ( population != null )
        this.population = population;
    else
        this.population = null;
}

// call to the interface with null checking
private void populate( String classname, String[] args ) {
    // check args
    if ( population == null ) {
        System.err.println( "No external interface set." );
        return;
    }

    // call the interface
    population.populate( classname, args );
}

}


target                        : definition+;

definition                    : projectDefinition
                              ;


//---------------------------------------------------------
// Project Definition
//---------------------------------------------------------

identifier
returns [String name]
                              : Identifier                  {
                                                              //registerPosition($Identifier);
                                                              $name = $Identifier.text;
                                                            }
                              ;


projectDefinition
                              : ^( PROJECT
                                   projectName              {
                                                              String[] args = new String[1];
                                                              args[0] = $projectName.name;
                                                              populate( "project", args);
                                                            }
                                   ( projectDomainDefinition {}
                                   )*
                                   pragmaList)              {}
                              ;

projectDomainDefinition
                              : ^( DOMAIN
                                    domainName              { 
                                                                String[] args = new String[1];
                                                                args[0] = $domainName.name;
                                                                populate( "domain", args);
                                                            }
                                   ( projectTerminatorDefinition    
                                   )*
                                   pragmaList               {}
                                 )                          {}
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

domainName
returns [String name]
                              : ^( DOMAIN_NAME
                                   identifier               { $name = $identifier.name; }
                                 )
                              ;
//---------------------------------------------------------
// Type Reference
//---------------------------------------------------------

typeReference
                              : namedTypeRef                {  }
                              ;

namedTypeRef
                              : ^( NAMED_TYPE
                                   typeName
                                   ANONYMOUS?
                                 )                          { 
                                                            }
                              ;

typeName
                              : ^( TYPE_NAME
                                   identifier )             {  }
                              ;




//---------------------------------------------------------
// Terminator Definition
//---------------------------------------------------------

terminatorName
returns [String name]
                              : ^( TERMINATOR_NAME
                                   identifier )             { $name = $identifier.name; }
                              ;


projectTerminatorDefinition
@init
{
    String terminatorName;
}
                              : ^( TERMINATOR_DEFINITION
                                   terminatorName             {
                                                                  terminatorName = $terminatorName.name;
                                                                  String[] args = new String[1];
                                                                  args[0] = $terminatorName.name;
                                                                  populate( "terminator", args);
                                                              }
                                   pragmaList                 {}
                                   ( projectTerminatorServiceDeclaration[terminatorName] )*
                                 )
                              ;


projectTerminatorServiceDeclaration[String terminatorName]
                              : ^( TERMINATOR_SERVICE_DECLARATION
                                   serviceVisibility
                                   serviceName              {
                                                                  String[] args = new String[3];
                                                                  args[0] = $serviceName.name;
                                                                  args[1] = terminatorName;
                                                                  args[2] = "service";      // default to service
                                                            }
                                   parameterList
                                   (returnType { args[2] = "function";     // if there is a return type, it is a function
                                                })?
                                   pragmaList
                                 )
                                                            {
                                                                  populate( "activity", args);
                                                            }
                              ;


//---------------------------------------------------------
// Service Declaration
//---------------------------------------------------------

parameterDefinition[String prevParamName]
returns [String name]
                              : ^( PARAMETER_DEFINITION
                                   parameterName
                                   parameterMode
                                   parameterType)           {
                                                                  $name = $parameterName.name;

                                                                  String[] args = new String[4];
                                                                  args[0] = $parameterName.name;
                                                                  args[1] = $parameterType.type;
                                                                  args[2] = $parameterMode.mode;
                                                                  args[3] = prevParamName;
                                                                  populate( "parameter", args);
                                                            }
                              ;
                              
parameterList
@init
{
    String prevParamName = "";
}
                              : ( parameterDefinition[prevParamName]       { prevParamName = $parameterDefinition.name; }
                                )*
                              ;


serviceVisibility
returns [String visibility]
                              : PRIVATE                     { $visibility = "private"; }
                              | PUBLIC                      { $visibility = "public"; }
                              ;

parameterMode
returns [String mode]
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
                              : ^( PARAMETER_TYPE
                                   typeReference )           { $type = "LeviType"; } //TODO hardcoded type
                              ;

returnType
returns [String type]
                              : ^( RETURN_TYPE
                                   typeReference )           { $type = "LeviType"; } //TODO hardcoded type
                              ;


//---------------------------------------------------------
// Pragma Definition
//---------------------------------------------------------


pragmaList
                              : ( pragma                    {}
                                )*                          {}
                              ;

pragma
                              : ^( PRAGMA
                                   pragmaName
                                   ( pragmaValue            {} 
                                   )*
                                 )                          { 
                                                                /*  TODO fill in pragma
                                                                String[] args = new String[1];
                                                                args[0] = $terminatorName.name;
                                                                populate( "terminator", args);
                                                                */
                                                            }
                              ;

pragmaValue
returns [ String value ]
                              : identifier                  { $value = $identifier.name; }
                              ;

pragmaName
returns [ String name ]
                              : ^( PRAGMA_NAME
                                   identifier               { $name = $identifier.name; }
                                 )
                              ;
