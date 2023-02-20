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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1ibhibhle6o79uf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23937,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23741);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23742);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23743);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23744);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1ibhibhle6o79uf.R.inc(23746);try{__CLR4_4_1ibhibhle6o79uf.R.inc(23745);
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23747);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23748);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23749);zone = DateTimeZone.getDefault();
        __CLR4_4_1ibhibhle6o79uf.R.inc(23750);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23751);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23752);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ibhibhle6o79uf.R.inc(23753);DateTimeZone.setDefault(zone);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23754);zone = null;
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsEqual_YM10() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rlextibv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_YM10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rlextibv(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23755); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23756);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23757);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23758);assertEquals(false, test1.isEqual(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23759);assertEquals(false, test1a.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23760);assertEquals(false, test1.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23761);assertEquals(false, test1a.isEqual(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23762);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23763);assertEquals(true, test1.isEqual(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23764);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23765);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23766);assertEquals(true, test1.isEqual(test3)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23767);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23768);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23769);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23770);new YearMonth(2005, 7).isEqual(null); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23771);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testIsEqual_YM11() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0ldqaicc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_YM11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0ldqaicc(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23772); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23773);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23774);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23775);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23776);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23777);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23778);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23779);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23780);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23781);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23782);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23783);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23784);assertEquals(true, test3.isEqual(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23785);assertEquals(false, test3.isEqual(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23786);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23787);new YearMonth(2005, 7).isEqual(null); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23788);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter13() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155io8yict();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155io8yict(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23789); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23790);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23791);assertEquals("\ufffd 9/6", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23792);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testGetValue_int374() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqwyyiicx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqwyyiicx(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23793); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23794);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23795);assertEquals(10, test.getValue(0)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23796);assertEquals(20, test.getValue(1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23797);assertEquals(30, test.getValue(2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23798);assertEquals(40, test.getValue(3)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23799);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23800);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23801);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23802);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testPropertyGetMinute377() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfoyo9id7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPropertyGetMinute377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfoyo9id7(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23803); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23804);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23805);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23806);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23807);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23808);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23809);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23810);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23811);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23812);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23813);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23814);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23815);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23816);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23817);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23818);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testPlusMinutes_int378() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bv6rcidn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bv6rcidn(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23819); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23820);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23821);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23822);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23823);assertEquals(expected, result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23824);result = test.plusMinutes(0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23825);assertSame(test, result); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testIsAfter_LocalTime379() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14u2m59idu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsAfter_LocalTime379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14u2m59idu(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23826); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23827);LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23828);LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23829);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23830);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23831);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23832);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23833);LocalTime test2 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23834);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23835);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23836);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23837);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23838);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23839);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23840);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23841);new LocalTime(10, 20, 30, 40).isAfter(null); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23842);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_3380() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l05wi6ieb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l05wi6ieb(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23843); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23844);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23845);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23846);test.withField(null, 6); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23847);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testMinus_RP381() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5t27gieg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5t27gieg(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23848); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23849);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23850);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23851);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23852);assertEquals(expected, result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23853);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23854);assertSame(test, result); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testPlus_RP382() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdutfnien();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdutfnien(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23855); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23856);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23857);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23858);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23859);assertEquals(expected, result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23860);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23861);assertSame(test, result); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testPlusHours_int383() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqbfj2ieu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqbfj2ieu(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23862); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23863);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23864);LocalTime result = test.plusHours(1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23865);LocalTime expected = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23866);assertEquals(expected, result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23867);result = test.plusHours(0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23868);assertSame(test, result); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testGetters385() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfl9unif1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfl9unif1(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23869); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23870);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23871);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23872);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23873);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23874);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23875);assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testGetMinuteOfHour386() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tjkedif8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetMinuteOfHour386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tjkedif8(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23876); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23877);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23878);assertEquals(10, test.getMinuteOfHour()); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testWithers388() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcmkq4ifb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcmkq4ifb(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23879); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23880);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23881);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23882);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23883);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23884);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23885);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23886);test.withHourOfDay(-1); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23887);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23888);try { 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23889);test.withHourOfDay(24); 
         __CLR4_4_1ibhibhle6o79uf.R.inc(23890);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testPropertyGetMillis389() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jugbzuifn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPropertyGetMillis389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jugbzuifn(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23891); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23892);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23893);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23894);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23895);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23896);assertSame(test, test.millisOfDay().getLocalTime()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23897);assertEquals(10, test.millisOfDay().get()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23898);assertEquals("10", test.millisOfDay().getAsString()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23899);assertEquals("10", test.millisOfDay().getAsText()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23900);assertEquals("10", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23901);assertEquals("10", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23902);assertEquals("10", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23903);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23904);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23905);assertEquals(2, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23906);assertEquals(2, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testToString_String390() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nrmjlig3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nrmjlig3(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23907); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23908);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23909);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23910);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23911);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23912);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_8392() {__CLR4_4_1ibhibhle6o79uf.R.globalSliceStart(getClass().getName(),23913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156ni1hig9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhle6o79uf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhle6o79uf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156ni1hig9(){try{__CLR4_4_1ibhibhle6o79uf.R.inc(23913); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23914);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23915);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23916);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23917);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23918);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23919);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23920);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23921);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23922);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23923);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23924);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1ibhibhle6o79uf.R.inc(23925);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23926);
            __CLR4_4_1ibhibhle6o79uf.R.inc(23927);return COPTIC_UTC;
        }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23928);
            __CLR4_4_1ibhibhle6o79uf.R.inc(23929);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23930);
            __CLR4_4_1ibhibhle6o79uf.R.inc(23931);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1ibhibhle6o79uf.R.inc(23932);
        __CLR4_4_1ibhibhle6o79uf.R.inc(23933);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ibhibhle6o79uf.R.inc(23934);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ibhibhle6o79uf.R.inc(23935);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ibhibhle6o79uf.R.inc(23936);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1ibhibhle6o79uf.R.flushNeeded();}}
}
