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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_14qh4qhle6rvqw4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,6466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testLenientSemicolonDelimitedArray44() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ooy0hf4qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ooy0hf4qh() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6137); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6138);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6139);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6140);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6141);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6142);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testNulls45() {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5jxoi4qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNulls45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5jxoi4qn(){try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6143); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6144);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6145);new JsonReader(null); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6146);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testDoubles47() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gk8yx24qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gk8yx24qr() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6147); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6148);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6149);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6150);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6151);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6152);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6153);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6154);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6155);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6156);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6157);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6158);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6159);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6160);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6161);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testReadEmptyObject48() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dm0n674r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dm0n674r6() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6162); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6163);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6164);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6165);assertFalse(reader.hasNext()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6166);reader.endObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6167);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testNextFailuresDoNotAdvance49() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j08qxg4rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j08qxg4rc() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6168); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6169);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6170);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6171);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6172);reader.nextString(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6173);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6174);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6175);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6176);reader.nextName(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6177);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6178);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6179);reader.beginArray(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6180);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6181);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6182);reader.endArray(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6183);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6184);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6185);reader.beginObject(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6186);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6187);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6188);reader.endObject(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6189);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6190);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6191);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6192);reader.nextString(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6193);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6194);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6195);reader.nextName(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6196);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6197);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6198);reader.beginArray(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6199);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6200);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6201);reader.endArray(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6202);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6203);reader.endObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6204);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6205);reader.close(); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictNonExecutePrefix50() {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5w0x54se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonExecutePrefix50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5w0x54se(){try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6206); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6207);JsonReader reader = new JsonReader(new StringReader(")]}'\n []")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6208);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6209);reader.beginArray(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6210);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testPrematureEndOfInput51() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rz4zw44sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rz4zw44sj() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6211); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6212);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6213);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6214);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6215);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6216);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6217);reader.nextName(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6218);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictMultipleTopLevelValues52() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1za60ao4sr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1za60ao4sr() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6219); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6220);JsonReader reader = new JsonReader(new StringReader("[] []")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6221);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6222);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6223);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6224);reader.peek(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6225);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientMultipleTopLevelValues53() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb8xxx4sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientMultipleTopLevelValues53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb8xxx4sy() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6226); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6227);JsonReader reader = new JsonReader(new StringReader("[] true {}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6228);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6229);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6230);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6231);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6232);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6233);reader.endObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6234);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testPrematurelyClosed54() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lj0iw4t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematurelyClosed54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lj0iw4t7() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6235); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6236);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6237);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6238);reader.beginObject(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6239);reader.close(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6240);reader.nextName(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6241);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6242);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6243);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6244);reader.close(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6245);reader.beginObject(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6246);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6247);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6248);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6249);reader.beginObject(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6250);reader.nextName(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6251);reader.peek(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6252);reader.close(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6253);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6254);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientUnnecessaryArraySeparators55() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w1rr14tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnnecessaryArraySeparators55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w1rr14tr() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6255); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6256);JsonReader reader = new JsonReader(new StringReader("[true,,true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6257);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6258);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6259);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6260);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6261);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6262);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6263);reader = new JsonReader(new StringReader("[,true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6264);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6265);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6266);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6267);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6268);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6269);reader = new JsonReader(new StringReader("[true,]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6270);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6271);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6272);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6273);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6274);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6275);reader = new JsonReader(new StringReader("[,]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6276);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6277);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6278);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6279);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6280);reader.endArray(); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientUnquotedNames56() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwn27q4uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwn27q4uh() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6281); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6282);JsonReader reader = new JsonReader(new StringReader("{a:true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6283);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6284);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6285);assertEquals("a", reader.nextName()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientSingleQuotedStrings57() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmks4q4um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedStrings57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmks4q4um() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6286); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6287);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6288);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6289);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6290);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testMixedCaseLiterals58() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epe8jr4ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMixedCaseLiterals58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epe8jr4ur() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6291); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6292);JsonReader reader = new JsonReader(new StringReader("[True,TruE,False,FALSE,NULL,nulL]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6293);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6294);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6295);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6296);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6297);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6298);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6299);reader.nextNull(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6300);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6301);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStringNullIsNotNull59() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vin35b4v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStringNullIsNotNull59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vin35b4v2() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6302); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6303);JsonReader reader = new JsonReader(new StringReader("[\"null\"]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6304);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6305);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6306);reader.nextNull(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6307);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testNumberWithOctalPrefix60() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox2sv74v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNumberWithOctalPrefix60",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox2sv74v8() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6308); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6309);String json = "[01]"; 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6310);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6311);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6312);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6313);reader.nextInt(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6314);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6315);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6316);reader.nextLong(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6317);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6318);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6319);reader.nextDouble(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6320);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6321);assertEquals("01", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6322);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6323);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictNonFiniteDoubles61() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bptwgz4vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonFiniteDoubles61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bptwgz4vo() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6324); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6325);String json = "[NaN]"; 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6326);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6327);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6328);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6329);reader.nextDouble(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6330);fail(); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testIntegersWithFractionalPartSpecified62() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iawpay4vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testIntegersWithFractionalPartSpecified62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iawpay4vv() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6331); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6332);JsonReader reader = new JsonReader(new StringReader("[1.0,1.0,1.0]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6333);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6334);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6335);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6336);assertEquals(1L, reader.nextLong()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLongs63() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu2gl34w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLongs63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu2gl34w1() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6337); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6338);String json = "[0,0,0," + "1,1,1," + "-1,-1,-1," + "-9223372036854775808," + "9223372036854775807]"; 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6339);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6340);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6341);assertEquals(0L, reader.nextLong()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6342);assertEquals(0, reader.nextInt()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6343);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6344);assertEquals(1L, reader.nextLong()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6345);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6346);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6347);assertEquals(-1L, reader.nextLong()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6348);assertEquals(-1, reader.nextInt()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6349);assertEquals(-1.0, reader.nextDouble()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6350);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6351);reader.nextInt(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6352);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6353);assertEquals(Long.MIN_VALUE, reader.nextLong()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6354);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6355);reader.nextInt(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6356);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6357);assertEquals(Long.MAX_VALUE, reader.nextLong()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6358);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6359);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictNameValueSeparator65() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1era1cw4wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNameValueSeparator65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1era1cw4wo() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6360); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6361);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6362);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6363);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6364);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6365);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6366);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6367);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6368);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6369);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6370);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6371);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6372);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientNameValueSeparator66() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1phdh4x1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNameValueSeparator66",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1phdh4x1() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6373); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6374);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6375);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6376);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6377);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6378);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6379);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6380);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6381);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6382);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6383);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictSingleQuotedStrings67() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9saht4xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedStrings67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9saht4xc() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6384); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6385);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6386);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6387);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6388);reader.nextString(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6389);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictComments68() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wc3nso4xi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictComments68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wc3nso4xi() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6390); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6391);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6392);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6393);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6394);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6395);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6396);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6397);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6398);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6399);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6400);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6401);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6402);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6403);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6404);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6405);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientComments69() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kr7dgj4xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kr7dgj4xy() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6406); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6407);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6408);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6409);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6410);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6411);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6412);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6413);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6414);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6415);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6416);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6417);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6418);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testCharacterUnescaping70() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zc8ry4yb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testCharacterUnescaping70",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zc8ry4yb() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6419); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6420);String json = "[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"," + "\"\\u20AC\"" + "]"; 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6421);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6422);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6423);assertEquals("a", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6424);assertEquals("a\"", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6425);assertEquals("\"", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6426);assertEquals(":", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6427);assertEquals(",", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6428);assertEquals("\b", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6429);assertEquals("\f", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6430);assertEquals("\n", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6431);assertEquals("\r", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6432);assertEquals("\t", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6433);assertEquals(" ", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6434);assertEquals("\\", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6435);assertEquals("{", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6436);assertEquals("}", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6437);assertEquals("[", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6438);assertEquals("]", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6439);assertEquals("\0", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6440);assertEquals("", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6441);assertEquals("\u20ac", reader.nextString()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6442);reader.endArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6443);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testMissingValue71() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtwk2q4z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMissingValue71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtwk2q4z0() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6444); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6445);JsonReader reader = new JsonReader(new StringReader("{\"a\":}")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6446);reader.beginObject(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6447);assertEquals("a", reader.nextName()); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6448);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6449);reader.nextString(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6450);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testNoTopLevelObject73() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx7vdo4z7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNoTopLevelObject73",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx7vdo4z7() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6451); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6452);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6453);new JsonReader(new StringReader("true")).nextBoolean(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testLenientUnquotedStrings74() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uzto744za();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedStrings74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uzto744za() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6454); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6455);JsonReader reader = new JsonReader(new StringReader("[a]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6456);reader.setLenient(true); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6457);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6458);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 


public void testStrictSemicolonDelimitedArray81() throws IOException {__CLR4_4_14qh4qhle6rvqw4.R.globalSliceStart(getClass().getName(),6459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0hmzu4zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qh4qhle6rvqw4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qh4qhle6rvqw4.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedArray81",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0hmzu4zf() throws IOException{try{__CLR4_4_14qh4qhle6rvqw4.R.inc(6459); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6460);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6461);reader.beginArray(); 
     __CLR4_4_14qh4qhle6rvqw4.R.inc(6462);try { 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6463);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6464);reader.nextBoolean(); 
         __CLR4_4_14qh4qhle6rvqw4.R.inc(6465);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14qh4qhle6rvqw4.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
