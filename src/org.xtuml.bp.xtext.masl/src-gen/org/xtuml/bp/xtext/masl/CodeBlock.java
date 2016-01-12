/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.CodeBlock#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.MaslPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtuml.bp.xtext.masl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration</em>' containment reference list.
   * @see org.xtuml.bp.xtext.masl.MaslPackage#getCodeBlock_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariableDeclaration();

} // CodeBlock
