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
 * -------------------------------
 * CategoryLabelPositionTests.java
 * -------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-Feb-2004 : Version 1 (DG);
 * 07-Jan-2005 : Improved testEquals() code and added hashCode() test (DG);
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
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.util.RectangleAnchor;

/**
 * Tests for the {@link CategoryLabelPosition} class.
 */
public class CategoryLabelPositionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryLabelPositionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryLabelPositionTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method can distinguish all fields.
     */
public void testCategoryLabelPosition3929() { try { CategoryLabelPosition m = new CategoryLabelPosition(); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } try { CategoryLabelPosition m = new CategoryLabelPosition(); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } try { CategoryLabelPosition m = new CategoryLabelPosition(); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } try { CategoryLabelPosition m = new CategoryLabelPosition(); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } }
public void testEquals3945() { CategoryLabelPosition p1 = new CategoryLabelPosition(); CategoryLabelPosition p2 = new CategoryLabelPosition(); assertEquals(p1, p2); }
public void testEquals3951() { CategoryLabelPosition p1 = new CategoryLabelPosition(); CategoryLabelPosition p2 = new CategoryLabelPosition(); assertTrue(p1.equals(p2)); }
public void testHashCode3952() { CategoryLabelPosition p1 = new CategoryLabelPosition(); CategoryLabelPosition p2 = new CategoryLabelPosition(); assertEquals(p1, p2); int h1 = p1.hashCode(); int h2 = p2.hashCode(); assertEquals(h1, h2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
