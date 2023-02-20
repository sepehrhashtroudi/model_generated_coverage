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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1j3wj3wle6np4jl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24764);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24765);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24766);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24767);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1j3wj3wle6np4jl.R.inc(24769);try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24768);
    }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24770);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24771);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24772);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24773);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24774);originalLocale = Locale.getDefault();
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24775);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24776);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24777);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24778);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24779);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24780);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24781);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24782);Locale.setDefault(originalLocale);
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24783);originalDateTimeZone = null;
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24784);originalTimeZone = null;
        __CLR4_4_1j3wj3wle6np4jl.R.inc(24785);originalLocale = null;
    }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RP6334() throws Throwable {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4a5w4j4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP6334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4a5w4j4i() throws Throwable{try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24786); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24787);long result = TEST_TIME_NOW; 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24788);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24789);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24790);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24791);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24792);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24793);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testConstructor_RI_RP6335() throws Throwable {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lda4olj4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP6335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lda4olj4q() throws Throwable{try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24794); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24795);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24796);Interval test = new Interval(dt, (ReadablePeriod) null); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24797);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24798);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testConstructor_Object_Chronology1336() throws Throwable {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxe92lj4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxe92lj4v() throws Throwable{try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24799); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24800);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24801);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24802);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24803);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24804);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24805);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24806);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testConstructor_RI_RP7610() throws Throwable {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5t48kj53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP7610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5t48kj53() throws Throwable{try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24807); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24808);long result = TEST_TIME_NOW; 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24809);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24810);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24811);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24812);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24813);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24814);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24815);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testSetInterval_RI_RI3611() {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vqw0xj5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testSetInterval_RI_RI3611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vqw0xj5c(){try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24816); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24817);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24818);test.setInterval(null, new Instant(TEST_TIME2 + 1)); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24819);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24820);assertEquals(TEST_TIME2 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testSetChronology_Chronology1612() {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrm2zoj5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testSetChronology_Chronology1612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrm2zoj5h(){try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24821); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24822);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24823);test.setChronology(ISOChronology.getInstance()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24824);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24825);assertEquals(TEST_TIME2, test.getEndMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24826);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
public void testSetChronology_RI3613() {__CLR4_4_1j3wj3wle6np4jl.R.globalSliceStart(getClass().getName(),24827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euxlp6j5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3wj3wle6np4jl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3wj3wle6np4jl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testSetChronology_RI3613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euxlp6j5n(){try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24827); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24828);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24829);test.setChronology(null); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24830);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1j3wj3wle6np4jl.R.inc(24831);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
    

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
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24832);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24833);return ISOChronology.getInstance();
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24834);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24835);return 1234L;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24836);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24837);return new DateTime(1234L);
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24838);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24839);return 5678L;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24840);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24841);return new DateTime(5678L);
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24842);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24843);return (5678L - 1234L);
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24844);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24845);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24846);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24847);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24848);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24849);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24850);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24851);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24852);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24853);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24854);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24855);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24856);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24857);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24858);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24859);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24860);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24861);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24862);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24863);return false;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24864);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24865);return null;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24866);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24867);return null;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24868);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24869);return null;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1j3wj3wle6np4jl.R.inc(24870);
            __CLR4_4_1j3wj3wle6np4jl.R.inc(24871);return null;
        }finally{__CLR4_4_1j3wj3wle6np4jl.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
