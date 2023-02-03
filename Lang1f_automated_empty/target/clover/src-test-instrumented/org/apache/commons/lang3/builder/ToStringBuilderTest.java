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
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.
 *
 * @version $Id$
 */
public class ToStringBuilderTest {static class __CLR4_4_1foqfoqldniggvz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));

    /*
     * All tests should leave the registry empty. 
     */
    @After
    public void after(){try{__CLR4_4_1foqfoqldniggvz.R.inc(20330);
        __CLR4_4_1foqfoqldniggvz.R.inc(20331);validateNullToStringStyleRegistry();
    }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    

    

    

    

    

    

    /**
     * Test wrapper for int primitive.
     */
    

    /**
     * Test wrapper for char primitive.
     */
    

    /**
     * Test wrapper for char boolean.
     */
    

    /**
     * Create the same toString() as Object.toString().
     * @param o the object to create the string for.
     * @return a String in the Object.toString format.
     */
    private String toBaseString(final Object o) {try{__CLR4_4_1foqfoqldniggvz.R.inc(20332);
        __CLR4_4_1foqfoqldniggvz.R.inc(20333);return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

    // Reflection Array tests

    //
    // Note on the following line of code repeated in the reflection array tests.
    //
    // assertReflectionArray("<null>", array);
    //
    // The expected value is not baseStr + "[<null>]" since array==null and is typed as Object.
    // The null array does not carry array type information.
    // If we added a primitive array type constructor and pile of associated methods,
    // then type declaring type information could be carried forward. IMHO, null is null.
    //
    // Gary Gregory - 2003-03-12 - ggregory@seagullsw.com
    //

    public void assertReflectionArray(final String expected, final Object actual) {try{__CLR4_4_1foqfoqldniggvz.R.inc(20334);
        __CLR4_4_1foqfoqldniggvz.R.inc(20335);if ((((actual == null)&&(__CLR4_4_1foqfoqldniggvz.R.iget(20336)!=0|true))||(__CLR4_4_1foqfoqldniggvz.R.iget(20337)==0&false))) {{
            // Until ToStringBuilder supports null objects.
            __CLR4_4_1foqfoqldniggvz.R.inc(20338);return;
        }
        }__CLR4_4_1foqfoqldniggvz.R.inc(20339);assertEquals(expected, ToStringBuilder.reflectionToString(actual));
        __CLR4_4_1foqfoqldniggvz.R.inc(20340);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null));
        __CLR4_4_1foqfoqldniggvz.R.inc(20341);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, true));
        __CLR4_4_1foqfoqldniggvz.R.inc(20342);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, false));
    }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    // Reflection Array Array tests

    


    

    

    

    

    

    

    

    // Reflection hierarchy tests
    
