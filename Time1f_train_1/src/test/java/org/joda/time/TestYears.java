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
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestYears.class);
    }

    public TestYears(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testToString672() { 
     Years test = Years.years(20); 
     assertEquals("P20Y", test.toString()); 
     test = Years.years(-20); 
     assertEquals("P-20Y", test.toString()); 
 } 


public void testFactory_yearsBetween_RInstant673() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 } 


public void testFactory_years_int674() { 
     assertSame(Years.ZERO, Years.years(0)); 
     assertSame(Years.ONE, Years.years(1)); 
     assertSame(Years.TWO, Years.years(2)); 
     assertSame(Years.THREE, Years.years(3)); 
     assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE)); 
     assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE)); 
     assertEquals(-1, Years.years(-1).getYears()); 
     assertEquals(4, Years.years(4).getYears()); 
 } 


@SuppressWarnings("deprecation") 
 public void testFactory_yearsBetween_RPartial675() { 
     LocalDate start = new LocalDate(2006, 6, 9); 
     LocalDate end1 = new LocalDate(2009, 6, 9); 
     YearMonthDay end2 = new YearMonthDay(2012, 6, 9); 
     assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 } 


public void testFactory_yearsIn_RInterval676() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 } 


public void testSerialization678() throws Exception { 
     Years test = Years.THREE; 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     Years result = (Years) ois.readObject(); 
     ois.close(); 
     assertSame(test, result); 
 } 


public void testGetFieldType679() { 
     Years test = Years.years(20); 
     assertEquals(DurationFieldType.years(), test.getFieldType()); 
 } 


public void testGetPeriodType680() { 
     Years test = Years.years(20); 
     assertEquals(PeriodType.years(), test.getPeriodType()); 
 } 


public void testPlus_Years681() { 
     Years test2 = Years.years(2); 
     Years test3 = Years.years(3); 
     Years result = test2.plus(test3); 
     assertEquals(2, test2.getYears()); 
     assertEquals(3, test3.getYears()); 
     assertEquals(5, result.getYears()); 
     assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     try { 
         Years.MAX_VALUE.plus(Years.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testMinus_int682() { 
     Years test2 = Years.years(2); 
     Years result = test2.minus(3); 
     assertEquals(2, test2.getYears()); 
     assertEquals(-1, result.getYears()); 
     assertEquals(1, Years.ONE.minus(0).getYears()); 
     try { 
         Years.MIN_VALUE.minus(1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testMinus_Years683() { 
     Years test2 = Years.years(2); 
     Years test3 = Years.years(3); 
     Years result = test2.minus(test3); 
     assertEquals(2, test2.getYears()); 
     assertEquals(3, test3.getYears()); 
     assertEquals(-1, result.getYears()); 
     assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     try { 
         Years.MIN_VALUE.minus(Years.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testDividedBy_int684() { 
     Years test = Years.years(12); 
     assertEquals(6, test.dividedBy(2).getYears()); 
     assertEquals(12, test.getYears()); 
     assertEquals(4, test.dividedBy(3).getYears()); 
     assertEquals(3, test.dividedBy(4).getYears()); 
     assertEquals(2, test.dividedBy(5).getYears()); 
     assertEquals(2, test.dividedBy(6).getYears()); 
     assertSame(test, test.dividedBy(1)); 
     try { 
         Years.ONE.dividedBy(0); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testNegated685() { 
     Years test = Years.years(12); 
     assertEquals(-12, test.negated().getYears()); 
     assertEquals(12, test.getYears()); 
     try { 
         Years.MIN_VALUE.negated(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testIsGreaterThan686() { 
     assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     assertEquals(true, Years.ONE.isGreaterThan(null)); 
     assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 } 


public void testIsLessThan687() { 
     assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     assertEquals(false, Years.ONE.isLessThan(null)); 
     assertEquals(true, Years.years(-1).isLessThan(null)); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
