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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.
 *
 * @version $Id$
 */
public class EqualsBuilderTest {

    //-----------------------------------------------------------------------

    static class TestObject {
        private int a;
        public TestObject() {
        }
        public TestObject(final int a) {
            this.a = a;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == null) { return false; }
            if (o == this) { return true; }
            if (o.getClass() != getClass()) {
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
            if (o == null) { return false; }
            if (o == this) { return true; }
            if (o.getClass() != getClass()) {
                return false;
            }

            final TestSubObject rhs = (TestSubObject) o;
            return super.equals(o) && b == rhs.b;
        }

        @Override
        public int hashCode() {
            return b *17 + super.hashCode();
        }

        public void setB(final int b) {
            this.b = b;
        }

        public int getB() {
            return b;
        }
    }
    
    static class TestEmptySubObject extends TestObject {
        public TestEmptySubObject(final int a) {
            super(a);
        }
    }

    static class TestTSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTSubObject(final int a, final int t) {
            super(a);
            this.t = t;
        }
    }

    static class TestTTSubObject extends TestTSubObject {
        @SuppressWarnings("unused")
        private transient int tt;
        public TestTTSubObject(final int a, final int t, final int tt) {
            super(a, t);
            this.tt = tt;
        }
    }

    static class TestTTLeafObject extends TestTTSubObject {
        @SuppressWarnings("unused")
        private final int leafValue;
        public TestTTLeafObject(final int a, final int t, final int tt, final int leafValue) {
            super(a, t, tt);
            this.leafValue = leafValue;
        }
    }

    static class TestTSubObject2 extends TestObject {
        private transient int t;
        public TestTSubObject2(final int a, final int t) {
            super(a);
        }
        public int getT() {
            return t;
        }
        public void setT(final int t) {
            this.t = t;
        }
    }

@Test
public void testMultiCharArray20() { 
     final char[][] array1 = new char[2][2]; 
     final char[][] array2 = new char[2][2]; 
     for (short i = 0; i < array1.length; ++i) { 
         for (short j = 0; j < array1[0].length; j++) { 
             array1[i][j] = (char) i;
             array2[i][j] = (char) i;
         } 
     } 
     assertTrue(new EqualsBuilder().append(array1, array1).isEquals()); 
     assertTrue(new EqualsBuilder().append(array1, array2).isEquals()); 
     array1[1][1] = 0; 
     assertTrue(!new EqualsBuilder().append(array1, array2).isEquals()); 
 }
@Test
public void testObjectArrayHiddenByObject49() { 
     final TestObject[] array1 = new TestObject[2]; 
     array1[0] = new TestObject(4); 
     array1[1] = new TestObject(5); 
     final TestObject[] array2 = new TestObject[2]; 
     array2[0] = new TestObject(4); 
     array2[1] = new TestObject(5); 
     final Object obj1 = array1; 
     final Object obj2 = array2; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, array1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, array2).isEquals()); 
     array1[1].setA(6); 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testDoubleArray64() { 
     double[] obj1 = new double[2]; 
     obj1[0] = 5; 
     obj1[1] = 6; 
     double[] obj2 = new double[2]; 
     obj2[0] = 5; 
     obj2[1] = 6; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[1] = 7; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj2 = null; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1 = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testObjectArray105() { 
     TestObject[] obj1 = new TestObject[3]; 
     obj1[0] = new TestObject(4); 
     obj1[1] = new TestObject(5); 
     obj1[2] = null; 
     TestObject[] obj2 = new TestObject[3]; 
     obj2[0] = new TestObject(4); 
     obj2[1] = new TestObject(5); 
     obj2[2] = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj2, obj2).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[1].setA(6); 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[1].setA(5); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[2] = obj1[1]; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[2] = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj2 = null; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1 = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testCharArray207() { 
     char[] obj1 = new char[2]; 
     obj1[0] = 5; 
     obj1[1] = 6; 
     char[] obj2 = new char[2]; 
     obj2[0] = 5; 
     obj2[1] = 6; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[1] = 7; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj2 = null; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1 = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testLongArray355() { 
     long[] obj1 = new long[2]; 
     obj1[0] = 5L; 
     obj1[1] = 6L; 
     long[] obj2 = new long[2]; 
     obj2[0] = 5L; 
     obj2[1] = 6L; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1[1] = 7; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj2 = null; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
     obj1 = null; 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testDoubleArrayHiddenByObject356() { 
     final double[] array1 = new double[2]; 
     array1[0] = 5; 
     array1[1] = 6; 
     final double[] array2 = new double[2]; 
     array2[0] = 5; 
     array2[1] = 6; 
     final Object obj1 = array1; 
     final Object obj2 = array2; 
     assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, array1).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals()); 
     assertTrue(new EqualsBuilder().append(obj1, array2).isEquals()); 
     array1[1] = 7; 
     assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals()); 
 }
