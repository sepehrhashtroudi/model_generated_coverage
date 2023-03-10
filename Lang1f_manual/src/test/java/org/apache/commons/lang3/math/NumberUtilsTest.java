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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {

    //-----------------------------------------------------------------------
@Test
public void testToLongString9() { 
     assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345L); 
     assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0); 
     assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0); 
     assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0); 
 }
@Test
public void testToShortString109() { 
     assertTrue("toShort(String) 1 failed", NumberUtils.toShort("12345") == 12345); 
     assertTrue("toShort(String) 2 failed", NumberUtils.toShort("abc") == 0); 
     assertTrue("toShort(empty) failed", NumberUtils.toShort("") == 0); 
     assertTrue("toShort(null) failed", NumberUtils.toShort(null) == 0); 
 }
//@Test
//public void testIsNumber110() {
//     assertFalse(StringUtils.is(null));
//     assertFalse(StringUtils.isNumber(""));
//     assertFalse(StringUtils.isNumber(" "));
//     assertFalse(StringUtils.isNumber("a"));
//     assertFalse(StringUtils.isNumber("A"));
//     assertFalse(StringUtils.isNumber("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
//     assertFalse(StringUtils.isNumber("ham kso"));
//     assertTrue(StringUtils.isNumber("1"));
//     assertTrue(StringUtils.isNumber("1000"));
//     assertFalse(StringUtils.isNumber("2.3"));
//     assertFalse(StringUtils.isNumber("10 00"));
//     assertFalse(StringUtils.isNumber("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
//     assertFalse(StringUtils.isNumber("_"));
//     assertFalse(StringUtils.isNumber("hkHKHik*khbkuh"));
//     assertFalse(StringUtils.isNumber("+123"));
//     assertFalse(StringUtils.isNumber("-123"));
// }
@Test
public void testToLongString165() { 
     assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345L); 
     assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0L); 
     assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0L); 
     assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0L); 
 }
@Test
public void TestLang747() {
    assertEquals(Integer.valueOf(0x8000), NumberUtils.createNumber("0x8000"));
    assertEquals(Integer.valueOf(0x80000), NumberUtils.createNumber("0x80000"));
    assertEquals(Integer.valueOf(0x800000), NumberUtils.createNumber("0x800000"));
    assertEquals(Integer.valueOf(0x8000000), NumberUtils.createNumber("0x8000000"));
    assertEquals(Integer.valueOf(0x7FFFFFFF), NumberUtils.createNumber("0x7FFFFFFF"));
    assertEquals(Long.valueOf(0x80000000L), NumberUtils.createNumber("0x80000000"));
    assertEquals(Long.valueOf(0xFFFFFFFFL), NumberUtils.createNumber("0xFFFFFFFF"));
    assertEquals(Integer.valueOf(0x8000000), NumberUtils.createNumber("0x08000000"));
    assertEquals(Integer.valueOf(0x7FFFFFFF), NumberUtils.createNumber("0x007FFFFFFF"));
    assertEquals(Long.valueOf(0x80000000L), NumberUtils.createNumber("0x080000000"));
    assertEquals(Long.valueOf(0xFFFFFFFFL), NumberUtils.createNumber("0x00FFFFFFFF"));
    assertEquals(Long.valueOf(0x800000000L), NumberUtils.createNumber("0x800000000"));
    assertEquals(Long.valueOf(0x8000000000L), NumberUtils.createNumber("0x8000000000"));
    assertEquals(Long.valueOf(0x80000000000L), NumberUtils.createNumber("0x80000000000"));
    assertEquals(Long.valueOf(0x800000000000L), NumberUtils.createNumber("0x800000000000"));
    assertEquals(Long.valueOf(0x8000000000000L), NumberUtils.createNumber("0x8000000000000"));
}
@Test(expected = NumberFormatException.class)
 public void testCreateNumberFailure_4434() { 
     NumberUtils.createNumber("1eE+00001"); 
 }
