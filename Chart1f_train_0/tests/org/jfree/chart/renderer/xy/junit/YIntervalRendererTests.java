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
 * ---------------------------
 * YIntervalRendererTests.java
 * ---------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 20-Feb-2007 : Extended the testEquals() checks (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 22-Apr-2008 : Added testPublicCloneable() (DG);
 * 26-May-2008 : Extended testEquals() (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.IntervalXYItemLabelGenerator;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardXYSeriesLabelGenerator;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.YIntervalRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;

/**
 * Tests for the {@link YIntervalRenderer} class.
 */
public class YIntervalRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(YIntervalRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public YIntervalRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testEquals150() { 
     YIntervalRenderer r1 = new YIntervalRenderer(); 
     YIntervalRenderer r2 = new YIntervalRenderer(); 
     assertEquals(r1, r2); 
     r1.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseToolTipGenerator(new StandardXYToolTipGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseToolTipGenerator(new StandardXYToolTipGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesURLGenerator(0, new StandardXYURLGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesURLGenerator(0, new StandardXYURLGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseURLGenerator(new StandardXYURLGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseURLGenerator(new StandardXYURLGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("X", 1.0, 2.0), Layer.FOREGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("X", 1.0, 2.0), Layer.FOREGROUND); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("X", 1.0, 2.0), Layer.BACKGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("X", 1.0, 2.0), Layer.BACKGROUND); 
     assertTrue(r1.equals(r2)); 
     r1.setDefaultEntityRadius(99); 
     assertFalse(r1.equals(r2)); 
     r2.setDefaultEntityRadius(99); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("{0} {1}")); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("{0} {1}")); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setAdditionalItemLabelGenerator(new IntervalXYItemLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setAdditionalItemLabelGenerator(new IntervalXYItemLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
 } 


public void testCloning416() { 
     YIntervalRenderer r1 = new YIntervalRenderer(); 
     YIntervalRenderer r2 = null; 
     try { 
         r2 = (YIntervalRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator()); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.FOREGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.FOREGROUND); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); 
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
    

}
