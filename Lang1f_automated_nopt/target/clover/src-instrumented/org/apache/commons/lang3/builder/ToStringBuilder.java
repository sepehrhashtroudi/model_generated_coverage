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

import org.apache.commons.lang3.ObjectUtils;

/**
 * <p>Assists in implementing {@link Object#toString()} methods.</p>
 *
 * <p>This class enables a good and consistent <code>toString()</code> to be built for any
 * class or object. This class aims to simplify the process by:</p>
 * <ul>
 *  <li>allowing field names</li>
 *  <li>handling all types consistently</li>
 *  <li>handling nulls consistently</li>
 *  <li>outputting arrays and multi-dimensional arrays</li>
 *  <li>enabling the detail level to be controlled for Objects and Collections</li>
 *  <li>handling class hierarchies</li>
 * </ul>
 *
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class Person {
 *   String name;
 *   int age;
 *   boolean smoker;
 *
 *   ...
 *
 *   public String toString() {
 *     return new ToStringBuilder(this).
 *       append("name", name).
 *       append("age", age).
 *       append("smoker", smoker).
 *       toString();
 *   }
 * }
 * </pre>
 *
 * <p>This will produce a toString of the format:
 * <code>Person@7f54[name=Stephen,age=29,smoker=false]</code></p>
 *
 * <p>To add the superclass <code>toString</code>, use {@link #appendSuper}.
 * To append the <code>toString</code> from an object that is delegated
 * to (or any other object), use {@link #appendToString}.</p>
 *
 * <p>Alternatively, there is a method that uses reflection to determine
 * the fields to test. Because these fields are usually private, the method,
 * <code>reflectionToString</code>, uses <code>AccessibleObject.setAccessible</code> to
 * change the visibility of the fields. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
 * slower than testing explicitly.</p>
 *
 * <p>A typical invocation for this method would look like:</p>
 *
 * <pre>
 * public String toString() {
 *   return ToStringBuilder.reflectionToString(this);
 * }
 * </pre>
 *
 * <p>You can also use the builder to debug 3rd party objects:</p>
 *
 * <pre>
 * System.out.println("An object: " + ToStringBuilder.reflectionToString(anObject));
 * </pre>
 *
 * <p>The exact format of the <code>toString</code> is determined by
 * the {@link ToStringStyle} passed into the constructor.</p>
 *
 * @since 1.0
 * @version $Id$
 */
public class ToStringBuilder implements Builder<String> {public static class __CLR4_4_17ko7koldni83sp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,10017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The default style of output to use, not null.
     */
    private static volatile ToStringStyle defaultStyle = ToStringStyle.DEFAULT_STYLE;

    //----------------------------------------------------------------------------

