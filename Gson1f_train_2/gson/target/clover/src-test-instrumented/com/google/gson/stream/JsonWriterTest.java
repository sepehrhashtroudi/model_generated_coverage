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

public final class JsonWriterTest extends TestCase {static class __CLR4_4_1501501ld3ms48l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,6589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


public void testDeepNestingArrays14() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulry6o501();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDeepNestingArrays14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulry6o501() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6481); 
     __CLR4_4_1501501ld3ms48l.R.inc(6482);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6483);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6484);for (int i = 0; (((i < 20)&&(__CLR4_4_1501501ld3ms48l.R.iget(6485)!=0|true))||(__CLR4_4_1501501ld3ms48l.R.iget(6486)==0&false)); i++) {{ 
         __CLR4_4_1501501ld3ms48l.R.inc(6487);jsonWriter.beginArray(); 
     } 
     }__CLR4_4_1501501ld3ms48l.R.inc(6488);for (int i = 0; (((i < 20)&&(__CLR4_4_1501501ld3ms48l.R.iget(6489)!=0|true))||(__CLR4_4_1501501ld3ms48l.R.iget(6490)==0&false)); i++) {{ 
         __CLR4_4_1501501ld3ms48l.R.inc(6491);jsonWriter.endArray(); 
     } 
     }__CLR4_4_1501501ld3ms48l.R.inc(6492);assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testPrettyPrintArray15() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15w7bhb50d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testPrettyPrintArray15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15w7bhb50d() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6493); 
     __CLR4_4_1501501ld3ms48l.R.inc(6494);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6495);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6496);jsonWriter.setIndent("   "); 
     __CLR4_4_1501501ld3ms48l.R.inc(6497);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6498);jsonWriter.value(true); 
     __CLR4_4_1501501ld3ms48l.R.inc(6499);jsonWriter.value(false); 
     __CLR4_4_1501501ld3ms48l.R.inc(6500);jsonWriter.value(5.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6501);jsonWriter.nullValue(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6502);jsonWriter.beginObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6503);jsonWriter.name("a").value(6.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6504);jsonWriter.name("b").value(7.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6505);jsonWriter.endObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6506);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6507);jsonWriter.value(8.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6508);jsonWriter.value(9.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6509);jsonWriter.endArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6510);jsonWriter.endArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6511);String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     __CLR4_4_1501501ld3ms48l.R.inc(6512);assertEquals(expected, stringWriter.toString()); 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testEmptyObject17() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135bl5z50x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testEmptyObject17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135bl5z50x() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6513); 
     __CLR4_4_1501501ld3ms48l.R.inc(6514);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6515);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6516);jsonWriter.beginObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6517);jsonWriter.endObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6518);assertEquals("{}", stringWriter.toString()); 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testBadNestingArray18() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135s7e8513();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testBadNestingArray18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135s7e8513() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6519); 
     __CLR4_4_1501501ld3ms48l.R.inc(6520);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6521);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6522);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6523);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6524);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6525);jsonWriter.endObject(); 
         __CLR4_4_1501501ld3ms48l.R.inc(6526);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testTwoNames19() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omqmyr51b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testTwoNames19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omqmyr51b() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6527); 
     __CLR4_4_1501501ld3ms48l.R.inc(6528);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6529);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6530);jsonWriter.beginObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6531);jsonWriter.name("a"); 
     __CLR4_4_1501501ld3ms48l.R.inc(6532);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6533);jsonWriter.name("a"); 
         __CLR4_4_1501501ld3ms48l.R.inc(6534);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testNullName20() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hotlqv51j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNullName20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hotlqv51j() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6535); 
     __CLR4_4_1501501ld3ms48l.R.inc(6536);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6537);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6538);jsonWriter.beginObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6539);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6540);jsonWriter.name(null); 
         __CLR4_4_1501501ld3ms48l.R.inc(6541);fail(); 
     } catch (NullPointerException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testWrongTopLevelType21() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lc7piu51q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testWrongTopLevelType21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lc7piu51q() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6542); 
     __CLR4_4_1501501ld3ms48l.R.inc(6543);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6544);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6545);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6546);jsonWriter.value("a"); 
         __CLR4_4_1501501ld3ms48l.R.inc(6547);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testDoubles22() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7ujzd51w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testDoubles22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7ujzd51w() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6548); 
     __CLR4_4_1501501ld3ms48l.R.inc(6549);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6550);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6551);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6552);jsonWriter.value(-0.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6553);jsonWriter.value(1.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6554);jsonWriter.value(Double.MAX_VALUE); 
     __CLR4_4_1501501ld3ms48l.R.inc(6555);jsonWriter.value(Double.MIN_VALUE); 
     __CLR4_4_1501501ld3ms48l.R.inc(6556);jsonWriter.value(0.0); 
     __CLR4_4_1501501ld3ms48l.R.inc(6557);jsonWriter.value(-0.5); 
     __CLR4_4_1501501ld3ms48l.R.inc(6558);jsonWriter.value(2.2250738585072014E-308); 
     __CLR4_4_1501501ld3ms48l.R.inc(6559);jsonWriter.value(Math.PI); 
     __CLR4_4_1501501ld3ms48l.R.inc(6560);jsonWriter.value(Math.E); 
     __CLR4_4_1501501ld3ms48l.R.inc(6561);jsonWriter.endArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6562);jsonWriter.close(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6563);assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testNumbers23() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koh13452c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testNumbers23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koh13452c() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6564); 
     __CLR4_4_1501501ld3ms48l.R.inc(6565);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6566);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6567);jsonWriter.beginArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6568);jsonWriter.value(new BigInteger("0")); 
     __CLR4_4_1501501ld3ms48l.R.inc(6569);jsonWriter.value(new BigInteger("9223372036854775808")); 
     __CLR4_4_1501501ld3ms48l.R.inc(6570);jsonWriter.value(new BigInteger("-9223372036854775809")); 
     __CLR4_4_1501501ld3ms48l.R.inc(6571);jsonWriter.value(new BigDecimal("3.141592653589793238462643383")); 
     __CLR4_4_1501501ld3ms48l.R.inc(6572);jsonWriter.endArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6573);jsonWriter.close(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6574);assertEquals("[0," + "9223372036854775808," + "-9223372036854775809," + "3.141592653589793238462643383]", stringWriter.toString()); 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testMultipleTopLevelValues27() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tsklsv52n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testMultipleTopLevelValues27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tsklsv52n() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6575); 
     __CLR4_4_1501501ld3ms48l.R.inc(6576);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6577);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6578);jsonWriter.beginArray().endArray(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6579);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6580);jsonWriter.beginArray(); 
         __CLR4_4_1501501ld3ms48l.R.inc(6581);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 


public void testValueWithoutName28() throws IOException {__CLR4_4_1501501ld3ms48l.R.globalSliceStart(getClass().getName(),6582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byz9a752u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1501501ld3ms48l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1501501ld3ms48l.R.globalSliceEnd(getClass().getName(),"com.google.gson.stream.JsonWriterTest.testValueWithoutName28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byz9a752u() throws IOException{try{__CLR4_4_1501501ld3ms48l.R.inc(6582); 
     __CLR4_4_1501501ld3ms48l.R.inc(6583);StringWriter stringWriter = new StringWriter(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6584);JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     __CLR4_4_1501501ld3ms48l.R.inc(6585);jsonWriter.beginObject(); 
     __CLR4_4_1501501ld3ms48l.R.inc(6586);try { 
         __CLR4_4_1501501ld3ms48l.R.inc(6587);jsonWriter.value(true); 
         __CLR4_4_1501501ld3ms48l.R.inc(6588);fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }finally{__CLR4_4_1501501ld3ms48l.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
