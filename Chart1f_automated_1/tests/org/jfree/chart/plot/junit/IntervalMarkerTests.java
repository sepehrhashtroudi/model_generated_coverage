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
 * IntervalMarkerTests.java
 * ------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 14-Jun-2004 : Version 1 (DG);
 * 05-Sep-2006 : Added checks for MarkerChangeEvents (DG);
 *
 */

package org.jfree.chart.plot.junit;

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
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.StandardGradientPaintTransformer;

/**
 * Tests for the {@link IntervalMarker} class.
 */
public class IntervalMarkerTests extends TestCase
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
        return new TestSuite(IntervalMarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public IntervalMarkerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testGetSetEndValue267() { 
     IntervalMarker m = new IntervalMarker(1.0, 2.0); 
     m.addChangeListener(this); 
     this.lastEvent = null; 
     assertEquals(2.0, m.getEndValue(), EPSILON); 
     m.setEndValue(0.5); 
     assertEquals(0.5, m.getEndValue(), EPSILON); 
 }
public void testEquals270() { 
     IntervalMarker m1 = new IntervalMarker(45.0, 50.0); 
     IntervalMarker m2 = new IntervalMarker(45.0, 50.0); 
     assertTrue(m1.equals(m2)); 
     assertTrue(m2.equals(m1)); 
     m1 = new IntervalMarker(44.0, 50.0); 
     assertFalse(m1.equals(m2)); 
     m2 = new IntervalMarker(44.0, 50.0); 
     assertTrue(m1.equals(m2)); 
     m1 = new IntervalMarker(44.0, 55.0); 
     assertFalse(m1.equals(m2)); 
     m2 = new IntervalMarker(44.0, 55.0); 
     assertTrue(m1.equals(m2)); 
     GradientPaintTransformer t = new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL); 
     m1.setGradientPaintTransformer(t); 
     assertFalse(m1.equals(m2)); 
     m2.setGradientPaintTransformer(t); 
     assertTrue(m1.equals(m2)); 
 }
public void testCloning271() { 
     IntervalMarker m1 = new IntervalMarker(1.0, 2.0); 
     IntervalMarker m2 = null; 
     try { 
         m2 = (IntervalMarker) m1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(m1 != m2); 
     assertTrue(m1.getClass() == m2.getClass()); 
     assertTrue(m1.equals(m2)); 
     m1.setStartValue(0.5); 
     assertFalse(m1.equals(m2)); 
     m2.setStartValue(0.5); 
     assertTrue(m1.equals(m2)); 
     m1.setEndValue(0.5); 
     assertFalse(m1.equals(m2)); 
     m2.setEndValue(0.5); 
     assertTrue(m1.equals(m2)); 
     GradientPaintTransformer t = new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL); 
     m1.setGradientPaintTransformer(t); 
     assertFalse(m1.equals(m2)); 
     m2.setGradientPaintTransformer(t); 
     assertTrue(m1.equals(m2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

   /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getStartValue() and setStartValue() methods.
     */
    

    /**
     * Some checks for the getEndValue() and setEndValue() methods.
     */
    
}
