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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * This class is a Junit unit test for serialization.
 *
 * @author Stephen Colebourne
 */
public class TestSerialization extends TestCase {static class __CLR4_4_1jnqjnqle6o7a1h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25598,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    
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

//    private static class MockDelegatedDurationField extends DelegatedDurationField implements Serializable {
//        private static final long serialVersionUID = 1878496002811998493L;        
//        public MockDelegatedDurationField() {
//            super(MillisDurationField.INSTANCE);
//        }
//    }

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25478);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25479);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25480);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25481);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1jnqjnqle6o7a1h.R.inc(25483);try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25482);
    }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25484);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25485);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25486);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25487);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25488);originalLocale = Locale.getDefault();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25489);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25490);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25491);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25492);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25493);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25494);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25495);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25496);Locale.setDefault(originalLocale);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25497);originalDateTimeZone = null;
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25498);originalTimeZone = null;
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25499);originalLocale = null;
    }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSerializedGJChronologyChangedInternals51() throws Exception {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6zeyjoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6zeyjoc() throws Exception{try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25500); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25501);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25502);loadAndCompare(test, "GJChronologyChangedInternals", true); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25503);inlineCompare(test, true); 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
public void testDurationFields193() {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lpkx9jog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDurationFields193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lpkx9jog(){try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25504); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25505);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25506);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25507);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25508);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25509);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25510);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25511);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25512);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25513);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25514);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25515);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25516);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25517);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25518);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25519);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25520);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25521);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25522);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25523);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25524);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25525);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25526);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25527);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25528);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25529);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25530);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25531);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25532);assertEquals(false, coptic.weekyears().isPrecise());
}finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

