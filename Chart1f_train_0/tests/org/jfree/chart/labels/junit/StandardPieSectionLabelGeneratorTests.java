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
 * ------------------------------------------
 * StandardPieSectionLabelGeneratorTests.java
 * ------------------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 13-Aug-2003 : Added clone tests (DG);
 * 04-Mar-2004 : Added test for equals() method (DG);
 * 23-Nov-2006 : Extended equals() test (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.labels.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.AttributedString;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link StandardPieSectionLabelGenerator} class.
 */
public class StandardPieSectionLabelGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardPieSectionLabelGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardPieSectionLabelGeneratorTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testEquals145() { 
     StandardPieSectionLabelGenerator g1 = new StandardPieSectionLabelGenerator(); 
     StandardPieSectionLabelGenerator g2 = new StandardPieSectionLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new StandardPieSectionLabelGenerator("{0}", new DecimalFormat("#,##0.00"), NumberFormat.getPercentInstance()); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardPieSectionLabelGenerator("{0}", new DecimalFormat("#,##0.00"), NumberFormat.getPercentInstance()); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0.00"), NumberFormat.getPercentInstance()); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0.00"), NumberFormat.getPercentInstance()); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0"), NumberFormat.getPercentInstance()); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0"), NumberFormat.getPercentInstance()); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0"), new DecimalFormat("0.000%")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardPieSectionLabelGenerator("{0} {1}", new DecimalFormat("#,##0"), new DecimalFormat("0.000%")); 
     assertTrue(g1.equals(g2)); 
     AttributedString as = new AttributedString("XYZ"); 
     g1.setAttributedLabel(0, as); 
     assertFalse(g1.equals(g2)); 
     g2.setAttributedLabel(0, as); 
     assertTrue(g1.equals(g2)); 
 } 


public void testHashCode146() { 
     StandardPieSectionLabelGenerator g1 = new StandardPieSectionLabelGenerator(); 
     StandardPieSectionLabelGenerator g2 = new StandardPieSectionLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g1.hashCode() == g2.hashCode()); 
 } 

    

    /**
     * Simple check that hashCode is implemented.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check to ensure that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Runs the test suite using JUnit's text-based runner.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
