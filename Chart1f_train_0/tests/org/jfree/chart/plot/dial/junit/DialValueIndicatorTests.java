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
 * DialValueIndicatorTests.java
 * ----------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 24-Oct-2007 : Updated for API changes (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link DialValueIndicator} class.
 */
public class DialValueIndicatorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialValueIndicatorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialValueIndicatorTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testSerialization65() { 
     DialValueIndicator i1 = new DialValueIndicator(0); 
     DialValueIndicator i2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(i1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         i2 = (DialValueIndicator) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(i1, i2); 
 } 


public void testHashCode420() { 
     DialValueIndicator i1 = new DialValueIndicator(0); 
     DialValueIndicator i2 = new DialValueIndicator(0); 
     assertTrue(i1.equals(i2)); 
     int h1 = i1.hashCode(); 
     int h2 = i2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testEquals421() { 
     DialValueIndicator i1 = new DialValueIndicator(0); 
     DialValueIndicator i2 = new DialValueIndicator(0); 
     assertTrue(i1.equals(i2)); 
     i1.setDatasetIndex(99); 
     assertFalse(i1.equals(i2)); 
     i2.setDatasetIndex(99); 
     assertTrue(i1.equals(i2)); 
     i1.setAngle(43); 
     assertFalse(i1.equals(i2)); 
     i2.setAngle(43); 
     assertTrue(i1.equals(i2)); 
     i1.setRadius(0.77); 
     assertFalse(i1.equals(i2)); 
     i2.setRadius(0.77); 
     assertTrue(i1.equals(i2)); 
     i1.setFrameAnchor(RectangleAnchor.TOP_LEFT); 
     assertFalse(i1.equals(i2)); 
     i2.setFrameAnchor(RectangleAnchor.TOP_LEFT); 
     assertTrue(i1.equals(i2)); 
     i1.setTemplateValue(new Double(1.23)); 
     assertFalse(i1.equals(i2)); 
     i2.setTemplateValue(new Double(1.23)); 
     assertTrue(i1.equals(i2)); 
     i1.setFont(new Font("Dialog", Font.PLAIN, 7)); 
     assertFalse(i1.equals(i2)); 
     i2.setFont(new Font("Dialog", Font.PLAIN, 7)); 
     assertTrue(i1.equals(i2)); 
     i1.setPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertFalse(i1.equals(i2)); 
     i2.setPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertTrue(i1.equals(i2)); 
     i1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertFalse(i1.equals(i2)); 
     i2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertTrue(i1.equals(i2)); 
     i1.setOutlineStroke(new BasicStroke(1.1f)); 
     assertFalse(i1.equals(i2)); 
     i2.setOutlineStroke(new BasicStroke(1.1f)); 
     assertTrue(i1.equals(i2)); 
     i1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertFalse(i1.equals(i2)); 
     i2.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     assertTrue(i1.equals(i2)); 
     i1.setInsets(new RectangleInsets(1, 2, 3, 4)); 
     assertFalse(i1.equals(i2)); 
     i2.setInsets(new RectangleInsets(1, 2, 3, 4)); 
     assertTrue(i1.equals(i2)); 
     i1.setValueAnchor(RectangleAnchor.BOTTOM_LEFT); 
     assertFalse(i1.equals(i2)); 
     i2.setValueAnchor(RectangleAnchor.BOTTOM_LEFT); 
     assertTrue(i1.equals(i2)); 
     i1.setTextAnchor(TextAnchor.TOP_LEFT); 
     assertFalse(i1.equals(i2)); 
     i2.setTextAnchor(TextAnchor.TOP_LEFT); 
     assertTrue(i1.equals(i2)); 
     i1.setVisible(false); 
     assertFalse(i1.equals(i2)); 
     i2.setVisible(false); 
     assertTrue(i1.equals(i2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    


    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
