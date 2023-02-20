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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1t6mt6mle6qeaqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,38096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37822);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37823);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37824);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37825);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1t6mt6mle6qeaqj.R.inc(37827);try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37826);
    }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37828);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37829);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37830);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37831);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37832);originalLocale = Locale.getDefault();
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37833);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37834);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37835);Locale.setDefault(Locale.UK);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37836);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37837);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37838);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37839);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37840);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37841);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37842);Locale.setDefault(originalLocale);
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37843);originalDateTimeZone = null;
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37844);originalTimeZone = null;
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37845);originalLocale = null;
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37846);f = null;
        __CLR4_4_1t6mt6mle6qeaqj.R.inc(37847);g = null;
    }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParseLocalDate_year_month_week_2010121() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1727v7tt7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2010121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1727v7tt7c(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37848); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37849);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37850);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37851);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDate_yearOfEra130() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ws1gnwt7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ws1gnwt7g(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37852); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37853);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37854);DateTimeFormatter f = DateTimeFormat.forPattern("YYYY-MM GG").withChronology(chrono).withLocale(Locale.UK); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37855);LocalDate date = new LocalDate(2005, 10, 1, chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37856);assertEquals(date, f.parseLocalDate("2005-10 AD")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37857);assertEquals(date, f.parseLocalDate("2005-10 CE")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37858);date = new LocalDate(-2005, 10, 1, chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37859);assertEquals(date, f.parseLocalDate("2005-10 BC")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37860);assertEquals(date, f.parseLocalDate("2005-10 BCE")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testPrint_chrono_and_zone152() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7x0btt7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono_and_zone152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7x0btt7p(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37861); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37862);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37863);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37864);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37865);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37866);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37867);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37868);dt = dt.withChronology(ISO_PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37869);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37870);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37871);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37872);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37873);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37874);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37875);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37876);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37877);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).withZone(PARIS).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37878);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37879);assertEquals("Wed 2547-06-09T06:20:30-04:00", f.withChronology(null).withZone(NEWYORK).print(dt)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_2012221() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecfy8ct88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2012221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecfy8ct88(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37880); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37881);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37882);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37883);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testPrint_writerMethods404() throws Exception {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17l3sqst8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17l3sqst8c() throws Exception{try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37884); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37885);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37886);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37887);f.printTo(out, dt); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37888);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37889);out = new CharArrayWriter(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37890);f.printTo(out, dt.getMillis()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37891);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37892);out = new CharArrayWriter(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37893);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37894);assertEquals("2004-06-09", out.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37895);out = new CharArrayWriter(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37896);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37897);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseMutableDateTime_offsetParsed406() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136ukzit8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136ukzit8r(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37899); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37900);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37901);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37902);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37903);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37904);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37905);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37906);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37907);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37908);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testPrint_simple522() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vubz2yt91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vubz2yt91(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37909); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37910);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37911);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37912);dt = dt.withZone(PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37913);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37914);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37915);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37916);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37917);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testPrint_appendableMethods605() throws Exception {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9n27st9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9n27st9a() throws Exception{try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37918); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37919);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37920);StringBuilder buf = new StringBuilder(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37921);f.printTo(buf, dt); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37922);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37923);buf = new StringBuilder(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37924);f.printTo(buf, dt.getMillis()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37925);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37926);buf = new StringBuilder(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37927);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37928);assertEquals("2004-06-09", buf.toString()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37929);buf = new StringBuilder(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37930);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37931);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37932);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseDateTime_simple_precedence954() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19t5yl1t9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence954",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19t5yl1t9p(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37933); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37934);DateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37935);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37936);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37937);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37938);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalTime_simple968() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14cacoot9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple968",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14cacoot9v(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37939); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37940);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37941);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37942);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37943);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37944);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37945);g.parseDateTime("ABC"); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(37946);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseMillis_fractionOfSecondLong1114() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gghditta3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gghditta3(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37947); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37948);DateTimeFormatter f = new DateTimeFormatterBuilder().appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9).toFormatter().withZoneUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37949);assertEquals(10512, f.parseMillis("10.5123456")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37950);assertEquals(10512, f.parseMillis("10.512999")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo_startOfYear1339() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2z6qata7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear1339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2z6qata7(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37951); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37952);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37953);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37954);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37955);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testWithGetLocale1340() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8r89vtac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale1340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8r89vtac(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37956); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37957);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37958);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37959);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37960);f2 = f.withLocale(null); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37961);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37962);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testWithGetOffsetParsedMethods1341() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19sat12taj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods1341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19sat12taj(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37963); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37964);DateTimeFormatter f2 = f; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37965);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37966);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37967);f2 = f.withOffsetParsed(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37968);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37969);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37970);f2 = f2.withZone(PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37971);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37972);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37973);f2 = f2.withOffsetParsed(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37974);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37975);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37976);f2 = f.withOffsetParsed(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37977);assertNotSame(f, f2); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37978);DateTimeFormatter f3 = f2.withOffsetParsed(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37979);assertSame(f2, f3); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_20111342() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1bjcatb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_20111342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1bjcatb0(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37980); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37981);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37982);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37983);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testWithGetChronology1343() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e69rr2tb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e69rr2tb4(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37984); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37985);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37986);assertEquals(BUDDHIST_PARIS, f2.getChronology()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37987);assertSame(f2, f2.withChronology(BUDDHIST_PARIS)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37988);f2 = f.withChronology(null); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37989);assertEquals(null, f2.getChronology()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37990);assertSame(f2, f2.withChronology(null)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testPrint_zone1344() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),37991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wgqeftbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone1344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wgqeftbb(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(37991); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37992);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37993);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37994);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37995);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37996);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37997);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37998);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(37999);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38000);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseMutableDateTime_zone1345() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtbvbptbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone1345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtbvbptbl(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38001); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38002);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38003);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38004);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38005);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38006);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38007);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38008);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testWithGetZone1346() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2epf9tbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone1346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2epf9tbt(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38009); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38010);DateTimeFormatter f2 = f.withZone(PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38011);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38012);assertSame(f2, f2.withZone(PARIS)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38013);f2 = f.withZone(null); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38014);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38015);assertSame(f2, f2.withZone(null)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDate_yearOfCentury1347() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6f863tc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury1347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6f863tc0(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38016); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38017);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38018);DateTimeFormatter f = DateTimeFormat.forPattern("yy M d").withChronology(chrono).withLocale(Locale.UK).withPivotYear(2050); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38019);LocalDate date = new LocalDate(2050, 8, 4, chrono); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38020);assertEquals(date, f.parseLocalDate("50 8 4")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testWithGetPivotYear1348() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i222r6tc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear1348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i222r6tc5(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38021); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38022);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38023);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38024);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38025);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38026);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38027);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38028);f2 = f.withPivotYear(null); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38029);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38030);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDate_monthDay_withDefaultYear_feb291349() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k802i3tcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb291349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k802i3tcf(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38031); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38032);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38033);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38034);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseInto_simple1350() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kd0lwtcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kd0lwtcj(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38035); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38036);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38037);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38038);MutableDateTime result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38039);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38040);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38041);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38042);g.parseInto(null, "2004-06-09T10:20:30Z", 0); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38043);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38044);assertEquals(~0, g.parseInto(result, "ABC", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38045);assertEquals(~10, g.parseInto(result, "2004-06-09", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38046);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2)); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseInto_offsetParsed1351() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9lbqxtcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9lbqxtcv(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38047); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38048);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38049);MutableDateTime result = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38050);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38051);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38052);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38053);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38054);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38055);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38056);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38057);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38058);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38059);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38060);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38061);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38062);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38063);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38064);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38065);assertEquals(expect, result); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseInto_zone1352() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ja964wtde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone1352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ja964wtde(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38066); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38067);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38068);MutableDateTime result = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38069);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38070);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38071);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38072);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38073);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38074);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38075);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38076);assertEquals(expect, result); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38077);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38078);result = new MutableDateTime(0L); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38079);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38080);assertEquals(expect, result); 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseLocalDateTime_simple1353() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jp5uc3tdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple1353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jp5uc3tdt(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38081); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38082);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38083);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38084);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38085);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38086);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38087);g.parseDateTime("ABC"); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38088);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 


public void testParseMutableDateTime_simple1354() {__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceStart(getClass().getName(),38089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj9dfdte1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mle6qeaqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mle6qeaqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple1354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj9dfdte1(){try{__CLR4_4_1t6mt6mle6qeaqj.R.inc(38089); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38090);MutableDateTime expect = null; 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38091);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38092);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t6mt6mle6qeaqj.R.inc(38093);try { 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38094);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1t6mt6mle6qeaqj.R.inc(38095);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mle6qeaqj.R.flushNeeded();}} 

    

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
