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
 * --------------------------------
 * StandardXYItemRendererTests.java
 * --------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 08-Oct-2004 : Strengthened test for equals() method (DG);
 * 14-Mar-2007 : Added new checks in testEquals() and testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 08-Jun-2007 : Added testNoDisplayedItem() (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.junit.TestUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.UnitType;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link StandardXYItemRenderer} class.
 */
public class StandardXYItemRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardXYItemRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardXYItemRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testNoDisplayedItem115() { 
     XYSeriesCollection dataset = new XYSeriesCollection(); 
     XYSeries s1 = new XYSeries("S1"); 
     s1.add(10.0, 10.0); 
     dataset.addSeries(s1); 
     JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRenderer(new StandardXYItemRenderer()); 
     NumberAxis xAxis = (NumberAxis) plot.getDomainAxis(); 
     xAxis.setRange(0.0, 5.0); 
     NumberAxis yAxis = (NumberAxis) plot.getRangeAxis(); 
     yAxis.setRange(0.0, 5.0); 
     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
     Graphics2D g2 = image.createGraphics(); 
     ChartRenderingInfo info = new ChartRenderingInfo(); 
     chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, info); 
     g2.dispose(); 
     EntityCollection ec = info.getEntityCollection(); 
     assertFalse(TestUtilities.containsInstanceOf(ec.getEntities(), XYItemEntity.class)); 
 } 


public void testCloning603() { 
     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); 
     Rectangle2D rect1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0); 
     r1.setLegendLine(rect1); 
     StandardXYItemRenderer r2 = null; 
     try { 
         r2 = (StandardXYItemRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     rect1.setRect(4.0, 3.0, 2.0, 1.0); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendLine(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesShapesFilled(1, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesShapesFilled(1, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
 } 


public void testEquals604() { 
     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); 
     StandardXYItemRenderer r2 = new StandardXYItemRenderer(); 
     assertEquals(r1, r2); 
     r1.setBaseShapesVisible(true); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseShapesVisible(true); 
     assertTrue(r1.equals(r2)); 
     r1.setPlotLines(false); 
     assertFalse(r1.equals(r2)); 
     r2.setPlotLines(false); 
     assertTrue(r1.equals(r2)); 
     r1.setPlotImages(true); 
     assertFalse(r1.equals(r2)); 
     r2.setPlotImages(true); 
     assertTrue(r1.equals(r2)); 
     r1.setPlotDiscontinuous(true); 
     assertFalse(r1.equals(r2)); 
     r2.setPlotDiscontinuous(true); 
     assertTrue(r1.equals(r2)); 
     r1.setGapThresholdType(UnitType.ABSOLUTE); 
     assertFalse(r1.equals(r2)); 
     r2.setGapThresholdType(UnitType.ABSOLUTE); 
     assertTrue(r1.equals(r2)); 
     r1.setGapThreshold(1.23); 
     assertFalse(r1.equals(r2)); 
     r2.setGapThreshold(1.23); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesShapesFilled(1, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesShapesFilled(1, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseShapesFilled(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseShapesFilled(false); 
     assertTrue(r1.equals(r2)); 
     r1.setDrawSeriesLineAsPath(true); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawSeriesLineAsPath(true); 
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
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

    /**
     * A check to ensure that an item that falls outside the plot's data area
     * does NOT generate an item entity.
     */
    

}
