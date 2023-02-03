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
 * XYBarRendererTests.java
 * -----------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 09-Feb-2007 : Added to testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 * 19-Jun-2008 : Added testFindRangeBounds() (DG);
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

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.GradientXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYBarRenderer} class.
 */
public class XYBarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYBarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYBarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testGetLegendItemSeriesIndex324() { 
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
     XYBarRenderer r = new XYBarRenderer(); 
     XYPlot plot = new XYPlot(new XYBarDataset(d1, 1.0), new NumberAxis("x"), new NumberAxis("y"), r); 
     plot.setDataset(1, new XYBarDataset(d2, 2.0)); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(1, 2); 
     assertEquals("S5", li.getLabel()); 
     assertEquals(1, li.getDatasetIndex()); 
     assertEquals(2, li.getSeriesIndex()); 
 } 


public void testEquals329() { 
     XYBarRenderer r1 = new XYBarRenderer(); 
     XYBarRenderer r2 = new XYBarRenderer(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setBase(1.0); 
     assertFalse(r1.equals(r2)); 
     r2.setBase(1.0); 
     assertTrue(r1.equals(r2)); 
     r1.setUseYInterval(!r1.getUseYInterval()); 
     assertFalse(r1.equals(r2)); 
     r2.setUseYInterval(!r2.getUseYInterval()); 
     assertTrue(r1.equals(r2)); 
     r1.setMargin(0.10); 
     assertFalse(r1.equals(r2)); 
     r2.setMargin(0.10); 
     assertTrue(r1.equals(r2)); 
     r1.setDrawBarOutline(!r1.isDrawBarOutline()); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawBarOutline(!r2.isDrawBarOutline()); 
     assertTrue(r1.equals(r2)); 
     r1.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.CENTER_HORIZONTAL)); 
     assertFalse(r1.equals(r2)); 
     r2.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.CENTER_HORIZONTAL)); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendBar(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendBar(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(r1.equals(r2)); 
     r1.setPositiveItemLabelPositionFallback(new ItemLabelPosition()); 
     assertFalse(r1.equals(r2)); 
     r2.setPositiveItemLabelPositionFallback(new ItemLabelPosition()); 
     assertTrue(r1.equals(r2)); 
     r1.setNegativeItemLabelPositionFallback(new ItemLabelPosition()); 
     assertFalse(r1.equals(r2)); 
     r2.setNegativeItemLabelPositionFallback(new ItemLabelPosition()); 
     assertTrue(r1.equals(r2)); 
     r1.setBarPainter(new GradientXYBarPainter(0.11, 0.22, 0.33)); 
     assertFalse(r1.equals(r2)); 
     r2.setBarPainter(new GradientXYBarPainter(0.11, 0.22, 0.33)); 
     assertTrue(r1.equals(r2)); 
     r1.setShadowVisible(false); 
     assertFalse(r1.equals(r2)); 
     r2.setShadowVisible(false); 
     assertTrue(r1.equals(r2)); 
     r1.setShadowXOffset(3.3); 
     assertFalse(r1.equals(r2)); 
     r2.setShadowXOffset(3.3); 
     assertTrue(r1.equals(r2)); 
     r1.setShadowYOffset(3.3); 
     assertFalse(r1.equals(r2)); 
     r2.setShadowYOffset(3.3); 
     assertTrue(r1.equals(r2)); 
 } 


public void testFindDomainBounds331() { 
     XYSeriesCollection dataset = RendererXYPackageTests.createTestXYSeriesCollection(); 
     JFreeChart chart = ChartFactory.createXYBarChart("Test Chart", "X", false, "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis(); 
     domainAxis.setAutoRangeIncludesZero(false); 
     Range bounds = domainAxis.getRange(); 
     assertFalse(bounds.contains(0.3)); 
     assertTrue(bounds.contains(0.5)); 
     assertTrue(bounds.contains(2.5)); 
     assertFalse(bounds.contains(2.8)); 
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
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check that the renderer is calculating the domain bounds correctly.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * A simple test for the findRangeBounds() method.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    


}
