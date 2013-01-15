/**
 */
package highwayproj.highway.impl;

import highwayproj.highway.Car;
import highwayproj.highway.HighwayPackage;
import highwayproj.highway.Segment;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highwayproj.highway.impl.CarImpl#getTimeIn <em>Time In</em>}</li>
 *   <li>{@link highwayproj.highway.impl.CarImpl#getTimeOut <em>Time Out</em>}</li>
 *   <li>{@link highwayproj.highway.impl.CarImpl#getIsInSegment <em>Is In Segment</em>}</li>
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
	 * The cached value of the '{@link #getIsInSegment() <em>Is In Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInSegment()
	 * @generated
	 * @ordered
	 */
	protected Segment isInSegment;

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
	public Segment getIsInSegment() {
		if (isInSegment != null && isInSegment.eIsProxy()) {
			InternalEObject oldIsInSegment = (InternalEObject)isInSegment;
			isInSegment = (Segment)eResolveProxy(oldIsInSegment);
			if (isInSegment != oldIsInSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HighwayPackage.CAR__IS_IN_SEGMENT, oldIsInSegment, isInSegment));
			}
		}
		return isInSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment basicGetIsInSegment() {
		return isInSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInSegment(Segment newIsInSegment) {
		Segment oldIsInSegment = isInSegment;
		isInSegment = newIsInSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.CAR__IS_IN_SEGMENT, oldIsInSegment, isInSegment));
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
			case HighwayPackage.CAR__IS_IN_SEGMENT:
				if (resolve) return getIsInSegment();
				return basicGetIsInSegment();
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
			case HighwayPackage.CAR__IS_IN_SEGMENT:
				setIsInSegment((Segment)newValue);
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
			case HighwayPackage.CAR__IS_IN_SEGMENT:
				setIsInSegment((Segment)null);
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
			case HighwayPackage.CAR__IS_IN_SEGMENT:
				return isInSegment != null;
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
