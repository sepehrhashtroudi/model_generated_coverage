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
public class JsonPrimitiveTest extends TestCase {static class __CLR4_4_1335335ldqypcpt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675576026699L,8589935092L,4014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testExponential88() throws Exception {__CLR4_4_1335335ldqypcpt.R.globalSliceStart(getClass().getName(),4001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhvg56335();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1335335ldqypcpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1335335ldqypcpt.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testExponential88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhvg56335() throws Exception{try{__CLR4_4_1335335ldqypcpt.R.inc(4001); 
     __CLR4_4_1335335ldqypcpt.R.inc(4002);JsonPrimitive json = new JsonPrimitive("1E+7"); 
     __CLR4_4_1335335ldqypcpt.R.inc(4003);assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal()); 
     __CLR4_4_1335335ldqypcpt.R.inc(4004);assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_1335335ldqypcpt.R.inc(4005);assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001); 
     __CLR4_4_1335335ldqypcpt.R.inc(4006);try { 
         __CLR4_4_1335335ldqypcpt.R.inc(4007);json.getAsInt(); 
         __CLR4_4_1335335ldqypcpt.R.inc(4008);fail("Integers can not handle exponents like this."); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_1335335ldqypcpt.R.flushNeeded();}}
public void testFloatEqualsDouble89() {__CLR4_4_1335335ldqypcpt.R.globalSliceStart(getClass().getName(),4009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i03hum33d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1335335ldqypcpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1335335ldqypcpt.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonPrimitiveTest.testFloatEqualsDouble89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i03hum33d(){try{__CLR4_4_1335335ldqypcpt.R.inc(4009); 
     __CLR4_4_1335335ldqypcpt.R.inc(4010);JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F)); 
     __CLR4_4_1335335ldqypcpt.R.inc(4011);JsonPrimitive p2 = new JsonPrimitive(new Double(10.25D)); 
     __CLR4_4_1335335ldqypcpt.R.inc(4012);assertEquals(p1, p2); 
     __CLR4_4_1335335ldqypcpt.R.inc(4013);assertEquals(p1.hashCode(), p2.hashCode()); 
 }finally{__CLR4_4_1335335ldqypcpt.R.flushNeeded();}}
  
  
  
  
  
  
  
  
  
  
  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
}
