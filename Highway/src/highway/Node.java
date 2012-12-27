/**
 */
package highway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highway.Node#getHasStarts <em>Has Starts</em>}</li>
 *   <li>{@link highway.Node#getHasEnds <em>Has Ends</em>}</li>
 *   <li>{@link highway.Node#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link highway.Node#getSignals <em>Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see highway.HighwayPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Starts</b></em>' reference list.
	 * The list contents are of type {@link highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Starts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Starts</em>' reference list.
	 * @see highway.HighwayPackage#getNode_HasStarts()
	 * @model required="true"
	 * @generated
	 */
	EList<Segment> getHasStarts();

	/**
	 * Returns the value of the '<em><b>Has Ends</b></em>' reference list.
	 * The list contents are of type {@link highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ends</em>' reference list.
	 * @see highway.HighwayPackage#getNode_HasEnds()
	 * @model required="true"
	 * @generated
	 */
	EList<Segment> getHasEnds();

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' reference.
	 * @see #setSemaphore(Semaphore)
	 * @see highway.HighwayPackage#getNode_Semaphore()
	 * @model
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link highway.Node#getSemaphore <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' reference list.
	 * The list contents are of type {@link highway.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' reference list.
	 * @see highway.HighwayPackage#getNode_Signals()
	 * @model
	 * @generated
	 */
	EList<Signal> getSignals();

} // Node
