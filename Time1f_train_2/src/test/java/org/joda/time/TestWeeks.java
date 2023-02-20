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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestWeeks.class);
    }

    public TestWeeks(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testToStandardSeconds488() { 
     Weeks test = Weeks.weeks(2); 
     Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     assertEquals(expected, test.toStandardSeconds()); 
     try { 
         Weeks.MAX_VALUE.toStandardSeconds(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial512() { 
     LocalDate start = new LocalDate(2006, 6, 9); 
     LocalDate end1 = new LocalDate(2006, 6, 30); 
     YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 } 


public void testFactory_weeksIn_RInterval513() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 } 


public void testFactory_standardWeeksIn_RPeriod514() { 
     assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks()); 
     assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks()); 
     assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks()); 
     assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks()); 
     assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks()); 
     assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks()); 
     try { 
         Weeks.standardWeeksIn(Period.months(1)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToStandardDays516() { 
     Weeks test = Weeks.weeks(2); 
     Days expected = Days.days(14); 
     assertEquals(expected, test.toStandardDays()); 
     try { 
         Weeks.MAX_VALUE.toStandardDays(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testToStandardMinutes517() { 
     Weeks test = Weeks.weeks(2); 
     Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     assertEquals(expected, test.toStandardMinutes()); 
     try { 
         Weeks.MAX_VALUE.toStandardMinutes(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testToStandardDuration518() { 
     Weeks test = Weeks.weeks(20); 
     Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK); 
     assertEquals(expected, test.toStandardDuration()); 
     expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK); 
     assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration()); 
 } 


public void testMinus_int519() { 
     Weeks test2 = Weeks.weeks(2); 
     Weeks result = test2.minus(3); 
     assertEquals(2, test2.getWeeks()); 
     assertEquals(-1, result.getWeeks()); 
     assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     try { 
         Weeks.MIN_VALUE.minus(1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testPlus_Weeks520() { 
     Weeks test2 = Weeks.weeks(2); 
     Weeks test3 = Weeks.weeks(3); 
     Weeks result = test2.plus(test3); 
     assertEquals(2, test2.getWeeks()); 
     assertEquals(3, test3.getWeeks()); 
     assertEquals(5, result.getWeeks()); 
     assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     try { 
         Weeks.MAX_VALUE.plus(Weeks.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testMinus_Weeks521() { 
     Weeks test2 = Weeks.weeks(2); 
     Weeks test3 = Weeks.weeks(3); 
     Weeks result = test2.minus(test3); 
     assertEquals(2, test2.getWeeks()); 
     assertEquals(3, test3.getWeeks()); 
     assertEquals(-1, result.getWeeks()); 
     assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     try { 
         Weeks.MIN_VALUE.minus(Weeks.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testMultipliedBy_int522() { 
     Weeks test = Weeks.weeks(2); 
     assertEquals(6, test.multipliedBy(3).getWeeks()); 
     assertEquals(2, test.getWeeks()); 
     assertEquals(-6, test.multipliedBy(-3).getWeeks()); 
     assertSame(test, test.multipliedBy(1)); 
     Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1); 
     try { 
         halfMax.multipliedBy(2); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testDividedBy_int523() { 
     Weeks test = Weeks.weeks(12); 
     assertEquals(6, test.dividedBy(2).getWeeks()); 
     assertEquals(12, test.getWeeks()); 
     assertEquals(4, test.dividedBy(3).getWeeks()); 
     assertEquals(3, test.dividedBy(4).getWeeks()); 
     assertEquals(2, test.dividedBy(5).getWeeks()); 
     assertEquals(2, test.dividedBy(6).getWeeks()); 
     assertSame(test, test.dividedBy(1)); 
     try { 
         Weeks.ONE.dividedBy(0); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testNegated524() { 
     Weeks test = Weeks.weeks(12); 
     assertEquals(-12, test.negated().getWeeks()); 
     assertEquals(12, test.getWeeks()); 
     try { 
         Weeks.MIN_VALUE.negated(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testIsGreaterThan525() { 
     assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 } 


public void testIsLessThan526() { 
     assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     assertEquals(false, Weeks.ONE.isLessThan(null)); 
     assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
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
    

}
