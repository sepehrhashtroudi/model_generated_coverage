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
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_13y73y7le6rxkp9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5119);
    __CLR4_4_13y73y7le6rxkp9.R.inc(5120);super.setUp();
    __CLR4_4_13y73y7le6rxkp9.R.inc(5121);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_13y73y7le6rxkp9.R.inc(5122);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_13y73y7le6rxkp9.R.inc(5123);gson = new Gson();
  }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5124);
    __CLR4_4_13y73y7le6rxkp9.R.inc(5125);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_13y73y7le6rxkp9.R.inc(5126);super.tearDown();
  }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}


public void testUrlDeserialization74() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opsx9m3yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opsx9m3yf(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5127); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5128);String urlValue = "http://google.com/"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5129);String json = "'http:\\/\\/google.com\\/'"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5130);URL target = gson.fromJson(json, URL.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5131);assertEquals(urlValue, target.toExternalForm()); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5132);gson.fromJson('"' + urlValue + '"', URL.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5133);assertEquals(urlValue, target.toExternalForm()); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testSetSerialization81() throws Exception {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jgku83ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization81",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jgku83ym() throws Exception{try{__CLR4_4_13y73y7le6rxkp9.R.inc(5134); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5135);Gson gson = new Gson(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5136);HashSet<String> s = new HashSet<String>(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5137);s.add("blah"); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5138);String json = gson.toJson(s); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5139);assertEquals("[\"blah\"]", json); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5140);json = gson.toJson(s, Set.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5141);assertEquals("[\"blah\"]", json); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDateSerializationWithPattern82() throws Exception {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9fiqj3yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9fiqj3yu() throws Exception{try{__CLR4_4_13y73y7le6rxkp9.R.inc(5142); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5143);String pattern = "yyyy-MM-dd"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5144);DateFormat formatter = new SimpleDateFormat(pattern); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5145);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5146);Date now = new Date(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5147);String json = gson.toJson(now); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5148);assertEquals("\"" + formatter.format(now) + "\"", json); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDefaultJavaSqlTimestampDeserialization84() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ydd4p3z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampDeserialization84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ydd4p3z1(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5149); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5150);String json = "'Dec 3, 2009 1:18:02 PM'"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5151);Timestamp extracted = gson.fromJson(json, Timestamp.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5152);assertEqualsDate(extracted, 2009, 11, 3); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5153);assertEqualsTime(extracted, 13, 18, 02); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDefaultJavaSqlDateSerialization85() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15yh1w73z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateSerialization85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15yh1w73z6(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5154); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5155);java.sql.Date instant = new java.sql.Date(1259875082000L); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5156);String json = gson.toJson(instant); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5157);assertEquals("\"Dec 3, 2009\"", json); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDefaultJavaSqlDateDeserialization86() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ue0y13za();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ue0y13za(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5158); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5159);String json = "'Dec 3, 2009'"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5160);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5161);assertEqualsDate(extracted, 2009, 11, 3); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDefaultJavaSqlTimeSerialization87() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcddjg3ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcddjg3ze(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5162); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5163);Time now = new Time(1259875082000L); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5164);String json = gson.toJson(now); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5165);assertEquals("\"01:18:02 PM\"", json); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testDefaultCalendarSerialization88() throws Exception {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y23kh63zi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarSerialization88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y23kh63zi() throws Exception{try{__CLR4_4_13y73y7le6rxkp9.R.inc(5166); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5167);Gson gson = new GsonBuilder().create(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5168);String json = gson.toJson(Calendar.getInstance()); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5169);assertTrue(json.contains("year")); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5170);assertTrue(json.contains("month")); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5171);assertTrue(json.contains("dayOfMonth")); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5172);assertTrue(json.contains("hourOfDay")); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5173);assertTrue(json.contains("minute")); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5174);assertTrue(json.contains("second")); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testUrlSerialization89() throws Exception {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mykjp3zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mykjp3zr() throws Exception{try{__CLR4_4_13y73y7le6rxkp9.R.inc(5175); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5176);String urlValue = "http://google.com/"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5177);URL url = new URL(urlValue); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5178);assertEquals("\"http://google.com/\"", gson.toJson(url)); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testUuidSerialization90() throws Exception {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z16ae73zv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidSerialization90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z16ae73zv() throws Exception{try{__CLR4_4_13y73y7le6rxkp9.R.inc(5179); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5180);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5181);UUID uuid = UUID.fromString(uuidValue); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5182);assertEquals('"' + uuidValue + '"', gson.toJson(uuid)); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testUuidDeserialization91() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n63c733zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n63c733zz(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5183); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5184);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5185);String json = '"' + uuidValue + '"'; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5186);UUID target = gson.fromJson(json, UUID.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5187);assertEquals(uuidValue, target.toString()); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguage92() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oqgyn404();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oqgyn404(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5188); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5189);String json = "\"en\""; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5190);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5191);assertEquals("en", locale.getLanguage()); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountry93() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orlcye408();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orlcye408(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5192); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5193);String json = "\"fr_CA\""; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5194);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5195);assertEquals(Locale.CANADA_FRENCH, locale); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testLocaleDeserializationWithLanguageCountryVariant94() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvqmgi40c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountryVariant94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvqmgi40c(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5196); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5197);String json = "\"de_DE_EURO\""; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5198);Locale locale = gson.fromJson(json, Locale.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5199);assertEquals("de", locale.getLanguage()); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5200);assertEquals("DE", locale.getCountry()); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5201);assertEquals("EURO", locale.getVariant()); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testTreeSetDeserialization96() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nc9nj340i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetDeserialization96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nc9nj340i(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5202); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5203);String json = "['Value1']"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5204);Type type = new TypeToken<TreeSet<String>>() { 
     }.getType(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5205);TreeSet<String> treeSet = gson.fromJson(json, type); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5206);assertTrue(treeSet.contains("Value1")); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testPropertiesDeserialization99() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxaw7l40n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesDeserialization99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxaw7l40n(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5207); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5208);String json = "{foo:'bar'}"; 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5209);Properties props = gson.fromJson(json, Properties.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5210);assertEquals("bar", props.getProperty("foo")); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testBigDecimalFieldSerialization102() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmsu4h40r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmsu4h40r(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5211); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5212);ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5213);String json = gson.toJson(target); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5214);String actual = json.substring(json.indexOf(':') + 1, json.indexOf('}')); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5215);assertEquals(target.value, new BigDecimal(actual)); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testBigDecimalFieldDeserialization103() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gimlfh40w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gimlfh40w(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5216); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5217);ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21"); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5218);String json = expected.getExpectedJson(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5219);ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5220);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testBadValueForBigDecimalDeserialization104() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrf56f411();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrf56f411(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5221); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5222);try { 
         __CLR4_4_13y73y7le6rxkp9.R.inc(5223);gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class); 
         __CLR4_4_13y73y7le6rxkp9.R.inc(5224);fail("Exponent of a BigDecimal must be an integer value."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testBigIntegerFieldSerialization105() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kebsvr415();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kebsvr415(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5225); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5226);ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324"); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5227);String json = gson.toJson(target); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5228);assertEquals(target.getExpectedJson(), json); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 


