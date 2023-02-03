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
 * -----------------------------------
 * GroupedStackedBarRendererTests.java
 * -----------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Jul-2004 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link GroupedStackedBarRenderer} class.
 */
public class GroupedStackedBarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(GroupedStackedBarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public GroupedStackedBarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testDrawWithNullInfo198() { 
     boolean success = false; 
     try { 
         DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
         dataset.addValue(1.0, "S1", "C1"); 
         dataset.addValue(2.0, "S1", "C2"); 
         dataset.addValue(3.0, "S2", "C1"); 
         dataset.addValue(4.0, "S2", "C2"); 
         GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer(); 
         CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), renderer); 
         JFreeChart chart = new JFreeChart(plot); 
         chart.createBufferedImage(300, 200, null); 
         success = true; 
     } catch (NullPointerException e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testCloning200() { 
     GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer(); 
     GroupedStackedBarRenderer r2 = null; 
     try { 
         r2 = (GroupedStackedBarRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 } 


public void testFindRangeBounds458() { 
     GroupedStackedBarRenderer r = new GroupedStackedBarRenderer(); 
     assertNull(r.findRangeBounds(null)); 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     assertNull(r.findRangeBounds(dataset)); 
     dataset.addValue(1.0, "R1", "C1"); 
     assertEquals(new Range(0.0, 1.0), r.findRangeBounds(dataset)); 
     dataset.addValue(-2.0, "R1", "C2"); 
     assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset)); 
     dataset.addValue(null, "R1", "C3"); 
     assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset)); 
     KeyToGroupMap m = new KeyToGroupMap("G1"); 
     m.mapKeyToGroup("R1", "G1"); 
     m.mapKeyToGroup("R2", "G1"); 
     m.mapKeyToGroup("R3", "G2"); 
     r.setSeriesToGroupMap(m); 
     dataset.addValue(0.5, "R3", "C1"); 
     assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset)); 
     dataset.addValue(5.0, "R3", "C2"); 
     assertEquals(new Range(-2.0, 5.0), r.findRangeBounds(dataset)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * Some checks for the findRangeBounds() method.
     */
    

}
