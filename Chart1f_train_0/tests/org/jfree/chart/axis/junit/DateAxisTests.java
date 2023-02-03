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
 * ------------------
 * DateAxisTests.java
 * ------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Apr-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() method (DG);
 * 25-Sep-2005 : New tests for bug 1564977 (DG);
 * 19-Apr-2007 : Added further checks for setMinimumDate() and
 *               setMaximumDate() (DG);
 * 03-May-2007 : Replaced the tests for the previousStandardDate() method with
 *               new tests that check that the previousStandardDate and the
 *               next standard date do in fact span the reference date (DG);
 * 25-Nov-2008 : Added testBug2201869 (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link DateAxis} class.
 */
public class DateAxisTests extends TestCase {

    static class MyDateAxis extends DateAxis {

        /**
         * Creates a new instance.
         *
         * @param label  the label.
         */
        public MyDateAxis(String label) {
            super(label);
        }

        public Date previousStandardDate(Date d, DateTickUnit unit) {
            return super.previousStandardDate(d, unit);
        }
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DateAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DateAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testPreviousStandardDateHourB117() { 
     MyDateAxis axis = new MyDateAxis("Hour"); 
     Hour h0 = new Hour(12, 1, 4, 2007); 
     Hour h1 = new Hour(13, 1, 4, 2007); 
     Date d0 = new Date(h0.getFirstMillisecond()); 
     Date d1 = new Date(h0.getFirstMillisecond() + 500L); 
     Date d2 = new Date(h0.getMiddleMillisecond()); 
     Date d3 = new Date(h0.getMiddleMillisecond() + 500L); 
     Date d4 = new Date(h0.getLastMillisecond()); 
     Date end = new Date(h1.getLastMillisecond()); 
     DateTickUnit unit = new DateTickUnit(DateTickUnitType.HOUR, 6); 
     axis.setTickUnit(unit); 
     axis.setTickMarkPosition(DateTickMarkPosition.START); 
     axis.setRange(d0, end); 
     Date psd = axis.previousStandardDate(d0, unit); 
     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d0.getTime()); 
     assertTrue(nsd.getTime() >= d0.getTime()); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setRange(d2, end); 
     psd = axis.previousStandardDate(d2, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d2.getTime()); 
     assertTrue(nsd.getTime() >= d2.getTime()); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.END); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setRange(d4, end); 
     psd = axis.previousStandardDate(d4, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d4.getTime()); 
     assertTrue(nsd.getTime() >= d4.getTime()); 
 } 


public void testEquals118() { 
     DateAxis a1 = new DateAxis("Test"); 
     DateAxis a2 = new DateAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     assertFalse(a1.equals(null)); 
     assertFalse(a1.equals("Some non-DateAxis object")); 
     a1.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7)); 
     assertFalse(a1.equals(a2)); 
     a2.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7)); 
     assertTrue(a1.equals(a2)); 
     a1.setDateFormatOverride(new SimpleDateFormat("yyyy")); 
     assertFalse(a1.equals(a2)); 
     a2.setDateFormatOverride(new SimpleDateFormat("yyyy")); 
     assertTrue(a1.equals(a2)); 
     a1.setTickMarkPosition(DateTickMarkPosition.END); 
     assertFalse(a1.equals(a2)); 
     a2.setTickMarkPosition(DateTickMarkPosition.END); 
     assertTrue(a1.equals(a2)); 
     a1.setTimeline(SegmentedTimeline.newMondayThroughFridayTimeline()); 
     assertFalse(a1.equals(a2)); 
     a2.setTimeline(SegmentedTimeline.newMondayThroughFridayTimeline()); 
     assertTrue(a1.equals(a2)); 
 } 


public void testPreviousStandardDateYearB127() { 
     MyDateAxis axis = new MyDateAxis("Year"); 
     Year y2006 = new Year(2006); 
     Year y2007 = new Year(2007); 
     Date d0 = new Date(y2006.getFirstMillisecond()); 
     Date d1 = new Date(y2006.getFirstMillisecond() + 500L); 
     Date d2 = new Date(y2006.getMiddleMillisecond()); 
     Date d3 = new Date(y2006.getMiddleMillisecond() + 500L); 
     Date d4 = new Date(y2006.getLastMillisecond()); 
     Date end = new Date(y2007.getLastMillisecond()); 
     DateTickUnit unit = new DateTickUnit(DateTickUnitType.YEAR, 10); 
     axis.setTickUnit(unit); 
     axis.setTickMarkPosition(DateTickMarkPosition.START); 
     axis.setRange(d0, end); 
     Date psd = axis.previousStandardDate(d0, unit); 
     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d0.getTime()); 
     assertTrue(nsd.getTime() >= d0.getTime()); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setRange(d2, end); 
     psd = axis.previousStandardDate(d2, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d2.getTime()); 
     assertTrue(nsd.getTime() >= d2.getTime()); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.END); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setRange(d4, end); 
     psd = axis.previousStandardDate(d4, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d4.getTime()); 
     assertTrue(nsd.getTime() >= d4.getTime()); 
 } 


