/*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
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
        return new TestSuite(TestISODateTimeFormat.class);
    }

    public TestISODateTimeFormat(String name) {
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

public void testFormat_weekDateTime811() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 } 


public void testFormat_date843() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 } 


public void testFormat_time_partial844() { 
     Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt)); 
 } 


public void testFormat_timeNoMillis_partial845() { 
     Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt)); 
 } 


public void testFormat_tTimeNoMillis847() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 } 


public void testFormat_weekDate853() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 } 


public void testFormat_basicDateTimeNoMillis860() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
 } 


public void testFormat_basicOrdinalDateTimeNoMillis862() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 } 


public void testFormat_basicWeekDate863() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
 } 


public void testFormat_basicWeekDateTimeNoMillis864() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
 } 


public void testFormat_year865() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 } 


public void testFormat_yearMonth866() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
 } 


public void testFormat_weekyearWeek867() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 } 


public void testFormat_hour868() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("10", ISODateTimeFormat.hour().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("11", ISODateTimeFormat.hour().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("12", ISODateTimeFormat.hour().print(dt)); 
 } 


public void testFormat_hourMinute869() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt)); 
 } 


public void testFormat_hourMinuteSecond870() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 } 


public void testFormat_hourMinuteSecondMillis871() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 } 


public void testFormat_hourMinuteSecondFraction872() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 } 


public void testFormat_dateHour873() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt)); 
 } 


public void testFormat_dateHourMinute874() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
 } 


public void testFormat_dateHourMinuteSecond875() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 } 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
