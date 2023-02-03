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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1ht1ht1lccietof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ht1ht1lccietof.R.inc(23077);
        __CLR4_4_1ht1ht1lccietof.R.inc(23078);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ht1ht1lccietof.R.inc(23079);
        __CLR4_4_1ht1ht1lccietof.R.inc(23080);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1ht1ht1lccietof.R.inc(23082);try{__CLR4_4_1ht1ht1lccietof.R.inc(23081);
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ht1ht1lccietof.R.inc(23083);
        __CLR4_4_1ht1ht1lccietof.R.inc(23084);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ht1ht1lccietof.R.inc(23085);zone = DateTimeZone.getDefault();
        __CLR4_4_1ht1ht1lccietof.R.inc(23086);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ht1ht1lccietof.R.inc(23087);
        __CLR4_4_1ht1ht1lccietof.R.inc(23088);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ht1ht1lccietof.R.inc(23089);DateTimeZone.setDefault(zone);
        __CLR4_4_1ht1ht1lccietof.R.inc(23090);zone = null;
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testProperty53() {__CLR4_4_1ht1ht1lccietof.R.globalSliceStart(getClass().getName(),23091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cglukshtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht1ht1lccietof.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht1ht1lccietof.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cglukshtf(){try{__CLR4_4_1ht1ht1lccietof.R.inc(23091); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23092);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23093);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23094);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23095);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23096);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23097);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23098);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23099);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23100);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23101);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23102);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23103);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23104);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23105);try { 
         __CLR4_4_1ht1ht1lccietof.R.inc(23106);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1ht1ht1lccietof.R.inc(23107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ht1ht1lccietof.R.inc(23108);try { 
         __CLR4_4_1ht1ht1lccietof.R.inc(23109);test.property(null); 
         __CLR4_4_1ht1ht1lccietof.R.inc(23110);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
public void testPlusMinutes_int289() {__CLR4_4_1ht1ht1lccietof.R.globalSliceStart(getClass().getName(),23111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vljb0phtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht1ht1lccietof.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht1ht1lccietof.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vljb0phtz(){try{__CLR4_4_1ht1ht1lccietof.R.inc(23111); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23112);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23113);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23114);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23115);assertEquals(expected, result); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23116);result = test.plusMinutes(0); 
     __CLR4_4_1ht1ht1lccietof.R.inc(23117);assertSame(test, result); 
 }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ht1ht1lccietof.R.inc(23118);
            __CLR4_4_1ht1ht1lccietof.R.inc(23119);return COPTIC_UTC;
        }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ht1ht1lccietof.R.inc(23120);
            __CLR4_4_1ht1ht1lccietof.R.inc(23121);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ht1ht1lccietof.R.inc(23122);
            __CLR4_4_1ht1ht1lccietof.R.inc(23123);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1ht1ht1lccietof.R.inc(23124);
        __CLR4_4_1ht1ht1lccietof.R.inc(23125);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ht1ht1lccietof.R.inc(23126);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ht1ht1lccietof.R.inc(23127);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ht1ht1lccietof.R.inc(23128);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1ht1ht1lccietof.R.flushNeeded();}}
}
