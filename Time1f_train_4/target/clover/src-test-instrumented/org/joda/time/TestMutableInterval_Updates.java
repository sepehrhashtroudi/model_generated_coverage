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
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1mosmosle6rjcts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mosmosle6rjcts.R.inc(29404);
        __CLR4_4_1mosmosle6rjcts.R.inc(29405);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mosmosle6rjcts.R.inc(29406);
        __CLR4_4_1mosmosle6rjcts.R.inc(29407);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1mosmosle6rjcts.R.inc(29409);try{__CLR4_4_1mosmosle6rjcts.R.inc(29408);
    }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mosmosle6rjcts.R.inc(29410);
        __CLR4_4_1mosmosle6rjcts.R.inc(29411);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mosmosle6rjcts.R.inc(29412);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mosmosle6rjcts.R.inc(29413);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mosmosle6rjcts.R.inc(29414);originalLocale = Locale.getDefault();
        __CLR4_4_1mosmosle6rjcts.R.inc(29415);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mosmosle6rjcts.R.inc(29416);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mosmosle6rjcts.R.inc(29417);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mosmosle6rjcts.R.inc(29418);
        __CLR4_4_1mosmosle6rjcts.R.inc(29419);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mosmosle6rjcts.R.inc(29420);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mosmosle6rjcts.R.inc(29421);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mosmosle6rjcts.R.inc(29422);Locale.setDefault(originalLocale);
        __CLR4_4_1mosmosle6rjcts.R.inc(29423);originalDateTimeZone = null;
        __CLR4_4_1mosmosle6rjcts.R.inc(29424);originalTimeZone = null;
        __CLR4_4_1mosmosle6rjcts.R.inc(29425);originalLocale = null;
    }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetInterval_RI_RI3822() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtelkxmpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3822",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtelkxmpe(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29426); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29427);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29428);test.setInterval(null, new Instant(TEST_TIME2 + 1)); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29429);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29430);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSeDurationAfterStart_RI21171() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxvokbmpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_RI21171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxvokbmpj(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29431); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29432);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29433);try { 
         __CLR4_4_1mosmosle6rjcts.R.inc(29434);test.setDurationAfterStart(new Duration(-1)); 
         __CLR4_4_1mosmosle6rjcts.R.inc(29435);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetInterval_RInterval11414() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phugepmpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval11414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phugepmpo(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29436); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29437);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29438);test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29439);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29440);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetInterval_RInterval31415() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk9vpompt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval31415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk9vpompt(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29441); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29442);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29443);try { 
         __CLR4_4_1mosmosle6rjcts.R.inc(29444);test.setInterval(null); 
         __CLR4_4_1mosmosle6rjcts.R.inc(29445);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetInterval_RI_RI51416() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghp0kxmpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI51416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghp0kxmpy(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29446); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29447);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29448);test.setInterval(null, null); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29449);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29450);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_RI31417() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5fccbmq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI31417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5fccbmq3(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29451); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29452);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29453);test.setDurationBeforeEnd(null); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29454);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29455);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetStart_RI11418() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12chdummq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI11418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12chdummq8(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29456); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29457);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29458);test.setStart(new Instant(TEST_TIME1 - 1)); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29459);assertEquals(TEST_TIME1 - 1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29460);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetEnd_RI31419() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u03naemqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI31419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u03naemqd(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29461); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29462);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29463);test.setEnd(null); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29464);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29465);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetDurationAfterStart_long11420() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mytf14mqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long11420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mytf14mqi(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29466); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29467);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29468);test.setDurationAfterStart(123L); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29469);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29470);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_long11421() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5l2d3mqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long11421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5l2d3mqn(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29471); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29472);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29473);test.setDurationBeforeEnd(123L); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29474);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29475);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI31422() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110bsqqmqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI31422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110bsqqmqs(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29476); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29477);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29478);test.setPeriodAfterStart(null); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29479);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29480);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI11423() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehbl0jmqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI11423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehbl0jmqx(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29481); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29482);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29483);test.setPeriodAfterStart(new Period(123L)); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29484);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29485);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI11424() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsuaiamr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI11424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsuaiamr2(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29486); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29487);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29488);test.setPeriodBeforeEnd(new Period(123L)); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29489);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29490);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI31425() {__CLR4_4_1mosmosle6rjcts.R.globalSliceStart(getClass().getName(),29491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9a1m3mr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mosmosle6rjcts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mosmosle6rjcts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI31425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9a1m3mr7(){try{__CLR4_4_1mosmosle6rjcts.R.inc(29491); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29492);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29493);test.setPeriodBeforeEnd(null); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29494);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mosmosle6rjcts.R.inc(29495);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1mosmosle6rjcts.R.inc(29496);
            __CLR4_4_1mosmosle6rjcts.R.inc(29497);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mosmosle6rjcts.R.inc(29498);
            __CLR4_4_1mosmosle6rjcts.R.inc(29499);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mosmosle6rjcts.R.inc(29500);
            __CLR4_4_1mosmosle6rjcts.R.inc(29501);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1mosmosle6rjcts.R.flushNeeded();}}
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
