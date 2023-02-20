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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 *
 * @version $Id$
 */
public class CompareToBuilderTest {

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {
            this.a = a;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestObject)) {
                return false;
            }
            final TestObject rhs = (TestObject) o;
            return a == rhs.a;
        }

        @Override
        public int hashCode() {
            return a;
        }

        public void setA(final int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
        @Override
        public int compareTo(final TestObject rhs) {
            return a < rhs.a ? -1 : a > rhs.a ? +1 : 0;
        }
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);
        }
        public TestSubObject(final int a, final int b) {
            super(a);
            this.b = b;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestSubObject)) {
                return false;
            }
            final TestSubObject rhs = (TestSubObject) o;
            return super.equals(o) && b == rhs.b;
        }
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);
            this.t = t;
        }
    }
    
@Test
public void testReflectionCompare408() { 
     final TestObject o1 = new TestObject(4); 
     final TestObject o2 = new TestObject(4); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o1) == 0); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o2) == 0); 
     o2.setA(5); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o2) < 0); 
     assertTrue(CompareToBuilder.reflectionCompare(o2, o1) > 0); 
 }
@Test
public void testReflectionHierarchyCompare409() { 
     final TestObject o1 = new TestObject(4); 
     final TestObject o2 = new TestObject(4); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o1) == 0); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o2) == 0); 
     o2.setA(5); 
     assertTrue(CompareToBuilder.reflectionCompare(o1, o2) < 0); 
     assertTrue(CompareToBuilder.reflectionCompare(o2, o1) > 0); 
 }
@Test
public void testSuper410() { 
     final TestObject o1 = new TestObject(4); 
     final TestObject o2 = new TestObject(4); 
     assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o1).toComparison() == 0); 
     assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o2).toComparison() == 0); 
     o2.setA(5); 
     assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o2).toComparison() < 0); 
     assertTrue(new CompareToBuilder().appendSuper(2).append(o1, o2).toComparison() > 0); 
     assertTrue(new CompareToBuilder().appendSuper(3).append(o1, o2).toComparison() > 0); 
     assertTrue(new CompareToBuilder().appendSuper(4).append(o2, o1).toComparison() < 0); 
     assertTrue(new CompareToBuilder().appendSuper(5).append(o1, null).toComparison() > 0); 
     assertTrue(new CompareToBuilder().appendSuper(0).append(null, o1).toComparison() < 0); 
 }
@Test
public void testObject411() { 
     final TestObject o1 = new TestObject(4); 
     final TestObject o2 = new TestObject(4); 
     assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(o1, o2).toComparison() == 0); 
     o2.setA(5); 
     assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append(o1, null).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append((Object) null, (Object) null).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(null, o1).toComparison() < 0); 
 }
@Test
public void testObjectArrayHiddenByObject412() { 
     final TestObject[] array1 = new TestObject[2]; 
     array1[0] = new TestObject(4); 
     array1[1] = new TestObject(5); 
     final TestObject[] array2 = new TestObject[2]; 
     array2[0] = new TestObject(4); 
     array2[1] = new TestObject(5); 
     final TestObject[] array3 = new TestObject[3]; 
     array3[0] = new TestObject(4); 
     array3[1] = new TestObject(5); 
     array3[2] = new TestObject(6); 
     final Object obj1 = array1; 
     final Object obj2 = array2; 
     final Object obj3 = array3; 
     assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0); 
     array1[1] = new TestObject(7); 
     assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0); 
 }
@Test
public void testByteArray413() { 
     final byte[] obj1 = new byte[2]; 
     obj1[0] = 5; 
     obj1[1] = 6; 
     final byte[] obj2 = new byte[2]; 
     obj2[0] = 5; 
     obj2[1] = 6; 
     final byte[] obj3 = new byte[3]; 
     obj3[0] = 5; 
     obj3[1] = 6; 
     obj3[2] = 7; 
     assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0); 
     obj1[1] = 7; 
     assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append((byte[]) null, (byte[]) null).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0); 
 }
@Test
public void testByteArrayHiddenByObject414() { 
     final byte[] array1 = new byte[2]; 
     array1[0] = 5; 
     array1[1] = 6; 
     final byte[] array2 = new byte[2]; 
     array2[0] = 5; 
     array2[1] = 6; 
     final byte[] array3 = new byte[3]; 
     array3[0] = 5; 
     array3[1] = 6; 
     array3[2] = 7; 
     assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0); 
     assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0); 
     array1[1] = 7; 
     assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0); 
     assertTrue(new CompareToBuilder().append(array1, array3).toComparison() > 0); 
     assertTrue(new CompareToBuilder().append(array3, array1).toComparison() < 0); 
 }
    

    

    

    
    
    
    
    
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {
        assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {
        final TestObject to1 = new TestObject(1);
        final TestObject to2 = new TestObject(2);
        final TestObject to3 = new TestObject(3);
        final TestSubObject tso1 = new TestSubObject(1, 1);
        final TestSubObject tso2 = new TestSubObject(2, 2);
        final TestSubObject tso3 = new TestSubObject(3, 3);
        
        assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {

        // signum
        assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        if (CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0){
            assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        if (CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0) {
            assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }
    
    /**
     * Returns the signum of the result of comparing x and y with
     * <code>CompareToBuilder.reflectionCompare</code>
     * 
     * @param lhs The "left-hand-side" of the comparison.
     * @param rhs The "right-hand-side" of the comparison.
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     * @return int The signum
     */
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {
        return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }
    
    
    
    
    
    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    
  
 }
