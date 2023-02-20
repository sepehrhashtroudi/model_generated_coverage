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
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1j20j20le6qe9go{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,25016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j20j20le6qe9go.R.inc(24696);
        __CLR4_4_1j20j20le6qe9go.R.inc(24697);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j20j20le6qe9go.R.inc(24698);
        __CLR4_4_1j20j20le6qe9go.R.inc(24699);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1j20j20le6qe9go.R.inc(24701);try{__CLR4_4_1j20j20le6qe9go.R.inc(24700);
    }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j20j20le6qe9go.R.inc(24702);
        __CLR4_4_1j20j20le6qe9go.R.inc(24703);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j20j20le6qe9go.R.inc(24704);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j20j20le6qe9go.R.inc(24705);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j20j20le6qe9go.R.inc(24706);originalLocale = Locale.getDefault();
        __CLR4_4_1j20j20le6qe9go.R.inc(24707);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j20j20le6qe9go.R.inc(24708);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j20j20le6qe9go.R.inc(24709);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j20j20le6qe9go.R.inc(24710);
        __CLR4_4_1j20j20le6qe9go.R.inc(24711);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j20j20le6qe9go.R.inc(24712);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j20j20le6qe9go.R.inc(24713);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j20j20le6qe9go.R.inc(24714);Locale.setDefault(originalLocale);
        __CLR4_4_1j20j20le6qe9go.R.inc(24715);originalDateTimeZone = null;
        __CLR4_4_1j20j20le6qe9go.R.inc(24716);originalTimeZone = null;
        __CLR4_4_1j20j20le6qe9go.R.inc(24717);originalLocale = null;
    }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriodFrom_PeriodType80() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ill7pdj2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ill7pdj2m(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24718); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24719);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24720);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24721);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24722);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24723);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriod_Chronology84() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o06ys4j2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o06ys4j2s(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24724); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24725);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24726);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24727);Period result = test.toPeriod(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24728);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24729);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriod_PeriodType_Chronology85() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7qv9rj2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7qv9rj2y(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24730); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24731);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24732);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24733);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24734);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24735);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToStandardHours233() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p1iwkj34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p1iwkj34(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24736); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24737);Duration test = new Duration(0L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24738);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24739);test = new Duration(1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24740);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24741);test = new Duration(3600000L - 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24742);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24743);test = new Duration(3600000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24744);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24745);test = new Duration(3600000L + 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24746);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24747);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24748);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24749);test = new Duration(2 * 3600000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24750);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24751);test = new Duration(-1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24752);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24753);test = new Duration(-3600000L + 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24754);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24755);test = new Duration(-3600000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24756);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToStandardMinutes235() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11e7g62j3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11e7g62j3p(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24757); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24758);Duration test = new Duration(0L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24759);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24760);test = new Duration(1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24761);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24762);test = new Duration(60000L - 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24763);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24764);test = new Duration(60000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24765);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24766);test = new Duration(60000L + 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24767);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24768);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24769);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24770);test = new Duration(2 * 60000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24771);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24772);test = new Duration(-1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24773);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24774);test = new Duration(-60000L + 1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24775);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24776);test = new Duration(-60000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24777);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToStandardSeconds236() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11axwo7j4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11axwo7j4a(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24778); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24779);Duration test = new Duration(0L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24780);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24781);test = new Duration(1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24782);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24783);test = new Duration(999L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24784);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24785);test = new Duration(1000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24786);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24787);test = new Duration(1001L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24788);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24789);test = new Duration(1999L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24790);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24791);test = new Duration(2000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24792);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24793);test = new Duration(-1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24794);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24795);test = new Duration(-999L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24796);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24797);test = new Duration(-1000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24798);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToDuration1237() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlyi4zj4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlyi4zj4v(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24799); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24800);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24801);Duration result = test.toDuration(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24802);assertSame(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMinus_long1238() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu3etmj4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu3etmj4z(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24803); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24804);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24805);Duration result = test.minus(8000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24806);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMinus_RD2239() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8ttpcj53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8ttpcj53(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24807); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24808);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24809);Duration result = test.minus(new Duration(0L)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24810);assertSame(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int3240() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12chui7j57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12chui7j57(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24811); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24812);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24813);Duration result = test.withDurationAdded(new Duration(8000L), -1); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24814);assertEquals((123L - 8000L), result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testPlus_long1241() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogdr10j5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogdr10j5b(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24815); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24816);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24817);Duration result = test.plus(8000L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24818);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testPlus_RD3242() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16spqonj5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16spqonj5f(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24819); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24820);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24821);Duration result = test.plus(null); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24822);assertSame(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testPlus_RD1243() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d932b8j5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d932b8j5j(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24823); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24824);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24825);Duration result = test.plus(new Duration(8000L)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24826);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMinus_RD1244() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmnebpj5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmnebpj5n(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24827); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24828);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24829);Duration result = test.minus(new Duration(8000L)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24830);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMultipliedBy_long1245() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12wfydkj5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12wfydkj5r(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24831); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24832);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24833);Duration result = test.multipliedBy(2L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24834);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMultipliedBy_long2246() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b04kdkj5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b04kdkj5v(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24835); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24836);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24837);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24838);assertSame(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testDividedBy_long2247() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytgqwbj5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytgqwbj5z(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24839); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24840);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24841);Duration result = test.dividedBy(1L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24842);assertSame(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testDividedBy_long1248() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylymnrj63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylymnrj63(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24843); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24844);Duration test = new Duration(246L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24845);Duration result = test.dividedBy(2L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24846);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testNegated_long2249() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153j5xlj67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153j5xlj67(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24847); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24848);Duration test = new Duration(-246L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24849);Duration result = test.negated(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24850);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testNegated_long3250() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180op8j6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180op8j6b(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24851); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24852);Duration test = new Duration(Long.MIN_VALUE); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24853);try { 
         __CLR4_4_1j20j20le6qe9go.R.inc(24854);test.negated(); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24855);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToString405() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmkjb2j6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmkjb2j6g(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24856); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24857);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24858);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24859);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24860);assertEquals("PT0S", new Duration(0L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24861);assertEquals("PT10S", new Duration(10000L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24862);assertEquals("PT1S", new Duration(1000L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24863);assertEquals("PT12.345S", new Duration(12345L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24864);assertEquals("PT-12.345S", new Duration(-12345L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24865);assertEquals("PT-1.123S", new Duration(-1123L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24866);assertEquals("PT-0.123S", new Duration(-123L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24867);assertEquals("PT-0.012S", new Duration(-12L).toString()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24868);assertEquals("PT-0.001S", new Duration(-1L).toString()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testMutableDuration667() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlc3kaj6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlc3kaj6t(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24869); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24870);MockMutableDuration test = new MockMutableDuration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24871);assertEquals(123L, test.getMillis()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24872);test.setMillis(2345L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24873);assertEquals(2345L, test.getMillis()); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriod_PeriodType668() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu2tirj6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu2tirj6y(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24874); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24875);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24876);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24877);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24878);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24879);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriodFrom669() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tq0w8j74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tq0w8j74(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24880); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24881);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24882);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24883);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24884);Period result = test.toPeriodFrom(dt); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24885);assertEquals(new Period(dt, test), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriodTo_PeriodType670() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm7nadj7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType670",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm7nadj7a(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24886); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24887);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24888);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24889);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24890);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24891);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToIntervalFrom671() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btda4lj7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btda4lj7g(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24892); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24893);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j20j20le6qe9go.R.inc(24894);Duration test = new Duration(length); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24895);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24896);Interval result = test.toIntervalFrom(dt); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24897);assertEquals(new Interval(dt, test), result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToPeriod767() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ena1tdj7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod767",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ena1tdj7m(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24898); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24899);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24900);try { 
         __CLR4_4_1j20j20le6qe9go.R.inc(24901);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24902);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1j20j20le6qe9go.R.inc(24903);Duration dur = new Duration(length); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24904);Period test = dur.toPeriod(); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24905);assertEquals(0, test.getYears()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24906);assertEquals(0, test.getMonths()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24907);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24908);assertEquals(0, test.getDays()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24909);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24910);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24911);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24912);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1j20j20le6qe9go.R.inc(24913);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testToDuration21389() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x896fvj82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration21389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x896fvj82(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24914); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24915);MockDuration test = new MockDuration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24916);Duration result = test.toDuration(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24917);assertNotSame(test, result); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24918);assertEquals(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testCompareTo1390() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ac1p7yj87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo1390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ac1p7yj87(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24919); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24920);Duration test1 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24921);Duration test1a = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24922);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24923);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24924);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24925);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24926);Duration test2 = new Duration(321L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24927);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24928);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24929);assertEquals(+1, test2.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24930);assertEquals(0, test1.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24931);try { 
         __CLR4_4_1j20j20le6qe9go.R.inc(24932);test1.compareTo(null); 
         __CLR4_4_1j20j20le6qe9go.R.inc(24933);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testIsEqual1391() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12secc9j8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual1391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12secc9j8m(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24934); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24935);Duration test1 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24936);Duration test1a = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24937);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24938);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24939);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24940);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24941);Duration test2 = new Duration(321L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24942);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24943);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24944);assertEquals(false, test2.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24945);assertEquals(true, test1.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24946);assertEquals(false, test1.isEqual(null)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24947);assertEquals(true, new Duration(0L).isEqual(null)); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testIsAfter1392() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dskuwuj90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter1392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dskuwuj90(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24948); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24949);Duration test1 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24950);Duration test1a = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24951);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24952);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24953);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24954);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24955);Duration test2 = new Duration(321L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24956);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24957);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24958);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24959);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24960);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24961);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testIsBefore1393() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaxzfij9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore1393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaxzfij9e(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24962); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24963);Duration test1 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24964);Duration test1a = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24965);assertEquals(false, test1.isShorterThan(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24966);assertEquals(false, test1a.isShorterThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24967);assertEquals(false, test1.isShorterThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24968);assertEquals(false, test1a.isShorterThan(test1a)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24969);Duration test2 = new Duration(321L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24970);assertEquals(true, test1.isShorterThan(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24971);assertEquals(false, test2.isShorterThan(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24972);assertEquals(false, test2.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24973);assertEquals(false, test1.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24974);assertEquals(false, test1.isShorterThan(null)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24975);assertEquals(false, new Duration(0L).isShorterThan(null)); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testSerialization1394() throws Exception {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ef455uj9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization1394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ef455uj9s() throws Exception{try{__CLR4_4_1j20j20le6qe9go.R.inc(24976); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24977);Duration test = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24978);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24979);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24980);oos.writeObject(test); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24981);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24982);oos.close(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24983);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24984);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24985);Duration result = (Duration) ois.readObject(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24986);ois.close(); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24987);assertEquals(test, result); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 


