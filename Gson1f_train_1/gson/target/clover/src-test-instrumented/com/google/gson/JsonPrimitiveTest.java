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
public class JsonPrimitiveTest extends TestCase {static class __CLR4_4_1377377le6rxkel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testBoolean128() throws Exception {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11loiag377();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testBoolean128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11loiag377() throws Exception{try{__CLR4_4_1377377le6rxkel.R.inc(4147); 
     __CLR4_4_1377377le6rxkel.R.inc(4148);JsonPrimitive json = new JsonPrimitive(Boolean.TRUE); 
     __CLR4_4_1377377le6rxkel.R.inc(4149);assertTrue(json.isBoolean()); 
     __CLR4_4_1377377le6rxkel.R.inc(4150);assertTrue(json.getAsBoolean()); 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 


public void testShortEqualsInteger198() {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177x3ya37b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testShortEqualsInteger198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177x3ya37b(){try{__CLR4_4_1377377le6rxkel.R.inc(4151); 
     __CLR4_4_1377377le6rxkel.R.inc(4152);JsonPrimitive p1 = new JsonPrimitive(new Short((short) 10)); 
     __CLR4_4_1377377le6rxkel.R.inc(4153);JsonPrimitive p2 = new JsonPrimitive(new Integer(10)); 
     __CLR4_4_1377377le6rxkel.R.inc(4154);assertEquals(p1, p2); 
     __CLR4_4_1377377le6rxkel.R.inc(4155);assertEquals(p1.hashCode(), p2.hashCode()); 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 


public void testExponential199() throws Exception {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132fplx37g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testExponential199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132fplx37g() throws Exception{try{__CLR4_4_1377377le6rxkel.R.inc(4156); 
     __CLR4_4_1377377le6rxkel.R.inc(4157);JsonPrimitive json = new JsonPrimitive("1E+7"); 
     __CLR4_4_1377377le6rxkel.R.inc(4158);assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal()); 
     __CLR4_4_1377377le6rxkel.R.inc(4159);assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_1377377le6rxkel.R.inc(4160);assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_1377377le6rxkel.R.inc(4161);try { 
         __CLR4_4_1377377le6rxkel.R.inc(4162);json.getAsInt(); 
         __CLR4_4_1377377le6rxkel.R.inc(4163);fail("Integers can not handle exponents like this."); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 


public void testStringsAndChar200() throws Exception {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtzobo37o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testStringsAndChar200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtzobo37o() throws Exception{try{__CLR4_4_1377377le6rxkel.R.inc(4164); 
     __CLR4_4_1377377le6rxkel.R.inc(4165);JsonPrimitive json = new JsonPrimitive("abc"); 
     __CLR4_4_1377377le6rxkel.R.inc(4166);assertTrue(json.isString()); 
     __CLR4_4_1377377le6rxkel.R.inc(4167);assertEquals('a', json.getAsCharacter()); 
     __CLR4_4_1377377le6rxkel.R.inc(4168);assertEquals("abc", json.getAsString()); 
     __CLR4_4_1377377le6rxkel.R.inc(4169);json = new JsonPrimitive('z'); 
     __CLR4_4_1377377le6rxkel.R.inc(4170);assertTrue(json.isString()); 
     __CLR4_4_1377377le6rxkel.R.inc(4171);assertEquals('z', json.getAsCharacter()); 
     __CLR4_4_1377377le6rxkel.R.inc(4172);assertEquals("z", json.getAsString()); 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 


public void testValidJsonOnToString204() throws Exception {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w66axs37x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testValidJsonOnToString204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w66axs37x() throws Exception{try{__CLR4_4_1377377le6rxkel.R.inc(4173); 
     __CLR4_4_1377377le6rxkel.R.inc(4174);JsonPrimitive json = new JsonPrimitive("Some\nEscaped\nValue"); 
     __CLR4_4_1377377le6rxkel.R.inc(4175);assertEquals("\"Some\\nEscaped\\nValue\"", json.toString()); 
     __CLR4_4_1377377le6rxkel.R.inc(4176);json = new JsonPrimitive(new BigDecimal("1.333")); 
     __CLR4_4_1377377le6rxkel.R.inc(4177);assertEquals("1.333", json.toString()); 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 


public void testFloatEqualsDouble205() {__CLR4_4_1377377le6rxkel.R.globalSliceStart(getClass().getName(),4178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l52dno382();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1377377le6rxkel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1377377le6rxkel.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testFloatEqualsDouble205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l52dno382(){try{__CLR4_4_1377377le6rxkel.R.inc(4178); 
     __CLR4_4_1377377le6rxkel.R.inc(4179);JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F)); 
     __CLR4_4_1377377le6rxkel.R.inc(4180);JsonPrimitive p2 = new JsonPrimitive(new Double(10.25D)); 
     __CLR4_4_1377377le6rxkel.R.inc(4181);assertEquals(p1, p2); 
     __CLR4_4_1377377le6rxkel.R.inc(4182);assertEquals(p1.hashCode(), p2.hashCode()); 
 }finally{__CLR4_4_1377377le6rxkel.R.flushNeeded();}} 

  
  
  
  
  
  
  
  
  
  
  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
}
