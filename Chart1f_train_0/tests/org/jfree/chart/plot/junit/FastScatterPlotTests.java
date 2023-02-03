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
 * -------------------------
 * FastScatterPlotTests.java
 * -------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 29-Jan-2009 : Updated testEquals() (DG);
 * 26-Mar-2009 : Updated testEquals() for new panning fields (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.FastScatterPlot;

/**
 * Tests for the {@link FastScatterPlot} class.
 */
public class FastScatterPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(FastScatterPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public FastScatterPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */

public void testEquals2185() { 
     FastScatterPlot plot1 = new FastScatterPlot(); 
     FastScatterPlot plot2 = new FastScatterPlot(); 
     assertTrue(plot1.equals(plot2)); 
     assertTrue(plot2.equals(plot1)); 
     float[][] a = new float[2][]; 
     float[][] b = new float[2][]; 
     plot1.setData(a); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setData(b); 
     assertTrue(plot1.equals(plot2)); 
     a[0] = new float[6]; 
     assertFalse(plot1.equals(plot2)); 
     b[0] = new float[6]; 
     assertTrue(plot1.equals(plot2)); 
     a[0][0] = 1.0f; 
     assertFalse(plot1.equals(plot2)); 
     b[0][0] = 1.0f; 
     assertTrue(plot1.equals(plot2)); 
     a[0][1] = Float.NaN; 
     assertFalse(plot1.equals(plot2)); 
     b[0][1] = Float.NaN; 
     assertTrue(plot1.equals(plot2)); 
     a[0][2] = Float.POSITIVE_INFINITY; 
     assertFalse(plot1.equals(plot2)); 
     b[0][2] = Float.POSITIVE_INFINITY; 
     assertTrue(plot1.equals(plot2)); 
     a[0][3] = Float.NEGATIVE_INFINITY; 
     assertFalse(plot1.equals(plot2)); 
     b[0][3] = Float.NEGATIVE_INFINITY; 
     assertTrue(plot1.equals(plot2)); 
 } 


public void testDrawWithNullInfo212() { 
     boolean success = false; 
     try { 
         float[][] data = createData(); 
         ValueAxis domainAxis = new NumberAxis("X"); 
         ValueAxis rangeAxis = new NumberAxis("Y"); 
         FastScatterPlot plot = new FastScatterPlot(data, domainAxis, rangeAxis); 
         JFreeChart chart = new JFreeChart(plot); 
         chart.createBufferedImage(300, 200, null); 
         success = true; 
     } catch (NullPointerException e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testSerialization592() { 
     float[][] data = createData(); 
     ValueAxis domainAxis = new NumberAxis("X"); 
     ValueAxis rangeAxis = new NumberAxis("Y"); 
     FastScatterPlot p1 = new FastScatterPlot(data, domainAxis, rangeAxis); 
     FastScatterPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (FastScatterPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 } 

    

    /**
     * Some tests for the data array equality in the equals() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown.
     */
    

    /**
     * Populates the data array with random values.
     *
     * @return Random data.
     */
    private float[][] createData() {
        float[][] result = new float[2][1000];
        for (int i = 0; i < result[0].length; i++) {
            float x = (float) i + 100;
            result[0][i] = x;
            result[1][i] = 100 + (float) Math.random() * 1000;
        }
        return result;
    }

}
