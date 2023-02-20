/*
 *  Copyright 2001-2006 Stephen Colebourne
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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

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
        return new TestSuite(TestDateTimeFormat.class);
    }

    public TestDateTimeFormat(String name) {
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

public void testFormat_minute175() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
 } 


public void testSubclassableConstructor182() { 
     DateTimeFormat f = new DateTimeFormat() { 
     }; 
     assertNotNull(f); 
 } 


public void testFormat_era183() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "AD", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "AD", f.print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals(dt.toString(), "AD", f.print(dt)); 
 } 


public void testFormat_centuryOfEra184() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "20", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "1", f.print(dt)); 
 } 


public void testFormat_weekyear185() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "-123", f.print(dt)); 
 } 


public void testFormat_yearOfEra_twoDigit186() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     f = f.withZoneUTC(); 
     f.parseDateTime("5"); 
     f.parseDateTime("005"); 
     f.parseDateTime("+50"); 
     f.parseDateTime("-50"); 
 } 


public void testFormat_shortBasicParse187() { 
     DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     assertEquals(dt, f.parseDateTime("040309")); 
     try { 
         assertEquals(dt, f.parseDateTime("20040309")); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = DateTimeFormat.forPattern("yy/MM/dd"); 
     assertEquals(dt, f.parseDateTime("04/03/09")); 
     assertEquals(dt, f.parseDateTime("2004/03/09")); 
 } 


public void testFormat_year_long188() { 
     DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yyyy"); 
     assertEquals(dt.toString(), "278004", f.print(dt)); 
     f = DateTimeFormat.forPattern("yyyyMMdd"); 
     assertEquals(dt.toString(), "2780040609", f.print(dt)); 
     f = DateTimeFormat.forPattern("yyyyddMM"); 
     assertEquals(dt.toString(), "2780040906", f.print(dt)); 
 } 


public void testFormatParse_textMonthApr_Korean189() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     DateTime date = dateFormatter.parseDateTime(str); 
     assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 } 


public void testFormat_clockhourOfDay190() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "10", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "6", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "19", f.print(dt)); 
     dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     assertEquals(dt.toString(), "24", f.print(dt)); 
 } 


public void testFormat_hourOfHalfday191() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "10", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "6", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "7", f.print(dt)); 
     dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     assertEquals(dt.toString(), "0", f.print(dt)); 
 } 


public void testFormat_second192() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "30", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "30", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "30", f.print(dt)); 
 } 


public void testFormat_fractionOfSecondLong193() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "040000", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "040000", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "040000", f.print(dt)); 
 } 


public void testFormat_dayOfWeek194() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
 } 


public void testFormat_dayOfWeekShortText195() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "Wed", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "Wed", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "Wed", f.print(dt)); 
     f = f.withLocale(Locale.FRENCH); 
     assertEquals(dt.toString(), "mer.", f.print(dt)); 
 } 


public void testFormat_zoneAmount197() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "+0000", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "-0400", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "+0900", f.print(dt)); 
 } 


public void testFormatParse_zoneId_colon198() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("01:02 +00:00", str); 
     DateTime parsed = dateFormatter.parseDateTime(str); 
     assertEquals(1, parsed.getHourOfDay()); 
     assertEquals(2, parsed.getMinuteOfHour()); 
 } 


public void testFormat_zoneAmountID199() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "UTC", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 } 


public void testFormatParse_textHalfdayAM_France233() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$06-PM-2007", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 2007, 1, 1); 
 } 


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault527() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("23 juin", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 1980, 6, 23); 
 } 


public void testFormatParse_textEraAD_France744() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$ap. J.-C.2007", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 2007, 1, 1); 
 } 


public void testFormatParse_textHalfdayAM_UK813() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$06-PM-2007", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 2007, 1, 1); 
 } 


public void testFormat_year_twoDigit1108() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     f = f.withZoneUTC(); 
     try { 
         f.parseDateTime("5"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("005"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+50"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("-50"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     f = f.withZoneUTC(); 
     f.parseDateTime("5"); 
     f.parseDateTime("005"); 
     f.parseDateTime("+50"); 
     f.parseDateTime("-50"); 
     f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter(); 
     f = f.withZoneUTC(); 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("+04")); 
     expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("-04")); 
     expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("4")); 
     expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("-4")); 
     expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("004")); 
     expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("+004")); 
     expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("-004")); 
     expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("3004")); 
     expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("+3004")); 
     expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("-3004")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testFormat_dayOfWeekText1109() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     f = f.withLocale(Locale.FRENCH); 
     assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 } 


public void testFormatParse_textEraAD_UK1110() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$AD2007", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 2007, 1, 1); 
 } 


public void testFormatParse_zoneId_noColon1117() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("01:02 +0000", str); 
     DateTime parsed = dateFormatter.parseDateTime(str); 
     assertEquals(1, parsed.getHourOfDay()); 
     assertEquals(2, parsed.getMinuteOfHour()); 
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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void testFormat_zoneText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "UTC", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "EDT", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "JST", f.print(dt));
//     }

    
// Defects4J: flaky method
//     public void testFormat_zoneLongText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
//     }

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
    private void check(DateTime test, int hour, int min, int sec) {
        assertEquals(hour, test.getYear());
        assertEquals(min, test.getMonthOfYear());
        assertEquals(sec, test.getDayOfMonth());
    }

}
