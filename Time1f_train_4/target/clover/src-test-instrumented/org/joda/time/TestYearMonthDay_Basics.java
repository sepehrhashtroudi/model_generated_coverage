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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1otzotzle6rjd71{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1otzotzle6rjd71.R.inc(32183);
        __CLR4_4_1otzotzle6rjd71.R.inc(32184);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1otzotzle6rjd71.R.inc(32185);
        __CLR4_4_1otzotzle6rjd71.R.inc(32186);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1otzotzle6rjd71.R.inc(32188);try{__CLR4_4_1otzotzle6rjd71.R.inc(32187);
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1otzotzle6rjd71.R.inc(32189);
        __CLR4_4_1otzotzle6rjd71.R.inc(32190);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1otzotzle6rjd71.R.inc(32191);zone = DateTimeZone.getDefault();
        __CLR4_4_1otzotzle6rjd71.R.inc(32192);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1otzotzle6rjd71.R.inc(32193);
        __CLR4_4_1otzotzle6rjd71.R.inc(32194);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1otzotzle6rjd71.R.inc(32195);DateTimeZone.setDefault(zone);
        __CLR4_4_1otzotzle6rjd71.R.inc(32196);zone = null;
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsBefore_YMD12() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifomocoud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifomocoud(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32197); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32198);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32199);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32200);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32201);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32202);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32203);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32204);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32205);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32206);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32207);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32208);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32209);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32210);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32211);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32212);new YearMonthDay(2005, 7, 2).isBefore(null); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32213);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testWithField325() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u48qp1ouu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u48qp1ouu(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32214); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32215);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32216);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32217);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32218);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono27() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k64j5zouz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k64j5zouz(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32219); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32220);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32221);YearMonthDay test = base.withChronologyRetainFields(null); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32222);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32223);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32224);check(test, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32225);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono28() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hneryxov6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hneryxov6(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32226); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32227);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32228);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32229);assertSame(base, test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testWithField429() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j93ke8ova();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j93ke8ova(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32230); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32231);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32232);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32233);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32234);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testMinusMonths_int30() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atpesbovf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atpesbovf(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32235); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32236);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32237);YearMonthDay result = test.minusMonths(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32238);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32239);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32240);result = test.minusMonths(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32241);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testMinus_RP31() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gskvacovm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gskvacovm(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32242); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32243);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32244);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32245);YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32246);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32247);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32248);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testPlusYears_int32() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e51iowovt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e51iowovt(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32249); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32250);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32251);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32252);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32253);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32254);result = test.plusYears(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32255);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testPlusMonths_int33() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19z2222ow0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19z2222ow0(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32256); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32257);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32258);YearMonthDay result = test.plusMonths(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32259);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32260);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32261);result = test.plusMonths(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32262);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testPlusDays_int34() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjy1gbow7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjy1gbow7(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32263); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32264);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32265);YearMonthDay result = test.plusDays(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32266);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32267);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32268);result = test.plusDays(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32269);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testMinusYears_int35() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19n7p5dowe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19n7p5dowe(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32270); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32271);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32272);YearMonthDay result = test.minusYears(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32273);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32274);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32275);result = test.minusYears(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32276);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testMinusDays_int36() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvurv3owl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvurv3owl(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32277); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32278);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32279);YearMonthDay result = test.minusDays(1); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32280);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32281);assertEquals(expected, result); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32282);result = test.minusDays(0); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32283);assertSame(test, result); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testProperty37() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz43ceows();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz43ceows(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32284); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32285);YearMonthDay test = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32286);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32287);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32288);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32289);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32290);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1otzotzle6rjd71.R.inc(32292);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32293);test.property(null); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32294);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToLocalDate38() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8f4ewox3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8f4ewox3(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32295); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32296);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32297);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32298);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToDateTimeAtMidnight39() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylbursox7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylbursox7(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32299); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32300);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32301);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32302);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32303);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToDateTimeAtMidnight_nullZone40() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edd4dyoxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edd4dyoxc(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32304); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32305);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32306);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32307);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32308);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime41() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsxzjjoxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsxzjjoxh(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32309); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32310);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32311);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32312);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32313);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32314);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32315);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32316);expected = expected.year().setCopy(2005); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32317);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32318);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32319);assertEquals(expected, test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToDateMidnight42() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg7sggoxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg7sggoxs(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32320); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32321);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32322);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32323);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32324);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToInterval43() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzfm14oxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzfm14oxx(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32325); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32326);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32327);Interval test = base.toInterval(); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32328);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32329);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32330);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32331);Interval expected = new Interval(start, end); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32332);assertEquals(expected, test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToString45() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3bb7eoy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3bb7eoy5(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32333); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32334);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32335);assertEquals("2002-06-09", test.toString()); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToDateTime_TOD_nullZone839() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13560zpoy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone839",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13560zpoy8(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32336); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32337);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32338);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32339);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32340);check(base, 2005, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32341);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32342);assertEquals(expected, test); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testToString_String_Locale1141() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197633poyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale1141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197633poyf(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32343); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32344);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32345);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32346);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32347);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32348);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32349);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 


public void testCompareTo1410() {__CLR4_4_1otzotzle6rjd71.R.globalSliceStart(getClass().getName(),32350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggc221oym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1otzotzle6rjd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_1otzotzle6rjd71.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo1410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggc221oym(){try{__CLR4_4_1otzotzle6rjd71.R.inc(32350); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32351);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32352);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32353);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32354);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32355);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32356);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32357);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32358);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32359);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32360);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32361);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32362);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32363);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32364);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1otzotzle6rjd71.R.inc(32365);int[] values = new int[] { 2005, 6, 2 }; 
     __CLR4_4_1otzotzle6rjd71.R.inc(32366);Partial p = new Partial(types, values); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32367);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32368);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32369);test1.compareTo(null); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32370);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1otzotzle6rjd71.R.inc(32371);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32372);test1.compareTo(new TimeOfDay()); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32373);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1otzotzle6rjd71.R.inc(32374);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1otzotzle6rjd71.R.inc(32375);try { 
         __CLR4_4_1otzotzle6rjd71.R.inc(32376);new YearMonthDay(1970, 6, 9).compareTo(partial); 
         __CLR4_4_1otzotzle6rjd71.R.inc(32377);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1otzotzle6rjd71.R.inc(32378);
            __CLR4_4_1otzotzle6rjd71.R.inc(32379);return COPTIC_UTC;
        }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1otzotzle6rjd71.R.inc(32380);
            __CLR4_4_1otzotzle6rjd71.R.inc(32381);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1otzotzle6rjd71.R.inc(32382);
            __CLR4_4_1otzotzle6rjd71.R.inc(32383);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}
    }

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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1otzotzle6rjd71.R.inc(32384);
        __CLR4_4_1otzotzle6rjd71.R.inc(32385);assertEquals(hour, test.getYear());
        __CLR4_4_1otzotzle6rjd71.R.inc(32386);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1otzotzle6rjd71.R.inc(32387);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1otzotzle6rjd71.R.flushNeeded();}}
}
