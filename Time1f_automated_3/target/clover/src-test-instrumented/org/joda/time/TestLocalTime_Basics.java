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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1ik1ik1le6np4h7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24049);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24050);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24051);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24052);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1ik1ik1le6np4h7.R.inc(24054);try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24053);
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24055);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24056);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24057);zone = DateTimeZone.getDefault();
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24058);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24059);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24060);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24061);DateTimeZone.setDefault(zone);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24062);zone = null;
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetValue_int427() {__CLR4_4_1ik1ik1le6np4h7.R.globalSliceStart(getClass().getName(),24063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptzrpfikf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik1ik1le6np4h7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik1ik1le6np4h7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptzrpfikf(){try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24063); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24064);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24065);assertEquals(COPTIC_UTC.hourOfDay(), test.getValue(0)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24066);assertEquals(COPTIC_UTC.minuteOfHour(), test.getValue(1)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24067);assertEquals(COPTIC_UTC.secondOfMinute(), test.getValue(2)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24068);assertEquals(COPTIC_UTC.millisOfSecond(), test.getValue(3)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24069);try { 
         __CLR4_4_1ik1ik1le6np4h7.R.inc(24070);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24071);try { 
         __CLR4_4_1ik1ik1le6np4h7.R.inc(24072);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_1430() {__CLR4_4_1ik1ik1le6np4h7.R.globalSliceStart(getClass().getName(),24073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnnrfeikp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik1ik1le6np4h7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik1ik1le6np4h7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnnrfeikp(){try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24073); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24074);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24075);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24076);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24077);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1431() {__CLR4_4_1ik1ik1le6np4h7.R.globalSliceStart(getClass().getName(),24078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r3xhkiku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik1ik1le6np4h7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik1ik1le6np4h7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r3xhkiku(){try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24078); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24079);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24080);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24081);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24082);assertEquals(new LocalTime(16, 20, 30, 40), result); 
 }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
public void testToString_String_Locale433() {__CLR4_4_1ik1ik1le6np4h7.R.globalSliceStart(getClass().getName(),24083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kj2cy4ikz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik1ik1le6np4h7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik1ik1le6np4h7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kj2cy4ikz(){try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24083); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24084);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24085);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24086);assertEquals("\ufffd 10", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24087);assertEquals("10", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24088);assertEquals("\ufffd 10", test.toString("EEE d/M", null)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24089);assertEquals("10", test.toString(null, null)); 
 }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
public void testToString_String_Locale480() {__CLR4_4_1ik1ik1le6np4h7.R.globalSliceStart(getClass().getName(),24090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqzuk4il6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik1ik1le6np4h7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik1ik1le6np4h7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqzuk4il6(){try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24090); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24091);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24092);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24093);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24094);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24095);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1ik1ik1le6np4h7.R.inc(24096);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24097);
            __CLR4_4_1ik1ik1le6np4h7.R.inc(24098);return COPTIC_UTC;
        }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24099);
            __CLR4_4_1ik1ik1le6np4h7.R.inc(24100);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24101);
            __CLR4_4_1ik1ik1le6np4h7.R.inc(24102);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1ik1ik1le6np4h7.R.inc(24103);
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24104);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24105);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24106);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ik1ik1le6np4h7.R.inc(24107);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1ik1ik1le6np4h7.R.flushNeeded();}}
}
