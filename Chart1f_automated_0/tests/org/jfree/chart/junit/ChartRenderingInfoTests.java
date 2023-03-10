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
 * ChartRenderingInfoTests.java
 * ----------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Mar-2004 : Version 1 (DG);
 * 30-Nov-2005 : Updated for removed field in ChartRenderingInfo (DG);
 *
 */

package org.jfree.chart.junit;

import java.awt.Rectangle;
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

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.StandardEntityCollection;

/**
 * Tests for the {@link ChartRenderingInfo} class.
 */
public class ChartRenderingInfoTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ChartRenderingInfoTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ChartRenderingInfoTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testCloning1172() { 
     ChartRenderingInfo i1 = new ChartRenderingInfo(); 
     ChartRenderingInfo i2 = null; 
     try { 
         i2 = (ChartRenderingInfo) i1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(i1 != i2); 
     assertTrue(i1.getClass() == i2.getClass()); 
     assertTrue(i1.equals(i2)); 
     i1.getChartArea().setRect(4.0, 3.0, 2.0, 1.0); 
     assertFalse(i1.equals(i2)); 
     i2.getChartArea().setRect(4.0, 3.0, 2.0, 1.0); 
     assertTrue(i1.equals(i2)); 
     i1.getEntityCollection().add(new ChartEntity(new Rectangle(1, 2, 2, 1))); 
     assertFalse(i1.equals(i2)); 
     i2.getEntityCollection().add(new ChartEntity(new Rectangle(1, 2, 2, 1))); 
     assertTrue(i1.equals(i2)); 
 }
public void testSerialization1173() { 
     ChartRenderingInfo i1 = new ChartRenderingInfo(); 
     ChartRenderingInfo i2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(i1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         i2 = (ChartRenderingInfo) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
     } 
     assertEquals(i1, i2); 
     assertEquals(i2, i2); 
     i1.getChartArea().setRect(4.0, 3.0, 2.0, 1.0); 
     assertFalse(i1.equals(i2)); 
     i2.getChartArea().setRect(4.0, 3.0, 2.0, 1.0); 
     assertTrue(i1.equals(i2)); 
     i1.getEntityCollection().add(new ChartEntity(new Rectangle(1, 2, 2, 1))); 
     assertFalse(i1.equals(i2)); 
     i2.getEntityCollection().add(new ChartEntity(new Rectangle(1, 2, 2, 1))); 
     assertTrue(i1.equals(i2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    
}
