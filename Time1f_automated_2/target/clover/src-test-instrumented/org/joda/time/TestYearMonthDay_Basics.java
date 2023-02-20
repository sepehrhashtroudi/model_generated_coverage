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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1jybjyble6nl8ht{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25859);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25860);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25861);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25862);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1jybjyble6nl8ht.R.inc(25864);try{__CLR4_4_1jybjyble6nl8ht.R.inc(25863);
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25865);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25866);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25867);zone = DateTimeZone.getDefault();
        __CLR4_4_1jybjyble6nl8ht.R.inc(25868);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25869);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25870);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jybjyble6nl8ht.R.inc(25871);DateTimeZone.setDefault(zone);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25872);zone = null;
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithChronologyRetainFields_sameChrono19() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwuc95jyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwuc95jyp(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25873); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25874);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25875);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25876);assertSame(base, test); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testMinus_RP20() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6a01ojyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6a01ojyt(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25877); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25878);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25879);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25880);YearMonthDay expected = new YearMonthDay(2001, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25881);assertEquals(expected, result); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25882);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25883);assertSame(test, result); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testPlusYears_int21() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx7ny8jz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx7ny8jz0(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25884); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25885);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25886);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25887);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25888);assertEquals(expected, result); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25889);result = test.plusYears(0); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25890);assertSame(test, result); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testPlusMonths_int22() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s374l2jz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s374l2jz7(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25891); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25892);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25893);YearMonthDay result = test.plusMonths(1); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25894);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25895);assertEquals(expected, result); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25896);result = test.plusMonths(0); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25897);assertSame(test, result); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testMinusDays_int23() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rl011vjze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rl011vjze(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25898); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25899);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25900);YearMonthDay result = test.minusDays(1); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25901);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25902);assertEquals(expected, result); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25903);result = test.minusDays(0); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25904);assertSame(test, result); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToLocalDate24() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chfnajjzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chfnajjzl(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25905); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25906);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25907);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25908);assertEquals(new LocalDate(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToDateTime_nullTime27() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp2zljjzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullTime27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp2zljjzp(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25909); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25910);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25911);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25912);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25913);DateTime test = base.toDateTime((TimeOfDay) null); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25914);check(base, 2005, 6, 9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25915);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25916);expected = expected.year().setCopy(2005); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25917);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25918);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25919);assertEquals(expected, test); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToDateTime_DateTimeZone28() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tte0p7k00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_DateTimeZone28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tte0p7k00(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25920); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25921);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25922);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25923);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25924);check(base, 2005, 6, 9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25925);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25926);assertEquals(expected, test); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToString31() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7xz2bk07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7xz2bk07(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25927); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25928);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25929);assertEquals("2002-06-09", test.toString()); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToString_String_Locale471() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt99nyk0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt99nyk0a(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25930); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25931);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25932);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25933);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25934);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25935);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25936);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
public void testToString_String_Locale624() {__CLR4_4_1jybjyble6nl8ht.R.globalSliceStart(getClass().getName(),25937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrhdjsk0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jybjyble6nl8ht.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jybjyble6nl8ht.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrhdjsk0h(){try{__CLR4_4_1jybjyble6nl8ht.R.inc(25937); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25938);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25939);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25940);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25941);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1jybjyble6nl8ht.R.inc(25942);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25943);
            __CLR4_4_1jybjyble6nl8ht.R.inc(25944);return COPTIC_UTC;
        }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25945);
            __CLR4_4_1jybjyble6nl8ht.R.inc(25946);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25947);
            __CLR4_4_1jybjyble6nl8ht.R.inc(25948);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1jybjyble6nl8ht.R.inc(25949);
        __CLR4_4_1jybjyble6nl8ht.R.inc(25950);assertEquals(hour, test.getYear());
        __CLR4_4_1jybjyble6nl8ht.R.inc(25951);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1jybjyble6nl8ht.R.inc(25952);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1jybjyble6nl8ht.R.flushNeeded();}}
}
