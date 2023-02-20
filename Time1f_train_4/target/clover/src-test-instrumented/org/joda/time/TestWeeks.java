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
public class TestWeeks extends TestCase {static class __CLR4_4_1opfopfle6rjd6d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1opfopfle6rjd6d.R.inc(32019);
        __CLR4_4_1opfopfle6rjd6d.R.inc(32020);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1opfopfle6rjd6d.R.inc(32021);
        __CLR4_4_1opfopfle6rjd6d.R.inc(32022);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1opfopfle6rjd6d.R.inc(32024);try{__CLR4_4_1opfopfle6rjd6d.R.inc(32023);
    }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1opfopfle6rjd6d.R.inc(32025);
    }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1opfopfle6rjd6d.R.inc(32026);
    }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToStandardSeconds526() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yth2glopn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yth2glopn(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32027); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32028);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32029);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32030);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32031);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32032);Weeks.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32033);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testFactory_weeksBetween_RInstant544() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1al0hgeopu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1al0hgeopu(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32034); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32035);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32036);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32037);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32038);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32039);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32040);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32041);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32042);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testFactory_parseWeeks_String545() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ll9coq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ll9coq3(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32043); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32044);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32045);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32046);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32047);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32048);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32049);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32050);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32051);Weeks.parseWeeks("P1Y1D"); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32052);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32053);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32054);Weeks.parseWeeks("P1WT1H"); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32055);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testFactory_weeks_int547() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uwtc9oqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uwtc9oqg(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32056); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32057);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32058);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32059);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32060);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32061);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32062);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32063);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32064);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial548() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kr39eoqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kr39eoqp(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32065); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32066);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32067);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32068);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32069);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32070);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32071);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32072);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32073);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testFactory_weeksIn_RInterval549() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8hmp8oqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8hmp8oqy(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32074); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32075);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32076);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32077);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32078);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32079);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32080);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32081);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32082);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testFactory_standardWeeksIn_RPeriod550() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gilbibor7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gilbibor7(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32083); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32084);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32085);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32086);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32087);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32088);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32089);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32090);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32091);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32092);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32093);Weeks.standardWeeksIn(Period.months(1)); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32094);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testSerialization551() throws Exception {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmwlhiorj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmwlhiorj() throws Exception{try{__CLR4_4_1opfopfle6rjd6d.R.inc(32095); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32096);Weeks test = Weeks.THREE; 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32097);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32098);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32099);oos.writeObject(test); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32100);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32101);oos.close(); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32102);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32103);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32104);Weeks result = (Weeks) ois.readObject(); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32105);ois.close(); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32106);assertSame(test, result); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testAddToLocalDate552() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w976q2orv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w976q2orv(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32107); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32108);Weeks test = Weeks.weeks(3); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32109);LocalDate date = new LocalDate(2006, 6, 1); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32110);LocalDate expected = new LocalDate(2006, 6, 22); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32111);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testToStandardDays554() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkjoiios0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkjoiios0(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32112); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32113);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32114);Days expected = Days.days(14); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32115);assertEquals(expected, test.toStandardDays()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32116);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32117);Weeks.MAX_VALUE.toStandardDays(); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32118);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testToStandardHours555() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19swuztos7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19swuztos7(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32119); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32120);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32121);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32122);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32123);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32124);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32125);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testToStandardMinutes556() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g55suwose();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g55suwose(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32126); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32127);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32128);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32129);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32130);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32131);Weeks.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32132);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testToStandardDuration557() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hoa80osl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hoa80osl(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32133); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32134);Weeks test = Weeks.weeks(20); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32135);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32136);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32137);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32138);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testMinus_int558() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejodhrosr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejodhrosr(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32139); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32140);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32141);Weeks result = test2.minus(3); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32142);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32143);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32144);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32145);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32146);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32147);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testPlus_Weeks559() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s16g6kot0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s16g6kot0(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32148); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32149);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32150);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32151);Weeks result = test2.plus(test3); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32152);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32153);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32154);assertEquals(5, result.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32155);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32156);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32157);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32158);Weeks.MAX_VALUE.plus(Weeks.ONE); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32159);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testMultipliedBy_int560() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rb0zuotc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rb0zuotc(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32160); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32161);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32162);assertEquals(6, test.multipliedBy(3).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32163);assertEquals(2, test.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32164);assertEquals(-6, test.multipliedBy(-3).getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32165);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32166);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32167);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32168);halfMax.multipliedBy(2); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32169);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testNegated561() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1149l15otm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1149l15otm(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32170); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32171);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32172);assertEquals(-12, test.negated().getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32173);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32174);try { 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32175);Weeks.MIN_VALUE.negated(); 
         __CLR4_4_1opfopfle6rjd6d.R.inc(32176);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 


public void testIsGreaterThan562() {__CLR4_4_1opfopfle6rjd6d.R.globalSliceStart(getClass().getName(),32177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evdtnrott();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opfopfle6rjd6d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opfopfle6rjd6d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evdtnrott(){try{__CLR4_4_1opfopfle6rjd6d.R.inc(32177); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32178);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32179);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32180);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32181);assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     __CLR4_4_1opfopfle6rjd6d.R.inc(32182);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1opfopfle6rjd6d.R.flushNeeded();}} 

    

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
