/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.convert.StringConvert;
import org.joda.time.chrono.ISOChronology;

/**
 * Test string conversion.
 *
 * @author Stephen Colebourne
 */
public class TestStringConvert extends TestCase {static class __CLR4_4_1oa1oa1le6qsfae{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31533,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31465);
        __CLR4_4_1oa1oa1le6qsfae.R.inc(31466);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31467);
        __CLR4_4_1oa1oa1le6qsfae.R.inc(31468);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1oa1oa1le6qsfae.R.inc(31470);try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31469);
    }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31471);
    }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31472);
    }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPeriod50() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jee46joa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jee46joa9(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31473); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31474);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31475);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31476);assertEquals("P1Y2M3W4DT5H6M7.008S", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31477);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testDuration202() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqxs1hoae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqxs1hoae(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31478); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31479);Duration test = new Duration(12345678L); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31480);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31481);assertEquals("PT12345.678S", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31482);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testSeconds498() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys14uroaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys14uroaj(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31483); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31484);Seconds test = Seconds.seconds(5); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31485);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31486);assertEquals("PT5S", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31487);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testWeeks515() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v779hpoao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v779hpoao(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31488); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31489);Weeks test = Weeks.weeks(5); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31490);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31491);assertEquals("P5W", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31492);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testDateTime533() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjucdroat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjucdroat(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31493); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31494);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31495);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31496);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31497);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testYears664() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cenl5joay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears664",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cenl5joay(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31498); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31499);Years test = Years.years(5); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31500);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31501);assertEquals("P5Y", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31502);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testMinutes892() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18riyvfob3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes892",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18riyvfob3(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31503); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31504);Minutes test = Minutes.minutes(5); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31505);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31506);assertEquals("PT5M", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31507);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testHours1070() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9zxtoob8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours1070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9zxtoob8(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31508); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31509);Hours test = Hours.hours(5); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31510);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31511);assertEquals("PT5H", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31512);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testMonthDay_leapDay1112() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdtfclobd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdtfclobd(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31513); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31514);MonthDay test = new MonthDay(2, 29); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31515);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31516);assertEquals("--02-29", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31517);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testMonthDay1214() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao41x5obi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay1214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao41x5obi(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31518); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31519);MonthDay test = new MonthDay(6, 30); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31520);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31521);assertEquals("--06-30", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31522);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


public void testMutableDateTime1395() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moejakobn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime1395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moejakobn(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31523); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31524);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31525);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31526);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31527);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateMidnight1428() {__CLR4_4_1oa1oa1le6qsfae.R.globalSliceStart(getClass().getName(),31528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4x880obs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa1oa1le6qsfae.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa1oa1le6qsfae.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight1428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4x880obs(){try{__CLR4_4_1oa1oa1le6qsfae.R.inc(31528); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31529);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31530);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31531);assertEquals("2010-06-30T00:00:00.000+02:00", str); 
     __CLR4_4_1oa1oa1le6qsfae.R.inc(31532);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str)); 
 }finally{__CLR4_4_1oa1oa1le6qsfae.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

//    public void testInterval() {
//        DateTime a = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
//        DateTime b = new DateTime(2011, 9, 10, 4, 20, 40, 234, ISOChronology.getInstance(ZONE));
//        Interval test = new Interval(a, b);
//        String str = StringConvert.INSTANCE.convertToString(test);
//        assertEquals("2010-06-30T02:30:50.678+02:00/2011-09-10T04:20:40.234+02:00", str);
//        assertEquals(test, StringConvert.INSTANCE.convertFromString(Interval.class, str));
//    }

    

    

    

    

    

    

    

    

    

    

}
