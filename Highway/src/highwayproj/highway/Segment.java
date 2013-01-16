/**
 */
package highwayproj.highway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highwayproj.highway.Segment#getNumLanes <em>Num Lanes</em>}</li>
 *   <li>{@link highwayproj.highway.Segment#getHasCars <em>Has Cars</em>}</li>
 *   <li>{@link highwayproj.highway.Segment#getLength <em>Length</em>}</li>
 *   <li>{@link highwayproj.highway.Segment#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see highwayproj.highway.HighwayPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Lanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Lanes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Lanes</em>' attribute.
	 * @see #setNumLanes(int)
	 * @see highwayproj.highway.HighwayPackage#getSegment_NumLanes()
	 * @model ordered="false"
	 * @generated
	 */
	int getNumLanes();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Segment#getNumLanes <em>Num Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Lanes</em>' attribute.
	 * @see #getNumLanes()
	 * @generated
	 */
	void setNumLanes(int value);

	/**
	 * Returns the value of the '<em><b>Has Cars</b></em>' reference list.
	 * The list contents are of type {@link highwayproj.highway.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Cars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cars</em>' reference list.
	 * @see highwayproj.highway.HighwayPackage#getSegment_HasCars()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Car> getHasCars();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see highwayproj.highway.HighwayPackage#getSegment_Length()
	 * @model ordered="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Segment#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

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
	 * @see highwayproj.highway.HighwayPackage#getSegment_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Segment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Segment
