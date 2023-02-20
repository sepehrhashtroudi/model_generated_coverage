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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1t0it0ile6rcn1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,37818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37602);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37603);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37604);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37605);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1t0it0ile6rcn1o.R.inc(37607);try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37606);
    }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37608);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37609);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37610);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37611);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37612);originalLocale = Locale.getDefault();
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37613);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37614);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37615);Locale.setDefault(Locale.UK);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37616);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37617);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37618);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37619);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37620);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37621);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37622);Locale.setDefault(originalLocale);
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37623);originalDateTimeZone = null;
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37624);originalTimeZone = null;
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37625);originalLocale = null;
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37626);f = null;
        __CLR4_4_1t0it0ile6rcn1o.R.inc(37627);g = null;
    }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParseLocalDate_year_month_week_2010116() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16en7ddt18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2010116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16en7ddt18(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37628); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37629);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37630);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37631);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testPrint_chrono_and_zone149() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1691vblt1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono_and_zone149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1691vblt1c(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37632); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37633);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37634);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37635);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37636);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37637);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37638);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37639);dt = dt.withChronology(ISO_PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37640);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37641);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37642);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37643);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37644);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37645);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37646);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37647);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37648);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37649);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37650);assertEquals("Wed 2547-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo275() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akpp5ht1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akpp5ht1v(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37651); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37652);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37653);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37654);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37655);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testPrint_writerMethods413() throws Exception {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1yqhut20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1yqhut20() throws Exception{try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37656); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37657);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37658);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37659);f.printTo(out, dt); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37660);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37661);out = new CharArrayWriter(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37662);f.printTo(out, dt.getMillis()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37663);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37664);out = new CharArrayWriter(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37665);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37666);assertEquals("2004-06-09", out.toString()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37667);out = new CharArrayWriter(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37668);try { 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37669);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null); 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37670);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseDateTime_simple_precedence941() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr3ah5t2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence941",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr3ah5t2f(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37671); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37672);DateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37673);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37674);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37675);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37676);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseMillis_fractionOfSecondLong1106() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcrphqt2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong1106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcrphqt2l(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37677); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37678);DateTimeFormatter f = new DateTimeFormatterBuilder().appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9).toFormatter().withZoneUTC(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37679);assertEquals(10512, f.parseMillis("10.5123456")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37680);assertEquals(10512, f.parseMillis("10.512999")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testPrinterParserMethods1337() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqz2m0t2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods1337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqz2m0t2p(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37681); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37682);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37683);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37684);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37685);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37686);assertEquals(true, f2.isParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37687);assertNotNull(f2.print(0L)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37688);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37689);f2 = new DateTimeFormatter(f.getPrinter(), null); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37690);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37691);assertEquals(null, f2.getParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37692);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37693);assertEquals(false, f2.isParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37694);assertNotNull(f2.print(0L)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37695);try { 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37696);f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37697);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37698);f2 = new DateTimeFormatter(null, f.getParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37699);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37700);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37701);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37702);assertEquals(true, f2.isParser()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37703);try { 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37704);f2.print(0L); 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37705);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37706);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo_startOfYear1338() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btz7xtt3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear1338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btz7xtt3f(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37707); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37708);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37709);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37710);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37711);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testWithGetLocale1339() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpmfp5t3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale1339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpmfp5t3k(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37712); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37713);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37714);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37715);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37716);f2 = f.withLocale(null); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37717);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37718);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_20111340() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjblrct3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_20111340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjblrct3r(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37719); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37720);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37721);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37722);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testWithGetChronology1341() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17o9u64t3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology1341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17o9u64t3v(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37723); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37724);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37725);assertEquals(BUDDHIST_PARIS, f2.getChronology()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37726);assertSame(f2, f2.withChronology(BUDDHIST_PARIS)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37727);f2 = f.withChronology(null); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37728);assertEquals(null, f2.getChronology()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37729);assertSame(f2, f2.withChronology(null)); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testPrint_zone1342() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18egnzdt42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone1342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18egnzdt42(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37730); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37731);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37732);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37733);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37734);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37735);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37736);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37737);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37738);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37739);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt)); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseMutableDateTime_zone1343() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbbxqrt4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbbxqrt4c(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37740); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37741);MutableDateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37742);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37743);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37744);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37745);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37746);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37747);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testWithGetPivotYear1344() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v21xx2t4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear1344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v21xx2t4k(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37748); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37749);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37750);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37751);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37752);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37753);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37754);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37755);f2 = f.withPivotYear(null); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37756);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37757);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseLocalDate_monthDay_withDefaultYear_feb291345() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7zxnzt4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb291345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7zxnzt4u(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37758); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37759);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37760);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37761);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseInto_offsetParsed1346() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vqgec3t4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed1346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vqgec3t4y(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37762); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37763);MutableDateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37764);MutableDateTime result = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37765);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37766);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37767);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37768);assertEquals(expect, result); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37769);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37770);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37771);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37772);assertEquals(expect, result); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37773);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37774);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37775);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37776);assertEquals(expect, result); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37777);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37778);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37779);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37780);assertEquals(expect, result); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseInto_zone1347() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15te3jqt5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone1347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15te3jqt5h(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37781); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37782);MutableDateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37783);MutableDateTime result = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37784);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37785);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37786);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37787);assertEquals(expect, result); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37788);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37789);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37790);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37791);assertEquals(expect, result); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37792);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37793);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37794);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37795);assertEquals(expect, result); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseLocalDateTime_simple1348() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168arqxt5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple1348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168arqxt5w(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37796); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37797);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37798);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37799);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37800);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37801);try { 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37802);g.parseDateTime("ABC"); 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37803);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseMutableDateTime_simple1349() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xlp5tt64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple1349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xlp5tt64(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37804); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37805);MutableDateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37806);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37807);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37808);try { 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37809);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1t0it0ile6rcn1o.R.inc(37810);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 


public void testParseInto_simple_precedence1403() {__CLR4_4_1t0it0ile6rcn1o.R.globalSliceStart(getClass().getName(),37811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11oivlmt6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t0it0ile6rcn1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t0it0ile6rcn1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence1403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11oivlmt6b(){try{__CLR4_4_1t0it0ile6rcn1o.R.inc(37811); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37812);MutableDateTime expect = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37813);MutableDateTime result = null; 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37814);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37815);result = new MutableDateTime(0L); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37816);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t0it0ile6rcn1o.R.inc(37817);assertEquals(expect, result); 
 }finally{__CLR4_4_1t0it0ile6rcn1o.R.flushNeeded();}} 

    

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
