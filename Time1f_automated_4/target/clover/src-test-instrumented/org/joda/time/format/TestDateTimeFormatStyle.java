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
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1lpvlpvle6o7af8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28147);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28148);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28149);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28150);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1lpvlpvle6o7af8.R.inc(28152);try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28151);
    }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28153);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28154);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28155);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28156);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28157);originalLocale = Locale.getDefault();
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28158);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28159);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28160);Locale.setDefault(UK);
    }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28161);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28162);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28163);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28164);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28165);Locale.setDefault(originalLocale);
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28166);originalDateTimeZone = null;
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28167);originalTimeZone = null;
        __CLR4_4_1lpvlpvle6o7af8.R.inc(28168);originalLocale = null;
    }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForStyle_mediumTime83() throws Exception {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wyc9jlqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wyc9jlqh() throws Exception{try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28169); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28170);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28171);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28172);assertSame(g, f); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28173);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28174);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28175);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28176);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28177);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28178);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28179);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_shortBasicParse89() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a37vznlqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_shortBasicParse89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a37vznlqs(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28180); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28181);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28182);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28183);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28184);try { 
         __CLR4_4_1lpvlpvle6o7af8.R.inc(28185);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1lpvlpvle6o7af8.R.inc(28186);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28187);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28188);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28189);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_minute90() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksbg48lr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_minute90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksbg48lr2(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28190); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28191);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28192);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28193);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28194);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28195);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28196);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28197);assertEquals(dt.toString(), "20", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_halfdayOfDayText92() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksofwhlra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_halfdayOfDayText92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksofwhlra(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28198); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28199);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28200);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28201);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28202);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28203);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28204);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28205);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28206);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28207);assertEquals(dt.toString(), "mer.", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_clockhourOfDay93() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dt4f0qlrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_clockhourOfDay93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dt4f0qlrk(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28208); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28209);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28210);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28211);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28212);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28213);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28214);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28215);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28216);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28217);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_clockhourOfHalfday94() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zvjslru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_clockhourOfHalfday94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zvjslru(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28218); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28219);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28220);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28221);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28222);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28223);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28224);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28225);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28226);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28227);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testForStyle_longDate97() throws Exception {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpm7kkls4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpm7kkls4() throws Exception{try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28228); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28229);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28230);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28231);assertSame(g, f); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28232);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28233);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28234);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28235);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28236);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28237);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28238);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void test_printParseOffset98() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn6u7olsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.test_printParseOffset98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn6u7olsf(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28239); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28240);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28241);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28242);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28243);assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28244);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28245);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28246);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormatParse_textMonthApr_Korean99() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwb84llsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormatParse_textMonthApr_Korean99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwb84llsn(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28247); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28248);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28249);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28250);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28251);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_shortText441() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdoqw5lss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_shortText441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdoqw5lss(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28252); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28253);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28254);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28255);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28256);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28257);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28258);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28259);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28260);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28261);assertEquals(dt.toString(), "23", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
public void testFormat_halfdayOfDayText444() {__CLR4_4_1lpvlpvle6o7af8.R.globalSliceStart(getClass().getName(),28262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2tvj8lt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lpvlpvle6o7af8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lpvlpvle6o7af8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testFormat_halfdayOfDayText444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2tvj8lt2(){try{__CLR4_4_1lpvlpvle6o7af8.R.inc(28262); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28263);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28264);DateTimeFormatter f = DateTimeFormat.forPattern("H").withLocale(Locale.UK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28265);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28266);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28267);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28268);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28269);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28270);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1lpvlpvle6o7af8.R.inc(28271);assertEquals(dt.toString(), "161", f.print(dt)); 
 }finally{__CLR4_4_1lpvlpvle6o7af8.R.flushNeeded();}}
    

    

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
