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
 * ------------------------------------
 * BubbleXYItemLabelGeneratorTests.java
 * ------------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 20-Jan-2006 : Version 1 (DG);
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
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.BubbleXYItemLabelGenerator;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link BubbleXYItemLabelGenerator} class.
 */
public class BubbleXYItemLabelGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BubbleXYItemLabelGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BubbleXYItemLabelGeneratorTests(String name) {
        super(name);
    }

    /**
     * A series of tests for the equals() method.
     */

public void testGenerateLabel116() { 
     XYSeries s1 = new XYSeries("S1"); 
     s1.add(1.0, 2.0); 
     s1.add(2.2, 3.3); 
     XYSeriesCollection dataset = new XYSeriesCollection(s1); 
     BubbleXYItemLabelGenerator g = new BubbleXYItemLabelGenerator(); 
     assertEquals("{3}", g.generateLabel(dataset, 0, 0)); 
     assertEquals("{3}", g.generateLabel(dataset, 0, 1)); 
 } 


public void testHashCode118() { 
     BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator(); 
     BubbleXYItemLabelGenerator g2 = new BubbleXYItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g1.hashCode() == g2.hashCode()); 
 } 


public void testPublicCloneable193() { 
     BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator(); 
     assertTrue(g1 instanceof PublicCloneable); 
 } 


public void testSerialization194() { 
     BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator(); 
     BubbleXYItemLabelGenerator g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (BubbleXYItemLabelGenerator) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(g1, g2); 
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
     * Some checks for the testGenerateLabel() method.
     */
    

}
