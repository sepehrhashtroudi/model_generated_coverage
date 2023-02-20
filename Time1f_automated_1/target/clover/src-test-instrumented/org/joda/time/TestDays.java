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
public class TestDays extends TestCase {static class __CLR4_4_1hoihoile6ndpgk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hoihoile6ndpgk.R.inc(22914);
        __CLR4_4_1hoihoile6ndpgk.R.inc(22915);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hoihoile6ndpgk.R.inc(22916);
        __CLR4_4_1hoihoile6ndpgk.R.inc(22917);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1hoihoile6ndpgk.R.inc(22919);try{__CLR4_4_1hoihoile6ndpgk.R.inc(22918);
    }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hoihoile6ndpgk.R.inc(22920);
    }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hoihoile6ndpgk.R.inc(22921);
    }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetMethods615() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9bjylhoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9bjylhoq(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22922); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22923);Days test = Days.days(20); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22924);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testPlus_Days617() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftlwyhhot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftlwyhhot(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22925); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22926);Days test2 = Days.days(2); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22927);Days test3 = Days.days(3); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22928);Days result = test2.plus(test3); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22929);assertEquals(2, test2.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22930);assertEquals(3, test3.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22931);assertEquals(5, result.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22932);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22933);assertEquals(1, Days.ONE.plus((Days) null).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22934);try { 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22935);Days.MAX_VALUE.plus(Days.ONE); 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22936);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testFactory_daysBetween_RPartial619() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjgnwhhp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjgnwhhp5(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22937); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22938);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22939);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22940);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22941);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22942);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22943);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22944);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22945);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testFactory_daysBetween_RPartial620() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0bvbrhpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0bvbrhpe(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22946); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22947);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22948);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22949);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22950);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22951);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22952);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22953);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22954);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testToStandardDays621() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11k8fmjhpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDays621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11k8fmjhpn(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22955); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22956);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22957);Days expected = Days.days(14); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22958);assertEquals(expected, test.toStandardDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22959);try { 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22960);Weeks.MAX_VALUE.toStandardDays(); 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22961);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testToStandardSeconds622() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2sfhkhpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2sfhkhpu(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22962); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22963);Days test = Days.days(2); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22964);Seconds expected = Seconds.seconds(2 * 24 * 60); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22965);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22966);try { 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22967);Days.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22968);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testMinus_Days623() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hw0cl6hq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hw0cl6hq1(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22969); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22970);Days test2 = Days.days(2); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22971);Days test3 = Days.days(3); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22972);Days result = test2.minus(test3); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22973);assertEquals(2, test2.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22974);assertEquals(3, test3.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22975);assertEquals(-1, result.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22976);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22977);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22978);try { 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22979);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22980);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testDividedBy_int624() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v42ptthqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v42ptthqd(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22981); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22982);Days test = Days.days(12); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22983);assertEquals(6, test.dividedBy(2).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22984);assertEquals(12, test.getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22985);assertEquals(4, test.dividedBy(3).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22986);assertEquals(3, test.dividedBy(4).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22987);assertEquals(2, test.dividedBy(5).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22988);assertEquals(2, test.dividedBy(6).getDays()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22989);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22990);try { 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22991);Days.ONE.dividedBy(0); 
         __CLR4_4_1hoihoile6ndpgk.R.inc(22992);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
public void testToString625() {__CLR4_4_1hoihoile6ndpgk.R.globalSliceStart(getClass().getName(),22993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xho5xahqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoihoile6ndpgk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoihoile6ndpgk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xho5xahqp(){try{__CLR4_4_1hoihoile6ndpgk.R.inc(22993); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22994);Days test = Days.days(20); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22995);assertEquals("P20D", test.toString()); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22996);test = Days.days(-20); 
     __CLR4_4_1hoihoile6ndpgk.R.inc(22997);assertEquals("P-20D", test.toString()); 
 }finally{__CLR4_4_1hoihoile6ndpgk.R.flushNeeded();}}
    

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
