package com.mf.presales_shipit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ShippingSystemTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ShippingSystemTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ShippingSystemTest.class);
    }


    public void testShipItRouteOptimization1() {
        assertTrue(true);
    }

    public void testShipItRightHandTurnUnavailable() {
        assertTrue(false);
    }

    public void testShipItScanner() {
        assertTrue(false);
    }

    public void testShipItDelivered() {
        assertTrue(true);
    }
    
    public void testShipItDeliveryCancel() {
        assertTrue(false);
    }
    
    public void testShipItItemDamage() {
        assertTrue(true);
    }
    
    public void testShipItItemReturnPickUp() {
        assertTrue(true);
    }
    
    public void testShipItStolenItem() {
        assertTrue(true);
    }
}
