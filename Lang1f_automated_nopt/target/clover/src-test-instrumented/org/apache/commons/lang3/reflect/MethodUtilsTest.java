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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests MethodUtils
 * @version $Id$
 */
public class MethodUtilsTest {static class __CLR4_4_1gb2gb2ldni84zp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21188,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
    private static interface PrivateInterface {}
    
    static class TestBeanWithInterfaces implements PrivateInterface {
        public String foo() {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21134);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21135);return "foo()";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
    }
    
    public static class TestBean {

        public static String bar() {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21136);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21137);return "bar()";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public static String bar(final int i) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21138);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21139);return "bar(int)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public static String bar(final Integer i) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21140);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21141);return "bar(Integer)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public static String bar(final double d) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21142);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21143);return "bar(double)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public static String bar(final String s) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21144);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21145);return "bar(String)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public static String bar(final Object o) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21146);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21147);return "bar(Object)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        
        public static void oneParameterStatic(final String s) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21148);
            // empty
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private void privateStuff() {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21149);
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}


        public String foo() {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21150);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21151);return "foo()";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public String foo(final int i) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21152);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21153);return "foo(int)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public String foo(final Integer i) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21154);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21155);return "foo(Integer)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public String foo(final double d) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21156);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21157);return "foo(double)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public String foo(final String s) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21158);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21159);return "foo(String)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        public String foo(final Object o) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21160);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21161);return "foo(Object)";
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        
        public void oneParameter(final String s) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21162);
            // empty
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
    }

    private static class TestMutable implements Mutable<Object> {
        @Override
        public Object getValue() {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21163);
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21164);return null;
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

        @Override
        public void setValue(final Object value) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21165);
        }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
    }

    private TestBean testBean;
    private final Map<Class<?>, Class<?>[]> classCache = new HashMap<Class<?>, Class<?>[]>();

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21166);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21167);testBean = new TestBean();
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21168);classCache.clear();
    }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

    

    

    

    

    

    
    
    

    

    

    
    
    

    

    

    private void expectMatchingAccessibleMethodParameterTypes(final Class<?> cls,
            final String methodName, final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21169);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21170);final Method m = MethodUtils.getMatchingAccessibleMethod(cls, methodName,
                requestTypes);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21171);assertTrue(toString(m.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, m
                .getParameterTypes()));
    }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21172);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21173);return Arrays.asList(c).toString();
    }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21174);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21175);Class<?>[] result = classCache.get(c);
        __CLR4_4_1gb2gb2ldni84zp.R.inc(21176);if ((((result == null)&&(__CLR4_4_1gb2gb2ldni84zp.R.iget(21177)!=0|true))||(__CLR4_4_1gb2gb2ldni84zp.R.iget(21178)==0&false))) {{
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21179);result = new Class[] { c };
            __CLR4_4_1gb2gb2ldni84zp.R.inc(21180);classCache.put(c, result);
        }
        }__CLR4_4_1gb2gb2ldni84zp.R.inc(21181);return result;
    }finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}

    public static class InheritanceBean {
        public void testOne(final Object obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21182);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        public void testOne(final GrandParentObject obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21183);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        public void testOne(final ParentObject obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21184);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        public void testTwo(final Object obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21185);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        public void testTwo(final GrandParentObject obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21186);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
        public void testTwo(final ChildInterface obj) {try{__CLR4_4_1gb2gb2ldni84zp.R.inc(21187);}finally{__CLR4_4_1gb2gb2ldni84zp.R.flushNeeded();}}
    }
    
    interface ChildInterface {}    
    public static class GrandParentObject {}
    public static class ParentObject extends GrandParentObject {}
    public static class ChildObject extends ParentObject implements ChildInterface {}
    
}
