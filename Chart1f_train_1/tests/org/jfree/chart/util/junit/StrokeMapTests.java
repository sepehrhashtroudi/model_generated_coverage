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
 * -------------------
 * StrokeMapTests.java
 * -------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 27-Sep-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.BasicStroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.StrokeMap;

/**
 * Some tests for the {@link StrokeMap} class.
 */
public class StrokeMapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StrokeMapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StrokeMapTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getStroke() method.
     */

public void testEquals269() { 
     StrokeMap m1 = new StrokeMap(); 
     StrokeMap m2 = new StrokeMap(); 
     assertTrue(m1.equals(m1)); 
     assertTrue(m1.equals(m2)); 
     assertFalse(m1.equals(null)); 
     assertFalse(m1.equals("ABC")); 
     m1.put("K1", new BasicStroke(1.1f)); 
     assertFalse(m1.equals(m2)); 
     m2.put("K1", new BasicStroke(1.1f)); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", new BasicStroke(2.2f)); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", new BasicStroke(2.2f)); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", null); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", null); 
     assertTrue(m1.equals(m2)); 
 } 


public void testGetStroke270() { 
     StrokeMap m1 = new StrokeMap(); 
     assertEquals(null, m1.getStroke("A")); 
     m1.put("A", new BasicStroke(1.1f)); 
     assertEquals(new BasicStroke(1.1f), m1.getStroke("A")); 
     m1.put("A", null); 
     assertEquals(null, m1.getStroke("A")); 
     boolean pass = false; 
     try { 
         m1.getStroke(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testPut271() { 
     StrokeMap m1 = new StrokeMap(); 
     m1.put("A", new BasicStroke(1.1f)); 
     assertEquals(new BasicStroke(1.1f), m1.getStroke("A")); 
     boolean pass = false; 
     try { 
         m1.put(null, new BasicStroke(1.1f)); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testSerialization2272() { 
     StrokeMap m1 = new StrokeMap(); 
     m1.put("K1", new BasicStroke(1.1f)); 
     m1.put("K2", new BasicStroke(2.2f)); 
     StrokeMap m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (StrokeMap) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(m1, m2); 
 } 

    

    /**
     * Some checks for the put() method.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Some checks for cloning.
     */
    

    /**
     * A check for serialization.
     */
    

    /**
     * A check for serialization.
     */
    

}

