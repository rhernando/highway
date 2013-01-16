/**
 */
package highway.impl;

import highway.Car;
import highway.HighwayPackage;
import highway.Segment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highway.impl.SegmentImpl#getNumLanes <em>Num Lanes</em>}</li>
 *   <li>{@link highway.impl.SegmentImpl#getHasCars <em>Has Cars</em>}</li>
 *   <li>{@link highway.impl.SegmentImpl#getLength <em>Length</em>}</li>
 *   <li>{@link highway.impl.SegmentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends EObjectImpl implements Segment {
	/**
	 * The default value of the '{@link #getNumLanes() <em>Num Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLanes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_LANES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumLanes() <em>Num Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLanes()
	 * @generated
	 * @ordered
	 */
	protected int numLanes = NUM_LANES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasCars() <em>Has Cars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCars()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> hasCars;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

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
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumLanes() {
		return numLanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLanes(int newNumLanes) {
		int oldNumLanes = numLanes;
		numLanes = newNumLanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEGMENT__NUM_LANES, oldNumLanes, numLanes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Car> getHasCars() {
		if (hasCars == null) {
			hasCars = new EObjectResolvingEList<Car>(Car.class, this, HighwayPackage.SEGMENT__HAS_CARS);
		}
		return hasCars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEGMENT__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.SEGMENT__NUM_LANES:
				return getNumLanes();
			case HighwayPackage.SEGMENT__HAS_CARS:
				return getHasCars();
			case HighwayPackage.SEGMENT__LENGTH:
				return getLength();
			case HighwayPackage.SEGMENT__NAME:
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
			case HighwayPackage.SEGMENT__NUM_LANES:
				setNumLanes((Integer)newValue);
				return;
			case HighwayPackage.SEGMENT__HAS_CARS:
				getHasCars().clear();
				getHasCars().addAll((Collection<? extends Car>)newValue);
				return;
			case HighwayPackage.SEGMENT__LENGTH:
				setLength((Integer)newValue);
				return;
			case HighwayPackage.SEGMENT__NAME:
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
			case HighwayPackage.SEGMENT__NUM_LANES:
				setNumLanes(NUM_LANES_EDEFAULT);
				return;
			case HighwayPackage.SEGMENT__HAS_CARS:
				getHasCars().clear();
				return;
			case HighwayPackage.SEGMENT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case HighwayPackage.SEGMENT__NAME:
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
			case HighwayPackage.SEGMENT__NUM_LANES:
				return numLanes != NUM_LANES_EDEFAULT;
			case HighwayPackage.SEGMENT__HAS_CARS:
				return hasCars != null && !hasCars.isEmpty();
			case HighwayPackage.SEGMENT__LENGTH:
				return length != LENGTH_EDEFAULT;
			case HighwayPackage.SEGMENT__NAME:
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
		result.append(" (numLanes: ");
		result.append(numLanes);
		result.append(", length: ");
		result.append(length);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SegmentImpl
