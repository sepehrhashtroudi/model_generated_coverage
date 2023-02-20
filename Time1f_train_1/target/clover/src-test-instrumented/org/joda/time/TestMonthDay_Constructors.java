/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Constuctors} 
 */
public class TestMonthDay_Constructors extends TestCase {static class __CLR4_4_1lmjlmjle6qe9rf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28027);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28028);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28029);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28030);return new TestSuite(TestMonthDay_Constructors.class);
    }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}}

    public TestMonthDay_Constructors(String name) {
        super(name);__CLR4_4_1lmjlmjle6qe9rf.R.inc(28032);try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28031);
    }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28033);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28034);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28035);zone = DateTimeZone.getDefault();
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28036);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28037);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28038);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28039);DateTimeZone.setDefault(zone);
        __CLR4_4_1lmjlmjle6qe9rf.R.inc(28040);zone = null;
    }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor1253() throws Throwable {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmguzylmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor1253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmguzylmx() throws Throwable{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28041); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28042);MonthDay test = new MonthDay(); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28043);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28044);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28045);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28046);assertEquals(test, MonthDay.now()); 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1254() throws Throwable {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyr197ln3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_DateTimeZone1254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyr197ln3() throws Throwable{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28047); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28048);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28049);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28050);MonthDay test = new MonthDay(LONDON); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28051);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28052);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28053);assertEquals(30, test.getDayOfMonth()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28054);assertEquals(test, MonthDay.now(LONDON)); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28055);test = new MonthDay(PARIS); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28056);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28057);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28058);assertEquals(1, test.getDayOfMonth()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28059);assertEquals(test, MonthDay.now(PARIS)); 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testFactory_FromCalendarFields1255() throws Exception {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18p2m9clng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromCalendarFields1255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18p2m9clng() throws Exception{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28060); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28061);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28062);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28063);MonthDay expected = new MonthDay(2, 3); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28064);assertEquals(expected, MonthDay.fromCalendarFields(cal)); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28065);try { 
         __CLR4_4_1lmjlmjle6qe9rf.R.inc(28066);MonthDay.fromCalendarFields(null); 
         __CLR4_4_1lmjlmjle6qe9rf.R.inc(28067);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testFactory_FromDateFields1256() throws Exception {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ygnqwxlno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromDateFields1256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ygnqwxlno() throws Exception{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28068); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28069);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28070);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28071);MonthDay expected = new MonthDay(2, 3); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28072);assertEquals(expected, MonthDay.fromDateFields(cal.getTime())); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28073);try { 
         __CLR4_4_1lmjlmjle6qe9rf.R.inc(28074);MonthDay.fromDateFields(null); 
         __CLR4_4_1lmjlmjle6qe9rf.R.inc(28075);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testConstructor_long_nullChronology1260() throws Throwable {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1554lotlnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long_nullChronology1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1554lotlnw() throws Throwable{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28076); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28077);MonthDay test = new MonthDay(TEST_TIME1, null); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28078);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28079);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28080);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testConstructor_Object1261() throws Throwable {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3ajmvlo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object1261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3ajmvlo1() throws Throwable{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28081); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28082);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28083);MonthDay test = new MonthDay(date); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28084);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28085);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28086);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1262() throws Throwable {__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceStart(getClass().getName(),28087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6pqf9lo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lmjlmjle6qe9rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lmjlmjle6qe9rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_Chronology1262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6pqf9lo7() throws Throwable{try{__CLR4_4_1lmjlmjle6qe9rf.R.inc(28087); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28088);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28089);MonthDay test = new MonthDay(date, GREGORIAN_PARIS); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28090);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28091);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1lmjlmjle6qe9rf.R.inc(28092);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lmjlmjle6qe9rf.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

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
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
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
     * Test constructor (int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, Chronology=null)
     */
    

}
