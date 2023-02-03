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
package org.apache.commons.lang3.reflect;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Unit tests ConstructorUtils
 * @version $Id$
 */
public class ConstructorUtilsTest {static class __CLR4_4_1g9wg9wldni84zh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21124,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static class TestBean {
        private final String toString;

        public TestBean() {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21092);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21093);toString = "()";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        public TestBean(final int i) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21094);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21095);toString = "(int)";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        public TestBean(final Integer i) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21096);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21097);toString = "(Integer)";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        public TestBean(final double d) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21098);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21099);toString = "(double)";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        public TestBean(final String s) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21100);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21101);toString = "(String)";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        public TestBean(final Object o) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21102);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21103);toString = "(Object)";
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21104);
            __CLR4_4_1g9wg9wldni84zh.R.inc(21105);return toString;
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}
    }

    private static class PrivateClass {
        @SuppressWarnings("unused")
        public PrivateClass() {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21106);
        }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}
    }

    private final Map<Class<?>, Class<?>[]> classCache;

    public ConstructorUtilsTest() {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21107);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21108);classCache = new HashMap<Class<?>, Class<?>[]>();
    }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}


    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21109);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21110);classCache.clear();
    }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void expectMatchingAccessibleConstructorParameterTypes(final Class<?> cls,
            final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21111);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21112);final Constructor<?> c = ConstructorUtils.getMatchingAccessibleConstructor(cls,
                requestTypes);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21113);assertTrue(toString(c.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, c
                .getParameterTypes()));
    }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21114);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21115);return Arrays.asList(c).toString();
    }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_4_1g9wg9wldni84zh.R.inc(21116);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21117);Class<?>[] result = classCache.get(c);
        __CLR4_4_1g9wg9wldni84zh.R.inc(21118);if ((((result == null)&&(__CLR4_4_1g9wg9wldni84zh.R.iget(21119)!=0|true))||(__CLR4_4_1g9wg9wldni84zh.R.iget(21120)==0&false))) {{
            __CLR4_4_1g9wg9wldni84zh.R.inc(21121);result = new Class[] { c };
            __CLR4_4_1g9wg9wldni84zh.R.inc(21122);classCache.put(c, result);
        }
        }__CLR4_4_1g9wg9wldni84zh.R.inc(21123);return result;
    }finally{__CLR4_4_1g9wg9wldni84zh.R.flushNeeded();}}

}
