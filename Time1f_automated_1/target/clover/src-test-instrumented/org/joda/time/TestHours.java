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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours extends TestCase {static class __CLR4_4_1hwlhwlle6ndphq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23205);
        __CLR4_4_1hwlhwlle6ndphq.R.inc(23206);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23207);
        __CLR4_4_1hwlhwlle6ndphq.R.inc(23208);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1hwlhwlle6ndphq.R.inc(23210);try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23209);
    }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23211);
    }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23212);
    }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_standardHoursIn_RPeriod506() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1zhqahwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1zhqahwt(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23213); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23214);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23215);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23216);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23217);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23218);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23219);assertEquals(1, Hours.standardHoursIn(Period.seconds(119)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23220);assertEquals(2, Hours.standardHoursIn(Period.seconds(120)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23221);assertEquals(2, Hours.standardHoursIn(Period.seconds(121)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23222);assertEquals(120, Hours.standardHoursIn(Period.hours(121)).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23223);try { 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23224);Hours.standardHoursIn(Period.months(1)); 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23225);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
public void testToStandardHours507() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19tzc6ahx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardHours507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19tzc6ahx6(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23226); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23227);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23228);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23229);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23230);try { 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23231);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23232);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
public void testToStandardWeeks508() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbef01hxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbef01hxd(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23233); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23234);Hours test = Hours.hours(24 * 2); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23235);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23236);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
public void testToStandardSeconds509() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dh2x74hxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dh2x74hxh(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23237); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23238);Hours test = Hours.hours(3); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23239);Seconds expected = Seconds.seconds(3 * 60); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23240);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23241);try { 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23242);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23243);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
public void testDividedBy_int510() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyqp1hxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int510",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyqp1hxo(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23244); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23245);Hours test = Hours.hours(12); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23246);assertEquals(6, test.dividedBy(2).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23247);assertEquals(12, test.getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23248);assertEquals(4, test.dividedBy(3).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23249);assertEquals(3, test.dividedBy(4).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23250);assertEquals(2, test.dividedBy(5).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23251);assertEquals(2, test.dividedBy(6).getHours()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23252);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23253);try { 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23254);Hours.ONE.dividedBy(0); 
         __CLR4_4_1hwlhwlle6ndphq.R.inc(23255);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
public void testToString588() {__CLR4_4_1hwlhwlle6ndphq.R.globalSliceStart(getClass().getName(),23256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1en3qm6hy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwlhwlle6ndphq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwlhwlle6ndphq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1en3qm6hy0(){try{__CLR4_4_1hwlhwlle6ndphq.R.inc(23256); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23257);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1hwlhwlle6ndphq.R.inc(23258);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString()); 
 }finally{__CLR4_4_1hwlhwlle6ndphq.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
