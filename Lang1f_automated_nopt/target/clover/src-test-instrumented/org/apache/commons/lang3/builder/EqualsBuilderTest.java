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
public class EqualsBuilderTest {static class __CLR4_4_1fkrfkrldni84v6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20378,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject {
        private int a;
        public TestObject() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20187);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        public TestObject(final int a) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20188);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20189);this.a = a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20190);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20191);if ((((o == null)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20192)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20193)==0&false))) {{ __CLR4_4_1fkrfkrldni84v6.R.inc(20194);return false; }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20195);if ((((o == this)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20196)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20197)==0&false))) {{ __CLR4_4_1fkrfkrldni84v6.R.inc(20198);return true; }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20199);if ((((o.getClass() != getClass())&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20200)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20201)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20202);return false;
            }

            }__CLR4_4_1fkrfkrldni84v6.R.inc(20203);final TestObject rhs = (TestObject) o;
            __CLR4_4_1fkrfkrldni84v6.R.inc(20204);return a == rhs.a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20205);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20206);return a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20207);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20208);this.a = a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20209);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20210);return a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_4_1fkrfkrldni84v6.R.inc(20212);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20211);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_4_1fkrfkrldni84v6.R.inc(20214);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20213);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20215);this.b = b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20216);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20217);if ((((o == null)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20218)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20219)==0&false))) {{ __CLR4_4_1fkrfkrldni84v6.R.inc(20220);return false; }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20221);if ((((o == this)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20222)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20223)==0&false))) {{ __CLR4_4_1fkrfkrldni84v6.R.inc(20224);return true; }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20225);if ((((o.getClass() != getClass())&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20226)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20227)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20228);return false;
            }

            }__CLR4_4_1fkrfkrldni84v6.R.inc(20229);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_4_1fkrfkrldni84v6.R.inc(20230);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20231);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20232);return b *17 + super.hashCode();
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public void setB(final int b) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20233);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20234);this.b = b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public int getB() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20235);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20236);return b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }
    
    static class TestEmptySubObject extends TestObject {
        public TestEmptySubObject(final int a) {
            super(a);__CLR4_4_1fkrfkrldni84v6.R.inc(20238);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20237);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    static class TestTSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTSubObject(final int a, final int t) {
            super(a);__CLR4_4_1fkrfkrldni84v6.R.inc(20240);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20239);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20241);this.t = t;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    static class TestTTSubObject extends TestTSubObject {
        @SuppressWarnings("unused")
        private transient int tt;
        public TestTTSubObject(final int a, final int t, final int tt) {
            super(a, t);__CLR4_4_1fkrfkrldni84v6.R.inc(20243);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20242);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20244);this.tt = tt;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    static class TestTTLeafObject extends TestTTSubObject {
        @SuppressWarnings("unused")
        private final int leafValue;
        public TestTTLeafObject(final int a, final int t, final int tt, final int leafValue) {
            super(a, t, tt);__CLR4_4_1fkrfkrldni84v6.R.inc(20246);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20245);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20247);this.leafValue = leafValue;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    static class TestTSubObject2 extends TestObject {
        private transient int t;
        public TestTSubObject2(final int a, final int t) {
            super(a);__CLR4_4_1fkrfkrldni84v6.R.inc(20249);try{__CLR4_4_1fkrfkrldni84v6.R.inc(20248);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        public int getT() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20250);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20251);return t;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
        public void setT(final int t) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20252);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20253);this.t = t;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

