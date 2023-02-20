/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestJulianChronology.class);
    }

    public TestJulianChronology(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
public void testFactoryUTC183() { 
     assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC()); 
     assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC()); 
     assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC()); 
     assertSame(JulianChronology.class, JulianChronology.getInstanceUTC().getClass()); 
 }
public void testFactory_Zone185() { 
     assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }
public void testFactory_Zone_int186() { 
     JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     assertEquals(TOKYO, chrono.getZone()); 
     assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     try { 
         JulianChronology.getInstance(TOKYO, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         JulianChronology.getInstance(TOKYO, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
