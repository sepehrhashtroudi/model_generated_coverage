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
 * -----------------------
 * DataUtilitiesTests.java
 * -----------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Mar-2005 : Version 1 (DG);
 * 28-Jan-2009 : Added tests for equal(double[][], double[][]) method (DG);
 * 28-Jan-2009 : Added tests for clone(double[][]) (DG);
 * 04-Feb-2009 : Added tests for new calculateColumnTotal/RowTotal methods (DG);
 *
 */

package org.jfree.data.junit;

import junit.framework.Test;
import junit.framework.TestCase;

import junit.framework.TestSuite;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues2D;

/**
 * Some tests for the {@link DataUtilities} class.
 */
public class DataUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DataUtilitiesTests.class);
    }

    /**
     * Tests the createNumberArray2D() method.
     */

public void testEqual657() { 
     assertTrue(DataUtilities.equal(null, null)); 
     double[][] a = new double[5][]; 
     double[][] b = new double[5][]; 
     assertTrue(DataUtilities.equal(a, b)); 
     a = new double[4][]; 
     assertFalse(DataUtilities.equal(a, b)); 
     b = new double[4][]; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0] = new double[6]; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0] = new double[6]; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0][0] = 1.0; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][0] = 1.0; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0][1] = Double.NaN; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][1] = Double.NaN; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0][2] = Double.NEGATIVE_INFINITY; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][2] = Double.NEGATIVE_INFINITY; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0][3] = Double.POSITIVE_INFINITY; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][3] = Double.POSITIVE_INFINITY; 
     assertTrue(DataUtilities.equal(a, b)); 
     a[0][4] = Double.POSITIVE_INFINITY; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][4] = Double.NEGATIVE_INFINITY; 
     assertFalse(DataUtilities.equal(a, b)); 
     b[0][4] = Double.POSITIVE_INFINITY; 
     assertTrue(DataUtilities.equal(a, b)); 
 } 


public void testCalculateColumnTotal658() { 
     DefaultKeyedValues2D table = new DefaultKeyedValues2D(); 
     table.addValue(new Double(1.0), "R0", "C0"); 
     table.addValue(new Double(2.0), "R0", "C1"); 
     table.addValue(new Double(3.0), "R1", "C0"); 
     table.addValue(new Double(4.0), "R1", "C1"); 
     assertEquals(4.0, DataUtilities.calculateColumnTotal(table, 0), EPSILON); 
     assertEquals(6.0, DataUtilities.calculateColumnTotal(table, 1), EPSILON); 
     table.setValue(null, "R1", "C1"); 
     assertEquals(2.0, DataUtilities.calculateColumnTotal(table, 1), EPSILON); 
 } 


public void testCreateNumberArray2D659() { 
     double[][] d = new double[2][]; 
     d[0] = new double[] { 1.1, 2.2, 3.3, 4.4 }; 
     d[1] = new double[] { 1.1, 2.2, 3.3, 4.4, 5.5 }; 
     Number[][] n = DataUtilities.createNumberArray2D(d); 
     assertEquals(2, n.length); 
     assertEquals(4, n[0].length); 
     assertEquals(5, n[1].length); 
 } 

    

    private static final double EPSILON = 0.000000001;

    /**
     * Some checks for the calculateColumnTotal() method.
     */
    

    /**
     * Some checks for the calculateColumnTotal() method.
     */
    

    /**
     * Some checks for the calculateRowTotal() method.
     */
    

    /**
     * Some checks for the calculateRowTotal() method.
     */
    

    /**
     * Some tests for the equal(double[][], double[][]) method.
     */
    

    /**
     * Some tests for the clone() method.
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
