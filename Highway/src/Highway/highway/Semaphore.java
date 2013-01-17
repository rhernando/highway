/**
 */
package Highway.highway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Highway.highway.Semaphore#getSecondsRed <em>Seconds Red</em>}</li>
 *   <li>{@link Highway.highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}</li>
 *   <li>{@link Highway.highway.Semaphore#isCanGo <em>Can Go</em>}</li>
 *   <li>{@link Highway.highway.Semaphore#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link Highway.highway.Semaphore#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Highway.highway.HighwayPackage#getSemaphore()
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
	 * @see Highway.highway.HighwayPackage#getSemaphore_SecondsRed()
	 * @model default="1" ordered="false"
	 * @generated
	 */
	int getSecondsRed();

	/**
	 * Sets the value of the '{@link Highway.highway.Semaphore#getSecondsRed <em>Seconds Red</em>}' attribute.
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
	 * @see Highway.highway.HighwayPackage#getSemaphore_SecondsGreen()
	 * @model default="1" ordered="false"
	 * @generated
	 */
	int getSecondsGreen();

	/**
	 * Sets the value of the '{@link Highway.highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}' attribute.
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
	 * @see Highway.highway.HighwayPackage#getSemaphore_CanGo()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isCanGo();

	/**
	 * Sets the value of the '{@link Highway.highway.Semaphore#isCanGo <em>Can Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Go</em>' attribute.
	 * @see #isCanGo()
	 * @generated
	 */
	void setCanGo(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(Node)
	 * @see Highway.highway.HighwayPackage#getSemaphore_BelongsTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getBelongsTo();

	/**
	 * Sets the value of the '{@link Highway.highway.Semaphore#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Highway.highway.HighwayPackage#getSemaphore_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Highway.highway.Semaphore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Semaphore
