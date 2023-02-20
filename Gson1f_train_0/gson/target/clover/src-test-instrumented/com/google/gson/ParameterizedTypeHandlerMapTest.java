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
public class ParameterizedTypeHandlerMapTest extends TestCase {static class __CLR4_4_13bs3bsle6rvqj4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,4357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private ParameterizedTypeHandlerMap<String> paramMap;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4312);
    __CLR4_4_13bs3bsle6rvqj4.R.inc(4313);super.setUp();
    __CLR4_4_13bs3bsle6rvqj4.R.inc(4314);paramMap = new ParameterizedTypeHandlerMap<String>();
  }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}}


public void testReplaceExistingTypeHierarchyHandler139() {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmkema3bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testReplaceExistingTypeHierarchyHandler139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmkema3bv(){try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4315); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4316);paramMap.registerForTypeHierarchy(Base.class, "baseHandler"); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4317);paramMap.registerForTypeHierarchy(Base.class, "base2Handler"); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4318);String handler = paramMap.getHandlerFor(Base.class); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4319);assertEquals("base2Handler", handler); 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testHidingExistingTypeHierarchyHandlerIsDisallowed140() {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f898rp3c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHidingExistingTypeHierarchyHandlerIsDisallowed140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f898rp3c0(){try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4320); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4321);paramMap.registerForTypeHierarchy(Sub.class, "subHandler"); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4322);try { 
         __CLR4_4_13bs3bsle6rvqj4.R.inc(4323);paramMap.registerForTypeHierarchy(Base.class, "baseHandler"); 
         __CLR4_4_13bs3bsle6rvqj4.R.inc(4324);fail("A handler that hides an existing type hierarchy handler is not allowed"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testMakeUnmodifiable141() throws Exception {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19k8xwo3c5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testMakeUnmodifiable141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19k8xwo3c5() throws Exception{try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4325); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4326);paramMap.makeUnmodifiable(); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4327);try { 
         __CLR4_4_13bs3bsle6rvqj4.R.inc(4328);paramMap.register(String.class, "blah"); 
         __CLR4_4_13bs3bsle6rvqj4.R.inc(4329);fail("Can not register handlers when map is unmodifiable"); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testTypeOverridding142() throws Exception {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqtwt13ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeOverridding142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqtwt13ca() throws Exception{try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4330); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4331);String handler1 = "blah1"; 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4332);String handler2 = "blah2"; 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4333);paramMap.register(String.class, handler1); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4334);paramMap.register(String.class, handler2); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4335);assertTrue(paramMap.hasSpecificHandlerFor(String.class)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4336);assertEquals(handler2, paramMap.getHandlerFor(String.class)); 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testTypeHierarchyRegisterIfAbsent143() {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgcnt73ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeHierarchyRegisterIfAbsent143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgcnt73ch(){try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4337); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4338);paramMap.registerForTypeHierarchy(Base.class, "baseHandler"); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4339);ParameterizedTypeHandlerMap<String> otherMap = new ParameterizedTypeHandlerMap<String>(); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4340);otherMap.registerForTypeHierarchy(Base.class, "baseHandler2"); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4341);paramMap.registerIfAbsent(otherMap); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4342);String handler = paramMap.getHandlerFor(Base.class); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4343);assertEquals("baseHandler", handler); 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testHasGenericButNotSpecific144() throws Exception {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pr3z9h3co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHasGenericButNotSpecific144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pr3z9h3co() throws Exception{try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4344); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4345);Type specificType = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4346);String handler = "blah"; 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4347);paramMap.register(List.class, handler); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4348);assertFalse(paramMap.hasSpecificHandlerFor(specificType)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4349);assertTrue(paramMap.hasSpecificHandlerFor(List.class)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4350);assertNotNull(paramMap.getHandlerFor(specificType)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4351);assertNotNull(paramMap.getHandlerFor(List.class)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4352);assertEquals(handler, paramMap.getHandlerFor(specificType)); 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 


public void testNullMap145() throws Exception {__CLR4_4_13bs3bsle6rvqj4.R.globalSliceStart(getClass().getName(),4353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14li7oq3cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13bs3bsle6rvqj4.R.rethrow($CLV_t2$);}finally{__CLR4_4_13bs3bsle6rvqj4.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testNullMap145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14li7oq3cx() throws Exception{try{__CLR4_4_13bs3bsle6rvqj4.R.inc(4353); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4354);assertFalse(paramMap.hasSpecificHandlerFor(String.class)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4355);assertNull(paramMap.getHandlerFor(String.class)); 
     __CLR4_4_13bs3bsle6rvqj4.R.inc(4356);assertNull(paramMap.getHandlerFor(String.class)); 
 }finally{__CLR4_4_13bs3bsle6rvqj4.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  
  private static class SubOfSub extends Sub {
  }
}
