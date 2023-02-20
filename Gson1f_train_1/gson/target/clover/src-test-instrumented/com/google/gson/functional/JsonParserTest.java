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

import java.io.StringReader;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.Nested;

/**
 * Functional tests for that use JsonParser and related Gson methods
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonParserTest extends TestCase {static class __CLR4_4_148e48ele6rxkri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_148e48ele6rxkri.R.inc(5486);
    __CLR4_4_148e48ele6rxkri.R.inc(5487);super.setUp();
    __CLR4_4_148e48ele6rxkri.R.inc(5488);gson = new Gson();
  }finally{__CLR4_4_148e48ele6rxkri.R.flushNeeded();}}
  

public void testBadFieldTypeForCustomDeserializerCustomTree110() {__CLR4_4_148e48ele6rxkri.R.globalSliceStart(getClass().getName(),5489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19y5bi448h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148e48ele6rxkri.R.rethrow($CLV_t2$);}finally{__CLR4_4_148e48ele6rxkri.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadFieldTypeForCustomDeserializerCustomTree110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19y5bi448h(){try{__CLR4_4_148e48ele6rxkri.R.inc(5489); 
     __CLR4_4_148e48ele6rxkri.R.inc(5490);JsonArray array = new JsonArray(); 
     __CLR4_4_148e48ele6rxkri.R.inc(5491);array.add(new JsonPrimitive("blah")); 
     __CLR4_4_148e48ele6rxkri.R.inc(5492);JsonObject obj = new JsonObject(); 
     __CLR4_4_148e48ele6rxkri.R.inc(5493);obj.addProperty("stringValue", "foo"); 
     __CLR4_4_148e48ele6rxkri.R.inc(5494);obj.addProperty("intValue", 11); 
     __CLR4_4_148e48ele6rxkri.R.inc(5495);obj.add("longValue", array); 
     __CLR4_4_148e48ele6rxkri.R.inc(5496);try { 
         __CLR4_4_148e48ele6rxkri.R.inc(5497);gson.fromJson(obj, BagOfPrimitives.class); 
         __CLR4_4_148e48ele6rxkri.R.inc(5498);fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_148e48ele6rxkri.R.flushNeeded();}} 


public void testBadTypeForDeserializingCustomTree123() {__CLR4_4_148e48ele6rxkri.R.globalSliceStart(getClass().getName(),5499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftjm8m48r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148e48ele6rxkri.R.rethrow($CLV_t2$);}finally{__CLR4_4_148e48ele6rxkri.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadTypeForDeserializingCustomTree123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftjm8m48r(){try{__CLR4_4_148e48ele6rxkri.R.inc(5499); 
     __CLR4_4_148e48ele6rxkri.R.inc(5500);JsonObject obj = new JsonObject(); 
     __CLR4_4_148e48ele6rxkri.R.inc(5501);obj.addProperty("stringValue", "foo"); 
     __CLR4_4_148e48ele6rxkri.R.inc(5502);obj.addProperty("intValue", 11); 
     __CLR4_4_148e48ele6rxkri.R.inc(5503);JsonArray array = new JsonArray(); 
     __CLR4_4_148e48ele6rxkri.R.inc(5504);array.add(obj); 
     __CLR4_4_148e48ele6rxkri.R.inc(5505);try { 
         __CLR4_4_148e48ele6rxkri.R.inc(5506);gson.fromJson(array, BagOfPrimitives.class); 
         __CLR4_4_148e48ele6rxkri.R.inc(5507);fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_148e48ele6rxkri.R.flushNeeded();}} 

  
  
  
  
  

  

  
}
