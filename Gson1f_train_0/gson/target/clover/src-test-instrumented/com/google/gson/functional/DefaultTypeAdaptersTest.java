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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13xb3xble6rvqpp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,5221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5087);
    __CLR4_4_13xb3xble6rvqpp.R.inc(5088);super.setUp();
    __CLR4_4_13xb3xble6rvqpp.R.inc(5089);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13xb3xble6rvqpp.R.inc(5090);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13xb3xble6rvqpp.R.inc(5091);gson = new Gson();
  }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5092);
    __CLR4_4_13xb3xble6rvqpp.R.inc(5093);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13xb3xble6rvqpp.R.inc(5094);super.tearDown();
  }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}


public void testSetSerialization82() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sgjmp3xj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sgjmp3xj() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5095); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5096);Gson gson = new Gson(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5097);HashSet<String> s = new HashSet<String>(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5098);s.add("blah"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5099);String json = gson.toJson(s); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5100);assertEquals("[\"blah\"]", json); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5101);json = gson.toJson(s, Set.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5102);assertEquals("[\"blah\"]", json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDefaultCalendarDeserialization83() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2hp6s3xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2hp6s3xr() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5103); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5104);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5105);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5106);Calendar cal = gson.fromJson(json, Calendar.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5107);assertEquals(2009, cal.get(Calendar.YEAR)); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5108);assertEquals(2, cal.get(Calendar.MONTH)); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5109);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5110);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5111);assertEquals(29, cal.get(Calendar.MINUTE)); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5112);assertEquals(23, cal.get(Calendar.SECOND)); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDateSerializationWithPattern84() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrfgbh3y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrfgbh3y1() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5113); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5114);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5115);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5116);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5117);Date now = new Date(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5118);String json = gson.toJson(now); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5119);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDefaultJavaSqlDateSerialization86() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ph33q3y8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateSerialization86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ph33q3y8(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5120); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5121);java.sql.Date instant = new java.sql.Date(1259875082000L); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5122);String json = gson.toJson(instant); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5123);assertEquals("\"Dec 3, 2009\"", json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDefaultJavaSqlDateDeserialization87() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183dzqi3yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183dzqi3yc(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5124); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5125);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5126);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5127);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeSerialization88() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ildcbx3yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ildcbx3yg(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5128); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5129);Time now = new Time(1259875082000L); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5130);String json = gson.toJson(now); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5131);assertEquals("\"01:18:02 PM\"", json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeDeserialization89() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgximl3yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgximl3yk(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5132); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5133);String json = "'1:18:02 PM'"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5134);Time extracted = gson.fromJson(json, Time.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5135);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testUrlSerialization90() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163d4f3yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163d4f3yo() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5136); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5137);String urlValue = "http://google.com/"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5138);URL url = new URL(urlValue); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5139);assertEquals("\"http://google.com/\"", gson.toJson(url)); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testUriSerialization91() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sy4rbf3ys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriSerialization91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sy4rbf3ys() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5140); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5141);String uriValue = "http://google.com/"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5142);URI uri = new URI(uriValue); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5143);assertEquals("\"http://google.com/\"", gson.toJson(uri)); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testUriDeserialization92() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wd2mt3yw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriDeserialization92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wd2mt3yw(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5144); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5145);String uriValue = "http://google.com/"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5146);String json = '"' + uriValue + '"'; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5147);URI target = gson.fromJson(json, URI.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5148);assertEquals(uriValue, target.toASCIIString()); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testUuidDeserialization93() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go3em53z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go3em53z1(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5149); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5150);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5151);String json = '"' + uuidValue + '"'; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5152);UUID target = gson.fromJson(json, UUID.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5153);assertEquals(uuidValue, target.toString()); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testLocaleSerializationWithLanguageCountry94() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aotii3z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountry94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aotii3z6(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5154); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5155);Locale target = Locale.CANADA_FRENCH; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5156);assertEquals("\"fr_CA\"", gson.toJson(target)); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountry95() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9lajc3z9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9lajc3z9(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5157); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5158);String json = "\"fr_CA\""; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5159);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5160);assertEquals(Locale.CANADA_FRENCH, locale); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testPropertiesDeserialization98() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18oaxf43zd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesDeserialization98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18oaxf43zd(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5161); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5162);String json = "{foo:'bar'}"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5163);Properties props = gson.fromJson(json, Properties.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5164);assertEquals("bar", props.getProperty("foo")); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testPropertiesSerialization99() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127j7bm3zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127j7bm3zh(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5165); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5166);Properties props = new Properties(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5167);props.setProperty("foo", "bar"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5168);String json = gson.toJson(props); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5169);String expected = "{\"foo\":\"bar\"}"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5170);assertEquals(expected, json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testBigDecimalFieldSerialization101() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dsvc03zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dsvc03zn(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5171); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5172);ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5173);String json = gson.toJson(target); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5174);String actual = json.substring(json.indexOf(':') + 1, json.indexOf('}')); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5175);assertEquals(target.value, new BigDecimal(actual)); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testBigDecimalFieldDeserialization102() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrmk7y3zs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrmk7y3zs(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5176); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5177);ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5178);String json = expected.getExpectedJson(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5179);ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5180);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testBadValueForBigDecimalDeserialization103() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0oy083zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0oy083zx(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5181); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5182);try { 
         __CLR4_4_13xb3xble6rvqpp.R.inc(5183);gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class); 
         __CLR4_4_13xb3xble6rvqpp.R.inc(5184);fail("Exponent of a BigDecimal must be an integer value."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testBigIntegerFieldSerialization104() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h5bu3a401();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h5bu3a401(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5185); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5186);ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5187);String json = gson.toJson(target); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5188);assertEquals(target.getExpectedJson(), json); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


