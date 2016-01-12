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
import org.xtuml.bp.xtext.masl.PragmaList;
import org.xtuml.bp.xtext.masl.VariableDeclaration;
import org.xtuml.bp.xtext.masl.VariableName;
import org.xtuml.bp.xtext.masl.typeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.VariableDeclarationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.VariableDeclarationImpl#getREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.VariableDeclarationImpl#getTypeReferenceWithCA <em>Type Reference With CA</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.impl.VariableDeclarationImpl#getPragmaList <em>Pragma List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
{
  /**
   * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected VariableName variableName;

  /**
   * The default value of the '{@link #getREADONLY() <em>READONLY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getREADONLY()
   * @generated
   * @ordered
   */
  protected static final String READONLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getREADONLY() <em>READONLY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getREADONLY()
   * @generated
   * @ordered
   */
  protected String readonly = READONLY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeReferenceWithCA() <em>Type Reference With CA</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeReferenceWithCA()
   * @generated
   * @ordered
   */
  protected typeReference typeReferenceWithCA;

  /**
   * The cached value of the '{@link #getPragmaList() <em>Pragma List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPragmaList()
   * @generated
   * @ordered
   */
  protected PragmaList pragmaList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return MaslPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName getVariableName()
  {
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableName(VariableName newVariableName, NotificationChain msgs)
  {
    VariableName oldVariableName = variableName;
    variableName = newVariableName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME, oldVariableName, newVariableName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableName(VariableName newVariableName)
  {
    if (newVariableName != variableName)
    {
      NotificationChain msgs = null;
      if (variableName != null)
        msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME, null, msgs);
      if (newVariableName != null)
        msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME, null, msgs);
      msgs = basicSetVariableName(newVariableName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME, newVariableName, newVariableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getREADONLY()
  {
    return readonly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setREADONLY(String newREADONLY)
  {
    String oldREADONLY = readonly;
    readonly = newREADONLY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__READONLY, oldREADONLY, readonly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeReference getTypeReferenceWithCA()
  {
    return typeReferenceWithCA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeReferenceWithCA(typeReference newTypeReferenceWithCA, NotificationChain msgs)
  {
    typeReference oldTypeReferenceWithCA = typeReferenceWithCA;
    typeReferenceWithCA = newTypeReferenceWithCA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA, oldTypeReferenceWithCA, newTypeReferenceWithCA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeReferenceWithCA(typeReference newTypeReferenceWithCA)
  {
    if (newTypeReferenceWithCA != typeReferenceWithCA)
    {
      NotificationChain msgs = null;
      if (typeReferenceWithCA != null)
        msgs = ((InternalEObject)typeReferenceWithCA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA, null, msgs);
      if (newTypeReferenceWithCA != null)
        msgs = ((InternalEObject)newTypeReferenceWithCA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA, null, msgs);
      msgs = basicSetTypeReferenceWithCA(newTypeReferenceWithCA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA, newTypeReferenceWithCA, newTypeReferenceWithCA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaList getPragmaList()
  {
    return pragmaList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPragmaList(PragmaList newPragmaList, NotificationChain msgs)
  {
    PragmaList oldPragmaList = pragmaList;
    pragmaList = newPragmaList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST, oldPragmaList, newPragmaList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPragmaList(PragmaList newPragmaList)
  {
    if (newPragmaList != pragmaList)
    {
      NotificationChain msgs = null;
      if (pragmaList != null)
        msgs = ((InternalEObject)pragmaList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST, null, msgs);
      if (newPragmaList != null)
        msgs = ((InternalEObject)newPragmaList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST, null, msgs);
      msgs = basicSetPragmaList(newPragmaList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST, newPragmaList, newPragmaList));
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
      case MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        return basicSetVariableName(null, msgs);
      case MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA:
        return basicSetTypeReferenceWithCA(null, msgs);
      case MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST:
        return basicSetPragmaList(null, msgs);
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
      case MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        return getVariableName();
      case MaslPackage.VARIABLE_DECLARATION__READONLY:
        return getREADONLY();
      case MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA:
        return getTypeReferenceWithCA();
      case MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST:
        return getPragmaList();
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
      case MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        setVariableName((VariableName)newValue);
        return;
      case MaslPackage.VARIABLE_DECLARATION__READONLY:
        setREADONLY((String)newValue);
        return;
      case MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA:
        setTypeReferenceWithCA((typeReference)newValue);
        return;
      case MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST:
        setPragmaList((PragmaList)newValue);
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
      case MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        setVariableName((VariableName)null);
        return;
      case MaslPackage.VARIABLE_DECLARATION__READONLY:
        setREADONLY(READONLY_EDEFAULT);
        return;
      case MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA:
        setTypeReferenceWithCA((typeReference)null);
        return;
      case MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST:
        setPragmaList((PragmaList)null);
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
      case MaslPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        return variableName != null;
      case MaslPackage.VARIABLE_DECLARATION__READONLY:
        return READONLY_EDEFAULT == null ? readonly != null : !READONLY_EDEFAULT.equals(readonly);
      case MaslPackage.VARIABLE_DECLARATION__TYPE_REFERENCE_WITH_CA:
        return typeReferenceWithCA != null;
      case MaslPackage.VARIABLE_DECLARATION__PRAGMA_LIST:
        return pragmaList != null;
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
    result.append(" (READONLY: ");
    result.append(readonly);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