public void testSetMaximumDate325() { 
     DateAxis axis = new DateAxis("Test Axis"); 
     Date date = new Date(); 
     axis.setMaximumDate(date); 
     assertEquals(date, axis.getMaximumDate()); 
     Date d1 = new Date(); 
     Date d2 = new Date(d1.getTime() + 1); 
     Date d0 = new Date(d1.getTime() - 1); 
     axis.setMaximumDate(d2); 
     axis.setMinimumDate(d1); 
     axis.setMaximumDate(d1); 
     assertEquals(d0, axis.getMinimumDate()); 
 } 


public void testPreviousStandardDateSecondA326() { 
     MyDateAxis axis = new MyDateAxis("Second"); 
     Second s0 = new Second(58, 31, 12, 1, 4, 2007); 
     Second s1 = new Second(59, 31, 12, 1, 4, 2007); 
     Date d0 = new Date(s0.getFirstMillisecond()); 
     Date d1 = new Date(s0.getFirstMillisecond() + 50L); 
     Date d2 = new Date(s0.getMiddleMillisecond()); 
     Date d3 = new Date(s0.getMiddleMillisecond() + 50L); 
     Date d4 = new Date(s0.getLastMillisecond()); 
     Date end = new Date(s1.getLastMillisecond()); 
     DateTickUnit unit = new DateTickUnit(DateTickUnitType.SECOND, 1); 
     axis.setTickUnit(unit); 
     axis.setTickMarkPosition(DateTickMarkPosition.START); 
     axis.setRange(d0, end); 
     Date psd = axis.previousStandardDate(d0, unit); 
     Date nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d0.getTime()); 
     assertTrue(nsd.getTime() >= d0.getTime()); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE); 
     axis.setRange(d1, end); 
     psd = axis.previousStandardDate(d1, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d1.getTime()); 
     assertTrue(nsd.getTime() >= d1.getTime()); 
     axis.setRange(d2, end); 
     psd = axis.previousStandardDate(d2, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d2.getTime()); 
     assertTrue(nsd.getTime() >= d2.getTime()); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setTickMarkPosition(DateTickMarkPosition.END); 
     axis.setRange(d3, end); 
     psd = axis.previousStandardDate(d3, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d3.getTime()); 
     assertTrue(nsd.getTime() >= d3.getTime()); 
     axis.setRange(d4, end); 
     psd = axis.previousStandardDate(d4, unit); 
     nsd = unit.addToDate(psd, TimeZone.getDefault()); 
     assertTrue(psd.getTime() < d4.getTime()); 
     assertTrue(nsd.getTime() >= d4.getTime()); 
 } 


public void testHashCode328() { 
     DateAxis a1 = new DateAxis("Test"); 
     DateAxis a2 = new DateAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 } 

    

    /**
     * A test for bug report 1472942.  The DateFormat.equals() method is not
     * checking the range attribute.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Test that the setRange() method works.
     */
    

    /**
     * Test that the setMaximumDate() method works.
     */
    

    /**
     * Test that the setMinimumDate() method works.
     */
    

    /**
     * Tests two doubles for 'near enough' equality.
     *
     * @param d1  number 1.
     * @param d2  number 2.
     * @param tolerance  maximum tolerance.
     *
     * @return A boolean.
     */
    private boolean same(double d1, double d2, double tolerance) {
        return (Math.abs(d1 - d2) < tolerance);
    }

    /**
     * Test the translation of Java2D values to data values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 year.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 10 years (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 month.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 3 months (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 day.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 7 days (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 hour.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 6 hours (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 second.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 5 seconds (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 millisecond.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 10 milliseconds (just for the sake of having a multiple).
     */
    

    /**
     * A test to reproduce bug 2201869.
     */
    

}
