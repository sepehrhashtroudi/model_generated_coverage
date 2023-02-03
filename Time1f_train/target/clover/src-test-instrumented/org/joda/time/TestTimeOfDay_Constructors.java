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
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1pqlpqllc8axej7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pqlpqllc8axej7.R.inc(33357);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33358);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pqlpqllc8axej7.R.inc(33359);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33360);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1pqlpqllc8axej7.R.inc(33362);try{__CLR4_4_1pqlpqllc8axej7.R.inc(33361);
    }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pqlpqllc8axej7.R.inc(33363);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33364);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33365);zone = DateTimeZone.getDefault();
        __CLR4_4_1pqlpqllc8axej7.R.inc(33366);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33367);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pqlpqllc8axej7.R.inc(33368);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33369);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pqlpqllc8axej7.R.inc(33370);DateTimeZone.setDefault(zone);
        __CLR4_4_1pqlpqllc8axej7.R.inc(33371);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1pqlpqllc8axej7.R.inc(33372);zone = null;
    }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString215() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1237jqupr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1237jqupr1() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33373); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33374);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00"); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33375);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33376);assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33377);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33378);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33379);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long139() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fvdsmpr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fvdsmpr8() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33380); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33381);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33382);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33383);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33384);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33385);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33386);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testFactory_FromDateFields_after1970603() throws Exception {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nl4xyuprf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_after1970603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nl4xyuprf() throws Exception{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33387); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33388);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33389);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33390);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33391);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_long2_Chronology614() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wa3u9kprk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wa3u9kprk() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33392); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33393);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33394);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33395);assertEquals(5 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33396);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33397);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33398);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_int_int_int626() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srhjl5prr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srhjl5prr() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33399); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33400);TimeOfDay test = new TimeOfDay(10, 20, 30); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33401);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33402);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33403);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33404);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33405);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33406);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33407);new TimeOfDay(-1, 20, 30); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33408);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33409);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33410);new TimeOfDay(24, 20, 30); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33411);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33412);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33413);new TimeOfDay(10, -1, 30); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33414);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33415);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33416);new TimeOfDay(10, 60, 30); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33417);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33418);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33419);new TimeOfDay(10, 20, -1); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33420);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33421);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33422);new TimeOfDay(10, 20, 60); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33423);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor2_Object_Chronology630() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1628ubtpsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor2_Object_Chronology630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1628ubtpsg() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33424); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33425);TimeOfDay test = new TimeOfDay("T10:20"); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33426);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33427);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33428);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33429);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33430);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33431);new TimeOfDay("T1020"); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33432);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_ObjectString1897() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19se1o3psp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString1897",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19se1o3psp() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33433); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33434);TimeOfDay test = new TimeOfDay("10:20:30.040"); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33435);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33436);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33437);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33438);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33439);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testFactory_FromCalendarFields1019() throws Exception {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvjp1mpsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields1019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvjp1mpsw() throws Exception{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33440); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33441);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33442);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33443);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33444);assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33445);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33446);TimeOfDay.fromCalendarFields(null); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33447);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullChronology1032() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143cngrpt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_nullChronology1032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143cngrpt4() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33448); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33449);TimeOfDay test = new TimeOfDay(10, 20, 30, null); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33450);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33451);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33452);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33453);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33454);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1330() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn8v02ptb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_nullChronology1330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn8v02ptb() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33455); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33456);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33457);TimeOfDay test = new TimeOfDay(date, null); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33458);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33459);assertEquals(1 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33460);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33461);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33462);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_int_int1378() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188aq7iptj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int1378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188aq7iptj() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33463); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33464);TimeOfDay test = new TimeOfDay(10, 20); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33465);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33466);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33467);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33468);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33469);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33470);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33471);new TimeOfDay(-1, 20); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33472);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33473);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33474);new TimeOfDay(24, 20); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33475);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33476);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33477);new TimeOfDay(10, -1); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33478);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33479);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33480);new TimeOfDay(10, 60); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33481);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testFactory_FromDateFields_null1394() throws Exception {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zct1uapu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null1394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zct1uapu2() throws Exception{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33482); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33483);try { 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33484);TimeOfDay.fromDateFields(null); 
         __CLR4_4_1pqlpqllc8axej7.R.inc(33485);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1420() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19o746epu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone1420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19o746epu6() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33486); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33487);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33488);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33489);TimeOfDay test = new TimeOfDay(LONDON); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33490);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33491);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33492);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33493);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33494);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33495);test = new TimeOfDay(PARIS); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33496);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33497);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33498);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33499);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33500);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 


public void testConstructor1462() throws Throwable {__CLR4_4_1pqlpqllc8axej7.R.globalSliceStart(getClass().getName(),33501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtmf0upul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pqlpqllc8axej7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pqlpqllc8axej7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor1462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtmf0upul() throws Throwable{try{__CLR4_4_1pqlpqllc8axej7.R.inc(33501); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33502);TimeOfDay test = new TimeOfDay(); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33503);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33504);assertEquals(10 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33505);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33506);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1pqlpqllc8axej7.R.inc(33507);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1pqlpqllc8axej7.R.flushNeeded();}} 

    

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
