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
public class PerformanceTest extends TestCase {static class __CLR4_4_14q74q7le6rzh36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,6178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final int COLLECTION_SIZE = 5000;

  private static final int NUM_ITERATIONS = 100;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14q74q7le6rzh36.R.inc(6127);
    __CLR4_4_14q74q7le6rzh36.R.inc(6128);super.setUp();
    __CLR4_4_14q74q7le6rzh36.R.inc(6129);gson = new Gson();
  }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
  
    

  
  
  private void parseLongJson(String json) throws JsonParseException {try{__CLR4_4_14q74q7le6rzh36.R.inc(6130);
    __CLR4_4_14q74q7le6rzh36.R.inc(6131);ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class);
    __CLR4_4_14q74q7le6rzh36.R.inc(6132);assertTrue(target.message.contains("Error"));
    __CLR4_4_14q74q7le6rzh36.R.inc(6133);assertTrue(target.stackTrace.contains("Yippie"));
  }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}

  private static class ExceptionHolder {
    public final String message;
    public final String stackTrace;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private ExceptionHolder() {
      this("", "");__CLR4_4_14q74q7le6rzh36.R.inc(6135);try{__CLR4_4_14q74q7le6rzh36.R.inc(6134);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
    public ExceptionHolder(String message, String stackTrace) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6136);
      __CLR4_4_14q74q7le6rzh36.R.inc(6137);this.message = message;
      __CLR4_4_14q74q7le6rzh36.R.inc(6138);this.stackTrace = stackTrace;
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
  }

  @SuppressWarnings("unused")
  private static class CollectionEntry {
    final String name;
    final String value;

    // For use by Gson
    private CollectionEntry() {
      this(null, null);__CLR4_4_14q74q7le6rzh36.R.inc(6140);try{__CLR4_4_14q74q7le6rzh36.R.inc(6139);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}

    CollectionEntry(String name, String value) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6141);
      __CLR4_4_14q74q7le6rzh36.R.inc(6142);this.name = name;
      __CLR4_4_14q74q7le6rzh36.R.inc(6143);this.value = value;
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
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
  
  

  
  
  

  

  

  

  private String buildJsonForClassWithList() {try{__CLR4_4_14q74q7le6rzh36.R.inc(6144);
    __CLR4_4_14q74q7le6rzh36.R.inc(6145);StringBuilder sb = new StringBuilder("{");
    __CLR4_4_14q74q7le6rzh36.R.inc(6146);sb.append("field:").append("'str',");
    __CLR4_4_14q74q7le6rzh36.R.inc(6147);sb.append("list:[");
    __CLR4_4_14q74q7le6rzh36.R.inc(6148);boolean first = true;
    __CLR4_4_14q74q7le6rzh36.R.inc(6149);for (int i = 0; (((i < COLLECTION_SIZE)&&(__CLR4_4_14q74q7le6rzh36.R.iget(6150)!=0|true))||(__CLR4_4_14q74q7le6rzh36.R.iget(6151)==0&false)); ++i) {{
      __CLR4_4_14q74q7le6rzh36.R.inc(6152);if ((((first)&&(__CLR4_4_14q74q7le6rzh36.R.iget(6153)!=0|true))||(__CLR4_4_14q74q7le6rzh36.R.iget(6154)==0&false))) {{
        __CLR4_4_14q74q7le6rzh36.R.inc(6155);first = false;
      } }else {{
        __CLR4_4_14q74q7le6rzh36.R.inc(6156);sb.append(",");
      }
      }__CLR4_4_14q74q7le6rzh36.R.inc(6157);sb.append("{field:'element-" + i + "'}");
    }
    }__CLR4_4_14q74q7le6rzh36.R.inc(6158);sb.append("]");
    __CLR4_4_14q74q7le6rzh36.R.inc(6159);sb.append("}");
    __CLR4_4_14q74q7le6rzh36.R.inc(6160);String json = sb.toString();
    __CLR4_4_14q74q7le6rzh36.R.inc(6161);return json;
  }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static final class ClassWithList { 
    final String field; 
    final List<ClassWithField> list = new ArrayList<ClassWithField>(COLLECTION_SIZE);
    ClassWithList() {
      this(null);__CLR4_4_14q74q7le6rzh36.R.inc(6163);try{__CLR4_4_14q74q7le6rzh36.R.inc(6162);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
    ClassWithList(String field) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6164);
      __CLR4_4_14q74q7le6rzh36.R.inc(6165);this.field = field;
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithField { 
    final String field;
    ClassWithField() {
      this("");__CLR4_4_14q74q7le6rzh36.R.inc(6167);try{__CLR4_4_14q74q7le6rzh36.R.inc(6166);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
    public ClassWithField(String field) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6168); 
      __CLR4_4_14q74q7le6rzh36.R.inc(6169);this.field = field; 
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}} 
  }

  @SuppressWarnings("unused")
  private static final class ClassWithListOfObjects { 
    @Expose 
    final String field; 
    @Expose 
    final List<ClassWithExposedField> list = new ArrayList<ClassWithExposedField>(COLLECTION_SIZE);
    ClassWithListOfObjects() {
      this(null);__CLR4_4_14q74q7le6rzh36.R.inc(6171);try{__CLR4_4_14q74q7le6rzh36.R.inc(6170);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
    ClassWithListOfObjects(String field) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6172);
      __CLR4_4_14q74q7le6rzh36.R.inc(6173);this.field = field;
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithExposedField { 
    @Expose 
    final String field;
    ClassWithExposedField() {
      this("");__CLR4_4_14q74q7le6rzh36.R.inc(6175);try{__CLR4_4_14q74q7le6rzh36.R.inc(6174);
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}}
    ClassWithExposedField(String field) {try{__CLR4_4_14q74q7le6rzh36.R.inc(6176); 
      __CLR4_4_14q74q7le6rzh36.R.inc(6177);this.field = field; 
    }finally{__CLR4_4_14q74q7le6rzh36.R.flushNeeded();}} 
  }
}
