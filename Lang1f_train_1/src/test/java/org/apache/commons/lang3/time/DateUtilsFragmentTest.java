/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsFragmentTest {

    private static final int months = 7;   // second final prime before 12
    private static final int days = 23;    // second final prime before 31 (and valid)
    private static final int hours = 19;   // second final prime before 24
    private static final int minutes = 53; // second final prime before 60
    private static final int seconds = 47; // third final prime before 60
    private static final int millis = 991; // second final prime before 1000

    private Date aDate;
    private Calendar aCalendar;


    @Before
    public void setUp() {
        aCalendar = Calendar.getInstance();
        aCalendar.set(2005, months, days, hours, minutes, seconds);
        aCalendar.set(Calendar.MILLISECOND, millis);
        aDate = aCalendar.getTime();
    }
    
@Test
public void testInvalidFragmentWithDate450() { 
     try { 
         DateUtils.getFragmentInMilliseconds(aDate, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInSeconds(aDate, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInMinutes(aDate, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInHours(aDate, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInDays(aDate, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testMillisecondsOfYearWithCalendar451() { 
     final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.YEAR); 
     assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY), testResult); 
 }
@Test
public void testInvalidFragmentWithCalendar452() { 
     try { 
         DateUtils.getFragmentInMilliseconds(aCalendar, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInSeconds(aCalendar, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInMinutes(aCalendar, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInHours(aCalendar, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInDays(aCalendar, 0); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testHoursOfDayWithCalendar453() { 
     long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DATE); 
     final long expectedValue = hours; 
     assertEquals(expectedValue, testResult); 
     testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DAY_OF_YEAR); 
     assertEquals(expectedValue, testResult); 
 }
@Test
public void testDateFragmentInLargerUnitWithCalendar454() { 
     assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.DATE)); 
 }
@Test
public void testNullCalendar455() { 
     try { 
         DateUtils.getFragmentInMilliseconds((Calendar) null, Calendar.MILLISECOND); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInSeconds((Calendar) null, Calendar.MILLISECOND); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInMinutes((Calendar) null, Calendar.MILLISECOND); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInHours((Calendar) null, Calendar.MILLISECOND); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         DateUtils.getFragmentInDays((Calendar) null, Calendar.MILLISECOND); 
         fail(); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testMinutesOfHourWithDate456() { 
     final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.HOUR_OF_DAY); 
     assertEquals(minutes, testResult); 
 }
@Test
public void testMillisecondFragmentInLargerUnitWithDate457() { 
     assertEquals(0, DateUtils.getFragmentInMilliseconds(aDate, Calendar.MILLISECOND)); 
     assertEquals(0, DateUtils.getFragmentInSeconds(aDate, Calendar.MILLISECOND)); 
     assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.MILLISECOND)); 
     assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.MILLISECOND)); 
     assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.MILLISECOND)); 
 }
    

    
    
    

    

    

    
    
    

    
    
    

    

    

    

    

    

    

    

    //Calendar.SECOND as useful fragment
    
    

    

    //Calendar.MINUTE as useful fragment

    

    

    

    

    //Calendar.HOUR_OF_DAY as useful fragment
    
    
    
    

    

    

    

    

    //Calendar.DATE and Calendar.DAY_OF_YEAR as useful fragment
    
    
    

    

    

    

    
    
    

    
    
    
    //Calendar.MONTH as useful fragment
    

    
    
    

    

    

    

    

    
    
    //Calendar.YEAR as useful fragment
    

    
    
    

    

    

    

    

    
}
