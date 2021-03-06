/**
 */
package Highway.highway.impl;

import Highway.highway.HighwayPackage;
import Highway.highway.Node;
import Highway.highway.Semaphore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Highway.highway.impl.SemaphoreImpl#getSecondsRed <em>Seconds Red</em>}</li>
 *   <li>{@link Highway.highway.impl.SemaphoreImpl#getSecondsGreen <em>Seconds Green</em>}</li>
 *   <li>{@link Highway.highway.impl.SemaphoreImpl#isCanGo <em>Can Go</em>}</li>
 *   <li>{@link Highway.highway.impl.SemaphoreImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link Highway.highway.impl.SemaphoreImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemaphoreImpl extends EObjectImpl implements Semaphore {
	/**
	 * The default value of the '{@link #getSecondsRed() <em>Seconds Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsRed()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_RED_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSecondsRed() <em>Seconds Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsRed()
	 * @generated
	 * @ordered
	 */
	protected int secondsRed = SECONDS_RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondsGreen() <em>Seconds Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsGreen()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_GREEN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSecondsGreen() <em>Seconds Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsGreen()
	 * @generated
	 * @ordered
	 */
	protected int secondsGreen = SECONDS_GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanGo() <em>Can Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_GO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanGo() <em>Can Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGo()
	 * @generated
	 * @ordered
	 */
	protected boolean canGo = CAN_GO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected Node belongsTo;

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
	protected SemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.SEMAPHORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondsRed() {
		return secondsRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondsRed(int newSecondsRed) {
		int oldSecondsRed = secondsRed;
		secondsRed = newSecondsRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEMAPHORE__SECONDS_RED, oldSecondsRed, secondsRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondsGreen() {
		return secondsGreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondsGreen(int newSecondsGreen) {
		int oldSecondsGreen = secondsGreen;
		secondsGreen = newSecondsGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEMAPHORE__SECONDS_GREEN, oldSecondsGreen, secondsGreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanGo() {
		return canGo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanGo(boolean newCanGo) {
		boolean oldCanGo = canGo;
		canGo = newCanGo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEMAPHORE__CAN_GO, oldCanGo, canGo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (Node)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HighwayPackage.SEMAPHORE__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Node newBelongsTo) {
		Node oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEMAPHORE__BELONGS_TO, oldBelongsTo, belongsTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HighwayPackage.SEMAPHORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.SEMAPHORE__SECONDS_RED:
				return getSecondsRed();
			case HighwayPackage.SEMAPHORE__SECONDS_GREEN:
				return getSecondsGreen();
			case HighwayPackage.SEMAPHORE__CAN_GO:
				return isCanGo();
			case HighwayPackage.SEMAPHORE__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case HighwayPackage.SEMAPHORE__NAME:
				return getName();
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
			case HighwayPackage.SEMAPHORE__SECONDS_RED:
				setSecondsRed((Integer)newValue);
				return;
			case HighwayPackage.SEMAPHORE__SECONDS_GREEN:
				setSecondsGreen((Integer)newValue);
				return;
			case HighwayPackage.SEMAPHORE__CAN_GO:
				setCanGo((Boolean)newValue);
				return;
			case HighwayPackage.SEMAPHORE__BELONGS_TO:
				setBelongsTo((Node)newValue);
				return;
			case HighwayPackage.SEMAPHORE__NAME:
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
			case HighwayPackage.SEMAPHORE__SECONDS_RED:
				setSecondsRed(SECONDS_RED_EDEFAULT);
				return;
			case HighwayPackage.SEMAPHORE__SECONDS_GREEN:
				setSecondsGreen(SECONDS_GREEN_EDEFAULT);
				return;
			case HighwayPackage.SEMAPHORE__CAN_GO:
				setCanGo(CAN_GO_EDEFAULT);
				return;
			case HighwayPackage.SEMAPHORE__BELONGS_TO:
				setBelongsTo((Node)null);
				return;
			case HighwayPackage.SEMAPHORE__NAME:
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
			case HighwayPackage.SEMAPHORE__SECONDS_RED:
				return secondsRed != SECONDS_RED_EDEFAULT;
			case HighwayPackage.SEMAPHORE__SECONDS_GREEN:
				return secondsGreen != SECONDS_GREEN_EDEFAULT;
			case HighwayPackage.SEMAPHORE__CAN_GO:
				return canGo != CAN_GO_EDEFAULT;
			case HighwayPackage.SEMAPHORE__BELONGS_TO:
				return belongsTo != null;
			case HighwayPackage.SEMAPHORE__NAME:
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
		result.append(" (secondsRed: ");
		result.append(secondsRed);
		result.append(", secondsGreen: ");
		result.append(secondsGreen);
		result.append(", canGo: ");
		result.append(canGo);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SemaphoreImpl
