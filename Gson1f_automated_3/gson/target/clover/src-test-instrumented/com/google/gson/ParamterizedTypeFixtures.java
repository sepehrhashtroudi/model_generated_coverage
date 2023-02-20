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
public class ParamterizedTypeFixtures {public static class __CLR4_4_1359359le6p1zyv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public static class MyParameterizedType<T> {
    public final T value;
    public MyParameterizedType(T value) {try{__CLR4_4_1359359le6p1zyv.R.inc(4077);
      __CLR4_4_1359359le6p1zyv.R.inc(4078);this.value = value;
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
    public T getValue() {try{__CLR4_4_1359359le6p1zyv.R.inc(4079);
      __CLR4_4_1359359le6p1zyv.R.inc(4080);return value;
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1359359le6p1zyv.R.inc(4081);
      __CLR4_4_1359359le6p1zyv.R.inc(4082);String valueAsJson = getExpectedJson(value);
      __CLR4_4_1359359le6p1zyv.R.inc(4083);return String.format("{\"value\":%s}", valueAsJson);
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}

    private String getExpectedJson(Object obj) {try{__CLR4_4_1359359le6p1zyv.R.inc(4084);
      __CLR4_4_1359359le6p1zyv.R.inc(4085);Class<?> clazz = obj.getClass();
      __CLR4_4_1359359le6p1zyv.R.inc(4086);if ((((Primitives.isWrapperType(Primitives.wrap(clazz)))&&(__CLR4_4_1359359le6p1zyv.R.iget(4087)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4088)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4089);return obj.toString();
      } }else {__CLR4_4_1359359le6p1zyv.R.inc(4090);if ((((obj.getClass().equals(String.class))&&(__CLR4_4_1359359le6p1zyv.R.iget(4091)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4092)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4093);return "\"" + obj.toString() + "\"";
      } }else {{
        // Try invoking a getExpectedJson() method if it exists
        __CLR4_4_1359359le6p1zyv.R.inc(4094);try {
          __CLR4_4_1359359le6p1zyv.R.inc(4095);Method method = clazz.getMethod("getExpectedJson");
          __CLR4_4_1359359le6p1zyv.R.inc(4096);Object results = method.invoke(obj);
          __CLR4_4_1359359le6p1zyv.R.inc(4097);return (String) results;
        } catch (SecurityException e) {
          __CLR4_4_1359359le6p1zyv.R.inc(4098);throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
          __CLR4_4_1359359le6p1zyv.R.inc(4099);throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
          __CLR4_4_1359359le6p1zyv.R.inc(4100);throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          __CLR4_4_1359359le6p1zyv.R.inc(4101);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
          __CLR4_4_1359359le6p1zyv.R.inc(4102);throw new RuntimeException(e);
        }
      }
    }}}finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1359359le6p1zyv.R.inc(4103);
      __CLR4_4_1359359le6p1zyv.R.inc(4104);return (((value == null )&&(__CLR4_4_1359359le6p1zyv.R.iget(4105)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4106)==0&false))? 0 : value.hashCode();
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1359359le6p1zyv.R.inc(4107);
      __CLR4_4_1359359le6p1zyv.R.inc(4108);if ((((this == obj)&&(__CLR4_4_1359359le6p1zyv.R.iget(4109)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4110)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4111);return true;
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4112);if ((((obj == null)&&(__CLR4_4_1359359le6p1zyv.R.iget(4113)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4114)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4115);return false;
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4116);if ((((getClass() != obj.getClass())&&(__CLR4_4_1359359le6p1zyv.R.iget(4117)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4118)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4119);return false;
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4120);MyParameterizedType other = (MyParameterizedType) obj;
      __CLR4_4_1359359le6p1zyv.R.inc(4121);if ((((value == null)&&(__CLR4_4_1359359le6p1zyv.R.iget(4122)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4123)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4124);if ((((other.value != null)&&(__CLR4_4_1359359le6p1zyv.R.iget(4125)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4126)==0&false))) {{
          __CLR4_4_1359359le6p1zyv.R.inc(4127);return false;
        }
      }} }else {__CLR4_4_1359359le6p1zyv.R.inc(4128);if ((((!value.equals(other.value))&&(__CLR4_4_1359359le6p1zyv.R.iget(4129)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4130)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4131);return false;
      }
      }}__CLR4_4_1359359le6p1zyv.R.inc(4132);return true;
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
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
    public MyParameterizedTypeInstanceCreator(T instanceOfT) {try{__CLR4_4_1359359le6p1zyv.R.inc(4133);
      __CLR4_4_1359359le6p1zyv.R.inc(4134);this.instanceOfT = instanceOfT;
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
    public MyParameterizedType<T> createInstance(Type type) {try{__CLR4_4_1359359le6p1zyv.R.inc(4135);
      __CLR4_4_1359359le6p1zyv.R.inc(4136);return new MyParameterizedType<T>(instanceOfT);
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
  }

  public static class MyParameterizedTypeAdapter<T>
  implements JsonSerializer<MyParameterizedType<T>>, JsonDeserializer<MyParameterizedType<T>> {
    @SuppressWarnings("unchecked")
    public static<T> String getExpectedJson(MyParameterizedType<T> obj) {try{__CLR4_4_1359359le6p1zyv.R.inc(4137);
      __CLR4_4_1359359le6p1zyv.R.inc(4138);Class<T> clazz = (Class<T>) obj.value.getClass();
      __CLR4_4_1359359le6p1zyv.R.inc(4139);boolean addQuotes = !clazz.isArray() && !Primitives.unwrap(clazz).isPrimitive();
      __CLR4_4_1359359le6p1zyv.R.inc(4140);StringBuilder sb = new StringBuilder("{\"");
      __CLR4_4_1359359le6p1zyv.R.inc(4141);sb.append(obj.value.getClass().getSimpleName()).append("\":");
      __CLR4_4_1359359le6p1zyv.R.inc(4142);if ((((addQuotes)&&(__CLR4_4_1359359le6p1zyv.R.iget(4143)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4144)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4145);sb.append("\"");
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4146);sb.append(obj.value.toString());
      __CLR4_4_1359359le6p1zyv.R.inc(4147);if ((((addQuotes)&&(__CLR4_4_1359359le6p1zyv.R.iget(4148)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4149)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4150);sb.append("\"");
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4151);sb.append("}");
      __CLR4_4_1359359le6p1zyv.R.inc(4152);return sb.toString();
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}

    public JsonElement serialize(MyParameterizedType<T> src, Type classOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_1359359le6p1zyv.R.inc(4153);
      __CLR4_4_1359359le6p1zyv.R.inc(4154);JsonObject json = new JsonObject();
      __CLR4_4_1359359le6p1zyv.R.inc(4155);T value = src.getValue();
      __CLR4_4_1359359le6p1zyv.R.inc(4156);json.add(value.getClass().getSimpleName(), context.serialize(value));
      __CLR4_4_1359359le6p1zyv.R.inc(4157);return json;
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public MyParameterizedType<T> deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_1359359le6p1zyv.R.inc(4158);
      __CLR4_4_1359359le6p1zyv.R.inc(4159);Type genericClass = TypeUtils.getActualTypeForFirstTypeVariable(typeOfT);
      __CLR4_4_1359359le6p1zyv.R.inc(4160);TypeInfo typeInfo = new TypeInfo(genericClass);
      __CLR4_4_1359359le6p1zyv.R.inc(4161);String className = typeInfo.getRawClass().getSimpleName();
      __CLR4_4_1359359le6p1zyv.R.inc(4162);T value = (T) json.getAsJsonObject().get(className).getAsObject();
      __CLR4_4_1359359le6p1zyv.R.inc(4163);if ((((typeInfo.isPrimitive())&&(__CLR4_4_1359359le6p1zyv.R.iget(4164)!=0|true))||(__CLR4_4_1359359le6p1zyv.R.iget(4165)==0&false))) {{
        __CLR4_4_1359359le6p1zyv.R.inc(4166);PrimitiveTypeAdapter typeAdapter = new PrimitiveTypeAdapter();
        __CLR4_4_1359359le6p1zyv.R.inc(4167);value = (T) typeAdapter.adaptType(value, typeInfo.getRawClass());
      }
      }__CLR4_4_1359359le6p1zyv.R.inc(4168);return new MyParameterizedType<T>(value);
    }finally{__CLR4_4_1359359le6p1zyv.R.flushNeeded();}}
  }
}
