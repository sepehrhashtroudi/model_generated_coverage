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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableDurationConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableDurationConverter extends TestCase {static class __CLR4_4_1l7al7ale6o7a9e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27521,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27478);
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27479);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27480);
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27481);return new TestSuite(TestReadableDurationConverter.class);
    }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}

    public TestReadableDurationConverter(String name) {
        super(name);__CLR4_4_1l7al7ale6o7a9e.R.inc(27483);try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27482);
    }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}

    @Override
    protected void setUp() throws Exception {try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27484);
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27485);super.setUp();
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27486);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27487);ISO = ISOChronology.getInstance();
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27488);zone = DateTimeZone.getDefault();
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27489);DateTimeZone.setDefault(PARIS);
    }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27490);
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27491);super.tearDown();
        __CLR4_4_1l7al7ale6o7a9e.R.inc(27492);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetIntoPeriod_Object1351() throws Exception {__CLR4_4_1l7al7ale6o7a9e.R.globalSliceStart(getClass().getName(),27493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nang2l7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7al7ale6o7a9e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7al7ale6o7a9e.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSetIntoPeriod_Object1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nang2l7p() throws Exception{try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27493); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27494);Duration dur = new Duration(123L); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27495);MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27496);ReadableDurationConverter.INSTANCE.setInto(m, dur, null); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27497);assertEquals(0, m.getYears()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27498);assertEquals(0, m.getMonths()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27499);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27500);assertEquals(123L, m.getDays()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27501);assertEquals(0, m.getHours()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27502);assertEquals(0, m.getMinutes()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27503);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27504);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}
public void testSetIntoPeriod_Object1352() throws Exception {__CLR4_4_1l7al7ale6o7a9e.R.globalSliceStart(getClass().getName(),27505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wam8jl81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7al7ale6o7a9e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7al7ale6o7a9e.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSetIntoPeriod_Object1352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wam8jl81() throws Exception{try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27505); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27506);Duration dur = new Duration(123L); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27507);MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27508);ReadableDurationConverter.INSTANCE.setInto(m, dur, null); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27509);assertEquals(0, m.getYears()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27510);assertEquals(0, m.getMonths()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27511);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27512);assertEquals(0, m.getDays()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27513);assertEquals(0, m.getHours()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27514);assertEquals(0, m.getMinutes()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27515);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27516);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}
public void testToString353() {__CLR4_4_1l7al7ale6o7a9e.R.globalSliceStart(getClass().getName(),27517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fgnd9il8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7al7ale6o7a9e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7al7ale6o7a9e.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testToString353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fgnd9il8d(){try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27517); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27518);assertEquals("Converter[org.joda.time.ReadableDuration]", ReadableDurationConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}
public void testSupportedType354() throws Exception {__CLR4_4_1l7al7ale6o7a9e.R.globalSliceStart(getClass().getName(),27519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jydmyrl8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7al7ale6o7a9e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7al7ale6o7a9e.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSupportedType354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jydmyrl8f() throws Exception{try{__CLR4_4_1l7al7ale6o7a9e.R.inc(27519); 
     __CLR4_4_1l7al7ale6o7a9e.R.inc(27520);assertEquals(ReadableDuration.class, ReadableDurationConverter.INSTANCE.getSupportedType()); 
 }finally{__CLR4_4_1l7al7ale6o7a9e.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}
