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

import java.lang.reflect.Field;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.common.TestTypes.ClassWithSerializedNameFields;
import com.google.gson.common.TestTypes.StringWrapper;

import junit.framework.TestCase;

/**
 * Functional tests for naming policies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NamingPolicyTest extends TestCase {static class __CLR4_4_14a84a8le6rxkrx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14a84a8le6rxkrx.R.inc(5552);
    __CLR4_4_14a84a8le6rxkrx.R.inc(5553);super.setUp();
    __CLR4_4_14a84a8le6rxkrx.R.inc(5554);builder = new GsonBuilder();
  }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}}


public void testGsonWithNonDefaultFieldNamingPolicySerialization36() {__CLR4_4_14a84a8le6rxkrx.R.globalSliceStart(getClass().getName(),5555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g78w9p4ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a84a8le6rxkrx.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a84a8le6rxkrx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithNonDefaultFieldNamingPolicySerialization36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g78w9p4ab(){try{__CLR4_4_14a84a8le6rxkrx.R.inc(5555); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5556);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5557);StringWrapper target = new StringWrapper("blah"); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5558);assertEquals("{\"SomeConstantStringInstanceField\":\"" + target.someConstantStringInstanceField + "\"}", gson.toJson(target)); 
 }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}} 


public void testGsonWithUpperCamelCaseSpacesPolicyDeserialiation153() {__CLR4_4_14a84a8le6rxkrx.R.globalSliceStart(getClass().getName(),5559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytnai94af();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a84a8le6rxkrx.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a84a8le6rxkrx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithUpperCamelCaseSpacesPolicyDeserialiation153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytnai94af(){try{__CLR4_4_14a84a8le6rxkrx.R.inc(5559); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5560);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES).create(); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5561);String target = "{\"Some Constant String Instance Field\":\"someValue\"}"; 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5562);StringWrapper deserializedObject = gson.fromJson(target, StringWrapper.class); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5563);assertEquals("someValue", deserializedObject.someConstantStringInstanceField); 
 }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}} 


public void testDeprecatedNamingStrategy181() throws Exception {__CLR4_4_14a84a8le6rxkrx.R.globalSliceStart(getClass().getName(),5564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pa94kv4ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a84a8le6rxkrx.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a84a8le6rxkrx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testDeprecatedNamingStrategy181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pa94kv4ak() throws Exception{try{__CLR4_4_14a84a8le6rxkrx.R.inc(5564); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5565);Gson gson = builder.setFieldNamingStrategy(new UpperCaseNamingStrategy()).create(); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5566);ClassWithDuplicateFields target = new ClassWithDuplicateFields(10); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5567);String actual = gson.toJson(target); 
     __CLR4_4_14a84a8le6rxkrx.R.inc(5568);assertEquals("{\"A\":10}", actual); 
 }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}} 

  

  
  
  

  
  
  

  

  

  
  
  
  
  
  
  

  

  private static class UpperCaseNamingStrategy implements FieldNamingStrategy {
    public String translateName(Field f) {try{__CLR4_4_14a84a8le6rxkrx.R.inc(5569);
      __CLR4_4_14a84a8le6rxkrx.R.inc(5570);return f.getName().toUpperCase();
    }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}}
  }

  @SuppressWarnings("unused")
  private static class ClassWithDuplicateFields {
    public Integer a;
    @SerializedName("a") public Double b;
    
    public ClassWithDuplicateFields(Integer a) {
      this(a, null);__CLR4_4_14a84a8le6rxkrx.R.inc(5572);try{__CLR4_4_14a84a8le6rxkrx.R.inc(5571);
    }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}}
    
    public ClassWithDuplicateFields(Double b) {
      this(null, b);__CLR4_4_14a84a8le6rxkrx.R.inc(5574);try{__CLR4_4_14a84a8le6rxkrx.R.inc(5573);
    }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}}
    
    public ClassWithDuplicateFields(Integer a, Double b) {try{__CLR4_4_14a84a8le6rxkrx.R.inc(5575);
      __CLR4_4_14a84a8le6rxkrx.R.inc(5576);this.a = a;
      __CLR4_4_14a84a8le6rxkrx.R.inc(5577);this.b = b;
    }finally{__CLR4_4_14a84a8le6rxkrx.R.flushNeeded();}}
  }
}
