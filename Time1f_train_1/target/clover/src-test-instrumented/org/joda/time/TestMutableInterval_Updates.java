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
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1mncmncle6qe9wr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29352);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29353);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29354);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29355);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1mncmncle6qe9wr.R.inc(29357);try{__CLR4_4_1mncmncle6qe9wr.R.inc(29356);
    }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29358);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29359);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29360);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mncmncle6qe9wr.R.inc(29361);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mncmncle6qe9wr.R.inc(29362);originalLocale = Locale.getDefault();
        __CLR4_4_1mncmncle6qe9wr.R.inc(29363);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29364);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mncmncle6qe9wr.R.inc(29365);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29366);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29367);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mncmncle6qe9wr.R.inc(29368);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29369);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29370);Locale.setDefault(originalLocale);
        __CLR4_4_1mncmncle6qe9wr.R.inc(29371);originalDateTimeZone = null;
        __CLR4_4_1mncmncle6qe9wr.R.inc(29372);originalTimeZone = null;
        __CLR4_4_1mncmncle6qe9wr.R.inc(29373);originalLocale = null;
    }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetInterval_RI_RI3803() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdb8pomny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3803",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdb8pomny(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29374); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29375);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29376);test.setInterval(null, new Instant(TEST_TIME2 + 1)); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29377);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29378);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSeDurationAfterStart_RI21163() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169zaeamo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_RI21163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169zaeamo3(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29379); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29380);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29381);try { 
         __CLR4_4_1mncmncle6qe9wr.R.inc(29382);test.setDurationAfterStart(new Duration(-1)); 
         __CLR4_4_1mncmncle6qe9wr.R.inc(29383);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetInterval_RInterval11420() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stek6smo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval11420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stek6smo8(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29384); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29385);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29386);test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29387);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29388);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetInterval_RInterval31421() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ueuc1mod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval31421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ueuc1mod(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29389); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29390);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29391);try { 
         __CLR4_4_1mncmncle6qe9wr.R.inc(29392);test.setInterval(null); 
         __CLR4_4_1mncmncle6qe9wr.R.inc(29393);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_RI31422() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gok9r5moi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI31422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gok9r5moi(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29394); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29395);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29396);test.setDurationBeforeEnd(null); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29397);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29398);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetStart_RI11423() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftcgfsmon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI11423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftcgfsmon(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29399); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29400);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29401);test.setStart(new Instant(TEST_TIME1 - 1)); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29402);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29403);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetEnd_RI31424() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gj8kp8mos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI31424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gj8kp8mos(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29404); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29405);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29406);test.setEnd(null); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29407);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29408);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetDurationAfterStart_long11425() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ptl2rmox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long11425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ptl2rmox(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29409); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29410);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29411);test.setDurationAfterStart(123L); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29412);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29413);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_long11426() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sekwbgmp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long11426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sekwbgmp2(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29414); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29415);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29416);test.setDurationBeforeEnd(123L); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29417);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29418);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI31427() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8o17nmp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI31427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8o17nmp7(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29419); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29420);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29421);test.setPeriodAfterStart(null); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29422);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29423);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI11428() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ro8xumpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI11428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ro8xumpc(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29424); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29425);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29426);test.setPeriodAfterStart(new Period(123L)); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29427);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29428);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI31429() {__CLR4_4_1mncmncle6qe9wr.R.globalSliceStart(getClass().getName(),29429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9a6g7mph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mncmncle6qe9wr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mncmncle6qe9wr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI31429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9a6g7mph(){try{__CLR4_4_1mncmncle6qe9wr.R.inc(29429); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29430);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29431);test.setPeriodBeforeEnd(null); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29432);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mncmncle6qe9wr.R.inc(29433);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29434);
            __CLR4_4_1mncmncle6qe9wr.R.inc(29435);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29436);
            __CLR4_4_1mncmncle6qe9wr.R.inc(29437);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mncmncle6qe9wr.R.inc(29438);
            __CLR4_4_1mncmncle6qe9wr.R.inc(29439);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1mncmncle6qe9wr.R.flushNeeded();}}
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
