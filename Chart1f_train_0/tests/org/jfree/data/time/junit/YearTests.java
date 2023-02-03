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
 * --------------
 * YearTests.java
 * --------------
 * (C) Copyright 2001-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Nov-2001 : Version 1 (DG);
 * 19-Mar-2002 : Added tests for constructor that uses java.util.Date to ensure
 *               it is consistent with the getStart() and getEnd() methods (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 11-Jan-2005 : Added test for non-clonability (DG);
 * 05-Oct-2006 : Added some new tests (DG);
 * 11-Jul-2007 : Fixed bad time zone assumption (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.TimePeriodFormatException;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link Year} class.
 */
public class YearTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(YearTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public YearTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Check that a Year instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */

public void testDateConstructor2126() { 
     TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles"); 
     Calendar c = new GregorianCalendar(zone); 
     Year y1 = new Year(new Date(1009871999999L), zone); 
     Year y2 = new Year(new Date(1009872000000L), zone); 
     assertEquals(2001, y1.getYear()); 
     assertEquals(1009871999999L, y1.getLastMillisecond(c)); 
     assertEquals(2002, y2.getYear()); 
     assertEquals(1009872000000L, y2.getFirstMillisecond(c)); 
 } 


public void test1900Next128() { 
     Year current = new Year(1900); 
     Year next = (Year) current.next(); 
     assertEquals(1901, next.getYear()); 
 } 


public void testNext129() { 
     Year y = new Year(2000); 
     y = (Year) y.next(); 
     assertEquals(2001, y.getYear()); 
     y = new Year(9999); 
     assertNull(y.next()); 
 } 


public void testGetSerialIndex130() { 
     Year y = new Year(2000); 
     assertEquals(2000L, y.getSerialIndex()); 
 } 


public void testEquals131() { 
     Year year1 = new Year(2002); 
     Year year2 = new Year(2002); 
     assertTrue(year1.equals(year2)); 
     year1 = new Year(1999); 
     assertFalse(year1.equals(year2)); 
     year2 = new Year(1999); 
     assertTrue(year1.equals(year2)); 
 } 


public void testHashcode132() { 
     Year y1 = new Year(1988); 
     Year y2 = new Year(1988); 
     assertTrue(y1.equals(y2)); 
     int h1 = y1.hashCode(); 
     int h2 = y2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testParseYear133() { 
     Year year = null; 
     try { 
         year = Year.parseYear("2000"); 
     } catch (TimePeriodFormatException e) { 
         year = new Year(1900); 
     } 
     assertEquals(2000, year.getYear()); 
     try { 
         year = Year.parseYear(" 2001 "); 
     } catch (TimePeriodFormatException e) { 
         year = new Year(1900); 
     } 
     assertEquals(2001, year.getYear()); 
     try { 
         year = Year.parseYear("99"); 
     } catch (TimePeriodFormatException e) { 
         year = new Year(1900); 
     } 
     assertEquals(99, year.getYear()); 
 } 

    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the end of 2001 is java.util.Date(1009843199999L).  Use this to
     * check the year constructor.
     */
    

    /**
     * In Los Angeles, the end of 2001 is java.util.Date(1009871999999L).  Use
     * this to check the year constructor.
     */
    

    /**
     * Set up a year equal to 1900.  Request the previous year, it should be
     * null.
     */
    

    /**
     * Set up a year equal to 1900.  Request the next year, it should be 1901.
     */
    

    /**
     * Set up a year equal to 9999.  Request the previous year, it should be
     * 9998.
     */
    

    /**
     * Set up a year equal to 9999.  Request the next year, it should be null.
     */
    

    /**
     * Tests the year string parser.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * The {@link Year} class is immutable, so should not be {@link Cloneable}.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Some checks for the getFirstMillisecond() method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond() method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getSerialIndex() method.
     */
    

    /**
     * Some checks for the testNext() method.
     */
    

    /**
     * Some checks for the getStart() method.
     */
    

    /**
     * Some checks for the getEnd() method.
     */
    

}
