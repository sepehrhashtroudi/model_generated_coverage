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

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.UUID;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

/**
 * Functional test for Json serialization and deserialization for common classes for which default
 * support is provided in Gson. The tests for Map types are available in {@link MapTest}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13jp3jpld3n637p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165929950L,8589935092L,4646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13jp3jpld3n637p.R.inc(4597);
    __CLR4_4_13jp3jpld3n637p.R.inc(4598);super.setUp();
    __CLR4_4_13jp3jpld3n637p.R.inc(4599);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13jp3jpld3n637p.R.inc(4600);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13jp3jpld3n637p.R.inc(4601);gson = new Gson();
  }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13jp3jpld3n637p.R.inc(4602);
    __CLR4_4_13jp3jpld3n637p.R.inc(4603);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13jp3jpld3n637p.R.inc(4604);super.tearDown();
  }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}

public void testUuidDeserialization39() {__CLR4_4_13jp3jpld3n637p.R.globalSliceStart(getClass().getName(),4605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xf0x693jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jp3jpld3n637p.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jp3jpld3n637p.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xf0x693jx(){try{__CLR4_4_13jp3jpld3n637p.R.inc(4605); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4606);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13jp3jpld3n637p.R.inc(4607);UUID uuid = gson.fromJson(uuidValue, UUID.class); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4608);assertEquals(uuidValue, uuid.toString()); 
 }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
public void testUuidDeserialization40() {__CLR4_4_13jp3jpld3n637p.R.globalSliceStart(getClass().getName(),4609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy5pqz3k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jp3jpld3n637p.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jp3jpld3n637p.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy5pqz3k1(){try{__CLR4_4_13jp3jpld3n637p.R.inc(4609); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4610);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13jp3jpld3n637p.R.inc(4611);UUID uuid = UUID.fromString(uuidValue); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4612);assertEquals('"' + uuidValue + '"', gson.toJson(uuid)); 
 }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
public void testLocaleDeserializationWithLanguage41() {__CLR4_4_13jp3jpld3n637p.R.globalSliceStart(getClass().getName(),4613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egsuij3k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jp3jpld3n637p.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jp3jpld3n637p.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egsuij3k5(){try{__CLR4_4_13jp3jpld3n637p.R.inc(4613); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4614);String json = "\"en\""; 
     __CLR4_4_13jp3jpld3n637p.R.inc(4615);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4616);assertEquals("en", locale.getLanguage()); 
 }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
public void testBigIntegerFieldDeserialization43() {__CLR4_4_13jp3jpld3n637p.R.globalSliceStart(getClass().getName(),4617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcn57v3k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jp3jpld3n637p.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jp3jpld3n637p.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcn57v3k9(){try{__CLR4_4_13jp3jpld3n637p.R.inc(4617); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4618);ClassWithBigInteger expected = new ClassWithBigInteger("23232323215323234234324324324324324"); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4619);String json = expected.getExpectedJson(); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4620);ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4621);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
public void testPropertiesSerialization47() {__CLR4_4_13jp3jpld3n637p.R.globalSliceStart(getClass().getName(),4622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atj50r3ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jp3jpld3n637p.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jp3jpld3n637p.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atj50r3ke(){try{__CLR4_4_13jp3jpld3n637p.R.inc(4622); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4623);Properties props = new Properties(); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4624);props.setProperty("foo", "bar"); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4625);String json = gson.toJson(props); 
     __CLR4_4_13jp3jpld3n637p.R.inc(4626);String expected = "{\"foo\":\"bar\"}"; 
     __CLR4_4_13jp3jpld3n637p.R.inc(4627);assertEquals(expected, json); 
 }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13jp3jpld3n637p.R.inc(4628);
      __CLR4_4_13jp3jpld3n637p.R.inc(4629);assertEquals(year-1900, date.getYear());
      __CLR4_4_13jp3jpld3n637p.R.inc(4630);assertEquals(month, date.getMonth());
      __CLR4_4_13jp3jpld3n637p.R.inc(4631);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13jp3jpld3n637p.R.inc(4632);
    __CLR4_4_13jp3jpld3n637p.R.inc(4633);assertEquals(hours, date.getHours());
    __CLR4_4_13jp3jpld3n637p.R.inc(4634);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13jp3jpld3n637p.R.inc(4635);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13jp3jpld3n637p.R.inc(4636); }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13jp3jpld3n637p.R.inc(4637);
      __CLR4_4_13jp3jpld3n637p.R.inc(4638);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jp3jpld3n637p.R.inc(4639);
      __CLR4_4_13jp3jpld3n637p.R.inc(4640);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13jp3jpld3n637p.R.inc(4641); }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13jp3jpld3n637p.R.inc(4642);
      __CLR4_4_13jp3jpld3n637p.R.inc(4643);this.value = new BigInteger(value);
    }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jp3jpld3n637p.R.inc(4644);
      __CLR4_4_13jp3jpld3n637p.R.inc(4645);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13jp3jpld3n637p.R.flushNeeded();}}
  }

  

  

  

  
}
