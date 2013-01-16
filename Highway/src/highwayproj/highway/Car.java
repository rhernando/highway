/**
 */
package highwayproj.highway;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highwayproj.highway.Car#getTimeIn <em>Time In</em>}</li>
 *   <li>{@link highwayproj.highway.Car#getTimeOut <em>Time Out</em>}</li>
 *   <li>{@link highwayproj.highway.Car#getIsInSegment <em>Is In Segment</em>}</li>
 *   <li>{@link highwayproj.highway.Car#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see highwayproj.highway.HighwayPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Time In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time In</em>' attribute.
	 * @see #setTimeIn(Date)
	 * @see highwayproj.highway.HighwayPackage#getCar_TimeIn()
	 * @model
	 * @generated
	 */
	Date getTimeIn();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Car#getTimeIn <em>Time In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time In</em>' attribute.
	 * @see #getTimeIn()
	 * @generated
	 */
	void setTimeIn(Date value);

	/**
	 * Returns the value of the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Out</em>' attribute.
	 * @see #setTimeOut(Date)
	 * @see highwayproj.highway.HighwayPackage#getCar_TimeOut()
	 * @model
	 * @generated
	 */
	Date getTimeOut();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Car#getTimeOut <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Out</em>' attribute.
	 * @see #getTimeOut()
	 * @generated
	 */
	void setTimeOut(Date value);

	/**
	 * Returns the value of the '<em><b>Is In Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is In Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Segment</em>' reference.
	 * @see #setIsInSegment(Segment)
	 * @see highwayproj.highway.HighwayPackage#getCar_IsInSegment()
	 * @model
	 * @generated
	 */
	Segment getIsInSegment();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Car#getIsInSegment <em>Is In Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Segment</em>' reference.
	 * @see #getIsInSegment()
	 * @generated
	 */
	void setIsInSegment(Segment value);

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
	 * @see highwayproj.highway.HighwayPackage#getCar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Car#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Car
