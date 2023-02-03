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
 * -------------------------
 * StandardDialFrameTests.java
 * -------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.BasicStroke;
import java.awt.Color;
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

import org.jfree.chart.plot.dial.StandardDialFrame;

/**
 * Tests for the {@link StandardDialFrame} class.
 */
public class StandardDialFrameTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardDialFrameTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardDialFrameTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals82() { 
     StandardDialFrame f1 = new StandardDialFrame(); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     assertTrue(f1.equals(f2)); 
     f1.setRadius(0.5); 
     assertFalse(f1.equals(f2)); 
     f2.setRadius(0.5); 
     assertTrue(f1.equals(f2)); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setStroke(new BasicStroke(1.1f)); 
     assertFalse(f1.equals(f2)); 
     f2.setStroke(new BasicStroke(1.1f)); 
     assertTrue(f1.equals(f2)); 
     f1.setVisible(false); 
     assertFalse(f1.equals(f2)); 
     f2.setVisible(false); 
     assertTrue(f1.equals(f2)); 
 }
public void testHashCode457() { 
     StandardDialFrame f1 = new StandardDialFrame(); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     assertTrue(f1.equals(f2)); 
     int h1 = f1.hashCode(); 
     int h2 = f2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testEquals458() { 
     StandardDialFrame f1 = new StandardDialFrame(); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     assertTrue(f1.equals(f2)); 
     f1.setRadius(0.1); 
     assertFalse(f1.equals(f2)); 
     f2.setRadius(0.1); 
     assertTrue(f1.equals(f2)); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setStroke(new BasicStroke(1.1f)); 
     assertFalse(f1.equals(f2)); 
     f2.setStroke(new BasicStroke(1.1f)); 
     assertTrue(f1.equals(f2)); 
     f1.setVisible(false); 
     assertFalse(f1.equals(f2)); 
     f2.setVisible(false); 
     assertTrue(f1.equals(f2)); 
 }
public void testEquals459() { 
     StandardDialFrame f1 = new StandardDialFrame(); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     assertTrue(f1.equals(f2)); 
     f1.setRadius(0.5); 
     assertFalse(f1.equals(f2)); 
     f2.setRadius(0.5); 
     assertTrue(f1.equals(f2)); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setVisible(false); 
     assertFalse(f1.equals(f2)); 
     f2.setVisible(false); 
     assertTrue(f1.equals(f2)); 
 }
public void testEquals460() { 
     StandardDialFrame f1 = new StandardDialFrame(); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     assertTrue(f1.equals(f2)); 
     f1.setRadius(0.5); 
     assertFalse(f1.equals(f2)); 
     f2.setRadius(0.5); 
     assertTrue(f1.equals(f2)); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(f1.equals(f2)); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(f1.equals(f2)); 
     f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(f1.equals(f2)); 
     f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(f1.equals(f2)); 
     f1.setStroke(new BasicStroke(1.1f)); 
     assertFalse(f1.equals(f2)); 
     f2.setStroke(new BasicStroke(1.1f)); 
     assertTrue(f1.equals(f2)); 
     f1.setVisible(false); 
     assertFalse(f1.equals(f2)); 
     f2.setVisible(false); 
     assertTrue(f1.equals(f2)); 
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
