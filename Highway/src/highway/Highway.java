/**
 */
package highway;

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
 *   <li>{@link highway.Highway#getStartNodes <em>Start Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see highway.HighwayPackage#getHighway()
 * @model
 * @generated
 */
public interface Highway extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link highway.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Nodes</em>' containment reference list.
	 * @see highway.HighwayPackage#getHighway_StartNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getStartNodes();

} // Highway
