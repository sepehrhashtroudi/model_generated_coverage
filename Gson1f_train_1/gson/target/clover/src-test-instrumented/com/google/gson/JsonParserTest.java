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

import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.stream.JsonReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.StringReader;
import junit.framework.TestCase;

/**
 * Unit test for {@link JsonParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonParserTest extends TestCase {static class __CLR4_4_136d36dle6rxke6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  private JsonParser parser;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_136d36dle6rxke6.R.inc(4117);
    __CLR4_4_136d36dle6rxke6.R.inc(4118);super.setUp();
    __CLR4_4_136d36dle6rxke6.R.inc(4119);parser = new JsonParser();
  }finally{__CLR4_4_136d36dle6rxke6.R.flushNeeded();}}
  

public void testParseEmptyWhitespaceInput143() {__CLR4_4_136d36dle6rxke6.R.globalSliceStart(getClass().getName(),4120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdvuga36g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136d36dle6rxke6.R.rethrow($CLV_t2$);}finally{__CLR4_4_136d36dle6rxke6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseEmptyWhitespaceInput143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdvuga36g(){try{__CLR4_4_136d36dle6rxke6.R.inc(4120); 
     __CLR4_4_136d36dle6rxke6.R.inc(4121);JsonElement e = parser.parse("     "); 
     __CLR4_4_136d36dle6rxke6.R.inc(4122);assertTrue(e.isJsonNull()); 
 }finally{__CLR4_4_136d36dle6rxke6.R.flushNeeded();}} 


public void testReadWriteTwoObjects158() throws Exception {__CLR4_4_136d36dle6rxke6.R.globalSliceStart(getClass().getName(),4123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13aoyxo36j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136d36dle6rxke6.R.rethrow($CLV_t2$);}finally{__CLR4_4_136d36dle6rxke6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testReadWriteTwoObjects158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13aoyxo36j() throws Exception{try{__CLR4_4_136d36dle6rxke6.R.inc(4123); 
     __CLR4_4_136d36dle6rxke6.R.inc(4124);Gson gson = new Gson(); 
     __CLR4_4_136d36dle6rxke6.R.inc(4125);CharArrayWriter writer = new CharArrayWriter(); 
     __CLR4_4_136d36dle6rxke6.R.inc(4126);BagOfPrimitives expectedOne = new BagOfPrimitives(1, 1, true, "one"); 
     __CLR4_4_136d36dle6rxke6.R.inc(4127);writer.write(gson.toJson(expectedOne).toCharArray()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4128);BagOfPrimitives expectedTwo = new BagOfPrimitives(2, 2, false, "two"); 
     __CLR4_4_136d36dle6rxke6.R.inc(4129);writer.write(gson.toJson(expectedTwo).toCharArray()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4130);CharArrayReader reader = new CharArrayReader(writer.toCharArray()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4131);JsonReader parser = new JsonReader(reader); 
     __CLR4_4_136d36dle6rxke6.R.inc(4132);parser.setLenient(true); 
     __CLR4_4_136d36dle6rxke6.R.inc(4133);JsonElement element1 = Streams.parse(parser); 
     __CLR4_4_136d36dle6rxke6.R.inc(4134);JsonElement element2 = Streams.parse(parser); 
     __CLR4_4_136d36dle6rxke6.R.inc(4135);BagOfPrimitives actualOne = gson.fromJson(element1, BagOfPrimitives.class); 
     __CLR4_4_136d36dle6rxke6.R.inc(4136);assertEquals("one", actualOne.stringValue); 
     __CLR4_4_136d36dle6rxke6.R.inc(4137);BagOfPrimitives actualTwo = gson.fromJson(element2, BagOfPrimitives.class); 
     __CLR4_4_136d36dle6rxke6.R.inc(4138);assertEquals("two", actualTwo.stringValue); 
 }finally{__CLR4_4_136d36dle6rxke6.R.flushNeeded();}} 


public void testParseMixedArray214() {__CLR4_4_136d36dle6rxke6.R.globalSliceStart(getClass().getName(),4139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8pbur36z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_136d36dle6rxke6.R.rethrow($CLV_t2$);}finally{__CLR4_4_136d36dle6rxke6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonParserTest.testParseMixedArray214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8pbur36z(){try{__CLR4_4_136d36dle6rxke6.R.inc(4139); 
     __CLR4_4_136d36dle6rxke6.R.inc(4140);String json = "[{},13,\"stringValue\"]"; 
     __CLR4_4_136d36dle6rxke6.R.inc(4141);JsonElement e = parser.parse(json); 
     __CLR4_4_136d36dle6rxke6.R.inc(4142);assertTrue(e.isJsonArray()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4143);JsonArray array = e.getAsJsonArray(); 
     __CLR4_4_136d36dle6rxke6.R.inc(4144);assertEquals("{}", array.get(0).toString()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4145);assertEquals(13, array.get(1).getAsInt()); 
     __CLR4_4_136d36dle6rxke6.R.inc(4146);assertEquals("stringValue", array.get(2).getAsString()); 
 }finally{__CLR4_4_136d36dle6rxke6.R.flushNeeded();}} 

  
  
  

  
  
  

  
  
  
}
