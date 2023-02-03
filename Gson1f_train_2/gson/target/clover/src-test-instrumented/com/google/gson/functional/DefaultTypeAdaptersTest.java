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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13wk3wkld3ms40q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5060);
    __CLR4_4_13wk3wkld3ms40q.R.inc(5061);super.setUp();
    __CLR4_4_13wk3wkld3ms40q.R.inc(5062);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13wk3wkld3ms40q.R.inc(5063);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13wk3wkld3ms40q.R.inc(5064);gson = new Gson();
  }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5065);
    __CLR4_4_13wk3wkld3ms40q.R.inc(5066);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13wk3wkld3ms40q.R.inc(5067);super.tearDown();
  }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}


public void testUrlDeserialization72() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7suuk3ws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7suuk3ws(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5068); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5069);String urlValue = "http://google.com/"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5070);String json = "'http:\\/\\/google.com\\/'"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5071);URL target = gson.fromJson(json, URL.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5072);assertEquals(urlValue, target.toExternalForm()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5073);gson.fromJson('"' + urlValue + '"', URL.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5074);assertEquals(urlValue, target.toExternalForm()); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultCalendarDeserialization80() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbhstd3wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbhstd3wz() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5075); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5076);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5077);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5078);Calendar cal = gson.fromJson(json, Calendar.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5079);assertEquals(2009, cal.get(Calendar.YEAR)); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5080);assertEquals(2, cal.get(Calendar.MONTH)); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5081);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5082);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5083);assertEquals(29, cal.get(Calendar.MINUTE)); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5084);assertEquals(23, cal.get(Calendar.SECOND)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDateSerializationWithPattern81() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0fjy23x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern81",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0fjy23x9() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5085); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5086);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5087);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5088);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5089);Date now = new Date(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5090);String json = gson.toJson(now); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5091);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultJavaSqlTimestampDeserialization83() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pdec83xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampDeserialization83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pdec83xg(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5092); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5093);String json = "'Dec 3, 2009 1:18:02 PM'"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5094);Timestamp extracted = gson.fromJson(json, Timestamp.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5095);assertEqualsDate(extracted, 2009, 11, 3); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5096);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultJavaSqlDateSerialization84() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197h0oo3xl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateSerialization84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197h0oo3xl(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5097); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5098);java.sql.Date instant = new java.sql.Date(1259875082000L); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5099);String json = gson.toJson(instant); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5100);assertEquals("\"Dec 3, 2009\"", json); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultJavaSqlDateDeserialization85() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11le25k3xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11le25k3xp(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5101); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5102);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5103);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5104);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeSerialization86() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3deqz3xt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3deqz3xt(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5105); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5106);Time now = new Time(1259875082000L); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5107);String json = gson.toJson(now); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5108);assertEquals("\"01:18:02 PM\"", json); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeDeserialization87() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyxl1n3xx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyxl1n3xx(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5109); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5110);String json = "'1:18:02 PM'"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5111);Time extracted = gson.fromJson(json, Time.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5112);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testDefaultCalendarSerialization88() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y23kh63y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarSerialization88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y23kh63y1() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5113); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5114);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5115);String json = gson.toJson(Calendar.getInstance()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5116);assertTrue(json.contains("year")); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5117);assertTrue(json.contains("month")); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5118);assertTrue(json.contains("dayOfMonth")); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5119);assertTrue(json.contains("hourOfDay")); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5120);assertTrue(json.contains("minute")); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5121);assertTrue(json.contains("second")); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testUrlSerialization89() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mykjp3ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mykjp3ya() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5122); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5123);String urlValue = "http://google.com/"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5124);URL url = new URL(urlValue); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5125);assertEquals("\"http://google.com/\"", gson.toJson(url)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testUriSerialization90() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w74q3w3ye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriSerialization90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w74q3w3ye() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5126); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5127);String uriValue = "http://google.com/"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5128);URI uri = new URI(uriValue); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5129);assertEquals("\"http://google.com/\"", gson.toJson(uri)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testUriDeserialization91() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nd3uc3yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriDeserialization91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nd3uc3yi(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5130); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5131);String uriValue = "http://google.com/"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5132);String json = '"' + uriValue + '"'; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5133);URI target = gson.fromJson(json, URI.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5134);assertEquals(uriValue, target.toASCIIString()); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testUuidSerialization92() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sj6ct93yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidSerialization92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sj6ct93yn() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5135); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5136);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5137);UUID uuid = UUID.fromString(uuidValue); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5138);assertEquals('"' + uuidValue + '"', gson.toJson(uuid)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testLocaleSerializationWithLanguageCountry93() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjosaz3yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountry93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjosaz3yr(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5139); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5140);Locale target = Locale.CANADA_FRENCH; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5141);assertEquals("\"fr_CA\"", gson.toJson(target)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguage94() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t9gmb3yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t9gmb3yu(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5142); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5143);String json = "\"en\""; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5144);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5145);assertEquals("en", locale.getLanguage()); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountryVariant95() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4ql8z3yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountryVariant95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4ql8z3yy(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5146); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5147);String json = "\"de_DE_EURO\""; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5148);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5149);assertEquals("de", locale.getLanguage()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5150);assertEquals("DE", locale.getCountry()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5151);assertEquals("EURO", locale.getVariant()); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testTreeSetDeserialization97() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k39oqm3z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetDeserialization97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k39oqm3z4(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5152); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5153);String json = "['Value1']"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5154);Type type = new TypeToken<TreeSet<String>>() { 
     }.getType(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5155);TreeSet<String> treeSet = gson.fromJson(json, type); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5156);assertTrue(treeSet.contains("Value1")); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testPropertiesDeserialization99() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxaw7l3z9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesDeserialization99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxaw7l3z9(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5157); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5158);String json = "{foo:'bar'}"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5159);Properties props = gson.fromJson(json, Properties.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5160);assertEquals("bar", props.getProperty("foo")); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testPropertiesSerialization100() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jovzn3zd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jovzn3zd(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5161); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5162);Properties props = new Properties(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5163);props.setProperty("foo", "bar"); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5164);String json = gson.toJson(props); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5165);String expected = "{\"foo\":\"bar\"}"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5166);assertEquals(expected, json); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testBigDecimalFieldSerialization104() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4srpf3zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4srpf3zj(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5167); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5168);ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5169);String json = gson.toJson(target); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5170);String actual = json.substring(json.indexOf(':') + 1, json.indexOf('}')); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5171);assertEquals(target.value, new BigDecimal(actual)); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testBigDecimalFieldDeserialization105() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0mnuj3zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0mnuj3zo(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5172); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5173);ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5174);String json = expected.getExpectedJson(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5175);ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5176);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testBadValueForBigDecimalDeserialization106() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9f7lh3zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9f7lh3zt(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5177); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5178);try { 
         __CLR4_4_13wk3wkld3ms40q.R.inc(5179);gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class); 
         __CLR4_4_13wk3wkld3ms40q.R.inc(5180);fail("Exponent of a BigDecimal must be an integer value."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


public void testBigIntegerFieldSerialization107() {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwbqgp3zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwbqgp3zx(){try{__CLR4_4_13wk3wkld3ms40q.R.inc(5181); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5182);ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324"); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5183);String json = gson.toJson(target); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5184);assertEquals(target.getExpectedJson(), json); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateDeserializationWithPattern187() throws Exception {__CLR4_4_13wk3wkld3ms40q.R.globalSliceStart(getClass().getName(),5185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k99ov8401();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13wk3wkld3ms40q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13wk3wkld3ms40q.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateDeserializationWithPattern187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k99ov8401() throws Exception{try{__CLR4_4_13wk3wkld3ms40q.R.inc(5185); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5186);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5187);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5188);Date now = new Date(); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5189);String json = gson.toJson(now); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5190);Date extracted = gson.fromJson(json, Date.class); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5191);assertEquals(now.getYear(), extracted.getYear()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5192);assertEquals(now.getMonth(), extracted.getMonth()); 
     __CLR4_4_13wk3wkld3ms40q.R.inc(5193);assertEquals(now.getDay(), extracted.getDay()); 
 }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}} 

  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5194);
      __CLR4_4_13wk3wkld3ms40q.R.inc(5195);assertEquals(year-1900, date.getYear());
      __CLR4_4_13wk3wkld3ms40q.R.inc(5196);assertEquals(month, date.getMonth());
      __CLR4_4_13wk3wkld3ms40q.R.inc(5197);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5198);
    __CLR4_4_13wk3wkld3ms40q.R.inc(5199);assertEquals(hours, date.getHours());
    __CLR4_4_13wk3wkld3ms40q.R.inc(5200);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13wk3wkld3ms40q.R.inc(5201);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5202); }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5203);
      __CLR4_4_13wk3wkld3ms40q.R.inc(5204);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5205);
      __CLR4_4_13wk3wkld3ms40q.R.inc(5206);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5207); }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5208);
      __CLR4_4_13wk3wkld3ms40q.R.inc(5209);this.value = new BigInteger(value);
    }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13wk3wkld3ms40q.R.inc(5210);
      __CLR4_4_13wk3wkld3ms40q.R.inc(5211);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13wk3wkld3ms40q.R.flushNeeded();}}
  }

  

  

  

  
}
