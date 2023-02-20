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
public class PrimitiveTest extends TestCase {static class __CLR4_4_14jq4jqle6rvqsp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,5978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5894);
    __CLR4_4_14jq4jqle6rvqsp.R.inc(5895);super.setUp();
    __CLR4_4_14jq4jqle6rvqsp.R.inc(5896);gson = new Gson();
  }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}}


public void testHtmlCharacterSerialization29() throws Exception {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1rwhe4jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testHtmlCharacterSerialization29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1rwhe4jt() throws Exception{try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5897); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5898);String target = "<script>var a = 12;</script>"; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5899);String result = gson.toJson(target); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5900);assertFalse(result.equals('"' + target + '"')); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5901);gson = new GsonBuilder().disableHtmlEscaping().create(); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5902);result = gson.toJson(target); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5903);assertTrue(result.equals('"' + target + '"')); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testBadValueForBigIntegerDeserialization106() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9ueg4k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBadValueForBigIntegerDeserialization106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9ueg4k0(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5904); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5905);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5906);gson.fromJson("15.099", BigInteger.class); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5907);fail("BigInteger can not be decimal values."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testNumberSerialization107() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rq40wa4k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberSerialization107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rq40wa4k4(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5908); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5909);Number expected = 1L; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5910);String json = gson.toJson(expected); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5911);assertEquals(expected.toString(), json); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5912);json = gson.toJson(expected, Number.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5913);assertEquals(expected.toString(), json); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testNumberDeserialization108() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19y9his4ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberDeserialization108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19y9his4ka(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5914); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5915);String json = "1"; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5916);Number expected = new Integer(json); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5917);Number actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5918);assertEquals(expected.intValue(), actual.intValue()); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5919);json = String.valueOf(Long.MAX_VALUE); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5920);expected = new Long(json); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5921);actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5922);assertEquals(expected.longValue(), actual.longValue()); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testFloatInfinitySerialization110() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149ue874kj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinitySerialization110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149ue874kj(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5923); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5924);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5925);float infinity = Float.POSITIVE_INFINITY; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5926);assertEquals("Infinity", gson.toJson(infinity)); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5927);assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY)); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testFloatNaNSerializationNotSupportedByDefault111() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kinvs84ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNSerializationNotSupportedByDefault111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kinvs84ko(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5928); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5929);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5930);float nan = Float.NaN; 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5931);gson.toJson(nan); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5932);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5933);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5934);gson.toJson(Float.NaN); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5935);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testNegativeInfinitySerialization113() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k037nr4kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinitySerialization113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k037nr4kw(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5936); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5937);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5938);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5939);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5940);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testDoubleNaNSerializationNotSupportedByDefault115() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcbz8l4l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerializationNotSupportedByDefault115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcbz8l4l1(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5941); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5942);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5943);double nan = Double.NaN; 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5944);gson.toJson(nan); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5945);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5946);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5947);gson.toJson(Double.NaN); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5948);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization132() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149eo9g4l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149eo9g4l9(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5949); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5950);double expected = -122.08; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5951);double actual = gson.fromJson("[-122.08]", double.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5952);assertEquals(expected, actual); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5953);actual = gson.fromJson("[-122.08]", Double.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5954);assertEquals(expected, actual); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testBigIntegerInASingleElementArrayDeserialization133() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19imk064lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArrayDeserialization133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19imk064lf(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5955); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5956);BigInteger expected = new BigInteger("34343434343424242423432323243243242"); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5957);BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5958);assertEquals(expected, actual); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization134() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tsp7fr4lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tsp7fr4lj(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5959); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5960);int expected = 1; 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5961);int actual = gson.fromJson("[1]", int.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5962);assertEquals(expected, actual); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5963);actual = gson.fromJson("[1]", Integer.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5964);assertEquals(expected, actual); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization135() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2nnhg4lp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2nnhg4lp(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5965); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5966);assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class)); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5967);assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class)); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5968);boolean value = gson.fromJson("[false]", boolean.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5969);assertEquals(false, value); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5970);value = gson.fromJson("[true]", boolean.class); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5971);assertEquals(true, value); 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 


public void testBigDecimalNaNDeserializationNotSupported201() {__CLR4_4_14jq4jqle6rvqsp.R.globalSliceStart(getClass().getName(),5972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycnrt44lw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jq4jqle6rvqsp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jq4jqle6rvqsp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNaNDeserializationNotSupported201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycnrt44lw(){try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5972); 
     __CLR4_4_14jq4jqle6rvqsp.R.inc(5973);try { 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5974);gson.fromJson("NaN", BigDecimal.class); 
         __CLR4_4_14jq4jqle6rvqsp.R.inc(5975);fail("Gson should not accept NaN for deserialization by default."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {try{__CLR4_4_14jq4jqle6rvqsp.R.inc(5976);
    __CLR4_4_14jq4jqle6rvqsp.R.inc(5977);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_14jq4jqle6rvqsp.R.flushNeeded();}}
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
