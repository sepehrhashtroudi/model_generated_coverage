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
public class ParamterizedTypeFixtures {public static class __CLR4_4_13bz3bzld3ms3xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,4411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public static class MyParameterizedType<T> {
    public final T value;
    public MyParameterizedType(T value) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4319);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4320);this.value = value;
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
    public T getValue() {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4321);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4322);return value;
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4323);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4324);String valueAsJson = getExpectedJson(value);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4325);return String.format("{\"value\":%s}", valueAsJson);
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}

    private String getExpectedJson(Object obj) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4326);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4327);Class<?> clazz = obj.getClass();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4328);if ((((Primitives.isWrapperType(Primitives.wrap(clazz)))&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4329)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4330)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4331);return obj.toString();
      } }else {__CLR4_4_13bz3bzld3ms3xp.R.inc(4332);if ((((obj.getClass().equals(String.class))&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4333)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4334)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4335);return "\"" + obj.toString() + "\"";
      } }else {{
        // Try invoking a getExpectedJson() method if it exists
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4336);try {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4337);Method method = clazz.getMethod("getExpectedJson");
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4338);Object results = method.invoke(obj);
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4339);return (String) results;
        } catch (SecurityException e) {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4340);throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4341);throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4342);throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4343);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4344);throw new RuntimeException(e);
        }
      }
    }}}finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4345);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4346);return (((value == null )&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4347)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4348)==0&false))? 0 : value.hashCode();
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4349);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4350);if ((((this == obj)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4351)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4352)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4353);return true;
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4354);if ((((obj == null)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4355)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4356)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4357);return false;
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4358);if ((((getClass() != obj.getClass())&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4359)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4360)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4361);return false;
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4362);MyParameterizedType other = (MyParameterizedType) obj;
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4363);if ((((value == null)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4364)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4365)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4366);if ((((other.value != null)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4367)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4368)==0&false))) {{
          __CLR4_4_13bz3bzld3ms3xp.R.inc(4369);return false;
        }
      }} }else {__CLR4_4_13bz3bzld3ms3xp.R.inc(4370);if ((((!value.equals(other.value))&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4371)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4372)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4373);return false;
      }
      }}__CLR4_4_13bz3bzld3ms3xp.R.inc(4374);return true;
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
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
    public MyParameterizedTypeInstanceCreator(T instanceOfT) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4375);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4376);this.instanceOfT = instanceOfT;
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
    public MyParameterizedType<T> createInstance(Type type) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4377);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4378);return new MyParameterizedType<T>(instanceOfT);
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
  }

  public static class MyParameterizedTypeAdapter<T>
  implements JsonSerializer<MyParameterizedType<T>>, JsonDeserializer<MyParameterizedType<T>> {
    @SuppressWarnings("unchecked")
    public static<T> String getExpectedJson(MyParameterizedType<T> obj) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4379);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4380);Class<T> clazz = (Class<T>) obj.value.getClass();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4381);boolean addQuotes = !clazz.isArray() && !Primitives.unwrap(clazz).isPrimitive();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4382);StringBuilder sb = new StringBuilder("{\"");
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4383);sb.append(obj.value.getClass().getSimpleName()).append("\":");
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4384);if ((((addQuotes)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4385)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4386)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4387);sb.append("\"");
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4388);sb.append(obj.value.toString());
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4389);if ((((addQuotes)&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4390)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4391)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4392);sb.append("\"");
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4393);sb.append("}");
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4394);return sb.toString();
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}

    public JsonElement serialize(MyParameterizedType<T> src, Type classOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4395);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4396);JsonObject json = new JsonObject();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4397);T value = src.getValue();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4398);json.add(value.getClass().getSimpleName(), context.serialize(value));
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4399);return json;
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public MyParameterizedType<T> deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_13bz3bzld3ms3xp.R.inc(4400);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4401);Type genericClass = TypeUtils.getActualTypeForFirstTypeVariable(typeOfT);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4402);TypeInfo typeInfo = new TypeInfo(genericClass);
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4403);String className = typeInfo.getRawClass().getSimpleName();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4404);T value = (T) json.getAsJsonObject().get(className).getAsObject();
      __CLR4_4_13bz3bzld3ms3xp.R.inc(4405);if ((((typeInfo.isPrimitive())&&(__CLR4_4_13bz3bzld3ms3xp.R.iget(4406)!=0|true))||(__CLR4_4_13bz3bzld3ms3xp.R.iget(4407)==0&false))) {{
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4408);PrimitiveTypeAdapter typeAdapter = new PrimitiveTypeAdapter();
        __CLR4_4_13bz3bzld3ms3xp.R.inc(4409);value = (T) typeAdapter.adaptType(value, typeInfo.getRawClass());
      }
      }__CLR4_4_13bz3bzld3ms3xp.R.inc(4410);return new MyParameterizedType<T>(value);
    }finally{__CLR4_4_13bz3bzld3ms3xp.R.flushNeeded();}}
  }
}
