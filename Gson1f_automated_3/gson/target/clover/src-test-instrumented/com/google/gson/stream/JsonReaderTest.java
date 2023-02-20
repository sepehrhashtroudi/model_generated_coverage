/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringReader;

public final class JsonReaderTest extends TestCase {static class __CLR4_4_140x40xle6p204w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,5264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testLenientSemicolonDelimitedArray14() throws IOException {__CLR4_4_140x40xle6p204w.R.globalSliceStart(getClass().getName(),5217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16khcty40x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140x40xle6p204w.R.rethrow($CLV_t2$);}finally{__CLR4_4_140x40xle6p204w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16khcty40x() throws IOException{try{__CLR4_4_140x40xle6p204w.R.inc(5217); 
     __CLR4_4_140x40xle6p204w.R.inc(5218);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_140x40xle6p204w.R.inc(5219);reader.setLenient(true); 
     __CLR4_4_140x40xle6p204w.R.inc(5220);reader.beginArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5221);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_140x40xle6p204w.R.inc(5222);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_140x40xle6p204w.R.flushNeeded();}}
public void testStrictSingleQuotedNames15() throws IOException {__CLR4_4_140x40xle6p204w.R.globalSliceStart(getClass().getName(),5223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j367o8413();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140x40xle6p204w.R.rethrow($CLV_t2$);}finally{__CLR4_4_140x40xle6p204w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j367o8413() throws IOException{try{__CLR4_4_140x40xle6p204w.R.inc(5223); 
     __CLR4_4_140x40xle6p204w.R.inc(5224);JsonReader reader = new JsonReader(new StringReader("{'a':true}")); 
     __CLR4_4_140x40xle6p204w.R.inc(5225);reader.beginObject(); 
     __CLR4_4_140x40xle6p204w.R.inc(5226);try { 
         __CLR4_4_140x40xle6p204w.R.inc(5227);reader.nextName(); 
         __CLR4_4_140x40xle6p204w.R.inc(5228);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_140x40xle6p204w.R.flushNeeded();}}
public void testLenientUnquotedNames16() throws IOException {__CLR4_4_140x40xle6p204w.R.globalSliceStart(getClass().getName(),5229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11a5fke419();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140x40xle6p204w.R.rethrow($CLV_t2$);}finally{__CLR4_4_140x40xle6p204w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11a5fke419() throws IOException{try{__CLR4_4_140x40xle6p204w.R.inc(5229); 
     __CLR4_4_140x40xle6p204w.R.inc(5230);JsonReader reader = new JsonReader(new StringReader("{a:true}")); 
     __CLR4_4_140x40xle6p204w.R.inc(5231);reader.setLenient(true); 
     __CLR4_4_140x40xle6p204w.R.inc(5232);reader.beginObject(); 
     __CLR4_4_140x40xle6p204w.R.inc(5233);try { 
         __CLR4_4_140x40xle6p204w.R.inc(5234);reader.nextName(); 
         __CLR4_4_140x40xle6p204w.R.inc(5235);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_140x40xle6p204w.R.flushNeeded();}}
public void testLenientComments17() throws IOException {__CLR4_4_140x40xle6p204w.R.globalSliceStart(getClass().getName(),5236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17q514641g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140x40xle6p204w.R.rethrow($CLV_t2$);}finally{__CLR4_4_140x40xle6p204w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17q514641g() throws IOException{try{__CLR4_4_140x40xle6p204w.R.inc(5236); 
     __CLR4_4_140x40xle6p204w.R.inc(5237);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_140x40xle6p204w.R.inc(5238);reader.setLenient(true); 
     __CLR4_4_140x40xle6p204w.R.inc(5239);reader.beginArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5240);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_140x40xle6p204w.R.inc(5241);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_140x40xle6p204w.R.inc(5242);reader.setLenient(true); 
     __CLR4_4_140x40xle6p204w.R.inc(5243);reader.beginArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5244);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_140x40xle6p204w.R.inc(5245);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_140x40xle6p204w.R.inc(5246);reader.setLenient(true); 
     __CLR4_4_140x40xle6p204w.R.inc(5247);reader.beginArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5248);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_140x40xle6p204w.R.flushNeeded();}}
public void testDoubles18() throws IOException {__CLR4_4_140x40xle6p204w.R.globalSliceStart(getClass().getName(),5249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfpns241t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140x40xle6p204w.R.rethrow($CLV_t2$);}finally{__CLR4_4_140x40xle6p204w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfpns241t() throws IOException{try{__CLR4_4_140x40xle6p204w.R.inc(5249); 
     __CLR4_4_140x40xle6p204w.R.inc(5250);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_140x40xle6p204w.R.inc(5251);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_140x40xle6p204w.R.inc(5252);reader.beginArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5253);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5254);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5255);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5256);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5257);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5258);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5259);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5260);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5261);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_140x40xle6p204w.R.inc(5262);reader.endArray(); 
     __CLR4_4_140x40xle6p204w.R.inc(5263);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_140x40xle6p204w.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
