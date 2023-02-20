/*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Constructors extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Constructors.class);
    }

    public TestDateTime_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testConstructor_Object_Chronology139() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     DateTime test = new DateTime(date, GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void test_now553() throws Throwable { 
     DateTime test = DateTime.now(); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void test_now_nullDateTimeZone554() throws Throwable { 
     try { 
         DateTime.now((DateTimeZone) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void test_now_DateTimeZone555() throws Throwable { 
     DateTime test = DateTime.now(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void test_now_Chronology556() throws Throwable { 
     DateTime test = DateTime.now(GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void test_now_nullChronology557() throws Throwable { 
     try { 
         DateTime.now((Chronology) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void testConstructor559() throws Throwable { 
     DateTime test = new DateTime(); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_DateTimeZone560() throws Throwable { 
     DateTime test = new DateTime(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_Chronology561() throws Throwable { 
     DateTime test = new DateTime(GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_long_nullDateTimeZone562() throws Throwable { 
     DateTime test = new DateTime(TEST_TIME1, (DateTimeZone) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testConstructor_nullObject563() throws Throwable { 
     DateTime test = new DateTime((Object) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_Object_nullChronology564() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     DateTime test = new DateTime(date, (Chronology) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testConstructor_int_int_int_int_int565() throws Throwable { 
     DateTime test = new DateTime(2002, 6, 9, 1, 0); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(LONDON, test.getZone()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_int_int_int_int_int_Chronology566() throws Throwable { 
     DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_int_int_int_int_int_int_Chronology567() throws Throwable { 
     DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 

    

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    

    /**
     * Test now (DateTimeZone)
     */
    

    /**
     * Test now (DateTimeZone=null)
     */
    

    /**
     * Test now (Chronology)
     */
    

    /**
     * Test now (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, int, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}
