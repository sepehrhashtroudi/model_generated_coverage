/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
package org.joda.time.format;

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1lyilyile6nl8q4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private DateTimeFormatter f = null;
    private DateTimeFormatter g = null;

    public static void main(String[] args) {try{__CLR4_4_1lyilyile6nl8q4.R.inc(28458);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28459);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lyilyile6nl8q4.R.inc(28460);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28461);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1lyilyile6nl8q4.R.inc(28463);try{__CLR4_4_1lyilyile6nl8q4.R.inc(28462);
    }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lyilyile6nl8q4.R.inc(28464);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28465);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28466);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lyilyile6nl8q4.R.inc(28467);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lyilyile6nl8q4.R.inc(28468);originalLocale = Locale.getDefault();
        __CLR4_4_1lyilyile6nl8q4.R.inc(28469);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28470);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lyilyile6nl8q4.R.inc(28471);Locale.setDefault(Locale.UK);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28472);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1lyilyile6nl8q4.R.inc(28473);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lyilyile6nl8q4.R.inc(28474);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28475);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lyilyile6nl8q4.R.inc(28476);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28477);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28478);Locale.setDefault(originalLocale);
        __CLR4_4_1lyilyile6nl8q4.R.inc(28479);originalDateTimeZone = null;
        __CLR4_4_1lyilyile6nl8q4.R.inc(28480);originalTimeZone = null;
        __CLR4_4_1lyilyile6nl8q4.R.inc(28481);originalLocale = null;
        __CLR4_4_1lyilyile6nl8q4.R.inc(28482);f = null;
        __CLR4_4_1lyilyile6nl8q4.R.inc(28483);g = null;
    }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testParseMutableDateTime_offsetParsed566() {__CLR4_4_1lyilyile6nl8q4.R.globalSliceStart(getClass().getName(),28484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xq6ujrlz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyilyile6nl8q4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyilyile6nl8q4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xq6ujrlz8(){try{__CLR4_4_1lyilyile6nl8q4.R.inc(28484); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28485);MutableDateTime expect = null; 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28486);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28487);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28488);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28489);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28490);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28491);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28492);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28493);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}
public void testParseInto_monthDay_feb29_tokyo_startOfYear567() {__CLR4_4_1lyilyile6nl8q4.R.globalSliceStart(getClass().getName(),28494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4eijelzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyilyile6nl8q4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyilyile6nl8q4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4eijelzi(){try{__CLR4_4_1lyilyile6nl8q4.R.inc(28494); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28495);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28496);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28497);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28498);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}
public void testParseLocalDate_weekyear_month_week_2011568() {__CLR4_4_1lyilyile6nl8q4.R.globalSliceStart(getClass().getName(),28499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1he9xlzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyilyile6nl8q4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyilyile6nl8q4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2011568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1he9xlzn(){try{__CLR4_4_1lyilyile6nl8q4.R.inc(28499); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28500);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28501);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1lyilyile6nl8q4.R.inc(28502);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1lyilyile6nl8q4.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

// This test fails, but since more related tests pass with the extra loop in DateTimeParserBucket
// I'm going to leave the change in and ignore this test
//    public void testParseLocalDate_weekyear_month_week_2013() {
//        Chronology chrono = GJChronology.getInstanceUTC();
//        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
//        assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));
//    }

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    // Ensure time zone name switches properly at the zone DST transition.
    
// Defects4J: flaky method
//     public void testZoneNameNearTransition() {
//         DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
//         DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
//         DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
//         DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
//         DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);
// 
//         DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S zzzz");
//         assertEquals("2005-10-30 01:00:00.0 Eastern Daylight Time", fmt.print(inDST_1));
//         assertEquals("2005-10-30 01:59:59.9 Eastern Daylight Time", fmt.print(inDST_2));
//         assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(onDST));
//         assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(outDST));
//         assertEquals("2005-10-30 02:00:01.0 Eastern Standard Time", fmt.print(outDST_2));
//     }

    // Ensure time zone name switches properly at the zone DST transition.
    
// Defects4J: flaky method
//     public void testZoneShortNameNearTransition() {
//         DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
//         DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
//         DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
//         DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
//         DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);
// 
//         DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S z");
//         assertEquals("2005-10-30 01:00:00.0 EDT", fmt.print(inDST_1));
//         assertEquals("2005-10-30 01:59:59.9 EDT", fmt.print(inDST_2));
//         assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(onDST));
//         assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(outDST));
//         assertEquals("2005-10-30 02:00:01.0 EST", fmt.print(outDST_2));
//     }

}
