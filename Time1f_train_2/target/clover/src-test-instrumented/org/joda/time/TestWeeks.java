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
public class TestWeeks extends TestCase {static class __CLR4_4_1omuomule6qsfbf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1omuomule6qsfbf.R.inc(31926);
        __CLR4_4_1omuomule6qsfbf.R.inc(31927);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1omuomule6qsfbf.R.inc(31928);
        __CLR4_4_1omuomule6qsfbf.R.inc(31929);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1omuomule6qsfbf.R.inc(31931);try{__CLR4_4_1omuomule6qsfbf.R.inc(31930);
    }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1omuomule6qsfbf.R.inc(31932);
    }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1omuomule6qsfbf.R.inc(31933);
    }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToStandardSeconds488() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2avaeon2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2avaeon2(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31934); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31935);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31936);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31937);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31938);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(31939);Weeks.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1omuomule6qsfbf.R.inc(31940);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial512() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1pd4xon9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1pd4xon9(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31941); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31942);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31943);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31944);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31945);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31946);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31947);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31948);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31949);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testFactory_weeksIn_RInterval513() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdytp3oni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdytp3oni(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31950); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31951);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31952);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31953);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31954);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31955);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31956);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31957);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31958);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testFactory_standardWeeksIn_RPeriod514() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibqditonr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibqditonr(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31959); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31960);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31961);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31962);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31963);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31964);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31965);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31966);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31967);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31968);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(31969);Weeks.standardWeeksIn(Period.months(1)); 
         __CLR4_4_1omuomule6qsfbf.R.inc(31970);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testToStandardDays516() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rry3koo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rry3koo3(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31971); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31972);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31973);Days expected = Days.days(14); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31974);assertEquals(expected, test.toStandardDays()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31975);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(31976);Weeks.MAX_VALUE.toStandardDays(); 
         __CLR4_4_1omuomule6qsfbf.R.inc(31977);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testToStandardMinutes517() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aamnppooa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aamnppooa(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31978); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31979);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31980);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31981);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31982);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(31983);Weeks.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1omuomule6qsfbf.R.inc(31984);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testToStandardDuration518() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxgqslooh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxgqslooh(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31985); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31986);Weeks test = Weeks.weeks(20); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31987);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31988);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31989);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31990);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testMinus_int519() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),31991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw432uoon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw432uoon(){try{__CLR4_4_1omuomule6qsfbf.R.inc(31991); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31992);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31993);Weeks result = test2.minus(3); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31994);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31995);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31996);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(31997);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(31998);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1omuomule6qsfbf.R.inc(31999);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testPlus_Weeks520() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14diqz6oow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14diqz6oow(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32000); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32001);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32002);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32003);Weeks result = test2.plus(test3); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32004);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32005);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32006);assertEquals(5, result.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32007);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32008);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32009);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(32010);Weeks.MAX_VALUE.plus(Weeks.ONE); 
         __CLR4_4_1omuomule6qsfbf.R.inc(32011);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testMinus_Weeks521() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rxzdvop8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rxzdvop8(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32012); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32013);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32014);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32015);Weeks result = test2.minus(test3); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32016);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32017);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32018);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32019);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32020);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32021);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(32022);Weeks.MIN_VALUE.minus(Weeks.ONE); 
         __CLR4_4_1omuomule6qsfbf.R.inc(32023);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testMultipliedBy_int522() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl0lm8opk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl0lm8opk(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32024); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32025);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32026);assertEquals(6, test.multipliedBy(3).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32027);assertEquals(2, test.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32028);assertEquals(-6, test.multipliedBy(-3).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32029);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32030);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32031);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(32032);halfMax.multipliedBy(2); 
         __CLR4_4_1omuomule6qsfbf.R.inc(32033);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testDividedBy_int523() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w87zr7opu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int523",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w87zr7opu(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32034); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32035);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32036);assertEquals(6, test.dividedBy(2).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32037);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32038);assertEquals(4, test.dividedBy(3).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32039);assertEquals(3, test.dividedBy(4).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32040);assertEquals(2, test.dividedBy(5).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32041);assertEquals(2, test.dividedBy(6).getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32042);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32043);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(32044);Weeks.ONE.dividedBy(0); 
         __CLR4_4_1omuomule6qsfbf.R.inc(32045);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testNegated524() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtit4eoq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtit4eoq6(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32046); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32047);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32048);assertEquals(-12, test.negated().getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32049);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32050);try { 
         __CLR4_4_1omuomule6qsfbf.R.inc(32051);Weeks.MIN_VALUE.negated(); 
         __CLR4_4_1omuomule6qsfbf.R.inc(32052);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testIsGreaterThan525() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2ekhsoqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2ekhsoqd(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32053); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32054);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32055);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32056);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32057);assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32058);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 


public void testIsLessThan526() {__CLR4_4_1omuomule6qsfbf.R.globalSliceStart(getClass().getName(),32059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hgxsaoqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omuomule6qsfbf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omuomule6qsfbf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hgxsaoqj(){try{__CLR4_4_1omuomule6qsfbf.R.inc(32059); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32060);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32061);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32062);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32063);assertEquals(false, Weeks.ONE.isLessThan(null)); 
     __CLR4_4_1omuomule6qsfbf.R.inc(32064);assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
 }finally{__CLR4_4_1omuomule6qsfbf.R.flushNeeded();}} 

    

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
