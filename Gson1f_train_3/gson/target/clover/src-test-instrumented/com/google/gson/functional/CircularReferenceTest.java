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
public class CircularReferenceTest extends TestCase {static class __CLR4_4_13rl3rlle6rzgvk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13rl3rlle6rzgvk.R.inc(4881);
    __CLR4_4_13rl3rlle6rzgvk.R.inc(4882);super.setUp();
    __CLR4_4_13rl3rlle6rzgvk.R.inc(4883);gson = new Gson();
  }finally{__CLR4_4_13rl3rlle6rzgvk.R.flushNeeded();}}


public void testSelfReferenceArrayFieldSerialization9() throws Exception {__CLR4_4_13rl3rlle6rzgvk.R.globalSliceStart(getClass().getName(),4884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156cf9a3ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rl3rlle6rzgvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rl3rlle6rzgvk.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceArrayFieldSerialization9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156cf9a3ro() throws Exception{try{__CLR4_4_13rl3rlle6rzgvk.R.inc(4884); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4885);ClassWithSelfReferenceArray objA = new ClassWithSelfReferenceArray(); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4886);objA.children = new ClassWithSelfReferenceArray[] { objA }; 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4887);try { 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4888);gson.toJson(objA); 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4889);fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4890);assertTrue(expected.getMessage().contains("children")); 
     } 
 }finally{__CLR4_4_13rl3rlle6rzgvk.R.flushNeeded();}} 


public void testSelfReferenceSerialization11() throws Exception {__CLR4_4_13rl3rlle6rzgvk.R.globalSliceStart(getClass().getName(),4891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwx4fq3rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rl3rlle6rzgvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rl3rlle6rzgvk.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceSerialization11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwx4fq3rv() throws Exception{try{__CLR4_4_13rl3rlle6rzgvk.R.inc(4891); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4892);ClassOverridingEquals objA = new ClassOverridingEquals(); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4893);objA.ref = objA; 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4894);try { 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4895);gson.toJson(objA); 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4896);fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_13rl3rlle6rzgvk.R.flushNeeded();}} 


public void testSelfReferenceCustomHandlerSerialization13() throws Exception {__CLR4_4_13rl3rlle6rzgvk.R.globalSliceStart(getClass().getName(),4897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ss9r9p3s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rl3rlle6rzgvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rl3rlle6rzgvk.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceCustomHandlerSerialization13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ss9r9p3s1() throws Exception{try{__CLR4_4_13rl3rlle6rzgvk.R.inc(4897); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4898);ClassWithSelfReference obj = new ClassWithSelfReference(); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4899);obj.child = obj; 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4900);Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new JsonSerializer<ClassWithSelfReference>() { 
  
         public JsonElement serialize(ClassWithSelfReference src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13rl3rlle6rzgvk.R.inc(4901); 
             __CLR4_4_13rl3rlle6rzgvk.R.inc(4902);JsonObject obj = new JsonObject(); 
             __CLR4_4_13rl3rlle6rzgvk.R.inc(4903);obj.addProperty("property", "value"); 
             __CLR4_4_13rl3rlle6rzgvk.R.inc(4904);obj.add("child", context.serialize(src.child)); 
             __CLR4_4_13rl3rlle6rzgvk.R.inc(4905);return obj; 
         }finally{__CLR4_4_13rl3rlle6rzgvk.R.flushNeeded();}} 
     }).create(); 
     __CLR4_4_13rl3rlle6rzgvk.R.inc(4906);try { 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4907);gson.toJson(obj); 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4908);fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
         __CLR4_4_13rl3rlle6rzgvk.R.inc(4909);assertTrue(expected.getMessage().contains("Offending")); 
     } 
 }finally{__CLR4_4_13rl3rlle6rzgvk.R.flushNeeded();}} 

  

  

  

  

  

  

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
