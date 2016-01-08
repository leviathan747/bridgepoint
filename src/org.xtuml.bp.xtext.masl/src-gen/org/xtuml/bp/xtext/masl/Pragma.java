/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.Pragma#getPragmaName <em>Pragma Name</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.Pragma#getPragmaValue <em>Pragma Value</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.MaslPackage#getPragma()
 * @model
 * @generated
 */
public interface Pragma extends EObject
{
  /**
   * Returns the value of the '<em><b>Pragma Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pragma Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pragma Name</em>' containment reference.
   * @see #setPragmaName(PragmaName)
   * @see org.xtuml.bp.xtext.masl.MaslPackage#getPragma_PragmaName()
   * @model containment="true"
   * @generated
   */
  PragmaName getPragmaName();

  /**
   * Sets the value of the '{@link org.xtuml.bp.xtext.masl.Pragma#getPragmaName <em>Pragma Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pragma Name</em>' containment reference.
   * @see #getPragmaName()
   * @generated
   */
  void setPragmaName(PragmaName value);

  /**
   * Returns the value of the '<em><b>Pragma Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pragma Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pragma Value</em>' attribute list.
   * @see org.xtuml.bp.xtext.masl.MaslPackage#getPragma_PragmaValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getPragmaValue();

} // Pragma
