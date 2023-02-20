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
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1jmpjmple6rckvs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25441);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25442);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25443);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25444);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1jmpjmple6rckvs.R.inc(25446);try{__CLR4_4_1jmpjmple6rckvs.R.inc(25445);
    }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25447);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25448);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25449);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jmpjmple6rckvs.R.inc(25450);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jmpjmple6rckvs.R.inc(25451);originalLocale = Locale.getDefault();
        __CLR4_4_1jmpjmple6rckvs.R.inc(25452);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25453);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jmpjmple6rckvs.R.inc(25454);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25455);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25456);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jmpjmple6rckvs.R.inc(25457);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25458);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25459);Locale.setDefault(originalLocale);
        __CLR4_4_1jmpjmple6rckvs.R.inc(25460);originalDateTimeZone = null;
        __CLR4_4_1jmpjmple6rckvs.R.inc(25461);originalTimeZone = null;
        __CLR4_4_1jmpjmple6rckvs.R.inc(25462);originalLocale = null;
    }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet_DateTimeFieldType694() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115efcqjnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeFieldType694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115efcqjnb(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25463); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25464);Instant test = new Instant(); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25465);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25466);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25467);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25468);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25469);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25470);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25471);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25472);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25473);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25474);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25475);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25476);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25477);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25478);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25479);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25480);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25481);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25482);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25483);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25484);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25485);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25486);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25487);try { 
         __CLR4_4_1jmpjmple6rckvs.R.inc(25488);test.get((DateTimeFieldType) null); 
         __CLR4_4_1jmpjmple6rckvs.R.inc(25489);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone695() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13le44bjo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13le44bjo2(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25490); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25491);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25492);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25493);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25494);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25495);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25496);result = test.toDateTime(PARIS); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25497);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25498);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25499);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25500);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25501);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25502);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testToInstant697() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p5pgnjof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p5pgnjof(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25503); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25504);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25505);Instant result = test.toInstant(); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25506);assertSame(test, result); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testWithDurationAdded_long_int698() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csjesljoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csjesljoj(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25507); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25508);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25509);Instant result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25510);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25511);assertEquals(expected, result); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25512);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25513);assertSame(test, result); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25514);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25515);expected = new Instant(TEST_TIME1 + (2L * 123456789L)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25516);assertEquals(expected, result); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25517);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25518);expected = new Instant(TEST_TIME1 - (3L * 123456789L)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25519);assertEquals(expected, result); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testPlus_RD699() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7xoewjow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7xoewjow(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25520); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25521);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25522);Instant result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25523);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25524);assertEquals(expected, result); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25525);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25526);assertSame(test, result); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testMinus_long700() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xe8xfljp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xe8xfljp3(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25527); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25528);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25529);Instant result = test.minus(123456789L); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25530);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25531);assertEquals(expected, result); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testToDateTime701() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13dcpm1jp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13dcpm1jp8(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25532); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25533);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25534);DateTime result = test.toDateTime(); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25535);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25536);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testToMutableDateTimeISO702() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e18whjpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e18whjpd(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25537); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25538);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25539);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25540);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25541);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25542);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25543);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testToMutableDateTime_Chronology1408() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvq2gbjpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology1408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvq2gbjpk(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25544); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25545);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25546);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25547);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25548);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25549);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25550);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25551);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25552);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25553);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25554);result = test.toMutableDateTime((Chronology) null); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25555);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25556);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testIsBeforeNow1410() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zb724jpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow1410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zb724jpx(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25557); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25558);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25559);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25560);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testIsEqualNow1411() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120oaawjq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow1411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120oaawjq1(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25561); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25562);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25563);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25564);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 


public void testIsEqual_RI1412() {__CLR4_4_1jmpjmple6rckvs.R.globalSliceStart(getClass().getName(),25565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zhn87jq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmpjmple6rckvs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmpjmple6rckvs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI1412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zhn87jq5(){try{__CLR4_4_1jmpjmple6rckvs.R.inc(25565); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25566);Instant test1 = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25567);Instant test1a = new Instant(TEST_TIME1); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25568);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25569);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25570);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25571);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25572);Instant test2 = new Instant(TEST_TIME2); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25573);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25574);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25575);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25576);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25577);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25578);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25579);assertEquals(false, test2.isEqual(new MockInstant())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25580);assertEquals(true, test1.isEqual(new MockInstant())); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25581);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25582);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null)); 
     __CLR4_4_1jmpjmple6rckvs.R.inc(25583);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null)); 
 }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25584);
            __CLR4_4_1jmpjmple6rckvs.R.inc(25585);return null;
        }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25586);
            __CLR4_4_1jmpjmple6rckvs.R.inc(25587);return TEST_TIME1;
        }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jmpjmple6rckvs.R.inc(25588);
            __CLR4_4_1jmpjmple6rckvs.R.inc(25589);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1jmpjmple6rckvs.R.flushNeeded();}}
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
