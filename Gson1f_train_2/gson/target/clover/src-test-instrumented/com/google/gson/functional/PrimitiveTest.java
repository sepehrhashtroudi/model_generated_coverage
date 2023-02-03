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
public class PrimitiveTest extends TestCase {static class __CLR4_4_14jv4jvld3ms451{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14jv4jvld3ms451.R.inc(5899);
    __CLR4_4_14jv4jvld3ms451.R.inc(5900);super.setUp();
    __CLR4_4_14jv4jvld3ms451.R.inc(5901);gson = new Gson();
  }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}}


public void testBadValueForBigIntegerDeserialization108() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160q36i4jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBadValueForBigIntegerDeserialization108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160q36i4jy(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5902); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5903);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5904);gson.fromJson("15.099", BigInteger.class); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5905);fail("BigInteger can not be decimal values."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testNumberSerialization109() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y83yh84k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberSerialization109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y83yh84k2(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5906); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5907);Number expected = 1L; 
     __CLR4_4_14jv4jvld3ms451.R.inc(5908);String json = gson.toJson(expected); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5909);assertEquals(expected.toString(), json); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5910);json = gson.toJson(expected, Number.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5911);assertEquals(expected.toString(), json); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testNumberDeserialization110() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168ebb14k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberDeserialization110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168ebb14k8(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5912); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5913);String json = "1"; 
     __CLR4_4_14jv4jvld3ms451.R.inc(5914);Number expected = new Integer(json); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5915);Number actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5916);assertEquals(expected.intValue(), actual.intValue()); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5917);json = String.valueOf(Long.MAX_VALUE); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5918);expected = new Long(json); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5919);actual = gson.fromJson(json, Number.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5920);assertEquals(expected.longValue(), actual.longValue()); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testFloatInfinitySerialization112() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1285jcr4kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatInfinitySerialization112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1285jcr4kh(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5921); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5922);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5923);float infinity = Float.POSITIVE_INFINITY; 
     __CLR4_4_14jv4jvld3ms451.R.inc(5924);assertEquals("Infinity", gson.toJson(infinity)); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5925);assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY)); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testFloatNaNSerializationNotSupportedByDefault113() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0ntd64km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNSerializationNotSupportedByDefault113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0ntd64km(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5926); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5927);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5928);float nan = Float.NaN; 
         __CLR4_4_14jv4jvld3ms451.R.inc(5929);gson.toJson(nan); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5930);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14jv4jvld3ms451.R.inc(5931);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5932);gson.toJson(Float.NaN); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5933);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testDoubleNaNSerializationNotSupportedByDefault116() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlby124ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerializationNotSupportedByDefault116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlby124ku(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5934); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5935);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5936);double nan = Double.NaN; 
         __CLR4_4_14jv4jvld3ms451.R.inc(5937);gson.toJson(nan); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5938);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14jv4jvld3ms451.R.inc(5939);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5940);gson.toJson(Double.NaN); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5941);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testDoubleNoFractAsStringRepresentationDeserialization117() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4b37j4l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNoFractAsStringRepresentationDeserialization117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4b37j4l2(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5942); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5943);String doubleValue = "1E+5"; 
     __CLR4_4_14jv4jvld3ms451.R.inc(5944);Double expected = Double.valueOf(doubleValue); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5945);Double actual = gson.fromJson(doubleValue, Double.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5946);assertEquals(expected, actual); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5947);double actual1 = gson.fromJson(doubleValue, double.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5948);assertEquals(expected.doubleValue(), actual1); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testBigDecimalInASingleElementArrayDeserialization134() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y65f604l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInASingleElementArrayDeserialization134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y65f604l9(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5949); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5950);BigDecimal expected = new BigDecimal("-122.08e-21"); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5951);BigDecimal actual = gson.fromJson("[-122.08e-21]", BigDecimal.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5952);assertEquals(expected, actual); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testBigIntegerInASingleElementArrayDeserialization135() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130mmf84ld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArrayDeserialization135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130mmf84ld(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5953); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5954);BigInteger expected = new BigInteger("34343434343424242423432323243243242"); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5955);BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5956);assertEquals(expected, actual); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization136() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybnm9x4lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybnm9x4lh(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5957); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5958);assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class)); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5959);assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class)); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5960);boolean value = gson.fromJson("[false]", boolean.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5961);assertEquals(false, value); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5962);value = gson.fromJson("[true]", boolean.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5963);assertEquals(true, value); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testLongAsStringSerialization184() throws Exception {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7vxzp4lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLongAsStringSerialization184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7vxzp4lo() throws Exception{try{__CLR4_4_14jv4jvld3ms451.R.inc(5964); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5965);gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create(); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5966);String result = gson.toJson(15L); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5967);assertEquals("\"15\"", result); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5968);result = gson.toJson(2); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5969);assertEquals("2", result); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testReallyLongValuesDeserialization202() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1fvkp4lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testReallyLongValuesDeserialization202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1fvkp4lu(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5970); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5971);String json = "333961828784581"; 
     __CLR4_4_14jv4jvld3ms451.R.inc(5972);long value = gson.fromJson(json, Long.class); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5973);assertEquals(333961828784581L, value); 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 


public void testBigDecimalNaNDeserializationNotSupported203() {__CLR4_4_14jv4jvld3ms451.R.globalSliceStart(getClass().getName(),5974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6gcl24ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14jv4jvld3ms451.R.rethrow($CLV_t2$);}finally{__CLR4_4_14jv4jvld3ms451.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNaNDeserializationNotSupported203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6gcl24ly(){try{__CLR4_4_14jv4jvld3ms451.R.inc(5974); 
     __CLR4_4_14jv4jvld3ms451.R.inc(5975);try { 
         __CLR4_4_14jv4jvld3ms451.R.inc(5976);gson.fromJson("NaN", BigDecimal.class); 
         __CLR4_4_14jv4jvld3ms451.R.inc(5977);fail("Gson should not accept NaN for deserialization by default."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {try{__CLR4_4_14jv4jvld3ms451.R.inc(5978);
    __CLR4_4_14jv4jvld3ms451.R.inc(5979);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_14jv4jvld3ms451.R.flushNeeded();}}
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
