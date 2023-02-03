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
 * --------------------------------
 * CategoryTableXYDatasetTests.java
 * --------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Oct-2005 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.data.xy.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.CategoryTableXYDataset;

/**
 * Tests for the {@link CategoryTableXYDataset} class.
 */
public class CategoryTableXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryTableXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryTableXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testCloning619() { 
     CategoryTableXYDataset d1 = new CategoryTableXYDataset(); 
     d1.add(1.0, 1.1, "Series 1"); 
     d1.add(2.0, 2.2, "Series 1"); 
     CategoryTableXYDataset d2 = null; 
     try { 
         d2 = (CategoryTableXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(3.0, 3.3, "Series 1"); 
     assertFalse(d1.equals(d2)); 
     d2.add(3.0, 3.3, "Series 1"); 
     assertTrue(d1.equals(d2)); 
     d1.setIntervalPositionFactor(0.33); 
     assertFalse(d1.equals(d2)); 
     d2.setIntervalPositionFactor(0.33); 
     assertTrue(d1.equals(d2)); 
 } 


public void testCloning2714() { 
     CategoryTableXYDataset d1 = new CategoryTableXYDataset(); 
     d1.add(1.0, 1.1, "Series 1"); 
     d1.add(2.0, 2.2, "Series 1"); 
     d1.setIntervalWidth(1.23); 
     CategoryTableXYDataset d2 = null; 
     try { 
         d2 = (CategoryTableXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(3.0, 3.3, "Series 1"); 
     assertFalse(d1.equals(d2)); 
     d2.add(3.0, 3.3, "Series 1"); 
     assertTrue(d1.equals(d2)); 
     d1.setIntervalPositionFactor(0.33); 
     assertFalse(d1.equals(d2)); 
     d2.setIntervalPositionFactor(0.33); 
     assertTrue(d1.equals(d2)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Another check for cloning - making sure it works for a customised
     * interval delegate.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * This is a test for bug 1312066 - adding a new series should trigger a
     * recalculation of the interval width, if it is being automatically
     * calculated.
     */
    
}
