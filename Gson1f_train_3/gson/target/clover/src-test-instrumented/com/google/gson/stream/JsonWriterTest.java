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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_1504504le6rzh4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,6649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testDeepNestingArrays16() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3s0lq504();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3s0lq504() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6484); 
     __CLR4_4_1504504le6rzh4w.R.inc(6485);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6486);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6487);for (int i = 0; (((i < 20)&&(__CLR4_4_1504504le6rzh4w.R.iget(6488)!=0|true))||(__CLR4_4_1504504le6rzh4w.R.iget(6489)==0&false)); i++) {{ 
         __CLR4_4_1504504le6rzh4w.R.inc(6490);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_1504504le6rzh4w.R.inc(6491);for (int i = 0; (((i < 20)&&(__CLR4_4_1504504le6rzh4w.R.iget(6492)!=0|true))||(__CLR4_4_1504504le6rzh4w.R.iget(6493)==0&false)); i++) {{ 
         __CLR4_4_1504504le6rzh4w.R.inc(6494);jsonWriter.endArray(); 
     } 
     }__CLR4_4_1504504le6rzh4w.R.inc(6495);assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testPrettyPrintArray17() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ce792950g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintArray17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ce792950g() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6496); 
     __CLR4_4_1504504le6rzh4w.R.inc(6497);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6498);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6499);jsonWriter.setIndent("   "); 
     __CLR4_4_1504504le6rzh4w.R.inc(6500);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6501);jsonWriter.value(true); 
     __CLR4_4_1504504le6rzh4w.R.inc(6502);jsonWriter.value(false); 
     __CLR4_4_1504504le6rzh4w.R.inc(6503);jsonWriter.value(5.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6504);jsonWriter.nullValue(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6505);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6506);jsonWriter.name("a").value(6.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6507);jsonWriter.name("b").value(7.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6508);jsonWriter.endObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6509);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6510);jsonWriter.value(8.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6511);jsonWriter.value(9.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6512);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6513);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6514);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_1504504le6rzh4w.R.inc(6515);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testEmptyObject19() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nbiqx510();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyObject19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nbiqx510() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6516); 
     __CLR4_4_1504504le6rzh4w.R.inc(6517);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6518);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6519);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6520);jsonWriter.endObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6521);assertEquals("{}", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testBadNestingArray20() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vndlz516();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBadNestingArray20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vndlz516() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6522); 
     __CLR4_4_1504504le6rzh4w.R.inc(6523);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6524);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6525);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6526);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6527);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6528);jsonWriter.endObject(); 
         __CLR4_4_1504504le6rzh4w.R.inc(6529);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNullName21() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftmye51e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullName21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftmye51e() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6530); 
     __CLR4_4_1504504le6rzh4w.R.inc(6531);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6532);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6533);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6534);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6535);jsonWriter.name(null); 
         __CLR4_4_1504504le6rzh4w.R.inc(6536);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testWrongTopLevelType22() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i37qqd51l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testWrongTopLevelType22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i37qqd51l() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6537); 
     __CLR4_4_1504504le6rzh4w.R.inc(6538);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6539);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6540);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6541);jsonWriter.value("a"); 
         __CLR4_4_1504504le6rzh4w.R.inc(6542);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNullStringValue23() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drp29b51r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullStringValue23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drp29b51r() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6543); 
     __CLR4_4_1504504le6rzh4w.R.inc(6544);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6545);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6546);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6547);jsonWriter.name("a"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6548);jsonWriter.value((String) null); 
     __CLR4_4_1504504le6rzh4w.R.inc(6549);jsonWriter.endObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6550);assertEquals("{\"a\":null}", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testStrings24() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibon2x51z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibon2x51z() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6551); 
     __CLR4_4_1504504le6rzh4w.R.inc(6552);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6553);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6554);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6555);jsonWriter.value("a"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6556);jsonWriter.value("a\""); 
     __CLR4_4_1504504le6rzh4w.R.inc(6557);jsonWriter.value("\""); 
     __CLR4_4_1504504le6rzh4w.R.inc(6558);jsonWriter.value(":"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6559);jsonWriter.value(","); 
     __CLR4_4_1504504le6rzh4w.R.inc(6560);jsonWriter.value("\b"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6561);jsonWriter.value("\f"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6562);jsonWriter.value("\n"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6563);jsonWriter.value("\r"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6564);jsonWriter.value("\t"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6565);jsonWriter.value(" "); 
     __CLR4_4_1504504le6rzh4w.R.inc(6566);jsonWriter.value("\\"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6567);jsonWriter.value("{"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6568);jsonWriter.value("}"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6569);jsonWriter.value("["); 
     __CLR4_4_1504504le6rzh4w.R.inc(6570);jsonWriter.value("]"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6571);jsonWriter.value("\0"); 
     __CLR4_4_1504504le6rzh4w.R.inc(6572);jsonWriter.value(""); 
     __CLR4_4_1504504le6rzh4w.R.inc(6573);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6574);assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNulls25() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqy6kk52n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNulls25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqy6kk52n() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6575); 
     __CLR4_4_1504504le6rzh4w.R.inc(6576);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6577);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6578);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6579);jsonWriter.nullValue(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6580);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6581);assertEquals("[null]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testObjectsInArrays26() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv4nn052u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv4nn052u() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6582); 
     __CLR4_4_1504504le6rzh4w.R.inc(6583);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6584);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6585);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6586);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6587);jsonWriter.name("a").value(5); 
     __CLR4_4_1504504le6rzh4w.R.inc(6588);jsonWriter.name("b").value(false); 
     __CLR4_4_1504504le6rzh4w.R.inc(6589);jsonWriter.endObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6590);jsonWriter.beginObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6591);jsonWriter.name("c").value(6); 
     __CLR4_4_1504504le6rzh4w.R.inc(6592);jsonWriter.name("d").value(true); 
     __CLR4_4_1504504le6rzh4w.R.inc(6593);jsonWriter.endObject(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6594);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6595);assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testDoubles27() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yuq10538();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yuq10538() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6596); 
     __CLR4_4_1504504le6rzh4w.R.inc(6597);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6598);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6599);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6600);jsonWriter.value(-0.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6601);jsonWriter.value(1.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6602);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_1504504le6rzh4w.R.inc(6603);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_1504504le6rzh4w.R.inc(6604);jsonWriter.value(0.0); 
     __CLR4_4_1504504le6rzh4w.R.inc(6605);jsonWriter.value(-0.5); 
     __CLR4_4_1504504le6rzh4w.R.inc(6606);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_1504504le6rzh4w.R.inc(6607);jsonWriter.value(Math.PI); 
     __CLR4_4_1504504le6rzh4w.R.inc(6608);jsonWriter.value(Math.E); 
     __CLR4_4_1504504le6rzh4w.R.inc(6609);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6610);jsonWriter.close(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6611);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNonFiniteDoubles28() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3o3id53o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteDoubles28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3o3id53o() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6612); 
     __CLR4_4_1504504le6rzh4w.R.inc(6613);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6614);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6615);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6616);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6617);jsonWriter.value(Double.NaN); 
         __CLR4_4_1504504le6rzh4w.R.inc(6618);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1504504le6rzh4w.R.inc(6619);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6620);jsonWriter.value(Double.NEGATIVE_INFINITY); 
         __CLR4_4_1504504le6rzh4w.R.inc(6621);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1504504le6rzh4w.R.inc(6622);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6623);jsonWriter.value(Double.POSITIVE_INFINITY); 
         __CLR4_4_1504504le6rzh4w.R.inc(6624);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNonFiniteBoxedDoubles29() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwzu8g541();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteBoxedDoubles29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwzu8g541() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6625); 
     __CLR4_4_1504504le6rzh4w.R.inc(6626);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6627);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6628);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6629);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6630);jsonWriter.value(new Double(Double.NaN)); 
         __CLR4_4_1504504le6rzh4w.R.inc(6631);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1504504le6rzh4w.R.inc(6632);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6633);jsonWriter.value(new Double(Double.NEGATIVE_INFINITY)); 
         __CLR4_4_1504504le6rzh4w.R.inc(6634);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1504504le6rzh4w.R.inc(6635);try { 
         __CLR4_4_1504504le6rzh4w.R.inc(6636);jsonWriter.value(new Double(Double.POSITIVE_INFINITY)); 
         __CLR4_4_1504504le6rzh4w.R.inc(6637);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 


public void testNumbers30() throws IOException {__CLR4_4_1504504le6rzh4w.R.globalSliceStart(getClass().getName(),6638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uds0pw54e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1504504le6rzh4w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1504504le6rzh4w.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNumbers30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uds0pw54e() throws IOException{try{__CLR4_4_1504504le6rzh4w.R.inc(6638); 
     __CLR4_4_1504504le6rzh4w.R.inc(6639);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6640);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1504504le6rzh4w.R.inc(6641);jsonWriter.beginArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6642);jsonWriter.value(new BigInteger("0")); 
     __CLR4_4_1504504le6rzh4w.R.inc(6643);jsonWriter.value(new BigInteger("9223372036854775808")); 
     __CLR4_4_1504504le6rzh4w.R.inc(6644);jsonWriter.value(new BigInteger("-9223372036854775809")); 
     __CLR4_4_1504504le6rzh4w.R.inc(6645);jsonWriter.value(new BigDecimal("3.141592653589793238462643383")); 
     __CLR4_4_1504504le6rzh4w.R.inc(6646);jsonWriter.endArray(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6647);jsonWriter.close(); 
     __CLR4_4_1504504le6rzh4w.R.inc(6648);assertEquals("[0," + "9223372036854775808," + "-9223372036854775809," + "3.141592653589793238462643383]", stringWriter.toString()); 
 }finally{__CLR4_4_1504504le6rzh4w.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
