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
public class JsonPrimitiveTest extends TestCase {static class __CLR4_4_133c33cle6p1zxq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testExponential44() throws Exception {__CLR4_4_133c33cle6p1zxq.R.globalSliceStart(getClass().getName(),4008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcfz7q33c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_133c33cle6p1zxq.R.rethrow($CLV_t2$);}finally{__CLR4_4_133c33cle6p1zxq.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testExponential44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcfz7q33c() throws Exception{try{__CLR4_4_133c33cle6p1zxq.R.inc(4008); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4009);JsonPrimitive json = new JsonPrimitive("1E+7"); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4010);assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4011);assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4012);assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4013);try { 
         __CLR4_4_133c33cle6p1zxq.R.inc(4014);json.getAsInt(); 
         __CLR4_4_133c33cle6p1zxq.R.inc(4015);fail("Integers can not handle exponents like this."); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_133c33cle6p1zxq.R.flushNeeded();}}
public void testParsingStringAsNumber45() throws Exception {__CLR4_4_133c33cle6p1zxq.R.globalSliceStart(getClass().getName(),4016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcdqi633k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_133c33cle6p1zxq.R.rethrow($CLV_t2$);}finally{__CLR4_4_133c33cle6p1zxq.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testParsingStringAsNumber45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcdqi633k() throws Exception{try{__CLR4_4_133c33cle6p1zxq.R.inc(4016); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4017);JsonPrimitive json = new JsonPrimitive("1"); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4018);assertFalse(json.isNumber()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4019);assertEquals(1D, json.getAsDouble(), 0.00001); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4020);assertEquals(1F, json.getAsFloat(), 0.00001); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4021);assertEquals(1, json.getAsInt()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4022);assertEquals(1L, json.getAsLong()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4023);assertEquals((short) 1, json.getAsShort()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4024);assertEquals((byte) 1, json.getAsByte()); 
     __CLR4_4_133c33cle6p1zxq.R.inc(4025);assertEquals(new BigInteger("1"), json.getAsBigInteger()); 
 }finally{__CLR4_4_133c33cle6p1zxq.R.flushNeeded();}}
  
  
  
  
  
  
  
  
  
  
  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
}
