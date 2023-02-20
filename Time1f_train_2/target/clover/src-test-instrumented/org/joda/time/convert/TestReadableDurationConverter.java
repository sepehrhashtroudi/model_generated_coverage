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
public class TestReadableDurationConverter extends TestCase {static class __CLR4_4_1rcyrcyle6qsfio{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,35488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35458);
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35459);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35460);
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35461);return new TestSuite(TestReadableDurationConverter.class);
    }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}}

    public TestReadableDurationConverter(String name) {
        super(name);__CLR4_4_1rcyrcyle6qsfio.R.inc(35463);try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35462);
    }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}}

    @Override
    protected void setUp() throws Exception {try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35464);
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35465);super.setUp();
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35466);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35467);ISO = ISOChronology.getInstance();
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35468);zone = DateTimeZone.getDefault();
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35469);DateTimeZone.setDefault(PARIS);
    }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35470);
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35471);super.tearDown();
        __CLR4_4_1rcyrcyle6qsfio.R.inc(35472);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetDurationMillis_Object908() throws Exception {__CLR4_4_1rcyrcyle6qsfio.R.globalSliceStart(getClass().getName(),35473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfgs88rdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rcyrcyle6qsfio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rcyrcyle6qsfio.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testGetDurationMillis_Object908",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfgs88rdd() throws Exception{try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35473); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35474);assertEquals(123L, ReadableDurationConverter.INSTANCE.getDurationMillis(new Duration(123L))); 
 }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}} 


public void testSetInto_Object909() throws Exception {__CLR4_4_1rcyrcyle6qsfio.R.globalSliceStart(getClass().getName(),35475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjshobrdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rcyrcyle6qsfio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rcyrcyle6qsfio.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSetInto_Object909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjshobrdf() throws Exception{try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35475); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35476);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35477);ReadableDurationConverter.INSTANCE.setInto(m, new Duration(3L * DateTimeConstants.MILLIS_PER_DAY + 4L * DateTimeConstants.MILLIS_PER_MINUTE + 5L), null); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35478);assertEquals(0, m.getYears()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35479);assertEquals(0, m.getMonths()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35480);assertEquals(0, m.getWeeks()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35481);assertEquals(0, m.getDays()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35482);assertEquals(3 * 24, m.getHours()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35483);assertEquals(4, m.getMinutes()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35484);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35485);assertEquals(5, m.getMillis()); 
 }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}} 


public void testToString910() {__CLR4_4_1rcyrcyle6qsfio.R.globalSliceStart(getClass().getName(),35486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etyx1brdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rcyrcyle6qsfio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rcyrcyle6qsfio.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testToString910",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etyx1brdq(){try{__CLR4_4_1rcyrcyle6qsfio.R.inc(35486); 
     __CLR4_4_1rcyrcyle6qsfio.R.inc(35487);assertEquals("Converter[org.joda.time.ReadableDuration]", ReadableDurationConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rcyrcyle6qsfio.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}
