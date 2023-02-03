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
 * -----------------
 * PiePlotTests.java
 * -----------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 10-May-2005 : Strengthened equals() test (DG);
 * 27-Sep-2006 : Added tests for the getBaseSectionPaint() method (DG);
 * 23-Nov-2006 : Additional equals() and clone() tests (DG);
 * 17-Apr-2007 : Added check for label generator that returns a null label (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 31-Mar-2008 : Updated testEquals() (DG);
 * 10-Jul-2009 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.AttributedString;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.PieLabelLinkStyle;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.urls.CustomPieURLGenerator;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;

/**
 * Some tests for the {@link PiePlot} class.
 */
public class PiePlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PiePlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PiePlotTests(String name) {
        super(name);
    }

    /**
     * Test the equals() method.
     */
public void testCloning_URLGenerator12() { 
     CustomPieURLGenerator generator = new CustomPieURLGenerator(); 
     PiePlot p1 = new PiePlot(); 
     p1.setURLGenerator(generator); 
     PiePlot p2 = null; 
     try { 
         p2 = (PiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getURLGenerator() != p2.getURLGenerator()); 
 }
public void testDrawWithNullDataset44() { 
     JFreeChart chart = ChartFactory.createPieChart3D("Test", null, true); 
     boolean success = false; 
     try { 
         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
         Graphics2D g2 = image.createGraphics(); 
         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); 
         g2.dispose(); 
         success = true; 
     } catch (Exception e) { 
         success = false; 
     } 
     assertTrue(success); 
 }
public void testSerialization162() { 
     PiePlot p1 = new PiePlot(null); 
     PiePlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (PiePlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 }
public void testCloning165() { 
     StandardPieSectionLabelGenerator g1 = new StandardPieSectionLabelGenerator(); 
     StandardPieSectionLabelGenerator g2 = null; 
     try { 
         g2 = (StandardPieSectionLabelGenerator) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g1.getNumberFormat() != g2.getNumberFormat()); 
     assertTrue(g1.getPercentFormat() != g2.getPercentFormat()); 
 }
public void testCloning_URLGenerator167() { 
     CustomPieURLGenerator generator = new CustomPieURLGenerator(); 
     PiePlot p1 = new PiePlot(); 
     p1.setLegendLabelURLGenerator(generator); 
     PiePlot p2 = null; 
     try { 
         p2 = (PiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getLegendLabelURLGenerator() != p2.getLegendLabelURLGenerator()); 
 }
public void testEquals174() { 
     PiePlot plot1 = new PiePlot(); 
     PiePlot plot2 = new PiePlot(); 
     assertTrue(plot1.equals(plot2)); 
     assertTrue(plot2.equals(plot1)); 
     plot1.setInteriorGap(0.123); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setInteriorGap(0.123); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setInteriorGap(0.456); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setInteriorGap(0.456); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setStartAngle(0.456); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setStartAngle(0.456); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDirection(Rotation.ANTICLOCKWISE); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDirection(Rotation.ANTICLOCKWISE); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setIgnoreNullValues(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setIgnoreNullValues(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setIgnoreZeroValues(true); 
     assertFalse(plot1.equals(plot2)); 
     plot1.setIgnoreZeroValues(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setIgnoreZeroValues(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setIgnoreNullValues(true); 
     assertFalse(plot1.equals(plot2));
}

public void testSerialization293() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     PiePlot p1 = new PiePlot(dataset); 
     PiePlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (PiePlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 }
public void testGetLegendItems294() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     dataset.setValue("Item 1", 1.0); 
     dataset.setValue("Item 2", 2.0); 
     dataset.setValue("Item 3", 0.0); 
     dataset.setValue("Item 4", null); 
     PiePlot plot = new PiePlot(dataset); 
     plot.setIgnoreNullValues(false); 
     plot.setIgnoreZeroValues(false); 
     LegendItemCollection items = plot.getLegendItems(); 
     assertEquals(4, items.getItemCount()); 
     plot.setIgnoreNullValues(true); 
     items = plot.getLegendItems(); 
     assertEquals(3, items.getItemCount()); 
     plot.setIgnoreZeroValues(true); 
     items = plot.getLegendItems(); 
     assertEquals(2, items.getItemCount()); 
     dataset.setValue("Item 5", -1.0); 
     items = plot.getLegendItems(); 
     assertEquals(2, items.getItemCount()); 
 }
public void testGetLegendItems295() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     dataset.setValue("Item 1", 1.0); 
     dataset.setValue("Item 2", 2.0); 
     dataset.setValue("Item 3", 0.0); 
     dataset.setValue("Item 4", null); 
     PiePlot plot = new PiePlot(dataset); 
     plot.setIgnoreNullValues(false); 
     plot.setIgnoreZeroValues(false); 
     JFreeChart chart = new JFreeChart(plot); 
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
public void testCloning_URLGenerator302() { 
     CustomPieURLGenerator generator = new CustomPieURLGenerator(); 
     PiePlot p1 = new PiePlot(); 
     PiePlot p2 = null; 
     try { 
         p2 = (PiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getURLGenerator() != p2.getURLGenerator()); 
 }
    

    /**
     * Some basic checks for the clone() method.
     */
    

    /**
     * Check cloning of the urlGenerator field.
     */
    

    /**
     * Check cloning of the legendItemShape field.
     */
    

    /**
     * Check cloning of the legendLabelGenerator field.
     */
    

    /**
     * Check cloning of the legendLabelToolTipGenerator field.
     */
    

    /**
     * Check cloning of the legendLabelURLGenerator field.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getLegendItems() method.
     */
    

    /**
     * Check that the default base section paint is not null, and that you
     * can never set it to null.
     */
    

    static class NullLegendLabelGenerator implements PieSectionLabelGenerator {
        public AttributedString generateAttributedSectionLabel(
                PieDataset dataset, Comparable key) {
            return null;
        }
        public String generateSectionLabel(PieDataset dataset, Comparable key) {
            return null;
        }
    }

    /**
     * Draws a pie chart where the label generator returns null.
     */
    

}
