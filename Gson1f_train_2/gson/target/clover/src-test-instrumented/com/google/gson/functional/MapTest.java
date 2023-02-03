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
import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Functional test for Json serialization and deserialization for Maps
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class MapTest extends TestCase {static class __CLR4_4_148p48pld3ms43g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5533,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_148p48pld3ms43g.R.inc(5497);
    __CLR4_4_148p48pld3ms43g.R.inc(5498);super.setUp();
    __CLR4_4_148p48pld3ms43g.R.inc(5499);gson = new Gson();
  }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}}


public void testMapSerializationWithIntegerKeys101() {__CLR4_4_148p48pld3ms43g.R.globalSliceStart(getClass().getName(),5500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgnavn48s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148p48pld3ms43g.R.rethrow($CLV_t2$);}finally{__CLR4_4_148p48pld3ms43g.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerializationWithIntegerKeys101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgnavn48s(){try{__CLR4_4_148p48pld3ms43g.R.inc(5500); 
     __CLR4_4_148p48pld3ms43g.R.inc(5501);Map<Integer, String> map = new LinkedHashMap<Integer, String>(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5502);map.put(123, "456"); 
     __CLR4_4_148p48pld3ms43g.R.inc(5503);Type typeOfMap = new TypeToken<Map<Integer, String>>() { 
     }.getType(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5504);String json = gson.toJson(map, typeOfMap); 
     __CLR4_4_148p48pld3ms43g.R.inc(5505);assertEquals("{\"123\":\"456\"}", json); 
 }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}} 


public void testSerializeMaps102() {__CLR4_4_148p48pld3ms43g.R.globalSliceStart(getClass().getName(),5506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zcs3948y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148p48pld3ms43g.R.rethrow($CLV_t2$);}finally{__CLR4_4_148p48pld3ms43g.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testSerializeMaps102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zcs3948y(){try{__CLR4_4_148p48pld3ms43g.R.inc(5506); 
     __CLR4_4_148p48pld3ms43g.R.inc(5507);Map<String, Object> map = new LinkedHashMap<String, Object>(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5508);map.put("a", 12); 
     __CLR4_4_148p48pld3ms43g.R.inc(5509);map.put("b", null); 
     __CLR4_4_148p48pld3ms43g.R.inc(5510);map.put("c", new HashMap<String, Object>()); 
     __CLR4_4_148p48pld3ms43g.R.inc(5511);assertEquals("{\"a\":12,\"b\":null,\"c\":{}}", new GsonBuilder().serializeNulls().create().toJson(map)); 
     __CLR4_4_148p48pld3ms43g.R.inc(5512);assertEquals("{\"a\":12,\"b\":null,\"c\":{}}", new GsonBuilder().serializeNulls().create().toJson(map)); 
     __CLR4_4_148p48pld3ms43g.R.inc(5513);assertEquals("{\"a\":12,\"c\":{}}", new GsonBuilder().create().toJson(map)); 
     __CLR4_4_148p48pld3ms43g.R.inc(5514);assertEquals("{\"a\":12,\"c\":{}}", new GsonBuilder().create().toJson(map)); 
 }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}} 


public void testMapDeserializationWithNullKey103() {__CLR4_4_148p48pld3ms43g.R.globalSliceStart(getClass().getName(),5515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdnyfi497();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148p48pld3ms43g.R.rethrow($CLV_t2$);}finally{__CLR4_4_148p48pld3ms43g.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithNullKey103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdnyfi497(){try{__CLR4_4_148p48pld3ms43g.R.inc(5515); 
     __CLR4_4_148p48pld3ms43g.R.inc(5516);Type typeOfMap = new TypeToken<Map<String, Integer>>() { 
     }.getType(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5517);Map<String, Integer> map = gson.fromJson("{\"null\":123}", typeOfMap); 
     __CLR4_4_148p48pld3ms43g.R.inc(5518);assertEquals(1, map.size()); 
     __CLR4_4_148p48pld3ms43g.R.inc(5519);assertNull(map.get(null)); 
 }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}} 


public void testMapSerialization111() {__CLR4_4_148p48pld3ms43g.R.globalSliceStart(getClass().getName(),5520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkfyqa49c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148p48pld3ms43g.R.rethrow($CLV_t2$);}finally{__CLR4_4_148p48pld3ms43g.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapSerialization111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkfyqa49c(){try{__CLR4_4_148p48pld3ms43g.R.inc(5520); 
     __CLR4_4_148p48pld3ms43g.R.inc(5521);Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5522);map.put("a", 1); 
     __CLR4_4_148p48pld3ms43g.R.inc(5523);map.put("b", 2); 
     __CLR4_4_148p48pld3ms43g.R.inc(5524);Type typeOfMap = new TypeToken<Map<String, Integer>>() { 
     }.getType(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5525);String json = gson.toJson(map, typeOfMap); 
     __CLR4_4_148p48pld3ms43g.R.inc(5526);assertTrue(json.contains("\"a\":1")); 
     __CLR4_4_148p48pld3ms43g.R.inc(5527);assertTrue(json.contains("\"b\":2")); 
 }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}} 


public void testMapDeserializationWithWildcardValues150() {__CLR4_4_148p48pld3ms43g.R.globalSliceStart(getClass().getName(),5528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w0gus49k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148p48pld3ms43g.R.rethrow($CLV_t2$);}finally{__CLR4_4_148p48pld3ms43g.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.MapTest.testMapDeserializationWithWildcardValues150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w0gus49k(){try{__CLR4_4_148p48pld3ms43g.R.inc(5528); 
     __CLR4_4_148p48pld3ms43g.R.inc(5529);Type typeOfMap = new TypeToken<Map<String, ? extends Long>>() { 
     }.getType(); 
     __CLR4_4_148p48pld3ms43g.R.inc(5530);Map<String, ? extends Long> map = gson.fromJson("{\"test\":123}", typeOfMap); 
     __CLR4_4_148p48pld3ms43g.R.inc(5531);assertEquals(1, map.size()); 
     __CLR4_4_148p48pld3ms43g.R.inc(5532);assertEquals(new Long(123L), map.get("test")); 
 }finally{__CLR4_4_148p48pld3ms43g.R.flushNeeded();}} 

  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  

  

  private static class MyParameterizedMap<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unused")
    int foo = 10;
  }
  
  
  
  
  
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  private static class ClassWithAMap {
    Map<String, String> map = new TreeMap<String, String>();
  }
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
   */
  
  
  
  
  

  
  private static class MyMap extends LinkedHashMap<String, String> {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unused")
    int foo = 10;
  }
  
  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
   */
  
  
  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
   */
  

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
   */
  
  
  /**
   * From issue 227.
   */
  

  

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
   */
  
}
