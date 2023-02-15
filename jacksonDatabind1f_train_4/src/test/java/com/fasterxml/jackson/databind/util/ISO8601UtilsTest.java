package com.fasterxml.jackson.databind.util;

import java.util.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

/**
 * @see ISO8601Utils
 */
public class ISO8601UtilsTest extends BaseMapTest
{
    private Date date;
    private Date dateZeroMillis;

    @Override
    public void setUp()
    {
        Calendar cal = new GregorianCalendar(2007, 8 - 1, 13, 19, 51, 23);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.MILLISECOND, 789);
        date = cal.getTime();
        cal.set(Calendar.MILLISECOND, 0);
        dateZeroMillis = cal.getTime();
    }


public void testFormat585() { 
     String result = ISO8601Utils.format(date); 
     assertEquals("2007-08-13T19:51:23Z", result); 
 } 


public void testFormatMillis586() { 
     String result = ISO8601Utils.format(date, true); 
     assertEquals("2007-08-13T19:51:23.789Z", result); 
     result = ISO8601Utils.format(date, false); 
     assertEquals("2007-08-13T19:51:23Z", result); 
 } 


public void testFormatTimeZone587() { 
     String result = ISO8601Utils.format(date, false, TimeZone.getTimeZone("GMT+02:00")); 
     assertEquals("2007-08-13T21:51:23+02:00", result); 
     result = ISO8601Utils.format(date, true, TimeZone.getTimeZone("GMT+02:00")); 
     assertEquals("2007-08-13T21:51:23.789+02:00", result); 
     result = ISO8601Utils.format(date, true, TimeZone.getTimeZone("GMT")); 
     assertEquals("2007-08-13T19:51:23.789Z", result); 
 } 

    

    

    

    

}
