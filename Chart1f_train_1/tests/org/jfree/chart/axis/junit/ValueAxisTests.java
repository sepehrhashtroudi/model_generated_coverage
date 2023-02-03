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
 * -------------------
 * ValueAxisTests.java
 * -------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Aug-2003 : Version 1 (DG);
 * 22-Mar-2007 : Extended testEquals() for new field (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link ValueAxis} class.
 */
public class ValueAxisTests extends TestCase {

    private static final double EPSILON = 0.000000001;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ValueAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ValueAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that cloning works.
     */

public void testAxisMargins360() { 
     XYSeries series = new XYSeries("S1"); 
     series.add(100.0, 1.1); 
     series.add(200.0, 2.2); 
     XYSeriesCollection dataset = new XYSeriesCollection(series); 
     dataset.setIntervalWidth(0.0); 
     JFreeChart chart = ChartFactory.createScatterPlot("Title", "X", "Y", dataset, false); 
     ValueAxis domainAxis = ((XYPlot) chart.getPlot()).getDomainAxis(); 
     Range r = domainAxis.getRange(); 
     assertEquals(110.0, r.getLength(), EPSILON); 
     domainAxis.setLowerMargin(0.10); 
     domainAxis.setUpperMargin(0.10); 
     r = domainAxis.getRange(); 
     assertEquals(120.0, r.getLength(), EPSILON); 
 } 


public void testEquals361() { 
     NumberAxis a1 = new NumberAxis("Test"); 
     NumberAxis a2 = new NumberAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     a1.setAxisLineVisible(false); 
     assertFalse(a1.equals(a2)); 
     a2.setAxisLineVisible(false); 
     assertTrue(a1.equals(a2)); 
     a1.setPositiveArrowVisible(true); 
     assertFalse(a1.equals(a2)); 
     a2.setPositiveArrowVisible(true); 
     assertTrue(a1.equals(a2)); 
     a1.setNegativeArrowVisible(true); 
     assertFalse(a1.equals(a2)); 
     a2.setNegativeArrowVisible(true); 
     assertTrue(a1.equals(a2)); 
     a1.setAxisLinePaint(Color.blue); 
     assertFalse(a1.equals(a2)); 
     a2.setAxisLinePaint(Color.blue); 
     assertTrue(a1.equals(a2)); 
     Stroke stroke = new BasicStroke(2.0f); 
     a1.setAxisLineStroke(stroke); 
     assertFalse(a1.equals(a2)); 
     a2.setAxisLineStroke(stroke); 
     assertTrue(a1.equals(a2)); 
     a1.setInverted(true); 
     assertFalse(a1.equals(a2)); 
     a2.setInverted(true); 
     assertTrue(a1.equals(a2)); 
     a1.setRange(new Range(50.0, 75.0)); 
     assertFalse(a1.equals(a2)); 
     a2.setRange(new Range(50.0, 75.0)); 
     assertTrue(a1.equals(a2)); 
     a1.setAutoRange(true); 
     assertFalse(a1.equals(a2)); 
     a2.setAutoRange(true); 
     assertTrue(a1.equals(a2)); 
     a1.setAutoRangeMinimumSize(3.33); 
     assertFalse(a1.equals(a2)); 
     a2.setAutoRangeMinimumSize(3.33); 
     assertTrue(a1.equals(a2)); 
     a1.setDefaultAutoRange(new Range(1.2, 3.4)); 
     assertFalse(a1.equals(a2)); 
     a2.setDefaultAutoRange(new Range(1.2, 3.4)); 
     assertTrue(a1.equals(a2)); 
     a1.setUpperMargin(0.09); 
     assertFalse(a1.equals(a2)); 
     a2.setUpperMargin(0.09); 
     assertTrue(a1.equals(a2)); 
     a1.setLowerMargin(0.09); 
     assertFalse(a1.equals(a2)); 
     a2.setLowerMargin(0.09); 
     assertTrue(a1.equals(a2)); 
     a1.setFixedAutoRange(50.0); 
     assertFalse(a1.equals(a2)); 
     a2.setFixedAutoRange(50.0); 
     assertTrue(a1.equals(a2)); 
     a1.setAutoTickUnitSelection(false); 
     assertFalse(a1.equals(a2)); 
     a2.setAutoTickUnitSelection(false); 
     assertTrue(a1.equals(a2)); 
     a1.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); 
     assertFalse(a1.equals(a2)); 
     a2.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); 
     assertTrue(a1.equals(a2)); 
     a1.setVerticalTickLabels(true); 
     assertFalse(a1.equals(a2)); 
     a2.setVerticalTickLabels(true); 
     assertTrue(a1.equals(a2)); 
 } 

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Tests the the lower and upper margin settings produce the expected
     * results.
     */
    

}
