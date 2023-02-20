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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1ivlivlle6np4if{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1ivlivlle6np4if.R.inc(24465);
        __CLR4_4_1ivlivlle6np4if.R.inc(24466);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ivlivlle6np4if.R.inc(24467);
        __CLR4_4_1ivlivlle6np4if.R.inc(24468);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1ivlivlle6np4if.R.inc(24470);try{__CLR4_4_1ivlivlle6np4if.R.inc(24469);
    }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ivlivlle6np4if.R.inc(24471);
        __CLR4_4_1ivlivlle6np4if.R.inc(24472);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ivlivlle6np4if.R.inc(24473);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ivlivlle6np4if.R.inc(24474);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ivlivlle6np4if.R.inc(24475);originalLocale = Locale.getDefault();
        __CLR4_4_1ivlivlle6np4if.R.inc(24476);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ivlivlle6np4if.R.inc(24477);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ivlivlle6np4if.R.inc(24478);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ivlivlle6np4if.R.inc(24479);
        __CLR4_4_1ivlivlle6np4if.R.inc(24480);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ivlivlle6np4if.R.inc(24481);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ivlivlle6np4if.R.inc(24482);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ivlivlle6np4if.R.inc(24483);Locale.setDefault(originalLocale);
        __CLR4_4_1ivlivlle6np4if.R.inc(24484);originalDateTimeZone = null;
        __CLR4_4_1ivlivlle6np4if.R.inc(24485);originalTimeZone = null;
        __CLR4_4_1ivlivlle6np4if.R.inc(24486);originalLocale = null;
    }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAdd_DurationFieldType_int3453() {__CLR4_4_1ivlivlle6np4if.R.globalSliceStart(getClass().getName(),24487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vduhmuiw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivlivlle6np4if.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivlivlle6np4if.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int3453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vduhmuiw7(){try{__CLR4_4_1ivlivlle6np4if.R.inc(24487); 
     __CLR4_4_1ivlivlle6np4if.R.inc(24488);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1ivlivlle6np4if.R.inc(24489);try { 
         __CLR4_4_1ivlivlle6np4if.R.inc(24490);test.add((DurationFieldType) null, 6); 
         __CLR4_4_1ivlivlle6np4if.R.inc(24491);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ivlivlle6np4if.R.inc(24492);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}
public void testAddSeconds_int1460() {__CLR4_4_1ivlivlle6np4if.R.globalSliceStart(getClass().getName(),24493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ruxk1wiwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivlivlle6np4if.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivlivlle6np4if.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int1460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ruxk1wiwd(){try{__CLR4_4_1ivlivlle6np4if.R.inc(24493); 
     __CLR4_4_1ivlivlle6np4if.R.inc(24494);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ivlivlle6np4if.R.inc(24495);test.addSeconds(13); 
     __CLR4_4_1ivlivlle6np4if.R.inc(24496);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ivlivlle6np4if.R.flushNeeded();}}
    

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
