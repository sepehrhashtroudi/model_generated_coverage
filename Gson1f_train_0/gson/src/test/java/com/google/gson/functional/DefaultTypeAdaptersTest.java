/*
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
public class DefaultTypeAdaptersTest extends TestCase {
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    this.oldTimeZone = TimeZone.getDefault();
    TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    gson = new Gson();
  }

  @Override
  protected void tearDown() throws Exception {
    TimeZone.setDefault(oldTimeZone);
    super.tearDown();
  }


public void testSetSerialization82() throws Exception { 
     Gson gson = new Gson(); 
     HashSet<String> s = new HashSet<String>(); 
     s.add("blah"); 
     String json = gson.toJson(s); 
     assertEquals("[\"blah\"]", json); 
     json = gson.toJson(s, Set.class); 
     assertEquals("[\"blah\"]", json); 
 } 


public void testDefaultCalendarDeserialization83() throws Exception { 
     Gson gson = new GsonBuilder().create(); 
     String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     Calendar cal = gson.fromJson(json, Calendar.class); 
     assertEquals(2009, cal.get(Calendar.YEAR)); 
     assertEquals(2, cal.get(Calendar.MONTH)); 
     assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     assertEquals(29, cal.get(Calendar.MINUTE)); 
     assertEquals(23, cal.get(Calendar.SECOND)); 
 } 


public void testDateSerializationWithPattern84() throws Exception { 
     String pattern = "yyyy-MM-dd"; 
     DateFormat formatter = new SimpleDateFormat(pattern); 
     Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     Date now = new Date(); 
     String json = gson.toJson(now); 
     assertEquals("\"" + formatter.format(now) + "\"", json); 
 } 


public void testDefaultJavaSqlDateSerialization86() { 
     java.sql.Date instant = new java.sql.Date(1259875082000L); 
     String json = gson.toJson(instant); 
     assertEquals("\"Dec 3, 2009\"", json); 
 } 


public void testDefaultJavaSqlDateDeserialization87() { 
     String json = "'Dec 3, 2009'"; 
     java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     assertEqualsDate(extracted, 2009, 11, 3); 
 } 


public void testDefaultJavaSqlTimeSerialization88() { 
     Time now = new Time(1259875082000L); 
     String json = gson.toJson(now); 
     assertEquals("\"01:18:02 PM\"", json); 
 } 


public void testDefaultJavaSqlTimeDeserialization89() { 
     String json = "'1:18:02 PM'"; 
     Time extracted = gson.fromJson(json, Time.class); 
     assertEqualsTime(extracted, 13, 18, 02); 
 } 


public void testUrlSerialization90() throws Exception { 
     String urlValue = "http://google.com/"; 
     URL url = new URL(urlValue); 
     assertEquals("\"http://google.com/\"", gson.toJson(url)); 
 } 


public void testUriSerialization91() throws Exception { 
     String uriValue = "http://google.com/"; 
     URI uri = new URI(uriValue); 
     assertEquals("\"http://google.com/\"", gson.toJson(uri)); 
 } 


public void testUriDeserialization92() { 
     String uriValue = "http://google.com/"; 
     String json = '"' + uriValue + '"'; 
     URI target = gson.fromJson(json, URI.class); 
     assertEquals(uriValue, target.toASCIIString()); 
 } 


public void testUuidDeserialization93() { 
     String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0"; 
     String json = '"' + uuidValue + '"'; 
     UUID target = gson.fromJson(json, UUID.class); 
     assertEquals(uuidValue, target.toString()); 
 } 


public void testLocaleSerializationWithLanguageCountry94() { 
     Locale target = Locale.CANADA_FRENCH; 
     assertEquals("\"fr_CA\"", gson.toJson(target)); 
 } 


public void testLocaleDeserializationWithLanguageCountry95() { 
     String json = "\"fr_CA\""; 
     Locale locale = gson.fromJson(json, Locale.class); 
     assertEquals(Locale.CANADA_FRENCH, locale); 
 } 


public void testPropertiesDeserialization98() { 
     String json = "{foo:'bar'}"; 
     Properties props = gson.fromJson(json, Properties.class); 
     assertEquals("bar", props.getProperty("foo")); 
 } 


public void testPropertiesSerialization99() { 
     Properties props = new Properties(); 
     props.setProperty("foo", "bar"); 
     String json = gson.toJson(props); 
     String expected = "{\"foo\":\"bar\"}"; 
     assertEquals(expected, json); 
 } 


public void testBigDecimalFieldSerialization101() { 
     ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21"); 
     String json = gson.toJson(target); 
     String actual = json.substring(json.indexOf(':') + 1, json.indexOf('}')); 
     assertEquals(target.value, new BigDecimal(actual)); 
 } 


public void testBigDecimalFieldDeserialization102() { 
     ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21"); 
     String json = expected.getExpectedJson(); 
     ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class); 
     assertEquals(expected.value, actual.value); 
 } 


public void testBadValueForBigDecimalDeserialization103() { 
     try { 
         gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class); 
         fail("Exponent of a BigDecimal must be an integer value."); 
     } catch (JsonParseException expected) { 
     } 
 } 


public void testBigIntegerFieldSerialization104() { 
     ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324"); 
     String json = gson.toJson(target); 
     assertEquals(target.getExpectedJson(), json); 
 } 


public void testBigIntegerFieldDeserialization105() { 
     ClassWithBigInteger expected = new ClassWithBigInteger("879697697697697697697697697697697697"); 
     String json = expected.getExpectedJson(); 
     ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class); 
     assertEquals(expected.value, actual.value); 
 } 


@SuppressWarnings("deprecation") 
 public void testDateDeserializationWithPattern183() throws Exception { 
     String pattern = "yyyy-MM-dd"; 
     Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create(); 
     Date now = new Date(); 
     String json = gson.toJson(now); 
     Date extracted = gson.fromJson(json, Date.class); 
     assertEquals(now.getYear(), extracted.getYear()); 
     assertEquals(now.getMonth(), extracted.getMonth()); 
     assertEquals(now.getDay(), extracted.getDay()); 
 } 

  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {
      assertEquals(year-1900, date.getYear());
      assertEquals(month, date.getMonth());
      assertEquals(day, date.getDate());
  }

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {
    assertEquals(hours, date.getHours());
    assertEquals(minutes, date.getMinutes());
    assertEquals(seconds, date.getSeconds());
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() { }
    ClassWithBigDecimal(String value) {
      this.value = new BigDecimal(value);
    }
    String getExpectedJson() {
      return "{\"value\":" + value.toEngineeringString() + "}";
    }
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() { }
    ClassWithBigInteger(String value) {
      this.value = new BigInteger(value);
    }
    String getExpectedJson() {
      return "{\"value\":" + value + "}";
    }
  }

  

  

  

  
}
