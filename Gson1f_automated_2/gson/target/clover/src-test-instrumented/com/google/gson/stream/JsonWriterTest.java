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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_1431431ldqypczn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675576026699L,8589935092L,5389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testWrongTopLevelType8() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1slrhh431();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testWrongTopLevelType8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1slrhh431() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5293); 
     __CLR4_4_1431431ldqypczn.R.inc(5294);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5295);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5296);try { 
         __CLR4_4_1431431ldqypczn.R.inc(5297);jsonWriter.value("a"); 
         __CLR4_4_1431431ldqypczn.R.inc(5298);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testNullValue9() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a64z3c437();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullValue9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a64z3c437() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5299); 
     __CLR4_4_1431431ldqypczn.R.inc(5300);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5301);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5302);jsonWriter.beginObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5303);jsonWriter.nullValue(); 
     __CLR4_4_1431431ldqypczn.R.inc(5304);assertEquals("null", stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testValue10() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr02sb43d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValue10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr02sb43d() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5305); 
     __CLR4_4_1431431ldqypczn.R.inc(5306);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5307);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5308);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5309);jsonWriter.value(true); 
     __CLR4_4_1431431ldqypczn.R.inc(5310);jsonWriter.value(false); 
     __CLR4_4_1431431ldqypczn.R.inc(5311);jsonWriter.value(5.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5312);jsonWriter.nullValue(); 
     __CLR4_4_1431431ldqypczn.R.inc(5313);jsonWriter.beginObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5314);jsonWriter.name("a").value(6.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5315);jsonWriter.name("b").value(7.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5316);jsonWriter.endObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5317);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5318);jsonWriter.value(8.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5319);jsonWriter.value(9.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5320);jsonWriter.endArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5321);jsonWriter.endArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5322);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_1431431ldqypczn.R.inc(5323);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testValue11() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci03zu43w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValue11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci03zu43w() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5324); 
     __CLR4_4_1431431ldqypczn.R.inc(5325);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5326);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5327);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5328);jsonWriter.value(true); 
     __CLR4_4_1431431ldqypczn.R.inc(5329);jsonWriter.value(false); 
     __CLR4_4_1431431ldqypczn.R.inc(5330);jsonWriter.value(5.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5331);jsonWriter.nullValue(); 
     __CLR4_4_1431431ldqypczn.R.inc(5332);jsonWriter.beginObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5333);jsonWriter.name("a").value(6.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5334);jsonWriter.name("b").value(7.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5335);jsonWriter.endObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5336);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5337);jsonWriter.value(8.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5338);jsonWriter.value(9.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5339);jsonWriter.endArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5340);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_1431431ldqypczn.R.inc(5341);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testDoubles12() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3elg844e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3elg844e() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5342); 
     __CLR4_4_1431431ldqypczn.R.inc(5343);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5344);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5345);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5346);jsonWriter.value(-0.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5347);jsonWriter.value(1.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5348);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_1431431ldqypczn.R.inc(5349);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_1431431ldqypczn.R.inc(5350);jsonWriter.value(0.0); 
     __CLR4_4_1431431ldqypczn.R.inc(5351);jsonWriter.value(-0.5); 
     __CLR4_4_1431431ldqypczn.R.inc(5352);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_1431431ldqypczn.R.inc(5353);jsonWriter.value(Math.PI); 
     __CLR4_4_1431431ldqypczn.R.inc(5354);jsonWriter.value(Math.E); 
     __CLR4_4_1431431ldqypczn.R.inc(5355);jsonWriter.endArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5356);jsonWriter.close(); 
     __CLR4_4_1431431ldqypczn.R.inc(5357);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testNumbers13() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191dvgf44u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNumbers13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191dvgf44u() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5358); 
     __CLR4_4_1431431ldqypczn.R.inc(5359);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5360);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5361);jsonWriter.beginArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5362);jsonWriter.value(new BigInteger("0")); 
     __CLR4_4_1431431ldqypczn.R.inc(5363);jsonWriter.value(new BigInteger("9223372036854775808")); 
     __CLR4_4_1431431ldqypczn.R.inc(5364);jsonWriter.value(new BigInteger("-9223372036854775809")); 
     __CLR4_4_1431431ldqypczn.R.inc(5365);jsonWriter.value(new BigDecimal("3.141592653589793238462643383")); 
     __CLR4_4_1431431ldqypczn.R.inc(5366);jsonWriter.endArray(); 
     __CLR4_4_1431431ldqypczn.R.inc(5367);jsonWriter.close(); 
     __CLR4_4_1431431ldqypczn.R.inc(5368);assertEquals("[0," + "9223372036854775808," + "-9223372036854775809," + "3.141592653589793238462643383]", stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testTwoNames14() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5dl20455();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5dl20455() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5369); 
     __CLR4_4_1431431ldqypczn.R.inc(5370);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5371);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5372);jsonWriter.beginObject(); 
     __CLR4_4_1431431ldqypczn.R.inc(5373);jsonWriter.name("a"); 
     __CLR4_4_1431431ldqypczn.R.inc(5374);try { 
         __CLR4_4_1431431ldqypczn.R.inc(5375);jsonWriter.name("a"); 
         __CLR4_4_1431431ldqypczn.R.inc(5376);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
public void testDeepNestingArrays15() throws IOException {__CLR4_4_1431431ldqypczn.R.globalSliceStart(getClass().getName(),5377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcrze745d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1431431ldqypczn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1431431ldqypczn.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcrze745d() throws IOException{try{__CLR4_4_1431431ldqypczn.R.inc(5377); 
     __CLR4_4_1431431ldqypczn.R.inc(5378);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1431431ldqypczn.R.inc(5379);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1431431ldqypczn.R.inc(5380);for (int i = 0; (((i < 20)&&(__CLR4_4_1431431ldqypczn.R.iget(5381)!=0|true))||(__CLR4_4_1431431ldqypczn.R.iget(5382)==0&false)); i++) {{ 
         __CLR4_4_1431431ldqypczn.R.inc(5383);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_1431431ldqypczn.R.inc(5384);for (int i = 0; (((i < 20)&&(__CLR4_4_1431431ldqypczn.R.iget(5385)!=0|true))||(__CLR4_4_1431431ldqypczn.R.iget(5386)==0&false)); i++) {{ 
         __CLR4_4_1431431ldqypczn.R.inc(5387);jsonWriter.endArray(); 
     } 
     }__CLR4_4_1431431ldqypczn.R.inc(5388);assertEquals("[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_1431431ldqypczn.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
