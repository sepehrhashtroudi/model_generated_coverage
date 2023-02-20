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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
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
        return new TestSuite(TestDateTime_Properties.class);
    }

    public TestDateTime_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient190() { 
     DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 } 


public void testPropertyAddWrapFieldYear269() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.year().addWrapFieldToCopy(9); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     copy = test.year().addWrapFieldToCopy(0); 
     assertEquals(2004, copy.getYear()); 
     copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     assertEquals(-292275054, copy.getYear()); 
     copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     assertEquals(292278993, copy.getYear()); 
 } 


public void testPropertyToIntervalYearOfCentury407() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     Interval testInterval = test.yearOfCentury().toInterval(); 
     assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 } 


public void testPropertyGetMonthOfYear515() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getDateTime()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsString()); 
     assertEquals("June", test.monthOfYear().getAsText()); 
     assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new DateTime(2004, 7, 9, 0, 0, 0, 0); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH)); 
     assertEquals(1, test.monthOfYear().getMinimumValue()); 
     assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     assertEquals(12, test.monthOfYear().getMaximumValue()); 
     assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
     assertEquals(1, test.monthOfYear().getMinimumValue()); 
     assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     assertEquals(12, test.monthOfYear().getMaximumValue()); 
     assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
 } 


public void testPropertyEqualsHashCodeStrict580() { 
     DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 } 


public void testPropertyGetEra624() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().era(), test.era().getField()); 
     assertEquals("era", test.era().getName()); 
     assertEquals("Property[era]", test.era().toString()); 
     assertSame(test, test.era().getDateTime()); 
     assertEquals(1, test.era().get()); 
     assertEquals("1", test.era().getAsString()); 
     assertEquals("AD", test.era().getAsText()); 
     assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     assertEquals("AD", test.era().getAsShortText()); 
     assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     assertEquals(null, test.era().getRangeDurationField()); 
     assertEquals(2, test.era().getMaximumTextLength(null)); 
     assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 } 


public void testPropertyGetCenturyOfEra625() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     assertSame(test, test.centuryOfEra().getDateTime()); 
     assertEquals(20, test.centuryOfEra().get()); 
     assertEquals("20", test.centuryOfEra().getAsString()); 
     assertEquals("20", test.centuryOfEra().getAsText()); 
     assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.centuryOfEra().getAsShortText()); 
     assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 } 


public void testPropertyToIntervalYearOfEra626() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     Interval testInterval = test.yearOfEra().toInterval(); 
     assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 } 


public void testPropertySetYear627() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.year().setCopy(1960); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertySetWeekOfWeekyear629() { 
     DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     DateTime copy = test.weekOfWeekyear().setCopy(4); 
     assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     try { 
         test.weekOfWeekyear().setCopy(54); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.weekOfWeekyear().setCopy(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPropertyAddLongDayOfWeek630() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfWeek().addToCopy(1L); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyGetMinuteOfDay631() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     assertSame(test, test.minuteOfDay().getDateTime()); 
     assertEquals(803, test.minuteOfDay().get()); 
     assertEquals("803", test.minuteOfDay().getAsString()); 
     assertEquals("803", test.minuteOfDay().getAsText()); 
     assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("803", test.minuteOfDay().getAsShortText()); 
     assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 } 


public void testPropertyGetSecondOfDay632() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     assertEquals("secondOfDay", test.secondOfDay().getName()); 
     assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     assertSame(test, test.secondOfDay().getDateTime()); 
     assertEquals(48223, test.secondOfDay().get()); 
     assertEquals("48223", test.secondOfDay().getAsString()); 
     assertEquals("48223", test.secondOfDay().getAsText()); 
     assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("48223", test.secondOfDay().getAsShortText()); 
     assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 } 


public void testPropertyWithMinimumValueMillisOfDayDSTGap633() { 
     DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     DateTime test = dt.millisOfDay().withMinimumValue(); 
     assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 } 


public void testPropertySetTextDayOfMonth635() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfMonth().setCopy("12"); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyWithMaximumValueMillisOfDayDSTGap636() { 
     DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     DateTime test = dt.millisOfDay().withMaximumValue(); 
     assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 } 


public void testPropertyRoundHalfFloorHourOfDay637() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     copy = test.hourOfDay().roundHalfFloorCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     copy = test.hourOfDay().roundHalfFloorCopy(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyRoundHalfCeilingHourOfDay638() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     copy = test.hourOfDay().roundHalfCeilingCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     copy = test.hourOfDay().roundHalfCeilingCopy(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyRoundHalfEvenHourOfDay639() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     copy = test.hourOfDay().roundHalfEvenCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     copy = test.hourOfDay().roundHalfEvenCopy(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     copy = test.hourOfDay().roundHalfEvenCopy(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyAddDayOfMonth838() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfMonth().addToCopy(9); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(21); 
     assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(22); 
     assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(22 + 30); 
     assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(22 + 31); 
     assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31); 
     assertEquals("2004-12-31T00:00:00.000Z", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31); 
     assertEquals("2005-01-01T00:00:00.000Z", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(-8); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(-9); 
     assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31); 
     assertEquals("2004-01-01T00:00:00.000Z", copy.toString()); 
     copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31); 
     assertEquals("2003-12-31T00:00:00.000Z", copy.toString()); 
 } 


public void testPropertyGetDifferenceHourOfDay939() { 
     DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     assertEquals(13, test.hourOfDay().getDifference(null)); 
     assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 } 


public void testPropertyGetMaxMinValuesDayOfYear940() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertEquals(1, test.dayOfYear().getMinimumValue()); 
     assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     assertEquals(366, test.dayOfYear().getMaximumValue()); 
     assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     assertEquals(365, test.dayOfYear().getMaximumValue()); 
     assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 } 


public void testPropertyWithMaximumValueDayOfMonth941() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfMonth().withMaximumValue(); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyToIntervalMillisOfSecond960() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     Interval testInterval = test.millisOfSecond().toInterval(); 
     assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

            

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

}
