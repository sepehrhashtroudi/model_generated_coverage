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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <p>Operations to assist when working with a {@link Locale}.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * @since 2.2
 * @version $Id$
 */
public class LocaleUtils {public static class __CLR4_4_13r83r8ldnigfdt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,5028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Concurrent map of language locales by country. */
    private static final ConcurrentMap<String, List<Locale>> cLanguagesByCountry = 
        new ConcurrentHashMap<String, List<Locale>>();

    /** Concurrent map of country locales by language. */
    private static final ConcurrentMap<String, List<Locale>> cCountriesByLanguage = 
        new ConcurrentHashMap<String, List<Locale>>();

    /**
     * <p>{@code LocaleUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code LocaleUtils.toLocale("en_GB");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public LocaleUtils() {
      super();__CLR4_4_13r83r8ldnigfdt.R.inc(4869);try{__CLR4_4_13r83r8ldnigfdt.R.inc(4868);
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a Locale.</p>
     *
     * <p>This method takes the string format of a locale and creates the
     * locale object from it.</p>
     *
     * <pre>
     *   LocaleUtils.toLocale("en")         = new Locale("en", "")
     *   LocaleUtils.toLocale("en_GB")      = new Locale("en", "GB")
     *   LocaleUtils.toLocale("en_GB_xxx")  = new Locale("en", "GB", "xxx")   (#)
     * </pre>
     *
     * <p>(#) The behaviour of the JDK variant constructor changed between JDK1.3 and JDK1.4.
     * In JDK1.3, the constructor upper cases the variant, in JDK1.4, it doesn't.
     * Thus, the result from getVariant() may vary depending on your JDK.</p>
     *
     * <p>This method validates the input strictly.
     * The language code must be lowercase.
     * The country code must be uppercase.
     * The separator must be an underscore.
     * The length must be correct.
     * </p>
     *
     * @param str  the locale String to convert, null returns null
     * @return a Locale, null if null input
     * @throws IllegalArgumentException if the string is an invalid format
     */
    public static Locale toLocale(final String str) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4870);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4871);if ((((str == null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4872)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4873)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4874);return null;
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4875);if ((((str.contains("#"))&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4876)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4877)==0&false))) {{ // LANG-879 - Cannot handle Java 7 script & extensions
            __CLR4_4_13r83r8ldnigfdt.R.inc(4878);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4879);final int len = str.length();
        __CLR4_4_13r83r8ldnigfdt.R.inc(4880);if ((((len < 2)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4881)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4882)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4883);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4884);final char ch0 = str.charAt(0);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4885);if ((((ch0 == '_')&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4886)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4887)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4888);if ((((len < 3)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4889)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4890)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4891);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4892);final char ch1 = str.charAt(1);
            __CLR4_4_13r83r8ldnigfdt.R.inc(4893);final char ch2 = str.charAt(2);
            __CLR4_4_13r83r8ldnigfdt.R.inc(4894);if ((((!Character.isUpperCase(ch1) || !Character.isUpperCase(ch2))&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4895)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4896)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4897);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4898);if ((((len == 3)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4899)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4900)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4901);return new Locale("", str.substring(1, 3));
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4902);if ((((len < 5)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4903)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4904)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4905);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4906);if ((((str.charAt(3) != '_')&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4907)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4908)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4909);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4910);return new Locale("", str.substring(1, 3), str.substring(4));
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4911);final char ch1 = str.charAt(1);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4912);if ((((!Character.isLowerCase(ch0) || !Character.isLowerCase(ch1))&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4913)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4914)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4915);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4916);if ((((len == 2)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4917)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4918)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4919);return new Locale(str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4920);if ((((len < 5)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4921)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4922)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4923);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4924);if ((((str.charAt(2) != '_')&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4925)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4926)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4927);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4928);final char ch3 = str.charAt(3);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4929);if ((((ch3 == '_')&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4930)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4931)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4932);return new Locale(str.substring(0, 2), "", str.substring(4));
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4933);final char ch4 = str.charAt(4);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4934);if ((((!Character.isUpperCase(ch3) || !Character.isUpperCase(ch4))&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4935)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4936)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4937);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4938);if ((((len == 5)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4939)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4940)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4941);return new Locale(str.substring(0, 2), str.substring(3, 5));
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4942);if ((((len < 7)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4943)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4944)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4945);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4946);if ((((str.charAt(5) != '_')&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4947)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4948)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4949);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4950);return new Locale(str.substring(0, 2), str.substring(3, 5), str.substring(6));
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of locales to search through when performing
     * a locale search.</p>
     *
     * <pre>
     * localeLookupList(Locale("fr","CA","xxx"))
     *   = [Locale("fr","CA","xxx"), Locale("fr","CA"), Locale("fr")]
     * </pre>
     *
     * @param locale  the locale to start from
     * @return the unmodifiable list of Locale objects, 0 being locale, not null
     */
    public static List<Locale> localeLookupList(final Locale locale) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4951);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4952);return localeLookupList(locale, locale);
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of locales to search through when performing
     * a locale search.</p>
     *
     * <pre>
     * localeLookupList(Locale("fr", "CA", "xxx"), Locale("en"))
     *   = [Locale("fr","CA","xxx"), Locale("fr","CA"), Locale("fr"), Locale("en"]
     * </pre>
     *
     * <p>The result list begins with the most specific locale, then the
     * next more general and so on, finishing with the default locale.
     * The list will never contain the same locale twice.</p>
     *
     * @param locale  the locale to start from, null returns empty list
     * @param defaultLocale  the default locale to use if no other is found
     * @return the unmodifiable list of Locale objects, 0 being locale, not null
     */
    public static List<Locale> localeLookupList(final Locale locale, final Locale defaultLocale) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4953);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4954);final List<Locale> list = new ArrayList<Locale>(4);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4955);if ((((locale != null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4956)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4957)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4958);list.add(locale);
            __CLR4_4_13r83r8ldnigfdt.R.inc(4959);if ((((locale.getVariant().length() > 0)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4960)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4961)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4962);list.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4963);if ((((locale.getCountry().length() > 0)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4964)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4965)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4966);list.add(new Locale(locale.getLanguage(), ""));
            }
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4967);if ((((list.contains(defaultLocale) == false)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4968)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4969)==0&false))) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4970);list.add(defaultLocale);
            }
        }}
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4971);return Collections.unmodifiableList(list);
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains an unmodifiable list of installed locales.</p>
     * 
     * <p>This method is a wrapper around {@link Locale#getAvailableLocales()}.
     * It is more efficient, as the JDK method must create a new array each
     * time it is called.</p>
     *
     * @return the unmodifiable list of available locales
     */
    public static List<Locale> availableLocaleList() {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4972);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4973);return SyncAvoid.AVAILABLE_LOCALE_LIST;
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains an unmodifiable set of installed locales.</p>
     * 
     * <p>This method is a wrapper around {@link Locale#getAvailableLocales()}.
     * It is more efficient, as the JDK method must create a new array each
     * time it is called.</p>
     *
     * @return the unmodifiable set of available locales
     */
    public static Set<Locale> availableLocaleSet() {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4974);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4975);return SyncAvoid.AVAILABLE_LOCALE_SET;
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the locale specified is in the list of available locales.</p>
     *
     * @param locale the Locale object to check if it is available
     * @return true if the locale is a known locale
     */
    public static boolean isAvailableLocale(final Locale locale) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4976);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4977);return availableLocaleList().contains(locale);
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of languages supported for a given country.</p>
     *
     * <p>This method takes a country code and searches to find the
     * languages available for that country. Variant locales are removed.</p>
     *
     * @param countryCode  the 2 letter country code, null returns empty
     * @return an unmodifiable List of Locale objects, not null
     */
    public static List<Locale> languagesByCountry(final String countryCode) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(4978);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4979);if ((((countryCode == null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4980)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4981)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4982);return Collections.emptyList();
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(4983);List<Locale> langs = cLanguagesByCountry.get(countryCode);
        __CLR4_4_13r83r8ldnigfdt.R.inc(4984);if ((((langs == null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4985)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4986)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(4987);langs = new ArrayList<Locale>();
            __CLR4_4_13r83r8ldnigfdt.R.inc(4988);final List<Locale> locales = availableLocaleList();
            __CLR4_4_13r83r8ldnigfdt.R.inc(4989);for (int i = 0; (((i < locales.size())&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4990)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4991)==0&false)); i++) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(4992);final Locale locale = locales.get(i);
                __CLR4_4_13r83r8ldnigfdt.R.inc(4993);if ((((countryCode.equals(locale.getCountry()) &&
                        locale.getVariant().isEmpty())&&(__CLR4_4_13r83r8ldnigfdt.R.iget(4994)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(4995)==0&false))) {{
                    __CLR4_4_13r83r8ldnigfdt.R.inc(4996);langs.add(locale);
                }
            }}
            }__CLR4_4_13r83r8ldnigfdt.R.inc(4997);langs = Collections.unmodifiableList(langs);
            __CLR4_4_13r83r8ldnigfdt.R.inc(4998);cLanguagesByCountry.putIfAbsent(countryCode, langs);
            __CLR4_4_13r83r8ldnigfdt.R.inc(4999);langs = cLanguagesByCountry.get(countryCode);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(5000);return langs;
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of countries supported for a given language.</p>
     * 
     * <p>This method takes a language code and searches to find the
     * countries available for that language. Variant locales are removed.</p>
     *
     * @param languageCode  the 2 letter language code, null returns empty
     * @return an unmodifiable List of Locale objects, not null
     */
    public static List<Locale> countriesByLanguage(final String languageCode) {try{__CLR4_4_13r83r8ldnigfdt.R.inc(5001);
        __CLR4_4_13r83r8ldnigfdt.R.inc(5002);if ((((languageCode == null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(5003)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(5004)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(5005);return Collections.emptyList();
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(5006);List<Locale> countries = cCountriesByLanguage.get(languageCode);
        __CLR4_4_13r83r8ldnigfdt.R.inc(5007);if ((((countries == null)&&(__CLR4_4_13r83r8ldnigfdt.R.iget(5008)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(5009)==0&false))) {{
            __CLR4_4_13r83r8ldnigfdt.R.inc(5010);countries = new ArrayList<Locale>();
            __CLR4_4_13r83r8ldnigfdt.R.inc(5011);final List<Locale> locales = availableLocaleList();
            __CLR4_4_13r83r8ldnigfdt.R.inc(5012);for (int i = 0; (((i < locales.size())&&(__CLR4_4_13r83r8ldnigfdt.R.iget(5013)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(5014)==0&false)); i++) {{
                __CLR4_4_13r83r8ldnigfdt.R.inc(5015);final Locale locale = locales.get(i);
                __CLR4_4_13r83r8ldnigfdt.R.inc(5016);if ((((languageCode.equals(locale.getLanguage()) &&
                        locale.getCountry().length() != 0 &&
                        locale.getVariant().isEmpty())&&(__CLR4_4_13r83r8ldnigfdt.R.iget(5017)!=0|true))||(__CLR4_4_13r83r8ldnigfdt.R.iget(5018)==0&false))) {{
                    __CLR4_4_13r83r8ldnigfdt.R.inc(5019);countries.add(locale);
                }
            }}
            }__CLR4_4_13r83r8ldnigfdt.R.inc(5020);countries = Collections.unmodifiableList(countries);
            __CLR4_4_13r83r8ldnigfdt.R.inc(5021);cCountriesByLanguage.putIfAbsent(languageCode, countries);
            __CLR4_4_13r83r8ldnigfdt.R.inc(5022);countries = cCountriesByLanguage.get(languageCode);
        }
        }__CLR4_4_13r83r8ldnigfdt.R.inc(5023);return countries;
    }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // class to avoid synchronization (Init on demand)
    static class SyncAvoid {
        /** Unmodifiable list of available locales. */
        private static final List<Locale> AVAILABLE_LOCALE_LIST;
        /** Unmodifiable set of available locales. */
        private static final Set<Locale> AVAILABLE_LOCALE_SET;
        
        static {try{__CLR4_4_13r83r8ldnigfdt.R.inc(5024);
            __CLR4_4_13r83r8ldnigfdt.R.inc(5025);final List<Locale> list = new ArrayList<Locale>(Arrays.asList(Locale.getAvailableLocales()));  // extra safe
            __CLR4_4_13r83r8ldnigfdt.R.inc(5026);AVAILABLE_LOCALE_LIST = Collections.unmodifiableList(list);
            __CLR4_4_13r83r8ldnigfdt.R.inc(5027);AVAILABLE_LOCALE_SET = Collections.unmodifiableSet(new HashSet<Locale>(list));
        }finally{__CLR4_4_13r83r8ldnigfdt.R.flushNeeded();}}
    }

}