public void testBigIntegerFieldDeserialization106() {__CLR4_4_13y73y7le6rxkp9.R.globalSliceStart(getClass().getName(),5229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u87bd3419();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13y73y7le6rxkp9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13y73y7le6rxkp9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u87bd3419(){try{__CLR4_4_13y73y7le6rxkp9.R.inc(5229); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5230);ClassWithBigInteger expected = new ClassWithBigInteger("879697697697697697697697697697697697"); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5231);String json = expected.getExpectedJson(); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5232);ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class); 
     __CLR4_4_13y73y7le6rxkp9.R.inc(5233);assertEquals(expected.value, actual.value); 
 }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}} 

  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5234);
      __CLR4_4_13y73y7le6rxkp9.R.inc(5235);assertEquals(year-1900, date.getYear());
      __CLR4_4_13y73y7le6rxkp9.R.inc(5236);assertEquals(month, date.getMonth());
      __CLR4_4_13y73y7le6rxkp9.R.inc(5237);assertEquals(day, date.getDate());
  }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5238);
    __CLR4_4_13y73y7le6rxkp9.R.inc(5239);assertEquals(hours, date.getHours());
    __CLR4_4_13y73y7le6rxkp9.R.inc(5240);assertEquals(minutes, date.getMinutes());
    __CLR4_4_13y73y7le6rxkp9.R.inc(5241);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5242); }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5243);
      __CLR4_4_13y73y7le6rxkp9.R.inc(5244);this.value = new BigDecimal(value);
    }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5245);
      __CLR4_4_13y73y7le6rxkp9.R.inc(5246);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5247); }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5248);
      __CLR4_4_13y73y7le6rxkp9.R.inc(5249);this.value = new BigInteger(value);
    }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_13y73y7le6rxkp9.R.inc(5250);
      __CLR4_4_13y73y7le6rxkp9.R.inc(5251);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_13y73y7le6rxkp9.R.flushNeeded();}}
  }

  

  

  

  
}
