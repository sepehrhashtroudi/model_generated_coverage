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
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1j4cj4cle6rjccr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,25029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24780);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24781);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24782);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24783);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1j4cj4cle6rjccr.R.inc(24785);try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24784);
    }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24786);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24787);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24788);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24789);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24790);originalLocale = Locale.getDefault();
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24791);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24792);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24793);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24794);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24795);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24796);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24797);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24798);Locale.setDefault(originalLocale);
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24799);originalDateTimeZone = null;
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24800);originalTimeZone = null;
        __CLR4_4_1j4cj4cle6rjccr.R.inc(24801);originalLocale = null;
    }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriodFrom_PeriodType79() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4q0a3j4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType79",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4q0a3j4y(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24802); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24803);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24804);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24805);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24806);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24807);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriod_Chronology82() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ui6wd2j54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ui6wd2j54(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24808); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24809);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24810);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24811);Period result = test.toPeriod(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24812);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24813);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriod_PeriodType_Chronology83() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spqxotj5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spqxotj5a(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24814); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24815);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24816);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24817);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24818);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24819);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToStandardDays234() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgm1zbj5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgm1zbj5g(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24820); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24821);Duration test = new Duration(0L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24822);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24823);test = new Duration(1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24824);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24825);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24826);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24827);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24828);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24829);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24830);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24831);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24832);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24833);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24834);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24835);test = new Duration(-1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24836);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24837);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24838);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24839);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24840);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToStandardSeconds235() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11y224aj61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11y224aj61(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24841); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24842);Duration test = new Duration(0L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24843);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24844);test = new Duration(1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24845);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24846);test = new Duration(999L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24847);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24848);test = new Duration(1000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24849);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24850);test = new Duration(1001L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24851);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24852);test = new Duration(1999L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24853);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24854);test = new Duration(2000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24855);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24856);test = new Duration(-1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24857);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24858);test = new Duration(-999L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24859);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24860);test = new Duration(-1000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24861);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToDuration1236() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wuygxgj6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wuygxgj6m(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24862); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24863);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24864);Duration result = test.toDuration(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24865);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testWithMillis1237() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txatjej6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txatjej6q(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24866); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24867);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24868);Duration result = test.withMillis(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24869);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testWithMillis2238() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x04mfqj6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis2238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x04mfqj6u(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24870); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24871);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24872);Duration result = test.withMillis(1234567890L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24873);assertEquals(1234567890L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testMinus_RD2239() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8ttpcj6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8ttpcj6y(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24874); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24875);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24876);Duration result = test.minus(new Duration(0L)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24877);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int5240() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1v4x9j72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1v4x9j72(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24878); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24879);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24880);Duration result = test.withDurationAdded(new Duration(8000L), 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24881);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testPlus_long1241() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogdr10j76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogdr10j76(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24882); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24883);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24884);Duration result = test.plus(8000L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24885);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testPlus_RD3242() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16spqonj7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16spqonj7a(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24886); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24887);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24888);Duration result = test.plus(null); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24889);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testPlus_RD1243() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d932b8j7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d932b8j7e(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24890); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24891);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24892);Duration result = test.plus(new Duration(8000L)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24893);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testMinus_RD3244() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xa3wnj7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD3244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xa3wnj7i(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24894); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24895);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24896);Duration result = test.minus(null); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24897);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testMinus_RD1245() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dnfj8j7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dnfj8j7m(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24898); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24899);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24900);Duration result = test.minus(new Duration(8000L)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24901);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testMultipliedBy_long1246() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165fx61j7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165fx61j7q(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24902); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24903);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24904);Duration result = test.multipliedBy(2L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24905);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testMultipliedBy_long2247() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e94j61j7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e94j61j7u(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24906); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24907);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24908);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24909);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testDividedBy_long2248() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkgs3uj7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkgs3uj7y(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24910); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24911);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24912);Duration result = test.dividedBy(1L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24913);assertSame(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testDividedBy_long1249() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x65giwj82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x65giwj82(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24914); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24915);Duration test = new Duration(246L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24916);Duration result = test.dividedBy(2L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24917);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testNegated_long2250() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mnyibj86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mnyibj86(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24918); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24919);Duration test = new Duration(-246L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24920);Duration result = test.negated(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24921);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testNegated_long3251() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h0nhpj8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h0nhpj8a(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24922); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24923);Duration test = new Duration(Long.MIN_VALUE); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24924);try { 
         __CLR4_4_1j4cj4cle6rjccr.R.inc(24925);test.negated(); 
         __CLR4_4_1j4cj4cle6rjccr.R.inc(24926);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToString413() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lafnjj8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lafnjj8f(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24927); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24928);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24929);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24930);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24931);assertEquals("PT0S", new Duration(0L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24932);assertEquals("PT10S", new Duration(10000L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24933);assertEquals("PT1S", new Duration(1000L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24934);assertEquals("PT12.345S", new Duration(12345L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24935);assertEquals("PT-12.345S", new Duration(-12345L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24936);assertEquals("PT-1.123S", new Duration(-1123L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24937);assertEquals("PT-0.123S", new Duration(-123L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24938);assertEquals("PT-0.012S", new Duration(-12L).toString()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24939);assertEquals("PT-0.001S", new Duration(-1L).toString()); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriod_PeriodType682() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qorvvj8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qorvvj8s(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24940); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24941);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24942);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24943);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24944);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24945);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriodFrom683() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9o0qoj8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9o0qoj8y(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24946); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24947);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24948);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24949);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24950);Period result = test.toPeriodFrom(dt); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24951);assertEquals(new Period(dt, test), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriodTo684() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp2v68j94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp2v68j94(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24952); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24953);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24954);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24955);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24956);Period result = test.toPeriodTo(dt); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24957);assertEquals(new Period(test, dt), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToPeriodTo_PeriodType685() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jybt5j9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jybt5j9a(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24958); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24959);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24960);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24961);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24962);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24963);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToIntervalTo686() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owzq9ej9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owzq9ej9g(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24964); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24965);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24966);Duration test = new Duration(length); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24967);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24968);Interval result = test.toIntervalTo(dt); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24969);assertEquals(new Interval(test, dt), result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testToDuration21386() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh9a2gj9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration21386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh9a2gj9m(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24970); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24971);MockDuration test = new MockDuration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24972);Duration result = test.toDuration(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24973);assertNotSame(test, result); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24974);assertEquals(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testIsAfter1387() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9fxi0j9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter1387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9fxi0j9r(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24975); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24976);Duration test1 = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24977);Duration test1a = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24978);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24979);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24980);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24981);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24982);Duration test2 = new Duration(321L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24983);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24984);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24985);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24986);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24987);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24988);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testSerialization1388() throws Exception {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),24989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aqw7tja5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization1388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aqw7tja5() throws Exception{try{__CLR4_4_1j4cj4cle6rjccr.R.inc(24989); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24990);Duration test = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24991);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24992);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24993);oos.writeObject(test); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24994);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24995);oos.close(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24996);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24997);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24998);Duration result = (Duration) ois.readObject(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(24999);ois.close(); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25000);assertEquals(test, result); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 


