/**
 */
package highway.impl;

import highway.HighwayPackage;
import highway.Injector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highway.impl.InjectorImpl#getCarsPerHour <em>Cars Per Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjectorImpl extends NodeImpl implements Injector {
	/**
	 * The default value of the '{@link #getCarsPerHour() <em>Cars Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarsPerHour()
	 * @generated
	 * @ordered
	 */
	protected static final int CARS_PER_HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCarsPerHour() <em>Cars Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarsPerHour()
	 * @generated
	 * @ordered
	 */
	protected int carsPerHour = CARS_PER_HOUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.INJECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCarsPerHour() {
		return carsPerHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarsPerHour(int newCarsPerHour) {
		int oldCarsPerHour = carsPerHour;
		carsPerHour = newCarsPerHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.INJECTOR__CARS_PER_HOUR, oldCarsPerHour, carsPerHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.INJECTOR__CARS_PER_HOUR:
				return getCarsPerHour();
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
			case HighwayPackage.INJECTOR__CARS_PER_HOUR:
				setCarsPerHour((Integer)newValue);
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
			case HighwayPackage.INJECTOR__CARS_PER_HOUR:
				setCarsPerHour(CARS_PER_HOUR_EDEFAULT);
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
			case HighwayPackage.INJECTOR__CARS_PER_HOUR:
				return carsPerHour != CARS_PER_HOUR_EDEFAULT;
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
		result.append(" (carsPerHour: ");
		result.append(carsPerHour);
		result.append(')');
		return result.toString();
	}

} //InjectorImpl
