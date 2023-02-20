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
public class TestStringConvert extends TestCase {static class __CLR4_4_1o8ho8hle6rcm2a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31409);
        __CLR4_4_1o8ho8hle6rcm2a.R.inc(31410);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31411);
        __CLR4_4_1o8ho8hle6rcm2a.R.inc(31412);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1o8ho8hle6rcm2a.R.inc(31414);try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31413);
    }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31415);
    }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31416);
    }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPeriod55() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135ea86o8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135ea86o8p(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31417); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31418);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31419);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31420);assertEquals("P1Y2M3W4DT5H6M7.008S", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31421);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testDuration228() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjbw9o8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjbw9o8u(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31422); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31423);Duration test = new Duration(12345678L); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31424);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31425);assertEquals("PT12345.678S", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31426);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testSeconds539() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114avqto8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114avqto8z(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31427); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31428);Seconds test = Seconds.seconds(5); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31429);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31430);assertEquals("PT5S", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31431);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testWeeks554() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de4bwuo94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de4bwuo94(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31432); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31433);Weeks test = Weeks.weeks(5); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31434);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31435);assertEquals("P5W", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31436);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testDateTime568() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3t7zjo99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3t7zjo99(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31437); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31438);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31439);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31440);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31441);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testYears685() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1429b1yo9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1429b1yo9e(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31442); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31443);Years test = Years.years(5); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31444);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31445);assertEquals("P5Y", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31446);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testMinutes902() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naed11o9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes902",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naed11o9j(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31447); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31448);Minutes test = Minutes.minutes(5); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31449);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31450);assertEquals("PT5M", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31451);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testMonthDay_leapDay1112() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdtfclo9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdtfclo9o(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31452); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31453);MonthDay test = new MonthDay(2, 29); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31454);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31455);assertEquals("--02-29", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31456);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testMonthDay1220() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdz3aso9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay1220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdz3aso9t(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31457); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31458);MonthDay test = new MonthDay(6, 30); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31459);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31460);assertEquals("--06-30", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31461);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 


public void testMutableDateTime1406() {__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceStart(getClass().getName(),31462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wj6cho9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8ho8hle6rcm2a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8ho8hle6rcm2a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime1406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wj6cho9y(){try{__CLR4_4_1o8ho8hle6rcm2a.R.inc(31462); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31463);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31464);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31465);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1o8ho8hle6rcm2a.R.inc(31466);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str)); 
 }finally{__CLR4_4_1o8ho8hle6rcm2a.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
