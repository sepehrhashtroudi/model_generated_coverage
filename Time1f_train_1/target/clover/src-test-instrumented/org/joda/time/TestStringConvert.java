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
public class TestStringConvert extends TestCase {static class __CLR4_4_1od2od2le6qea5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31632,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) {try{__CLR4_4_1od2od2le6qea5w.R.inc(31574);
        __CLR4_4_1od2od2le6qea5w.R.inc(31575);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1od2od2le6qea5w.R.inc(31576);
        __CLR4_4_1od2od2le6qea5w.R.inc(31577);return new TestSuite(TestStringConvert.class);
    }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}}

    public TestStringConvert(String name) {
        super(name);__CLR4_4_1od2od2le6qea5w.R.inc(31579);try{__CLR4_4_1od2od2le6qea5w.R.inc(31578);
    }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1od2od2le6qea5w.R.inc(31580);
    }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1od2od2le6qea5w.R.inc(31581);
    }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPeriod62() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtgpxyoda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtgpxyoda(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31582); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31583);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31584);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31585);assertEquals("P1Y2M3W4DT5H6M7.008S", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31586);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testDuration228() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjbw9odf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjbw9odf(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31587); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31588);Duration test = new Duration(12345678L); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31589);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31590);assertEquals("PT12345.678S", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31591);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testSeconds520() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6kc25odk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6kc25odk(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31592); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31593);Seconds test = Seconds.seconds(5); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31594);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31595);assertEquals("PT5S", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31596);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testDateTime558() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7fxg2odp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7fxg2odp(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31597); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31598);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31599);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31600);assertEquals("2010-06-30T02:30:50.678+02:00", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31601);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testYears677() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5lnwnodu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5lnwnodu(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31602); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31603);Years test = Years.years(5); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31604);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31605);assertEquals("P5Y", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31606);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testMinutes906() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqpts7odz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes906",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqpts7odz(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31607); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31608);Minutes test = Minutes.minutes(5); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31609);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31610);assertEquals("PT5M", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31611);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testHours1081() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs98tgoe4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs98tgoe4(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31612); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31613);Hours test = Hours.hours(5); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31614);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31615);assertEquals("PT5H", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31616);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testMonthDay_leapDay1121() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1731iehoe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay1121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1731iehoe9(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31617); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31618);MonthDay test = new MonthDay(2, 29); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31619);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31620);assertEquals("--02-29", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31621);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


public void testMonthDay1217() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kf3yakoee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay1217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kf3yakoee(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31622); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31623);MonthDay test = new MonthDay(6, 30); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31624);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31625);assertEquals("--06-30", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31626);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateMidnight1436() {__CLR4_4_1od2od2le6qea5w.R.globalSliceStart(getClass().getName(),31627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17x299foej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1od2od2le6qea5w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1od2od2le6qea5w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight1436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17x299foej(){try{__CLR4_4_1od2od2le6qea5w.R.inc(31627); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31628);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE)); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31629);String str = StringConvert.INSTANCE.convertToString(test); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31630);assertEquals("2010-06-30T00:00:00.000+02:00", str); 
     __CLR4_4_1od2od2le6qea5w.R.inc(31631);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str)); 
 }finally{__CLR4_4_1od2od2le6qea5w.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
