/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
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
 * --------------------
 * TimeSeriesTests.java
 * --------------------
 * (C) Copyright 2001-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Nov-2001 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 15-Oct-2003 : Added test for setMaximumItemCount method (DG);
 * 23-Aug-2004 : Added test that highlights a bug where the addOrUpdate()
 *               method can lead to more than maximumItemCount items in the
 *               dataset (DG);
 * 24-May-2006 : Added new tests (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 31-Oct-2007 : New hashCode() test (DG);
 * 21-Nov-2007 : Added testBug1832432() and testClone2() (DG);
 * 10-Jan-2008 : Added testBug1864222() (DG);
 * 13-Jan-2009 : Added testEquals3() and testRemoveAgedItems3() (DG);
 * 26-May-2009 : Added various tests for min/maxY values (DG);
 * 09-Jun-2009 : Added testAdd_TimeSeriesDataItem (DG);
 * 31-Aug-2009 : Added new test for createCopy() method (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.event.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Year;

/**
 * A collection of test cases for the {@link TimeSeries} class.
 */
public class TimeSeriesTests extends TestCase implements SeriesChangeListener {

    /** A time series. */
    private TimeSeries seriesA;

    /** A time series. */
    private TimeSeries seriesB;

    /** A time series. */
    private TimeSeries seriesC;

    /** A flag that indicates whether or not a change event was fired. */
    private boolean gotSeriesChangeEvent = false;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimeSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimeSeriesTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {

        this.seriesA = new TimeSeries("Series A");
        try {
            this.seriesA.add(new Year(2000), new Integer(102000));
            this.seriesA.add(new Year(2001), new Integer(102001));
            this.seriesA.add(new Year(2002), new Integer(102002));
            this.seriesA.add(new Year(2003), new Integer(102003));
            this.seriesA.add(new Year(2004), new Integer(102004));
            this.seriesA.add(new Year(2005), new Integer(102005));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesB = new TimeSeries("Series B");
        try {
            this.seriesB.add(new Year(2006), new Integer(202006));
            this.seriesB.add(new Year(2007), new Integer(202007));
            this.seriesB.add(new Year(2008), new Integer(202008));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesC = new TimeSeries("Series C");
        try {
            this.seriesC.add(new Year(1999), new Integer(301999));
            this.seriesC.add(new Year(2000), new Integer(302000));
            this.seriesC.add(new Year(2002), new Integer(302002));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

    }

    /**
     * Sets the flag to indicate that a {@link SeriesChangeEvent} has been
     * received.
     *
     * @param event  the event.
     */
    public void seriesChanged(SeriesChangeEvent event) {
        this.gotSeriesChangeEvent = true;
    }

    /**
     * Check that cloning works.
     */

public void testBug183243231() { 
     TimeSeries s1 = new TimeSeries("Series"); 
     TimeSeries s2 = null; 
     try { 
         s2 = (TimeSeries) s1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1 != s2); 
     assertTrue(s1.getClass() == s2.getClass()); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Day(1, 1, 2007), 100.0); 
     assertFalse(s1.equals(s2)); 
 } 


public void testBug1075255121() { 
     TimeSeries ts = new TimeSeries("dummy"); 
     ts.add(new FixedMillisecond(0L), 0.0); 
     TimeSeries ts2 = new TimeSeries("dummy2"); 
     ts2.add(new FixedMillisecond(0L), 1.0); 
     try { 
         ts.addAndOrUpdate(ts2); 
     } catch (Exception e) { 
         e.printStackTrace(); 
         assertTrue(false); 
     } 
     assertEquals(1, ts.getItemCount()); 
 } 


public void testGetIndex173() { 
     TimeSeries series = new TimeSeries("Series"); 
     assertEquals(-1, series.getIndex(new Month(1, 2003))); 
     series.add(new Month(1, 2003), 45.0); 
     assertEquals(0, series.getIndex(new Month(1, 2003))); 
     assertEquals(-1, series.getIndex(new Month(12, 2002))); 
     assertEquals(-2, series.getIndex(new Month(2, 2003))); 
     series.add(new Month(3, 2003), 55.0); 
     assertEquals(-1, series.getIndex(new Month(12, 2002))); 
     assertEquals(0, series.getIndex(new Month(1, 2003))); 
     assertEquals(-2, series.getIndex(new Month(2, 2003))); 
     assertEquals(1, series.getIndex(new Month(3, 2003))); 
     assertEquals(-3, series.getIndex(new Month(4, 2003))); 
 } 


public void testHashCode245() { 
     TimeSeries s1 = new TimeSeries("Test"); 
     TimeSeries s2 = new TimeSeries("Test"); 
     assertEquals(s1, s2); 
     assertEquals(s1.hashCode(), s2.hashCode()); 
     s1.add(new Day(1, 1, 2007), 500.0); 
     s2.add(new Day(1, 1, 2007), 500.0); 
     assertEquals(s1, s2); 
     assertEquals(s1.hashCode(), s2.hashCode()); 
     s1.add(new Day(2, 1, 2007), null); 
     s2.add(new Day(2, 1, 2007), null); 
     assertEquals(s1, s2); 
     assertEquals(s1.hashCode(), s2.hashCode()); 
     s1.add(new Day(5, 1, 2007), 111.0); 
     s2.add(new Day(5, 1, 2007), 111.0); 
     assertEquals(s1, s2); 
     assertEquals(s1.hashCode(), s2.hashCode()); 
     s1.add(new Day(9, 1, 2007), 1.0); 
     s2.add(new Day(9, 1, 2007), 1.0); 
     assertEquals(s1, s2); 
     assertEquals(s1.hashCode(), s2.hashCode()); 
 } 


public void testEquals249() { 
     TimeSeries s1 = new TimeSeries("Time Series 1"); 
     TimeSeries s2 = new TimeSeries("Time Series 2"); 
     boolean b1 = s1.equals(s2); 
     assertFalse("b1", b1); 
     s2.setKey("Time Series 1"); 
     boolean b2 = s1.equals(s2); 
     assertTrue("b2", b2); 
     RegularTimePeriod p1 = new Day(); 
     RegularTimePeriod p2 = p1.next(); 
     s1.add(p1, 100.0); 
     s1.add(p2, 200.0); 
     boolean b3 = s1.equals(s2); 
     assertFalse("b3", b3); 
     s2.add(p1, 100.0); 
     s2.add(p2, 200.0); 
     boolean b4 = s1.equals(s2); 
     assertTrue("b4", b4); 
     s1.setMaximumItemCount(100); 
     boolean b5 = s1.equals(s2); 
     assertFalse("b5", b5); 
     s2.setMaximumItemCount(100); 
     boolean b6 = s1.equals(s2); 
     assertTrue("b6", b6); 
     s1.setMaximumItemAge(100); 
     boolean b7 = s1.equals(s2); 
     assertFalse("b7", b7); 
     s2.setMaximumItemAge(100); 
     boolean b8 = s1.equals(s2); 
     assertTrue("b8", b8); 
 } 


public void testSetMaximumItemCount250() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2000), 13.75); 
     s1.add(new Year(2001), 11.90); 
     s1.add(new Year(2002), null); 
     s1.add(new Year(2005), 19.32); 
     s1.add(new Year(2007), 16.89); 
     assertTrue(s1.getItemCount() == 5); 
     s1.setMaximumItemCount(3); 
     assertTrue(s1.getItemCount() == 3); 
     TimeSeriesDataItem item = s1.getDataItem(0); 
     assertTrue(item.getPeriod().equals(new Year(2002))); 
     assertEquals(16.89, s1.getMinY(), EPSILON); 
     assertEquals(19.32, s1.getMaxY(), EPSILON); 
 } 


public void testAddOrUpdate3251() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.addOrUpdate(new Year(2010), 1.1); 
     assertEquals(Year.class, s1.getTimePeriodClass()); 
     boolean pass = false; 
     try { 
         s1.addOrUpdate(new Month(1, 2009), 0.0); 
     } catch (SeriesException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testGetDataItem1252() { 
     TimeSeries series = new TimeSeries("S"); 
     boolean pass = false; 
     try { 
         series.getDataItem(0); 
     } catch (IndexOutOfBoundsException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     series.add(new Year(2006), 100.0); 
     TimeSeriesDataItem item = series.getDataItem(0); 
     assertEquals(new Year(2006), item.getPeriod()); 
     pass = false; 
     try { 
         series.getDataItem(-1); 
     } catch (IndexOutOfBoundsException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         series.getDataItem(1); 
     } catch (IndexOutOfBoundsException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testGetDataItem2253() { 
     TimeSeries series = new TimeSeries("S"); 
     assertNull(series.getDataItem(new Year(2006))); 
     boolean pass = false; 
     try { 
         series.getDataItem(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testDelete254() { 
     this.seriesA.delete(0, 0); 
     assertEquals(5, this.seriesA.getItemCount()); 
     Number value = this.seriesA.getValue(new Year(2000)); 
     assertNull(value); 
 } 


public void testCreateCopy2255() { 
     TimeSeries series = new TimeSeries("Series"); 
     series.add(new Month(MonthConstants.JANUARY, 2003), 45.0); 
     series.add(new Month(MonthConstants.FEBRUARY, 2003), 55.0); 
     series.add(new Month(MonthConstants.JUNE, 2003), 35.0); 
     series.add(new Month(MonthConstants.NOVEMBER, 2003), 85.0); 
     series.add(new Month(MonthConstants.DECEMBER, 2003), 75.0); 
     try { 
         TimeSeries result1 = series.createCopy(0, 0); 
         assertEquals(new Month(1, 2003), result1.getTimePeriod(0)); 
         result1 = series.createCopy(0, 1); 
         assertEquals(new Month(2, 2003), result1.getTimePeriod(1)); 
         result1 = series.createCopy(1, 3); 
         assertEquals(new Month(2, 2003), result1.getTimePeriod(0)); 
         assertEquals(new Month(11, 2003), result1.getTimePeriod(2)); 
         result1 = series.createCopy(3, 4); 
         assertEquals(new Month(11, 2003), result1.getTimePeriod(0)); 
         assertEquals(new Month(12, 2003), result1.getTimePeriod(1)); 
         result1 = series.createCopy(4, 4); 
         assertEquals(new Month(12, 2003), result1.getTimePeriod(0)); 
     } catch (CloneNotSupportedException e) { 
         assertTrue(false); 
     } 
     boolean pass = false; 
     try { 
         series.createCopy(-1, 1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } catch (CloneNotSupportedException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         series.createCopy(1, 0); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } catch (CloneNotSupportedException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
     TimeSeries series2 = new TimeSeries("Series 2"); 
     try { 
         TimeSeries series3 = series2.createCopy(99, 999); 
         assertEquals(0, series3.getItemCount()); 
     } catch (CloneNotSupportedException e) { 
         assertTrue(false); 
     } 
 } 


public void testAdd256() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemCount(2); 
     s1.add(new Year(2010), 1.1); 
     s1.add(new Year(2011), 2.2); 
     s1.add(new Year(2012), 3.3); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 } 


public void testAddOrUpdate2257() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemCount(2); 
     s1.addOrUpdate(new Year(2010), 1.1); 
     s1.addOrUpdate(new Year(2011), 2.2); 
     s1.addOrUpdate(new Year(2012), 3.3); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 } 


public void testRemoveAgedItems4258() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemAge(2); 
     s1.add(new Year(2010), 1.1); 
     s1.add(new Year(2011), 2.2); 
     s1.add(new Year(2012), 3.3); 
     s1.add(new Year(2013), 2.5); 
     assertEquals(3, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 } 


public void testRemoveAgedItems259() { 
     TimeSeries series = new TimeSeries("Test Series"); 
     series.addChangeListener(this); 
     assertEquals(Long.MAX_VALUE, series.getMaximumItemAge()); 
     assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount()); 
     this.gotSeriesChangeEvent = false; 
     series.removeAgedItems(true); 
     assertEquals(0, series.getItemCount()); 
     assertFalse(this.gotSeriesChangeEvent); 
     series.add(new Year(1999), 1.0); 
     series.setMaximumItemAge(0); 
     this.gotSeriesChangeEvent = false; 
     series.removeAgedItems(true); 
     assertEquals(1, series.getItemCount()); 
     assertFalse(this.gotSeriesChangeEvent); 
     series.setMaximumItemAge(10); 
     series.add(new Year(2001), 2.0); 
     this.gotSeriesChangeEvent = false; 
     series.setMaximumItemAge(2); 
     assertEquals(2, series.getItemCount()); 
     assertEquals(0, series.getIndex(new Year(1999))); 
     assertFalse(this.gotSeriesChangeEvent); 
     series.setMaximumItemAge(1); 
     assertEquals(1, series.getItemCount()); 
     assertEquals(0, series.getIndex(new Year(2001))); 
     assertTrue(this.gotSeriesChangeEvent); 
 } 


public void testRemoveAgedItems3260() { 
     TimeSeries s = new TimeSeries("Test"); 
     boolean pass = true; 
     try { 
         s.removeAgedItems(0L, true); 
     } catch (Exception e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 } 


public void testClear261() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2009), 1.1); 
     s1.add(new Year(2010), 2.2); 
     assertEquals(2, s1.getItemCount()); 
     s1.clear(); 
     assertEquals(0, s1.getItemCount()); 
     assertTrue(Double.isNaN(s1.getMinY())); 
     assertTrue(Double.isNaN(s1.getMaxY())); 
 } 


public void testDelete_RegularTimePeriod262() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2010), 1.1); 
     s1.add(new Year(2011), 2.2); 
     s1.add(new Year(2012), 3.3); 
     s1.add(new Year(2013), 4.4); 
     s1.delete(new Year(2010)); 
     s1.delete(new Year(2013)); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 } 


public void testCreateCopy1263() { 
     TimeSeries series = new TimeSeries("Series"); 
     series.add(new Month(MonthConstants.JANUARY, 2003), 45.0); 
     series.add(new Month(MonthConstants.FEBRUARY, 2003), 55.0); 
     series.add(new Month(MonthConstants.JUNE, 2003), 35.0); 
     series.add(new Month(MonthConstants.NOVEMBER, 2003), 85.0); 
     series.add(new Month(MonthConstants.DECEMBER, 2003), 75.0); 
     try { 
         TimeSeries result1 = series.createCopy(new Month(MonthConstants.NOVEMBER, 2002), new Month(MonthConstants.DECEMBER, 2002)); 
         assertEquals(0, result1.getItemCount()); 
         TimeSeries result2 = series.createCopy(new Month(MonthConstants.NOVEMBER, 2002), new Month(MonthConstants.JANUARY, 2003)); 
         assertEquals(1, result2.getItemCount()); 
         TimeSeries result3 = series.createCopy(new Month(MonthConstants.NOVEMBER, 2002), new Month(MonthConstants.APRIL, 2003)); 
         assertEquals(2, result3.getItemCount()); 
         TimeSeries result4 = series.createCopy(new Month(MonthConstants.NOVEMBER, 2002), new Month(MonthConstants.DECEMBER, 2003)); 
         assertEquals(5, result4.getItemCount()); 
         TimeSeries result5 = series.createCopy(new Month(MonthConstants.NOVEMBER, 2002), new Month(MonthConstants.MARCH, 2004)); 
         assertEquals(5, result5.getItemCount()); 
         TimeSeries result6 = series.createCopy(new Month(MonthConstants.JANUARY, 2003), new Month(MonthConstants.JANUARY, 2003)); 
         assertEquals(1, result6.getItemCount()); 
         TimeSeries result7 = series.createCopy(new Month(MonthConstants.JANUARY, 2003), new Month(MonthConstants.APRIL, 2003)); 
         assertEquals(2, result7.getItemCount()); 
         TimeSeries result8 = series.createCopy(new Month(MonthConstants.JANUARY, 2003), new Month(MonthConstants.DECEMBER, 2003)); 
         assertEquals(5, result8.getItemCount()); 
         TimeSeries result9 = series.createCopy(new Month(MonthConstants.JANUARY, 2003), new Month(MonthConstants.MARCH, 2004)); 
         assertEquals(5, result9.getItemCount()); 
         TimeSeries result10 = series.createCopy(new Month(MonthConstants.MAY, 2003), new Month(MonthConstants.DECEMBER, 2003)); 
         assertEquals(3, result10.getItemCount()); 
         TimeSeries result11 = series.createCopy(new Month(MonthConstants.MAY, 2003), new Month(MonthConstants.MARCH, 2004)); 
         assertEquals(3, result11.getItemCount()); 
         TimeSeries result12 = series.createCopy(new Month(MonthConstants.DECEMBER, 2003), new Month(MonthConstants.DECEMBER, 2003)); 
         assertEquals(1, result12.getItemCount()); 
         TimeSeries result13 = series.createCopy(new Month(MonthConstants.DECEMBER, 2003), new Month(MonthConstants.MARCH, 2004)); 
         assertEquals(1, result13.getItemCount()); 
         TimeSeries result14 = series.createCopy(new Month(MonthConstants.JANUARY, 2004), new Month(MonthConstants.MARCH, 2004)); 
         assertEquals(0, result14.getItemCount()); 
     } catch (CloneNotSupportedException e) { 
         assertTrue(false); 
     } 
 } 

    

    /**
     * Another test of the clone() method.
     */
    

    /**
     * Add a value to series A for 1999.  It should be added at index 0.
     */
    

    /**
     * Tests the retrieval of values.
     */
    

    /**
     * Tests the deletion of values.
     */
    

    /**
     * Basic tests for the delete() method.
     */
    

    /**
     * Some checks for the delete(int, int) method.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count and a new value is added.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Tests the equals method.
     */
    

    /**
     * Tests a specific bug report where null arguments in the constructor
     * cause the equals() method to fail.  Fixed for 0.9.21.
     */
    

    /**
     * Some tests to ensure that the createCopy(RegularTimePeriod,
     * RegularTimePeriod) method is functioning correctly.
     */
    

    /**
     * Some tests to ensure that the createCopy(int, int) method is
     * functioning correctly.
     */
    

    /**
     * Checks that the min and max y values are updated correctly when copying
     * a subset.
     *
     * @throws java.lang.CloneNotSupportedException
     */
    

    /**
     * Test the setMaximumItemCount() method to ensure that it removes items
     * from the series if necessary.
     */
    

    /**
     * Some checks for the addOrUpdate() method.
     */
    

    /**
     * Test the add branch of the addOrUpdate() method.
     */
    

    /**
     * Test that the addOrUpdate() method won't allow multiple time period
     * classes.
     */
    

    /**
     * Some more checks for the addOrUpdate() method.
     */
    

    /**
     * A test for the bug report 1075255.
     */
    

    /**
     * A test for bug 1832432.
     */
    

    /**
     * Some checks for the getIndex() method.
     */
    

    /**
     * Some checks for the getDataItem(int) method.
     */
    

    /**
     * Some checks for the getDataItem(RegularTimePeriod) method.
     */
    

    /**
     * Some checks for the removeAgedItems() method.
     */
    

    /**
     * Some checks for the removeAgedItems(long, boolean) method.
     */
    

    /**
     * Calling removeAgedItems() on an empty series should not throw any
     * exception.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count.
     */
    

    /**
     * Check that the item bounds are determined correctly after a call to
     * removeAgedItems().
     */
    

    /**
     * Some simple checks for the hashCode() method.
     */
    

    /**
     * Test for bug report 1864222.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getMinY() method.
     */
    

    /**
     * Some checks for the getMaxY() method.
     */
    

    /**
     * A test for the clear method.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count and a new value is added.
     */
    

    /**
     * Some checks for the update(RegularTimePeriod...method).
     */
    

    /**
     * Create a TimeSeriesDataItem, add it to a TimeSeries.  Now, modifying
     * the original TimeSeriesDataItem should NOT affect the TimeSeries.
     */
    

}
