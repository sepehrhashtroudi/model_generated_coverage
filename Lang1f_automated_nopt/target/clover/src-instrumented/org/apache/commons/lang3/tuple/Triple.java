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

import java.io.Serializable;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * <p>A triple consisting of three elements.</p>
 *
 * <p>This class is an abstract implementation defining the basic API.
 * It refers to the elements as 'left', 'middle' and 'right'.</p>
 *
 * <p>Subclass implementations may be mutable or immutable.
 * However, there is no restriction on the type of the stored objects that may be stored.
 * If mutable objects are stored in the triple, then the triple itself effectively becomes mutable.</p>
 *
 * @param <L> the left element type
 * @param <M> the middle element type
 * @param <R> the right element type
 *
 * @version $Id$
 */
public abstract class Triple<L, M, R> implements Comparable<Triple<L, M, R>>, Serializable {public static class __CLR4_4_1exaexaldni84jy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,19369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 1L;

    /**
     * <p>Obtains an immutable triple of from three objects inferring the generic types.</p>
     *
     * <p>This factory allows the triple to be created using inference to
     * obtain the generic types.</p>
     *
     * @param <L> the left element type
     * @param <M> the middle element type
     * @param <R> the right element type
     * @param left  the left element, may be null
     * @param middle the middle element, may be null
     * @param right  the right element, may be null
     * @return a triple formed from the three parameters, not null
     */
    public static <L, M, R> Triple<L, M, R> of(final L left, final M middle, final R right) {try{__CLR4_4_1exaexaldni84jy.R.inc(19342);
        __CLR4_4_1exaexaldni84jy.R.inc(19343);return new ImmutableTriple<L, M, R>(left, middle, right);
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets the left element from this triple.</p>
     *
     * @return the left element, may be null
     */
    public abstract L getLeft();

    /**
     * <p>Gets the middle element from this triple.</p>
     *
     * @return the middle element, may be null
     */
    public abstract M getMiddle();

    /**
     * <p>Gets the right element from this triple.</p>
     *
     * @return the right element, may be null
     */
    public abstract R getRight();

    //-----------------------------------------------------------------------
    /**
     * <p>Compares the triple based on the left element, followed by the middle element,
     * finally the right element.
     * The types must be {@code Comparable}.</p>
     *
     * @param other  the other triple, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final Triple<L, M, R> other) {try{__CLR4_4_1exaexaldni84jy.R.inc(19344);
      __CLR4_4_1exaexaldni84jy.R.inc(19345);return new CompareToBuilder().append(getLeft(), other.getLeft())
          .append(getMiddle(), other.getMiddle())
          .append(getRight(), other.getRight()).toComparison();
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

    /**
     * <p>Compares this triple to another based on the three elements.</p>
     *
     * @param obj  the object to compare to, null returns false
     * @return true if the elements of the triple are equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1exaexaldni84jy.R.inc(19346);
        __CLR4_4_1exaexaldni84jy.R.inc(19347);if ((((obj == this)&&(__CLR4_4_1exaexaldni84jy.R.iget(19348)!=0|true))||(__CLR4_4_1exaexaldni84jy.R.iget(19349)==0&false))) {{
            __CLR4_4_1exaexaldni84jy.R.inc(19350);return true;
        }
        }__CLR4_4_1exaexaldni84jy.R.inc(19351);if ((((obj instanceof Triple<?, ?, ?>)&&(__CLR4_4_1exaexaldni84jy.R.iget(19352)!=0|true))||(__CLR4_4_1exaexaldni84jy.R.iget(19353)==0&false))) {{
            __CLR4_4_1exaexaldni84jy.R.inc(19354);final Triple<?, ?, ?> other = (Triple<?, ?, ?>) obj;
            __CLR4_4_1exaexaldni84jy.R.inc(19355);return ObjectUtils.equals(getLeft(), other.getLeft())
                && ObjectUtils.equals(getMiddle(), other.getMiddle())
                && ObjectUtils.equals(getRight(), other.getRight());
        }
        }__CLR4_4_1exaexaldni84jy.R.inc(19356);return false;
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

    /**
     * <p>Returns a suitable hash code.</p>
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_1exaexaldni84jy.R.inc(19357);
        __CLR4_4_1exaexaldni84jy.R.inc(19358);return ((((getLeft() == null )&&(__CLR4_4_1exaexaldni84jy.R.iget(19359)!=0|true))||(__CLR4_4_1exaexaldni84jy.R.iget(19360)==0&false))? 0 : getLeft().hashCode()) ^
            ((((getMiddle() == null )&&(__CLR4_4_1exaexaldni84jy.R.iget(19361)!=0|true))||(__CLR4_4_1exaexaldni84jy.R.iget(19362)==0&false))? 0 : getMiddle().hashCode()) ^
            ((((getRight() == null )&&(__CLR4_4_1exaexaldni84jy.R.iget(19363)!=0|true))||(__CLR4_4_1exaexaldni84jy.R.iget(19364)==0&false))? 0 : getRight().hashCode());
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

    /**
     * <p>Returns a String representation of this triple using the format {@code ($left,$middle,$right)}.</p>
     *
     * @return a string describing this object, not null
     */
    @Override
    public String toString() {try{__CLR4_4_1exaexaldni84jy.R.inc(19365);
        __CLR4_4_1exaexaldni84jy.R.inc(19366);return new StringBuilder().append('(').append(getLeft()).append(',').append(getMiddle()).append(',')
            .append(getRight()).append(')').toString();
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

    /**
     * <p>Formats the receiver using the given format.</p>
     *
     * <p>This uses {@link java.util.Formattable} to perform the formatting. Three variables may
     * be used to embed the left and right elements. Use {@code %1$s} for the left
     * element, {@code %2$s} for the middle and {@code %3$s} for the right element.
     * The default format used by {@code toString()} is {@code (%1$s,%2$s,%3$s)}.</p>
     *
     * @param format  the format string, optionally containing {@code %1$s}, {@code %2$s} and {@code %3$s}, not null
     * @return the formatted string, not null
     */
    public String toString(final String format) {try{__CLR4_4_1exaexaldni84jy.R.inc(19367);
        __CLR4_4_1exaexaldni84jy.R.inc(19368);return String.format(format, getLeft(), getMiddle(), getRight());
    }finally{__CLR4_4_1exaexaldni84jy.R.flushNeeded();}}

}

