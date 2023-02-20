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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1ir0ir0le6nl8cw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24300);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24301);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24302);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24303);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1ir0ir0le6nl8cw.R.inc(24305);try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24304);
    }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24306);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24307);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24308);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24309);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24310);originalLocale = Locale.getDefault();
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24311);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24312);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24313);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24314);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24315);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24316);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24317);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24318);Locale.setDefault(originalLocale);
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24319);originalDateTimeZone = null;
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24320);originalTimeZone = null;
        __CLR4_4_1ir0ir0le6nl8cw.R.inc(24321);originalLocale = null;
    }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSet_DateTimeFieldType_int2425() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1voxgmeirm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int2425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1voxgmeirm(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24322); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24323);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24324);try { 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24325);test.set(null, 0); 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24326);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24327);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetWeekyear_int2427() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16euhflirs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int2427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16euhflirs(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24328); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24329);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24330);try { 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24331);test.setWeekyear(53); 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24332);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24333);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetDayOfMonth_int_dstOverlapSummer_addZero428() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1que14kiry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1que14kiry(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24334); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24335);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24336);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24337);test.setDayOfMonth(303); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24338);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetDayOfMonth_int_dstOverlapWinter_addZero429() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz3wg1is3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz3wg1is3(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24339); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24340);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24341);test.addHours(1); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24342);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24343);test.setDayOfMonth(303); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24344);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetMinuteOfDay_int2430() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pzn8pis9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int2430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pzn8pis9(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24345); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24346);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24347);try { 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24348);test.setMinuteOfDay(24); 
         __CLR4_4_1ir0ir0le6nl8cw.R.inc(24349);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24350);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetMillisOfDay_int1431() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oekv9jisf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillisOfDay_int1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oekv9jisf(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24351); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24352);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24353);test.setMillisOfDay(13); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24354);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetMillisOfSecond_int1432() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r94flyisj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillisOfSecond_int1432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r94flyisj(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24355); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24356);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24357);test.setMillisOfSecond(13); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24358);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetDate_int_int_dstOverlapWinter_addZero433() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gnuo9isn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_dstOverlapWinter_addZero433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gnuo9isn(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24359); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24360);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24361);test.addHours(1); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24362);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24363);test.setDate(2011, 10, 30); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24364);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetDate_int_int_int_dstOverlapWinter_addZero435() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18w7oqtist();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int_dstOverlapWinter_addZero435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18w7oqtist(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24365); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24366);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24367);test.addHours(1); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24368);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24369);test.setDate(2011, 10, 30); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24370);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
public void testSetTime_int_int_int_int1436() {__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceStart(getClass().getName(),24371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i44kaeisz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ir0ir0le6nl8cw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ir0ir0le6nl8cw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int1436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i44kaeisz(){try{__CLR4_4_1ir0ir0le6nl8cw.R.inc(24371); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24372);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24373);test.setTime(5, 6, 7, 8); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24374);assertEquals(2002, test.getYear()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24375);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24376);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24377);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24378);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24379);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1ir0ir0le6nl8cw.R.inc(24380);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ir0ir0le6nl8cw.R.flushNeeded();}}
    

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
