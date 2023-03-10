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
 * -----------------------
 * XYDotRendererTests.java
 * -----------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 09-Nov-2007 : Updated testEquals() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.geom.Rectangle2D;
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
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYDotRenderer} class.
 */
public class XYDotRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYDotRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYDotRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testGetLegendItemSeriesIndex319() { 
     XYSeriesCollection d1 = new XYSeriesCollection(); 
     XYSeries s1 = new XYSeries("S1"); 
     s1.add(1.0, 1.1); 
     XYSeries s2 = new XYSeries("S2"); 
     s2.add(1.0, 1.1); 
     d1.addSeries(s1); 
     d1.addSeries(s2); 
     XYSeriesCollection d2 = new XYSeriesCollection(); 
     XYSeries s3 = new XYSeries("S3"); 
     s3.add(1.0, 1.1); 
     XYSeries s4 = new XYSeries("S4"); 
     s4.add(1.0, 1.1); 
     XYSeries s5 = new XYSeries("S5"); 
     s5.add(1.0, 1.1); 
     d2.addSeries(s3); 
     d2.addSeries(s4); 
     d2.addSeries(s5); 
     XYDotRenderer r = new XYDotRenderer(); 
     XYPlot plot = new XYPlot(d1, new NumberAxis("x"), new NumberAxis("y"), r); 
     plot.setDataset(1, d2); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(1, 2); 
     assertEquals("S5", li.getLabel()); 
     assertEquals(1, li.getDatasetIndex()); 
     assertEquals(2, li.getSeriesIndex()); 
 } 


public void testEquals320() { 
     XYDotRenderer r1 = new XYDotRenderer(); 
     XYDotRenderer r2 = new XYDotRenderer(); 
     assertEquals(r1, r2); 
     r1.setDotWidth(11); 
     assertFalse(r1.equals(r2)); 
     r2.setDotWidth(11); 
     assertTrue(r1.equals(r2)); 
     r1.setDotHeight(12); 
     assertFalse(r1.equals(r2)); 
     r2.setDotHeight(12); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(r1.equals(r2)); 
 } 


public void testHashcode321() { 
     XYDotRenderer r1 = new XYDotRenderer(); 
     XYDotRenderer r2 = new XYDotRenderer(); 
     assertTrue(r1.equals(r2)); 
     int h1 = r1.hashCode(); 
     int h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
     r1.setDotHeight(12); 
     r2.setDotHeight(12); 
     assertTrue(r1.equals(r2)); 
     h1 = r1.hashCode(); 
     h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testCloning322() { 
     XYDotRenderer r1 = new XYDotRenderer(); 
     XYDotRenderer r2 = null; 
     try { 
         r2 = (XYDotRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 } 


public void testSerialization323() { 
     XYDotRenderer r1 = new XYDotRenderer(); 
     XYDotRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (XYDotRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
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
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
