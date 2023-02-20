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
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1jw4jw4le6np4my{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25780);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25781);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25782);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25783);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1jw4jw4le6np4my.R.inc(25785);try{__CLR4_4_1jw4jw4le6np4my.R.inc(25784);
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25786);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25787);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25788);zone = DateTimeZone.getDefault();
        __CLR4_4_1jw4jw4le6np4my.R.inc(25789);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25790);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25791);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jw4jw4le6np4my.R.inc(25792);DateTimeZone.setDefault(zone);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25793);zone = null;
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithChronologyRetainFields_nullChrono9() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmdt0bjwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmdt0bjwi(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25794); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25795);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25796);YearMonthDay test = base.withChronologyRetainFields(null); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25797);check(base, 2005, 6, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25798);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25799);check(test, 2005, 6, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25800);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testWithChronologyRetainFields_sameChrono10() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12c5cv4jwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12c5cv4jwp(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25801); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25802);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25803);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25804);assertSame(base, test); 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testWithField311() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11szgfcjwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11szgfcjwt(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25805); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25806);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25807);try { 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25808);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25809);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testPlusYears_int12() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jn9sujwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jn9sujwy(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25810); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25811);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25812);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25813);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25814);assertEquals(expected, result); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25815);result = test.plusYears(0); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25816);assertSame(test, result); 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testMinusMonths_int13() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aioqh6jx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aioqh6jx5(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25817); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25818);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25819);YearMonthDay result = test.minusMonths(1); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25820);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25821);assertEquals(expected, result); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25822);result = test.minusMonths(0); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25823);assertSame(test, result); 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testProperty14() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4pqtrjxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4pqtrjxc(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25824); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25825);YearMonthDay test = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25826);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25827);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25828);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25829);try { 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25830);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25831);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25832);try { 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25833);test.property(null); 
         __CLR4_4_1jw4jw4le6np4my.R.inc(25834);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
public void testToDateTimeAtCurrentTime15() {__CLR4_4_1jw4jw4le6np4my.R.globalSliceStart(getClass().getName(),25835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eoh71yjxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw4jw4le6np4my.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw4jw4le6np4my.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eoh71yjxn(){try{__CLR4_4_1jw4jw4le6np4my.R.inc(25835); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25836);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25837);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25838);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25839);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25840);check(base, 2005, 6, 9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25841);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25842);expected = expected.year().setCopy(2005); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25843);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25844);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1jw4jw4le6np4my.R.inc(25845);assertEquals(expected, test); 
 }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25846);
            __CLR4_4_1jw4jw4le6np4my.R.inc(25847);return COPTIC_UTC;
        }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25848);
            __CLR4_4_1jw4jw4le6np4my.R.inc(25849);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25850);
            __CLR4_4_1jw4jw4le6np4my.R.inc(25851);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1jw4jw4le6np4my.R.inc(25852);
        __CLR4_4_1jw4jw4le6np4my.R.inc(25853);assertEquals(hour, test.getYear());
        __CLR4_4_1jw4jw4le6np4my.R.inc(25854);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1jw4jw4le6np4my.R.inc(25855);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1jw4jw4le6np4my.R.flushNeeded();}}
}
