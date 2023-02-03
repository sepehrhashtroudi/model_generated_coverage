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

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.GenericTypeHolder;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test TypeUtils
 * @version $Id$
 */
@SuppressWarnings({ "unchecked", "unused" , "rawtypes", "null"})
//raw types, where used, are used purposely
public class TypeUtilsTest<B> {static class __CLR4_4_1g1dg1dldniggyi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public interface This<K, V> {
    }

    public class That<K, V> implements This<K, V> {
    }

    public interface And<K, V> extends This<Number, Number> {
    }

    public class The<K, V> extends That<Number, Number> implements And<String, String> {
    }

    public class Other<T> implements This<String, T> {
    }

    public class Thing<Q> extends Other<B> {
    }

    public class Tester implements This<String, B> {
    }

    public This<String, String> dis;

    public That<String, String> dat;

    public The<String, String> da;

    public Other<String> uhder;

    public Thing ding;

    public TypeUtilsTest<String>.Tester tester;

    public Tester tester2;

    public TypeUtilsTest<String>.That<String, String> dat2;

    public TypeUtilsTest<Number>.That<String, String> dat3;

    public Comparable<? extends Integer>[] intWildcardComparable;

    public static Comparable<String> stringComparable;

    public static Comparable<URI> uriComparable;

    public static Comparable<Integer> intComparable;

    public static Comparable<Long> longComparable;

    public static URI uri;

    public void dummyMethod(final List list0, final List<Object> list1, final List<?> list2,
            final List<? super Object> list3, final List<String> list4, final List<? extends String> list5,
            final List<? super String> list6, final List[] list7, final List<Object>[] list8, final List<?>[] list9,
            final List<? super Object>[] list10, final List<String>[] list11, final List<? extends String>[] list12,
            final List<? super String>[] list13) {try{__CLR4_4_1g1dg1dldniggyi.R.inc(20785);
    }finally{__CLR4_4_1g1dg1dldniggyi.R.flushNeeded();}}

    

    public void delegateBooleanAssertion(final Type[] types, final int i2, final int i1, final boolean expected) {try{__CLR4_4_1g1dg1dldniggyi.R.inc(20786);
        __CLR4_4_1g1dg1dldniggyi.R.inc(20787);final Type type1 = types[i1];
        __CLR4_4_1g1dg1dldniggyi.R.inc(20788);final Type type2 = types[i2];
        __CLR4_4_1g1dg1dldniggyi.R.inc(20789);final boolean isAssignable = TypeUtils.isAssignable(type2, type1);

        __CLR4_4_1g1dg1dldniggyi.R.inc(20790);if ((((expected)&&(__CLR4_4_1g1dg1dldniggyi.R.iget(20791)!=0|true))||(__CLR4_4_1g1dg1dldniggyi.R.iget(20792)==0&false))) {{
            __CLR4_4_1g1dg1dldniggyi.R.inc(20793);Assert.assertTrue("[" + i1 + ", " + i2 + "]: From "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type2)) + " to "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type1)), isAssignable);
        } }else {{
            __CLR4_4_1g1dg1dldniggyi.R.inc(20794);Assert.assertFalse("[" + i1 + ", " + i2 + "]: From "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type2)) + " to "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type1)), isAssignable);
        }
    }}finally{__CLR4_4_1g1dg1dldniggyi.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    public Iterable<? extends Map<Integer, ? extends Collection<?>>> iterable;

    public static <G extends Comparable<G>> G stub() {try{__CLR4_4_1g1dg1dldniggyi.R.inc(20795);
        __CLR4_4_1g1dg1dldniggyi.R.inc(20796);return null;
    }finally{__CLR4_4_1g1dg1dldniggyi.R.flushNeeded();}}

    public static <G extends Comparable<? super G>> G stub2() {try{__CLR4_4_1g1dg1dldniggyi.R.inc(20797);
        __CLR4_4_1g1dg1dldniggyi.R.inc(20798);return null;
    }finally{__CLR4_4_1g1dg1dldniggyi.R.flushNeeded();}}

    public static <T extends Comparable<? extends T>> T stub3() {try{__CLR4_4_1g1dg1dldniggyi.R.inc(20799);
        __CLR4_4_1g1dg1dldniggyi.R.inc(20800);return null;
    }finally{__CLR4_4_1g1dg1dldniggyi.R.flushNeeded();}}
}

class AAClass<T> {

    public class BBClass<S> {
    }
}

class AAAClass extends AAClass<String> {
    public class BBBClass extends BBClass<String> {
    }
}

@SuppressWarnings("rawtypes")
//raw types, where used, are used purposely
class AClass extends AAClass<String>.BBClass<Number> {public static class __CLR4_4_1g1dg1tldniggyi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AClass(final AAClass<String> enclosingInstance) {
        enclosingInstance.super();__CLR4_4_1g1dg1tldniggyi.R.inc(20802);try{__CLR4_4_1g1dg1tldniggyi.R.inc(20801);
    }finally{__CLR4_4_1g1dg1tldniggyi.R.flushNeeded();}}

    public class BClass<T> {
    }

    public class CClass<T> extends BClass {
    }

    public class DClass<T> extends CClass<T> {
    }

    public class EClass<T> extends DClass {
    }

    public class FClass extends EClass<String> {
    }

    public class GClass<T extends BClass<? extends T> & AInterface<AInterface<? super T>>> {
    }

    public BClass<Number> bClass;

    public CClass<? extends String> cClass;

    public DClass<String> dClass;

    public EClass<String> eClass;

    public FClass fClass;

    public GClass gClass;

    public interface AInterface<T> {
    }
}
