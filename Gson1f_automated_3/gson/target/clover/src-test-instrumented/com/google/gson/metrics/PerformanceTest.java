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

package com.google.gson.metrics;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests to measure performance for Gson. All tests in this file will be disabled in code. To run
 * them remove disabled_ prefix from the tests and run them.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PerformanceTest extends TestCase {static class __CLR4_4_13zi3zile6p204p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,5217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final int COLLECTION_SIZE = 5000;

  private static final int NUM_ITERATIONS = 100;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13zi3zile6p204p.R.inc(5166);
    __CLR4_4_13zi3zile6p204p.R.inc(5167);super.setUp();
    __CLR4_4_13zi3zile6p204p.R.inc(5168);gson = new Gson();
  }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
  
    

  
  
  private void parseLongJson(String json) throws JsonParseException {try{__CLR4_4_13zi3zile6p204p.R.inc(5169);
    __CLR4_4_13zi3zile6p204p.R.inc(5170);ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class);
    __CLR4_4_13zi3zile6p204p.R.inc(5171);assertTrue(target.message.contains("Error"));
    __CLR4_4_13zi3zile6p204p.R.inc(5172);assertTrue(target.stackTrace.contains("Yippie"));
  }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}

  private static class ExceptionHolder {
    public final String message;
    public final String stackTrace;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private ExceptionHolder() {
      this("", "");__CLR4_4_13zi3zile6p204p.R.inc(5174);try{__CLR4_4_13zi3zile6p204p.R.inc(5173);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
    public ExceptionHolder(String message, String stackTrace) {try{__CLR4_4_13zi3zile6p204p.R.inc(5175);
      __CLR4_4_13zi3zile6p204p.R.inc(5176);this.message = message;
      __CLR4_4_13zi3zile6p204p.R.inc(5177);this.stackTrace = stackTrace;
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
  }

  @SuppressWarnings("unused")
  private static class CollectionEntry {
    final String name;
    final String value;

    // For use by Gson
    private CollectionEntry() {
      this(null, null);__CLR4_4_13zi3zile6p204p.R.inc(5179);try{__CLR4_4_13zi3zile6p204p.R.inc(5178);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}

    CollectionEntry(String name, String value) {try{__CLR4_4_13zi3zile6p204p.R.inc(5180);
      __CLR4_4_13zi3zile6p204p.R.inc(5181);this.name = name;
      __CLR4_4_13zi3zile6p204p.R.inc(5182);this.value = value;
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
  }
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  

  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to serialize upto 14MB byte array
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to deserialize a byte array of 11MB
  

// The tests to measure serialization and deserialization performance of Gson
// Based on the discussion at
// http://groups.google.com/group/google-gson/browse_thread/thread/7a50b17a390dfaeb
// Test results: 10/19/2009 
// Serialize classes avg time: 60 ms
// Deserialized classes avg time: 70 ms
// Serialize exposed classes avg time: 159 ms
// Deserialized exposed classes avg time: 173 ms
  
  

  
  
  

  

  

  

  private String buildJsonForClassWithList() {try{__CLR4_4_13zi3zile6p204p.R.inc(5183);
    __CLR4_4_13zi3zile6p204p.R.inc(5184);StringBuilder sb = new StringBuilder("{");
    __CLR4_4_13zi3zile6p204p.R.inc(5185);sb.append("field:").append("'str',");
    __CLR4_4_13zi3zile6p204p.R.inc(5186);sb.append("list:[");
    __CLR4_4_13zi3zile6p204p.R.inc(5187);boolean first = true;
    __CLR4_4_13zi3zile6p204p.R.inc(5188);for (int i = 0; (((i < COLLECTION_SIZE)&&(__CLR4_4_13zi3zile6p204p.R.iget(5189)!=0|true))||(__CLR4_4_13zi3zile6p204p.R.iget(5190)==0&false)); ++i) {{
      __CLR4_4_13zi3zile6p204p.R.inc(5191);if ((((first)&&(__CLR4_4_13zi3zile6p204p.R.iget(5192)!=0|true))||(__CLR4_4_13zi3zile6p204p.R.iget(5193)==0&false))) {{
        __CLR4_4_13zi3zile6p204p.R.inc(5194);first = false;
      } }else {{
        __CLR4_4_13zi3zile6p204p.R.inc(5195);sb.append(",");
      }
      }__CLR4_4_13zi3zile6p204p.R.inc(5196);sb.append("{field:'element-" + i + "'}");
    }
    }__CLR4_4_13zi3zile6p204p.R.inc(5197);sb.append("]");
    __CLR4_4_13zi3zile6p204p.R.inc(5198);sb.append("}");
    __CLR4_4_13zi3zile6p204p.R.inc(5199);String json = sb.toString();
    __CLR4_4_13zi3zile6p204p.R.inc(5200);return json;
  }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static final class ClassWithList { 
    final String field; 
    final List<ClassWithField> list = new ArrayList<ClassWithField>(COLLECTION_SIZE);
    ClassWithList() {
      this(null);__CLR4_4_13zi3zile6p204p.R.inc(5202);try{__CLR4_4_13zi3zile6p204p.R.inc(5201);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
    ClassWithList(String field) {try{__CLR4_4_13zi3zile6p204p.R.inc(5203);
      __CLR4_4_13zi3zile6p204p.R.inc(5204);this.field = field;
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithField { 
    final String field;
    ClassWithField() {
      this("");__CLR4_4_13zi3zile6p204p.R.inc(5206);try{__CLR4_4_13zi3zile6p204p.R.inc(5205);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
    public ClassWithField(String field) {try{__CLR4_4_13zi3zile6p204p.R.inc(5207); 
      __CLR4_4_13zi3zile6p204p.R.inc(5208);this.field = field; 
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}} 
  }

  @SuppressWarnings("unused")
  private static final class ClassWithListOfObjects { 
    @Expose 
    final String field; 
    @Expose 
    final List<ClassWithExposedField> list = new ArrayList<ClassWithExposedField>(COLLECTION_SIZE);
    ClassWithListOfObjects() {
      this(null);__CLR4_4_13zi3zile6p204p.R.inc(5210);try{__CLR4_4_13zi3zile6p204p.R.inc(5209);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
    ClassWithListOfObjects(String field) {try{__CLR4_4_13zi3zile6p204p.R.inc(5211);
      __CLR4_4_13zi3zile6p204p.R.inc(5212);this.field = field;
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithExposedField { 
    @Expose 
    final String field;
    ClassWithExposedField() {
      this("");__CLR4_4_13zi3zile6p204p.R.inc(5214);try{__CLR4_4_13zi3zile6p204p.R.inc(5213);
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}}
    ClassWithExposedField(String field) {try{__CLR4_4_13zi3zile6p204p.R.inc(5215); 
      __CLR4_4_13zi3zile6p204p.R.inc(5216);this.field = field; 
    }finally{__CLR4_4_13zi3zile6p204p.R.flushNeeded();}} 
  }
}
