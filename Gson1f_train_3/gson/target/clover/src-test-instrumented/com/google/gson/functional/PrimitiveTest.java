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
public class PrimitiveTest extends TestCase {static class __CLR4_4_14kl4klle6rzh16{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,6005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14kl4klle6rzh16.R.inc(5925);
    __CLR4_4_14kl4klle6rzh16.R.inc(5926);super.setUp();
    __CLR4_4_14kl4klle6rzh16.R.inc(5927);gson = new Gson();
  }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}}


public void testHtmlCharacterSerialization32() throws Exception {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0h0hi4ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testHtmlCharacterSerialization32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0h0hi4ko() throws Exception{try{__CLR4_4_14kl4klle6rzh16.R.inc(5928); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5929);String target = "<script>var a = 12;</script>"; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5930);String result = gson.toJson(target); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5931);assertFalse(result.equals('"' + target + '"')); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5932);gson = new GsonBuilder().disableHtmlEscaping().create(); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5933);result = gson.toJson(target); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5934);assertTrue(result.equals('"' + target + '"')); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testNumberSerialization109() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y83yh84kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNumberSerialization109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y83yh84kv(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5935); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5936);Number expected = 1L; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5937);String json = gson.toJson(expected); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5938);assertEquals(expected.toString(), json); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5939);json = gson.toJson(expected, Number.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5940);assertEquals(expected.toString(), json); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testFloatNaNSerializationNotSupportedByDefault112() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrnukp4l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testFloatNaNSerializationNotSupportedByDefault112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrnukp4l1(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5941); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5942);try { 
         __CLR4_4_14kl4klle6rzh16.R.inc(5943);float nan = Float.NaN; 
         __CLR4_4_14kl4klle6rzh16.R.inc(5944);gson.toJson(nan); 
         __CLR4_4_14kl4klle6rzh16.R.inc(5945);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14kl4klle6rzh16.R.inc(5946);try { 
         __CLR4_4_14kl4klle6rzh16.R.inc(5947);gson.toJson(Float.NaN); 
         __CLR4_4_14kl4klle6rzh16.R.inc(5948);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testNegativeInfinitySerialization114() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gr38va4l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testNegativeInfinitySerialization114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gr38va4l9(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5949); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5950);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5951);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5952);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5953);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testDoubleNaNSerializationNotSupportedByDefault116() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlby124le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerializationNotSupportedByDefault116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlby124le(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5954); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5955);try { 
         __CLR4_4_14kl4klle6rzh16.R.inc(5956);double nan = Double.NaN; 
         __CLR4_4_14kl4klle6rzh16.R.inc(5957);gson.toJson(nan); 
         __CLR4_4_14kl4klle6rzh16.R.inc(5958);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_14kl4klle6rzh16.R.inc(5959);try { 
         __CLR4_4_14kl4klle6rzh16.R.inc(5960);gson.toJson(Double.NaN); 
         __CLR4_4_14kl4klle6rzh16.R.inc(5961);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testDoubleNoFractAsStringRepresentationDeserialization117() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4b37j4lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNoFractAsStringRepresentationDeserialization117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4b37j4lm(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5962); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5963);String doubleValue = "1E+5"; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5964);Double expected = Double.valueOf(doubleValue); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5965);Double actual = gson.fromJson(doubleValue, Double.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5966);assertEquals(expected, actual); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5967);double actual1 = gson.fromJson(doubleValue, double.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5968);assertEquals(expected.doubleValue(), actual1); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization131() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110epgz4lt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110epgz4lt(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5969); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5970);double expected = -122.08; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5971);double actual = gson.fromJson("[-122.08]", double.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5972);assertEquals(expected, actual); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5973);actual = gson.fromJson("[-122.08]", Double.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5974);assertEquals(expected, actual); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testBigDecimalInASingleElementArrayDeserialization132() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ro5hl24lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalInASingleElementArrayDeserialization132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ro5hl24lz(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5975); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5976);BigDecimal expected = new BigDecimal("-122.08e-21"); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5977);BigDecimal actual = gson.fromJson("[-122.08e-21]", BigDecimal.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5978);assertEquals(expected, actual); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testBigIntegerInASingleElementArrayDeserialization133() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19imk064m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigIntegerInASingleElementArrayDeserialization133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19imk064m3(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5979); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5980);BigInteger expected = new BigInteger("34343434343424242423432323243243242"); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5981);BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5982);assertEquals(expected, actual); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization134() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tsp7fr4m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tsp7fr4m7(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5983); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5984);int expected = 1; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5985);int actual = gson.fromJson("[1]", int.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5986);assertEquals(expected, actual); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5987);actual = gson.fromJson("[1]", Integer.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5988);assertEquals(expected, actual); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testLongAsStringSerialization179() throws Exception {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z4lh4md();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testLongAsStringSerialization179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z4lh4md() throws Exception{try{__CLR4_4_14kl4klle6rzh16.R.inc(5989); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5990);gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create(); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5991);String result = gson.toJson(15L); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5992);assertEquals("\"15\"", result); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5993);result = gson.toJson(2); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5994);assertEquals("2", result); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testReallyLongValuesDeserialization198() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2bgzh4mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testReallyLongValuesDeserialization198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2bgzh4mj(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5995); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5996);String json = "333961828784581"; 
     __CLR4_4_14kl4klle6rzh16.R.inc(5997);long value = gson.fromJson(json, Long.class); 
     __CLR4_4_14kl4klle6rzh16.R.inc(5998);assertEquals(333961828784581L, value); 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 


public void testBigDecimalNaNDeserializationNotSupported199() {__CLR4_4_14kl4klle6rzh16.R.globalSliceStart(getClass().getName(),5999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7bxzu4mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14kl4klle6rzh16.R.rethrow($CLV_t2$);}finally{__CLR4_4_14kl4klle6rzh16.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testBigDecimalNaNDeserializationNotSupported199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7bxzu4mn(){try{__CLR4_4_14kl4klle6rzh16.R.inc(5999); 
     __CLR4_4_14kl4klle6rzh16.R.inc(6000);try { 
         __CLR4_4_14kl4klle6rzh16.R.inc(6001);gson.fromJson("NaN", BigDecimal.class); 
         __CLR4_4_14kl4klle6rzh16.R.inc(6002);fail("Gson should not accept NaN for deserialization by default."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {try{__CLR4_4_14kl4klle6rzh16.R.inc(6003);
    __CLR4_4_14kl4klle6rzh16.R.inc(6004);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_14kl4klle6rzh16.R.flushNeeded();}}
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
