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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13jn3jnle6p201d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13jn3jnle6p201d.R.inc(4595);
    __CLR4_4_13jn3jnle6p201d.R.inc(4596);super.setUp();
    __CLR4_4_13jn3jnle6p201d.R.inc(4597);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13jn3jnle6p201d.R.inc(4598);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13jn3jnle6p201d.R.inc(4599);gson = new Gson();
  }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13jn3jnle6p201d.R.inc(4600);
    __CLR4_4_13jn3jnle6p201d.R.inc(4601);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13jn3jnle6p201d.R.inc(4602);super.tearDown();
  }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}

public void testDateSerializationWithPattern21() throws Exception {__CLR4_4_13jn3jnle6p201d.R.globalSliceStart(getClass().getName(),4603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8hrcw3jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jn3jnle6p201d.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jn3jnle6p201d.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8hrcw3jv() throws Exception{try{__CLR4_4_13jn3jnle6p201d.R.inc(4603); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4604);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13jn3jnle6p201d.R.inc(4605);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4606);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4607);Date now = new Date(); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4608);String json = gson.toJson(now); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4609);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
public void testUrlSerialization22() throws Exception {__CLR4_4_13jn3jnle6p201d.R.globalSliceStart(getClass().getName(),4610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1be8el63k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jn3jnle6p201d.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jn3jnle6p201d.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1be8el63k2() throws Exception{try{__CLR4_4_13jn3jnle6p201d.R.inc(4610); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4611);String urlValue = "http://google.com/"; 
     __CLR4_4_13jn3jnle6p201d.R.inc(4612);URL url = new URL(urlValue); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4613);assertEquals("\"http://google.com/\"", gson.toJson(url)); 
 }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
public void testBigDecimalFieldSerialization24() {__CLR4_4_13jn3jnle6p201d.R.globalSliceStart(getClass().getName(),4614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7tltu3k6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jn3jnle6p201d.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jn3jnle6p201d.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7tltu3k6(){try{__CLR4_4_13jn3jnle6p201d.R.inc(4614); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4615);ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4616);String json = gson.toJson(target); 
     __CLR4_4_13jn3jnle6p201d.R.inc(4617);assertEquals("-122.01e-21", json); 
 }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13jn3jnle6p201d.R.inc(4618);
      __CLR4_4_13jn3jnle6p201d.R.inc(4619);assertEquals(year-1900, date.getYear());
      __CLR4_4_13jn3jnle6p201d.R.inc(4620);assertEquals(month, date.getMonth());
      __CLR4_4_13jn3jnle6p201d.R.inc(4621);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13jn3jnle6p201d.R.inc(4622);
    __CLR4_4_13jn3jnle6p201d.R.inc(4623);assertEquals(hours, date.getHours());
    __CLR4_4_13jn3jnle6p201d.R.inc(4624);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13jn3jnle6p201d.R.inc(4625);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13jn3jnle6p201d.R.inc(4626); }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13jn3jnle6p201d.R.inc(4627);
      __CLR4_4_13jn3jnle6p201d.R.inc(4628);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jn3jnle6p201d.R.inc(4629);
      __CLR4_4_13jn3jnle6p201d.R.inc(4630);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13jn3jnle6p201d.R.inc(4631); }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13jn3jnle6p201d.R.inc(4632);
      __CLR4_4_13jn3jnle6p201d.R.inc(4633);this.value = new BigInteger(value);
    }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jn3jnle6p201d.R.inc(4634);
      __CLR4_4_13jn3jnle6p201d.R.inc(4635);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13jn3jnle6p201d.R.flushNeeded();}}
  }

  

  

  

  
}