public void testBigIntegerFieldDeserialization105() {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xh7a5k405();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xh7a5k405(){try{__CLR4_4_13xb3xble6rvqpp.R.inc(5189); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5190);ClassWithBigInteger expected = new ClassWithBigInteger("879697697697697697697697697697697697"); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5191);String json = expected.getExpectedJson(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5192);ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5193);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testDateDeserializationWithPattern183() throws Exception {__CLR4_4_13xb3xble6rvqpp.R.globalSliceStart(getClass().getName(),5194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x99k1440a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xb3xble6rvqpp.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xb3xble6rvqpp.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateDeserializationWithPattern183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x99k1440a() throws Exception{try{__CLR4_4_13xb3xble6rvqpp.R.inc(5194); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5195);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5196);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5197);Date now = new Date(); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5198);String json = gson.toJson(now); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5199);Date extracted = gson.fromJson(json, Date.class); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5200);assertEquals(now.getYear(), extracted.getYear()); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5201);assertEquals(now.getMonth(), extracted.getMonth()); 
     __CLR4_4_13xb3xble6rvqpp.R.inc(5202);assertEquals(now.getDay(), extracted.getDay()); 
 }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}} 

  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5203);
      __CLR4_4_13xb3xble6rvqpp.R.inc(5204);assertEquals(year-1900, date.getYear());
      __CLR4_4_13xb3xble6rvqpp.R.inc(5205);assertEquals(month, date.getMonth());
      __CLR4_4_13xb3xble6rvqpp.R.inc(5206);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5207);
    __CLR4_4_13xb3xble6rvqpp.R.inc(5208);assertEquals(hours, date.getHours());
    __CLR4_4_13xb3xble6rvqpp.R.inc(5209);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13xb3xble6rvqpp.R.inc(5210);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5211); }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5212);
      __CLR4_4_13xb3xble6rvqpp.R.inc(5213);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5214);
      __CLR4_4_13xb3xble6rvqpp.R.inc(5215);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5216); }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5217);
      __CLR4_4_13xb3xble6rvqpp.R.inc(5218);this.value = new BigInteger(value);
    }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13xb3xble6rvqpp.R.inc(5219);
      __CLR4_4_13xb3xble6rvqpp.R.inc(5220);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13xb3xble6rvqpp.R.flushNeeded();}}
  }

  

  

  

  
}
