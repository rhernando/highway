/**
 */
package Highway.highway.util;

import Highway.highway.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Highway.highway.HighwayPackage
 * @generated
 */
public class HighwayValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HighwayValidator INSTANCE = new HighwayValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Highway.highway";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighwayValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HighwayPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HighwayPackage.HIGHWAY:
				return validatehighway((highway)value, diagnostics, context);
			case HighwayPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case HighwayPackage.SEGMENT:
				return validateSegment((Segment)value, diagnostics, context);
			case HighwayPackage.SEMAPHORE:
				return validateSemaphore((Semaphore)value, diagnostics, context);
			case HighwayPackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case HighwayPackage.CAR:
				return validateCar((Car)value, diagnostics, context);
			case HighwayPackage.EXTRACTOR:
				return validateExtractor((Extractor)value, diagnostics, context);
			case HighwayPackage.INJECTOR:
				return validateInjector((Injector)value, diagnostics, context);
			case HighwayPackage.SPEEDLIMIT:
				return validateSpeedlimit((Speedlimit)value, diagnostics, context);
			case HighwayPackage.STOP:
				return validateStop((Stop)value, diagnostics, context);
			case HighwayPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatehighway(highway highway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(highway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NullName(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueName(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NullName constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__NULL_NAME__EEXPRESSION = "name <> null";

	/**
	 * Validates the NullName constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_NullName(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NullName",
				 NODE__NULL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueName constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__UNIQUE_NAME__EEXPRESSION = "highway.initNodes->isUnique(name)";

	/**
	 * Validates the UniqueName constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UniqueName(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueName",
				 NODE__UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(segment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegment_NullName(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegment_UniqueName(segment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NullName constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEGMENT__NULL_NAME__EEXPRESSION = "name <> null";

	/**
	 * Validates the NullName constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_NullName(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.SEGMENT,
				 segment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NullName",
				 SEGMENT__NULL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueName constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEGMENT__UNIQUE_NAME__EEXPRESSION = "highway.initNodes->isUnique(name)";

	/**
	 * Validates the UniqueName constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_UniqueName(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.SEGMENT,
				 segment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueName",
				 SEGMENT__UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphore(Semaphore semaphore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semaphore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCar(Car car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(car, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtractor(Extractor extractor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extractor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NullName(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueName(extractor, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtractor_NoEnds(extractor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoEnds constraint of '<em>Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTRACTOR__NO_ENDS__EEXPRESSION = "hasEnds->isEmpty()";

	/**
	 * Validates the NoEnds constraint of '<em>Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtractor_NoEnds(Extractor extractor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.EXTRACTOR,
				 extractor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoEnds",
				 EXTRACTOR__NO_ENDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjector(Injector injector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(injector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NullName(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueName(injector, diagnostics, context);
		if (result || diagnostics != null) result &= validateInjector_NoStart(injector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoStart constraint of '<em>Injector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INJECTOR__NO_START__EEXPRESSION = "hasStarts->isEmpty()";

	/**
	 * Validates the NoStart constraint of '<em>Injector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjector_NoStart(Injector injector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HighwayPackage.Literals.INJECTOR,
				 injector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoStart",
				 INJECTOR__NO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedlimit(Speedlimit speedlimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speedlimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYield(Yield yield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yield, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HighwayValidator