@Test
public void testCreateNumber435() {
        assertEquals("createNumber(String) 1 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5"));
        assertEquals("createNumber(String) 2 failed", Integer.valueOf("12345"), NumberUtils.createNumber("12345"));
        assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5D"));
        assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5d"));
        assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5F"));
        assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5f"));
        assertEquals("createNumber(String) 5 failed", Long.valueOf(Integer.MAX_VALUE + 1L), NumberUtils.createNumber("" + (Integer.MAX_VALUE + 1L)));
        assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345L"));
        assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345l"));
        assertEquals("createNumber(String) 7 failed", Float.valueOf("-1234.5"), NumberUtils.createNumber("-1234.5"));
        assertEquals("createNumber(String) 8 failed", Integer.valueOf("-12345"), NumberUtils.createNumber("-12345"));
        assertTrue("createNumber(String) 9a failed", 0xFADE == NumberUtils.createNumber("0xFADE").intValue());
        assertTrue("createNumber(String) 9b failed", 0xFADE == NumberUtils.createNumber("0Xfade").intValue());
    }
@Test
public void testStringCreateNumberEnsureNoPrecisionLoss436() { 
     String shouldBeFloat = "1.23"; 
     String shouldBeDouble = "3.40282354e+38"; 
     String shouldBeBigDecimal = "1.797693134862315759e+308"; 
     assertTrue(NumberUtils.createNumber(shouldBeFloat) instanceof Float); 
     assertTrue(NumberUtils.createNumber(shouldBeDouble) instanceof Double); 
     assertTrue(NumberUtils.createNumber(shouldBeBigDecimal) instanceof BigDecimal); 
 }
@Test
public void testCreateBigDecimal437() { 
     assertEquals("createBigDecimal(String) failed", new BigDecimal("1234.5"), NumberUtils.createBigDecimal("1234.5")); 
     assertEquals("createBigDecimal(null) failed", null, NumberUtils.createBigDecimal(null)); 
     this.testCreateBigDecimalFailure(""); 
     this.testCreateBigDecimalFailure(" "); 
     this.testCreateBigDecimalFailure("\b\t\n\f\r"); 
     this.testCreateBigDecimalFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F"); 
     this.testCreateBigDecimalFailure("-"); 
     this.testCreateBigDecimalFailure("--"); 
     this.testCreateBigDecimalFailure("--0"); 
     this.testCreateBigDecimalFailure("+"); 
     this.testCreateBigDecimalFailure("++"); 
     this.testCreateBigDecimalFailure("++0"); 
 }

    

    //---------------------------------------------------------------------

    /**
     * Test for {@link NumberUtils#toInt(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toInt(String, int)}.
     */
    

    /**
     * Test for {@link NumberUtils#toLong(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toLong(String, long)}.
     */
    

    /**
     * Test for {@link NumberUtils#toFloat(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toFloat(String, float)}.
     */
    
    
    /**
     * Test for {(@link NumberUtils#createNumber(String)}
     */
    
    /**
     * Test for {@link NumberUtils#toDouble(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toDouble(String, double)}.
     */
    

     /**
     * Test for {@link NumberUtils#toByte(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toByte(String, byte)}.
     */
    

    /**
     * Test for {@link NumberUtils#toShort(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toShort(String, short)}.
     */
    

    

    

    

    

    

    

    // Tests to show when magnitude causes switch to next Number type
    // Will probably need to be adjusted if code is changed to check precision (LANG-693)
    

    

    protected void testCreateFloatFailure(final String str) {
        try {
            final Float value = NumberUtils.createFloat(str);
            fail("createFloat(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateDoubleFailure(final String str) {
        try {
            final Double value = NumberUtils.createDouble(str);
            fail("createDouble(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateIntegerFailure(final String str) {
        try {
            final Integer value = NumberUtils.createInteger(str);
            fail("createInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateLongFailure(final String str) {
        try {
            final Long value = NumberUtils.createLong(str);
            fail("createLong(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateBigIntegerFailure(final String str) {
        try {
            final BigInteger value = NumberUtils.createBigInteger(str);
            fail("createBigInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateBigDecimalFailure(final String str) {
        try {
            final BigDecimal value = NumberUtils.createBigDecimal(str);
            fail("createBigDecimal(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    // min/max tests
    // ----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    // Testing JDK against old Lang functionality
    

    

    

    /**
     * Tests isNumber(String) and tests that createNumber(String) returns
     * a valid number iff isNumber(String) returns false.
     */
    

    private boolean checkCreateNumber(final String val) {
        try {
            final Object obj = NumberUtils.createNumber(val);
            if (obj == null) {
                return false;
            }
            return true;
        } catch (final NumberFormatException e) {
            return false;
       }
    }

    

    

    

}
