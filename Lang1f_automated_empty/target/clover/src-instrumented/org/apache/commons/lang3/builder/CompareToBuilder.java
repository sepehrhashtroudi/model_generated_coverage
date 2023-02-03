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

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

/** 
 * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.
 *
 * It is consistent with <code>equals(Object)</code> and
 * <code>hashcode()</code> built with {@link EqualsBuilder} and
 * {@link HashCodeBuilder}.</p>
 *
 * <p>Two Objects that compare equal using <code>equals(Object)</code> should normally
 * also compare equal using <code>compareTo(Object)</code>.</p>
 *
 * <p>All relevant fields should be included in the calculation of the
 * comparison. Derived fields may be ignored. The same fields, in the same
 * order, should be used in both <code>compareTo(Object)</code> and
 * <code>equals(Object)</code>.</p>
 *
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class MyClass {
 *   String field1;
 *   int field2;
 *   boolean field3;
 *
 *   ...
 *
 *   public int compareTo(Object o) {
 *     MyClass myClass = (MyClass) o;
 *     return new CompareToBuilder()
 *       .appendSuper(super.compareTo(o)
 *       .append(this.field1, myClass.field1)
 *       .append(this.field2, myClass.field2)
 *       .append(this.field3, myClass.field3)
 *       .toComparison();
 *   }
 * }
 * </pre>
 *
 * <p>Alternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use
 * reflection to determine the fields to append. Because fields can be private,
 * <code>reflectionCompare</code> uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to
 * bypass normal access control checks. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
 * slower than appending explicitly.</p>
 *
 * <p>A typical implementation of <code>compareTo(Object)</code> using
 * <code>reflectionCompare</code> looks like:</p>

 * <pre>
 * public int compareTo(Object o) {
 *   return CompareToBuilder.reflectionCompare(this, o);
 * }
 * </pre>
 *
 * @see java.lang.Comparable
 * @see java.lang.Object#equals(Object)
 * @see java.lang.Object#hashCode()
 * @see EqualsBuilder
 * @see HashCodeBuilder
 * @since 1.0
 * @version $Id$
 */
public class CompareToBuilder implements Builder<Integer> {public static class __CLR4_4_16i76i7ldnigfs0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,8918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Current state of the comparison as appended fields are checked.
     */
    private int comparison;

