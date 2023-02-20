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
import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePartialConverter.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestReadablePartialConverter extends TestCase {static class __CLR4_4_1l8zl8zle6o7aag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    private static Chronology BUDDHIST;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27539);
        __CLR4_4_1l8zl8zle6o7aag.R.inc(27540);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27541);
        __CLR4_4_1l8zl8zle6o7aag.R.inc(27542);return new TestSuite(TestReadablePartialConverter.class);
    }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}

    public TestReadablePartialConverter(String name) {
        super(name);__CLR4_4_1l8zl8zle6o7aag.R.inc(27544);try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27543);
    }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27545);
        __CLR4_4_1l8zl8zle6o7aag.R.inc(27546);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1l8zl8zle6o7aag.R.inc(27547);ISO = ISOChronology.getInstance();
        __CLR4_4_1l8zl8zle6o7aag.R.inc(27548);BUDDHIST = BuddhistChronology.getInstance();
    }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetChronology_Object_Chronology22() throws Exception {__CLR4_4_1l8zl8zle6o7aag.R.globalSliceStart(getClass().getName(),27549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1hdukl99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8zl8zle6o7aag.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8zl8zle6o7aag.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1hdukl99() throws Exception{try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27549); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27550);assertEquals(ISO.withUTC(), ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27551);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
 }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}
public void testGetChronology_Object_Chronology23() throws Exception {__CLR4_4_1l8zl8zle6o7aag.R.globalSliceStart(getClass().getName(),27552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wahcn1l9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8zl8zle6o7aag.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8zl8zle6o7aag.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wahcn1l9c() throws Exception{try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27552); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27553);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27554);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27555);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27556);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
 }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}
public void testGetChronology_Object_Chronology26() throws Exception {__CLR4_4_1l8zl8zle6o7aag.R.globalSliceStart(getClass().getName(),27557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szmsyol9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8zl8zle6o7aag.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8zl8zle6o7aag.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szmsyol9h() throws Exception{try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27557); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27558);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27559);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
     __CLR4_4_1l8zl8zle6o7aag.R.inc(27560);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (Chronology) null)); 
 }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    static class MockTOD extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27561);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1l8zl8zle6o7aag.R.inc(27562);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1l8zl8zle6o7aag.R.inc(27563);__CLB4_4_1_bool0=true;}
                __CLR4_4_1l8zl8zle6o7aag.R.inc(27564);return chrono.hourOfDay();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1l8zl8zle6o7aag.R.inc(27565);__CLB4_4_1_bool0=true;}
                __CLR4_4_1l8zl8zle6o7aag.R.inc(27566);return chrono.minuteOfHour();
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1l8zl8zle6o7aag.R.inc(27567);__CLB4_4_1_bool0=true;}
                __CLR4_4_1l8zl8zle6o7aag.R.inc(27568);return chrono.year();
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1l8zl8zle6o7aag.R.inc(27569);__CLB4_4_1_bool0=true;}
                __CLR4_4_1l8zl8zle6o7aag.R.inc(27570);return chrono.era();
            }
            __CLR4_4_1l8zl8zle6o7aag.R.inc(27571);return null;
        }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1l8zl8zle6o7aag.R.inc(27572);
            __CLR4_4_1l8zl8zle6o7aag.R.inc(27573);return 4;
        }finally{__CLR4_4_1l8zl8zle6o7aag.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

}
