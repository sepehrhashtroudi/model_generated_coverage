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
public class TestReadableDurationConverter extends TestCase {static class __CLR4_4_1t3nt3nlc8axevx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,37745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37715);
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37716);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37717);
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37718);return new TestSuite(TestReadableDurationConverter.class);
    }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}}

    public TestReadableDurationConverter(String name) {
        super(name);__CLR4_4_1t3nt3nlc8axevx.R.inc(37720);try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37719);
    }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}}

    @Override
    protected void setUp() throws Exception {try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37721);
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37722);super.setUp();
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37723);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37724);ISO = ISOChronology.getInstance();
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37725);zone = DateTimeZone.getDefault();
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37726);DateTimeZone.setDefault(PARIS);
    }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37727);
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37728);super.tearDown();
        __CLR4_4_1t3nt3nlc8axevx.R.inc(37729);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetInto_Object118() throws Exception {__CLR4_4_1t3nt3nlc8axevx.R.globalSliceStart(getClass().getName(),37730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axn3n3t42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t3nt3nlc8axevx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t3nt3nlc8axevx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSetInto_Object118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axn3n3t42() throws Exception{try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37730); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37731);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37732);ReadableDurationConverter.INSTANCE.setInto(m, new Duration(3L * DateTimeConstants.MILLIS_PER_DAY + 4L * DateTimeConstants.MILLIS_PER_MINUTE + 5L), null); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37733);assertEquals(0, m.getYears()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37734);assertEquals(0, m.getMonths()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37735);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37736);assertEquals(0, m.getDays()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37737);assertEquals(3 * 24, m.getHours()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37738);assertEquals(4, m.getMinutes()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37739);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37740);assertEquals(5, m.getMillis()); 
 }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}} 


public void testToString1196() {__CLR4_4_1t3nt3nlc8axevx.R.globalSliceStart(getClass().getName(),37741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xb596mt4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t3nt3nlc8axevx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t3nt3nlc8axevx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testToString1196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xb596mt4d(){try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37741); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37742);assertEquals("Converter[org.joda.time.ReadableDuration]", ReadableDurationConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}} 


public void testGetDurationMillis_Object1605() throws Exception {__CLR4_4_1t3nt3nlc8axevx.R.globalSliceStart(getClass().getName(),37743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11arl0xt4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t3nt3nlc8axevx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t3nt3nlc8axevx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testGetDurationMillis_Object1605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11arl0xt4f() throws Exception{try{__CLR4_4_1t3nt3nlc8axevx.R.inc(37743); 
     __CLR4_4_1t3nt3nlc8axevx.R.inc(37744);assertEquals(123L, ReadableDurationConverter.INSTANCE.getDurationMillis(new Duration(123L))); 
 }finally{__CLR4_4_1t3nt3nlc8axevx.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}
