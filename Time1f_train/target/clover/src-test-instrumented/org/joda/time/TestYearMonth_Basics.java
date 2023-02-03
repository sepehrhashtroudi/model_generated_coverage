/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1qhaqhalc8axemm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
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

    public static void main(String[] args) {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34318);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34319);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34320);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34321);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1qhaqhalc8axemm.R.inc(34323);try{__CLR4_4_1qhaqhalc8axemm.R.inc(34322);
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34324);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34325);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34326);zone = DateTimeZone.getDefault();
        __CLR4_4_1qhaqhalc8axemm.R.inc(34327);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34328);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34329);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qhaqhalc8axemm.R.inc(34330);DateTimeZone.setDefault(zone);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34331);zone = null;
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToInterval174() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9s9tvqho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9s9tvqho(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34332); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34333);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34334);Interval test = base.toInterval(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34335);check(base, 2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34336);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34337);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34338);Interval expected = new Interval(start, end); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34339);assertEquals(expected, test); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testMinusMonths_int180() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr98pbqhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr98pbqhw(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34340); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34341);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34342);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34343);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34344);assertEquals(expected, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34345);result = test.minusMonths(0); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34346);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testPlusYears_int212() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131t9cwqi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131t9cwqi3(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34347); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34348);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34349);YearMonth result = test.plusYears(1); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34350);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34351);assertEquals(expected, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34352);result = test.plusYears(0); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34353);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testMinus_RP254() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jef4mfqia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jef4mfqia(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34354); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34355);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34356);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34357);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34358);assertEquals(expected, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34359);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34360);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testSerialization310() throws Exception {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12feorpqih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12feorpqih() throws Exception{try{__CLR4_4_1qhaqhalc8axemm.R.inc(34361); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34362);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34363);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34364);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34365);oos.writeObject(test); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34366);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34367);oos.close(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34368);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34369);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34370);YearMonth result = (YearMonth) ois.readObject(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34371);ois.close(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34372);assertEquals(test, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34373);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34374);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34375);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testToString_String_Locale444() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfsidwqiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfsidwqiw(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34376); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34377);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34378);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34379);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34380);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34381);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34382);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono487() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tszlsqj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tszlsqj3(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34383); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34384);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34385);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34386);assertSame(base, test); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithChronologyRetainFields_invalidInNewChrono488() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy5dhfqj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy5dhfqj7(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34387); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34388);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34389);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34390);base.withChronologyRetainFields(ISO_UTC); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34391);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testIsAfter_YM763() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ugndkqjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ugndkqjc(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34392); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34393);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34394);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34395);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34396);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34397);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34398);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34399);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34400);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34401);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34402);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34403);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34404);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34405);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34406);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34407);new YearMonth(2005, 7).isAfter(null); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34408);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithers767() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5m3ddqjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers767",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5m3ddqjt(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34409); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34410);YearMonth test = new YearMonth(1970, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34411);check(test.withYear(2000), 2000, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34412);check(test.withMonthOfYear(2), 1970, 2); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34413);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34414);test.withMonthOfYear(0); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34415);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34416);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34417);test.withMonthOfYear(13); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34418);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testToString783() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vlh2dqk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString783",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vlh2dqk3(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34419); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34420);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34421);assertEquals("2002-06", test.toString()); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithField_same877() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q35f0kqk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same877",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q35f0kqk6(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34422); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34423);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34424);YearMonth result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34425);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34426);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testCompareTo1017() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu2gxmqkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo1017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu2gxmqkb(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34427); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34428);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34429);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34430);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34431);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34432);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34433);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34434);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34435);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34436);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34437);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34438);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34439);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34440);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34441);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34442);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34443);Partial p = new Partial(types, values); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34444);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34445);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34446);test1.compareTo(null); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34447);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34448);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34449);test1.compareTo(new LocalTime()); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34450);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34451);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34452);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34453);new YearMonth(1970, 6).compareTo(partial); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34454);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testToString_String1147() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5cfnoql3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String1147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5cfnoql3(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34455); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34456);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34457);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34458);assertEquals("2002-06", test.toString((String) null)); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testMinusYears_int1157() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjjq7lql7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int1157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjjq7lql7(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34459); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34460);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34461);YearMonth result = test.minusYears(1); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34462);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34463);assertEquals(expected, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34464);result = test.minusYears(0); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34465);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testGetFieldTypes1178() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxjgx7qle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes1178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxjgx7qle(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34466); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34467);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34468);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34469);assertEquals(2, fields.length); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34470);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34471);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34472);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithField1453() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltb9e2qll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField1453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltb9e2qll(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34473); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34474);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34475);YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34476);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34477);assertEquals(new YearMonth(2006, 6), result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testProperty1496() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtenmaqlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty1496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtenmaqlq(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34478); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34479);YearMonth test = new YearMonth(2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34480);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34481);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34482);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34483);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34484);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34485);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34486);test.property(null); 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34487);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testGetField1576() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkpxpcqm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField1576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkpxpcqm0(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34488); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34489);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34490);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34491);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34492);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34493);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34494);try { 
         __CLR4_4_1qhaqhalc8axemm.R.inc(34495);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testPlus_RP1649() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0cfduqm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP1649",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0cfduqm8(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34496); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34497);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34498);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34499);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34500);assertEquals(expected, result); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34501);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34502);assertSame(test, result); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono1766() {__CLR4_4_1qhaqhalc8axemm.R.globalSliceStart(getClass().getName(),34503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138y0fsqmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhaqhalc8axemm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhaqhalc8axemm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono1766",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138y0fsqmf(){try{__CLR4_4_1qhaqhalc8axemm.R.inc(34503); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34504);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34505);YearMonth test = base.withChronologyRetainFields(null); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34506);check(base, 2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34507);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34508);check(test, 2005, 6); 
     __CLR4_4_1qhaqhalc8axemm.R.inc(34509);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34510);
            __CLR4_4_1qhaqhalc8axemm.R.inc(34511);return COPTIC_UTC;
        }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34512);
            __CLR4_4_1qhaqhalc8axemm.R.inc(34513);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34514);
            __CLR4_4_1qhaqhalc8axemm.R.inc(34515);return new int[] {1970, 6};
        }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}
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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1qhaqhalc8axemm.R.inc(34516);
        __CLR4_4_1qhaqhalc8axemm.R.inc(34517);assertEquals(year, test.getYear());
        __CLR4_4_1qhaqhalc8axemm.R.inc(34518);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1qhaqhalc8axemm.R.flushNeeded();}}
}
