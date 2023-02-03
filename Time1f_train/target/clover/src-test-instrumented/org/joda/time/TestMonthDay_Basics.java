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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1manmanlc8axe34{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1manmanlc8axe34.R.inc(28895);
        __CLR4_4_1manmanlc8axe34.R.inc(28896);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1manmanlc8axe34.R.inc(28897);
        __CLR4_4_1manmanlc8axe34.R.inc(28898);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1manmanlc8axe34.R.inc(28900);try{__CLR4_4_1manmanlc8axe34.R.inc(28899);
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1manmanlc8axe34.R.inc(28901);
        __CLR4_4_1manmanlc8axe34.R.inc(28902);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1manmanlc8axe34.R.inc(28903);zone = DateTimeZone.getDefault();
        __CLR4_4_1manmanlc8axe34.R.inc(28904);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1manmanlc8axe34.R.inc(28905);
        __CLR4_4_1manmanlc8axe34.R.inc(28906);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1manmanlc8axe34.R.inc(28907);DateTimeZone.setDefault(zone);
        __CLR4_4_1manmanlc8axe34.R.inc(28908);zone = null;
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMinus_RP155() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0kgyvmb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0kgyvmb1(){try{__CLR4_4_1manmanlc8axe34.R.inc(28909); 
     __CLR4_4_1manmanlc8axe34.R.inc(28910);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28911);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28912);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28913);assertEquals(expected, result); 
     __CLR4_4_1manmanlc8axe34.R.inc(28914);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1manmanlc8axe34.R.inc(28915);assertSame(test, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testEqualsHashCode162() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ck29qwmb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ck29qwmb8(){try{__CLR4_4_1manmanlc8axe34.R.inc(28916); 
     __CLR4_4_1manmanlc8axe34.R.inc(28917);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(28918);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(28919);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28920);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28921);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28922);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28923);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28924);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28925);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28926);MonthDay test3 = new MonthDay(10, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28927);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28928);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28929);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28930);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28931);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28932);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28933);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1manmanlc8axe34.R.inc(28934);assertEquals(true, test1.equals(new MockMD())); 
     __CLR4_4_1manmanlc8axe34.R.inc(28935);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testWithers170() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j3iof1mbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j3iof1mbs(){try{__CLR4_4_1manmanlc8axe34.R.inc(28936); 
     __CLR4_4_1manmanlc8axe34.R.inc(28937);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28938);check(test.withMonthOfYear(5), 5, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28939);check(test.withDayOfMonth(2), 10, 2); 
     __CLR4_4_1manmanlc8axe34.R.inc(28940);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(28941);test.withMonthOfYear(0); 
         __CLR4_4_1manmanlc8axe34.R.inc(28942);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1manmanlc8axe34.R.inc(28943);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(28944);test.withMonthOfYear(13); 
         __CLR4_4_1manmanlc8axe34.R.inc(28945);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testPlusDays_same378() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i10093mc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i10093mc2(){try{__CLR4_4_1manmanlc8axe34.R.inc(28946); 
     __CLR4_4_1manmanlc8axe34.R.inc(28947);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28948);MonthDay result = test.plusDays(0); 
     __CLR4_4_1manmanlc8axe34.R.inc(28949);assertSame(test, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testGetFieldTypes467() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ckke7tmc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ckke7tmc6(){try{__CLR4_4_1manmanlc8axe34.R.inc(28950); 
     __CLR4_4_1manmanlc8axe34.R.inc(28951);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(28952);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1manmanlc8axe34.R.inc(28953);assertEquals(2, fields.length); 
     __CLR4_4_1manmanlc8axe34.R.inc(28954);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1manmanlc8axe34.R.inc(28955);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1manmanlc8axe34.R.inc(28956);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testToString_String_Locale468() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1due4nqmcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1due4nqmcd(){try{__CLR4_4_1manmanlc8axe34.R.inc(28957); 
     __CLR4_4_1manmanlc8axe34.R.inc(28958);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28959);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28960);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28961);assertEquals("--05-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28962);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null)); 
     __CLR4_4_1manmanlc8axe34.R.inc(28963);assertEquals("--05-06", test.toString(null, null)); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testMinusDays_int_negativeFromLeap481() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6l0zmck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6l0zmck(){try{__CLR4_4_1manmanlc8axe34.R.inc(28964); 
     __CLR4_4_1manmanlc8axe34.R.inc(28965);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28966);MonthDay result = test.minusDays(-1); 
     __CLR4_4_1manmanlc8axe34.R.inc(28967);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28968);assertEquals(expected, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testWithFieldAdded_unknownField516() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aa4x74mcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aa4x74mcp(){try{__CLR4_4_1manmanlc8axe34.R.inc(28969); 
     __CLR4_4_1manmanlc8axe34.R.inc(28970);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28971);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(28972);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1manmanlc8axe34.R.inc(28973);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testPlusMonths_int_wrap549() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxlqm1mcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxlqm1mcu(){try{__CLR4_4_1manmanlc8axe34.R.inc(28974); 
     __CLR4_4_1manmanlc8axe34.R.inc(28975);MonthDay test = new MonthDay(6, 5, ISO_UTC); 
     __CLR4_4_1manmanlc8axe34.R.inc(28976);MonthDay result = test.plusMonths(10); 
     __CLR4_4_1manmanlc8axe34.R.inc(28977);MonthDay expected = new MonthDay(4, 5, ISO_UTC); 
     __CLR4_4_1manmanlc8axe34.R.inc(28978);assertEquals(expected, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testPlusDays_int585() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4356imcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4356imcz(){try{__CLR4_4_1manmanlc8axe34.R.inc(28979); 
     __CLR4_4_1manmanlc8axe34.R.inc(28980);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28981);MonthDay result = test.plusDays(1); 
     __CLR4_4_1manmanlc8axe34.R.inc(28982);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(28983);assertEquals(expected, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testToString_String634() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpuwp8md4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpuwp8md4(){try{__CLR4_4_1manmanlc8axe34.R.inc(28984); 
     __CLR4_4_1manmanlc8axe34.R.inc(28985);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28986);assertEquals("05 \ufffd\ufffd", test.toString("MM HH")); 
     __CLR4_4_1manmanlc8axe34.R.inc(28987);assertEquals("--05-06", test.toString((String) null)); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testProperty653() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17knqb0md8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17knqb0md8(){try{__CLR4_4_1manmanlc8axe34.R.inc(28988); 
     __CLR4_4_1manmanlc8axe34.R.inc(28989);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(28990);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1manmanlc8axe34.R.inc(28991);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1manmanlc8axe34.R.inc(28992);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(28993);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1manmanlc8axe34.R.inc(28994);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1manmanlc8axe34.R.inc(28995);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(28996);test.property(null); 
         __CLR4_4_1manmanlc8axe34.R.inc(28997);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testSerialization868() throws Exception {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),28998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfe003mdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization868",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfe003mdi() throws Exception{try{__CLR4_4_1manmanlc8axe34.R.inc(28998); 
     __CLR4_4_1manmanlc8axe34.R.inc(28999);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(29000);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29001);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1manmanlc8axe34.R.inc(29002);oos.writeObject(test); 
     __CLR4_4_1manmanlc8axe34.R.inc(29003);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29004);oos.close(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29005);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1manmanlc8axe34.R.inc(29006);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1manmanlc8axe34.R.inc(29007);MonthDay result = (MonthDay) ois.readObject(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29008);ois.close(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29009);assertEquals(test, result); 
     __CLR4_4_1manmanlc8axe34.R.inc(29010);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1manmanlc8axe34.R.inc(29011);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1manmanlc8axe34.R.inc(29012);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testWithField994() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsfd6hmdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField994",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsfd6hmdx(){try{__CLR4_4_1manmanlc8axe34.R.inc(29013); 
     __CLR4_4_1manmanlc8axe34.R.inc(29014);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(29015);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10); 
     __CLR4_4_1manmanlc8axe34.R.inc(29016);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1manmanlc8axe34.R.inc(29017);assertEquals(new MonthDay(10, 6), result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testGetField1060() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwsvaume2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField1060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwsvaume2(){try{__CLR4_4_1manmanlc8axe34.R.inc(29018); 
     __CLR4_4_1manmanlc8axe34.R.inc(29019);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(29020);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1manmanlc8axe34.R.inc(29021);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1manmanlc8axe34.R.inc(29022);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(29023);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1manmanlc8axe34.R.inc(29024);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(29025);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testPlus_RP1135() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1518w06mea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP1135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1518w06mea(){try{__CLR4_4_1manmanlc8axe34.R.inc(29026); 
     __CLR4_4_1manmanlc8axe34.R.inc(29027);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(29028);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1manmanlc8axe34.R.inc(29029);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(29030);assertEquals(expected, result); 
     __CLR4_4_1manmanlc8axe34.R.inc(29031);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1manmanlc8axe34.R.inc(29032);assertSame(test, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1195() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3epnnmeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono1195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3epnnmeh(){try{__CLR4_4_1manmanlc8axe34.R.inc(29033); 
     __CLR4_4_1manmanlc8axe34.R.inc(29034);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(29035);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1manmanlc8axe34.R.inc(29036);assertSame(base, test); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testWithField_same1292() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgwe64mel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same1292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgwe64mel(){try{__CLR4_4_1manmanlc8axe34.R.inc(29037); 
     __CLR4_4_1manmanlc8axe34.R.inc(29038);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1manmanlc8axe34.R.inc(29039);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9); 
     __CLR4_4_1manmanlc8axe34.R.inc(29040);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1manmanlc8axe34.R.inc(29041);assertSame(test, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testToLocalDate1433() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1geapu2meq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate1433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1geapu2meq(){try{__CLR4_4_1manmanlc8axe34.R.inc(29042); 
     __CLR4_4_1manmanlc8axe34.R.inc(29043);MonthDay base = new MonthDay(6, 6, COPTIC_UTC); 
     __CLR4_4_1manmanlc8axe34.R.inc(29044);LocalDate test = base.toLocalDate(2009); 
     __CLR4_4_1manmanlc8axe34.R.inc(29045);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test); 
     __CLR4_4_1manmanlc8axe34.R.inc(29046);try { 
         __CLR4_4_1manmanlc8axe34.R.inc(29047);base.toLocalDate(0); 
         __CLR4_4_1manmanlc8axe34.R.inc(29048);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testMinusMonths_int1510() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o1e4rmex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int1510",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o1e4rmex(){try{__CLR4_4_1manmanlc8axe34.R.inc(29049); 
     __CLR4_4_1manmanlc8axe34.R.inc(29050);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(29051);MonthDay result = test.minusMonths(1); 
     __CLR4_4_1manmanlc8axe34.R.inc(29052);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1manmanlc8axe34.R.inc(29053);assertEquals(expected, result); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testIsSupported1592() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqmgtmmf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported1592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqmgtmmf2(){try{__CLR4_4_1manmanlc8axe34.R.inc(29054); 
     __CLR4_4_1manmanlc8axe34.R.inc(29055);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1manmanlc8axe34.R.inc(29056);assertEquals(false, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1manmanlc8axe34.R.inc(29057);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1manmanlc8axe34.R.inc(29058);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1manmanlc8axe34.R.inc(29059);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 


public void testSize1629() {__CLR4_4_1manmanlc8axe34.R.globalSliceStart(getClass().getName(),29060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0wrt2mf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1manmanlc8axe34.R.rethrow($CLV_t2$);}finally{__CLR4_4_1manmanlc8axe34.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize1629",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0wrt2mf8(){try{__CLR4_4_1manmanlc8axe34.R.inc(29060); 
     __CLR4_4_1manmanlc8axe34.R.inc(29061);MonthDay test = new MonthDay(); 
     __CLR4_4_1manmanlc8axe34.R.inc(29062);assertEquals(2, test.size()); 
 }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1manmanlc8axe34.R.inc(29063);
            __CLR4_4_1manmanlc8axe34.R.inc(29064);return COPTIC_UTC;
        }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1manmanlc8axe34.R.inc(29065);
            __CLR4_4_1manmanlc8axe34.R.inc(29066);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1manmanlc8axe34.R.inc(29067);
            __CLR4_4_1manmanlc8axe34.R.inc(29068);return new int[] {10, 6};
        }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1manmanlc8axe34.R.inc(29069);
        __CLR4_4_1manmanlc8axe34.R.inc(29070);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1manmanlc8axe34.R.inc(29071);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1manmanlc8axe34.R.flushNeeded();}}
}
