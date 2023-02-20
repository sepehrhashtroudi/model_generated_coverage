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
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1jm1jm1le6qe9ic{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,25566,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25417);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25418);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25419);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25420);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1jm1jm1le6qe9ic.R.inc(25422);try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25421);
    }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25423);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25424);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25425);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25426);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25427);originalLocale = Locale.getDefault();
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25428);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25429);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25430);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25431);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25432);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25433);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25434);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25435);Locale.setDefault(originalLocale);
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25436);originalDateTimeZone = null;
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25437);originalTimeZone = null;
        __CLR4_4_1jm1jm1le6qe9ic.R.inc(25438);originalLocale = null;
    }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet_DateTimeFieldType690() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bulft6jmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeFieldType690",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bulft6jmn(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25439); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25440);Instant test = new Instant(); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25441);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25442);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25443);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25444);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25445);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25446);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25447);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25448);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25449);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25450);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25451);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25452);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25453);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25454);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25455);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25456);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25457);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25458);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25459);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25460);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25461);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25462);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25463);try { 
         __CLR4_4_1jm1jm1le6qe9ic.R.inc(25464);test.get((DateTimeFieldType) null); 
         __CLR4_4_1jm1jm1le6qe9ic.R.inc(25465);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone691() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19elr1ljne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19elr1ljne(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25466); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25467);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25468);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25469);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25470);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25471);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25472);result = test.toDateTime(PARIS); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25473);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25474);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25475);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25476);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25477);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25478);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testToInstant693() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bau5p9jnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant693",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bau5p9jnr(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25479); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25480);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25481);Instant result = test.toInstant(); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25482);assertSame(test, result); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testPlus_long694() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9qne1jnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9qne1jnv(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25483); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25484);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25485);Instant result = test.plus(123456789L); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25486);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25487);assertEquals(expected, result); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testMinus_RD695() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2q3lmjo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2q3lmjo0(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25488); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25489);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25490);Instant result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25491);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25492);assertEquals(expected, result); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25493);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25494);assertSame(test, result); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testMinus_long696() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnqpybjo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long696",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnqpybjo7(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25495); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25496);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25497);Instant result = test.minus(123456789L); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25498);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25499);assertEquals(expected, result); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testToDateTime697() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lroz7joc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lroz7joc(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25500); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25501);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25502);DateTime result = test.toDateTime(); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25503);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25504);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testToDateTimeISO698() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ewovjoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ewovjoh(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25505); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25506);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25507);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25508);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25509);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25510);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25511);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testGet_DateTimeField1403() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uytt5djoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField1403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uytt5djoo(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25512); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25513);Instant test = new Instant(); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25514);assertEquals(1, test.get(ISOChronology.getInstance().era())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25515);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25516);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25517);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25518);assertEquals(2002, test.get(ISOChronology.getInstance().year())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25519);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25520);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25521);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25522);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25523);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25524);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25525);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25526);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25527);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25528);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25529);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25530);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25531);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25532);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25533);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25534);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25535);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay())); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25536);try { 
         __CLR4_4_1jm1jm1le6qe9ic.R.inc(25537);test.get((DateTimeField) null); 
         __CLR4_4_1jm1jm1le6qe9ic.R.inc(25538);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testToMutableDateTime_Chronology1407() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4q18sjpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4q18sjpf(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25539); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25540);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25541);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25542);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25543);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25544);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25545);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25546);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25547);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25548);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25549);result = test.toMutableDateTime((Chronology) null); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25550);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25551);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testIsBeforeNow1411() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qb89njps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow1411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qb89njps(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25552); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25553);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25554);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25555);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 


public void testIsEqualNow1412() {__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceStart(getClass().getName(),25556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159o93djpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm1jm1le6qe9ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm1jm1le6qe9ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow1412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159o93djpw(){try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25556); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25557);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25558);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1jm1jm1le6qe9ic.R.inc(25559);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25560);
            __CLR4_4_1jm1jm1le6qe9ic.R.inc(25561);return null;
        }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25562);
            __CLR4_4_1jm1jm1le6qe9ic.R.inc(25563);return TEST_TIME1;
        }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jm1jm1le6qe9ic.R.inc(25564);
            __CLR4_4_1jm1jm1le6qe9ic.R.inc(25565);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1jm1jm1le6qe9ic.R.flushNeeded();}}
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
