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
 * ---------------------
 * ValueMarkerTests.java
 * ---------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Aug-2003 : Version 1 (DG);
 * 14-Jun-2004 : Renamed MarkerTests --> ValueMarkerTests (DG);
 * 01-Jun-2005 : Strengthened equals() test (DG);
 * 05-Sep-2006 : Added checks for MarkerChangeEvent generation (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 26-Sep-2007 : Added test1802195() method (DG);
 * 08-Oct-2007 : Added test1808376() method (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link ValueMarker} class.
 */
public class ValueMarkerTests
    extends TestCase
    implements MarkerChangeListener {


    MarkerChangeEvent lastEvent;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ValueMarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ValueMarkerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testCloning898() { 
     ValueMarker m1 = new ValueMarker(45.0); 
     ValueMarker m2 = null; 
     try { 
         m2 = (ValueMarker) m1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(m1 != m2); 
     assertTrue(m1.getClass() == m2.getClass()); 
     assertTrue(m1.equals(m2)); 
 }
public void testGetSetStroke899() { 
     ValueMarker m = new ValueMarker(1.0); 
     m.addChangeListener(this); 
     this.lastEvent = null; 
     assertEquals(new BasicStroke(0.5f), m.getStroke()); 
     m.setStroke(new BasicStroke(1.1f)); 
     assertEquals(new BasicStroke(1.1f), m.getStroke()); 
     assertEquals(m, this.lastEvent.getMarker()); 
     try { 
         m.setStroke(null); 
         fail("Expected an IllegalArgumentException for null."); 
     } catch (IllegalArgumentException e) { 
         assertTrue(true); 
     } 
 }
public void testGetSetValue900() { 
     ValueMarker m = new ValueMarker(1.1); 
     m.addChangeListener(this); 
     this.lastEvent = null; 
     assertEquals(1.1, m.getValue(), EPSILON); 
     m.setValue(0.5); 
     assertEquals(0.5, m.getValue(), EPSILON); 
     assertEquals(m, this.lastEvent.getMarker()); 
 }
public void testEquals901() { 
     Marker m1 = new ValueMarker(45.0); 
     Marker m2 = new ValueMarker(45.0); 
     assertTrue(m1.equals(m2)); 
     assertTrue(m2.equals(m1)); 
     m1.setPaint(new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.red)); 
     assertFalse(m1.equals(m2)); 
     m2.setPaint(new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.red)); 
     assertTrue(m1.equals(m2)); 
     BasicStroke stroke = new BasicStroke(2.2f); 
     m1.setStroke(stroke); 
     assertFalse(m1.equals(m2)); 
     m2.setStroke(stroke); 
     assertTrue(m1.equals(m2)); 
     m1.setOutlinePaint(new GradientPaint(4.0f, 3.0f, Color.yellow, 2.0f, 1.0f, Color.white)); 
     assertFalse(m1.equals(m2)); 
     m2.setOutlinePaint(new GradientPaint(4.0f, 3.0f, Color.yellow, 2.0f, 1.0f, Color.white)); 
     assertTrue(m1.equals(m2)); 
     m1.setOutlineStroke(stroke); 
     assertFalse(m1.equals(m2)); 
     m2.setOutlineStroke(stroke); 
     assertTrue(m1.equals(m2)); 
     m1.setAlpha(0.1f); 
     assertFalse(m1.equals(m2)); 
     m2.setAlpha(0.1f); 
     assertTrue(m1.equals(m2)); 
     m1.setLabel("New Label");
}

public void testGetSetOutlinePaint1253() { 
     ValueMarker m = new ValueMarker(1.1); 
     m.addChangeListener(this); 
     this.lastEvent = null; 
     assertEquals(Color.black, m.getOutlinePaint()); 
     m.setOutlinePaint(Color.red); 
     assertEquals(Color.red, m.getOutlinePaint()); 
     assertEquals(m, this.lastEvent.getMarker()); 
     try { 
         m.setOutlinePaint(null); 
         fail("Expected an IllegalArgumentException for null."); 
     } catch (IllegalArgumentException e) { 
         assertTrue(true); 
     } 
 }
public void testSerialization1258() { 
     ValueMarker m1 = new ValueMarker(45.0); 
     ValueMarker m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (ValueMarker) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
     } 
     boolean b = m1.equals(m2); 
     assertTrue(b); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

   /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.000000001;

    /**
     * Some checks for the getValue() and setValue() methods.
     */
    

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void markerChanged(MarkerChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * A test for bug 1802195.
     */
    

    /**
     * A test for bug report 1808376.
     */
    

}