public void testEqualsHashCode1395() {__CLR4_4_1j20j20le6qe9go.R.globalSliceStart(getClass().getName(),24988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jra969ja4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j20j20le6qe9go.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j20j20le6qe9go.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode1395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jra969ja4(){try{__CLR4_4_1j20j20le6qe9go.R.inc(24988); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24989);Duration test1 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24990);Duration test2 = new Duration(123L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24991);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24992);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24993);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24994);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24995);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24996);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24997);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24998);Duration test3 = new Duration(321L); 
     __CLR4_4_1j20j20le6qe9go.R.inc(24999);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25000);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25001);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25002);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25003);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25004);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25005);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1j20j20le6qe9go.R.inc(25006);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1j20j20le6qe9go.R.inc(25008);try{__CLR4_4_1j20j20le6qe9go.R.inc(25007);
            __CLR4_4_1j20j20le6qe9go.R.inc(25009);iValue = value;
        }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1j20j20le6qe9go.R.inc(25010);
            __CLR4_4_1j20j20le6qe9go.R.inc(25011);return iValue;
        }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}
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
            super(duration);__CLR4_4_1j20j20le6qe9go.R.inc(25013);try{__CLR4_4_1j20j20le6qe9go.R.inc(25012);
        }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1j20j20le6qe9go.R.inc(25014);
            __CLR4_4_1j20j20le6qe9go.R.inc(25015);super.setMillis(duration);
        }finally{__CLR4_4_1j20j20le6qe9go.R.flushNeeded();}}
    }

}
