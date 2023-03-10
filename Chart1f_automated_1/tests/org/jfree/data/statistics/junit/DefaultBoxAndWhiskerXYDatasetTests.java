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
public void testAdd486() { 
     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("S1"); 
     BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()); 
     dataset.add(new Date(33L), item1); 
     assertEquals(1.0, dataset.getY(0, 0).doubleValue(), EPSILON); 
     assertEquals(1.0, dataset.getMeanValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(2.0, dataset.getMedianValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(3.0, dataset.getQ1Value(0, 0).doubleValue(), EPSILON); 
     assertEquals(4.0, dataset.getQ3Value(0, 0).doubleValue(), EPSILON); 
     assertEquals(5.0, dataset.getMinRegularValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(6.0, dataset.getMaxRegularValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(7.0, dataset.getMinOutlier(0, 0).doubleValue(), EPSILON); 
     assertEquals(8.0, dataset.getMaxOutlier(0, 0).doubleValue(), EPSILON); 
     assertEquals(new Range(5.0, 6.0), dataset.getRangeBounds(false)); 
 }
public void testAdd487() { 
     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("S1"); 
     BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()); 
     dataset.add(new Date(33L), item1); 
     assertEquals(1.0, dataset.getY(0, 0).doubleValue(), EPSILON); 
     assertEquals(1.0, dataset.getMeanValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(2.0, dataset.getMedianValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(3.0, dataset.getQ1Value(0, 0).doubleValue(), EPSILON); 
     assertEquals(4.0, dataset.getQ3Value(0, 0).doubleValue(), EPSILON); 
     assertEquals(5.0, dataset.getMinRegularValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(6.0, dataset.getMaxRegularValue(0, 0).doubleValue(), EPSILON); 
     assertEquals(7.0, dataset.getMinRegularValue(0, 1).doubleValue(), EPSILON); 
     assertEquals(8.0, dataset.getMaxRegularValue(0, 1).doubleValue(), EPSILON); 
     assertEquals(new Range(5.0, 6.0), dataset.getRangeBounds(false)); 
 }
public void testCloning488() { 
     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("S1"); 
     DefaultBoxAndWhiskerXYDataset d2 = null; 
     try { 
         d2 = (DefaultBoxAndWhiskerXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(new Date(33L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertFalse(d1.equals(d2)); 
     d2.add(new Date(33L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); 
     assertTrue(d1.equals(d2)); 
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

