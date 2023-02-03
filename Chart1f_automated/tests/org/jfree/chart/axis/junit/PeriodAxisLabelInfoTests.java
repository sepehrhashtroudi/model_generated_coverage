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
 * -----------------------------
 * PeriodAxisLabelInfoTests.java
 * -----------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jun-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;

/**
 * Tests for the {@link PeriodAxisLabelInfo} class.
 */
public class PeriodAxisLabelInfoTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PeriodAxisLabelInfoTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PeriodAxisLabelInfoTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testCloning87() { 
     PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class, new SimpleDateFormat("d")); 
     PeriodAxisLabelInfo info2 = null; 
     try { 
         info2 = (PeriodAxisLabelInfo) info1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(info1 != info2); 
     assertTrue(info1.getClass() == info2.getClass()); 
     assertTrue(info1.equals(info2)); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
