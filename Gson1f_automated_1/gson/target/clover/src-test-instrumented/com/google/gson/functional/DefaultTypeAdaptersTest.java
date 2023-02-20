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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13jt3jtle6ouxih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526949504L,8589935092L,4677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4601);
    __CLR4_4_13jt3jtle6ouxih.R.inc(4602);super.setUp();
    __CLR4_4_13jt3jtle6ouxih.R.inc(4603);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13jt3jtle6ouxih.R.inc(4604);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13jt3jtle6ouxih.R.inc(4605);gson = new Gson();
  }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4606);
    __CLR4_4_13jt3jtle6ouxih.R.inc(4607);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13jt3jtle6ouxih.R.inc(4608);super.tearDown();
  }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}

public void testSetSerialization29() throws Exception {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ph04y3k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ph04y3k1() throws Exception{try{__CLR4_4_13jt3jtle6ouxih.R.inc(4609); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4610);Gson gson = new Gson(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4611);HashSet<String> s = new HashSet<String>(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4612);s.add("blah"); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4613);String json = gson.toJson(s); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4614);assertEquals("[\"blah\"]", json); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4615);json = gson.toJson(s, Set.class); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4616);assertEquals("[\"blah\"]", json); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testDoubleSerialization30() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zd0chb3k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDoubleSerialization30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zd0chb3k9(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4617); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4618);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4619);double value = 1.0; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4620);String json = gson.toJson(value); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4621);assertEquals("1.0", json); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4622);value = 1.7976931348623157E308; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4623);json = gson.toJson(value); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4624);assertEquals("1.7976931348623157E308", json); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testNegativeInfinitySerialization32() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw7yhz3kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testNegativeInfinitySerialization32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw7yhz3kh(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4625); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4626);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4627);double negativeInfinity = Double.NEGATIVE_INFINITY; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4628);assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4629);assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testSetDeserialization33() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls9hmi3km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetDeserialization33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls9hmi3km(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4630); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4631);Gson gson = new Gson(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4632);HashSet<String> s = new HashSet<String>(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4633);s.add("blah"); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4634);String json = gson.toJson(s); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4635);assertEquals("[\"blah\"]", json); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4636);json = gson.toJson(s, Set.class); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4637);assertEquals("[\"blah\"]", json); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testDefaultJavaSqlTimeDeserialization35() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxv8pa3ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxv8pa3ku(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4638); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4639);String json = "'Dec 3, 2009 1:18:02 PM'"; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4640);Time extracted = gson.fromJson(json, Time.class); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4641);assertEqualsDate(extracted, 2009, 11, 3); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4642);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testLocaleSerialization38() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rtqo3kz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerialization38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rtqo3kz(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4643); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4644);Locale locale = new Locale("en"); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4645);String json = gson.toJson(locale); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4646);assertEquals("en", json); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testFloatInfinitySerialization41() {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ijkn23l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testFloatInfinitySerialization41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ijkn23l3(){try{__CLR4_4_13jt3jtle6ouxih.R.inc(4647); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4648);Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4649);float infinity = Float.POSITIVE_INFINITY; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4650);assertEquals("Infinity", gson.toJson(infinity)); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4651);assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY)); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
public void testDateSerializationWithPattern65() throws Exception {__CLR4_4_13jt3jtle6ouxih.R.globalSliceStart(getClass().getName(),4652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfadz43l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jt3jtle6ouxih.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jt3jtle6ouxih.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfadz43l8() throws Exception{try{__CLR4_4_13jt3jtle6ouxih.R.inc(4652); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4653);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4654);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4655);Gson gson = new GsonBuilder().setDateFormat(pattern).create(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4656);Date now = new Date(); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4657);String json = gson.toJson(now); 
     __CLR4_4_13jt3jtle6ouxih.R.inc(4658);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4659);
      __CLR4_4_13jt3jtle6ouxih.R.inc(4660);assertEquals(year-1900, date.getYear());
      __CLR4_4_13jt3jtle6ouxih.R.inc(4661);assertEquals(month, date.getMonth());
      __CLR4_4_13jt3jtle6ouxih.R.inc(4662);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4663);
    __CLR4_4_13jt3jtle6ouxih.R.inc(4664);assertEquals(hours, date.getHours());
    __CLR4_4_13jt3jtle6ouxih.R.inc(4665);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13jt3jtle6ouxih.R.inc(4666);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4667); }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4668);
      __CLR4_4_13jt3jtle6ouxih.R.inc(4669);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4670);
      __CLR4_4_13jt3jtle6ouxih.R.inc(4671);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4672); }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4673);
      __CLR4_4_13jt3jtle6ouxih.R.inc(4674);this.value = new BigInteger(value);
    }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jt3jtle6ouxih.R.inc(4675);
      __CLR4_4_13jt3jtle6ouxih.R.inc(4676);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13jt3jtle6ouxih.R.flushNeeded();}}
  }

  

  

  

  
}
