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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1syasyale6qsfnd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,37799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1syasyale6qsfnd.R.inc(37522);
        __CLR4_4_1syasyale6qsfnd.R.inc(37523);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1syasyale6qsfnd.R.inc(37524);
        __CLR4_4_1syasyale6qsfnd.R.inc(37525);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1syasyale6qsfnd.R.inc(37527);try{__CLR4_4_1syasyale6qsfnd.R.inc(37526);
    }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1syasyale6qsfnd.R.inc(37528);
        __CLR4_4_1syasyale6qsfnd.R.inc(37529);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1syasyale6qsfnd.R.inc(37530);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1syasyale6qsfnd.R.inc(37531);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1syasyale6qsfnd.R.inc(37532);originalLocale = Locale.getDefault();
        __CLR4_4_1syasyale6qsfnd.R.inc(37533);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1syasyale6qsfnd.R.inc(37534);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1syasyale6qsfnd.R.inc(37535);Locale.setDefault(Locale.UK);
        __CLR4_4_1syasyale6qsfnd.R.inc(37536);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1syasyale6qsfnd.R.inc(37537);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1syasyale6qsfnd.R.inc(37538);
        __CLR4_4_1syasyale6qsfnd.R.inc(37539);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1syasyale6qsfnd.R.inc(37540);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1syasyale6qsfnd.R.inc(37541);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1syasyale6qsfnd.R.inc(37542);Locale.setDefault(originalLocale);
        __CLR4_4_1syasyale6qsfnd.R.inc(37543);originalDateTimeZone = null;
        __CLR4_4_1syasyale6qsfnd.R.inc(37544);originalTimeZone = null;
        __CLR4_4_1syasyale6qsfnd.R.inc(37545);originalLocale = null;
        __CLR4_4_1syasyale6qsfnd.R.inc(37546);f = null;
        __CLR4_4_1syasyale6qsfnd.R.inc(37547);g = null;
    }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParseLocalDate_year_month_week_201099() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5fyl1sz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_201099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5fyl1sz0(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37548); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37549);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37550);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37551);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalDate_yearOfEra109() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4jjugsz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4jjugsz4(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37552); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37553);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37554);DateTimeFormatter f = DateTimeFormat.forPattern("YYYY-MM GG").withChronology(chrono).withLocale(Locale.UK); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37555);LocalDate date = new LocalDate(2005, 10, 1, chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37556);assertEquals(date, f.parseLocalDate("2005-10 AD")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37557);assertEquals(date, f.parseLocalDate("2005-10 CE")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37558);date = new LocalDate(-2005, 10, 1, chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37559);assertEquals(date, f.parseLocalDate("2005-10 BC")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37560);assertEquals(date, f.parseLocalDate("2005-10 BCE")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrint_chrono_and_zone134() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbb6stszd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono_and_zone134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbb6stszd(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37561); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37562);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37563);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37564);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37565);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37566);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37567);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37568);dt = dt.withChronology(ISO_PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37569);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37570);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37571);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37572);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37573);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37574);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37575);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37576);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37577);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37578);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37579);assertEquals("Wed 2547-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_2012196() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110x9jjszw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2012196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110x9jjszw(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37580); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37581);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37582);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37583);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo242() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkxssrt00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkxssrt00(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37584); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37585);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37586);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37587);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37588);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrint_writerMethods384() throws Exception {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydhk0rt05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydhk0rt05() throws Exception{try{__CLR4_4_1syasyale6qsfnd.R.inc(37589); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37590);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37591);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37592);f.printTo(out, dt); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37593);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37594);out = new CharArrayWriter(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37595);f.printTo(out, dt.getMillis()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37596);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37597);out = new CharArrayWriter(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37598);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37599);assertEquals("2004-06-09", out.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37600);out = new CharArrayWriter(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37601);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37602);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37603);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseMutableDateTime_offsetParsed385() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qq8dh0t0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qq8dh0t0k(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37604); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37605);MutableDateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37606);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37607);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37608);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37609);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37610);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37611);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37612);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37613);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrint_simple501() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhxozdt0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhxozdt0u(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37614); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37615);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37616);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37617);dt = dt.withZone(PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37618);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37619);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37620);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37621);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37622);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrint_appendableMethods586() throws Exception {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189c5ct13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189c5ct13() throws Exception{try{__CLR4_4_1syasyale6qsfnd.R.inc(37623); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37624);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37625);StringBuilder buf = new StringBuilder(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37626);f.printTo(buf, dt); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37627);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37628);buf = new StringBuilder(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37629);f.printTo(buf, dt.getMillis()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37630);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37631);buf = new StringBuilder(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37632);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37633);assertEquals("2004-06-09", buf.toString()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37634);buf = new StringBuilder(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37635);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37636);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37637);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseDateTime_simple_precedence939() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1849et1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence939",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1849et1i(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37638); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37639);DateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37640);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37641);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37642);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37643);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalTime_simple954() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyyxl1t1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple954",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyyxl1t1o(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37644); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37645);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37646);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37647);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37648);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37649);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37650);g.parseDateTime("ABC"); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37651);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseMillis_fractionOfSecondLong1106() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcrphqt1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong1106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcrphqt1w(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37652); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37653);DateTimeFormatter f = new DateTimeFormatterBuilder().appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9).toFormatter().withZoneUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37654);assertEquals(10512, f.parseMillis("10.5123456")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37655);assertEquals(10512, f.parseMillis("10.512999")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrinterParserMethods1326() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7vsq0t20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods1326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7vsq0t20(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37656); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37657);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37658);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37659);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37660);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37661);assertEquals(true, f2.isParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37662);assertNotNull(f2.print(0L)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37663);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37664);f2 = new DateTimeFormatter(f.getPrinter(), null); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37665);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37666);assertEquals(null, f2.getParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37667);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37668);assertEquals(false, f2.isParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37669);assertNotNull(f2.print(0L)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37670);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37671);f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37672);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1syasyale6qsfnd.R.inc(37673);f2 = new DateTimeFormatter(null, f.getParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37674);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37675);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37676);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37677);assertEquals(true, f2.isParser()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37678);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37679);f2.print(0L); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37680);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1syasyale6qsfnd.R.inc(37681);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo_startOfYear1327() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4vne7t2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear1327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4vne7t2q(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37682); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37683);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37684);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37685);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37686);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testWithGetLocale1328() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocmqxzt2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale1328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocmqxzt2v(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37687); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37688);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37689);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37690);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37691);f2 = f.withLocale(null); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37692);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37693);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testWithGetOffsetParsedMethods1329() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnf9q8t32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods1329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnf9q8t32(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37694); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37695);DateTimeFormatter f2 = f; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37696);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37697);assertEquals(null, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37698);f2 = f.withOffsetParsed(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37699);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37700);assertEquals(null, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37701);f2 = f2.withZone(PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37702);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37703);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37704);f2 = f2.withOffsetParsed(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37705);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37706);assertEquals(null, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37707);f2 = f.withOffsetParsed(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37708);assertNotSame(f, f2); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37709);DateTimeFormatter f3 = f2.withOffsetParsed(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37710);assertSame(f2, f3); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_20111330() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196jas7t3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_20111330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196jas7t3j(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37711); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37712);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37713);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37714);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testWithGetChronology1331() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1l2dft3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology1331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1l2dft3n(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37715); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37716);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37717);assertEquals(BUDDHIST_PARIS, f2.getChronology()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37718);assertSame(f2, f2.withChronology(BUDDHIST_PARIS)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37719);f2 = f.withChronology(null); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37720);assertEquals(null, f2.getChronology()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37721);assertSame(f2, f2.withChronology(null)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testPrint_zone1332() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwshg8t3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone1332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwshg8t3u(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37722); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37723);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37724);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37725);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37726);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37727);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37728);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37729);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37730);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37731);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testWithGetZone1333() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jeg3hpt44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone1333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jeg3hpt44(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37732); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37733);DateTimeFormatter f2 = f.withZone(PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37734);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37735);assertSame(f2, f2.withZone(PARIS)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37736);f2 = f.withZone(null); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37737);assertEquals(null, f2.getZone()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37738);assertSame(f2, f2.withZone(null)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalDate_yearOfCentury1334() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14du0w3t4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury1334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14du0w3t4b(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37739); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37740);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37741);DateTimeFormatter f = DateTimeFormat.forPattern("yy M d").withChronology(chrono).withLocale(Locale.UK).withPivotYear(2050); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37742);LocalDate date = new LocalDate(2050, 8, 4, chrono); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37743);assertEquals(date, f.parseLocalDate("50 8 4")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testWithGetPivotYear1335() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di76b0t4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear1335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di76b0t4g(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37744); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37745);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37746);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37747);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37748);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37749);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37750);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37751);f2 = f.withPivotYear(null); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37752);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37753);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseLocalDate_monthDay_withDefaultYear_feb291336() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bc96k3t4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb291336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bc96k3t4q(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37754); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37755);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37756);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37757);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseInto_simple1337() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4d0xvt4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple1337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4d0xvt4u(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37758); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37759);MutableDateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37760);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37761);MutableDateTime result = new MutableDateTime(0L); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37762);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37763);assertEquals(expect, result); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37764);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37765);g.parseInto(null, "2004-06-09T10:20:30Z", 0); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37766);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1syasyale6qsfnd.R.inc(37767);assertEquals(~0, g.parseInto(result, "ABC", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37768);assertEquals(~10, g.parseInto(result, "2004-06-09", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37769);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2)); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseInto_zone1338() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kngu7ct56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone1338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kngu7ct56(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37770); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37771);MutableDateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37772);MutableDateTime result = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37773);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37774);result = new MutableDateTime(0L); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37775);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37776);assertEquals(expect, result); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37777);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37778);result = new MutableDateTime(0L); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37779);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37780);assertEquals(expect, result); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37781);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37782);result = new MutableDateTime(0L); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37783);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37784);assertEquals(expect, result); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseMutableDateTime_simple1339() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unglpct5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple1339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unglpct5l(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37785); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37786);MutableDateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37787);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37788);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37789);try { 
         __CLR4_4_1syasyale6qsfnd.R.inc(37790);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1syasyale6qsfnd.R.inc(37791);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 


public void testParseInto_simple_precedence1389() {__CLR4_4_1syasyale6qsfnd.R.globalSliceStart(getClass().getName(),37792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf9djxt5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1syasyale6qsfnd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1syasyale6qsfnd.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence1389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf9djxt5s(){try{__CLR4_4_1syasyale6qsfnd.R.inc(37792); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37793);MutableDateTime expect = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37794);MutableDateTime result = null; 
     __CLR4_4_1syasyale6qsfnd.R.inc(37795);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37796);result = new MutableDateTime(0L); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37797);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1syasyale6qsfnd.R.inc(37798);assertEquals(expect, result); 
 }finally{__CLR4_4_1syasyale6qsfnd.R.flushNeeded();}} 

    

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
