/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
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
 * ------------------------------------
 * TimePeriodValuesCollectionTests.java
 * ------------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 11-Mar-2005 : Version 1 (DG);
 * 08-Mar-2007 : Added testGetSeries() (DG);
 * 11-Jun-2007 : Added tests for getDomainBounds() (DG);
 * 20-Jun-2007 : Updated for deprecated method removals (DG);
 * 07-Apr-2008 : Added more checks to 
 *               testGetDomainBoundsWithInterval() (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.time.Day;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;

/**
 * Some tests for the {@link TimePeriodValuesCollection} class.
 */
public class TimePeriodValuesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimePeriodValuesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimePeriodValuesCollectionTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * A test for bug report 1161340.  I wasn't able to reproduce the problem
     * with this test.
     */

public void testGetDomainBoundsWithoutInterval153() { 
     TimePeriodValuesCollection dataset = new TimePeriodValuesCollection(); 
     Range r = dataset.getDomainBounds(false); 
     assertNull(r); 
     TimePeriodValues s1 = new TimePeriodValues("S1"); 
     s1.add(new SimpleTimePeriod(1000L, 2000L), 1.0); 
     dataset.addSeries(s1); 
     r = dataset.getDomainBounds(false); 
     assertEquals(1500.0, r.getLowerBound(), EPSILON); 
     assertEquals(1500.0, r.getUpperBound(), EPSILON); 
     s1.add(new SimpleTimePeriod(1500L, 3000L), 2.0); 
     r = dataset.getDomainBounds(false); 
     assertEquals(1500.0, r.getLowerBound(), EPSILON); 
     assertEquals(2250.0, r.getUpperBound(), EPSILON); 
 } 


public void testEquals426() { 
     TimePeriodValuesCollection c1 = new TimePeriodValuesCollection(); 
     TimePeriodValuesCollection c2 = new TimePeriodValuesCollection(); 
     assertTrue(c1.equals(c2)); 
     c1.setXPosition(TimePeriodAnchor.END); 
     assertFalse(c1.equals(c2)); 
     c2.setXPosition(TimePeriodAnchor.END); 
     assertTrue(c1.equals(c2)); 
     TimePeriodValues v1 = new TimePeriodValues("Test"); 
     TimePeriodValues v2 = new TimePeriodValues("Test"); 
     c1.addSeries(v1); 
     assertFalse(c1.equals(c2)); 
     c2.addSeries(v2); 
     assertTrue(c1.equals(c2)); 
 } 


public void test1161340427() { 
     TimePeriodValuesCollection dataset = new TimePeriodValuesCollection(); 
     TimePeriodValues v1 = new TimePeriodValues("V1"); 
     v1.add(new Day(11, 3, 2005), 1.2); 
     v1.add(new Day(12, 3, 2005), 3.4); 
     dataset.addSeries(v1); 
     assertEquals(1, dataset.getSeriesCount()); 
     dataset.removeSeries(v1); 
     assertEquals(0, dataset.getSeriesCount()); 
     TimePeriodValues v2 = new TimePeriodValues("V2"); 
     v1.add(new Day(5, 3, 2005), 1.2); 
     v1.add(new Day(6, 3, 2005), 3.4); 
     dataset.addSeries(v2); 
     assertEquals(1, dataset.getSeriesCount()); 
 } 


public void testGetDomainBoundsWithInterval428() { 
     TimePeriodValuesCollection dataset = new TimePeriodValuesCollection(); 
     Range r = dataset.getDomainBounds(true); 
     assertNull(r); 
     TimePeriodValues s1 = new TimePeriodValues("S1"); 
     s1.add(new SimpleTimePeriod(1000L, 2000L), 1.0); 
     dataset.addSeries(s1); 
     r = dataset.getDomainBounds(true); 
     assertEquals(1000.0, r.getLowerBound(), EPSILON); 
     assertEquals(2000.0, r.getUpperBound(), EPSILON); 
     s1.add(new SimpleTimePeriod(1500L, 3000L), 2.0); 
     r = dataset.getDomainBounds(true); 
     assertEquals(1000.0, r.getLowerBound(), EPSILON); 
     assertEquals(3000.0, r.getUpperBound(), EPSILON); 
     s1.add(new SimpleTimePeriod(6000L, 7000L), 1.5); 
     r = dataset.getDomainBounds(true); 
     assertEquals(1000.0, r.getLowerBound(), EPSILON); 
     assertEquals(7000.0, r.getUpperBound(), EPSILON); 
     s1.add(new SimpleTimePeriod(4000L, 5000L), 1.4); 
     r = dataset.getDomainBounds(true); 
     assertEquals(1000.0, r.getLowerBound(), EPSILON); 
     assertEquals(7000.0, r.getUpperBound(), EPSILON); 
 } 

    
    
    /**
     * Tests the equals() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some basic checks for the getSeries() method.
     */
    
    
    private static final double EPSILON = 0.0000000001;
    
    /**
     * Some checks for the getDomainBounds() method.
     */
    

    /**
     * Some more checks for the getDomainBounds() method.
     * 
     * @see #testGetDomainBoundsWithoutInterval()
     */
    
}
