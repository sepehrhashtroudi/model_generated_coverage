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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1hjxhjxle6o79pf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22946,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22749);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22750);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22751);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22752);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1hjxhjxle6o79pf.R.inc(22754);try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22753);
    }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22755);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22756);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22757);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22758);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22759);originalLocale = Locale.getDefault();
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22760);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22761);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22762);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22763);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22764);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22765);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22766);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22767);Locale.setDefault(originalLocale);
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22768);originalDateTimeZone = null;
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22769);originalTimeZone = null;
        __CLR4_4_1hjxhjxle6o79pf.R.inc(22770);originalLocale = null;
    }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetDuration1104() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgc0l9hkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetDuration1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgc0l9hkj(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22771); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22772);Duration test = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22773);assertEquals(123L, test.getMillis()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testToStandardHours105() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17skiawhkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17skiawhkm(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22774); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22775);Duration test = new Duration(0L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22776);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22777);test = new Duration(1L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22778);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22779);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22780);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22781);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22782);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22783);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22784);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22785);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22786);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22787);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22788);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22789);test = new Duration(-1L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22790);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22791);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22792);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22793);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22794);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testToStandardMinutes106() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4tg5zhl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4tg5zhl7(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22795); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22796);Duration test = new Duration(0L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22797);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22798);test = new Duration(1L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22799);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22800);test = new Duration(999L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22801);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22802);test = new Duration(1000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22803);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22804);test = new Duration(1001L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22805);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22806);test = new Duration(1999L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22807);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22808);test = new Duration(2000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22809);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22810);test = new Duration(-1L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22811);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22812);test = new Duration(-999L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22813);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22814);test = new Duration(-1000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22815);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testMinus_RD2108() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjoaoxhls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjoaoxhls(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22816); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22817);Duration test = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22818);Duration result = test.minus(new Duration(0L)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22819);assertSame(test, result); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testWithDurationAdded_RD_int5109() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14em1afhlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14em1afhlw(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22820); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22821);Duration test = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22822);Duration result = test.withDurationAdded(new Duration(8000L), 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22823);assertSame(test, result); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testMinus_long1110() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kcm8zhm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kcm8zhm0(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22824); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22825);Duration test = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22826);Duration result = test.minus(8000L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22827);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testToIntervalFrom262() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqtgfbhm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqtgfbhm4(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22828); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22829);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22830);Duration test = new Duration(length); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22831);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22832);Interval result = test.toIntervalFrom(dt); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22833);assertEquals(new Interval(dt, test), result); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testGetPeriodType293() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnpk38hma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetPeriodType293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnpk38hma(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22834); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22835);Period test = new Period(0L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22836);assertEquals(PeriodType.standard(), test.getPeriodType()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testForFields1294() throws Exception {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjs2bxhmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testForFields1294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjs2bxhmd() throws Exception{try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22837); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22838);PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22839);assertSame(PeriodType.years(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22840);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22841);assertSame(PeriodType.months(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22842);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22843);assertSame(PeriodType.weeks(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22844);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22845);assertSame(PeriodType.days(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22846);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22847);assertSame(PeriodType.hours(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22848);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22849);assertSame(PeriodType.minutes(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22850);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22851);assertSame(PeriodType.seconds(), type); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22852);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22853);assertSame(PeriodType.millis(), type); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testGetPeriodType295() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5pho6hmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetPeriodType295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5pho6hmu(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22854); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22855);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22856);assertEquals(PeriodType.minutes(), test.getPeriodType()); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testToStandardHours419() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1siq6tahmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1siq6tahmx(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22857); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22858);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22859);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22860);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22861);try { 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22862);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22863);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testMultipliedBy_int421() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wp5vjmhn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_int421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wp5vjmhn4(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22864); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22865);Hours test = Hours.hours(2); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22866);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22867);assertEquals(2, test.getHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22868);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22869);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22870);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22871);try { 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22872);halfMax.multipliedBy(2); 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22873);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testToPeriod563() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wzkdnhne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wzkdnhne(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22874); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22875);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22876);Duration test = new Duration(length); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22877);Period result = test.toPeriod(); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22878);assertEquals(new Period(test, PeriodType.standard()), result); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22879);assertEquals(new Period(test.getMillis(), PeriodType.standard()), result); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testCompareTo564() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njhwl0hnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njhwl0hnk(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22880); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22881);Duration test1 = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22882);Duration test1a = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22883);assertEquals(true, test1.compareTo(test1a) < 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22884);assertEquals(true, test1a.compareTo(test1) > 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22885);assertEquals(true, test1.compareTo(test1) == 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22886);assertEquals(true, test1a.compareTo(test1a) < 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22887);Duration test2 = new Duration(321L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22888);assertEquals(true, test1.compareTo(test2) < 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22889);assertEquals(true, test2.compareTo(test1) > 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22890);assertEquals(true, test2.compareTo(test2) == 0); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22891);try { 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22892);test1.compareTo(null); 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22893);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testCompareTo565() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kahxsjhny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kahxsjhny(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22894); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22895);Duration test1 = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22896);Duration test1a = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22897);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22898);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22899);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22900);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22901);Duration test2 = new Duration(321L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22902);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22903);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22904);assertEquals(+1, test2.compareTo(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22905);assertEquals(0, test1.compareTo(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22906);try { 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22907);test1.compareTo(null); 
         __CLR4_4_1hjxhjxle6o79pf.R.inc(22908);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testIsEqual567() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19k28l7hod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19k28l7hod(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22909); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22910);Duration test1 = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22911);Duration test1a = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22912);assertEquals(false, test1.isEqual(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22913);assertEquals(false, test1a.isEqual(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22914);assertEquals(false, test1.isEqual(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22915);assertEquals(false, test1a.isEqual(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22916);Duration test2 = new Duration(321L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22917);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22918);assertEquals(true, test2.isEqual(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22919);assertEquals(true, test2.isEqual(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22920);assertEquals(false, test1.isEqual(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22921);assertEquals(true, test1.isEqual(null)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22922);assertEquals(false, new Duration(0L).isEqual(null)); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
public void testIsAfter568() {__CLR4_4_1hjxhjxle6o79pf.R.globalSliceStart(getClass().getName(),22923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16stw72hor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjxhjxle6o79pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjxhjxle6o79pf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16stw72hor(){try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22923); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22924);Duration test1 = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22925);Duration test1a = new Duration(123L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22926);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22927);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22928);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22929);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22930);Duration test2 = new Duration(321L); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22931);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22932);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22933);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22934);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22935);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1hjxhjxle6o79pf.R.inc(22936);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1hjxhjxle6o79pf.R.inc(22938);try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22937);
            __CLR4_4_1hjxhjxle6o79pf.R.inc(22939);iValue = value;
        }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22940);
            __CLR4_4_1hjxhjxle6o79pf.R.inc(22941);return iValue;
        }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
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
    

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1hjxhjxle6o79pf.R.inc(22943);try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22942);
        }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1hjxhjxle6o79pf.R.inc(22944);
            __CLR4_4_1hjxhjxle6o79pf.R.inc(22945);super.setMillis(duration);
        }finally{__CLR4_4_1hjxhjxle6o79pf.R.flushNeeded();}}
    }

}
