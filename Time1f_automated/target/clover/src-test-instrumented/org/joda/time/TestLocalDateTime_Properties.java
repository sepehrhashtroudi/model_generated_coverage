/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1ho6ho6lccietng{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1ho6ho6lccietng.R.inc(22902);
        __CLR4_4_1ho6ho6lccietng.R.inc(22903);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ho6ho6lccietng.R.inc(22904);
        __CLR4_4_1ho6ho6lccietng.R.inc(22905);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1ho6ho6lccietng.R.inc(22907);try{__CLR4_4_1ho6ho6lccietng.R.inc(22906);
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ho6ho6lccietng.R.inc(22908);
        __CLR4_4_1ho6ho6lccietng.R.inc(22909);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ho6ho6lccietng.R.inc(22910);zone = DateTimeZone.getDefault();
        __CLR4_4_1ho6ho6lccietng.R.inc(22911);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1ho6ho6lccietng.R.inc(22912);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ho6ho6lccietng.R.inc(22913);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ho6ho6lccietng.R.inc(22914);
        __CLR4_4_1ho6ho6lccietng.R.inc(22915);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ho6ho6lccietng.R.inc(22916);DateTimeZone.setDefault(zone);
        __CLR4_4_1ho6ho6lccietng.R.inc(22917);zone = null;
        __CLR4_4_1ho6ho6lccietng.R.inc(22918);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ho6ho6lccietng.R.inc(22919);systemDefaultLocale = null;
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1ho6ho6lccietng.R.inc(22920);
        __CLR4_4_1ho6ho6lccietng.R.inc(22921);assertEquals(year, test.getYear());
        __CLR4_4_1ho6ho6lccietng.R.inc(22922);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ho6ho6lccietng.R.inc(22923);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1ho6ho6lccietng.R.inc(22924);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ho6ho6lccietng.R.inc(22925);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ho6ho6lccietng.R.inc(22926);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ho6ho6lccietng.R.inc(22927);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1ho6ho6lccietng.R.flushNeeded();}}
}
