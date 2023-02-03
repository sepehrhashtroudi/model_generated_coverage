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
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.
 * 
 * @version $Id$
 */
public class HashCodeBuilderTest {static class __CLR4_4_1frffrfldni84vm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20473,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public int hashCode() {try{__CLR4_4_1frffrfldni84vm.R.inc(20427);
            __CLR4_4_1frffrfldni84vm.R.inc(20428);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public int hashCode() {try{__CLR4_4_1frffrfldni84vm.R.inc(20429);
            __CLR4_4_1frffrfldni84vm.R.inc(20430);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}
    }

    // -----------------------------------------------------------------------

    

    

    static class TestObject {
        private int a;

        public TestObject(final int a) {try{__CLR4_4_1frffrfldni84vm.R.inc(20431);
            __CLR4_4_1frffrfldni84vm.R.inc(20432);this.a = a;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1frffrfldni84vm.R.inc(20433);
            __CLR4_4_1frffrfldni84vm.R.inc(20434);if ((((o == this)&&(__CLR4_4_1frffrfldni84vm.R.iget(20435)!=0|true))||(__CLR4_4_1frffrfldni84vm.R.iget(20436)==0&false))) {{
                __CLR4_4_1frffrfldni84vm.R.inc(20437);return true;
            }
            }__CLR4_4_1frffrfldni84vm.R.inc(20438);if ((((!(o instanceof TestObject))&&(__CLR4_4_1frffrfldni84vm.R.iget(20439)!=0|true))||(__CLR4_4_1frffrfldni84vm.R.iget(20440)==0&false))) {{
                __CLR4_4_1frffrfldni84vm.R.inc(20441);return false;
            }
            }__CLR4_4_1frffrfldni84vm.R.inc(20442);final TestObject rhs = (TestObject) o;
            __CLR4_4_1frffrfldni84vm.R.inc(20443);return a == rhs.a;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1frffrfldni84vm.R.inc(20444);
            __CLR4_4_1frffrfldni84vm.R.inc(20445);return a;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_4_1frffrfldni84vm.R.inc(20446);
            __CLR4_4_1frffrfldni84vm.R.inc(20447);this.a = a;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        public int getA() {try{__CLR4_4_1frffrfldni84vm.R.inc(20448);
            __CLR4_4_1frffrfldni84vm.R.inc(20449);return a;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;

        @SuppressWarnings("unused")
        transient private int t;

        public TestSubObject() {
            super(0);__CLR4_4_1frffrfldni84vm.R.inc(20451);try{__CLR4_4_1frffrfldni84vm.R.inc(20450);
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        public TestSubObject(final int a, final int b, final int t) {
            super(a);__CLR4_4_1frffrfldni84vm.R.inc(20453);try{__CLR4_4_1frffrfldni84vm.R.inc(20452);
            __CLR4_4_1frffrfldni84vm.R.inc(20454);this.b = b;
            __CLR4_4_1frffrfldni84vm.R.inc(20455);this.t = t;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_4_1frffrfldni84vm.R.inc(20456);
            __CLR4_4_1frffrfldni84vm.R.inc(20457);if ((((o == this)&&(__CLR4_4_1frffrfldni84vm.R.iget(20458)!=0|true))||(__CLR4_4_1frffrfldni84vm.R.iget(20459)==0&false))) {{
                __CLR4_4_1frffrfldni84vm.R.inc(20460);return true;
            }
            }__CLR4_4_1frffrfldni84vm.R.inc(20461);if ((((!(o instanceof TestSubObject))&&(__CLR4_4_1frffrfldni84vm.R.iget(20462)!=0|true))||(__CLR4_4_1frffrfldni84vm.R.iget(20463)==0&false))) {{
                __CLR4_4_1frffrfldni84vm.R.inc(20464);return false;
            }
            }__CLR4_4_1frffrfldni84vm.R.inc(20465);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_4_1frffrfldni84vm.R.inc(20466);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1frffrfldni84vm.R.inc(20467);
            __CLR4_4_1frffrfldni84vm.R.inc(20468);return b*17 + super.hashCode();
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}

    }

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private int one = 0;

        @SuppressWarnings("unused")
        private int two = 0;

        @SuppressWarnings("unused")
        private int three = 0;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_4_1frffrfldni84vm.R.inc(20469);
            __CLR4_4_1frffrfldni84vm.R.inc(20470);this.one = one;
            __CLR4_4_1frffrfldni84vm.R.inc(20471);this.two = two;
            __CLR4_4_1frffrfldni84vm.R.inc(20472);this.three = three;
        }finally{__CLR4_4_1frffrfldni84vm.R.flushNeeded();}}
    }

    /**
     * Test Objects pointing to each other.
     */
    

    /**
     * Ensures LANG-520 remains true
     */
    

}
