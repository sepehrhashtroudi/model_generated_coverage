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
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 *
 * @version $Id$
 */
public class CompareToBuilderTest {static class __CLR4_4_1fhmfhmldni84ui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20074);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20075);this.a = a;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20076);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20077);if ((((o == this)&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20078)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20079)==0&false))) {{
                __CLR4_4_1fhmfhmldni84ui.R.inc(20080);return true;
            }
            }__CLR4_4_1fhmfhmldni84ui.R.inc(20081);if ((((!(o instanceof TestObject))&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20082)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20083)==0&false))) {{
                __CLR4_4_1fhmfhmldni84ui.R.inc(20084);return false;
            }
            }__CLR4_4_1fhmfhmldni84ui.R.inc(20085);final TestObject rhs = (TestObject) o;
            __CLR4_4_1fhmfhmldni84ui.R.inc(20086);return a == rhs.a;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20087);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20088);return a;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20089);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20090);this.a = a;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20091);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20092);return a;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
        @Override
        public int compareTo(final TestObject rhs) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20093);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20094);return (((a < rhs.a )&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20095)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20096)==0&false))? -1 : (((a > rhs.a )&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20097)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20098)==0&false))? +1 : 0;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_4_1fhmfhmldni84ui.R.inc(20100);try{__CLR4_4_1fhmfhmldni84ui.R.inc(20099);
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_4_1fhmfhmldni84ui.R.inc(20102);try{__CLR4_4_1fhmfhmldni84ui.R.inc(20101);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20103);this.b = b;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20104);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20105);if ((((o == this)&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20106)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20107)==0&false))) {{
                __CLR4_4_1fhmfhmldni84ui.R.inc(20108);return true;
            }
            }__CLR4_4_1fhmfhmldni84ui.R.inc(20109);if ((((!(o instanceof TestSubObject))&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20110)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20111)==0&false))) {{
                __CLR4_4_1fhmfhmldni84ui.R.inc(20112);return false;
            }
            }__CLR4_4_1fhmfhmldni84ui.R.inc(20113);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_4_1fhmfhmldni84ui.R.inc(20114);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);__CLR4_4_1fhmfhmldni84ui.R.inc(20116);try{__CLR4_4_1fhmfhmldni84ui.R.inc(20115);
            __CLR4_4_1fhmfhmldni84ui.R.inc(20117);this.t = t;
        }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    }
    
@Test
public void testIntArray500() {__CLR4_4_1fhmfhmldni84ui.R.globalSliceStart(getClass().getName(),20118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2l3uofiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fhmfhmldni84ui.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fhmfhmldni84ui.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2l3uofiu(){try{__CLR4_4_1fhmfhmldni84ui.R.inc(20118); __CLR4_4_1fhmfhmldni84ui.R.inc(20119);final int[] lhs = new int[] {1, 2, 3}; __CLR4_4_1fhmfhmldni84ui.R.inc(20120);final int[] rhs = new int[] {1, 2, 3}; __CLR4_4_1fhmfhmldni84ui.R.inc(20121);CompareToBuilder builder = new CompareToBuilder(); __CLR4_4_1fhmfhmldni84ui.R.inc(20122);builder.append(lhs, rhs); __CLR4_4_1fhmfhmldni84ui.R.inc(20123);assertTrue(builder.toString().contains("1")); __CLR4_4_1fhmfhmldni84ui.R.inc(20124);assertTrue(builder.toString().contains("2")); __CLR4_4_1fhmfhmldni84ui.R.inc(20125);assertTrue(builder.toString().contains("3")); __CLR4_4_1fhmfhmldni84ui.R.inc(20126);builder.append(lhs, rhs); __CLR4_4_1fhmfhmldni84ui.R.inc(20127);assertTrue(builder.toString().contains("1")); __CLR4_4_1fhmfhmldni84ui.R.inc(20128);assertTrue(builder.toString().contains("2")); __CLR4_4_1fhmfhmldni84ui.R.inc(20129);builder.append(lhs, rhs); __CLR4_4_1fhmfhmldni84ui.R.inc(20130);assertTrue(builder.toString().contains("3"));
}finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

@Test
public void testCompareToBuilder506() {__CLR4_4_1fhmfhmldni84ui.R.globalSliceStart(getClass().getName(),20131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125uvt7fj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fhmfhmldni84ui.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fhmfhmldni84ui.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testCompareToBuilder506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125uvt7fj7(){try{__CLR4_4_1fhmfhmldni84ui.R.inc(20131); __CLR4_4_1fhmfhmldni84ui.R.inc(20132);CompareToBuilder builder = new CompareToBuilder(); __CLR4_4_1fhmfhmldni84ui.R.inc(20133);builder.append((byte) 1, (byte) 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20134);builder.append((short) 1, (short) 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20135);builder.append((int) 1, 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20136);builder.append((int) 1, 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20137);builder.append((short) 1, (short) 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20138);builder.append((int) 1, 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20139);builder.append((short) 1, (short) 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20140);builder.append((int) 1, 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20141);builder.append((short) 1, (short) 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20142);builder.append((int) 1, 1); __CLR4_4_1fhmfhmldni84ui.R.inc(20143);builder.append((short) 1, (short) 1);
}finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

    

    

    

    
    
    
    
    
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20144);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20145);assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20146);assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20147);assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        __CLR4_4_1fhmfhmldni84ui.R.inc(20148);assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20149);assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20150);assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        __CLR4_4_1fhmfhmldni84ui.R.inc(20151);assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20152);assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20153);assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20154);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20155);final TestObject to1 = new TestObject(1);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20156);final TestObject to2 = new TestObject(2);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20157);final TestObject to3 = new TestObject(3);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20158);final TestSubObject tso1 = new TestSubObject(1, 1);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20159);final TestSubObject tso2 = new TestSubObject(2, 2);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20160);final TestSubObject tso3 = new TestSubObject(3, 3);
        
        __CLR4_4_1fhmfhmldni84ui.R.inc(20161);assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20162);assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20163);assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20164);assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20165);assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        __CLR4_4_1fhmfhmldni84ui.R.inc(20166);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        __CLR4_4_1fhmfhmldni84ui.R.inc(20167);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        __CLR4_4_1fhmfhmldni84ui.R.inc(20168);assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        __CLR4_4_1fhmfhmldni84ui.R.inc(20169);assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20170);

        // signum
        __CLR4_4_1fhmfhmldni84ui.R.inc(20171);assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        __CLR4_4_1fhmfhmldni84ui.R.inc(20172);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0)&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20173)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20174)==0&false))){{
            __CLR4_4_1fhmfhmldni84ui.R.inc(20175);assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        }__CLR4_4_1fhmfhmldni84ui.R.inc(20176);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0)&&(__CLR4_4_1fhmfhmldni84ui.R.iget(20177)!=0|true))||(__CLR4_4_1fhmfhmldni84ui.R.iget(20178)==0&false))) {{
            __CLR4_4_1fhmfhmldni84ui.R.inc(20179);assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        }__CLR4_4_1fhmfhmldni84ui.R.inc(20180);assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    
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
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fhmfhmldni84ui.R.inc(20181);
        __CLR4_4_1fhmfhmldni84ui.R.inc(20182);return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }finally{__CLR4_4_1fhmfhmldni84ui.R.flushNeeded();}}
    
    
    
    
    
    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    
  
 }
