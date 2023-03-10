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
 * -------------------------
 * MultiplePiePlotTests.java
 * -------------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Jun-2005 : Version 1 (DG);
 * 06-Apr-2006 : Added tests for new fields (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 18-Apr-2008 : Added testConstructor() (DG);
 * 30-Dec-2008 : Updated for new legendItemShape field (DG);
 * 01-Jun-2009 : Added test for getLegendItems() bug, series key is not
 *               set (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.Color;
import java.awt.GradientPaint;
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
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.pie.PieDataset;

/**
 * Some tests for the {@link MultiplePiePlot} class.
 */
public class MultiplePiePlotTests extends TestCase
        implements PlotChangeListener {

    /** The last event received. */
    PlotChangeEvent lastEvent;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MultiplePiePlotTests.class);
    }

    /**
     * Receives a plot change event and records it.  Some tests will use this
     * to check that events have been generated (or not) when required.
     *
     * @param event  the event.
     */
    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MultiplePiePlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructors.
     */

public void testGetLegendItems100() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(35.0, "S1", "C1"); 
     dataset.addValue(45.0, "S1", "C2"); 
     dataset.addValue(55.0, "S2", "C1"); 
     dataset.addValue(15.0, "S2", "C2"); 
     MultiplePiePlot plot = new MultiplePiePlot(dataset); 
     JFreeChart chart = new JFreeChart(plot); 
     LegendItemCollection legendItems = plot.getLegendItems(); 
     assertEquals(2, legendItems.getItemCount()); 
     LegendItem item1 = legendItems.get(0); 
     assertEquals("S1", item1.getLabel()); 
     assertEquals("S1", item1.getSeriesKey()); 
     assertEquals(0, item1.getSeriesIndex()); 
     assertEquals(dataset, item1.getDataset()); 
     assertEquals(0, item1.getDatasetIndex()); 
     LegendItem item2 = legendItems.get(1); 
     assertEquals("S2", item2.getLabel()); 
     assertEquals("S2", item2.getSeriesKey()); 
     assertEquals(1, item2.getSeriesIndex()); 
     assertEquals(dataset, item2.getDataset()); 
     assertEquals(0, item2.getDatasetIndex()); 
 } 


public void testEquals153() { 
     MultiplePiePlot p1 = new MultiplePiePlot(); 
     MultiplePiePlot p2 = new MultiplePiePlot(); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.equals(p1)); 
     p1.setDataExtractOrder(TableOrder.BY_ROW); 
     assertFalse(p1.equals(p2)); 
     p2.setDataExtractOrder(TableOrder.BY_ROW); 
     assertTrue(p1.equals(p2)); 
     p1.setLimit(1.23); 
     assertFalse(p1.equals(p2)); 
     p2.setLimit(1.23); 
     assertTrue(p1.equals(p2)); 
     p1.setAggregatedItemsKey("Aggregated Items"); 
     assertFalse(p1.equals(p2)); 
     p2.setAggregatedItemsKey("Aggregated Items"); 
     assertTrue(p1.equals(p2)); 
     p1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(p1.equals(p2)); 
     p2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(p1.equals(p2)); 
     p1.setPieChart(ChartFactory.createPieChart("Title", null, true)); 
     assertFalse(p1.equals(p2)); 
     p2.setPieChart(ChartFactory.createPieChart("Title", null, true)); 
     assertTrue(p1.equals(p2)); 
     p1.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(p1.equals(p2)); 
     p2.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(p1.equals(p2)); 
 } 


public void testCloning154() { 
     MultiplePiePlot p1 = new MultiplePiePlot(); 
     Rectangle2D rect = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0); 
     p1.setLegendItemShape(rect); 
     MultiplePiePlot p2 = null; 
     try { 
         p2 = (MultiplePiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     rect.setRect(2.0, 3.0, 4.0, 5.0); 
     assertFalse(p1.equals(p2)); 
 } 

    

    /**
     * Check that the equals() method distinguishes the required fields.
     */
    

    /**
     * Some basic checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Fetches the legend items and checks the values.
     */
    

}
