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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13jj3jjle6or9xr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526778980L,8589935092L,4644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4591);
    __CLR4_4_13jj3jjle6or9xr.R.inc(4592);super.setUp();
    __CLR4_4_13jj3jjle6or9xr.R.inc(4593);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13jj3jjle6or9xr.R.inc(4594);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13jj3jjle6or9xr.R.inc(4595);gson = new Gson();
  }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4596);
    __CLR4_4_13jj3jjle6or9xr.R.inc(4597);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13jj3jjle6or9xr.R.inc(4598);super.tearDown();
  }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}

public void testDefaultJavaSqlDateDeserialization33() {__CLR4_4_13jj3jjle6or9xr.R.globalSliceStart(getClass().getName(),4599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bfoa6t3jr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jj3jjle6or9xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jj3jjle6or9xr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bfoa6t3jr(){try{__CLR4_4_13jj3jjle6or9xr.R.inc(4599); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4600);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4601);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4602);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
public void testDefaultJavaSqlDateDeserialization34() {__CLR4_4_13jj3jjle6or9xr.R.globalSliceStart(getClass().getName(),4603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186obec3jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jj3jjle6or9xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jj3jjle6or9xr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186obec3jv(){try{__CLR4_4_13jj3jjle6or9xr.R.inc(4603); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4604);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4605);Date extracted = gson.fromJson(json, Date.class); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4606);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
public void testDefaultCalendarDeserialization35() throws Exception {__CLR4_4_13jj3jjle6or9xr.R.globalSliceStart(getClass().getName(),4607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1f80b3jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jj3jjle6or9xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jj3jjle6or9xr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1f80b3jz() throws Exception{try{__CLR4_4_13jj3jjle6or9xr.R.inc(4607); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4608);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4609);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4610);Calendar cal = gson.fromJson(json, Calendar.class); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4611);assertEquals(2009, cal.get(Calendar.YEAR)); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4612);assertEquals(2, cal.get(Calendar.MONTH)); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4613);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4614);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4615);assertEquals(29, cal.get(Calendar.MINUTE)); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4616);assertEquals(23, cal.get(Calendar.SECOND)); 
 }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
public void testUrlDeserialization40() {__CLR4_4_13jj3jjle6or9xr.R.globalSliceStart(getClass().getName(),4617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6ulw53k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jj3jjle6or9xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jj3jjle6or9xr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6ulw53k9(){try{__CLR4_4_13jj3jjle6or9xr.R.inc(4617); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4618);String urlValue = "http://google.com/"; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4619);String json = '"' + urlValue + '"'; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4620);URL target = gson.fromJson(json, URL.class); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4621);assertEquals(urlValue, target.toExternalForm()); 
 }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
public void testLocaleDeserializationWithLanguageCountry42() {__CLR4_4_13jj3jjle6or9xr.R.globalSliceStart(getClass().getName(),4622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezizei3ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jj3jjle6or9xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jj3jjle6or9xr.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezizei3ke(){try{__CLR4_4_13jj3jjle6or9xr.R.inc(4622); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4623);String json = "\"fr_CA\""; 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4624);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13jj3jjle6or9xr.R.inc(4625);assertEquals(Locale.CANADA_FRENCH, locale); 
 }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4626);
      __CLR4_4_13jj3jjle6or9xr.R.inc(4627);assertEquals(year-1900, date.getYear());
      __CLR4_4_13jj3jjle6or9xr.R.inc(4628);assertEquals(month, date.getMonth());
      __CLR4_4_13jj3jjle6or9xr.R.inc(4629);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4630);
    __CLR4_4_13jj3jjle6or9xr.R.inc(4631);assertEquals(hours, date.getHours());
    __CLR4_4_13jj3jjle6or9xr.R.inc(4632);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13jj3jjle6or9xr.R.inc(4633);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4634); }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4635);
      __CLR4_4_13jj3jjle6or9xr.R.inc(4636);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4637);
      __CLR4_4_13jj3jjle6or9xr.R.inc(4638);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4639); }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4640);
      __CLR4_4_13jj3jjle6or9xr.R.inc(4641);this.value = new BigInteger(value);
    }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13jj3jjle6or9xr.R.inc(4642);
      __CLR4_4_13jj3jjle6or9xr.R.inc(4643);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13jj3jjle6or9xr.R.flushNeeded();}}
  }

  

  

  

  
}
