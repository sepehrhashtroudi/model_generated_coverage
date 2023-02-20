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
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1j1oj1ole6rcksu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24684);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24685);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24686);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24687);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1j1oj1ole6rcksu.R.inc(24689);try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24688);
    }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24690);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24691);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24692);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24693);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24694);originalLocale = Locale.getDefault();
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24695);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24696);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24697);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24698);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24699);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24700);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24701);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24702);Locale.setDefault(originalLocale);
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24703);originalDateTimeZone = null;
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24704);originalTimeZone = null;
        __CLR4_4_1j1oj1ole6rcksu.R.inc(24705);originalLocale = null;
    }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriodFrom_PeriodType73() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d9sgrj2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType73",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d9sgrj2a(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24706); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24707);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24708);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24709);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24710);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24711);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriod_Chronology76() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nt248fj2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology76",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nt248fj2g(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24712); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24713);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24714);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24715);Period result = test.toPeriod(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24716);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24717);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriod_PeriodType_Chronology77() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzvwb6j2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzvwb6j2m(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24718); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24719);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24720);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24721);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24722);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24723);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToStandardHours234() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14y1hp1j2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14y1hp1j2s(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24724); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24725);Duration test = new Duration(0L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24726);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24727);test = new Duration(1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24728);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24729);test = new Duration(3600000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24730);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24731);test = new Duration(3600000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24732);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24733);test = new Duration(3600000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24734);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24735);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24736);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24737);test = new Duration(2 * 3600000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24738);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24739);test = new Duration(-1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24740);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24741);test = new Duration(-3600000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24742);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24743);test = new Duration(-3600000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24744);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToStandardDays237() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpm5lwj3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpm5lwj3d(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24745); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24746);Duration test = new Duration(0L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24747);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24748);test = new Duration(1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24749);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24750);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24751);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24752);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24753);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24754);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24755);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24756);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24757);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24758);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24759);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24760);test = new Duration(-1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24761);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24762);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24763);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24764);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24765);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToStandardMinutes238() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18csg7dj3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18csg7dj3y(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24766); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24767);Duration test = new Duration(0L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24768);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24769);test = new Duration(1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24770);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24771);test = new Duration(60000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24772);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24773);test = new Duration(60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24774);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24775);test = new Duration(60000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24776);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24777);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24778);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24779);test = new Duration(2 * 60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24780);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24781);test = new Duration(-1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24782);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24783);test = new Duration(-60000L + 1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24784);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24785);test = new Duration(-60000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24786);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToStandardSeconds239() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1xt1mj4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1xt1mj4j(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24787); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24788);Duration test = new Duration(0L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24789);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24790);test = new Duration(1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24791);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24792);test = new Duration(999L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24793);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24794);test = new Duration(1000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24795);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24796);test = new Duration(1001L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24797);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24798);test = new Duration(1999L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24799);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24800);test = new Duration(2000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24801);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24802);test = new Duration(-1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24803);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24804);test = new Duration(-999L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24805);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24806);test = new Duration(-1000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24807);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToDuration1240() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn3d4rj54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn3d4rj54(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24808); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24809);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24810);Duration result = test.toDuration(); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24811);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testWithMillis1241() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvy4n1j58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvy4n1j58(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24812); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24813);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24814);Duration result = test.withMillis(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24815);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testWithMillis2242() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ms9in1j5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis2242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ms9in1j5c(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24816); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24817);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24818);Duration result = test.withMillis(1234567890L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24819);assertEquals(1234567890L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMinus_long1243() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uayhesj5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uayhesj5g(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24820); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24821);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24822);Duration result = test.minus(8000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24823);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMinus_RD2244() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ryr46j5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ryr46j5k(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24824); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24825);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24826);Duration result = test.minus(new Duration(0L)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24827);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int3245() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilhogkj5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilhogkj5o(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24828); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24829);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24830);Duration result = test.withDurationAdded(new Duration(8000L), -1); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24831);assertEquals((123L - 8000L), result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int5246() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjuxo3j5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjuxo3j5s(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24832); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24833);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24834);Duration result = test.withDurationAdded(new Duration(8000L), 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24835);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testPlus_long1247() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2qi7aj5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2qi7aj5w(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24836); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24837);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24838);Duration result = test.plus(8000L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24839);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testPlus_RD3248() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpa227j60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpa227j60(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24840); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24841);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24842);Duration result = test.plus(null); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24843);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testPlus_RD1249() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168wqfmj64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168wqfmj64(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24844); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24845);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24846);Duration result = test.plus(new Duration(8000L)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24847);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMinus_RD3250() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eskxh0j68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD3250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eskxh0j68(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24848); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24849);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24850);Duration result = test.minus(null); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24851);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMultipliedBy_long1251() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmazr7j6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmazr7j6c(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24852); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24853);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24854);Duration result = test.multipliedBy(2L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24855);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMultipliedBy_long2252() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpzlr7j6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpzlr7j6g(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24856); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24857);Duration test = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24858);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24859);assertSame(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testDividedBy_long1253() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1myacq7j6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1myacq7j6k(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24860); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24861);Duration test = new Duration(246L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24862);Duration result = test.dividedBy(2L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24863);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testNegated_long2254() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dbwnlj6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dbwnlj6o(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24864); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24865);Duration test = new Duration(-246L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24866);Duration result = test.negated(); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24867);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testNegated_long3255() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh0inlj6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh0inlj6s(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24868); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24869);Duration test = new Duration(Long.MIN_VALUE); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24870);try { 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24871);test.negated(); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24872);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToString414() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uaeg0j6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uaeg0j6x(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24873); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24874);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24875);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24876);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24877);assertEquals("PT0S", new Duration(0L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24878);assertEquals("PT10S", new Duration(10000L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24879);assertEquals("PT1S", new Duration(1000L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24880);assertEquals("PT12.345S", new Duration(12345L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24881);assertEquals("PT-12.345S", new Duration(-12345L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24882);assertEquals("PT-1.123S", new Duration(-1123L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24883);assertEquals("PT-0.123S", new Duration(-123L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24884);assertEquals("PT-0.012S", new Duration(-12L).toString()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24885);assertEquals("PT-0.001S", new Duration(-1L).toString()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testMutableDuration673() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evh26nj7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration673",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evh26nj7a(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24886); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24887);MockMutableDuration test = new MockMutableDuration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24888);assertEquals(123L, test.getMillis()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24889);test.setMillis(2345L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24890);assertEquals(2345L, test.getMillis()); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriod_PeriodType674() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh672qj7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh672qj7f(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24891); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24892);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24893);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24894);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24895);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24896);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriodTo675() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187xf6j7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187xf6j7l(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24897); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24898);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24899);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24900);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24901);Period result = test.toPeriodTo(dt); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24902);assertEquals(new Period(test, dt), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriodTo_PeriodType676() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwwlxxj7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwwlxxj7r(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24903); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24904);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24905);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24906);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24907);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24908);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToIntervalFrom677() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17omim9j7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17omim9j7x(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24909); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24910);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24911);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24912);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24913);Interval result = test.toIntervalFrom(dt); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24914);assertEquals(new Interval(dt, test), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToIntervalTo678() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mw9cr5j83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mw9cr5j83(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24915); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24916);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24917);Duration test = new Duration(length); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24918);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24919);Interval result = test.toIntervalTo(dt); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24920);assertEquals(new Interval(test, dt), result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToPeriod765() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185a48fj89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod765",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185a48fj89(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24921); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24922);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24923);try { 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24924);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24925);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24926);Duration dur = new Duration(length); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24927);Period test = dur.toPeriod(); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24928);assertEquals(0, test.getYears()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24929);assertEquals(0, test.getMonths()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24930);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24931);assertEquals(0, test.getDays()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24932);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24933);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24934);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24935);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24936);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testToDuration21389() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x896fvj8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration21389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x896fvj8p(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24937); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24938);MockDuration test = new MockDuration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24939);Duration result = test.toDuration(); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24940);assertNotSame(test, result); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24941);assertEquals(test, result); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testCompareTo1390() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ac1p7yj8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo1390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ac1p7yj8u(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24942); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24943);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24944);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24945);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24946);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24947);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24948);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24949);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24950);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24951);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24952);assertEquals(+1, test2.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24953);assertEquals(0, test1.compareTo(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24954);try { 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24955);test1.compareTo(null); 
         __CLR4_4_1j1oj1ole6rcksu.R.inc(24956);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testIsEqual1391() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12secc9j99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual1391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12secc9j99(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24957); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24958);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24959);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24960);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24961);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24962);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24963);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24964);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24965);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24966);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24967);assertEquals(false, test2.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24968);assertEquals(true, test1.isEqual(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24969);assertEquals(false, test1.isEqual(null)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24970);assertEquals(true, new Duration(0L).isEqual(null)); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testIsAfter1392() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dskuwuj9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter1392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dskuwuj9n(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24971); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24972);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24973);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24974);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24975);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24976);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24977);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24978);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24979);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24980);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24981);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24982);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24983);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24984);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testIsBefore1393() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaxzfija1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore1393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaxzfija1(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24985); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24986);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24987);Duration test1a = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24988);assertEquals(false, test1.isShorterThan(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24989);assertEquals(false, test1a.isShorterThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24990);assertEquals(false, test1.isShorterThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24991);assertEquals(false, test1a.isShorterThan(test1a)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24992);Duration test2 = new Duration(321L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24993);assertEquals(true, test1.isShorterThan(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24994);assertEquals(false, test2.isShorterThan(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24995);assertEquals(false, test2.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24996);assertEquals(false, test1.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24997);assertEquals(false, test1.isShorterThan(null)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(24998);assertEquals(false, new Duration(0L).isShorterThan(null)); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 


public void testEqualsHashCode1394() {__CLR4_4_1j1oj1ole6rcksu.R.globalSliceStart(getClass().getName(),24999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1giaadsjaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j1oj1ole6rcksu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j1oj1ole6rcksu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode1394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1giaadsjaf(){try{__CLR4_4_1j1oj1ole6rcksu.R.inc(24999); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25000);Duration test1 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25001);Duration test2 = new Duration(123L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25002);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25003);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25004);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25005);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25006);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25007);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25008);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25009);Duration test3 = new Duration(321L); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25010);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25011);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25012);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25013);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25014);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25015);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25016);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1j1oj1ole6rcksu.R.inc(25017);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1j1oj1ole6rcksu.R.inc(25019);try{__CLR4_4_1j1oj1ole6rcksu.R.inc(25018);
            __CLR4_4_1j1oj1ole6rcksu.R.inc(25020);iValue = value;
        }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(25021);
            __CLR4_4_1j1oj1ole6rcksu.R.inc(25022);return iValue;
        }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}
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
            super(duration);__CLR4_4_1j1oj1ole6rcksu.R.inc(25024);try{__CLR4_4_1j1oj1ole6rcksu.R.inc(25023);
        }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1j1oj1ole6rcksu.R.inc(25025);
            __CLR4_4_1j1oj1ole6rcksu.R.inc(25026);super.setMillis(duration);
        }finally{__CLR4_4_1j1oj1ole6rcksu.R.flushNeeded();}}
    }

}
