/**
 */
package Highway.highway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speedlimit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Highway.highway.Speedlimit#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see Highway.highway.HighwayPackage#getSpeedlimit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='Speed > 0'"
 * @generated
 */
public interface Speedlimit extends Signal {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see Highway.highway.HighwayPackage#getSpeedlimit_Speed()
	 * @model ordered="false"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link Highway.highway.Speedlimit#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

} // Speedlimit
