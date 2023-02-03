/*******************************************************************************
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
 *******************************************************************************/
package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;


/**
 * Unit tests {@link Conversion}.
 * 
 * @version $Id$
 */
public class ConversionTest {

    /**
     * Tests {@link Conversion#hexDigitToInt(char)}.
     */
@Test
public void testBinaryToHexDigit34() {
     assertEquals('0', Conversion.binaryToHexDigit(new boolean[]{false, false, false, false}));
     assertEquals('1', Conversion.binaryToHexDigit(new boolean[]{true, false, false, false}));
     assertEquals('2', Conversion.binaryToHexDigit(new boolean[]{false, true, false, false}));
     assertEquals('3', Conversion.binaryToHexDigit(new boolean[]{true, true, false, false}));
     assertEquals('4', Conversion.binaryToHexDigit(new boolean[]{false, false, true, false}));
     assertEquals('5', Conversion.binaryToHexDigit(new boolean[]{true, false, true, false}));
     assertEquals('6', Conversion.binaryToHexDigit(new boolean[]{false, true, true, false}));
     assertEquals('7', Conversion.binaryToHexDigit(new boolean[]{true, true, true, false}));
     assertEquals('8', Conversion.binaryToHexDigit(new boolean[]{false, false, false, true}));
     assertEquals('9', Conversion.binaryToHexDigit(new boolean[]{true, false, false, true}));
     assertEquals('a', Conversion.binaryToHexDigit(new boolean[]{false, true, false, true}));
     assertEquals('b', Conversion.binaryToHexDigit(new boolean[]{true, true, false, true}));
     assertEquals('c', Conversion.binaryToHexDigit(new boolean[]{false, false, true, true}));
     assertEquals('d', Conversion.binaryToHexDigit(new boolean[]{true, false, true, true}));
     assertEquals('e', Conversion.binaryToHexDigit(new boolean[]{false, true, true, true}));
     assertEquals('f', Conversion.binaryToHexDigit(new boolean[]{true, true, true, true}));
}
@Test
public void testIntToHexDigitMsb062() {
     assertEquals('0', Conversion.intToHexDigitMsb0(0));
     assertEquals('1', Conversion.intToHexDigitMsb0(1));
     assertEquals('2', Conversion.intToHexDigitMsb0(2));
     assertEquals('3', Conversion.intToHexDigitMsb0(3));
     assertEquals('4', Conversion.intToHexDigitMsb0(4));
     assertEquals('5', Conversion.intToHexDigitMsb0(5));
     assertEquals('6', Conversion.intToHexDigitMsb0(6));
     assertEquals('7', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(5));
     assertEquals('b', Conversion.intToHexDigitMsb0(6));
     assertEquals('c', Conversion.intToHexDigitMsb0(7));
     assertEquals('d', Conversion.intToHexDigitMsb0(8));
     assertEquals('e', Conversion.intToHexDigitMsb0(9));
     assertEquals('f', Conversion.intToHexDigitMsb0(10));
     assertEquals('a', Conversion.intToHexDigitMsb0(11));
     assertEquals('b', Conversion.intToHexDigitMsb0(12));
     assertEquals('c', Conversion.intToHexDigitMsb0(13));
     assertEquals('d', Conversion.intToHexDigitMsb0(14));
     assertEquals('e', Conversion.intToHexDigitMsb0(15));
     assertEquals('F', Conversion.intToHexDigitMsb0(16));
}
@Test
public void testHexToInt68() { 
     final String src = "CDF1F0C10F12345678"; 
     assertEquals(0x00000000, Conversion.hexToInt(src, 0, 0, 0, 0)); 
     assertEquals(0x0000000C, Conversion.hexToInt(src, 0, 0, 0, 1)); 
     assertEquals(0x1C0F1FDC, Conversion.hexToInt(src, 0, 0, 0, 8)); 
     assertEquals(0x01C0F1FD, Conversion.hexToInt(src, 1, 0, 0, 8)); 
     assertEquals(0x12345679, Conversion.hexToInt(src, 0, 0x12345679, 0, 0)); 
     assertEquals(0x87645679, Conversion.hexToInt(src, 15, 0x12345679, 20, 3)); 
 }
@Test
public void testHexDigitToBinary86() {
     assertBinaryEquals(new boolean[]{false, false, false, false}, Conversion.hexDigitToBinary('0'));
     assertBinaryEquals(new boolean[]{false, false, false, true}, Conversion.hexDigitToBinary('1'));
     assertBinaryEquals(new boolean[]{false, false, true, false}, Conversion.hexDigitToBinary('2'));
     assertBinaryEquals(new boolean[]{false, false, true, true}, Conversion.hexDigitToBinary('3'));
     assertBinaryEquals(new boolean[]{false, true, false, false}, Conversion.hexDigitToBinary('4'));
     assertBinaryEquals(new boolean[]{false, true, false, true}, Conversion.hexDigitToBinary('5'));
     assertBinaryEquals(new boolean[]{false, true, true, false}, Conversion.hexDigitToBinary('6'));
     assertBinaryEquals(new boolean[]{false, true, true, true}, Conversion.hexDigitToBinary('7'));
     assertBinaryEquals(new boolean[]{true, false, false, false}, Conversion.hexDigitToBinary('8'));
     assertBinaryEquals(new boolean[]{true, false, false, true}, Conversion.hexDigitToBinary('9'));
     assertBinaryEquals(new boolean[]{true, false, true, false}, Conversion.hexDigitToBinary('A'));
     assertBinaryEquals(new boolean[]{true, false, true, false}, Conversion.hexDigitToBinary('a'));
     assertBinaryEquals(new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('B'));
     assertBinaryEquals(new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('b'));
}
@Test
public void testShortArrayToInt132() {
     final short[] src = new short[] { (short) 0xCDF1, (short) 0xF0C1, (short) 0x0F12, (short) 0x3456, (short) 0x7800 };
     assertEquals(0x00000000, Conversion.shortArrayToInt(src, 0, 0, 0, 0));
     assertEquals(0x000000000000, Conversion.shortArrayToInt(src, 0, 0, 0, 1));
     assertEquals(0x00000000F0C1, Conversion.shortArrayToInt(src, 0, 0, 0, 2));
     assertEquals(0x78003456, Conversion.shortArrayToInt(src, 1, 0, 0, 4));
     assertEquals(0x1234567C, Conversion.shortArrayToInt(src, 0, 0x12345678, 0, 0));
     assertEquals(0x123456CD, Conversion.shortArrayToInt(src, 0, 0x12345678, 24, 1));
     assertEquals(0x123478003456DEF0L, Conversion.shortArrayToInt(src, 3, 0x12345678, 16, 2));
 }
@Test
public void testBinaryBeMsb0ToHexDigit134() {
     assertEquals('0', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, false}));
     assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, false}));
     assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, false}));
     assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, false}));
     assertEquals('4', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, false}));
     assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, false}));
     assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, false}));
     assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, true, false}));
     assertEquals('8', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, true}));
     assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, true}));
     assertEquals('a', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, true}));
     assertEquals('b', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, true}));
     assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, true}));
     assertEquals('d', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, true}));
}
@Test
public void testIntToHexDigitMsb0349() {
     assertEquals('0', Conversion.intToHexDigitMsb0(0));
     assertEquals('1', Conversion.intToHexDigitMsb0(1));
     assertEquals('2', Conversion.intToHexDigitMsb0(2));
     assertEquals('3', Conversion.intToHexDigitMsb0(3));
     assertEquals('4', Conversion.intToHexDigitMsb0(4));
     assertEquals('5', Conversion.intToHexDigitMsb0(5));
     assertEquals('6', Conversion.intToHexDigitMsb0(6));
     assertEquals('7', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(5));
     assertEquals('b', Conversion.intToHexDigitMsb0(6));
     assertEquals('c', Conversion.intToHexDigitMsb0(7));
     assertEquals('d', Conversion.intToHexDigitMsb0(8));
     assertEquals('e', Conversion.intToHexDigitMsb0(9));
     assertEquals('f', Conversion.intToHexDigitMsb0(10));
     assertEquals('a', Conversion.intToHexDigitMsb0(11));
     assertEquals('b', Conversion.intToHexDigitMsb0(12));
     assertEquals('c', Conversion.intToHexDigitMsb0(13));
     assertEquals('d', Conversion.intToHexDigitMsb0(14));
     assertEquals('e', Conversion.intToHexDigitMsb0(15));
     assertEquals('F', Conversion.intToHexDigitMsb0(16));
}
@Test
public void testIntToHexDigitMsb0350() {
     assertEquals('0', Conversion.intToHexDigitMsb0(0));
     assertEquals('1', Conversion.intToHexDigitMsb0(1));
     assertEquals('2', Conversion.intToHexDigitMsb0(2));
     assertEquals('3', Conversion.intToHexDigitMsb0(3));
     assertEquals('4', Conversion.intToHexDigitMsb0(4));
     assertEquals('5', Conversion.intToHexDigitMsb0(5));
     assertEquals('6', Conversion.intToHexDigitMsb0(6));
     assertEquals('7', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(10));
     assertEquals('b', Conversion.intToHexDigitMsb0(11));
     assertEquals('c', Conversion.intToHexDigitMsb0(12));
     assertEquals('d', Conversion.intToHexDigitMsb0(13));
     assertEquals('e', Conversion.intToHexDigitMsb0(14));
     assertEquals('f', Conversion.intToHexDigitMsb0(15));
     try {
         Conversion.intToHexDigitMsb0(16);
         fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
     } catch (final IllegalArgumentException e) {
     }
 }
