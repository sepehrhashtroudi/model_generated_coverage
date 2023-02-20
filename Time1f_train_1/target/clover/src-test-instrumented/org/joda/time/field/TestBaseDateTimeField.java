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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1rqprqple6qeal2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rqprqple6qeal2.R.inc(35953);
        __CLR4_4_1rqprqple6qeal2.R.inc(35954);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rqprqple6qeal2.R.inc(35955);
        __CLR4_4_1rqprqple6qeal2.R.inc(35956);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1rqprqple6qeal2.R.inc(35958);try{__CLR4_4_1rqprqple6qeal2.R.inc(35957);
    }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rqprqple6qeal2.R.inc(35959);
    }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rqprqple6qeal2.R.inc(35960);
    }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_convertText375() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j14tr9rqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j14tr9rqx(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35961); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35962);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35963);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35964);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35965);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(35966);field.convertText("2A", null); 
         __CLR4_4_1rqprqple6qeal2.R.inc(35967);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rqprqple6qeal2.R.inc(35968);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(35969);field.convertText(null, null); 
         __CLR4_4_1rqprqple6qeal2.R.inc(35970);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_isSupported376() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc1werr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc1werr7(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35971); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35972);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35973);assertEquals(true, field.isSupported()); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsText_long377() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152xlyfrra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152xlyfrra(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35974); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35975);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35976);assertEquals("29", field.getAsText(60L * 29)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsText_RP_int_Locale378() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6myc9rrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6myc9rrd(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35977); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35978);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35979);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35980);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsText_int_Locale379() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3whd1rrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3whd1rrh(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35981); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35982);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35983);assertEquals("80", field.getAsText(80, Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35984);assertEquals("80", field.getAsText(80, null)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale380() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snaqw6rrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snaqw6rrl(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35985); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35986);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35987);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35988);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsShortText_long381() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19iktierrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19iktierrp(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35989); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35990);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35991);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getAsShortText_RP_Locale382() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15flleyrrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15flleyrrs(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35992); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35993);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35994);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35995);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_roundCeiling_long383() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),35996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xt48dyrrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xt48dyrrw(){try{__CLR4_4_1rqprqple6qeal2.R.inc(35996); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35997);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35998);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(35999);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36000);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36001);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36002);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_add_long_long384() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m60cqqrs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m60cqqrs3(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36003); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36004);MockCountingDurationField.add_long = 0; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36005);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36006);assertEquals(61, field.add(1L, 1L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36007);assertEquals(1, MockCountingDurationField.add_long); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int385() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17kz7e1rs8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17kz7e1rs8(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36008); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36009);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36010);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36011);BaseDateTimeField field = new MockStandardBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36012);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36013);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36014);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36015);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36016);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36017);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36018);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36019);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36020);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36021);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36022);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36023);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(36024);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1rqprqple6qeal2.R.inc(36025);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rqprqple6qeal2.R.inc(36026);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36027);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36028);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36029);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36030);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36031);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36032);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36033);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36034);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36035);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(36036);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1rqprqple6qeal2.R.inc(36037);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rqprqple6qeal2.R.inc(36038);values = new int[] { 0, 0 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36039);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(36040);field.add(new MockPartial(), 0, values, 1000); 
         __CLR4_4_1rqprqple6qeal2.R.inc(36041);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rqprqple6qeal2.R.inc(36042);values = new int[] { 1, 0 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36043);try { 
         __CLR4_4_1rqprqple6qeal2.R.inc(36044);field.add(new MockPartial(), 0, values, -1000); 
         __CLR4_4_1rqprqple6qeal2.R.inc(36045);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_addWrapField_long_int388() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189i8zvrta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189i8zvrta(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36046); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36047);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36048);assertEquals(1029, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36049);assertEquals(1059, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36050);assertEquals(1000, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_addWrapField_RP_int_intarray_int389() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pth0q5rtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pth0q5rtf(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36051); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36052);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36053);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36054);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36055);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36056);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36057);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36058);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36059);result = field.addWrapField(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36060);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36061);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36062);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36063);result = field.addWrapField(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36064);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36065);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36066);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36067);result = field.addWrapField(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36068);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_set_long_String_Locale390() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvksirtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvksirtx(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36069); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36070);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36071);assertEquals(1000, field.set(0L, "0", null)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36072);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_set_long_String391() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohq3ooru1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohq3ooru1(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36073); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36074);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36075);assertEquals(1000, field.set(0L, "0")); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36076);assertEquals(1029, field.set(0L, "29")); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_isLeap_long392() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceo86hru5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceo86hru5(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36077); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36078);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36079);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getLeapDurationField393() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcxwnzru8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcxwnzru8(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36080); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36081);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36082);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getMinimumValue_long394() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8rmo6rub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8rmo6rub(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36083); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36084);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36085);assertEquals(0, field.getMinimumValue(0L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_getMaximumTextLength_Locale395() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2avkprue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2avkprue(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36086); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36087);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36088);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36089);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36090); 
             __CLR4_4_1rqprqple6qeal2.R.inc(36091);return 5; 
         }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36092);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36093);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36094); 
             __CLR4_4_1rqprqple6qeal2.R.inc(36095);return 555; 
         }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36096);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36097);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36098); 
             __CLR4_4_1rqprqple6qeal2.R.inc(36099);return 5555; 
         }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36100);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36101);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36102); 
             __CLR4_4_1rqprqple6qeal2.R.inc(36103);return -1; 
         }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rqprqple6qeal2.R.inc(36104);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_roundHalfFloor_long396() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vikavgrux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vikavgrux(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36105); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36106);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36107);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36108);assertEquals(0L, field.roundHalfFloor(29L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36109);assertEquals(0L, field.roundHalfFloor(30L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36110);assertEquals(60L, field.roundHalfFloor(31L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36111);assertEquals(60L, field.roundHalfFloor(60L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_roundHalfCeiling_long397() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0o1nqrv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0o1nqrv4(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36112); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36113);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36114);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36115);assertEquals(0L, field.roundHalfCeiling(29L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36116);assertEquals(60L, field.roundHalfCeiling(30L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36117);assertEquals(60L, field.roundHalfCeiling(31L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36118);assertEquals(60L, field.roundHalfCeiling(60L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 


public void test_remainder_long398() {__CLR4_4_1rqprqple6qeal2.R.globalSliceStart(getClass().getName(),36119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c60odyrvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rqprqple6qeal2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rqprqple6qeal2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c60odyrvb(){try{__CLR4_4_1rqprqple6qeal2.R.inc(36119); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36120);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36121);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36122);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36123);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36124);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1rqprqple6qeal2.R.inc(36125);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}} 

    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1rqprqple6qeal2.R.inc(36127);try{__CLR4_4_1rqprqple6qeal2.R.inc(36126);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1rqprqple6qeal2.R.inc(36129);try{__CLR4_4_1rqprqple6qeal2.R.inc(36128);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36130);
            __CLR4_4_1rqprqple6qeal2.R.inc(36131);return (int) (instant / 60L);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36132);
            __CLR4_4_1rqprqple6qeal2.R.inc(36133);return 1000 + value;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36134);
            __CLR4_4_1rqprqple6qeal2.R.inc(36135);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36136);
            __CLR4_4_1rqprqple6qeal2.R.inc(36137);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36138);
            __CLR4_4_1rqprqple6qeal2.R.inc(36139);return 0;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36140);
            __CLR4_4_1rqprqple6qeal2.R.inc(36141);return 59;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36142);
            __CLR4_4_1rqprqple6qeal2.R.inc(36143);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36144);
            __CLR4_4_1rqprqple6qeal2.R.inc(36145);return false;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1rqprqple6qeal2.R.inc(36147);try{__CLR4_4_1rqprqple6qeal2.R.inc(36146);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36148);
            __CLR4_4_1rqprqple6qeal2.R.inc(36149);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36150);
            __CLR4_4_1rqprqple6qeal2.R.inc(36151);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1rqprqple6qeal2.R.inc(36153);try{__CLR4_4_1rqprqple6qeal2.R.inc(36152);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36154);
            __CLR4_4_1rqprqple6qeal2.R.inc(36155);return false;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36156);
            __CLR4_4_1rqprqple6qeal2.R.inc(36157);return 0;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36158);
            __CLR4_4_1rqprqple6qeal2.R.inc(36159);return 0;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36160);
            __CLR4_4_1rqprqple6qeal2.R.inc(36161);return 0;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36162);
            __CLR4_4_1rqprqple6qeal2.R.inc(36163);return 0;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36164);
            __CLR4_4_1rqprqple6qeal2.R.inc(36165);add_int++;
            __CLR4_4_1rqprqple6qeal2.R.inc(36166);return instant + (value * 60L);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36167);
            __CLR4_4_1rqprqple6qeal2.R.inc(36168);add_long++;
            __CLR4_4_1rqprqple6qeal2.R.inc(36169);return instant + (value * 60L);
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36170);
            __CLR4_4_1rqprqple6qeal2.R.inc(36171);difference_long++;
            __CLR4_4_1rqprqple6qeal2.R.inc(36172);return 30;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1rqprqple6qeal2.R.inc(36173);
            __CLR4_4_1rqprqple6qeal2.R.inc(36174);if ((((index == 0)&&(__CLR4_4_1rqprqple6qeal2.R.iget(36175)!=0|true))||(__CLR4_4_1rqprqple6qeal2.R.iget(36176)==0&false))) {{
                __CLR4_4_1rqprqple6qeal2.R.inc(36177);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1rqprqple6qeal2.R.inc(36178);if ((((index == 1)&&(__CLR4_4_1rqprqple6qeal2.R.iget(36179)!=0|true))||(__CLR4_4_1rqprqple6qeal2.R.iget(36180)==0&false))) {{
                __CLR4_4_1rqprqple6qeal2.R.inc(36181);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1rqprqple6qeal2.R.inc(36182);return null;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1rqprqple6qeal2.R.inc(36183);
            __CLR4_4_1rqprqple6qeal2.R.inc(36184);return 2;
        }finally{__CLR4_4_1rqprqple6qeal2.R.flushNeeded();}}
        
    }
}
