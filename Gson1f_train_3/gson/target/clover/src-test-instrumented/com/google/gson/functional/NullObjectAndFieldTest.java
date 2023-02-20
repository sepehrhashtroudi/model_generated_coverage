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
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithObjects;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Functional tests for the different cases for serializing (or ignoring) null fields and object.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NullObjectAndFieldTest extends TestCase {static class __CLR4_4_14ba4bale6rzgzr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5637,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private GsonBuilder gsonBuilder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14ba4bale6rzgzr.R.inc(5590);
    __CLR4_4_14ba4bale6rzgzr.R.inc(5591);super.setUp();
    __CLR4_4_14ba4bale6rzgzr.R.inc(5592);gsonBuilder = new GsonBuilder().serializeNulls();
  }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}}


public void testPrintPrintingObjectWithNulls15() throws Exception {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3e2ou4bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testPrintPrintingObjectWithNulls15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3e2ou4bd() throws Exception{try{__CLR4_4_14ba4bale6rzgzr.R.inc(5593); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5594);gsonBuilder = new GsonBuilder(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5595);Gson gson = gsonBuilder.create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5596);String result = gson.toJson(new ClassWithMembers()); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5597);assertEquals("{}", result); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5598);gson = gsonBuilder.serializeNulls().create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5599);result = gson.toJson(new ClassWithMembers()); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5600);assertTrue(result.contains("\"str\":null")); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 


public void testExplicitNullSetsFieldToNullDuringDeserialization76() {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wv6ui4bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitNullSetsFieldToNullDuringDeserialization76",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wv6ui4bl(){try{__CLR4_4_14ba4bale6rzgzr.R.inc(5601); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5602);Gson gson = new Gson(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5603);String json = "{value:null}"; 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5604);ObjectWithField obj = gson.fromJson(json, ObjectWithField.class); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5605);assertNull(obj.value); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 


public void testTopLevelNullObjectSerialization156() {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzjqnk4bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testTopLevelNullObjectSerialization156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzjqnk4bq(){try{__CLR4_4_14ba4bale6rzgzr.R.inc(5606); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5607);Gson gson = gsonBuilder.create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5608);String actual = gson.toJson(null); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5609);assertEquals("null", actual); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5610);actual = gson.toJson(null, String.class); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5611);assertEquals("null", actual); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 


public void testCustomTypeAdapterPassesNullSerialization167() {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o17dmn4bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testCustomTypeAdapterPassesNullSerialization167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o17dmn4bw(){try{__CLR4_4_14ba4bale6rzgzr.R.inc(5612); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5613);Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new JsonSerializer<ObjectWithField>() { 
  
         public JsonElement serialize(ObjectWithField src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_14ba4bale6rzgzr.R.inc(5614); 
             __CLR4_4_14ba4bale6rzgzr.R.inc(5615);return context.serialize(null); 
         }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 
     }).create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5616);ObjectWithField target = new ObjectWithField(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5617);target.value = "value1"; 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5618);String json = gson.toJson(target); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5619);assertFalse(json.contains("value1")); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 


public void testCustomSerializationOfNulls168() {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1oh5a4c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testCustomSerializationOfNulls168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1oh5a4c4(){try{__CLR4_4_14ba4bale6rzgzr.R.inc(5620); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5621);gsonBuilder.registerTypeAdapter(ClassWithObjects.class, new ClassWithObjectsSerializer()); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5622);Gson gson = gsonBuilder.create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5623);ClassWithObjects target = new ClassWithObjects(new BagOfPrimitives()); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5624);String actual = gson.toJson(target); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5625);String expected = "{\"bag\":null}"; 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5626);assertEquals(expected, actual); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 


public void testExplicitSerializationOfNulls169() {__CLR4_4_14ba4bale6rzgzr.R.globalSliceStart(getClass().getName(),5627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x6j0w4cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ba4bale6rzgzr.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ba4bale6rzgzr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNulls169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x6j0w4cb(){try{__CLR4_4_14ba4bale6rzgzr.R.inc(5627); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5628);Gson gson = gsonBuilder.create(); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5629);ClassWithObjects target = new ClassWithObjects(null); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5630);String actual = gson.toJson(target); 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5631);String expected = "{\"bag\":null}"; 
     __CLR4_4_14ba4bale6rzgzr.R.inc(5632);assertEquals(expected, actual); 
 }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}} 

  

  

  

  
  
  
  
  /** 
   * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
   */
  
  
  /** 
   * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
   */
  
  
  
  
  

  
  
  
  
  

  private static class ClassWithNullWrappedPrimitive {
    private Long value;
  }

  @SuppressWarnings("unused")
  private static class ClassWithMembers {
    String str;
    int[] array;
    Collection<String> col;
  }
  
  private static class ClassWithObjectsSerializer implements JsonSerializer<ClassWithObjects> {
    public JsonElement serialize(ClassWithObjects src, Type typeOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_14ba4bale6rzgzr.R.inc(5633);
      __CLR4_4_14ba4bale6rzgzr.R.inc(5634);JsonObject obj = new JsonObject();
      __CLR4_4_14ba4bale6rzgzr.R.inc(5635);obj.add("bag", new JsonNull());
      __CLR4_4_14ba4bale6rzgzr.R.inc(5636);return obj;
    }finally{__CLR4_4_14ba4bale6rzgzr.R.flushNeeded();}}
  }

  

  

  

  private static class ObjectWithField {
    String value = "";
  }
}
