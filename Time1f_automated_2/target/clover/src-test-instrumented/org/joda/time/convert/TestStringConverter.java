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
public class TestStringConverter extends TestCase {static class __CLR4_4_1lj0lj0le6nl8oi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,27923,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27900);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27901);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27902);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27903);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1lj0lj0le6nl8oi.R.inc(27905);try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27904);
    }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27906);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27907);zone = DateTimeZone.getDefault();
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27908);locale = Locale.getDefault();
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27909);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27910);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27911);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27912);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27913);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27914);DateTimeZone.setDefault(zone);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27915);Locale.setDefault(locale);
        __CLR4_4_1lj0lj0le6nl8oi.R.inc(27916);zone = null;
    }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetIntoInterval_Object_Chronology580() throws Exception {__CLR4_4_1lj0lj0le6nl8oi.R.globalSliceStart(getClass().getName(),27917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9t38mljh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lj0lj0le6nl8oi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lj0lj0le6nl8oi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9t38mljh() throws Exception{try{__CLR4_4_1lj0lj0le6nl8oi.R.inc(27917); 
     __CLR4_4_1lj0lj0le6nl8oi.R.inc(27918);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lj0lj0le6nl8oi.R.inc(27919);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     __CLR4_4_1lj0lj0le6nl8oi.R.inc(27920);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     __CLR4_4_1lj0lj0le6nl8oi.R.inc(27921);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     __CLR4_4_1lj0lj0le6nl8oi.R.inc(27922);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1lj0lj0le6nl8oi.R.flushNeeded();}}
    

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
