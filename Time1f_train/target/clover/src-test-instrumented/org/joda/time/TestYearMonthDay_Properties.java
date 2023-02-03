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
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1qd8qd8lc8axem2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34172);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34173);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34174);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34175);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1qd8qd8lc8axem2.R.inc(34177);try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34176);
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34178);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34179);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34180);zone = DateTimeZone.getDefault();
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34181);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34182);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34183);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34184);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34185);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34186);DateTimeZone.setDefault(zone);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34187);zone = null;
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34188);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34189);systemDefaultLocale = null;
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddMonth28() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emmj7qdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emmj7qdq(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34190); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34191);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34192);YearMonthDay copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34193);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34194);check(copy, 1972, 12, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34195);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34196);check(copy, 1973, 1, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34197);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34198);check(copy, 1972, 1, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34199);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34200);check(copy, 1971, 12, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34201);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34202);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34203);check(copy, 1972, 2, 29); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34204);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34205);check(copy, 1972, 3, 31); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34206);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34207);check(copy, 1972, 4, 30); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34208);test = new YearMonthDay(1971, 1, 31); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34209);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34210);check(copy, 1971, 2, 28); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear206() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb6mksqeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldYear206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb6mksqeb(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34211); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34212);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34213);YearMonthDay copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34214);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34215);check(copy, 1981, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34216);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34217);check(copy, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34218);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34219);check(copy, -292275054, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34220);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34221);check(copy, 292278993, 6, 9); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyCompareToYear272() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bkstaqem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToYear272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bkstaqem(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34222); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34223);YearMonthDay test1 = new YearMonthDay(TEST_TIME1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34224);YearMonthDay test2 = new YearMonthDay(TEST_TIME2); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34225);assertEquals(true, test1.year().compareTo(test2) < 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34226);assertEquals(true, test2.year().compareTo(test1) > 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34227);assertEquals(true, test1.year().compareTo(test1) == 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34228);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34229);test1.year().compareTo((ReadablePartial) null); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34230);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34231);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34232);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34233);assertEquals(true, test1.year().compareTo(dt2) < 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34234);assertEquals(true, test2.year().compareTo(dt1) > 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34235);assertEquals(true, test1.year().compareTo(dt1) == 0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34236);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34237);test1.year().compareTo((ReadableInstant) null); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34238);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict313() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlzrriqf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlzrriqf3(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34239); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34240);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34241);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34242);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34243);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34244);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34245);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34246);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34247);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34248);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertySetTextDay346() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9p0zsqfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9p0zsqfd(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34249); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34250);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34251);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34252);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34253);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth432() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vg2ga7qfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vg2ga7qfi(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34254); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34255);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34256);YearMonthDay copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34257);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34258);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertySetMonth576() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kz3g6qfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kz3g6qfn(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34259); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34260);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34261);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34262);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34263);check(copy, 1972, 12, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34264);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34265);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34266);check(copy, 1972, 2, 29); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34267);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34268);test.monthOfYear().setCopy(13); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34269);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34270);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34271);test.monthOfYear().setCopy(0); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34272);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyGetMonth841() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqcdpnqg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth841",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqcdpnqg1(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34273); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34274);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34275);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34276);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34277);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34278);assertSame(test, test.monthOfYear().getReadablePartial()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34279);assertSame(test, test.monthOfYear().getYearMonthDay()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34280);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34281);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34282);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34283);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34284);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34285);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34286);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34287);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34288);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34289);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34290);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34291);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34292);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 


public void testPropertyAddYear1239() {__CLR4_4_1qd8qd8lc8axem2.R.globalSliceStart(getClass().getName(),34293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rshuijqgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qd8qd8lc8axem2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qd8qd8lc8axem2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddYear1239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rshuijqgl(){try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34293); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34294);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34295);YearMonthDay copy = test.year().addToCopy(9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34296);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34297);check(copy, 1981, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34298);copy = test.year().addToCopy(0); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34299);check(copy, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34300);copy = test.year().addToCopy(292277023 - 1972); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34301);check(copy, 292277023, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34302);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34303);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34304);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34305);check(test, 1972, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34306);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34307);check(copy, 0, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34308);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34309);check(copy, -1, 6, 9); 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34310);try { 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34311);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1qd8qd8lc8axem2.R.inc(34312);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qd8qd8lc8axem2.R.inc(34313);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1qd8qd8lc8axem2.R.inc(34314);
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34315);assertEquals(year, test.getYear());
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34316);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1qd8qd8lc8axem2.R.inc(34317);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1qd8qd8lc8axem2.R.flushNeeded();}}
}
