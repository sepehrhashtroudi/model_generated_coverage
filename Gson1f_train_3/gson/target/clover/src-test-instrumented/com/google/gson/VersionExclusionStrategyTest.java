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

import java.lang.reflect.Field;

import junit.framework.TestCase;

import com.google.gson.annotations.Since;

/**
 * Unit tests for the {@link VersionExclusionStrategy} class.
 *
 * @author Joel Leitch
 */
public class VersionExclusionStrategyTest extends TestCase {static class __CLR4_4_13jd3jdle6rzgum{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final double VERSION = 5.0D;


public void testClassAndFieldAreAtSameVersion184() throws Exception {__CLR4_4_13jd3jdle6rzgum.R.globalSliceStart(getClass().getName(),4585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfsrk03jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jd3jdle6rzgum.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jd3jdle6rzgum.R.globalSliceEnd(getClass().getName(),"com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAtSameVersion184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfsrk03jd() throws Exception{try{__CLR4_4_13jd3jdle6rzgum.R.inc(4585); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4586);Class<MockObject> clazz = MockObject.class; 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4587);Field f = clazz.getField("someField"); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4588);VersionExclusionStrategy strategy = new VersionExclusionStrategy(VERSION); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4589);assertFalse(strategy.shouldSkipClass(clazz)); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4590);assertFalse(strategy.shouldSkipField(new FieldAttributes(clazz, f))); 
 }finally{__CLR4_4_13jd3jdle6rzgum.R.flushNeeded();}} 


public void testClassAndFieldAreAheadInVersion185() throws Exception {__CLR4_4_13jd3jdle6rzgum.R.globalSliceStart(getClass().getName(),4591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owzvag3jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jd3jdle6rzgum.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jd3jdle6rzgum.R.globalSliceEnd(getClass().getName(),"com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAheadInVersion185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owzvag3jj() throws Exception{try{__CLR4_4_13jd3jdle6rzgum.R.inc(4591); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4592);Class<MockObject> clazz = MockObject.class; 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4593);Field f = clazz.getField("someField"); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4594);VersionExclusionStrategy strategy = new VersionExclusionStrategy(VERSION - 1); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4595);assertTrue(strategy.shouldSkipClass(clazz)); 
     __CLR4_4_13jd3jdle6rzgum.R.inc(4596);assertTrue(strategy.shouldSkipField(new FieldAttributes(clazz, f))); 
 }finally{__CLR4_4_13jd3jdle6rzgum.R.flushNeeded();}} 

  

  

  

  

  @Since(VERSION)
  private static class MockObject {

    @SuppressWarnings("unused")
    @Since(VERSION)
    public final int someField = 0;
  }
}
