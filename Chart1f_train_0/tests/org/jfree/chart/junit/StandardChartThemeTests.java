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
 * StandardChartThemeTests.java
 * ----------------------------
 * (C) Copyright 2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 14-Aug-2008 : Version 1 (DG);
 *
 */


package org.jfree.chart.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
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

import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PieLabelLinkStyle;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link StandardChartTheme} class.
 */
public class StandardChartThemeTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardChartThemeTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardChartThemeTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testEquals195() { 
     StandardChartTheme t1 = new StandardChartTheme("Name"); 
     StandardChartTheme t2 = new StandardChartTheme("Name"); 
     assertTrue(t1.equals(t2)); 
     t1 = new StandardChartTheme("t1"); 
     assertFalse(t1.equals(t2)); 
     t2 = new StandardChartTheme("t1"); 
     assertTrue(t1.equals(t2)); 
     t1.setExtraLargeFont(new Font("Dialog", Font.PLAIN, 21)); 
     assertFalse(t1.equals(t2)); 
     t2.setExtraLargeFont(new Font("Dialog", Font.PLAIN, 21)); 
     assertTrue(t1.equals(t2)); 
     t1.setLargeFont(new Font("Dialog", Font.PLAIN, 19)); 
     assertFalse(t1.equals(t2)); 
     t2.setLargeFont(new Font("Dialog", Font.PLAIN, 19)); 
     assertTrue(t1.equals(t2)); 
     t1.setRegularFont(new Font("Dialog", Font.PLAIN, 17)); 
     assertFalse(t1.equals(t2)); 
     t2.setRegularFont(new Font("Dialog", Font.PLAIN, 17)); 
     assertTrue(t1.equals(t2)); 
     t1.setTitlePaint(new GradientPaint(0f, 1f, Color.red, 2f, 3f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setTitlePaint(new GradientPaint(0f, 1f, Color.red, 2f, 3f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setSubtitlePaint(new GradientPaint(1f, 2f, Color.red, 3f, 4f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setSubtitlePaint(new GradientPaint(1f, 2f, Color.red, 3f, 4f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setChartBackgroundPaint(new GradientPaint(2f, 3f, Color.blue, 4f, 5f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setChartBackgroundPaint(new GradientPaint(2f, 3f, Color.blue, 4f, 5f, Color.red)); 
     assertTrue(t1.equals(t2)); 
     t1.setLegendBackgroundPaint(new GradientPaint(3f, 4f, Color.gray, 1f, 2f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setLegendBackgroundPaint(new GradientPaint(3f, 4f, Color.gray, 1f, 2f, Color.red)); 
     assertTrue(t1.equals(t2)); 
     t1.setLegendItemPaint(new GradientPaint(9f, 8f, Color.red, 7f, 6f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setLegendItemPaint(new GradientPaint(9f, 8f, Color.red, 7f, 6f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setDrawingSupplier(new DefaultDrawingSupplier(new Paint[] { Color.red }, new Paint[] { Color.blue }, new Stroke[] { new BasicStroke(1.0f) }, new Stroke[] { new BasicStroke(1.0f) }, new Shape[] { new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0) })); 
     assertFalse(t1.equals(t2)); 
     t2.setDrawingSupplier(new DefaultDrawingSupplier(new Paint[] { Color.red }, new Paint[] { Color.blue }, new Stroke[] { new BasicStroke(1.0f) }, new Stroke[] { new BasicStroke(1.0f) }, new Shape[] { new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0) })); 
     assertTrue(t1.equals(t2)); 
     t1.setPlotBackgroundPaint(new GradientPaint(4f, 3f, Color.red, 6f, 7f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setPlotBackgroundPaint(new GradientPaint(4f, 3f, Color.red, 6f, 7f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setPlotOutlinePaint(new GradientPaint(5f, 2f, Color.blue, 6f, 7f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setPlotOutlinePaint(new GradientPaint(5f, 2f, Color.blue, 6f, 7f, Color.red)); 
     assertTrue(t1.equals(t2)); 
     t1.setLabelLinkStyle(PieLabelLinkStyle.STANDARD); 
     assertFalse(t1.equals(t2)); 
     t2.setLabelLinkStyle(PieLabelLinkStyle.STANDARD); 
     assertTrue(t1.equals(t2)); 
     t1.setLabelLinkPaint(new GradientPaint(4f, 3f, Color.red, 2f, 9f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setLabelLinkPaint(new GradientPaint(4f, 3f, Color.red, 2f, 9f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setDomainGridlinePaint(Color.blue); 
     assertFalse(t1.equals(t2)); 
     t2.setDomainGridlinePaint(Color.blue); 
     assertTrue(t1.equals(t2)); 
     t1.setRangeGridlinePaint(Color.red); 
     assertFalse(t1.equals(t2)); 
     t2.setRangeGridlinePaint(Color.red); 
     assertTrue(t1.equals(t2)); 
     t1.setAxisOffset(new RectangleInsets(1, 2, 3, 4)); 
     assertFalse(t1.equals(t2)); 
     t2.setAxisOffset(new RectangleInsets(1, 2, 3, 4)); 
     assertTrue(t1.equals(t2)); 
     t1.setAxisLabelPaint(new GradientPaint(8f, 4f, Color.gray, 2f, 9f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setAxisLabelPaint(new GradientPaint(8f, 4f, Color.gray, 2f, 9f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setTickLabelPaint(new GradientPaint(3f, 4f, Color.red, 5f, 6f, Color.yellow)); 
     assertFalse(t1.equals(t2)); 
     t2.setTickLabelPaint(new GradientPaint(3f, 4f, Color.red, 5f, 6f, Color.yellow)); 
     assertTrue(t1.equals(t2)); 
     t1.setItemLabelPaint(new GradientPaint(2f, 5f, Color.gray, 1f, 2f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setItemLabelPaint(new GradientPaint(2f, 5f, Color.gray, 1f, 2f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setShadowVisible(!t1.isShadowVisible()); 
     assertFalse(t1.equals(t2)); 
     t2.setShadowVisible(t1.isShadowVisible()); 
     assertTrue(t1.equals(t2)); 
     t1.setShadowPaint(new GradientPaint(7f, 1f, Color.blue, 4f, 6f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setShadowPaint(new GradientPaint(7f, 1f, Color.blue, 4f, 6f, Color.red)); 
     assertTrue(t1.equals(t2)); 
     t1.setBarPainter(new StandardBarPainter()); 
     assertFalse(t1.equals(t2)); 
     t2.setBarPainter(new StandardBarPainter()); 
     assertTrue(t1.equals(t2)); 
     t1.setXYBarPainter(new StandardXYBarPainter()); 
     assertFalse(t1.equals(t2)); 
     t2.setXYBarPainter(new StandardXYBarPainter()); 
     assertTrue(t1.equals(t2)); 
     t1.setThermometerPaint(new GradientPaint(9f, 7f, Color.red, 5f, 1f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setThermometerPaint(new GradientPaint(9f, 7f, Color.red, 5f, 1f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setWallPaint(new GradientPaint(4f, 5f, Color.red, 1f, 0f, Color.gray)); 
     assertFalse(t1.equals(t2)); 
     t2.setWallPaint(new GradientPaint(4f, 5f, Color.red, 1f, 0f, Color.gray)); 
     assertTrue(t1.equals(t2)); 
     t1.setErrorIndicatorPaint(new GradientPaint(0f, 1f, Color.white, 2f, 3f, Color.blue)); 
     assertFalse(t1.equals(t2)); 
     t2.setErrorIndicatorPaint(new GradientPaint(0f, 1f, Color.white, 2f, 3f, Color.blue)); 
     assertTrue(t1.equals(t2)); 
     t1.setGridBandPaint(new GradientPaint(1f, 2f, Color.white, 4f, 8f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setGridBandPaint(new GradientPaint(1f, 2f, Color.white, 4f, 8f, Color.red)); 
     assertTrue(t1.equals(t2)); 
     t1.setGridBandAlternatePaint(new GradientPaint(1f, 4f, Color.green, 1f, 2f, Color.red)); 
     assertFalse(t1.equals(t2)); 
     t2.setGridBandAlternatePaint(new GradientPaint(1f, 4f, Color.green, 1f, 2f, Color.red)); 
     assertTrue(t1.equals(t2)); 
 } 


public void testCloning334() { 
     StandardChartTheme t1 = new StandardChartTheme("Name"); 
     StandardChartTheme t2 = null; 
     try { 
         t2 = (StandardChartTheme) t1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(t1 != t2); 
     assertTrue(t1.getClass() == t2.getClass()); 
     assertTrue(t1.equals(t2)); 
 } 

    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Basic checks for cloning.
     */
    

}
