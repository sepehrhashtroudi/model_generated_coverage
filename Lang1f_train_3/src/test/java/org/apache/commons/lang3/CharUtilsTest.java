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
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharUtils}.
 *
 * @version $Id$
 */
public class CharUtilsTest {

    private static final Character CHARACTER_A = new Character('A');
    private static final Character CHARACTER_B = new Character('B');
    private static final char CHAR_COPY = '\u00a9';
    
@Test
public void testConstructor790() { 
     assertNotNull(new CharUtils()); 
     final Constructor<?>[] cons = CharUtils.class.getDeclaredConstructors(); 
     assertEquals(1, cons.length); 
     assertTrue(Modifier.isPublic(cons[0].getModifiers())); 
     assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers())); 
     assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers())); 
 } 
@SuppressWarnings("deprecation")
@Test
public void testToCharacterObject_char791() { 
     assertEquals(new Character('a'), CharUtils.toCharacterObject('a')); 
     assertSame(CharUtils.toCharacterObject('a'), CharUtils.toCharacterObject('a')); 
     for (int i = 0; i < 128; i++) { 
         final Character ch = CharUtils.toCharacterObject((char) i); 
         final Character ch2 = CharUtils.toCharacterObject((char) i); 
         assertSame(ch, ch2); 
         assertEquals(i, ch.charValue()); 
     } 
     for (int i = 128; i < 196; i++) { 
         final Character ch = CharUtils.toCharacterObject((char) i); 
         final Character ch2 = CharUtils.toCharacterObject((char) i); 
         assertEquals(ch, ch2); 
         assertTrue(ch != ch2); 
         assertEquals(i, ch.charValue()); 
         assertEquals(i, ch2.charValue()); 
     } 
     assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject('a')); 
 }
@Test
public void testToCharacterObject_String792() { 
     assertEquals(null, CharUtils.toCharacterObject(null)); 
     assertEquals(null, CharUtils.toCharacterObject("")); 
     assertEquals(new Character('a'), CharUtils.toCharacterObject("a")); 
     assertEquals(new Character('a'), CharUtils.toCharacterObject("abc")); 
     assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject("a")); 
 }
@Test
public void testToChar_Character793() { 
     assertEquals('A', CharUtils.toChar(CHARACTER_A)); 
     assertEquals('B', CharUtils.toChar(CHARACTER_B)); 
     try { 
         CharUtils.toChar((Character) null); 
     } catch (final IllegalArgumentException ex) { 
     } 
 }
@Test
public void testToChar_String794() { 
     assertEquals('A', CharUtils.toChar("A")); 
     assertEquals('B', CharUtils.toChar("BA")); 
     try { 
         CharUtils.toChar((String) null); 
     } catch (final IllegalArgumentException ex) { 
     } 
     try { 
         CharUtils.toChar(""); 
     } catch (final IllegalArgumentException ex) { 
     } 
 }
@Test
public void testToChar_String_char795() { 
     assertEquals('A', CharUtils.toChar("A", 'X')); 
     assertEquals('B', CharUtils.toChar("BA", 'X')); 
     assertEquals('X', CharUtils.toChar("", 'X')); 
     assertEquals('X', CharUtils.toChar((String) null, 'X')); 
 }
@Test
public void testToIntValue_Character_int796() { 
     assertEquals(0, CharUtils.toIntValue(new Character('0'), -1)); 
     assertEquals(3, CharUtils.toIntValue(new Character('3'), -1)); 
     assertEquals(-1, CharUtils.toIntValue(new Character('A'), -1)); 
     assertEquals(-1, CharUtils.toIntValue(null, -1)); 
 }
@Test
public void testToString_Character797() { 
     assertEquals(null, CharUtils.toString(null)); 
     assertEquals("A", CharUtils.toString(CHARACTER_A)); 
     assertSame(CharUtils.toString(CHARACTER_A), CharUtils.toString(CHARACTER_A)); 
 }
@Test
public void testToString_char798() { 
     assertEquals("a", CharUtils.toString('a')); 
     assertSame(CharUtils.toString('a'), CharUtils.toString('a')); 
     for (int i = 0; i < 128; i++) { 
         final String str = CharUtils.toString((char) i); 
         final String str2 = CharUtils.toString((char) i); 
         assertSame(str, str2); 
         assertEquals(1, str.length()); 
         assertEquals(i, str.charAt(0)); 
     } 
     for (int i = 128; i < 196; i++) { 
         final String str = CharUtils.toString((char) i); 
         final String str2 = CharUtils.toString((char) i); 
         assertEquals(str, str2); 
         assertTrue(str != str2); 
         assertEquals(1, str.length()); 
         assertEquals(i, str.charAt(0)); 
         assertEquals(1, str2.length()); 
         assertEquals(i, str2.charAt(0)); 
     } 
 }
