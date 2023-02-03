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
public void testEquals59() { 
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
}

public void testSerialization379() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(35.0, "S1", "C1"); 
     dataset.addValue(45.0, "S1", "C2"); 
     dataset.addValue(55.0, "S1", "C3"); 
     dataset.addValue(15.0, "S1", "C4"); 
     dataset.addValue(25.0, "S1", "C5"); 
     SpiderWebPlot p1 = new SpiderWebPlot(dataset); 
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
public void testSerialization380() { 
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
