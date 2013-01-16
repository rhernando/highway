/**
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Transition#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link PetriNet.Transition#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Element {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see PetriNet.PetriNetPackage#getTransition_MinTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see PetriNet.PetriNetPackage#getTransition_MaxTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

} // Transition
