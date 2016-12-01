/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.xtuml.bp.xtext.masl.masl.behavior.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getAbstractActionDefinition()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActionDefinition extends AbstractTopLevelElement, Parameterized, Visualized {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(DomainDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getAbstractActionDefinition_Domain()
	 * @model
	 * @generated
	 */
	DomainDefinition getDomain();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainDefinition value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(CodeBlock)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getAbstractActionDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getBody();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractActionDefinition#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CodeBlock value);

} // AbstractActionDefinition
