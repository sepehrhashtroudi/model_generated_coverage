/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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

package com.google.gson;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public final class MixedStreamTest extends TestCase {static class __CLR4_4_13ag3agle6rxkg8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4299,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final Car BLUE_MUSTANG = new Car("mustang", 0x0000FF);
  private static final Car BLACK_BMW = new Car("bmw", 0x000000);
  private static final Car RED_MIATA = new Car("miata", 0xFF0000);
  private static final String CARS_JSON = "[\n"
      + "  {\n"
      + "    \"name\": \"mustang\",\n"
      + "    \"color\": 255\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"bmw\",\n"
      + "    \"color\": 0\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"miata\",\n"
      + "    \"color\": 16711680\n"
      + "  }\n"
      + "]";


public void testWriteHtmlSafe31() {__CLR4_4_13ag3agle6rxkg8.R.globalSliceStart(getClass().getName(),4264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqlwtm3ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ag3agle6rxkg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ag3agle6rxkg8.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testWriteHtmlSafe31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqlwtm3ag(){try{__CLR4_4_13ag3agle6rxkg8.R.inc(4264); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4265);List<String> contents = Arrays.asList("<", ">", "&", "=", "'"); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4266);Type type = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4267);StringWriter writer = new StringWriter(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4268);new Gson().toJson(contents, type, new JsonWriter(writer)); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4269);assertEquals("[\"\\u003c\",\"\\u003e\",\"\\u0026\",\"\\u003d\",\"\\u0027\"]", writer.toString()); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4270);writer = new StringWriter(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4271);new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer)); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4272);assertEquals("[\"<\",\">\",\"&\",\"=\",\"'\"]", writer.toString()); 
 }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}} 


public void testReaderDoesNotMutateState72() throws IOException {__CLR4_4_13ag3agle6rxkg8.R.globalSliceStart(getClass().getName(),4273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xun6fc3ap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ag3agle6rxkg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ag3agle6rxkg8.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReaderDoesNotMutateState72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xun6fc3ap() throws IOException{try{__CLR4_4_13ag3agle6rxkg8.R.inc(4273); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4274);Gson gson = new Gson(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4275);JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON)); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4276);jsonReader.beginArray(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4277);jsonReader.setLenient(false); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4278);gson.fromJson(jsonReader, Car.class); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4279);assertFalse(jsonReader.isLenient()); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4280);jsonReader.setLenient(true); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4281);gson.fromJson(jsonReader, Car.class); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4282);assertTrue(jsonReader.isLenient()); 
 }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}} 


public void testReadInvalidState124() throws IOException {__CLR4_4_13ag3agle6rxkg8.R.globalSliceStart(getClass().getName(),4283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq2rzc3az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ag3agle6rxkg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ag3agle6rxkg8.R.globalSliceEnd(getClass().getName(),"com.google.gson.MixedStreamTest.testReadInvalidState124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq2rzc3az() throws IOException{try{__CLR4_4_13ag3agle6rxkg8.R.inc(4283); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4284);Gson gson = new Gson(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4285);JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON)); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4286);jsonReader.beginArray(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4287);jsonReader.beginObject(); 
     __CLR4_4_13ag3agle6rxkg8.R.inc(4288);try { 
         __CLR4_4_13ag3agle6rxkg8.R.inc(4289);gson.fromJson(jsonReader, String.class); 
         __CLR4_4_13ag3agle6rxkg8.R.inc(4290);fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}} 

  

  
  
  

  

  

  

  

  
  
  
  
  

  
  
  

  static final class Car {
    String name;
    int color;

    Car(String name, int color) {try{__CLR4_4_13ag3agle6rxkg8.R.inc(4291);
      __CLR4_4_13ag3agle6rxkg8.R.inc(4292);this.name = name;
      __CLR4_4_13ag3agle6rxkg8.R.inc(4293);this.color = color;
    }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}}

    // used by Gson
    Car() {try{__CLR4_4_13ag3agle6rxkg8.R.inc(4294);}finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}}

    @Override public int hashCode() {try{__CLR4_4_13ag3agle6rxkg8.R.inc(4295);
      __CLR4_4_13ag3agle6rxkg8.R.inc(4296);return name.hashCode() ^ color;
    }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}}

    @Override public boolean equals(Object o) {try{__CLR4_4_13ag3agle6rxkg8.R.inc(4297);
      __CLR4_4_13ag3agle6rxkg8.R.inc(4298);return o instanceof Car
          && ((Car) o).name.equals(name)
          && ((Car) o).color == color;
    }finally{__CLR4_4_13ag3agle6rxkg8.R.flushNeeded();}}
  }
}
