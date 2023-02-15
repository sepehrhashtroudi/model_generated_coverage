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
 * -----------------------------
 * CombinedRangeXYPlotTests.java
 * -----------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-Aug-2003 : Version 1 (DG);
 * 03-Jan-2008 : Added testNotification (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link CombinedRangeXYPlot} class.
 */
public class CombinedRangeXYPlotTests extends TestCase
        implements ChartChangeListener {

    /** A list of the events received. */
    private List events = new java.util.ArrayList();

    /**
     * Receives a chart change event.
     *
     * @param event  the event.
     */
    public void chartChanged(ChartChangeEvent event) {
        this.events.add(event);
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CombinedRangeXYPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CombinedRangeXYPlotTests(String name) {
        super(name);
    }

    /**
     * Test the equals method.
     */
public void testCombinedRangeXYPlot4025() { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = createPlot(); assertEquals(plot1, plot2); }
public void testEquals4026() { CombinedRangeXYPlot plot1 = new CombinedRangeXYPlot(); CombinedRangeXYPlot plot2 = new CombinedRangeXYPlot(); assertEquals(plot1, plot2); }
public void testCombinedRangeXYPlot4027() { try { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = createPlot(); assertEquals(plot1, plot2); } catch (Exception e) { fail(e.getMessage()); } }
public void testEquals4028() { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = createPlot(); assertEquals(plot1, plot2); }
public void testCloning4029() throws CloneNotSupportedException { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = (CombinedRangeXYPlot) plot1.clone(); assertNotSame(plot1, plot2); }
public void testCloning4031() throws CloneNotSupportedException { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = (CombinedRangeXYPlot) plot1.clone(); assertNotSame(plot1, plot2); assertSame(plot1.getClass(), plot2.getClass()); assertEquals(plot1, plot2); plot1.setGap(0.5); plot2.setGap(0.5); assertEquals(plot1, plot2); }
public void testCloning4033() throws CloneNotSupportedException { CombinedRangeXYPlot plot1 = createPlot(); CombinedRangeXYPlot plot2 = (CombinedRangeXYPlot) plot1.clone(); plot1.add(plot2); assertNotSame(plot1, plot2); }
public void testGetPlotDiscontinuous6421() { StandardXYItemRenderer r = new StandardXYItemRenderer(); assertFalse(r.getPlotDiscontinuous()); r.setPlotDiscontinuous(true); assertTrue(r.getPlotDiscontinuous()); }
public void testDrawAnnotations8508() { }
    

    /**
     * This is a test to replicate the bug report 987080.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check that only one chart change event is generated by a change to a
     * subplot.
     */
    

    /**
     * Creates a sample dataset.
     *
     * @return Series 1.
     */
    private XYDataset createDataset1() {

        XYSeries series1 = new XYSeries("Series 1");
        series1.add(10.0, 12353.3);
        series1.add(20.0, 13734.4);
        series1.add(30.0, 14525.3);
        series1.add(40.0, 13984.3);
        series1.add(50.0, 12999.4);
        series1.add(60.0, 14274.3);
        series1.add(70.0, 15943.5);
        series1.add(80.0, 14845.3);
        series1.add(90.0, 14645.4);
        series1.add(100.0, 16234.6);
        series1.add(110.0, 17232.3);
        series1.add(120.0, 14232.2);
        series1.add(130.0, 13102.2);
        series1.add(140.0, 14230.2);
        series1.add(150.0, 11235.2);

        XYSeries series2 = new XYSeries("Series 2");
        series2.add(10.0, 15000.3);
        series2.add(20.0, 11000.4);
        series2.add(30.0, 17000.3);
        series2.add(40.0, 15000.3);
        series2.add(50.0, 14000.4);
        series2.add(60.0, 12000.3);
        series2.add(70.0, 11000.5);
        series2.add(80.0, 12000.3);
        series2.add(90.0, 13000.4);
        series2.add(100.0, 12000.6);
        series2.add(110.0, 13000.3);
        series2.add(120.0, 17000.2);
        series2.add(130.0, 18000.2);
        series2.add(140.0, 16000.2);
        series2.add(150.0, 17000.2);

        XYSeriesCollection collection = new XYSeriesCollection();
        collection.addSeries(series1);
        collection.addSeries(series2);
        return collection;

    }

    /**
     * Creates a sample dataset.
     *
     * @return Series 2.
     */
    private XYDataset createDataset2() {

        // create dataset 2...
        XYSeries series2 = new XYSeries("Series 3");

        series2.add(10.0, 16853.2);
        series2.add(20.0, 19642.3);
        series2.add(30.0, 18253.5);
        series2.add(40.0, 15352.3);
        series2.add(50.0, 13532.0);
        series2.add(100.0, 12635.3);
        series2.add(110.0, 13998.2);
        series2.add(120.0, 11943.2);
        series2.add(130.0, 16943.9);
        series2.add(140.0, 17843.2);
        series2.add(150.0, 16495.3);
        series2.add(160.0, 17943.6);
        series2.add(170.0, 18500.7);
        series2.add(180.0, 19595.9);

        return new XYSeriesCollection(series2);

    }

    /**
     * Creates a sample plot.
     *
     * @return A sample plot.
     */
    private CombinedRangeXYPlot createPlot() {
        // create subplot 1...
        XYDataset data1 = createDataset1();
        XYItemRenderer renderer1 = new StandardXYItemRenderer();
        NumberAxis xAxis1 = new NumberAxis("X1");
        XYPlot subplot1 = new XYPlot(data1, xAxis1, null, renderer1);
        subplot1.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        XYTextAnnotation annotation
                = new XYTextAnnotation("Hello!", 50.0, 10000.0);
        annotation.setFont(new Font("SansSerif", Font.PLAIN, 9));
        annotation.setRotationAngle(Math.PI / 4.0);
        subplot1.addAnnotation(annotation);

        // create subplot 2...
        XYDataset data2 = createDataset2();
        XYItemRenderer renderer2 = new StandardXYItemRenderer();
        NumberAxis xAxis2 = new NumberAxis("X2");
        xAxis2.setAutoRangeIncludesZero(false);
        XYPlot subplot2 = new XYPlot(data2, xAxis2, null, renderer2);
        subplot2.setRangeAxisLocation(AxisLocation.TOP_OR_LEFT);

        // parent plot...
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot(new NumberAxis(
                "Range"));
        plot.setGap(10.0);

        // add the subplots...
        plot.add(subplot1, 1);
        plot.add(subplot2, 1);
        plot.setOrientation(PlotOrientation.VERTICAL);
        return plot;
    }

}
