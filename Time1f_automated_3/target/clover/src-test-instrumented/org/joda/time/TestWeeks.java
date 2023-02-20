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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks extends TestCase {static class __CLR4_4_1juwjuwle6np4ms{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1juwjuwle6np4ms.R.inc(25736);
        __CLR4_4_1juwjuwle6np4ms.R.inc(25737);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1juwjuwle6np4ms.R.inc(25738);
        __CLR4_4_1juwjuwle6np4ms.R.inc(25739);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1juwjuwle6np4ms.R.inc(25741);try{__CLR4_4_1juwjuwle6np4ms.R.inc(25740);
    }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1juwjuwle6np4ms.R.inc(25742);
    }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1juwjuwle6np4ms.R.inc(25743);
    }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_standardWeeksIn_RPeriod216() {__CLR4_4_1juwjuwle6np4ms.R.globalSliceStart(getClass().getName(),25744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15f6dcmjv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juwjuwle6np4ms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juwjuwle6np4ms.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15f6dcmjv4(){try{__CLR4_4_1juwjuwle6np4ms.R.inc(25744); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25745);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25746);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25747);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25748);assertEquals(123, Weeks.standardWeeksIn(Period.hours(123)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25749);assertEquals(-987, Weeks.standardWeeksIn(Period.hours(-987)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25750);assertEquals(1, Weeks.standardWeeksIn(Period.minutes(119)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25751);assertEquals(2, Weeks.standardWeeksIn(Period.minutes(120)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25752);assertEquals(2, Weeks.standardWeeksIn(Period.minutes(121)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25753);assertEquals(120, Weeks.standardWeeksIn(Period.hours(2)).getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25754);try { 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25755);Weeks.standardWeeksIn(Period.months(1)); 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25756);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}
public void testToStandardDays217() {__CLR4_4_1juwjuwle6np4ms.R.globalSliceStart(getClass().getName(),25757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147wpujvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juwjuwle6np4ms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juwjuwle6np4ms.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147wpujvh(){try{__CLR4_4_1juwjuwle6np4ms.R.inc(25757); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25758);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25759);Days expected = Days.days(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25760);assertEquals(expected, test.toStandardDays()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25761);try { 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25762);Weeks.MAX_VALUE.toStandardDays(); 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25763);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}
public void testNegated218() {__CLR4_4_1juwjuwle6np4ms.R.globalSliceStart(getClass().getName(),25764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1li7uc0jvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juwjuwle6np4ms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juwjuwle6np4ms.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1li7uc0jvo(){try{__CLR4_4_1juwjuwle6np4ms.R.inc(25764); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25765);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25766);assertEquals(-12, test.negated().getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25767);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25768);try { 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25769);Weeks.MIN_VALUE.negated(); 
         __CLR4_4_1juwjuwle6np4ms.R.inc(25770);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}
public void testIsGreaterThan219() {__CLR4_4_1juwjuwle6np4ms.R.globalSliceStart(getClass().getName(),25771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17r3lpejvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juwjuwle6np4ms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juwjuwle6np4ms.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17r3lpejvv(){try{__CLR4_4_1juwjuwle6np4ms.R.inc(25771); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25772);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25773);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25774);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25775);assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25776);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}
public void testGetPeriodType533() {__CLR4_4_1juwjuwle6np4ms.R.globalSliceStart(getClass().getName(),25777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szrtszjw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juwjuwle6np4ms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juwjuwle6np4ms.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetPeriodType533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szrtszjw1(){try{__CLR4_4_1juwjuwle6np4ms.R.inc(25777); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25778);Days test = Days.days(20); 
     __CLR4_4_1juwjuwle6np4ms.R.inc(25779);assertEquals(PeriodType.days(), test.getPeriodType()); 
 }finally{__CLR4_4_1juwjuwle6np4ms.R.flushNeeded();}}
    

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
