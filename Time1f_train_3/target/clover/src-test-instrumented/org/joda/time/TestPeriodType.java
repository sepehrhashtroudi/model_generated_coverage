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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {static class __CLR4_4_1ncdncdle6rclwc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,30548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30253);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30254);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30255);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30256);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1ncdncdle6rclwc.R.inc(30258);try{__CLR4_4_1ncdncdle6rclwc.R.inc(30257);
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30259);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30260);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30261);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30262);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30263);originalLocale = Locale.getDefault();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30264);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30265);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ncdncdle6rclwc.R.inc(30266);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30267);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30268);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30269);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30270);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30271);Locale.setDefault(originalLocale);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30272);originalDateTimeZone = null;
        __CLR4_4_1ncdncdle6rclwc.R.inc(30273);originalTimeZone = null;
        __CLR4_4_1ncdncdle6rclwc.R.inc(30274);originalLocale = null;
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testYearMonthDay759() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkwvplncz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkwvplncz() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30275); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30276);PeriodType type = PeriodType.yearMonthDay(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30277);assertEquals(3, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30278);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30279);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30280);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30281);assertEquals("YearMonthDay", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30282);assertEquals("PeriodType[YearMonthDay]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30283);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30284);assertEquals(true, type == PeriodType.yearMonthDay()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30285);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30286);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30287);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30288);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30289);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testYearWeekDayTime760() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywjmxende();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywjmxende() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30290); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30291);PeriodType type = PeriodType.yearWeekDayTime(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30292);assertEquals(7, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30293);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30294);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30295);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30296);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30297);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30298);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30299);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30300);assertEquals("YearWeekDayTime", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30301);assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30302);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30303);assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30304);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30305);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30306);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30307);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30308);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testYearWeekDay761() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue9eg0ndx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue9eg0ndx() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30309); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30310);PeriodType type = PeriodType.yearWeekDay(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30311);assertEquals(3, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30312);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30313);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30314);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30315);assertEquals("YearWeekDay", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30316);assertEquals("PeriodType[YearWeekDay]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30317);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30318);assertEquals(true, type == PeriodType.yearWeekDay()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30319);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30320);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30321);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30322);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30323);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testYearDayTime762() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nfeyonec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nfeyonec() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30324); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30325);PeriodType type = PeriodType.yearDayTime(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30326);assertEquals(6, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30327);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30328);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30329);assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30330);assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30331);assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30332);assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30333);assertEquals("YearDayTime", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30334);assertEquals("PeriodType[YearDayTime]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30335);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30336);assertEquals(true, type == PeriodType.yearDayTime()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30337);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30338);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30339);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30340);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30341);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testYearDay763() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zbxdeneu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zbxdeneu() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30342); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30343);PeriodType type = PeriodType.yearDay(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30344);assertEquals(2, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30345);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30346);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30347);assertEquals("YearDay", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30348);assertEquals("PeriodType[YearDay]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30349);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30350);assertEquals(true, type == PeriodType.yearDay()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30351);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30352);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30353);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30354);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30355);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testYears766() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grstvenf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears766",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grstvenf8() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30356); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30357);PeriodType type = PeriodType.years(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30358);assertEquals(1, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30359);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30360);assertEquals("Years", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30361);assertEquals("PeriodType[Years]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30362);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30363);assertEquals(true, type == PeriodType.years()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30364);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30365);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30366);assertEquals(true, type.hashCode() == PeriodType.years().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30367);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30368);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testDays767() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caifpmnfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays767",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caifpmnfl() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30369); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30370);PeriodType type = PeriodType.days(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30371);assertEquals(1, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30372);assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30373);assertEquals("Days", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30374);assertEquals("PeriodType[Days]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30375);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30376);assertEquals(true, type == PeriodType.days()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30377);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30378);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30379);assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30380);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30381);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testForFields1768() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tolqu7nfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields1768",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tolqu7nfy() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30382); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30383);PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30384);assertSame(PeriodType.years(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30385);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30386);assertSame(PeriodType.months(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30387);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30388);assertSame(PeriodType.weeks(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30389);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30390);assertSame(PeriodType.days(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30391);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30392);assertSame(PeriodType.hours(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30393);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30394);assertSame(PeriodType.minutes(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30395);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30396);assertSame(PeriodType.seconds(), type); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30397);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30398);assertSame(PeriodType.millis(), type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testSeconds770() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffxd3engf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds770",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffxd3engf() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30399); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30400);PeriodType type = PeriodType.seconds(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30401);assertEquals(1, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30402);assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30403);assertEquals("Seconds", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30404);assertEquals("PeriodType[Seconds]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30405);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30406);assertEquals(true, type == PeriodType.seconds()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30407);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30408);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30409);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30410);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30411);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testMaskSeconds771() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wseollngs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds771",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wseollngs() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30412); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30413);PeriodType type = PeriodType.standard().withSecondsRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30414);assertEquals(7, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30415);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30416);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30417);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30418);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30419);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30420);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30421);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30422);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30423);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30424);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30425);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30426);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30427);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30428);assertEquals("StandardNoSeconds", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30429);assertEquals("PeriodType[StandardNoSeconds]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30430);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testForFields4772() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkl9pnnhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields4772",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkl9pnnhb() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30431); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30432);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30433);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30434);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30435);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30436);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testIsSupported773() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2kgagnhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported773",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2kgagnhh() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30437); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30438);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30439);assertEquals(false, type.isSupported(DurationFieldType.years())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30440);assertEquals(false, type.isSupported(DurationFieldType.months())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30441);assertEquals(false, type.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30442);assertEquals(true, type.isSupported(DurationFieldType.days())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30443);assertEquals(true, type.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30444);assertEquals(true, type.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30445);assertEquals(true, type.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30446);assertEquals(false, type.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testMaskYears774() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srxsg3nhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears774",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srxsg3nhr() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30447); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30448);PeriodType type = PeriodType.standard().withYearsRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30449);assertEquals(7, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30450);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30451);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30452);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30453);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30454);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30455);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30456);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30457);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30458);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30459);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30460);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30461);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30462);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30463);assertEquals("StandardNoYears", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30464);assertEquals("PeriodType[StandardNoYears]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30465);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testMaskTwice2775() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13psgngnia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2775",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13psgngnia() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30466); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30467);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30468);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30469);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30470);type = PeriodType.dayTime(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30471);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30472);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30473);type = PeriodType.dayTime(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30474);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30475);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30476);type = PeriodType.millis(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30477);type2 = type.withDaysRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30478);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30479);type = PeriodType.millis(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30480);type2 = type.withHoursRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30481);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30482);type = PeriodType.millis(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30483);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30484);assertEquals(true, type == type2); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30485);type = PeriodType.millis(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30486);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30487);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testMaskMinutes776() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzk8p0niw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes776",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzk8p0niw() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30488); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30489);PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30490);assertEquals(7, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30491);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30492);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30493);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30494);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30495);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30496);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30497);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30498);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30499);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30500);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30501);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30502);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30503);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30504);assertEquals("StandardNoMinutes", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30505);assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30506);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 


