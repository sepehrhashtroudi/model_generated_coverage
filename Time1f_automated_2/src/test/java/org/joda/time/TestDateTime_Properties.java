/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Properties.class);
    }

    public TestDateTime_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------
public void testPropertyGetCenturyOfEra261() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     assertSame(test, test.centuryOfEra().getDateTime()); 
     assertEquals(20, test.centuryOfEra().get()); 
     assertEquals("20", test.centuryOfEra().getAsString()); 
     assertEquals("20", test.centuryOfEra().getAsText()); 
     assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.centuryOfEra().getAsShortText()); 
     assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }
public void testPropertySetDayOfWeek262() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfWeek().setCopy(4); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     try { 
         test.dayOfWeek().setCopy(54); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.dayOfWeek().setCopy(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
public void testPropertyAddLongDayOfWeek263() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfWeek().addToCopy(9L); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     copy = test.dayOfWeek().addToCopy(0L); 
     assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     copy = test.dayOfWeek().addToCopy(292278993 - 2004 + 1); 
     assertEquals(-292275054, copy.getYear()); 
     copy = test.dayOfWeek().addToCopy(-292275054 - 2004 - 1); 
     assertEquals(292278993, copy.getYear()); 
 }
public void testPropertyWithMaximumValueDayOfMonth264() { 
     DateTime test = new DateTime(1972, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.dayOfMonth().withMaximumValue(); 
     assertEquals("1972-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("1972-06-30T00:00:00.000+01:00", copy.toString()); 
 }
public void testPropertyWithMaximumValueMillisOfDayDSTGap265() { 
     DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     DateTime test = dt.millisOfDay().withMaximumValue(); 
     assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

            

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

}
