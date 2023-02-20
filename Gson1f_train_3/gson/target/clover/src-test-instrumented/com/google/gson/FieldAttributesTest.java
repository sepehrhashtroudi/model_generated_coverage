/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Unit tests for the {@link FieldAttributes} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class FieldAttributesTest extends TestCase {static class __CLR4_4_1324324le6rzgqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,3983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private FieldAttributes fieldAttributes;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_1324324le6rzgqf.R.inc(3964);
    __CLR4_4_1324324le6rzgqf.R.inc(3965);super.setUp();
    __CLR4_4_1324324le6rzgqf.R.inc(3966);fieldAttributes = new FieldAttributes(Foo.class, Foo.class.getField("bar"));
  }finally{__CLR4_4_1324324le6rzgqf.R.flushNeeded();}}


public void testNullField190() throws Exception {__CLR4_4_1324324le6rzgqf.R.globalSliceStart(getClass().getName(),3967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jns9la327();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1324324le6rzgqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1324324le6rzgqf.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testNullField190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jns9la327() throws Exception{try{__CLR4_4_1324324le6rzgqf.R.inc(3967); 
     __CLR4_4_1324324le6rzgqf.R.inc(3968);try { 
         __CLR4_4_1324324le6rzgqf.R.inc(3969);new FieldAttributes(Foo.class, null); 
         __CLR4_4_1324324le6rzgqf.R.inc(3970);fail("Field parameter can not be null"); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_1324324le6rzgqf.R.flushNeeded();}} 


public void testName191() throws Exception {__CLR4_4_1324324le6rzgqf.R.globalSliceStart(getClass().getName(),3971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnrq1932b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1324324le6rzgqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1324324le6rzgqf.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testName191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnrq1932b() throws Exception{try{__CLR4_4_1324324le6rzgqf.R.inc(3971); 
     __CLR4_4_1324324le6rzgqf.R.inc(3972);assertEquals("bar", fieldAttributes.getName()); 
 }finally{__CLR4_4_1324324le6rzgqf.R.flushNeeded();}} 


public void testModifiers192() throws Exception {__CLR4_4_1324324le6rzgqf.R.globalSliceStart(getClass().getName(),3973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzcrgn32d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1324324le6rzgqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1324324le6rzgqf.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testModifiers192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzcrgn32d() throws Exception{try{__CLR4_4_1324324le6rzgqf.R.inc(3973); 
     __CLR4_4_1324324le6rzgqf.R.inc(3974);assertFalse(fieldAttributes.hasModifier(Modifier.STATIC)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3975);assertFalse(fieldAttributes.hasModifier(Modifier.FINAL)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3976);assertFalse(fieldAttributes.hasModifier(Modifier.ABSTRACT)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3977);assertFalse(fieldAttributes.hasModifier(Modifier.VOLATILE)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3978);assertFalse(fieldAttributes.hasModifier(Modifier.PROTECTED)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3979);assertTrue(fieldAttributes.hasModifier(Modifier.PUBLIC)); 
     __CLR4_4_1324324le6rzgqf.R.inc(3980);assertTrue(fieldAttributes.hasModifier(Modifier.TRANSIENT)); 
 }finally{__CLR4_4_1324324le6rzgqf.R.flushNeeded();}} 


public void testIsSynthetic193() throws Exception {__CLR4_4_1324324le6rzgqf.R.globalSliceStart(getClass().getName(),3981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nckn9z32l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1324324le6rzgqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1324324le6rzgqf.R.globalSliceEnd(getClass().getName(),"com.google.gson.FieldAttributesTest.testIsSynthetic193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nckn9z32l() throws Exception{try{__CLR4_4_1324324le6rzgqf.R.inc(3981); 
     __CLR4_4_1324324le6rzgqf.R.inc(3982);assertFalse(fieldAttributes.isSynthetic()); 
 }finally{__CLR4_4_1324324le6rzgqf.R.flushNeeded();}} 

  

  

  

  

  

  

  private static class Foo {
    @SuppressWarnings("unused")
    public transient List<String> bar;
  }
}
