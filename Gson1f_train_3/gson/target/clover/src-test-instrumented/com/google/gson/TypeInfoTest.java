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
 * Exercising the construction of the Parameter object and ensure the
 * proper types are returned.
 *
 * @author Joel Leitch
 */
public class TypeInfoTest extends TestCase {static class __CLR4_4_13ia3iale6rzgua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4566,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testStrangeTypeParameters153() throws Exception {__CLR4_4_13ia3iale6rzgua.R.globalSliceStart(getClass().getName(),4546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyjgmw3ia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ia3iale6rzgua.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ia3iale6rzgua.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testStrangeTypeParameters153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyjgmw3ia() throws Exception{try{__CLR4_4_13ia3iale6rzgua.R.inc(4546); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4547);try { 
         __CLR4_4_13ia3iale6rzgua.R.inc(4548);new TypeInfo(new Type() { 
         }); 
         __CLR4_4_13ia3iale6rzgua.R.inc(4549);fail("Should not be able to determine this unknown type"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_13ia3iale6rzgua.R.flushNeeded();}} 


public void testObject165() throws Exception {__CLR4_4_13ia3iale6rzgua.R.globalSliceStart(getClass().getName(),4550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqlhiy3ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ia3iale6rzgua.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ia3iale6rzgua.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testObject165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqlhiy3ie() throws Exception{try{__CLR4_4_13ia3iale6rzgua.R.inc(4550); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4551);TypeInfo typeInfo = new TypeInfo(Object.class); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4552);assertFalse(typeInfo.isArray()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4553);assertFalse(typeInfo.isPrimitive()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4554);assertEquals(Object.class, typeInfo.getRawClass()); 
 }finally{__CLR4_4_13ia3iale6rzgua.R.flushNeeded();}} 


public void testPrimitive187() throws Exception {__CLR4_4_13ia3iale6rzgua.R.globalSliceStart(getClass().getName(),4555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1veyi0u3ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ia3iale6rzgua.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ia3iale6rzgua.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testPrimitive187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1veyi0u3ij() throws Exception{try{__CLR4_4_13ia3iale6rzgua.R.inc(4555); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4556);TypeInfo typeInfo = new TypeInfo(boolean.class); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4557);assertFalse(typeInfo.isArray()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4558);assertTrue(typeInfo.isPrimitive()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4559);assertEquals(boolean.class, typeInfo.getRawClass()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4560);assertEquals(Boolean.class, typeInfo.getWrappedClass()); 
 }finally{__CLR4_4_13ia3iale6rzgua.R.flushNeeded();}} 


public void testObjectType188() throws Exception {__CLR4_4_13ia3iale6rzgua.R.globalSliceStart(getClass().getName(),4561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0wd6b3ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ia3iale6rzgua.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ia3iale6rzgua.R.globalSliceEnd(getClass().getName(),"com.google.gson.TypeInfoTest.testObjectType188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0wd6b3ip() throws Exception{try{__CLR4_4_13ia3iale6rzgua.R.inc(4561); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4562);TypeInfo typeInfo = new TypeInfo(String.class); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4563);assertFalse(typeInfo.isArray()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4564);assertFalse(typeInfo.isPrimitive()); 
     __CLR4_4_13ia3iale6rzgua.R.inc(4565);assertEquals(String.class, typeInfo.getRawClass()); 
 }finally{__CLR4_4_13ia3iale6rzgua.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  
}
