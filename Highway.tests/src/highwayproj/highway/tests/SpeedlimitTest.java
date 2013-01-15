/**
 */
package highwayproj.highway.tests;

import highwayproj.highway.HighwayFactory;
import highwayproj.highway.Speedlimit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Speedlimit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeedlimitTest extends SignalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpeedlimitTest.class);
	}

	/**
	 * Constructs a new Speedlimit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedlimitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Speedlimit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Speedlimit getFixture() {
		return (Speedlimit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HighwayFactory.eINSTANCE.createSpeedlimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SpeedlimitTest
