/**
 */
package Highway.highway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Highway.highway.Injector#getCarsPerHour <em>Cars Per Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @see Highway.highway.HighwayPackage#getInjector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoStart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoStart='hasStarts->isEmpty()'"
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
	 * @see Highway.highway.HighwayPackage#getInjector_CarsPerHour()
	 * @model ordered="false"
	 * @generated
	 */
	int getCarsPerHour();

	/**
	 * Sets the value of the '{@link Highway.highway.Injector#getCarsPerHour <em>Cars Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cars Per Hour</em>' attribute.
	 * @see #getCarsPerHour()
	 * @generated
	 */
	void setCarsPerHour(int value);

} // Injector
