/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonPrimitive} class.
 * 
 * @author Joel Leitch
 */
public class JsonPrimitiveTest extends TestCase {static class __CLR4_4_135z35zld3ms3wi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,4145,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testBoolean132() throws Exception {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18m6li935z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testBoolean132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18m6li935z() throws Exception{try{__CLR4_4_135z35zld3ms3wi.R.inc(4103); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4104);JsonPrimitive json = new JsonPrimitive(Boolean.TRUE); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4105);assertTrue(json.isBoolean()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4106);assertTrue(json.getAsBoolean()); 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 


public void testExponential199() throws Exception {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132fplx363();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testExponential199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132fplx363() throws Exception{try{__CLR4_4_135z35zld3ms3wi.R.inc(4107); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4108);JsonPrimitive json = new JsonPrimitive("1E+7"); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4109);assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4110);assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4111);assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4112);try { 
         __CLR4_4_135z35zld3ms3wi.R.inc(4113);json.getAsInt(); 
         __CLR4_4_135z35zld3ms3wi.R.inc(4114);fail("Integers can not handle exponents like this."); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 


public void testStringsAndChar200() throws Exception {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtzobo36b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testStringsAndChar200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtzobo36b() throws Exception{try{__CLR4_4_135z35zld3ms3wi.R.inc(4115); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4116);JsonPrimitive json = new JsonPrimitive("abc"); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4117);assertTrue(json.isString()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4118);assertEquals('a', json.getAsCharacter()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4119);assertEquals("abc", json.getAsString()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4120);json = new JsonPrimitive('z'); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4121);assertTrue(json.isString()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4122);assertEquals('z', json.getAsCharacter()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4123);assertEquals("z", json.getAsString()); 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 


public void testParsingStringAsNumber205() throws Exception {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9ahsc36k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testParsingStringAsNumber205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9ahsc36k() throws Exception{try{__CLR4_4_135z35zld3ms3wi.R.inc(4124); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4125);JsonPrimitive json = new JsonPrimitive("1"); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4126);assertFalse(json.isNumber()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4127);assertEquals(1D, json.getAsDouble(), 0.00001); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4128);assertEquals(1F, json.getAsFloat(), 0.00001); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4129);assertEquals(1, json.getAsInt()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4130);assertEquals(1L, json.getAsLong()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4131);assertEquals((short) 1, json.getAsShort()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4132);assertEquals((byte) 1, json.getAsByte()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4133);assertEquals(new BigInteger("1"), json.getAsBigInteger()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4134);assertEquals(new BigDecimal("1"), json.getAsBigDecimal()); 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 


public void testValidJsonOnToString206() throws Exception {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1po6dcu36v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testValidJsonOnToString206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1po6dcu36v() throws Exception{try{__CLR4_4_135z35zld3ms3wi.R.inc(4135); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4136);JsonPrimitive json = new JsonPrimitive("Some\nEscaped\nValue"); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4137);assertEquals("\"Some\\nEscaped\\nValue\"", json.toString()); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4138);json = new JsonPrimitive(new BigDecimal("1.333")); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4139);assertEquals("1.333", json.toString()); 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 


public void testFloatEqualsDouble207() {__CLR4_4_135z35zld3ms3wi.R.globalSliceStart(getClass().getName(),4140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn2b8m370();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135z35zld3ms3wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_135z35zld3ms3wi.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testFloatEqualsDouble207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn2b8m370(){try{__CLR4_4_135z35zld3ms3wi.R.inc(4140); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4141);JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F)); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4142);JsonPrimitive p2 = new JsonPrimitive(new Double(10.25D)); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4143);assertEquals(p1, p2); 
     __CLR4_4_135z35zld3ms3wi.R.inc(4144);assertEquals(p1.hashCode(), p2.hashCode()); 
 }finally{__CLR4_4_135z35zld3ms3wi.R.flushNeeded();}} 

  
  
  
  
  
  
  
  
  
  
  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
}