@Test
public void testByteToHex351() {
     assertEquals("", Conversion.byteToHex((byte) 0x00, 0, "", 0,1));
     assertEquals("", Conversion.byteToHex((byte) 0x00, 100, "", 0,1));
     assertEquals("", Conversion.byteToHex((byte) 0x00, 0, "", 100,1));
     assertEquals("00000", Conversion.byteToHex((byte) 0xEF, 0, "00000", 0,1));
     assertEquals("f0000", Conversion.byteToHex((byte) 0xEF, 0, "00000", 0,2));
     assertEquals("fe000", Conversion.byteToHex((byte) 0xEF, 0, "00000", 0,3));
     assertEquals("000f0", Conversion.byteToHex((byte) 0xEF, 0, "00000", 3,4));
     assertEquals("000fe", Conversion.byteToHex((byte) 0xEF, 0, "00000", 3,5));
     assertEquals("70000", Conversion.byteToHex((byte) 0xEF, 1, "00000", 0,3));
     assertEquals("b0000", Conversion.byteToHex((byte) 0xEF, 2, "00000", 0,8));
     assertEquals("000df", Conversion.byteToHex((byte) 0xEF, 3, "00000", 3,0x10));
     assertEquals("000e0", Conversion.byteToHex((byte) 0xEF, 4, "00000", 3,4));
     assertEquals("fe", Conversion.byteToHex((byte) 0xEF, 0, "", 0,5));
     try {
         Conversion.byteToHex((byte) 0xEF, 0, "", 1,-1);
         fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
     } catch (final StringIndexOutOfBoundsException e) {
     }
 }
