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
package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * <p>Provides utilities for manipulating and examining 
 * <code>Throwable</code> objects.</p>
 *
 * @since 1.0
 * @version $Id$
 */
public class ExceptionUtils {public static class __CLR4_4_18t28t2ldni83ym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,11636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * <p>Used when printing stack frames to denote the start of a
     * wrapped exception.</p>
     *
     * <p>Package private for accessibility by test suite.</p>
     */
    static final String WRAPPED_MARKER = " [wrapped] ";

    /**
     * <p>The names of methods commonly used to access a wrapped exception.</p>
     */
    // TODO: Remove in Lang 4.0
    private static final String[] CAUSE_METHOD_NAMES = {
        "getCause",
        "getNextException",
        "getTargetException",
        "getException",
        "getSourceException",
        "getRootCause",
        "getCausedByException",
        "getNested",
        "getLinkedException",
        "getNestedException",
        "getLinkedCause",
        "getThrowable",
    };

    /**
     * <p>
     * Public constructor allows an instance of <code>ExceptionUtils</code> to be created, although that is not
     * normally necessary.
     * </p>
     */
    public ExceptionUtils() {
        super();__CLR4_4_18t28t2ldni83ym.R.inc(11415);try{__CLR4_4_18t28t2ldni83ym.R.inc(11414);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the default names used when searching for the cause of an exception.</p>
     *
     * <p>This may be modified and used in the overloaded getCause(Throwable, String[]) method.</p>
     *
     * @return cloned array of the default method names
     * @since 3.0
     * @deprecated This feature will be removed in Lang 4.0
     */
    @Deprecated
    public static String[] getDefaultCauseMethodNames() {try{__CLR4_4_18t28t2ldni83ym.R.inc(11416);
        __CLR4_4_18t28t2ldni83ym.R.inc(11417);return ArrayUtils.clone(CAUSE_METHOD_NAMES);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Introspects the <code>Throwable</code> to obtain the cause.</p>
     *
     * <p>The method searches for methods with specific names that return a 
     * <code>Throwable</code> object. This will pick up most wrapping exceptions,
     * including those from JDK 1.4.
     *
     * <p>The default list searched for are:</p>
     * <ul>
     *  <li><code>getCause()</code></li>
     *  <li><code>getNextException()</code></li>
     *  <li><code>getTargetException()</code></li>
     *  <li><code>getException()</code></li>
     *  <li><code>getSourceException()</code></li>
     *  <li><code>getRootCause()</code></li>
     *  <li><code>getCausedByException()</code></li>
     *  <li><code>getNested()</code></li>
     * </ul>
     * 
     * <p>If none of the above is found, returns <code>null</code>.</p>
     *
     * @param throwable  the throwable to introspect for a cause, may be null
     * @return the cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     * @since 1.0
     * @deprecated This feature will be removed in Lang 4.0
     */
    @Deprecated
    public static Throwable getCause(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11418);
        __CLR4_4_18t28t2ldni83ym.R.inc(11419);return getCause(throwable, CAUSE_METHOD_NAMES);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Introspects the <code>Throwable</code> to obtain the cause.</p>
     *
     * <p>A <code>null</code> set of method names means use the default set.
     * A <code>null</code> in the set of method names will be ignored.</p>
     *
     * @param throwable  the throwable to introspect for a cause, may be null
     * @param methodNames  the method names, null treated as default set
     * @return the cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     * @since 1.0
     * @deprecated This feature will be removed in Lang 4.0
     */
    @Deprecated
    public static Throwable getCause(final Throwable throwable, String[] methodNames) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11420);
        __CLR4_4_18t28t2ldni83ym.R.inc(11421);if ((((throwable == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11422)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11423)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11424);return null;
        }

        }__CLR4_4_18t28t2ldni83ym.R.inc(11425);if ((((methodNames == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11426)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11427)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11428);methodNames = CAUSE_METHOD_NAMES;
        }

        }__CLR4_4_18t28t2ldni83ym.R.inc(11429);for (final String methodName : methodNames) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11430);if ((((methodName != null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11431)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11432)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11433);final Throwable cause = getCauseUsingMethodName(throwable, methodName);
                __CLR4_4_18t28t2ldni83ym.R.inc(11434);if ((((cause != null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11435)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11436)==0&false))) {{
                    __CLR4_4_18t28t2ldni83ym.R.inc(11437);return cause;
                }
            }}
        }}

        }__CLR4_4_18t28t2ldni83ym.R.inc(11438);return null;
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Introspects the <code>Throwable</code> to obtain the root cause.</p>
     *
     * <p>This method walks through the exception chain to the last element,
     * "root" of the tree, using {@link #getCause(Throwable)}, and
     * returns that exception.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. If the throwable parameter
     * has a cause of itself, then null will be returned. If the throwable
     * parameter cause chain loops, the last element in the chain before the
     * loop is returned.</p>
     *
     * @param throwable  the throwable to get the root cause for, may be null
     * @return the root cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     */
    public static Throwable getRootCause(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11439);
        __CLR4_4_18t28t2ldni83ym.R.inc(11440);final List<Throwable> list = getThrowableList(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11441);return (((list.size() < 2 )&&(__CLR4_4_18t28t2ldni83ym.R.iget(11442)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11443)==0&false))? null : (Throwable)list.get(list.size() - 1);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Finds a <code>Throwable</code> by method name.</p>
     *
     * @param throwable  the exception to examine
     * @param methodName  the name of the method to find and invoke
     * @return the wrapped exception, or <code>null</code> if not found
     */
    // TODO: Remove in Lang 4.0
    private static Throwable getCauseUsingMethodName(final Throwable throwable, final String methodName) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11444);
        __CLR4_4_18t28t2ldni83ym.R.inc(11445);Method method = null;
        __CLR4_4_18t28t2ldni83ym.R.inc(11446);try {
            __CLR4_4_18t28t2ldni83ym.R.inc(11447);method = throwable.getClass().getMethod(methodName);
        } catch (final NoSuchMethodException ignored) { // NOPMD
            // exception ignored
        } catch (final SecurityException ignored) { // NOPMD
            // exception ignored
        }

        __CLR4_4_18t28t2ldni83ym.R.inc(11448);if ((((method != null && Throwable.class.isAssignableFrom(method.getReturnType()))&&(__CLR4_4_18t28t2ldni83ym.R.iget(11449)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11450)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11451);try {
                __CLR4_4_18t28t2ldni83ym.R.inc(11452);return (Throwable) method.invoke(throwable);
            } catch (final IllegalAccessException ignored) { // NOPMD
                // exception ignored
            } catch (final IllegalArgumentException ignored) { // NOPMD
                // exception ignored
            } catch (final InvocationTargetException ignored) { // NOPMD
                // exception ignored
            }
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11453);return null;
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Counts the number of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return <code>1</code>.
     * A throwable with one cause will return <code>2</code> and so on.
     * A <code>null</code> throwable will return <code>0</code>.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. The cause chain is
     * processed until the end is reached, or until the next item in the
     * chain is already in the result set.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @return the count of throwables, zero if null input
     */
    public static int getThrowableCount(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11454);
        __CLR4_4_18t28t2ldni83ym.R.inc(11455);return getThrowableList(throwable).size();
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Returns the list of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return an array containing
     * one element - the input throwable.
     * A throwable with one cause will return an array containing
     * two elements. - the input throwable and the cause throwable.
     * A <code>null</code> throwable will return an array of size zero.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. The cause chain is
     * processed until the end is reached, or until the next item in the
     * chain is already in the result set.</p>
     *
     * @see #getThrowableList(Throwable)
     * @param throwable  the throwable to inspect, may be null
     * @return the array of throwables, never null
     */
    public static Throwable[] getThrowables(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11456);
        __CLR4_4_18t28t2ldni83ym.R.inc(11457);final List<Throwable> list = getThrowableList(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11458);return list.toArray(new Throwable[list.size()]);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Returns the list of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return a list containing
     * one element - the input throwable.
     * A throwable with one cause will return a list containing
     * two elements. - the input throwable and the cause throwable.
     * A <code>null</code> throwable will return a list of size zero.</p>
     *
     * <p>This method handles recursive cause structures that might
     * otherwise cause infinite loops. The cause chain is processed until
     * the end is reached, or until the next item in the chain is already
     * in the result set.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @return the list of throwables, never null
     * @since Commons Lang 2.2
     */
    public static List<Throwable> getThrowableList(Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11459);
        __CLR4_4_18t28t2ldni83ym.R.inc(11460);final List<Throwable> list = new ArrayList<Throwable>();
        __CLR4_4_18t28t2ldni83ym.R.inc(11461);while ((((throwable != null && list.contains(throwable) == false)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11462)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11463)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11464);list.add(throwable);
            __CLR4_4_18t28t2ldni83ym.R.inc(11465);throwable = ExceptionUtils.getCause(throwable);
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11466);return list;
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified class (exactly) in the exception chain.
     * Subclasses of the specified class do not match - see
     * {@link #indexOfType(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param clazz  the class to search for, subclasses do not match, null returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     */
    public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11467);
        __CLR4_4_18t28t2ldni83ym.R.inc(11468);return indexOf(throwable, clazz, 0, false);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified type in the exception chain from
     * a specified index.
     * Subclasses of the specified class do not match - see
     * {@link #indexOfType(Throwable, Class, int)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.
     * A negative start index is treated as zero.
     * A start index greater than the number of throwables returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param clazz  the class to search for, subclasses do not match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     */
    public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz, final int fromIndex) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11469);
        __CLR4_4_18t28t2ldni83ym.R.inc(11470);return indexOf(throwable, clazz, fromIndex, false);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified class or subclass in the exception chain.
     * Subclasses of the specified class do match - see
     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     * @since 2.1
     */
    public static int indexOfType(final Throwable throwable, final Class<?> type) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11471);
        __CLR4_4_18t28t2ldni83ym.R.inc(11472);return indexOf(throwable, type, 0, true);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified type in the exception chain from
     * a specified index.
     * Subclasses of the specified class do match - see
     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.
     * A negative start index is treated as zero.
     * A start index greater than the number of throwables returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     * @since 2.1
     */
    public static int indexOfType(final Throwable throwable, final Class<?> type, final int fromIndex) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11473);
        __CLR4_4_18t28t2ldni83ym.R.inc(11474);return indexOf(throwable, type, fromIndex, true);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Worker method for the <code>indexOfType</code> methods.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @param subclass if <code>true</code>, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares
     * using references
     * @return index of the <code>type</code> within throwables nested within the specified <code>throwable</code>
     */
    private static int indexOf(final Throwable throwable, final Class<?> type, int fromIndex, final boolean subclass) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11475);
        __CLR4_4_18t28t2ldni83ym.R.inc(11476);if ((((throwable == null || type == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11477)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11478)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11479);return -1;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11480);if ((((fromIndex < 0)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11481)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11482)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11483);fromIndex = 0;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11484);final Throwable[] throwables = ExceptionUtils.getThrowables(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11485);if ((((fromIndex >= throwables.length)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11486)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11487)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11488);return -1;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11489);if ((((subclass)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11490)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11491)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11492);for (int i = fromIndex; (((i < throwables.length)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11493)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11494)==0&false)); i++) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11495);if ((((type.isAssignableFrom(throwables[i].getClass()))&&(__CLR4_4_18t28t2ldni83ym.R.iget(11496)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11497)==0&false))) {{
                    __CLR4_4_18t28t2ldni83ym.R.inc(11498);return i;
                }
            }}
        }} }else {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11499);for (int i = fromIndex; (((i < throwables.length)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11500)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11501)==0&false)); i++) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11502);if ((((type.equals(throwables[i].getClass()))&&(__CLR4_4_18t28t2ldni83ym.R.iget(11503)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11504)==0&false))) {{
                    __CLR4_4_18t28t2ldni83ym.R.inc(11505);return i;
                }
            }}
        }}
        }__CLR4_4_18t28t2ldni83ym.R.inc(11506);return -1;
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Prints a compact stack trace for the root cause of a throwable
     * to <code>System.err</code>.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11507);
        __CLR4_4_18t28t2ldni83ym.R.inc(11508);printRootCauseStackTrace(throwable, System.err);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Prints a compact stack trace for the root cause of a throwable.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output, may be null
     * @param stream  the stream to output to, may not be null
     * @throws IllegalArgumentException if the stream is <code>null</code>
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintStream stream) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11509);
        __CLR4_4_18t28t2ldni83ym.R.inc(11510);if ((((throwable == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11511)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11512)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11513);return;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11514);if ((((stream == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11515)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11516)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11517);throw new IllegalArgumentException("The PrintStream must not be null");
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11518);final String trace[] = getRootCauseStackTrace(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11519);for (final String element : trace) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11520);stream.println(element);
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11521);stream.flush();
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Prints a compact stack trace for the root cause of a throwable.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output, may be null
     * @param writer  the writer to output to, may not be null
     * @throws IllegalArgumentException if the writer is <code>null</code>
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintWriter writer) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11522);
        __CLR4_4_18t28t2ldni83ym.R.inc(11523);if ((((throwable == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11524)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11525)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11526);return;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11527);if ((((writer == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11528)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11529)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11530);throw new IllegalArgumentException("The PrintWriter must not be null");
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11531);final String trace[] = getRootCauseStackTrace(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11532);for (final String element : trace) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11533);writer.println(element);
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11534);writer.flush();
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Creates a compact stack trace for the root cause of the supplied
     * <code>Throwable</code>.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * It consists of the root exception followed by each of its wrapping
     * exceptions separated by '[wrapped]'. Note that this is the opposite
     * order to the JDK1.4 display.</p>
     *
     * @param throwable  the throwable to examine, may be null
     * @return an array of stack trace frames, never null
     * @since 2.0
     */
    public static String[] getRootCauseStackTrace(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11535);
        __CLR4_4_18t28t2ldni83ym.R.inc(11536);if ((((throwable == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11537)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11538)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11539);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11540);final Throwable throwables[] = getThrowables(throwable);
        __CLR4_4_18t28t2ldni83ym.R.inc(11541);final int count = throwables.length;
        __CLR4_4_18t28t2ldni83ym.R.inc(11542);final List<String> frames = new ArrayList<String>();
        __CLR4_4_18t28t2ldni83ym.R.inc(11543);List<String> nextTrace = getStackFrameList(throwables[count - 1]);
        __CLR4_4_18t28t2ldni83ym.R.inc(11544);for (int i = count; (((--i >= 0)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11545)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11546)==0&false));) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11547);final List<String> trace = nextTrace;
            __CLR4_4_18t28t2ldni83ym.R.inc(11548);if ((((i != 0)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11549)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11550)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11551);nextTrace = getStackFrameList(throwables[i - 1]);
                __CLR4_4_18t28t2ldni83ym.R.inc(11552);removeCommonFrames(trace, nextTrace);
            }
            }__CLR4_4_18t28t2ldni83ym.R.inc(11553);if ((((i == count - 1)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11554)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11555)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11556);frames.add(throwables[i].toString());
            } }else {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11557);frames.add(WRAPPED_MARKER + throwables[i].toString());
            }
            }__CLR4_4_18t28t2ldni83ym.R.inc(11558);for (int j = 0; (((j < trace.size())&&(__CLR4_4_18t28t2ldni83ym.R.iget(11559)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11560)==0&false)); j++) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11561);frames.add(trace.get(j));
            }
        }}
        }__CLR4_4_18t28t2ldni83ym.R.inc(11562);return frames.toArray(new String[frames.size()]);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Removes common frames from the cause trace given the two stack traces.</p>
     *
     * @param causeFrames  stack trace of a cause throwable
     * @param wrapperFrames  stack trace of a wrapper throwable
     * @throws IllegalArgumentException if either argument is null
     * @since 2.0
     */
    public static void removeCommonFrames(final List<String> causeFrames, final List<String> wrapperFrames) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11563);
        __CLR4_4_18t28t2ldni83ym.R.inc(11564);if ((((causeFrames == null || wrapperFrames == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11565)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11566)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11567);throw new IllegalArgumentException("The List must not be null");
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11568);int causeFrameIndex = causeFrames.size() - 1;
        __CLR4_4_18t28t2ldni83ym.R.inc(11569);int wrapperFrameIndex = wrapperFrames.size() - 1;
        __CLR4_4_18t28t2ldni83ym.R.inc(11570);while ((((causeFrameIndex >= 0 && wrapperFrameIndex >= 0)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11571)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11572)==0&false))) {{
            // Remove the frame from the cause trace if it is the same
            // as in the wrapper trace
            __CLR4_4_18t28t2ldni83ym.R.inc(11573);final String causeFrame = causeFrames.get(causeFrameIndex);
            __CLR4_4_18t28t2ldni83ym.R.inc(11574);final String wrapperFrame = wrapperFrames.get(wrapperFrameIndex);
            __CLR4_4_18t28t2ldni83ym.R.inc(11575);if ((((causeFrame.equals(wrapperFrame))&&(__CLR4_4_18t28t2ldni83ym.R.iget(11576)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11577)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11578);causeFrames.remove(causeFrameIndex);
            }
            }__CLR4_4_18t28t2ldni83ym.R.inc(11579);causeFrameIndex--;
            __CLR4_4_18t28t2ldni83ym.R.inc(11580);wrapperFrameIndex--;
        }
    }}finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets the stack trace from a Throwable as a String.</p>
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
     *
     * @param throwable  the <code>Throwable</code> to be examined
     * @return the stack trace as generated by the exception's
     *  <code>printStackTrace(PrintWriter)</code> method
     */
    public static String getStackTrace(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11581);
        __CLR4_4_18t28t2ldni83ym.R.inc(11582);final StringWriter sw = new StringWriter();
        __CLR4_4_18t28t2ldni83ym.R.inc(11583);final PrintWriter pw = new PrintWriter(sw, true);
        __CLR4_4_18t28t2ldni83ym.R.inc(11584);throwable.printStackTrace(pw);
        __CLR4_4_18t28t2ldni83ym.R.inc(11585);return sw.getBuffer().toString();
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Captures the stack trace associated with the specified
     * <code>Throwable</code> object, decomposing it into a list of
     * stack frames.</p>
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
     *
     * @param throwable  the <code>Throwable</code> to examine, may be null
     * @return an array of strings describing each stack frame, never null
     */
    public static String[] getStackFrames(final Throwable throwable) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11586);
        __CLR4_4_18t28t2ldni83ym.R.inc(11587);if ((((throwable == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11588)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11589)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11590);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11591);return getStackFrames(getStackTrace(throwable));
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns an array where each element is a line from the argument.</p>
     *
     * <p>The end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.</p>
     *
     * @param stackTrace  a stack trace String
     * @return an array where each element is a line from the argument
     */
    static String[] getStackFrames(final String stackTrace) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11592);
        __CLR4_4_18t28t2ldni83ym.R.inc(11593);final String linebreak = SystemUtils.LINE_SEPARATOR;
        __CLR4_4_18t28t2ldni83ym.R.inc(11594);final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak);
        __CLR4_4_18t28t2ldni83ym.R.inc(11595);final List<String> list = new ArrayList<String>();
        __CLR4_4_18t28t2ldni83ym.R.inc(11596);while ((((frames.hasMoreTokens())&&(__CLR4_4_18t28t2ldni83ym.R.iget(11597)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11598)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11599);list.add(frames.nextToken());
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11600);return list.toArray(new String[list.size()]);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    /**
     * <p>Produces a <code>List</code> of stack frames - the message
     * is not included. Only the trace of the specified exception is
     * returned, any caused by trace is stripped.</p>
     *
     * <p>This works in most cases - it will only fail if the exception
     * message contains a line that starts with:
     * <code>&quot;&nbsp;&nbsp;&nbsp;at&quot;.</code></p>
     * 
     * @param t is any throwable
     * @return List of stack frames
     */
    static List<String> getStackFrameList(final Throwable t) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11601);
        __CLR4_4_18t28t2ldni83ym.R.inc(11602);final String stackTrace = getStackTrace(t);
        __CLR4_4_18t28t2ldni83ym.R.inc(11603);final String linebreak = SystemUtils.LINE_SEPARATOR;
        __CLR4_4_18t28t2ldni83ym.R.inc(11604);final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak);
        __CLR4_4_18t28t2ldni83ym.R.inc(11605);final List<String> list = new ArrayList<String>();
        __CLR4_4_18t28t2ldni83ym.R.inc(11606);boolean traceStarted = false;
        __CLR4_4_18t28t2ldni83ym.R.inc(11607);while ((((frames.hasMoreTokens())&&(__CLR4_4_18t28t2ldni83ym.R.iget(11608)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11609)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11610);final String token = frames.nextToken();
            // Determine if the line starts with <whitespace>at
            __CLR4_4_18t28t2ldni83ym.R.inc(11611);final int at = token.indexOf("at");
            __CLR4_4_18t28t2ldni83ym.R.inc(11612);if ((((at != -1 && token.substring(0, at).trim().isEmpty())&&(__CLR4_4_18t28t2ldni83ym.R.iget(11613)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11614)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11615);traceStarted = true;
                __CLR4_4_18t28t2ldni83ym.R.inc(11616);list.add(token);
            } }else {__CLR4_4_18t28t2ldni83ym.R.inc(11617);if ((((traceStarted)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11618)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11619)==0&false))) {{
                __CLR4_4_18t28t2ldni83ym.R.inc(11620);break;
            }
        }}}
        }__CLR4_4_18t28t2ldni83ym.R.inc(11621);return list;
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a short message summarising the exception.
     * <p>
     * The message returned is of the form
     * {ClassNameWithoutPackage}: {ThrowableMessage}
     *
     * @param th  the throwable to get a message for, null returns empty string
     * @return the message, non-null
     * @since Commons Lang 2.2
     */
    public static String getMessage(final Throwable th) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11622);
        __CLR4_4_18t28t2ldni83ym.R.inc(11623);if ((((th == null)&&(__CLR4_4_18t28t2ldni83ym.R.iget(11624)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11625)==0&false))) {{
            __CLR4_4_18t28t2ldni83ym.R.inc(11626);return "";
        }
        }__CLR4_4_18t28t2ldni83ym.R.inc(11627);final String clsName = ClassUtils.getShortClassName(th, null);
        __CLR4_4_18t28t2ldni83ym.R.inc(11628);final String msg = th.getMessage();
        __CLR4_4_18t28t2ldni83ym.R.inc(11629);return clsName + ": " + StringUtils.defaultString(msg);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a short message summarising the root cause exception.
     * <p>
     * The message returned is of the form
     * {ClassNameWithoutPackage}: {ThrowableMessage}
     *
     * @param th  the throwable to get a message for, null returns empty string
     * @return the message, non-null
     * @since Commons Lang 2.2
     */
    public static String getRootCauseMessage(final Throwable th) {try{__CLR4_4_18t28t2ldni83ym.R.inc(11630);
        __CLR4_4_18t28t2ldni83ym.R.inc(11631);Throwable root = ExceptionUtils.getRootCause(th);
        __CLR4_4_18t28t2ldni83ym.R.inc(11632);root = (((root == null )&&(__CLR4_4_18t28t2ldni83ym.R.iget(11633)!=0|true))||(__CLR4_4_18t28t2ldni83ym.R.iget(11634)==0&false))? th : root;
        __CLR4_4_18t28t2ldni83ym.R.inc(11635);return getMessage(root);
    }finally{__CLR4_4_18t28t2ldni83ym.R.flushNeeded();}}

}
