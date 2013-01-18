/**
 */
package Highway.highway;

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
 *   <li>{@link Highway.highway.Node#getHasStarts <em>Has Starts</em>}</li>
 *   <li>{@link Highway.highway.Node#getHasEnds <em>Has Ends</em>}</li>
 *   <li>{@link Highway.highway.Node#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link Highway.highway.Node#getSignals <em>Signals</em>}</li>
 *   <li>{@link Highway.highway.Node#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Highway.highway.HighwayPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NullName UniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NullName='name <> null' UniqueName='highway.initNodes->isUnique(name)'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Starts</b></em>' reference list.
	 * The list contents are of type {@link Highway.highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Starts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Starts</em>' reference list.
	 * @see Highway.highway.HighwayPackage#getNode_HasStarts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Segment> getHasStarts();

	/**
	 * Returns the value of the '<em><b>Has Ends</b></em>' reference list.
	 * The list contents are of type {@link Highway.highway.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ends</em>' reference list.
	 * @see Highway.highway.HighwayPackage#getNode_HasEnds()
	 * @model ordered="false"
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
	 * @see Highway.highway.HighwayPackage#getNode_Semaphore()
	 * @model ordered="false"
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link Highway.highway.Node#getSemaphore <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' reference list.
	 * The list contents are of type {@link Highway.highway.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' reference list.
	 * @see Highway.highway.HighwayPackage#getNode_Signals()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Signal> getSignals();

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
	 * @see Highway.highway.HighwayPackage#getNode_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Highway.highway.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
