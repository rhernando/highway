/**
 */
package PetriNet.PetriNet.impl;

import PetriNet.PetriNet.PetriNetPackage;
import PetriNet.PetriNet.Transition;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.PetriNet.impl.TransitionImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link PetriNet.PetriNet.impl.TransitionImpl#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxTime = MAX_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinTime() {
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(BigInteger newMinTime) {
		BigInteger oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(BigInteger newMaxTime) {
		BigInteger oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION__MIN_TIME:
				return getMinTime();
			case PetriNetPackage.TRANSITION__MAX_TIME:
				return getMaxTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION__MIN_TIME:
				setMinTime((BigInteger)newValue);
				return;
			case PetriNetPackage.TRANSITION__MAX_TIME:
				setMaxTime((BigInteger)newValue);
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
			case PetriNetPackage.TRANSITION__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
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
			case PetriNetPackage.TRANSITION__MIN_TIME:
				return MIN_TIME_EDEFAULT == null ? minTime != null : !MIN_TIME_EDEFAULT.equals(minTime);
			case PetriNetPackage.TRANSITION__MAX_TIME:
				return MAX_TIME_EDEFAULT == null ? maxTime != null : !MAX_TIME_EDEFAULT.equals(maxTime);
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
		result.append(" (minTime: ");
		result.append(minTime);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
