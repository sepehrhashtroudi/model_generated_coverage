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
 * ----------------
 * XYPlotTests.java
 * ----------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 22-Mar-2004 : Added new cloning test (DG);
 * 05-Oct-2004 : Strengthened test for clone independence (DG);
 * 22-Nov-2006 : Added quadrant fields to equals() and clone() tests (DG);
 * 09-Jan-2007 : Mark and comment out testGetDatasetCount() (DG);
 * 05-Feb-2007 : Added testAddDomainMarker() and testAddRangeMarker() (DG);
 * 07-Feb-2007 : Added test1654215() (DG);
 * 24-May-2007 : Added testDrawSeriesWithZeroItems() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 07-Apr-2008 : Added testRemoveDomainMarker() and
 *               testRemoveRangeMarker() (DG);
 * 10-May-2009 : Extended testEquals(), added testCloning3() (DG);
 * 06-Jul-2009 : Added testBug2817504() (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.Day;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYPlot} class.
 */
public class XYPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYPlotTests(String name) {
        super(name);
    }

// FIXME: the getDatasetCount() method is returning a count of the slots
// available for datasets, rather than the number of datasets actually
// specified...see if there is some way to clean this up.
//    /**
//     * Added this test in response to a bug report.
//     */
//    public void testGetDatasetCount() {
//        XYPlot plot = new XYPlot();
//        assertEquals(0, plot.getDatasetCount());
//    }

    /**
     * Some checks for the equals() method.
     */

public void testSerialization314() { 
     XYSeriesCollection dataset = new XYSeriesCollection(); 
     JFreeChart chart = ChartFactory.createXYLineChart("Test Chart", "Domain Axis", "Range Axis", dataset, true); 
     JFreeChart chart2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(chart); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         chart2 = (JFreeChart) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(chart, chart2); 
     boolean passed = true; 
     try { 
         chart2.createBufferedImage(300, 200); 
     } catch (Exception e) { 
         passed = false; 
         e.printStackTrace(); 
     } 
     assertTrue(passed); 
 } 


public void testSetRenderer209() { 
     XYPlot plot = new XYPlot(); 
     XYItemRenderer renderer = new XYLineAndShapeRenderer(); 
     plot.setRenderer(renderer); 
     MyPlotChangeListener listener = new MyPlotChangeListener(); 
     plot.addChangeListener(listener); 
     renderer.setSeriesPaint(0, Color.black); 
     assertTrue(listener.getEvent() != null); 
 } 


