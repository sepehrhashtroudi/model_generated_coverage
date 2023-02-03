/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1nj7nj7lc8axe8j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30499);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30500);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30501);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30502);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1nj7nj7lc8axe8j.R.inc(30504);try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30503);
    }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30505);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30506);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30507);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30508);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30509);originalLocale = Locale.getDefault();
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30510);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30511);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30512);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30513);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30514);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30515);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30516);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30517);Locale.setDefault(originalLocale);
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30518);originalDateTimeZone = null;
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30519);originalTimeZone = null;
        __CLR4_4_1nj7nj7lc8axe8j.R.inc(30520);originalLocale = null;
    }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetPeriodAfterStart_RI3231() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1259en1njt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI3231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1259en1njt(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30521); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30522);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30523);test.setPeriodAfterStart(null); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30524);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30525);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetStart_RI1232() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5w05nnjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5w05nnjy(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30526); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30527);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30528);test.setStart(new Instant(TEST_TIME1 - 1)); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30529);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30530);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetInterval_RI_RI5524() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lls5synk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI5524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lls5synk3(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30531); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30532);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30533);test.setInterval(null, null); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30534);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30535);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetInterval_RInterval1612() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qduqt6nk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval1612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qduqt6nk8(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30536); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30537);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30538);test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30539);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30540);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetInterval_RI_RI3636() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rup1enkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rup1enkd(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30541); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30542);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30543);test.setInterval(null, new Instant(TEST_TIME2 + 1)); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30544);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30545);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_RI3715() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk2zoznki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI3715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk2zoznki(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30546); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30547);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30548);test.setDurationBeforeEnd(null); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30549);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30550);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSeDurationAfterStart_RI2895() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9nnpdnkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_RI2895",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9nnpdnkn(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30551); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30552);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30553);try { 
         __CLR4_4_1nj7nj7lc8axe8j.R.inc(30554);test.setDurationAfterStart(new Duration(-1)); 
         __CLR4_4_1nj7nj7lc8axe8j.R.inc(30555);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetEnd_RI31016() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7os7hnks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI31016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7os7hnks(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30556); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30557);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30558);test.setEnd(null); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30559);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30560);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_long11347() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m71b2ynkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long11347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m71b2ynkx(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30561); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30562);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30563);test.setDurationBeforeEnd(123L); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30564);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30565);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetDurationAfterStart_long11490() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1595rnl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long11490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1595rnl2(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30566); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30567);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30568);test.setDurationAfterStart(123L); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30569);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30570);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI11514() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1vawcnl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI11514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1vawcnl7(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30571); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30572);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30573);test.setPeriodBeforeEnd(new Period(123L)); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30574);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30575);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI11661() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlanvdnlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI11661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlanvdnlc(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30576); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30577);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30578);test.setPeriodAfterStart(new Period(123L)); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30579);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30580);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI31695() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfssi8nlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI31695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfssi8nlh(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30581); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30582);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30583);test.setPeriodBeforeEnd(null); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30584);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30585);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 


public void testSetInterval_RInterval31747() {__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceStart(getClass().getName(),30586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cdd2inlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nj7nj7lc8axe8j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nj7nj7lc8axe8j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval31747",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cdd2inlm(){try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30586); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30587);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nj7nj7lc8axe8j.R.inc(30588);try { 
         __CLR4_4_1nj7nj7lc8axe8j.R.inc(30589);test.setInterval(null); 
         __CLR4_4_1nj7nj7lc8axe8j.R.inc(30590);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30591);
            __CLR4_4_1nj7nj7lc8axe8j.R.inc(30592);return ISOChronology.getInstance();
        }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30593);
            __CLR4_4_1nj7nj7lc8axe8j.R.inc(30594);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1nj7nj7lc8axe8j.R.inc(30595);
            __CLR4_4_1nj7nj7lc8axe8j.R.inc(30596);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1nj7nj7lc8axe8j.R.flushNeeded();}}
    }

    
    
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
