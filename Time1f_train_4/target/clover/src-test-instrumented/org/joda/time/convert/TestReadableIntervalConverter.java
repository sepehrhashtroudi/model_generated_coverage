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
public class TestReadableIntervalConverter extends TestCase {static class __CLR4_4_1rlyrlyle6rjdi8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,35828,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35782);
        __CLR4_4_1rlyrlyle6rjdi8.R.inc(35783);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35784);
        __CLR4_4_1rlyrlyle6rjdi8.R.inc(35785);return new TestSuite(TestReadableIntervalConverter.class);
    }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}}

    public TestReadableIntervalConverter(String name) {
        super(name);__CLR4_4_1rlyrlyle6rjdi8.R.inc(35787);try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35786);
    }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35788);
        __CLR4_4_1rlyrlyle6rjdi8.R.inc(35789);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rlyrlyle6rjdi8.R.inc(35790);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodType_Object138() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pf4co2rm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetPeriodType_Object138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pf4co2rm7() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35791); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35792);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35793);assertEquals(PeriodType.standard(), ReadableIntervalConverter.INSTANCE.getPeriodType(i)); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testSetIntoInterval_Object1329() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192qgsnrma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object1329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192qgsnrma() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35794); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35795);Interval i = new Interval(0L, 123L, CopticChronology.getInstance()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35796);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35797);ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35798);assertEquals(0L, m.getStartMillis()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35799);assertEquals(123L, m.getEndMillis()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35800);assertEquals(CopticChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testSetIntoInterval_Object2836() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152jq9lrmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object2836",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152jq9lrmh() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35801); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35802);Interval i = new Interval(0L, 123L, CopticChronology.getInstance()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35803);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35804);ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35805);assertEquals(0L, m.getStartMillis()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35806);assertEquals(123L, m.getEndMillis()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35807);assertEquals(GJChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testGetDurationMillis_Object1390() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7e9cwrmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetDurationMillis_Object1390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7e9cwrmo() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35808); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35809);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35810);assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i)); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testSetIntoPeriod_Object11391() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118qhkrrmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object11391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118qhkrrmr() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35811); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35812);Interval i = new Interval(100L, 223L); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35813);MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35814);ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35815);assertEquals(0, m.getYears()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35816);assertEquals(0, m.getMonths()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35817);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35818);assertEquals(0, m.getDays()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35819);assertEquals(0, m.getHours()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35820);assertEquals(0, m.getMinutes()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35821);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35822);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testIsReadableInterval_Object_Chronology1392() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiz6lwrn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testIsReadableInterval_Object_Chronology1392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiz6lwrn3() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35823); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35824);Interval i = new Interval(1234L, 5678L); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35825);assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null)); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 


public void testSupportedType1393() throws Exception {__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceStart(getClass().getName(),35826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgkzmhrn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlyrlyle6rjdi8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlyrlyle6rjdi8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSupportedType1393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgkzmhrn6() throws Exception{try{__CLR4_4_1rlyrlyle6rjdi8.R.inc(35826); 
     __CLR4_4_1rlyrlyle6rjdi8.R.inc(35827);assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType()); 
 }finally{__CLR4_4_1rlyrlyle6rjdi8.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
