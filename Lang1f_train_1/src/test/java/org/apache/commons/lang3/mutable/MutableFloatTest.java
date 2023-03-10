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
public void testGetSet165() { 
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
@Test(expected = NullPointerException.class) 
 public void testConstructorNull166() { 
     new MutableFloat((Number) null); 
 }
@Test
public void testNanInfinite167() { 
     MutableFloat mutNum = new MutableFloat(Float.NaN); 
     assertTrue(mutNum.isNaN()); 
     mutNum = new MutableFloat(Float.POSITIVE_INFINITY); 
     assertTrue(mutNum.isInfinite()); 
     mutNum = new MutableFloat(Float.NEGATIVE_INFINITY); 
     assertTrue(mutNum.isInfinite()); 
 }
@Test
public void testIncrement168() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.increment(); 
     assertEquals(2, mutNum.intValue()); 
     assertEquals(2L, mutNum.longValue()); 
 }
@Test
public void testDecrement169() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.decrement(); 
     assertEquals(0, mutNum.intValue()); 
     assertEquals(0L, mutNum.longValue()); 
 }
@Test
public void testAddValuePrimitive170() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.add(1.1f); 
     assertEquals(2.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testAddValueObject171() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.add(Float.valueOf(1.1f)); 
     assertEquals(2.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testSubtractValuePrimitive172() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.subtract(0.9f); 
     assertEquals(0.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testSubtractValueObject173() { 
     final MutableFloat mutNum = new MutableFloat(1); 
     mutNum.subtract(Float.valueOf(0.9f)); 
     assertEquals(0.1f, mutNum.floatValue(), 0.01f); 
 }
@Test
public void testPrimitiveValues174() { 
     final MutableFloat mutNum = new MutableFloat(1.7F); 
     assertEquals(1, mutNum.intValue()); 
     assertEquals(1.7, mutNum.doubleValue(), 0.00001); 
     assertEquals((byte) 1, mutNum.byteValue()); 
     assertEquals((short) 1, mutNum.shortValue()); 
     assertEquals(1, mutNum.intValue()); 
     assertEquals(1L, mutNum.longValue()); 
 }
@Test
public void testToFloat175() { 
     assertEquals(Float.valueOf(0f), new MutableFloat(0f).toFloat()); 
     assertEquals(Float.valueOf(12.3f), new MutableFloat(12.3f).toFloat()); 
 }
@Test
public void testCompareTo176() { 
     final MutableFloat mutNum = new MutableFloat(0f); 
     assertEquals(0, mutNum.compareTo(new MutableFloat(0f))); 
     assertEquals(+1, mutNum.compareTo(new MutableFloat(-1f))); 
     assertEquals(-1, mutNum.compareTo(new MutableFloat(1f))); 
 }
@Test
public void testToString177() { 
     assertEquals("0.0", new MutableFloat(0f).toString()); 
     assertEquals("10.0", new MutableFloat(10f).toString()); 
     assertEquals("-123.0", new MutableFloat(-123f).toString()); 
 }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
