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
 * YWithXIntervalTests.java
 * ------------------------
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
import org.jfree.data.xy.YWithXInterval;

/**
 * Tests for the {@link YWithXInterval} class.
 */
public class YWithXIntervalTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(YWithXIntervalTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public YWithXIntervalTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testEquals141() { 
     YWithXInterval i1 = new YWithXInterval(1.0, 0.5, 1.5); 
     YWithXInterval i2 = new YWithXInterval(1.0, 0.5, 1.5); 
     assertEquals(i1, i2); 
     i1 = new YWithXInterval(1.1, 0.5, 1.5); 
     assertFalse(i1.equals(i2)); 
     i2 = new YWithXInterval(1.1, 0.5, 1.5); 
     assertTrue(i1.equals(i2)); 
     i1 = new YWithXInterval(1.1, 0.55, 1.5); 
     assertFalse(i1.equals(i2)); 
     i2 = new YWithXInterval(1.1, 0.55, 1.5); 
     assertTrue(i1.equals(i2)); 
     i1 = new YWithXInterval(1.1, 0.55, 1.55); 
     assertFalse(i1.equals(i2)); 
     i2 = new YWithXInterval(1.1, 0.55, 1.55); 
     assertTrue(i1.equals(i2)); 
 } 

    

    /**
     * This class is immutable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
