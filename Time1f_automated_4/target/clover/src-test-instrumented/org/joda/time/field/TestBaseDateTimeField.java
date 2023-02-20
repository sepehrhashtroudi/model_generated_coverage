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

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for BaseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1lb5lb5le6o7abv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27617);
        __CLR4_4_1lb5lb5le6o7abv.R.inc(27618);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27619);
        __CLR4_4_1lb5lb5le6o7abv.R.inc(27620);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1lb5lb5le6o7abv.R.inc(27622);try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27621);
    }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27623);
    }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27624);
    }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getType152() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0976albd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getType152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0976albd(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27625); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27626);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27627);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsText_long_Locale153() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9mbxslbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long_Locale153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9mbxslbg(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27628); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27629);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27630);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27631);assertEquals("29", field.getAsText(60L * 29, null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsText_long154() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b71c78lbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b71c78lbk(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27632); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27633);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27634);assertEquals("29", field.getAsText(60L * 29)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsText_int_Locale155() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8spwplbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8spwplbn(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27635); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27636);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27637);assertEquals("20", field.getAsText(20, Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27638);assertEquals("20", field.getAsText(20, null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsShortText_RP_int_Locale156() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euerkxlbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_int_Locale156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euerkxlbr(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27639); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27640);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27641);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27642);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsShortText_RP_Locale157() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tu5g0lbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tu5g0lbv(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27643); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27644);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27645);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27646);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getAsShortText_int_Locale158() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mltkowlbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_int_Locale158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mltkowlbz(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27647); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27648);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27649);assertEquals("20", field.getAsShortText(20, Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27650);assertEquals("20", field.getAsShortText(20, null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_roundCeiling_long159() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkrarnlc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkrarnlc3(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27651); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27652);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27653);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27654);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27655);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27656);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27657);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_set_long_String160() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dyuywlca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dyuywlca(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27658); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27659);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27660);assertEquals(1000, field.set(0L, "0")); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27661);assertEquals(1029, field.set(0L, "29")); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_convertText_String_Locale163() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165pg49lce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText_String_Locale163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165pg49lce(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27662); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27663);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27664);assertEquals(5, field.convertText("5", Locale.ENGLISH)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27665);assertEquals(1, field.convertText("1", null)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_getMaximumValue_long164() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqu5mdlci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqu5mdlci(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27666); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27667);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27668);assertEquals(59, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
public void test_roundHalfCeiling_long165() {__CLR4_4_1lb5lb5le6o7abv.R.globalSliceStart(getClass().getName(),27669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anwu5hlcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb5lb5le6o7abv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb5lb5le6o7abv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anwu5hlcl(){try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27669); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27670);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27671);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27672);assertEquals(0L, field.roundHalfCeiling(29L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27673);assertEquals(0L, field.roundHalfCeiling(30L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27674);assertEquals(60L, field.roundHalfCeiling(31L)); 
     __CLR4_4_1lb5lb5le6o7abv.R.inc(27675);assertEquals(60L, field.roundHalfCeiling(60L)); 
 }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
    

    

    

    

    

    

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
    static class MockBaseDateTimeField extends BaseDateTimeField {
        protected MockBaseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1lb5lb5le6o7abv.R.inc(27677);try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27676);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1lb5lb5le6o7abv.R.inc(27679);try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27678);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27680);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27681);return (int) (instant / 60L);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27682);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27683);return 1000 + value;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27684);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27685);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27686);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27687);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27688);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27689);return 0;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27690);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27691);return 59;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27692);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27693);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27694);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27695);return false;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1lb5lb5le6o7abv.R.inc(27697);try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27696);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27698);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27699);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27700);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27701);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lb5lb5le6o7abv.R.inc(27703);try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27702);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27704);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27705);return false;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27706);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27707);return 0;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27708);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27709);return 0;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27710);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27711);return 0;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27712);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27713);return 0;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27714);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27715);add_int++;
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27716);return instant + (value * 60L);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27717);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27718);add_long++;
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27719);return instant + (value * 60L);
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27720);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27721);difference_long++;
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27722);return 30;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27723);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27724);if ((((index == 0)&&(__CLR4_4_1lb5lb5le6o7abv.R.iget(27725)!=0|true))||(__CLR4_4_1lb5lb5le6o7abv.R.iget(27726)==0&false))) {{
                __CLR4_4_1lb5lb5le6o7abv.R.inc(27727);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1lb5lb5le6o7abv.R.inc(27728);if ((((index == 1)&&(__CLR4_4_1lb5lb5le6o7abv.R.iget(27729)!=0|true))||(__CLR4_4_1lb5lb5le6o7abv.R.iget(27730)==0&false))) {{
                __CLR4_4_1lb5lb5le6o7abv.R.inc(27731);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1lb5lb5le6o7abv.R.inc(27732);return null;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1lb5lb5le6o7abv.R.inc(27733);
            __CLR4_4_1lb5lb5le6o7abv.R.inc(27734);return 2;
        }finally{__CLR4_4_1lb5lb5le6o7abv.R.flushNeeded();}}
        
    }
}
