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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1s8ts8tle6rcmy4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36773,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36605);
        __CLR4_4_1s8ts8tle6rcmy4.R.inc(36606);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36607);
        __CLR4_4_1s8ts8tle6rcmy4.R.inc(36608);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1s8ts8tle6rcmy4.R.inc(36610);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36609);
    }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36611);
    }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36612);
    }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_convertText1209() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoevz8s91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText1209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoevz8s91(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36613); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36614);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36615);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36616);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36617);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36618);field.convertText("2A", null); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36619);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36620);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36621);field.convertText(null, null); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36622);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_constructor1210() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13x8q30s9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor1210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13x8q30s9b(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36623); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36624);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36625);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36626);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36627);field = new MockPreciseDurationDateTimeField(null, null); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36628);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36629);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36630);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36631);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36632);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36633);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36634);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_isLenient1211() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j43crcs9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient1211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j43crcs9n(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36635); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36636);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36637);assertEquals(false, field.isLenient()); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_set_long_int1212() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnyk73s9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int1212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnyk73s9q(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36638); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36639);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36640);assertEquals(0, field.set(120L, 0)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36641);assertEquals(29 * 60, field.set(120L, 29)); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_roundFloor_long1213() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18o837es9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long1213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18o837es9u(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36642); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36643);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36644);assertEquals(-120L, field.roundFloor(-61L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36645);assertEquals(-60L, field.roundFloor(-60L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36646);assertEquals(-60L, field.roundFloor(-59L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36647);assertEquals(-60L, field.roundFloor(-1L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36648);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36649);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36650);assertEquals(0L, field.roundFloor(29L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36651);assertEquals(0L, field.roundFloor(30L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36652);assertEquals(0L, field.roundFloor(31L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36653);assertEquals(60L, field.roundFloor(60L)); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_roundCeiling_long1214() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofkdqusa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long1214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofkdqusa6(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36654); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36655);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36656);assertEquals(-60L, field.roundCeiling(-61L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36657);assertEquals(-60L, field.roundCeiling(-60L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36658);assertEquals(0L, field.roundCeiling(-59L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36659);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36660);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36661);assertEquals(60L, field.roundCeiling(1L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36662);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36663);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36664);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36665);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_remainder_long1215() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dua6wfsai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long1215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dua6wfsai(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36666); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36667);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36668);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36669);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36670);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36671);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36672);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_add_long_int1216() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybw4hosap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybw4hosap(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36673); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36674);MockCountingDurationField.add_int = 0; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36675);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36676);assertEquals(61, field.add(1L, 1)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36677);assertEquals(1, MockCountingDurationField.add_int); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 


public void test_set_RP_int_intarray_int1217() {__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceStart(getClass().getName(),36678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9djhrsau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8ts8tle6rcmy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8ts8tle6rcmy4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int1217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9djhrsau(){try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36678); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36679);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36680);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36681);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36682);int[] result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36683);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36684);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36685);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36686);result = field.set(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36687);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36688);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36689);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36690);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36691);field.set(new TimeOfDay(), 2, values, 60); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36692);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36693);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36694);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36695);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36696);try { 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36697);field.set(new TimeOfDay(), 2, values, -1); 
         __CLR4_4_1s8ts8tle6rcmy4.R.inc(36698);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8ts8tle6rcmy4.R.inc(36699);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1s8ts8tle6rcmy4.R.inc(36701);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36700);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1s8ts8tle6rcmy4.R.inc(36703);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36702);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36704);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36705);return (int) (instant / 60L);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36706);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36707);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36708);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36709);return 59;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1s8ts8tle6rcmy4.R.inc(36711);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36710);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36712);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36713);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36714);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36715);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s8ts8tle6rcmy4.R.inc(36717);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36716);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36718);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36719);return true;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36720);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36721);return 60;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36722);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36723);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36724);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36725);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36726);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36727);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36728);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36729);add_int++;
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36730);return instant + (value * 60L);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36731);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36732);add_long++;
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36733);return instant + (value * 60L);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36734);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36735);difference_long++;
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36736);return 30;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s8ts8tle6rcmy4.R.inc(36738);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36737);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36739);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36740);return true;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36741);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36742);return 0;  // this is zero
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36743);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36744);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36745);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36746);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36747);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36748);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36749);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36750);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36751);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36752);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36753);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36754);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s8ts8tle6rcmy4.R.inc(36756);try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36755);
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36757);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36758);return false;  // this is false
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36759);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36760);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36761);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36762);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36763);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36764);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36765);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36766);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36767);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36768);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36769);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36770);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8ts8tle6rcmy4.R.inc(36771);
            __CLR4_4_1s8ts8tle6rcmy4.R.inc(36772);return 0;
        }finally{__CLR4_4_1s8ts8tle6rcmy4.R.flushNeeded();}}
    }

}
