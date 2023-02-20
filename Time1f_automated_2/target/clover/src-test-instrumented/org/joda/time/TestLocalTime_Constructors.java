/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1i9si9sle6nl8ax{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23680);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23681);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23682);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23683);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1i9si9sle6nl8ax.R.inc(23685);try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23684);
    }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23686);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23687);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23688);zone = DateTimeZone.getDefault();
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23689);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23690);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23691);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23692);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23693);DateTimeZone.setDefault(zone);
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23694);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1i9si9sle6nl8ax.R.inc(23695);zone = null;
    }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
public void testFactory_FromDateFields_after1970401() throws Exception {__CLR4_4_1i9si9sle6nl8ax.R.globalSliceStart(getClass().getName(),23696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptfhtmia8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9si9sle6nl8ax.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9si9sle6nl8ax.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptfhtmia8() throws Exception{try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23696); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23697);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23698);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23699);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23700);assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}
public void testConstructor_Object_nullChronology402() throws Throwable {__CLR4_4_1i9si9sle6nl8ax.R.globalSliceStart(getClass().getName(),23701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gq045iad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9si9sle6nl8ax.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9si9sle6nl8ax.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullChronology402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gq045iad() throws Throwable{try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23701); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23702);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23703);LocalTime test = new LocalTime(date); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23704);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23705);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23706);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23707);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23708);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}
public void testConstructor_Object_nullChronology403() throws Throwable {__CLR4_4_1i9si9sle6nl8ax.R.globalSliceStart(getClass().getName(),23709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ppywmial();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9si9sle6nl8ax.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9si9sle6nl8ax.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullChronology403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ppywmial() throws Throwable{try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23709); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23710);LocalTime test = new LocalTime((Object) null); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23711);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23712);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23713);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23714);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23715);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}
public void testConstructor_Object_nullChronology406() throws Throwable {__CLR4_4_1i9si9sle6nl8ax.R.globalSliceStart(getClass().getName(),23716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgpva1ias();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9si9sle6nl8ax.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9si9sle6nl8ax.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullChronology406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgpva1ias() throws Throwable{try{__CLR4_4_1i9si9sle6nl8ax.R.inc(23716); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23717);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23718);LocalTime test = new LocalTime(date, (Chronology) null); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23719);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23720);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23721);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23722);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1i9si9sle6nl8ax.R.inc(23723);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i9si9sle6nl8ax.R.flushNeeded();}}
    

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
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
