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

public final class JsonReaderTest extends TestCase {static class __CLR4_4_14rm4rmle6rzh4c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,6484,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testLenientSemicolonDelimitedArray43() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfy1oy4rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedArray43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfy1oy4rm() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6178); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6179);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6180);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6181);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6182);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6183);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testNulls44() {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewjyw14rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNulls44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewjyw14rs(){try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6184); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6185);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6186);new JsonReader(null); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6187);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testDoubles46() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt8xpj4rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testDoubles46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt8xpj4rw() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6188); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6189);String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6190);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6191);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6192);assertEquals(-0.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6193);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6194);assertEquals(1.7976931348623157E308, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6195);assertEquals(4.9E-324, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6196);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6197);assertEquals(-0.5, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6198);assertEquals(2.2250738585072014E-308, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6199);assertEquals(3.141592653589793, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6200);assertEquals(2.718281828459045, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6201);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6202);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testReadEmptyObject47() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad0odq4sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testReadEmptyObject47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad0odq4sb() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6203); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6204);JsonReader reader = new JsonReader(new StringReader("{}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6205);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6206);assertFalse(reader.hasNext()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6207);reader.endObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6208);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testNextFailuresDoNotAdvance48() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr8s4z4sh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNextFailuresDoNotAdvance48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr8s4z4sh() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6209); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6210);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6211);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6212);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6213);reader.nextString(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6214);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6215);assertEquals("a", reader.nextName()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6216);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6217);reader.nextName(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6218);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6219);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6220);reader.beginArray(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6221);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6222);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6223);reader.endArray(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6224);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6225);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6226);reader.beginObject(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6227);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6228);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6229);reader.endObject(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6230);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6231);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6232);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6233);reader.nextString(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6234);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6235);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6236);reader.nextName(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6237);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6238);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6239);reader.beginArray(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6240);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6241);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6242);reader.endArray(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6243);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6244);reader.endObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6245);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6246);reader.close(); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testNullLiteralIsNotAString49() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecjk5x4tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNullLiteralIsNotAString49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecjk5x4tj() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6247); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6248);JsonReader reader = new JsonReader(new StringReader("[null]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6249);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6250);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6251);reader.nextString(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6252);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictNonExecutePrefix50() {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5w0x54tp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonExecutePrefix50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5w0x54tp(){try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6253); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6254);JsonReader reader = new JsonReader(new StringReader(")]}'\n []")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6255);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6256);reader.beginArray(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6257);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictMultipleTopLevelValues51() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w161i74tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictMultipleTopLevelValues51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w161i74tu() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6258); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6259);JsonReader reader = new JsonReader(new StringReader("[] []")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6260);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6261);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6262);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6263);reader.peek(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6264);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testPrematurelyClosed52() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3iy3u4u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testPrematurelyClosed52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3iy3u4u1() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6265); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6266);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6267);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6268);reader.beginObject(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6269);reader.close(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6270);reader.nextName(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6271);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6272);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6273);JsonReader reader = new JsonReader(new StringReader("{\"a\":[]}")); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6274);reader.close(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6275);reader.beginObject(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6276);fail(); 
     } catch (IllegalStateException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6277);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6278);JsonReader reader = new JsonReader(new StringReader("{\"a\":true}")); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6279);reader.beginObject(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6280);reader.nextName(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6281);reader.peek(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6282);reader.close(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6283);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6284);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLenientUnnecessaryArraySeparators53() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11e1u634ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnnecessaryArraySeparators53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11e1u634ul() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6285); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6286);JsonReader reader = new JsonReader(new StringReader("[true,,true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6287);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6288);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6289);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6290);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6291);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6292);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6293);reader = new JsonReader(new StringReader("[,true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6294);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6295);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6296);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6297);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6298);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6299);reader = new JsonReader(new StringReader("[true,]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6300);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6301);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6302);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6303);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6304);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6305);reader = new JsonReader(new StringReader("[,]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6306);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6307);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6308);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6309);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6310);reader.endArray(); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLenientNonExecutePrefixWithLeadingWhitespace54() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f167yc4vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientNonExecutePrefixWithLeadingWhitespace54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f167yc4vb() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6311); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6312);JsonReader reader = new JsonReader(new StringReader("\r\n \t)]}'\n []")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6313);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6314);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6315);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6316);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictSingleQuotedNames55() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sr5cis4vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSingleQuotedNames55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sr5cis4vh() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6317); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6318);JsonReader reader = new JsonReader(new StringReader("{'a':true}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6319);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6320);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6321);reader.nextName(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6322);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLenientUnquotedNames56() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwn27q4vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientUnquotedNames56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwn27q4vn() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6323); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6324);JsonReader reader = new JsonReader(new StringReader("{a:true}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6325);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6326);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6327);assertEquals("a", reader.nextName()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testMixedCaseLiterals57() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bge9ra4vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMixedCaseLiterals57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bge9ra4vs() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6328); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6329);JsonReader reader = new JsonReader(new StringReader("[True,TruE,False,FALSE,NULL,nulL]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6330);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6331);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6332);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6333);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6334);assertEquals(false, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6335);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6336);reader.nextNull(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6337);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6338);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStringNullIsNotNull58() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrn1xs4w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStringNullIsNotNull58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrn1xs4w3() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6339); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6340);JsonReader reader = new JsonReader(new StringReader("[\"null\"]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6341);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6342);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6343);reader.nextNull(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6344);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testNumberWithOctalPrefix59() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdy0ah4w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNumberWithOctalPrefix59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdy0ah4w9() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6345); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6346);String json = "[01]"; 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6347);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6348);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6349);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6350);reader.nextInt(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6351);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6352);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6353);reader.nextLong(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6354);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6355);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6356);reader.nextDouble(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6357);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6358);assertEquals("01", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6359);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6360);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictNonFiniteDoubles60() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gtxoi4wp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictNonFiniteDoubles60",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gtxoi4wp() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6361); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6362);String json = "[NaN]"; 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6363);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6364);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6365);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6366);reader.nextDouble(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6367);fail(); 
     } catch (NumberFormatException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testIntegersWithFractionalPartSpecified61() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljwo3f4ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testIntegersWithFractionalPartSpecified61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljwo3f4ww() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6368); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6369);JsonReader reader = new JsonReader(new StringReader("[1.0,1.0,1.0]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6370);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6371);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6372);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6373);assertEquals(1L, reader.nextLong()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLongs62() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k32fdk4x2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLongs62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k32fdk4x2() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6374); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6375);String json = "[0,0,0," + "1,1,1," + "-1,-1,-1," + "-9223372036854775808," + "9223372036854775807]"; 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6376);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6377);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6378);assertEquals(0L, reader.nextLong()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6379);assertEquals(0, reader.nextInt()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6380);assertEquals(0.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6381);assertEquals(1L, reader.nextLong()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6382);assertEquals(1, reader.nextInt()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6383);assertEquals(1.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6384);assertEquals(-1L, reader.nextLong()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6385);assertEquals(-1, reader.nextInt()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6386);assertEquals(-1.0, reader.nextDouble()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6387);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6388);reader.nextInt(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6389);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6390);assertEquals(Long.MIN_VALUE, reader.nextLong()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6391);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6392);reader.nextInt(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6393);fail(); 
     } catch (NumberFormatException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6394);assertEquals(Long.MAX_VALUE, reader.nextLong()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6395);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6396);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testSkipObject63() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122h9sc4xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testSkipObject63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122h9sc4xp() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6397); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6398);JsonReader reader = new JsonReader(new StringReader("{\"a\": { \"c\": [], \"d\": [true, true, {}] }, \"b\": \"banana\"}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6399);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6400);assertEquals("a", reader.nextName()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6401);reader.skipValue(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6402);assertEquals("b", reader.nextName()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6403);reader.skipValue(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6404);reader.endObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6405);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLenientSemicolonDelimitedNameValuePair65() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syppfd4xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientSemicolonDelimitedNameValuePair65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syppfd4xy() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6406); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6407);JsonReader reader = new JsonReader(new StringReader("{\"a\":true;\"b\":true}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6408);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6409);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6410);assertEquals("a", reader.nextName()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6411);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6412);assertEquals("b", reader.nextName()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictComments67() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t33p074y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictComments67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t33p074y5() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6413); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6414);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6415);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6416);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6417);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6418);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6419);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6420);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6421);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6422);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6423);fail(); 
     } catch (IOException expected) { 
     } 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6424);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6425);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6426);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6427);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6428);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testLenientComments68() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hi7eo24yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testLenientComments68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hi7eo24yl() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6429); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6430);JsonReader reader = new JsonReader(new StringReader("[// comment \n true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6431);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6432);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6433);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6434);reader = new JsonReader(new StringReader("[# comment \n true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6435);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6436);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6437);assertEquals(true, reader.nextBoolean()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6438);reader = new JsonReader(new StringReader("[/* comment */ true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6439);reader.setLenient(true); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6440);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6441);assertEquals(true, reader.nextBoolean()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testCharacterUnescaping69() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ih1co4yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testCharacterUnescaping69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ih1co4yy() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6442); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6443);String json = "[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"," + "\"\\u20AC\"" + "]"; 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6444);JsonReader reader = new JsonReader(new StringReader(json)); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6445);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6446);assertEquals("a", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6447);assertEquals("a\"", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6448);assertEquals("\"", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6449);assertEquals(":", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6450);assertEquals(",", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6451);assertEquals("\b", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6452);assertEquals("\f", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6453);assertEquals("\n", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6454);assertEquals("\r", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6455);assertEquals("\t", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6456);assertEquals(" ", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6457);assertEquals("\\", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6458);assertEquals("{", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6459);assertEquals("}", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6460);assertEquals("[", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6461);assertEquals("]", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6462);assertEquals("\0", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6463);assertEquals("", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6464);assertEquals("\u20ac", reader.nextString()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6465);reader.endArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6466);assertEquals(JsonToken.END_DOCUMENT, reader.peek()); 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testMissingValue70() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy7j3x4zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testMissingValue70",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy7j3x4zn() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6467); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6468);JsonReader reader = new JsonReader(new StringReader("{\"a\":}")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6469);reader.beginObject(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6470);assertEquals("a", reader.nextName()); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6471);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6472);reader.nextString(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6473);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testNoTopLevelObject72() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n67u654zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testNoTopLevelObject72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n67u654zu() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6474); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6475);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6476);new JsonReader(new StringReader("true")).nextBoolean(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 


public void testStrictSemicolonDelimitedArray80() throws IOException {__CLR4_4_14rm4rmle6rzh4c.R.globalSliceStart(getClass().getName(),6477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9hlsb4zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14rm4rmle6rzh4c.R.rethrow($CLV_t2$);}finally{__CLR4_4_14rm4rmle6rzh4c.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonReaderTest.testStrictSemicolonDelimitedArray80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9hlsb4zx() throws IOException{try{__CLR4_4_14rm4rmle6rzh4c.R.inc(6477); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6478);JsonReader reader = new JsonReader(new StringReader("[true;true]")); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6479);reader.beginArray(); 
     __CLR4_4_14rm4rmle6rzh4c.R.inc(6480);try { 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6481);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6482);reader.nextBoolean(); 
         __CLR4_4_14rm4rmle6rzh4c.R.inc(6483);fail(); 
     } catch (IOException expected) { 
     } 
 }finally{__CLR4_4_14rm4rmle6rzh4c.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * This test fails because there's no double for 9223372036854775806, and
   * our long parsing uses Double.parseDouble() for fractional values.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
