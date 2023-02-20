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

public void testFactory_parseMonths_String179() { 
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


public void testGetPeriodType316() { 
     Months test = Months.months(20); 
     assertEquals(PeriodType.months(), test.getPeriodType()); 
 } 


public void testMinus_Months317() { 
     Months test2 = Months.months(2); 
     Months test3 = Months.months(3); 
     Months result = test2.minus(test3); 
     assertEquals(2, test2.getMonths()); 
     assertEquals(3, test3.getMonths()); 
     assertEquals(-1, result.getMonths()); 
     assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     try { 
         Months.MIN_VALUE.minus(Months.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testFactory_months_int318() { 
     assertSame(Months.ZERO, Months.months(0)); 
     assertSame(Months.ONE, Months.months(1)); 
     assertSame(Months.TWO, Months.months(2)); 
     assertSame(Months.THREE, Months.months(3)); 
     assertSame(Months.FOUR, Months.months(4)); 
     assertSame(Months.FIVE, Months.months(5)); 
     assertSame(Months.SIX, Months.months(6)); 
     assertSame(Months.SEVEN, Months.months(7)); 
     assertSame(Months.EIGHT, Months.months(8)); 
     assertSame(Months.NINE, Months.months(9)); 
     assertSame(Months.TEN, Months.months(10)); 
     assertSame(Months.ELEVEN, Months.months(11)); 
     assertSame(Months.TWELVE, Months.months(12)); 
     assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     assertEquals(-1, Months.months(-1).getMonths()); 
     assertEquals(13, Months.months(13).getMonths()); 
 } 


public void testPlus_Months319() { 
     Months test2 = Months.months(2); 
     Months test3 = Months.months(3); 
     Months result = test2.plus(test3); 
     assertEquals(2, test2.getMonths()); 
     assertEquals(3, test3.getMonths()); 
     assertEquals(5, result.getMonths()); 
     assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     try { 
         Months.MAX_VALUE.plus(Months.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testFactory_monthsBetween_RPartial_YearMonth320() { 
     YearMonth start1 = new YearMonth(2011, 1); 
     for (int i = 0; i < 6; i++) { 
         YearMonth start2 = new YearMonth(2011 + i, 1); 
         YearMonth end = new YearMonth(2011 + i, 3); 
         assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 } 


public void testSerialization321() throws Exception { 
     Months test = Months.THREE; 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     Months result = (Months) ois.readObject(); 
     ois.close(); 
     assertSame(test, result); 
 } 


public void testMultipliedBy_int322() { 
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


public void testDividedBy_int323() { 
     Months test = Months.months(12); 
     assertEquals(6, test.dividedBy(2).getMonths()); 
     assertEquals(12, test.getMonths()); 
     assertEquals(4, test.dividedBy(3).getMonths()); 
     assertEquals(3, test.dividedBy(4).getMonths()); 
     assertEquals(2, test.dividedBy(5).getMonths()); 
     assertEquals(2, test.dividedBy(6).getMonths()); 
     assertSame(test, test.dividedBy(1)); 
     try { 
         Months.ONE.dividedBy(0); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testIsLessThan324() { 
     assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     assertEquals(false, Months.ONE.isLessThan(null)); 
     assertEquals(true, Months.months(-1).isLessThan(null)); 
 } 


public void testToString325() { 
     Months test = Months.months(20); 
     assertEquals("P20M", test.toString()); 
     test = Months.months(-20); 
     assertEquals("P-20M", test.toString()); 
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
