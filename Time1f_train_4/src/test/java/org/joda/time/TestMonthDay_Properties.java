/*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Propeties} 
 */
public class TestMonthDay_Properties extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Properties.class);
    }

    public TestMonthDay_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(locale);
        locale = null;
    }

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldDayOfMonth409() { 
     MonthDay test = new MonthDay(4, 6); 
     MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); 
     check(test, 4, 6); 
     check(copy, 4, 10); 
     copy = test.dayOfMonth().addWrapFieldToCopy(8); 
     check(copy, 4, 14); 
     copy = test.dayOfMonth().addWrapFieldToCopy(-8); 
     check(copy, 4, 28); 
 } 


public void testPropertyAddDayOfMonth445() { 
     MonthDay test = new MonthDay(4, 6); 
     MonthDay copy = test.dayOfMonth().addToCopy(6); 
     check(test, 4, 6); 
     check(copy, 4, 12); 
     copy = test.dayOfMonth().addToCopy(7); 
     check(copy, 4, 13); 
     copy = test.dayOfMonth().addToCopy(-5); 
     check(copy, 4, 1); 
     copy = test.dayOfMonth().addToCopy(-6); 
     check(copy, 3, 31); 
 } 


public void testPropertyCompareToMonthOfYear1269() { 
     MonthDay test1 = new MonthDay(TEST_TIME1); 
     MonthDay test2 = new MonthDay(TEST_TIME2); 
     assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     try { 
         test1.monthOfYear().compareTo((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     DateTime dt1 = new DateTime(TEST_TIME1); 
     DateTime dt2 = new DateTime(TEST_TIME2); 
     assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     try { 
         test1.monthOfYear().compareTo((ReadableInstant) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPropertySetTextDayOfMonth1283() { 
     MonthDay test = new MonthDay(4, 6); 
     MonthDay copy = test.dayOfMonth().setCopy("12"); 
     check(test, 4, 6); 
     check(copy, 4, 12); 
     copy = test.dayOfMonth().setCopy("2"); 
     check(test, 4, 6); 
     check(copy, 4, 2); 
     copy = test.dayOfMonth().setCopy("4"); 
     check(test, 4, 6); 
     check(copy, 4, 4); 
 } 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {
        assertEquals(monthOfYear, test.getMonthOfYear());
        assertEquals(dayOfMonth, test.getDayOfMonth());
    }
}
