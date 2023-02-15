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
public class PrimitiveTest extends TestCase {static class __CLR4_4_13yi3yildqypcyk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675576026699L,8589935092L,5147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13yi3yildqypcyk.R.inc(5130);
    __CLR4_4_13yi3yildqypcyk.R.inc(5131);super.setUp();
    __CLR4_4_13yi3yildqypcyk.R.inc(5132);gson = new Gson();
  }finally{__CLR4_4_13yi3yildqypcyk.R.flushNeeded();}}

public void testDoubleNaNSerializationNotSupportedByDefault45() {__CLR4_4_13yi3yildqypcyk.R.globalSliceStart(getClass().getName(),5133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vs3eg13yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yi3yildqypcyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yi3yildqypcyk.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleNaNSerializationNotSupportedByDefault45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vs3eg13yl(){try{__CLR4_4_13yi3yildqypcyk.R.inc(5133); 
     __CLR4_4_13yi3yildqypcyk.R.inc(5134);try { 
         __CLR4_4_13yi3yildqypcyk.R.inc(5135);double nan = Double.NaN; 
         __CLR4_4_13yi3yildqypcyk.R.inc(5136);gson.toJson(nan); 
         __CLR4_4_13yi3yildqypcyk.R.inc(5137);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     __CLR4_4_13yi3yildqypcyk.R.inc(5138);try { 
         __CLR4_4_13yi3yildqypcyk.R.inc(5139);gson.toJson(Double.NaN); 
         __CLR4_4_13yi3yildqypcyk.R.inc(5140);fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_13yi3yildqypcyk.R.flushNeeded();}}
public void testDoubleInASingleElementArrayDeserialization52() {__CLR4_4_13yi3yildqypcyk.R.globalSliceStart(getClass().getName(),5141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18af3v93yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yi3yildqypcyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yi3yildqypcyk.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.PrimitiveTest.testDoubleInASingleElementArrayDeserialization52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18af3v93yt(){try{__CLR4_4_13yi3yildqypcyk.R.inc(5141); 
     __CLR4_4_13yi3yildqypcyk.R.inc(5142);Double expected = 1.7976931348623157E308; 
     __CLR4_4_13yi3yildqypcyk.R.inc(5143);Double actual = gson.fromJson("[1.7976931348623157E308]", Double.class); 
     __CLR4_4_13yi3yildqypcyk.R.inc(5144);assertEquals(expected, actual); 
 }finally{__CLR4_4_13yi3yildqypcyk.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {try{__CLR4_4_13yi3yildqypcyk.R.inc(5145);
    __CLR4_4_13yi3yildqypcyk.R.inc(5146);return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }finally{__CLR4_4_13yi3yildqypcyk.R.flushNeeded();}}
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
