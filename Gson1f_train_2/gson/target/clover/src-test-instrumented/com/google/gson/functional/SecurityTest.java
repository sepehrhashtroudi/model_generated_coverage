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

package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Tests for security-related aspects of Gson
 * 
 * @author Inderjeet Singh
 */
public class SecurityTest extends TestCase {static class __CLR4_4_14n94n9ld3ms464{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,6038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  /**
   * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX
   */
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";

  private GsonBuilder gsonBuilder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14n94n9ld3ms464.R.inc(6021);
    __CLR4_4_14n94n9ld3ms464.R.inc(6022);super.setUp();
    __CLR4_4_14n94n9ld3ms464.R.inc(6023);gsonBuilder = new GsonBuilder();
  }finally{__CLR4_4_14n94n9ld3ms464.R.flushNeeded();}}


public void testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization76() {__CLR4_4_14n94n9ld3ms464.R.globalSliceStart(getClass().getName(),6024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojz33a4nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n94n9ld3ms464.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n94n9ld3ms464.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization76",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojz33a4nc(){try{__CLR4_4_14n94n9ld3ms464.R.inc(6024); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6025);Gson gson = gsonBuilder.generateNonExecutableJson().create(); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6026);String json = JSON_NON_EXECUTABLE_PREFIX + "{intValue:2,stringValue:')]}\\u0027\\n'}"; 
     __CLR4_4_14n94n9ld3ms464.R.inc(6027);BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6028);assertEquals(")]}'\n", target.stringValue); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6029);assertEquals(2, target.intValue); 
 }finally{__CLR4_4_14n94n9ld3ms464.R.flushNeeded();}} 


public void testNonExecutableJsonSerialization158() {__CLR4_4_14n94n9ld3ms464.R.globalSliceStart(getClass().getName(),6030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oun1884ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n94n9ld3ms464.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n94n9ld3ms464.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testNonExecutableJsonSerialization158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oun1884ni(){try{__CLR4_4_14n94n9ld3ms464.R.inc(6030); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6031);Gson gson = gsonBuilder.generateNonExecutableJson().create(); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6032);String json = gson.toJson(new BagOfPrimitives()); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6033);assertTrue(json.startsWith(JSON_NON_EXECUTABLE_PREFIX)); 
 }finally{__CLR4_4_14n94n9ld3ms464.R.flushNeeded();}} 


public void testJsonWithNonExectuableTokenSerialization182() {__CLR4_4_14n94n9ld3ms464.R.globalSliceStart(getClass().getName(),6034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145rghu4nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n94n9ld3ms464.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n94n9ld3ms464.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenSerialization182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145rghu4nm(){try{__CLR4_4_14n94n9ld3ms464.R.inc(6034); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6035);Gson gson = gsonBuilder.generateNonExecutableJson().create(); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6036);String json = gson.toJson(JSON_NON_EXECUTABLE_PREFIX); 
     __CLR4_4_14n94n9ld3ms464.R.inc(6037);assertTrue(json.contains(")]}'\n")); 
 }finally{__CLR4_4_14n94n9ld3ms464.R.flushNeeded();}} 

  
  
  
  
  
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token even if it is created
   *  without {@link GsonBuilder#generateNonExecutableJson()}.
   */
    
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token if it is created
   *  with {@link GsonBuilder#generateNonExecutableJson()}.
   */
    
}
