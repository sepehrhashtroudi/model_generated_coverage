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

package com.google.gson;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;


/**
 * This class contains some test fixtures for Parameterized types. These classes should ideally
 * belong either in the common or functional package, but they are placed here because they need
 * access to package protected elements of com.google.gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParamterizedTypeFixtures {public static class __CLR4_4_134g34gle6id5lt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u006e\u006f\u0070\u0074\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676516042564L,8589935092L,4140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public static class MyParameterizedType<T> {
    public final T value;
    public MyParameterizedType(T value) {try{__CLR4_4_134g34gle6id5lt.R.inc(4048);
      __CLR4_4_134g34gle6id5lt.R.inc(4049);this.value = value;
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
    public T getValue() {try{__CLR4_4_134g34gle6id5lt.R.inc(4050);
      __CLR4_4_134g34gle6id5lt.R.inc(4051);return value;
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_134g34gle6id5lt.R.inc(4052);
      __CLR4_4_134g34gle6id5lt.R.inc(4053);String valueAsJson = getExpectedJson(value);
      __CLR4_4_134g34gle6id5lt.R.inc(4054);return String.format("{\"value\":%s}", valueAsJson);
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}

    private String getExpectedJson(Object obj) {try{__CLR4_4_134g34gle6id5lt.R.inc(4055);
      __CLR4_4_134g34gle6id5lt.R.inc(4056);Class<?> clazz = obj.getClass();
      __CLR4_4_134g34gle6id5lt.R.inc(4057);if ((((Primitives.isWrapperType(Primitives.wrap(clazz)))&&(__CLR4_4_134g34gle6id5lt.R.iget(4058)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4059)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4060);return obj.toString();
      } }else {__CLR4_4_134g34gle6id5lt.R.inc(4061);if ((((obj.getClass().equals(String.class))&&(__CLR4_4_134g34gle6id5lt.R.iget(4062)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4063)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4064);return "\"" + obj.toString() + "\"";
      } }else {{
        // Try invoking a getExpectedJson() method if it exists
        __CLR4_4_134g34gle6id5lt.R.inc(4065);try {
          __CLR4_4_134g34gle6id5lt.R.inc(4066);Method method = clazz.getMethod("getExpectedJson");
          __CLR4_4_134g34gle6id5lt.R.inc(4067);Object results = method.invoke(obj);
          __CLR4_4_134g34gle6id5lt.R.inc(4068);return (String) results;
        } catch (SecurityException e) {
          __CLR4_4_134g34gle6id5lt.R.inc(4069);throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
          __CLR4_4_134g34gle6id5lt.R.inc(4070);throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
          __CLR4_4_134g34gle6id5lt.R.inc(4071);throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          __CLR4_4_134g34gle6id5lt.R.inc(4072);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
          __CLR4_4_134g34gle6id5lt.R.inc(4073);throw new RuntimeException(e);
        }
      }
    }}}finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_134g34gle6id5lt.R.inc(4074);
      __CLR4_4_134g34gle6id5lt.R.inc(4075);return (((value == null )&&(__CLR4_4_134g34gle6id5lt.R.iget(4076)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4077)==0&false))? 0 : value.hashCode();
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_134g34gle6id5lt.R.inc(4078);
      __CLR4_4_134g34gle6id5lt.R.inc(4079);if ((((this == obj)&&(__CLR4_4_134g34gle6id5lt.R.iget(4080)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4081)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4082);return true;
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4083);if ((((obj == null)&&(__CLR4_4_134g34gle6id5lt.R.iget(4084)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4085)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4086);return false;
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4087);if ((((getClass() != obj.getClass())&&(__CLR4_4_134g34gle6id5lt.R.iget(4088)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4089)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4090);return false;
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4091);MyParameterizedType other = (MyParameterizedType) obj;
      __CLR4_4_134g34gle6id5lt.R.inc(4092);if ((((value == null)&&(__CLR4_4_134g34gle6id5lt.R.iget(4093)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4094)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4095);if ((((other.value != null)&&(__CLR4_4_134g34gle6id5lt.R.iget(4096)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4097)==0&false))) {{
          __CLR4_4_134g34gle6id5lt.R.inc(4098);return false;
        }
      }} }else {__CLR4_4_134g34gle6id5lt.R.inc(4099);if ((((!value.equals(other.value))&&(__CLR4_4_134g34gle6id5lt.R.iget(4100)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4101)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4102);return false;
      }
      }}__CLR4_4_134g34gle6id5lt.R.inc(4103);return true;
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
  }

  public static class MyParameterizedTypeInstanceCreator<T>
      implements InstanceCreator<MyParameterizedType<T>>{
    private final T instanceOfT;
    /**
     * Caution the specified instance is reused by the instance creator for each call.
     * This means that the fields of the same objects will be overwritten by Gson.
     * This is usually fine in tests since there we deserialize just once, but quite
     * dangerous in practice.
     *
     * @param instanceOfT
     */
    public MyParameterizedTypeInstanceCreator(T instanceOfT) {try{__CLR4_4_134g34gle6id5lt.R.inc(4104);
      __CLR4_4_134g34gle6id5lt.R.inc(4105);this.instanceOfT = instanceOfT;
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
    public MyParameterizedType<T> createInstance(Type type) {try{__CLR4_4_134g34gle6id5lt.R.inc(4106);
      __CLR4_4_134g34gle6id5lt.R.inc(4107);return new MyParameterizedType<T>(instanceOfT);
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
  }

  public static class MyParameterizedTypeAdapter<T>
  implements JsonSerializer<MyParameterizedType<T>>, JsonDeserializer<MyParameterizedType<T>> {
    @SuppressWarnings("unchecked")
    public static<T> String getExpectedJson(MyParameterizedType<T> obj) {try{__CLR4_4_134g34gle6id5lt.R.inc(4108);
      __CLR4_4_134g34gle6id5lt.R.inc(4109);Class<T> clazz = (Class<T>) obj.value.getClass();
      __CLR4_4_134g34gle6id5lt.R.inc(4110);boolean addQuotes = !clazz.isArray() && !Primitives.unwrap(clazz).isPrimitive();
      __CLR4_4_134g34gle6id5lt.R.inc(4111);StringBuilder sb = new StringBuilder("{\"");
      __CLR4_4_134g34gle6id5lt.R.inc(4112);sb.append(obj.value.getClass().getSimpleName()).append("\":");
      __CLR4_4_134g34gle6id5lt.R.inc(4113);if ((((addQuotes)&&(__CLR4_4_134g34gle6id5lt.R.iget(4114)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4115)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4116);sb.append("\"");
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4117);sb.append(obj.value.toString());
      __CLR4_4_134g34gle6id5lt.R.inc(4118);if ((((addQuotes)&&(__CLR4_4_134g34gle6id5lt.R.iget(4119)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4120)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4121);sb.append("\"");
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4122);sb.append("}");
      __CLR4_4_134g34gle6id5lt.R.inc(4123);return sb.toString();
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}

    public JsonElement serialize(MyParameterizedType<T> src, Type classOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_134g34gle6id5lt.R.inc(4124);
      __CLR4_4_134g34gle6id5lt.R.inc(4125);JsonObject json = new JsonObject();
      __CLR4_4_134g34gle6id5lt.R.inc(4126);T value = src.getValue();
      __CLR4_4_134g34gle6id5lt.R.inc(4127);json.add(value.getClass().getSimpleName(), context.serialize(value));
      __CLR4_4_134g34gle6id5lt.R.inc(4128);return json;
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public MyParameterizedType<T> deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_134g34gle6id5lt.R.inc(4129);
      __CLR4_4_134g34gle6id5lt.R.inc(4130);Type genericClass = TypeUtils.getActualTypeForFirstTypeVariable(typeOfT);
      __CLR4_4_134g34gle6id5lt.R.inc(4131);TypeInfo typeInfo = new TypeInfo(genericClass);
      __CLR4_4_134g34gle6id5lt.R.inc(4132);String className = typeInfo.getRawClass().getSimpleName();
      __CLR4_4_134g34gle6id5lt.R.inc(4133);T value = (T) json.getAsJsonObject().get(className).getAsObject();
      __CLR4_4_134g34gle6id5lt.R.inc(4134);if ((((typeInfo.isPrimitive())&&(__CLR4_4_134g34gle6id5lt.R.iget(4135)!=0|true))||(__CLR4_4_134g34gle6id5lt.R.iget(4136)==0&false))) {{
        __CLR4_4_134g34gle6id5lt.R.inc(4137);PrimitiveTypeAdapter typeAdapter = new PrimitiveTypeAdapter();
        __CLR4_4_134g34gle6id5lt.R.inc(4138);value = (T) typeAdapter.adaptType(value, typeInfo.getRawClass());
      }
      }__CLR4_4_134g34gle6id5lt.R.inc(4139);return new MyParameterizedType<T>(value);
    }finally{__CLR4_4_134g34gle6id5lt.R.flushNeeded();}}
  }
}
