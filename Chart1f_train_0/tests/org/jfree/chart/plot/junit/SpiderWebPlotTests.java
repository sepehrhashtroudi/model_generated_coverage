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
 * SpiderWebPlotTests.java
 * -----------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jun-2005 : Version 1 (DG);
 * 01-Jun-2006 : Added testDrawWithNullInfo() method (DG);
 * 05-Feb-2007 : Added more checks to testCloning (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link SpiderWebPlot} class.
 */
public class SpiderWebPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SpiderWebPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SpiderWebPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */

public void testSerialization8() { 
     SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     SpiderWebPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (SpiderWebPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 } 


public void testEquals9() { 
     SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     SpiderWebPlot p2 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.equals(p1)); 
     p1.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertFalse(p1.equals(p2)); 
     p2.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertTrue(p1.equals(p2)); 
     p1.setHeadPercent(0.321); 
     assertFalse(p1.equals(p2)); 
     p2.setHeadPercent(0.321); 
     assertTrue(p1.equals(p2)); 
     p1.setInteriorGap(0.123); 
     assertFalse(p1.equals(p2)); 
     p2.setInteriorGap(0.123); 
     assertTrue(p1.equals(p2)); 
     p1.setStartAngle(0.456); 
     assertFalse(p1.equals(p2)); 
     p2.setStartAngle(0.456); 
     assertTrue(p1.equals(p2)); 
     p1.setDirection(Rotation.ANTICLOCKWISE); 
     assertFalse(p1.equals(p2)); 
     p2.setDirection(Rotation.ANTICLOCKWISE); 
     assertTrue(p1.equals(p2)); 
     p1.setMaxValue(123.4); 
     assertFalse(p1.equals(p2)); 
     p2.setMaxValue(123.4); 
     assertTrue(p1.equals(p2)); 
     p1.setLegendItemShape(new Rectangle(1, 2, 3, 4)); 
     assertFalse(p1.equals(p2)); 
     p2.setLegendItemShape(new Rectangle(1, 2, 3, 4)); 
     assertTrue(p1.equals(p2)); 
     p1.setSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertTrue(p1.equals(p2)); 
     p1.setSeriesPaint(1, new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesPaint(1, new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); 
     assertTrue(p1.equals(p2)); 
     p1.setBaseSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.black)); 
     assertFalse(p1.equals(p2)); 
     p2.setBaseSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.black)); 
     assertTrue(p1.equals(p2)); 
     p1.setSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.black)); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.black)); 
     assertTrue(p1.equals(p2)); 
     p1.setSeriesOutlinePaint(1, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green)); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesOutlinePaint(1, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green)); 
     assertTrue(p1.equals(p2)); 
     p1.setBaseSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.cyan, 3.0f, 4.0f, Color.green)); 
     assertFalse(p1.equals(p2)); 
     p2.setBaseSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.cyan, 3.0f, 4.0f, Color.green)); 
     assertTrue(p1.equals(p2)); 
     BasicStroke s = new BasicStroke(1.23f); 
     p1.setSeriesOutlineStroke(s); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesOutlineStroke(s); 
     assertTrue(p1.equals(p2)); 
     p1.setSeriesOutlineStroke(1, s); 
     assertFalse(p1.equals(p2)); 
     p2.setSeriesOutlineStroke(1, s); 
     assertTrue(p1.equals(p2)); 
     p1.setBaseSeriesOutlineStroke(s); 
     assertFalse(p1.equals(p2)); 
     p2.setBaseSeriesOutlineStroke(s); 
     assertTrue(p1.equals(p2)); 
     p1.setWebFilled(false); 
     assertFalse(p1.equals(p2)); 
     p2.setWebFilled(false); 
     assertTrue(p1.equals(p2)); 
     p1.setAxisLabelGap(0.11); 
     assertFalse(p1.equals(p2)); 
     p2.setAxisLabelGap(0.11); 
     assertTrue(p1.equals(p2)); 
     p1.setLabelFont(new Font("Serif", Font.PLAIN, 9)); 
     assertFalse(p1.equals(p2)); 
     p2.setLabelFont(new Font("Serif", Font.PLAIN, 9)); 
     assertTrue(p1.equals(p2)); 
     p1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(p1.equals(p2)); 
     p2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(p1.equals(p2)); 
     p1.setLabelGenerator(new StandardCategoryItemLabelGenerator("XYZ: {0}", new DecimalFormat("0.000"))); 
     assertFalse(p1.equals(p2)); 
     p2.setLabelGenerator(new StandardCategoryItemLabelGenerator("XYZ: {0}", new DecimalFormat("0.000"))); 
     assertTrue(p1.equals(p2)); 
     p1.setToolTipGenerator(new StandardCategoryToolTipGenerator()); 
     assertFalse(p1.equals(p2)); 
     p2.setToolTipGenerator(new StandardCategoryToolTipGenerator()); 
     assertTrue(p1.equals(p2)); 
     p1.setURLGenerator(new StandardCategoryURLGenerator()); 
     assertFalse(p1.equals(p2)); 
     p2.setURLGenerator(new StandardCategoryURLGenerator()); 
     assertTrue(p1.equals(p2)); 
     p1.setAxisLinePaint(Color.red); 
     assertFalse(p1.equals(p2)); 
     p2.setAxisLinePaint(Color.red); 
     assertTrue(p1.equals(p2)); 
     p1.setAxisLineStroke(new BasicStroke(1.1f)); 
     assertFalse(p1.equals(p2)); 
     p2.setAxisLineStroke(new BasicStroke(1.1f)); 
     assertTrue(p1.equals(p2)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a null info object to make sure that no exceptions
     * are thrown.
     */
    

}
