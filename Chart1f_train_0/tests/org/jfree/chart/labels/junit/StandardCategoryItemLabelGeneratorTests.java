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
 * --------------------------------------------
 * StandardCategoryItemLabelGeneratorTests.java
 * --------------------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-Mar-2003 : Version 1 (DG);
 * 13-Aug-2003 : Added cloning tests (DG);
 * 11-May-2004 : Renamed class (DG);
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
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link StandardCategoryItemLabelGenerator} class.
 */
public class StandardCategoryItemLabelGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardCategoryItemLabelGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardCategoryItemLabelGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the generalLabel() method.
     */

public void testEquals499() { 
     StandardCategoryItemLabelGenerator g1 = new StandardCategoryItemLabelGenerator(); 
     StandardCategoryItemLabelGenerator g2 = new StandardCategoryItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new StandardCategoryItemLabelGenerator("{0}", new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardCategoryItemLabelGenerator("{0}", new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardCategoryItemLabelGenerator("{1}", new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardCategoryItemLabelGenerator("{1}", new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardCategoryItemLabelGenerator("{2}", new SimpleDateFormat("d-MMM")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardCategoryItemLabelGenerator("{2}", new SimpleDateFormat("d-MMM")); 
     assertTrue(g1.equals(g2)); 
 } 


public void testGenerateLabel500() { 
     StandardCategoryItemLabelGenerator g = new StandardCategoryItemLabelGenerator("{2}", new DecimalFormat("0.000")); 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(1.0, "R0", "C0"); 
     dataset.addValue(2.0, "R0", "C1"); 
     dataset.addValue(3.0, "R1", "C0"); 
     dataset.addValue(null, "R1", "C1"); 
     String s = g.generateLabel(dataset, 0, 0); 
     assertTrue(s.startsWith("1")); 
     assertTrue(s.endsWith("000")); 
     s = g.generateLabel(dataset, 1, 1); 
     assertEquals("-", s); 
 } 


public void testEquals1481087501() { 
     StandardCategoryItemLabelGenerator g1 = new StandardCategoryItemLabelGenerator("{0}", new DecimalFormat("0.00")); 
     StandardCategoryToolTipGenerator g2 = new StandardCategoryToolTipGenerator("{0}", new DecimalFormat("0.00")); 
     assertFalse(g1.equals(g2)); 
 } 

    

    /**
     * Some checks for the equals() method.
     */
    

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
     * A test for bug 1481087.
     */
    

}
