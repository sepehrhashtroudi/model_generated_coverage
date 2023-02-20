/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1jypjyple6qe9k6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,26007,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25873);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25874);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25875);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25876);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1jypjyple6qe9k6.R.inc(25878);try{__CLR4_4_1jypjyple6qe9k6.R.inc(25877);
    }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25879);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25880);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25881);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jypjyple6qe9k6.R.inc(25882);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jypjyple6qe9k6.R.inc(25883);originalLocale = Locale.getDefault();
        __CLR4_4_1jypjyple6qe9k6.R.inc(25884);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25885);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1jypjyple6qe9k6.R.inc(25886);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25887);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25888);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jypjyple6qe9k6.R.inc(25889);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25890);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25891);Locale.setDefault(originalLocale);
        __CLR4_4_1jypjyple6qe9k6.R.inc(25892);originalDateTimeZone = null;
        __CLR4_4_1jypjyple6qe9k6.R.inc(25893);originalTimeZone = null;
        __CLR4_4_1jypjyple6qe9k6.R.inc(25894);originalLocale = null;
    }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParse_noFormatter319() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13naqkpjzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_noFormatter319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13naqkpjzb() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25895); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25896);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25897);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25898);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25899);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25900);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_long_long2320() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdeljijzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long2320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdeljijzh() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25901); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25902);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25903);Interval test = new Interval(dt1.getMillis(), dt1.getMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25904);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25905);assertEquals(dt1.getMillis(), test.getEndMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25906);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_long_long_nullZone321() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gscbjjjzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullZone321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gscbjjjzn() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25907); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25908);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25909);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25910);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25911);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25912);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25913);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_RI_RD4324() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kfbki3jzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD4324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kfbki3jzu() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25914); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25915);long result = TEST_TIME_NOW; 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25916);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25917);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25918);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25919);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25920);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25921);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_RD_RI3325() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uh0s0nk02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI3325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uh0s0nk02() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25922); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25923);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25924);Interval test = new Interval((ReadableDuration) null, dt); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25925);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25926);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_RI_RP7326() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18w5uyk07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP7326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18w5uyk07() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25927); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25928);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25929);long result = TEST_TIME_NOW; 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25930);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25931);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25932);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25933);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25934);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_Object4327() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0f2bjk0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object4327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0f2bjk0f() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25935); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25936);MockInterval base = new MockInterval(); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25937);Interval test = new Interval(base); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25938);assertEquals(base.getStartMillis(), test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25939);assertEquals(base.getEndMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_RI_RI3796() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kr8f0wk0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI3796",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kr8f0wk0k() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25940); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25941);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25942);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25943);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_RP_RI8799() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11co1rtk0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI8799",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11co1rtk0o() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25944); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25945);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25946);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25947);try { 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25948);new Interval(dur, dt); 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25949);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 


public void testConstructor_Object6802() throws Throwable {__CLR4_4_1jypjyple6qe9k6.R.globalSliceStart(getClass().getName(),25950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmwta7k0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jypjyple6qe9k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jypjyple6qe9k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object6802",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmwta7k0u() throws Throwable{try{__CLR4_4_1jypjyple6qe9k6.R.inc(25950); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25951);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L)); 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25952);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25953); 
             __CLR4_4_1jypjyple6qe9k6.R.inc(25954);return false; 
         }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25955); 
             __CLR4_4_1jypjyple6qe9k6.R.inc(25956);interval.setChronology(chrono); 
             __CLR4_4_1jypjyple6qe9k6.R.inc(25957);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25958); 
             __CLR4_4_1jypjyple6qe9k6.R.inc(25959);return ReadableInterval.class; 
         }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 
     }; 
     __CLR4_4_1jypjyple6qe9k6.R.inc(25960);try { 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25961);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25962);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25963);Interval test = new Interval(base); 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25964);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25965);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1jypjyple6qe9k6.R.inc(25966);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25967);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25968);return ISOChronology.getInstance();
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25969);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25970);return 1234L;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25971);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25972);return new DateTime(1234L);
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25973);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25974);return 5678L;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25975);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25976);return new DateTime(5678L);
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25977);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25978);return (5678L - 1234L);
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25979);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25980);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25981);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25982);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25983);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25984);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25985);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25986);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25987);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25988);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25989);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25990);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25991);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25992);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25993);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25994);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25995);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25996);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25997);
            __CLR4_4_1jypjyple6qe9k6.R.inc(25998);return false;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(25999);
            __CLR4_4_1jypjyple6qe9k6.R.inc(26000);return null;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(26001);
            __CLR4_4_1jypjyple6qe9k6.R.inc(26002);return null;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1jypjyple6qe9k6.R.inc(26003);
            __CLR4_4_1jypjyple6qe9k6.R.inc(26004);return null;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1jypjyple6qe9k6.R.inc(26005);
            __CLR4_4_1jypjyple6qe9k6.R.inc(26006);return null;
        }finally{__CLR4_4_1jypjyple6qe9k6.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
