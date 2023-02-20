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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {static class __CLR4_4_1lomlomle6rclbj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lomlomle6rclbj.R.inc(28102);
        __CLR4_4_1lomlomle6rclbj.R.inc(28103);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lomlomle6rclbj.R.inc(28104);
        __CLR4_4_1lomlomle6rclbj.R.inc(28105);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1lomlomle6rclbj.R.inc(28107);try{__CLR4_4_1lomlomle6rclbj.R.inc(28106);
    }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lomlomle6rclbj.R.inc(28108);
    }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lomlomle6rclbj.R.inc(28109);
    }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_parseMonths_String180() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rb6m7zlou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rb6m7zlou(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28110); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28111);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28112);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28113);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28114);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28115);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28116);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28117);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28118);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28119);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lomlomle6rclbj.R.inc(28120);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28121);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28122);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testGetPeriodType317() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oc0vlp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oc0vlp7(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28123); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28124);Months test = Months.months(20); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28125);assertEquals(PeriodType.months(), test.getPeriodType()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testMinus_Months318() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0f419lpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0f419lpa(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28126); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28127);Months test2 = Months.months(2); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28128);Months test3 = Months.months(3); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28129);Months result = test2.minus(test3); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28130);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28131);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28132);assertEquals(-1, result.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28133);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28134);assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28135);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28136);Months.MIN_VALUE.minus(Months.ONE); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28137);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testFactory_months_int319() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfh5qwlpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfh5qwlpm(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28138); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28139);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28140);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28141);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28142);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28143);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28144);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28145);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28146);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28147);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28148);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28149);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28150);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28151);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28152);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28153);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28154);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28155);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testPlus_Months320() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4qkjylq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4qkjylq4(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28156); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28157);Months test2 = Months.months(2); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28158);Months test3 = Months.months(3); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28159);Months result = test2.plus(test3); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28160);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28161);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28162);assertEquals(5, result.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28163);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28164);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28165);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28166);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28167);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testFactory_monthsIn_RInterval321() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ramt8elqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ramt8elqg(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28168); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28169);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28170);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28171);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28172);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28173);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28174);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28175);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28176);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testFactory_monthsBetween_RInstant322() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iphybqlqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iphybqlqp(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28177); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28178);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28179);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28180);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28181);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28182);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28183);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28184);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28185);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate323() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179i09rlqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179i09rlqy(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28186); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28187);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28188);LocalDate end1 = new LocalDate(2006, 9, 9); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28189);YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28190);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28191);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28192);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28193);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28194);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testSerialization324() throws Exception {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqnz1elr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqnz1elr7() throws Exception{try{__CLR4_4_1lomlomle6rclbj.R.inc(28195); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28196);Months test = Months.THREE; 
     __CLR4_4_1lomlomle6rclbj.R.inc(28197);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28198);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28199);oos.writeObject(test); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28200);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28201);oos.close(); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28202);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28203);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28204);Months result = (Months) ois.readObject(); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28205);ois.close(); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28206);assertSame(test, result); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testDividedBy_int325() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgiog3lrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgiog3lrj(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28207); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28208);Months test = Months.months(12); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28209);assertEquals(6, test.dividedBy(2).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28210);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28211);assertEquals(4, test.dividedBy(3).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28212);assertEquals(3, test.dividedBy(4).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28213);assertEquals(2, test.dividedBy(5).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28214);assertEquals(2, test.dividedBy(6).getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28215);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28216);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28217);Months.ONE.dividedBy(0); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28218);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testNegated326() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfvxjmlrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfvxjmlrv(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28219); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28220);Months test = Months.months(12); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28221);assertEquals(-12, test.negated().getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28222);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28223);try { 
         __CLR4_4_1lomlomle6rclbj.R.inc(28224);Months.MIN_VALUE.negated(); 
         __CLR4_4_1lomlomle6rclbj.R.inc(28225);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testIsGreaterThan327() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su3vswls2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su3vswls2(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28226); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28227);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28228);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28229);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28230);assertEquals(true, Months.ONE.isGreaterThan(null)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28231);assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testIsLessThan328() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9693els8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9693els8(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28232); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28233);assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28234);assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28235);assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28236);assertEquals(false, Months.ONE.isLessThan(null)); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28237);assertEquals(true, Months.months(-1).isLessThan(null)); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 


public void testToString329() {__CLR4_4_1lomlomle6rclbj.R.globalSliceStart(getClass().getName(),28238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e34865lse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lomlomle6rclbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lomlomle6rclbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e34865lse(){try{__CLR4_4_1lomlomle6rclbj.R.inc(28238); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28239);Months test = Months.months(20); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28240);assertEquals("P20M", test.toString()); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28241);test = Months.months(-20); 
     __CLR4_4_1lomlomle6rclbj.R.inc(28242);assertEquals("P-20M", test.toString()); 
 }finally{__CLR4_4_1lomlomle6rclbj.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-------------------------------------------------------------------------
    

    

    

    //-------------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
