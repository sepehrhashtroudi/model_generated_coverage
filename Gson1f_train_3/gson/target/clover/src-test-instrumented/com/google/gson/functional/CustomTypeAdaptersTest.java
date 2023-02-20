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
public class CustomTypeAdaptersTest extends TestCase {static class __CLR4_4_13vj3vjle6rzgwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5084,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5023);
    __CLR4_4_13vj3vjle6rzgwf.R.inc(5024);super.setUp();
    __CLR4_4_13vj3vjle6rzgwf.R.inc(5025);builder = new GsonBuilder();
  }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}


public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass197() {__CLR4_4_13vj3vjle6rzgwf.R.globalSliceStart(getClass().getName(),5026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ep8uow3vm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vj3vjle6rzgwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vj3vjle6rzgwf.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CustomTypeAdaptersTest.testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ep8uow3vm(){try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5026); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5027);Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() { 
  
         public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5028); 
             __CLR4_4_13vj3vjle6rzgwf.R.inc(5029);JsonObject json = new JsonObject(); 
             __CLR4_4_13vj3vjle6rzgwf.R.inc(5030);json.addProperty("value", src.baseValue); 
             __CLR4_4_13vj3vjle6rzgwf.R.inc(5031);return json; 
         }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}} 
     }).create(); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5032);Base b = new Base(); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5033);String json = gson.toJson(b); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5034);assertTrue(json.contains("value")); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5035);b = new Derived(); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5036);json = gson.toJson(b, Base.class); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5037);assertTrue(json.contains("value")); 
     __CLR4_4_13vj3vjle6rzgwf.R.inc(5038);assertFalse(json.contains("derivedValue")); 
 }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}} 

  

  
  
  

  

  

  
  
  
  
  
  
  private static class Base {
    int baseValue = 2;
  }
  
  private static class Derived extends Base {
    @SuppressWarnings("unused")
    int derivedValue = 3;
  }
  
  
  private Gson createGsonObjectWithFooTypeAdapter() {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5039);
    __CLR4_4_13vj3vjle6rzgwf.R.inc(5040);return new GsonBuilder().registerTypeAdapter(Foo.class, new FooTypeAdapter()).create();
  }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  
  public static class Foo {
    private final int key;
    private final long value;
    
    public Foo() {
      this(0, 0L);__CLR4_4_13vj3vjle6rzgwf.R.inc(5042);try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5041);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}

    public Foo(int key, long value) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5043);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5044);this.key = key;
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5045);this.value = value;
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }
  
  public static class FooTypeAdapter implements JsonSerializer<Foo>, JsonDeserializer<Foo> {
    public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5046);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5047);return context.deserialize(json, typeOfT);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}

    public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5048);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5049);return context.serialize(src, typeOfSrc);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
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

    public StringHolder(String string) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5050);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5051);String[] parts = string.split(":");
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5052);part1 = parts[0];
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5053);part2 = parts[1];
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
    public StringHolder(String part1, String part2) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5054);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5055);this.part1 = part1;
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5056);this.part2 = part2;
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }
  
  private static class StringHolderTypeAdapter implements JsonSerializer<StringHolder>, 
      JsonDeserializer<StringHolder>, InstanceCreator<StringHolder> {

    public StringHolder createInstance(Type type) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5057);
      //Fill up with objects that will be thrown away
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5058);return new StringHolder("unknown:thing");
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}

    public StringHolder deserialize(JsonElement src, Type type, 
        JsonDeserializationContext context) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5059);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5060);return new StringHolder(src.getAsString());
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}

    public JsonElement serialize(StringHolder src, Type typeOfSrc, 
        JsonSerializationContext context) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5061);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5062);String contents = src.part1 + ':' + src.part2;
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5063);return new JsonPrimitive(contents);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
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
      this("");__CLR4_4_13vj3vjle6rzgwf.R.inc(5065);try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5064);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
    
    public DataHolder(String data) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5066);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5067);this.data = data;
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }
  
  private static class DataHolderWrapper {
    final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(null);__CLR4_4_13vj3vjle6rzgwf.R.inc(5069);try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5068);
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
    
    public DataHolderWrapper(DataHolder data) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5070);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5071);this.wrappedData = data;
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }
  
  private static class DataHolderSerializer implements JsonSerializer<DataHolder> {
    public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5072);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5073);JsonObject obj = new JsonObject();
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5074);obj.addProperty("myData", src.data);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5075);return obj;
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }

  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13vj3vjle6rzgwf.R.inc(5076);
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5077);JsonObject jsonObj = json.getAsJsonObject();
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5078);JsonElement jsonElement = jsonObj.get("data");
      __CLR4_4_13vj3vjle6rzgwf.R.inc(5079);if ((((jsonElement == null || jsonElement.isJsonNull())&&(__CLR4_4_13vj3vjle6rzgwf.R.iget(5080)!=0|true))||(__CLR4_4_13vj3vjle6rzgwf.R.iget(5081)==0&false))) {{
        __CLR4_4_13vj3vjle6rzgwf.R.inc(5082);return new DataHolder(null);
      }
      }__CLR4_4_13vj3vjle6rzgwf.R.inc(5083);return new DataHolder(jsonElement.getAsString());
    }finally{__CLR4_4_13vj3vjle6rzgwf.R.flushNeeded();}}
  }
}
