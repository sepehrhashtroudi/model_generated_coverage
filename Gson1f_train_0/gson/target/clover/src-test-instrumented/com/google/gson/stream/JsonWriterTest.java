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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_14zm4zmle6rvqww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,6596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testDeepNestingArrays16() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3s0lq4zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3s0lq4zm() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6466); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6467);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6468);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6469);for (int i = 0; (((i < 20)&&(__CLR4_4_14zm4zmle6rvqww.R.iget(6470)!=0|true))||(__CLR4_4_14zm4zmle6rvqww.R.iget(6471)==0&false)); i++) {{ 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6472);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_14zm4zmle6rvqww.R.inc(6473);for (int i = 0; (((i < 20)&&(__CLR4_4_14zm4zmle6rvqww.R.iget(6474)!=0|true))||(__CLR4_4_14zm4zmle6rvqww.R.iget(6475)==0&false)); i++) {{ 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6476);jsonWriter.endArray(); 
     } 
     }__CLR4_4_14zm4zmle6rvqww.R.inc(6477);assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testEmptyObject18() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ebjyg4zy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyObject18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ebjyg4zy() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6478); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6479);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6480);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6481);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6482);jsonWriter.endObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6483);assertEquals("{}", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testTwoNames19() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omqmyr504();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omqmyr504() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6484); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6485);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6486);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6487);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6488);jsonWriter.name("a"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6489);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6490);jsonWriter.name("a"); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6491);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testNullStringValue20() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140p5vw50c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullStringValue20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140p5vw50c() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6492); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6493);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6494);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6495);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6496);jsonWriter.name("a"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6497);jsonWriter.value((String) null); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6498);jsonWriter.endObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6499);assertEquals("{\"a\":null}", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testStrings21() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18koqpi50k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18koqpi50k() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6500); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6501);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6502);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6503);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6504);jsonWriter.value("a"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6505);jsonWriter.value("a\""); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6506);jsonWriter.value("\""); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6507);jsonWriter.value(":"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6508);jsonWriter.value(","); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6509);jsonWriter.value("\b"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6510);jsonWriter.value("\f"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6511);jsonWriter.value("\n"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6512);jsonWriter.value("\r"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6513);jsonWriter.value("\t"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6514);jsonWriter.value(" "); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6515);jsonWriter.value("\\"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6516);jsonWriter.value("{"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6517);jsonWriter.value("}"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6518);jsonWriter.value("["); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6519);jsonWriter.value("]"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6520);jsonWriter.value("\0"); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6521);jsonWriter.value(""); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6522);jsonWriter.endArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6523);assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testNulls22() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzya75518();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNulls22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzya75518() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6524); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6525);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6526);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6527);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6528);jsonWriter.nullValue(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6529);jsonWriter.endArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6530);assertEquals("[null]", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testObjectsInArrays23() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k44r9l51f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k44r9l51f() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6531); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6532);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6533);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6534);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6535);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6536);jsonWriter.name("a").value(5); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6537);jsonWriter.name("b").value(false); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6538);jsonWriter.endObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6539);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6540);jsonWriter.name("c").value(6); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6541);jsonWriter.name("d").value(true); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6542);jsonWriter.endObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6543);jsonWriter.endArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6544);assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testNonFiniteDoubles24() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153o8ch51t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteDoubles24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153o8ch51t() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6545); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6546);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6547);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6548);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6549);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6550);jsonWriter.value(Double.NaN); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6551);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6552);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6553);jsonWriter.value(Double.NEGATIVE_INFINITY); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6554);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6555);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6556);jsonWriter.value(Double.POSITIVE_INFINITY); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6557);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testNonFiniteBoxedDoubles25() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwzpec526();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteBoxedDoubles25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwzpec526() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6558); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6559);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6560);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6561);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6562);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6563);jsonWriter.value(new Double(Double.NaN)); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6564);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6565);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6566);jsonWriter.value(new Double(Double.NEGATIVE_INFINITY)); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6567);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6568);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6569);jsonWriter.value(new Double(Double.POSITIVE_INFINITY)); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6570);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testNumbers26() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufgxgj52j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNumbers26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufgxgj52j() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6571); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6572);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6573);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6574);jsonWriter.beginArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6575);jsonWriter.value(new BigInteger("0")); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6576);jsonWriter.value(new BigInteger("9223372036854775808")); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6577);jsonWriter.value(new BigInteger("-9223372036854775809")); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6578);jsonWriter.value(new BigDecimal("3.141592653589793238462643383")); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6579);jsonWriter.endArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6580);jsonWriter.close(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6581);assertEquals("[0," + "9223372036854775808," + "-9223372036854775809," + "3.141592653589793238462643383]", stringWriter.toString()); 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testMultipleTopLevelValues32() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrodl352u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testMultipleTopLevelValues32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrodl352u() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6582); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6583);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6584);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6585);jsonWriter.beginArray().endArray(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6586);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6587);jsonWriter.beginArray(); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6588);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 


public void testValueWithoutName33() throws IOException {__CLR4_4_14zm4zmle6rvqww.R.globalSliceStart(getClass().getName(),6589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hvtaz531();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14zm4zmle6rvqww.R.rethrow($CLV_t2$);}finally{__CLR4_4_14zm4zmle6rvqww.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValueWithoutName33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hvtaz531() throws IOException{try{__CLR4_4_14zm4zmle6rvqww.R.inc(6589); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6590);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6591);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6592);jsonWriter.beginObject(); 
     __CLR4_4_14zm4zmle6rvqww.R.inc(6593);try { 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6594);jsonWriter.value(true); 
         __CLR4_4_14zm4zmle6rvqww.R.inc(6595);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_14zm4zmle6rvqww.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
