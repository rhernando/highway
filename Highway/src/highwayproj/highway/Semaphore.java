/**
 */
package highwayproj.highway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highwayproj.highway.Semaphore#getSecondsRed <em>Seconds Red</em>}</li>
 *   <li>{@link highwayproj.highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}</li>
 *   <li>{@link highwayproj.highway.Semaphore#isCanGo <em>Can Go</em>}</li>
 * </ul>
 * </p>
 *
 * @see highwayproj.highway.HighwayPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends EObject {
	/**
	 * Returns the value of the '<em><b>Seconds Red</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds Red</em>' attribute.
	 * @see #setSecondsRed(int)
	 * @see highwayproj.highway.HighwayPackage#getSemaphore_SecondsRed()
	 * @model default="1"
	 * @generated
	 */
	int getSecondsRed();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Semaphore#getSecondsRed <em>Seconds Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds Red</em>' attribute.
	 * @see #getSecondsRed()
	 * @generated
	 */
	void setSecondsRed(int value);

	/**
	 * Returns the value of the '<em><b>Seconds Green</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds Green</em>' attribute.
	 * @see #setSecondsGreen(int)
	 * @see highwayproj.highway.HighwayPackage#getSemaphore_SecondsGreen()
	 * @model default="1"
	 * @generated
	 */
	int getSecondsGreen();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds Green</em>' attribute.
	 * @see #getSecondsGreen()
	 * @generated
	 */
	void setSecondsGreen(int value);

	/**
	 * Returns the value of the '<em><b>Can Go</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Go</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Go</em>' attribute.
	 * @see #setCanGo(boolean)
	 * @see highwayproj.highway.HighwayPackage#getSemaphore_CanGo()
	 * @model
	 * @generated
	 */
	boolean isCanGo();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Semaphore#isCanGo <em>Can Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Go</em>' attribute.
	 * @see #isCanGo()
	 * @generated
	 */
	void setCanGo(boolean value);

} // Semaphore
