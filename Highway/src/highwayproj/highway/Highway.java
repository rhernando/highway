/**
 */
package highwayproj.highway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highwayproj.highway.Highway#getInitNodes <em>Init Nodes</em>}</li>
 *   <li>{@link highwayproj.highway.Highway#getInitCars <em>Init Cars</em>}</li>
 *   <li>{@link highwayproj.highway.Highway#getInitSegments <em>Init Segments</em>}</li>
 *   <li>{@link highwayproj.highway.Highway#getInitSemaphore <em>Init Semaphore</em>}</li>
 *   <li>{@link highwayproj.highway.Highway#getInitSignal <em>Init Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see highwayproj.highway.HighwayPackage#getHighway()
 * @model
 * @generated
 */
public interface Highway extends EObject {
	/**
	 * Returns the value of the '<em><b>Init Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link highwayproj.highway.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Nodes</em>' containment reference list.
	 * @see highwayproj.highway.HighwayPackage#getHighway_InitNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getInitNodes();

	/**
	 * Returns the value of the '<em><b>Init Cars</b></em>' containment reference list.
	 * The list contents are of type {@link highwayproj.highway.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Cars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Cars</em>' containment reference list.
	 * @see highwayproj.highway.HighwayPackage#getHighway_InitCars()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Car> getInitCars();

	/**
	 * Returns the value of the '<em><b>Init Segments</b></em>' containment reference list.
	 * The list contents are of type {@link highwayproj.highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Segments</em>' containment reference list.
	 * @see highwayproj.highway.HighwayPackage#getHighway_InitSegments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Segment> getInitSegments();

	/**
	 * Returns the value of the '<em><b>Init Semaphore</b></em>' containment reference list.
	 * The list contents are of type {@link highwayproj.highway.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Semaphore</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Semaphore</em>' containment reference list.
	 * @see highwayproj.highway.HighwayPackage#getHighway_InitSemaphore()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Semaphore> getInitSemaphore();

	/**
	 * Returns the value of the '<em><b>Init Signal</b></em>' containment reference list.
	 * The list contents are of type {@link highwayproj.highway.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Signal</em>' containment reference list.
	 * @see highwayproj.highway.HighwayPackage#getHighway_InitSignal()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Signal> getInitSignal();

} // Highway
