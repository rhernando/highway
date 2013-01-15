/**
 */
package highwayproj.highway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link highwayproj.highway.Signal#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see highwayproj.highway.HighwayPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
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
	 * @see highwayproj.highway.HighwayPackage#getSignal_BelongsTo()
	 * @model required="true"
	 * @generated
	 */
	Node getBelongsTo();

	/**
	 * Sets the value of the '{@link highwayproj.highway.Signal#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Node value);

} // Signal
