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
package org.apache.commons.lang3.tuple;

/**
 * <p>A mutable pair consisting of two {@code Object} elements.</p>
 * 
 * <p>Not #ThreadSafe#</p>
 *
 * @param <L> the left element type
 * @param <R> the right element type
 *
 * @since Lang 3.0
 * @version $Id$
 */
public class MutablePair<L, R> extends Pair<L, R> {public static class __CLR4_4_1evcevcldni84jk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,19292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 4954918890077093841L;

    /** Left object */
    public L left;
    /** Right object */
    public R right;

    /**
     * <p>Obtains an immutable pair of from two objects inferring the generic types.</p>
     * 
     * <p>This factory allows the pair to be created using inference to
     * obtain the generic types.</p>
     * 
     * @param <L> the left element type
     * @param <R> the right element type
     * @param left  the left element, may be null
     * @param right  the right element, may be null
     * @return a pair formed from the two parameters, not null
     */
    public static <L, R> MutablePair<L, R> of(final L left, final R right) {try{__CLR4_4_1evcevcldni84jk.R.inc(19272);
        __CLR4_4_1evcevcldni84jk.R.inc(19273);return new MutablePair<L, R>(left, right);
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * Create a new pair instance of two nulls.
     */
    public MutablePair() {
        super();__CLR4_4_1evcevcldni84jk.R.inc(19275);try{__CLR4_4_1evcevcldni84jk.R.inc(19274);
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * Create a new pair instance.
     *
     * @param left  the left value, may be null
     * @param right  the right value, may be null
     */
    public MutablePair(final L left, final R right) {
        super();__CLR4_4_1evcevcldni84jk.R.inc(19277);try{__CLR4_4_1evcevcldni84jk.R.inc(19276);
        __CLR4_4_1evcevcldni84jk.R.inc(19278);this.left = left;
        __CLR4_4_1evcevcldni84jk.R.inc(19279);this.right = right;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public L getLeft() {try{__CLR4_4_1evcevcldni84jk.R.inc(19280);
        __CLR4_4_1evcevcldni84jk.R.inc(19281);return left;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * Sets the left element of the pair.
     * 
     * @param left  the new value of the left element, may be null
     */
    public void setLeft(final L left) {try{__CLR4_4_1evcevcldni84jk.R.inc(19282);
        __CLR4_4_1evcevcldni84jk.R.inc(19283);this.left = left;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public R getRight() {try{__CLR4_4_1evcevcldni84jk.R.inc(19284);
        __CLR4_4_1evcevcldni84jk.R.inc(19285);return right;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * Sets the right element of the pair.
     * 
     * @param right  the new value of the right element, may be null
     */
    public void setRight(final R right) {try{__CLR4_4_1evcevcldni84jk.R.inc(19286);
        __CLR4_4_1evcevcldni84jk.R.inc(19287);this.right = right;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

    /**
     * Sets the {@code Map.Entry} value.
     * This sets the right element of the pair.
     * 
     * @param value  the right value to set, not null
     * @return the old value for the right element
     */
    @Override
    public R setValue(final R value) {try{__CLR4_4_1evcevcldni84jk.R.inc(19288);
        __CLR4_4_1evcevcldni84jk.R.inc(19289);final R result = getRight();
        __CLR4_4_1evcevcldni84jk.R.inc(19290);setRight(value);
        __CLR4_4_1evcevcldni84jk.R.inc(19291);return result;
    }finally{__CLR4_4_1evcevcldni84jk.R.flushNeeded();}}

}
