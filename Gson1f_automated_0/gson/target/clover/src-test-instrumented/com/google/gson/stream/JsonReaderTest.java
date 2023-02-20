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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_141r41rle6ora0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526778980L,8589935092L,5348,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testLenientSemicolonDelimitedArray17() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbh97d41r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbh97d41r() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5247); 
     __CLR4_4_141r41rle6ora0s.R.inc(5248);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5249);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5250);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5251);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5252);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testLenientUnquotedNames18() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s5d5c41x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s5d5c41x() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5253); 
     __CLR4_4_141r41rle6ora0s.R.inc(5254);JsonReader reader = new JsonReader(new StringReader("{a:true}")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5255);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5256);reader.beginObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5257);assertEquals("a", reader.nextName()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testLenientSingleQuotedStrings19() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1827n8c422();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedStrings19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1827n8c422() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5258); 
     __CLR4_4_141r41rle6ora0s.R.inc(5259);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5260);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5261);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5262);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testNextFailuresDoNotAdvance20() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cnap9427();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cnap9427() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5263); 
     __CLR4_4_141r41rle6ora0s.R.inc(5264);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5265);reader.beginObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5266);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5267);reader.nextString(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5268);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5269);assertEquals("a", reader.nextName()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5270);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5271);reader.nextName(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5272);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5273);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5274);reader.beginArray(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5275);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5276);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5277);reader.endArray(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5278);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5279);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5280);reader.beginObject(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5281);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5282);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5283);reader.endObject(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5284);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5285);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5286);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5287);reader.nextString(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5288);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5289);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5290);reader.nextName(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5291);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5292);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5293);reader.beginArray(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5294);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5295);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5296);reader.endArray(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5297);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141r41rle6ora0s.R.inc(5298);reader.endObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5299);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5300);reader.close(); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testDoubles21() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oguiru439();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oguiru439() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5301); 
     __CLR4_4_141r41rle6ora0s.R.inc(5302);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_141r41rle6ora0s.R.inc(5303);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_141r41rle6ora0s.R.inc(5304);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5305);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5306);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5307);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5308);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5309);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5310);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5311);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5312);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5313);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5314);reader.endArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5315);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testPrematureEndOfInput22() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3ob1443o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3ob1443o() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5316); 
     __CLR4_4_141r41rle6ora0s.R.inc(5317);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5318);reader.beginObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5319);assertEquals("a", reader.nextName()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5320);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5321);try { 
         __CLR4_4_141r41rle6ora0s.R.inc(5322);reader.nextName(); 
         __CLR4_4_141r41rle6ora0s.R.inc(5323);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testReadEmptyObject23() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yf23w43w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yf23w43w() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5324); 
     __CLR4_4_141r41rle6ora0s.R.inc(5325);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5326);reader.beginObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5327);assertFalse(reader.hasNext()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5328);reader.endObject(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5329);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testLenientComments25() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy002r442();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy002r442() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5330); 
     __CLR4_4_141r41rle6ora0s.R.inc(5331);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5332);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5333);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5334);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5335);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5336);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5337);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5338);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141r41rle6ora0s.R.inc(5339);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5340);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5341);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5342);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
public void testLenientUnquotedStrings27() throws IOException {__CLR4_4_141r41rle6ora0s.R.globalSliceStart(getClass().getName(),5343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7r5t444f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141r41rle6ora0s.R.rethrow($CLV_t2$);}finally{__CLR4_4_141r41rle6ora0s.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedStrings27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7r5t444f() throws IOException{try{__CLR4_4_141r41rle6ora0s.R.inc(5343); 
     __CLR4_4_141r41rle6ora0s.R.inc(5344);JsonReader reader = new JsonReader(new StringReader("[a]")); 
     __CLR4_4_141r41rle6ora0s.R.inc(5345);reader.setLenient(true); 
     __CLR4_4_141r41rle6ora0s.R.inc(5346);reader.beginArray(); 
     __CLR4_4_141r41rle6ora0s.R.inc(5347);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_141r41rle6ora0s.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
