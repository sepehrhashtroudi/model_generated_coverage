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
 * ---------------------
 * BooleanListTests.java
 * ---------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2007 : Version 1, copied over from JCommon (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.BooleanList;

/**
 * Tests for the {@link BooleanList} class.
 */
public class BooleanListTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BooleanListTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BooleanListTests(String name) {
        super(name);
    }

    /**
     * Tests the equals() method.
     */

public void testCloning412() { 
     BooleanList l1 = new BooleanList(); 
     l1.setBoolean(0, Boolean.TRUE); 
     l1.setBoolean(1, Boolean.FALSE); 
     l1.setBoolean(2, null); 
     BooleanList l2 = null; 
     try { 
         l2 = (BooleanList) l1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("BooleanListTests.testCloning: failed to clone."); 
     } 
     assertTrue(l1 != l2); 
     assertTrue(l1.getClass() == l2.getClass()); 
     assertTrue(l1.equals(l2)); 
     l2.setBoolean(0, Boolean.FALSE); 
     assertFalse(l1.equals(l2)); 
 } 


public void testHashCode413() { 
     BooleanList l1 = new BooleanList(); 
     BooleanList l2 = new BooleanList(); 
     assertTrue(l1.hashCode() == l2.hashCode()); 
     l1.setBoolean(0, Boolean.TRUE); 
     assertFalse(l1.hashCode() == l2.hashCode()); 
     l2.setBoolean(0, Boolean.TRUE); 
     assertTrue(l1.hashCode() == l2.hashCode()); 
 } 

    


    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the hashCode() method.
     */
    
}