@Test
public void testBoolean357() { 
     final boolean o1 = true; 
     boolean o2 = false;
     assertTrue(new EqualsBuilder().append(o1, o1).isEquals()); 
     assertTrue(!new EqualsBuilder().append(o1, o2).isEquals()); 
     o2 = true; 
     assertTrue(!new EqualsBuilder().append(o1, o2).isEquals()); 
     assertTrue(!new EqualsBuilder().append(o1, this).isEquals()); 
     assertTrue(!new EqualsBuilder().append(o1, null).isEquals()); 
     assertTrue(!new EqualsBuilder().append(null, o2).isEquals()); 
     assertTrue(new EqualsBuilder().append((Object) null, (Object) null).isEquals()); 
 }
@Test
public void testLong358() { 
     final long o1 = 1L; 
     final long o2 = 2L; 
     assertTrue(new EqualsBuilder().append(o1, o1).isEquals()); 
     assertTrue(!new EqualsBuilder().append(o1, o2).isEquals()); 
 }
    
    
    

    private void testReflectionHierarchyEquals(final boolean testTransients) {
        final TestObject to1 = new TestObject(4);
        final TestObject to1Bis = new TestObject(4);
        final TestObject to1Ter = new TestObject(4);
        final TestObject to2 = new TestObject(5);
        final TestEmptySubObject teso = new TestEmptySubObject(4);
        final TestTSubObject ttso = new TestTSubObject(4, 1);
        final TestTTSubObject tttso = new TestTTSubObject(4, 1, 2);
        final TestTTLeafObject ttlo = new TestTTLeafObject(4, 1, 2, 3);
        final TestSubObject tso1 = new TestSubObject(1, 4);
        final TestSubObject tso1bis = new TestSubObject(1, 4);
        final TestSubObject tso1ter = new TestSubObject(1, 4);
        final TestSubObject tso2 = new TestSubObject(2, 5);

        testReflectionEqualsEquivalenceRelationship(to1, to1Bis, to1Ter, to2, new TestObject(), testTransients);
        testReflectionEqualsEquivalenceRelationship(tso1, tso1bis, tso1ter, tso2, new TestSubObject(), testTransients);

        // More sanity checks:

        // same values
        assertTrue(EqualsBuilder.reflectionEquals(ttlo, ttlo, testTransients));
        assertTrue(EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 10), testTransients));
        // same super values, diff sub values
        assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 11), testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 11), new TestSubObject(1, 10), testTransients));
        // diff super values, same sub values
        assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestSubObject(1, 10), testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(0, 10), testTransients));

        // mix super and sub types: equals
        assertTrue(EqualsBuilder.reflectionEquals(to1, teso, testTransients));
        assertTrue(EqualsBuilder.reflectionEquals(teso, to1, testTransients));

        assertTrue(EqualsBuilder.reflectionEquals(to1, ttso, false)); // Force testTransients = false for this assert
        assertTrue(EqualsBuilder.reflectionEquals(ttso, to1, false)); // Force testTransients = false for this assert

        assertTrue(EqualsBuilder.reflectionEquals(to1, tttso, false)); // Force testTransients = false for this assert
        assertTrue(EqualsBuilder.reflectionEquals(tttso, to1, false)); // Force testTransients = false for this assert

        assertTrue(EqualsBuilder.reflectionEquals(ttso, tttso, false)); // Force testTransients = false for this assert
        assertTrue(EqualsBuilder.reflectionEquals(tttso, ttso, false)); // Force testTransients = false for this assert

        // mix super and sub types: NOT equals
        assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestEmptySubObject(1), testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(new TestEmptySubObject(1), new TestObject(0), testTransients));

        assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestTSubObject(1, 1), testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(new TestTSubObject(1, 1), new TestObject(0), testTransients));

        assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(1), new TestSubObject(0, 10), testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestObject(1), testTransients));

        assertTrue(!EqualsBuilder.reflectionEquals(to1, ttlo));
        assertTrue(!EqualsBuilder.reflectionEquals(tso1, this));
    }

    /**
     * Equivalence relationship tests inspired by "Effective Java":
     * <ul>
     * <li>reflection</li>
     * <li>symmetry</li>
     * <li>transitive</li>
     * <li>consistency</li>
     * <li>non-null reference</li>
     * </ul>
     * @param to a TestObject
     * @param toBis a TestObject, equal to to and toTer
     * @param toTer Left hand side, equal to to and toBis
     * @param to2 a different TestObject
     * @param oToChange a TestObject that will be changed
     * @param testTransients whether to test transient instance variables 
     */
    private void testReflectionEqualsEquivalenceRelationship(
        final TestObject to,
        final TestObject toBis,
        final TestObject toTer,
        final TestObject to2,
        final TestObject oToChange,
        final boolean testTransients) {

        // reflection test
        assertTrue(EqualsBuilder.reflectionEquals(to, to, testTransients));
        assertTrue(EqualsBuilder.reflectionEquals(to2, to2, testTransients));

        // symmetry test
        assertTrue(EqualsBuilder.reflectionEquals(to, toBis, testTransients) && EqualsBuilder.reflectionEquals(toBis, to, testTransients));

        // transitive test
        assertTrue(
            EqualsBuilder.reflectionEquals(to, toBis, testTransients)
                && EqualsBuilder.reflectionEquals(toBis, toTer, testTransients)
                && EqualsBuilder.reflectionEquals(to, toTer, testTransients));

        // consistency test
        oToChange.setA(to.getA());
        if (oToChange instanceof TestSubObject) {
            ((TestSubObject) oToChange).setB(((TestSubObject) to).getB());
        }
        assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        oToChange.setA(to.getA() + 1);
        if (oToChange instanceof TestSubObject) {
            ((TestSubObject) oToChange).setB(((TestSubObject) to).getB() + 1);
        }
        assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));

        // non-null reference test
        assertTrue(!EqualsBuilder.reflectionEquals(to, null, testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(to2, null, testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(null, to, testTransients));
        assertTrue(!EqualsBuilder.reflectionEquals(null, to2, testTransients));
        assertTrue(EqualsBuilder.reflectionEquals((Object) null, (Object) null, testTransients));
    }

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    public static class TestACanEqualB {
        private final int a;

        public TestACanEqualB(final int a) {
            this.a = a;
        }

        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof TestACanEqualB) {
                return this.a == ((TestACanEqualB) o).getA();
            }
            if (o instanceof TestBCanEqualA) {
                return this.a == ((TestBCanEqualA) o).getB();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return a;
        }

        public int getA() {
            return this.a;
        }
    }

    public static class TestBCanEqualA {
        private final int b;

        public TestBCanEqualA(final int b) {
            this.b = b;
        }

        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof TestACanEqualB) {
                return this.b == ((TestACanEqualB) o).getA();
            }
            if (o instanceof TestBCanEqualA) {
                return this.b == ((TestBCanEqualA) o).getB();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return b;
        }

        public int getB() {
            return this.b;
        }
    }
    
    /**
     * Tests two instances of classes that can be equal and that are not "related". The two classes are not subclasses
     * of each other and do not share a parent aside from Object.
     * See http://issues.apache.org/bugzilla/show_bug.cgi?id=33069
     */
    
    
    /**
     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id=33067
     */
    

    

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private final TestObject one;
        @SuppressWarnings("unused")
        private final TestObject two;
        @SuppressWarnings("unused")
        private final TestObject three;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {
            this.one = new TestObject(one);
            this.two = new TestObject(two);
            this.three = new TestObject(three);
        }
    }
    
    /**
     * Test cyclical object references which cause a StackOverflowException if
     * not handled properly. s. LANG-606
     */
    

    static class TestObjectReference {
        @SuppressWarnings("unused")
        private TestObjectReference reference;
        @SuppressWarnings("unused")
        private final TestObject one;

        public TestObjectReference(final int one) {
            this.one = new TestObject(one);
        }

        public void setObjectReference(final TestObjectReference reference) {
            this.reference = reference;
        }

        @Override
        public boolean equals(final Object obj) {
            return EqualsBuilder.reflectionEquals(this, obj);
        }
    }
}