    /**
     * <p>Gets the default <code>ToStringStyle</code> to use.</p>
     *
     * <p>This method gets a singleton default value, typically for the whole JVM.
     * Changing this default should generally only be done during application startup.
     * It is recommended to pass a <code>ToStringStyle</code> to the constructor instead
     * of using this global default.</p>
     *
     * <p>This method can be used from multiple threads.
     * Internally, a <code>volatile</code> variable is used to provide the guarantee
     * that the latest value set using {@link #setDefaultStyle} is the value returned.
     * It is strongly recommended that the default style is only changed during application startup.</p>
     *
     * <p>One reason for changing the default could be to have a verbose style during
     * development and a compact style in production.</p>
     *
     * @return the default <code>ToStringStyle</code>, never null
     */
    public static ToStringStyle getDefaultStyle() {try{__CLR4_4_17ko7koldni83sp.R.inc(9816);
        __CLR4_4_17ko7koldni83sp.R.inc(9817);return defaultStyle;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Sets the default <code>ToStringStyle</code> to use.</p>
     *
     * <p>This method sets a singleton default value, typically for the whole JVM.
     * Changing this default should generally only be done during application startup.
     * It is recommended to pass a <code>ToStringStyle</code> to the constructor instead
     * of changing this global default.</p>
     *
     * <p>This method is not intended for use from multiple threads.
     * Internally, a <code>volatile</code> variable is used to provide the guarantee
     * that the latest value set is the value returned from {@link #getDefaultStyle}.</p>
     *
     * @param style  the default <code>ToStringStyle</code>
     * @throws IllegalArgumentException if the style is <code>null</code>
     */
    public static void setDefaultStyle(final ToStringStyle style) {try{__CLR4_4_17ko7koldni83sp.R.inc(9818);
        __CLR4_4_17ko7koldni83sp.R.inc(9819);if ((((style == null)&&(__CLR4_4_17ko7koldni83sp.R.iget(9820)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(9821)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(9822);throw new IllegalArgumentException("The style must not be null");
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(9823);defaultStyle = style;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------
    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object)
     */
    public static String reflectionToString(final Object object) {try{__CLR4_4_17ko7koldni83sp.R.inc(9824);
        __CLR4_4_17ko7koldni83sp.R.inc(9825);return ReflectionToStringBuilder.toString(object);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)
     */
    public static String reflectionToString(final Object object, final ToStringStyle style) {try{__CLR4_4_17ko7koldni83sp.R.inc(9826);
        __CLR4_4_17ko7koldni83sp.R.inc(9827);return ReflectionToStringBuilder.toString(object, style);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients  whether to include transient fields
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)
     */
    public static String reflectionToString(final Object object, final ToStringStyle style, final boolean outputTransients) {try{__CLR4_4_17ko7koldni83sp.R.inc(9828);
        __CLR4_4_17ko7koldni83sp.R.inc(9829);return ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param <T> the type of the object
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive), may be <code>null</code>
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)
     * @since 2.0
     */
    public static <T> String reflectionToString(
        final T object,
        final ToStringStyle style,
        final boolean outputTransients,
        final Class<? super T> reflectUpToClass) {try{__CLR4_4_17ko7koldni83sp.R.inc(9830);
        __CLR4_4_17ko7koldni83sp.R.inc(9831);return ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * Current toString buffer, not null.
     */
    private final StringBuffer buffer;
    /**
     * The object being output, may be null.
     */
    private final Object object;
    /**
     * The style of output to use, not null.
     */
    private final ToStringStyle style;

    /**
     * <p>Constructs a builder for the specified object using the default output style.</p>
     *
     * <p>This default style is obtained from {@link #getDefaultStyle()}.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     */
    public ToStringBuilder(final Object object) {
        this(object, null, null);__CLR4_4_17ko7koldni83sp.R.inc(9833);try{__CLR4_4_17ko7koldni83sp.R.inc(9832);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Constructs a builder for the specified object using the a defined output style.</p>
     *
     * <p>If the style is <code>null</code>, the default style is used.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     * @param style  the style of the <code>toString</code> to create, null uses the default style
     */
    public ToStringBuilder(final Object object, final ToStringStyle style) {
        this(object, style, null);__CLR4_4_17ko7koldni83sp.R.inc(9835);try{__CLR4_4_17ko7koldni83sp.R.inc(9834);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Constructs a builder for the specified object.</p>
     *
     * <p>If the style is <code>null</code>, the default style is used.</p>
     *
     * <p>If the buffer is <code>null</code>, a new one is created.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     * @param style  the style of the <code>toString</code> to create, null uses the default style
     * @param buffer  the <code>StringBuffer</code> to populate, may be null
     */
    public ToStringBuilder(final Object object, ToStringStyle style, StringBuffer buffer) {try{__CLR4_4_17ko7koldni83sp.R.inc(9836);
        __CLR4_4_17ko7koldni83sp.R.inc(9837);if ((((style == null)&&(__CLR4_4_17ko7koldni83sp.R.iget(9838)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(9839)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(9840);style = getDefaultStyle();
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(9841);if ((((buffer == null)&&(__CLR4_4_17ko7koldni83sp.R.iget(9842)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(9843)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(9844);buffer = new StringBuffer(512);
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(9845);this.buffer = buffer;
        __CLR4_4_17ko7koldni83sp.R.inc(9846);this.style = style;
        __CLR4_4_17ko7koldni83sp.R.inc(9847);this.object = object;

        __CLR4_4_17ko7koldni83sp.R.inc(9848);style.appendStart(buffer, object);
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final boolean value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9849);
        __CLR4_4_17ko7koldni83sp.R.inc(9850);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9851);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final boolean[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9852);
        __CLR4_4_17ko7koldni83sp.R.inc(9853);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9854);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final byte value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9855);
        __CLR4_4_17ko7koldni83sp.R.inc(9856);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9857);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final byte[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9858);
        __CLR4_4_17ko7koldni83sp.R.inc(9859);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9860);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final char value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9861);
        __CLR4_4_17ko7koldni83sp.R.inc(9862);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9863);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final char[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9864);
        __CLR4_4_17ko7koldni83sp.R.inc(9865);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9866);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final double value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9867);
        __CLR4_4_17ko7koldni83sp.R.inc(9868);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9869);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final double[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9870);
        __CLR4_4_17ko7koldni83sp.R.inc(9871);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9872);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final float value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9873);
        __CLR4_4_17ko7koldni83sp.R.inc(9874);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9875);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final float[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9876);
        __CLR4_4_17ko7koldni83sp.R.inc(9877);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9878);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final int value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9879);
        __CLR4_4_17ko7koldni83sp.R.inc(9880);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9881);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final int[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9882);
        __CLR4_4_17ko7koldni83sp.R.inc(9883);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9884);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final long value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9885);
        __CLR4_4_17ko7koldni83sp.R.inc(9886);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9887);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final long[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9888);
        __CLR4_4_17ko7koldni83sp.R.inc(9889);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9890);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param obj  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final Object obj) {try{__CLR4_4_17ko7koldni83sp.R.inc(9891);
        __CLR4_4_17ko7koldni83sp.R.inc(9892);style.append(buffer, null, obj, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9893);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final Object[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9894);
        __CLR4_4_17ko7koldni83sp.R.inc(9895);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9896);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final short value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9897);
        __CLR4_4_17ko7koldni83sp.R.inc(9898);style.append(buffer, null, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9899);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final short[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9900);
        __CLR4_4_17ko7koldni83sp.R.inc(9901);style.append(buffer, null, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9902);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9903);
        __CLR4_4_17ko7koldni83sp.R.inc(9904);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9905);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>hashCode</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9906);
        __CLR4_4_17ko7koldni83sp.R.inc(9907);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9908);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9909);
        __CLR4_4_17ko7koldni83sp.R.inc(9910);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9911);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>byte</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9912);
        __CLR4_4_17ko7koldni83sp.R.inc(9913);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9914);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code> array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9915);
        __CLR4_4_17ko7koldni83sp.R.inc(9916);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9917);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9918);
        __CLR4_4_17ko7koldni83sp.R.inc(9919);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9920);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9921);
        __CLR4_4_17ko7koldni83sp.R.inc(9922);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9923);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9924);
        __CLR4_4_17ko7koldni83sp.R.inc(9925);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9926);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9927);
        __CLR4_4_17ko7koldni83sp.R.inc(9928);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9929);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9930);
        __CLR4_4_17ko7koldni83sp.R.inc(9931);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9932);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9933);
        __CLR4_4_17ko7koldni83sp.R.inc(9934);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9935);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9936);
        __CLR4_4_17ko7koldni83sp.R.inc(9937);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9938);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>float</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9939);
        __CLR4_4_17ko7koldni83sp.R.inc(9940);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9941);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9942);
        __CLR4_4_17ko7koldni83sp.R.inc(9943);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9944);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9945);
        __CLR4_4_17ko7koldni83sp.R.inc(9946);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9947);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9948);
        __CLR4_4_17ko7koldni83sp.R.inc(9949);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9950);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9951);
        __CLR4_4_17ko7koldni83sp.R.inc(9952);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9953);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9954);
        __CLR4_4_17ko7koldni83sp.R.inc(9955);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9956);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9957);
        __CLR4_4_17ko7koldni83sp.R.inc(9958);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9959);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9960);
        __CLR4_4_17ko7koldni83sp.R.inc(9961);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9962);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9963);
        __CLR4_4_17ko7koldni83sp.R.inc(9964);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9965);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param obj  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object obj) {try{__CLR4_4_17ko7koldni83sp.R.inc(9966);
        __CLR4_4_17ko7koldni83sp.R.inc(9967);style.append(buffer, fieldName, obj, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9968);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param obj  the value to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail,
     *  <code>false</code> for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object obj, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9969);
        __CLR4_4_17ko7koldni83sp.R.inc(9970);style.append(buffer, fieldName, obj, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9971);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9972);
        __CLR4_4_17ko7koldni83sp.R.inc(9973);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9974);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9975);
        __CLR4_4_17ko7koldni83sp.R.inc(9976);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9977);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>short</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short value) {try{__CLR4_4_17ko7koldni83sp.R.inc(9978);
        __CLR4_4_17ko7koldni83sp.R.inc(9979);style.append(buffer, fieldName, value);
        __CLR4_4_17ko7koldni83sp.R.inc(9980);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short[] array) {try{__CLR4_4_17ko7koldni83sp.R.inc(9981);
        __CLR4_4_17ko7koldni83sp.R.inc(9982);style.append(buffer, fieldName, array, null);
        __CLR4_4_17ko7koldni83sp.R.inc(9983);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short[] array, final boolean fullDetail) {try{__CLR4_4_17ko7koldni83sp.R.inc(9984);
        __CLR4_4_17ko7koldni83sp.R.inc(9985);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_4_17ko7koldni83sp.R.inc(9986);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Appends with the same format as the default <code>Object toString()
     * </code> method. Appends the class name followed by
     * {@link System#identityHashCode(java.lang.Object)}.</p>
     *
     * @param object  the <code>Object</code> whose class name and id to output
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendAsObjectToString(final Object object) {try{__CLR4_4_17ko7koldni83sp.R.inc(9987);
        __CLR4_4_17ko7koldni83sp.R.inc(9988);ObjectUtils.identityToString(this.getStringBuffer(), object);
        __CLR4_4_17ko7koldni83sp.R.inc(9989);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append the <code>toString</code> from the superclass.</p>
     *
     * <p>This method assumes that the superclass uses the same <code>ToStringStyle</code>
     * as this one.</p>
     *
     * <p>If <code>superToString</code> is <code>null</code>, no change is made.</p>
     *
     * @param superToString  the result of <code>super.toString()</code>
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendSuper(final String superToString) {try{__CLR4_4_17ko7koldni83sp.R.inc(9990);
        __CLR4_4_17ko7koldni83sp.R.inc(9991);if ((((superToString != null)&&(__CLR4_4_17ko7koldni83sp.R.iget(9992)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(9993)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(9994);style.appendSuper(buffer, superToString);
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(9995);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Append the <code>toString</code> from another object.</p>
     *
     * <p>This method is useful where a class delegates most of the implementation of
     * its properties to another class. You can then call <code>toString()</code> on
     * the other class and pass the result into this method.</p>
     *
     * <pre>
     *   private AnotherObject delegate;
     *   private String fieldInThisClass;
     *
     *   public String toString() {
     *     return new ToStringBuilder(this).
     *       appendToString(delegate.toString()).
     *       append(fieldInThisClass).
     *       toString();
     *   }</pre>
     *
     * <p>This method assumes that the other object uses the same <code>ToStringStyle</code>
     * as this one.</p>
     *
     * <p>If the <code>toString</code> is <code>null</code>, no change is made.</p>
     *
     * @param toString  the result of <code>toString()</code> on another object
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendToString(final String toString) {try{__CLR4_4_17ko7koldni83sp.R.inc(9996);
        __CLR4_4_17ko7koldni83sp.R.inc(9997);if ((((toString != null)&&(__CLR4_4_17ko7koldni83sp.R.iget(9998)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(9999)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(10000);style.appendToString(buffer, toString);
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(10001);return this;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Returns the <code>Object</code> being output.</p>
     *
     * @return The object being output.
     * @since 2.0
     */
    public Object getObject() {try{__CLR4_4_17ko7koldni83sp.R.inc(10002);
        __CLR4_4_17ko7koldni83sp.R.inc(10003);return object;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Gets the <code>StringBuffer</code> being populated.</p>
     *
     * @return the <code>StringBuffer</code> being populated
     */
    public StringBuffer getStringBuffer() {try{__CLR4_4_17ko7koldni83sp.R.inc(10004);
        __CLR4_4_17ko7koldni83sp.R.inc(10005);return buffer;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Gets the <code>ToStringStyle</code> being used.</p>
     *
     * @return the <code>ToStringStyle</code> being used
     * @since 2.0
     */
    public ToStringStyle getStyle() {try{__CLR4_4_17ko7koldni83sp.R.inc(10006);
        __CLR4_4_17ko7koldni83sp.R.inc(10007);return style;
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * <p>Returns the built <code>toString</code>.</p>
     *
     * <p>This method appends the end of data indicator, and can only be called once.
     * Use {@link #getStringBuffer} to get the current string state.</p>
     *
     * <p>If the object is <code>null</code>, return the style's <code>nullText</code></p>
     *
     * @return the String <code>toString</code>
     */
    @Override
    public String toString() {try{__CLR4_4_17ko7koldni83sp.R.inc(10008);
        __CLR4_4_17ko7koldni83sp.R.inc(10009);if ((((this.getObject() == null)&&(__CLR4_4_17ko7koldni83sp.R.iget(10010)!=0|true))||(__CLR4_4_17ko7koldni83sp.R.iget(10011)==0&false))) {{
            __CLR4_4_17ko7koldni83sp.R.inc(10012);this.getStringBuffer().append(this.getStyle().getNullText());
        } }else {{
            __CLR4_4_17ko7koldni83sp.R.inc(10013);style.appendEnd(this.getStringBuffer(), this.getObject());
        }
        }__CLR4_4_17ko7koldni83sp.R.inc(10014);return this.getStringBuffer().toString();
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}

    /**
     * Returns the String that was build as an object representation. The
     * default implementation utilizes the {@link #toString()} implementation.
     *
     * @return the String <code>toString</code>
     *
     * @see #toString()
     *
     * @since 3.0
     */
    @Override
    public String build() {try{__CLR4_4_17ko7koldni83sp.R.inc(10015);
        __CLR4_4_17ko7koldni83sp.R.inc(10016);return toString();
    }finally{__CLR4_4_17ko7koldni83sp.R.flushNeeded();}}
}
