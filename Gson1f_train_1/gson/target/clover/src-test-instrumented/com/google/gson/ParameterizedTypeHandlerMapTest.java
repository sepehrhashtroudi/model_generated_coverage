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

import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.Sub;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Unit tests for the {@link ParameterizedTypeHandlerMap} class.
 *
 * @author Joel Leitch
 */
public class ParameterizedTypeHandlerMapTest extends TestCase {static class __CLR4_4_13c53c5le6rxkha{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private ParameterizedTypeHandlerMap<String> paramMap;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13c53c5le6rxkha.R.inc(4325);
    __CLR4_4_13c53c5le6rxkha.R.inc(4326);super.setUp();
    __CLR4_4_13c53c5le6rxkha.R.inc(4327);paramMap = new ParameterizedTypeHandlerMap<String>();
  }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}}


public void testReplaceExistingTypeHierarchyHandler137() {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154kh1c3c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testReplaceExistingTypeHierarchyHandler137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154kh1c3c8(){try{__CLR4_4_13c53c5le6rxkha.R.inc(4328); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4329);paramMap.registerForTypeHierarchy(Base.class, "baseHandler"); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4330);paramMap.registerForTypeHierarchy(Base.class, "base2Handler"); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4331);String handler = paramMap.getHandlerFor(Base.class); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4332);assertEquals("base2Handler", handler); 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 


public void testMakeUnmodifiable138() throws Exception {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gj42ww3cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testMakeUnmodifiable138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gj42ww3cd() throws Exception{try{__CLR4_4_13c53c5le6rxkha.R.inc(4333); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4334);paramMap.makeUnmodifiable(); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4335);try { 
         __CLR4_4_13c53c5le6rxkha.R.inc(4336);paramMap.register(String.class, "blah"); 
         __CLR4_4_13c53c5le6rxkha.R.inc(4337);fail("Can not register handlers when map is unmodifiable"); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 


public void testTypeOverridding139() throws Exception {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpp1t93ci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeOverridding139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpp1t93ci() throws Exception{try{__CLR4_4_13c53c5le6rxkha.R.inc(4338); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4339);String handler1 = "blah1"; 
     __CLR4_4_13c53c5le6rxkha.R.inc(4340);String handler2 = "blah2"; 
     __CLR4_4_13c53c5le6rxkha.R.inc(4341);paramMap.register(String.class, handler1); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4342);paramMap.register(String.class, handler2); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4343);assertTrue(paramMap.hasSpecificHandlerFor(String.class)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4344);assertEquals(handler2, paramMap.getHandlerFor(String.class)); 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 


public void testTypeHierarchyRegisterIfAbsent140() {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7ck6m3cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeHierarchyRegisterIfAbsent140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7ck6m3cp(){try{__CLR4_4_13c53c5le6rxkha.R.inc(4345); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4346);paramMap.registerForTypeHierarchy(Base.class, "baseHandler"); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4347);ParameterizedTypeHandlerMap<String> otherMap = new ParameterizedTypeHandlerMap<String>(); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4348);otherMap.registerForTypeHierarchy(Base.class, "baseHandler2"); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4349);paramMap.registerIfAbsent(otherMap); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4350);String handler = paramMap.getHandlerFor(Base.class); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4351);assertEquals("baseHandler", handler); 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 


public void testHasGenericButNotSpecific141() throws Exception {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g042w23cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHasGenericButNotSpecific141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g042w23cw() throws Exception{try{__CLR4_4_13c53c5le6rxkha.R.inc(4352); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4353);Type specificType = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4354);String handler = "blah"; 
     __CLR4_4_13c53c5le6rxkha.R.inc(4355);paramMap.register(List.class, handler); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4356);assertFalse(paramMap.hasSpecificHandlerFor(specificType)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4357);assertTrue(paramMap.hasSpecificHandlerFor(List.class)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4358);assertNotNull(paramMap.getHandlerFor(specificType)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4359);assertNotNull(paramMap.getHandlerFor(List.class)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4360);assertEquals(handler, paramMap.getHandlerFor(specificType)); 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 


public void testNullMap142() throws Exception {__CLR4_4_13c53c5le6rxkha.R.globalSliceStart(getClass().getName(),4361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eci4253d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c53c5le6rxkha.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c53c5le6rxkha.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testNullMap142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eci4253d5() throws Exception{try{__CLR4_4_13c53c5le6rxkha.R.inc(4361); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4362);assertFalse(paramMap.hasSpecificHandlerFor(String.class)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4363);assertNull(paramMap.getHandlerFor(String.class)); 
     __CLR4_4_13c53c5le6rxkha.R.inc(4364);assertNull(paramMap.getHandlerFor(String.class)); 
 }finally{__CLR4_4_13c53c5le6rxkha.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  
  private static class SubOfSub extends Sub {
  }
}
