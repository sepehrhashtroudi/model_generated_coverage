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

import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Small test to ensure that the TypeInfoFactory is return the object that we expect.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TypeInfoFactoryTest extends TestCase {static class __CLR4_4_13h03h0le6rvqkp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,4526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static Type OBJ_TYPE = new TypeToken<ObjectWithDifferentFields<Integer>>() {}.getType();
  private ObjectWithDifferentFields<Integer> obj;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13h03h0le6rvqkp.R.inc(4500);
    __CLR4_4_13h03h0le6rvqkp.R.inc(4501);super.setUp();
    __CLR4_4_13h03h0le6rvqkp.R.inc(4502);obj = new ObjectWithDifferentFields<Integer>();
  }finally{__CLR4_4_13h03h0le6rvqkp.R.flushNeeded();}}


public void testGenericArrayTypeField3() throws Exception {__CLR4_4_13h03h0le6rvqkp.R.globalSliceStart(getClass().getName(),4503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj3xki3h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13h03h0le6rvqkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13h03h0le6rvqkp.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testGenericArrayTypeField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj3xki3h3() throws Exception{try{__CLR4_4_13h03h0le6rvqkp.R.inc(4503); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4504);Type listType = new TypeToken<List<String>[]>() { 
     }.getType(); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4505);Field f = obj.getClass().getField("simpleGenericArray"); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4506);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4507);assertTrue(typeInfo.isArray()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4508);assertFalse(typeInfo.isEnum()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4509);assertEquals(listType, typeInfo.getActualType()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4510);assertEquals(List[].class, typeInfo.getRawClass()); 
 }finally{__CLR4_4_13h03h0le6rvqkp.R.flushNeeded();}} 


public void testParameterizedTypeVariableArrayField4() throws Exception {__CLR4_4_13h03h0le6rvqkp.R.globalSliceStart(getClass().getName(),4511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ris7ul3hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13h03h0le6rvqkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13h03h0le6rvqkp.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testParameterizedTypeVariableArrayField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ris7ul3hb() throws Exception{try{__CLR4_4_13h03h0le6rvqkp.R.inc(4511); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4512);Type listType = new TypeToken<List<Integer>[]>() { 
     }.getType(); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4513);Field f = obj.getClass().getField("listOfTypeVariablesArray"); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4514);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4515);assertTrue(typeInfo.isArray()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4516);assertFalse(typeInfo.isEnum()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4517);assertEquals(listType, typeInfo.getActualType()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4518);assertEquals(List[].class, typeInfo.getRawClass()); 
 }finally{__CLR4_4_13h03h0le6rvqkp.R.flushNeeded();}} 


public void testTypeVariableField5() throws Exception {__CLR4_4_13h03h0le6rvqkp.R.globalSliceStart(getClass().getName(),4519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caxwxi3hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13h03h0le6rvqkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13h03h0le6rvqkp.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoFactoryTest.testTypeVariableField5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caxwxi3hj() throws Exception{try{__CLR4_4_13h03h0le6rvqkp.R.inc(4519); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4520);Field f = obj.getClass().getField("typeVariableObj"); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4521);TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(f, OBJ_TYPE); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4522);assertFalse(typeInfo.isArray()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4523);assertFalse(typeInfo.isEnum()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4524);assertEquals(Integer.class, typeInfo.getActualType()); 
     __CLR4_4_13h03h0le6rvqkp.R.inc(4525);assertEquals(Integer.class, typeInfo.getRawClass()); 
 }finally{__CLR4_4_13h03h0le6rvqkp.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  @SuppressWarnings("unused")
  private static class ObjectWithDifferentFields<T> {
    public static enum TestEnum {
      TEST_1, TEST_2;
    }

    public String simpleField;
    public TestEnum enumField;
    public List<String> simpleParameterizedType;
    public List<List<String>> simpleNestedParameterizedType;
    public List<String>[] simpleGenericArray;

    public T typeVariableObj;
    public T[] typeVariableArray;
    public T[][][] mutliDimensionalTypeVariableArray;
    public List<T> listOfTypeVariables;
    public List<List<T>> listOfListsOfTypeVariables;
    public List<T>[] listOfTypeVariablesArray;

    public List<?> listWithWildcard;
    public List<?>[] arrayOfListWithWildcard;
    public List<? extends String> listWithStringWildcard;
    public List<? extends String>[] arrayOfListWithStringWildcard;

    public List<? extends T> listWithTypeVariableWildcard;
    public List<? extends T>[] arrayOfListWithTypeVariableWildcard;
  }
}
