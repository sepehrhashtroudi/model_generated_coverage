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
public class TestTypes {static class __CLR4_4_13kg3kgle6rzgv5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,4842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
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
      this(null);__CLR4_4_13kg3kgle6rzgv5.R.inc(4625);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4624);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    public ClassWithBaseField(Base base) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4626);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4627);this.base = base;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithBaseArrayField {
    public static final String FIELD_KEY = "base";
    public final Base[] base;
    @SuppressWarnings("unused")
    private ClassWithBaseArrayField() {
      this(null);__CLR4_4_13kg3kgle6rzgv5.R.inc(4629);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4628);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    public ClassWithBaseArrayField(Base[] base) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4630);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4631);this.base = base;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class BaseSerializer implements JsonSerializer<Base> {
    public static final String NAME = BaseSerializer.class.getSimpleName(); 
    public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4632);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4633);JsonObject obj = new JsonObject();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4634);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4635);return obj;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}    
  }
  public static class SubSerializer implements JsonSerializer<Sub> {
    public static final String NAME = SubSerializer.class.getSimpleName(); 
    public JsonElement serialize(Sub src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4636);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4637);JsonObject obj = new JsonObject();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4638);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4639);return obj;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}    
  }

  public static class StringWrapper {
    public final String someConstantStringInstanceField;

    StringWrapper() {
      this("Blah");__CLR4_4_13kg3kgle6rzgv5.R.inc(4641);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4640);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public StringWrapper(String value) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4642);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4643);someConstantStringInstanceField = value;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class BagOfPrimitives {
    public static final long DEFAULT_VALUE = 0;
    public long longValue;
    public int intValue;
    public boolean booleanValue;
    public String stringValue;

    public BagOfPrimitives() {
      this(DEFAULT_VALUE, 0, false, "");__CLR4_4_13kg3kgle6rzgv5.R.inc(4645);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4644);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public BagOfPrimitives(long longValue, int intValue, boolean booleanValue, String stringValue) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4646);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4647);this.longValue = longValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4648);this.intValue = intValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4649);this.booleanValue = booleanValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4650);this.stringValue = stringValue;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public int getIntValue() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4651);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4652);return intValue;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4653);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4654);StringBuilder sb = new StringBuilder();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4655);sb.append("{");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4656);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4657);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4658);sb.append("\"booleanValue\":").append(booleanValue).append(",");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4659);sb.append("\"stringValue\":\"").append(stringValue).append("\"");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4660);sb.append("}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4661);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4662);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4663);final int prime = 31;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4664);int result = 1;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4665);result = prime * result + ((((booleanValue )&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4666)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4667)==0&false))? 1231 : 1237);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4668);result = prime * result + intValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4669);result = prime * result + (int) (longValue ^ (longValue >>> 32));
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4670);result = prime * result + (((((stringValue == null) )&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4671)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4672)==0&false))? 0 : stringValue.hashCode());
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4673);return result;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4674);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4675);if ((((this == obj)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4676)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4677)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4678);return true;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4679);if ((((obj == null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4680)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4681)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4682);return false;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4683);if ((((getClass() != obj.getClass())&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4684)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4685)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4686);return false;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4687);BagOfPrimitives other = (BagOfPrimitives) obj;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4688);if ((((booleanValue != other.booleanValue)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4689)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4690)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4691);return false;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4692);if ((((intValue != other.intValue)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4693)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4694)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4695);return false;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4696);if ((((longValue != other.longValue)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4697)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4698)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4699);return false;
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4700);if ((((stringValue == null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4701)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4702)==0&false))) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4703);if ((((other.stringValue != null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4704)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4705)==0&false)))
          {__CLR4_4_13kg3kgle6rzgv5.R.inc(4706);return false;
      }} }else {__CLR4_4_13kg3kgle6rzgv5.R.inc(4707);if ((((!stringValue.equals(other.stringValue))&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4708)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4709)==0&false)))
        {__CLR4_4_13kg3kgle6rzgv5.R.inc(4710);return false;
      }}__CLR4_4_13kg3kgle6rzgv5.R.inc(4711);return true;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4712);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4713);return String.format("(longValue=%d,intValue=%d,booleanValue=%b,stringValue=%s)",
          longValue, intValue, booleanValue, stringValue);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class BagOfPrimitiveWrappers {
    private final Long longValue;
    private final Integer intValue;
    private final Boolean booleanValue;

    public BagOfPrimitiveWrappers() {
      this(0L, 0, false);__CLR4_4_13kg3kgle6rzgv5.R.inc(4715);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4714);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public BagOfPrimitiveWrappers(Long longValue, Integer intValue, Boolean booleanValue) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4716);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4717);this.longValue = longValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4718);this.intValue = intValue;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4719);this.booleanValue = booleanValue;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4720);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4721);StringBuilder sb = new StringBuilder();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4722);sb.append("{");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4723);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4724);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4725);sb.append("\"booleanValue\":").append(booleanValue);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4726);sb.append("}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4727);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class PrimitiveArray {
    private final long[] longArray;

    public PrimitiveArray() {
      this(new long[0]);__CLR4_4_13kg3kgle6rzgv5.R.inc(4729);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4728);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public PrimitiveArray(long[] longArray) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4730);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4731);this.longArray = longArray;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4732);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4733);StringBuilder sb = new StringBuilder();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4734);sb.append("{\"longArray\":[");

      __CLR4_4_13kg3kgle6rzgv5.R.inc(4735);boolean first = true;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4736);for (long l : longArray) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4737);if ((((!first)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4738)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4739)==0&false))) {{
          __CLR4_4_13kg3kgle6rzgv5.R.inc(4740);sb.append(",");
        } }else {{
          __CLR4_4_13kg3kgle6rzgv5.R.inc(4741);first = false;
        }
        }__CLR4_4_13kg3kgle6rzgv5.R.inc(4742);sb.append(l);
      }

      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4743);sb.append("]}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4744);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithNoFields {
    // Nothing here.. .
    @Override
    public boolean equals(Object other) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4745);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4746);return other.getClass() == ClassWithNoFields.class;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class Nested {
    private final BagOfPrimitives primitive1;
    private final BagOfPrimitives primitive2;

    public Nested() {
      this(null, null);__CLR4_4_13kg3kgle6rzgv5.R.inc(4748);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4747);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public Nested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4749);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4750);this.primitive1 = primitive1;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4751);this.primitive2 = primitive2;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4752);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4753);StringBuilder sb = new StringBuilder();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4754);sb.append("{");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4755);appendFields(sb);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4756);sb.append("}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4757);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public void appendFields(StringBuilder sb) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4758);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4759);if ((((primitive1 != null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4760)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4761)==0&false))) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4762);sb.append("\"primitive1\":").append(primitive1.getExpectedJson());
      }
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4763);if ((((primitive1 != null && primitive2 != null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4764)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4765)==0&false))) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4766);sb.append(",");
      }
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4767);if ((((primitive2 != null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4768)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4769)==0&false))) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4770);sb.append("\"primitive2\":").append(primitive2.getExpectedJson());
      }
    }}finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithTransientFields<T> {
    public transient T transientT; 
    public final transient long transientLongValue;
    private final long[] longValue;

    public ClassWithTransientFields() {
      this(0L);__CLR4_4_13kg3kgle6rzgv5.R.inc(4772);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4771);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public ClassWithTransientFields(long value) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4773);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4774);longValue = new long[] { value };
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4775);transientLongValue = value + 1;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4776);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4777);StringBuilder sb = new StringBuilder();
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4778);sb.append("{");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4779);sb.append("\"longValue\":[").append(longValue[0]).append("]");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4780);sb.append("}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4781);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithCustomTypeConverter {
    private final BagOfPrimitives bag;
    private final int value;

    public ClassWithCustomTypeConverter() {
      this(new BagOfPrimitives(), 10);__CLR4_4_13kg3kgle6rzgv5.R.inc(4783);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4782);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(int value) {
      this(new BagOfPrimitives(value, value, false, ""), value);__CLR4_4_13kg3kgle6rzgv5.R.inc(4785);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4784);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(BagOfPrimitives bag, int value) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4786);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4787);this.bag = bag;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4788);this.value = value;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public BagOfPrimitives getBag() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4789);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4790);return bag;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4791);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4792);return "{\"url\":\"" + bag.getExpectedJson() + "\",\"value\":" + value + "}";
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public int getValue() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4793);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4794);return value;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ArrayOfObjects {
    private final BagOfPrimitives[] elements;
    public ArrayOfObjects() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4795);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4796);elements = new BagOfPrimitives[3];
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4797);for (int i = 0; (((i < elements.length)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4798)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4799)==0&false)); ++i) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4800);elements[i] = new BagOfPrimitives(i, i+2, false, "i"+i);
      }
    }}finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4801);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4802);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4803);boolean first = true;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4804);for (BagOfPrimitives element : elements) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4805);if ((((first)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4806)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4807)==0&false))) {{
          __CLR4_4_13kg3kgle6rzgv5.R.inc(4808);first = false;
        } }else {{
          __CLR4_4_13kg3kgle6rzgv5.R.inc(4809);sb.append(",");
        }
        }__CLR4_4_13kg3kgle6rzgv5.R.inc(4810);sb.append(element.getExpectedJson());
      }
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4811);sb.append("]}");
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4812);return sb.toString();
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassOverridingEquals {
    public ClassOverridingEquals ref;

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4813);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4814);if ((((ref == null)&&(__CLR4_4_13kg3kgle6rzgv5.R.iget(4815)!=0|true))||(__CLR4_4_13kg3kgle6rzgv5.R.iget(4816)==0&false))) {{
        __CLR4_4_13kg3kgle6rzgv5.R.inc(4817);return "{}";
      }
      }__CLR4_4_13kg3kgle6rzgv5.R.inc(4818);return "{\"ref\":" + ref.getExpectedJson() + "}";
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4819);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4820);return true;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4821);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4822);return 1;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithArray {
    public final Object[] array;
    public ClassWithArray() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4823);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4824);array = null;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public ClassWithArray(Object[] array) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4825);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4826);this.array = array;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithObjects {
    public final BagOfPrimitives bag;
    public ClassWithObjects() {
      this(new BagOfPrimitives());__CLR4_4_13kg3kgle6rzgv5.R.inc(4828);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4827);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    public ClassWithObjects(BagOfPrimitives bag) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4829);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4830);this.bag = bag;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }

  public static class ClassWithSerializedNameFields {
    @SerializedName("fooBar") public final int f;
    @SerializedName("Another Foo") public final int g;

    public ClassWithSerializedNameFields() {
      this(1, 4);__CLR4_4_13kg3kgle6rzgv5.R.inc(4832);try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4831);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    public ClassWithSerializedNameFields(int f, int g) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4833);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4834);this.f = f;
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4835);this.g = g;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4836);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4837);return '{' + "\"fooBar\":" + f + ",\"Another Foo\":" + g + '}';
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
  }
  
  public static class CrazyLongTypeAdapter
      implements JsonSerializer<Long>, JsonDeserializer<Long> {
    public static final long DIFFERENCE = 5L;
    public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4838);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4839);return new JsonPrimitive(src + DIFFERENCE);
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
    
    public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_13kg3kgle6rzgv5.R.inc(4840);
      __CLR4_4_13kg3kgle6rzgv5.R.inc(4841);return json.getAsLong() - DIFFERENCE;
    }finally{__CLR4_4_13kg3kgle6rzgv5.R.flushNeeded();}}
}
}
