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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1tdftdflc8axexr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38067);
        __CLR4_4_1tdftdflc8axexr.R.inc(38068);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38069);
        __CLR4_4_1tdftdflc8axexr.R.inc(38070);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1tdftdflc8axexr.R.inc(38072);try{__CLR4_4_1tdftdflc8axexr.R.inc(38071);
    }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tdftdflc8axexr.R.inc(38073);
    }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tdftdflc8axexr.R.inc(38074);
    }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_set_RP_int_intarray_String_Locale126() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ov17mtdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ov17mtdn(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38075); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38076);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38077);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38078);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38079);int[] result = field.set(new TimeOfDay(), 2, values, "30", null); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38080);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38081);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38082);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38083);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38084);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38085);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38086);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38087);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38088);field.set(new TimeOfDay(), 2, values, "60", null); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38089);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38090);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38091);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38092);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38093);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38094);field.set(new TimeOfDay(), 2, values, "-1", null); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38095);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38096);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int194() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5l437te9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5l437te9(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38097); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38098);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38099);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38100);BaseDateTimeField field = new MockStandardBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38101);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38102);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38103);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38104);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38105);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38106);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38107);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38108);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38109);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38110);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38111);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38112);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38113);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38114);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38115);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38116);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38117);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38118);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38119);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38120);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38121);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38122);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38123);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38124);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38125);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38126);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38127);values = new int[] { 0, 0 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38128);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38129);field.add(new MockPartial(), 0, values, 1000); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38130);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38131);values = new int[] { 1, 0 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38132);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38133);field.add(new MockPartial(), 0, values, -1000); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38134);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsShortText_long197() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180z5g7tfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180z5g7tfb(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38135); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38136);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38137);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getMaximumTextLength_Locale199() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hslmontfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hslmontfe(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38138); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38139);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38140);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38141);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38142); 
             __CLR4_4_1tdftdflc8axexr.R.inc(38143);return 5; 
         }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 
     }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38144);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38145);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38146); 
             __CLR4_4_1tdftdflc8axexr.R.inc(38147);return 555; 
         }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 
     }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38148);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38149);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38150); 
             __CLR4_4_1tdftdflc8axexr.R.inc(38151);return 5555; 
         }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 
     }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38152);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38153);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38154); 
             __CLR4_4_1tdftdflc8axexr.R.inc(38155);return -1; 
         }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 
     }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38156);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_roundCeiling_long218() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drtgn3tfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drtgn3tfx(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38157); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38158);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38159);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38160);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38161);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38162);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38163);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_convertText247() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jisjttg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jisjttg4(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38164); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38165);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38166);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38167);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38168);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38169);field.convertText("2A", null); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38170);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tdftdflc8axexr.R.inc(38171);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38172);field.convertText(null, null); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38173);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsText_long286() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xon8kktge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xon8kktge(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38174); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38175);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38176);assertEquals("29", field.getAsText(60L * 29)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsText_int_Locale371() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ux7uabtgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ux7uabtgh(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38177); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38178);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38179);assertEquals("80", field.getAsText(80, Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38180);assertEquals("80", field.getAsText(80, null)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_roundHalfFloor_long394() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0jtiqtgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0jtiqtgl(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38181); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38182);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38183);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38184);assertEquals(0L, field.roundHalfFloor(29L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38185);assertEquals(0L, field.roundHalfFloor(30L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38186);assertEquals(60L, field.roundHalfFloor(31L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38187);assertEquals(60L, field.roundHalfFloor(60L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_set_long_String_Locale514() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1mztctgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1mztctgs(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38188); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38189);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38190);assertEquals(1000, field.set(0L, "0", null)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38191);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale598() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192by27tgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192by27tgw(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38192); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38193);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38194);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38195);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_toString693() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j665luth0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString693",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j665luth0(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38196); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38197);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38198);assertEquals("DateTimeField[secondOfDay]", field.toString()); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_remainder_long704() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ac4sfth3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long704",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ac4sfth3(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38199); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38200);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38201);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38202);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38203);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38204);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38205);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getMaximumValue_long804() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg1zq6tha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long804",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg1zq6tha(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38206); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38207);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38208);assertEquals(59, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsText_RP_Locale821() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149ssp2thd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale821",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149ssp2thd(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38209); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38210);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38211);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38212);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getMaximumShortTextLength_Locale880() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knwzeythh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale880",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knwzeythh(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38213); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38214);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38215);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsShortText_RP_Locale898() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1x7l8thk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale898",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1x7l8thk(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38216); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38217);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38218);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38219);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getLeapDurationField1052() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snvpvctho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snvpvctho(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38220); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38221);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38222);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_isSupported1054() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad2rmsthr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad2rmsthr(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38223); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38224);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38225);assertEquals(true, field.isSupported()); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long1090() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyixhtthu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long1090",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyixhtthu(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38226); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38227);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38228);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38229);assertEquals(30, field.getDifferenceAsLong(0L, 0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38230);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_addWrapField_RP_int_intarray_int1125() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r85k0ethz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int1125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r85k0ethz(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38231); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38232);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38233);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38234);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38235);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38236);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38237);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38238);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38239);result = field.addWrapField(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38240);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38241);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38242);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38243);result = field.addWrapField(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38244);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38245);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38246);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38247);result = field.addWrapField(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38248);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getDifference_long_long1141() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufcm3atih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long1141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufcm3atih(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38249); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38250);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38251);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38252);assertEquals(30, field.getDifference(0L, 0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38253);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_roundHalfCeiling_long1189() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119890mtim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long1189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119890mtim(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38254); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38255);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38256);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38257);assertEquals(0L, field.roundHalfCeiling(29L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38258);assertEquals(60L, field.roundHalfCeiling(30L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38259);assertEquals(60L, field.roundHalfCeiling(31L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38260);assertEquals(60L, field.roundHalfCeiling(60L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_addWrapField_long_int1243() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmuz1mtit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmuz1mtit(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38261); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38262);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38263);assertEquals(1029, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38264);assertEquals(1059, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38265);assertEquals(1000, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_constructor1285() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179f9qqtiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor1285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179f9qqtiy(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38266); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38267);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38268);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38269);try { 
         __CLR4_4_1tdftdflc8axexr.R.inc(38270);field = new MockBaseDateTimeField(null); 
         __CLR4_4_1tdftdflc8axexr.R.inc(38271);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getLeapAmount_long1440() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129mvhktj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long1440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129mvhktj4(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38272); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38273);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38274);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_set_long_String1488() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywv4bwtj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String1488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywv4bwtj7(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38275); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38276);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38277);assertEquals(1000, field.set(0L, "0")); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38278);assertEquals(1029, field.set(0L, "29")); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getMinimumValue_long1547() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tmddvtjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long1547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tmddvtjb(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38279); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38280);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38281);assertEquals(0, field.getMinimumValue(0L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_isLeap_long1580() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4zqaptje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long1580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4zqaptje(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38282); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38283);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38284);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_getAsText_RP_int_Locale1644() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hwydctjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale1644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hwydctjh(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38285); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38286);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38287);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38288);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null)); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 


