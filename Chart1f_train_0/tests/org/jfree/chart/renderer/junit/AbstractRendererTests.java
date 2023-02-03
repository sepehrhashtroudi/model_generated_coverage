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
 * --------------------------
 * AbstractRendererTests.java
 * --------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Oct-2003 : Version 1 (DG);
 * 01-Mar-2004 : Added serialization test (DG);
 * 19-Feb-2007 : Added testCloning (DG);
 * 28-Feb-2007 : Added checks for cloning (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 04-Dec-2007 : Added testHashCode() (DG);
 * 28-Jan-2009 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.renderer.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
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

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.text.TextAnchor;

/**
 * Tests for the {@link AbstractRenderer} class.
 */
public class AbstractRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AbstractRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public AbstractRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testEventNotification278() { 
     RendererChangeDetector detector = new RendererChangeDetector(); 
     BarRenderer r1 = new BarRenderer(); 
     r1.addChangeListener(detector); 
     detector.setNotified(false); 
     r1.setSeriesPaint(0, Color.red); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBasePaint(Color.red); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesOutlinePaint(0, Color.red); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseOutlinePaint(Color.red); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesStroke(0, new BasicStroke(1.0f)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseStroke(new BasicStroke(1.0f)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesOutlineStroke(0, new BasicStroke(1.0f)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseOutlineStroke(new BasicStroke(1.0f)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesShape(0, new Rectangle2D.Float()); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseShape(new Rectangle2D.Float()); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesItemLabelsVisible(0, Boolean.TRUE); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseItemLabelsVisible(true); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesItemLabelFont(0, new Font("Serif", Font.PLAIN, 12)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseItemLabelFont(new Font("Serif", Font.PLAIN, 12)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesItemLabelPaint(0, Color.blue); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseItemLabelPaint(Color.blue); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setSeriesNegativeItemLabelPosition(0, new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER)); 
     assertTrue(detector.getNotified()); 
     detector.setNotified(false); 
     r1.setBaseNegativeItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER)); 
     assertTrue(detector.getNotified()); 
 } 


public void testPaintLookup281() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(Color.blue, r.getBasePaint()); 
     r.setAutoPopulateSeriesPaint(false); 
     assertEquals(Color.blue, r.lookupSeriesPaint(0)); 
     assertNull(r.getSeriesPaint(0)); 
     r.setAutoPopulateSeriesPaint(true); 
     new CategoryPlot(null, new CategoryAxis("Category"), new NumberAxis("Value"), r); 
     assertEquals(DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE[0], r.lookupSeriesPaint(0)); 
     assertNotNull(r.getSeriesPaint(0)); 
 } 


public void testAutoPopulateFlagDefaults282() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(true, r.getAutoPopulateSeriesPaint()); 
     assertEquals(false, r.getAutoPopulateSeriesFillPaint()); 
     assertEquals(false, r.getAutoPopulateSeriesOutlinePaint()); 
     assertEquals(true, r.getAutoPopulateSeriesStroke()); 
     assertEquals(false, r.getAutoPopulateSeriesOutlineStroke()); 
     assertEquals(true, r.getAutoPopulateSeriesShape()); 
 } 


public void testHashCode283() { 
     BarRenderer r1 = new BarRenderer(); 
     BarRenderer r2 = new BarRenderer(); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesVisible(1, Boolean.FALSE); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesVisible(1, Boolean.FALSE); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseSeriesVisible(false); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseSeriesVisible(false); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesVisibleInLegend(1, Boolean.FALSE); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesVisibleInLegend(1, Boolean.FALSE); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseSeriesVisibleInLegend(false); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseSeriesVisibleInLegend(false); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBasePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBasePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesFillPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesFillPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseFillPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseFillPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesOutlinePaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesOutlinePaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesStroke(0, new BasicStroke(1.1f)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesStroke(0, new BasicStroke(1.1f)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseStroke(new BasicStroke(1.5f)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseStroke(new BasicStroke(1.5f)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesOutlineStroke(1, new BasicStroke(1.5f)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesOutlineStroke(1, new BasicStroke(1.5f)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseOutlineStroke(new BasicStroke(2.0f)); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseOutlineStroke(new BasicStroke(2.0f)); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setSeriesItemLabelsVisible(1, true); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setSeriesItemLabelsVisible(1, true); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
     r1.setBaseItemLabelsVisible(true); 
     assertFalse(r1.hashCode() == r2.hashCode()); 
     r2.setBaseItemLabelsVisible(true); 
     assertTrue(r1.hashCode() == r2.hashCode()); 
 } 


public void testSerialization284() { 
     BarRenderer r1 = new BarRenderer(); 
     r1.setBaseLegendTextFont(new Font("Dialog", Font.PLAIN, 4)); 
     r1.setBaseLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     r1.setBaseLegendShape(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); 
     BarRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (BarRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
     try { 
         r2.notifyListeners(new RendererChangeEvent(r2)); 
     } catch (NullPointerException e) { 
         assertTrue(false); 
     } 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A utility class for listening to changes to a renderer.
     */
    static class MyRendererChangeListener implements RendererChangeListener {

        /** The last event received. */
        public RendererChangeEvent lastEvent;

        /**
         * Creates a new instance.
         */
        public MyRendererChangeListener() {
            this.lastEvent = null;
        }
        public void rendererChanged(RendererChangeEvent event) {
            this.lastEvent = event;
        }
    }

    /**
     * A check for cloning.
     */
    

    /**
     * Tests each setter method to ensure that it sends an event notification.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.  In addition,
     * test for a bug that was reported where the listener list is 'null' after
     * deserialization.
     */
    

    /**
     * Some checks for the autoPopulate flag default values.
     */
    

    /**
     * Some checks for the paint lookup mechanism.
     */
    

    /**
     * Some checks for the fill paint lookup mechanism.
     */
    

    /**
     * Some checks for the outline paint lookup mechanism.
     */
    

    /**
     * Some checks for the hashCode() method.
     */
    

}
