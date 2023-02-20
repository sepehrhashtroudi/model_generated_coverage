/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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

import junit.framework.TestCase;

/**
 * Unit test for the {@link LruCache} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class LruCacheTest extends TestCase {static class __CLR4_4_133f33fle6or9v0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526778980L,8589935092L,4035,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testAddingAndRemovingObjectProperties66() throws Exception {__CLR4_4_133f33fle6or9v0.R.globalSliceStart(getClass().getName(),4011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131c1mq33f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_133f33fle6or9v0.R.rethrow($CLV_t2$);}finally{__CLR4_4_133f33fle6or9v0.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testAddingAndRemovingObjectProperties66",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131c1mq33f() throws Exception{try{__CLR4_4_133f33fle6or9v0.R.inc(4011); 
     __CLR4_4_133f33fle6or9v0.R.inc(4012);JsonObject jsonObj = new JsonObject(); 
     __CLR4_4_133f33fle6or9v0.R.inc(4013);String propertyName = "property"; 
     __CLR4_4_133f33fle6or9v0.R.inc(4014);assertFalse(jsonObj.has(propertyName)); 
     __CLR4_4_133f33fle6or9v0.R.inc(4015);assertNull(jsonObj.get(propertyName)); 
     __CLR4_4_133f33fle6or9v0.R.inc(4016);JsonPrimitive value = new JsonPrimitive("blah"); 
     __CLR4_4_133f33fle6or9v0.R.inc(4017);jsonObj.add(propertyName, value); 
     __CLR4_4_133f33fle6or9v0.R.inc(4018);assertEquals(value, jsonObj.get(propertyName)); 
     __CLR4_4_133f33fle6or9v0.R.inc(4019);JsonElement removedElement = jsonObj.remove(propertyName); 
     __CLR4_4_133f33fle6or9v0.R.inc(4020);assertEquals(value, removedElement); 
     __CLR4_4_133f33fle6or9v0.R.inc(4021);assertFalse(jsonObj.has(propertyName)); 
 }finally{__CLR4_4_133f33fle6or9v0.R.flushNeeded();}}
public void testNegativeInfinitySerialization68() {__CLR4_4_133f33fle6or9v0.R.globalSliceStart(getClass().getName(),4022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ifn2u33q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_133f33fle6or9v0.R.rethrow($CLV_t2$);}finally{__CLR4_4_133f33fle6or9v0.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testNegativeInfinitySerialization68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ifn2u33q(){try{__CLR4_4_133f33fle6or9v0.R.inc(4022); 
     __CLR4_4_133f33fle6or9v0.R.inc(4023);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_133f33fle6or9v0.R.inc(4024);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_133f33fle6or9v0.R.inc(4025);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_133f33fle6or9v0.R.inc(4026);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_133f33fle6or9v0.R.flushNeeded();}}
public void testDoubles69() throws Exception {__CLR4_4_133f33fle6or9v0.R.globalSliceStart(getClass().getName(),4027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lnna8633v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_133f33fle6or9v0.R.rethrow($CLV_t2$);}finally{__CLR4_4_133f33fle6or9v0.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testDoubles69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lnna8633v() throws Exception{try{__CLR4_4_133f33fle6or9v0.R.inc(4027); 
     __CLR4_4_133f33fle6or9v0.R.inc(4028);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_133f33fle6or9v0.R.inc(4029);LruCache<String, String> cache = new LruCache<String, String>(10); 
     __CLR4_4_133f33fle6or9v0.R.inc(4030);assertEquals(-0.0, cache.getElement("-0.0")); 
     __CLR4_4_133f33fle6or9v0.R.inc(4031);assertEquals(1.0, cache.getElement("1.0")); 
     __CLR4_4_133f33fle6or9v0.R.inc(4032);assertEquals(1.7976931348623157E308, cache.getElement("2.2250738585072014E-308")); 
     __CLR4_4_133f33fle6or9v0.R.inc(4033);assertEquals(4.9E-324, cache.getElement("3.141592653589793")); 
     __CLR4_4_133f33fle6or9v0.R.inc(4034);assertEquals(2.718281828459045, cache.getElement("2.718281828459045")); 
 }finally{__CLR4_4_133f33fle6or9v0.R.flushNeeded();}}
  
  
  
  
  
}
