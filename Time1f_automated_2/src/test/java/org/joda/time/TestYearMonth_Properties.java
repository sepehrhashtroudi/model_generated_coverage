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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {

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

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Properties.class);
    }

    public TestYearMonth_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------
public void testGet8() { 
     MockPartial mock = new MockPartial(); 
     assertEquals(10, mock.get(DateTimeFieldType.year())); 
     assertEquals(20, mock.get(DateTimeFieldType.monthOfYear())); 
     assertEquals(30, mock.get(DateTimeFieldType.dayOfMonth())); 
     assertEquals(40, mock.get(DateTimeFieldType.dayOfWeek())); 
     assertEquals(TEST_TIME_NOW, mock.get(DateTimeFieldType.dayOfYear())); 
     assertEquals(TEST_TIME_NOW, mock.get(DateTimeFieldType.dayOfWeek())); 
     assertEquals(10, mock.get(DateTimeFieldType.hourOfDay())); 
     assertEquals(20, mock.get(DateTimeFieldType.minuteOfHour())); 
     assertEquals(30, mock.get(DateTimeFieldType.secondOfMinute())); 
     assertEquals(40, mock.get(DateTimeFieldType.millisOfSecond())); 
     assertEquals(10, mock.get(DateTimeFieldType.minuteOfDay())); 
     assertEquals(20, mock.get(DateTimeFieldType.secondOfDay())); 
     assertEquals(30, mock.get(DateTimeFieldType.millisOfDay())); 
     assertEquals(10, mock.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(10, mock.get(DateTimeFieldType.halfdayOfDay())); 
     assertEquals(10, mock.get(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(10, mock.get(DateTimeFieldType.clockhourOfDay())); 
     try { 
         mock.get(DateTimeFieldType.dayOfWeek()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         mock.get(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
public void testPropertyEqualsHashCodeLenient174() { 
     YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }
public void testPropertyGetMonth175() { 
     YearMonth test = new YearMonth(1972, 6); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getReadablePartial()); 
     assertSame(test, test.monthOfYear().getYearMonth()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsString()); 
     assertEquals("June", test.monthOfYear().getAsText()); 
     assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new YearMonth(1972, 7); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
    }
}