// Defects4J: flaky method
//     @Test
//     public void testReflectionHierarchyArrayList() {
//         final List<Object> base = new ArrayList<Object>();
//         final String baseStr = this.toBaseString(base);
//         // note, the test data depends on the internal representation of the ArrayList, which may differ between JDK versions and vendors
//         final String expectedWithTransients = baseStr + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
//         final String toStringWithTransients = ToStringBuilder.reflectionToString(base, null, true);
//         if (!expectedWithTransients.equals(toStringWithTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithTransients, toStringWithTransients);
//             }
//         }
//         final String expectedWithoutTransients = baseStr + "[size=0]";
//         final String toStringWithoutTransients = ToStringBuilder.reflectionToString(base, null, false);
//         if (!expectedWithoutTransients.equals(toStringWithoutTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithoutTransients, toStringWithoutTransients);
//             }
//         }
//     }

    

    static class ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char a='a';
        @SuppressWarnings("unused")
        private transient char transientA='t';
    }

    static class ReflectionTestFixtureB extends ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char b='b';
        @SuppressWarnings("unused")
        private transient char transientB='t';
    }

    

    static class Outer {
        Inner inner = new Inner();
        class Inner {
            @Override
            public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20343);
                __CLR4_4_1foqfoqldniggvz.R.inc(20344);return ToStringBuilder.reflectionToString(this);
            }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
        }
        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20345);
            __CLR4_4_1foqfoqldniggvz.R.inc(20346);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    // Reflection cycle tests

    /**
     * Test an array element pointing to its container.
     */
    

    /**
     * Test an array element pointing to its container.
     */
    

    

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20347);
            __CLR4_4_1foqfoqldniggvz.R.inc(20348);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20349);
            __CLR4_4_1foqfoqldniggvz.R.inc(20350);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class SimpleReflectionTestFixture {
        Object o;

        public SimpleReflectionTestFixture() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20351);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

        public SimpleReflectionTestFixture(final Object o) {try{__CLR4_4_1foqfoqldniggvz.R.inc(20352);
            __CLR4_4_1foqfoqldniggvz.R.inc(20353);this.o = o;
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20354);
            __CLR4_4_1foqfoqldniggvz.R.inc(20355);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    private static class SelfInstanceVarReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceVarReflectionTestFixture typeIsSelf;

        public SelfInstanceVarReflectionTestFixture() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20356);
            __CLR4_4_1foqfoqldniggvz.R.inc(20357);this.typeIsSelf = this;
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20358);
            __CLR4_4_1foqfoqldniggvz.R.inc(20359);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
      }

    private static class SelfInstanceTwoVarsReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceTwoVarsReflectionTestFixture typeIsSelf;
        private final String otherType = "The Other Type";

        public SelfInstanceTwoVarsReflectionTestFixture() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20360);
            __CLR4_4_1foqfoqldniggvz.R.inc(20361);this.typeIsSelf = this;
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

        public String getOtherType(){try{__CLR4_4_1foqfoqldniggvz.R.inc(20362);
            __CLR4_4_1foqfoqldniggvz.R.inc(20363);return this.otherType;
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20364);
            __CLR4_4_1foqfoqldniggvz.R.inc(20365);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
      }


    /**
     * Test an Object pointing to itself, the simplest test.
     *
     * @throws Exception
     */
    

    /**
     * Test a class that defines an ivar pointing to itself.
     *
     * @throws Exception
     */
    

    /**
     * Test a class that defines an ivar pointing to itself.  This test was
     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.
     *
     * @throws Exception
     */
    


    /**
     * Test Objects pointing to each other.
     *
     * @throws Exception
     */
    

    /**
     * Test a nasty combination of arrays and Objects pointing to each other.
     * objects[0] -> SimpleReflectionTestFixture[ o -> objects ]
     *
     * @throws Exception
     */
    

    void validateNullToStringStyleRegistry() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20366);
        __CLR4_4_1foqfoqldniggvz.R.inc(20367);final Map<Object, Object> registry = ToStringStyle.getRegistry();
        __CLR4_4_1foqfoqldniggvz.R.inc(20368);assertNull("Expected null, actual: "+registry, registry);
    }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    //  End: Reflection cycle tests

    

    

    
    
    

    

    

    

    

    

    

    

    


    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    static class ObjectCycle {
        Object obj;

        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20369);
            __CLR4_4_1foqfoqldniggvz.R.inc(20370);return new ToStringBuilder(this).append(obj).toString();
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    

    /**
     * <p>This method uses reflection to build a suitable
     * <code>toString</code> value which includes static fields.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run
     * under a security manager, if the permissions are not set up correctly.
     * It is also not as efficient as testing explicitly. </p>
     *
     * <p>Transient fields are not output.</p>
     *
     * <p>Superclass fields will be appended up to and including the specified superclass.
     * A null superclass is treated as <code>java.lang.Object</code>.</p>
     *
     * <p>If the style is <code>null</code>, the default
     * <code>ToStringStyle</code> is used.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create,
     *  may be <code>null</code>
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException if the Object is <code>null</code>
     */
    public <T> String toStringWithStatics(final T object, final ToStringStyle style, final Class<? super T> reflectUpToClass) {try{__CLR4_4_1foqfoqldniggvz.R.inc(20371);
        __CLR4_4_1foqfoqldniggvz.R.inc(20372);return ReflectionToStringBuilder.toString(object, style, false, true, reflectUpToClass);
    }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    class ReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
        static final transient String staticTransientString = "staticTransientString";
        static final transient int staticTransientInt = 54321;
        String instanceString = "instanceString";
        int instanceInt = 67890;
        transient String transientString = "transientString";
        transient int transientInt = 98765;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class SimpleReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class InheritedReflectionStaticFieldsFixture extends SimpleReflectionStaticFieldsFixture {
        static final String staticString2 = "staticString2";
        static final int staticInt2 = 67890;
    }

    

    /**
     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.
     * See issue LANG-372.
     */
    class MultiLineTestObject {
        Integer i = Integer.valueOf(31337);
        @Override
        public String toString() {try{__CLR4_4_1foqfoqldniggvz.R.inc(20373);
            __CLR4_4_1foqfoqldniggvz.R.inc(20374);return new ToStringBuilder(this).append("testInt", i).toString();
        }finally{__CLR4_4_1foqfoqldniggvz.R.flushNeeded();}}
    }

    

}
