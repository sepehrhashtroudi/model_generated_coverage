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
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestSeconds.class);
    }

    public TestSeconds(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testFactory_secondsBetween_RInstant518() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 } 


public void testFactory_standardSecondsIn_RPeriod519() { 
     assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds()); 
     assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds()); 
     try { 
         Seconds.standardSecondsIn(Period.months(1)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPlus_int520() { 
     Seconds test2 = Seconds.seconds(2); 
     Seconds result = test2.plus(3); 
     assertEquals(2, test2.getSeconds()); 
     assertEquals(5, result.getSeconds()); 
     assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     try { 
         Seconds.MAX_VALUE.plus(1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testFactory_seconds_int521() { 
     assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     assertSame(Seconds.ONE, Seconds.seconds(1)); 
     assertSame(Seconds.TWO, Seconds.seconds(2)); 
     assertSame(Seconds.THREE, Seconds.seconds(3)); 
     assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     assertEquals(4, Seconds.seconds(4).getSeconds()); 
 } 


public void testFactory_secondsBetween_RPartial522() { 
     LocalTime start = new LocalTime(12, 0, 3); 
     LocalTime end1 = new LocalTime(12, 0, 6); 
     @SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 } 


public void testFactory_secondsIn_RInterval523() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 } 


public void testFactory_parseSeconds_String524() { 
     assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds()); 
     assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds()); 
     assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds()); 
     assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds()); 
     assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds()); 
     try { 
         Seconds.parseSeconds("P1Y1D"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         Seconds.parseSeconds("P1DT1S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testAddToLocalDate525() { 
     Seconds test = Seconds.seconds(26); 
     LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); 
     LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0); 
     assertEquals(expected, date.plus(test)); 
 } 


public void testToStandardWeeks527() { 
     Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     Weeks expected = Weeks.weeks(2); 
     assertEquals(expected, test.toStandardWeeks()); 
 } 


public void testMinus_int528() { 
     Seconds test2 = Seconds.seconds(2); 
     Seconds result = test2.minus(3); 
     assertEquals(2, test2.getSeconds()); 
     assertEquals(-1, result.getSeconds()); 
     assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     try { 
         Seconds.MIN_VALUE.minus(1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testMinus_Seconds529() { 
     Seconds test2 = Seconds.seconds(2); 
     Seconds test3 = Seconds.seconds(3); 
     Seconds result = test2.minus(test3); 
     assertEquals(2, test2.getSeconds()); 
     assertEquals(3, test3.getSeconds()); 
     assertEquals(-1, result.getSeconds()); 
     assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     try { 
         Seconds.MIN_VALUE.minus(Seconds.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testIsLessThan530() { 
     assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     assertEquals(false, Seconds.ONE.isLessThan(null)); 
     assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
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
