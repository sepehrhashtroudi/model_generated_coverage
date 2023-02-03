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
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * <p>Assists in implementing {@link Object#equals(Object)} methods.</p>
 *
 * <p> This class provides methods to build a good equals method for any
 * class. It follows rules laid out in
 * <a href="http://www.oracle.com/technetwork/java/effectivejava-136174.html">Effective Java</a>
 * , by Joshua Bloch. In particular the rule for comparing <code>doubles</code>,
 * <code>floats</code>, and arrays can be tricky. Also, making sure that
 * <code>equals()</code> and <code>hashCode()</code> are consistent can be
 * difficult.</p>
 *
 * <p>Two Objects that compare as equals must generate the same hash code,
 * but two Objects with the same hash code do not have to be equal.</p>
 *
 * <p>All relevant fields should be included in the calculation of equals.
 * Derived fields may be ignored. In particular, any field used in
 * generating a hash code must be used in the equals method, and vice
 * versa.</p>
 *
 * <p>Typical use for the code is as follows:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   if (obj == null) { return false; }
 *   if (obj == this) { return true; }
 *   if (obj.getClass() != getClass()) {
 *     return false;
 *   }
 *   MyClass rhs = (MyClass) obj;
 *   return new EqualsBuilder()
 *                 .appendSuper(super.equals(obj))
 *                 .append(field1, rhs.field1)
 *                 .append(field2, rhs.field2)
 *                 .append(field3, rhs.field3)
 *                 .isEquals();
 *  }
 * </pre>
 *
 * <p> Alternatively, there is a method that uses reflection to determine
 * the fields to test. Because these fields are usually private, the method,
 * <code>reflectionEquals</code>, uses <code>AccessibleObject.setAccessible</code> to
 * change the visibility of the fields. This will fail under a security
 * manager, unless the appropriate permissions are set up correctly. It is
 * also slower than testing explicitly.</p>
 *
 * <p> A typical invocation for this method would look like:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   return EqualsBuilder.reflectionEquals(this, obj);
 * }
 * </pre>
 *
 * @since 1.0
 * @version $Id$
 */
public class EqualsBuilder implements Builder<Boolean> {public static class __CLR4_4_16vq6vqldnigfso{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,9359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.
     * </p>
     *
     * @since 3.0
     */
    private static final ThreadLocal<Set<Pair<IDKey, IDKey>>> REGISTRY = new ThreadLocal<Set<Pair<IDKey, IDKey>>>();

    /*
     * NOTE: we cannot store the actual objects in a HashSet, as that would use the very hashCode()
     * we are in the process of calculating.
     *
     * So we generate a one-to-one mapping from the original object to a new object.
     *
     * Now HashSet uses equals() to determine if two elements with the same hashcode really
     * are equal, so we also need to ensure that the replacement objects are only equal
     * if the original objects are identical.
     *
     * The original implementation (2.4 and before) used the System.indentityHashCode()
     * method - however this is not guaranteed to generate unique ids (e.g. LANG-459)
     *
     * We now use the IDKey helper class (adapted from org.apache.axis.utils.IDKey)
     * to disambiguate the duplicate ids.
     */

