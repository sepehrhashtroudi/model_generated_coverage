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
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableFloat
 */
public class MutableFloatTest {

    // ----------------------------------------------------------------
@Test
public void testConstructors302() { 
     assertEquals(0f, new MutableFloat().floatValue(), 0.0001f); 
     assertEquals(1f, new MutableFloat(1f).floatValue(), 0.0001f); 
     assertEquals(2f, new MutableFloat(Float.valueOf(2f)).floatValue(), 0.0001f); 
     assertEquals(3f, new MutableFloat(new MutableFloat(3f)).floatValue(), 0.0001f); 
     assertEquals(2f, new MutableFloat("2.0").floatValue(), 0.0001f); 
 }
@Test
public void testGetSet404() { 
     final MutableFloat mutNum = new MutableFloat(0f); 
     assertEquals(0f, new MutableFloat().floatValue(), 0.0001f); 
     assertEquals(Float.valueOf(0), new MutableFloat().getValue()); 
     mutNum.setValue(1); 
     assertEquals(1f, mutNum.floatValue(), 0.0001f); 
     assertEquals(Float.valueOf(1f), mutNum.getValue()); 
     mutNum.setValue(Float.valueOf(2f)); 
     assertEquals(2f, mutNum.floatValue(), 0.0001f); 
     assertEquals(Float.valueOf(2f), mutNum.getValue()); 
     mutNum.setValue(new MutableFloat(3f)); 
     assertEquals(3f, mutNum.floatValue(), 0.0001f); 
     assertEquals(Float.valueOf(3f), mutNum.getValue()); 
 }
@Test
public void testSubtractValuePrimitive461() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.subtract(0.9f); 
     assertEquals(0.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testToString552() { 
     assertEquals("0.0", new MutableFloat(0f).toString()); 
     assertEquals("10.0", new MutableFloat(10f).toString()); 
     assertEquals("-123.0", new MutableFloat(-123f).toString()); 
 }
@Test
public void testAddValueObject758() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.add(Float.valueOf(1.1f)); 
     assertEquals(2.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testNanInfinite852() { 
     MutableFloat mutNum = new MutableFloat(Float.NaN); 
     assertTrue(mutNum.isNaN()); 
     mutNum = new MutableFloat(Float.POSITIVE_INFINITY); 
     assertTrue(mutNum.isInfinite()); 
     mutNum = new MutableFloat(Float.NEGATIVE_INFINITY); 
     assertTrue(mutNum.isInfinite()); 
 }
@Test
public void testEquals902() { 
     final MutableFloat mutNumA = new MutableFloat(0f); 
     final MutableFloat mutNumB = new MutableFloat(0f); 
     final MutableFloat mutNumC = new MutableFloat(1f); 
     assertTrue(mutNumA.equals(mutNumA)); 
     assertTrue(mutNumA.equals(mutNumB)); 
     assertTrue(mutNumB.equals(mutNumA)); 
     assertTrue(mutNumB.equals(mutNumB)); 
     assertFalse(mutNumA.equals(mutNumC)); 
     assertFalse(mutNumB.equals(mutNumC)); 
     assertTrue(mutNumC.equals(mutNumC)); 
     assertFalse(mutNumA.equals(null)); 
     assertFalse(mutNumA.equals(Float.valueOf(0f))); 
     assertFalse(mutNumA.equals("0")); 
 }
@Test
public void testIncrement926() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.increment(); 
     assertEquals(2, mutNum.intValue()); 
     assertEquals(2L, mutNum.longValue()); 
 }
@Test
public void testSubtractValueObject942() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.subtract(Float.valueOf(0.9f)); 
     assertEquals(0.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testHashCode1076() { 
     final MutableFloat mutNumA = new MutableFloat(0f); 
     final MutableFloat mutNumB = new MutableFloat(0f); 
     final MutableFloat mutNumC = new MutableFloat(1f); 
     assertTrue(mutNumA.hashCode() == mutNumA.hashCode()); 
     assertTrue(mutNumA.hashCode() == mutNumB.hashCode()); 
     assertFalse(mutNumA.hashCode() == mutNumC.hashCode()); 
     assertTrue(mutNumA.hashCode() == Float.valueOf(0f).hashCode()); 
 }
@Test
public void testCompareTo1145() { 
     final MutableFloat mutNum = new MutableFloat(0f); 
     assertEquals(0, mutNum.compareTo(new MutableFloat(0f))); 
     assertEquals(+1, mutNum.compareTo(new MutableFloat(-1f))); 
     assertEquals(-1, mutNum.compareTo(new MutableFloat(1f))); 
 }
@Test
public void testPrimitiveValues1191() { 
     final MutableFloat mutNum = new MutableFloat(1.7F); 
     assertEquals(1, mutNum.intValue()); 
     assertEquals(1.7, mutNum.doubleValue(), 0.00001); 
     assertEquals((byte) 1, mutNum.byteValue()); 
     assertEquals((short) 1, mutNum.shortValue()); 
     assertEquals(1, mutNum.intValue()); 
     assertEquals(1L, mutNum.longValue()); 
 }
@Test
public void testAddValuePrimitive1301() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.add(1.1f); 
     assertEquals(2.1f, mutNum.floatValue(), 0.01f); 
 }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
