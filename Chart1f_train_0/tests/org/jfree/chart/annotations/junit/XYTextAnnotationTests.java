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
 * --------------------------
 * XYTextAnnotationTests.java
 * --------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Aug-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added hashCode() test (DG);
 * 26-Jan-2006 : Extended equals() test (DG);
 * 20-Jun-2007 : Removed JCommon tests (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 * 12-Feb-2009 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

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

import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link XYTextAnnotation} class.
 */
public class XYTextAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYTextAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYTextAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testHashCode64() { 
     XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0); 
     XYTextAnnotation a2 = new XYTextAnnotation("Text", 10.0, 20.0); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testEquals350() { 
     XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0); 
     XYTextAnnotation a2 = new XYTextAnnotation("Text", 10.0, 20.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new XYTextAnnotation("ABC", 10.0, 20.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new XYTextAnnotation("ABC", 10.0, 20.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new XYTextAnnotation("ABC", 11.0, 20.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new XYTextAnnotation("ABC", 11.0, 20.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new XYTextAnnotation("ABC", 11.0, 22.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new XYTextAnnotation("ABC", 11.0, 22.0); 
     assertTrue(a1.equals(a2)); 
     a1.setFont(new Font("Serif", Font.PLAIN, 23)); 
     assertFalse(a1.equals(a2)); 
     a2.setFont(new Font("Serif", Font.PLAIN, 23)); 
     assertTrue(a1.equals(a2)); 
     GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow); 
     GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow); 
     a1.setPaint(gp1); 
     assertFalse(a1.equals(a2)); 
     a2.setPaint(gp2); 
     assertTrue(a1.equals(a2)); 
     a1.setRotationAnchor(TextAnchor.BASELINE_RIGHT); 
     assertFalse(a1.equals(a2)); 
     a2.setRotationAnchor(TextAnchor.BASELINE_RIGHT); 
     assertTrue(a1.equals(a2)); 
     a1.setRotationAngle(12.3); 
     assertFalse(a1.equals(a2)); 
     a2.setRotationAngle(12.3); 
     assertTrue(a1.equals(a2)); 
     a1.setTextAnchor(TextAnchor.BASELINE_RIGHT); 
     assertFalse(a1.equals(a2)); 
     a2.setTextAnchor(TextAnchor.BASELINE_RIGHT); 
     assertTrue(a1.equals(a2)); 
     a1.setBackgroundPaint(gp1); 
     assertFalse(a1.equals(a2)); 
     a2.setBackgroundPaint(gp1); 
     assertTrue(a1.equals(a2)); 
     a1.setOutlinePaint(gp1); 
     assertFalse(a1.equals(a2)); 
     a2.setOutlinePaint(gp1); 
     assertTrue(a1.equals(a2)); 
     a1.setOutlineStroke(new BasicStroke(1.2f)); 
     assertFalse(a1.equals(a2)); 
     a2.setOutlineStroke(new BasicStroke(1.2f)); 
     assertTrue(a1.equals(a2)); 
     a1.setOutlineVisible(!a1.isOutlineVisible()); 
     assertFalse(a1.equals(a2)); 
     a2.setOutlineVisible(a1.isOutlineVisible()); 
     assertTrue(a1.equals(a2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
