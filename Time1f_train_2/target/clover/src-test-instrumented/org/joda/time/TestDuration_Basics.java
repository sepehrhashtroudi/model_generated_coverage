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
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1j1hj1hle6qseu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24994,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24677);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24678);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24679);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24680);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1j1hj1hle6qseu6.R.inc(24682);try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24681);
    }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24683);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24684);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24685);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24686);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24687);originalLocale = Locale.getDefault();
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24688);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24689);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24690);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24691);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24692);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24693);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24694);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24695);Locale.setDefault(originalLocale);
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24696);originalDateTimeZone = null;
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24697);originalTimeZone = null;
        __CLR4_4_1j1hj1hle6qseu6.R.inc(24698);originalLocale = null;
    }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToStandardHours207() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ff9l1j23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ff9l1j23(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24699); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24700);Duration test = new Duration(0L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24701);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24702);test = new Duration(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24703);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24704);test = new Duration(3600000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24705);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24706);test = new Duration(3600000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24707);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24708);test = new Duration(3600000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24709);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24710);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24711);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24712);test = new Duration(2 * 3600000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24713);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24714);test = new Duration(-1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24715);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24716);test = new Duration(-3600000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24717);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24718);test = new Duration(-3600000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24719);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToStandardDays211() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jm7pgoj2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jm7pgoj2o(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24720); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24721);Duration test = new Duration(0L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24722);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24723);test = new Duration(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24724);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24725);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24726);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24727);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24728);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24729);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24730);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24731);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24732);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24733);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24734);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24735);test = new Duration(-1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24736);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24737);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24738);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24739);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24740);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToStandardMinutes212() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6wclj39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6wclj39(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24741); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24742);Duration test = new Duration(0L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24743);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24744);test = new Duration(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24745);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24746);test = new Duration(60000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24747);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24748);test = new Duration(60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24749);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24750);test = new Duration(60000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24751);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24752);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24753);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24754);test = new Duration(2 * 60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24755);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24756);test = new Duration(-1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24757);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24758);test = new Duration(-60000L + 1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24759);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24760);test = new Duration(-60000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24761);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToStandardSeconds213() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135c96uj3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135c96uj3u(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24762); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24763);Duration test = new Duration(0L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24764);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24765);test = new Duration(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24766);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24767);test = new Duration(999L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24768);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24769);test = new Duration(1000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24770);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24771);test = new Duration(1001L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24772);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24773);test = new Duration(1999L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24774);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24775);test = new Duration(2000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24776);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24777);test = new Duration(-1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24778);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24779);test = new Duration(-999L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24780);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24781);test = new Duration(-1000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24782);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testWithMillis1214() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrp621j4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrp621j4f(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24783); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24784);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24785);Duration result = test.withMillis(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24786);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testWithMillis2215() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5q9x3j4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis2215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5q9x3j4j(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24787); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24788);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24789);Duration result = test.withMillis(1234567890L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24790);assertEquals(1234567890L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testMinus_long1216() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxhq4qj4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxhq4qj4n(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24791); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24792);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24793);Duration result = test.minus(8000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24794);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int3217() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z0ye1j4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z0ye1j4r(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24795); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24796);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24797);Duration result = test.withDurationAdded(new Duration(8000L), -1); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24798);assertEquals((123L - 8000L), result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int5218() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxe7lkj4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxe7lkj4v(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24799); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24800);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24801);Duration result = test.withDurationAdded(new Duration(8000L), 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24802);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testPlus_long1219() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbwtpbj4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbwtpbj4z(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24803); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24804);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24805);Duration result = test.plus(8000L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24806);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testPlus_RD3220() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pbfdjj53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pbfdjj53(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24807); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24808);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24809);Duration result = test.plus(null); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24810);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testMinus_RD3221() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vre0j57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD3221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vre0j57(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24811); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24812);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24813);Duration result = test.minus(null); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24814);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testMinus_RD1222() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16j930lj5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16j930lj5b(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24815); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24816);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24817);Duration result = test.minus(new Duration(8000L)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24818);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testMultipliedBy_long2223() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cuiww7j5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cuiww7j5f(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24819); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24820);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24821);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24822);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testDividedBy_long2224() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz2edoj5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz2edoj5j(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24823); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24824);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24825);Duration result = test.dividedBy(1L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24826);assertSame(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testDividedBy_long1225() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykr2sqj5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykr2sqj5n(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24827); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24828);Duration test = new Duration(246L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24829);Duration result = test.dividedBy(2L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24830);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testNegated_long2226() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1394teyj5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1394teyj5r(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24831); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24832);Duration test = new Duration(-246L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24833);Duration result = test.negated(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24834);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testNegated_long3227() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ujsl2j5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ujsl2j5v(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24835); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24836);Duration test = new Duration(Long.MIN_VALUE); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24837);try { 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24838);test.negated(); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24839);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testMutableDuration654() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112ui4j60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112ui4j60(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24840); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24841);MockMutableDuration test = new MockMutableDuration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24842);assertEquals(123L, test.getMillis()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24843);test.setMillis(2345L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24844);assertEquals(2345L, test.getMillis()); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToPeriod_PeriodType655() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mrze7j65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mrze7j65(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24845); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24846);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24847);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24848);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24849);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24850);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToPeriodFrom656() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdz9yej6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdz9yej6b(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24851); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24852);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24853);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24854);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24855);Period result = test.toPeriodFrom(dt); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24856);assertEquals(new Period(dt, test), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToPeriodTo657() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibm3w6j6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibm3w6j6h(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24857); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24858);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24859);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24860);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24861);Period result = test.toPeriodTo(dt); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24862);assertEquals(new Period(test, dt), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToPeriodTo_PeriodType658() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tifgxj6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType658",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tifgxj6n(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24863); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24864);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24865);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24866);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24867);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24868);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToIntervalFrom659() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ps0p39j6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ps0p39j6t(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24869); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24870);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24871);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24872);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24873);Interval result = test.toIntervalFrom(dt); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24874);assertEquals(new Interval(dt, test), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToIntervalTo660() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtla46j6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtla46j6z(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24875); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24876);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24877);Duration test = new Duration(length); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24878);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24879);Interval result = test.toIntervalTo(dt); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24880);assertEquals(new Interval(test, dt), result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testToPeriod754() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otkr3lj75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otkr3lj75(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24881); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24882);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24883);try { 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24884);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24885);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24886);Duration dur = new Duration(length); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24887);Period test = dur.toPeriod(); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24888);assertEquals(0, test.getYears()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24889);assertEquals(0, test.getMonths()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24890);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24891);assertEquals(0, test.getDays()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24892);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24893);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24894);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24895);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24896);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testCompareTo1377() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcocbtj7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo1377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcocbtj7l(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24897); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24898);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24899);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24900);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24901);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24902);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24903);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24904);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24905);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24906);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24907);assertEquals(+1, test2.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24908);assertEquals(0, test1.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24909);try { 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24910);test1.compareTo(null); 
         __CLR4_4_1j1hj1hle6qseu6.R.inc(24911);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testIsEqual1378() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwbp7ij80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual1378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwbp7ij80(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24912); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24913);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24914);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24915);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24916);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24917);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24918);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24919);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24920);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24921);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24922);assertEquals(false, test2.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24923);assertEquals(true, test1.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24924);assertEquals(false, test1.isEqual(null)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24925);assertEquals(true, new Duration(0L).isEqual(null)); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testIsAfter1379() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjt5ijj8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter1379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjt5ijj8e(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24926); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24927);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24928);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24929);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24930);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24931);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24932);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24933);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24934);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24935);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24936);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24937);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24938);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24939);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testIsBefore1380() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5wthgj8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore1380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5wthgj8s(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24940); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24941);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24942);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24943);assertEquals(false, test1.isShorterThan(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24944);assertEquals(false, test1a.isShorterThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24945);assertEquals(false, test1.isShorterThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24946);assertEquals(false, test1a.isShorterThan(test1a)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24947);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24948);assertEquals(true, test1.isShorterThan(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24949);assertEquals(false, test2.isShorterThan(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24950);assertEquals(false, test2.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24951);assertEquals(false, test1.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24952);assertEquals(false, test1.isShorterThan(null)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24953);assertEquals(false, new Duration(0L).isShorterThan(null)); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testSerialization1381() throws Exception {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p1qnr4j96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization1381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p1qnr4j96() throws Exception{try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24954); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24955);Duration test = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24956);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24957);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24958);oos.writeObject(test); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24959);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24960);oos.close(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24961);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24962);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24963);Duration result = (Duration) ois.readObject(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24964);ois.close(); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24965);assertEquals(test, result); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 


public void testEqualsHashCode1382() {__CLR4_4_1j1hj1hle6qseu6.R.globalSliceStart(getClass().getName(),24966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpkjqpj9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1hj1hle6qseu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1hj1hle6qseu6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode1382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpkjqpj9i(){try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24966); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24967);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24968);Duration test2 = new Duration(123L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24969);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24970);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24971);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24972);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24973);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24974);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24975);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24976);Duration test3 = new Duration(321L); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24977);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24978);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24979);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24980);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24981);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24982);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24983);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1j1hj1hle6qseu6.R.inc(24984);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1j1hj1hle6qseu6.R.inc(24986);try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24985);
            __CLR4_4_1j1hj1hle6qseu6.R.inc(24987);iValue = value;
        }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24988);
            __CLR4_4_1j1hj1hle6qseu6.R.inc(24989);return iValue;
        }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}
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
            super(duration);__CLR4_4_1j1hj1hle6qseu6.R.inc(24991);try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24990);
        }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1j1hj1hle6qseu6.R.inc(24992);
            __CLR4_4_1j1hj1hle6qseu6.R.inc(24993);super.setMillis(duration);
        }finally{__CLR4_4_1j1hj1hle6qseu6.R.flushNeeded();}}
    }

}
