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
public class TestMonths extends TestCase {static class __CLR4_4_1lrllrlle6qe9s5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28366,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28209);
        __CLR4_4_1lrllrlle6qe9s5.R.inc(28210);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28211);
        __CLR4_4_1lrllrlle6qe9s5.R.inc(28212);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1lrllrlle6qe9s5.R.inc(28214);try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28213);
    }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28215);
    }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28216);
    }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_parseMonths_String181() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uk6l0glrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uk6l0glrt(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28217); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28218);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28219);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28220);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28221);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28222);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28223);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28224);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28225);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28226);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28227);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28228);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28229);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testMinus_Months304() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apfno6ls6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apfno6ls6(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28230); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28231);Months test2 = Months.months(2); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28232);Months test3 = Months.months(3); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28233);Months result = test2.minus(test3); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28234);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28235);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28236);assertEquals(-1, result.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28237);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28238);assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28239);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28240);Months.MIN_VALUE.minus(Months.ONE); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28241);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testFactory_months_int305() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nadlyjlsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nadlyjlsi(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28242); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28243);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28244);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28245);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28246);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28247);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28248);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28249);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28250);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28251);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28252);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28253);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28254);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28255);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28256);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28257);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28258);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28259);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testPlus_Months306() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fynh2ylt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fynh2ylt0(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28260); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28261);Months test2 = Months.months(2); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28262);Months test3 = Months.months(3); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28263);Months result = test2.plus(test3); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28264);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28265);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28266);assertEquals(5, result.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28267);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28268);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28269);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28270);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28271);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testFactory_monthsIn_RInterval307() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sr8eiltc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sr8eiltc(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28272); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28273);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28274);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28275);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28276);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28277);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28278);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28279);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28280);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testFactory_monthsBetween_RInstant308() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdw3b6ltl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdw3b6ltl(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28281); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28282);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28283);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28284);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28285);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28286);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28287);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28288);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28289);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testFactory_monthsBetween_RPartial_YearMonth309() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwq4ypltu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwq4ypltu(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28290); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28291);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28292);for (int i = 0; (((i < 6)&&(__CLR4_4_1lrllrlle6qe9s5.R.iget(28293)!=0|true))||(__CLR4_4_1lrllrlle6qe9s5.R.iget(28294)==0&false)); i++) {{ 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28295);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28296);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28297);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28298);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate310() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oar8sflu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oar8sflu3(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28299); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28300);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28301);LocalDate end1 = new LocalDate(2006, 9, 9); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28302);YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28303);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28304);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28305);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28306);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28307);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testSerialization311() throws Exception {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tla0sluc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tla0sluc() throws Exception{try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28308); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28309);Months test = Months.THREE; 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28310);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28311);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28312);oos.writeObject(test); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28313);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28314);oos.close(); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28315);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28316);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28317);Months result = (Months) ois.readObject(); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28318);ois.close(); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28319);assertSame(test, result); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testMultipliedBy_int312() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzxxjjluo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzxxjjluo(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28320); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28321);Months test = Months.months(2); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28322);assertEquals(6, test.multipliedBy(3).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28323);assertEquals(2, test.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28324);assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28325);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28326);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28327);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28328);halfMax.multipliedBy(2); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28329);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testDividedBy_int313() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcqjekluy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcqjekluy(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28330); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28331);Months test = Months.months(12); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28332);assertEquals(6, test.dividedBy(2).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28333);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28334);assertEquals(4, test.dividedBy(3).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28335);assertEquals(3, test.dividedBy(4).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28336);assertEquals(2, test.dividedBy(5).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28337);assertEquals(2, test.dividedBy(6).getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28338);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28339);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28340);Months.ONE.dividedBy(0); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28341);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testNegated314() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ddab1lva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ddab1lva(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28342); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28343);Months test = Months.months(12); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28344);assertEquals(-12, test.negated().getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28345);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28346);try { 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28347);Months.MIN_VALUE.negated(); 
         __CLR4_4_1lrllrlle6qe9s5.R.inc(28348);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testIsGreaterThan315() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dqybllvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dqybllvh(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28349); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28350);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28351);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28352);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28353);assertEquals(true, Months.ONE.isGreaterThan(null)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28354);assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testIsLessThan316() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyol13lvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyol13lvn(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28355); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28356);assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28357);assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28358);assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28359);assertEquals(false, Months.ONE.isLessThan(null)); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28360);assertEquals(true, Months.months(-1).isLessThan(null)); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 


public void testToString317() {__CLR4_4_1lrllrlle6qe9s5.R.globalSliceStart(getClass().getName(),28361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq4zoilvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lrllrlle6qe9s5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lrllrlle6qe9s5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq4zoilvt(){try{__CLR4_4_1lrllrlle6qe9s5.R.inc(28361); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28362);Months test = Months.months(20); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28363);assertEquals("P20M", test.toString()); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28364);test = Months.months(-20); 
     __CLR4_4_1lrllrlle6qe9s5.R.inc(28365);assertEquals("P-20M", test.toString()); 
 }finally{__CLR4_4_1lrllrlle6qe9s5.R.flushNeeded();}} 

    

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
