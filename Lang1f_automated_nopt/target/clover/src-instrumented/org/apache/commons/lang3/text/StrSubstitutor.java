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
package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Substitutes variables within a string by values.
 * <p>
 * This class takes a piece of text and substitutes all the variables within it.
 * The default definition of a variable is <code>${variableName}</code>.
 * The prefix and suffix can be changed via constructors and set methods.
 * <p>
 * Variable values are typically resolved from a map, but could also be resolved
 * from system properties, or by supplying a custom variable resolver.
 * <p>
 * The simplest example is to use this class to replace Java System properties. For example:
 * <pre>
 * StrSubstitutor.replaceSystemProperties(
 *      "You are running with java.version = ${java.version} and os.name = ${os.name}.");
 * </pre>
 * <p>
 * Typical usage of this class follows the following pattern: First an instance is created
 * and initialized with the map that contains the values for the available variables.
 * If a prefix and/or suffix for variables should be used other than the default ones,
 * the appropriate settings can be performed. After that the <code>replace()</code>
 * method can be called passing in the source text for interpolation. In the returned
 * text all variable references (as long as their values are known) will be resolved.
 * The following example demonstrates this:
 * <pre>
 * Map valuesMap = HashMap();
 * valuesMap.put(&quot;animal&quot;, &quot;quick brown fox&quot;);
 * valuesMap.put(&quot;target&quot;, &quot;lazy dog&quot;);
 * String templateString = &quot;The ${animal} jumped over the ${target}.&quot;;
 * StrSubstitutor sub = new StrSubstitutor(valuesMap);
 * String resolvedString = sub.replace(templateString);
 * </pre>
 * yielding:
 * <pre>
 *      The quick brown fox jumped over the lazy dog.
 * </pre>
 * <p>
 * In addition to this usage pattern there are some static convenience methods that
 * cover the most common use cases. These methods can be used without the need of
 * manually creating an instance. However if multiple replace operations are to be
 * performed, creating and reusing an instance of this class will be more efficient.
 * <p>
 * Variable replacement works in a recursive way. Thus, if a variable value contains
 * a variable then that variable will also be replaced. Cyclic replacements are
 * detected and will cause an exception to be thrown.
 * <p>
 * Sometimes the interpolation's result must contain a variable prefix. As an example
 * take the following source text:
 * <pre>
 *   The variable ${${name}} must be used.
 * </pre>
 * Here only the variable's name referred to in the text should be replaced resulting
 * in the text (assuming that the value of the <code>name</code> variable is <code>x</code>):
 * <pre>
 *   The variable ${x} must be used.
 * </pre>
 * To achieve this effect there are two possibilities: Either set a different prefix
 * and suffix for variables which do not conflict with the result text you want to
 * produce. The other possibility is to use the escape character, by default '$'.
 * If this character is placed before a variable reference, this reference is ignored
 * and won't be replaced. For example:
 * <pre>
 *   The variable $${${name}} must be used.
 * </pre>
 * <p>
 * In some complex scenarios you might even want to perform substitution in the
 * names of variables, for instance
 * <pre>
 * ${jre-${java.specification.version}}
 * </pre>
 * <code>StrSubstitutor</code> supports this recursive substitution in variable
 * names, but it has to be enabled explicitly by setting the
 * {@link #setEnableSubstitutionInVariables(boolean) enableSubstitutionInVariables}
 * property to <b>true</b>.
 *
 * @version $Id$
 * @since 2.2
 */
public class StrSubstitutor {public static class __CLR4_4_1cdxcdxldni84ah{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,16386,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant for the default escape character.
     */
    public static final char DEFAULT_ESCAPE = '$';
    /**
     * Constant for the default variable prefix.
     */
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    /**
     * Constant for the default variable suffix.
     */
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");

    /**
     * Stores the escape character.
     */
    private char escapeChar;
    /**
     * Stores the variable prefix.
     */
    private StrMatcher prefixMatcher;
    /**
     * Stores the variable suffix.
     */
    private StrMatcher suffixMatcher;
    /**
     * Variable resolution is delegated to an implementor of VariableResolver.
     */
    private StrLookup<?> variableResolver;
    /**
     * The flag whether substitution in variable names is enabled.
     */
    private boolean enableSubstitutionInVariables;

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map.
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @return the result of the replace operation
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16053);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16054);return new StrSubstitutor(valueMap).replace(source);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map. This method allows to specifiy a
     * custom variable prefix and suffix
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @param prefix  the prefix of variables, not null
     * @param suffix  the suffix of variables, not null
     * @return the result of the replace operation
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap, final String prefix, final String suffix) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16055);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16056);return new StrSubstitutor(valueMap, prefix, suffix).replace(source);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with their matching
     * values from the properties.
     *
     * @param source the source text containing the variables to substitute, null returns null
     * @param valueProperties the properties with values, may be null
     * @return the result of the replace operation
     */
    public static String replace(final Object source, final Properties valueProperties) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16057);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16058);if ((((valueProperties == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16059)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16060)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16061);return source.toString();
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16062);final Map<String,String> valueMap = new HashMap<String,String>();
        __CLR4_4_1cdxcdxldni84ah.R.inc(16063);final Enumeration<?> propNames = valueProperties.propertyNames();
        __CLR4_4_1cdxcdxldni84ah.R.inc(16064);while ((((propNames.hasMoreElements())&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16065)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16066)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16067);final String propName = (String)propNames.nextElement();
            __CLR4_4_1cdxcdxldni84ah.R.inc(16068);final String propValue = valueProperties.getProperty(propName);
            __CLR4_4_1cdxcdxldni84ah.R.inc(16069);valueMap.put(propName, propValue);
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16070);return StrSubstitutor.replace(source, valueMap);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the system properties.
     *
     * @param source  the source text containing the variables to substitute, null returns null
     * @return the result of the replace operation
     */
    public static String replaceSystemProperties(final Object source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16071);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16072);return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(source);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance with defaults for variable prefix and suffix
     * and the escaping character.
     */
    public StrSubstitutor() {
        this((StrLookup<?>) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_4_1cdxcdxldni84ah.R.inc(16074);try{__CLR4_4_1cdxcdxldni84ah.R.inc(16073);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses defaults for variable
     * prefix and suffix and the escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap) {
        this(StrLookup.mapLookup(valueMap), DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_4_1cdxcdxldni84ah.R.inc(16076);try{__CLR4_4_1cdxcdxldni84ah.R.inc(16075);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses a default escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, DEFAULT_ESCAPE);__CLR4_4_1cdxcdxldni84ah.R.inc(16078);try{__CLR4_4_1cdxcdxldni84ah.R.inc(16077);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix, final char escape) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, escape);__CLR4_4_1cdxcdxldni84ah.R.inc(16080);try{__CLR4_4_1cdxcdxldni84ah.R.inc(16079);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver) {
        this(variableResolver, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_4_1cdxcdxldni84ah.R.inc(16082);try{__CLR4_4_1cdxcdxldni84ah.R.inc(16081);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver, final String prefix, final String suffix, final char escape) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16083);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16084);this.setVariableResolver(variableResolver);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16085);this.setVariablePrefix(prefix);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16086);this.setVariableSuffix(suffix);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16087);this.setEscapeChar(escape);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefixMatcher  the prefix for variables, not null
     * @param suffixMatcher  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(
            final StrLookup<?> variableResolver, final StrMatcher prefixMatcher, final StrMatcher suffixMatcher, final char escape) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16088);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16089);this.setVariableResolver(variableResolver);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16090);this.setVariablePrefixMatcher(prefixMatcher);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16091);this.setVariableSuffixMatcher(suffixMatcher);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16092);this.setEscapeChar(escape);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     *
     * @param source  the string to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final String source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16093);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16094);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16095)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16096)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16097);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16098);final StrBuilder buf = new StrBuilder(source);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16099);if ((((substitute(buf, 0, source.length()) == false)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16100)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16101)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16102);return source;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16103);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     * <p>
     * Only the specified portion of the string will be processed.
     * The rest of the string is not processed, and is not returned.
     *
     * @param source  the string to replace in, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final String source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16104);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16105);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16106)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16107)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16108);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16109);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16110);if ((((substitute(buf, 0, length) == false)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16111)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16112)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16113);return source.substring(offset, offset + length);
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16114);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @return the result of the replace operation
     */
    public String replace(final char[] source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16115);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16116);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16117)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16118)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16119);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16120);final StrBuilder buf = new StrBuilder(source.length).append(source);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16121);substitute(buf, 0, source.length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16122);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     * <p>
     * Only the specified portion of the array will be processed.
     * The rest of the array is not processed, and is not returned.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final char[] source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16123);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16124);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16125)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16126)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16127);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16128);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16129);substitute(buf, 0, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16130);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16131);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16132);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16133)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16134)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16135);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16136);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16137);substitute(buf, 0, buf.length());
        __CLR4_4_1cdxcdxldni84ah.R.inc(16138);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, and is not returned.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16139);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16140);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16141)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16142)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16143);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16144);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16145);substitute(buf, 0, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16146);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}
    
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source as a template.
     * The source is not altered by this method.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @return the result of the replace operation
     * @since 3.2
     */
    public String replace(CharSequence source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16147);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16148);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16149)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16150)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16151);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16152);return replace(source, 0, source.length());
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source as a template.
     * The source is not altered by this method.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, and is not returned.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     * @since 3.2
     */
    public String replace(CharSequence source, int offset, int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16153);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16154);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16155)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16156)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16157);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16158);StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16159);substitute(buf, 0, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16160);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16161);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16162);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16163)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16164)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16165);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16166);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16167);substitute(buf, 0, buf.length());
        __CLR4_4_1cdxcdxldni84ah.R.inc(16168);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, and is not returned.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16169);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16170);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16171)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16172)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16173);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16174);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16175);substitute(buf, 0, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16176);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the resolver. The input source object is
     * converted to a string using <code>toString</code> and is not altered.
     *
     * @param source  the source to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final Object source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16177);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16178);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16179)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16180)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16181);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16182);final StrBuilder buf = new StrBuilder().append(source);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16183);substitute(buf, 0, buf.length());
        __CLR4_4_1cdxcdxldni84ah.R.inc(16184);return buf.toString();
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16185);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16186);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16187)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16188)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16189);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16190);return replaceIn(source, 0, source.length());
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, but it is not deleted.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the buffer to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16191);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16192);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16193)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16194)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16195);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16196);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16197);if ((((substitute(buf, 0, length) == false)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16198)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16199)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16200);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16201);source.replace(offset, offset + length, buf.toString());
        __CLR4_4_1cdxcdxldni84ah.R.inc(16202);return true;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

  //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @return true if altered
     * @since 3.2
     */
    public boolean replaceIn(StringBuilder source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16203);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16204);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16205)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16206)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16207);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16208);return replaceIn(source, 0, source.length());
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source builder
     * with their matching values from the resolver.
     * The builder is updated with the result.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, but it is not deleted.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the buffer to be processed, must be valid
     * @return true if altered
     * @since 3.2
     */
    public boolean replaceIn(StringBuilder source, int offset, int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16209);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16210);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16211)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16212)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16213);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16214);StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16215);if ((((substitute(buf, 0, length) == false)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16216)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16217)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16218);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16219);source.replace(offset, offset + length, buf.toString());
        __CLR4_4_1cdxcdxldni84ah.R.inc(16220);return true;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     *
     * @param source  the builder to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16221);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16222);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16223)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16224)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16225);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16226);return substitute(source, 0, source.length());
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, but it is not deleted.
     *
     * @param source  the builder to replace in, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16227);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16228);if ((((source == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16229)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16230)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16231);return false;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16232);return substitute(source, offset, length);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method that substitutes the variables.
     * <p>
     * Most users of this class do not need to call this method. This method will
     * be called automatically by another (public) method.
     * <p>
     * Writers of subclasses can override this method if they need access to
     * the substitution process at the start or end.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    protected boolean substitute(final StrBuilder buf, final int offset, final int length) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16233);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16234);return substitute(buf, offset, length, null) > 0;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Recursive handler for multiple levels of interpolation. This is the main
     * interpolation method, which resolves the values of all variable references
     * contained in the passed in text.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @param priorVariables  the stack keeping track of the replaced variables, may be null
     * @return the length change that occurs, unless priorVariables is null when the int
     *  represents a boolean flag as to whether any change occurred.
     */
    private int substitute(final StrBuilder buf, final int offset, final int length, List<String> priorVariables) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16235);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16236);final StrMatcher prefixMatcher = getVariablePrefixMatcher();
        __CLR4_4_1cdxcdxldni84ah.R.inc(16237);final StrMatcher suffixMatcher = getVariableSuffixMatcher();
        __CLR4_4_1cdxcdxldni84ah.R.inc(16238);final char escape = getEscapeChar();

        __CLR4_4_1cdxcdxldni84ah.R.inc(16239);final boolean top = priorVariables == null;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16240);boolean altered = false;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16241);int lengthChange = 0;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16242);char[] chars = buf.buffer;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16243);int bufEnd = offset + length;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16244);int pos = offset;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16245);while ((((pos < bufEnd)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16246)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16247)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16248);final int startMatchLen = prefixMatcher.isMatch(chars, pos, offset,
                    bufEnd);
            __CLR4_4_1cdxcdxldni84ah.R.inc(16249);if ((((startMatchLen == 0)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16250)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16251)==0&false))) {{
                __CLR4_4_1cdxcdxldni84ah.R.inc(16252);pos++;
            } }else {{
                // found variable start marker
                __CLR4_4_1cdxcdxldni84ah.R.inc(16253);if ((((pos > offset && chars[pos - 1] == escape)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16254)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16255)==0&false))) {{
                    // escaped
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16256);buf.deleteCharAt(pos - 1);
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16257);chars = buf.buffer; // in case buffer was altered
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16258);lengthChange--;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16259);altered = true;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16260);bufEnd--;
                } }else {{
                    // find suffix
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16261);final int startPos = pos;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16262);pos += startMatchLen;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16263);int endMatchLen = 0;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16264);int nestedVarCount = 0;
                    __CLR4_4_1cdxcdxldni84ah.R.inc(16265);while ((((pos < bufEnd)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16266)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16267)==0&false))) {{
                        __CLR4_4_1cdxcdxldni84ah.R.inc(16268);if (isEnableSubstitutionInVariables()
                                && (endMatchLen = prefixMatcher.isMatch(chars,
                                        pos, offset, bufEnd)) != 0) {{
                            // found a nested variable start
                            __CLR4_4_1cdxcdxldni84ah.R.inc(16271);nestedVarCount++;
                            __CLR4_4_1cdxcdxldni84ah.R.inc(16272);pos += endMatchLen;
                            __CLR4_4_1cdxcdxldni84ah.R.inc(16273);continue;
                        }

                        }__CLR4_4_1cdxcdxldni84ah.R.inc(16274);endMatchLen = suffixMatcher.isMatch(chars, pos, offset,
                                bufEnd);
                        __CLR4_4_1cdxcdxldni84ah.R.inc(16275);if ((((endMatchLen == 0)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16276)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16277)==0&false))) {{
                            __CLR4_4_1cdxcdxldni84ah.R.inc(16278);pos++;
                        } }else {{
                            // found variable end marker
                            __CLR4_4_1cdxcdxldni84ah.R.inc(16279);if ((((nestedVarCount == 0)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16280)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16281)==0&false))) {{
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16282);String varName = new String(chars, startPos
                                        + startMatchLen, pos - startPos
                                        - startMatchLen);
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16283);if ((((isEnableSubstitutionInVariables())&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16284)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16285)==0&false))) {{
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16286);final StrBuilder bufName = new StrBuilder(varName);
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16287);substitute(bufName, 0, bufName.length());
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16288);varName = bufName.toString();
                                }
                                }__CLR4_4_1cdxcdxldni84ah.R.inc(16289);pos += endMatchLen;
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16290);final int endPos = pos;

                                // on the first call initialize priorVariables
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16291);if ((((priorVariables == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16292)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16293)==0&false))) {{
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16294);priorVariables = new ArrayList<String>();
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16295);priorVariables.add(new String(chars,
                                            offset, length));
                                }

                                // handle cyclic substitution
                                }__CLR4_4_1cdxcdxldni84ah.R.inc(16296);checkCyclicSubstitution(varName, priorVariables);
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16297);priorVariables.add(varName);

                                // resolve the variable
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16298);final String varValue = resolveVariable(varName, buf,
                                        startPos, endPos);
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16299);if ((((varValue != null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16300)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16301)==0&false))) {{
                                    // recursive replace
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16302);final int varLen = varValue.length();
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16303);buf.replace(startPos, endPos, varValue);
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16304);altered = true;
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16305);int change = substitute(buf, startPos,
                                            varLen, priorVariables);
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16306);change = change
                                            + varLen - (endPos - startPos);
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16307);pos += change;
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16308);bufEnd += change;
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16309);lengthChange += change;
                                    __CLR4_4_1cdxcdxldni84ah.R.inc(16310);chars = buf.buffer; // in case buffer was
                                                        // altered
                                }

                                // remove variable from the cyclic stack
                                }__CLR4_4_1cdxcdxldni84ah.R.inc(16311);priorVariables
                                        .remove(priorVariables.size() - 1);
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16312);break;
                            } }else {{
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16313);nestedVarCount--;
                                __CLR4_4_1cdxcdxldni84ah.R.inc(16314);pos += endMatchLen;
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16315);if ((((top)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16316)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16317)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16318);return (((altered )&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16319)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16320)==0&false))? 1 : 0;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16321);return lengthChange;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Checks if the specified variable is already in the stack (list) of variables.
     *
     * @param varName  the variable name to check
     * @param priorVariables  the list of prior variables
     */
    private void checkCyclicSubstitution(final String varName, final List<String> priorVariables) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16322);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16323);if ((((priorVariables.contains(varName) == false)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16324)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16325)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16326);return;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16327);final StrBuilder buf = new StrBuilder(256);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16328);buf.append("Infinite loop in property interpolation of ");
        __CLR4_4_1cdxcdxldni84ah.R.inc(16329);buf.append(priorVariables.remove(0));
        __CLR4_4_1cdxcdxldni84ah.R.inc(16330);buf.append(": ");
        __CLR4_4_1cdxcdxldni84ah.R.inc(16331);buf.appendWithSeparators(priorVariables, "->");
        __CLR4_4_1cdxcdxldni84ah.R.inc(16332);throw new IllegalStateException(buf.toString());
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Internal method that resolves the value of a variable.
     * <p>
     * Most users of this class do not need to call this method. This method is
     * called automatically by the substitution process.
     * <p>
     * Writers of subclasses can override this method if they need to alter
     * how each substitution occurs. The method is passed the variable's name
     * and must return the corresponding value. This implementation uses the
     * {@link #getVariableResolver()} with the variable's name as the key.
     *
     * @param variableName  the name of the variable, not null
     * @param buf  the buffer where the substitution is occurring, not null
     * @param startPos  the start position of the variable including the prefix, valid
     * @param endPos  the end position of the variable including the suffix, valid
     * @return the variable's value or <b>null</b> if the variable is unknown
     */
    protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16333);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16334);final StrLookup<?> resolver = getVariableResolver();
        __CLR4_4_1cdxcdxldni84ah.R.inc(16335);if ((((resolver == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16336)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16337)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16338);return null;
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16339);return resolver.lookup(variableName);
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    // Escape
    //-----------------------------------------------------------------------
    /**
     * Returns the escape character.
     *
     * @return the character used for escaping variable references
     */
    public char getEscapeChar() {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16340);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16341);return this.escapeChar;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the escape character.
     * If this character is placed before a variable reference in the source
     * text, this variable will be ignored.
     *
     * @param escapeCharacter  the escape character (0 for disabling escaping)
     */
    public void setEscapeChar(final char escapeCharacter) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16342);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16343);this.escapeChar = escapeCharacter;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    // Prefix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @return the prefix matcher in use
     */
    public StrMatcher getVariablePrefixMatcher() {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16344);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16345);return prefixMatcher;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @param prefixMatcher  the prefix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix matcher is null
     */
    public StrSubstitutor setVariablePrefixMatcher(final StrMatcher prefixMatcher) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16346);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16347);if ((((prefixMatcher == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16348)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16349)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16350);throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16351);this.prefixMatcher = prefixMatcher;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16352);return this;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This method allows a single character prefix to
     * be easily set.
     *
     * @param prefix  the prefix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariablePrefix(final char prefix) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16353);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16354);return setVariablePrefixMatcher(StrMatcher.charMatcher(prefix));
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This method allows a string prefix to be easily set.
     *
     * @param prefix  the prefix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix is null
     */
    public StrSubstitutor setVariablePrefix(final String prefix) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16355);
       __CLR4_4_1cdxcdxldni84ah.R.inc(16356);if ((((prefix == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16357)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16358)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16359);throw new IllegalArgumentException("Variable prefix must not be null!");
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16360);return setVariablePrefixMatcher(StrMatcher.stringMatcher(prefix));
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    // Suffix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @return the suffix matcher in use
     */
    public StrMatcher getVariableSuffixMatcher() {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16361);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16362);return suffixMatcher;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @param suffixMatcher  the suffix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix matcher is null
     */
    public StrSubstitutor setVariableSuffixMatcher(final StrMatcher suffixMatcher) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16363);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16364);if ((((suffixMatcher == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16365)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16366)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16367);throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16368);this.suffixMatcher = suffixMatcher;
        __CLR4_4_1cdxcdxldni84ah.R.inc(16369);return this;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This method allows a single character suffix to
     * be easily set.
     *
     * @param suffix  the suffix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariableSuffix(final char suffix) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16370);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16371);return setVariableSuffixMatcher(StrMatcher.charMatcher(suffix));
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This method allows a string suffix to be easily set.
     *
     * @param suffix  the suffix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix is null
     */
    public StrSubstitutor setVariableSuffix(final String suffix) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16372);
       __CLR4_4_1cdxcdxldni84ah.R.inc(16373);if ((((suffix == null)&&(__CLR4_4_1cdxcdxldni84ah.R.iget(16374)!=0|true))||(__CLR4_4_1cdxcdxldni84ah.R.iget(16375)==0&false))) {{
            __CLR4_4_1cdxcdxldni84ah.R.inc(16376);throw new IllegalArgumentException("Variable suffix must not be null!");
        }
        }__CLR4_4_1cdxcdxldni84ah.R.inc(16377);return setVariableSuffixMatcher(StrMatcher.stringMatcher(suffix));
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    // Resolver
    //-----------------------------------------------------------------------
    /**
     * Gets the VariableResolver that is used to lookup variables.
     *
     * @return the VariableResolver
     */
    public StrLookup<?> getVariableResolver() {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16378);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16379);return this.variableResolver;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets the VariableResolver that is used to lookup variables.
     *
     * @param variableResolver  the VariableResolver
     */
    public void setVariableResolver(final StrLookup<?> variableResolver) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16380);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16381);this.variableResolver = variableResolver;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    // Substitution support in variable names
    //-----------------------------------------------------------------------
    /**
     * Returns a flag whether substitution is done in variable names.
     *
     * @return the substitution in variable names flag
     * @since 3.0
     */
    public boolean isEnableSubstitutionInVariables() {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16382);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16383);return enableSubstitutionInVariables;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}

    /**
     * Sets a flag whether substitution is done in variable names. If set to
     * <b>true</b>, the names of variables can contain other variables which are
     * processed first before the original variable is evaluated, e.g.
     * <code>${jre-${java.version}}</code>. The default value is <b>false</b>.
     *
     * @param enableSubstitutionInVariables the new value of the flag
     * @since 3.0
     */
    public void setEnableSubstitutionInVariables(
            final boolean enableSubstitutionInVariables) {try{__CLR4_4_1cdxcdxldni84ah.R.inc(16384);
        __CLR4_4_1cdxcdxldni84ah.R.inc(16385);this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }finally{__CLR4_4_1cdxcdxldni84ah.R.flushNeeded();}}
}
