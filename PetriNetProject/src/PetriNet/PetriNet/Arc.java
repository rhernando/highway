/**
 */
package PetriNet.PetriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PetriNet.Arc#getIn <em>In</em>}</li>
 *   <li>{@link PetriNet.PetriNet.Arc#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Element)
	 * @see PetriNet.PetriNet.PetriNetPackage#getArc_In()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getIn();

	/**
	 * Sets the value of the '{@link PetriNet.PetriNet.Arc#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Element value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Element)
	 * @see PetriNet.PetriNet.PetriNetPackage#getArc_Out()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getOut();

	/**
	 * Sets the value of the '{@link PetriNet.PetriNet.Arc#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Element value);

} // Arc
