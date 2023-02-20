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
public class TestStringConvert extends TestCase {static class __CLR4_4_1occoccle6rjd4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1occoccle6rjd4b.R.inc(31548);
        __CLR4_4_1occoccle6rjd4b.R.inc(31549);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1occoccle6rjd4b.R.inc(31550);
        __CLR4_4_1occoccle6rjd4b.R.inc(31551);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1occoccle6rjd4b.R.inc(31553);try{__CLR4_4_1occoccle6rjd4b.R.inc(31552);
    }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1occoccle6rjd4b.R.inc(31554);
    }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1occoccle6rjd4b.R.inc(31555);
    }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPeriod59() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ulkxqock();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ulkxqock(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31556); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31557);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31558);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31559);assertEquals("P1Y2M3W4DT5H6M7.008S", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31560);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testSeconds531() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ovoukzocp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ovoukzocp(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31561); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31562);Seconds test = Seconds.seconds(5); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31563);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31564);assertEquals("PT5S", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31565);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testWeeks553() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a54d4docu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a54d4docu(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31566); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31567);Weeks test = Weeks.weeks(5); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31568);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31569);assertEquals("P5W", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31570);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testDateTime569() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kut972ocz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kut972ocz(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31571); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31572);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31573);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31574);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31575);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testYears694() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj48t0od4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj48t0od4(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31576); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31577);Years test = Years.years(5); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31578);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31579);assertEquals("P5Y", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31580);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testHours1101() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgh1vpod9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours1101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgh1vpod9(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31581); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31582);Hours test = Hours.hours(5); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31583);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31584);assertEquals("PT5H", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31585);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testMonthDay_leapDay1138() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh7vhtode();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh7vhtode(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31586); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31587);MonthDay test = new MonthDay(2, 29); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31588);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31589);assertEquals("--02-29", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31590);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testMonthDay1231() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoa3ccodj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoa3ccodj(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31591); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31592);MonthDay test = new MonthDay(6, 30); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31593);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31594);assertEquals("--06-30", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31595);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


public void testMutableDateTime1400() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeiz3bodo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime1400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeiz3bodo(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31596); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31597);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31598);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31599);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31600);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateMidnight1429() {__CLR4_4_1occoccle6rjd4b.R.globalSliceStart(getClass().getName(),31601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvx9fjodt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1occoccle6rjd4b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1occoccle6rjd4b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight1429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvx9fjodt(){try{__CLR4_4_1occoccle6rjd4b.R.inc(31601); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31602);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31603);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31604);assertEquals("2010-06-30T00:00:00.000+02:00", str); 
     __CLR4_4_1occoccle6rjd4b.R.inc(31605);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str)); 
 }finally{__CLR4_4_1occoccle6rjd4b.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
