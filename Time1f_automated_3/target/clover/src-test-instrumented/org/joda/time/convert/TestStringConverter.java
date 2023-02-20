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
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for StringConverter.
 *
 * @author Stephen Colebourne
 */
public class TestStringConverter extends TestCase {static class __CLR4_4_1lctlctle6np4tm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ONE_HOUR = DateTimeZone.forOffsetHours(1);
    private static final DateTimeZone SIX = DateTimeZone.forOffsetHours(6);
    private static final DateTimeZone SEVEN = DateTimeZone.forOffsetHours(7);
    private static final DateTimeZone EIGHT = DateTimeZone.forOffsetHours(8);
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_EIGHT = ISOChronology.getInstance(EIGHT);
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1lctlctle6np4tm.R.inc(27677);
        __CLR4_4_1lctlctle6np4tm.R.inc(27678);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lctlctle6np4tm.R.inc(27679);
        __CLR4_4_1lctlctle6np4tm.R.inc(27680);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1lctlctle6np4tm.R.inc(27682);try{__CLR4_4_1lctlctle6np4tm.R.inc(27681);
    }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lctlctle6np4tm.R.inc(27683);
        __CLR4_4_1lctlctle6np4tm.R.inc(27684);zone = DateTimeZone.getDefault();
        __CLR4_4_1lctlctle6np4tm.R.inc(27685);locale = Locale.getDefault();
        __CLR4_4_1lctlctle6np4tm.R.inc(27686);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lctlctle6np4tm.R.inc(27687);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1lctlctle6np4tm.R.inc(27688);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1lctlctle6np4tm.R.inc(27689);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lctlctle6np4tm.R.inc(27690);
        __CLR4_4_1lctlctle6np4tm.R.inc(27691);DateTimeZone.setDefault(zone);
        __CLR4_4_1lctlctle6np4tm.R.inc(27692);Locale.setDefault(locale);
        __CLR4_4_1lctlctle6np4tm.R.inc(27693);zone = null;
    }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetIntoPeriod_Object354() throws Exception {__CLR4_4_1lctlctle6np4tm.R.globalSliceStart(getClass().getName(),27694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaxywklda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lctlctle6np4tm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lctlctle6np4tm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaxywklda() throws Exception{try{__CLR4_4_1lctlctle6np4tm.R.inc(27694); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27695);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27696);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27697);assertEquals(2, m.getYears()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27698);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27699);assertEquals(3, m.getDays()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27700);assertEquals(12, m.getHours()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27701);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27702);assertEquals(48, m.getSeconds()); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27703);assertEquals(34, m.getMillis()); 
 }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}
public void testSetIntoIntervalEx_Object_Chronology555() throws Exception {__CLR4_4_1lctlctle6np4tm.R.globalSliceStart(getClass().getName(),27704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbazgbldk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lctlctle6np4tm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lctlctle6np4tm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbazgbldk() throws Exception{try{__CLR4_4_1lctlctle6np4tm.R.inc(27704); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27705);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27706);try { 
         __CLR4_4_1lctlctle6np4tm.R.inc(27707);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1lctlctle6np4tm.R.inc(27708);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}
public void testToString56() {__CLR4_4_1lctlctle6np4tm.R.globalSliceStart(getClass().getName(),27709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evjk4mldp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lctlctle6np4tm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lctlctle6np4tm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evjk4mldp(){try{__CLR4_4_1lctlctle6np4tm.R.inc(27709); 
     __CLR4_4_1lctlctle6np4tm.R.inc(27710);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1lctlctle6np4tm.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

            

            

            

            

            

            

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