public void testMaskMillis777() throws Exception {__CLR4_4_1ncdncdle6rclwc.R.globalSliceStart(getClass().getName(),30507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14o9rd2njf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ncdncdle6rclwc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ncdncdle6rclwc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis777",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14o9rd2njf() throws Exception{try{__CLR4_4_1ncdncdle6rclwc.R.inc(30507); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30508);PeriodType type = PeriodType.standard().withMillisRemoved(); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30509);assertEquals(7, type.size()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30510);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30511);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30512);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30513);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30514);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30515);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30516);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30517);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30518);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30519);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30520);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30521);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30522);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30523);assertEquals("StandardNoMillis", type.getName()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30524);assertEquals("PeriodType[StandardNoMillis]", type.toString()); 
     __CLR4_4_1ncdncdle6rclwc.R.inc(30525);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30526);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30527);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30528);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30529);oos.writeObject(type);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30530);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30531);oos.close();
        
        __CLR4_4_1ncdncdle6rclwc.R.inc(30532);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30533);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30534);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30535);ois.close();
        
        __CLR4_4_1ncdncdle6rclwc.R.inc(30536);assertEquals(type, result);
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1ncdncdle6rclwc.R.inc(30537);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30538);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30539);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30540);oos.writeObject(type);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30541);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30542);oos.close();
        
        __CLR4_4_1ncdncdle6rclwc.R.inc(30543);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30544);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ncdncdle6rclwc.R.inc(30545);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1ncdncdle6rclwc.R.inc(30546);ois.close();
        
        __CLR4_4_1ncdncdle6rclwc.R.inc(30547);assertEquals(type, result);
    }finally{__CLR4_4_1ncdncdle6rclwc.R.flushNeeded();}}

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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    // ensure hash key distribution
    

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
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
