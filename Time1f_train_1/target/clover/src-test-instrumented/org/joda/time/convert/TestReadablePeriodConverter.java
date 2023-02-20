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
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePeriodConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadablePeriodConverter extends TestCase {static class __CLR4_4_1rmxrmxle6qeak5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35817);
        __CLR4_4_1rmxrmxle6qeak5.R.inc(35818);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35819);
        __CLR4_4_1rmxrmxle6qeak5.R.inc(35820);return new TestSuite(TestReadablePeriodConverter.class);
    }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}}

    public TestReadablePeriodConverter(String name) {
        super(name);__CLR4_4_1rmxrmxle6qeak5.R.inc(35822);try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35821);
    }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35823);
        __CLR4_4_1rmxrmxle6qeak5.R.inc(35824);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rmxrmxle6qeak5.R.inc(35825);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetInto_Object149() throws Exception {__CLR4_4_1rmxrmxle6qeak5.R.globalSliceStart(getClass().getName(),35826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aftisvrn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rmxrmxle6qeak5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rmxrmxle6qeak5.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSetInto_Object149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aftisvrn6() throws Exception{try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35826); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35827);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35828);ReadablePeriodConverter.INSTANCE.setInto(m, new Period(0, 0, 0, 3, 0, 4, 0, 5), null); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35829);assertEquals(0, m.getYears()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35830);assertEquals(0, m.getMonths()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35831);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35832);assertEquals(3, m.getDays()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35833);assertEquals(0, m.getHours()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35834);assertEquals(4, m.getMinutes()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35835);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35836);assertEquals(5, m.getMillis()); 
 }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}} 


public void testGetPeriodType_Object150() throws Exception {__CLR4_4_1rmxrmxle6qeak5.R.globalSliceStart(getClass().getName(),35837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180lq38rnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rmxrmxle6qeak5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rmxrmxle6qeak5.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testGetPeriodType_Object150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180lq38rnh() throws Exception{try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35837); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35838);assertEquals(PeriodType.standard(), ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.standard()))); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35839);assertEquals(PeriodType.yearMonthDayTime(), ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.yearMonthDayTime()))); 
 }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}} 


public void testToString151() {__CLR4_4_1rmxrmxle6qeak5.R.globalSliceStart(getClass().getName(),35840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hoxx4arnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rmxrmxle6qeak5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rmxrmxle6qeak5.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testToString151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hoxx4arnk(){try{__CLR4_4_1rmxrmxle6qeak5.R.inc(35840); 
     __CLR4_4_1rmxrmxle6qeak5.R.inc(35841);assertEquals("Converter[org.joda.time.ReadablePeriod]", ReadablePeriodConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rmxrmxle6qeak5.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}
