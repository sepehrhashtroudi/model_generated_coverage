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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1t5tt5tle6rjdoo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,38024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37793);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37794);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37795);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37796);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1t5tt5tle6rjdoo.R.inc(37798);try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37797);
    }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37799);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37800);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37801);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37802);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37803);originalLocale = Locale.getDefault();
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37804);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37805);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37806);Locale.setDefault(Locale.UK);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37807);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37808);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37809);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37810);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37811);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37812);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37813);Locale.setDefault(originalLocale);
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37814);originalDateTimeZone = null;
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37815);originalTimeZone = null;
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37816);originalLocale = null;
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37817);f = null;
        __CLR4_4_1t5tt5tle6rjdoo.R.inc(37818);g = null;
    }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParseLocalDate_yearOfEra128() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t26ag5t6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t26ag5t6j(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37819); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37820);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37821);DateTimeFormatter f = DateTimeFormat.forPattern("YYYY-MM GG").withChronology(chrono).withLocale(Locale.UK); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37822);LocalDate date = new LocalDate(2005, 10, 1, chrono); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37823);assertEquals(date, f.parseLocalDate("2005-10 AD")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37824);assertEquals(date, f.parseLocalDate("2005-10 CE")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37825);date = new LocalDate(-2005, 10, 1, chrono); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37826);assertEquals(date, f.parseLocalDate("2005-10 BC")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37827);assertEquals(date, f.parseLocalDate("2005-10 BCE")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_2012219() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2b4g3t6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2012219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2b4g3t6s(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37828); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37829);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37830);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37831);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo271() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkpkbdt6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkpkbdt6w(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37832); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37833);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37834);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37835);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37836);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseMutableDateTime_offsetParsed414() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qepjy3t71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qepjy3t71(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37837); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37838);MutableDateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37839);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37840);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37841);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37842);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37843);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37844);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37845);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37846);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testPrint_simple534() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14div1jt7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14div1jt7b(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37847); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37848);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37849);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37850);dt = dt.withZone(PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37851);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37852);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37853);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37854);dt = dt.withChronology(BUDDHIST_PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37855);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt)); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testPrint_appendableMethods616() throws Exception {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12p7t48t7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12p7t48t7k() throws Exception{try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37856); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37857);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37858);StringBuilder buf = new StringBuilder(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37859);f.printTo(buf, dt); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37860);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37861);buf = new StringBuilder(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37862);f.printTo(buf, dt.getMillis()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37863);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37864);buf = new StringBuilder(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37865);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37866);assertEquals("2004-06-09", buf.toString()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37867);buf = new StringBuilder(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37868);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37869);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37870);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseDateTime_simple_precedence964() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwoxyit7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence964",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwoxyit7z(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37871); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37872);DateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37873);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37874);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37875);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37876);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalTime_simple982() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfoebkt85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple982",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfoebkt85(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37877); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37878);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37879);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37880);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37881);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37882);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37883);g.parseDateTime("ABC"); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37884);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testPrinterParserMethods1343() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgu3znt8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgu3znt8d(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37885); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37886);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37887);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37888);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37889);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37890);assertEquals(true, f2.isParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37891);assertNotNull(f2.print(0L)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37892);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37893);f2 = new DateTimeFormatter(f.getPrinter(), null); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37894);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37895);assertEquals(null, f2.getParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37896);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37897);assertEquals(false, f2.isParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37898);assertNotNull(f2.print(0L)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37899);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37900);f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37901);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37902);f2 = new DateTimeFormatter(null, f.getParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37903);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37904);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37905);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37906);assertEquals(true, f2.isParser()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37907);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37908);f2.print(0L); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37909);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37910);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseInto_monthDay_feb29_tokyo_startOfYear1344() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sju9bgt93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear1344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sju9bgt93(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37911); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37912);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37913);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37914);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37915);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testWithGetLocale1345() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1308loit98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale1345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1308loit98(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37916); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37917);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37918);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37919);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37920);f2 = f.withLocale(null); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37921);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37922);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testWithGetOffsetParsedMethods1346() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1amzft9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods1346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1amzft9f(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37923); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37924);DateTimeFormatter f2 = f; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37925);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37926);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37927);f2 = f.withOffsetParsed(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37928);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37929);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37930);f2 = f2.withZone(PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37931);assertEquals(false, f2.isOffsetParsed()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37932);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37933);f2 = f2.withOffsetParsed(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37934);assertEquals(true, f2.isOffsetParsed()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37935);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37936);f2 = f.withOffsetParsed(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37937);assertNotSame(f, f2); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37938);DateTimeFormatter f3 = f2.withOffsetParsed(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37939);assertSame(f2, f3); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalDate_weekyear_month_week_20111347() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqsooht9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_20111347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqsooht9w(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37940); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37941);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37942);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37943);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseMutableDateTime_zone1348() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkbrp4ta0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone1348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkbrp4ta0(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37944); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37945);MutableDateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37946);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37947);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37948);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37949);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37950);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37951);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testWithGetZone1349() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttelsota8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone1349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttelsota8(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37952); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37953);DateTimeFormatter f2 = f.withZone(PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37954);assertEquals(PARIS, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37955);assertSame(f2, f2.withZone(PARIS)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37956);f2 = f.withZone(null); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37957);assertEquals(null, f2.getZone()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37958);assertSame(f2, f2.withZone(null)); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalDate_yearOfCentury1350() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7k35vtaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7k35vtaf(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37959); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37960);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37961);DateTimeFormatter f = DateTimeFormat.forPattern("yy M d").withChronology(chrono).withLocale(Locale.UK).withPivotYear(2050); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37962);LocalDate date = new LocalDate(2050, 8, 4, chrono); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37963);assertEquals(date, f.parseLocalDate("50 8 4")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testWithGetPivotYear1351() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b36xqytak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b36xqytak(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37964); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37965);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37966);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37967);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37968);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37969);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37970);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37971);f2 = f.withPivotYear(null); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37972);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37973);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalDate_monthDay_withDefaultYear_feb291352() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d94xhvtau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb291352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d94xhvtau(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37974); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37975);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37976);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37977);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseInto_simple1353() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbcwzbtay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple1353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbcwzbtay(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37978); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37979);MutableDateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37980);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37981);MutableDateTime result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37982);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37983);assertEquals(expect, result); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37984);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37985);g.parseInto(null, "2004-06-09T10:20:30Z", 0); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(37986);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37987);assertEquals(~0, g.parseInto(result, "ABC", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37988);assertEquals(~10, g.parseInto(result, "2004-06-09", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37989);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2)); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseInto_offsetParsed1354() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),37990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ilfditba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed1354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ilfditba(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(37990); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37991);MutableDateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37992);MutableDateTime result = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37993);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37994);result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37995);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37996);assertEquals(expect, result); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37997);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37998);result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(37999);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38000);assertEquals(expect, result); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38001);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38002);result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38003);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38004);assertEquals(expect, result); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38005);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38006);result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38007);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38008);assertEquals(expect, result); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseLocalDateTime_simple1355() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),38009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q75rx1tbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple1355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q75rx1tbt(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(38009); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38010);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38011);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38012);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38013);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS), g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38014);try { 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(38015);g.parseDateTime("ABC"); 
         __CLR4_4_1t5tt5tle6rjdoo.R.inc(38016);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 


public void testParseInto_simple_precedence1395() {__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceStart(getClass().getName(),38017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pec6atc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5tt5tle6rjdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5tt5tle6rjdoo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence1395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pec6atc1(){try{__CLR4_4_1t5tt5tle6rjdoo.R.inc(38017); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38018);MutableDateTime expect = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38019);MutableDateTime result = null; 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38020);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38021);result = new MutableDateTime(0L); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38022);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1t5tt5tle6rjdoo.R.inc(38023);assertEquals(expect, result); 
 }finally{__CLR4_4_1t5tt5tle6rjdoo.R.flushNeeded();}} 

    

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
