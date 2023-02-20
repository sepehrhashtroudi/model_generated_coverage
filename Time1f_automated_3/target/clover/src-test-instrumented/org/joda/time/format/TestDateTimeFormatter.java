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
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_1lsdlsdle6np4va{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lsdlsdle6np4va.R.inc(28237);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28238);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lsdlsdle6np4va.R.inc(28239);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28240);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_1lsdlsdle6np4va.R.inc(28242);try{__CLR4_4_1lsdlsdle6np4va.R.inc(28241);
    }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lsdlsdle6np4va.R.inc(28243);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28244);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28245);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lsdlsdle6np4va.R.inc(28246);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lsdlsdle6np4va.R.inc(28247);originalLocale = Locale.getDefault();
        __CLR4_4_1lsdlsdle6np4va.R.inc(28248);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28249);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lsdlsdle6np4va.R.inc(28250);Locale.setDefault(Locale.UK);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28251);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_1lsdlsdle6np4va.R.inc(28252);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lsdlsdle6np4va.R.inc(28253);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28254);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lsdlsdle6np4va.R.inc(28255);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28256);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28257);Locale.setDefault(originalLocale);
        __CLR4_4_1lsdlsdle6np4va.R.inc(28258);originalDateTimeZone = null;
        __CLR4_4_1lsdlsdle6np4va.R.inc(28259);originalTimeZone = null;
        __CLR4_4_1lsdlsdle6np4va.R.inc(28260);originalLocale = null;
        __CLR4_4_1lsdlsdle6np4va.R.inc(28261);f = null;
        __CLR4_4_1lsdlsdle6np4va.R.inc(28262);g = null;
    }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_weekyear82() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvkj54lt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testFormat_weekyear82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvkj54lt3(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28263); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28264);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28265);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28266);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28267);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28268);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28269);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28270);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28271);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28272);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testConstructor_int_int_int426() throws Throwable {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x16xbbltd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testConstructor_int_int_int426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x16xbbltd() throws Throwable{try{__CLR4_4_1lsdlsdle6np4va.R.inc(28273); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28274);LocalTime test = new LocalTime(10, 20, 30); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28275);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28276);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28277);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28278);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28279);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28280);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28281);new LocalTime(-1, 20, 30); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28282);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28283);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28284);new LocalTime(24, 20, 30); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28285);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28286);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28287);new LocalTime(10, -1, 30); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28289);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28290);new LocalTime(10, 60, 30); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28292);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28293);new LocalTime(10, 20, -1); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28294);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28295);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28296);new LocalTime(10, 20, 60); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testWithGetLocaleMethods573() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ey43z2lu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocaleMethods573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ey43z2lu2(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28298); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28299);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28300);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28301);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28302);f2 = f.withLocale(null); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28303);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28304);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testWithGetPivotYear574() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dp4ca0lu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dp4ca0lu9(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28305); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28306);DateTimeFormatter f2 = f.withPivotYear(13); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28307);assertEquals(new Integer(13), f2.getPivotYear()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28308);assertSame(f2, f2.withPivotYear(13)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28309);f2 = f.withPivotYear(new Integer(14)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28310);assertEquals(new Integer(14), f2.getPivotYear()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28311);assertSame(f2, f2.withPivotYear(new Integer(14))); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28312);f2 = f.withPivotYear(null); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28313);assertEquals(null, f2.getPivotYear()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28314);assertSame(f2, f2.withPivotYear(null)); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseLocalDate_monthDay_withDefaultYear_feb29575() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cagqojluj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb29575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cagqojluj(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28315); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28316);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28317);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withChronology(chrono).withLocale(Locale.UK).withDefaultYear(2012); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28318);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29")); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseLocalDate_weekyear_month_week_2011576() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tmfbclun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2011576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tmfbclun(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28319); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28320);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28321);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28322);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01")); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testPrinterParserMethods577() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3farzlur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3farzlur(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28323); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28324);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28325);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28326);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28327);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28328);assertEquals(true, f2.isParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28329);assertNotNull(f2.print(0L)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28330);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28331);f2 = new DateTimeFormatter(f.getPrinter(), null); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28332);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28333);assertEquals(null, f2.getParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28334);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28335);assertEquals(false, f2.isParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28336);assertNotNull(f2.print(0L)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28337);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28338);f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28339);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28340);f2 = new DateTimeFormatter(null, f.getParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28341);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28342);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28343);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28344);assertEquals(true, f2.isParser()); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28345);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28346);f2.print(0L); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28347);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28348);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseMutableDateTime_zone578() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xst3ilvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xst3ilvh(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28349); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28350);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28351);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28352);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28353);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28354);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseInto_monthDay_feb29_tokyo_startOfYear579() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oupb9lvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oupb9lvn(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28355); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28356);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28357);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28358);assertEquals(4, f.parseInto(result, "2 29", 0)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28359);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void test_append_Formatter580() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezq66lvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.test_append_Formatter580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezq66lvs(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28360); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28361);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28362);bld.appendLiteral('Y'); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28363);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28364);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28365);bld2.appendLiteral('X'); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28366);bld2.append(f); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28367);bld2.appendLiteral('Z'); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28368);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseInto_Instant581() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llzinmlw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_Instant581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llzinmlw1(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28369); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28370);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28371);MutableDateTime result = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28372);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28373);result = new MutableDateTime(0L); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28374);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28375);assertEquals(expect, result); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28376);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28377);result = new MutableDateTime(0L); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28378);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28379);assertEquals(expect, result); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28380);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28381);result = new MutableDateTime(0L); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28382);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0)); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28383);assertEquals(expect, result); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseMutableDateTime_simple585() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uovk6wlwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uovk6wlwg(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28384); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28385);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28386);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28387);assertEquals(expect, g.parseMutableDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28388);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28389);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseMutableDateTime_simple586() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfvleflwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfvleflwn(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28391); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28392);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28393);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28394);assertEquals(expect, g.parseMutableDateTime("Wed 2004-06-09T10:20:30Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28395);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28396);assertEquals(expect, g.parseMutableDateTime("Mon 2004-06-09T10:20:30Z")); 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseMutableDateTime_simple587() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6vmlylwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6vmlylwt(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28397); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28398);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28399);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28400);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28401);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28402);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28403);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
public void testParseMutableDateTime_simple588() {__CLR4_4_1lsdlsdle6np4va.R.globalSliceStart(getClass().getName(),28404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxvnthlx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsdlsdle6np4va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsdlsdle6np4va.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxvnthlx0(){try{__CLR4_4_1lsdlsdle6np4va.R.inc(28404); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28405);MutableDateTime expect = null; 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28406);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28407);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z")); 
     __CLR4_4_1lsdlsdle6np4va.R.inc(28408);try { 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28409);g.parseMutableDateTime("ABC"); 
         __CLR4_4_1lsdlsdle6np4va.R.inc(28410);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lsdlsdle6np4va.R.flushNeeded();}}
    

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
