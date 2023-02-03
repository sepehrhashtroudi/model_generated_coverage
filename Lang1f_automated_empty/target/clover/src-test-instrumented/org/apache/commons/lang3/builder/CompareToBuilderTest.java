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
public class CompareToBuilderTest {static class __CLR4_4_1fcnfcnldniggui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19895);
            __CLR4_4_1fcnfcnldniggui.R.inc(19896);this.a = a;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19897);
            __CLR4_4_1fcnfcnldniggui.R.inc(19898);if ((((o == this)&&(__CLR4_4_1fcnfcnldniggui.R.iget(19899)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19900)==0&false))) {{
                __CLR4_4_1fcnfcnldniggui.R.inc(19901);return true;
            }
            }__CLR4_4_1fcnfcnldniggui.R.inc(19902);if ((((!(o instanceof TestObject))&&(__CLR4_4_1fcnfcnldniggui.R.iget(19903)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19904)==0&false))) {{
                __CLR4_4_1fcnfcnldniggui.R.inc(19905);return false;
            }
            }__CLR4_4_1fcnfcnldniggui.R.inc(19906);final TestObject rhs = (TestObject) o;
            __CLR4_4_1fcnfcnldniggui.R.inc(19907);return a == rhs.a;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1fcnfcnldniggui.R.inc(19908);
            __CLR4_4_1fcnfcnldniggui.R.inc(19909);return a;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19910);
            __CLR4_4_1fcnfcnldniggui.R.inc(19911);this.a = a;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1fcnfcnldniggui.R.inc(19912);
            __CLR4_4_1fcnfcnldniggui.R.inc(19913);return a;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
        @Override
        public int compareTo(final TestObject rhs) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19914);
            __CLR4_4_1fcnfcnldniggui.R.inc(19915);return (((a < rhs.a )&&(__CLR4_4_1fcnfcnldniggui.R.iget(19916)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19917)==0&false))? -1 : (((a > rhs.a )&&(__CLR4_4_1fcnfcnldniggui.R.iget(19918)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19919)==0&false))? +1 : 0;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_4_1fcnfcnldniggui.R.inc(19921);try{__CLR4_4_1fcnfcnldniggui.R.inc(19920);
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_4_1fcnfcnldniggui.R.inc(19923);try{__CLR4_4_1fcnfcnldniggui.R.inc(19922);
            __CLR4_4_1fcnfcnldniggui.R.inc(19924);this.b = b;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19925);
            __CLR4_4_1fcnfcnldniggui.R.inc(19926);if ((((o == this)&&(__CLR4_4_1fcnfcnldniggui.R.iget(19927)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19928)==0&false))) {{
                __CLR4_4_1fcnfcnldniggui.R.inc(19929);return true;
            }
            }__CLR4_4_1fcnfcnldniggui.R.inc(19930);if ((((!(o instanceof TestSubObject))&&(__CLR4_4_1fcnfcnldniggui.R.iget(19931)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19932)==0&false))) {{
                __CLR4_4_1fcnfcnldniggui.R.inc(19933);return false;
            }
            }__CLR4_4_1fcnfcnldniggui.R.inc(19934);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_4_1fcnfcnldniggui.R.inc(19935);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);__CLR4_4_1fcnfcnldniggui.R.inc(19937);try{__CLR4_4_1fcnfcnldniggui.R.inc(19936);
            __CLR4_4_1fcnfcnldniggui.R.inc(19938);this.t = t;
        }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    }
    
    

    

    

    
    
    
    
    
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19939);
        __CLR4_4_1fcnfcnldniggui.R.inc(19940);assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19941);assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19942);assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        __CLR4_4_1fcnfcnldniggui.R.inc(19943);assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19944);assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19945);assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        __CLR4_4_1fcnfcnldniggui.R.inc(19946);assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19947);assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        __CLR4_4_1fcnfcnldniggui.R.inc(19948);assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19949);
        __CLR4_4_1fcnfcnldniggui.R.inc(19950);final TestObject to1 = new TestObject(1);
        __CLR4_4_1fcnfcnldniggui.R.inc(19951);final TestObject to2 = new TestObject(2);
        __CLR4_4_1fcnfcnldniggui.R.inc(19952);final TestObject to3 = new TestObject(3);
        __CLR4_4_1fcnfcnldniggui.R.inc(19953);final TestSubObject tso1 = new TestSubObject(1, 1);
        __CLR4_4_1fcnfcnldniggui.R.inc(19954);final TestSubObject tso2 = new TestSubObject(2, 2);
        __CLR4_4_1fcnfcnldniggui.R.inc(19955);final TestSubObject tso3 = new TestSubObject(3, 3);
        
        __CLR4_4_1fcnfcnldniggui.R.inc(19956);assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        __CLR4_4_1fcnfcnldniggui.R.inc(19957);assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        __CLR4_4_1fcnfcnldniggui.R.inc(19958);assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        __CLR4_4_1fcnfcnldniggui.R.inc(19959);assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        __CLR4_4_1fcnfcnldniggui.R.inc(19960);assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        __CLR4_4_1fcnfcnldniggui.R.inc(19961);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        __CLR4_4_1fcnfcnldniggui.R.inc(19962);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        __CLR4_4_1fcnfcnldniggui.R.inc(19963);assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        __CLR4_4_1fcnfcnldniggui.R.inc(19964);assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19965);

        // signum
        __CLR4_4_1fcnfcnldniggui.R.inc(19966);assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        __CLR4_4_1fcnfcnldniggui.R.inc(19967);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0)&&(__CLR4_4_1fcnfcnldniggui.R.iget(19968)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19969)==0&false))){{
            __CLR4_4_1fcnfcnldniggui.R.inc(19970);assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        }__CLR4_4_1fcnfcnldniggui.R.inc(19971);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0)&&(__CLR4_4_1fcnfcnldniggui.R.iget(19972)!=0|true))||(__CLR4_4_1fcnfcnldniggui.R.iget(19973)==0&false))) {{
            __CLR4_4_1fcnfcnldniggui.R.inc(19974);assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        }__CLR4_4_1fcnfcnldniggui.R.inc(19975);assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    
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
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {try{__CLR4_4_1fcnfcnldniggui.R.inc(19976);
        __CLR4_4_1fcnfcnldniggui.R.inc(19977);return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }finally{__CLR4_4_1fcnfcnldniggui.R.flushNeeded();}}
    
    
    
    
    
    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    
  
 }
