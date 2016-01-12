/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtuml.bp.xtext.masl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaslFactoryImpl extends EFactoryImpl implements MaslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MaslFactory init()
  {
    try
    {
      MaslFactory theMaslFactory = (MaslFactory)EPackage.Registry.INSTANCE.getEFactory(MaslPackage.eNS_URI);
      if (theMaslFactory != null)
      {
        return theMaslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MaslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MaslPackage.TARGET: return createtarget();
      case MaslPackage.DEFINITION: return createdefinition();
      case MaslPackage.PROJECT: return createProject();
      case MaslPackage.PROJECT_ITEM: return createprojectItem();
      case MaslPackage.DOMAIN: return createDomain();
      case MaslPackage.DOMAIN_PRJ_ITEM: return createdomainPrjItem();
      case MaslPackage.PROJECT_NAME: return createProjectName();
      case MaslPackage.DOMAIN_NAME: return createDomainName();
      case MaslPackage.TERMINATOR_NAME: return createTerminatorName();
      case MaslPackage.TERMINATOR_DEFINITION: return createTerminatorDefinition();
      case MaslPackage.TERMINATOR_ITEM: return createterminatorItem();
      case MaslPackage.TERMINATOR_SERVICE_DECLARATION: return createTerminatorServiceDeclaration();
      case MaslPackage.TERMINATOR_FUNCTION_DECLARATION: return createTerminatorFunctionDeclaration();
      case MaslPackage.PARAMETER_LIST: return createparameterList();
      case MaslPackage.PARAMETER_DEFINITION: return createParameterDefinition();
      case MaslPackage.SERVICE_NAME: return createServiceName();
      case MaslPackage.PARAMETER_NAME: return createParameterName();
      case MaslPackage.PARAMETER_TYPE: return createParameterType();
      case MaslPackage.RETURN_TYPE: return createReturnType();
      case MaslPackage.TYPE_REFERENCE: return createtypeReference();
      case MaslPackage.DEPRECATED_TYPE: return createdeprecatedType();
      case MaslPackage.NAMED_TYPE: return createNamedType();
      case MaslPackage.TYPE_NAME: return createTypeName();
      case MaslPackage.PRAGMA_LIST: return createPragmaList();
      case MaslPackage.PRAGMA: return createPragma();
      case MaslPackage.PRAGMA_NAME: return createPragmaName();
      case MaslPackage.OBJECT_NAME: return createObjectName();
      case MaslPackage.SERVICE_TYPE: return createserviceType();
      case MaslPackage.RELATIONSHIP_NAME: return createRelationshipName();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION: return createDomainServiceDefinition();
      case MaslPackage.OBJECT_SERVICE_DEFINITION: return createObjectServiceDefinition();
      case MaslPackage.TERMINATOR_SERVICE_DEFINITION: return createTerminatorServiceDefinition();
      case MaslPackage.CODE_BLOCK: return createCodeBlock();
      case MaslPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case MaslPackage.VARIABLE_NAME: return createVariableName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public target createtarget()
  {
    targetImpl target = new targetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public definition createdefinition()
  {
    definitionImpl definition = new definitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public projectItem createprojectItem()
  {
    projectItemImpl projectItem = new projectItemImpl();
    return projectItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public domainPrjItem createdomainPrjItem()
  {
    domainPrjItemImpl domainPrjItem = new domainPrjItemImpl();
    return domainPrjItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectName createProjectName()
  {
    ProjectNameImpl projectName = new ProjectNameImpl();
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainName createDomainName()
  {
    DomainNameImpl domainName = new DomainNameImpl();
    return domainName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorName createTerminatorName()
  {
    TerminatorNameImpl terminatorName = new TerminatorNameImpl();
    return terminatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorDefinition createTerminatorDefinition()
  {
    TerminatorDefinitionImpl terminatorDefinition = new TerminatorDefinitionImpl();
    return terminatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public terminatorItem createterminatorItem()
  {
    terminatorItemImpl terminatorItem = new terminatorItemImpl();
    return terminatorItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorServiceDeclaration createTerminatorServiceDeclaration()
  {
    TerminatorServiceDeclarationImpl terminatorServiceDeclaration = new TerminatorServiceDeclarationImpl();
    return terminatorServiceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorFunctionDeclaration createTerminatorFunctionDeclaration()
  {
    TerminatorFunctionDeclarationImpl terminatorFunctionDeclaration = new TerminatorFunctionDeclarationImpl();
    return terminatorFunctionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterList createparameterList()
  {
    parameterListImpl parameterList = new parameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition createParameterDefinition()
  {
    ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
    return parameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceName createServiceName()
  {
    ServiceNameImpl serviceName = new ServiceNameImpl();
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterName createParameterName()
  {
    ParameterNameImpl parameterName = new ParameterNameImpl();
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterType()
  {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType createReturnType()
  {
    ReturnTypeImpl returnType = new ReturnTypeImpl();
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeReference createtypeReference()
  {
    typeReferenceImpl typeReference = new typeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public deprecatedType createdeprecatedType()
  {
    deprecatedTypeImpl deprecatedType = new deprecatedTypeImpl();
    return deprecatedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType createNamedType()
  {
    NamedTypeImpl namedType = new NamedTypeImpl();
    return namedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaList createPragmaList()
  {
    PragmaListImpl pragmaList = new PragmaListImpl();
    return pragmaList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pragma createPragma()
  {
    PragmaImpl pragma = new PragmaImpl();
    return pragma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaName createPragmaName()
  {
    PragmaNameImpl pragmaName = new PragmaNameImpl();
    return pragmaName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectName createObjectName()
  {
    ObjectNameImpl objectName = new ObjectNameImpl();
    return objectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public serviceType createserviceType()
  {
    serviceTypeImpl serviceType = new serviceTypeImpl();
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipName createRelationshipName()
  {
    RelationshipNameImpl relationshipName = new RelationshipNameImpl();
    return relationshipName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainServiceDefinition createDomainServiceDefinition()
  {
    DomainServiceDefinitionImpl domainServiceDefinition = new DomainServiceDefinitionImpl();
    return domainServiceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectServiceDefinition createObjectServiceDefinition()
  {
    ObjectServiceDefinitionImpl objectServiceDefinition = new ObjectServiceDefinitionImpl();
    return objectServiceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorServiceDefinition createTerminatorServiceDefinition()
  {
    TerminatorServiceDefinitionImpl terminatorServiceDefinition = new TerminatorServiceDefinitionImpl();
    return terminatorServiceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock createCodeBlock()
  {
    CodeBlockImpl codeBlock = new CodeBlockImpl();
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName createVariableName()
  {
    VariableNameImpl variableName = new VariableNameImpl();
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaslPackage getMaslPackage()
  {
    return (MaslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MaslPackage getPackage()
  {
    return MaslPackage.eINSTANCE;
  }

} //MaslFactoryImpl
