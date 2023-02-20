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
public class TypeInfoArrayTest extends TestCase {static class __CLR4_4_137y37yle6id5m6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u006e\u006f\u0070\u0074\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676516042564L,8589935092L,4191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void component_raw_type() {try{__CLR4_4_137y37yle6id5m6.R.inc(4174); __CLR4_4_137y37yle6id5m6.R.inc(4175);Type stringType = new TypeToken<String>() {}.getType(); __CLR4_4_137y37yle6id5m6.R.inc(4176);Type stringType2 = new TypeToken<String>() {}.getType(); __CLR4_4_137y37yle6id5m6.R.inc(4177);Type stringType3 = new TypeToken<String>() {}.getType(); __CLR4_4_137y37yle6id5m6.R.inc(4178);Type[] types = new Type[] { stringType, stringType2, stringType3 }; __CLR4_4_137y37yle6id5m6.R.inc(4179);Type[] componentTypes = new Type[] { stringType, stringType3 }; __CLR4_4_137y37yle6id5m6.R.inc(4180);for (Type componentType : componentTypes) {{ __CLR4_4_137y37yle6id5m6.R.inc(4181);TypeInfoArray info = new TypeInfoArray(componentType); __CLR4_4_137y37yle6id5m6.R.inc(4182);Class<?> componentRawType = info.getComponentRawType(); __CLR4_4_137y37yle6id5m6.R.inc(4183);assertEquals(String.class, componentRawType); } }}finally{__CLR4_4_137y37yle6id5m6.R.flushNeeded();}}
public void getActualTypeForFirstTypeVariable() {try{__CLR4_4_137y37yle6id5m6.R.inc(4184); __CLR4_4_137y37yle6id5m6.R.inc(4185);assertEquals(Object.class, TypeUtils.getActualTypeForFirstTypeVariable(String.class)); __CLR4_4_137y37yle6id5m6.R.inc(4186);assertEquals(Object.class, TypeUtils.getActualTypeForFirstTypeVariable(Integer.class)); __CLR4_4_137y37yle6id5m6.R.inc(4187);assertEquals(Object.class, TypeUtils.getActualTypeForFirstTypeVariable(String[].class)); __CLR4_4_137y37yle6id5m6.R.inc(4188);assertEquals(String.class, TypeUtils.getActualTypeForFirstTypeVariable(String[].class)); __CLR4_4_137y37yle6id5m6.R.inc(4189);assertEquals(Integer.class, TypeUtils.getActualTypeForFirstTypeVariable(Integer[].class)); __CLR4_4_137y37yle6id5m6.R.inc(4190);assertEquals(String.class, TypeUtils.getActualTypeForFirstTypeVariable(String[].class));
}finally{__CLR4_4_137y37yle6id5m6.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  
}
