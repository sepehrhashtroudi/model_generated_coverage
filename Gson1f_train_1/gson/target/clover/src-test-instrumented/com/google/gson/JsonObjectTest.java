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

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonObject} class.
 *
 * @author Joel Leitch
 */
public class JsonObjectTest extends TestCase {static class __CLR4_4_135c35cle6rxkdz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testAddingAndRemovingObjectProperties206() throws Exception {__CLR4_4_135c35cle6rxkdz.R.globalSliceStart(getClass().getName(),4080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yo7c835c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135c35cle6rxkdz.R.rethrow($CLV_t2$);}finally{__CLR4_4_135c35cle6rxkdz.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingAndRemovingObjectProperties206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yo7c835c() throws Exception{try{__CLR4_4_135c35cle6rxkdz.R.inc(4080); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4081);JsonObject jsonObj = new JsonObject(); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4082);String propertyName = "property"; 
     __CLR4_4_135c35cle6rxkdz.R.inc(4083);assertFalse(jsonObj.has(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4084);assertNull(jsonObj.get(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4085);JsonPrimitive value = new JsonPrimitive("blah"); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4086);jsonObj.add(propertyName, value); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4087);assertEquals(value, jsonObj.get(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4088);JsonElement removedElement = jsonObj.remove(propertyName); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4089);assertEquals(value, removedElement); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4090);assertFalse(jsonObj.has(propertyName)); 
 }finally{__CLR4_4_135c35cle6rxkdz.R.flushNeeded();}} 


public void testAddingNullPropertyValue211() throws Exception {__CLR4_4_135c35cle6rxkdz.R.globalSliceStart(getClass().getName(),4091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p0q135n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135c35cle6rxkdz.R.rethrow($CLV_t2$);}finally{__CLR4_4_135c35cle6rxkdz.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingNullPropertyValue211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p0q135n() throws Exception{try{__CLR4_4_135c35cle6rxkdz.R.inc(4091); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4092);String propertyName = "property"; 
     __CLR4_4_135c35cle6rxkdz.R.inc(4093);JsonObject jsonObj = new JsonObject(); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4094);jsonObj.add(propertyName, null); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4095);assertTrue(jsonObj.has(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4096);JsonElement jsonElement = jsonObj.get(propertyName); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4097);assertNotNull(jsonElement); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4098);assertTrue(jsonElement.isJsonNull()); 
 }finally{__CLR4_4_135c35cle6rxkdz.R.flushNeeded();}} 


public void testAddingBooleanProperties212() throws Exception {__CLR4_4_135c35cle6rxkdz.R.globalSliceStart(getClass().getName(),4099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6xsr635v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135c35cle6rxkdz.R.rethrow($CLV_t2$);}finally{__CLR4_4_135c35cle6rxkdz.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingBooleanProperties212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6xsr635v() throws Exception{try{__CLR4_4_135c35cle6rxkdz.R.inc(4099); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4100);String propertyName = "property"; 
     __CLR4_4_135c35cle6rxkdz.R.inc(4101);JsonObject jsonObj = new JsonObject(); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4102);jsonObj.addProperty(propertyName, true); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4103);assertTrue(jsonObj.has(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4104);JsonElement jsonElement = jsonObj.get(propertyName); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4105);assertNotNull(jsonElement); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4106);assertTrue(jsonElement.getAsBoolean()); 
 }finally{__CLR4_4_135c35cle6rxkdz.R.flushNeeded();}} 


public void testAddingCharacterProperties213() throws Exception {__CLR4_4_135c35cle6rxkdz.R.globalSliceStart(getClass().getName(),4107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnb0s2363();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_135c35cle6rxkdz.R.rethrow($CLV_t2$);}finally{__CLR4_4_135c35cle6rxkdz.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingCharacterProperties213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnb0s2363() throws Exception{try{__CLR4_4_135c35cle6rxkdz.R.inc(4107); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4108);String propertyName = "property"; 
     __CLR4_4_135c35cle6rxkdz.R.inc(4109);char value = 'a'; 
     __CLR4_4_135c35cle6rxkdz.R.inc(4110);JsonObject jsonObj = new JsonObject(); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4111);jsonObj.addProperty(propertyName, value); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4112);assertTrue(jsonObj.has(propertyName)); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4113);JsonElement jsonElement = jsonObj.get(propertyName); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4114);assertNotNull(jsonElement); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4115);assertEquals(String.valueOf(value), jsonElement.getAsString()); 
     __CLR4_4_135c35cle6rxkdz.R.inc(4116);assertEquals(value, jsonElement.getAsCharacter()); 
 }finally{__CLR4_4_135c35cle6rxkdz.R.flushNeeded();}} 

  

  

  

  

  

  

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
   */
  

  /**
   * From issue 227.
   */
  

  
}
