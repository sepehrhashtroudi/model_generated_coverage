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
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays extends TestCase {static class __CLR4_4_1j7zj7zlc8axdt2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,25121,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24911);
        __CLR4_4_1j7zj7zlc8axdt2.R.inc(24912);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24913);
        __CLR4_4_1j7zj7zlc8axdt2.R.inc(24914);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1j7zj7zlc8axdt2.R.inc(24916);try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24915);
    }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24917);
    }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24918);
    }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_daysBetween_RInstant248() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ioefj87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ioefj87(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24919); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24920);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24921);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24922);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24923);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24924);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24925);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24926);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24927);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testMinus_Days320() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8g6dcj8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8g6dcj8g(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24928); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24929);Days test2 = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24930);Days test3 = Days.days(3); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24931);Days result = test2.minus(test3); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24932);assertEquals(2, test2.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24933);assertEquals(3, test3.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24934);assertEquals(-1, result.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24935);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24936);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24937);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24938);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24939);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_daysBetween_RPartial_LocalDate321() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehjd1hj8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehjd1hj8s(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24940); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24941);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24942);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24943);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24944);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24945);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24946);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24947);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24948);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testIsGreaterThan339() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z5c1rj91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z5c1rj91(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24949); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24950);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24951);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24952);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24953);assertEquals(true, Days.ONE.isGreaterThan(null)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24954);assertEquals(false, Days.days(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testFactory_daysIn_RInterval354() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvckamj97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvckamj97(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24955); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24956);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24957);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24958);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24959);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24960);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24961);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24962);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24963);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testDividedBy_int520() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1w5uij9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1w5uij9g(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24964); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24965);Days test = Days.days(12); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24966);assertEquals(6, test.dividedBy(2).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24967);assertEquals(12, test.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24968);assertEquals(4, test.dividedBy(3).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24969);assertEquals(3, test.dividedBy(4).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24970);assertEquals(2, test.dividedBy(5).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24971);assertEquals(2, test.dividedBy(6).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24972);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24973);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24974);Days.ONE.dividedBy(0); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24975);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testMultipliedBy_int526() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1il0qgcj9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1il0qgcj9s(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24976); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24977);Days test = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24978);assertEquals(6, test.multipliedBy(3).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24979);assertEquals(2, test.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24980);assertEquals(-6, test.multipliedBy(-3).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24981);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24982);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24983);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24984);halfMax.multipliedBy(2); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24985);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testNegated563() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dqcjtja2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dqcjtja2(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24986); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24987);Days test = Days.days(12); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24988);assertEquals(-12, test.negated().getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24989);assertEquals(12, test.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24990);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24991);Days.MIN_VALUE.negated(); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(24992);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testGetMethods611() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrsmunja9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrsmunja9(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24993); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24994);Days test = Days.days(20); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24995);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testFactory_parseDays_String678() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),24996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7fanjac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7fanjac(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(24996); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24997);assertEquals(0, Days.parseDays((String) null).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24998);assertEquals(0, Days.parseDays("P0D").getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(24999);assertEquals(1, Days.parseDays("P1D").getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25000);assertEquals(-3, Days.parseDays("P-3D").getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25001);assertEquals(2, Days.parseDays("P0Y0M2D").getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25002);assertEquals(2, Days.parseDays("P2DT0H0M").getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25003);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25004);Days.parseDays("P1Y1D"); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25005);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25006);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25007);Days.parseDays("P1DT1H"); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25008);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testFactory_standardDaysIn_RPeriod872() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrkrrajap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod872",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrkrrajap(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25009); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25010);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25011);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25012);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25013);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25014);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25015);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25016);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25017);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25018);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25019);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25020);Days.standardDaysIn(Period.months(1)); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25021);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToStandardDuration1057() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1aa1mjb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration1057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1aa1mjb2(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25022); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25023);Days test = Days.days(20); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25024);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25025);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25026);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25027);assertEquals(expected, Days.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testPlus_int1175() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xeomf3jb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int1175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xeomf3jb8(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25028); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25029);Days test2 = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25030);Days result = test2.plus(3); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25031);assertEquals(2, test2.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25032);assertEquals(5, result.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25033);assertEquals(1, Days.ONE.plus(0).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25034);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25035);Days.MAX_VALUE.plus(1); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25036);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToStandardWeeks1192() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bzaadjbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks1192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bzaadjbh(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25037); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25038);Days test = Days.days(14); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25039);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25040);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testFactory_days_int1226() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpd3yyjbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int1226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpd3yyjbl(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25041); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25042);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25043);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25044);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25045);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25046);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25047);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25048);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25049);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25050);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25051);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25052);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25053);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testIsLessThan1297() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yct150jby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan1297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yct150jby(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25054); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25055);assertEquals(false, Days.THREE.isLessThan(Days.TWO)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25056);assertEquals(false, Days.THREE.isLessThan(Days.THREE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25057);assertEquals(true, Days.TWO.isLessThan(Days.THREE)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25058);assertEquals(false, Days.ONE.isLessThan(null)); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25059);assertEquals(true, Days.days(-1).isLessThan(null)); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testConstants1300() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0hylijc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants1300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0hylijc4(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25060); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25061);assertEquals(0, Days.ZERO.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25062);assertEquals(1, Days.ONE.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25063);assertEquals(2, Days.TWO.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25064);assertEquals(3, Days.THREE.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25065);assertEquals(4, Days.FOUR.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25066);assertEquals(5, Days.FIVE.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25067);assertEquals(6, Days.SIX.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25068);assertEquals(7, Days.SEVEN.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25069);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25070);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToStandardSeconds1324() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0gycgjcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds1324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0gycgjcf(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25071); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25072);Days test = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25073);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25074);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25075);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25076);Days.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25077);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testSerialization1361() throws Exception {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgcev2jcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization1361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgcev2jcm() throws Exception{try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25078); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25079);Days test = Days.SEVEN; 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25080);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25081);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25082);oos.writeObject(test); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25083);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25084);oos.close(); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25085);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25086);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25087);Days result = (Days) ois.readObject(); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25088);ois.close(); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25089);assertSame(test, result); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testPlus_Days1377() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsegnnjcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days1377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsegnnjcy(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25090); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25091);Days test2 = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25092);Days test3 = Days.days(3); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25093);Days result = test2.plus(test3); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25094);assertEquals(2, test2.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25095);assertEquals(3, test3.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25096);assertEquals(5, result.getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25097);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25098);assertEquals(1, Days.ONE.plus((Days) null).getDays()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25099);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25100);Days.MAX_VALUE.plus(Days.ONE); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25101);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToStandardHours1458() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8pogijda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours1458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8pogijda(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25102); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25103);Days test = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25104);Hours expected = Hours.hours(2 * 24); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25105);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25106);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25107);Days.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25108);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToStandardMinutes1485() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kfyjcsjdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes1485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kfyjcsjdh(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25109); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25110);Days test = Days.days(2); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25111);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25112);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25113);try { 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25114);Days.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1j7zj7zlc8axdt2.R.inc(25115);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 


public void testToString1526() {__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceStart(getClass().getName(),25116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8vvgtjdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7zj7zlc8axdt2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7zj7zlc8axdt2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString1526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8vvgtjdo(){try{__CLR4_4_1j7zj7zlc8axdt2.R.inc(25116); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25117);Days test = Days.days(20); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25118);assertEquals("P20D", test.toString()); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25119);test = Days.days(-20); 
     __CLR4_4_1j7zj7zlc8axdt2.R.inc(25120);assertEquals("P-20D", test.toString()); 
 }finally{__CLR4_4_1j7zj7zlc8axdt2.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

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
