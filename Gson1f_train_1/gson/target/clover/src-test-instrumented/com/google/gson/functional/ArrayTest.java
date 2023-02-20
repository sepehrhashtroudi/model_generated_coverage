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
import com.google.gson.JsonParseException;
import com.google.gson.common.MoreAsserts;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithObjects;
import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
/**
 * Functional tests for Json serialization and deserialization of arrays.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ArrayTest extends TestCase {static class __CLR4_4_13qr3qrle6rxkma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13qr3qrle6rxkma.R.inc(4851);
    __CLR4_4_13qr3qrle6rxkma.R.inc(4852);super.setUp();
    __CLR4_4_13qr3qrle6rxkma.R.inc(4853);gson = new Gson();
  }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}}


public void testArrayOfCollectionDeserialization2() throws Exception {__CLR4_4_13qr3qrle6rxkma.R.globalSliceStart(getClass().getName(),4854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktxie3qu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qr3qrle6rxkma.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qr3qrle6rxkma.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfCollectionDeserialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktxie3qu() throws Exception{try{__CLR4_4_13qr3qrle6rxkma.R.inc(4854); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4855);String json = "[[1,2],[3,4]]"; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4856);Type type = new TypeToken<Collection<Integer>[]>() { 
     }.getType(); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4857);Collection<Integer>[] target = gson.fromJson(json, type); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4858);assertEquals(2, target.length); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4859);MoreAsserts.assertEquals(new Integer[] { 1, 2 }, target[0].toArray(new Integer[0])); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4860);MoreAsserts.assertEquals(new Integer[] { 3, 4 }, target[1].toArray(new Integer[0])); 
 }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}} 


public void testTopLevelArrayOfIntsSerialization9() {__CLR4_4_13qr3qrle6rxkma.R.globalSliceStart(getClass().getName(),4861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsxzvn3r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qr3qrle6rxkma.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qr3qrle6rxkma.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testTopLevelArrayOfIntsSerialization9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsxzvn3r1(){try{__CLR4_4_13qr3qrle6rxkma.R.inc(4861); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4862);int[] target = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4863);assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target)); 
 }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}} 


public void testNullsInArraySerialization13() {__CLR4_4_13qr3qrle6rxkma.R.globalSliceStart(getClass().getName(),4864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ingd4v3r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qr3qrle6rxkma.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qr3qrle6rxkma.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArraySerialization13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ingd4v3r4(){try{__CLR4_4_13qr3qrle6rxkma.R.inc(4864); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4865);String[] array = { "foo", null, "bar" }; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4866);String expected = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4867);String json = gson.toJson(array); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4868);assertEquals(expected, json); 
 }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}} 


public void testArrayOfPrimitivesWithCustomTypeAdapter160() throws Exception {__CLR4_4_13qr3qrle6rxkma.R.globalSliceStart(getClass().getName(),4869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9ildu3r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qr3qrle6rxkma.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qr3qrle6rxkma.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesWithCustomTypeAdapter160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9ildu3r9() throws Exception{try{__CLR4_4_13qr3qrle6rxkma.R.inc(4869); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4870);CrazyLongTypeAdapter typeAdapter = new CrazyLongTypeAdapter(); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4871);gson = new GsonBuilder().registerTypeAdapter(long.class, typeAdapter).registerTypeAdapter(Long.class, typeAdapter).create(); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4872);long[] value = { 1L }; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4873);String serializedValue = gson.toJson(value); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4874);String expected = "[" + String.valueOf(value[0] + CrazyLongTypeAdapter.DIFFERENCE) + "]"; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4875);assertEquals(expected, serializedValue); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4876);long[] deserializedValue = gson.fromJson(serializedValue, long[].class); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4877);assertEquals(1, deserializedValue.length); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4878);assertEquals(value[0], deserializedValue[0]); 
 }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}} 


public void testObjectArrayWithNonPrimitivesSerialization161() throws Exception {__CLR4_4_13qr3qrle6rxkma.R.globalSliceStart(getClass().getName(),4879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kfas23rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qr3qrle6rxkma.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qr3qrle6rxkma.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testObjectArrayWithNonPrimitivesSerialization161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kfas23rj() throws Exception{try{__CLR4_4_13qr3qrle6rxkma.R.inc(4879); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4880);ClassWithObjects classWithObjects = new ClassWithObjects(); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4881);BagOfPrimitives bagOfPrimitives = new BagOfPrimitives(); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4882);String classWithObjectsJson = gson.toJson(classWithObjects); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4883);String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4884);Object[] objects = new Object[] { classWithObjects, bagOfPrimitives }; 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4885);String json = gson.toJson(objects); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4886);assertTrue(json.contains(classWithObjectsJson)); 
     __CLR4_4_13qr3qrle6rxkma.R.inc(4887);assertTrue(json.contains(bagOfPrimitivesJson)); 
 }finally{__CLR4_4_13qr3qrle6rxkma.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
