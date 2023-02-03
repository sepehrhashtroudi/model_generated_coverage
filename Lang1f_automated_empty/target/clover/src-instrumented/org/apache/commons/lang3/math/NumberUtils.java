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
package org.apache.commons.lang3.math;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Provides extra functionality for Java Number classes.</p>
 *
 * @since 2.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NumberUtils {public static class __CLR4_4_19ek9ekldnigg3o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,12836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Reusable Long constant for zero. */
    public static final Long LONG_ZERO = Long.valueOf(0L);
    /** Reusable Long constant for one. */
    public static final Long LONG_ONE = Long.valueOf(1L);
    /** Reusable Long constant for minus one. */
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
    /** Reusable Integer constant for zero. */
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
    /** Reusable Integer constant for one. */
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
    /** Reusable Integer constant for minus one. */
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
    /** Reusable Short constant for zero. */
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
    /** Reusable Short constant for one. */
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
    /** Reusable Short constant for minus one. */
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
    /** Reusable Byte constant for zero. */
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
    /** Reusable Byte constant for one. */
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
    /** Reusable Byte constant for minus one. */
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
    /** Reusable Double constant for zero. */
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    /** Reusable Double constant for one. */
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    /** Reusable Double constant for minus one. */
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    /** Reusable Float constant for zero. */
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    /** Reusable Float constant for one. */
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    /** Reusable Float constant for minus one. */
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);

    /**
     * <p><code>NumberUtils</code> instances should NOT be constructed in standard programming.
     * Instead, the class should be used as <code>NumberUtils.toInt("6");</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public NumberUtils() {
        super();__CLR4_4_19ek9ekldnigg3o.R.inc(12189);try{__CLR4_4_19ek9ekldnigg3o.R.inc(12188);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null) = 0
     *   NumberUtils.toInt("")   = 0
     *   NumberUtils.toInt("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the int represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.1
     */
    public static int toInt(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12190);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12191);return toInt(str, 0);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null, 1) = 1
     *   NumberUtils.toInt("", 1)   = 1
     *   NumberUtils.toInt("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the int represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static int toInt(final String str, final int defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12192);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12193);if((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12194)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12195)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12196);return defaultValue;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12197);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12198);return Integer.parseInt(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12199);return defaultValue;
        }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null) = 0L
     *   NumberUtils.toLong("")   = 0L
     *   NumberUtils.toLong("1")  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the long represented by the string, or <code>0</code> if
     *  conversion fails
     * @since 2.1
     */
    public static long toLong(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12200);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12201);return toLong(str, 0L);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null, 1L) = 1L
     *   NumberUtils.toLong("", 1L)   = 1L
     *   NumberUtils.toLong("1", 0L)  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the long represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static long toLong(final String str, final long defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12202);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12203);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12204)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12205)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12206);return defaultValue;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12207);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12208);return Long.parseLong(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12209);return defaultValue;
        }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning
     * <code>0.0f</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0f</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null)   = 0.0f
     *   NumberUtils.toFloat("")     = 0.0f
     *   NumberUtils.toFloat("1.5")  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the float represented by the string, or <code>0.0f</code>
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12210);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12211);return toFloat(str, 0.0f);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null, 1.1f)   = 1.0f
     *   NumberUtils.toFloat("", 1.1f)     = 1.1f
     *   NumberUtils.toFloat("1.5", 0.0f)  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the float represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str, final float defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12212);
      __CLR4_4_19ek9ekldnigg3o.R.inc(12213);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12214)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12215)==0&false))) {{
          __CLR4_4_19ek9ekldnigg3o.R.inc(12216);return defaultValue;
      }     
      }__CLR4_4_19ek9ekldnigg3o.R.inc(12217);try {
          __CLR4_4_19ek9ekldnigg3o.R.inc(12218);return Float.parseFloat(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_4_19ek9ekldnigg3o.R.inc(12219);return defaultValue;
      }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning
     * <code>0.0d</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0d</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null)   = 0.0d
     *   NumberUtils.toDouble("")     = 0.0d
     *   NumberUtils.toDouble("1.5")  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the double represented by the string, or <code>0.0d</code>
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12220);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12221);return toDouble(str, 0.0d);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null, 1.1d)   = 1.1d
     *   NumberUtils.toDouble("", 1.1d)     = 1.1d
     *   NumberUtils.toDouble("1.5", 0.0d)  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the double represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str, final double defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12222);
      __CLR4_4_19ek9ekldnigg3o.R.inc(12223);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12224)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12225)==0&false))) {{
          __CLR4_4_19ek9ekldnigg3o.R.inc(12226);return defaultValue;
      }
      }__CLR4_4_19ek9ekldnigg3o.R.inc(12227);try {
          __CLR4_4_19ek9ekldnigg3o.R.inc(12228);return Double.parseDouble(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_4_19ek9ekldnigg3o.R.inc(12229);return defaultValue;
      }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

     //-----------------------------------------------------------------------
     /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null) = 0
     *   NumberUtils.toByte("")   = 0
     *   NumberUtils.toByte("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the byte represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12230);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12231);return toByte(str, (byte) 0);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null, 1) = 1
     *   NumberUtils.toByte("", 1)   = 1
     *   NumberUtils.toByte("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the byte represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str, final byte defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12232);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12233);if((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12234)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12235)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12236);return defaultValue;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12237);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12238);return Byte.parseByte(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12239);return defaultValue;
        }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>short</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null) = 0
     *   NumberUtils.toShort("")   = 0
     *   NumberUtils.toShort("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the short represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static short toShort(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12240);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12241);return toShort(str, (short) 0);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>short</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null, 1) = 1
     *   NumberUtils.toShort("", 1)   = 1
     *   NumberUtils.toShort("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the short represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static short toShort(final String str, final short defaultValue) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12242);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12243);if((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12244)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12245)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12246);return defaultValue;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12247);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12248);return Short.parseShort(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12249);return defaultValue;
        }
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // must handle Long, Float, Integer, Float, Short,
    //                  BigDecimal, BigInteger and Byte
    // useful methods:
    // Byte.decode(String)
    // Byte.valueOf(String,int radix)
    // Byte.valueOf(String)
    // Double.valueOf(String)
    // Float.valueOf(String)
    // Float.valueOf(String)
    // Integer.valueOf(String,int radix)
    // Integer.valueOf(String)
    // Integer.decode(String)
    // Integer.getInteger(String)
    // Integer.getInteger(String,int val)
    // Integer.getInteger(String,Integer val)
    // Integer.valueOf(String)
    // Double.valueOf(String)
    // new Byte(String)
    // Long.valueOf(String)
    // Long.getLong(String)
    // Long.getLong(String,int)
    // Long.getLong(String,Integer)
    // Long.valueOf(String,int)
    // Long.valueOf(String)
    // Short.valueOf(String)
    // Short.decode(String)
    // Short.valueOf(String,int)
    // Short.valueOf(String)
    // new BigDecimal(String)
    // new BigInteger(String)
    // new BigInteger(String,int radix)
    // Possible inputs:
    // 45 45.5 45E7 4.5E7 Hex Oct Binary xxxF xxxD xxxf xxxd
    // plus minus everything. Prolly more. A lot are not separable.

    /**
     * <p>Turns a string value into a java.lang.Number.</p>
     *
     * <p>If the string starts with {@code 0x} or {@code -0x} (lower or upper case) or {@code #} or {@code -#}, it
     * will be interpreted as a hexadecimal Integer - or Long, if the number of digits after the
     * prefix is more than 8 - or BigInteger if there are more than 16 digits.
     * </p>
     * <p>Then, the value is examined for a type qualifier on the end, i.e. one of
     * <code>'f','F','d','D','l','L'</code>.  If it is found, it starts 
     * trying to create successively larger types from the type specified
     * until one is found that can represent the value.</p>
     *
     * <p>If a type specifier is not found, it will check for a decimal point
     * and then try successively larger types from <code>Integer</code> to
     * <code>BigInteger</code> and from <code>Float</code> to
    * <code>BigDecimal</code>.</p>
    * 
     * <p>
     * Integral values with a leading {@code 0} will be interpreted as octal; the returned number will
     * be Integer, Long or BigDecimal as appropriate.
     * </p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * <p>This method does not trim the input string, i.e., strings with leading
     * or trailing spaces will generate NumberFormatExceptions.</p>
     *
     * @param str  String containing a number, may be null
     * @return Number created from the string (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Number createNumber(final String str) throws NumberFormatException {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12250);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12251);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12252)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12253)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12254);return null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12255);if ((((StringUtils.isBlank(str))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12256)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12257)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12258);throw new NumberFormatException("A blank string is not a valid number");
        }
        // Need to deal with all possible hex prefixes here
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12259);final String[] hex_prefixes = {"0x", "0X", "-0x", "-0X", "#", "-#"};
        __CLR4_4_19ek9ekldnigg3o.R.inc(12260);int pfxLen = 0;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12261);for(final String pfx : hex_prefixes) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12262);if ((((str.startsWith(pfx))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12263)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12264)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12265);pfxLen += pfx.length();
                __CLR4_4_19ek9ekldnigg3o.R.inc(12266);break;
            }
        }}
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12267);if ((((pfxLen > 0)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12268)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12269)==0&false))) {{ // we have a hex number
            __CLR4_4_19ek9ekldnigg3o.R.inc(12270);char firstSigDigit = 0; // strip leading zeroes
            __CLR4_4_19ek9ekldnigg3o.R.inc(12271);for(int i = pfxLen; (((i < str.length())&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12272)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12273)==0&false)); i++) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12274);firstSigDigit = str.charAt(i);
                __CLR4_4_19ek9ekldnigg3o.R.inc(12275);if ((((firstSigDigit == '0')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12276)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12277)==0&false))) {{ // count leading zeroes
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12278);pfxLen++;
                } }else {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12279);break;
                }
            }}
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12280);final int hexDigits = str.length() - pfxLen;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12281);if ((((hexDigits > 16 || (hexDigits == 16 && firstSigDigit > '7'))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12282)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12283)==0&false))) {{ // too many for Long
                __CLR4_4_19ek9ekldnigg3o.R.inc(12284);return createBigInteger(str);
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12285);if ((((hexDigits > 8 || (hexDigits == 8 && firstSigDigit > '7'))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12286)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12287)==0&false))) {{ // too many for an int
                __CLR4_4_19ek9ekldnigg3o.R.inc(12288);return createLong(str);
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12289);return createInteger(str);
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12290);final char lastChar = str.charAt(str.length() - 1);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12291);String mant;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12292);String dec;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12293);String exp;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12294);final int decPos = str.indexOf('.');
        __CLR4_4_19ek9ekldnigg3o.R.inc(12295);final int expPos = str.indexOf('e') + str.indexOf('E') + 1; // assumes both not present
        // if both e and E are present, this is caught by the checks on expPos (which prevent IOOBE)
        // and the parsing which will detect if e or E appear in a number due to using the wrong offset

        __CLR4_4_19ek9ekldnigg3o.R.inc(12296);int numDecimals = 0; // Check required precision (LANG-693)
        __CLR4_4_19ek9ekldnigg3o.R.inc(12297);if ((((decPos > -1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12298)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12299)==0&false))) {{ // there is a decimal point

            __CLR4_4_19ek9ekldnigg3o.R.inc(12300);if ((((expPos > -1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12301)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12302)==0&false))) {{ // there is an exponent
                __CLR4_4_19ek9ekldnigg3o.R.inc(12303);if ((((expPos < decPos || expPos > str.length())&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12304)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12305)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12306);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12307);dec = str.substring(decPos + 1, expPos);
            } }else {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12308);dec = str.substring(decPos + 1);
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12309);mant = str.substring(0, decPos);
            __CLR4_4_19ek9ekldnigg3o.R.inc(12310);numDecimals = dec.length(); // gets number of digits past the decimal to ensure no loss of precision for floating point numbers.
        } }else {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12311);if ((((expPos > -1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12312)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12313)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12314);if ((((expPos > str.length())&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12315)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12316)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12317);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12318);mant = str.substring(0, expPos);
            } }else {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12319);mant = str;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12320);dec = null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12321);if ((((!Character.isDigit(lastChar) && lastChar != '.')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12322)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12323)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12324);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12325)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12326)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12327);exp = str.substring(expPos + 1, str.length() - 1);
            } }else {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12328);exp = null;
            }
            //Requesting a specific type..
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12329);final String numeric = str.substring(0, str.length() - 1);
            __CLR4_4_19ek9ekldnigg3o.R.inc(12330);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_19ek9ekldnigg3o.R.inc(12331);switch (lastChar) {
                case 'l' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12332);__CLB4_4_1_bool0=true;}
                case 'L' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12333);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12334);if ((((dec == null
                        && exp == null
                        && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12335)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12336)==0&false))) {{
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12337);try {
                            __CLR4_4_19ek9ekldnigg3o.R.inc(12338);return createLong(numeric);
                        } catch (final NumberFormatException nfe) { // NOPMD
                            // Too big for a long
                        }
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12339);return createBigInteger(numeric);

                    }
                    }__CLR4_4_19ek9ekldnigg3o.R.inc(12340);throw new NumberFormatException(str + " is not a valid number.");
                case 'f' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12341);__CLB4_4_1_bool0=true;}
                case 'F' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12342);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12343);try {
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12344);final Float f = NumberUtils.createFloat(numeric);
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12345);if ((((!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12346)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12347)==0&false))) {{
                            //If it's too big for a float or the float value = 0 and the string
                            //has non-zeros in it, then float does not have the precision we want
                            __CLR4_4_19ek9ekldnigg3o.R.inc(12348);return f;
                        }

                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                case 'd' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12349);__CLB4_4_1_bool0=true;}
                case 'D' :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12350);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12351);try {
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12352);final Double d = NumberUtils.createDouble(numeric);
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12353);if ((((!(d.isInfinite() || (d.floatValue() == 0.0D && !allZeros)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12354)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12355)==0&false))) {{
                            __CLR4_4_19ek9ekldnigg3o.R.inc(12356);return d;
                        }
                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12357);try {
                        __CLR4_4_19ek9ekldnigg3o.R.inc(12358);return createBigDecimal(numeric);
                    } catch (final NumberFormatException e) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                default :if (!__CLB4_4_1_bool0) {__CLR4_4_19ek9ekldnigg3o.R.inc(12359);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12360);throw new NumberFormatException(str + " is not a valid number.");

            }
        }
        //User doesn't have a preference on the return type, so let's start
        //small and go from there...
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12361);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12362)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12363)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12364);exp = str.substring(expPos + 1, str.length());
        } }else {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12365);exp = null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12366);if ((((dec == null && exp == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12367)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12368)==0&false))) {{ // no decimal point and no exponent
            //Must be an Integer, Long, Biginteger
            __CLR4_4_19ek9ekldnigg3o.R.inc(12369);try {
                __CLR4_4_19ek9ekldnigg3o.R.inc(12370);return createInteger(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_4_19ek9ekldnigg3o.R.inc(12371);try {
                __CLR4_4_19ek9ekldnigg3o.R.inc(12372);return createLong(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_4_19ek9ekldnigg3o.R.inc(12373);return createBigInteger(str);
        }

        //Must be a Float, Double, BigDecimal
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12374);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12375);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12376);if((((numDecimals <= 7)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12377)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12378)==0&false))){{// If number has 7 or fewer digits past the decimal point then make it a float
                __CLR4_4_19ek9ekldnigg3o.R.inc(12379);final Float f = createFloat(str);
                __CLR4_4_19ek9ekldnigg3o.R.inc(12380);if ((((!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12381)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12382)==0&false))) {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12383);return f;
                }
            }}
        }} catch (final NumberFormatException nfe) { // NOPMD
            // ignore the bad number
        }
        __CLR4_4_19ek9ekldnigg3o.R.inc(12384);try {
            __CLR4_4_19ek9ekldnigg3o.R.inc(12385);if((((numDecimals <= 16)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12386)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12387)==0&false))){{// If number has between 8 and 16 digits past the decimal point then make it a double
                __CLR4_4_19ek9ekldnigg3o.R.inc(12388);final Double d = createDouble(str);
                __CLR4_4_19ek9ekldnigg3o.R.inc(12389);if ((((!(d.isInfinite() || (d.doubleValue() == 0.0D && !allZeros)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12390)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12391)==0&false))) {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12392);return d;
                }
            }}
        }} catch (final NumberFormatException nfe) { // NOPMD
            // ignore the bad number
        }

        __CLR4_4_19ek9ekldnigg3o.R.inc(12393);return createBigDecimal(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
     *
     * <p>Returns <code>true</code> if s is <code>null</code>.</p>
     * 
     * @param str  the String to check
     * @return if it is all zeros or <code>null</code>
     */
    private static boolean isAllZeros(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12394);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12395);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12396)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12397)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12398);return true;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12399);for (int i = str.length() - 1; (((i >= 0)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12400)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12401)==0&false)); i--) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12402);if ((((str.charAt(i) != '0')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12403)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12404)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12405);return false;
            }
        }}
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12406);return str.length() > 0;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to a <code>Float</code>.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Float</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Float createFloat(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12407);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12408);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12409)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12410)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12411);return null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12412);return Float.valueOf(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Double</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Double</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Double createDouble(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12413);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12414);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12415)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12416)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12417);return null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12418);return Double.valueOf(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Integer</code>, handling
     * hex and octal notations.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Integer</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Integer createInteger(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12419);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12420);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12421)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12422)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12423);return null;
        }
        // decode() handles 0xAABD and 0777 (hex and octal) as well.
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12424);return Integer.decode(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Long</code>; 
     * since 3.1 it handles hex and octal notations.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Long</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Long createLong(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12425);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12426);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12427)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12428)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12429);return null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12430);return Long.decode(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigInteger</code>;
     * since 3.2 it handles hex (0x or #) and octal (0) notations.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigInteger</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigInteger createBigInteger(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12431);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12432);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12433)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12434)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12435);return null;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12436);int pos = 0; // offset within string
        __CLR4_4_19ek9ekldnigg3o.R.inc(12437);int radix = 10;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12438);boolean negate = false; // need to negate later?
        __CLR4_4_19ek9ekldnigg3o.R.inc(12439);if ((((str.startsWith("-"))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12440)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12441)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12442);negate = true;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12443);pos = 1;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12444);if ((((str.startsWith("0x", pos) || str.startsWith("0x", pos))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12445)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12446)==0&false))) {{ // hex
            __CLR4_4_19ek9ekldnigg3o.R.inc(12447);radix = 16;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12448);pos += 2;
        } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12449);if ((((str.startsWith("#", pos))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12450)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12451)==0&false))) {{ // alternative hex (allowed by Long/Integer)
            __CLR4_4_19ek9ekldnigg3o.R.inc(12452);radix = 16;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12453);pos ++;
        } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12454);if ((((str.startsWith("0", pos) && str.length() > pos + 1)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12455)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12456)==0&false))) {{ // octal; so long as there are additional digits
            __CLR4_4_19ek9ekldnigg3o.R.inc(12457);radix = 8;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12458);pos ++;
        } // default is to treat as decimal

        }}}__CLR4_4_19ek9ekldnigg3o.R.inc(12459);final BigInteger value = new BigInteger(str.substring(pos), radix);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12460);return (((negate )&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12461)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12462)==0&false))? value.negate() : value;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigDecimal</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigDecimal</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigDecimal createBigDecimal(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12463);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12464);if ((((str == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12465)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12466)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12467);return null;
        }
        // handle JDK1.3.1 bug where "" throws IndexOutOfBoundsException
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12468);if ((((StringUtils.isBlank(str))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12469)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12470)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12471);throw new NumberFormatException("A blank string is not a valid number");
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12472);if ((((str.trim().startsWith("--"))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12473)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12474)==0&false))) {{
            // this is protection for poorness in java.lang.BigDecimal.
            // it accepts this as a legal value, but it does not appear 
            // to be in specification of class. OS X Java parses it to 
            // a wrong value.
            __CLR4_4_19ek9ekldnigg3o.R.inc(12475);throw new NumberFormatException(str + " is not a valid number.");
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12476);return new BigDecimal(str);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    // Min in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static long min(final long[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12477);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12478);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12479);long min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12480);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12481)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12482)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12483);if ((((array[i] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12484)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12485)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12486);min = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12487);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static int min(final int[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12488);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12489);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12490);int min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12491);for (int j = 1; (((j < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12492)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12493)==0&false)); j++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12494);if ((((array[j] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12495)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12496)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12497);min = array[j];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12498);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static short min(final short[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12499);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12500);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12501);short min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12502);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12503)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12504)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12505);if ((((array[i] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12506)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12507)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12508);min = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12509);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static byte min(final byte[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12510);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12511);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12512);byte min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12513);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12514)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12515)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12516);if ((((array[i] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12517)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12518)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12519);min = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12520);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static double min(final double[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12521);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12522);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12523);double min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12524);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12525)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12526)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12527);if ((((Double.isNaN(array[i]))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12528)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12529)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12530);return Double.NaN;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12531);if ((((array[i] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12532)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12533)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12534);min = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12535);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static float min(final float[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12536);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12537);validateArray(array);
    
        // Finds and returns min
        __CLR4_4_19ek9ekldnigg3o.R.inc(12538);float min = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12539);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12540)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12541)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12542);if ((((Float.isNaN(array[i]))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12543)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12544)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12545);return Float.NaN;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12546);if ((((array[i] < min)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12547)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12548)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12549);min = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12550);return min;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    // Max in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static long max(final long[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12551);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12552);validateArray(array);

        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12553);long max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12554);for (int j = 1; (((j < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12555)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12556)==0&false)); j++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12557);if ((((array[j] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12558)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12559)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12560);max = array[j];
            }
        }}

        }__CLR4_4_19ek9ekldnigg3o.R.inc(12561);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static int max(final int[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12562);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12563);validateArray(array);
    
        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12564);int max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12565);for (int j = 1; (((j < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12566)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12567)==0&false)); j++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12568);if ((((array[j] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12569)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12570)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12571);max = array[j];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12572);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static short max(final short[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12573);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12574);validateArray(array);
    
        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12575);short max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12576);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12577)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12578)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12579);if ((((array[i] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12580)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12581)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12582);max = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12583);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static byte max(final byte[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12584);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12585);validateArray(array);
    
        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12586);byte max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12587);for (int i = 1; (((i < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12588)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12589)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12590);if ((((array[i] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12591)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12592)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12593);max = array[i];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12594);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static double max(final double[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12595);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12596);validateArray(array);

        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12597);double max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12598);for (int j = 1; (((j < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12599)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12600)==0&false)); j++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12601);if ((((Double.isNaN(array[j]))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12602)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12603)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12604);return Double.NaN;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12605);if ((((array[j] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12606)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12607)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12608);max = array[j];
            }
        }}
    
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12609);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static float max(final float[] array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12610);
        // Validates input
        __CLR4_4_19ek9ekldnigg3o.R.inc(12611);validateArray(array);

        // Finds and returns max
        __CLR4_4_19ek9ekldnigg3o.R.inc(12612);float max = array[0];
        __CLR4_4_19ek9ekldnigg3o.R.inc(12613);for (int j = 1; (((j < array.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12614)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12615)==0&false)); j++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12616);if ((((Float.isNaN(array[j]))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12617)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12618)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12619);return Float.NaN;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12620);if ((((array[j] > max)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12621)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12622)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12623);max = array[j];
            }
        }}

        }__CLR4_4_19ek9ekldnigg3o.R.inc(12624);return max;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * Checks if the specified array is neither null nor empty.
     *
     * @param array  the array to check
     * @throws IllegalArgumentException if {@code array} is either {@code null} or empty
     */
    private static void validateArray(final Object array) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12625);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12626);if ((((array == null)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12627)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12628)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12629);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12630);if ((((Array.getLength(array) == 0)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12631)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12632)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12633);throw new IllegalArgumentException("Array cannot be empty.");
        }
    }}}finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}
     
    // 3 param min
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the minimum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static long min(long a, final long b, final long c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12634);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12635);if ((((b < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12636)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12637)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12638);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12639);if ((((c < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12640)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12641)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12642);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12643);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static int min(int a, final int b, final int c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12644);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12645);if ((((b < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12646)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12647)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12648);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12649);if ((((c < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12650)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12651)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12652);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12653);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static short min(short a, final short b, final short c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12654);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12655);if ((((b < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12656)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12657)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12658);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12659);if ((((c < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12660)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12661)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12662);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12663);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static byte min(byte a, final byte b, final byte c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12664);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12665);if ((((b < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12666)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12667)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12668);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12669);if ((((c < a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12670)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12671)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12672);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12673);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12674);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12675);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12676);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12677);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    // 3 param max
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the maximum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static long max(long a, final long b, final long c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12678);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12679);if ((((b > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12680)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12681)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12682);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12683);if ((((c > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12684)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12685)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12686);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12687);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static int max(int a, final int b, final int c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12688);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12689);if ((((b > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12690)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12691)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12692);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12693);if ((((c > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12694)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12695)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12696);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12697);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static short max(short a, final short b, final short c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12698);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12699);if ((((b > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12700)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12701)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12702);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12703);if ((((c > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12704)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12705)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12706);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12707);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static byte max(byte a, final byte b, final byte c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12708);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12709);if ((((b > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12710)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12711)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12712);a = b;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12713);if ((((c > a)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12714)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12715)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12716);a = c;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12717);return a;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12718);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12719);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12720);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12721);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks whether the <code>String</code> contains only
     * digit characters.</p>
     *
     * <p><code>Null</code> and empty String will return
     * <code>false</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if str contains only Unicode numeric
     */
    public static boolean isDigits(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12722);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12723);if ((((StringUtils.isEmpty(str))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12724)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12725)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12726);return false;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12727);for (int i = 0; (((i < str.length())&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12728)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12729)==0&false)); i++) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12730);if ((((!Character.isDigit(str.charAt(i)))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12731)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12732)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12733);return false;
            }
        }}
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12734);return true;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

    /**
     * <p>Checks whether the String a valid Java number.</p>
     *
     * <p>Valid numbers include hexadecimal marked with the <code>0x</code>
     * qualifier, scientific notation and numbers marked with a type
     * qualifier (e.g. 123L).</p>
     *
     * <p><code>Null</code> and empty String will return
     * <code>false</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if the string is a correctly formatted number
     */
    public static boolean isNumber(final String str) {try{__CLR4_4_19ek9ekldnigg3o.R.inc(12735);
        __CLR4_4_19ek9ekldnigg3o.R.inc(12736);if ((((StringUtils.isEmpty(str))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12737)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12738)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12739);return false;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12740);final char[] chars = str.toCharArray();
        __CLR4_4_19ek9ekldnigg3o.R.inc(12741);int sz = chars.length;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12742);boolean hasExp = false;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12743);boolean hasDecPoint = false;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12744);boolean allowSigns = false;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12745);boolean foundDigit = false;
        // deal with any possible sign up front
        __CLR4_4_19ek9ekldnigg3o.R.inc(12746);final int start = ((((chars[0] == '-') )&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12747)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12748)==0&false))? 1 : 0;
        __CLR4_4_19ek9ekldnigg3o.R.inc(12749);if ((((sz > start + 1 && chars[start] == '0' && chars[start + 1] == 'x')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12750)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12751)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12752);int i = start + 2;
            __CLR4_4_19ek9ekldnigg3o.R.inc(12753);if ((((i == sz)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12754)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12755)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12756);return false; // str == "0x"
            }
            // checking hex (it can't be anything else)
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12757);for (; (((i < chars.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12758)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12759)==0&false)); i++) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12760);if (((((chars[i] < '0' || chars[i] > '9')
                    && (chars[i] < 'a' || chars[i] > 'f')
                    && (chars[i] < 'A' || chars[i] > 'F'))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12761)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12762)==0&false))) {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12763);return false;
                }
            }}
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12764);return true;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12765);sz--; // don't want to loop to the last char, check it afterwords
              // for type qualifiers
        __CLR4_4_19ek9ekldnigg3o.R.inc(12766);int i = start;
        // loop to the next to last char or to the last char if we need another digit to
        // make a valid number (e.g. chars[0..5] = "1234E")
        __CLR4_4_19ek9ekldnigg3o.R.inc(12767);while ((((i < sz || (i < sz + 1 && allowSigns && !foundDigit))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12768)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12769)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12770);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12771)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12772)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12773);foundDigit = true;
                __CLR4_4_19ek9ekldnigg3o.R.inc(12774);allowSigns = false;

            } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12775);if ((((chars[i] == '.')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12776)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12777)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12778);if ((((hasDecPoint || hasExp)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12779)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12780)==0&false))) {{
                    // two decimal points or dec in exponent   
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12781);return false;
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12782);hasDecPoint = true;
            } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12783);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12784)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12785)==0&false))) {{
                // we've already taken care of hex.
                __CLR4_4_19ek9ekldnigg3o.R.inc(12786);if ((((hasExp)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12787)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12788)==0&false))) {{
                    // two E's
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12789);return false;
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12790);if ((((!foundDigit)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12791)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12792)==0&false))) {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12793);return false;
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12794);hasExp = true;
                __CLR4_4_19ek9ekldnigg3o.R.inc(12795);allowSigns = true;
            } }else {__CLR4_4_19ek9ekldnigg3o.R.inc(12796);if ((((chars[i] == '+' || chars[i] == '-')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12797)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12798)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12799);if ((((!allowSigns)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12800)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12801)==0&false))) {{
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12802);return false;
                }
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12803);allowSigns = false;
                __CLR4_4_19ek9ekldnigg3o.R.inc(12804);foundDigit = false; // we need a digit after the E
            } }else {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12805);return false;
            }
            }}}}__CLR4_4_19ek9ekldnigg3o.R.inc(12806);i++;
        }
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12807);if ((((i < chars.length)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12808)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12809)==0&false))) {{
            __CLR4_4_19ek9ekldnigg3o.R.inc(12810);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12811)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12812)==0&false))) {{
                // no type qualifier, OK
                __CLR4_4_19ek9ekldnigg3o.R.inc(12813);return true;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12814);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12815)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12816)==0&false))) {{
                // can't have an E at the last byte
                __CLR4_4_19ek9ekldnigg3o.R.inc(12817);return false;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12818);if ((((chars[i] == '.')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12819)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12820)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12821);if ((((hasDecPoint || hasExp)&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12822)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12823)==0&false))) {{
                    // two decimal points or dec in exponent
                    __CLR4_4_19ek9ekldnigg3o.R.inc(12824);return false;
                }
                // single trailing decimal point after non-exponent is ok
                }__CLR4_4_19ek9ekldnigg3o.R.inc(12825);return foundDigit;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12826);if ((((!allowSigns
                && (chars[i] == 'd'
                    || chars[i] == 'D'
                    || chars[i] == 'f'
                    || chars[i] == 'F'))&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12827)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12828)==0&false))) {{
                __CLR4_4_19ek9ekldnigg3o.R.inc(12829);return foundDigit;
            }
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12830);if ((((chars[i] == 'l'
                || chars[i] == 'L')&&(__CLR4_4_19ek9ekldnigg3o.R.iget(12831)!=0|true))||(__CLR4_4_19ek9ekldnigg3o.R.iget(12832)==0&false))) {{
                // not allowing L with an exponent or decimal point
                __CLR4_4_19ek9ekldnigg3o.R.inc(12833);return foundDigit && !hasExp && !hasDecPoint;
            }
            // last character is illegal
            }__CLR4_4_19ek9ekldnigg3o.R.inc(12834);return false;
        }
        // allowSigns is true iff the val ends in 'E'
        // found digit it to make sure weird stuff like '.' and '1E-' doesn't pass
        }__CLR4_4_19ek9ekldnigg3o.R.inc(12835);return !allowSigns && foundDigit;
    }finally{__CLR4_4_19ek9ekldnigg3o.R.flushNeeded();}}

}
