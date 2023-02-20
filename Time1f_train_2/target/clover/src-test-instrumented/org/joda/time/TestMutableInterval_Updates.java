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
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1mknmknle6qsf53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,29338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mknmknle6qsf53.R.inc(29255);
        __CLR4_4_1mknmknle6qsf53.R.inc(29256);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mknmknle6qsf53.R.inc(29257);
        __CLR4_4_1mknmknle6qsf53.R.inc(29258);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1mknmknle6qsf53.R.inc(29260);try{__CLR4_4_1mknmknle6qsf53.R.inc(29259);
    }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mknmknle6qsf53.R.inc(29261);
        __CLR4_4_1mknmknle6qsf53.R.inc(29262);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mknmknle6qsf53.R.inc(29263);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mknmknle6qsf53.R.inc(29264);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mknmknle6qsf53.R.inc(29265);originalLocale = Locale.getDefault();
        __CLR4_4_1mknmknle6qsf53.R.inc(29266);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mknmknle6qsf53.R.inc(29267);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mknmknle6qsf53.R.inc(29268);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mknmknle6qsf53.R.inc(29269);
        __CLR4_4_1mknmknle6qsf53.R.inc(29270);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mknmknle6qsf53.R.inc(29271);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mknmknle6qsf53.R.inc(29272);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mknmknle6qsf53.R.inc(29273);Locale.setDefault(originalLocale);
        __CLR4_4_1mknmknle6qsf53.R.inc(29274);originalDateTimeZone = null;
        __CLR4_4_1mknmknle6qsf53.R.inc(29275);originalTimeZone = null;
        __CLR4_4_1mknmknle6qsf53.R.inc(29276);originalLocale = null;
    }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetInterval_RI_RI3790() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdxiqfml9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3790",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdxiqfml9(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29277); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29278);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29279);test.setInterval(null, new Instant(TEST_TIME2 + 1)); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29280);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29281);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetInterval_RInterval31412() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb9s33mle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval31412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb9s33mle(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29282); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29283);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29284);try { 
         __CLR4_4_1mknmknle6qsf53.R.inc(29285);test.setInterval(null); 
         __CLR4_4_1mknmknle6qsf53.R.inc(29286);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetInterval_RI_RI51413() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8owycmlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI51413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8owycmlj(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29287); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29288);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29289);test.setInterval(null, null); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29290);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29291);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_RI31414() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4ot9emlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI31414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4ot9emlo(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29292); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29293);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29294);test.setDurationBeforeEnd(null); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29295);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29296);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetEnd_RI31415() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s10jiumlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI31415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s10jiumlt(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29297); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29298);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29299);test.setEnd(null); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29300);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29301);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetDurationAfterStart_long11416() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6oittmly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long11416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6oittmly(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29302); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29303);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29304);test.setDurationAfterStart(123L); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29305);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29306);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetDurationBeforeEnd_long11417() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xpykemm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long11417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xpykemm3(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29307); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29308);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29309);test.setDurationBeforeEnd(123L); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29310);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29311);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI31418() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b86wjfmm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI31418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b86wjfmm8(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29312); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29313);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29314);test.setPeriodAfterStart(null); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29315);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29316);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetPeriodAfterStart_RI11419() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op6ot8mmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI11419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op6ot8mmd(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29317); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29318);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29319);test.setPeriodAfterStart(new Period(123L)); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29320);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29321);assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI11420() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sufcemmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI11420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sufcemmi(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29322); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29323);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29324);test.setPeriodBeforeEnd(new Period(123L)); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29325);assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29326);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 


public void testSetPeriodBeforeEnd_RI31421() {__CLR4_4_1mknmknle6qsf53.R.globalSliceStart(getClass().getName(),29327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nru575mmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mknmknle6qsf53.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mknmknle6qsf53.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI31421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nru575mmn(){try{__CLR4_4_1mknmknle6qsf53.R.inc(29327); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29328);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29329);test.setPeriodBeforeEnd(null); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29330);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1mknmknle6qsf53.R.inc(29331);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1mknmknle6qsf53.R.inc(29332);
            __CLR4_4_1mknmknle6qsf53.R.inc(29333);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mknmknle6qsf53.R.inc(29334);
            __CLR4_4_1mknmknle6qsf53.R.inc(29335);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mknmknle6qsf53.R.inc(29336);
            __CLR4_4_1mknmknle6qsf53.R.inc(29337);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1mknmknle6qsf53.R.flushNeeded();}}
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
