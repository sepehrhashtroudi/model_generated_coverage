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

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {

    //-----------------------------------------------------------------------
@Test
public void testToIntStringI55() { 
     assertTrue("toInt(String,int) 1 failed", NumberUtils.toInt("12345", 5) == 12345); 
     assertTrue("toInt(String,int) 2 failed", NumberUtils.toInt("1234.5", 5) == 5); 
 }
@Test
public void testToLongString56() { 
     assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345l); 
     assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0l); 
     assertTrue("toLong(String) 3 failed", NumberUtils.toLong("1L") == 0l); 
     assertTrue("toLong(String) 4 failed", NumberUtils.toLong("1l") == 0l); 
     assertTrue("toLong(Long.MAX_VALUE) failed", NumberUtils.toLong(Long.MAX_VALUE + "") == Long.MAX_VALUE); 
     assertTrue("toLong(Long.MIN_VALUE) failed", NumberUtils.toLong(Long.MIN_VALUE + "") == Long.MIN_VALUE); 
     assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0l); 
     assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0l); 
 }
@Test
public void testToFloatString57() { 
     assertTrue("toFloat(String) 1 failed", NumberUtils.toFloat("-1.2345") == -1.2345f); 
     assertTrue("toFloat(String) 2 failed", NumberUtils.toFloat("1.2345") == 1.2345f); 
     assertTrue("toFloat(String) 3 failed", NumberUtils.toFloat("abc") == 0.0f); 
     assertTrue("toFloat(Float.MAX_VALUE) failed", NumberUtils.toFloat(Float.MAX_VALUE + "") == Float.MAX_VALUE); 
     assertTrue("toFloat(Float.MIN_VALUE) failed", NumberUtils.toFloat(Float.MIN_VALUE + "") == Float.MIN_VALUE); 
     assertTrue("toFloat(empty) failed", NumberUtils.toFloat("") == 0.0f); 
     assertTrue("toFloat(null) failed", NumberUtils.toFloat(null) == 0.0f); 
 }
@Test
public void testStringToDoubleString58() { 
     assertTrue("toDouble(String) 1 failed", NumberUtils.toDouble("-1.2345") == -1.2345d); 
     assertTrue("toDouble(String) 2 failed", NumberUtils.toDouble("1.2345") == 1.2345d); 
     assertTrue("toDouble(String) 3 failed", NumberUtils.toDouble("abc") == 0.0d); 
     assertTrue("toDouble(Double.MAX_VALUE) failed", NumberUtils.toDouble(Double.MAX_VALUE + "") == Double.MAX_VALUE); 
     assertTrue("toDouble(Double.MIN_VALUE) failed", NumberUtils.toDouble(Double.MIN_VALUE + "") == Double.MIN_VALUE); 
     assertTrue("toDouble(empty) failed", NumberUtils.toDouble("") == 0.0d); 
     assertTrue("toDouble(null) failed", NumberUtils.toDouble(null) == 0.0d); 
 }
@Test
public void testToByteStringI59() { 
     assertTrue("toByte(String,byte) 1 failed", NumberUtils.toByte("123", (byte) 5) == 123); 
     assertTrue("toByte(String,byte) 2 failed", NumberUtils.toByte("12.3", (byte) 5) == 5); 
 }
@Test(expected = NumberFormatException.class) 
 public void testCreateNumberFailure_460() { 
     NumberUtils.createNumber("1eE+00001"); 
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
     assertEquals(Long.valueOf(0x80000000000000L), NumberUtils.createNumber("0x80000000000000")); 
     assertEquals(Long.valueOf(0x800000000000000L), NumberUtils.createNumber("0x800000000000000")); 
     assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x7FFFFFFFFFFFFFFF")); 
     assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x8000000000000000")); 
     assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0xFFFFFFFFFFFFFFFF")); 
     assertEquals(Long.valueOf(0x80000000000000L), NumberUtils.createNumber("0x00080000000000000")); 
     assertEquals(Long.valueOf(0x800000000000000L), NumberUtils.createNumber("0x0800000000000000")); 
     assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x07FFFFFFFFFFFFFFF")); 
     assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x00008000000000000000")); 
     assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0x0FFFFFFFFFFFFFFFF")); 
 }
@Test(expected = NumberFormatException.class) 
 public void testCreateNumberFailure_361() { 
     NumberUtils.createNumber("-11E+0-7e00"); 
 }
