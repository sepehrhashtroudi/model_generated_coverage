/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 *
 * @version $Id$
 */
public class FractionTest  {
    
    private static final int SKIP = 500;  //53

    //--------------------------------------------------------------------------
@Test
public void testFactory_int_int248() { 
     Fraction f = null; 
     f = Fraction.getFraction(0, 1); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction(1, 1); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(2, 1); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(23, 345); 
     assertEquals(23, f.getNumerator()); 
     assertEquals(345, f.getDenominator()); 
     f = Fraction.getFraction(22, 7); 
     assertEquals(22, f.getNumerator()); 
     assertEquals(7, f.getDenominator()); 
     f = Fraction.getFraction(-6, 10); 
     assertEquals(-6, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     f = Fraction.getFraction(6, -10); 
     assertEquals(-6, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     f = Fraction.getFraction(-6, -10); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     try { 
         f = Fraction.getFraction(1, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(2, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-3, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(4, Integer.MIN_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(1, Integer.MIN_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testAbs249() { 
     Fraction f = null; 
     f = Fraction.getFraction(50, 75); 
     f = f.abs(); 
     assertEquals(50, f.getNumerator()); 
     assertEquals(75, f.getDenominator()); 
     f = Fraction.getFraction(-50, 75); 
     f = f.abs(); 
     assertEquals(50, f.getNumerator()); 
     assertEquals(75, f.getDenominator()); 
     f = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     f = f.abs(); 
     assertEquals(Integer.MAX_VALUE, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(Integer.MAX_VALUE, -1); 
     f = f.abs(); 
     assertEquals(Integer.MAX_VALUE, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 1); 
     try { 
         f = f.abs(); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testToProperString250() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     final String str = f.toProperString(); 
     assertEquals("3/5", str); 
     assertSame(str, f.toProperString()); 
     f = Fraction.getFraction(7, 5); 
     assertEquals("1 2/5", f.toProperString()); 
     f = Fraction.getFraction(14, 10); 
     assertEquals("1 4/10", f.toProperString()); 
     f = Fraction.getFraction(4, 2); 
     assertEquals("2", f.toProperString()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals("0", f.toProperString()); 
     f = Fraction.getFraction(2, 2); 
     assertEquals("1", f.toProperString()); 
     f = Fraction.getFraction(-7, 5); 
     assertEquals("-1 2/5", f.toProperString()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1); 
     assertEquals("-2147483648", f.toProperString()); 
     f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertEquals("-1 1/2147483647", f.toProperString()); 
     assertEquals("-1", Fraction.getFraction(-1).toProperString()); 
 }
@Test
public void testFactory_int_int_int251() { 
     Fraction f = null; 
     f = Fraction.getFraction(0, 0, 2); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction(2, 0, 2); 
     assertEquals(4, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction(0, 1, 2); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction(1, 1, 2); 
     assertEquals(3, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     try { 
         f = Fraction.getFraction(1, -6, -10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(1, -6, -10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(1, -6, -10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(-1, 6, 10); 
     assertEquals(-16, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     try { 
         f = Fraction.getFraction(-1, -6, 10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-1, 6, -10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-1, -6, -10); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(0, 1, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(1, 2, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-1, -3, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(Integer.MAX_VALUE, 1, 2); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-Integer.MAX_VALUE, 1, 2); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(-1, 0, Integer.MAX_VALUE); 
     assertEquals(-Integer.MAX_VALUE, f.getNumerator()); 
     assertEquals(Integer.MAX_VALUE, f.getDenominator()); 
     try { 
         f = Fraction.getFraction(0, 4, Integer.MIN_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(1, 1, Integer.MAX_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-1, 2, Integer.MAX_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testFactory_String_double252() { 
     Fraction f = null; 
     f = Fraction.getFraction("0.0"); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction("0.2"); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f = Fraction.getFraction("0.5"); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction("0.66666"); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     try { 
         f = Fraction.getFraction("2.3R"); 
         fail("Expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("2147483648"); 
         fail("Expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("."); 
         fail("Expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
 }
@Test
public void testReducedFactory_int_int253() { 
     Fraction f = null; 
     f = Fraction.getReducedFraction(0, 1); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getReducedFraction(1, 1); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getReducedFraction(2, 1); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getReducedFraction(22, 7); 
     assertEquals(22, f.getNumerator()); 
     assertEquals(7, f.getDenominator()); 
     f = Fraction.getReducedFraction(-6, 10); 
     assertEquals(-3, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f = Fraction.getReducedFraction(6, -10); 
     assertEquals(-3, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f = Fraction.getReducedFraction(-6, -10); 
     assertEquals(3, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     try { 
         f = Fraction.getReducedFraction(1, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getReducedFraction(2, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getReducedFraction(-3, 0); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getReducedFraction(0, 2); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getReducedFraction(2, 2); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getReducedFraction(2, 4); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getReducedFraction(15, 10); 
     assertEquals(3, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getReducedFraction(121, 22); 
     assertEquals(11, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getReducedFraction(-2, Integer.MIN_VALUE); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator()); 
     try { 
         f = Fraction.getReducedFraction(-7, Integer.MIN_VALUE); 
         fail("Expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2); 
     assertEquals(Integer.MIN_VALUE / 2, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testFactory_String254() { 
     Fraction.getFraction(null); 
 }
@Test
public void testFactory_String_proper255() { 
     Fraction f = null; 
     f = Fraction.getFraction("0 0/1"); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction("1 1/5"); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f = Fraction.getFraction("7 1/2"); 
     assertEquals(15, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction("1 2/4"); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     f = Fraction.getFraction("-7 1/2"); 
     assertEquals(-15, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction("-1 2/4"); 
     assertEquals(-6, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     try { 
         f = Fraction.getFraction("2 3"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("a 3"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("2 b/4"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("2 "); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction(" 3"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction(" "); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
 }
@Test
public void testFactory_String_improper256() { 
     Fraction f = null; 
     f = Fraction.getFraction("0/1"); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction("1/5"); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f = Fraction.getFraction("1/2"); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction("2/3"); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     f = Fraction.getFraction("7/3"); 
     assertEquals(7, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     f = Fraction.getFraction("2/4"); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     try { 
         f = Fraction.getFraction("2/d"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("2e/3"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("2/"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
     try { 
         f = Fraction.getFraction("/"); 
         fail("expecting NumberFormatException"); 
     } catch (final NumberFormatException ex) { 
     } 
 }
@Test
public void testConversions257() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 7, 8); 
     assertEquals(3, f.intValue()); 
     assertEquals(3L, f.longValue()); 
     assertEquals(3.875f, f.floatValue(), 0.00001f); 
     assertEquals(3.875d, f.doubleValue(), 0.00001d); 
 }
@Test
public void testReduce258() { 
     Fraction f = null; 
     f = Fraction.getFraction(50, 75); 
     Fraction result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(-2, -3); 
     result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(2, -3); 
     result = f.reduce(); 
     assertEquals(-2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(-2, 3); 
     result = f.reduce(); 
     assertEquals(-2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(2, 3); 
     result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(0, 1); 
     result = f.reduce(); 
     assertEquals(0, result.getNumerator()); 
     assertEquals(1, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(0, 100); 
     result = f.reduce(); 
     assertEquals(0, result.getNumerator()); 
     assertEquals(1, result.getDenominator()); 
     assertSame(result, Fraction.ZERO); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 2); 
     result = f.reduce(); 
     assertEquals(Integer.MIN_VALUE / 2, result.getNumerator()); 
     assertEquals(1, result.getDenominator()); 
 }
@Test
public void testPow259() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     assertEquals(Fraction.ONE, f.pow(0)); 
     f = Fraction.getFraction(3, 5); 
     assertSame(f, f.pow(1)); 
     assertEquals(f, f.pow(1)); 
     f = Fraction.getFraction(3, 5); 
     f = f.pow(2); 
     assertEquals(9, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f = Fraction.getFraction(3, 5); 
     f = f.pow(3); 
     assertEquals(27, f.getNumerator()); 
     assertEquals(125, f.getDenominator()); 
     f = Fraction.getFraction(3, 5); 
     f = f.pow(-1); 
     assertEquals(5, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     f = Fraction.getFraction(3, 5); 
     f = f.pow(-2); 
     assertEquals(25, f.getNumerator()); 
     assertEquals(9, f.getDenominator()); 
     f = Fraction.getFraction(6, 10); 
     assertEquals(Fraction.ONE, f.pow(0)); 
     f = Fraction.getFraction(6, 10); 
     assertEquals(f, f.pow(1)); 
     assertFalse(f.pow(1).equals(Fraction.getFraction(3, 5))); 
     f = Fraction.getFraction(6, 10); 
     f = f.pow(2); 
     assertEquals(9, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f = Fraction.getFraction(6, 10); 
     f = f.pow(3); 
     assertEquals(27, f.getNumerator()); 
     assertEquals(125, f.getDenominator()); 
     f = Fraction.getFraction(6, 10); 
     f = f.pow(-1); 
     assertEquals(10, f.getNumerator()); 
     assertEquals(6, f.getDenominator()); 
     f = Fraction.getFraction(6, 10); 
     f = f.pow(-2); 
     assertEquals(25, f.getNumerator()); 
     assertEquals(9, f.getDenominator()); 
     f = Fraction.getFraction(0, 1231); 
     f = f.pow(1); 
     assertTrue(0 == f.compareTo(Fraction.ZERO)); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1231, f.getDenominator()); 
     f = f.pow(2); 
     assertTrue(0 == f.compareTo(Fraction.ZERO)); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     try { 
         f = f.pow(-1); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = f.pow(Integer.MIN_VALUE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(1, 1); 
     f = f.pow(0); 
     assertEquals(f, Fraction.ONE); 
     f = f.pow(1); 
     assertEquals(f, Fraction.ONE); 
     f = f.pow(-1); 
     assertEquals(f, Fraction.ONE); 
     f = f.pow(Integer.MAX_VALUE); 
     assertEquals(f, Fraction.ONE); 
     f = f.pow(Integer.MIN_VALUE); 
     assertEquals(f, Fraction.ONE); 
     f = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     try { 
         f = f.pow(2); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(Integer.MIN_VALUE, 1); 
     try { 
         f = f.pow(3); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(65536, 1); 
     try { 
         f = f.pow(2); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testInvert260() { 
     Fraction f = null; 
     f = Fraction.getFraction(50, 75); 
     f = f.invert(); 
     assertEquals(75, f.getNumerator()); 
     assertEquals(50, f.getDenominator()); 
     f = Fraction.getFraction(4, 3); 
     f = f.invert(); 
     assertEquals(3, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     f = Fraction.getFraction(-15, 47); 
     f = f.invert(); 
     assertEquals(-47, f.getNumerator()); 
     assertEquals(15, f.getDenominator()); 
     f = Fraction.getFraction(0, 3); 
     try { 
         f = f.invert(); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(Integer.MIN_VALUE, 1); 
     try { 
         f = f.invert(); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     f = f.invert(); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(Integer.MAX_VALUE, f.getDenominator()); 
 }
@Test
public void testAdd261() { 
     Fraction f = null; 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(1, 5); 
     f = f1.add(f2); 
     assertEquals(4, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(2, 5); 
     f = f1.add(f2); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(3, 5); 
     f = f1.add(f2); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(-4, 5); 
     f = f1.add(f2); 
     assertEquals(-1, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1); 
     f2 = Fraction.ONE; 
     f = f1.add(f2); 
     assertEquals(Integer.MAX_VALUE, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(1, 2); 
     f = f1.add(f2); 
     assertEquals(11, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 8); 
     f2 = Fraction.getFraction(1, 6); 
     f = f1.add(f2); 
     assertEquals(13, f.getNumerator()); 
     assertEquals(24, f.getDenominator()); 
     f1 = Fraction.getFraction(0, 5); 
     f2 = Fraction.getFraction(1, 5); 
     f = f1.add(f2); 
     assertSame(f2, f); 
     f = f2.add(f1); 
     assertSame(f2, f); 
     f1 = Fraction.getFraction(-1, 13 * 13 * 2 * 2); 
     f2 = Fraction.getFraction(-2, 13 * 17 * 2); 
     f = f1.add(f2); 
     assertEquals(13 * 13 * 17 * 2 * 2, f.getDenominator()); 
     assertEquals(-17 - 2 * 13 * 2, f.getNumerator()); 
     try { 
         f.add(null); 
         fail("expecting IllegalArgumentException"); 
     } catch (final IllegalArgumentException ex) { 
     } 
     f1 = Fraction.getFraction(1, 32768 * 3); 
     f2 = Fraction.getFraction(1, 59049); 
     f = f1.add(f2); 
     assertEquals(52451, f.getNumerator()); 
     assertEquals(1934917632, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MIN_VALUE, 3); 
     f2 = Fraction.ONE_THIRD; 
     f = f1.add(f2); 
     assertEquals(Integer.MIN_VALUE + 1, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1); 
     f2 = Fraction.ONE; 
     f = f1.add(f2); 
     assertEquals(Integer.MAX_VALUE, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     try { 
         f = f.add(Fraction.ONE); 
         fail("expecting ArithmeticException but got: " + f.toString()); 
     } catch (final ArithmeticException ex) { 
     } 
     f1 = Fraction.getFraction(Integer.MIN_VALUE, 5); 
     f2 = Fraction.getFraction(-1, 5); 
     try { 
         f = f1.add(f2); 
         fail("expecting ArithmeticException but got: " + f.toString()); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-Integer.MAX_VALUE, 1); 
         f = f.add(f); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(-Integer.MAX_VALUE, 1); 
         f = f.add(f); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f1 = Fraction.getFraction(3, 327680); 
     f2 = Fraction.getFraction(2, 59049); 
     try { 
         f = f1.add(f2); 
         fail("expecting ArithmeticException but got: " + f.toString()); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testSubtract262() { 
     Fraction f = null; 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(1, 5); 
     f = f1.subtract(f2); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(7, 5); 
     f2 = Fraction.getFraction(2, 5); 
     f = f1.subtract(f2); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(3, 5); 
     f = f1.subtract(f2); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(-4, 5); 
     f = f1.subtract(f2); 
     assertEquals(7, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(0, 5); 
     f2 = Fraction.getFraction(4, 5); 
     f = f1.subtract(f2); 
     assertEquals(-4, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(0, 5); 
     f2 = Fraction.getFraction(-4, 5); 
     f = f1.subtract(f2); 
     assertEquals(4, f.getNumerator()); 
     assertEquals(5, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(1, 2); 
     f = f1.subtract(f2); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(10, f.getDenominator()); 
     f1 = Fraction.getFraction(0, 5); 
     f2 = Fraction.getFraction(1, 5); 
     f = f2.subtract(f1); 
     assertSame(f2, f); 
     try { 
         f.subtract(null); 
         fail("expecting IllegalArgumentException"); 
     } catch (final IllegalArgumentException ex) { 
     } 
     f1 = Fraction.getFraction(1, 32768 * 3); 
     f2 = Fraction.getFraction(1, 59049); 
     f = f1.subtract(f2); 
     assertEquals(-13085, f.getNumerator()); 
     assertEquals(1934917632, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MIN_VALUE, 3); 
     f2 = Fraction.ONE_THIRD.negate(); 
     f = f1.subtract(f2); 
     assertEquals(Integer.MIN_VALUE + 1, f.getNumerator()); 
     assertEquals(3, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     f2 = Fraction.ONE; 
     f = f1.subtract(f2); 
     assertEquals(Integer.MAX_VALUE - 1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     try { 
         f1 = Fraction.getFraction(1, Integer.MAX_VALUE); 
         f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1); 
         f = f1.subtract(f2); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f1 = Fraction.getFraction(Integer.MIN_VALUE, 5); 
     f2 = Fraction.getFraction(1, 5); 
     try { 
         f = f1.subtract(f2); 
         fail("expecting ArithmeticException but got: " + f.toString()); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(Integer.MIN_VALUE, 1); 
         f = f.subtract(Fraction.ONE); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(Integer.MAX_VALUE, 1); 
         f = f.subtract(Fraction.ONE.negate()); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f1 = Fraction.getFraction(3, 327680); 
     f2 = Fraction.getFraction(2, 59049); 
     try { 
         f = f1.subtract(f2); 
         fail("expecting ArithmeticException but got: " + f.toString()); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testMultiply263() { 
     Fraction f = null; 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(2, 5); 
     f = f1.multiplyBy(f2); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f1 = Fraction.getFraction(6, 10); 
     f2 = Fraction.getFraction(6, 10); 
     f = f1.multiplyBy(f2); 
     assertEquals(9, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f = f.multiplyBy(f2); 
     assertEquals(27, f.getNumerator()); 
     assertEquals(125, f.getDenominator()); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(-2, 5); 
     f = f1.multiplyBy(f2); 
     assertEquals(-6, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f1 = Fraction.getFraction(-3, 5); 
     f2 = Fraction.getFraction(-2, 5); 
     f = f1.multiplyBy(f2); 
     assertEquals(6, f.getNumerator()); 
     assertEquals(25, f.getDenominator()); 
     f1 = Fraction.getFraction(0, 5); 
     f2 = Fraction.getFraction(2, 7); 
     f = f1.multiplyBy(f2); 
     assertSame(Fraction.ZERO, f); 
     f1 = Fraction.getFraction(2, 7); 
     f2 = Fraction.ONE; 
     f = f1.multiplyBy(f2); 
     assertEquals(2, f.getNumerator()); 
     assertEquals(7, f.getDenominator()); 
     f1 = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     f2 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE); 
     f = f1.multiplyBy(f2); 
     assertEquals(Integer.MIN_VALUE, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     try { 
         f.multiplyBy(null); 
         fail("expecting IllegalArgumentException"); 
     } catch (final IllegalArgumentException ex) { 
     } 
     try { 
         f1 = Fraction.getFraction(1, Integer.MAX_VALUE); 
         f = f1.multiplyBy(f1); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f1 = Fraction.getFraction(1, -Integer.MAX_VALUE); 
         f = f1.multiplyBy(f1); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
 }
@Test
public void testEquals264() { 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     assertFalse(f1.equals(null)); 
     assertFalse(f1.equals(new Object())); 
     assertFalse(f1.equals(Integer.valueOf(6))); 
     f1 = Fraction.getFraction(3, 5); 
     f2 = Fraction.getFraction(2, 5); 
     assertFalse(f1.equals(f2)); 
     assertTrue(f1.equals(f1)); 
     assertTrue(f2.equals(f2)); 
     f2 = Fraction.getFraction(3, 5); 
     assertTrue(f1.equals(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertFalse(f1.equals(f2)); 
 }
@Test
public void testCompareTo265() { 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     assertTrue(f1.compareTo(f1) == 0); 
     try { 
         f1.compareTo(null); 
         fail("expecting NullPointerException"); 
     } catch (final NullPointerException ex) { 
     } 
     f2 = Fraction.getFraction(2, 5); 
     assertTrue(f1.compareTo(f2) > 0); 
     assertTrue(f2.compareTo(f2) == 0); 
     f2 = Fraction.getFraction(4, 5); 
     assertTrue(f1.compareTo(f2) < 0); 
     assertTrue(f2.compareTo(f2) == 0); 
     f2 = Fraction.getFraction(3, 5); 
     assertTrue(f1.compareTo(f2) == 0); 
     assertTrue(f2.compareTo(f2) == 0); 
     f2 = Fraction.getFraction(6, 10); 
     assertTrue(f1.compareTo(f2) == 0); 
     assertTrue(f2.compareTo(f2) == 0); 
     f2 = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertTrue(f1.compareTo(f2) > 0); 
     assertTrue(f2.compareTo(f2) == 0); 
 }
@Test
public void testToString266() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     final String str = f.toString(); 
     assertEquals("3/5", str); 
     assertSame(str, f.toString()); 
     f = Fraction.getFraction(7, 5); 
     assertEquals("7/5", f.toString()); 
     f = Fraction.getFraction(4, 2); 
     assertEquals("4/2", f.toString()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals("0/2", f.toString()); 
     f = Fraction.getFraction(2, 2); 
     assertEquals("2/2", f.toString()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1); 
     assertEquals("-2147483648/1", f.toString()); 
     f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertEquals("-2147483648/2147483647", f.toString()); 
 }
    

    

    
    

    

    
    
    
    

    

    

    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    
            
    
            
    
            
    
    
    
    
    
    
    
    
    
}
