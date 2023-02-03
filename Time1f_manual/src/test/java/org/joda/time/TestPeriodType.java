/*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPeriodType.class);
    }

    public TestPeriodType(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference123() throws Throwable { 
     YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     Period test = Period.fieldDifference(start, end); 
     assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     assertEquals(-1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(-2, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 }


public void testEqualsHashCode57() { 
     PeriodType type1 = PeriodType.dayTime().withMillisRemoved(); 
     PeriodType type2 = PeriodType.dayTime().withMillisRemoved(); 
     assertEquals(true, type1.equals(type2)); 
     assertEquals(true, type2.equals(type1)); 
     assertEquals(true, type1.equals(type1)); 
     assertEquals(true, type2.equals(type2)); 
     assertEquals(true, type1.hashCode() == type2.hashCode()); 
     assertEquals(true, type1.hashCode() == type1.hashCode()); 
     assertEquals(true, type2.hashCode() == type2.hashCode()); 
     DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis() }; 
     PeriodType type3 = PeriodType.dayTime().withMillisRemoved(); 
     assertEquals(false, type1.equals(type3)); 
     assertEquals(false, type2.equals(type3)); 
     assertEquals(false, type3.equals(type1)); 
     assertEquals(false, type3.equals(type2)); 
     assertEquals(false, type1.hashCode() == type3.hashCode()); 
     assertEquals(false, type2.hashCode() == type3.hashCode()); 
     assertEquals(false, type1.equals("Hello")); 
//     assertEquals(true, type1.equals(new TestPeriod_Basics.MockPeriod(PeriodType.dayTime().withMillisRemoved())));
     assertEquals(false, type1.equals(PeriodType.dayTime().withMillisRemoved())); 
 }


public void testMaskTwice2300() throws Exception { 
     PeriodType type = PeriodType.dayTime(); 
     PeriodType type2 = type.withYearsRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.dayTime(); 
     type2 = type.withMonthsRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.dayTime(); 
     type2 = type.withWeeksRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withDaysRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withHoursRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withMinutesRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withSecondsRemoved(); 
     assertEquals(true, type == type2); 
 }


public void testFactoryFieldDifference1301() throws Throwable { 
     YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     Period test = Period.fieldDifference(start, end); 
     assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     assertEquals(-1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(-2, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 }

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        byte[] bytes = baos.toByteArray();
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
        assertEquals(type, result);
    }

    private void assertSameAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        byte[] bytes = baos.toByteArray();
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
        assertEquals(type, result);
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
    

    

    

    

    

    

    // ensure hash key distribution
    

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
