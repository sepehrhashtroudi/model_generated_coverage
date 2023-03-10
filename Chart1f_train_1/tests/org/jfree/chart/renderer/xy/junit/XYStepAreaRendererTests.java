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
 * ----------------------------
 * XYStepAreaRendererTests.java
 * ----------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   Matthias Rose;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 26-Sep-2003 : copied XYStepRendererTests.java and used for
 *               testing XYStepAreaRenderer (MR);
 * 14-Feb-2007 : Extended testEquals() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 * Tests for the {@link XYStepAreaRenderer} class.
 */
public class XYStepAreaRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYStepAreaRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYStepAreaRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testCloning173() { 
     XYStepAreaRenderer r1 = new XYStepAreaRenderer(); 
     XYStepAreaRenderer r2 = null; 
     try { 
         r2 = (XYStepAreaRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 } 


public void testDrawWithNullInfo174() { 
     boolean success = false; 
     try { 
         DefaultTableXYDataset dataset = new DefaultTableXYDataset(); 
         XYSeries s1 = new XYSeries("Series 1", true, false); 
         s1.add(5.0, 5.0); 
         s1.add(10.0, 15.5); 
         s1.add(15.0, 9.5); 
         s1.add(20.0, 7.5); 
         dataset.addSeries(s1); 
         XYSeries s2 = new XYSeries("Series 2", true, false); 
         s2.add(5.0, 5.0); 
         s2.add(10.0, 15.5); 
         s2.add(15.0, 9.5); 
         s2.add(20.0, 3.5); 
         dataset.addSeries(s2); 
         XYPlot plot = new XYPlot(dataset, new NumberAxis("X"), new NumberAxis("Y"), new XYStepAreaRenderer()); 
         JFreeChart chart = new JFreeChart(plot); 
         chart.createBufferedImage(300, 200, null); 
         success = true; 
     } catch (NullPointerException e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testEquals175() { 
     XYStepAreaRenderer r1 = new XYStepAreaRenderer(); 
     XYStepAreaRenderer r2 = new XYStepAreaRenderer(); 
     assertEquals(r1, r2); 
     r1.setOutline(true); 
     assertFalse(r1.equals(r2)); 
     r2.setOutline(true); 
     assertTrue(r1.equals(r2)); 
     r1.setShapesVisible(true); 
     assertFalse(r1.equals(r2)); 
     r2.setShapesVisible(true); 
     assertTrue(r1.equals(r2)); 
     r1.setShapesFilled(true); 
     assertFalse(r1.equals(r2)); 
     r2.setShapesFilled(true); 
     assertTrue(r1.equals(r2)); 
     r1.setPlotArea(false); 
     assertFalse(r1.equals(r2)); 
     r2.setPlotArea(false); 
     assertTrue(r1.equals(r2)); 
     r1.setRangeBase(-1.0); 
     assertFalse(r1.equals(r2)); 
     r2.setRangeBase(-1.0); 
     assertTrue(r1.equals(r2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

}
