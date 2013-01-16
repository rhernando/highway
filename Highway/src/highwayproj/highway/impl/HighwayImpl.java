/**
 */
package highwayproj.highway.impl;

import highwayproj.highway.Car;
import highwayproj.highway.Highway;
import highwayproj.highway.HighwayPackage;
import highwayproj.highway.Node;
import highwayproj.highway.Segment;
import highwayproj.highway.Semaphore;
import highwayproj.highway.Signal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link highwayproj.highway.impl.HighwayImpl#getInitNodes <em>Init Nodes</em>}</li>
 *   <li>{@link highwayproj.highway.impl.HighwayImpl#getInitCars <em>Init Cars</em>}</li>
 *   <li>{@link highwayproj.highway.impl.HighwayImpl#getInitSegments <em>Init Segments</em>}</li>
 *   <li>{@link highwayproj.highway.impl.HighwayImpl#getInitSemaphore <em>Init Semaphore</em>}</li>
 *   <li>{@link highwayproj.highway.impl.HighwayImpl#getInitSignal <em>Init Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighwayImpl extends EObjectImpl implements Highway {
	/**
	 * The cached value of the '{@link #getInitNodes() <em>Init Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> initNodes;

	/**
	 * The cached value of the '{@link #getInitCars() <em>Init Cars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitCars()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> initCars;

	/**
	 * The cached value of the '{@link #getInitSegments() <em>Init Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> initSegments;

	/**
	 * The cached value of the '{@link #getInitSemaphore() <em>Init Semaphore</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSemaphore()
	 * @generated
	 * @ordered
	 */
	protected EList<Semaphore> initSemaphore;

	/**
	 * The cached value of the '{@link #getInitSignal() <em>Init Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> initSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HighwayPackage.Literals.HIGHWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getInitNodes() {
		if (initNodes == null) {
			initNodes = new EObjectContainmentEList<Node>(Node.class, this, HighwayPackage.HIGHWAY__INIT_NODES);
		}
		return initNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Car> getInitCars() {
		if (initCars == null) {
			initCars = new EObjectContainmentEList<Car>(Car.class, this, HighwayPackage.HIGHWAY__INIT_CARS);
		}
		return initCars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getInitSegments() {
		if (initSegments == null) {
			initSegments = new EObjectContainmentEList<Segment>(Segment.class, this, HighwayPackage.HIGHWAY__INIT_SEGMENTS);
		}
		return initSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semaphore> getInitSemaphore() {
		if (initSemaphore == null) {
			initSemaphore = new EObjectContainmentEList<Semaphore>(Semaphore.class, this, HighwayPackage.HIGHWAY__INIT_SEMAPHORE);
		}
		return initSemaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getInitSignal() {
		if (initSignal == null) {
			initSignal = new EObjectContainmentEList<Signal>(Signal.class, this, HighwayPackage.HIGHWAY__INIT_SIGNAL);
		}
		return initSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HighwayPackage.HIGHWAY__INIT_NODES:
				return ((InternalEList<?>)getInitNodes()).basicRemove(otherEnd, msgs);
			case HighwayPackage.HIGHWAY__INIT_CARS:
				return ((InternalEList<?>)getInitCars()).basicRemove(otherEnd, msgs);
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
				return ((InternalEList<?>)getInitSegments()).basicRemove(otherEnd, msgs);
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
				return ((InternalEList<?>)getInitSemaphore()).basicRemove(otherEnd, msgs);
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
				return ((InternalEList<?>)getInitSignal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HighwayPackage.HIGHWAY__INIT_NODES:
				return getInitNodes();
			case HighwayPackage.HIGHWAY__INIT_CARS:
				return getInitCars();
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
				return getInitSegments();
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
				return getInitSemaphore();
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
				return getInitSignal();
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
			case HighwayPackage.HIGHWAY__INIT_NODES:
				getInitNodes().clear();
				getInitNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case HighwayPackage.HIGHWAY__INIT_CARS:
				getInitCars().clear();
				getInitCars().addAll((Collection<? extends Car>)newValue);
				return;
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
				getInitSegments().clear();
				getInitSegments().addAll((Collection<? extends Segment>)newValue);
				return;
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
				getInitSemaphore().clear();
				getInitSemaphore().addAll((Collection<? extends Semaphore>)newValue);
				return;
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
				getInitSignal().clear();
				getInitSignal().addAll((Collection<? extends Signal>)newValue);
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
			case HighwayPackage.HIGHWAY__INIT_NODES:
				getInitNodes().clear();
				return;
			case HighwayPackage.HIGHWAY__INIT_CARS:
				getInitCars().clear();
				return;
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
				getInitSegments().clear();
				return;
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
				getInitSemaphore().clear();
				return;
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
				getInitSignal().clear();
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
			case HighwayPackage.HIGHWAY__INIT_NODES:
				return initNodes != null && !initNodes.isEmpty();
			case HighwayPackage.HIGHWAY__INIT_CARS:
				return initCars != null && !initCars.isEmpty();
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
				return initSegments != null && !initSegments.isEmpty();
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
				return initSemaphore != null && !initSemaphore.isEmpty();
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
				return initSignal != null && !initSignal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HighwayImpl
