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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1tzptzplc8axez7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39037,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38869);
        __CLR4_4_1tzptzplc8axez7.R.inc(38870);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38871);
        __CLR4_4_1tzptzplc8axez7.R.inc(38872);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1tzptzplc8axez7.R.inc(38874);try{__CLR4_4_1tzptzplc8axez7.R.inc(38873);
    }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tzptzplc8axez7.R.inc(38875);
    }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tzptzplc8axez7.R.inc(38876);
    }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_convertText189() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150f2satzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150f2satzx(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38877); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38878);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38879);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38880);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38881);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38882);field.convertText("2A", null); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38883);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tzptzplc8axez7.R.inc(38884);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38885);field.convertText(null, null); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38886);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_set_RP_int_intarray_int307() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh3f1cu07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh3f1cu07(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38887); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38888);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38889);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38890);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38891);int[] result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38892);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38893);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38894);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38895);result = field.set(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38896);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38897);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38898);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38899);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38900);field.set(new TimeOfDay(), 2, values, 60); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38901);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tzptzplc8axez7.R.inc(38902);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38903);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38904);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38905);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38906);field.set(new TimeOfDay(), 2, values, -1); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38907);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tzptzplc8axez7.R.inc(38908);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_remainder_long308() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stqrenu0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stqrenu0t(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38909); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38910);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38911);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38912);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38913);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38914);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38915);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_roundFloor_long547() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e77fxru10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e77fxru10(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38916); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38917);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38918);assertEquals(-120L, field.roundFloor(-61L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38919);assertEquals(-60L, field.roundFloor(-60L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38920);assertEquals(-60L, field.roundFloor(-59L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38921);assertEquals(-60L, field.roundFloor(-1L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38922);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38923);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38924);assertEquals(0L, field.roundFloor(29L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38925);assertEquals(0L, field.roundFloor(30L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38926);assertEquals(0L, field.roundFloor(31L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38927);assertEquals(60L, field.roundFloor(60L)); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_isLenient708() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a56efuu1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient708",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a56efuu1c(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38928); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38929);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38930);assertEquals(false, field.isLenient()); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_roundCeiling_long724() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17q7vkvu1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17q7vkvu1f(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38931); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38932);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38933);assertEquals(-60L, field.roundCeiling(-61L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38934);assertEquals(-60L, field.roundCeiling(-60L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38935);assertEquals(0L, field.roundCeiling(-59L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38936);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38937);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38938);assertEquals(60L, field.roundCeiling(1L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38939);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38940);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38941);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38942);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_set_long_int818() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7jbn4u1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int818",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7jbn4u1r(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38943); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38944);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38945);assertEquals(0, field.set(120L, 0)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38946);assertEquals(29 * 60, field.set(120L, 29)); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_constructor1727() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5rkapu1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor1727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5rkapu1v(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38947); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38948);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38949);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38950);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38951);field = new MockPreciseDurationDateTimeField(null, null); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38952);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tzptzplc8axez7.R.inc(38953);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38954);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38955);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tzptzplc8axez7.R.inc(38956);try { 
         __CLR4_4_1tzptzplc8axez7.R.inc(38957);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1tzptzplc8axez7.R.inc(38958);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 


public void test_add_long_int1740() {__CLR4_4_1tzptzplc8axez7.R.globalSliceStart(getClass().getName(),38959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onfc2ou27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tzptzplc8axez7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tzptzplc8axez7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int1740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onfc2ou27(){try{__CLR4_4_1tzptzplc8axez7.R.inc(38959); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38960);MockCountingDurationField.add_int = 0; 
     __CLR4_4_1tzptzplc8axez7.R.inc(38961);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38962);assertEquals(61, field.add(1L, 1)); 
     __CLR4_4_1tzptzplc8axez7.R.inc(38963);assertEquals(1, MockCountingDurationField.add_int); 
 }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1tzptzplc8axez7.R.inc(38965);try{__CLR4_4_1tzptzplc8axez7.R.inc(38964);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1tzptzplc8axez7.R.inc(38967);try{__CLR4_4_1tzptzplc8axez7.R.inc(38966);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38968);
            __CLR4_4_1tzptzplc8axez7.R.inc(38969);return (int) (instant / 60L);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38970);
            __CLR4_4_1tzptzplc8axez7.R.inc(38971);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38972);
            __CLR4_4_1tzptzplc8axez7.R.inc(38973);return 59;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1tzptzplc8axez7.R.inc(38975);try{__CLR4_4_1tzptzplc8axez7.R.inc(38974);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38976);
            __CLR4_4_1tzptzplc8axez7.R.inc(38977);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38978);
            __CLR4_4_1tzptzplc8axez7.R.inc(38979);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tzptzplc8axez7.R.inc(38981);try{__CLR4_4_1tzptzplc8axez7.R.inc(38980);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38982);
            __CLR4_4_1tzptzplc8axez7.R.inc(38983);return true;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tzptzplc8axez7.R.inc(38984);
            __CLR4_4_1tzptzplc8axez7.R.inc(38985);return 60;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38986);
            __CLR4_4_1tzptzplc8axez7.R.inc(38987);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38988);
            __CLR4_4_1tzptzplc8axez7.R.inc(38989);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38990);
            __CLR4_4_1tzptzplc8axez7.R.inc(38991);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38992);
            __CLR4_4_1tzptzplc8axez7.R.inc(38993);add_int++;
            __CLR4_4_1tzptzplc8axez7.R.inc(38994);return instant + (value * 60L);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38995);
            __CLR4_4_1tzptzplc8axez7.R.inc(38996);add_long++;
            __CLR4_4_1tzptzplc8axez7.R.inc(38997);return instant + (value * 60L);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(38998);
            __CLR4_4_1tzptzplc8axez7.R.inc(38999);difference_long++;
            __CLR4_4_1tzptzplc8axez7.R.inc(39000);return 30;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tzptzplc8axez7.R.inc(39002);try{__CLR4_4_1tzptzplc8axez7.R.inc(39001);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tzptzplc8axez7.R.inc(39003);
            __CLR4_4_1tzptzplc8axez7.R.inc(39004);return true;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tzptzplc8axez7.R.inc(39005);
            __CLR4_4_1tzptzplc8axez7.R.inc(39006);return 0;  // this is zero
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39007);
            __CLR4_4_1tzptzplc8axez7.R.inc(39008);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39009);
            __CLR4_4_1tzptzplc8axez7.R.inc(39010);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39011);
            __CLR4_4_1tzptzplc8axez7.R.inc(39012);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39013);
            __CLR4_4_1tzptzplc8axez7.R.inc(39014);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39015);
            __CLR4_4_1tzptzplc8axez7.R.inc(39016);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39017);
            __CLR4_4_1tzptzplc8axez7.R.inc(39018);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tzptzplc8axez7.R.inc(39020);try{__CLR4_4_1tzptzplc8axez7.R.inc(39019);
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tzptzplc8axez7.R.inc(39021);
            __CLR4_4_1tzptzplc8axez7.R.inc(39022);return false;  // this is false
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tzptzplc8axez7.R.inc(39023);
            __CLR4_4_1tzptzplc8axez7.R.inc(39024);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39025);
            __CLR4_4_1tzptzplc8axez7.R.inc(39026);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39027);
            __CLR4_4_1tzptzplc8axez7.R.inc(39028);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39029);
            __CLR4_4_1tzptzplc8axez7.R.inc(39030);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39031);
            __CLR4_4_1tzptzplc8axez7.R.inc(39032);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39033);
            __CLR4_4_1tzptzplc8axez7.R.inc(39034);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tzptzplc8axez7.R.inc(39035);
            __CLR4_4_1tzptzplc8axez7.R.inc(39036);return 0;
        }finally{__CLR4_4_1tzptzplc8axez7.R.flushNeeded();}}
    }

}
