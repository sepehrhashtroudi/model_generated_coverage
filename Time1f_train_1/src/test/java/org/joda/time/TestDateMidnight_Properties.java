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
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties extends TestCase {
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
        return new TestSuite(TestDateMidnight_Properties.class);
    }

    public TestDateMidnight_Properties(String name) {
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

public void testPropertyGetDifferenceMonthOfYear924() { 
     DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 } 


public void testPropertySetTextMonthOfYear948() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight copy = test.monthOfYear().setCopy("8"); 
     assertEquals(2004, copy.getYear()); 
     assertEquals(8, copy.getMonthOfYear()); 
     assertEquals(9, copy.getDayOfMonth()); 
 } 


public void testPropertyGetDayOfWeek1401() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     assertSame(test, test.dayOfWeek().getDateMidnight()); 
     assertEquals(3, test.dayOfWeek().get()); 
     assertEquals("3", test.dayOfWeek().getAsString()); 
     assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     assertEquals(false, test.dayOfWeek().isLeap()); 
     assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 } 


public void testPropertyGetCenturyOfEra1415() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     assertSame(test, test.centuryOfEra().getDateMidnight()); 
     assertEquals(20, test.centuryOfEra().get()); 
     assertEquals("20", test.centuryOfEra().getAsText()); 
     assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.centuryOfEra().getAsShortText()); 
     assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 } 


public void testPropertyToIntervalYearOfCentury1458() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     Interval testInterval = test.yearOfCentury().toInterval(); 
     assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 } 


public void testPropertyToIntervalYearOfEra1459() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     Interval testInterval = test.yearOfEra().toInterval(); 
     assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 } 


public void testPropertyToIntervalYear1460() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     Interval testInterval = test.year().toInterval(); 
     assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 } 


public void testPropertyGetWeekyear1461() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     assertEquals("weekyear", test.weekyear().getName()); 
     assertEquals("Property[weekyear]", test.weekyear().toString()); 
     assertSame(test, test.weekyear().getDateMidnight()); 
     assertEquals(2004, test.weekyear().get()); 
     assertEquals("2004", test.weekyear().getAsText()); 
     assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     assertEquals("2004", test.weekyear().getAsShortText()); 
     assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     assertEquals(null, test.weekyear().getRangeDurationField()); 
     assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 } 


public void testPropertyEqualsHashCodeStrict1463() { 
     DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 } 


public void testPropertyAddLongMonthOfYear1464() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight copy = test.monthOfYear().addToCopy(8L); 
     assertEquals(2005, copy.getYear()); 
     assertEquals(2, copy.getMonthOfYear()); 
     assertEquals(9, copy.getDayOfMonth()); 
 } 


public void testPropertyAddWrapFieldMonthOfYear1465() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     assertEquals(2004, copy.getYear()); 
     assertEquals(2, copy.getMonthOfYear()); 
     assertEquals(9, copy.getDayOfMonth()); 
 } 


public void testPropertyRoundHalfFloorMonthOfYear1466() { 
     DateMidnight test = new DateMidnight(2004, 6, 16); 
     DateMidnight copy = test.monthOfYear().roundHalfFloorCopy(); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 17); 
     copy = test.monthOfYear().roundHalfFloorCopy(); 
     assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 15); 
     copy = test.monthOfYear().roundHalfFloorCopy(); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyRoundHalfCeilingMonthOfYear1467() { 
     DateMidnight test = new DateMidnight(2004, 6, 16); 
     DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy(); 
     assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 17); 
     copy = test.monthOfYear().roundHalfCeilingCopy(); 
     assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 15); 
     copy = test.monthOfYear().roundHalfCeilingCopy(); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 } 


public void testPropertyRoundHalfEvenMonthOfYear1468() { 
     DateMidnight test = new DateMidnight(2004, 6, 16); 
     DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 9, 16); 
     copy = test.monthOfYear().roundHalfEvenCopy(); 
     assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 17); 
     copy = test.monthOfYear().roundHalfEvenCopy(); 
     assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     test = new DateMidnight(2004, 6, 15); 
     copy = test.monthOfYear().roundHalfEvenCopy(); 
     assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
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
    

    

    

    

    

    

    

}