    /**
     * <p>Constructor for CompareToBuilder.</p>
     *
     * <p>Starts off assuming that the objects are equal. Multiple calls are 
     * then made to the various append methods, followed by a call to 
     * {@link #toComparison} to get the result.</p>
     */
    public CompareToBuilder() {
        super();__CLR4_4_16i76i7ldnigfs0.R.inc(8432);try{__CLR4_4_16i76i7ldnigfs0.R.inc(8431);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8433);comparison = 0;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** 
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>Transient members will be not be compared, as they are likely derived
     *     fields</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either (but not both) parameters are
     *  <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8434);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8435);return reflectionCompare(lhs, rhs, false, null);
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final boolean compareTransients) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8436);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8437);return reflectionCompare(lhs, rhs, compareTransients, null);
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  Collection of String fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8438);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8439);return reflectionCompare(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  array of fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8440);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8441);return reflectionCompare(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If the <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Compares superclass fields up to and including <code>reflectUpToClass</code>.
     *     If <code>reflectUpToClass</code> is <code>null</code>, compares all superclass fields.</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @param reflectUpToClass  last superclass for which fields are compared
     * @param excludeFields  fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2 (2.0 as <code>reflectionCompare(Object, Object, boolean, Class)</code>)
     */
    public static int reflectionCompare(
        final Object lhs, 
        final Object rhs, 
        final boolean compareTransients, 
        final Class<?> reflectUpToClass, 
        final String... excludeFields) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8442);

        __CLR4_4_16i76i7ldnigfs0.R.inc(8443);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8444)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8445)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8446);return 0;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8447);if ((((lhs == null || rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8448)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8449)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8450);throw new NullPointerException();
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8451);Class<?> lhsClazz = lhs.getClass();
        __CLR4_4_16i76i7ldnigfs0.R.inc(8452);if ((((!lhsClazz.isInstance(rhs))&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8453)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8454)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8455);throw new ClassCastException();
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8456);final CompareToBuilder compareToBuilder = new CompareToBuilder();
        __CLR4_4_16i76i7ldnigfs0.R.inc(8457);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8458);while ((((lhsClazz.getSuperclass() != null && lhsClazz != reflectUpToClass)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8459)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8460)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8461);lhsClazz = lhsClazz.getSuperclass();
            __CLR4_4_16i76i7ldnigfs0.R.inc(8462);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8463);return compareToBuilder.toComparison();
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to <code>builder</code> the comparison of <code>lhs</code>
     * to <code>rhs</code> using the fields defined in <code>clazz</code>.</p>
     * 
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param clazz  <code>Class</code> that defines fields to be compared
     * @param builder  <code>CompareToBuilder</code> to append to
     * @param useTransients  whether to compare transient fields
     * @param excludeFields  fields to exclude
     */
    private static void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz,
        final CompareToBuilder builder,
        final boolean useTransients,
        final String[] excludeFields) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8464);
        
        __CLR4_4_16i76i7ldnigfs0.R.inc(8465);final Field[] fields = clazz.getDeclaredFields();
        __CLR4_4_16i76i7ldnigfs0.R.inc(8466);AccessibleObject.setAccessible(fields, true);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8467);for (int i = 0; (((i < fields.length && builder.comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8468)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8469)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8470);final Field f = fields[i];
            __CLR4_4_16i76i7ldnigfs0.R.inc(8471);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                && (f.getName().indexOf('$') == -1)
                && (useTransients || !Modifier.isTransient(f.getModifiers()))
                && (!Modifier.isStatic(f.getModifiers())))&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8472)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8473)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8474);try {
                    __CLR4_4_16i76i7ldnigfs0.R.inc(8475);builder.append(f.get(lhs), f.get(rhs));
                } catch (final IllegalAccessException e) {
                    // This can't happen. Would get a Security exception instead.
                    // Throw a runtime exception in case the impossible happens.
                    __CLR4_4_16i76i7ldnigfs0.R.inc(8476);throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }}
    }}finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the <code>compareTo(Object)</code>
     * result of the superclass.</p>
     *
     * @param superCompareTo  result of calling <code>super.compareTo(Object)</code>
     * @return this - used to chain append calls
     * @since 2.0
     */
    public CompareToBuilder appendSuper(final int superCompareTo) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8477);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8478);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8479)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8480)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8481);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8482);comparison = superCompareTo;
        __CLR4_4_16i76i7ldnigfs0.R.inc(8483);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     * 
     * <p><code>lhs</code> must either be an array or implement {@link Comparable}.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object lhs, final Object rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8484);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8485);return append(lhs, rhs, null);
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     *
     * <p>If <code>lhs</code> is an array, array comparison methods will be used.
     * Otherwise <code>comparator</code> will be used to compare the objects.
     * If <code>comparator</code> is <code>null</code>, <code>lhs</code> must
     * implement {@link Comparable} instead.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param comparator  <code>Comparator</code> used to compare the objects,
     *  <code>null</code> means treat lhs as <code>Comparable</code>
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object lhs, final Object rhs, final Comparator<?> comparator) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8486);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8487);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8488)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8489)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8490);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8491);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8492)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8493)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8494);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8495);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8496)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8497)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8498);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8499);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8500);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8501)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8502)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8503);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8504);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8505);if ((((lhs.getClass().isArray())&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8506)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8507)==0&false))) {{
            // switch on type of array, to dispatch to the correct handler
            // handles multi dimensional arrays
            // throws a ClassCastException if rhs is not the correct array type
            __CLR4_4_16i76i7ldnigfs0.R.inc(8508);if ((((lhs instanceof long[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8509)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8510)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8511);append((long[]) lhs, (long[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8512);if ((((lhs instanceof int[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8513)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8514)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8515);append((int[]) lhs, (int[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8516);if ((((lhs instanceof short[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8517)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8518)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8519);append((short[]) lhs, (short[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8520);if ((((lhs instanceof char[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8521)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8522)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8523);append((char[]) lhs, (char[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8524);if ((((lhs instanceof byte[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8525)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8526)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8527);append((byte[]) lhs, (byte[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8528);if ((((lhs instanceof double[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8529)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8530)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8531);append((double[]) lhs, (double[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8532);if ((((lhs instanceof float[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8533)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8534)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8535);append((float[]) lhs, (float[]) rhs);
            } }else {__CLR4_4_16i76i7ldnigfs0.R.inc(8536);if ((((lhs instanceof boolean[])&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8537)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8538)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8539);append((boolean[]) lhs, (boolean[]) rhs);
            } }else {{
                // not an array of primitives
                // throws a ClassCastException if rhs is not an array
                __CLR4_4_16i76i7ldnigfs0.R.inc(8540);append((Object[]) lhs, (Object[]) rhs, comparator);
            }
        }}}}}}}}} }else {{
            // the simple case, not an array, just test the element
            __CLR4_4_16i76i7ldnigfs0.R.inc(8541);if ((((comparator == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8542)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8543)==0&false))) {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8544);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparable<Object> comparable = (Comparable<Object>) lhs;
                __CLR4_4_16i76i7ldnigfs0.R.inc(8545);comparison = comparable.compareTo(rhs);
            } }else {{
                __CLR4_4_16i76i7ldnigfs0.R.inc(8546);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparator<Object> comparator2 = (Comparator<Object>) comparator;
                __CLR4_4_16i76i7ldnigfs0.R.inc(8547);comparison = comparator2.compare(lhs, rhs);
            }
        }}
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8548);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>long</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long lhs, final long rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8549);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8550);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8551)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8552)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8553);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8554);comparison = (((((lhs < rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8555)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8556)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8557)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8558)==0&false))? 1 : 0));
        __CLR4_4_16i76i7ldnigfs0.R.inc(8559);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>int</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int lhs, final int rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8560);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8561);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8562)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8563)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8564);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8565);comparison = (((((lhs < rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8566)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8567)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8568)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8569)==0&false))? 1 : 0));
        __CLR4_4_16i76i7ldnigfs0.R.inc(8570);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>short</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short lhs, final short rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8571);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8572);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8573)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8574)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8575);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8576);comparison = (((((lhs < rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8577)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8578)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8579)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8580)==0&false))? 1 : 0));
        __CLR4_4_16i76i7ldnigfs0.R.inc(8581);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>char</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char lhs, final char rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8582);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8583);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8584)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8585)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8586);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8587);comparison = (((((lhs < rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8588)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8589)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8590)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8591)==0&false))? 1 : 0));
        __CLR4_4_16i76i7ldnigfs0.R.inc(8592);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>byte</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte lhs, final byte rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8593);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8594);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8595)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8596)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8597);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8598);comparison = (((((lhs < rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8599)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8600)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8601)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8602)==0&false))? 1 : 0));
        __CLR4_4_16i76i7ldnigfs0.R.inc(8603);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>double</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double lhs, final double rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8604);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8605);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8606)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8607)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8608);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8609);comparison = Double.compare(lhs, rhs);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8610);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>float</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float lhs, final float rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8611);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8612);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8613)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8614)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8615);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8616);comparison = Float.compare(lhs, rhs);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8617);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>booleans</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
      */
    public CompareToBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8618);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8619);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8620)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8621)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8622);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8623);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8624)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8625)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8626);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8627);if ((((lhs == false)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8628)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8629)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8630);comparison = -1;
        } }else {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8631);comparison = +1;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8632);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8633);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8634);return append(lhs, rhs, null);
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}
    
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @param comparator  <code>Comparator</code> to use to compare the array elements,
     *  <code>null</code> means to treat <code>lhs</code> elements as <code>Comparable</code>.
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs, final Comparator<?> comparator) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8635);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8636);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8637)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8638)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8639);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8640);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8641)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8642)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8643);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8644);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8645)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8646)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8647);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8648);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8649);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8650)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8651)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8652);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8653);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8654);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8655)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8656)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8657);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8658)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8659)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8660);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8661);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8662)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8663)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8664);append(lhs[i], rhs[i], comparator);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8665);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>long</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(long, long)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8666);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8667);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8668)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8669)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8670);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8671);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8672)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8673)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8674);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8675);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8676)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8677)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8678);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8679);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8680);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8681)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8682)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8683);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8684);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8685);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8686)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8687)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8688);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8689)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8690)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8691);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8692);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8693)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8694)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8695);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8696);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>int</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(int, int)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8697);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8698);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8699)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8700)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8701);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8702);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8703)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8704)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8705);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8706);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8707)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8708)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8709);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8710);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8711);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8712)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8713)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8714);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8715);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8716);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8717)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8718)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8719);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8720)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8721)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8722);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8723);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8724)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8725)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8726);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8727);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>short</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(short, short)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8728);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8729);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8730)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8731)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8732);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8733);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8734)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8735)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8736);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8737);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8738)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8739)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8740);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8741);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8742);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8743)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8744)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8745);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8746);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8747);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8748)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8749)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8750);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8751)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8752)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8753);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8754);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8755)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8756)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8757);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8758);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>char</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(char, char)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8759);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8760);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8761)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8762)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8763);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8764);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8765)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8766)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8767);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8768);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8769)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8770)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8771);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8772);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8773);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8774)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8775)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8776);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8777);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8778);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8779)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8780)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8781);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8782)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8783)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8784);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8785);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8786)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8787)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8788);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8789);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>byte</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(byte, byte)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8790);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8791);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8792)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8793)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8794);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8795);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8796)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8797)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8798);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8799);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8800)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8801)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8802);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8803);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8804);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8805)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8806)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8807);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8808);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8809);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8810)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8811)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8812);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8813)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8814)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8815);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8816);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8817)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8818)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8819);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8820);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>double</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(double, double)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8821);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8822);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8823)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8824)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8825);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8826);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8827)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8828)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8829);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8830);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8831)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8832)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8833);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8834);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8835);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8836)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8837)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8838);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8839);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8840);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8841)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8842)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8843);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8844)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8845)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8846);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8847);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8848)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8849)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8850);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8851);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>float</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(float, float)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8852);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8853);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8854)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8855)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8856);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8857);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8858)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8859)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8860);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8861);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8862)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8863)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8864);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8865);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8866);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8867)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8868)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8869);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8870);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8871);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8872)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8873)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8874);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8875)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8876)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8877);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8878);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8879)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8880)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8881);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8882);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>boolean</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(boolean, boolean)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8883);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8884);if ((((comparison != 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8885)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8886)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8887);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8888);if ((((lhs == rhs)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8889)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8890)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8891);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8892);if ((((lhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8893)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8894)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8895);comparison = -1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8896);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8897);if ((((rhs == null)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8898)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8899)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8900);comparison = +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8901);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8902);if ((((lhs.length != rhs.length)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8903)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8904)==0&false))) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8905);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8906)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8907)==0&false))? -1 : +1;
            __CLR4_4_16i76i7ldnigfs0.R.inc(8908);return this;
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8909);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_4_16i76i7ldnigfs0.R.iget(8910)!=0|true))||(__CLR4_4_16i76i7ldnigfs0.R.iget(8911)==0&false)); i++) {{
            __CLR4_4_16i76i7ldnigfs0.R.inc(8912);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16i76i7ldnigfs0.R.inc(8913);return this;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a negative integer, a positive integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result
     * @see #build()
     */
    public int toComparison() {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8914);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8915);return comparison;
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}

    /**
     * Returns a negative Integer, a positive Integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result as an Integer
     * @see #toComparison()
     * @since 3.0
     */
    @Override
    public Integer build() {try{__CLR4_4_16i76i7ldnigfs0.R.inc(8916);
        __CLR4_4_16i76i7ldnigfs0.R.inc(8917);return Integer.valueOf(toComparison());
    }finally{__CLR4_4_16i76i7ldnigfs0.R.flushNeeded();}}
}

