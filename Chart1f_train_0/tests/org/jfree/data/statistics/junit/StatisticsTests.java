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
 * --------------------
 * StatisticsTests.java
 * --------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2004 : Version 1 (DG);
 * 04-Oct-2004 : Eliminated NumberUtils usage (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.statistics.Statistics;

/**
 * Tests for the {@link Statistics} class.
 */
public class StatisticsTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StatisticsTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StatisticsTests(String name) {
        super(name);
    }

    /**
     * Some checks for the calculateMean(Number[]) and
     * calculateMean(Number[], boolean) methods.
     */

public void testCalculateMean_Collection340() { 
     boolean pass = false; 
     try { 
         Statistics.calculateMean((Collection) null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         Statistics.calculateMean((Collection) null, false); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     List values = new ArrayList(); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, true))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, false))); 
     values.add(new Double(9.0)); 
     assertEquals(9.0, Statistics.calculateMean(values), EPSILON); 
     assertEquals(9.0, Statistics.calculateMean(values, true), EPSILON); 
     assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON); 
     values.add(null); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, true))); 
     assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON); 
     values.clear(); 
     values.add(new Double(9.0)); 
     values.add(new Double(Double.NaN)); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, true))); 
     assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON); 
     values = new ArrayList(); 
     values.add(new Double(9.0)); 
     values.add(new Double(3.0)); 
     values.add(new Double(2.0)); 
     values.add(new Double(2.0)); 
     double mean = Statistics.calculateMean(values); 
     assertEquals(4.0, mean, EPSILON); 
     values.add(new Double(Double.NaN)); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
 } 


public void testCalculateMedian1341() { 
     List values = new ArrayList(); 
     values.add(new Double(1.0)); 
     double median = Statistics.calculateMedian(values); 
     assertEquals(1.0, median, 0.0000001); 
 } 


public void testCalculateMedian6342() { 
     List values = new ArrayList(); 
     values.add(new Double(7.0)); 
     values.add(new Double(2.0)); 
     values.add(new Double(3.0)); 
     values.add(new Double(5.0)); 
     values.add(new Double(4.0)); 
     values.add(new Double(6.0)); 
     values.add(new Double(1.0)); 
     double median = Statistics.calculateMedian(values, 0, 2); 
     assertEquals(3.0, median, 0.0000001); 
 } 


public void testCalculateMedian3343() { 
     List values = new ArrayList(); 
     values.add(new Double(1.0)); 
     values.add(new Double(2.0)); 
     values.add(new Double(3.0)); 
     values.add(new Double(6.0)); 
     values.add(new Double(5.0)); 
     values.add(new Double(4.0)); 
     double median = Statistics.calculateMedian(values); 
     assertEquals(3.5, median, 0.0000001); 
 } 

    

    /**
     * Some checks for the calculateMean(Collection) and
     * calculateMean(Collection, boolean) methods.
     */
    

    static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the calculateMedian(List, boolean) method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test using some real data that caused a problem at one point.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A simple test for the correlation calculation.
     */
    

    /**
     * A simple test for the correlation calculation.
     *
     * http://trochim.human.cornell.edu/kb/statcorr.htm
     */
    

    /**
     * Some checks for the getStdDev() method.
     */
    

}
