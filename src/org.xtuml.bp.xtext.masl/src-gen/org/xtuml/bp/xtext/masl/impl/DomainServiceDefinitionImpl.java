/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.CodeBlock;
import org.xtuml.bp.xtext.masl.DomainName;
import org.xtuml.bp.xtext.masl.DomainServiceDefinition;
import org.xtuml.bp.xtext.masl.MaslPackage;
import org.xtuml.bp.xtext.masl.PragmaList;
import org.xtuml.bp.xtext.masl.ReturnType;
import org.xtuml.bp.xtext.masl.ServiceName;
import org.xtuml.bp.xtext.masl.parameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getServiceVisibility <em>Service Visibility</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getPargmaList <em>Pargma List</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.DomainServiceDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainServiceDefinitionImpl extends definitionImpl implements DomainServiceDefinition
{
  /**
   * The default value of the '{@link #getServiceVisibility() <em>Service Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceVisibility()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_VISIBILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceVisibility() <em>Service Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceVisibility()
   * @generated
   * @ordered
   */
  protected String serviceVisibility = SERVICE_VISIBILITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainName()
   * @generated
   * @ordered
   */
  protected DomainName domainName;

  /**
   * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected ServiceName serviceName;

  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected parameterList parameterList;

  /**
   * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeBlock()
   * @generated
   * @ordered
   */
  protected CodeBlock codeBlock;

  /**
   * The cached value of the '{@link #getPargmaList() <em>Pargma List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPargmaList()
   * @generated
   * @ordered
   */
  protected PragmaList pargmaList;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected ReturnType returnType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainServiceDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MaslPackage.Literals.DOMAIN_SERVICE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceVisibility()
  {
    return serviceVisibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceVisibility(String newServiceVisibility)
  {
    String oldServiceVisibility = serviceVisibility;
    serviceVisibility = newServiceVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_VISIBILITY, oldServiceVisibility, serviceVisibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainName getDomainName()
  {
    return domainName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomainName(DomainName newDomainName, NotificationChain msgs)
  {
    DomainName oldDomainName = domainName;
    domainName = newDomainName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME, oldDomainName, newDomainName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainName(DomainName newDomainName)
  {
    if (newDomainName != domainName)
    {
      NotificationChain msgs = null;
      if (domainName != null)
        msgs = ((InternalEObject)domainName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME, null, msgs);
      if (newDomainName != null)
        msgs = ((InternalEObject)newDomainName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME, null, msgs);
      msgs = basicSetDomainName(newDomainName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME, newDomainName, newDomainName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceName getServiceName()
  {
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServiceName(ServiceName newServiceName, NotificationChain msgs)
  {
    ServiceName oldServiceName = serviceName;
    serviceName = newServiceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME, oldServiceName, newServiceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceName(ServiceName newServiceName)
  {
    if (newServiceName != serviceName)
    {
      NotificationChain msgs = null;
      if (serviceName != null)
        msgs = ((InternalEObject)serviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME, null, msgs);
      if (newServiceName != null)
        msgs = ((InternalEObject)newServiceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME, null, msgs);
      msgs = basicSetServiceName(newServiceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME, newServiceName, newServiceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(parameterList newParameterList, NotificationChain msgs)
  {
    parameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST, oldParameterList, newParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterList(parameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST, newParameterList, newParameterList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock getCodeBlock()
  {
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeBlock(CodeBlock newCodeBlock, NotificationChain msgs)
  {
    CodeBlock oldCodeBlock = codeBlock;
    codeBlock = newCodeBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK, oldCodeBlock, newCodeBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeBlock(CodeBlock newCodeBlock)
  {
    if (newCodeBlock != codeBlock)
    {
      NotificationChain msgs = null;
      if (codeBlock != null)
        msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK, null, msgs);
      if (newCodeBlock != null)
        msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK, null, msgs);
      msgs = basicSetCodeBlock(newCodeBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK, newCodeBlock, newCodeBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaList getPargmaList()
  {
    return pargmaList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPargmaList(PragmaList newPargmaList, NotificationChain msgs)
  {
    PragmaList oldPargmaList = pargmaList;
    pargmaList = newPargmaList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST, oldPargmaList, newPargmaList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPargmaList(PragmaList newPargmaList)
  {
    if (newPargmaList != pargmaList)
    {
      NotificationChain msgs = null;
      if (pargmaList != null)
        msgs = ((InternalEObject)pargmaList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST, null, msgs);
      if (newPargmaList != null)
        msgs = ((InternalEObject)newPargmaList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST, null, msgs);
      msgs = basicSetPargmaList(newPargmaList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST, newPargmaList, newPargmaList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(ReturnType newReturnType, NotificationChain msgs)
  {
    ReturnType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(ReturnType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME:
        return basicSetDomainName(null, msgs);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME:
        return basicSetServiceName(null, msgs);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK:
        return basicSetCodeBlock(null, msgs);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST:
        return basicSetPargmaList(null, msgs);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_VISIBILITY:
        return getServiceVisibility();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME:
        return getDomainName();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME:
        return getServiceName();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST:
        return getParameterList();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK:
        return getCodeBlock();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST:
        return getPargmaList();
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_VISIBILITY:
        setServiceVisibility((String)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME:
        setDomainName((DomainName)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME:
        setServiceName((ServiceName)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST:
        setParameterList((parameterList)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK:
        setCodeBlock((CodeBlock)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST:
        setPargmaList((PragmaList)newValue);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE:
        setReturnType((ReturnType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_VISIBILITY:
        setServiceVisibility(SERVICE_VISIBILITY_EDEFAULT);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME:
        setDomainName((DomainName)null);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME:
        setServiceName((ServiceName)null);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST:
        setParameterList((parameterList)null);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK:
        setCodeBlock((CodeBlock)null);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST:
        setPargmaList((PragmaList)null);
        return;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE:
        setReturnType((ReturnType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_VISIBILITY:
        return SERVICE_VISIBILITY_EDEFAULT == null ? serviceVisibility != null : !SERVICE_VISIBILITY_EDEFAULT.equals(serviceVisibility);
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__DOMAIN_NAME:
        return domainName != null;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__SERVICE_NAME:
        return serviceName != null;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARAMETER_LIST:
        return parameterList != null;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__CODE_BLOCK:
        return codeBlock != null;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__PARGMA_LIST:
        return pargmaList != null;
      case MaslPackage.DOMAIN_SERVICE_DEFINITION__RETURN_TYPE:
        return returnType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (serviceVisibility: ");
    result.append(serviceVisibility);
    result.append(')');
    return result.toString();
  }

} //DomainServiceDefinitionImpl