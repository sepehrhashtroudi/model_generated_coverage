/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.functional;

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.*;
import junit.framework.TestCase;

import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;

/**
 * Functional tests for Json primitive values: integers, and floating point numbers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest extends TestCase {static class __CLR4_4_14k44k4le6rxktq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14k44k4le6rxktq.R.inc(5908);
    __CLR4_4_14k44k4le6rxktq.R.inc(5909);super.setUp();
    __CLR4_4_14k44k4le6rxktq.R.inc(5910);gson = new Gson();
  }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}}


public void testHtmlCharacterSerialization32() throws Exception {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0h0hi4k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testHtmlCharacterSerialization32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0h0hi4k7() throws Exception{try{__CLR4_4_14k44k4le6rxktq.R.inc(5911); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5912);String target = "<script>var a = 12;</script>"; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5913);String result = gson.toJson(target); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5914);assertFalse(result.equals('"' + target + '"')); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5915);gson = new GsonBuilder().disableHtmlEscaping().create(); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5916);result = gson.toJson(target); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5917);assertTrue(result.equals('"' + target + '"')); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testBadValueForBigIntegerDeserialization107() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rq4e14ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBadValueForBigIntegerDeserialization107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rq4e14ke(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5918); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5919);try { 
         __CLR4_4_14k44k4le6rxktq.R.inc(5920);gson.fromJson("15.099", BigInteger.class); 
         __CLR4_4_14k44k4le6rxktq.R.inc(5921);fail("BigInteger can not be decimal values."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testNumberSerialization108() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uz3zor4ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberSerialization108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uz3zor4ki(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5922); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5923);Number expected = 1L; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5924);String json = gson.toJson(expected); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5925);assertEquals(expected.toString(), json); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5926);json = gson.toJson(expected, Number.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5927);assertEquals(expected.toString(), json); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testNumberDeserialization109() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p9iqb4ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberDeserialization109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p9iqb4ko(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5928); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5929);String json = "1"; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5930);Number expected = new Integer(json); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5931);Number actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5932);assertEquals(expected.intValue(), actual.intValue()); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5933);json = String.valueOf(Long.MAX_VALUE); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5934);expected = new Long(json); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5935);actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5936);assertEquals(expected.longValue(), actual.longValue()); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testFloatInfinitySerialization112() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1285jcr4kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinitySerialization112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1285jcr4kx(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5937); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5938);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5939);float infinity = Float.POSITIVE_INFINITY; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5940);assertEquals("Infinity", gson.toJson(infinity)); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5941);assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY)); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testNegativeInfinitySerialization113() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k037nr4l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinitySerialization113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k037nr4l2(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5942); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5943);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5944);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5945);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5946);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testDoubleNoFractAsStringRepresentationDeserialization114() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvazky4l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNoFractAsStringRepresentationDeserialization114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvazky4l7(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5947); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5948);String doubleValue = "1E+5"; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5949);Double expected = Double.valueOf(doubleValue); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5950);Double actual = gson.fromJson(doubleValue, Double.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5951);assertEquals(expected, actual); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5952);double actual1 = gson.fromJson(doubleValue, double.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5953);assertEquals(expected.doubleValue(), actual1); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization130() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128l9bi4le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128l9bi4le(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5954); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5955);double expected = -122.08; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5956);double actual = gson.fromJson("[-122.08]", double.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5957);assertEquals(expected, actual); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5958);actual = gson.fromJson("[-122.08]", Double.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5959);assertEquals(expected, actual); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testBigDecimalInASingleElementArrayDeserialization131() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of5isl4lk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInASingleElementArrayDeserialization131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of5isl4lk(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5960); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5961);BigDecimal expected = new BigDecimal("-122.08e-21"); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5962);BigDecimal actual = gson.fromJson("[-122.08e-21]", BigDecimal.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5963);assertEquals(expected, actual); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testBigIntegerInASingleElementArrayDeserialization132() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crmisn4lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArrayDeserialization132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crmisn4lo(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5964); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5965);BigInteger expected = new BigInteger("34343434343424242423432323243243242"); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5966);BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5967);assertEquals(expected, actual); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization133() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1p6884ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1p6884ls(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5968); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5969);int expected = 1; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5970);int actual = gson.fromJson("[1]", int.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5971);assertEquals(expected, actual); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5972);actual = gson.fromJson("[1]", Integer.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5973);assertEquals(expected, actual); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization134() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtnooz4ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtnooz4ly(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5974); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5975);assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class)); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5976);assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class)); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5977);boolean value = gson.fromJson("[false]", boolean.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5978);assertEquals(false, value); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5979);value = gson.fromJson("[true]", boolean.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5980);assertEquals(true, value); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testLongAsStringSerialization180() throws Exception {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w2tt4m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLongAsStringSerialization180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w2tt4m5() throws Exception{try{__CLR4_4_14k44k4le6rxktq.R.inc(5981); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5982);gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create(); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5983);String result = gson.toJson(15L); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5984);assertEquals("\"15\"", result); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5985);result = gson.toJson(2); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5986);assertEquals("2", result); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 


public void testReallyLongValuesDeserialization202() {__CLR4_4_14k44k4le6rxktq.R.globalSliceStart(getClass().getName(),5987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1fvkp4mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14k44k4le6rxktq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14k44k4le6rxktq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testReallyLongValuesDeserialization202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1fvkp4mb(){try{__CLR4_4_14k44k4le6rxktq.R.inc(5987); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5988);String json = "333961828784581"; 
     __CLR4_4_14k44k4le6rxktq.R.inc(5989);long value = gson.fromJson(json, Long.class); 
     __CLR4_4_14k44k4le6rxktq.R.inc(5990);assertEquals(333961828784581L, value); 
 }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {try{__CLR4_4_14k44k4le6rxktq.R.inc(5991);
    __CLR4_4_14k44k4le6rxktq.R.inc(5992);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_14k44k4le6rxktq.R.flushNeeded();}}
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
