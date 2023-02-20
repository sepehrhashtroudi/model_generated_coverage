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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.ClassWithBaseField;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional Test exercising custom deserialization only.  When test applies to both 
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Joel Leitch
 */
public class CustomDeserializerTest extends TestCase {static class __CLR4_4_13uw3uwle6rzgw4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String DEFAULT_VALUE = "test123";
  private static final String SUFFIX = "blah";
  
  private Gson gson;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5000);
    __CLR4_4_13uw3uwle6rzgw4.R.inc(5001);super.setUp();
    __CLR4_4_13uw3uwle6rzgw4.R.inc(5002);gson = new GsonBuilder().registerTypeAdapter(DataHolder.class, new DataHolderDeserializer()).create();
  }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
  
  
  
  

  private static class DataHolder {
    private final String data;

    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolder() {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5003);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5004);throw new IllegalStateException();
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
    
    public DataHolder(String data) {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5005);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5006);this.data = data;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
    
    public String getData() {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5007);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5008);return data;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
  }
  
  private static class DataHolderWrapper {
    private final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(new DataHolder(DEFAULT_VALUE));__CLR4_4_13uw3uwle6rzgw4.R.inc(5010);try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5009);
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
    
    public DataHolderWrapper(DataHolder data) {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5011);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5012);this.wrappedData = data;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}

    public DataHolder getWrappedData() {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5013);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5014);return wrappedData;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
  }
  
  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5015);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5016);JsonObject jsonObj = json.getAsJsonObject();
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5017);String dataString = jsonObj.get("data").getAsString();
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5018);return new DataHolder(dataString + SUFFIX);
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
  }
  
  

  private static class MyBase {
    static final String TYPE_ACCESS = "__type__";
  }

  private enum SubTypes { 
    SUB_TYPE1(SubType1.class),
    SUB_TYPE2(SubType2.class);
    private final Type subClass;
    private SubTypes(Type subClass) {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5019);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5020);this.subClass = subClass;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
    public Type getSubclass() {try{__CLR4_4_13uw3uwle6rzgw4.R.inc(5021);
      __CLR4_4_13uw3uwle6rzgw4.R.inc(5022);return subClass;
    }finally{__CLR4_4_13uw3uwle6rzgw4.R.flushNeeded();}}
  }

  private static class SubType1 extends MyBase {
    String field1;    
  }

  private static class SubType2 extends MyBase {
    @SuppressWarnings("unused")
    String field2;    
  }
  
  

  

  

  
  private static class ClassWithLong {
    long field;
  }
 
  

  

  private static class ClassWithBaseArray {
    Base[] bases;
  }
}
