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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1jyujyule6np4n7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jyujyule6np4n7.R.inc(25878);
        __CLR4_4_1jyujyule6np4n7.R.inc(25879);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jyujyule6np4n7.R.inc(25880);
        __CLR4_4_1jyujyule6np4n7.R.inc(25881);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1jyujyule6np4n7.R.inc(25883);try{__CLR4_4_1jyujyule6np4n7.R.inc(25882);
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jyujyule6np4n7.R.inc(25884);
        __CLR4_4_1jyujyule6np4n7.R.inc(25885);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jyujyule6np4n7.R.inc(25886);zone = DateTimeZone.getDefault();
        __CLR4_4_1jyujyule6np4n7.R.inc(25887);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1jyujyule6np4n7.R.inc(25888);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1jyujyule6np4n7.R.inc(25889);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jyujyule6np4n7.R.inc(25890);
        __CLR4_4_1jyujyule6np4n7.R.inc(25891);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jyujyule6np4n7.R.inc(25892);DateTimeZone.setDefault(zone);
        __CLR4_4_1jyujyule6np4n7.R.inc(25893);zone = null;
        __CLR4_4_1jyujyule6np4n7.R.inc(25894);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1jyujyule6np4n7.R.inc(25895);systemDefaultLocale = null;
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyAddMonth16() {__CLR4_4_1jyujyule6np4n7.R.globalSliceStart(getClass().getName(),25896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7vudujzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyujyule6np4n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyujyule6np4n7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7vudujzc(){try{__CLR4_4_1jyujyule6np4n7.R.inc(25896); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25897);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25898);YearMonthDay copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25899);check(test, 1972, 6, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25900);check(copy, 1972, 12, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25901);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25902);check(copy, 1973, 1, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25903);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25904);check(copy, 1972, 1, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25905);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25906);check(copy, 1971, 12, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25907);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25908);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25909);check(copy, 1972, 2, 29); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25910);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25911);check(copy, 1972, 3, 31); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25912);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25913);check(copy, 1972, 4, 30); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25914);test = new YearMonthDay(1971, 1, 31); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25915);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25916);check(copy, 1971, 2, 28); 
 }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}
public void testPropertyWithMinimumValueDayOfMonth17() {__CLR4_4_1jyujyule6np4n7.R.globalSliceStart(getClass().getName(),25917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxlejajzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jyujyule6np4n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jyujyule6np4n7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMinimumValueDayOfMonth17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxlejajzx(){try{__CLR4_4_1jyujyule6np4n7.R.inc(25917); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25918);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25919);YearMonthDay copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25920);check(test, 1972, 6, 9); 
     __CLR4_4_1jyujyule6np4n7.R.inc(25921);check(copy, 1972, 12, 9); 
 }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1jyujyule6np4n7.R.inc(25922);
        __CLR4_4_1jyujyule6np4n7.R.inc(25923);assertEquals(year, test.getYear());
        __CLR4_4_1jyujyule6np4n7.R.inc(25924);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1jyujyule6np4n7.R.inc(25925);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1jyujyule6np4n7.R.flushNeeded();}}
}
