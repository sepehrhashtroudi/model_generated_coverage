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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1ogkogkle6qsfay{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1ogkogkle6qsfay.R.inc(31700);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31701);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ogkogkle6qsfay.R.inc(31702);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31703);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1ogkogkle6qsfay.R.inc(31705);try{__CLR4_4_1ogkogkle6qsfay.R.inc(31704);
    }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ogkogkle6qsfay.R.inc(31706);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31707);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31708);zone = DateTimeZone.getDefault();
        __CLR4_4_1ogkogkle6qsfay.R.inc(31709);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31710);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ogkogkle6qsfay.R.inc(31711);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31712);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ogkogkle6qsfay.R.inc(31713);DateTimeZone.setDefault(zone);
        __CLR4_4_1ogkogkle6qsfay.R.inc(31714);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1ogkogkle6qsfay.R.inc(31715);zone = null;
    }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString21115() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r36xhyoh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString21115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r36xhyoh0() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31716); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31717);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00"); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31718);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31719);assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31720);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31721);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31722);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor2_Object_Chronology1116() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn75sfoh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor2_Object_Chronology1116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn75sfoh7() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31723); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31724);TimeOfDay test = new TimeOfDay("T10:20"); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31725);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31726);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31727);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31728);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31729);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31730);new TimeOfDay("T1020"); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31731);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testFactory_FromCalendarFields1120() throws Exception {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njj6hfohg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields1120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njj6hfohg() throws Exception{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31732); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31733);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31734);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31735);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31736);assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31737);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31738);TimeOfDay.fromCalendarFields(null); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31739);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testFactory_FromDateFields_after19701121() throws Exception {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkat3woho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_after19701121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkat3woho() throws Exception{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31740); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31741);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31742);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31743);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31744);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testFactory_FromDateFields_null1122() throws Exception {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu9puzoht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null1122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu9puzoht() throws Exception{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31745); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31746);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31747);TimeOfDay.fromDateFields(null); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31748);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long11123() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rvdq3ohx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long11123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rvdq3ohx() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31749); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31750);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31751);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31752);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31753);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31754);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31755);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor1124() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11454zzoi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11454zzoi4() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31756); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31757);TimeOfDay test = new TimeOfDay(); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31758);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31759);assertEquals(10 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31760);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31761);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31762);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1125() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbr0q0oib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone1125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbr0q0oib() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31763); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31764);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31765);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31766);TimeOfDay test = new TimeOfDay(LONDON); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31767);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31768);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31769);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31770);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31771);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31772);test = new TimeOfDay(PARIS); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31773);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31774);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31775);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31776);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31777);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor_long2_Chronology1127() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxf94soiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology1127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxf94soiq() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31778); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31779);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31780);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31781);assertEquals(5 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31782);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31783);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31784);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1128() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3enhnoix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_nullChronology1128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3enhnoix() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31785); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31786);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31787);TimeOfDay test = new TimeOfDay(date, null); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31788);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31789);assertEquals(1 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31790);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31791);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31792);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor_int_int1129() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178nsgaoj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int1129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178nsgaoj5() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31793); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31794);TimeOfDay test = new TimeOfDay(10, 20); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31795);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31796);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31797);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31798);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31799);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31800);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31801);new TimeOfDay(-1, 20); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31802);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31803);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31804);new TimeOfDay(24, 20); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31805);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31806);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31807);new TimeOfDay(10, -1); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31808);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31809);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31810);new TimeOfDay(10, 60); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31811);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 


public void testConstructor_int_int_int1130() throws Throwable {__CLR4_4_1ogkogkle6qsfay.R.globalSliceStart(getClass().getName(),31812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zc6bp8ojo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ogkogkle6qsfay.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ogkogkle6qsfay.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int1130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zc6bp8ojo() throws Throwable{try{__CLR4_4_1ogkogkle6qsfay.R.inc(31812); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31813);TimeOfDay test = new TimeOfDay(10, 20, 30); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31814);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31815);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31816);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31817);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31818);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31819);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31820);new TimeOfDay(-1, 20, 30); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31821);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31822);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31823);new TimeOfDay(24, 20, 30); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31824);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31825);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31826);new TimeOfDay(10, -1, 30); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31827);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31828);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31829);new TimeOfDay(10, 60, 30); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31830);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31831);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31832);new TimeOfDay(10, 20, -1); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31833);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ogkogkle6qsfay.R.inc(31834);try { 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31835);new TimeOfDay(10, 20, 60); 
         __CLR4_4_1ogkogkle6qsfay.R.inc(31836);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ogkogkle6qsfay.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test factory (long)
     */
    

    /**
     * Test factory (long, Chronology)
     */
    

    /**
     * Test factory (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object)
     */
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    

}
