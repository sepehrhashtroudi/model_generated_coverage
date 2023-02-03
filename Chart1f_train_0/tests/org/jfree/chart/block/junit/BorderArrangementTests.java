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
 * ---------------------------
 * BorderArrangementTests.java
 * ---------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Oct-2004 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.block.junit;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

/**
 * Tests for the {@link BorderArrangement} class.
 */
public class BorderArrangementTests extends TestCase {

    private static final double EPSILON = 0.0000000001;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BorderArrangementTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BorderArrangementTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method can distinguish all the required fields.
     */

public void testSizing12() { 
     BlockContainer container = new BlockContainer(new BorderArrangement()); 
     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
     Graphics2D g2 = image.createGraphics(); 
     Size2D size = container.arrange(g2); 
     assertEquals(0.0, size.width, EPSILON); 
     assertEquals(0.0, size.height, EPSILON); 
     container.add(new EmptyBlock(123.4, 567.8)); 
     size = container.arrange(g2); 
     assertEquals(123.4, size.width, EPSILON); 
     assertEquals(567.8, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(22.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     Block rb = new EmptyBlock(12.3, 15.6); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(rb, RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(22.3, size.width, EPSILON); 
     assertEquals(20.0, size.height, EPSILON); 
     assertEquals(20.0, rb.getBounds().getHeight(), EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(22.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     Block lb = new EmptyBlock(12.3, 15.6); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(lb, RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(22.3, size.width, EPSILON); 
     assertEquals(20.0, size.height, EPSILON); 
     assertEquals(20.0, lb.getBounds().getHeight(), EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(22.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(5.4, 3.2), RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(27.7, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(31.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(31.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(31.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(14.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(33.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(33.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2); 
     assertEquals(33.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(12.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(12.3, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2); 
     assertEquals(16.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2); 
     assertEquals(14.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     size = container.arrange(g2); 
     assertEquals(12.0, size.width, EPSILON); 
     assertEquals(14.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2); 
     assertEquals(21.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
 } 


public void testEquals17() { 
     BorderArrangement b1 = new BorderArrangement(); 
     BorderArrangement b2 = new BorderArrangement(); 
     assertTrue(b1.equals(b2)); 
     assertTrue(b2.equals(b1)); 
     b1.add(new EmptyBlock(99.0, 99.0), null); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(99.0, 99.0), null); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM); 
     assertTrue(b1.equals(b2)); 
 } 


public void testBugX285() { 
     RectangleConstraint constraint = new RectangleConstraint(new Range(0.0, 200.0), new Range(0.0, 100.0)); 
     BlockContainer container = new BlockContainer(new BorderArrangement()); 
     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
     Graphics2D g2 = image.createGraphics(); 
     container.add(new EmptyBlock(10.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(20.0, 6.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(30.0, 6.0)); 
     Size2D size = container.arrange(g2, constraint); 
     assertEquals(60.0, size.width, EPSILON); 
     assertEquals(6.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(20.0, 6.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(300.0, 6.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(200.0, size.width, EPSILON); 
     assertEquals(6.0, size.height, EPSILON); 
 } 

    

    /**
     * Immutable - cloning is not necessary.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Run some checks on sizing.
     */
    

    /**
     * Run some checks on sizing when there is a fixed width constraint.
     */
    

    /**
     * This test is for a particular bug that arose just prior to the release
     * of JFreeChart 1.0.10.  A BorderArrangement with LEFT, CENTRE and RIGHT
     * blocks that is too wide, by default, for the available space, wasn't
     * shrinking the centre block as expected.
     */
    
}

