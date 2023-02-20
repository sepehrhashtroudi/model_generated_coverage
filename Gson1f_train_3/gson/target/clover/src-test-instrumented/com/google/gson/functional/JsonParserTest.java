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
public class JsonParserTest extends TestCase {static class __CLR4_4_147m47mle6rzgyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5492,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_147m47mle6rzgyf.R.inc(5458);
    __CLR4_4_147m47mle6rzgyf.R.inc(5459);super.setUp();
    __CLR4_4_147m47mle6rzgyf.R.inc(5460);gson = new Gson();
  }finally{__CLR4_4_147m47mle6rzgyf.R.flushNeeded();}}
  

public void testBadFieldTypeForDeserializingCustomTree74() {__CLR4_4_147m47mle6rzgyf.R.globalSliceStart(getClass().getName(),5461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1binl6v47p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_147m47mle6rzgyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_147m47mle6rzgyf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadFieldTypeForDeserializingCustomTree74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1binl6v47p(){try{__CLR4_4_147m47mle6rzgyf.R.inc(5461); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5462);JsonArray array = new JsonArray(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5463);array.add(new JsonPrimitive("blah")); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5464);JsonObject primitive1 = new JsonObject(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5465);primitive1.addProperty("string", "foo"); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5466);primitive1.addProperty("intValue", 11); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5467);JsonObject obj = new JsonObject(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5468);obj.add("primitive1", primitive1); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5469);obj.add("primitive2", array); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5470);try { 
         __CLR4_4_147m47mle6rzgyf.R.inc(5471);gson.fromJson(obj, Nested.class); 
         __CLR4_4_147m47mle6rzgyf.R.inc(5472);fail("Nested has field BagOfPrimitives which is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_147m47mle6rzgyf.R.flushNeeded();}} 


public void testBadFieldTypeForCustomDeserializerCustomTree110() {__CLR4_4_147m47mle6rzgyf.R.globalSliceStart(getClass().getName(),5473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19y5bi4481();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_147m47mle6rzgyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_147m47mle6rzgyf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadFieldTypeForCustomDeserializerCustomTree110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19y5bi4481(){try{__CLR4_4_147m47mle6rzgyf.R.inc(5473); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5474);JsonArray array = new JsonArray(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5475);array.add(new JsonPrimitive("blah")); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5476);JsonObject obj = new JsonObject(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5477);obj.addProperty("stringValue", "foo"); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5478);obj.addProperty("intValue", 11); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5479);obj.add("longValue", array); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5480);try { 
         __CLR4_4_147m47mle6rzgyf.R.inc(5481);gson.fromJson(obj, BagOfPrimitives.class); 
         __CLR4_4_147m47mle6rzgyf.R.inc(5482);fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_147m47mle6rzgyf.R.flushNeeded();}} 


public void testBadTypeForDeserializingCustomTree127() {__CLR4_4_147m47mle6rzgyf.R.globalSliceStart(getClass().getName(),5483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tjr2q48b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_147m47mle6rzgyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_147m47mle6rzgyf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonParserTest.testBadTypeForDeserializingCustomTree127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tjr2q48b(){try{__CLR4_4_147m47mle6rzgyf.R.inc(5483); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5484);JsonObject obj = new JsonObject(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5485);obj.addProperty("stringValue", "foo"); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5486);obj.addProperty("intValue", 11); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5487);JsonArray array = new JsonArray(); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5488);array.add(obj); 
     __CLR4_4_147m47mle6rzgyf.R.inc(5489);try { 
         __CLR4_4_147m47mle6rzgyf.R.inc(5490);gson.fromJson(array, BagOfPrimitives.class); 
         __CLR4_4_147m47mle6rzgyf.R.inc(5491);fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_147m47mle6rzgyf.R.flushNeeded();}} 

  
  
  
  
  

  

  
}
