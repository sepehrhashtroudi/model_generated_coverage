/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
public class EqualsBuilderTest {static class __CLR4_4_1ff2ff2ldniggv0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject {
        private int a;
        public TestObject() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(19982);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        public TestObject(final int a) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(19983);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(19984);this.a = a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(19985);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(19986);if ((((o == null)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(19987)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(19988)==0&false))) {{ __CLR4_4_1ff2ff2ldniggv0.R.inc(19989);return false; }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(19990);if ((((o == this)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(19991)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(19992)==0&false))) {{ __CLR4_4_1ff2ff2ldniggv0.R.inc(19993);return true; }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(19994);if ((((o.getClass() != getClass())&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(19995)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(19996)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(19997);return false;
            }

            }__CLR4_4_1ff2ff2ldniggv0.R.inc(19998);final TestObject rhs = (TestObject) o;
            __CLR4_4_1ff2ff2ldniggv0.R.inc(19999);return a == rhs.a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20000);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20001);return a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20002);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20003);this.a = a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20004);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20005);return a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_4_1ff2ff2ldniggv0.R.inc(20007);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20006);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_4_1ff2ff2ldniggv0.R.inc(20009);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20008);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20010);this.b = b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20011);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20012);if ((((o == null)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20013)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20014)==0&false))) {{ __CLR4_4_1ff2ff2ldniggv0.R.inc(20015);return false; }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20016);if ((((o == this)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20017)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20018)==0&false))) {{ __CLR4_4_1ff2ff2ldniggv0.R.inc(20019);return true; }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20020);if ((((o.getClass() != getClass())&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20021)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20022)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20023);return false;
            }

            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20024);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20025);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20026);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20027);return b *17 + super.hashCode();
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public void setB(final int b) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20028);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20029);this.b = b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public int getB() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20030);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20031);return b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }
    
    static class TestEmptySubObject extends TestObject {
        public TestEmptySubObject(final int a) {
            super(a);__CLR4_4_1ff2ff2ldniggv0.R.inc(20033);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20032);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    static class TestTSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTSubObject(final int a, final int t) {
            super(a);__CLR4_4_1ff2ff2ldniggv0.R.inc(20035);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20034);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20036);this.t = t;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    static class TestTTSubObject extends TestTSubObject {
        @SuppressWarnings("unused")
        private transient int tt;
        public TestTTSubObject(final int a, final int t, final int tt) {
            super(a, t);__CLR4_4_1ff2ff2ldniggv0.R.inc(20038);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20037);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20039);this.tt = tt;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    static class TestTTLeafObject extends TestTTSubObject {
        @SuppressWarnings("unused")
        private final int leafValue;
        public TestTTLeafObject(final int a, final int t, final int tt, final int leafValue) {
            super(a, t, tt);__CLR4_4_1ff2ff2ldniggv0.R.inc(20041);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20040);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20042);this.leafValue = leafValue;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    static class TestTSubObject2 extends TestObject {
        private transient int t;
        public TestTSubObject2(final int a, final int t) {
            super(a);__CLR4_4_1ff2ff2ldniggv0.R.inc(20044);try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20043);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        public int getT() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20045);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20046);return t;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
        public void setT(final int t) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20047);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20048);this.t = t;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    
    
    

    private void testReflectionHierarchyEquals(final boolean testTransients) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20049);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20050);final TestObject to1 = new TestObject(4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20051);final TestObject to1Bis = new TestObject(4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20052);final TestObject to1Ter = new TestObject(4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20053);final TestObject to2 = new TestObject(5);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20054);final TestEmptySubObject teso = new TestEmptySubObject(4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20055);final TestTSubObject ttso = new TestTSubObject(4, 1);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20056);final TestTTSubObject tttso = new TestTTSubObject(4, 1, 2);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20057);final TestTTLeafObject ttlo = new TestTTLeafObject(4, 1, 2, 3);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20058);final TestSubObject tso1 = new TestSubObject(1, 4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20059);final TestSubObject tso1bis = new TestSubObject(1, 4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20060);final TestSubObject tso1ter = new TestSubObject(1, 4);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20061);final TestSubObject tso2 = new TestSubObject(2, 5);

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20062);testReflectionEqualsEquivalenceRelationship(to1, to1Bis, to1Ter, to2, new TestObject(), testTransients);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20063);testReflectionEqualsEquivalenceRelationship(tso1, tso1bis, tso1ter, tso2, new TestSubObject(), testTransients);

        // More sanity checks:

        // same values
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20064);assertTrue(EqualsBuilder.reflectionEquals(ttlo, ttlo, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20065);assertTrue(EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 10), testTransients));
        // same super values, diff sub values
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20066);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 11), testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20067);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 11), new TestSubObject(1, 10), testTransients));
        // diff super values, same sub values
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20068);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestSubObject(1, 10), testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20069);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(0, 10), testTransients));

        // mix super and sub types: equals
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20070);assertTrue(EqualsBuilder.reflectionEquals(to1, teso, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20071);assertTrue(EqualsBuilder.reflectionEquals(teso, to1, testTransients));

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20072);assertTrue(EqualsBuilder.reflectionEquals(to1, ttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20073);assertTrue(EqualsBuilder.reflectionEquals(ttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20074);assertTrue(EqualsBuilder.reflectionEquals(to1, tttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20075);assertTrue(EqualsBuilder.reflectionEquals(tttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20076);assertTrue(EqualsBuilder.reflectionEquals(ttso, tttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20077);assertTrue(EqualsBuilder.reflectionEquals(tttso, ttso, false)); // Force testTransients = false for this assert

        // mix super and sub types: NOT equals
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20078);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestEmptySubObject(1), testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20079);assertTrue(!EqualsBuilder.reflectionEquals(new TestEmptySubObject(1), new TestObject(0), testTransients));

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20080);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestTSubObject(1, 1), testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20081);assertTrue(!EqualsBuilder.reflectionEquals(new TestTSubObject(1, 1), new TestObject(0), testTransients));

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20082);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(1), new TestSubObject(0, 10), testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20083);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestObject(1), testTransients));

        __CLR4_4_1ff2ff2ldniggv0.R.inc(20084);assertTrue(!EqualsBuilder.reflectionEquals(to1, ttlo));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20085);assertTrue(!EqualsBuilder.reflectionEquals(tso1, this));
    }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

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
        final boolean testTransients) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20086);

        // reflection test
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20087);assertTrue(EqualsBuilder.reflectionEquals(to, to, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20088);assertTrue(EqualsBuilder.reflectionEquals(to2, to2, testTransients));

        // symmetry test
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20089);assertTrue(EqualsBuilder.reflectionEquals(to, toBis, testTransients) && EqualsBuilder.reflectionEquals(toBis, to, testTransients));

        // transitive test
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20090);assertTrue(
            EqualsBuilder.reflectionEquals(to, toBis, testTransients)
                && EqualsBuilder.reflectionEquals(toBis, toTer, testTransients)
                && EqualsBuilder.reflectionEquals(to, toTer, testTransients));

        // consistency test
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20091);oToChange.setA(to.getA());
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20092);if ((((oToChange instanceof TestSubObject)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20093)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20094)==0&false))) {{
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20095);((TestSubObject) oToChange).setB(((TestSubObject) to).getB());
        }
        }__CLR4_4_1ff2ff2ldniggv0.R.inc(20096);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20097);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20098);oToChange.setA(to.getA() + 1);
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20099);if ((((oToChange instanceof TestSubObject)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20100)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20101)==0&false))) {{
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20102);((TestSubObject) oToChange).setB(((TestSubObject) to).getB() + 1);
        }
        }__CLR4_4_1ff2ff2ldniggv0.R.inc(20103);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20104);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));

        // non-null reference test
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20105);assertTrue(!EqualsBuilder.reflectionEquals(to, null, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20106);assertTrue(!EqualsBuilder.reflectionEquals(to2, null, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20107);assertTrue(!EqualsBuilder.reflectionEquals(null, to, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20108);assertTrue(!EqualsBuilder.reflectionEquals(null, to2, testTransients));
        __CLR4_4_1ff2ff2ldniggv0.R.inc(20109);assertTrue(EqualsBuilder.reflectionEquals((Object) null, (Object) null, testTransients));
    }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    public static class TestACanEqualB {
        private final int a;

        public TestACanEqualB(final int a) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20110);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20111);this.a = a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20112);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20113);if ((((o == this)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20114)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20115)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20116);return true;
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20117);if ((((o instanceof TestACanEqualB)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20118)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20119)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20120);return this.a == ((TestACanEqualB) o).getA();
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20121);if ((((o instanceof TestBCanEqualA)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20122)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20123)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20124);return this.a == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20125);return false;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20126);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20127);return a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20128);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20129);return this.a;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }

    public static class TestBCanEqualA {
        private final int b;

        public TestBCanEqualA(final int b) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20130);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20131);this.b = b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20132);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20133);if ((((o == this)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20134)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20135)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20136);return true;
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20137);if ((((o instanceof TestACanEqualB)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20138)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20139)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20140);return this.b == ((TestACanEqualB) o).getA();
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20141);if ((((o instanceof TestBCanEqualA)&&(__CLR4_4_1ff2ff2ldniggv0.R.iget(20142)!=0|true))||(__CLR4_4_1ff2ff2ldniggv0.R.iget(20143)==0&false))) {{
                __CLR4_4_1ff2ff2ldniggv0.R.inc(20144);return this.b == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_4_1ff2ff2ldniggv0.R.inc(20145);return false;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20146);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20147);return b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public int getB() {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20148);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20149);return this.b;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
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

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20150);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20151);this.one = new TestObject(one);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20152);this.two = new TestObject(two);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20153);this.three = new TestObject(three);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
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

        public TestObjectReference(final int one) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20154);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20155);this.one = new TestObject(one);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        public void setObjectReference(final TestObjectReference reference) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20156);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20157);this.reference = reference;
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_1ff2ff2ldniggv0.R.inc(20158);
            __CLR4_4_1ff2ff2ldniggv0.R.inc(20159);return EqualsBuilder.reflectionEquals(this, obj);
        }finally{__CLR4_4_1ff2ff2ldniggv0.R.flushNeeded();}}
    }
}

