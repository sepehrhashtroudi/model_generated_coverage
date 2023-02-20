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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_1457457le6ouxlf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526949504L,8589935092L,5454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testPrettyPrintArray5() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wuoa0457();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintArray5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wuoa0457() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5371); 
     __CLR4_4_1457457le6ouxlf.R.inc(5372);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5373);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5374);jsonWriter.setIndent("   "); 
     __CLR4_4_1457457le6ouxlf.R.inc(5375);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5376);jsonWriter.value(true); 
     __CLR4_4_1457457le6ouxlf.R.inc(5377);jsonWriter.value(false); 
     __CLR4_4_1457457le6ouxlf.R.inc(5378);jsonWriter.value(5.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5379);jsonWriter.nullValue(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5380);jsonWriter.beginObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5381);jsonWriter.name("a").value(6.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5382);jsonWriter.name("b").value(7.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5383);jsonWriter.endObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5384);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5385);jsonWriter.value(8.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5386);jsonWriter.value(9.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5387);jsonWriter.endArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5388);jsonWriter.endArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5389);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_1457457le6ouxlf.R.inc(5390);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testEmptyArray6() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hoc1t45r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyArray6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hoc1t45r() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5391); 
     __CLR4_4_1457457le6ouxlf.R.inc(5392);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5393);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5394);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5395);jsonWriter.endArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5396);assertEquals("[]", stringWriter.toString()); 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testDoubles7() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0p6ia45x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0p6ia45x() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5397); 
     __CLR4_4_1457457le6ouxlf.R.inc(5398);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5399);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5400);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5401);jsonWriter.value(-0.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5402);jsonWriter.value(1.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5403);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_1457457le6ouxlf.R.inc(5404);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_1457457le6ouxlf.R.inc(5405);jsonWriter.value(0.0); 
     __CLR4_4_1457457le6ouxlf.R.inc(5406);jsonWriter.value(-0.5); 
     __CLR4_4_1457457le6ouxlf.R.inc(5407);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_1457457le6ouxlf.R.inc(5408);jsonWriter.value(Math.PI); 
     __CLR4_4_1457457le6ouxlf.R.inc(5409);jsonWriter.value(Math.E); 
     __CLR4_4_1457457le6ouxlf.R.inc(5410);jsonWriter.endArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5411);jsonWriter.close(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5412);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testTwoNames8() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of93ox46d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of93ox46d() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5413); 
     __CLR4_4_1457457le6ouxlf.R.inc(5414);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5415);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5416);jsonWriter.beginObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5417);jsonWriter.name("a"); 
     __CLR4_4_1457457le6ouxlf.R.inc(5418);try { 
         __CLR4_4_1457457le6ouxlf.R.inc(5419);jsonWriter.name("a"); 
         __CLR4_4_1457457le6ouxlf.R.inc(5420);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testObjectsInArrays9() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbvzoh46l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbvzoh46l() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5421); 
     __CLR4_4_1457457le6ouxlf.R.inc(5422);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5423);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5424);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5425);jsonWriter.beginObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5426);jsonWriter.name("a").value(5); 
     __CLR4_4_1457457le6ouxlf.R.inc(5427);jsonWriter.name("b").value(false); 
     __CLR4_4_1457457le6ouxlf.R.inc(5428);jsonWriter.endObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5429);jsonWriter.beginObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5430);jsonWriter.name("c").value(6); 
     __CLR4_4_1457457le6ouxlf.R.inc(5431);jsonWriter.name("d").value(true); 
     __CLR4_4_1457457le6ouxlf.R.inc(5432);jsonWriter.endObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5433);jsonWriter.endArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5434);assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testPeekEmptyObject10() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3eirf46z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPeekEmptyObject10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3eirf46z() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5435); 
     __CLR4_4_1457457le6ouxlf.R.inc(5436);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5437);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5438);jsonWriter.beginObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5439);jsonWriter.endObject(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5440);assertEquals("{}", stringWriter.toString()); 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
public void testNonFiniteBoxedDoubles11() throws IOException {__CLR4_4_1457457le6ouxlf.R.globalSliceStart(getClass().getName(),5441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lqf4n475();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1457457le6ouxlf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1457457le6ouxlf.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteBoxedDoubles11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lqf4n475() throws IOException{try{__CLR4_4_1457457le6ouxlf.R.inc(5441); 
     __CLR4_4_1457457le6ouxlf.R.inc(5442);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5443);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1457457le6ouxlf.R.inc(5444);jsonWriter.beginArray(); 
     __CLR4_4_1457457le6ouxlf.R.inc(5445);try { 
         __CLR4_4_1457457le6ouxlf.R.inc(5446);jsonWriter.value(new Double(Double.NaN)); 
         __CLR4_4_1457457le6ouxlf.R.inc(5447);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1457457le6ouxlf.R.inc(5448);try { 
         __CLR4_4_1457457le6ouxlf.R.inc(5449);jsonWriter.value(new Double(Double.NEGATIVE_INFINITY)); 
         __CLR4_4_1457457le6ouxlf.R.inc(5450);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_1457457le6ouxlf.R.inc(5451);try { 
         __CLR4_4_1457457le6ouxlf.R.inc(5452);jsonWriter.value(new Double(Double.POSITIVE_INFINITY)); 
         __CLR4_4_1457457le6ouxlf.R.inc(5453);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_1457457le6ouxlf.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
