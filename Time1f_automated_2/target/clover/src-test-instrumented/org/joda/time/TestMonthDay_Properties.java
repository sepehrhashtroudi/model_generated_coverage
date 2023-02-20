/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Propeties} 
 */
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1ihgihgle6nl8bn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24011,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23956);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23957);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23958);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23959);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1ihgihgle6nl8bn.R.inc(23961);try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23960);
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23962);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23963);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23964);zone = DateTimeZone.getDefault();
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23965);locale = Locale.getDefault();
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23966);Locale.setDefault(Locale.UK);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23967);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23968);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23969);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23970);DateTimeZone.setDefault(zone);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23971);zone = null;
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23972);Locale.setDefault(locale);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(23973);locale = null;
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyAddMonthOfYear198() {__CLR4_4_1ihgihgle6nl8bn.R.globalSliceStart(getClass().getName(),23974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o98gsjihy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihgihgle6nl8bn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihgihgle6nl8bn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o98gsjihy(){try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23974); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23975);MonthDay test = new MonthDay(3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23976);MonthDay copy = test.monthOfYear().addToCopy(9); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23977);check(test, 3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23978);check(copy, 3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23979);copy = test.monthOfYear().addToCopy(0); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23980);check(copy, 3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23981);check(test, 3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23982);copy = test.monthOfYear().addToCopy(-3); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23983);check(copy, 3, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23984);check(test, 3, 6); 
 }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}
public void testPropertyAddMonthOfYear533() {__CLR4_4_1ihgihgle6nl8bn.R.globalSliceStart(getClass().getName(),23985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9gbj2ii9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihgihgle6nl8bn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihgihgle6nl8bn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9gbj2ii9(){try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23985); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23986);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23987);MonthDay copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23988);check(test, 10, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23989);check(copy, 12, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23990);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23991);check(copy, 2, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23992);copy = test.monthOfYear().addToCopy(292278993 - 4 + 1); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23993);check(copy, 11, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23994);copy = test.monthOfYear().addToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23995);check(copy, 6, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23996);copy = test.monthOfYear().addToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23997);check(copy, 6, 6); 
 }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}
public void testPropertySetTextDayOfMonth534() {__CLR4_4_1ihgihgle6nl8bn.R.globalSliceStart(getClass().getName(),23998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sfcm0iim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihgihgle6nl8bn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihgihgle6nl8bn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sfcm0iim(){try{__CLR4_4_1ihgihgle6nl8bn.R.inc(23998); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(23999);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24000);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24001);check(test, 10, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24002);check(copy, 12, 6); 
 }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}
public void testPropertySetTextDayOfMonth535() {__CLR4_4_1ihgihgle6nl8bn.R.globalSliceStart(getClass().getName(),24003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jfdtjiir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihgihgle6nl8bn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihgihgle6nl8bn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jfdtjiir(){try{__CLR4_4_1ihgihgle6nl8bn.R.inc(24003); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24004);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24005);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24006);check(test, 4, 6); 
     __CLR4_4_1ihgihgle6nl8bn.R.inc(24007);check(copy, 4, 6); 
 }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1ihgihgle6nl8bn.R.inc(24008);
        __CLR4_4_1ihgihgle6nl8bn.R.inc(24009);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1ihgihgle6nl8bn.R.inc(24010);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1ihgihgle6nl8bn.R.flushNeeded();}}
}
