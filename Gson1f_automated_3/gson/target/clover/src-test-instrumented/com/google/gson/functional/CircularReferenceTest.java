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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.ClassOverridingEquals;

/**
 * Functional tests related to circular reference detection and error reporting.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CircularReferenceTest extends TestCase {static class __CLR4_4_13g13g1le6p200k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13g13g1le6p200k.R.inc(4465);
    __CLR4_4_13g13g1le6p200k.R.inc(4466);super.setUp();
    __CLR4_4_13g13g1le6p200k.R.inc(4467);gson = new Gson();
  }finally{__CLR4_4_13g13g1le6p200k.R.flushNeeded();}}

public void testSelfReferenceCustomHandlerSerialization4() throws Exception {__CLR4_4_13g13g1le6p200k.R.globalSliceStart(getClass().getName(),4468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6cq093g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13g13g1le6p200k.R.rethrow($CLV_t2$);}finally{__CLR4_4_13g13g1le6p200k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceCustomHandlerSerialization4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6cq093g4() throws Exception{try{__CLR4_4_13g13g1le6p200k.R.inc(4468); 
     __CLR4_4_13g13g1le6p200k.R.inc(4469);ClassWithSelfReference obj = new ClassWithSelfReference(); 
     __CLR4_4_13g13g1le6p200k.R.inc(4470);obj.child = obj; 
     __CLR4_4_13g13g1le6p200k.R.inc(4471);Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new JsonSerializer<ClassWithSelfReference>() { 
  
         public JsonElement serialize(ClassWithSelfReference src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13g13g1le6p200k.R.inc(4472); 
             __CLR4_4_13g13g1le6p200k.R.inc(4473);JsonObject obj = new JsonObject(); 
             __CLR4_4_13g13g1le6p200k.R.inc(4474);obj.addProperty("property", "value"); 
             __CLR4_4_13g13g1le6p200k.R.inc(4475);obj.add("child", context.serialize(src.child)); 
             __CLR4_4_13g13g1le6p200k.R.inc(4476);return obj; 
         }finally{__CLR4_4_13g13g1le6p200k.R.flushNeeded();}} 
     }).create(); 
     __CLR4_4_13g13g1le6p200k.R.inc(4477);try { 
         __CLR4_4_13g13g1le6p200k.R.inc(4478);gson.toJson(obj); 
         __CLR4_4_13g13g1le6p200k.R.inc(4479);fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
         __CLR4_4_13g13g1le6p200k.R.inc(4480);assertTrue(expected.getMessage().contains("Offending")); 
     } 
 }finally{__CLR4_4_13g13g1le6p200k.R.flushNeeded();}}
  

  

  

  

  

  

  private static class ContainsReferenceToSelfType {
    Collection<ContainsReferenceToSelfType> children = new ArrayList<ContainsReferenceToSelfType>();
  }
  
  private static class ClassWithSelfReference {
    ClassWithSelfReference child;
  }

  private static class ClassWithSelfReferenceArray {
    @SuppressWarnings("unused")
    ClassWithSelfReferenceArray[] children;
  }
}
