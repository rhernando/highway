/**
 */
package highway;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see highway.HighwayFactory
 * @model kind="package"
 * @generated
 */
public interface HighwayPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "highway";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "highway";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "highway";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HighwayPackage eINSTANCE = highway.impl.HighwayPackageImpl.init();

	/**
	 * The meta object id for the '{@link highway.impl.HighwayImpl <em>Highway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.HighwayImpl
	 * @see highway.impl.HighwayPackageImpl#getHighway()
	 * @generated
	 */
	int HIGHWAY = 0;

	/**
	 * The feature id for the '<em><b>Start Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__START_NODES = 0;

	/**
	 * The number of structural features of the '<em>Highway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link highway.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.NodeImpl
	 * @see highway.impl.HighwayPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Has Starts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_STARTS = 0;

	/**
	 * The feature id for the '<em><b>Has Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_ENDS = 1;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SEMAPHORE = 2;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SIGNALS = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link highway.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.SegmentImpl
	 * @see highway.impl.HighwayPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Num Lanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NUM_LANES = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Has Cars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__HAS_CARS = 2;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link highway.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.SemaphoreImpl
	 * @see highway.impl.HighwayPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 3;

	/**
	 * The feature id for the '<em><b>Seconds Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__SECONDS_RED = 0;

	/**
	 * The feature id for the '<em><b>Seconds Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__SECONDS_GREEN = 1;

	/**
	 * The feature id for the '<em><b>Can Go</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__CAN_GO = 2;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link highway.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.SignalImpl
	 * @see highway.impl.HighwayPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 4;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link highway.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highway.impl.CarImpl
	 * @see highway.impl.HighwayPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 5;

	/**
	 * The feature id for the '<em><b>Time In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__TIME_IN = 0;

	/**
	 * The feature id for the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__TIME_OUT = 1;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link highway.Highway <em>Highway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highway</em>'.
	 * @see highway.Highway
	 * @generated
	 */
	EClass getHighway();

	/**
	 * Returns the meta object for the containment reference list '{@link highway.Highway#getStartNodes <em>Start Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Nodes</em>'.
	 * @see highway.Highway#getStartNodes()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_StartNodes();

	/**
	 * Returns the meta object for class '{@link highway.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see highway.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link highway.Node#getHasStarts <em>Has Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Starts</em>'.
	 * @see highway.Node#getHasStarts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasStarts();

	/**
	 * Returns the meta object for the reference list '{@link highway.Node#getHasEnds <em>Has Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Ends</em>'.
	 * @see highway.Node#getHasEnds()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasEnds();

	/**
	 * Returns the meta object for the reference '{@link highway.Node#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semaphore</em>'.
	 * @see highway.Node#getSemaphore()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Semaphore();

	/**
	 * Returns the meta object for the reference list '{@link highway.Node#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals</em>'.
	 * @see highway.Node#getSignals()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Signals();

	/**
	 * Returns the meta object for class '{@link highway.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see highway.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link highway.Segment#getNumLanes <em>Num Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Lanes</em>'.
	 * @see highway.Segment#getNumLanes()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_NumLanes();

	/**
	 * Returns the meta object for the attribute '{@link highway.Segment#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see highway.Segment#getLength()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Length();

	/**
	 * Returns the meta object for the reference list '{@link highway.Segment#getHasCars <em>Has Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Cars</em>'.
	 * @see highway.Segment#getHasCars()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_HasCars();

	/**
	 * Returns the meta object for class '{@link highway.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see highway.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for the attribute '{@link highway.Semaphore#getSecondsRed <em>Seconds Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Red</em>'.
	 * @see highway.Semaphore#getSecondsRed()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_SecondsRed();

	/**
	 * Returns the meta object for the attribute '{@link highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Green</em>'.
	 * @see highway.Semaphore#getSecondsGreen()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_SecondsGreen();

	/**
	 * Returns the meta object for the attribute '{@link highway.Semaphore#isCanGo <em>Can Go</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Go</em>'.
	 * @see highway.Semaphore#isCanGo()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_CanGo();

	/**
	 * Returns the meta object for class '{@link highway.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see highway.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for class '{@link highway.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see highway.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link highway.Car#getTimeIn <em>Time In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time In</em>'.
	 * @see highway.Car#getTimeIn()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_TimeIn();

	/**
	 * Returns the meta object for the attribute '{@link highway.Car#getTimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out</em>'.
	 * @see highway.Car#getTimeOut()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_TimeOut();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HighwayFactory getHighwayFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link highway.impl.HighwayImpl <em>Highway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.HighwayImpl
		 * @see highway.impl.HighwayPackageImpl#getHighway()
		 * @generated
		 */
		EClass HIGHWAY = eINSTANCE.getHighway();

		/**
		 * The meta object literal for the '<em><b>Start Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__START_NODES = eINSTANCE.getHighway_StartNodes();

		/**
		 * The meta object literal for the '{@link highway.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.NodeImpl
		 * @see highway.impl.HighwayPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Has Starts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HAS_STARTS = eINSTANCE.getNode_HasStarts();

		/**
		 * The meta object literal for the '<em><b>Has Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HAS_ENDS = eINSTANCE.getNode_HasEnds();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SEMAPHORE = eINSTANCE.getNode_Semaphore();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SIGNALS = eINSTANCE.getNode_Signals();

		/**
		 * The meta object literal for the '{@link highway.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.SegmentImpl
		 * @see highway.impl.HighwayPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Num Lanes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NUM_LANES = eINSTANCE.getSegment_NumLanes();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__LENGTH = eINSTANCE.getSegment_Length();

		/**
		 * The meta object literal for the '<em><b>Has Cars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__HAS_CARS = eINSTANCE.getSegment_HasCars();

		/**
		 * The meta object literal for the '{@link highway.impl.SemaphoreImpl <em>Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.SemaphoreImpl
		 * @see highway.impl.HighwayPackageImpl#getSemaphore()
		 * @generated
		 */
		EClass SEMAPHORE = eINSTANCE.getSemaphore();

		/**
		 * The meta object literal for the '<em><b>Seconds Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__SECONDS_RED = eINSTANCE.getSemaphore_SecondsRed();

		/**
		 * The meta object literal for the '<em><b>Seconds Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__SECONDS_GREEN = eINSTANCE.getSemaphore_SecondsGreen();

		/**
		 * The meta object literal for the '<em><b>Can Go</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__CAN_GO = eINSTANCE.getSemaphore_CanGo();

		/**
		 * The meta object literal for the '{@link highway.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.SignalImpl
		 * @see highway.impl.HighwayPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '{@link highway.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highway.impl.CarImpl
		 * @see highway.impl.HighwayPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Time In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__TIME_IN = eINSTANCE.getCar_TimeIn();

		/**
		 * The meta object literal for the '<em><b>Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__TIME_OUT = eINSTANCE.getCar_TimeOut();

	}

} //HighwayPackage
