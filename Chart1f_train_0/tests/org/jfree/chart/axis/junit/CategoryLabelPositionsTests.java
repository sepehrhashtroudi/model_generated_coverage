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
 * CategoryLabelPositionsTests.java
 * --------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-Feb-2004 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.util.RectangleAnchor;

/**
 * Tests for the {@link CategoryLabelPositions} class.
 */
public class CategoryLabelPositionsTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryLabelPositionsTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryLabelPositionsTests(String name) {
        super(name);
    }

    private static final RectangleAnchor RA_TOP = RectangleAnchor.TOP;
    private static final RectangleAnchor RA_BOTTOM = RectangleAnchor.BOTTOM;

    /**
     * Check that the equals method distinguishes all fields.
     */

public void testHashCode307() { 
     CategoryLabelPositions p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     CategoryLabelPositions p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(p1.equals(p2)); 
     int h1 = p1.hashCode(); 
     int h2 = p2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testEquals387() { 
     CategoryLabelPositions p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     CategoryLabelPositions p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertEquals(p1, p2); 
     p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(!p1.equals(p2)); 
     p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(p1.equals(p2)); 
     p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(!p1.equals(p2)); 
     p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(p1.equals(p2)); 
     p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(!p1.equals(p2)); 
     p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER)); 
     assertTrue(p1.equals(p2)); 
     p1 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER)); 
     assertTrue(!p1.equals(p2)); 
     p2 = new CategoryLabelPositions(new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER), new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER)); 
     assertTrue(p1.equals(p2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