public void testDrawSeriesWithZeroItems279() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     dataset.addSeries("Series 1", new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } }); 
     dataset.addSeries("Series 2", new double[][] { {}, {} }); 
     JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y", dataset, true); 
     boolean success = false; 
     try { 
         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
         Graphics2D g2 = image.createGraphics(); 
         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); 
         g2.dispose(); 
         success = true; 
     } catch (Exception e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testRemoveAnnotation349() { 
     XYPlot plot = new XYPlot(); 
     XYTextAnnotation a1 = new XYTextAnnotation("X", 1.0, 2.0); 
     XYTextAnnotation a2 = new XYTextAnnotation("X", 3.0, 4.0); 
     XYTextAnnotation a3 = new XYTextAnnotation("X", 1.0, 2.0); 
     plot.addAnnotation(a1); 
     plot.addAnnotation(a2); 
     plot.addAnnotation(a3); 
     plot.removeAnnotation(a2); 
     XYTextAnnotation x = (XYTextAnnotation) plot.getAnnotations().get(0); 
     assertEquals(x, a1); 
     assertTrue(a1.equals(a3)); 
     plot.removeAnnotation(a3); 
     x = (XYTextAnnotation) plot.getAnnotations().get(0); 
     assertEquals(x, a3); 
 } 


public void testSerialization4353() { 
     XYSeriesCollection dataset = new XYSeriesCollection(); 
     JFreeChart chart = ChartFactory.createXYLineChart("Test Chart", "Domain Axis", "Range Axis", dataset, true); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.addDomainMarker(new ValueMarker(1.0), Layer.FOREGROUND); 
     plot.addDomainMarker(new IntervalMarker(2.0, 3.0), Layer.BACKGROUND); 
     plot.addRangeMarker(new ValueMarker(4.0), Layer.FOREGROUND); 
     plot.addRangeMarker(new IntervalMarker(5.0, 6.0), Layer.BACKGROUND); 
     JFreeChart chart2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(chart); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         chart2 = (JFreeChart) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(chart, chart2); 
     boolean passed = true; 
     try { 
         chart2.createBufferedImage(300, 200); 
     } catch (Exception e) { 
         passed = false; 
         e.printStackTrace(); 
     } 
     assertTrue(passed); 
 } 


public void testGetRendererForDataset567() { 
     XYDataset d0 = new XYSeriesCollection(); 
     XYDataset d1 = new XYSeriesCollection(); 
     XYDataset d2 = new XYSeriesCollection(); 
     XYDataset d3 = new XYSeriesCollection(); 
     XYItemRenderer r0 = new XYLineAndShapeRenderer(); 
     XYItemRenderer r2 = new XYLineAndShapeRenderer(); 
     XYPlot plot = new XYPlot(); 
     plot.setDataset(0, d0); 
     plot.setDataset(1, d1); 
     plot.setDataset(2, d2); 
     plot.setRenderer(0, r0); 
     plot.setRenderer(2, r2); 
     assertEquals(r0, plot.getRendererForDataset(d0)); 
     assertEquals(r0, plot.getRendererForDataset(d1)); 
     assertEquals(r2, plot.getRendererForDataset(d2)); 
     assertEquals(null, plot.getRendererForDataset(d3)); 
     assertEquals(null, plot.getRendererForDataset(null)); 
 } 


public void testGetLegendItems703() { 
     XYDataset d0 = createDataset1(); 
     XYDataset d1 = createDataset2(); 
     XYItemRenderer r0 = new XYLineAndShapeRenderer(); 
     XYPlot plot = new XYPlot(); 
     plot.setDataset(0, d0); 
     plot.setDataset(1, d1); 
     plot.setRenderer(0, r0); 
     LegendItemCollection items = plot.getLegendItems(); 
     assertEquals(2, items.getItemCount()); 
 } 


public void testAddDomainMarker708() { 
     XYPlot plot = new XYPlot(); 
     Marker m = new ValueMarker(1.0); 
     plot.addDomainMarker(m); 
     List listeners = Arrays.asList(m.getListeners(MarkerChangeListener.class)); 
     assertTrue(listeners.contains(plot)); 
     plot.clearDomainMarkers(); 
     listeners = Arrays.asList(m.getListeners(MarkerChangeListener.class)); 
     assertFalse(listeners.contains(plot)); 
 } 


public void testRemoveDomainMarker709() { 
     XYPlot plot = new XYPlot(); 
     assertFalse(plot.removeDomainMarker(new ValueMarker(0.5))); 
 } 


public void testRemoveRangeMarker711() { 
     XYPlot plot = new XYPlot(); 
     assertFalse(plot.removeRangeMarker(new ValueMarker(0.5))); 
 } 


public void test1654215712() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y", dataset, true); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRenderer(1, new XYLineAndShapeRenderer()); 
     boolean success = false; 
     try { 
         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
         Graphics2D g2 = image.createGraphics(); 
         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); 
         g2.dispose(); 
         success = true; 
     } catch (Exception e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testCloning3713() { 
     XYPlot p1 = new XYPlot(null, new NumberAxis("Domain Axis"), new NumberAxis("Range Axis"), new StandardXYItemRenderer()); 
     LegendItemCollection c1 = new LegendItemCollection(); 
     p1.setFixedLegendItems(c1); 
     XYPlot p2 = null; 
     try { 
         p2 = (XYPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     c1.add(new LegendItem("X")); 
     assertFalse(p1.equals(p2)); 
 } 

    

    /**
     * Confirm that basic cloning works.
     */
    

    /**
     * Tests cloning for a more complex plot.
     */
    

    /**
     * Tests cloning for a plot where the fixed legend items have been
     * specified.
     */
    

    /**
     * Tests cloning to ensure that the cloned plot is registered as a listener
     * on the cloned renderer.
     */
    

    /**
     * Confirm that cloning captures the quadrantOrigin field.
     */
    

    /**
     * Confirm that cloning captures the quadrantOrigin field.
     */
    

    /**
     * Renderers that belong to the plot are being cloned but they are
     * retaining a reference to the original plot.
     */
    

    /**
     * Tests the independence of the clones.
     */
    

    /**
     * Setting a null renderer should be allowed, but is generating a null
     * pointer exception in 0.9.7.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.  This test
     * uses a {@link DateAxis} and a {@link StandardXYToolTipGenerator}.
     */
    

    /**
     * Problem to reproduce a bug in serialization.  The bug (first reported
     * against the {@link org.jfree.chart.plot.CategoryPlot} class) is a null
     * pointer exception that occurs when drawing a plot after deserialization.
     * It is caused by four temporary storage structures (axesAtTop,
     * axesAtBottom, axesAtLeft and axesAtRight - all initialized as empty
     * lists in the constructor) not being initialized by the readObject()
     * method following deserialization.  This test has been written to
     * reproduce the bug (now fixed).
     */
    

    /**
     * A test to reproduce a bug in serialization: the domain and/or range
     * markers for a plot are not being serialized.
     */
    

    /**
     * Tests a bug where the plot is no longer registered as a listener
     * with the dataset(s) and axes after deserialization.  See patch 1209475
     * at SourceForge.
     */
    

    /**
     * Some checks for the getRendererForDataset() method.
     */
    

    /**
     * Some checks for the getLegendItems() method.
     */
    

    /**
     * Creates a sample dataset.
     *
     * @return Series 1.
     */
    private IntervalXYDataset createDataset1() {

        // create dataset 1...
        TimeSeries series1 = new TimeSeries("Series 1");
        series1.add(new Day(1, MonthConstants.MARCH, 2002), 12353.3);
        series1.add(new Day(2, MonthConstants.MARCH, 2002), 13734.4);
        series1.add(new Day(3, MonthConstants.MARCH, 2002), 14525.3);
        series1.add(new Day(4, MonthConstants.MARCH, 2002), 13984.3);
        series1.add(new Day(5, MonthConstants.MARCH, 2002), 12999.4);
        series1.add(new Day(6, MonthConstants.MARCH, 2002), 14274.3);
        series1.add(new Day(7, MonthConstants.MARCH, 2002), 15943.5);
        series1.add(new Day(8, MonthConstants.MARCH, 2002), 14845.3);
        series1.add(new Day(9, MonthConstants.MARCH, 2002), 14645.4);
        series1.add(new Day(10, MonthConstants.MARCH, 2002), 16234.6);
        series1.add(new Day(11, MonthConstants.MARCH, 2002), 17232.3);
        series1.add(new Day(12, MonthConstants.MARCH, 2002), 14232.2);
        series1.add(new Day(13, MonthConstants.MARCH, 2002), 13102.2);
        series1.add(new Day(14, MonthConstants.MARCH, 2002), 14230.2);
        series1.add(new Day(15, MonthConstants.MARCH, 2002), 11235.2);

        TimeSeriesCollection collection = new TimeSeriesCollection(series1);
        return collection;

    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    private XYDataset createDataset2() {
        // create dataset 1...
        XYSeries series = new XYSeries("Series 2");
        XYSeriesCollection collection = new XYSeriesCollection(series);
        return collection;

    }

    /**
     * A test for a bug where setting the renderer doesn't register the plot
     * as a RendererChangeListener.
     */
    

    /**
     * Some checks for the removeAnnotation() method.
     */
    

    /**
     * Some tests for the addDomainMarker() method(s).
     */
    

    /**
     * Some tests for the addRangeMarker() method(s).
     */
    

    /**
     * A test for bug 1654215 (where a renderer is added to the plot without
     * a corresponding dataset and it throws an exception at drawing time).
     */
    

    /**
     * A test for drawing range grid lines when there is no primary renderer.
     * In 1.0.4, this is throwing a NullPointerException.
     */
    

    /**
     * A test for drawing a plot where a series has zero items.  With
     * JFreeChart 1.0.5+cvs this was throwing an exception at one point.
     */
    

    /**
     * Check that removing a marker that isn't assigned to the plot returns
     * false.
     */
    

    /**
     * Check that removing a marker that isn't assigned to the plot returns
     * false.
     */
    

    /**
     * Some tests for the getDomainAxisForDataset() method.
     */
    

    /**
     * Some tests for the getRangeAxisForDataset() method.
     */
    
}
