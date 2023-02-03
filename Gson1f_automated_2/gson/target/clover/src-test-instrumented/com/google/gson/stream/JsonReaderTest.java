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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_141q41qld3n63bf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165929950L,8589935092L,5293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testStrictMultipleTopLevelValues18() throws IOException {__CLR4_4_141q41qld3n63bf.R.globalSliceStart(getClass().getName(),5246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xu8ui41q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141q41qld3n63bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_141q41qld3n63bf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xu8ui41q() throws IOException{try{__CLR4_4_141q41qld3n63bf.R.inc(5246); 
     __CLR4_4_141q41qld3n63bf.R.inc(5247);JsonReader reader = new JsonReader(new StringReader("[] []")); 
     __CLR4_4_141q41qld3n63bf.R.inc(5248);reader.beginArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5249);reader.endArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5250);try { 
         __CLR4_4_141q41qld3n63bf.R.inc(5251);reader.peek(); 
         __CLR4_4_141q41qld3n63bf.R.inc(5252);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_141q41qld3n63bf.R.flushNeeded();}}
public void testDoubles19() throws IOException {__CLR4_4_141q41qld3n63bf.R.globalSliceStart(getClass().getName(),5253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6pozl41x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141q41qld3n63bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_141q41qld3n63bf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6pozl41x() throws IOException{try{__CLR4_4_141q41qld3n63bf.R.inc(5253); 
     __CLR4_4_141q41qld3n63bf.R.inc(5254);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_141q41qld3n63bf.R.inc(5255);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_141q41qld3n63bf.R.inc(5256);reader.beginArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5257);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5258);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5259);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5260);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5261);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5262);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5263);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5264);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5265);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5266);reader.endArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5267);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141q41qld3n63bf.R.flushNeeded();}}
public void testStrictComments20() throws IOException {__CLR4_4_141q41qld3n63bf.R.globalSliceStart(getClass().getName(),5268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tiwf9042c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141q41qld3n63bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_141q41qld3n63bf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictComments20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tiwf9042c() throws IOException{try{__CLR4_4_141q41qld3n63bf.R.inc(5268); 
     __CLR4_4_141q41qld3n63bf.R.inc(5269);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_141q41qld3n63bf.R.inc(5270);reader.beginArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5271);try { 
         __CLR4_4_141q41qld3n63bf.R.inc(5272);reader.nextBoolean(); 
         __CLR4_4_141q41qld3n63bf.R.inc(5273);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_141q41qld3n63bf.R.inc(5274);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_141q41qld3n63bf.R.inc(5275);reader.beginArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5276);try { 
         __CLR4_4_141q41qld3n63bf.R.inc(5277);reader.nextBoolean(); 
         __CLR4_4_141q41qld3n63bf.R.inc(5278);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_141q41qld3n63bf.R.inc(5279);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_141q41qld3n63bf.R.inc(5280);reader.beginArray(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5281);try { 
         __CLR4_4_141q41qld3n63bf.R.inc(5282);reader.nextBoolean(); 
         __CLR4_4_141q41qld3n63bf.R.inc(5283);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_141q41qld3n63bf.R.flushNeeded();}}
public void testSkipObject21() throws IOException {__CLR4_4_141q41qld3n63bf.R.globalSliceStart(getClass().getName(),5284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1embaeu42s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141q41qld3n63bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_141q41qld3n63bf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1embaeu42s() throws IOException{try{__CLR4_4_141q41qld3n63bf.R.inc(5284); 
     __CLR4_4_141q41qld3n63bf.R.inc(5285);JsonReader reader = new JsonReader(new StringReader("{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}")); 
     __CLR4_4_141q41qld3n63bf.R.inc(5286);reader.beginObject(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5287);assertEquals("a", reader.nextName()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5288);reader.skipValue(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5289);assertEquals("b", reader.nextName()); 
     __CLR4_4_141q41qld3n63bf.R.inc(5290);reader.skipValue(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5291);reader.endObject(); 
     __CLR4_4_141q41qld3n63bf.R.inc(5292);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141q41qld3n63bf.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
