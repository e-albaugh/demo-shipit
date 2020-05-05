package com.mf.presales_shipit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SeleniumRegressionTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SeleniumRegressionTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SeleniumRegressionTest.class);
    }


    public void testShipit1() {
        assertTrue(true);
    }

    public void testShipit2() {
        assertTrue(true);
    }

    public void testShipit3() {
        assertTrue(true);
    }

    public void testShipit4() {
        assertTrue(true);
    }
}
