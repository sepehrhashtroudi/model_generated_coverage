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

import org.junit.Test;

/**
 * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and
 * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal
 * objects must have equal hash codes.
 * 
 * @version $Id$
 */
public class HashCodeBuilderAndEqualsBuilderTest {static class __CLR4_4_1fk0fk0ldniggv5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    private void testInteger(final boolean testTransients) {try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20160);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20161);final Integer i1 = Integer.valueOf(12345);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20162);final Integer i2 = Integer.valueOf(12345);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20163);assertEqualsAndHashCodeContract(i1, i2, testTransients);
    }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}

    

    

    

    

    private void testFixture(final boolean testTransients) {try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20164);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20165);assertEqualsAndHashCodeContract(new TestFixture(2, 'c', "Test", (short) 2), new TestFixture(2, 'c', "Test", (short) 2), testTransients);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20166);assertEqualsAndHashCodeContract(
            new AllTransientFixture(2, 'c', "Test", (short) 2),
            new AllTransientFixture(2, 'c', "Test", (short) 2),
            testTransients);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20167);assertEqualsAndHashCodeContract(
            new SubTestFixture(2, 'c', "Test", (short) 2, "Same"),
            new SubTestFixture(2, 'c', "Test", (short) 2, "Same"),
            testTransients);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20168);assertEqualsAndHashCodeContract(
            new SubAllTransientFixture(2, 'c', "Test", (short) 2, "Same"),
            new SubAllTransientFixture(2, 'c', "Test", (short) 2, "Same"),
            testTransients);
    }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}

    /**
     * Asserts that if <code>lhs</code> equals <code>rhs</code> 
     * then their hash codes MUST be identical.
     * 
     * @param lhs The Left-Hand-Side of the equals test
     * @param rhs The Right-Hand-Side of the equals test
     * @param testTransients wether to test transient fields
     */
    private void assertEqualsAndHashCodeContract(final Object lhs, final Object rhs, final boolean testTransients) {try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20169);
        __CLR4_4_1fk0fk0ldniggv5.R.inc(20170);if ((((EqualsBuilder.reflectionEquals(lhs, rhs, testTransients))&&(__CLR4_4_1fk0fk0ldniggv5.R.iget(20171)!=0|true))||(__CLR4_4_1fk0fk0ldniggv5.R.iget(20172)==0&false))) {{
            // test a couple of times for consistency.
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20173);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20174);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20175);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
        }
    }}finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}

    static class TestFixture {
        int i;
        char c;
        String string;
        short s;

        TestFixture(final int i, final char c, final String string, final short s) {try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20176);
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20177);this.i = i;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20178);this.c = c;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20179);this.string = string;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20180);this.s = s;
        }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}
    }

    static class SubTestFixture extends TestFixture {
        transient String tString;

        SubTestFixture(final int i, final char c, final String string, final short s, final String tString) {
            super(i, c, string, s);__CLR4_4_1fk0fk0ldniggv5.R.inc(20182);try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20181);
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20183);this.tString = tString;
        }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}
    }

    static class AllTransientFixture {
        transient int i;
        transient char c;
        transient String string;
        transient short s;

        AllTransientFixture(final int i, final char c, final String string, final short s) {try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20184);
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20185);this.i = i;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20186);this.c = c;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20187);this.string = string;
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20188);this.s = s;
        }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}
    }

    static class SubAllTransientFixture extends AllTransientFixture {
        transient String tString;

        SubAllTransientFixture(final int i, final char c, final String string, final short s, final String tString) {
            super(i, c, string, s);__CLR4_4_1fk0fk0ldniggv5.R.inc(20190);try{__CLR4_4_1fk0fk0ldniggv5.R.inc(20189);
            __CLR4_4_1fk0fk0ldniggv5.R.inc(20191);this.tString = tString;
        }finally{__CLR4_4_1fk0fk0ldniggv5.R.flushNeeded();}}
    }


}
