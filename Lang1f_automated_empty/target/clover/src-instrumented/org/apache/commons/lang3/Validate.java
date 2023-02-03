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
package org.apache.commons.lang3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * <p>This class assists in validating arguments. The validation methods are
 * based along the following principles:
 * <ul>
 *   <li>An invalid {@code null} argument causes a {@link NullPointerException}.</li>
 *   <li>A non-{@code null} argument causes an {@link IllegalArgumentException}.</li>
 *   <li>An invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.</li>
 * </ul>
 *
 * <p>All exceptions messages are
 * <a href="http://docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html#syntax">format strings</a>
 * as defined by the Java platform. For example:</p>
 *
 * <pre>
 * Validate.isTrue(i > 0, "The value must be greater than zero: %d", i);
 * Validate.notNull(surname, "The surname must not be %s", null);
 * </pre>
 *
 * <p>#ThreadSafe#</p>
 * @version $Id$
 * @see java.lang.String#format(String, Object...)
 * @since 2.0
 */
public class Validate {public static class __CLR4_4_16cf6cfldnigfq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,8431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE =
        "The value %s is not in the specified exclusive range of %s to %s";
    private static final String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE =
        "The value %s is not in the specified inclusive range of %s to %s";
    private static final String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
    private static final String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
    private static final String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE =
        "The validated array contains null element at index: %d";
    private static final String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE =
        "The validated collection contains null element at index: %d";
    private static final String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
    private static final String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
    private static final String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE =
        "The validated character sequence is empty";
    private static final String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
    private static final String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
    private static final String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE =
        "The validated character sequence index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE =
        "The validated collection index is invalid: %d";
    private static final String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";
    private static final String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
    private static final String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";

