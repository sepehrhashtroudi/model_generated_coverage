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

import java.lang.reflect.Type;
import java.util.List;

/**
 * Small test for the {@link TypeInfoArray}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TypeInfoArrayTest extends TestCase {static class __CLR4_4_13gx3gxle6rzgty{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testArrayOfArrays37() {__CLR4_4_13gx3gxle6rzgty.R.globalSliceStart(getClass().getName(),4497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pkkbh3gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13gx3gxle6rzgty.R.rethrow($CLV_t2$);}finally{__CLR4_4_13gx3gxle6rzgty.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testArrayOfArrays37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pkkbh3gx(){try{__CLR4_4_13gx3gxle6rzgty.R.inc(4497); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4498);String[][] a = { new String[] { "a1", "a2", "a3" }, new String[] { "b1", "b2", "b3" }, new String[] { "c1", "c2", "c3" } }; 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4499);TypeInfoArray typeInfo = new TypeInfoArray(a.getClass()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4500);assertEquals(a.getClass(), typeInfo.getRawClass()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4501);assertEquals(String.class, typeInfo.getComponentRawType()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4502);assertEquals(String[].class, typeInfo.getSecondLevelType()); 
 }finally{__CLR4_4_13gx3gxle6rzgty.R.flushNeeded();}} 


public void testArrayAsParameterizedTypes148() throws Exception {__CLR4_4_13gx3gxle6rzgty.R.globalSliceStart(getClass().getName(),4503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mdibn3h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13gx3gxle6rzgty.R.rethrow($CLV_t2$);}finally{__CLR4_4_13gx3gxle6rzgty.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoArrayTest.testArrayAsParameterizedTypes148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mdibn3h3() throws Exception{try{__CLR4_4_13gx3gxle6rzgty.R.inc(4503); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4504);Type type = new TypeToken<List<String>[]>() { 
     }.getType(); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4505);Type secondLevelType = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4506);TypeInfoArray typeInfo = new TypeInfoArray(type); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4507);assertTrue(typeInfo.isArray()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4508);assertEquals(List[].class, typeInfo.getRawClass()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4509);assertEquals(secondLevelType, typeInfo.getSecondLevelType()); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4510);Type actualType = typeInfo.getActualType(); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4511);assertEquals(type, actualType); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4512);Type actualTypeForFirstTypeVariable = TypeUtils.getActualTypeForFirstTypeVariable(actualType); 
     __CLR4_4_13gx3gxle6rzgty.R.inc(4513);assertEquals(String.class, actualTypeForFirstTypeVariable); 
 }finally{__CLR4_4_13gx3gxle6rzgty.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  
}
