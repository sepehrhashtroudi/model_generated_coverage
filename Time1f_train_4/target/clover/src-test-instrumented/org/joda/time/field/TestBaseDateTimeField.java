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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1rtnrtnle6rjdjk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36059);
        __CLR4_4_1rtnrtnle6rjdjk.R.inc(36060);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36061);
        __CLR4_4_1rtnrtnle6rjdjk.R.inc(36062);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1rtnrtnle6rjdjk.R.inc(36064);try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36063);
    }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36065);
    }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36066);
    }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumValue_long380() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1649c5rrtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1649c5rrtv(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36067); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36068);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36069);assertEquals(59, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_constructor381() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccmc4mrty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccmc4mrty(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36070); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36071);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36072);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36073);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36074);field = new MockBaseDateTimeField(null); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36075);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_toString382() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pan3mjru4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pan3mjru4(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36076); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36077);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36078);assertEquals("DateTimeField[secondOfDay]", field.toString()); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_isSupported383() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjiy9qru7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjiy9qru7(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36079); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36080);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36081);assertEquals(true, field.isSupported()); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getAsText_RP_int_Locale384() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18grwymrua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18grwymrua(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36082); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36083);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36084);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36085);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getAsText_RP_Locale385() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdq7vxrue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdq7vxrue(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36086); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36087);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36088);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36089);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale386() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvtic4rui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvtic4rui(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36090); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36091);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36092);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36093);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getAsShortText_long387() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0km98rum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0km98rum(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36094); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36095);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36096);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_roundCeiling_long388() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kyzzmtrup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kyzzmtrup(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36097); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36098);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36099);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36100);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36101);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36102);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36103);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int389() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15f0nrvruw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15f0nrvruw(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36104); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36105);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36106);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36107);BaseDateTimeField field = new MockStandardBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36108);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36109);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36110);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36111);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36112);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36113);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36114);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36115);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36116);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36117);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36118);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36119);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36120);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36121);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36122);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36123);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36124);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36125);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36126);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36127);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36128);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36129);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36130);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36131);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36132);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36133);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36134);values = new int[] { 0, 0 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36135);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36136);field.add(new MockPartial(), 0, values, 1000); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36137);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36138);values = new int[] { 1, 0 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36139);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36140);field.add(new MockPartial(), 0, values, -1000); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36141);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_addWrapField_long_int392() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihdcskrvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihdcskrvy(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36142); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36143);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36144);assertEquals(1029, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36145);assertEquals(1059, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36146);assertEquals(1000, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_addWrapField_RP_int_intarray_int393() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fllwxgrw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fllwxgrw3(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36147); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36148);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36149);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36150);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36151);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36152);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36153);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36154);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36155);result = field.addWrapField(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36156);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36157);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36158);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36159);result = field.addWrapField(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36160);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36161);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36162);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36163);result = field.addWrapField(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36164);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getDifference_long_long394() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p019wvrwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p019wvrwl(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36165); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36166);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36167);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36168);assertEquals(30, field.getDifference(0L, 0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36169);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long395() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14v0rryrwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14v0rryrwq(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36170); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36171);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36172);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36173);assertEquals(30, field.getDifferenceAsLong(0L, 0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36174);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_set_RP_int_intarray_String_Locale396() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n66n7rwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n66n7rwv(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36175); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36176);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36177);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36178);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36179);int[] result = field.set(new TimeOfDay(), 2, values, "30", null); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36180);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36181);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36182);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36183);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36184);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36185);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36186);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36187);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36188);field.set(new TimeOfDay(), 2, values, "60", null); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36189);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36190);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36191);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36192);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36193);try { 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36194);field.set(new TimeOfDay(), 2, values, "-1", null); 
         __CLR4_4_1rtnrtnle6rjdjk.R.inc(36195);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36196);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_set_long_String_Locale397() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mb8pnbrxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mb8pnbrxh(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36197); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36198);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36199);assertEquals(1000, field.set(0L, "0", null)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36200);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_isLeap_long398() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173bkkdrxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173bkkdrxl(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36201); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36202);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36203);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getLeapAmount_long399() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nz70k8rxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nz70k8rxo(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36204); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36205);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36206);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getLeapDurationField400() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4teg6rxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4teg6rxr(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36207); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36208);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36209);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getMaximumTextLength_Locale401() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjfckzrxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjfckzrxu(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36210); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36211);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36212);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36213);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36214); 
             __CLR4_4_1rtnrtnle6rjdjk.R.inc(36215);return 5; 
         }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36216);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36217);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36218); 
             __CLR4_4_1rtnrtnle6rjdjk.R.inc(36219);return 555; 
         }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36220);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36221);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36222); 
             __CLR4_4_1rtnrtnle6rjdjk.R.inc(36223);return 5555; 
         }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36224);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36225);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36226); 
             __CLR4_4_1rtnrtnle6rjdjk.R.inc(36227);return -1; 
         }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36228);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_getMaximumShortTextLength_Locale402() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ua1cskryd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ua1cskryd(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36229); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36230);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36231);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_roundHalfFloor_long403() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqot39ryg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqot39ryg(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36232); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36233);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36234);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36235);assertEquals(0L, field.roundHalfFloor(29L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36236);assertEquals(0L, field.roundHalfFloor(30L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36237);assertEquals(60L, field.roundHalfFloor(31L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36238);assertEquals(60L, field.roundHalfFloor(60L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_roundHalfEven_long404() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5ytg2ryn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5ytg2ryn(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36239); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36240);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36241);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36242);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36243);assertEquals(0L, field.roundHalfEven(30L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36244);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36245);assertEquals(60L, field.roundHalfEven(60L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36246);assertEquals(60L, field.roundHalfEven(89L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36247);assertEquals(120L, field.roundHalfEven(90L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36248);assertEquals(120L, field.roundHalfEven(91L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 


public void test_remainder_long405() {__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceStart(getClass().getName(),36249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxw665ryx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtnrtnle6rjdjk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtnrtnle6rjdjk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxw665ryx(){try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36249); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36250);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36251);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36252);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36253);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36254);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1rtnrtnle6rjdjk.R.inc(36255);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}} 

    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1rtnrtnle6rjdjk.R.inc(36257);try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36256);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1rtnrtnle6rjdjk.R.inc(36259);try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36258);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36260);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36261);return (int) (instant / 60L);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36262);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36263);return 1000 + value;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36264);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36265);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36266);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36267);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36268);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36269);return 0;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36270);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36271);return 59;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36272);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36273);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36274);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36275);return false;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1rtnrtnle6rjdjk.R.inc(36277);try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36276);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36278);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36279);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36280);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36281);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1rtnrtnle6rjdjk.R.inc(36283);try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36282);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36284);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36285);return false;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36286);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36287);return 0;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36288);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36289);return 0;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36290);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36291);return 0;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36292);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36293);return 0;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36294);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36295);add_int++;
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36296);return instant + (value * 60L);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36297);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36298);add_long++;
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36299);return instant + (value * 60L);
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36300);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36301);difference_long++;
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36302);return 30;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36303);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36304);if ((((index == 0)&&(__CLR4_4_1rtnrtnle6rjdjk.R.iget(36305)!=0|true))||(__CLR4_4_1rtnrtnle6rjdjk.R.iget(36306)==0&false))) {{
                __CLR4_4_1rtnrtnle6rjdjk.R.inc(36307);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1rtnrtnle6rjdjk.R.inc(36308);if ((((index == 1)&&(__CLR4_4_1rtnrtnle6rjdjk.R.iget(36309)!=0|true))||(__CLR4_4_1rtnrtnle6rjdjk.R.iget(36310)==0&false))) {{
                __CLR4_4_1rtnrtnle6rjdjk.R.inc(36311);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1rtnrtnle6rjdjk.R.inc(36312);return null;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1rtnrtnle6rjdjk.R.inc(36313);
            __CLR4_4_1rtnrtnle6rjdjk.R.inc(36314);return 2;
        }finally{__CLR4_4_1rtnrtnle6rjdjk.R.flushNeeded();}}
        
    }
}
