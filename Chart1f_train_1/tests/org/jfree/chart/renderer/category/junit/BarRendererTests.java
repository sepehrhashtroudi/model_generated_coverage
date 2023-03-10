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
 * ---------------------
 * BarRendererTests.java
 * ---------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 19-Aug-2003 : Renamed HorizontalBarRendererTests --> BarRendererTests (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 18-May-2005 : Added field to equals() test (DG);
 * 22-Sep-2005 : Renamed getMaxBarWidth() --> getMaximumBarWidth() (DG);
 * 11-May-2007 : Added testGetLegendItem() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 * 25-Nov-2008 : Added testFindRangeBounds (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.awt.Color;
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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.GradientBarPainter;
import org.jfree.chart.renderer.junit.RendererChangeDetector;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link BarRenderer} class.
 */
public class BarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testGetLegendItem288() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(21.0, "R1", "C1"); 
     BarRenderer r = new BarRenderer(); 
     CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("x"), new NumberAxis("y"), r); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(0, 0); 
     assertNotNull(li); 
     r.setSeriesVisibleInLegend(0, Boolean.FALSE); 
     li = r.getLegendItem(0, 0); 
     assertNull(li); 
 } 


public void testEquals302() { 
     BarRenderer r1 = new BarRenderer(); 
     BarRenderer r2 = new BarRenderer(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setBase(0.123); 
     assertFalse(r1.equals(r2)); 
     r2.setBase(0.123); 
     assertTrue(r1.equals(r2)); 
     r1.setItemMargin(0.22); 
     assertFalse(r1.equals(r2)); 
     r2.setItemMargin(0.22); 
     assertTrue(r1.equals(r2)); 
     r1.setDrawBarOutline(!r1.isDrawBarOutline()); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawBarOutline(!r2.isDrawBarOutline()); 
     assertTrue(r1.equals(r2)); 
     r1.setMaximumBarWidth(0.11); 
     assertFalse(r1.equals(r2)); 
     r2.setMaximumBarWidth(0.11); 
     assertTrue(r1.equals(r2)); 
     r1.setMinimumBarLength(0.04); 
     assertFalse(r1.equals(r2)); 
     r2.setMinimumBarLength(0.04); 
     assertTrue(r1.equals(r2)); 
     r1.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.CENTER_VERTICAL)); 
     assertFalse(r1.equals(r2)); 
     r2.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.CENTER_VERTICAL)); 
     assertTrue(r1.equals(r2)); 
     r1.setPositiveItemLabelPositionFallback(new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER)); 
     assertFalse(r1.equals(r2)); 
     r2.setPositiveItemLabelPositionFallback(new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER)); 
     assertTrue(r1.equals(r2)); 
     r1.setNegativeItemLabelPositionFallback(new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER)); 
     assertFalse(r1.equals(r2)); 
     r2.setNegativeItemLabelPositionFallback(new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER)); 
     assertTrue(r1.equals(r2)); 
     r1.setBarPainter(new GradientBarPainter(0.1, 0.2, 0.3)); 
     assertFalse(r1.equals(r2)); 
     r2.setBarPainter(new GradientBarPainter(0.1, 0.2, 0.3)); 
     assertTrue(r1.equals(r2)); 
     r1.setShadowVisible(false); 
     assertFalse(r1.equals(r2)); 
     r2.setShadowVisible(false); 
     assertTrue(r1.equals(r2)); 
     r1.setShadowPaint(Color.red); 
     assertFalse(r1.equals(r2)); 
     r2.setShadowPaint(Color.red); 
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


public void testCloning303() { 
     BarRenderer r1 = new BarRenderer(); 
     r1.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator()); 
     r1.setBarPainter(new GradientBarPainter(0.11, 0.22, 0.33)); 
     BarRenderer r2 = null; 
     try { 
         r2 = (BarRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

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
     * Tests each setter method to ensure that it sends an event notification.
     */
    

    /**
     * Some checks for the getLegendItem() method.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

    /**
     * Some checks for the findRangeBounds() method.
     */
    

}
