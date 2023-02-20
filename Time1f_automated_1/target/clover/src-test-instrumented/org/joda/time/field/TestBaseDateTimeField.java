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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1lujlujle6ndq3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28315);
        __CLR4_4_1lujlujle6ndq3g.R.inc(28316);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28317);
        __CLR4_4_1lujlujle6ndq3g.R.inc(28318);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1lujlujle6ndq3g.R.inc(28320);try{__CLR4_4_1lujlujle6ndq3g.R.inc(28319);
    }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28321);
    }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28322);
    }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_convertText125() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grrsq0lur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grrsq0lur(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28323); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28324);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28325);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28326);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28327);try { 
         __CLR4_4_1lujlujle6ndq3g.R.inc(28328);field.convertText("2A", null); 
         __CLR4_4_1lujlujle6ndq3g.R.inc(28329);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28330);try { 
         __CLR4_4_1lujlujle6ndq3g.R.inc(28331);field.convertText(null, null); 
         __CLR4_4_1lujlujle6ndq3g.R.inc(28332);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getName127() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhh6zblv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getName127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhh6zblv1(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28333); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28334);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28335);assertEquals("DateTimeField[dayOfMonth]", field.getName()); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getAsText_RP_Locale128() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xf5svulv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xf5svulv4(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28336); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28337);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28338);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28339);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_setDayOfMonth136() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lt7dzlv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_setDayOfMonth136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lt7dzlv8(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28340); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28341);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28342);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28343);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28344);int[] result = field.set(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28345);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28346);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28347);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28348);result = field.set(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28349);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28350);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28351);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28352);result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28353);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28354);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28355);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28356);result = field.set(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28357);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_set_RP_int_intarray_int138() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwumrolvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_int138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwumrolvq(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28358); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28359);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28360);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28361);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28362);int[] result = field.set(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28363);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28364);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28365);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28366);result = field.set(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28367);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28368);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28369);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28370);result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28371);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28372);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28373);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28374);result = field.set(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28375);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getLeapAmount_long139() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2p3u4lw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2p3u4lw8(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28376); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28377);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28378);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMinimumValue_RP_intarray140() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se8lsslwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_RP_intarray140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se8lsslwb(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28379); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28380);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28381);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMaximumValue_long141() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol8i50lwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol8i50lwe(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28382); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28383);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28384);assertEquals(0, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMaximumValue_RP_intarray142() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mk2b5clwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP_intarray142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mk2b5clwh(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28385); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28386);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28387);assertEquals(2, field.getMaximumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMaximumValue_RP_intarray144() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t228qalwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP_intarray144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t228qalwk(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28388); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28389);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28390);assertEquals(0, field.getMaximumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMaximumShortTextLength_Locale145() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpu6d4lwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpu6d4lwn(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28391); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28392);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28393);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28394);field = new MockBaseDateTimeField() { 
  
         public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28395); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28396);return 5; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28397);assertEquals(1, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28398);field = new MockBaseDateTimeField() { 
  
         public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28399); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28400);return 555; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28401);assertEquals(3, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28402);field = new MockBaseDateTimeField() { 
  
         public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28403); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28404);return 5555; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28405);assertEquals(4, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28406);field = new MockBaseDateTimeField() { 
  
         public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28407); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28408);return -1; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28409);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_getMaximumShortTextLength_Locale146() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y29wtjlx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y29wtjlx6(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28410); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28411);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28412);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28413);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28414); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28415);return 5; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28416);assertEquals(1, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28417);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28418); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28419);return 555; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28420);assertEquals(3, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28421);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28422); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28423);return 5555; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28424);assertEquals(4, field.getMaximumShortTextLength(Locale.ENGLISH)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28425);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28426); 
             __CLR4_4_1lujlujle6ndq3g.R.inc(28427);return -1; 
         }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28428);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_roundHalfEven_long147() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4qammlxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4qammlxp(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28429); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28430);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28431);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28432);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28433);assertEquals(0L, field.roundHalfEven(30L)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28434);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28435);assertEquals(60L, field.roundHalfEven(60L)); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
public void test_toString148() {__CLR4_4_1lujlujle6ndq3g.R.globalSliceStart(getClass().getName(),28436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1180pwjlxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lujlujle6ndq3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lujlujle6ndq3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1180pwjlxw(){try{__CLR4_4_1lujlujle6ndq3g.R.inc(28436); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28437);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lujlujle6ndq3g.R.inc(28438);assertEquals("DateTimeField[Europe/London]", field.toString()); 
 }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1lujlujle6ndq3g.R.inc(28440);try{__CLR4_4_1lujlujle6ndq3g.R.inc(28439);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1lujlujle6ndq3g.R.inc(28442);try{__CLR4_4_1lujlujle6ndq3g.R.inc(28441);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28443);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28444);return (int) (instant / 60L);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28445);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28446);return 1000 + value;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28447);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28448);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28449);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28450);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28451);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28452);return 0;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28453);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28454);return 59;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28455);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28456);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28457);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28458);return false;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1lujlujle6ndq3g.R.inc(28460);try{__CLR4_4_1lujlujle6ndq3g.R.inc(28459);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28461);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28462);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28463);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28464);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lujlujle6ndq3g.R.inc(28466);try{__CLR4_4_1lujlujle6ndq3g.R.inc(28465);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28467);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28468);return false;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28469);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28470);return 0;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28471);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28472);return 0;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28473);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28474);return 0;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28475);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28476);return 0;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28477);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28478);add_int++;
            __CLR4_4_1lujlujle6ndq3g.R.inc(28479);return instant + (value * 60L);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28480);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28481);add_long++;
            __CLR4_4_1lujlujle6ndq3g.R.inc(28482);return instant + (value * 60L);
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28483);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28484);difference_long++;
            __CLR4_4_1lujlujle6ndq3g.R.inc(28485);return 30;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28486);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28487);if ((((index == 0)&&(__CLR4_4_1lujlujle6ndq3g.R.iget(28488)!=0|true))||(__CLR4_4_1lujlujle6ndq3g.R.iget(28489)==0&false))) {{
                __CLR4_4_1lujlujle6ndq3g.R.inc(28490);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1lujlujle6ndq3g.R.inc(28491);if ((((index == 1)&&(__CLR4_4_1lujlujle6ndq3g.R.iget(28492)!=0|true))||(__CLR4_4_1lujlujle6ndq3g.R.iget(28493)==0&false))) {{
                __CLR4_4_1lujlujle6ndq3g.R.inc(28494);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1lujlujle6ndq3g.R.inc(28495);return null;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1lujlujle6ndq3g.R.inc(28496);
            __CLR4_4_1lujlujle6ndq3g.R.inc(28497);return 2;
        }finally{__CLR4_4_1lujlujle6ndq3g.R.flushNeeded();}}
        
    }
}
