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
 * XYBlockRendererTests.java
 * -------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Jul-2006 : Version 1 (DG);
 * 09-Mar-2007 : Added independence check to testCloning (DG);
 * 20-Jun-2007 : Updated for deprecated code removal (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.GrayPaintScale;
import org.jfree.chart.renderer.LookupPaintScale;
import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultXYZDataset;

/**
 * Tests for the {@link XYBlockRenderer} class.
 */
public class XYBlockRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYBlockRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYBlockRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testEquals290() { 
     XYBlockRenderer r1 = new XYBlockRenderer(); 
     XYBlockRenderer r2 = new XYBlockRenderer(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setBlockHeight(2.0); 
     assertFalse(r1.equals(r2)); 
     r2.setBlockHeight(2.0); 
     assertTrue(r1.equals(r2)); 
     r1.setBlockWidth(2.0); 
     assertFalse(r1.equals(r2)); 
     r2.setBlockWidth(2.0); 
     assertTrue(r1.equals(r2)); 
     r1.setPaintScale(new GrayPaintScale(0.0, 1.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setPaintScale(new GrayPaintScale(0.0, 1.0)); 
     assertTrue(r1.equals(r2)); 
 } 


public void testCloning568() { 
     XYBlockRenderer r1 = new XYBlockRenderer(); 
     LookupPaintScale scale1 = new LookupPaintScale(); 
     r1.setPaintScale(scale1); 
     XYBlockRenderer r2 = null; 
     try { 
         r2 = (XYBlockRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     scale1.add(0.5, Color.red); 
     assertFalse(r1.equals(r2)); 
     LookupPaintScale scale2 = (LookupPaintScale) r2.getPaintScale(); 
     scale2.add(0.5, Color.red); 
     assertTrue(r1.equals(r2)); 
 } 


public void testBug1766646B569() { 
     XYBlockRenderer r = new XYBlockRenderer(); 
     Range range = r.findRangeBounds(null); 
     assertTrue(range == null); 
     DefaultXYZDataset emptyDataset = new DefaultXYZDataset(); 
     range = r.findRangeBounds(emptyDataset); 
     assertTrue(range == null); 
 } 


public void testHashcode570() { 
     XYBlockRenderer r1 = new XYBlockRenderer(); 
     XYBlockRenderer r2 = new XYBlockRenderer(); 
     assertTrue(r1.equals(r2)); 
     int h1 = r1.hashCode(); 
     int h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A simple test for bug 1766646.
     */
    

    /**
     * A simple test for bug 1766646.
     */
    

}
