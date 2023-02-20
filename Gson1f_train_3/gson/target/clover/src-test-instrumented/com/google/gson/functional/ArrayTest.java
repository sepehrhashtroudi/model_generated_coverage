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
public class ArrayTest extends TestCase {static class __CLR4_4_13qi3qile6rzgve{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13qi3qile6rzgve.R.inc(4842);
    __CLR4_4_13qi3qile6rzgve.R.inc(4843);super.setUp();
    __CLR4_4_13qi3qile6rzgve.R.inc(4844);gson = new Gson();
  }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}}


public void testTopLevelArrayOfIntsSerialization7() {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fay2ap3ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testTopLevelArrayOfIntsSerialization7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fay2ap3ql(){try{__CLR4_4_13qi3qile6rzgve.R.inc(4845); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4846);int[] target = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4847);assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target)); 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testNullsInArraySerialization12() {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fegece3qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArraySerialization12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fegece3qo(){try{__CLR4_4_13qi3qile6rzgve.R.inc(4848); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4849);String[] array = { "foo", null, "bar" }; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4850);String expected = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4851);String json = gson.toJson(array); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4852);assertEquals(expected, json); 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testInvalidArrayDeserialization64() {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oz6m83qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testInvalidArrayDeserialization64",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oz6m83qt(){try{__CLR4_4_13qi3qile6rzgve.R.inc(4853); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4854);String json = "[1, 2 3, 4, 5]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4855);try { 
         __CLR4_4_13qi3qile6rzgve.R.inc(4856);gson.fromJson(json, int[].class); 
         __CLR4_4_13qi3qile6rzgve.R.inc(4857);fail("Gson should not deserialize array elements with missing ,"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testArrayWithoutTypeInfoDeserialization77() throws Exception {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8unjh3qy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayWithoutTypeInfoDeserialization77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8unjh3qy() throws Exception{try{__CLR4_4_13qi3qile6rzgve.R.inc(4858); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4859);String json = "[1,'abc',[1,2],5]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4860);try { 
         __CLR4_4_13qi3qile6rzgve.R.inc(4861);gson.fromJson(json, Object[].class); 
         __CLR4_4_13qi3qile6rzgve.R.inc(4862);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testArrayOfObjectsWithoutTypeInfoDeserialization78() throws Exception {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5fjkt3r3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfObjectsWithoutTypeInfoDeserialization78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5fjkt3r3() throws Exception{try{__CLR4_4_13qi3qile6rzgve.R.inc(4863); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4864);String json = "[1,'abc',{a:1},5]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4865);try { 
         __CLR4_4_13qi3qile6rzgve.R.inc(4866);gson.fromJson(json, Object[].class); 
         __CLR4_4_13qi3qile6rzgve.R.inc(4867);fail("This is crazy....how did we deserialize it!!!"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testArrayOfStringsDeserialization125() {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nzyq83r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testArrayOfStringsDeserialization125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nzyq83r8(){try{__CLR4_4_13qi3qile6rzgve.R.inc(4868); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4869);String json = "[\"Hello\",\"World\"]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4870);String[] target = gson.fromJson(json, String[].class); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4871);assertEquals("Hello", target[0]); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4872);assertEquals("World", target[1]); 
 }finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 


public void testNullsInArrayDeserialization126() {__CLR4_4_13qi3qile6rzgve.R.globalSliceStart(getClass().getName(),4873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkjqhl3rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qi3qile6rzgve.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qi3qile6rzgve.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ArrayTest.testNullsInArrayDeserialization126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkjqhl3rd(){try{__CLR4_4_13qi3qile6rzgve.R.inc(4873); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4874);String json = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4875);String[] expected = { "foo", null, "bar" }; 
     __CLR4_4_13qi3qile6rzgve.R.inc(4876);String[] target = gson.fromJson(json, expected.getClass()); 
     __CLR4_4_13qi3qile6rzgve.R.inc(4877);for (int i = 0; (((i < expected.length)&&(__CLR4_4_13qi3qile6rzgve.R.iget(4878)!=0|true))||(__CLR4_4_13qi3qile6rzgve.R.iget(4879)==0&false)); ++i) {{ 
         __CLR4_4_13qi3qile6rzgve.R.inc(4880);assertEquals(expected[i], target[i]); 
     } 
 }}finally{__CLR4_4_13qi3qile6rzgve.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
