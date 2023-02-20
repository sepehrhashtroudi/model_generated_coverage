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
public class TestWeeks extends TestCase {static class __CLR4_4_1jvljvlle6nl8hk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25761);
        __CLR4_4_1jvljvlle6nl8hk.R.inc(25762);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25763);
        __CLR4_4_1jvljvlle6nl8hk.R.inc(25764);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1jvljvlle6nl8hk.R.inc(25766);try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25765);
    }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25767);
    }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25768);
    }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_weeks_int240() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7ciabjvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7ciabjvt(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25769); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25770);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25771);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25772);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25773);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25774);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25775);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25776);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25777);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testMinus_int241() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1af52zsjw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1af52zsjw2(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25778); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25779);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25780);Weeks result = test2.minus(3); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25781);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25782);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25783);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25784);try { 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25785);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25786);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testFactory_weeksBetween_RInstant242() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahkmgpjwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahkmgpjwb(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25787); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25788);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25789);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25790);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25791);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25792);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25793);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25794);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25795);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testFactory_parseWeeks_String244() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132yijgjwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132yijgjwk(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25796); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25797);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25798);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25799);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25800);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25801);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25802);assertEquals(2, Weeks.parseWeeks("P2W0M").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25803);assertEquals(14, Weeks.parseWeeks("P14W").getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25804);try { 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25805);Weeks.parseWeeks("P1Y1D"); 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25806);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25807);try { 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25808);Weeks.parseWeeks("P1DT1S"); 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25809);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testSerialization246() throws Exception {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xp7lhfjwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xp7lhfjwy() throws Exception{try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25810); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25811);Weeks test = Weeks.THREE; 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25812);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25813);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25814);oos.writeObject(test); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25815);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25816);oos.close(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25817);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25818);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25819);Weeks result = (Weeks) ois.readObject(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25820);ois.close(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25821);assertSame(test, result); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testFactory_weeksBetween_RPartial247() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqb726jxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqb726jxa(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25822); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25823);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25824);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25825);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25826);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25827);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25828);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25829);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25830);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testToStandardHours248() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd7skojxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd7skojxj(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25831); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25832);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25833);Hours expected = Hours.hours(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25834);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25835);try { 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25836);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1jvljvlle6nl8hk.R.inc(25837);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testFactory_hours_int452() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjm0dcjxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_hours_int452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjm0dcjxq(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25838); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25839);assertSame(Hours.ZERO, Hours.hours(0)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25840);assertSame(Hours.ONE, Hours.hours(1)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25841);assertSame(Hours.TWO, Hours.hours(2)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25842);assertSame(Hours.THREE, Hours.hours(3)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25843);assertSame(Hours.FOUR, Hours.hours(4)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25844);assertSame(Hours.FIVE, Hours.hours(5)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25845);assertSame(Hours.SIX, Hours.hours(6)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25846);assertSame(Hours.SEVEN, Hours.hours(7)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25847);assertSame(Hours.EIGHT, Hours.hours(8)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25848);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25849);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE)); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25850);assertEquals(-1, Hours.hours(-1).getHours()); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25851);assertEquals(9, Hours.hours(9).getHours()); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testGetMethods453() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acpgdnjy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetMethods453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acpgdnjy4(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25852); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25853);Hours test = Hours.hours(20); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25854);assertEquals(20, test.getHours()); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
public void testGetPeriodType455() {__CLR4_4_1jvljvlle6nl8hk.R.globalSliceStart(getClass().getName(),25855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vybg90jy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvljvlle6nl8hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvljvlle6nl8hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetPeriodType455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vybg90jy7(){try{__CLR4_4_1jvljvlle6nl8hk.R.inc(25855); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25856);Hours test = Hours.hours(20); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25857);PeriodType type = test.getPeriodType(); 
     __CLR4_4_1jvljvlle6nl8hk.R.inc(25858);assertEquals(PeriodType.hours(), type); 
 }finally{__CLR4_4_1jvljvlle6nl8hk.R.flushNeeded();}}
    

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
