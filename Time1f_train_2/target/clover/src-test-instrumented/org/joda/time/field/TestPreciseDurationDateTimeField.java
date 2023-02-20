/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1s5js5jle6qsfkz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36633,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36487);
        __CLR4_4_1s5js5jle6qsfkz.R.inc(36488);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36489);
        __CLR4_4_1s5js5jle6qsfkz.R.inc(36490);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1s5js5jle6qsfkz.R.inc(36492);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36491);
    }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36493);
    }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36494);
    }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_isLenient1206() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkyfcis5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient1206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkyfcis5r(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36495); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36496);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36497);assertEquals(false, field.isLenient()); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_set_long_int1207() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g73hlxs5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int1207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g73hlxs5u(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36498); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36499);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36500);assertEquals(0, field.set(120L, 0)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36501);assertEquals(29 * 60, field.set(120L, 29)); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_roundFloor_long1208() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14smzdss5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long1208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14smzdss5y(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36502); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36503);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36504);assertEquals(-120L, field.roundFloor(-61L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36505);assertEquals(-60L, field.roundFloor(-60L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36506);assertEquals(-60L, field.roundFloor(-59L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36507);assertEquals(-60L, field.roundFloor(-1L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36508);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36509);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36510);assertEquals(0L, field.roundFloor(29L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36511);assertEquals(0L, field.roundFloor(30L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36512);assertEquals(0L, field.roundFloor(31L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36513);assertEquals(60L, field.roundFloor(60L)); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_roundCeiling_long1209() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4oln4s6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long1209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4oln4s6a(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36514); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36515);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36516);assertEquals(-60L, field.roundCeiling(-61L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36517);assertEquals(-60L, field.roundCeiling(-60L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36518);assertEquals(0L, field.roundCeiling(-59L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36519);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36520);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36521);assertEquals(60L, field.roundCeiling(1L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36522);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36523);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36524);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36525);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_remainder_long1210() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12epn1ys6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long1210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12epn1ys6m(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36526); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36527);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36528);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36529);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36530);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36531);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36532);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_add_long_int1211() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kg83j3s6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int1211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kg83j3s6t(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36533); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36534);MockCountingDurationField.add_int = 0; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36535);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36536);assertEquals(61, field.add(1L, 1)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36537);assertEquals(1, MockCountingDurationField.add_int); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 


public void test_set_RP_int_intarray_int1212() {__CLR4_4_1s5js5jle6qsfkz.R.globalSliceStart(getClass().getName(),36538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0dpjes6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s5js5jle6qsfkz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s5js5jle6qsfkz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int1212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0dpjes6y(){try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36538); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36539);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36540);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36541);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36542);int[] result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36543);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36544);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36545);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36546);result = field.set(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36547);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36548);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36549);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36550);try { 
         __CLR4_4_1s5js5jle6qsfkz.R.inc(36551);field.set(new TimeOfDay(), 2, values, 60); 
         __CLR4_4_1s5js5jle6qsfkz.R.inc(36552);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36553);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36554);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36555);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36556);try { 
         __CLR4_4_1s5js5jle6qsfkz.R.inc(36557);field.set(new TimeOfDay(), 2, values, -1); 
         __CLR4_4_1s5js5jle6qsfkz.R.inc(36558);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s5js5jle6qsfkz.R.inc(36559);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //------------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1s5js5jle6qsfkz.R.inc(36561);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36560);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1s5js5jle6qsfkz.R.inc(36563);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36562);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36564);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36565);return (int) (instant / 60L);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36566);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36567);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36568);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36569);return 59;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1s5js5jle6qsfkz.R.inc(36571);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36570);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36572);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36573);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36574);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36575);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s5js5jle6qsfkz.R.inc(36577);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36576);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36578);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36579);return true;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36580);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36581);return 60;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36582);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36583);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36584);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36585);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36586);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36587);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36588);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36589);add_int++;
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36590);return instant + (value * 60L);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36591);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36592);add_long++;
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36593);return instant + (value * 60L);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36594);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36595);difference_long++;
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36596);return 30;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s5js5jle6qsfkz.R.inc(36598);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36597);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36599);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36600);return true;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36601);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36602);return 0;  // this is zero
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36603);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36604);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36605);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36606);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36607);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36608);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36609);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36610);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36611);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36612);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36613);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36614);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s5js5jle6qsfkz.R.inc(36616);try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36615);
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36617);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36618);return false;  // this is false
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36619);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36620);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36621);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36622);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36623);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36624);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36625);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36626);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36627);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36628);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36629);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36630);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s5js5jle6qsfkz.R.inc(36631);
            __CLR4_4_1s5js5jle6qsfkz.R.inc(36632);return 0;
        }finally{__CLR4_4_1s5js5jle6qsfkz.R.flushNeeded();}}
    }

}
