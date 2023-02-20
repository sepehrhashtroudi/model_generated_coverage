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
public class ParamterizedTypeFixtures {public static class __CLR4_4_13dj3djle6rxkhx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,4467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public static class MyParameterizedType<T> {
    public final T value;
    public MyParameterizedType(T value) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4375);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4376);this.value = value;
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
    public T getValue() {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4377);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4378);return value;
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4379);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4380);String valueAsJson = getExpectedJson(value);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4381);return String.format("{\"value\":%s}", valueAsJson);
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}

    private String getExpectedJson(Object obj) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4382);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4383);Class<?> clazz = obj.getClass();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4384);if ((((Primitives.isWrapperType(Primitives.wrap(clazz)))&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4385)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4386)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4387);return obj.toString();
      } }else {__CLR4_4_13dj3djle6rxkhx.R.inc(4388);if ((((obj.getClass().equals(String.class))&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4389)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4390)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4391);return "\"" + obj.toString() + "\"";
      } }else {{
        // Try invoking a getExpectedJson() method if it exists
        __CLR4_4_13dj3djle6rxkhx.R.inc(4392);try {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4393);Method method = clazz.getMethod("getExpectedJson");
          __CLR4_4_13dj3djle6rxkhx.R.inc(4394);Object results = method.invoke(obj);
          __CLR4_4_13dj3djle6rxkhx.R.inc(4395);return (String) results;
        } catch (SecurityException e) {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4396);throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4397);throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4398);throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4399);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
          __CLR4_4_13dj3djle6rxkhx.R.inc(4400);throw new RuntimeException(e);
        }
      }
    }}}finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4401);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4402);return (((value == null )&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4403)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4404)==0&false))? 0 : value.hashCode();
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4405);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4406);if ((((this == obj)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4407)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4408)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4409);return true;
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4410);if ((((obj == null)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4411)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4412)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4413);return false;
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4414);if ((((getClass() != obj.getClass())&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4415)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4416)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4417);return false;
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4418);MyParameterizedType other = (MyParameterizedType) obj;
      __CLR4_4_13dj3djle6rxkhx.R.inc(4419);if ((((value == null)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4420)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4421)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4422);if ((((other.value != null)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4423)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4424)==0&false))) {{
          __CLR4_4_13dj3djle6rxkhx.R.inc(4425);return false;
        }
      }} }else {__CLR4_4_13dj3djle6rxkhx.R.inc(4426);if ((((!value.equals(other.value))&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4427)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4428)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4429);return false;
      }
      }}__CLR4_4_13dj3djle6rxkhx.R.inc(4430);return true;
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
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
    public MyParameterizedTypeInstanceCreator(T instanceOfT) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4431);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4432);this.instanceOfT = instanceOfT;
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
    public MyParameterizedType<T> createInstance(Type type) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4433);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4434);return new MyParameterizedType<T>(instanceOfT);
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
  }

  public static class MyParameterizedTypeAdapter<T>
  implements JsonSerializer<MyParameterizedType<T>>, JsonDeserializer<MyParameterizedType<T>> {
    @SuppressWarnings("unchecked")
    public static<T> String getExpectedJson(MyParameterizedType<T> obj) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4435);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4436);Class<T> clazz = (Class<T>) obj.value.getClass();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4437);boolean addQuotes = !clazz.isArray() && !Primitives.unwrap(clazz).isPrimitive();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4438);StringBuilder sb = new StringBuilder("{\"");
      __CLR4_4_13dj3djle6rxkhx.R.inc(4439);sb.append(obj.value.getClass().getSimpleName()).append("\":");
      __CLR4_4_13dj3djle6rxkhx.R.inc(4440);if ((((addQuotes)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4441)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4442)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4443);sb.append("\"");
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4444);sb.append(obj.value.toString());
      __CLR4_4_13dj3djle6rxkhx.R.inc(4445);if ((((addQuotes)&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4446)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4447)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4448);sb.append("\"");
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4449);sb.append("}");
      __CLR4_4_13dj3djle6rxkhx.R.inc(4450);return sb.toString();
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}

    public JsonElement serialize(MyParameterizedType<T> src, Type classOfSrc,
        JsonSerializationContext context) {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4451);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4452);JsonObject json = new JsonObject();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4453);T value = src.getValue();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4454);json.add(value.getClass().getSimpleName(), context.serialize(value));
      __CLR4_4_13dj3djle6rxkhx.R.inc(4455);return json;
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public MyParameterizedType<T> deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {try{__CLR4_4_13dj3djle6rxkhx.R.inc(4456);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4457);Type genericClass = TypeUtils.getActualTypeForFirstTypeVariable(typeOfT);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4458);TypeInfo typeInfo = new TypeInfo(genericClass);
      __CLR4_4_13dj3djle6rxkhx.R.inc(4459);String className = typeInfo.getRawClass().getSimpleName();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4460);T value = (T) json.getAsJsonObject().get(className).getAsObject();
      __CLR4_4_13dj3djle6rxkhx.R.inc(4461);if ((((typeInfo.isPrimitive())&&(__CLR4_4_13dj3djle6rxkhx.R.iget(4462)!=0|true))||(__CLR4_4_13dj3djle6rxkhx.R.iget(4463)==0&false))) {{
        __CLR4_4_13dj3djle6rxkhx.R.inc(4464);PrimitiveTypeAdapter typeAdapter = new PrimitiveTypeAdapter();
        __CLR4_4_13dj3djle6rxkhx.R.inc(4465);value = (T) typeAdapter.adaptType(value, typeInfo.getRawClass());
      }
      }__CLR4_4_13dj3djle6rxkhx.R.inc(4466);return new MyParameterizedType<T>(value);
    }finally{__CLR4_4_13dj3djle6rxkhx.R.flushNeeded();}}
  }
}
