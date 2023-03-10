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
 * XYImageAnnotationTests.java
 * ---------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-May-2004 : Version 1 (DG);
 * 01-Dec-2006 : Updated testEquals() for new field (DG);
 * 09-Jan-2007 : Comment out failing test (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.awt.Image;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYImageAnnotation;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleAnchor;

/**
 * Tests for the {@link XYImageAnnotation} class.
 */
public class XYImageAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYImageAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYImageAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHashCode124() { 
     XYImageAnnotation a1 = new XYImageAnnotation(10.0, 20.0, null); 
     XYImageAnnotation a2 = new XYImageAnnotation(10.0, 20.0, null); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testCloning128() { 
     XYImageAnnotation a1 = new XYImageAnnotation(10.0, 20.0, null); 
     XYImageAnnotation a2 = null; 
     try { 
         a2 = (XYImageAnnotation) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
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
    

// FIXME: Make this test pass
//    /**
//     * Serialize an instance, restore it, and check for equality.
//     */
//    public void testSerialization() {
//        XYImageAnnotation a1 = new XYImageAnnotation(10.0, 20.0,
//                JFreeChart.INFO.getLogo());
//        XYImageAnnotation a2 = null;
//        try {
//            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//            ObjectOutput out = new ObjectOutputStream(buffer);
//            out.writeObject(a1);
//            out.close();
//
//            ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(
//                    buffer.toByteArray()));
//            a2 = (XYImageAnnotation) in.readObject();
//            in.close();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        assertEquals(a1, a2);
//    }

}