public void test_add_long_long1675() {__CLR4_4_1tdftdflc8axexr.R.globalSliceStart(getClass().getName(),38289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxoqrmtjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tdftdflc8axexr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tdftdflc8axexr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long1675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxoqrmtjl(){try{__CLR4_4_1tdftdflc8axexr.R.inc(38289); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38290);MockCountingDurationField.add_long = 0; 
     __CLR4_4_1tdftdflc8axexr.R.inc(38291);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38292);assertEquals(61, field.add(1L, 1L)); 
     __CLR4_4_1tdftdflc8axexr.R.inc(38293);assertEquals(1, MockCountingDurationField.add_long); 
 }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}} 

    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1tdftdflc8axexr.R.inc(38295);try{__CLR4_4_1tdftdflc8axexr.R.inc(38294);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1tdftdflc8axexr.R.inc(38297);try{__CLR4_4_1tdftdflc8axexr.R.inc(38296);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38298);
            __CLR4_4_1tdftdflc8axexr.R.inc(38299);return (int) (instant / 60L);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38300);
            __CLR4_4_1tdftdflc8axexr.R.inc(38301);return 1000 + value;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38302);
            __CLR4_4_1tdftdflc8axexr.R.inc(38303);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38304);
            __CLR4_4_1tdftdflc8axexr.R.inc(38305);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38306);
            __CLR4_4_1tdftdflc8axexr.R.inc(38307);return 0;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38308);
            __CLR4_4_1tdftdflc8axexr.R.inc(38309);return 59;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38310);
            __CLR4_4_1tdftdflc8axexr.R.inc(38311);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38312);
            __CLR4_4_1tdftdflc8axexr.R.inc(38313);return false;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1tdftdflc8axexr.R.inc(38315);try{__CLR4_4_1tdftdflc8axexr.R.inc(38314);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38316);
            __CLR4_4_1tdftdflc8axexr.R.inc(38317);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38318);
            __CLR4_4_1tdftdflc8axexr.R.inc(38319);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tdftdflc8axexr.R.inc(38321);try{__CLR4_4_1tdftdflc8axexr.R.inc(38320);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38322);
            __CLR4_4_1tdftdflc8axexr.R.inc(38323);return false;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38324);
            __CLR4_4_1tdftdflc8axexr.R.inc(38325);return 0;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38326);
            __CLR4_4_1tdftdflc8axexr.R.inc(38327);return 0;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38328);
            __CLR4_4_1tdftdflc8axexr.R.inc(38329);return 0;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38330);
            __CLR4_4_1tdftdflc8axexr.R.inc(38331);return 0;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38332);
            __CLR4_4_1tdftdflc8axexr.R.inc(38333);add_int++;
            __CLR4_4_1tdftdflc8axexr.R.inc(38334);return instant + (value * 60L);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38335);
            __CLR4_4_1tdftdflc8axexr.R.inc(38336);add_long++;
            __CLR4_4_1tdftdflc8axexr.R.inc(38337);return instant + (value * 60L);
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38338);
            __CLR4_4_1tdftdflc8axexr.R.inc(38339);difference_long++;
            __CLR4_4_1tdftdflc8axexr.R.inc(38340);return 30;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1tdftdflc8axexr.R.inc(38341);
            __CLR4_4_1tdftdflc8axexr.R.inc(38342);if ((((index == 0)&&(__CLR4_4_1tdftdflc8axexr.R.iget(38343)!=0|true))||(__CLR4_4_1tdftdflc8axexr.R.iget(38344)==0&false))) {{
                __CLR4_4_1tdftdflc8axexr.R.inc(38345);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1tdftdflc8axexr.R.inc(38346);if ((((index == 1)&&(__CLR4_4_1tdftdflc8axexr.R.iget(38347)!=0|true))||(__CLR4_4_1tdftdflc8axexr.R.iget(38348)==0&false))) {{
                __CLR4_4_1tdftdflc8axexr.R.inc(38349);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1tdftdflc8axexr.R.inc(38350);return null;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1tdftdflc8axexr.R.inc(38351);
            __CLR4_4_1tdftdflc8axexr.R.inc(38352);return 2;
        }finally{__CLR4_4_1tdftdflc8axexr.R.flushNeeded();}}
        
    }
}