public void testEqualsHashCode1389() {__CLR4_4_1j4cj4cle6rjccr.R.globalSliceStart(getClass().getName(),25001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131f7smjah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j4cj4cle6rjccr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j4cj4cle6rjccr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode1389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131f7smjah(){try{__CLR4_4_1j4cj4cle6rjccr.R.inc(25001); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25002);Duration test1 = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25003);Duration test2 = new Duration(123L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25004);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25005);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25006);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25007);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25008);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25009);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25010);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25011);Duration test3 = new Duration(321L); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25012);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25013);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25014);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25015);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25016);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25017);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25018);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1j4cj4cle6rjccr.R.inc(25019);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1j4cj4cle6rjccr.R.inc(25021);try{__CLR4_4_1j4cj4cle6rjccr.R.inc(25020);
            __CLR4_4_1j4cj4cle6rjccr.R.inc(25022);iValue = value;
        }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(25023);
            __CLR4_4_1j4cj4cle6rjccr.R.inc(25024);return iValue;
        }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}
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
            super(duration);__CLR4_4_1j4cj4cle6rjccr.R.inc(25026);try{__CLR4_4_1j4cj4cle6rjccr.R.inc(25025);
        }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1j4cj4cle6rjccr.R.inc(25027);
            __CLR4_4_1j4cj4cle6rjccr.R.inc(25028);super.setMillis(duration);
        }finally{__CLR4_4_1j4cj4cle6rjccr.R.flushNeeded();}}
    }

}