@Test
public void testToUnicodeEscaped_char799() { 
     assertEquals("\\u0041", CharUtils.unicodeEscaped('A')); 
     for (int i = 0; i < 196; i++) { 
         final String str = CharUtils.unicodeEscaped((char) i); 
         assertEquals(6, str.length()); 
         final int val = Integer.parseInt(str.substring(2), 16); 
         assertEquals(i, val); 
     } 
     assertEquals("\\u0999", CharUtils.unicodeEscaped((char) 0x999)); 
     assertEquals("\\u1001", CharUtils.unicodeEscaped((char) 0x1001)); 
 }
@Test
public void testIsAsciiPrintable_char800() { 
     assertTrue(CharUtils.isAsciiPrintable('a')); 
     assertTrue(CharUtils.isAsciiPrintable('A')); 
     assertTrue(CharUtils.isAsciiPrintable('3')); 
     assertTrue(CharUtils.isAsciiPrintable('-')); 
     assertFalse(CharUtils.isAsciiPrintable('\n')); 
     assertFalse(CharUtils.isAscii(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if (i >= 32 && i <= 126) { 
             assertTrue(CharUtils.isAsciiPrintable((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiPrintable((char) i)); 
         } 
     } 
 }
@Test
public void testIsAsciiControl_char801() { 
     assertFalse(CharUtils.isAsciiControl('a')); 
     assertFalse(CharUtils.isAsciiControl('A')); 
     assertFalse(CharUtils.isAsciiControl('3')); 
     assertFalse(CharUtils.isAsciiControl('-')); 
     assertTrue(CharUtils.isAsciiControl('\n')); 
     assertFalse(CharUtils.isAsciiControl(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if (i < 32 || i == 127) { 
             assertTrue(CharUtils.isAsciiControl((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiControl((char) i)); 
         } 
     } 
 }
@Test
public void testIsAsciiAlpha_char802() { 
     assertTrue(CharUtils.isAsciiAlpha('a')); 
     assertTrue(CharUtils.isAsciiAlpha('A')); 
     assertFalse(CharUtils.isAsciiAlpha('3')); 
     assertFalse(CharUtils.isAsciiAlpha('-')); 
     assertFalse(CharUtils.isAsciiAlpha('\n')); 
     assertFalse(CharUtils.isAsciiAlpha(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) { 
             assertTrue(CharUtils.isAsciiAlpha((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiAlpha((char) i)); 
         } 
     } 
 }
@Test
public void testIsAsciiAlphaUpper_char803() { 
     assertFalse(CharUtils.isAsciiAlphaUpper('a')); 
     assertTrue(CharUtils.isAsciiAlphaUpper('A')); 
     assertFalse(CharUtils.isAsciiAlphaUpper('3')); 
     assertFalse(CharUtils.isAsciiAlphaUpper('-')); 
     assertFalse(CharUtils.isAsciiAlphaUpper('\n')); 
     assertFalse(CharUtils.isAsciiAlphaUpper(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if (i >= 'A' && i <= 'Z') { 
             assertTrue(CharUtils.isAsciiAlphaUpper((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiAlphaUpper((char) i)); 
         } 
     } 
 }
@Test
public void testIsAsciiAlphaLower_char804() { 
     assertTrue(CharUtils.isAsciiAlphaLower('a')); 
     assertFalse(CharUtils.isAsciiAlphaLower('A')); 
     assertFalse(CharUtils.isAsciiAlphaLower('3')); 
     assertFalse(CharUtils.isAsciiAlphaLower('-')); 
     assertFalse(CharUtils.isAsciiAlphaLower('\n')); 
     assertFalse(CharUtils.isAsciiAlphaLower(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if (i >= 'a' && i <= 'z') { 
             assertTrue(CharUtils.isAsciiAlphaLower((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiAlphaLower((char) i)); 
         } 
     } 
 }
@Test
public void testIsAsciiAlphanumeric_char805() { 
     assertTrue(CharUtils.isAsciiAlphanumeric('a')); 
     assertTrue(CharUtils.isAsciiAlphanumeric('A')); 
     assertTrue(CharUtils.isAsciiAlphanumeric('3')); 
     assertFalse(CharUtils.isAsciiAlphanumeric('-')); 
     assertFalse(CharUtils.isAsciiAlphanumeric('\n')); 
     assertFalse(CharUtils.isAsciiAlphanumeric(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')) { 
             assertTrue(CharUtils.isAsciiAlphanumeric((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiAlphanumeric((char) i)); 
         } 
     } 
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
