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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_1428428le6p2053{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,5311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testNullName5() throws IOException {__CLR4_4_1428428le6p2053.R.globalSliceStart(getClass().getName(),5264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1smp56g428();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1428428le6p2053.R.rethrow($CLV_t2$);}finally{__CLR4_4_1428428le6p2053.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullName5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1smp56g428() throws IOException{try{__CLR4_4_1428428le6p2053.R.inc(5264); 
     __CLR4_4_1428428le6p2053.R.inc(5265);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1428428le6p2053.R.inc(5266);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1428428le6p2053.R.inc(5267);jsonWriter.beginArray(); 
     __CLR4_4_1428428le6p2053.R.inc(5268);try { 
         __CLR4_4_1428428le6p2053.R.inc(5269);jsonWriter.name(null); 
         __CLR4_4_1428428le6p2053.R.inc(5270);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_1428428le6p2053.R.flushNeeded();}}
public void testStrings6() throws IOException {__CLR4_4_1428428le6p2053.R.globalSliceStart(getClass().getName(),5271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qy91w342f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1428428le6p2053.R.rethrow($CLV_t2$);}finally{__CLR4_4_1428428le6p2053.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qy91w342f() throws IOException{try{__CLR4_4_1428428le6p2053.R.inc(5271); 
     __CLR4_4_1428428le6p2053.R.inc(5272);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1428428le6p2053.R.inc(5273);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1428428le6p2053.R.inc(5274);jsonWriter.beginArray(); 
     __CLR4_4_1428428le6p2053.R.inc(5275);jsonWriter.value("a"); 
     __CLR4_4_1428428le6p2053.R.inc(5276);jsonWriter.value("a\""); 
     __CLR4_4_1428428le6p2053.R.inc(5277);jsonWriter.value("\""); 
     __CLR4_4_1428428le6p2053.R.inc(5278);jsonWriter.value(":"); 
     __CLR4_4_1428428le6p2053.R.inc(5279);jsonWriter.value(","); 
     __CLR4_4_1428428le6p2053.R.inc(5280);jsonWriter.value("\b"); 
     __CLR4_4_1428428le6p2053.R.inc(5281);jsonWriter.value("\f"); 
     __CLR4_4_1428428le6p2053.R.inc(5282);jsonWriter.value("\n"); 
     __CLR4_4_1428428le6p2053.R.inc(5283);jsonWriter.value("\r"); 
     __CLR4_4_1428428le6p2053.R.inc(5284);jsonWriter.value("\t"); 
     __CLR4_4_1428428le6p2053.R.inc(5285);jsonWriter.value(" "); 
     __CLR4_4_1428428le6p2053.R.inc(5286);jsonWriter.value("\\"); 
     __CLR4_4_1428428le6p2053.R.inc(5287);jsonWriter.value("{"); 
     __CLR4_4_1428428le6p2053.R.inc(5288);jsonWriter.value("}"); 
     __CLR4_4_1428428le6p2053.R.inc(5289);jsonWriter.value("["); 
     __CLR4_4_1428428le6p2053.R.inc(5290);jsonWriter.value("]"); 
     __CLR4_4_1428428le6p2053.R.inc(5291);jsonWriter.value("\0"); 
     __CLR4_4_1428428le6p2053.R.inc(5292);jsonWriter.value(""); 
     __CLR4_4_1428428le6p2053.R.inc(5293);jsonWriter.endArray(); 
     __CLR4_4_1428428le6p2053.R.inc(5294);assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }finally{__CLR4_4_1428428le6p2053.R.flushNeeded();}}
public void testDoubles7() throws IOException {__CLR4_4_1428428le6p2053.R.globalSliceStart(getClass().getName(),5295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0p6ia433();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1428428le6p2053.R.rethrow($CLV_t2$);}finally{__CLR4_4_1428428le6p2053.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0p6ia433() throws IOException{try{__CLR4_4_1428428le6p2053.R.inc(5295); 
     __CLR4_4_1428428le6p2053.R.inc(5296);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1428428le6p2053.R.inc(5297);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1428428le6p2053.R.inc(5298);jsonWriter.beginArray(); 
     __CLR4_4_1428428le6p2053.R.inc(5299);jsonWriter.value(-0.0); 
     __CLR4_4_1428428le6p2053.R.inc(5300);jsonWriter.value(1.0); 
     __CLR4_4_1428428le6p2053.R.inc(5301);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_1428428le6p2053.R.inc(5302);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_1428428le6p2053.R.inc(5303);jsonWriter.value(0.0); 
     __CLR4_4_1428428le6p2053.R.inc(5304);jsonWriter.value(-0.5); 
     __CLR4_4_1428428le6p2053.R.inc(5305);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_1428428le6p2053.R.inc(5306);jsonWriter.value(Math.PI); 
     __CLR4_4_1428428le6p2053.R.inc(5307);jsonWriter.value(Math.E); 
     __CLR4_4_1428428le6p2053.R.inc(5308);jsonWriter.endArray(); 
     __CLR4_4_1428428le6p2053.R.inc(5309);jsonWriter.close(); 
     __CLR4_4_1428428le6p2053.R.inc(5310);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_1428428le6p2053.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
