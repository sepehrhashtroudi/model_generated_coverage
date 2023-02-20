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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_14r94r9le6rxkvf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,6400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testLenientSemicolonDelimitedArray48() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc66bt4r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc66bt4r9() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6165); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6166);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6167);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6168);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6169);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6170);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testDoubles50() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ldtwu4rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ldtwu4rf() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6171); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6172);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6173);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6174);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6175);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6176);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6177);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6178);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6179);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6180);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6181);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6182);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6183);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6184);reader.endArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6185);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testReadEmptyObject51() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkvs6f4ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkvs6f4ru() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6186); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6187);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6188);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6189);assertFalse(reader.hasNext()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6190);reader.endObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6191);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testNextFailuresDoNotAdvance52() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz3vxo4s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz3vxo4s0() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6192); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6193);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6194);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6195);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6196);reader.nextString(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6197);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6198);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6199);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6200);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6201);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6202);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6203);reader.beginArray(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6204);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6205);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6206);reader.endArray(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6207);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6208);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6209);reader.beginObject(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6210);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6211);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6212);reader.endObject(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6213);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6214);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6215);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6216);reader.nextString(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6217);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6218);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6219);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6220);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6221);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6222);reader.beginArray(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6223);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6224);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6225);reader.endArray(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6226);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6227);reader.endObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6228);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6229);reader.close(); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testNullLiteralIsNotAString53() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144ogd84t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144ogd84t2() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6230); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6231);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6232);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6233);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6234);reader.nextString(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6235);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictNonExecutePrefix54() {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3u8r4t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonExecutePrefix54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3u8r4t8(){try{__CLR4_4_14r94r9le6rxkvf.R.inc(6236); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6237);JsonReader reader = new JsonReader(new StringReader(")]}'\n []")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6238);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6239);reader.beginArray(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6240);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testPrematureEndOfInput55() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1z6x44td();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1z6x44td() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6241); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6242);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6243);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6244);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6245);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6246);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6247);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6248);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictMultipleTopLevelValues56() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqy6ik4tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqy6ik4tl() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6249); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6250);JsonReader reader = new JsonReader(new StringReader("[] []")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6251);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6252);reader.endArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6253);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6254);reader.peek(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6255);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientMultipleTopLevelValues57() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb92s14ts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientMultipleTopLevelValues57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb92s14ts() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6256); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6257);JsonReader reader = new JsonReader(new StringReader("[] true {}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6258);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6259);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6260);reader.endArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6261);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6262);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6263);reader.endObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6264);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testPrematurelyClosed58() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16egun04u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematurelyClosed58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16egun04u1() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6265); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6266);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6267);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6268);reader.beginObject(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6269);reader.close(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6270);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6271);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6272);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6273);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6274);reader.close(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6275);reader.beginObject(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6276);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6277);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6278);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6279);reader.beginObject(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6280);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6281);reader.peek(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6282);reader.close(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6283);reader.nextBoolean(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6284);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientNonExecutePrefixWithLeadingWhitespace59() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1va61wp4ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonExecutePrefixWithLeadingWhitespace59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1va61wp4ul() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6285); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6286);JsonReader reader = new JsonReader(new StringReader("\r\n \t)]}'\n []")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6287);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6288);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6289);reader.endArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6290);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictSingleQuotedNames60() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1st3mv64ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames60",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1st3mv64ur() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6291); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6292);JsonReader reader = new JsonReader(new StringReader("{'a':true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6293);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6294);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6295);reader.nextName(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6296);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientSingleQuotedStrings61() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bepoc14ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedStrings61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bepoc14ux() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6297); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6298);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6299);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6300);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6301);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testMixedCaseLiterals62() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox9ccg4v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMixedCaseLiterals62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox9ccg4v2() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6302); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6303);JsonReader reader = new JsonReader(new StringReader("[True,TruE,False,FALSE,NULL,nulL]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6304);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6305);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6306);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6307);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6308);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6309);reader.nextNull(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6310);reader.nextNull(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6311);reader.endArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6312);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStringNullIsNotNull63() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1larzcm4vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStringNullIsNotNull63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1larzcm4vd() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6313); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6314);JsonReader reader = new JsonReader(new StringReader("[\"null\"]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6315);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6316);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6317);reader.nextNull(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6318);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testSkipObject64() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116ip054vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject64",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116ip054vj() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6319); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6320);JsonReader reader = new JsonReader(new StringReader("{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6321);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6322);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6323);reader.skipValue(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6324);assertEquals("b", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6325);reader.skipValue(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6326);reader.endObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6327);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientSemicolonDelimitedNameValuePair65() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syppfd4vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedNameValuePair65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syppfd4vs() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6328); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6329);JsonReader reader = new JsonReader(new StringReader("{\"a\":true;\"b\":true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6330);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6331);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6332);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6333);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6334);assertEquals("b", reader.nextName()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictNameValueSeparator66() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bia2kf4vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNameValueSeparator66",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bia2kf4vz() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6335); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6336);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6337);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6338);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6339);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6340);reader.nextBoolean(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6341);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6342);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6343);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6344);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6345);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6346);reader.nextBoolean(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6347);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientNameValueSeparator67() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dspil04wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNameValueSeparator67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dspil04wc() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6348); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6349);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6350);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6351);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6352);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6353);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6354);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6355);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6356);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6357);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6358);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictSingleQuotedStrings69() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrscwv4wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedStrings69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrscwv4wn() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6359); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6360);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6361);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6362);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6363);reader.nextString(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6364);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientComments70() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l82kvt4wt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments70",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l82kvt4wt() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6365); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6366);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6367);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6368);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6369);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6370);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6371);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6372);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6373);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6374);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6375);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6376);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6377);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testMissingValue71() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtwk2q4x6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMissingValue71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtwk2q4x6() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6378); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6379);JsonReader reader = new JsonReader(new StringReader("{\"a\":}")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6380);reader.beginObject(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6381);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6382);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6383);reader.nextString(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6384);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testNoTopLevelObject73() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx7vdo4xd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNoTopLevelObject73",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx7vdo4xd() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6385); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6386);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6387);new JsonReader(new StringReader("true")).nextBoolean(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testLenientUnquotedStrings75() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8tmzl4xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedStrings75",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8tmzl4xg() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6388); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6389);JsonReader reader = new JsonReader(new StringReader("[a]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6390);reader.setLenient(true); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6391);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6392);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 


public void testStrictSemicolonDelimitedArray80() throws IOException {__CLR4_4_14r94r9le6rxkvf.R.globalSliceStart(getClass().getName(),6393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9hlsb4xl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r94r9le6rxkvf.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r94r9le6rxkvf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedArray80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9hlsb4xl() throws IOException{try{__CLR4_4_14r94r9le6rxkvf.R.inc(6393); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6394);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6395);reader.beginArray(); 
     __CLR4_4_14r94r9le6rxkvf.R.inc(6396);try { 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6397);reader.nextBoolean(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6398);reader.nextBoolean(); 
         __CLR4_4_14r94r9le6rxkvf.R.inc(6399);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r94r9le6rxkvf.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
