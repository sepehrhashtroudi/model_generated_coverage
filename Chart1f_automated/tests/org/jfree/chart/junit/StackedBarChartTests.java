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
 * StackedBarChartTests.java
 * -------------------------
 * (C) Copyright 2002-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 11-Jun-2002 : Version 1 (DG);
 * 25-Jun-2002 : Removed unnecessary import (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 29-Jan-2004 : Renamed StackedHorizontalBarChartTests
 *               --> StackedBarChartTests (DG);
 * 27-Jun-2007 : Updated for method name change in CategoryItemRenderer
 *               interface (DG);
 *
 */

package org.jfree.chart.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

/**
 * Tests for a stacked bar chart.
 */
public class StackedBarChartTests extends TestCase {

    /** A chart. */
    private JFreeChart chart;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StackedBarChartTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StackedBarChartTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        this.chart = createChart();
    }

    /**
     * Draws the chart with a null info object to make sure that no exceptions
     * are thrown (a problem that was occurring at one point).
     */
    

    /**
     * Replaces the dataset and checks that it has changed as expected.
     */
    

    /**
     * Check that setting a tool tip generator for a series does override the
     * default generator.
     */
    

    /**
     * Check that setting a URL generator for a series does override the
     * default generator.
     */
    

    /**
     * Create a stacked bar chart with sample data in the range -3 to +3.
     *
     * @return The chart.
     */
    private static JFreeChart createChart() {
        Number[][] data = new Integer[][]
            {{new Integer(-3), new Integer(-2)},
             {new Integer(-1), new Integer(1)},
             {new Integer(2), new Integer(3)}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("S",
                "C", data);
        return ChartFactory.createStackedBarChart("Stacked Bar Chart", 
                "Domain", "Range", dataset, true);
    }

    /**
     * A chart change listener.
     */
    static class LocalListener implements ChartChangeListener {

        /** A flag. */
        private boolean flag = false;

        /**
         * Event handler.
         *
         * @param event  the event.
         */
        public void chartChanged(ChartChangeEvent event) {
            this.flag = true;
        }

    }

}
