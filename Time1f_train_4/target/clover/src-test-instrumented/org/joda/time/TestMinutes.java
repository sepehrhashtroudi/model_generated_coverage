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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes extends TestCase {static class __CLR4_4_1lhzlhzle6rjcmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27997,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27863);
        __CLR4_4_1lhzlhzle6rjcmq.R.inc(27864);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27865);
        __CLR4_4_1lhzlhzle6rjcmq.R.inc(27866);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1lhzlhzle6rjcmq.R.inc(27868);try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27867);
    }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27869);
    }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27870);
    }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodType786() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzewebli7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType786",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzewebli7(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27871); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27872);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27873);assertEquals(PeriodType.minutes(), test.getPeriodType()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testIsLessThan909() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lagblflia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lagblflia(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27874); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27875);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27876);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27877);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27878);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27879);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testFactory_parseMinutes_String910() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpm9uqlig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String910",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpm9uqlig(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27880); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27881);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27882);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27883);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27884);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27885);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27886);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27887);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27888);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27889);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27890);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27891);Minutes.parseMinutes("P1DT1M"); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27892);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testMinus_Minutes911() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1so17palit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes911",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1so17palit(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27893); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27894);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27895);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27896);Minutes result = test2.minus(test3); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27897);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27898);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27899);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27900);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27901);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27902);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27903);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27904);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testFactory_minutes_int912() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1alsz47lj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int912",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1alsz47lj5(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27905); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27906);assertSame(Minutes.ZERO, Minutes.minutes(0)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27907);assertSame(Minutes.ONE, Minutes.minutes(1)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27908);assertSame(Minutes.TWO, Minutes.minutes(2)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27909);assertSame(Minutes.THREE, Minutes.minutes(3)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27910);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27911);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27912);assertEquals(-1, Minutes.minutes(-1).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27913);assertEquals(4, Minutes.minutes(4).getMinutes()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testFactory_minutesBetween_RInstant913() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1krw8f8lje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant913",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1krw8f8lje(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27914); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27915);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27916);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27917);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27918);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27919);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27920);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27921);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27922);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testFactory_minutesBetween_RPartial914() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190mxutljn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial914",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190mxutljn(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27923); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27924);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27925);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27926);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27927);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27928);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27929);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27930);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27931);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testFactory_minutesIn_RInterval915() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao6xipljw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval915",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao6xipljw(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27932); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27933);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27934);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27935);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27936);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27937);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27938);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27939);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27940);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testToStandardWeeks916() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1my7hslk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks916",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1my7hslk5(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27941); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27942);Minutes test = Minutes.minutes(60 * 24 * 7 * 2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27943);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27944);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testToStandardDays917() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f26qrflk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays917",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f26qrflk9(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27945); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27946);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27947);Days expected = Days.days(2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27948);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testToStandardSeconds918() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gd93mlkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds918",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gd93mlkd(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27949); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27950);Minutes test = Minutes.minutes(3); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27951);Seconds expected = Seconds.seconds(3 * 60); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27952);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27953);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27954);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27955);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testToStandardDuration919() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn1y4qlkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration919",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn1y4qlkk(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27956); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27957);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27958);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27959);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27960);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27961);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testMultipliedBy_int920() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeorbmlkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int920",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeorbmlkq(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27962); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27963);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27964);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27965);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27966);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27967);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27968);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27969);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27970);halfMax.multipliedBy(2); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27971);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testDividedBy_int921() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrhd6nll0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int921",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrhd6nll0(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27972); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27973);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27974);assertEquals(6, test.dividedBy(2).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27975);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27976);assertEquals(4, test.dividedBy(3).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27977);assertEquals(3, test.dividedBy(4).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27978);assertEquals(2, test.dividedBy(5).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27979);assertEquals(2, test.dividedBy(6).getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27980);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27981);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27982);Minutes.ONE.dividedBy(0); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27983);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testNegated922() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4434llc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated922",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4434llc(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27984); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27985);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27986);assertEquals(-12, test.negated().getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27987);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27988);try { 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27989);Minutes.MIN_VALUE.negated(); 
         __CLR4_4_1lhzlhzle6rjcmq.R.inc(27990);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 


public void testIsGreaterThan923() {__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceStart(getClass().getName(),27991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130zvgillj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhzlhzle6rjcmq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhzlhzle6rjcmq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan923",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130zvgillj(){try{__CLR4_4_1lhzlhzle6rjcmq.R.inc(27991); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27992);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27993);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27994);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27995);assertEquals(true, Minutes.ONE.isGreaterThan(null)); 
     __CLR4_4_1lhzlhzle6rjcmq.R.inc(27996);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lhzlhzle6rjcmq.R.flushNeeded();}} 

    

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
