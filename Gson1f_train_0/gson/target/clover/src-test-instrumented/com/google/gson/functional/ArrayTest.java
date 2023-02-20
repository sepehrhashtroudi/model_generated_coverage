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
public class ArrayTest extends TestCase {static class __CLR4_4_13q03q0le6rvqnf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,4886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13q03q0le6rvqnf.R.inc(4824);
    __CLR4_4_13q03q0le6rvqnf.R.inc(4825);super.setUp();
    __CLR4_4_13q03q0le6rvqnf.R.inc(4826);gson = new Gson();
  }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}}


public void testArrayOfCollectionDeserialization2() throws Exception {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktxie3q3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfCollectionDeserialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktxie3q3() throws Exception{try{__CLR4_4_13q03q0le6rvqnf.R.inc(4827); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4828);String json = "[[1,2],[3,4]]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4829);Type type = new TypeToken<Collection<Integer>[]>() { 
     }.getType(); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4830);Collection<Integer>[] target = gson.fromJson(json, type); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4831);assertEquals(2, target.length); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4832);MoreAsserts.assertEquals(new Integer[] { 1, 2 }, target[0].toArray(new Integer[0])); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4833);MoreAsserts.assertEquals(new Integer[] { 3, 4 }, target[1].toArray(new Integer[0])); 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testNullsInArraySerialization13() {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ingd4v3qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArraySerialization13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ingd4v3qa(){try{__CLR4_4_13q03q0le6rvqnf.R.inc(4834); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4835);String[] array = { "foo", null, "bar" }; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4836);String expected = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4837);String json = gson.toJson(array); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4838);assertEquals(expected, json); 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testInvalidArrayDeserialization64() {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oz6m83qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testInvalidArrayDeserialization64",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oz6m83qf(){try{__CLR4_4_13q03q0le6rvqnf.R.inc(4839); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4840);String json = "[1, 2 3, 4, 5]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4841);try { 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4842);gson.fromJson(json, int[].class); 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4843);fail("Gson should not deserialize array elements with missing ,"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testArrayWithoutTypeInfoDeserialization78() throws Exception {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khumby3qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayWithoutTypeInfoDeserialization78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khumby3qk() throws Exception{try{__CLR4_4_13q03q0le6rvqnf.R.inc(4844); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4845);String json = "[1,'abc',[1,2],5]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4846);try { 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4847);gson.fromJson(json, Object[].class); 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4848);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testArrayOfObjectsWithoutTypeInfoDeserialization79() throws Exception {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xefida3qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfObjectsWithoutTypeInfoDeserialization79",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xefida3qp() throws Exception{try{__CLR4_4_13q03q0le6rvqnf.R.inc(4849); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4850);String json = "[1,'abc',{a:1},5]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4851);try { 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4852);gson.fromJson(json, Object[].class); 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4853);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testArrayOfStringsDeserialization123() {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tzyuq3qu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfStringsDeserialization123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tzyuq3qu(){try{__CLR4_4_13q03q0le6rvqnf.R.inc(4854); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4855);String json = "[\"Hello\",\"World\"]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4856);String[] target = gson.fromJson(json, String[].class); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4857);assertEquals("Hello", target[0]); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4858);assertEquals("World", target[1]); 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testNullsInArrayDeserialization124() {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2jo2j3qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArrayDeserialization124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2jo2j3qz(){try{__CLR4_4_13q03q0le6rvqnf.R.inc(4859); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4860);String json = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4861);String[] expected = { "foo", null, "bar" }; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4862);String[] target = gson.fromJson(json, expected.getClass()); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4863);for (int i = 0; (((i < expected.length)&&(__CLR4_4_13q03q0le6rvqnf.R.iget(4864)!=0|true))||(__CLR4_4_13q03q0le6rvqnf.R.iget(4865)==0&false)); ++i) {{ 
         __CLR4_4_13q03q0le6rvqnf.R.inc(4866);assertEquals(expected[i], target[i]); 
     } 
 }}finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testArrayOfPrimitivesWithCustomTypeAdapter165() throws Exception {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zh8kj3r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesWithCustomTypeAdapter165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zh8kj3r7() throws Exception{try{__CLR4_4_13q03q0le6rvqnf.R.inc(4867); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4868);CrazyLongTypeAdapter typeAdapter = new CrazyLongTypeAdapter(); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4869);gson = new GsonBuilder().registerTypeAdapter(long.class, typeAdapter).registerTypeAdapter(Long.class, typeAdapter).create(); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4870);long[] value = { 1L }; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4871);String serializedValue = gson.toJson(value); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4872);String expected = "[" + String.valueOf(value[0] + CrazyLongTypeAdapter.DIFFERENCE) + "]"; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4873);assertEquals(expected, serializedValue); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4874);long[] deserializedValue = gson.fromJson(serializedValue, long[].class); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4875);assertEquals(1, deserializedValue.length); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4876);assertEquals(value[0], deserializedValue[0]); 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 


public void testObjectArrayWithNonPrimitivesSerialization166() throws Exception {__CLR4_4_13q03q0le6rvqnf.R.globalSliceStart(getClass().getName(),4877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cokj6b3rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13q03q0le6rvqnf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13q03q0le6rvqnf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testObjectArrayWithNonPrimitivesSerialization166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cokj6b3rh() throws Exception{try{__CLR4_4_13q03q0le6rvqnf.R.inc(4877); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4878);ClassWithObjects classWithObjects = new ClassWithObjects(); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4879);BagOfPrimitives bagOfPrimitives = new BagOfPrimitives(); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4880);String classWithObjectsJson = gson.toJson(classWithObjects); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4881);String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4882);Object[] objects = new Object[] { classWithObjects, bagOfPrimitives }; 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4883);String json = gson.toJson(objects); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4884);assertTrue(json.contains(classWithObjectsJson)); 
     __CLR4_4_13q03q0le6rvqnf.R.inc(4885);assertTrue(json.contains(bagOfPrimitivesJson)); 
 }finally{__CLR4_4_13q03q0le6rvqnf.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
