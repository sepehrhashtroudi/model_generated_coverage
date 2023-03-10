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
 * DateRangeTests.java
 * -------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Mar-2004 : Version 1 (DG);
 * 11-Jan-2005 : Added test to ensure Cloneable is not implemented (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.DateRange;

/**
 * Some tests for the {@link DateRange} class.
 */
public class DateRangeTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DateRangeTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DateRangeTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals949() { 
     DateRange r1 = new DateRange(new Date(1L), new Date(2L)); 
     DateRange r2 = new DateRange(new Date(1L), new Date(2L)); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1 = new DateRange(new Date(0L), new Date(2L)); 
     assertFalse(r1.equals(r2)); 
     r2 = new DateRange(new Date(0L), new Date(2L)); 
     assertTrue(r1.equals(r2)); 
     r1 = new DateRange(new Date(1L), new Date(3L)); 
     assertFalse(r1.equals(r2)); 
     r2 = new DateRange(new Date(1L), new Date(3L)); 
     assertTrue(r1.equals(r2)); 
 }
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * The {@link DateRange} class is immutable, so it doesn't need to
     * be cloneable.
     */
    

    /**
     * Confirm that a DateRange is immutable.
     */
    

}
