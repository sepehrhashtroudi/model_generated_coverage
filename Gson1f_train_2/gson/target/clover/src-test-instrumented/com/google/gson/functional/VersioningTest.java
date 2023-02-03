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
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Functional tests for versioning support in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class VersioningTest extends TestCase {static class __CLR4_4_14oy4oyld3ms46v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,6105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final int A = 0;
  private static final int B = 1;
  private static final int C = 2;
  private static final int D = 3;

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14oy4oyld3ms46v.R.inc(6082);
    __CLR4_4_14oy4oyld3ms46v.R.inc(6083);super.setUp();
    __CLR4_4_14oy4oyld3ms46v.R.inc(6084);builder = new GsonBuilder();
  }finally{__CLR4_4_14oy4oyld3ms46v.R.flushNeeded();}}


public void testIgnoreLaterVersionClassSerialization130() {__CLR4_4_14oy4oyld3ms46v.R.globalSliceStart(getClass().getName(),6085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jawryl4p1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oy4oyld3ms46v.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oy4oyld3ms46v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testIgnoreLaterVersionClassSerialization130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jawryl4p1(){try{__CLR4_4_14oy4oyld3ms46v.R.inc(6085); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6086);Gson gson = builder.setVersion(1.0).create(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6087);assertEquals("", gson.toJson(new Version1_2())); 
 }finally{__CLR4_4_14oy4oyld3ms46v.R.flushNeeded();}} 


public void testVersionedGsonWithUnversionedClassesDeserialization181() {__CLR4_4_14oy4oyld3ms46v.R.globalSliceStart(getClass().getName(),6088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej9wn44p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oy4oyld3ms46v.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oy4oyld3ms46v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedGsonWithUnversionedClassesDeserialization181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej9wn44p4(){try{__CLR4_4_14oy4oyld3ms46v.R.inc(6088); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6089);Gson gson = builder.setVersion(1.0).create(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6090);String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}"; 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6091);BagOfPrimitives expected = new BagOfPrimitives(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6092);expected.longValue = 10; 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6093);expected.intValue = 20; 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6094);expected.booleanValue = false; 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6095);BagOfPrimitives actual = gson.fromJson(json, BagOfPrimitives.class); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6096);assertEquals(expected, actual); 
 }finally{__CLR4_4_14oy4oyld3ms46v.R.flushNeeded();}} 


public void testVersionedUntilSerialization189() {__CLR4_4_14oy4oyld3ms46v.R.globalSliceStart(getClass().getName(),6097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8s8ki4pd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oy4oyld3ms46v.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oy4oyld3ms46v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.VersioningTest.testVersionedUntilSerialization189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8s8ki4pd(){try{__CLR4_4_14oy4oyld3ms46v.R.inc(6097); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6098);Version1 target = new Version1(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6099);Gson gson = builder.setVersion(1.29).create(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6100);String json = gson.toJson(target); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6101);assertTrue(json.contains("\"a\":" + A)); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6102);gson = builder.setVersion(1.3).create(); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6103);json = gson.toJson(target); 
     __CLR4_4_14oy4oyld3ms46v.R.inc(6104);assertFalse(json.contains("\"a\":" + A)); 
 }finally{__CLR4_4_14oy4oyld3ms46v.R.flushNeeded();}} 

  
  
  

  

  

  

  

  

  

  

  

  private static class Version1 {
    @Until(1.3) int a = A;
    @Since(1.0) int b = B;
  }

  private static class Version1_1 extends Version1 {
    @Since(1.1) int c = C;
  }

  @Since(1.2)
  private static class Version1_2 extends Version1_1 {
    int d = D;
  }
  
  private static class SinceUntilMixing {
    int a = A;
    
    @Since(1.1)
    @Until(1.3)
    int b = B;
  }
}
