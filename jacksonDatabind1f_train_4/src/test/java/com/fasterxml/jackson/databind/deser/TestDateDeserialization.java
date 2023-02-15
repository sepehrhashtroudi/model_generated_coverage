package com.fasterxml.jackson.databind.deser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class TestDateDeserialization
    extends BaseMapTest
{
    // Test for [JACKSON-435]
    static class DateAsStringBean
    {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="/yyyy/MM/dd/")
        public Date date;
    }

    static class CalendarAsStringBean
    {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=";yyyy/MM/dd;")
        public Calendar cal;
    }

    static class DateInCETBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH", timezone="CET")
        public Date date;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testCustomDateWithAnnotation43() throws Exception { 
     DateAsStringBean result = MAPPER.readValue("{\"date\":\"/2005/05/25/\"}", DateAsStringBean.class); 
     assertNotNull(result); 
     assertNotNull(result.date); 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     long l = result.date.getTime(); 
     if (l == 0L) { 
         fail("Should not get null date"); 
     } 
     c.setTimeInMillis(l); 
     assertEquals(2005, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.MAY, c.get(Calendar.MONTH)); 
     assertEquals(25, c.get(Calendar.DAY_OF_MONTH)); 
 } 


public void testCalendar160() throws Exception { 
     java.util.Calendar value = Calendar.getInstance(); 
     long l = 12345678L; 
     value.setTimeInMillis(l); 
     Calendar result = MAPPER.readValue("" + l, Calendar.class); 
     assertEquals(l, result.getTimeInMillis()); 
     String dateStr = dateToString(new Date(l)); 
     result = MAPPER.readValue(quote(dateStr), Calendar.class); 
     assertEquals(l, result.getTimeInMillis()); 
 } 


public void test8601DateTimeNoMilliSecs164() throws Exception { 
     for (String inputStr : new String[] { "2010-06-28T23:34:22Z", "2010-06-28T23:34:22+0000", "2010-06-28T23:34:22+00" }) { 
         Date inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
         c.setTime(inputDate); 
         assertEquals(2010, c.get(Calendar.YEAR)); 
         assertEquals(Calendar.JUNE, c.get(Calendar.MONTH)); 
         assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
         assertEquals(23, c.get(Calendar.HOUR_OF_DAY)); 
         assertEquals(34, c.get(Calendar.MINUTE)); 
         assertEquals(22, c.get(Calendar.SECOND)); 
         assertEquals(0, c.get(Calendar.MILLISECOND)); 
     } 
 } 


public void testDateUtilISO8601165() throws Exception { 
     String inputStr = "1972-12-28T00:00:00.000+0000"; 
     Date inputDate = MAPPER.readValue("\"" + inputStr + "\"", java.util.Date.class); 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     c.setTime(inputDate); 
     assertEquals(1972, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.DECEMBER, c.get(Calendar.MONTH)); 
     assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
     inputStr = "1972-12-28T00:00:00.000Z"; 
     inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     c.setTime(inputDate); 
     assertEquals(1972, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.DECEMBER, c.get(Calendar.MONTH)); 
     assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
     inputStr = "1972-12-28T00:00:00.000+00:00"; 
     inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     c.setTime(inputDate); 
     assertEquals(1972, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.DECEMBER, c.get(Calendar.MONTH)); 
     assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
     inputStr = "1972-12-28T00:00:00.000+00"; 
     inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     c.setTime(inputDate); 
     assertEquals(1972, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.DECEMBER, c.get(Calendar.MONTH)); 
     assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
     inputStr = "1984-11-30T00:00:00.000Z"; 
     inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     c.setTime(inputDate); 
     assertEquals(1984, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.NOVEMBER, c.get(Calendar.MONTH)); 
     assertEquals(30, c.get(Calendar.DAY_OF_MONTH)); 
 } 


public void testDateUtilISO8601NoTimezone166() throws Exception { 
     String inputStr = "1984-11-13T00:00:09"; 
     Date inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     c.setTime(inputDate); 
     assertEquals(1984, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.NOVEMBER, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
     assertEquals(0, c.get(Calendar.HOUR_OF_DAY)); 
     assertEquals(0, c.get(Calendar.MINUTE)); 
     assertEquals(9, c.get(Calendar.SECOND)); 
     assertEquals(0, c.get(Calendar.MILLISECOND)); 
 } 


@SuppressWarnings("deprecation") 
 public void testDateSql467() throws Exception { 
     java.sql.Date value = new java.sql.Date(0L); 
     value.setYear(99); 
     value.setDate(19); 
     value.setMonth(Calendar.APRIL); 
     long now = value.getTime(); 
     assertEquals(value, MAPPER.readValue(String.valueOf(now), java.sql.Date.class)); 
     java.sql.Date result = MAPPER.readValue(quote(value.toString()), java.sql.Date.class); 
     Calendar c = gmtCalendar(result.getTime()); 
     assertEquals(1999, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.APRIL, c.get(Calendar.MONTH)); 
     assertEquals(19, c.get(Calendar.DAY_OF_MONTH)); 
     String expStr = "1981-07-13"; 
     result = MAPPER.readValue(quote(expStr), java.sql.Date.class); 
     c.setTimeInMillis(result.getTime()); 
     assertEquals(1981, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.JULY, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
 } 


public void testCustomCalendarWithAnnotation468() throws Exception { 
     CalendarAsStringBean cbean = MAPPER.readValue("{\"cal\":\";2007/07/13;\"}", CalendarAsStringBean.class); 
     assertNotNull(cbean); 
     assertNotNull(cbean.cal); 
     Calendar c = cbean.cal; 
     assertEquals(2007, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.JULY, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
 } 

    

    

    

    

    /**
     * ISO8601 is supported as well
     */
    

    

    

    

    

    

    /**
     * Test for [JACKSON-203]: make empty Strings deserialize as nulls by default,
     * without need to turn on feature (which may be added in future)
     */
    

    // for [JACKSON-334]
    

    

    

    

    

    /*
    /**********************************************************
    /* Tests to verify failing cases
    /**********************************************************
     */

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private String dateToString(java.util.Date value)
    {
        /* Then from String. This is bit tricky, since JDK does not really
         * suggest a 'standard' format. So let's try using something...
         */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return df.format(value);
    }

    private static Calendar gmtCalendar(long time)
    {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.setTimeInMillis(time);
        return c;
    }

}
