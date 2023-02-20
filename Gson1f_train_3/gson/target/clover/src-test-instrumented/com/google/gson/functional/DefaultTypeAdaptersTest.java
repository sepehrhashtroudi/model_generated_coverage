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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13x83x8le6rzgwy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5084);
    __CLR4_4_13x83x8le6rzgwy.R.inc(5085);super.setUp();
    __CLR4_4_13x83x8le6rzgwy.R.inc(5086);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13x83x8le6rzgwy.R.inc(5087);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13x83x8le6rzgwy.R.inc(5088);gson = new Gson();
  }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5089);
    __CLR4_4_13x83x8le6rzgwy.R.inc(5090);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13x83x8le6rzgwy.R.inc(5091);super.tearDown();
  }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}


public void testUrlDeserialization73() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rysw233xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization73",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rysw233xg(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5092); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5093);String urlValue = "http://google.com/"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5094);String json = "'http:\\/\\/google.com\\/'"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5095);URL target = gson.fromJson(json, URL.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5096);assertEquals(urlValue, target.toExternalForm()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5097);gson.fromJson('"' + urlValue + '"', URL.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5098);assertEquals(urlValue, target.toExternalForm()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testSetSerialization81() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jgku83xn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization81",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jgku83xn() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5099); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5100);Gson gson = new Gson(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5101);HashSet<String> s = new HashSet<String>(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5102);s.add("blah"); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5103);String json = gson.toJson(s); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5104);assertEquals("[\"blah\"]", json); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5105);json = gson.toJson(s, Set.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5106);assertEquals("[\"blah\"]", json); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultCalendarDeserialization82() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pthqeb3xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pthqeb3xv() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5107); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5108);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5109);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5110);Calendar cal = gson.fromJson(json, Calendar.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5111);assertEquals(2009, cal.get(Calendar.YEAR)); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5112);assertEquals(2, cal.get(Calendar.MONTH)); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5113);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5114);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5115);assertEquals(29, cal.get(Calendar.MINUTE)); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5116);assertEquals(23, cal.get(Calendar.SECOND)); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDateSerializationWithPattern83() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nifhj03y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nifhj03y5() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5117); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5118);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5119);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5120);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5121);Date now = new Date(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5122);String json = gson.toJson(now); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5123);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultJavaSqlTimestampDeserialization84() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ydd4p3yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampDeserialization84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ydd4p3yc(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5124); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5125);String json = "'Dec 3, 2009 1:18:02 PM'"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5126);Timestamp extracted = gson.fromJson(json, Timestamp.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5127);assertEqualsDate(extracted, 2009, 11, 3); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5128);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultJavaSqlDateDeserialization85() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11le25k3yh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11le25k3yh(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5129); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5130);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5131);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5132);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeSerialization86() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3deqz3yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3deqz3yl(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5133); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5134);Time now = new Time(1259875082000L); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5135);String json = gson.toJson(now); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5136);assertEquals("\"01:18:02 PM\"", json); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeDeserialization87() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyxl1n3yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyxl1n3yp(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5137); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5138);String json = "'1:18:02 PM'"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5139);Time extracted = gson.fromJson(json, Time.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5140);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testDefaultCalendarSerialization88() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y23kh63yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarSerialization88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y23kh63yt() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5141); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5142);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5143);String json = gson.toJson(Calendar.getInstance()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5144);assertTrue(json.contains("year")); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5145);assertTrue(json.contains("month")); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5146);assertTrue(json.contains("dayOfMonth")); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5147);assertTrue(json.contains("hourOfDay")); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5148);assertTrue(json.contains("minute")); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5149);assertTrue(json.contains("second")); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testUriSerialization89() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnzxj63z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriSerialization89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnzxj63z2() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5150); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5151);String uriValue = "http://google.com/"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5152);URI uri = new URI(uriValue); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5153);assertEquals("\"http://google.com/\"", gson.toJson(uri)); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testUriDeserialization90() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lmuy53z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriDeserialization90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lmuy53z6(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5154); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5155);String uriValue = "http://google.com/"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5156);String json = '"' + uriValue + '"'; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5157);URI target = gson.fromJson(json, URI.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5158);assertEquals(uriValue, target.toASCIIString()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testUuidSerialization91() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vs6blq3zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidSerialization91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vs6blq3zb() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5159); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5160);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5161);UUID uuid = UUID.fromString(uuidValue); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5162);assertEquals('"' + uuidValue + '"', gson.toJson(uuid)); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testUuidDeserialization92() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx3dem3zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx3dem3zf(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5163); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5164);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5165);String json = '"' + uuidValue + '"'; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5166);UUID target = gson.fromJson(json, UUID.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5167);assertEquals(uuidValue, target.toString()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testLocaleSerializationWithLanguageCountry93() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjosaz3zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountry93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjosaz3zk(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5168); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5169);Locale target = Locale.CANADA_FRENCH; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5170);assertEquals("\"fr_CA\"", gson.toJson(target)); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguage94() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t9gmb3zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t9gmb3zn(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5171); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5172);String json = "\"en\""; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5173);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5174);assertEquals("en", locale.getLanguage()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountry95() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9lajc3zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9lajc3zr(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5175); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5176);String json = "\"fr_CA\""; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5177);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5178);assertEquals(Locale.CANADA_FRENCH, locale); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountryVariant96() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdqk1g3zv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountryVariant96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdqk1g3zv(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5179); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5180);String json = "\"de_DE_EURO\""; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5181);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5182);assertEquals("de", locale.getLanguage()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5183);assertEquals("DE", locale.getCountry()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5184);assertEquals("EURO", locale.getVariant()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testTreeSetDeserialization98() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu9py5401();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetDeserialization98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu9py5401(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5185); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5186);String json = "['Value1']"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5187);Type type = new TypeToken<TreeSet<String>>() { 
     }.getType(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5188);TreeSet<String> treeSet = gson.fromJson(json, type); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5189);assertTrue(treeSet.contains("Value1")); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testPropertiesSerialization101() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aox76406();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aox76406(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5190); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5191);Properties props = new Properties(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5192);props.setProperty("foo", "bar"); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5193);String json = gson.toJson(props); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5194);String expected = "{\"foo\":\"bar\"}"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5195);assertEquals(expected, json); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testBigDecimalFieldDeserialization105() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0mnuj40c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0mnuj40c(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5196); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5197);ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5198);String json = expected.getExpectedJson(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5199);ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5200);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testBadValueForBigDecimalDeserialization106() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9f7lh40h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9f7lh40h(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5201); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5202);try { 
         __CLR4_4_13x83x8le6rzgwy.R.inc(5203);gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class); 
         __CLR4_4_13x83x8le6rzgwy.R.inc(5204);fail("Exponent of a BigDecimal must be an integer value."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testBigIntegerFieldSerialization107() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwbqgp40l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwbqgp40l(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5205); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5206);ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324"); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5207);String json = gson.toJson(target); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5208);assertEquals(target.getExpectedJson(), json); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


