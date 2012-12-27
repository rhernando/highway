/**
 */
package highway.impl;

import highway.Car;
import highway.HighwayPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highway.impl.CarImpl#getTimeIn <em>Time In</em>}</li>
 *   <li>{@link highway.impl.CarImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarImpl extends EObjectImpl implements Car {
	/**
	 * The default value of the '{@link #getTimeIn() <em>Time In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIn()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeIn() <em>Time In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIn()
	 * @generated
	 * @ordered
	 */
	protected Date timeIn = TIME_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOut()
	 * @generated
	 * @ordered
	 */
	protected Date timeOut = TIME_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeIn() {
		return timeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeIn(Date newTimeIn) {
		Date oldTimeIn = timeIn;
		timeIn = newTimeIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.CAR__TIME_IN, oldTimeIn, timeIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeOut() {
		return timeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOut(Date newTimeOut) {
		Date oldTimeOut = timeOut;
		timeOut = newTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.CAR__TIME_OUT, oldTimeOut, timeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.CAR__TIME_IN:
				return getTimeIn();
			case HighwayPackage.CAR__TIME_OUT:
				return getTimeOut();
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
			case HighwayPackage.CAR__TIME_IN:
				setTimeIn((Date)newValue);
				return;
			case HighwayPackage.CAR__TIME_OUT:
				setTimeOut((Date)newValue);
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
			case HighwayPackage.CAR__TIME_IN:
				setTimeIn(TIME_IN_EDEFAULT);
				return;
			case HighwayPackage.CAR__TIME_OUT:
				setTimeOut(TIME_OUT_EDEFAULT);
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
			case HighwayPackage.CAR__TIME_IN:
				return TIME_IN_EDEFAULT == null ? timeIn != null : !TIME_IN_EDEFAULT.equals(timeIn);
			case HighwayPackage.CAR__TIME_OUT:
				return TIME_OUT_EDEFAULT == null ? timeOut != null : !TIME_OUT_EDEFAULT.equals(timeOut);
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
		result.append(" (timeIn: ");
		result.append(timeIn);
		result.append(", timeOut: ");
		result.append(timeOut);
		result.append(')');
		return result.toString();
	}

} //CarImpl
