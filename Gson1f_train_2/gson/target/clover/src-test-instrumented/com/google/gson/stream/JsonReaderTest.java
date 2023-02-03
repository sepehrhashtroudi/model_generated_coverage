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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_14r04r0ld3ms485{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,6481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testLenientSemicolonDelimitedArray40() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boy5bj4r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boy5bj4r0() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6156); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6157);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6158);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6159);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6160);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6161);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testNulls41() {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155k2im4r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNulls41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155k2im4r6(){try{__CLR4_4_14r04r0ld3ms485.R.inc(6162); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6163);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6164);new JsonReader(null); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6165);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testDoubles42() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wt8svf4ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wt8svf4ra() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6166); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6167);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_14r04r0ld3ms485.R.inc(6168);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6169);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6170);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6171);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6172);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6173);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6174);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6175);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6176);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6177);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6178);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6179);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6180);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testReadEmptyObject43() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mz6s64rp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mz6s64rp() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6181); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6182);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6183);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6184);assertFalse(reader.hasNext()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6185);reader.endObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6186);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testNextFailuresDoNotAdvance44() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r8wz34rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r8wz34rv() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6187); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6188);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6189);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6190);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6191);reader.nextString(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6192);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6193);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6194);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6195);reader.nextName(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6196);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6197);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6198);reader.beginArray(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6199);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6200);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6201);reader.endArray(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6202);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6203);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6204);reader.beginObject(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6205);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6206);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6207);reader.endObject(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6208);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6209);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6210);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6211);reader.nextString(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6212);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6213);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6214);reader.nextName(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6215);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6216);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6217);reader.beginArray(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6218);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6219);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6220);reader.endArray(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6221);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6222);reader.endObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6223);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6224);reader.close(); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testNullLiteralIsNotAString45() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcjfbt4sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcjfbt4sx() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6225); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6226);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6227);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6228);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6229);reader.nextString(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6230);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testPrematureEndOfInput46() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ei9xay4t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematureEndOfInput46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ei9xay4t3() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6231); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6232);JsonReader reader = new JsonReader(new StringReader("{\"a\":true,")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6233);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6234);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6235);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6236);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6237);reader.nextName(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6238);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictMultipleTopLevelValues47() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltaxpi4tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltaxpi4tb() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6239); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6240);JsonReader reader = new JsonReader(new StringReader("[] []")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6241);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6242);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6243);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6244);reader.peek(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6245);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientMultipleTopLevelValues48() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p901g14ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientMultipleTopLevelValues48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p901g14ti() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6246); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6247);JsonReader reader = new JsonReader(new StringReader("[] true {}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6248);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6249);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6250);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6251);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6252);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6253);reader.endObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6254);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientUnnecessaryArraySeparators49() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tt9mm4tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnnecessaryArraySeparators49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tt9mm4tr() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6255); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6256);JsonReader reader = new JsonReader(new StringReader("[true,,true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6257);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6258);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6259);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6260);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6261);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6262);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6263);reader = new JsonReader(new StringReader("[,true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6264);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6265);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6266);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6267);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6268);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6269);reader = new JsonReader(new StringReader("[true,]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6270);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6271);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6272);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6273);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6274);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6275);reader = new JsonReader(new StringReader("[,]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6276);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6277);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6278);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6279);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6280);reader.endArray(); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientNonExecutePrefixWithLeadingWhitespace50() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1216csg4uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonExecutePrefixWithLeadingWhitespace50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1216csg4uh() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6281); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6282);JsonReader reader = new JsonReader(new StringReader("\r\n \t)]}'\n []")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6283);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6284);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6285);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6286);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictSingleQuotedNames51() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr5hcw4un();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr5hcw4un() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6287); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6288);JsonReader reader = new JsonReader(new StringReader("{'a':true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6289);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6290);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6291);reader.nextName(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6292);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientUnquotedNames52() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywmxdm4ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywmxdm4ut() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6293); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6294);JsonReader reader = new JsonReader(new StringReader("{a:true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6295);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6296);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6297);assertEquals("a", reader.nextName()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientSingleQuotedStrings53() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymknam4uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSingleQuotedStrings53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymknam4uy() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6298); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6299);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6300);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6301);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6302);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testMixedCaseLiterals54() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11peddv4v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMixedCaseLiterals54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11peddv4v3() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6303); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6304);JsonReader reader = new JsonReader(new StringReader("[True,TruE,False,FALSE,NULL,nulL]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6305);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6306);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6307);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6308);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6309);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6310);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6311);reader.nextNull(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6312);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6313);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStringNullIsNotNull55() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qih3nx4ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStringNullIsNotNull55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qih3nx4ve() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6314); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6315);JsonReader reader = new JsonReader(new StringReader("[\"null\"]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6316);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6317);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6318);reader.nextNull(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6319);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testNumberWithOctalPrefix56() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4xwnw4vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNumberWithOctalPrefix56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4xwnw4vk() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6320); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6321);String json = "[01]"; 
     __CLR4_4_14r04r0ld3ms485.R.inc(6322);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6323);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6324);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6325);reader.nextInt(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6326);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6327);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6328);reader.nextLong(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6329);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6330);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6331);reader.nextDouble(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6332);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6333);assertEquals("01", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6334);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6335);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictNonFiniteDoubles57() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hysoa4w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonFiniteDoubles57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hysoa4w0() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6336); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6337);String json = "[NaN]"; 
     __CLR4_4_14r04r0ld3ms485.R.inc(6338);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6339);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6340);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6341);reader.nextDouble(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6342);fail(); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testIntegersWithFractionalPartSpecified58() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sirt3n4w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testIntegersWithFractionalPartSpecified58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sirt3n4w7() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6343); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6344);JsonReader reader = new JsonReader(new StringReader("[1.0,1.0,1.0]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6345);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6346);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6347);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6348);assertEquals(1L, reader.nextLong()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLongs59() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1xkds4wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLongs59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1xkds4wd() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6349); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6350);String json = "[0,0,0," + "1,1,1," + "-1,-1,-1," + "-9223372036854775808," + "9223372036854775807]"; 
     __CLR4_4_14r04r0ld3ms485.R.inc(6351);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6352);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6353);assertEquals(0L, reader.nextLong()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6354);assertEquals(0, reader.nextInt()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6355);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6356);assertEquals(1L, reader.nextLong()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6357);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6358);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6359);assertEquals(-1L, reader.nextLong()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6360);assertEquals(-1, reader.nextInt()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6361);assertEquals(-1.0, reader.nextDouble()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6362);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6363);reader.nextInt(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6364);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6365);assertEquals(Long.MIN_VALUE, reader.nextLong()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6366);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6367);reader.nextInt(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6368);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6369);assertEquals(Long.MAX_VALUE, reader.nextLong()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6370);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6371);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testSkipObject60() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bth65r4x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject60",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bth65r4x0() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6372); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6373);JsonReader reader = new JsonReader(new StringReader("{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6374);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6375);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6376);reader.skipValue(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6377);assertEquals("b", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6378);reader.skipValue(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6379);reader.endObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6380);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientSemicolonDelimitedNameValuePair62() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7pt1y4x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedNameValuePair62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7pt1y4x9() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6381); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6382);JsonReader reader = new JsonReader(new StringReader("{\"a\":true;\"b\":true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6383);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6384);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6385);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6386);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6387);assertEquals("b", reader.nextName()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictNameValueSeparator63() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l99yxu4xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNameValueSeparator63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l99yxu4xg() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6388); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6389);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6390);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6391);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6392);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6393);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6394);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6395);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6396);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6397);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6398);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6399);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6400);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientNameValueSeparator64() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njpeyf4xt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNameValueSeparator64",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njpeyf4xt() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6401); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6402);JsonReader reader = new JsonReader(new StringReader("{\"a\"=true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6403);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6404);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6405);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6406);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6407);reader = new JsonReader(new StringReader("{\"a\"=>true}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6408);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6409);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6410);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6411);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictSingleQuotedStrings66() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yibsou4y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedStrings66",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yibsou4y4() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6412); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6413);JsonReader reader = new JsonReader(new StringReader("['a']")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6414);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6415);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6416);reader.nextString(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6417);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictComments67() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t33p074ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictComments67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t33p074ya() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6418); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6419);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6420);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6421);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6422);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6423);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6424);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6425);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6426);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6427);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6428);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14r04r0ld3ms485.R.inc(6429);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6430);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6431);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6432);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6433);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testCharacterUnescaping68() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159h2k74yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testCharacterUnescaping68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159h2k74yq() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6434); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6435);String json = "[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"," + "\"\\u20AC\"" + "]"; 
     __CLR4_4_14r04r0ld3ms485.R.inc(6436);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6437);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6438);assertEquals("a", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6439);assertEquals("a\"", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6440);assertEquals("\"", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6441);assertEquals(":", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6442);assertEquals(",", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6443);assertEquals("\b", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6444);assertEquals("\f", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6445);assertEquals("\n", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6446);assertEquals("\r", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6447);assertEquals("\t", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6448);assertEquals(" ", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6449);assertEquals("\\", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6450);assertEquals("{", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6451);assertEquals("}", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6452);assertEquals("[", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6453);assertEquals("]", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6454);assertEquals("\0", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6455);assertEquals("", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6456);assertEquals("\u20ac", reader.nextString()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6457);reader.endArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6458);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testMissingValue69() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhcbon4zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMissingValue69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhcbon4zf() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6459); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6460);JsonReader reader = new JsonReader(new StringReader("{\"a\":}")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6461);reader.beginObject(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6462);assertEquals("a", reader.nextName()); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6463);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6464);reader.nextString(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6465);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testNoTopLevelObject71() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf7sym4zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNoTopLevelObject71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf7sym4zm() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6466); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6467);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6468);new JsonReader(new StringReader("true")).nextBoolean(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testLenientUnquotedStrings73() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqtpen4zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedStrings73",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqtpen4zp() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6469); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6470);JsonReader reader = new JsonReader(new StringReader("[a]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6471);reader.setLenient(true); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6472);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6473);assertEquals("a", reader.nextString()); 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 


public void testStrictSemicolonDelimitedArray79() throws IOException {__CLR4_4_14r04r0ld3ms485.R.globalSliceStart(getClass().getName(),6474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqct7l4zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14r04r0ld3ms485.R.rethrow($CLV_t2$);}finally{__CLR4_4_14r04r0ld3ms485.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedArray79",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqct7l4zu() throws IOException{try{__CLR4_4_14r04r0ld3ms485.R.inc(6474); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6475);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6476);reader.beginArray(); 
     __CLR4_4_14r04r0ld3ms485.R.inc(6477);try { 
         __CLR4_4_14r04r0ld3ms485.R.inc(6478);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6479);reader.nextBoolean(); 
         __CLR4_4_14r04r0ld3ms485.R.inc(6480);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14r04r0ld3ms485.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
