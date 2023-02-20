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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMonths.class);
    }

    public TestMonths(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate116() { 
     LocalDate start = new LocalDate(2006, 6, 9); 
     LocalDate end1 = new LocalDate(2006, 9, 9); 
     YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }
public void testFactory_parseMonths_String117() { 
     assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     try { 
         Months.parseMonths("P1Y1D"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         Months.parseMonths("P1MT1H"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
public void testMultipliedBy_int118() { 
     Months test = Months.months(2); 
     assertEquals(6, test.multipliedBy(3).getMonths()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     assertSame(test, test.multipliedBy(1)); 
     Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     try { 
         halfMax.multipliedBy(2); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-------------------------------------------------------------------------
    

    

    

    //-------------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
