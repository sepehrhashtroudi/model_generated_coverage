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

package com.google.gson.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

/**
 * Types used for testing JSON serialization and deserialization
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TestTypes {static class __CLR4_4_13aa3aaldqypcst{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675576026699L,8589935092L,4476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  public static class Base {
    public static final String BASE_NAME = Base.class.getSimpleName();
    public static final String BASE_FIELD_KEY = "baseName";
    public static final String SERIALIZER_KEY = "serializerName";
    public String baseName = BASE_NAME;
    public String serializerName;
  }

  public static class Sub extends Base {
    public static final String SUB_NAME = Sub.class.getSimpleName();
    public static final String SUB_FIELD_KEY = "subName";
    public final String subName = SUB_NAME;
  }

  public static class ClassWithBaseField {
    public static final String FIELD_KEY = "base";
    public final Base base;
    @SuppressWarnings("unused")
    private ClassWithBaseField() {
      this(null);__CLR4_4_13aa3aaldqypcst.R.inc(4259);try{__CLR4_4_13aa3aaldqypcst.R.inc(4258);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    public ClassWithBaseField(Base base) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4260);
      __CLR4_4_13aa3aaldqypcst.R.inc(4261);this.base = base;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithBaseArrayField {
    public static final String FIELD_KEY = "base";
    public final Base[] base;
    @SuppressWarnings("unused")
    private ClassWithBaseArrayField() {
      this(null);__CLR4_4_13aa3aaldqypcst.R.inc(4263);try{__CLR4_4_13aa3aaldqypcst.R.inc(4262);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    public ClassWithBaseArrayField(Base[] base) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4264);
      __CLR4_4_13aa3aaldqypcst.R.inc(4265);this.base = base;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class BaseSerializer implements JsonSerializer<Base> {
    public static final String NAME = BaseSerializer.class.getSimpleName(); 
    public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4266);
      __CLR4_4_13aa3aaldqypcst.R.inc(4267);JsonObject obj = new JsonObject();
      __CLR4_4_13aa3aaldqypcst.R.inc(4268);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_13aa3aaldqypcst.R.inc(4269);return obj;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}    
  }
  public static class SubSerializer implements JsonSerializer<Sub> {
    public static final String NAME = SubSerializer.class.getSimpleName(); 
    public JsonElement serialize(Sub src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4270);
      __CLR4_4_13aa3aaldqypcst.R.inc(4271);JsonObject obj = new JsonObject();
      __CLR4_4_13aa3aaldqypcst.R.inc(4272);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_13aa3aaldqypcst.R.inc(4273);return obj;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}    
  }

  public static class StringWrapper {
    public final String someConstantStringInstanceField;

    StringWrapper() {
      this("Blah");__CLR4_4_13aa3aaldqypcst.R.inc(4275);try{__CLR4_4_13aa3aaldqypcst.R.inc(4274);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public StringWrapper(String value) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4276);
      __CLR4_4_13aa3aaldqypcst.R.inc(4277);someConstantStringInstanceField = value;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class BagOfPrimitives {
    public static final long DEFAULT_VALUE = 0;
    public long longValue;
    public int intValue;
    public boolean booleanValue;
    public String stringValue;

    public BagOfPrimitives() {
      this(DEFAULT_VALUE, 0, false, "");__CLR4_4_13aa3aaldqypcst.R.inc(4279);try{__CLR4_4_13aa3aaldqypcst.R.inc(4278);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public BagOfPrimitives(long longValue, int intValue, boolean booleanValue, String stringValue) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4280);
      __CLR4_4_13aa3aaldqypcst.R.inc(4281);this.longValue = longValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4282);this.intValue = intValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4283);this.booleanValue = booleanValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4284);this.stringValue = stringValue;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public int getIntValue() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4285);
      __CLR4_4_13aa3aaldqypcst.R.inc(4286);return intValue;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4287);
      __CLR4_4_13aa3aaldqypcst.R.inc(4288);StringBuilder sb = new StringBuilder();
      __CLR4_4_13aa3aaldqypcst.R.inc(4289);sb.append("{");
      __CLR4_4_13aa3aaldqypcst.R.inc(4290);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_13aa3aaldqypcst.R.inc(4291);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_13aa3aaldqypcst.R.inc(4292);sb.append("\"booleanValue\":").append(booleanValue).append(",");
      __CLR4_4_13aa3aaldqypcst.R.inc(4293);sb.append("\"stringValue\":\"").append(stringValue).append("\"");
      __CLR4_4_13aa3aaldqypcst.R.inc(4294);sb.append("}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4295);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4296);
      __CLR4_4_13aa3aaldqypcst.R.inc(4297);final int prime = 31;
      __CLR4_4_13aa3aaldqypcst.R.inc(4298);int result = 1;
      __CLR4_4_13aa3aaldqypcst.R.inc(4299);result = prime * result + ((((booleanValue )&&(__CLR4_4_13aa3aaldqypcst.R.iget(4300)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4301)==0&false))? 1231 : 1237);
      __CLR4_4_13aa3aaldqypcst.R.inc(4302);result = prime * result + intValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4303);result = prime * result + (int) (longValue ^ (longValue >>> 32));
      __CLR4_4_13aa3aaldqypcst.R.inc(4304);result = prime * result + (((((stringValue == null) )&&(__CLR4_4_13aa3aaldqypcst.R.iget(4305)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4306)==0&false))? 0 : stringValue.hashCode());
      __CLR4_4_13aa3aaldqypcst.R.inc(4307);return result;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4308);
      __CLR4_4_13aa3aaldqypcst.R.inc(4309);if ((((this == obj)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4310)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4311)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4312);return true;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4313);if ((((obj == null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4314)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4315)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4316);return false;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4317);if ((((getClass() != obj.getClass())&&(__CLR4_4_13aa3aaldqypcst.R.iget(4318)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4319)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4320);return false;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4321);BagOfPrimitives other = (BagOfPrimitives) obj;
      __CLR4_4_13aa3aaldqypcst.R.inc(4322);if ((((booleanValue != other.booleanValue)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4323)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4324)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4325);return false;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4326);if ((((intValue != other.intValue)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4327)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4328)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4329);return false;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4330);if ((((longValue != other.longValue)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4331)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4332)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4333);return false;
      }__CLR4_4_13aa3aaldqypcst.R.inc(4334);if ((((stringValue == null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4335)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4336)==0&false))) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4337);if ((((other.stringValue != null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4338)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4339)==0&false)))
          {__CLR4_4_13aa3aaldqypcst.R.inc(4340);return false;
      }} }else {__CLR4_4_13aa3aaldqypcst.R.inc(4341);if ((((!stringValue.equals(other.stringValue))&&(__CLR4_4_13aa3aaldqypcst.R.iget(4342)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4343)==0&false)))
        {__CLR4_4_13aa3aaldqypcst.R.inc(4344);return false;
      }}__CLR4_4_13aa3aaldqypcst.R.inc(4345);return true;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4346);
      __CLR4_4_13aa3aaldqypcst.R.inc(4347);return String.format("(longValue=%d,intValue=%d,booleanValue=%b,stringValue=%s)",
          longValue, intValue, booleanValue, stringValue);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class BagOfPrimitiveWrappers {
    private final Long longValue;
    private final Integer intValue;
    private final Boolean booleanValue;

    public BagOfPrimitiveWrappers() {
      this(0L, 0, false);__CLR4_4_13aa3aaldqypcst.R.inc(4349);try{__CLR4_4_13aa3aaldqypcst.R.inc(4348);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public BagOfPrimitiveWrappers(Long longValue, Integer intValue, Boolean booleanValue) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4350);
      __CLR4_4_13aa3aaldqypcst.R.inc(4351);this.longValue = longValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4352);this.intValue = intValue;
      __CLR4_4_13aa3aaldqypcst.R.inc(4353);this.booleanValue = booleanValue;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4354);
      __CLR4_4_13aa3aaldqypcst.R.inc(4355);StringBuilder sb = new StringBuilder();
      __CLR4_4_13aa3aaldqypcst.R.inc(4356);sb.append("{");
      __CLR4_4_13aa3aaldqypcst.R.inc(4357);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_13aa3aaldqypcst.R.inc(4358);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_13aa3aaldqypcst.R.inc(4359);sb.append("\"booleanValue\":").append(booleanValue);
      __CLR4_4_13aa3aaldqypcst.R.inc(4360);sb.append("}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4361);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class PrimitiveArray {
    private final long[] longArray;

    public PrimitiveArray() {
      this(new long[0]);__CLR4_4_13aa3aaldqypcst.R.inc(4363);try{__CLR4_4_13aa3aaldqypcst.R.inc(4362);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public PrimitiveArray(long[] longArray) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4364);
      __CLR4_4_13aa3aaldqypcst.R.inc(4365);this.longArray = longArray;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4366);
      __CLR4_4_13aa3aaldqypcst.R.inc(4367);StringBuilder sb = new StringBuilder();
      __CLR4_4_13aa3aaldqypcst.R.inc(4368);sb.append("{\"longArray\":[");

      __CLR4_4_13aa3aaldqypcst.R.inc(4369);boolean first = true;
      __CLR4_4_13aa3aaldqypcst.R.inc(4370);for (long l : longArray) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4371);if ((((!first)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4372)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4373)==0&false))) {{
          __CLR4_4_13aa3aaldqypcst.R.inc(4374);sb.append(",");
        } }else {{
          __CLR4_4_13aa3aaldqypcst.R.inc(4375);first = false;
        }
        }__CLR4_4_13aa3aaldqypcst.R.inc(4376);sb.append(l);
      }

      }__CLR4_4_13aa3aaldqypcst.R.inc(4377);sb.append("]}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4378);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithNoFields {
    // Nothing here.. .
    @Override
    public boolean equals(Object other) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4379);
      __CLR4_4_13aa3aaldqypcst.R.inc(4380);return other.getClass() == ClassWithNoFields.class;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class Nested {
    private final BagOfPrimitives primitive1;
    private final BagOfPrimitives primitive2;

    public Nested() {
      this(null, null);__CLR4_4_13aa3aaldqypcst.R.inc(4382);try{__CLR4_4_13aa3aaldqypcst.R.inc(4381);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public Nested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4383);
      __CLR4_4_13aa3aaldqypcst.R.inc(4384);this.primitive1 = primitive1;
      __CLR4_4_13aa3aaldqypcst.R.inc(4385);this.primitive2 = primitive2;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4386);
      __CLR4_4_13aa3aaldqypcst.R.inc(4387);StringBuilder sb = new StringBuilder();
      __CLR4_4_13aa3aaldqypcst.R.inc(4388);sb.append("{");
      __CLR4_4_13aa3aaldqypcst.R.inc(4389);appendFields(sb);
      __CLR4_4_13aa3aaldqypcst.R.inc(4390);sb.append("}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4391);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public void appendFields(StringBuilder sb) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4392);
      __CLR4_4_13aa3aaldqypcst.R.inc(4393);if ((((primitive1 != null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4394)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4395)==0&false))) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4396);sb.append("\"primitive1\":").append(primitive1.getExpectedJson());
      }
      }__CLR4_4_13aa3aaldqypcst.R.inc(4397);if ((((primitive1 != null && primitive2 != null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4398)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4399)==0&false))) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4400);sb.append(",");
      }
      }__CLR4_4_13aa3aaldqypcst.R.inc(4401);if ((((primitive2 != null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4402)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4403)==0&false))) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4404);sb.append("\"primitive2\":").append(primitive2.getExpectedJson());
      }
    }}finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithTransientFields<T> {
    public transient T transientT; 
    public final transient long transientLongValue;
    private final long[] longValue;

    public ClassWithTransientFields() {
      this(0L);__CLR4_4_13aa3aaldqypcst.R.inc(4406);try{__CLR4_4_13aa3aaldqypcst.R.inc(4405);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public ClassWithTransientFields(long value) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4407);
      __CLR4_4_13aa3aaldqypcst.R.inc(4408);longValue = new long[] { value };
      __CLR4_4_13aa3aaldqypcst.R.inc(4409);transientLongValue = value + 1;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4410);
      __CLR4_4_13aa3aaldqypcst.R.inc(4411);StringBuilder sb = new StringBuilder();
      __CLR4_4_13aa3aaldqypcst.R.inc(4412);sb.append("{");
      __CLR4_4_13aa3aaldqypcst.R.inc(4413);sb.append("\"longValue\":[").append(longValue[0]).append("]");
      __CLR4_4_13aa3aaldqypcst.R.inc(4414);sb.append("}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4415);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithCustomTypeConverter {
    private final BagOfPrimitives bag;
    private final int value;

    public ClassWithCustomTypeConverter() {
      this(new BagOfPrimitives(), 10);__CLR4_4_13aa3aaldqypcst.R.inc(4417);try{__CLR4_4_13aa3aaldqypcst.R.inc(4416);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(int value) {
      this(new BagOfPrimitives(value, value, false, ""), value);__CLR4_4_13aa3aaldqypcst.R.inc(4419);try{__CLR4_4_13aa3aaldqypcst.R.inc(4418);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(BagOfPrimitives bag, int value) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4420);
      __CLR4_4_13aa3aaldqypcst.R.inc(4421);this.bag = bag;
      __CLR4_4_13aa3aaldqypcst.R.inc(4422);this.value = value;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public BagOfPrimitives getBag() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4423);
      __CLR4_4_13aa3aaldqypcst.R.inc(4424);return bag;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4425);
      __CLR4_4_13aa3aaldqypcst.R.inc(4426);return "{\"url\":\"" + bag.getExpectedJson() + "\",\"value\":" + value + "}";
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public int getValue() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4427);
      __CLR4_4_13aa3aaldqypcst.R.inc(4428);return value;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ArrayOfObjects {
    private final BagOfPrimitives[] elements;
    public ArrayOfObjects() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4429);
      __CLR4_4_13aa3aaldqypcst.R.inc(4430);elements = new BagOfPrimitives[3];
      __CLR4_4_13aa3aaldqypcst.R.inc(4431);for (int i = 0; (((i < elements.length)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4432)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4433)==0&false)); ++i) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4434);elements[i] = new BagOfPrimitives(i, i+2, false, "i"+i);
      }
    }}finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4435);
      __CLR4_4_13aa3aaldqypcst.R.inc(4436);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_13aa3aaldqypcst.R.inc(4437);boolean first = true;
      __CLR4_4_13aa3aaldqypcst.R.inc(4438);for (BagOfPrimitives element : elements) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4439);if ((((first)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4440)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4441)==0&false))) {{
          __CLR4_4_13aa3aaldqypcst.R.inc(4442);first = false;
        } }else {{
          __CLR4_4_13aa3aaldqypcst.R.inc(4443);sb.append(",");
        }
        }__CLR4_4_13aa3aaldqypcst.R.inc(4444);sb.append(element.getExpectedJson());
      }
      }__CLR4_4_13aa3aaldqypcst.R.inc(4445);sb.append("]}");
      __CLR4_4_13aa3aaldqypcst.R.inc(4446);return sb.toString();
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassOverridingEquals {
    public ClassOverridingEquals ref;

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4447);
      __CLR4_4_13aa3aaldqypcst.R.inc(4448);if ((((ref == null)&&(__CLR4_4_13aa3aaldqypcst.R.iget(4449)!=0|true))||(__CLR4_4_13aa3aaldqypcst.R.iget(4450)==0&false))) {{
        __CLR4_4_13aa3aaldqypcst.R.inc(4451);return "{}";
      }
      }__CLR4_4_13aa3aaldqypcst.R.inc(4452);return "{\"ref\":" + ref.getExpectedJson() + "}";
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4453);
      __CLR4_4_13aa3aaldqypcst.R.inc(4454);return true;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4455);
      __CLR4_4_13aa3aaldqypcst.R.inc(4456);return 1;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithArray {
    public final Object[] array;
    public ClassWithArray() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4457);
      __CLR4_4_13aa3aaldqypcst.R.inc(4458);array = null;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public ClassWithArray(Object[] array) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4459);
      __CLR4_4_13aa3aaldqypcst.R.inc(4460);this.array = array;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithObjects {
    public final BagOfPrimitives bag;
    public ClassWithObjects() {
      this(new BagOfPrimitives());__CLR4_4_13aa3aaldqypcst.R.inc(4462);try{__CLR4_4_13aa3aaldqypcst.R.inc(4461);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    public ClassWithObjects(BagOfPrimitives bag) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4463);
      __CLR4_4_13aa3aaldqypcst.R.inc(4464);this.bag = bag;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }

  public static class ClassWithSerializedNameFields {
    @SerializedName("fooBar") public final int f;
    @SerializedName("Another Foo") public final int g;

    public ClassWithSerializedNameFields() {
      this(1, 4);__CLR4_4_13aa3aaldqypcst.R.inc(4466);try{__CLR4_4_13aa3aaldqypcst.R.inc(4465);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    public ClassWithSerializedNameFields(int f, int g) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4467);
      __CLR4_4_13aa3aaldqypcst.R.inc(4468);this.f = f;
      __CLR4_4_13aa3aaldqypcst.R.inc(4469);this.g = g;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13aa3aaldqypcst.R.inc(4470);
      __CLR4_4_13aa3aaldqypcst.R.inc(4471);return '{' + "\"fooBar\":" + f + ",\"Another Foo\":" + g + '}';
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
  }
  
  public static class CrazyLongTypeAdapter
      implements JsonSerializer<Long>, JsonDeserializer<Long> {
    public static final long DIFFERENCE = 5L;
    public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13aa3aaldqypcst.R.inc(4472);
      __CLR4_4_13aa3aaldqypcst.R.inc(4473);return new JsonPrimitive(src + DIFFERENCE);
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
    
    public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13aa3aaldqypcst.R.inc(4474);
      __CLR4_4_13aa3aaldqypcst.R.inc(4475);return json.getAsLong() - DIFFERENCE;
    }finally{__CLR4_4_13aa3aaldqypcst.R.flushNeeded();}}
}
}
