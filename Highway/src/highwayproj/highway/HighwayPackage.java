/**
 */
package highwayproj.highway;

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
 * @see highwayproj.highway.HighwayFactory
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
	HighwayPackage eINSTANCE = highwayproj.highway.impl.HighwayPackageImpl.init();

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.HighwayImpl <em>Highway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.HighwayImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getHighway()
	 * @generated
	 */
	int HIGHWAY = 0;

	/**
	 * The feature id for the '<em><b>Init Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__INIT_NODES = 0;

	/**
	 * The feature id for the '<em><b>Init Cars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__INIT_CARS = 1;

	/**
	 * The feature id for the '<em><b>Init Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__INIT_SEGMENTS = 2;

	/**
	 * The feature id for the '<em><b>Init Semaphore</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__INIT_SEMAPHORE = 3;

	/**
	 * The feature id for the '<em><b>Init Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__INIT_SIGNAL = 4;

	/**
	 * The number of structural features of the '<em>Highway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.NodeImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getNode()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.SegmentImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getSegment()
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
	 * The feature id for the '<em><b>Has Cars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__HAS_CARS = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.SemaphoreImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getSemaphore()
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
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__BELONGS_TO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.SignalImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 4;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__BELONGS_TO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.CarImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getCar()
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
	 * The feature id for the '<em><b>Is In Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__IS_IN_SEGMENT = 2;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.ExtractorImpl <em>Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.ExtractorImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getExtractor()
	 * @generated
	 */
	int EXTRACTOR = 6;

	/**
	 * The feature id for the '<em><b>Has Starts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__HAS_STARTS = NODE__HAS_STARTS;

	/**
	 * The feature id for the '<em><b>Has Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__HAS_ENDS = NODE__HAS_ENDS;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__SEMAPHORE = NODE__SEMAPHORE;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__SIGNALS = NODE__SIGNALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.InjectorImpl <em>Injector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.InjectorImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getInjector()
	 * @generated
	 */
	int INJECTOR = 7;

	/**
	 * The feature id for the '<em><b>Has Starts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__HAS_STARTS = NODE__HAS_STARTS;

	/**
	 * The feature id for the '<em><b>Has Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__HAS_ENDS = NODE__HAS_ENDS;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__SEMAPHORE = NODE__SEMAPHORE;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__SIGNALS = NODE__SIGNALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cars Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR__CARS_PER_HOUR = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Injector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.SpeedlimitImpl <em>Speedlimit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.SpeedlimitImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getSpeedlimit()
	 * @generated
	 */
	int SPEEDLIMIT = 8;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEEDLIMIT__BELONGS_TO = SIGNAL__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEEDLIMIT__NAME = SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEEDLIMIT__SPEED = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speedlimit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEEDLIMIT_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.StopImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 9;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__BELONGS_TO = SIGNAL__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = SIGNAL__NAME;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link highwayproj.highway.impl.YieldImpl <em>Yield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see highwayproj.highway.impl.YieldImpl
	 * @see highwayproj.highway.impl.HighwayPackageImpl#getYield()
	 * @generated
	 */
	int YIELD = 10;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__BELONGS_TO = SIGNAL__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__NAME = SIGNAL__NAME;

	/**
	 * The number of structural features of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Highway <em>Highway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highway</em>'.
	 * @see highwayproj.highway.Highway
	 * @generated
	 */
	EClass getHighway();

	/**
	 * Returns the meta object for the containment reference list '{@link highwayproj.highway.Highway#getInitNodes <em>Init Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Nodes</em>'.
	 * @see highwayproj.highway.Highway#getInitNodes()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_InitNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link highwayproj.highway.Highway#getInitCars <em>Init Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Cars</em>'.
	 * @see highwayproj.highway.Highway#getInitCars()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_InitCars();

	/**
	 * Returns the meta object for the containment reference list '{@link highwayproj.highway.Highway#getInitSegments <em>Init Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Segments</em>'.
	 * @see highwayproj.highway.Highway#getInitSegments()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_InitSegments();

	/**
	 * Returns the meta object for the containment reference list '{@link highwayproj.highway.Highway#getInitSemaphore <em>Init Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Semaphore</em>'.
	 * @see highwayproj.highway.Highway#getInitSemaphore()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_InitSemaphore();

	/**
	 * Returns the meta object for the containment reference list '{@link highwayproj.highway.Highway#getInitSignal <em>Init Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Signal</em>'.
	 * @see highwayproj.highway.Highway#getInitSignal()
	 * @see #getHighway()
	 * @generated
	 */
	EReference getHighway_InitSignal();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see highwayproj.highway.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link highwayproj.highway.Node#getHasStarts <em>Has Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Starts</em>'.
	 * @see highwayproj.highway.Node#getHasStarts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasStarts();

	/**
	 * Returns the meta object for the reference list '{@link highwayproj.highway.Node#getHasEnds <em>Has Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Ends</em>'.
	 * @see highwayproj.highway.Node#getHasEnds()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasEnds();

	/**
	 * Returns the meta object for the reference '{@link highwayproj.highway.Node#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semaphore</em>'.
	 * @see highwayproj.highway.Node#getSemaphore()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Semaphore();

	/**
	 * Returns the meta object for the reference list '{@link highwayproj.highway.Node#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals</em>'.
	 * @see highwayproj.highway.Node#getSignals()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Signals();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see highwayproj.highway.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see highwayproj.highway.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Segment#getNumLanes <em>Num Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Lanes</em>'.
	 * @see highwayproj.highway.Segment#getNumLanes()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_NumLanes();

	/**
	 * Returns the meta object for the reference list '{@link highwayproj.highway.Segment#getHasCars <em>Has Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Cars</em>'.
	 * @see highwayproj.highway.Segment#getHasCars()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_HasCars();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Segment#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see highwayproj.highway.Segment#getLength()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Length();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see highwayproj.highway.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see highwayproj.highway.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Semaphore#getSecondsRed <em>Seconds Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Red</em>'.
	 * @see highwayproj.highway.Semaphore#getSecondsRed()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_SecondsRed();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Semaphore#getSecondsGreen <em>Seconds Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Green</em>'.
	 * @see highwayproj.highway.Semaphore#getSecondsGreen()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_SecondsGreen();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Semaphore#isCanGo <em>Can Go</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Go</em>'.
	 * @see highwayproj.highway.Semaphore#isCanGo()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_CanGo();

	/**
	 * Returns the meta object for the reference '{@link highwayproj.highway.Semaphore#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see highwayproj.highway.Semaphore#getBelongsTo()
	 * @see #getSemaphore()
	 * @generated
	 */
	EReference getSemaphore_BelongsTo();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Semaphore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see highwayproj.highway.Semaphore#getName()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_Name();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see highwayproj.highway.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link highwayproj.highway.Signal#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see highwayproj.highway.Signal#getBelongsTo()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_BelongsTo();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see highwayproj.highway.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see highwayproj.highway.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Car#getTimeIn <em>Time In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time In</em>'.
	 * @see highwayproj.highway.Car#getTimeIn()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_TimeIn();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Car#getTimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out</em>'.
	 * @see highwayproj.highway.Car#getTimeOut()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_TimeOut();

	/**
	 * Returns the meta object for the reference '{@link highwayproj.highway.Car#getIsInSegment <em>Is In Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is In Segment</em>'.
	 * @see highwayproj.highway.Car#getIsInSegment()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_IsInSegment();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor</em>'.
	 * @see highwayproj.highway.Extractor
	 * @generated
	 */
	EClass getExtractor();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Injector <em>Injector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injector</em>'.
	 * @see highwayproj.highway.Injector
	 * @generated
	 */
	EClass getInjector();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Injector#getCarsPerHour <em>Cars Per Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cars Per Hour</em>'.
	 * @see highwayproj.highway.Injector#getCarsPerHour()
	 * @see #getInjector()
	 * @generated
	 */
	EAttribute getInjector_CarsPerHour();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Speedlimit <em>Speedlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speedlimit</em>'.
	 * @see highwayproj.highway.Speedlimit
	 * @generated
	 */
	EClass getSpeedlimit();

	/**
	 * Returns the meta object for the attribute '{@link highwayproj.highway.Speedlimit#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see highwayproj.highway.Speedlimit#getSpeed()
	 * @see #getSpeedlimit()
	 * @generated
	 */
	EAttribute getSpeedlimit_Speed();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see highwayproj.highway.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link highwayproj.highway.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yield</em>'.
	 * @see highwayproj.highway.Yield
	 * @generated
	 */
	EClass getYield();

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
		 * The meta object literal for the '{@link highwayproj.highway.impl.HighwayImpl <em>Highway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.HighwayImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getHighway()
		 * @generated
		 */
		EClass HIGHWAY = eINSTANCE.getHighway();

		/**
		 * The meta object literal for the '<em><b>Init Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__INIT_NODES = eINSTANCE.getHighway_InitNodes();

		/**
		 * The meta object literal for the '<em><b>Init Cars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__INIT_CARS = eINSTANCE.getHighway_InitCars();

		/**
		 * The meta object literal for the '<em><b>Init Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__INIT_SEGMENTS = eINSTANCE.getHighway_InitSegments();

		/**
		 * The meta object literal for the '<em><b>Init Semaphore</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__INIT_SEMAPHORE = eINSTANCE.getHighway_InitSemaphore();

		/**
		 * The meta object literal for the '<em><b>Init Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHWAY__INIT_SIGNAL = eINSTANCE.getHighway_InitSignal();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.NodeImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.SegmentImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getSegment()
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
		 * The meta object literal for the '<em><b>Has Cars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__HAS_CARS = eINSTANCE.getSegment_HasCars();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__LENGTH = eINSTANCE.getSegment_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NAME = eINSTANCE.getSegment_Name();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.SemaphoreImpl <em>Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.SemaphoreImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getSemaphore()
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
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE__BELONGS_TO = eINSTANCE.getSemaphore_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__NAME = eINSTANCE.getSemaphore_Name();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.SignalImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__BELONGS_TO = eINSTANCE.getSignal_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.CarImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getCar()
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

		/**
		 * The meta object literal for the '<em><b>Is In Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__IS_IN_SEGMENT = eINSTANCE.getCar_IsInSegment();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.ExtractorImpl <em>Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.ExtractorImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getExtractor()
		 * @generated
		 */
		EClass EXTRACTOR = eINSTANCE.getExtractor();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.InjectorImpl <em>Injector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.InjectorImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getInjector()
		 * @generated
		 */
		EClass INJECTOR = eINSTANCE.getInjector();

		/**
		 * The meta object literal for the '<em><b>Cars Per Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INJECTOR__CARS_PER_HOUR = eINSTANCE.getInjector_CarsPerHour();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.SpeedlimitImpl <em>Speedlimit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.SpeedlimitImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getSpeedlimit()
		 * @generated
		 */
		EClass SPEEDLIMIT = eINSTANCE.getSpeedlimit();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEEDLIMIT__SPEED = eINSTANCE.getSpeedlimit_Speed();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.StopImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link highwayproj.highway.impl.YieldImpl <em>Yield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see highwayproj.highway.impl.YieldImpl
		 * @see highwayproj.highway.impl.HighwayPackageImpl#getYield()
		 * @generated
		 */
		EClass YIELD = eINSTANCE.getYield();

	}

} //HighwayPackage