    /**
     * Constructor. This class should not normally be instantiated.
     */
    public Validate() {
      super();__CLR4_4_16cf6cfldnigfq3.R.inc(8224);try{__CLR4_4_16cf6cfldnigfq3.R.inc(8223);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // isTrue
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.isTrue(i > 0.0, "The value must be greater than zero: %d", i);</pre>
     *
     * <p>For performance reasons, the long value is passed as a separate parameter and
     * appended to the exception message only in the case of an error.</p>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param value  the value to append to the message when invalid
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, double)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression, final String message, final long value) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8225);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8226);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8227)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8228)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8229);throw new IllegalArgumentException(String.format(message, Long.valueOf(value)));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.isTrue(d > 0.0, "The value must be greater than zero: %s", d);</pre>
     *
     * <p>For performance reasons, the double value is passed as a separate parameter and
     * appended to the exception message only in the case of an error.</p>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param value  the value to append to the message when invalid
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression, final String message, final double value) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8230);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8231);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8232)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8233)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8234);throw new IllegalArgumentException(String.format(message, Double.valueOf(value)));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.isTrue(i >= min && i <= max, "The value must be between %d and %d", min, max);
     * Validate.isTrue(myObject.isOk(), "The object is not okay");</pre>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, double)
     */
    public static void isTrue(final boolean expression, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8235);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8236);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8237)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8238)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8239);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception. This method is useful when validating according
     * to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.isTrue(i > 0);
     * Validate.isTrue(myObject.isOk());</pre>
     *
     * <p>The message of the exception is &quot;The validated expression is
     * false&quot;.</p>
     *
     * @param expression  the boolean expression to check
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, double)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8240);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8241);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8242)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8243)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8244);throw new IllegalArgumentException(DEFAULT_IS_TRUE_EX_MESSAGE);
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notNull
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument is not {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * <p>The message of the exception is &quot;The validated object is
     * null&quot;.</p>
     *
     * @param <T> the object type
     * @param object  the object to check
     * @return the validated object (never {@code null} for method chaining)
     * @throws NullPointerException if the object is {@code null}
     * @see #notNull(Object, String, Object...)
     */
    public static <T> T notNull(final T object) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8245);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8246);return notNull(object, DEFAULT_IS_NULL_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument is not {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * @param <T> the object type
     * @param object  the object to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message
     * @return the validated object (never {@code null} for method chaining)
     * @throws NullPointerException if the object is {@code null}
     * @see #notNull(Object)
     */
    public static <T> T notNull(final T object, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8247);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8248);if ((((object == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8249)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8250)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8251);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8252);return object;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notEmpty array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument array is neither {@code null}
     * nor a length of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myArray, "The array must not be empty");</pre>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if the array is empty
     * @see #notEmpty(Object[])
     */
    public static <T> T[] notEmpty(final T[] array, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8253);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8254);if ((((array == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8255)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8256)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8257);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8258);if ((((array.length == 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8259)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8260)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8261);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8262);return array;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument array is neither {@code null}
     * nor a length of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myArray);</pre>
     *
     * <p>The message in the exception is &quot;The validated array is
     * empty&quot;.
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if the array is empty
     * @see #notEmpty(Object[], String, Object...)
     */
    public static <T> T[] notEmpty(final T[] array) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8263);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8264);return notEmpty(array, DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notEmpty collection
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument collection is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myCollection, "The collection must not be empty");</pre>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated collection (never {@code null} method for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IllegalArgumentException if the collection is empty
     * @see #notEmpty(Object[])
     */
    public static <T extends Collection<?>> T notEmpty(final T collection, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8265);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8266);if ((((collection == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8267)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8268)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8269);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8270);if ((((collection.isEmpty())&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8271)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8272)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8273);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8274);return collection;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument collection is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myCollection);</pre>
     *
     * <p>The message in the exception is &quot;The validated collection is
     * empty&quot;.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @return the validated collection (never {@code null} method for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IllegalArgumentException if the collection is empty
     * @see #notEmpty(Collection, String, Object...)
     */
    public static <T extends Collection<?>> T notEmpty(final T collection) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8275);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8276);return notEmpty(collection, DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notEmpty map
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument map is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myMap, "The map must not be empty");</pre>
     *
     * @param <T> the map type
     * @param map  the map to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated map (never {@code null} method for chaining)
     * @throws NullPointerException if the map is {@code null}
     * @throws IllegalArgumentException if the map is empty
     * @see #notEmpty(Object[])
     */
    public static <T extends Map<?, ?>> T notEmpty(final T map, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8277);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8278);if ((((map == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8279)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8280)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8281);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8282);if ((((map.isEmpty())&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8283)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8284)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8285);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8286);return map;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument map is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myMap);</pre>
     *
     * <p>The message in the exception is &quot;The validated map is
     * empty&quot;.</p>
     *
     * @param <T> the map type
     * @param map  the map to check, validated not null by this method
     * @return the validated map (never {@code null} method for chaining)
     * @throws NullPointerException if the map is {@code null}
     * @throws IllegalArgumentException if the map is empty
     * @see #notEmpty(Map, String, Object...)
     */
    public static <T extends Map<?, ?>> T notEmpty(final T map) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8287);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8288);return notEmpty(map, DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notEmpty string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null} nor a length of zero (no characters);
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notEmpty(myString, "The string must not be empty");</pre>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is empty
     * @see #notEmpty(CharSequence)
     */
    public static <T extends CharSequence> T notEmpty(final T chars, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8289);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8290);if ((((chars == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8291)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8292)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8293);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8294);if ((((chars.length() == 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8295)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8296)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8297);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8298);return chars;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null} nor a length of zero (no characters);
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notEmpty(myString);</pre>
     *
     * <p>The message in the exception is &quot;The validated
     * character sequence is empty&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is empty
     * @see #notEmpty(CharSequence, String, Object...)
     */
    public static <T extends CharSequence> T notEmpty(final T chars) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8299);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8300);return notEmpty(chars, DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // notBlank string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null}, a length of zero (no characters), empty
     * nor whitespace; otherwise throwing an exception with the specified
     * message.
     *
     * <pre>Validate.notBlank(myString, "The string must not be blank");</pre>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is blank
     * @see #notBlank(CharSequence)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T notBlank(final T chars, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8301);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8302);if ((((chars == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8303)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8304)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8305);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8306);if ((((StringUtils.isBlank(chars))&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8307)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8308)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8309);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8310);return chars;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null}, a length of zero (no characters), empty
     * nor whitespace; otherwise throwing an exception.
     *
     * <pre>Validate.notBlank(myString);</pre>
     *
     * <p>The message in the exception is &quot;The validated character
     * sequence is blank&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is blank
     * @see #notBlank(CharSequence, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T notBlank(final T chars) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8311);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8312);return notBlank(chars, DEFAULT_NOT_BLANK_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // noNullElements array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument array is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.noNullElements(myArray, "The array contain null at position %d");</pre>
     *
     * <p>If the array is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the iteration
     * index of the invalid element is appended to the {@code values}
     * argument.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Object[])
     */
    public static <T> T[] noNullElements(final T[] array, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8313);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8314);Validate.notNull(array);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8315);for (int i = 0; (((i < array.length)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8316)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8317)==0&false)); i++) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8318);if ((((array[i] == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8319)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8320)==0&false))) {{
                __CLR4_4_16cf6cfldnigfq3.R.inc(8321);final Object[] values2 = ArrayUtils.add(values, Integer.valueOf(i));
                __CLR4_4_16cf6cfldnigfq3.R.inc(8322);throw new IllegalArgumentException(String.format(message, values2));
            }
        }}
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8323);return array;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument array is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.noNullElements(myArray);</pre>
     *
     * <p>If the array is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the message in the
     * exception is &quot;The validated array contains null element at index:
     * &quot followed by the index.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Object[], String, Object...)
     */
    public static <T> T[] noNullElements(final T[] array) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8324);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8325);return noNullElements(array, DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // noNullElements iterable
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument iterable is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.noNullElements(myCollection, "The collection contains null at position %d");</pre>
     *
     * <p>If the iterable is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the iterable has a {@code null} element, then the iteration
     * index of the invalid element is appended to the {@code values}
     * argument.</p>
     *
     * @param <T> the iterable type
     * @param iterable  the iterable to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated iterable (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Iterable)
     */
    public static <T extends Iterable<?>> T noNullElements(final T iterable, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8326);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8327);Validate.notNull(iterable);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8328);int i = 0;
        __CLR4_4_16cf6cfldnigfq3.R.inc(8329);for (final Iterator<?> it = iterable.iterator(); (((it.hasNext())&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8330)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8331)==0&false)); i++) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8332);if ((((it.next() == null)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8333)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8334)==0&false))) {{
                __CLR4_4_16cf6cfldnigfq3.R.inc(8335);final Object[] values2 = ArrayUtils.addAll(values, Integer.valueOf(i));
                __CLR4_4_16cf6cfldnigfq3.R.inc(8336);throw new IllegalArgumentException(String.format(message, values2));
            }
        }}
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8337);return iterable;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument iterable is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.noNullElements(myCollection);</pre>
     *
     * <p>If the iterable is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the message in the
     * exception is &quot;The validated iterable contains null element at index:
     * &quot followed by the index.</p>
     *
     * @param <T> the iterable type
     * @param iterable  the iterable to check, validated not null by this method
     * @return the validated iterable (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Iterable, String, Object...)
     */
    public static <T extends Iterable<?>> T noNullElements(final T iterable) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8338);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8339);return noNullElements(iterable, DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE);
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // validIndex array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * array; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.validIndex(myArray, 2, "The array index is invalid: ");</pre>
     *
     * <p>If the array is {@code null}, then the message of the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} for method chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Object[], int)
     *
     * @since 3.0
     */
    public static <T> T[] validIndex(final T[] array, final int index, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8340);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8341);Validate.notNull(array);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8342);if ((((index < 0 || index >= array.length)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8343)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8344)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8345);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8346);return array;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * array; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myArray, 2);</pre>
     *
     * <p>If the array is {@code null}, then the message of the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the index is invalid, then the message of the exception is
     * &quot;The validated array index is invalid: &quot; followed by the
     * index.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param index  the index to check
     * @return the validated array (never {@code null} for method chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Object[], int, String, Object...)
     *
     * @since 3.0
     */
    public static <T> T[] validIndex(final T[] array, final int index) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8347);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8348);return validIndex(array, index, DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // validIndex collection
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * collection; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.validIndex(myCollection, 2, "The collection index is invalid: ");</pre>
     *
     * <p>If the collection is {@code null}, then the message of the
     * exception is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated collection (never {@code null} for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Collection, int)
     *
     * @since 3.0
     */
    public static <T extends Collection<?>> T validIndex(final T collection, final int index, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8349);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8350);Validate.notNull(collection);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8351);if ((((index < 0 || index >= collection.size())&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8352)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8353)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8354);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8355);return collection;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * collection; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myCollection, 2);</pre>
     *
     * <p>If the index is invalid, then the message of the exception
     * is &quot;The validated collection index is invalid: &quot;
     * followed by the index.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param index  the index to check
     * @return the validated collection (never {@code null} for method chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Collection, int, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends Collection<?>> T validIndex(final T collection, final int index) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8356);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8357);return validIndex(collection, index, DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // validIndex string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * character sequence; otherwise throwing an exception with the
     * specified message.</p>
     *
     * <pre>Validate.validIndex(myStr, 2, "The string index is invalid: ");</pre>
     *
     * <p>If the character sequence is {@code null}, then the message
     * of the exception is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} for method chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(CharSequence, int)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T validIndex(final T chars, final int index, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8358);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8359);Validate.notNull(chars);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8360);if ((((index < 0 || index >= chars.length())&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8361)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8362)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8363);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_4_16cf6cfldnigfq3.R.inc(8364);return chars;
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * character sequence; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myStr, 2);</pre>
     *
     * <p>If the character sequence is {@code null}, then the message
     * of the exception is &quot;The validated object is
     * null&quot;.</p>
     *
     * <p>If the index is invalid, then the message of the exception
     * is &quot;The validated character sequence index is invalid: &quot;
     * followed by the index.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param index  the index to check
     * @return the validated character sequence (never {@code null} for method chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(CharSequence, int, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T validIndex(final T chars, final int index) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8365);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8366);return validIndex(chars, index, DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // validState
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the stateful condition is {@code true}; otherwise
     * throwing an exception. This method is useful when validating according
     * to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.validState(field > 0);
     * Validate.validState(this.isOk());</pre>
     *
     * <p>The message of the exception is &quot;The validated state is
     * false&quot;.</p>
     *
     * @param expression  the boolean expression to check
     * @throws IllegalStateException if expression is {@code false}
     * @see #validState(boolean, String, Object...)
     *
     * @since 3.0
     */
    public static void validState(final boolean expression) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8367);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8368);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8369)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8370)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8371);throw new IllegalStateException(DEFAULT_VALID_STATE_EX_MESSAGE);
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the stateful condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.validState(this.isOk(), "The state is not OK: %s", myObject);</pre>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalStateException if expression is {@code false}
     * @see #validState(boolean)
     *
     * @since 3.0
     */
    public static void validState(final boolean expression, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8372);
        __CLR4_4_16cf6cfldnigfq3.R.inc(8373);if ((((expression == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8374)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8375)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8376);throw new IllegalStateException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // matchesPattern
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence matches the specified regular
     * expression pattern; otherwise throwing an exception.</p>
     *
     * <pre>Validate.matchesPattern("hi", "[a-z]*");</pre>
     *
     * <p>The syntax of the pattern is the one used in the {@link Pattern} class.</p>
     *
     * @param input  the character sequence to validate, not null
     * @param pattern  the regular expression pattern, not null
     * @throws IllegalArgumentException if the character sequence does not match the pattern
     * @see #matchesPattern(CharSequence, String, String, Object...)
     *
     * @since 3.0
     */
    public static void matchesPattern(final CharSequence input, final String pattern) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8377);
        // TODO when breaking BC, consider returning input
        __CLR4_4_16cf6cfldnigfq3.R.inc(8378);if ((((Pattern.matches(pattern, input) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8379)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8380)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8381);throw new IllegalArgumentException(String.format(DEFAULT_MATCHES_PATTERN_EX, input, pattern));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence matches the specified regular
     * expression pattern; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.matchesPattern("hi", "[a-z]*", "%s does not match %s", "hi" "[a-z]*");</pre>
     *
     * <p>The syntax of the pattern is the one used in the {@link Pattern} class.</p>
     *
     * @param input  the character sequence to validate, not null
     * @param pattern  the regular expression pattern, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the character sequence does not match the pattern
     * @see #matchesPattern(CharSequence, String)
     *
     * @since 3.0
     */
    public static void matchesPattern(final CharSequence input, final String pattern, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8382);
        // TODO when breaking BC, consider returning input
        __CLR4_4_16cf6cfldnigfq3.R.inc(8383);if ((((Pattern.matches(pattern, input) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8384)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8385)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8386);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // inclusiveBetween
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument object fall between the two
     * inclusive values specified; otherwise, throws an exception.</p>
     *
     * <pre>Validate.inclusiveBetween(0, 2, 1);</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the inclusive start value, not null
     * @param end  the inclusive end value, not null
     * @param value  the object to validate, not null
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #inclusiveBetween(Object, Object, Comparable, String, Object...)
     *
     * @since 3.0
     */
    public static <T> void inclusiveBetween(final T start, final T end, final Comparable<T> value) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8387);
        // TODO when breaking BC, consider returning value
        __CLR4_4_16cf6cfldnigfq3.R.inc(8388);if ((((value.compareTo(start) < 0 || value.compareTo(end) > 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8389)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8390)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8391);throw new IllegalArgumentException(String.format(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument object fall between the two
     * inclusive values specified; otherwise, throws an exception with the
     * specified message.</p>
     *
     * <pre>Validate.inclusiveBetween(0, 2, 1, "Not in boundaries");</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the inclusive start value, not null
     * @param end  the inclusive end value, not null
     * @param value  the object to validate, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #inclusiveBetween(Object, Object, Comparable)
     *
     * @since 3.0
     */
    public static <T> void inclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8392);
        // TODO when breaking BC, consider returning value
        __CLR4_4_16cf6cfldnigfq3.R.inc(8393);if ((((value.compareTo(start) < 0 || value.compareTo(end) > 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8394)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8395)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8396);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // exclusiveBetween
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument object fall between the two
     * exclusive values specified; otherwise, throws an exception.</p>
     *
     * <pre>Validate.exclusiveBetween(0, 2, 1);</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the exclusive start value, not null
     * @param end  the exclusive end value, not null
     * @param value  the object to validate, not null
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #exclusiveBetween(Object, Object, Comparable, String, Object...)
     *
     * @since 3.0
     */
    public static <T> void exclusiveBetween(final T start, final T end, final Comparable<T> value) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8397);
        // TODO when breaking BC, consider returning value
        __CLR4_4_16cf6cfldnigfq3.R.inc(8398);if ((((value.compareTo(start) <= 0 || value.compareTo(end) >= 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8399)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8400)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8401);throw new IllegalArgumentException(String.format(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument object fall between the two
     * exclusive values specified; otherwise, throws an exception with the
     * specified message.</p>
     *
     * <pre>Validate.exclusiveBetween(0, 2, 1, "Not in boundaries");</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the exclusive start value, not null
     * @param end  the exclusive end value, not null
     * @param value  the object to validate, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #exclusiveBetween(Object, Object, Comparable)
     *
     * @since 3.0
     */
    public static <T> void exclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8402);
        // TODO when breaking BC, consider returning value
        __CLR4_4_16cf6cfldnigfq3.R.inc(8403);if ((((value.compareTo(start) <= 0 || value.compareTo(end) >= 0)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8404)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8405)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8406);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // isInstanceOf
    //---------------------------------------------------------------------------------

    /**
     * Validates that the argument is an instance of the specified class, if not throws an exception.
     *  
     * <p>This method is useful when validating according to an arbitrary class</p>
     *
     * <pre>Validate.isInstanceOf(OkClass.class, object);</pre>
     *
     * <p>The message of the exception is &quot;Expected type: {type}, actual: {obj_type}&quot;</p>
     *
     * @param type  the class the object must be validated against, not null
     * @param obj  the object to check, null throws an exception
     * @throws IllegalArgumentException if argument is not of specified class
     * @see #isInstanceOf(Class, Object, String, Object...)
     *
     * @since 3.0
     */
    public static void isInstanceOf(final Class<?> type, final Object obj) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8407);
        // TODO when breaking BC, consider returning obj
        __CLR4_4_16cf6cfldnigfq3.R.inc(8408);if ((((type.isInstance(obj) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8409)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8410)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8411);throw new IllegalArgumentException(String.format(DEFAULT_IS_INSTANCE_OF_EX_MESSAGE, type.getName(),
                    (((obj == null )&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8412)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8413)==0&false))? "null" : obj.getClass().getName()));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * <p>Validate that the argument is an instance of the specified class; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary class</p>
     *
     * <pre>Validate.isInstanceOf(OkClass.classs, object, "Wrong class, object is of class %s",
     *   object.getClass().getName());</pre>
     *
     * @param type  the class the object must be validated against, not null
     * @param obj  the object to check, null throws an exception
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if argument is not of specified class
     * @see #isInstanceOf(Class, Object)
     *
     * @since 3.0
     */
    public static void isInstanceOf(final Class<?> type, final Object obj, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8414);
        // TODO when breaking BC, consider returning obj
        __CLR4_4_16cf6cfldnigfq3.R.inc(8415);if ((((type.isInstance(obj) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8416)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8417)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8418);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    // isAssignableFrom
    //---------------------------------------------------------------------------------

    /**
     * Validates that the argument can be converted to the specified class, if not, throws an exception.
     * 
     * <p>This method is useful when validating that there will be no casting errors.</p>
     *
     * <pre>Validate.isAssignableFrom(SuperClass.class, object.getClass());</pre>
     *
     * <p>The message format of the exception is &quot;Cannot assign {type} to {superType}&quot;</p>
     *
     * @param superType  the class the class must be validated against, not null
     * @param type  the class to check, not null
     * @throws IllegalArgumentException if type argument is not assignable to the specified superType
     * @see #isAssignableFrom(Class, Class, String, Object...)
     *
     * @since 3.0
     */
    public static void isAssignableFrom(final Class<?> superType, final Class<?> type) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8419);
        // TODO when breaking BC, consider returning type
        __CLR4_4_16cf6cfldnigfq3.R.inc(8420);if ((((superType.isAssignableFrom(type) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8421)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8422)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8423);throw new IllegalArgumentException(String.format(DEFAULT_IS_ASSIGNABLE_EX_MESSAGE, (((type == null )&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8424)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8425)==0&false))? "null" : type.getName(),
                    superType.getName()));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}

    /**
     * Validates that the argument can be converted to the specified class, if not throws an exception.
     *  
     * <p>This method is useful when validating if there will be no casting errors.</p>
     *
     * <pre>Validate.isAssignableFrom(SuperClass.class, object.getClass());</pre>
     *
     * <p>The message of the exception is &quot;The validated object can not be converted to the&quot;
     * followed by the name of the class and &quot;class&quot;</p>
     *
     * @param superType  the class the class must be validated against, not null
     * @param type  the class to check, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if argument can not be converted to the specified class
     * @see #isAssignableFrom(Class, Class)
     */
    public static void isAssignableFrom(final Class<?> superType, final Class<?> type, final String message, final Object... values) {try{__CLR4_4_16cf6cfldnigfq3.R.inc(8426);
        // TODO when breaking BC, consider returning type
        __CLR4_4_16cf6cfldnigfq3.R.inc(8427);if ((((superType.isAssignableFrom(type) == false)&&(__CLR4_4_16cf6cfldnigfq3.R.iget(8428)!=0|true))||(__CLR4_4_16cf6cfldnigfq3.R.iget(8429)==0&false))) {{
            __CLR4_4_16cf6cfldnigfq3.R.inc(8430);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_4_16cf6cfldnigfq3.R.flushNeeded();}}
}
