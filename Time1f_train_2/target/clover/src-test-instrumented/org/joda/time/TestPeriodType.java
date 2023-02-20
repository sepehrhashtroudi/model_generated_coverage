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
public class TestPeriodType extends TestCase {static class __CLR4_4_1nd1nd1le6qsf8g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,30579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30277);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30278);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30279);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30280);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1nd1nd1le6qsf8g.R.inc(30282);try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30281);
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30283);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30284);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30285);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30286);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30287);originalLocale = Locale.getDefault();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30288);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30289);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30290);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30291);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30292);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30293);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30294);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30295);Locale.setDefault(originalLocale);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30296);originalDateTimeZone = null;
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30297);originalTimeZone = null;
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30298);originalLocale = null;
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testYearMonthDay746() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azcdclndn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay746",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azcdclndn() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30299); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30300);PeriodType type = PeriodType.yearMonthDay(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30301);assertEquals(3, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30302);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30303);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30304);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30305);assertEquals("YearMonthDay", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30306);assertEquals("PeriodType[YearMonthDay]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30307);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30308);assertEquals(true, type == PeriodType.yearMonthDay()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30309);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30310);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30311);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30312);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30313);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testYearWeekDayTime747() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11s6emdne2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime747",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11s6emdne2() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30314); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30315);PeriodType type = PeriodType.yearWeekDayTime(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30316);assertEquals(7, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30317);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30318);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30319);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30320);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30321);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30322);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30323);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30324);assertEquals("YearWeekDayTime", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30325);assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30326);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30327);assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30328);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30329);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30330);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30331);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30332);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testYearWeekDay749() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1774krunel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay749",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1774krunel() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30333); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30334);PeriodType type = PeriodType.yearWeekDay(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30335);assertEquals(3, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30336);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30337);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30338);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30339);assertEquals("YearWeekDay", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30340);assertEquals("PeriodType[YearWeekDay]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30341);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30342);assertEquals(true, type == PeriodType.yearWeekDay()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30343);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30344);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30345);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30346);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30347);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testYearDayTime750() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5tsvznf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime750",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5tsvznf0() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30348); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30349);PeriodType type = PeriodType.yearDayTime(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30350);assertEquals(6, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30351);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30352);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30353);assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30354);assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30355);assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30356);assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30357);assertEquals("YearDayTime", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30358);assertEquals("PeriodType[YearDayTime]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30359);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30360);assertEquals(true, type == PeriodType.yearDayTime()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30361);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30362);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30363);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30364);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30365);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testYearDay751() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtxah9nfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay751",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtxah9nfi() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30366); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30367);PeriodType type = PeriodType.yearDay(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30368);assertEquals(2, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30369);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30370);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30371);assertEquals("YearDay", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30372);assertEquals("PeriodType[YearDay]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30373);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30374);assertEquals(true, type == PeriodType.yearDay()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30375);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30376);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30377);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30378);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30379);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testYears755() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g721gmnfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g721gmnfw() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30380); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30381);PeriodType type = PeriodType.years(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30382);assertEquals(1, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30383);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30384);assertEquals("Years", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30385);assertEquals("PeriodType[Years]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30386);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30387);assertEquals(true, type == PeriodType.years()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30388);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30389);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30390);assertEquals(true, type.hashCode() == PeriodType.years().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30391);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30392);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testWeeks756() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmevrmng9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWeeks756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmevrmng9() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30393); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30394);PeriodType type = PeriodType.weeks(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30395);assertEquals(1, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30396);assertEquals(DurationFieldType.weeks(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30397);assertEquals("Weeks", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30398);assertEquals("PeriodType[Weeks]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30399);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30400);assertEquals(true, type == PeriodType.weeks()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30401);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30402);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30403);assertEquals(true, type.hashCode() == PeriodType.weeks().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30404);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30405);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testDays757() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0qppzngm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays757",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0qppzngm() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30406); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30407);PeriodType type = PeriodType.days(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30408);assertEquals(1, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30409);assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30410);assertEquals("Days", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30411);assertEquals("PeriodType[Days]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30412);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30413);assertEquals(true, type == PeriodType.days()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30414);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30415);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30416);assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30417);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30418);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testForFields1758() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1195pcngz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields1758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1195pcngz() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30419); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30420);PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30421);assertSame(PeriodType.years(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30422);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30423);assertSame(PeriodType.months(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30424);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30425);assertSame(PeriodType.weeks(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30426);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30427);assertSame(PeriodType.days(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30428);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30429);assertSame(PeriodType.hours(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30430);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30431);assertSame(PeriodType.minutes(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30432);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30433);assertSame(PeriodType.seconds(), type); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30434);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30435);assertSame(PeriodType.millis(), type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testForFields6760() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ry18k2nhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ry18k2nhg() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30436); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30437);DurationFieldType[] types = null; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30438);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30439);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30440);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30441);types = new DurationFieldType[0]; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30442);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30443);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30444);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30445);types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30446);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30447);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30448);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30449);types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30450);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30451);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30452);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testForFields7761() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yze7f2nhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields7761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yze7f2nhx() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30453); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30454);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.months() }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30455);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.seconds() }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30456);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30457);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30458);assertEquals(false, type == type2); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30459);assertEquals(false, type.equals(type2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30460);assertEquals(false, type.hashCode() == type2.hashCode()); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testForFields5762() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlcixhni5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlcixhni5() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30461); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30462);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30463);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30464);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30465);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30466);try { 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30467);PeriodType.forFields(types); 
         __CLR4_4_1nd1nd1le6qsf8g.R.inc(30468);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testForFields2763() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iaak3dnid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields2763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iaak3dnid() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30469); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30470);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.hours() }; 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30471);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30472);assertEquals(2, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30473);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30474);assertEquals(DurationFieldType.hours(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30475);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30476);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30477);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30478);assertEquals(true, type == PeriodType.forFields(types)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30479);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30480);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30481);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30482);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30483);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testIsSupported764() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhonxmnis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhonxmnis() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30484); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30485);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30486);assertEquals(false, type.isSupported(DurationFieldType.years())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30487);assertEquals(false, type.isSupported(DurationFieldType.months())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30488);assertEquals(false, type.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30489);assertEquals(true, type.isSupported(DurationFieldType.days())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30490);assertEquals(true, type.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30491);assertEquals(true, type.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30492);assertEquals(true, type.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30493);assertEquals(false, type.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testMaskYears765() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12b2up1nj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears765",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12b2up1nj2() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30494); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30495);PeriodType type = PeriodType.standard().withYearsRemoved(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30496);assertEquals(7, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30497);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30498);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30499);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30500);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30501);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30502);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30503);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30504);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30505);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30506);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30507);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30508);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30509);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30510);assertEquals("StandardNoYears", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30511);assertEquals("PeriodType[StandardNoYears]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30512);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testMaskMinutes766() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbowqlnjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes766",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbowqlnjl() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30513); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30514);PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30515);assertEquals(7, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30516);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30517);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30518);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30519);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30520);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30521);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30522);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30523);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30524);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30525);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30526);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30527);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30528);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30529);assertEquals("StandardNoMinutes", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30530);assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30531);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testMaskMillis767() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ye4nwlnk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis767",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ye4nwlnk4() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30532); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30533);PeriodType type = PeriodType.standard().withMillisRemoved(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30534);assertEquals(7, type.size()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30535);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30536);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30537);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30538);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30539);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30540);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30541);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30542);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30543);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30544);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30545);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30546);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30547);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30548);assertEquals("StandardNoMillis", type.getName()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30549);assertEquals("PeriodType[StandardNoMillis]", type.toString()); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30550);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 


public void testEquals768() throws Exception {__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceStart(getClass().getName(),30551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppln8vnkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nd1nd1le6qsf8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nd1nd1le6qsf8g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals768",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppln8vnkn() throws Exception{try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30551); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30552);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30553);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30554);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved())); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30555);assertEquals(false, type.equals(null)); 
     __CLR4_4_1nd1nd1le6qsf8g.R.inc(30556);assertEquals(false, type.equals("")); 
 }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30557);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30558);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30559);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30560);oos.writeObject(type);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30561);byte[] bytes = baos.toByteArray();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30562);oos.close();
        
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30563);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30564);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30565);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30566);ois.close();
        
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30567);assertEquals(type, result);
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1nd1nd1le6qsf8g.R.inc(30568);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30569);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30570);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30571);oos.writeObject(type);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30572);byte[] bytes = baos.toByteArray();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30573);oos.close();
        
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30574);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30575);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30576);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30577);ois.close();
        
        __CLR4_4_1nd1nd1le6qsf8g.R.inc(30578);assertEquals(type, result);
    }finally{__CLR4_4_1nd1nd1le6qsf8g.R.flushNeeded();}}

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
