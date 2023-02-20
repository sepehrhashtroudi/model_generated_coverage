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
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1jx1jx1le6o7a2q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25897,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25813);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25814);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25815);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25816);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1jx1jx1le6o7a2q.R.inc(25818);try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25817);
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25819);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25820);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25821);zone = DateTimeZone.getDefault();
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25822);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25823);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25824);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25825);DateTimeZone.setDefault(zone);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25826);zone = null;
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithFieldAdded32() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eteyisjxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eteyisjxf(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25827); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25828);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25829);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25830);test.withFieldAdded(null, 6); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25831);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testConstructor_nullChronology14() throws Throwable {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spla5cjxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testConstructor_nullChronology14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spla5cjxk() throws Throwable{try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25832); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25833);YearMonthDay test = new YearMonthDay((Chronology) null); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25834);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25835);assertEquals(1970, test.getYear()); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25836);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25837);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testGetField15() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rl49sxjxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rl49sxjxq(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25838); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25839);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25840);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25841);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25842);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25843);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25844);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25845);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25846);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testGetFieldTypes17() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inwxu8jxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inwxu8jxz(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25847); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25848);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25849);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25850);assertEquals(2, fields.length); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25851);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25852);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25853);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testWithField318() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ky0b3zjy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ky0b3zjy6(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25854); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25855);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25856);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25857);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25858);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testPlus_RP19() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2425cjyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2425cjyb(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25859); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25860);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25861);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25862);YearMonthDay expected = new YearMonthDay(2003, 7, 28, BuddhistChronology.getInstance()); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25863);assertEquals(expected, result); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25864);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25865);assertSame(test, result); 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testWithers20() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqbxxpjyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqbxxpjyi(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25866); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25867);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25868);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25869);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25870);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25871);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25872);test.withMonthOfYear(0); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25873);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25874);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25875);test.withMonthOfYear(13); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25876);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
public void testWithers21() {__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceStart(getClass().getName(),25877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehbz58jyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx1jx1le6o7a2q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx1jx1le6o7a2q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehbz58jyt(){try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25877); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25878);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25879);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25880);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25881);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25882);test.withMonthOfYear(0); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25883);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jx1jx1le6o7a2q.R.inc(25884);try { 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25885);test.withMonthOfYear(13); 
         __CLR4_4_1jx1jx1le6o7a2q.R.inc(25886);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25887);
            __CLR4_4_1jx1jx1le6o7a2q.R.inc(25888);return COPTIC_UTC;
        }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25889);
            __CLR4_4_1jx1jx1le6o7a2q.R.inc(25890);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25891);
            __CLR4_4_1jx1jx1le6o7a2q.R.inc(25892);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1jx1jx1le6o7a2q.R.inc(25893);
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25894);assertEquals(hour, test.getYear());
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25895);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1jx1jx1le6o7a2q.R.inc(25896);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1jx1jx1le6o7a2q.R.flushNeeded();}}
}
