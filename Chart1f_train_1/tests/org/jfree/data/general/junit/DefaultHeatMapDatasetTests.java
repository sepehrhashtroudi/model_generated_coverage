/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * -------------------------------
 * DefaultHeatMapDatasetTests.java
 * -------------------------------
 * (C) Copyright 2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 28-Jan-2009 : Version 1 (DG);
 *
 */

package org.jfree.data.general.junit;

import org.jfree.data.general.DefaultHeatMapDataset;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jfree.data.event.DatasetChangeEvent;
import org.jfree.data.event.DatasetChangeListener;

/**
 * Somes tests for the {@link DefaultHeatMapDataset} class.
 *
 * @since 1.0.13
 */
public class DefaultHeatMapDatasetTests extends TestCase
        implements DatasetChangeListener {

    /** The last event received. */
    private DatasetChangeEvent lastEvent;

    /**
     * Records the last event.
     *
     * @param event  the last event.
     */
    public void datasetChanged(DatasetChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultHeatMapDatasetTests.class);
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultHeatMapDatasetTests(String name) {
        super(name);
    }

    /**
     * Some general tests.
     */

public void testGeneral253() { 
     DefaultHeatMapDataset d = new DefaultHeatMapDataset(10, 5, 0.0, 9.0, 0.0, 5.0); 
     assertEquals(10, d.getXSampleCount()); 
     assertEquals(5, d.getYSampleCount()); 
     assertEquals(0.0, d.getMinimumXValue(), EPSILON); 
     assertEquals(9.0, d.getMaximumXValue(), EPSILON); 
     assertEquals(0.0, d.getMinimumYValue(), EPSILON); 
     assertEquals(5.0, d.getMaximumYValue(), EPSILON); 
     assertEquals(0.0, d.getZValue(0, 0), EPSILON); 
     d.addChangeListener(this); 
     d.setZValue(0, 0, 1.0, false); 
     assertEquals(1.0, d.getZValue(0, 0), EPSILON); 
     assertNull(this.lastEvent); 
     d.setZValue(1, 2, 2.0); 
     assertEquals(2.0, d.getZValue(1, 2), EPSILON); 
     assertNotNull(this.lastEvent); 
 } 


public void testEquals254() { 
     DefaultHeatMapDataset d1 = new DefaultHeatMapDataset(5, 10, 1.0, 2.0, 3.0, 4.0); 
     DefaultHeatMapDataset d2 = new DefaultHeatMapDataset(5, 10, 1.0, 2.0, 3.0, 4.0); 
     assertEquals(d1, d2); 
     d1 = new DefaultHeatMapDataset(6, 10, 1.0, 2.0, 3.0, 4.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 10, 1.0, 2.0, 3.0, 4.0); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultHeatMapDataset(6, 11, 1.0, 2.0, 3.0, 4.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 11, 1.0, 2.0, 3.0, 4.0); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultHeatMapDataset(6, 11, 2.0, 2.0, 3.0, 4.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 11, 2.0, 2.0, 3.0, 4.0); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 3.0, 4.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 3.0, 4.0); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 4.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 4.0); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 5.0); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 5.0); 
     assertTrue(d1.equals(d2)); 
     d1.setZValue(1, 2, 3.0); 
     assertFalse(d1.equals(d2)); 
     d2.setZValue(1, 2, 3.0); 
     assertTrue(d1.equals(d2)); 
     d1.setZValue(0, 0, Double.NEGATIVE_INFINITY); 
     assertFalse(d1.equals(d2)); 
     d2.setZValue(0, 0, Double.NEGATIVE_INFINITY); 
     assertTrue(d1.equals(d2)); 
     d1.setZValue(0, 1, Double.POSITIVE_INFINITY); 
     assertFalse(d1.equals(d2)); 
     d2.setZValue(0, 1, Double.POSITIVE_INFINITY); 
     assertTrue(d1.equals(d2)); 
     d1.setZValue(0, 2, Double.NaN); 
     assertFalse(d1.equals(d2)); 
     d2.setZValue(0, 2, Double.NaN); 
     assertTrue(d1.equals(d2)); 
 } 

    

    /**
     * Some tests for the equals() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Runs the test suite using JUnit's text-based runner.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
