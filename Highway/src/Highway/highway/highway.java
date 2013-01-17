/**
 */
package Highway.highway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>highway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Highway.highway.highway#getInitNodes <em>Init Nodes</em>}</li>
 *   <li>{@link Highway.highway.highway#getInitCars <em>Init Cars</em>}</li>
 *   <li>{@link Highway.highway.highway#getInitSegments <em>Init Segments</em>}</li>
 *   <li>{@link Highway.highway.highway#getInitSemaphore <em>Init Semaphore</em>}</li>
 *   <li>{@link Highway.highway.highway#getInitSignal <em>Init Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see Highway.highway.HighwayPackage#gethighway()
 * @model
 * @generated
 */
public interface highway extends EObject {
	/**
	 * Returns the value of the '<em><b>Init Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link Highway.highway.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Nodes</em>' containment reference list.
	 * @see Highway.highway.HighwayPackage#gethighway_InitNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getInitNodes();

	/**
	 * Returns the value of the '<em><b>Init Cars</b></em>' containment reference list.
	 * The list contents are of type {@link Highway.highway.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Cars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Cars</em>' containment reference list.
	 * @see Highway.highway.HighwayPackage#gethighway_InitCars()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Car> getInitCars();

	/**
	 * Returns the value of the '<em><b>Init Segments</b></em>' containment reference list.
	 * The list contents are of type {@link Highway.highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Segments</em>' containment reference list.
	 * @see Highway.highway.HighwayPackage#gethighway_InitSegments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Segment> getInitSegments();

	/**
	 * Returns the value of the '<em><b>Init Semaphore</b></em>' containment reference list.
	 * The list contents are of type {@link Highway.highway.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Semaphore</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Semaphore</em>' containment reference list.
	 * @see Highway.highway.HighwayPackage#gethighway_InitSemaphore()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Semaphore> getInitSemaphore();

	/**
	 * Returns the value of the '<em><b>Init Signal</b></em>' containment reference list.
	 * The list contents are of type {@link Highway.highway.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Signal</em>' containment reference list.
	 * @see Highway.highway.HighwayPackage#gethighway_InitSignal()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Signal> getInitSignal();

} // highway
