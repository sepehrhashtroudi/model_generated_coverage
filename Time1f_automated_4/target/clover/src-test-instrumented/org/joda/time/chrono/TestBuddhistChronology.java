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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_1k4qk4qle6o7a41{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,26166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26090);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26091);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26092);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26093);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26094);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_1k4qk4qle6o7a41.R.inc(26096);try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26095);
    }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26097);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26098);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26099);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26100);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26101);originalLocale = Locale.getDefault();
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26102);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26103);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26104);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26105);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26106);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26107);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26108);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26109);Locale.setDefault(originalLocale);
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26110);originalDateTimeZone = null;
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26111);originalTimeZone = null;
        __CLR4_4_1k4qk4qle6o7a41.R.inc(26112);originalLocale = null;
    }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testTimeFields169() {__CLR4_4_1k4qk4qle6o7a41.R.globalSliceStart(getClass().getName(),26113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qsza5k5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4qk4qle6o7a41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4qk4qle6o7a41.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qsza5k5d(){try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26113); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26114);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26115);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26116);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26117);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26118);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26119);assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26120);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26121);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26122);assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26123);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26124);assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26125);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26126);assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26127);assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26128);assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26129);assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26130);assertEquals(true, buddhist.hourOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26131);assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26132);assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26133);assertEquals(true, buddhist.secondOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26134);assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26135);assertEquals(true, buddhist.millisOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26136);assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}
public void testDurationFields170() {__CLR4_4_1k4qk4qle6o7a41.R.globalSliceStart(getClass().getName(),26137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rb8emk61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4qk4qle6o7a41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4qk4qle6o7a41.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDurationFields170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rb8emk61(){try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26137); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26138);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26139);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26140);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26141);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26142);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26143);assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26144);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26145);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26146);assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26147);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26148);assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26149);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26150);assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26151);assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26152);assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26153);assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26154);assertEquals(true, buddhist.hourOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26155);assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26156);assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26157);assertEquals(true, buddhist.secondOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26158);assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26159);assertEquals(true, buddhist.millisOfDay().isSupported()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26160);assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}
public void testToString171() {__CLR4_4_1k4qk4qle6o7a41.R.globalSliceStart(getClass().getName(),26161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tac60ck6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4qk4qle6o7a41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4qk4qle6o7a41.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tac60ck6p(){try{__CLR4_4_1k4qk4qle6o7a41.R.inc(26161); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26162);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26163);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26164);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString()); 
     __CLR4_4_1k4qk4qle6o7a41.R.inc(26165);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1k4qk4qle6o7a41.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