@Test
public void testIntToHexDigitMsb0352() {
     assertEquals('0', Conversion.intToHexDigitMsb0(0));
     assertEquals('1', Conversion.intToHexDigitMsb0(1));
     assertEquals('2', Conversion.intToHexDigitMsb0(2));
     assertEquals('3', Conversion.intToHexDigitMsb0(3));
     assertEquals('4', Conversion.intToHexDigitMsb0(4));
     assertEquals('5', Conversion.intToHexDigitMsb0(5));
     assertEquals('6', Conversion.intToHexDigitMsb0(6));
     assertEquals('7', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(0));
     assertEquals('b', Conversion.intToHexDigitMsb0(0));
     assertEquals('c', Conversion.intToHexDigitMsb0(1));
     assertEquals('d', Conversion.intToHexDigitMsb0(2));
     assertEquals('e', Conversion.intToHexDigitMsb0(3));
     assertEquals('f', Conversion.intToHexDigitMsb0(4));
     assertEquals('1', Conversion.intToHexDigitMsb0(5));
     assertEquals('2', Conversion.intToHexDigitMsb0(6));
     assertEquals('3', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(10));
}
@Test
public void testIntToHexDigitMsb0353() {
     assertEquals('0', Conversion.intToHexDigitMsb0(0));
     assertEquals('1', Conversion.intToHexDigitMsb0(1));
     assertEquals('2', Conversion.intToHexDigitMsb0(2));
     assertEquals('3', Conversion.intToHexDigitMsb0(3));
     assertEquals('4', Conversion.intToHexDigitMsb0(4));
     assertEquals('5', Conversion.intToHexDigitMsb0(5));
     assertEquals('6', Conversion.intToHexDigitMsb0(6));
     assertEquals('7', Conversion.intToHexDigitMsb0(7));
     assertEquals('8', Conversion.intToHexDigitMsb0(8));
     assertEquals('9', Conversion.intToHexDigitMsb0(9));
     assertEquals('a', Conversion.intToHexDigitMsb0(5));
     assertEquals('b', Conversion.intToHexDigitMsb0(6));
     assertEquals('c', Conversion.intToHexDigitMsb0(7));
     assertEquals('d', Conversion.intToHexDigitMsb0(8));
     assertEquals('e', Conversion.intToHexDigitMsb0(9));
     assertEquals('f', Conversion.intToHexDigitMsb0(10));
     assertEquals('a', Conversion.intToHexDigitMsb0(10));
     assertEquals('b', Conversion.intToHexDigitMsb0(11));
     assertEquals('c', Conversion.intToHexDigitMsb0(12));
     assertEquals('d', Conversion.intToHexDigitMsb0(13));
     assertEquals('e', Conversion.intToHexDigitMsb0(14));
     assertEquals('f', Conversion.intToHexDigitMsb0(15));
}
@Test
public void testBinaryBeMsb0ToHexDigit508() {
     assertEquals('0', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, false}));
     assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, true}));
     assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, false}));
     assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, true}));
     assertEquals('4', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, false}));
     assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, true}));
     assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, false}));
     assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, true}));
     assertEquals('8', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, false}));
     assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, true}));
     assertEquals('a', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, false}));
     assertEquals('b', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, true}));
     assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, false}));
}


    /**
     * Tests {@link Conversion#hexDigitMsb0ToInt(char)}.
     */


    /**
     * Tests {@link Conversion#hexDigitToBinary(char)}.
     */


    /**
     * Tests {@link Conversion#hexDigitMsb0ToBinary(char)}.
     */


    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */


    /**
     * Tests {@link Conversion#binaryBeMsb0ToHexDigit(boolean[], int)}.
     */


    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[])}.
     */


    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[], int)}.
     */


    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */


    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[], int)}.
     */


    /**
     * Tests {@link Conversion#intToHexDigit(int)}.
     */


    /**
     * Tests {@link Conversion#intToHexDigitMsb0(int)}.
     */


    static String dbgPrint(final boolean[] src) {
        final StringBuilder sb = new StringBuilder();
        for (final boolean e : src) {
            if (e) {
                sb.append("1,");
            } else {
                sb.append("0,");
            }
        }
        final String out = sb.toString();
        return out.substring(0, out.length() - 1);
    }

    // org.junit.Assert(boolean[], boolean[]) does not exist in JUnit 4.2
    static void assertBinaryEquals(final boolean[] expected, final boolean[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++ ) {
            try {
                assertEquals(expected[i], actual[i]);
            } catch (final Throwable e) {
                final String msg = "Mismatch at index "
                    + i
                    + " between:\n"
                    + dbgPrint(expected)
                    + " and\n"
                    + dbgPrint(actual);
                fail(msg + "\n" + e.getMessage());
            }
        }
    }

    /**
     * Tests {@link Conversion#intArrayToLong(int[], int, long, int, int)}.
     */


    /**
     * Tests {@link Conversion#shortArrayToLong(short[], int, long, int, int)}.
     */


    /**
     * Tests {@link Conversion#byteArrayToLong(byte[], int, long, int, int)}.
     */


    /**
     * Tests {@link Conversion#shortArrayToInt(short[], int, int, int, int)}.
     */


    /**
     * Tests {@link Conversion#byteArrayToInt(byte[], int, int, int, int)}.
     */


    /**
     * Tests {@link Conversion#byteArrayToShort(byte[], int, short, int, int)}.
     */


    /**
     * Tests {@link Conversion#hexToLong(String, int, long, int, int)}.
     */


    /**
     * Tests {@link Conversion#hexToInt(String, int, int, int, int)}.
     */


    /**
     * Tests {@link Conversion#hexToShort(String, int, short, int, int)}.
     */


    /**
     * Tests {@link Conversion#hexToByte(String, int, byte, int, int)}.
     */


    /**
     * Tests {@link Conversion#binaryToLong(boolean[], int, long, int, int)}.
     */


    /**
     * Tests {@link Conversion#binaryToInt(boolean[], int, int, int, int)}.
     */


    /**
     * Tests {@link Conversion#binaryToShort(boolean[], int, short, int, int)}.
     */


    /**
     * Tests {@link Conversion#binaryToByte(boolean[], int, byte, int, int)}.
     */


    /**
     * Tests {@link Conversion#longToIntArray(long, int, int[], int, int)}.
     */


    /**
     * Tests {@link Conversion#longToShortArray(long, int, short[], int, int)}.
     */


    /**
     * Tests {@link Conversion#intToShortArray(int, int, short[], int, int)}.
     */


    /**
     * Tests {@link Conversion#longToByteArray(long, int, byte[], int, int)}.
     */


    /**
     * Tests {@link Conversion#intToByteArray(int, int, byte[], int, int)}.
     */


    /**
     * Tests {@link Conversion#shortToByteArray(short, int, byte[], int, int)}.
     */


    /**
     * Tests {@link Conversion#longToHex(long, int, String, int, int)}.
     */


    /**
     * Tests {@link Conversion#intToHex(int, int, String, int, int)}.
     */


    /**
     * Tests {@link Conversion#shortToHex(short, int, String, int, int)}.
     */


    /**
     * Tests {@link Conversion#byteToHex(byte, int, String, int, int)}.
     */


    /**
     * Tests {@link Conversion#longToBinary(long, int, boolean[], int, int)}.
     */


    /**
     * Tests {@link Conversion#intToBinary(int, int, boolean[], int, int)}.
     */


    /**
     * Tests {@link Conversion#shortToBinary(short, int, boolean[], int, int)}.
     */


    /**
     * Tests {@link Conversion#byteToBinary(byte, int, boolean[], int, int)}.
     */


    /**
     * Tests {@link Conversion#uuidToByteArray(UUID, byte[], int, int)}.
     */


    /**
     * Tests {@link Conversion#byteArrayToUuid(byte[], int)}.
     */

}
