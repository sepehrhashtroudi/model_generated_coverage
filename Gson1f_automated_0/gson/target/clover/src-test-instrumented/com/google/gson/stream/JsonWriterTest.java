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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_144k44kle6ora11{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526778980L,8589935092L,5438,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

public void testTwoNames6() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hx963z44k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hx963z44k() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5348); 
     __CLR4_4_144k44kle6ora11.R.inc(5349);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5350);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5351);jsonWriter.beginObject(); 
     __CLR4_4_144k44kle6ora11.R.inc(5352);jsonWriter.name("a"); 
     __CLR4_4_144k44kle6ora11.R.inc(5353);try { 
         __CLR4_4_144k44kle6ora11.R.inc(5354);jsonWriter.name("a"); 
         __CLR4_4_144k44kle6ora11.R.inc(5355);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testObjectsInArrays7() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptvx9f44s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testObjectsInArrays7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptvx9f44s() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5356); 
     __CLR4_4_144k44kle6ora11.R.inc(5357);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5358);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5359);jsonWriter.beginArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5360);jsonWriter.beginObject(); 
     __CLR4_4_144k44kle6ora11.R.inc(5361);jsonWriter.name("a").value(5); 
     __CLR4_4_144k44kle6ora11.R.inc(5362);jsonWriter.name("b").value(false); 
     __CLR4_4_144k44kle6ora11.R.inc(5363);jsonWriter.endObject(); 
     __CLR4_4_144k44kle6ora11.R.inc(5364);jsonWriter.beginObject(); 
     __CLR4_4_144k44kle6ora11.R.inc(5365);jsonWriter.name("c").value(6); 
     __CLR4_4_144k44kle6ora11.R.inc(5366);jsonWriter.name("d").value(true); 
     __CLR4_4_144k44kle6ora11.R.inc(5367);jsonWriter.endObject(); 
     __CLR4_4_144k44kle6ora11.R.inc(5368);jsonWriter.endArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5369);assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testDeepNestingArrays8() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnjdd3456();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnjdd3456() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5370); 
     __CLR4_4_144k44kle6ora11.R.inc(5371);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5372);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5373);for (int i = 0; (((i < 20)&&(__CLR4_4_144k44kle6ora11.R.iget(5374)!=0|true))||(__CLR4_4_144k44kle6ora11.R.iget(5375)==0&false)); i++) {{ 
         __CLR4_4_144k44kle6ora11.R.inc(5376);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_144k44kle6ora11.R.inc(5377);for (int i = 0; (((i < 20)&&(__CLR4_4_144k44kle6ora11.R.iget(5378)!=0|true))||(__CLR4_4_144k44kle6ora11.R.iget(5379)==0&false)); i++) {{ 
         __CLR4_4_144k44kle6ora11.R.inc(5380);jsonWriter.endArray(); 
     } 
     }__CLR4_4_144k44kle6ora11.R.inc(5381);assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testStrings9() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h795io45i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testStrings9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h795io45i() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5382); 
     __CLR4_4_144k44kle6ora11.R.inc(5383);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5384);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5385);jsonWriter.beginArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5386);jsonWriter.value("a"); 
     __CLR4_4_144k44kle6ora11.R.inc(5387);jsonWriter.value("a\""); 
     __CLR4_4_144k44kle6ora11.R.inc(5388);jsonWriter.value("\""); 
     __CLR4_4_144k44kle6ora11.R.inc(5389);jsonWriter.value(":"); 
     __CLR4_4_144k44kle6ora11.R.inc(5390);jsonWriter.value(","); 
     __CLR4_4_144k44kle6ora11.R.inc(5391);jsonWriter.value("\b"); 
     __CLR4_4_144k44kle6ora11.R.inc(5392);jsonWriter.value("\f"); 
     __CLR4_4_144k44kle6ora11.R.inc(5393);jsonWriter.value("\n"); 
     __CLR4_4_144k44kle6ora11.R.inc(5394);jsonWriter.value("\r"); 
     __CLR4_4_144k44kle6ora11.R.inc(5395);jsonWriter.value("\t"); 
     __CLR4_4_144k44kle6ora11.R.inc(5396);jsonWriter.value(" "); 
     __CLR4_4_144k44kle6ora11.R.inc(5397);jsonWriter.value("\\"); 
     __CLR4_4_144k44kle6ora11.R.inc(5398);jsonWriter.value("{"); 
     __CLR4_4_144k44kle6ora11.R.inc(5399);jsonWriter.value("}"); 
     __CLR4_4_144k44kle6ora11.R.inc(5400);jsonWriter.value("["); 
     __CLR4_4_144k44kle6ora11.R.inc(5401);jsonWriter.value("]"); 
     __CLR4_4_144k44kle6ora11.R.inc(5402);jsonWriter.value("\0"); 
     __CLR4_4_144k44kle6ora11.R.inc(5403);jsonWriter.value(""); 
     __CLR4_4_144k44kle6ora11.R.inc(5404);jsonWriter.endArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5405);assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testNonFiniteDoubles10() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xexim6466();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNonFiniteDoubles10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xexim6466() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5406); 
     __CLR4_4_144k44kle6ora11.R.inc(5407);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5408);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5409);jsonWriter.beginArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5410);try { 
         __CLR4_4_144k44kle6ora11.R.inc(5411);jsonWriter.value(Double.NaN); 
         __CLR4_4_144k44kle6ora11.R.inc(5412);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_144k44kle6ora11.R.inc(5413);try { 
         __CLR4_4_144k44kle6ora11.R.inc(5414);jsonWriter.value(Double.NEGATIVE_INFINITY); 
         __CLR4_4_144k44kle6ora11.R.inc(5415);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_144k44kle6ora11.R.inc(5416);try { 
         __CLR4_4_144k44kle6ora11.R.inc(5417);jsonWriter.value(Double.POSITIVE_INFINITY); 
         __CLR4_4_144k44kle6ora11.R.inc(5418);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testMultipleTopLevelValues11() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfa3hi46j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testMultipleTopLevelValues11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfa3hi46j() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5419); 
     __CLR4_4_144k44kle6ora11.R.inc(5420);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5421);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5422);jsonWriter.beginArray().endArray(); 
     __CLR4_4_144k44kle6ora11.R.inc(5423);try { 
         __CLR4_4_144k44kle6ora11.R.inc(5424);jsonWriter.beginArray(); 
         __CLR4_4_144k44kle6ora11.R.inc(5425);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
public void testDeepNestingArrays12() throws IOException {__CLR4_4_144k44kle6ora11.R.globalSliceStart(getClass().getName(),5426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxc67i46q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144k44kle6ora11.R.rethrow($CLV_t2$);}finally{__CLR4_4_144k44kle6ora11.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxc67i46q() throws IOException{try{__CLR4_4_144k44kle6ora11.R.inc(5426); 
     __CLR4_4_144k44kle6ora11.R.inc(5427);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_144k44kle6ora11.R.inc(5428);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_144k44kle6ora11.R.inc(5429);for (int i = 0; (((i < 20)&&(__CLR4_4_144k44kle6ora11.R.iget(5430)!=0|true))||(__CLR4_4_144k44kle6ora11.R.iget(5431)==0&false)); i++) {{ 
         __CLR4_4_144k44kle6ora11.R.inc(5432);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_144k44kle6ora11.R.inc(5433);for (int i = 0; (((i < 20)&&(__CLR4_4_144k44kle6ora11.R.iget(5434)!=0|true))||(__CLR4_4_144k44kle6ora11.R.iget(5435)==0&false)); i++) {{ 
         __CLR4_4_144k44kle6ora11.R.inc(5436);jsonWriter.endArray(); 
     } 
     }__CLR4_4_144k44kle6ora11.R.inc(5437);assertEquals("[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_144k44kle6ora11.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
