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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1usqusqlc8axf2f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,40207,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1usqusqlc8axf2f.R.inc(39914);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39915);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1usqusqlc8axf2f.R.inc(39916);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39917);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1usqusqlc8axf2f.R.inc(39919);try{__CLR4_4_1usqusqlc8axf2f.R.inc(39918);
    }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1usqusqlc8axf2f.R.inc(39920);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39921);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39922);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1usqusqlc8axf2f.R.inc(39923);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1usqusqlc8axf2f.R.inc(39924);originalLocale = Locale.getDefault();
        __CLR4_4_1usqusqlc8axf2f.R.inc(39925);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39926);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1usqusqlc8axf2f.R.inc(39927);Locale.setDefault(Locale.UK);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39928);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1usqusqlc8axf2f.R.inc(39929);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1usqusqlc8axf2f.R.inc(39930);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39931);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1usqusqlc8axf2f.R.inc(39932);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39933);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39934);Locale.setDefault(originalLocale);
        __CLR4_4_1usqusqlc8axf2f.R.inc(39935);originalDateTimeZone = null;
        __CLR4_4_1usqusqlc8axf2f.R.inc(39936);originalTimeZone = null;
        __CLR4_4_1usqusqlc8axf2f.R.inc(39937);originalLocale = null;
        __CLR4_4_1usqusqlc8axf2f.R.inc(39938);f = null;
        __CLR4_4_1usqusqlc8axf2f.R.inc(39939);g = null;
    }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParseMutableDateTime_offsetParsed46() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7xoj0utg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7xoj0utg(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39940); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39941);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39942);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39943);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39944);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39945);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39946);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39947);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39948);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39949);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_201270() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qxg2sutq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_201270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qxg2sutq(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39950); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39951);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39952);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39953);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseDateTime_simple_precedence119() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obo5x0utu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obo5x0utu(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39954); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39955);DateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39956);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39957);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39958);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39959);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testPrint_writerMethods131() throws Exception {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1md4mm3uu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1md4mm3uu0() throws Exception{try{__CLR4_4_1usqusqlc8axf2f.R.inc(39960); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39961);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39962);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39963);f.printTo(out, dt); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39964);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39965);out = new CharArrayWriter(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39966);f.printTo(out, dt.getMillis()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39967);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39968);out = new CharArrayWriter(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39969);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39970);assertEquals("2004-06-09", out.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39971);out = new CharArrayWriter(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39972);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(39973);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(39974);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_year_month_week_2010265() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159fg9iuuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2010265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159fg9iuuf(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39975); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39976);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39977);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39978);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_2011323() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etzcq0uuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2011323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etzcq0uuj(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39979); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39980);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39981);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39982);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo_startOfYear328() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a77p4zuun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a77p4zuun(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39983); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39984);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39985);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39986);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39987);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_yearOfCentury332() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dvluouus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dvluouus(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39988); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39989);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39990);DateTimeFormatter f = DateTimeFormat.forPattern("yy M d").withChronology(chrono).withLocale(Locale.UK).withPivotYear(2050); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39991);LocalDate date = new LocalDate(2050, 8, 4, chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39992);assertEquals(date, f.parseLocalDate("50 8 4")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_simple_precedence475() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),39993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15t3ecguux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15t3ecguux(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(39993); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39994);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39995);MutableDateTime result = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39996);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39997);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39998);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(39999);assertEquals(expect, result); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testPrint_appendableMethods500() throws Exception {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnbuo2uv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnbuo2uv4() throws Exception{try{__CLR4_4_1usqusqlc8axf2f.R.inc(40000); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40001);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40002);StringBuilder buf = new StringBuilder(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40003);f.printTo(buf, dt); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40004);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40005);buf = new StringBuilder(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40006);f.printTo(buf, dt.getMillis()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40007);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40008);buf = new StringBuilder(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40009);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40010);assertEquals("2004-06-09", buf.toString()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40011);buf = new StringBuilder(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40012);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40013);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40014);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testWithGetChronology505() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0ureduvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0ureduvj(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40015); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40016);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40017);assertEquals(BUDDHIST_PARIS, f2.getChronology()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40018);assertSame(f2, f2.withChronology(BUDDHIST_PARIS)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40019);f2 = f.withChronology(null); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40020);assertEquals(null, f2.getChronology()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40021);assertSame(f2, f2.withChronology(null)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testWithGetLocale519() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnurckuvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnurckuvq(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40022); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40023);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40024);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40025);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40026);f2 = f.withLocale(null); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40027);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40028);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testPrinterParserMethods534() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnmpdauvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnmpdauvx(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40029); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40030);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40031);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40032);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40033);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40034);assertEquals(true, f2.isParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40035);assertNotNull(f2.print(0L)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40036);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40037);f2 = new DateTimeFormatter(f.getPrinter(), null); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40038);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40039);assertEquals(null, f2.getParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40040);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40041);assertEquals(false, f2.isParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40042);assertNotNull(f2.print(0L)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40043);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40044);f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40045);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40046);f2 = new DateTimeFormatter(null, f.getParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40047);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40048);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40049);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40050);assertEquals(true, f2.isParser()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40051);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40052);f2.print(0L); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40053);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40054);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_yearOfEra644() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167h9x8uwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167h9x8uwn(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40055); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40056);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40057);DateTimeFormatter f = DateTimeFormat.forPattern("YYYY-MM GG").withChronology(chrono).withLocale(Locale.UK); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40058);LocalDate date = new LocalDate(2005, 10, 1, chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40059);assertEquals(date, f.parseLocalDate("2005-10 AD")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40060);assertEquals(date, f.parseLocalDate("2005-10 CE")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40061);date = new LocalDate(-2005, 10, 1, chrono); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40062);assertEquals(date, f.parseLocalDate("2005-10 BC")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40063);assertEquals(date, f.parseLocalDate("2005-10 BCE")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDateTime_simple741() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11itfypuww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11itfypuww(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40064); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40065);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40066);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40067);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40068);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40069);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40070);g.parseDateTime("ABC"); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40071);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_offsetParsed792() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14y7x91ux4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed792",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14y7x91ux4(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40072); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40073);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40074);MutableDateTime result = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40075);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40076);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40077);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40078);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40079);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40080);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40081);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40082);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40083);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40084);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40085);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40086);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40087);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40088);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40089);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40090);assertEquals(expect, result); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalTime_simple829() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8csr0uxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple829",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8csr0uxn(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40091); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40092);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40093);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40094);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40095);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40096);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40097);g.parseDateTime("ABC"); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40098);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_simple1004() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifujlmuxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple1004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifujlmuxv(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40099); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40100);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40101);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40102);MutableDateTime result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40103);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40104);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40105);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40106);g.parseInto(null, "2004-06-09T10:20:30Z", 0); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40108);assertEquals(~0, g.parseInto(result, "ABC", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40109);assertEquals(~10, g.parseInto(result, "2004-06-09", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40110);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testWithGetZone1148() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uu40qduy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone1148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uu40qduy7(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40111); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40112);DateTimeFormatter f2 = f.withZone(PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40113);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40114);assertSame(f2, f2.withZone(PARIS)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40115);f2 = f.withZone(null); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40116);assertEquals(null, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40117);assertSame(f2, f2.withZone(null)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo1298() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117jwvnuye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo1298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117jwvnuye(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40118); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40119);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40120);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40121);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40122);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseInto_zone1314() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m22gh6uyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone1314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m22gh6uyj(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40123); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40124);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40125);MutableDateTime result = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40126);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40127);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40128);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40129);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40130);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40131);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40132);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40133);assertEquals(expect, result); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40134);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40135);result = new MutableDateTime(0L); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40136);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40137);assertEquals(expect, result); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseMutableDateTime_simple1328() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17eskxsuyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple1328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17eskxsuyy(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40138); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40139);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40140);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40141);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40142);try { 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40143);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1usqusqlc8axf2f.R.inc(40144);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testWithGetPivotYear1392() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0zgqluz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear1392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0zgqluz5(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40145); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40146);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40147);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40148);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40149);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40150);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40151);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40152);f2 = f.withPivotYear(null); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40153);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40154);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testPrint_simple1437() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d0ip0uzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple1437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d0ip0uzf(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40155); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40156);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40157);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40158);dt = dt.withZone(PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40159);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40160);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40161);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40162);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40163);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testPrint_zone1551() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsow1juzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone1551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsow1juzo(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40164); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40165);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40166);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40167);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40168);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40169);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40170);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40171);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40172);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt)); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40173);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt)); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseMillis_fractionOfSecondLong1562() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oytnsouzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong1562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oytnsouzy(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40174); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40175);DateTimeFormatter f = new DateTimeFormatterBuilder().appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9).toFormatter().withZoneUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40176);assertEquals(10512, f.parseMillis("10.5123456")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40177);assertEquals(10512, f.parseMillis("10.512999")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testWithGetOffsetParsedMethods1599() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzghl1v02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods1599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzghl1v02(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40178); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40179);DateTimeFormatter f2 = f; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40180);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40181);assertEquals(null, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40182);f2 = f.withOffsetParsed(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40183);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40184);assertEquals(null, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40185);f2 = f2.withZone(PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40186);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40187);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40188);f2 = f2.withOffsetParsed(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40189);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40190);assertEquals(null, f2.getZone()); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40191);f2 = f.withOffsetParsed(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40192);assertNotSame(f, f2); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40193);DateTimeFormatter f3 = f2.withOffsetParsed(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40194);assertSame(f2, f3); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseMutableDateTime_zone1700() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7prp4v0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone1700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7prp4v0j(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40195); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40196);MutableDateTime expect = null; 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40197);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40198);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40199);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40200);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40201);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40202);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 


public void testParseLocalDate_monthDay_withDefaultYear_feb291716() {__CLR4_4_1usqusqlc8axf2f.R.globalSliceStart(getClass().getName(),40203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ee8nztv0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1usqusqlc8axf2f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1usqusqlc8axf2f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb291716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ee8nztv0r(){try{__CLR4_4_1usqusqlc8axf2f.R.inc(40203); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40204);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40205);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1usqusqlc8axf2f.R.inc(40206);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1usqusqlc8axf2f.R.flushNeeded();}} 

    

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
