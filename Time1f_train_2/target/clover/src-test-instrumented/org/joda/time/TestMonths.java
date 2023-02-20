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
public class TestMonths extends TestCase {static class __CLR4_4_1lqmlqmle6qsf28{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28174);
        __CLR4_4_1lqmlqmle6qsf28.R.inc(28175);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28176);
        __CLR4_4_1lqmlqmle6qsf28.R.inc(28177);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1lqmlqmle6qsf28.R.inc(28179);try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28178);
    }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28180);
    }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28181);
    }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_parseMonths_String162() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmj9a5lqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmj9a5lqu(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28182); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28183);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28184);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28185);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28186);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28187);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28188);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28189);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28190);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28191);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28192);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28193);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28194);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testGetPeriodType283() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g25cgblr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g25cgblr7(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28195); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28196);Months test = Months.months(20); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28197);assertEquals(PeriodType.months(), test.getPeriodType()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testMinus_Months284() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2y3ltlra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2y3ltlra(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28198); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28199);Months test2 = Months.months(2); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28200);Months test3 = Months.months(3); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28201);Months result = test2.minus(test3); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28202);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28203);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28204);assertEquals(-1, result.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28205);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28206);assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28207);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28208);Months.MIN_VALUE.minus(Months.ONE); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28209);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testFactory_months_int285() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13i05bglrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13i05bglrm(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28210); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28211);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28212);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28213);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28214);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28215);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28216);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28217);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28218);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28219);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28220);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28221);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28222);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28223);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28224);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28225);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28226);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28227);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testPlus_Months286() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2tm7ls4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2tm7ls4(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28228); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28229);Months test2 = Months.months(2); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28230);Months test3 = Months.months(3); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28231);Months result = test2.plus(test3); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28232);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28233);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28234);assertEquals(5, result.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28235);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28236);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28237);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28238);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28239);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testFactory_monthsIn_RInterval287() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul4zohlsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul4zohlsg(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28240); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28241);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28242);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28243);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28244);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28245);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28246);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28247);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28248);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testFactory_monthsBetween_RInstant288() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuu7dzlsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuu7dzlsp(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28249); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28250);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28251);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28252);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28253);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28254);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28255);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28256);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28257);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testFactory_monthsBetween_RPartial_YearMonth289() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvnmbalsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvnmbalsy(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28258); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28259);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28260);for (int i = 0; (((i < 6)&&(__CLR4_4_1lqmlqmle6qsf28.R.iget(28261)!=0|true))||(__CLR4_4_1lqmlqmle6qsf28.R.iget(28262)==0&false)); i++) {{ 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28263);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28264);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28265);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28266);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate290() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxz1wqlt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxz1wqlt7(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28267); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28268);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28269);LocalDate end1 = new LocalDate(2006, 9, 9); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28270);YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28271);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28272);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28273);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28274);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28275);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testMultipliedBy_int291() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhsby3ltg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhsby3ltg(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28276); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28277);Months test = Months.months(2); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28278);assertEquals(6, test.multipliedBy(3).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28279);assertEquals(2, test.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28280);assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28281);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28282);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28283);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28284);halfMax.multipliedBy(2); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28285);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testNegated292() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnr402ltq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnr402ltq(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28286); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28287);Months test = Months.months(12); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28288);assertEquals(-12, test.negated().getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28289);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28290);try { 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28291);Months.MIN_VALUE.negated(); 
         __CLR4_4_1lqmlqmle6qsf28.R.inc(28292);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testIsGreaterThan293() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwmvdgltx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwmvdgltx(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28293); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28294);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28295);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28296);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28297);assertEquals(true, Months.ONE.isGreaterThan(null)); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28298);assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 


public void testToString294() {__CLR4_4_1lqmlqmle6qsf28.R.globalSliceStart(getClass().getName(),28299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9l7e2lu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqmlqmle6qsf28.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqmlqmle6qsf28.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9l7e2lu3(){try{__CLR4_4_1lqmlqmle6qsf28.R.inc(28299); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28300);Months test = Months.months(20); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28301);assertEquals("P20M", test.toString()); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28302);test = Months.months(-20); 
     __CLR4_4_1lqmlqmle6qsf28.R.inc(28303);assertEquals("P-20M", test.toString()); 
 }finally{__CLR4_4_1lqmlqmle6qsf28.R.flushNeeded();}} 

    

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