    /**
     * <p>
     * Returns the registry of object pairs being traversed by the reflection
     * methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     * @since 3.0
     */
    static Set<Pair<IDKey, IDKey>> getRegistry() {try{__CLR4_4_16vq6vqldnigfso.R.inc(8918);
        __CLR4_4_16vq6vqldnigfso.R.inc(8919);return REGISTRY.get();
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>
     * Converters value pair into a register pair.
     * </p>
     *
     * @param lhs <code>this</code> object
     * @param rhs the other object
     *
     * @return the pair
     */
    static Pair<IDKey, IDKey> getRegisterPair(final Object lhs, final Object rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8920);
        __CLR4_4_16vq6vqldnigfso.R.inc(8921);final IDKey left = new IDKey(lhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(8922);final IDKey right = new IDKey(rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(8923);return Pair.of(left, right);
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * Objects might be swapped therefore a check is needed if the object pair
     * is registered in given or swapped order.
     * </p>
     *
     * @param lhs <code>this</code> object to lookup in registry
     * @param rhs the other object to lookup on registry
     * @return boolean <code>true</code> if the registry contains the given object.
     * @since 3.0
     */
    static boolean isRegistered(final Object lhs, final Object rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8924);
        __CLR4_4_16vq6vqldnigfso.R.inc(8925);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_4_16vq6vqldnigfso.R.inc(8926);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(8927);final Pair<IDKey, IDKey> swappedPair = Pair.of(pair.getLeft(), pair.getRight());

        __CLR4_4_16vq6vqldnigfso.R.inc(8928);return registry != null
                && (registry.contains(pair) || registry.contains(swappedPair));
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param lhs <code>this</code> object to register
     * @param rhs the other object to register
     */
    static void register(final Object lhs, final Object rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8929);
        __CLR4_4_16vq6vqldnigfso.R.inc(8930);synchronized (EqualsBuilder.class) {
            __CLR4_4_16vq6vqldnigfso.R.inc(8931);if ((((getRegistry() == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(8932)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8933)==0&false))) {{
                __CLR4_4_16vq6vqldnigfso.R.inc(8934);REGISTRY.set(new HashSet<Pair<IDKey, IDKey>>());
            }
        }}

        __CLR4_4_16vq6vqldnigfso.R.inc(8935);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_4_16vq6vqldnigfso.R.inc(8936);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(8937);registry.add(pair);
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object pair.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     *
     * @param lhs <code>this</code> object to unregister
     * @param rhs the other object to unregister
     * @since 3.0
     */
    static void unregister(final Object lhs, final Object rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8938);
        __CLR4_4_16vq6vqldnigfso.R.inc(8939);Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_4_16vq6vqldnigfso.R.inc(8940);if ((((registry != null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(8941)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8942)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(8943);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
            __CLR4_4_16vq6vqldnigfso.R.inc(8944);registry.remove(pair);
            __CLR4_4_16vq6vqldnigfso.R.inc(8945);synchronized (EqualsBuilder.class) {
                //read again
                __CLR4_4_16vq6vqldnigfso.R.inc(8946);registry = getRegistry();
                __CLR4_4_16vq6vqldnigfso.R.inc(8947);if ((((registry != null && registry.isEmpty())&&(__CLR4_4_16vq6vqldnigfso.R.iget(8948)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8949)==0&false))) {{
                    __CLR4_4_16vq6vqldnigfso.R.inc(8950);REGISTRY.remove();
                }
            }}
        }
    }}finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * If the fields tested are equals.
     * The default value is <code>true</code>.
     */
    private boolean isEquals = true;

    /**
     * <p>Constructor for EqualsBuilder.</p>
     *
     * <p>Starts off assuming that equals is <code>true</code>.</p>
     * @see Object#equals(Object)
     */
    public EqualsBuilder() {try{__CLR4_4_16vq6vqldnigfso.R.inc(8951);
        // do nothing for now.
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  Collection of String field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8952);
        __CLR4_4_16vq6vqldnigfso.R.inc(8953);return reflectionEquals(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8954);
        __CLR4_4_16vq6vqldnigfso.R.inc(8955);return reflectionEquals(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>If the TestTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8956);
        __CLR4_4_16vq6vqldnigfso.R.inc(8957);return reflectionEquals(lhs, rhs, testTransients, null);
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>If the testTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be included. Superclass fields will be appended
     * up to and including the specified superclass. A null superclass is treated
     * as java.lang.Object.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * @since 2.0
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients, final Class<?> reflectUpToClass,
            final String... excludeFields) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8958);
        __CLR4_4_16vq6vqldnigfso.R.inc(8959);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(8960)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8961)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(8962);return true;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(8963);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(8964)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8965)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(8966);return false;
        }
        // Find the leaf class since there may be transients in the leaf
        // class or in classes between the leaf and root.
        // If we are not testing transients or a subclass has no ivars,
        // then a subclass can test equals to a superclass.
        }__CLR4_4_16vq6vqldnigfso.R.inc(8967);final Class<?> lhsClass = lhs.getClass();
        __CLR4_4_16vq6vqldnigfso.R.inc(8968);final Class<?> rhsClass = rhs.getClass();
        __CLR4_4_16vq6vqldnigfso.R.inc(8969);Class<?> testClass;
        __CLR4_4_16vq6vqldnigfso.R.inc(8970);if ((((lhsClass.isInstance(rhs))&&(__CLR4_4_16vq6vqldnigfso.R.iget(8971)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8972)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(8973);testClass = lhsClass;
            __CLR4_4_16vq6vqldnigfso.R.inc(8974);if ((((!rhsClass.isInstance(lhs))&&(__CLR4_4_16vq6vqldnigfso.R.iget(8975)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8976)==0&false))) {{
                // rhsClass is a subclass of lhsClass
                __CLR4_4_16vq6vqldnigfso.R.inc(8977);testClass = rhsClass;
            }
        }} }else {__CLR4_4_16vq6vqldnigfso.R.inc(8978);if ((((rhsClass.isInstance(lhs))&&(__CLR4_4_16vq6vqldnigfso.R.iget(8979)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8980)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(8981);testClass = rhsClass;
            __CLR4_4_16vq6vqldnigfso.R.inc(8982);if ((((!lhsClass.isInstance(rhs))&&(__CLR4_4_16vq6vqldnigfso.R.iget(8983)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8984)==0&false))) {{
                // lhsClass is a subclass of rhsClass
                __CLR4_4_16vq6vqldnigfso.R.inc(8985);testClass = lhsClass;
            }
        }} }else {{
            // The two classes are not related.
            __CLR4_4_16vq6vqldnigfso.R.inc(8986);return false;
        }
        }}__CLR4_4_16vq6vqldnigfso.R.inc(8987);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_4_16vq6vqldnigfso.R.inc(8988);try {
            __CLR4_4_16vq6vqldnigfso.R.inc(8989);reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
            __CLR4_4_16vq6vqldnigfso.R.inc(8990);while ((((testClass.getSuperclass() != null && testClass != reflectUpToClass)&&(__CLR4_4_16vq6vqldnigfso.R.iget(8991)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(8992)==0&false))) {{
                __CLR4_4_16vq6vqldnigfso.R.inc(8993);testClass = testClass.getSuperclass();
                __CLR4_4_16vq6vqldnigfso.R.inc(8994);reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
            }
        }} catch (final IllegalArgumentException e) {
            // In this case, we tried to test a subclass vs. a superclass and
            // the subclass has ivars or the ivars are transient and
            // we are testing transients.
            // If a subclass has ivars that we are trying to test them, we get an
            // exception and we know that the objects are not equal.
            __CLR4_4_16vq6vqldnigfso.R.inc(8995);return false;
        }
        __CLR4_4_16vq6vqldnigfso.R.inc(8996);return equalsBuilder.isEquals();
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Appends the fields and values defined by the given object of the
     * given Class.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @param clazz  the class to append details of
     * @param builder  the builder to append to
     * @param useTransients  whether to test transient fields
     * @param excludeFields  array of field names to exclude from testing
     */
    private static void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz,
        final EqualsBuilder builder,
        final boolean useTransients,
        final String[] excludeFields) {try{__CLR4_4_16vq6vqldnigfso.R.inc(8997);

        __CLR4_4_16vq6vqldnigfso.R.inc(8998);if ((((isRegistered(lhs, rhs))&&(__CLR4_4_16vq6vqldnigfso.R.iget(8999)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9000)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9001);return;
        }

        }__CLR4_4_16vq6vqldnigfso.R.inc(9002);try {
            __CLR4_4_16vq6vqldnigfso.R.inc(9003);register(lhs, rhs);
            __CLR4_4_16vq6vqldnigfso.R.inc(9004);final Field[] fields = clazz.getDeclaredFields();
            __CLR4_4_16vq6vqldnigfso.R.inc(9005);AccessibleObject.setAccessible(fields, true);
            __CLR4_4_16vq6vqldnigfso.R.inc(9006);for (int i = 0; (((i < fields.length && builder.isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9007)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9008)==0&false)); i++) {{
                __CLR4_4_16vq6vqldnigfso.R.inc(9009);final Field f = fields[i];
                __CLR4_4_16vq6vqldnigfso.R.inc(9010);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                    && (f.getName().indexOf('$') == -1)
                    && (useTransients || !Modifier.isTransient(f.getModifiers()))
                    && (!Modifier.isStatic(f.getModifiers())))&&(__CLR4_4_16vq6vqldnigfso.R.iget(9011)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9012)==0&false))) {{
                    __CLR4_4_16vq6vqldnigfso.R.inc(9013);try {
                        __CLR4_4_16vq6vqldnigfso.R.inc(9014);builder.append(f.get(lhs), f.get(rhs));
                    } catch (final IllegalAccessException e) {
                        //this can't happen. Would get a Security exception instead
                        //throw a runtime exception in case the impossible happens.
                        __CLR4_4_16vq6vqldnigfso.R.inc(9015);throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }}
        }} finally {
            __CLR4_4_16vq6vqldnigfso.R.inc(9016);unregister(lhs, rhs);
        }
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Adds the result of <code>super.equals()</code> to this builder.</p>
     *
     * @param superEquals  the result of calling <code>super.equals()</code>
     * @return EqualsBuilder - used to chain calls.
     * @since 2.0
     */
    public EqualsBuilder appendSuper(final boolean superEquals) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9017);
        __CLR4_4_16vq6vqldnigfso.R.inc(9018);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9019)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9020)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9021);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9022);isEquals = superEquals;
        __CLR4_4_16vq6vqldnigfso.R.inc(9023);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Test if two <code>Object</code>s are equal using their
     * <code>equals</code> method.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object lhs, final Object rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9024);
        __CLR4_4_16vq6vqldnigfso.R.inc(9025);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9026)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9027)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9028);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9029);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9030)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9031)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9032);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9033);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9034)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9035)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9036);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9037);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9038);final Class<?> lhsClass = lhs.getClass();
        __CLR4_4_16vq6vqldnigfso.R.inc(9039);if ((((!lhsClass.isArray())&&(__CLR4_4_16vq6vqldnigfso.R.iget(9040)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9041)==0&false))) {{
            // The simple case, not an array, just test the element
            __CLR4_4_16vq6vqldnigfso.R.inc(9042);isEquals = lhs.equals(rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9043);if ((((lhs.getClass() != rhs.getClass())&&(__CLR4_4_16vq6vqldnigfso.R.iget(9044)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9045)==0&false))) {{
            // Here when we compare different dimensions, for example: a boolean[][] to a boolean[]
            __CLR4_4_16vq6vqldnigfso.R.inc(9046);this.setEquals(false);
        }
        // 'Switch' on type of array, to dispatch to the correct handler
        // This handles multi dimensional arrays of the same depth
        }else {__CLR4_4_16vq6vqldnigfso.R.inc(9047);if ((((lhs instanceof long[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9048)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9049)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9050);append((long[]) lhs, (long[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9051);if ((((lhs instanceof int[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9052)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9053)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9054);append((int[]) lhs, (int[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9055);if ((((lhs instanceof short[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9056)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9057)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9058);append((short[]) lhs, (short[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9059);if ((((lhs instanceof char[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9060)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9061)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9062);append((char[]) lhs, (char[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9063);if ((((lhs instanceof byte[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9064)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9065)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9066);append((byte[]) lhs, (byte[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9067);if ((((lhs instanceof double[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9068)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9069)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9070);append((double[]) lhs, (double[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9071);if ((((lhs instanceof float[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9072)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9073)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9074);append((float[]) lhs, (float[]) rhs);
        } }else {__CLR4_4_16vq6vqldnigfso.R.inc(9075);if ((((lhs instanceof boolean[])&&(__CLR4_4_16vq6vqldnigfso.R.iget(9076)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9077)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9078);append((boolean[]) lhs, (boolean[]) rhs);
        } }else {{
            // Not an array of primitives
            __CLR4_4_16vq6vqldnigfso.R.inc(9079);append((Object[]) lhs, (Object[]) rhs);
        }
        }}}}}}}}}}__CLR4_4_16vq6vqldnigfso.R.inc(9080);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>
     * Test if two <code>long</code> s are equal.
     * </p>
     *
     * @param lhs
     *                  the left hand <code>long</code>
     * @param rhs
     *                  the right hand <code>long</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long lhs, final long rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9081);
        __CLR4_4_16vq6vqldnigfso.R.inc(9082);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9083)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9084)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9085);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9086);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9087);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>int</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>int</code>
     * @param rhs  the right hand <code>int</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int lhs, final int rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9088);
        __CLR4_4_16vq6vqldnigfso.R.inc(9089);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9090)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9091)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9092);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9093);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9094);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>short</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>short</code>
     * @param rhs  the right hand <code>short</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short lhs, final short rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9095);
        __CLR4_4_16vq6vqldnigfso.R.inc(9096);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9097)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9098)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9099);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9100);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9101);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>char</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>char</code>
     * @param rhs  the right hand <code>char</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char lhs, final char rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9102);
        __CLR4_4_16vq6vqldnigfso.R.inc(9103);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9104)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9105)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9106);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9107);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9108);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>byte</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>byte</code>
     * @param rhs  the right hand <code>byte</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte lhs, final byte rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9109);
        __CLR4_4_16vq6vqldnigfso.R.inc(9110);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9111)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9112)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9113);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9114);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9115);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>double</code>s are equal by testing that the
     * pattern of bits returned by <code>doubleToLong</code> are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>double</code>
     * @param rhs  the right hand <code>double</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double lhs, final double rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9116);
        __CLR4_4_16vq6vqldnigfso.R.inc(9117);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9118)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9119)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9120);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9121);return append(Double.doubleToLongBits(lhs), Double.doubleToLongBits(rhs));
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>float</code>s are equal byt testing that the
     * pattern of bits returned by doubleToLong are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>float</code>
     * @param rhs  the right hand <code>float</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float lhs, final float rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9122);
        __CLR4_4_16vq6vqldnigfso.R.inc(9123);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9124)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9125)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9126);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9127);return append(Float.floatToIntBits(lhs), Float.floatToIntBits(rhs));
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Test if two <code>booleans</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>boolean</code>
     * @param rhs  the right hand <code>boolean</code>
     * @return EqualsBuilder - used to chain calls.
      */
    public EqualsBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9128);
        __CLR4_4_16vq6vqldnigfso.R.inc(9129);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9130)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9131)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9132);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9133);isEquals = (lhs == rhs);
        __CLR4_4_16vq6vqldnigfso.R.inc(9134);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Performs a deep comparison of two <code>Object</code> arrays.</p>
     *
     * <p>This also will be called for the top level of
     * multi-dimensional, ragged, and multi-typed arrays.</p>
     *
     * @param lhs  the left hand <code>Object[]</code>
     * @param rhs  the right hand <code>Object[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9135);
        __CLR4_4_16vq6vqldnigfso.R.inc(9136);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9137)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9138)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9139);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9140);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9141)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9142)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9143);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9144);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9145)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9146)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9147);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9148);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9149);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9150)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9151)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9152);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9153);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9154);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9155)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9156)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9157);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9158);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>long</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(long, long)} is used.</p>
     *
     * @param lhs  the left hand <code>long[]</code>
     * @param rhs  the right hand <code>long[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9159);
        __CLR4_4_16vq6vqldnigfso.R.inc(9160);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9161)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9162)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9163);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9164);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9165)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9166)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9167);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9168);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9169)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9170)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9171);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9172);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9173);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9174)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9175)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9176);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9177);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9178);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9179)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9180)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9181);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9182);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>int</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(int, int)} is used.</p>
     *
     * @param lhs  the left hand <code>int[]</code>
     * @param rhs  the right hand <code>int[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9183);
        __CLR4_4_16vq6vqldnigfso.R.inc(9184);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9185)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9186)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9187);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9188);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9189)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9190)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9191);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9192);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9193)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9194)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9195);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9196);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9197);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9198)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9199)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9200);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9201);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9202);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9203)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9204)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9205);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9206);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>short</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(short, short)} is used.</p>
     *
     * @param lhs  the left hand <code>short[]</code>
     * @param rhs  the right hand <code>short[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9207);
        __CLR4_4_16vq6vqldnigfso.R.inc(9208);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9209)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9210)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9211);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9212);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9213)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9214)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9215);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9216);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9217)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9218)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9219);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9220);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9221);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9222)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9223)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9224);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9225);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9226);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9227)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9228)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9229);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9230);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>char</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(char, char)} is used.</p>
     *
     * @param lhs  the left hand <code>char[]</code>
     * @param rhs  the right hand <code>char[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9231);
        __CLR4_4_16vq6vqldnigfso.R.inc(9232);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9233)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9234)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9235);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9236);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9237)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9238)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9239);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9240);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9241)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9242)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9243);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9244);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9245);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9246)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9247)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9248);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9249);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9250);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9251)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9252)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9253);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9254);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>byte</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(byte, byte)} is used.</p>
     *
     * @param lhs  the left hand <code>byte[]</code>
     * @param rhs  the right hand <code>byte[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9255);
        __CLR4_4_16vq6vqldnigfso.R.inc(9256);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9257)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9258)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9259);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9260);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9261)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9262)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9263);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9264);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9265)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9266)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9267);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9268);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9269);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9270)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9271)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9272);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9273);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9274);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9275)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9276)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9277);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9278);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>double</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(double, double)} is used.</p>
     *
     * @param lhs  the left hand <code>double[]</code>
     * @param rhs  the right hand <code>double[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9279);
        __CLR4_4_16vq6vqldnigfso.R.inc(9280);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9281)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9282)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9283);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9284);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9285)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9286)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9287);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9288);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9289)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9290)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9291);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9292);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9293);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9294)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9295)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9296);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9297);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9298);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9299)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9300)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9301);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9302);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>float</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(float, float)} is used.</p>
     *
     * @param lhs  the left hand <code>float[]</code>
     * @param rhs  the right hand <code>float[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9303);
        __CLR4_4_16vq6vqldnigfso.R.inc(9304);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9305)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9306)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9307);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9308);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9309)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9310)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9311);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9312);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9313)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9314)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9315);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9316);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9317);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9318)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9319)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9320);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9321);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9322);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9323)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9324)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9325);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9326);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>boolean</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(boolean, boolean)} is used.</p>
     *
     * @param lhs  the left hand <code>boolean[]</code>
     * @param rhs  the right hand <code>boolean[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9327);
        __CLR4_4_16vq6vqldnigfso.R.inc(9328);if ((((isEquals == false)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9329)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9330)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9331);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9332);if ((((lhs == rhs)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9333)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9334)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9335);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9336);if ((((lhs == null || rhs == null)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9337)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9338)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9339);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9340);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9341);if ((((lhs.length != rhs.length)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9342)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9343)==0&false))) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9344);this.setEquals(false);
            __CLR4_4_16vq6vqldnigfso.R.inc(9345);return this;
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9346);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_4_16vq6vqldnigfso.R.iget(9347)!=0|true))||(__CLR4_4_16vq6vqldnigfso.R.iget(9348)==0&false)); ++i) {{
            __CLR4_4_16vq6vqldnigfso.R.inc(9349);append(lhs[i], rhs[i]);
        }
        }__CLR4_4_16vq6vqldnigfso.R.inc(9350);return this;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return boolean
     */
    public boolean isEquals() {try{__CLR4_4_16vq6vqldnigfso.R.inc(9351);
        __CLR4_4_16vq6vqldnigfso.R.inc(9352);return this.isEquals;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return <code>true</code> if all of the fields that have been checked
     *         are equal, <code>false</code> otherwise.
     *
     * @since 3.0
     */
    @Override
    public Boolean build() {try{__CLR4_4_16vq6vqldnigfso.R.inc(9353);
        __CLR4_4_16vq6vqldnigfso.R.inc(9354);return Boolean.valueOf(isEquals());
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * Sets the <code>isEquals</code> value.
     *
     * @param isEquals The value to set.
     * @since 2.1
     */
    protected void setEquals(final boolean isEquals) {try{__CLR4_4_16vq6vqldnigfso.R.inc(9355);
        __CLR4_4_16vq6vqldnigfso.R.inc(9356);this.isEquals = isEquals;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}

    /**
     * Reset the EqualsBuilder so you can use the same object again
     * @since 2.5
     */
    public void reset() {try{__CLR4_4_16vq6vqldnigfso.R.inc(9357);
        __CLR4_4_16vq6vqldnigfso.R.inc(9358);this.isEquals = true;
    }finally{__CLR4_4_16vq6vqldnigfso.R.flushNeeded();}}
}
