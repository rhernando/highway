/**
 */
package highwayproj.highway.impl;

import highwayproj.highway.HighwayPackage;
import highwayproj.highway.Node;
import highwayproj.highway.Segment;
import highwayproj.highway.Semaphore;
import highwayproj.highway.Signal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highwayproj.highway.impl.NodeImpl#getHasStarts <em>Has Starts</em>}</li>
 *   <li>{@link highwayproj.highway.impl.NodeImpl#getHasEnds <em>Has Ends</em>}</li>
 *   <li>{@link highwayproj.highway.impl.NodeImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link highwayproj.highway.impl.NodeImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link highwayproj.highway.impl.NodeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getHasStarts() <em>Has Starts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStarts()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> hasStarts;

	/**
	 * The cached value of the '{@link #getHasEnds() <em>Has Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> hasEnds;

	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected Semaphore semaphore;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getHasStarts() {
		if (hasStarts == null) {
			hasStarts = new EObjectResolvingEList<Segment>(Segment.class, this, HighwayPackage.NODE__HAS_STARTS);
		}
		return hasStarts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getHasEnds() {
		if (hasEnds == null) {
			hasEnds = new EObjectResolvingEList<Segment>(Segment.class, this, HighwayPackage.NODE__HAS_ENDS);
		}
		return hasEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore getSemaphore() {
		if (semaphore != null && semaphore.eIsProxy()) {
			InternalEObject oldSemaphore = (InternalEObject)semaphore;
			semaphore = (Semaphore)eResolveProxy(oldSemaphore);
			if (semaphore != oldSemaphore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HighwayPackage.NODE__SEMAPHORE, oldSemaphore, semaphore));
			}
		}
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphore(Semaphore newSemaphore) {
		Semaphore oldSemaphore = semaphore;
		semaphore = newSemaphore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.NODE__SEMAPHORE, oldSemaphore, semaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectResolvingEList<Signal>(Signal.class, this, HighwayPackage.NODE__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.NODE__HAS_STARTS:
				return getHasStarts();
			case HighwayPackage.NODE__HAS_ENDS:
				return getHasEnds();
			case HighwayPackage.NODE__SEMAPHORE:
				if (resolve) return getSemaphore();
				return basicGetSemaphore();
			case HighwayPackage.NODE__SIGNALS:
				return getSignals();
			case HighwayPackage.NODE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HighwayPackage.NODE__HAS_STARTS:
				getHasStarts().clear();
				getHasStarts().addAll((Collection<? extends Segment>)newValue);
				return;
			case HighwayPackage.NODE__HAS_ENDS:
				getHasEnds().clear();
				getHasEnds().addAll((Collection<? extends Segment>)newValue);
				return;
			case HighwayPackage.NODE__SEMAPHORE:
				setSemaphore((Semaphore)newValue);
				return;
			case HighwayPackage.NODE__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case HighwayPackage.NODE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HighwayPackage.NODE__HAS_STARTS:
				getHasStarts().clear();
				return;
			case HighwayPackage.NODE__HAS_ENDS:
				getHasEnds().clear();
				return;
			case HighwayPackage.NODE__SEMAPHORE:
				setSemaphore((Semaphore)null);
				return;
			case HighwayPackage.NODE__SIGNALS:
				getSignals().clear();
				return;
			case HighwayPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HighwayPackage.NODE__HAS_STARTS:
				return hasStarts != null && !hasStarts.isEmpty();
			case HighwayPackage.NODE__HAS_ENDS:
				return hasEnds != null && !hasEnds.isEmpty();
			case HighwayPackage.NODE__SEMAPHORE:
				return semaphore != null;
			case HighwayPackage.NODE__SIGNALS:
				return signals != null && !signals.isEmpty();
			case HighwayPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
