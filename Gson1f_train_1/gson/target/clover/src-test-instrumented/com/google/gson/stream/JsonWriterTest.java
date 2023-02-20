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
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonWriterTest extends TestCase {static class __CLR4_4_14xs4xsle6rxkvv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,6564,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testPrettyPrintArray16() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1957a9s4xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintArray16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1957a9s4xs() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6400); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6401);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6402);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6403);jsonWriter.setIndent("   "); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6404);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6405);jsonWriter.value(true); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6406);jsonWriter.value(false); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6407);jsonWriter.value(5.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6408);jsonWriter.nullValue(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6409);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6410);jsonWriter.name("a").value(6.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6411);jsonWriter.name("b").value(7.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6412);jsonWriter.endObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6413);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6414);jsonWriter.value(8.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6415);jsonWriter.value(9.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6416);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6417);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6418);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6419);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testEmptyObject18() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ebjyg4yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyObject18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ebjyg4yc() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6420); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6421);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6422);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6423);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6424);jsonWriter.endObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6425);assertEquals("{}", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testBadNestingArray19() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16es66p4yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBadNestingArray19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16es66p4yi() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6426); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6427);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6428);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6429);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6430);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6431);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6432);jsonWriter.endObject(); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6433);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testTwoNames20() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5vfjh4yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5vfjh4yq() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6434); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6435);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6436);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6437);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6438);jsonWriter.name("a"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6439);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6440);jsonWriter.name("a"); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6441);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testNullName21() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftmye4yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullName21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftmye4yy() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6442); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6443);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6444);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6445);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6446);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6447);jsonWriter.name(null); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6448);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testWrongTopLevelType22() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i37qqd4z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testWrongTopLevelType22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i37qqd4z5() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6449); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6450);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6451);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6452);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6453);jsonWriter.value("a"); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6454);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testNullStringValue23() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drp29b4zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullStringValue23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drp29b4zb() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6455); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6456);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6457);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6458);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6459);jsonWriter.name("a"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6460);jsonWriter.value((String) null); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6461);jsonWriter.endObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6462);assertEquals("{\"a\":null}", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testStrings24() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibon2x4zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibon2x4zj() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6463); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6464);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6465);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6466);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6467);jsonWriter.value("a"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6468);jsonWriter.value("a\""); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6469);jsonWriter.value("\""); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6470);jsonWriter.value(":"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6471);jsonWriter.value(","); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6472);jsonWriter.value("\b"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6473);jsonWriter.value("\f"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6474);jsonWriter.value("\n"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6475);jsonWriter.value("\r"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6476);jsonWriter.value("\t"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6477);jsonWriter.value(" "); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6478);jsonWriter.value("\\"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6479);jsonWriter.value("{"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6480);jsonWriter.value("}"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6481);jsonWriter.value("["); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6482);jsonWriter.value("]"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6483);jsonWriter.value("\0"); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6484);jsonWriter.value(""); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6485);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6486);assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testNulls25() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqy6kk507();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNulls25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqy6kk507() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6487); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6488);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6489);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6490);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6491);jsonWriter.nullValue(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6492);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6493);assertEquals("[null]", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testObjectsInArrays26() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv4nn050e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv4nn050e() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6494); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6495);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6496);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6497);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6498);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6499);jsonWriter.name("a").value(5); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6500);jsonWriter.name("b").value(false); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6501);jsonWriter.endObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6502);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6503);jsonWriter.name("c").value(6); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6504);jsonWriter.name("d").value(true); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6505);jsonWriter.endObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6506);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6507);assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testDoubles27() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yuq1050s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yuq1050s() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6508); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6509);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6510);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6511);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6512);jsonWriter.value(-0.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6513);jsonWriter.value(1.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6514);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6515);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6516);jsonWriter.value(0.0); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6517);jsonWriter.value(-0.5); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6518);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6519);jsonWriter.value(Math.PI); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6520);jsonWriter.value(Math.E); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6521);jsonWriter.endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6522);jsonWriter.close(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6523);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testNonFiniteDoubles28() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3o3id518();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteDoubles28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3o3id518() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6524); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6525);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6526);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6527);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6528);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6529);jsonWriter.value(Double.NaN); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6530);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6531);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6532);jsonWriter.value(Double.NEGATIVE_INFINITY); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6533);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6534);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6535);jsonWriter.value(Double.POSITIVE_INFINITY); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6536);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testNonFiniteBoxedDoubles29() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwzu8g51l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteBoxedDoubles29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwzu8g51l() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6537); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6538);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6539);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6540);jsonWriter.beginArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6541);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6542);jsonWriter.value(new Double(Double.NaN)); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6543);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6544);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6545);jsonWriter.value(new Double(Double.NEGATIVE_INFINITY)); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6546);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6547);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6548);jsonWriter.value(new Double(Double.POSITIVE_INFINITY)); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6549);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testMultipleTopLevelValues33() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oioesm51y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testMultipleTopLevelValues33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oioesm51y() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6550); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6551);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6552);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6553);jsonWriter.beginArray().endArray(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6554);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6555);jsonWriter.beginArray(); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6556);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 


public void testValueWithoutName34() throws IOException {__CLR4_4_14xs4xsle6rxkvv.R.globalSliceStart(getClass().getName(),6557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qvs3g525();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xs4xsle6rxkvv.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xs4xsle6rxkvv.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValueWithoutName34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qvs3g525() throws IOException{try{__CLR4_4_14xs4xsle6rxkvv.R.inc(6557); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6558);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6559);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6560);jsonWriter.beginObject(); 
     __CLR4_4_14xs4xsle6rxkvv.R.inc(6561);try { 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6562);jsonWriter.value(true); 
         __CLR4_4_14xs4xsle6rxkvv.R.inc(6563);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14xs4xsle6rxkvv.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
