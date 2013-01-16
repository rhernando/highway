/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PetriNetRoot#getElements <em>Elements</em>}</li>
 *   <li>{@link PetriNet.PetriNetRoot#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPetriNetRoot()
 * @model
 * @generated
 */
public interface PetriNetRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNetRoot_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNetRoot_Arcs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Arc> getArcs();

} // PetriNetRoot
