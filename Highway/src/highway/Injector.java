/**
 */
package highway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highway.Injector#getCarsPerHour <em>Cars Per Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @see highway.HighwayPackage#getInjector()
 * @model
 * @generated
 */
public interface Injector extends Node {
	/**
	 * Returns the value of the '<em><b>Cars Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cars Per Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cars Per Hour</em>' attribute.
	 * @see #setCarsPerHour(int)
	 * @see highway.HighwayPackage#getInjector_CarsPerHour()
	 * @model
	 * @generated
	 */
	int getCarsPerHour();

	/**
	 * Sets the value of the '{@link highway.Injector#getCarsPerHour <em>Cars Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cars Per Hour</em>' attribute.
	 * @see #getCarsPerHour()
	 * @generated
	 */
	void setCarsPerHour(int value);

} // Injector
