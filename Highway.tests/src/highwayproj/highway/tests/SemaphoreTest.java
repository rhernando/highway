/**
 */
package highwayproj.highway.tests;

import highwayproj.highway.HighwayFactory;
import highwayproj.highway.Semaphore;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemaphoreTest extends TestCase {

	/**
	 * The fixture for this Semaphore test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semaphore fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemaphoreTest.class);
	}

	/**
	 * Constructs a new Semaphore test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semaphore test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semaphore fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semaphore test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semaphore getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HighwayFactory.eINSTANCE.createSemaphore());
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

} //SemaphoreTest
