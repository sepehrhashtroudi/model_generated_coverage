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
 * ------------------------
 * CategoryMarkerTests.java
 * ------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Mar-2005 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.junit;

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

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.CategoryMarker;

/**
 * Some tests for the {@link CategoryMarker} class.
 */
public class CategoryMarkerTests extends TestCase
        implements MarkerChangeListener {

    MarkerChangeEvent lastEvent;

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void markerChanged(MarkerChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryMarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryMarkerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testGetSetKey481() { 
     CategoryMarker m = new CategoryMarker("X"); 
     m.addChangeListener(this); 
     this.lastEvent = null; 
     assertEquals("X", m.getKey()); 
     m.setKey("Y"); 
     assertEquals("Y", m.getKey()); 
     assertEquals(m, this.lastEvent.getMarker()); 
     try { 
         m.setKey(null); 
         fail("Expected an IllegalArgumentException for null."); 
     } catch (IllegalArgumentException e) { 
         assertTrue(true); 
     } 
 } 


public void testCloning628() { 
     CategoryMarker m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(1.1f)); 
     CategoryMarker m2 = null; 
     try { 
         m2 = (CategoryMarker) m1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(m1 != m2); 
     assertTrue(m1.getClass() == m2.getClass()); 
     assertTrue(m1.equals(m2)); 
 } 

    

    /**
     * Check cloning.
     */
    

   /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getKey() and setKey() methods.
     */
    

    /**
     * Some checks for the getDrawAsLine() and setDrawAsLine() methods.
     */
    
}