public void testConstructor_Object3290() throws Throwable {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chjfn7jp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testConstructor_Object3290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chjfn7jp9() throws Throwable{try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25533); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25534);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.dayTime()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25535);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25536);assertEquals(0, test.getYears()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25537);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25538);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25539);assertEquals(0, test.getDays()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25540);assertEquals(1, test.getHours()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25541);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25542);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25543);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
public void testConstructor_Object3291() throws Throwable {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqjefojpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testConstructor_Object3291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqjefojpk() throws Throwable{try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25544); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25545);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25546);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25547);assertEquals(0, test.getYears()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25548);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25549);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25550);assertEquals(0, test.getDays()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25551);assertEquals(1, test.getHours()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25552);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25553);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25554);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
public void testPropertyRemainderHourOfDay311() {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ps01l5jpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testPropertyRemainderHourOfDay311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ps01l5jpv(){try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25555); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25556);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25557);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
public void testFactory_Zone_int345() {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsq8sojpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testFactory_Zone_int345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsq8sojpy(){try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25558); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25559);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25560);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25561);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25562);try { 
         __CLR4_4_1jnqjnqle6o7a1h.R.inc(25563);GregorianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1jnqjnqle6o7a1h.R.inc(25564);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25565);try { 
         __CLR4_4_1jnqjnqle6o7a1h.R.inc(25566);GregorianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1jnqjnqle6o7a1h.R.inc(25567);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
public void testToString346() {__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceStart(getClass().getName(),25568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfidfmjq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jnqjnqle6o7a1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jnqjnqle6o7a1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testToString346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfidfmjq8(){try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25568); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25569);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25570);assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25571);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25572);assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1jnqjnqle6o7a1h.R.inc(25573);assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25574);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25575);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25576);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25577);Object obj = ois.readObject();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25578);ois.close();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25579);if ((((same)&&(__CLR4_4_1jnqjnqle6o7a1h.R.iget(25580)!=0|true))||(__CLR4_4_1jnqjnqle6o7a1h.R.iget(25581)==0&false))) {{
            __CLR4_4_1jnqjnqle6o7a1h.R.inc(25582);assertSame(test, obj);
        } }else {{
            __CLR4_4_1jnqjnqle6o7a1h.R.inc(25583);assertEquals(test, obj);
        }
//        try {
//            fis = new FileInputStream("src/test/resources/" + filename + "2.dat");
//            ois = new ObjectInputStream(fis);
//            obj = ois.readObject();
//            ois.close();
//            if (same) {
//                assertSame(test, obj);
//            } else {
//                assertEquals(test, obj);
//            }
//        } catch (FileNotFoundException ex) {
//            // ignore
//        }
    }}finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1jnqjnqle6o7a1h.R.inc(25584);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25585);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25586);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25587);oos.writeObject(test);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25588);oos.close();
        
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25589);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25590);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25591);Object obj = ois.readObject();
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25592);ois.close();
        
        __CLR4_4_1jnqjnqle6o7a1h.R.inc(25593);if ((((same)&&(__CLR4_4_1jnqjnqle6o7a1h.R.iget(25594)!=0|true))||(__CLR4_4_1jnqjnqle6o7a1h.R.iget(25595)==0&false))) {{
            __CLR4_4_1jnqjnqle6o7a1h.R.inc(25596);assertSame(test, obj);
        } }else {{
            __CLR4_4_1jnqjnqle6o7a1h.R.inc(25597);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1jnqjnqle6o7a1h.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testStoreSerializedInstant() throws Exception {
//        Instant test = new Instant();
//        store(test, "Instant.dat");
//    }
//
//    public void testStoreSerializedDateTime() throws Exception {
//        DateTime test = new DateTime();
//        store(test, "DateTime.dat");
//    }
//
//    public void testStoreSerializedMutableDateTime() throws Exception {
//        MutableDateTime test = new MutableDateTime();
//        store(test, "MutableDateTime.dat");
//    }
//
//    public void testStoreSerializedDateMidnight() throws Exception {
//        DateMidnight test = new DateMidnight();
//        store(test, "DateMidnight.dat");
//    }
//
//    public void testStoreSerializedLocalDate() throws Exception {
//        LocalDate test = new LocalDate();
//        store(test, "LocalDate.dat");
//    }
//
//    public void testStoreSerializedLocalDateBuddhist() throws Exception {
//        LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
//        store(test, "LocalDateBuddhist.dat");
//    }
//
//    public void testStoreSerializedLocalTime() throws Exception {
//        LocalTime test = new LocalTime();
//        store(test, "LocalTime.dat");
//    }
//
//    public void testStoreSerializedLocalDateTime() throws Exception {
//        LocalDateTime test = new LocalDateTime();
//        store(test, "LocalDateTime.dat");
//    }
//
//    public void testStoreSerializedYearMonthDay() throws Exception {
//        YearMonthDay test = new YearMonthDay();
//        store(test, "YearMonthDay.dat");
//    }
//
//    public void testStoreSerializedYearMonthDayProperty() throws Exception {
//        YearMonthDay.Property test = new YearMonthDay().monthOfYear();
//        store(test, "YearMonthDayProperty.dat");
//    }
//
//    public void testStoreSerializedTimeOfDay() throws Exception {
//        TimeOfDay test = new TimeOfDay();
//        store(test, "TimeOfDay.dat");
//    }
//
//    public void testStoreSerializedTimeOfDayProperty() throws Exception {
//        TimeOfDay.Property test = new TimeOfDay().hourOfDay();
//        store(test, "TimeOfDayProperty.dat");
//    }
//
//    public void testStoreSerializedDateTimeZoneUTC() throws Exception {
//        DateTimeZone test = DateTimeZone.UTC;
//        store(test, "DateTimeZoneUTC.dat");
//    }
//
//    public void testStoreSerializedDateTimeZone() throws Exception {
//        DateTimeZone test = PARIS;
//        store(test, "DateTimeZone.dat");
//    }
//
//    public void testStoreSerializedCopticChronology() throws Exception {
//        CopticChronology test = CopticChronology.getInstance(LONDON);
//        store(test, "CopticChronology.dat");
//    }
//
//    public void testStoreSerializedISOChronology() throws Exception {
//        ISOChronology test = ISOChronology.getInstance(PARIS);
//        store(test, "ISOChronology.dat");
//    }
//
//    public void testStoreSerializedGJChronology() throws Exception {
//        GJChronology test = GJChronology.getInstance(TOKYO);
//        store(test, "GJChronology.dat");
//    }
//
//    // Format changed in v1.2 - min days in first week not deserialized in v1.0/1.1
//    public void testStoreSerializedGJChronologyChangedInternals() throws Exception {
//        GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
//        store(test, "GJChronologyChangedInternals.dat");
//    }
//
//    public void testStoreSerializedGregorianChronology() throws Exception {
//        GregorianChronology test = GregorianChronology.getInstance(PARIS);
//        store(test, "GregorianChronology.dat");
//    }
//
//    public void testStoreSerializedJulianChronology() throws Exception {
//        JulianChronology test = JulianChronology.getInstance(PARIS);
//        store(test, "JulianChronology.dat");
//    }
//
//    public void testStoreSerializedBuddhistChronology() throws Exception {
//        BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
//        store(test, "BuddhistChronology.dat");
//    }
//
//    public void testStoreSerializedPeriodType() throws Exception {
//        PeriodType test = PeriodType.dayTime();
//        store(test, "PeriodType.dat");
//    }
//
//    public void testStoreSerializedDateTimeFieldType() throws Exception {
//        DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
//        store(test, "DateTimeFieldType.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDateTimeField() throws Exception {
//        UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
//                DateTimeFieldType.year(),
//                UnsupportedDurationField.getInstance(DurationFieldType.years()));
//        store(test, "UnsupportedDateTimeField.dat");
//    }
//
//    public void testStoreSerializedDurationFieldType() throws Exception {
//        DurationFieldType test = DurationFieldType.MINUTES_TYPE;
//        store(test, "DurationFieldType.dat");
//    }
//
//    public void testStoreSerializedMillisDurationField() throws Exception {
//        MillisDurationField test = (MillisDurationField) MillisDurationField.INSTANCE;
//        store(test, "MillisDurationField.dat");
//    }
//
//    public void testStoreSerializedDelegatedDurationField() throws Exception {
//        DelegatedDurationField test = new MockDelegatedDurationField();
//        store(test, "DelegatedDurationField.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDurationField() throws Exception {
//        UnsupportedDurationField test = UnsupportedDurationField.getInstance(DurationFieldType.eras());
//        store(test, "UnsupportedDurationField.dat");
//    }
//
    // format changed (properly defined) in v1.1
//    public void testStoreSerializedDateTimeProperty() throws Exception {
//        DateTime.Property test = new DateTime().hourOfDay();
//        store(test, "DateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedMutableDateTimeProperty() throws Exception {
//        MutableDateTime.Property test = new MutableDateTime().hourOfDay();
//        store(test, "MutableDateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        DateMidnight.Property test = new DateMidnight().monthOfYear();
//        store(test, "DateMidnightProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        Duration test = Duration.millis(12345);
//        store(test, "Duration.dat");
//    }

//    private void store(Serializable test, String filename) throws Exception {
//        FileOutputStream fos = new FileOutputStream("src/test/resources/" + filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(test);
//        } finally {
//            oos.close();
//        }
//        oos.close();
//    }

}
