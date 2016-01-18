/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminator Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.TerminatorFunctionDeclaration#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.MaslPackage#getTerminatorFunctionDeclaration()
 * @model
 * @generated
 */
public interface TerminatorFunctionDeclaration extends terminatorItem
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ReturnType)
   * @see org.xtuml.bp.xtext.masl.MaslPackage#getTerminatorFunctionDeclaration_ReturnType()
   * @model containment="true"
   * @generated
   */
  ReturnType getReturnType();

  /**
   * Sets the value of the '{@link org.xtuml.bp.xtext.masl.TerminatorFunctionDeclaration#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ReturnType value);

} // TerminatorFunctionDeclaration