public void testBigIntegerFieldDeserialization108() {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq7ds540p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq7ds540p(){try{__CLR4_4_13x83x8le6rzgwy.R.inc(5209); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5210);ClassWithBigInteger expected = new ClassWithBigInteger("879697697697697697697697697697697697"); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5211);String json = expected.getExpectedJson(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5212);ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5213);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateDeserializationWithPattern182() throws Exception {__CLR4_4_13x83x8le6rzgwy.R.globalSliceStart(getClass().getName(),5214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yiuj5j40u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13x83x8le6rzgwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13x83x8le6rzgwy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateDeserializationWithPattern182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yiuj5j40u() throws Exception{try{__CLR4_4_13x83x8le6rzgwy.R.inc(5214); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5215);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5216);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5217);Date now = new Date(); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5218);String json = gson.toJson(now); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5219);Date extracted = gson.fromJson(json, Date.class); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5220);assertEquals(now.getYear(), extracted.getYear()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5221);assertEquals(now.getMonth(), extracted.getMonth()); 
     __CLR4_4_13x83x8le6rzgwy.R.inc(5222);assertEquals(now.getDay(), extracted.getDay()); 
 }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}} 

  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5223);
      __CLR4_4_13x83x8le6rzgwy.R.inc(5224);assertEquals(year-1900, date.getYear());
      __CLR4_4_13x83x8le6rzgwy.R.inc(5225);assertEquals(month, date.getMonth());
      __CLR4_4_13x83x8le6rzgwy.R.inc(5226);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5227);
    __CLR4_4_13x83x8le6rzgwy.R.inc(5228);assertEquals(hours, date.getHours());
    __CLR4_4_13x83x8le6rzgwy.R.inc(5229);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13x83x8le6rzgwy.R.inc(5230);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5231); }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5232);
      __CLR4_4_13x83x8le6rzgwy.R.inc(5233);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5234);
      __CLR4_4_13x83x8le6rzgwy.R.inc(5235);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5236); }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5237);
      __CLR4_4_13x83x8le6rzgwy.R.inc(5238);this.value = new BigInteger(value);
    }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13x83x8le6rzgwy.R.inc(5239);
      __CLR4_4_13x83x8le6rzgwy.R.inc(5240);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13x83x8le6rzgwy.R.flushNeeded();}}
  }

  

  

  

  
}
