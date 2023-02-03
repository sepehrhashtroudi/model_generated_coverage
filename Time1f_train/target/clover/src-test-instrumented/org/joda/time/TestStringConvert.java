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
public class TestStringConvert extends TestCase {static class __CLR4_4_1pjgpjglc8axei7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1pjgpjglc8axei7.R.inc(33100);
        __CLR4_4_1pjgpjglc8axei7.R.inc(33101);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pjgpjglc8axei7.R.inc(33102);
        __CLR4_4_1pjgpjglc8axei7.R.inc(33103);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1pjgpjglc8axei7.R.inc(33105);try{__CLR4_4_1pjgpjglc8axei7.R.inc(33104);
    }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pjgpjglc8axei7.R.inc(33106);
    }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pjgpjglc8axei7.R.inc(33107);
    }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMutableDateTime192() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oti8wypjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oti8wypjo(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33108); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33109);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33110);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33111);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33112);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testMinutes352() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sej506pjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sej506pjt(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33113); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33114);Minutes test = Minutes.minutes(5); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33115);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33116);assertEquals("PT5M", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33117);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testPeriod562() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p4znvfpjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p4znvfpjy(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33118); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33119);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33120);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33121);assertEquals("P1Y2M3W4DT5H6M7.008S", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33122);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testMonthDay_leapDay632() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrsbbbpk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrsbbbpk3(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33123); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33124);MonthDay test = new MonthDay(2, 29); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33125);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33126);assertEquals("--02-29", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33127);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testYears780() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebl7ripk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears780",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebl7ripk8(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33128); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33129);Years test = Years.years(5); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33130);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33131);assertEquals("P5Y", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33132);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testDuration796() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aey3v9pkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration796",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aey3v9pkd(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33133); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33134);Duration test = new Duration(12345678L); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33135);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33136);assertEquals("PT12345.678S", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33137);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testMonthDay1212() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14644c7pki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay1212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14644c7pki(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33138); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33139);MonthDay test = new MonthDay(6, 30); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33140);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33141);assertEquals("--06-30", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33142);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testWeeks1288() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2iyr9pkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks1288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2iyr9pkn(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33143); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33144);Weeks test = Weeks.weeks(5); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33145);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33146);assertEquals("P5W", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33147);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testHours1358() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ika7ivpks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours1358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ika7ivpks(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33148); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33149);Hours test = Hours.hours(5); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33150);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33151);assertEquals("PT5H", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33152);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testDateTime1559() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16txvb8pkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime1559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16txvb8pkx(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33153); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33154);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33155);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33156);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33157);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateMidnight1565() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tjqqipl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight1565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tjqqipl2(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33158); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33159);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33160);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33161);assertEquals("2010-06-30T00:00:00.000+02:00", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33162);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 


public void testSeconds1731() {__CLR4_4_1pjgpjglc8axei7.R.globalSliceStart(getClass().getName(),33163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1qybcpl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjgpjglc8axei7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjgpjglc8axei7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds1731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1qybcpl7(){try{__CLR4_4_1pjgpjglc8axei7.R.inc(33163); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33164);Seconds test = Seconds.seconds(5); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33165);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33166);assertEquals("PT5S", str); 
     __CLR4_4_1pjgpjglc8axei7.R.inc(33167);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str)); 
 }finally{__CLR4_4_1pjgpjglc8axei7.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
