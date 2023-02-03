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
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a JUnit test for ReadableIntervalConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableIntervalConverter extends TestCase {static class __CLR4_4_1t5jt5jlc8axew9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,37822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37783);
        __CLR4_4_1t5jt5jlc8axew9.R.inc(37784);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37785);
        __CLR4_4_1t5jt5jlc8axew9.R.inc(37786);return new TestSuite(TestReadableIntervalConverter.class);
    }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}}

    public TestReadableIntervalConverter(String name) {
        super(name);__CLR4_4_1t5jt5jlc8axew9.R.inc(37788);try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37787);
    }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37789);
        __CLR4_4_1t5jt5jlc8axew9.R.inc(37790);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1t5jt5jlc8axew9.R.inc(37791);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology374() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170ihbht5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testIsReadableInterval_Object_Chronology374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170ihbht5s() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37792); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37793);Interval i = new Interval(1234L, 5678L); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37794);assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null)); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 


public void testSetIntoPeriod_Object1648() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aq4k5ft5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object1648",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aq4k5ft5v() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37795); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37796);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37797);MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37798);ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37799);assertEquals(0, m.getYears()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37800);assertEquals(0, m.getMonths()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37801);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37802);assertEquals(0, m.getDays()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37803);assertEquals(0, m.getHours()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37804);assertEquals(0, m.getMinutes()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37805);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37806);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 


public void testSetIntoInterval_Object1881() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i2c4wt67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object1881",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i2c4wt67() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37807); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37808);Interval i = new Interval(0L, 123L, CopticChronology.getInstance()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37809);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37810);ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37811);assertEquals(0L, m.getStartMillis()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37812);assertEquals(123L, m.getEndMillis()); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37813);assertEquals(CopticChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 


public void testGetPeriodType_Object1020() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18f8nxt6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetPeriodType_Object1020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18f8nxt6e() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37814); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37815);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37816);assertEquals(PeriodType.standard(), ReadableIntervalConverter.INSTANCE.getPeriodType(i)); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 


public void testSupportedType1240() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cbddcqt6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSupportedType1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cbddcqt6h() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37817); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37818);assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType()); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 


public void testGetDurationMillis_Object1371() throws Exception {__CLR4_4_1t5jt5jlc8axew9.R.globalSliceStart(getClass().getName(),37819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad01odt6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5jt5jlc8axew9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5jt5jlc8axew9.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetDurationMillis_Object1371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad01odt6j() throws Exception{try{__CLR4_4_1t5jt5jlc8axew9.R.inc(37819); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37820);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1t5jt5jlc8axew9.R.inc(37821);assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i)); 
 }finally{__CLR4_4_1t5jt5jlc8axew9.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
