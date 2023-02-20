/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1jmrjmrle6rjcei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,25602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25443);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25444);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25445);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25446);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1jmrjmrle6rjcei.R.inc(25448);try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25447);
    }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25449);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25450);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25451);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25452);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25453);originalLocale = Locale.getDefault();
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25454);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25455);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25456);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25457);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25458);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25459);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25460);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25461);Locale.setDefault(originalLocale);
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25462);originalDateTimeZone = null;
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25463);originalTimeZone = null;
        __CLR4_4_1jmrjmrle6rjcei.R.inc(25464);originalLocale = null;
    }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet_DateTimeFieldType704() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo9ticjnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeFieldType704",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo9ticjnd(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25465); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25466);Instant test = new Instant(); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25467);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25468);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25469);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25470);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25471);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25472);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25473);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25474);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25475);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25476);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25477);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25478);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25479);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25480);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25481);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25482);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25483);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25484);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25485);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25486);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25487);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25488);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25489);try { 
         __CLR4_4_1jmrjmrle6rjcei.R.inc(25490);test.get((DateTimeFieldType) null); 
         __CLR4_4_1jmrjmrle6rjcei.R.inc(25491);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testToInstant706() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz14tsjo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz14tsjo4(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25492); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25493);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25494);Instant result = test.toInstant(); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25495);assertSame(test, result); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testPlus_long707() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhi422jo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long707",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhi422jo8(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25496); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25497);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25498);Instant result = test.plus(123456789L); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25499);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25500);assertEquals(expected, result); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testWithDurationAdded_long_int708() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbesy7jod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int708",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbesy7jod(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25501); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25502);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25503);Instant result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25504);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25505);assertEquals(expected, result); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25506);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25507);assertSame(test, result); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25508);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25509);expected = new Instant(TEST_TIME1 + (2L * 123456789L)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25510);assertEquals(expected, result); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25511);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25512);expected = new Instant(TEST_TIME1 - (3L * 123456789L)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25513);assertEquals(expected, result); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testMinus_RD709() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17juua4joq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD709",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17juua4joq(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25514); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25515);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25516);Instant result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25517);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25518);assertEquals(expected, result); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25519);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25520);assertSame(test, result); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testPlus_RD710() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7o9zsjox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD710",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7o9zsjox(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25521); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25522);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25523);Instant result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25524);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25525);assertEquals(expected, result); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25526);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25527);assertSame(test, result); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testToDateTimeISO711() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9ym4fjp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO711",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9ym4fjp4(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25528); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25529);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25530);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25531);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25532);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25533);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25534);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testToMutableDateTimeISO712() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obtnn2jpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obtnn2jpb(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25535); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25536);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25537);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25538);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25539);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25540);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25541);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testGet_DateTimeField1397() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfya5njpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField1397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfya5njpi(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25542); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25543);Instant test = new Instant(); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25544);assertEquals(1, test.get(ISOChronology.getInstance().era())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25545);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25546);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25547);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25548);assertEquals(2002, test.get(ISOChronology.getInstance().year())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25549);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25550);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25551);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25552);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25553);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25554);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25555);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25556);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25557);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25558);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25559);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25560);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25561);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25562);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25563);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25564);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25565);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25566);try { 
         __CLR4_4_1jmrjmrle6rjcei.R.inc(25567);test.get((DateTimeField) null); 
         __CLR4_4_1jmrjmrle6rjcei.R.inc(25568);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testIsBeforeNow1406() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k76autjq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow1406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k76autjq9(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25569); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25570);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25571);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25572);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testIsEqualNow1407() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1876thtjqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1876thtjqd(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25573); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25574);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25575);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25576);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 


public void testIsEqual_RI1408() {__CLR4_4_1jmrjmrle6rjcei.R.globalSliceStart(getClass().getName(),25577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7cr0wjqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmrjmrle6rjcei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmrjmrle6rjcei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI1408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7cr0wjqh(){try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25577); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25578);Instant test1 = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25579);Instant test1a = new Instant(TEST_TIME1); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25580);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25581);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25582);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25583);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25584);Instant test2 = new Instant(TEST_TIME2); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25585);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25586);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25587);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25588);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25589);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25590);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25591);assertEquals(false, test2.isEqual(new MockInstant())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25592);assertEquals(true, test1.isEqual(new MockInstant())); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25593);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25594);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null)); 
     __CLR4_4_1jmrjmrle6rjcei.R.inc(25595);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null)); 
 }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25596);
            __CLR4_4_1jmrjmrle6rjcei.R.inc(25597);return null;
        }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25598);
            __CLR4_4_1jmrjmrle6rjcei.R.inc(25599);return TEST_TIME1;
        }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jmrjmrle6rjcei.R.inc(25600);
            __CLR4_4_1jmrjmrle6rjcei.R.inc(25601);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1jmrjmrle6rjcei.R.flushNeeded();}}
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
    
    
    
    
    //-----------------------------------------------------------------------    
    
    
    
    
    //-----------------------------------------------------------------------
    

}
