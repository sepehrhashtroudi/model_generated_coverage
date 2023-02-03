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
 * ------------------------------
 * ComparableObjectItemTests.java
 * ------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 20-Oct-2006 : Version 1 (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.ComparableObjectItem;

/**
 * Tests for the {@link ComparableObjectItem} class.
 */
public class ComparableObjectItemTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ComparableObjectItemTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ComparableObjectItemTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructor.
     */

public void testConstructor407() { 
     boolean pass = false; 
     try { 
         new ComparableObjectItem(null, "XYZ"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testCompareTo408() { 
     ComparableObjectItem item1 = new ComparableObjectItem(new Integer(1), "XYZ"); 
     ComparableObjectItem item2 = new ComparableObjectItem(new Integer(2), "XYZ"); 
     ComparableObjectItem item3 = new ComparableObjectItem(new Integer(3), "XYZ"); 
     ComparableObjectItem item4 = new ComparableObjectItem(new Integer(1), "XYZ"); 
     assertTrue(item2.compareTo(item1) > 0); 
     assertTrue(item3.compareTo(item1) > 0); 
     assertTrue(item4.compareTo(item1) == 0); 
     assertTrue(item1.compareTo(item2) < 0); 
 } 


public void testEquals409() { 
     ComparableObjectItem item1 = new ComparableObjectItem(new Integer(1), "XYZ"); 
     ComparableObjectItem item2 = new ComparableObjectItem(new Integer(1), "XYZ"); 
     assertTrue(item1.equals(item2)); 
     assertTrue(item2.equals(item1)); 
     item1 = new ComparableObjectItem(new Integer(2), "XYZ"); 
     assertFalse(item1.equals(item2)); 
     item2 = new ComparableObjectItem(new Integer(2), "XYZ"); 
     assertTrue(item1.equals(item2)); 
     item1 = new ComparableObjectItem(new Integer(2), null); 
     assertFalse(item1.equals(item2)); 
     item2 = new ComparableObjectItem(new Integer(2), null); 
     assertTrue(item1.equals(item2)); 
 } 

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the compareTo() method.
     */
    

}
