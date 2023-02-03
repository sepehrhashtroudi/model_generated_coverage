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
 * ---------------------------------------
 * DefaultBoxAndWhiskerXYDatasetTests.java
 * ---------------------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 12-Nov-2007 : Version 1 (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;

/**
 * Tests for the {@link DefaultBoxAndWhiskerXYDataset} class.
 */
public class DefaultBoxAndWhiskerXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultBoxAndWhiskerXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultBoxAndWhiskerXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testConstructor274() { 
     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("S1"); 
     assertEquals(1, dataset.getSeriesCount()); 
     assertEquals(0, dataset.getItemCount(0)); 
     assertTrue(Double.isNaN(dataset.getRangeLowerBound(false))); 
     assertTrue(Double.isNaN(dataset.getRangeUpperBound(false))); 
 } 


public void testEquals275() { 
     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("Series"); 
     DefaultBoxAndWhiskerXYDataset d2 = new DefaultBoxAndWhiskerXYDataset("Series"); 
     assertTrue(d1.equals(d2)); 
     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertFalse(d1.equals(d2)); 
     d2.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertTrue(d1.equals(d2)); 
 } 


public void testGetRangeBounds276() { 
     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("S"); 
     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(false)); 
     assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(true)); 
     d1.add(new Date(1L), new BoxAndWhiskerItem(1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, new ArrayList())); 
     assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(false)); 
     assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(true)); 
     d1.add(new Date(2L), new BoxAndWhiskerItem(2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, new ArrayList())); 
     assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(false)); 
     assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(true)); 
 } 


public void testCloning277() { 
     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("Series"); 
     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     DefaultBoxAndWhiskerXYDataset d2 = null; 
     try { 
         d2 = (DefaultBoxAndWhiskerXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(new Date(2L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertFalse(d1.equals(d2)); 
 } 

    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the add() method.
     */
    

    /**
     * Some basic checks for the constructor.
     */
    

    /**
     * Some checks for the getRangeBounds() method.
     */
    


}