@Test
public void testAppend855() {__CLR4_4_1fkrfkrldni84v6.R.globalSliceStart(getClass().getName(),20254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qn8tsjfmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkrfkrldni84v6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkrfkrldni84v6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testAppend855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qn8tsjfmm(){try{__CLR4_4_1fkrfkrldni84v6.R.inc(20254); __CLR4_4_1fkrfkrldni84v6.R.inc(20255);EqualsBuilder builder = new EqualsBuilder(); __CLR4_4_1fkrfkrldni84v6.R.inc(20256);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20257);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20258);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20259);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20260);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20261);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20262);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20263);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20264);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20265);builder.append(Math.PI, Math.PI); __CLR4_4_1fkrfkrldni84v6.R.inc(20266);builder.append(Math.PI, Math.PI);
}finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

    
    
    

    private void testReflectionHierarchyEquals(final boolean testTransients) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20267);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20268);final TestObject to1 = new TestObject(4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20269);final TestObject to1Bis = new TestObject(4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20270);final TestObject to1Ter = new TestObject(4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20271);final TestObject to2 = new TestObject(5);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20272);final TestEmptySubObject teso = new TestEmptySubObject(4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20273);final TestTSubObject ttso = new TestTSubObject(4, 1);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20274);final TestTTSubObject tttso = new TestTTSubObject(4, 1, 2);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20275);final TestTTLeafObject ttlo = new TestTTLeafObject(4, 1, 2, 3);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20276);final TestSubObject tso1 = new TestSubObject(1, 4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20277);final TestSubObject tso1bis = new TestSubObject(1, 4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20278);final TestSubObject tso1ter = new TestSubObject(1, 4);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20279);final TestSubObject tso2 = new TestSubObject(2, 5);

        __CLR4_4_1fkrfkrldni84v6.R.inc(20280);testReflectionEqualsEquivalenceRelationship(to1, to1Bis, to1Ter, to2, new TestObject(), testTransients);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20281);testReflectionEqualsEquivalenceRelationship(tso1, tso1bis, tso1ter, tso2, new TestSubObject(), testTransients);

        // More sanity checks:

        // same values
        __CLR4_4_1fkrfkrldni84v6.R.inc(20282);assertTrue(EqualsBuilder.reflectionEquals(ttlo, ttlo, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20283);assertTrue(EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 10), testTransients));
        // same super values, diff sub values
        __CLR4_4_1fkrfkrldni84v6.R.inc(20284);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 11), testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20285);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 11), new TestSubObject(1, 10), testTransients));
        // diff super values, same sub values
        __CLR4_4_1fkrfkrldni84v6.R.inc(20286);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestSubObject(1, 10), testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20287);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(0, 10), testTransients));

        // mix super and sub types: equals
        __CLR4_4_1fkrfkrldni84v6.R.inc(20288);assertTrue(EqualsBuilder.reflectionEquals(to1, teso, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20289);assertTrue(EqualsBuilder.reflectionEquals(teso, to1, testTransients));

        __CLR4_4_1fkrfkrldni84v6.R.inc(20290);assertTrue(EqualsBuilder.reflectionEquals(to1, ttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1fkrfkrldni84v6.R.inc(20291);assertTrue(EqualsBuilder.reflectionEquals(ttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_4_1fkrfkrldni84v6.R.inc(20292);assertTrue(EqualsBuilder.reflectionEquals(to1, tttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1fkrfkrldni84v6.R.inc(20293);assertTrue(EqualsBuilder.reflectionEquals(tttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_4_1fkrfkrldni84v6.R.inc(20294);assertTrue(EqualsBuilder.reflectionEquals(ttso, tttso, false)); // Force testTransients = false for this assert
        __CLR4_4_1fkrfkrldni84v6.R.inc(20295);assertTrue(EqualsBuilder.reflectionEquals(tttso, ttso, false)); // Force testTransients = false for this assert

        // mix super and sub types: NOT equals
        __CLR4_4_1fkrfkrldni84v6.R.inc(20296);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestEmptySubObject(1), testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20297);assertTrue(!EqualsBuilder.reflectionEquals(new TestEmptySubObject(1), new TestObject(0), testTransients));

        __CLR4_4_1fkrfkrldni84v6.R.inc(20298);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestTSubObject(1, 1), testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20299);assertTrue(!EqualsBuilder.reflectionEquals(new TestTSubObject(1, 1), new TestObject(0), testTransients));

        __CLR4_4_1fkrfkrldni84v6.R.inc(20300);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(1), new TestSubObject(0, 10), testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20301);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestObject(1), testTransients));

        __CLR4_4_1fkrfkrldni84v6.R.inc(20302);assertTrue(!EqualsBuilder.reflectionEquals(to1, ttlo));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20303);assertTrue(!EqualsBuilder.reflectionEquals(tso1, this));
    }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

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
        final boolean testTransients) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20304);

        // reflection test
        __CLR4_4_1fkrfkrldni84v6.R.inc(20305);assertTrue(EqualsBuilder.reflectionEquals(to, to, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20306);assertTrue(EqualsBuilder.reflectionEquals(to2, to2, testTransients));

        // symmetry test
        __CLR4_4_1fkrfkrldni84v6.R.inc(20307);assertTrue(EqualsBuilder.reflectionEquals(to, toBis, testTransients) && EqualsBuilder.reflectionEquals(toBis, to, testTransients));

        // transitive test
        __CLR4_4_1fkrfkrldni84v6.R.inc(20308);assertTrue(
            EqualsBuilder.reflectionEquals(to, toBis, testTransients)
                && EqualsBuilder.reflectionEquals(toBis, toTer, testTransients)
                && EqualsBuilder.reflectionEquals(to, toTer, testTransients));

        // consistency test
        __CLR4_4_1fkrfkrldni84v6.R.inc(20309);oToChange.setA(to.getA());
        __CLR4_4_1fkrfkrldni84v6.R.inc(20310);if ((((oToChange instanceof TestSubObject)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20311)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20312)==0&false))) {{
            __CLR4_4_1fkrfkrldni84v6.R.inc(20313);((TestSubObject) oToChange).setB(((TestSubObject) to).getB());
        }
        }__CLR4_4_1fkrfkrldni84v6.R.inc(20314);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20315);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20316);oToChange.setA(to.getA() + 1);
        __CLR4_4_1fkrfkrldni84v6.R.inc(20317);if ((((oToChange instanceof TestSubObject)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20318)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20319)==0&false))) {{
            __CLR4_4_1fkrfkrldni84v6.R.inc(20320);((TestSubObject) oToChange).setB(((TestSubObject) to).getB() + 1);
        }
        }__CLR4_4_1fkrfkrldni84v6.R.inc(20321);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20322);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));

        // non-null reference test
        __CLR4_4_1fkrfkrldni84v6.R.inc(20323);assertTrue(!EqualsBuilder.reflectionEquals(to, null, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20324);assertTrue(!EqualsBuilder.reflectionEquals(to2, null, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20325);assertTrue(!EqualsBuilder.reflectionEquals(null, to, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20326);assertTrue(!EqualsBuilder.reflectionEquals(null, to2, testTransients));
        __CLR4_4_1fkrfkrldni84v6.R.inc(20327);assertTrue(EqualsBuilder.reflectionEquals((Object) null, (Object) null, testTransients));
    }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

    

    
    
    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    public static class TestACanEqualB {
        private final int a;

        public TestACanEqualB(final int a) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20328);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20329);this.a = a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20330);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20331);if ((((o == this)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20332)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20333)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20334);return true;
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20335);if ((((o instanceof TestACanEqualB)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20336)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20337)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20338);return this.a == ((TestACanEqualB) o).getA();
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20339);if ((((o instanceof TestBCanEqualA)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20340)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20341)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20342);return this.a == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20343);return false;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20344);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20345);return a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20346);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20347);return this.a;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }

    public static class TestBCanEqualA {
        private final int b;

        public TestBCanEqualA(final int b) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20348);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20349);this.b = b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20350);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20351);if ((((o == this)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20352)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20353)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20354);return true;
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20355);if ((((o instanceof TestACanEqualB)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20356)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20357)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20358);return this.b == ((TestACanEqualB) o).getA();
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20359);if ((((o instanceof TestBCanEqualA)&&(__CLR4_4_1fkrfkrldni84v6.R.iget(20360)!=0|true))||(__CLR4_4_1fkrfkrldni84v6.R.iget(20361)==0&false))) {{
                __CLR4_4_1fkrfkrldni84v6.R.inc(20362);return this.b == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_4_1fkrfkrldni84v6.R.inc(20363);return false;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20364);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20365);return b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public int getB() {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20366);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20367);return this.b;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
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

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20368);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20369);this.one = new TestObject(one);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20370);this.two = new TestObject(two);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20371);this.three = new TestObject(three);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
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

        public TestObjectReference(final int one) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20372);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20373);this.one = new TestObject(one);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        public void setObjectReference(final TestObjectReference reference) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20374);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20375);this.reference = reference;
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_1fkrfkrldni84v6.R.inc(20376);
            __CLR4_4_1fkrfkrldni84v6.R.inc(20377);return EqualsBuilder.reflectionEquals(this, obj);
        }finally{__CLR4_4_1fkrfkrldni84v6.R.flushNeeded();}}
    }
}

