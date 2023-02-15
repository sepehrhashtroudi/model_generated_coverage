package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.text.*;
import java.util.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;

public class TestDateSerialization
    extends BaseMapTest
{
    static class TimeZoneBean {
        private TimeZone tz;
        
        public TimeZoneBean(String name) {
            tz = TimeZone.getTimeZone(name);
        }

        public TimeZone getTz() { return tz; }
    }

    static class DateAsNumberBean {
        @JsonFormat(shape=JsonFormat.Shape.NUMBER)
        public Date date;
        public DateAsNumberBean(long l) { date = new java.util.Date(l); }
    }

    static class DateAsStringBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
        public Date date;
        public DateAsStringBean(long l) { date = new java.util.Date(l); }
    }

    static class DateInCETBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
        public Date date;
        public DateInCETBean(long l) { date = new java.util.Date(l); }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testDateWithJsonFormat34() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json; 
     mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writeValueAsString(new DateAsNumberBean(0L)); 
     assertEquals("{\"date\":0}", json); 
     mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writer().with(getUTCTimeZone()).writeValueAsString(new DateAsStringBean(0L)); 
     assertEquals("{\"date\":\"1970-01-01\"}", json); 
     json = mapper.writeValueAsString(new DateInCETBean(0L)); 
     assertEquals("{\"date\":\"1970-01-01,01:00\"}", json); 
 } 


public void testWithTimeZoneOverride145() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd/HH:mm z")); 
     mapper.setTimeZone(TimeZone.getTimeZone("PST")); 
     mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     String json = mapper.writeValueAsString(new Date(0)); 
     assertEquals(quote("1969-12-31/16:00 PST"), json); 
 } 


public void testDatesAsMapKeys274() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     Map<Date, Integer> map = new HashMap<Date, Integer>(); 
     assertFalse(mapper.isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)); 
     map.put(new Date(0L), Integer.valueOf(1)); 
     assertEquals("{\"1970-01-01T00:00:00.000+0000\":1}", mapper.writeValueAsString(map)); 
     mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, true); 
     assertEquals("{\"0\":1}", mapper.writeValueAsString(map)); 
 } 


public void testDateNumeric279() throws IOException { 
     assertTrue(MAPPER.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)); 
     String json = MAPPER.writeValueAsString(new Date(199L)); 
     assertEquals("199", json); 
 } 


public void testDateUsingObjectWriter304() throws IOException { 
     DateFormat df = new SimpleDateFormat("yyyy-MM-dd'X'HH:mm:ss"); 
     df.setTimeZone(TimeZone.getTimeZone("PST")); 
     assertEquals(quote("1969-12-31X16:00:00"), MAPPER.writer(df).writeValueAsString(new Date(0L))); 
     ObjectWriter w = MAPPER.writer((DateFormat) null); 
     assertEquals("0", w.writeValueAsString(new Date(0L))); 
     w = w.with(df); 
     assertEquals(quote("1969-12-31X16:00:00"), w.writeValueAsString(new Date(0L))); 
     w = w.with((DateFormat) null); 
     assertEquals("0", w.writeValueAsString(new Date(0L))); 
 } 


@SuppressWarnings("deprecation") 
 public void testSqlDate413() throws IOException { 
     java.sql.Date date = new java.sql.Date(99, Calendar.APRIL, 1); 
     assertEquals(quote("1999-04-01"), MAPPER.writeValueAsString(date)); 
 } 


public void testTimeZoneInBean474() throws IOException { 
     String json = MAPPER.writeValueAsString(new TimeZoneBean("PST")); 
     assertEquals("{\"tz\":\"PST\"}", json); 
 } 

    

    

    

    

    

    // [JACKSON-663]
    
    
    // [JACKSON-648]: (re)configuring via ObjectWriter
    

    // [JACKSON-606]
    

    // [JACKSON-435]
    

    /**
     * Test to ensure that setting a TimeZone _after_ dateformat should enforce
     * that timezone on format, regardless of TimeZone format had.
     */
    
}

