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
public class ArrayTest extends TestCase {static class __CLR4_4_13oy3oyld3ms3zd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,4851,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4786);
    __CLR4_4_13oy3oyld3ms3zd.R.inc(4787);super.setUp();
    __CLR4_4_13oy3oyld3ms3zd.R.inc(4788);gson = new Gson();
  }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}}


public void testArrayOfCollectionDeserialization1() throws Exception {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o61a33p1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfCollectionDeserialization1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o61a33p1() throws Exception{try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4789); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4790);String json = "[[1,2],[3,4]]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4791);Type type = new TypeToken<Collection<Integer>[]>() { 
     }.getType(); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4792);Collection<Integer>[] target = gson.fromJson(json, type); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4793);assertEquals(2, target.length); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4794);MoreAsserts.assertEquals(new Integer[] { 1, 2 }, target[0].toArray(new Integer[0])); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4795);MoreAsserts.assertEquals(new Integer[] { 3, 4 }, target[1].toArray(new Integer[0])); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testTopLevelArrayOfIntsSerialization7() {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fay2ap3p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testTopLevelArrayOfIntsSerialization7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fay2ap3p8(){try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4796); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4797);int[] target = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4798);assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target)); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testNullsInArraySerialization10() {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wggrg3pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArraySerialization10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wggrg3pb(){try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4799); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4800);String[] array = { "foo", null, "bar" }; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4801);String expected = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4802);String json = gson.toJson(array); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4803);assertEquals(expected, json); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testInvalidArrayDeserialization61() {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1420pr73pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testInvalidArrayDeserialization61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1420pr73pg(){try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4804); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4805);String json = "[1, 2 3, 4, 5]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4806);try { 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4807);gson.fromJson(json, int[].class); 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4808);fail("Gson should not deserialize array elements with missing ,"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testArrayWithoutTypeInfoDeserialization77() throws Exception {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8unjh3pl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayWithoutTypeInfoDeserialization77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8unjh3pl() throws Exception{try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4809); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4810);String json = "[1,'abc',[1,2],5]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4811);try { 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4812);gson.fromJson(json, Object[].class); 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4813);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testArrayOfObjectsWithoutTypeInfoDeserialization78() throws Exception {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5fjkt3pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfObjectsWithoutTypeInfoDeserialization78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5fjkt3pq() throws Exception{try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4814); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4815);String json = "[1,'abc',{a:1},5]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4816);try { 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4817);gson.fromJson(json, Object[].class); 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4818);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testArrayOfStringsDeserialization126() {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wzxip3pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfStringsDeserialization126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wzxip3pv(){try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4819); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4820);String json = "[\"Hello\",\"World\"]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4821);String[] target = gson.fromJson(json, String[].class); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4822);assertEquals("Hello", target[0]); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4823);assertEquals("World", target[1]); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testNullsInArrayDeserialization127() {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbjrp43q0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArrayDeserialization127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbjrp43q0(){try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4824); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4825);String json = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4826);String[] expected = { "foo", null, "bar" }; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4827);String[] target = gson.fromJson(json, expected.getClass()); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4828);for (int i = 0; (((i < expected.length)&&(__CLR4_4_13oy3oyld3ms3zd.R.iget(4829)!=0|true))||(__CLR4_4_13oy3oyld3ms3zd.R.iget(4830)==0&false)); ++i) {{ 
         __CLR4_4_13oy3oyld3ms3zd.R.inc(4831);assertEquals(expected[i], target[i]); 
     } 
 }}finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testArrayOfPrimitivesWithCustomTypeAdapter164() throws Exception {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19iq7y3q8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfPrimitivesWithCustomTypeAdapter164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19iq7y3q8() throws Exception{try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4832); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4833);CrazyLongTypeAdapter typeAdapter = new CrazyLongTypeAdapter(); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4834);gson = new GsonBuilder().registerTypeAdapter(long.class, typeAdapter).registerTypeAdapter(Long.class, typeAdapter).create(); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4835);long[] value = { 1L }; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4836);String serializedValue = gson.toJson(value); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4837);String expected = "[" + String.valueOf(value[0] + CrazyLongTypeAdapter.DIFFERENCE) + "]"; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4838);assertEquals(expected, serializedValue); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4839);long[] deserializedValue = gson.fromJson(serializedValue, long[].class); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4840);assertEquals(1, deserializedValue.length); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4841);assertEquals(value[0], deserializedValue[0]); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 


public void testObjectArrayWithNonPrimitivesSerialization165() throws Exception {__CLR4_4_13oy3oyld3ms3zd.R.globalSliceStart(getClass().getName(),4842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19fkkdu3qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oy3oyld3ms3zd.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oy3oyld3ms3zd.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testObjectArrayWithNonPrimitivesSerialization165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19fkkdu3qi() throws Exception{try{__CLR4_4_13oy3oyld3ms3zd.R.inc(4842); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4843);ClassWithObjects classWithObjects = new ClassWithObjects(); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4844);BagOfPrimitives bagOfPrimitives = new BagOfPrimitives(); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4845);String classWithObjectsJson = gson.toJson(classWithObjects); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4846);String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4847);Object[] objects = new Object[] { classWithObjects, bagOfPrimitives }; 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4848);String json = gson.toJson(objects); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4849);assertTrue(json.contains(classWithObjectsJson)); 
     __CLR4_4_13oy3oyld3ms3zd.R.inc(4850);assertTrue(json.contains(bagOfPrimitivesJson)); 
 }finally{__CLR4_4_13oy3oyld3ms3zd.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
