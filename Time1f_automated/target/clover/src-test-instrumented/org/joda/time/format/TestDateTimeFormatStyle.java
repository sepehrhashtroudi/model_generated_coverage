/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1kf4kf4lccieu26{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1kf4kf4lccieu26.R.inc(26464);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26465);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kf4kf4lccieu26.R.inc(26466);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26467);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1kf4kf4lccieu26.R.inc(26469);try{__CLR4_4_1kf4kf4lccieu26.R.inc(26468);
    }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kf4kf4lccieu26.R.inc(26470);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26471);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26472);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kf4kf4lccieu26.R.inc(26473);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kf4kf4lccieu26.R.inc(26474);originalLocale = Locale.getDefault();
        __CLR4_4_1kf4kf4lccieu26.R.inc(26475);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26476);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kf4kf4lccieu26.R.inc(26477);Locale.setDefault(UK);
    }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kf4kf4lccieu26.R.inc(26478);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26479);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kf4kf4lccieu26.R.inc(26480);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26481);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26482);Locale.setDefault(originalLocale);
        __CLR4_4_1kf4kf4lccieu26.R.inc(26483);originalDateTimeZone = null;
        __CLR4_4_1kf4kf4lccieu26.R.inc(26484);originalTimeZone = null;
        __CLR4_4_1kf4kf4lccieu26.R.inc(26485);originalLocale = null;
    }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForStyle_mediumTime322() throws Exception {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhqg37kfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhqg37kfq() throws Exception{try{__CLR4_4_1kf4kf4lccieu26.R.inc(26486); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26487);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26488);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26489);assertSame(g, f); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26490);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26491);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26492);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26493);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26494);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26495);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26496);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
public void testForStyle_longDate324() throws Exception {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rclxjhkg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rclxjhkg1() throws Exception{try{__CLR4_4_1kf4kf4lccieu26.R.inc(26497); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26498);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26499);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26500);assertSame(g, f); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26501);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26502);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26503);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26504);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26505);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26506);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26507);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
public void testFormat_hourOfHalfday325() {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6snrvkgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_hourOfHalfday325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6snrvkgc(){try{__CLR4_4_1kf4kf4lccieu26.R.inc(26508); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26509);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26510);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26511);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26512);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26513);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26514);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26515);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26516);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26517);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
public void testFormat_halfdayOfDayText327() {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ll1eokgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_halfdayOfDayText327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ll1eokgm(){try{__CLR4_4_1kf4kf4lccieu26.R.inc(26518); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26519);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26520);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26521);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26522);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26523);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26524);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26525);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26526);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26527);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
public void testFormat_shortBasicParse329() {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4uhkakgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_shortBasicParse329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4uhkakgw(){try{__CLR4_4_1kf4kf4lccieu26.R.inc(26528); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26529);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26530);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26531);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26532);try { 
         __CLR4_4_1kf4kf4lccieu26.R.inc(26533);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1kf4kf4lccieu26.R.inc(26534);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26535);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26536);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26537);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
public void testForStyle_shortDate331() throws Exception {__CLR4_4_1kf4kf4lccieu26.R.globalSliceStart(getClass().getName(),26538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14h172rkh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf4kf4lccieu26.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf4kf4lccieu26.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14h172rkh6() throws Exception{try{__CLR4_4_1kf4kf4lccieu26.R.inc(26538); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26539);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26540);DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26541);assertSame(g, f); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26542);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26543);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26544);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26545);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26546);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26547);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1kf4kf4lccieu26.R.inc(26548);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1kf4kf4lccieu26.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}
