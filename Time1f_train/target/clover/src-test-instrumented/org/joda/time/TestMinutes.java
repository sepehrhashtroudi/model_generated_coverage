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
public class TestMinutes extends TestCase {static class __CLR4_4_1m5jm5jlc8axe2r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,28895,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28711);
        __CLR4_4_1m5jm5jlc8axe2r.R.inc(28712);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28713);
        __CLR4_4_1m5jm5jlc8axe2r.R.inc(28714);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1m5jm5jlc8axe2r.R.inc(28716);try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28715);
    }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28717);
    }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28718);
    }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodType178() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1re5q6em5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1re5q6em5r(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28719); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28720);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28721);assertEquals(PeriodType.minutes(), test.getPeriodType()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_minutesIn_RInterval403() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytbqndm5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytbqndm5u(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28722); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28723);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28724);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28725);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28726);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28727);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28728);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28729);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28730);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testDividedBy_int411() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pvwyjm63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pvwyjm63(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28731); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28732);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28733);assertEquals(6, test.dividedBy(2).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28734);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28735);assertEquals(4, test.dividedBy(3).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28736);assertEquals(3, test.dividedBy(4).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28737);assertEquals(2, test.dividedBy(5).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28738);assertEquals(2, test.dividedBy(6).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28739);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28740);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28741);Minutes.ONE.dividedBy(0); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28742);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_minutesBetween_RInstant454() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bid5r0m6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bid5r0m6f(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28743); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28744);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28745);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28746);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28747);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28748);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28749);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28750);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28751);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testPlus_Minutes522() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1170wdsm6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1170wdsm6o(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28752); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28753);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28754);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28755);Minutes result = test2.plus(test3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28756);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28757);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28758);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28759);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28760);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28761);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28762);Minutes.MAX_VALUE.plus(Minutes.ONE); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28763);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_minutesBetween_RPartial625() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn2672m70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn2672m70(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28764); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28765);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28766);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28767);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28768);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28769);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28770);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28771);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28772);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testMultipliedBy_int688() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m11tkhm79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int688",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m11tkhm79(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28773); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28774);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28775);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28776);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28777);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28778);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28779);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28780);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28781);halfMax.multipliedBy(2); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28782);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testToStandardDuration820() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8ruf3m7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8ruf3m7j(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28783); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28784);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28785);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28786);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28787);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28788);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testMinus_int822() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgf5htm7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int822",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgf5htm7p(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28789); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28790);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28791);Minutes result = test2.minus(3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28792);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28793);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28794);assertEquals(1, Minutes.ONE.minus(0).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28795);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28796);Minutes.MIN_VALUE.minus(1); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28797);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_parseMinutes_String1001() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e49a4m7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String1001",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e49a4m7y(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28798); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28799);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28800);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28801);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28802);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28803);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28804);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28805);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28806);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28807);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28808);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28809);Minutes.parseMinutes("P1DT1M"); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28810);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testMinus_Minutes1114() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pupyjcm8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pupyjcm8b(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28811); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28812);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28813);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28814);Minutes result = test2.minus(test3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28815);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28816);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28817);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28818);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28819);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28820);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28821);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28822);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testToStandardDays1155() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdrhjsm8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdrhjsm8n(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28823); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28824);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28825);Days expected = Days.days(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28826);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testIsLessThan1172() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5k4mwm8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan1172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5k4mwm8r(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28827); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28828);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28829);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28830);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28831);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28832);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testSerialization1227() throws Exception {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdakizm8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdakizm8x() throws Exception{try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28833); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28834);Minutes test = Minutes.THREE; 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28835);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28836);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28837);oos.writeObject(test); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28838);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28839);oos.close(); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28840);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28841);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28842);Minutes result = (Minutes) ois.readObject(); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28843);ois.close(); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28844);assertSame(test, result); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testIsGreaterThan1248() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zhrhnm99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zhrhnm99(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28845); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28846);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28847);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28848);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28849);assertEquals(true, Minutes.ONE.isGreaterThan(null)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28850);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_standardMinutesIn_RPeriod1291() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1644cvgm9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod1291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1644cvgm9f(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28851); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28852);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28853);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28854);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28855);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28856);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28857);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28858);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28859);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28860);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28861);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28862);Minutes.standardMinutesIn(Period.months(1)); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28863);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testFactory_minutes_int1356() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dtrsoem9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int1356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dtrsoem9s(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28864); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28865);assertSame(Minutes.ZERO, Minutes.minutes(0)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28866);assertSame(Minutes.ONE, Minutes.minutes(1)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28867);assertSame(Minutes.TWO, Minutes.minutes(2)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28868);assertSame(Minutes.THREE, Minutes.minutes(3)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28869);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28870);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28871);assertEquals(-1, Minutes.minutes(-1).getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28872);assertEquals(4, Minutes.minutes(4).getMinutes()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testToStandardHours1431() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e345t9ma1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e345t9ma1(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28873); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28874);Minutes test = Minutes.minutes(3 * 60); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28875);Hours expected = Hours.hours(3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28876);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testToStandardWeeks1432() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uplydama5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks1432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uplydama5(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28877); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28878);Minutes test = Minutes.minutes(60 * 24 * 7 * 2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28879);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28880);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testToStandardSeconds1456() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1biv1z4ma9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1biv1z4ma9(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28881); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28882);Minutes test = Minutes.minutes(3); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28883);Seconds expected = Seconds.seconds(3 * 60); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28884);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28885);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28886);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28887);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 


public void testNegated1717() {__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceStart(getClass().getName(),28888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tlow3mag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5jm5jlc8axe2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5jm5jlc8axe2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated1717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tlow3mag(){try{__CLR4_4_1m5jm5jlc8axe2r.R.inc(28888); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28889);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28890);assertEquals(-12, test.negated().getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28891);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1m5jm5jlc8axe2r.R.inc(28892);try { 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28893);Minutes.MIN_VALUE.negated(); 
         __CLR4_4_1m5jm5jlc8axe2r.R.inc(28894);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m5jm5jlc8axe2r.R.flushNeeded();}} 

    

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
