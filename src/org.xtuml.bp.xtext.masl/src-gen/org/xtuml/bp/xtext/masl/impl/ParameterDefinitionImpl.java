/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtuml.bp.xtext.masl.MaslPackage;
import org.xtuml.bp.xtext.masl.ParameterDefinition;
import org.xtuml.bp.xtext.masl.ParameterName;
import org.xtuml.bp.xtext.masl.ParameterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.ParameterDefinitionImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.ParameterDefinitionImpl#getParameterMode <em>Parameter Mode</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.ParameterDefinitionImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefinitionImpl extends MinimalEObjectImpl.Container implements ParameterDefinition
{
  /**
   * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterName()
   * @generated
   * @ordered
   */
  protected ParameterName parameterName;

  /**
   * The default value of the '{@link #getParameterMode() <em>Parameter Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterMode()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterMode() <em>Parameter Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterMode()
   * @generated
   * @ordered
   */
  protected String parameterMode = PARAMETER_MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected ParameterType parameterType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDefinitionImpl()
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
    return MaslPackage.Literals.PARAMETER_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterName getParameterName()
  {
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterName(ParameterName newParameterName, NotificationChain msgs)
  {
    ParameterName oldParameterName = parameterName;
    parameterName = newParameterName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME, oldParameterName, newParameterName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterName(ParameterName newParameterName)
  {
    if (newParameterName != parameterName)
    {
      NotificationChain msgs = null;
      if (parameterName != null)
        msgs = ((InternalEObject)parameterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME, null, msgs);
      if (newParameterName != null)
        msgs = ((InternalEObject)newParameterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME, null, msgs);
      msgs = basicSetParameterName(newParameterName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME, newParameterName, newParameterName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterMode()
  {
    return parameterMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterMode(String newParameterMode)
  {
    String oldParameterMode = parameterMode;
    parameterMode = newParameterMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.PARAMETER_DEFINITION__PARAMETER_MODE, oldParameterMode, parameterMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType getParameterType()
  {
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterType(ParameterType newParameterType, NotificationChain msgs)
  {
    ParameterType oldParameterType = parameterType;
    parameterType = newParameterType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE, oldParameterType, newParameterType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterType(ParameterType newParameterType)
  {
    if (newParameterType != parameterType)
    {
      NotificationChain msgs = null;
      if (parameterType != null)
        msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE, null, msgs);
      if (newParameterType != null)
        msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE, null, msgs);
      msgs = basicSetParameterType(newParameterType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE, newParameterType, newParameterType));
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
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME:
        return basicSetParameterName(null, msgs);
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE:
        return basicSetParameterType(null, msgs);
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
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME:
        return getParameterName();
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_MODE:
        return getParameterMode();
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE:
        return getParameterType();
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
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME:
        setParameterName((ParameterName)newValue);
        return;
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_MODE:
        setParameterMode((String)newValue);
        return;
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE:
        setParameterType((ParameterType)newValue);
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
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME:
        setParameterName((ParameterName)null);
        return;
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_MODE:
        setParameterMode(PARAMETER_MODE_EDEFAULT);
        return;
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE:
        setParameterType((ParameterType)null);
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
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_NAME:
        return parameterName != null;
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_MODE:
        return PARAMETER_MODE_EDEFAULT == null ? parameterMode != null : !PARAMETER_MODE_EDEFAULT.equals(parameterMode);
      case MaslPackage.PARAMETER_DEFINITION__PARAMETER_TYPE:
        return parameterType != null;
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
    result.append(" (parameterMode: ");
    result.append(parameterMode);
    result.append(')');
    return result.toString();
  }

} //ParameterDefinitionImpl