/**
 */
package PetriNet.PetriNet;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PetriNet.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Element {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(BigInteger)
	 * @see PetriNet.PetriNet.PetriNetPackage#getPlace_Tokens()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getTokens();

	/**
	 * Sets the value of the '{@link PetriNet.PetriNet.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(BigInteger value);

} // Place
