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
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithCustomTypeConverter;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Functional tests for the support of custom serializer and deserializers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CustomTypeAdaptersTest extends TestCase {static class __CLR4_4_13i63i6le6p2015{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13i63i6le6p2015.R.inc(4542);
    __CLR4_4_13i63i6le6p2015.R.inc(4543);super.setUp();
    __CLR4_4_13i63i6le6p2015.R.inc(4544);builder = new GsonBuilder();
  }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}

public void testNegativeInfinitySerialization32() {__CLR4_4_13i63i6le6p2015.R.globalSliceStart(getClass().getName(),4545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw7yhz3i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13i63i6le6p2015.R.rethrow($CLV_t2$);}finally{__CLR4_4_13i63i6le6p2015.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testNegativeInfinitySerialization32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw7yhz3i9(){try{__CLR4_4_13i63i6le6p2015.R.inc(4545); 
     __CLR4_4_13i63i6le6p2015.R.inc(4546);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_13i63i6le6p2015.R.inc(4547);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_13i63i6le6p2015.R.inc(4548);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_13i63i6le6p2015.R.inc(4549);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  

  
  
  

  

  

  
  
  
  
  
  
  private static class Base {
    int baseValue = 2;
  }
  
  private static class Derived extends Base {
    @SuppressWarnings("unused")
    int derivedValue = 3;
  }
  
  
  private Gson createGsonObjectWithFooTypeAdapter() {try{__CLR4_4_13i63i6le6p2015.R.inc(4550);
    __CLR4_4_13i63i6le6p2015.R.inc(4551);return new GsonBuilder().registerTypeAdapter(Foo.class, new FooTypeAdapter()).create();
  }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  
  public static class Foo {
    private final int key;
    private final long value;
    
    public Foo() {
      this(0, 0L);__CLR4_4_13i63i6le6p2015.R.inc(4553);try{__CLR4_4_13i63i6le6p2015.R.inc(4552);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}

    public Foo(int key, long value) {try{__CLR4_4_13i63i6le6p2015.R.inc(4554);
      __CLR4_4_13i63i6le6p2015.R.inc(4555);this.key = key;
      __CLR4_4_13i63i6le6p2015.R.inc(4556);this.value = value;
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  public static class FooTypeAdapter implements JsonSerializer<Foo>, JsonDeserializer<Foo> {
    public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13i63i6le6p2015.R.inc(4557);
      __CLR4_4_13i63i6le6p2015.R.inc(4558);return context.deserialize(json, typeOfT);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}

    public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13i63i6le6p2015.R.inc(4559);
      __CLR4_4_13i63i6le6p2015.R.inc(4560);return context.serialize(src, typeOfSrc);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  
  
  
  
  private static class ClassWithWrapperLongField {
    Long value;
  }
  
  private static class ClassWithBooleanField {
    Boolean value;
  }
  
  
  
  
  
  private static class StringHolder {
    String part1;
    String part2;

    public StringHolder(String string) {try{__CLR4_4_13i63i6le6p2015.R.inc(4561);
      __CLR4_4_13i63i6le6p2015.R.inc(4562);String[] parts = string.split(":");
      __CLR4_4_13i63i6le6p2015.R.inc(4563);part1 = parts[0];
      __CLR4_4_13i63i6le6p2015.R.inc(4564);part2 = parts[1];
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
    public StringHolder(String part1, String part2) {try{__CLR4_4_13i63i6le6p2015.R.inc(4565);
      __CLR4_4_13i63i6le6p2015.R.inc(4566);this.part1 = part1;
      __CLR4_4_13i63i6le6p2015.R.inc(4567);this.part2 = part2;
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  private static class StringHolderTypeAdapter implements JsonSerializer<StringHolder>, 
      JsonDeserializer<StringHolder>, InstanceCreator<StringHolder> {

    public StringHolder createInstance(Type type) {try{__CLR4_4_13i63i6le6p2015.R.inc(4568);
      //Fill up with objects that will be thrown away
      __CLR4_4_13i63i6le6p2015.R.inc(4569);return new StringHolder("unknown:thing");
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}

    public StringHolder deserialize(JsonElement src, Type type, 
        JsonDeserializationContext context) {try{__CLR4_4_13i63i6le6p2015.R.inc(4570);
      __CLR4_4_13i63i6le6p2015.R.inc(4571);return new StringHolder(src.getAsString());
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}

    public JsonElement serialize(StringHolder src, Type typeOfSrc, 
        JsonSerializationContext context) {try{__CLR4_4_13i63i6le6p2015.R.inc(4572);
      __CLR4_4_13i63i6le6p2015.R.inc(4573);String contents = src.part1 + ':' + src.part2;
      __CLR4_4_13i63i6le6p2015.R.inc(4574);return new JsonPrimitive(contents);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  // Test created from Issue 70
  

  // Test created from Issue 70
  

  // Test created from Issue 70
  
  
  // Test created from Issue 70
  
  
  // Test created from Issue 70
  

  // Test created from Issue 70
  

  

  

  private static class DataHolder {
    final String data;

    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolder() {
      this("");__CLR4_4_13i63i6le6p2015.R.inc(4576);try{__CLR4_4_13i63i6le6p2015.R.inc(4575);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
    
    public DataHolder(String data) {try{__CLR4_4_13i63i6le6p2015.R.inc(4577);
      __CLR4_4_13i63i6le6p2015.R.inc(4578);this.data = data;
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  private static class DataHolderWrapper {
    final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(null);__CLR4_4_13i63i6le6p2015.R.inc(4580);try{__CLR4_4_13i63i6le6p2015.R.inc(4579);
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
    
    public DataHolderWrapper(DataHolder data) {try{__CLR4_4_13i63i6le6p2015.R.inc(4581);
      __CLR4_4_13i63i6le6p2015.R.inc(4582);this.wrappedData = data;
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
  
  private static class DataHolderSerializer implements JsonSerializer<DataHolder> {
    public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13i63i6le6p2015.R.inc(4583);
      __CLR4_4_13i63i6le6p2015.R.inc(4584);JsonObject obj = new JsonObject();
      __CLR4_4_13i63i6le6p2015.R.inc(4585);obj.addProperty("myData", src.data);
      __CLR4_4_13i63i6le6p2015.R.inc(4586);return obj;
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }

  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13i63i6le6p2015.R.inc(4587);
      __CLR4_4_13i63i6le6p2015.R.inc(4588);JsonObject jsonObj = json.getAsJsonObject();
      __CLR4_4_13i63i6le6p2015.R.inc(4589);JsonElement jsonElement = jsonObj.get("data");
      __CLR4_4_13i63i6le6p2015.R.inc(4590);if ((((jsonElement == null || jsonElement.isJsonNull())&&(__CLR4_4_13i63i6le6p2015.R.iget(4591)!=0|true))||(__CLR4_4_13i63i6le6p2015.R.iget(4592)==0&false))) {{
        __CLR4_4_13i63i6le6p2015.R.inc(4593);return new DataHolder(null);
      }
      }__CLR4_4_13i63i6le6p2015.R.inc(4594);return new DataHolder(jsonElement.getAsString());
    }finally{__CLR4_4_13i63i6le6p2015.R.flushNeeded();}}
  }
}
