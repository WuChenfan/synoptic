package tests;

import org.junit.Before;
import org.junit.rules.TestName;

import synoptic.main.ParseException;
import synoptic.tests.SynopticLibTest;

/**
 * Base class for all Synoptic unit tests. Performs common set-up and tear-down
 * tasks, and defines methods used by multiple tests.
 * 
 * @author ivan
 */
public class InvDFAMinimizationTest extends SynopticLibTest {

    static {
        // Set up static SynopticLib state.
        SynopticLibTest.initialize("InvDFAMinimization");
    }

    /**
     * Sets up state that is necessary for running tests.
     * 
     * @throws ParseException
     */
    @Before
    public void setUp() throws ParseException {
        // Set up SynopticLib state.
        super.setUp();
    }

    // //////////////////////////////////////////////
    // Common routines to simplify testing.
    // //////////////////////////////////////////////

    /**
     * Exposes SynopticLibTest's testName to derived classes.
     */
    protected static TestName getTestName() {
        return SynopticLibTest.testName;
    }
}