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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_141w41wle6ouxl8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526949504L,8589935092L,5371,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testNullLiteralIsNotAString13() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j241ew41w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j241ew41w() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5252); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5253);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5254);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5255);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5256);reader.nextString(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5257);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testLenientSemicolonDelimitedArray14() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16khcty422();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16khcty422() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5258); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5259);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5260);reader.setLenient(true); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5261);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5262);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5263);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testNextFailuresDoNotAdvance15() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c47rvx428();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c47rvx428() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5264); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5265);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5266);reader.beginObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5267);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5268);reader.nextString(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5269);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5270);assertEquals("a", reader.nextName()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5271);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5272);reader.nextName(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5273);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5274);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5275);reader.beginArray(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5276);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5277);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5278);reader.endArray(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5279);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5280);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5281);reader.beginObject(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5282);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5283);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5284);reader.endObject(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5285);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5286);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5287);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5288);reader.nextString(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5289);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5290);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5291);reader.nextName(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5292);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5293);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5294);reader.beginArray(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5295);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5296);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5297);reader.endArray(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5298);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_141w41wle6ouxl8.R.inc(5299);reader.endObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5300);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5301);reader.close(); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testNullLiteralIsNotAString16() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1st3xsb43a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1st3xsb43a() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5302); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5303);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5304);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5305);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5306);reader.nextNull(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5307);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testDoubles17() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yopmkj43g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yopmkj43g() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5308); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5309);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_141w41wle6ouxl8.R.inc(5310);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5311);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5312);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5313);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5314);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5315);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5316);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5317);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5318);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5319);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5320);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5321);reader.endArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5322);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testReadEmptyObject19() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119g1ot43v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119g1ot43v() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5323); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5324);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5325);reader.beginObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5326);assertFalse(reader.hasNext()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5327);reader.endObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5328);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testStrictSingleQuotedNames20() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mb532441();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mb532441() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5329); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5330);JsonReader reader = new JsonReader(new StringReader("{'a':true}")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5331);reader.beginObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5332);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5333);reader.nextName(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5334);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testSkipObject21() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1embaeu447();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1embaeu447() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5335); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5336);JsonReader reader = new JsonReader(new StringReader("{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5337);reader.beginObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5338);assertEquals("a", reader.nextName()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5339);reader.skipValue(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5340);assertEquals("b", reader.nextName()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5341);reader.skipValue(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5342);reader.endObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5343);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testLenientComments22() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l703pc44g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l703pc44g() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5344); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5345);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5346);reader.setLenient(true); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5347);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5348);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5349);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5350);reader.setLenient(true); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5351);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5352);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5353);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5354);reader.setLenient(true); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5355);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5356);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testPrematureEndOfInput23() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gco9tl44t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gco9tl44t() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5357); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5358);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5359);reader.beginObject(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5360);assertEquals("a", reader.nextName()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5361);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5362);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5363);reader.nextName(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5364);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
public void testNullLiteralIsNotAString25() throws IOException {__CLR4_4_141w41wle6ouxl8.R.globalSliceStart(getClass().getName(),5365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr56fr451();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141w41wle6ouxl8.R.rethrow($CLV_t2$);}finally{__CLR4_4_141w41wle6ouxl8.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr56fr451() throws IOException{try{__CLR4_4_141w41wle6ouxl8.R.inc(5365); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5366);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5367);reader.beginArray(); 
     __CLR4_4_141w41wle6ouxl8.R.inc(5368);try { 
         __CLR4_4_141w41wle6ouxl8.R.inc(5369);reader.nextString(); 
         __CLR4_4_141w41wle6ouxl8.R.inc(5370);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_141w41wle6ouxl8.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