@Test
public void testCreateNumber62() { 
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
     assertTrue("createNumber(String) 10a failed", -0xFADE == NumberUtils.createNumber("-0xFADE").intValue()); 
     assertTrue("createNumber(String) 10b failed", -0xFADE == NumberUtils.createNumber("-0Xfade").intValue()); 
     assertEquals("createNumber(String) 11 failed", Double.valueOf("1.1E200"), NumberUtils.createNumber("1.1E200")); 
     assertEquals("createNumber(String) 12 failed", Float.valueOf("1.1E20"), NumberUtils.createNumber("1.1E20")); 
     assertEquals("createNumber(String) 13 failed", Double.valueOf("-1.1E200"), NumberUtils.createNumber("-1.1E200")); 
     assertEquals("createNumber(String) 14 failed", Double.valueOf("1.1E-200"), NumberUtils.createNumber("1.1E-200")); 
     assertEquals("createNumber(null) failed", null, NumberUtils.createNumber(null)); 
     assertEquals("createNumber(String) failed", new BigInteger("12345678901234567890"), NumberUtils.createNumber("12345678901234567890L")); 
     assertEquals("createNumber(String) 15 failed", new BigDecimal("1.1E-700"), NumberUtils.createNumber("1.1E-700F")); 
     assertEquals("createNumber(String) 16 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils.createNumber("10" + Integer.MAX_VALUE + "L")); 
     assertEquals("createNumber(String) 17 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils.createNumber("10" + Integer.MAX_VALUE)); 
     assertEquals("createNumber(String) 18 failed", new BigInteger("10" + Long.MAX_VALUE), NumberUtils.createNumber("10" + Long.MAX_VALUE)); 
     assertEquals("createNumber(String) LANG-521 failed", Float.valueOf("2."), NumberUtils.createNumber("2.")); 
     assertFalse("createNumber(String) succeeded", checkCreateNumber("1eE")); 
     assertEquals("createNumber(String) LANG-693 failed", Double.valueOf(Double.MAX_VALUE), NumberUtils.createNumber("" + Double.MAX_VALUE)); 
     final Number bigNum = NumberUtils.createNumber("-1.1E-700F"); 
     assertNotNull(bigNum); 
     assertEquals(BigDecimal.class, bigNum.getClass()); 
 }
@Test
public void testCreateFloat63() { 
     assertEquals("createFloat(String) failed", Float.valueOf("1234.5"), NumberUtils.createFloat("1234.5")); 
     assertEquals("createFloat(null) failed", null, NumberUtils.createFloat(null)); 
     this.testCreateFloatFailure(""); 
     this.testCreateFloatFailure(" "); 
     this.testCreateFloatFailure("\b\t\n\f\r"); 
     this.testCreateFloatFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F"); 
 }
@Test
public void testCreateDouble64() { 
     assertEquals("createDouble(String) failed", Double.valueOf("1234.5"), NumberUtils.createDouble("1234.5")); 
     assertEquals("createDouble(null) failed", null, NumberUtils.createDouble(null)); 
     this.testCreateDoubleFailure(""); 
     this.testCreateDoubleFailure(" "); 
     this.testCreateDoubleFailure("\b\t\n\f\r"); 
     this.testCreateDoubleFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F"); 
 }
@Test
public void testCreateLong65() { 
     assertEquals("createLong(String) failed", Long.valueOf("12345"), NumberUtils.createLong("12345")); 
     assertEquals("createLong(null) failed", null, NumberUtils.createLong(null)); 
     this.testCreateLongFailure(""); 
     this.testCreateLongFailure(" "); 
     this.testCreateLongFailure("\b\t\n\f\r"); 
     this.testCreateLongFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F"); 
 }
@Test
public void testCreateBigDecimal66() { 
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
@Test
public void testMinLong67() { 
     assertEquals("min(long[]) failed for array length 1", 5, NumberUtils.min(new long[] { 5 })); 
     assertEquals("min(long[]) failed for array length 2", 6, NumberUtils.min(new long[] { 6, 9 })); 
     assertEquals(-10, NumberUtils.min(new long[] { -10, -5, 0, 5, 10 })); 
     assertEquals(-10, NumberUtils.min(new long[] { -5, 0, -10, 5, 10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMinInt_emptyArray68() { 
     NumberUtils.min(new int[0]); 
 }
@Test
public void testMinShort69() { 
     assertEquals("min(short[]) failed for array length 1", 5, NumberUtils.min(new short[] { 5 })); 
     assertEquals("min(short[]) failed for array length 2", 6, NumberUtils.min(new short[] { 6, 9 })); 
     assertEquals(-10, NumberUtils.min(new short[] { -10, -5, 0, 5, 10 })); 
     assertEquals(-10, NumberUtils.min(new short[] { -5, 0, -10, 5, 10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMinByte_emptyArray70() { 
     NumberUtils.min(new byte[0]); 
 }
@Test
public void testMinByte71() { 
     assertEquals("min(byte[]) failed for array length 1", 5, NumberUtils.min(new byte[] { 5 })); 
     assertEquals("min(byte[]) failed for array length 2", 6, NumberUtils.min(new byte[] { 6, 9 })); 
     assertEquals(-10, NumberUtils.min(new byte[] { -10, -5, 0, 5, 10 })); 
     assertEquals(-10, NumberUtils.min(new byte[] { -5, 0, -10, 5, 10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMinDouble_nullArray72() { 
     NumberUtils.min((double[]) null); 
 }
@Test
public void testLang38173() { 
     assertTrue(Double.isNaN(NumberUtils.min(1.2, 2.5, Double.NaN))); 
     assertTrue(Double.isNaN(NumberUtils.max(1.2, 2.5, Double.NaN))); 
     assertTrue(Float.isNaN(NumberUtils.min(1.2f, 2.5f, Float.NaN))); 
     assertTrue(Float.isNaN(NumberUtils.max(1.2f, 2.5f, Float.NaN))); 
     final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN }; 
     assertTrue(Double.isNaN(NumberUtils.max(a))); 
     assertTrue(Double.isNaN(NumberUtils.min(a))); 
     final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN }; 
     assertTrue(Double.isNaN(NumberUtils.max(b))); 
     assertTrue(Double.isNaN(NumberUtils.min(b))); 
     final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN }; 
     assertTrue(Float.isNaN(NumberUtils.max(aF))); 
     final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN }; 
     assertTrue(Float.isNaN(NumberUtils.max(bF))); 
 }
@Test
public void testMaxLong74() { 
     assertEquals("max(long[]) failed for array length 1", 5, NumberUtils.max(new long[] { 5 })); 
     assertEquals("max(long[]) failed for array length 2", 9, NumberUtils.max(new long[] { 6, 9 })); 
     assertEquals("max(long[]) failed for array length 5", 10, NumberUtils.max(new long[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new long[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new long[] { -5, 0, 10, 5, -10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMaxInt_emptyArray75() { 
     NumberUtils.max(new int[0]); 
 }
@Test
public void testMaxInt76() { 
     assertEquals("max(int[]) failed for array length 1", 5, NumberUtils.max(new int[] { 5 })); 
     assertEquals("max(int[]) failed for array length 2", 9, NumberUtils.max(new int[] { 6, 9 })); 
     assertEquals("max(int[]) failed for array length 5", 10, NumberUtils.max(new int[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new int[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new int[] { -5, 0, 10, 5, -10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMaxByte_emptyArray77() { 
     NumberUtils.max(new byte[0]); 
 }
@Test
public void testMaxByte78() { 
     assertEquals("max(byte[]) failed for array length 1", 5, NumberUtils.max(new byte[] { 5 })); 
     assertEquals("max(byte[]) failed for array length 2", 9, NumberUtils.max(new byte[] { 6, 9 })); 
     assertEquals("max(byte[]) failed for array length 5", 10, NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 })); 
     assertEquals(10, NumberUtils.max(new byte[] { -5, 0, 10, 5, -10 })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMaxDouble_nullArray79() { 
     NumberUtils.max((double[]) null); 
 }
@Test
public void testMaxDouble80() { 
     final double[] d = null; 
     try { 
         NumberUtils.max(d); 
         fail("No exception was thrown for null input."); 
     } catch (final IllegalArgumentException ex) { 
     } 
     try { 
         NumberUtils.max(new double[0]); 
         fail("No exception was thrown for empty input."); 
     } catch (final IllegalArgumentException ex) { 
     } 
     assertEquals("max(double[]) failed for array length 1", 5.1f, NumberUtils.max(new double[] { 5.1f }), 0); 
     assertEquals("max(double[]) failed for array length 2", 9.2f, NumberUtils.max(new double[] { 6.3f, 9.2f }), 0); 
     assertEquals("max(double[]) failed for float length 5", 10.4f, NumberUtils.max(new double[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }), 0); 
     assertEquals(10, NumberUtils.max(new double[] { -10, -5, 0, 5, 10 }), 0.0001); 
     assertEquals(10, NumberUtils.max(new double[] { -5, 0, 10, 5, -10 }), 0.0001); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testMaxFloat_emptyArray81() { 
     NumberUtils.max(new float[0]); 
 }
@Test
public void testMaxFloat82() { 
     assertEquals("max(float[]) failed for array length 1", 5.1f, NumberUtils.max(new float[] { 5.1f }), 0); 
     assertEquals("max(float[]) failed for array length 2", 9.2f, NumberUtils.max(new float[] { 6.3f, 9.2f }), 0); 
     assertEquals("max(float[]) failed for float length 5", 10.4f, NumberUtils.max(new float[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }), 0); 
     assertEquals(10, NumberUtils.max(new float[] { -10, -5, 0, 5, 10 }), 0.0001f); 
     assertEquals(10, NumberUtils.max(new float[] { -5, 0, 10, 5, -10 }), 0.0001f); 
 }
@Test
public void testMinimumShort83() { 
     final short low = 1234; 
     final short mid = 1234 + 1; 
     final short high = 1234 + 2; 
     assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, high)); 
     assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, low, high)); 
     assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, high, low)); 
     assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, low)); 
 }
@Test
public void testMinimumDouble84() { 
     final double low = 12.3; 
     final double mid = 12.3 + 1; 
     final double high = 12.3 + 2; 
     assertEquals(low, NumberUtils.min(low, mid, high), 0.0001); 
     assertEquals(low, NumberUtils.min(mid, low, high), 0.0001); 
     assertEquals(low, NumberUtils.min(mid, high, low), 0.0001); 
     assertEquals(low, NumberUtils.min(low, mid, low), 0.0001); 
     assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001); 
 }
@Test
public void testMinimumFloat85() { 
     final float low = 12.3f; 
     final float mid = 12.3f + 1; 
     final float high = 12.3f + 2; 
     assertEquals(low, NumberUtils.min(low, mid, high), 0.0001f); 
     assertEquals(low, NumberUtils.min(mid, low, high), 0.0001f); 
     assertEquals(low, NumberUtils.min(mid, high, low), 0.0001f); 
     assertEquals(low, NumberUtils.min(low, mid, low), 0.0001f); 
     assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001f); 
 }
@Test
public void testMaximumLong86() { 
     assertEquals("maximum(long,long,long) 1 failed", 12345L, NumberUtils.max(12345L, 12345L - 1L, 12345L - 2L)); 
     assertEquals("maximum(long,long,long) 2 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L - 2L)); 
     assertEquals("maximum(long,long,long) 3 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L - 2L, 12345L)); 
     assertEquals("maximum(long,long,long) 4 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L)); 
     assertEquals("maximum(long,long,long) 5 failed", 12345L, NumberUtils.max(12345L, 12345L, 12345L)); 
 }
@Test
public void testMaximumInt87() { 
     assertEquals("maximum(int,int,int) 1 failed", 12345, NumberUtils.max(12345, 12345 - 1, 12345 - 2)); 
     assertEquals("maximum(int,int,int) 2 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345 - 2)); 
     assertEquals("maximum(int,int,int) 3 failed", 12345, NumberUtils.max(12345 - 1, 12345 - 2, 12345)); 
     assertEquals("maximum(int,int,int) 4 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345)); 
     assertEquals("maximum(int,int,int) 5 failed", 12345, NumberUtils.max(12345, 12345, 12345)); 
 }
@Test
public void testMaximumByte88() { 
     final byte low = 123; 
     final byte mid = 123 + 1; 
     final byte high = 123 + 2; 
     assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(low, mid, high)); 
     assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, low, high)); 
     assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, high, low)); 
     assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(high, mid, high)); 
 }
@Test
public void testMaximumDouble89() { 
     final double low = 12.3; 
     final double mid = 12.3 + 1; 
     final double high = 12.3 + 2; 
     assertEquals(high, NumberUtils.max(low, mid, high), 0.0001); 
     assertEquals(high, NumberUtils.max(mid, low, high), 0.0001); 
     assertEquals(high, NumberUtils.max(mid, high, low), 0.0001); 
     assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001); 
     assertEquals(high, NumberUtils.max(high, mid, high), 0.0001); 
 }
@Test
public void testMaximumFloat90() { 
     final float low = 12.3f; 
     final float mid = 12.3f + 1; 
     final float high = 12.3f + 2; 
     assertEquals(high, NumberUtils.max(low, mid, high), 0.0001f); 
     assertEquals(high, NumberUtils.max(mid, low, high), 0.0001f); 
     assertEquals(high, NumberUtils.max(mid, high, low), 0.0001f); 
     assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001f); 
     assertEquals(high, NumberUtils.max(high, mid, high), 0.0001f); 
 }
@Test
public void testIsDigits91() { 
     assertFalse("isDigits(null) failed", NumberUtils.isDigits(null)); 
     assertFalse("isDigits('') failed", NumberUtils.isDigits("")); 
     assertTrue("isDigits(String) failed", NumberUtils.isDigits("12345")); 
     assertFalse("isDigits(String) neg 1 failed", NumberUtils.isDigits("1234.5")); 
     assertFalse("isDigits(String) neg 3 failed", NumberUtils.isDigits("1ab")); 
     assertFalse("isDigits(String) neg 4 failed", NumberUtils.isDigits("abc")); 
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
