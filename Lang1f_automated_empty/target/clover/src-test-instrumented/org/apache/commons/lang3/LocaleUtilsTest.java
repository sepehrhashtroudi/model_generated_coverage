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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link LocaleUtils}.
 *
 * @version $Id$
 */
public class LocaleUtilsTest  {static class __CLR4_4_1f4tf4tldniggsw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_ZZZZ = new Locale("en", "US", "ZZZZ");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");



    @Before
    public void setUp() throws Exception {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19613);
        // Testing #LANG-304. Must be called before availableLocaleSet is called.
        __CLR4_4_1f4tf4tldniggsw.R.inc(19614);LocaleUtils.isAvailableLocale(Locale.getDefault());
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test that constructors are public, and work, etc.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Pass in a valid language, test toLocale.
     *
     * @param language  the language string
     */
    private void assertValidToLocale(final String language) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19615);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19616);final Locale locale = LocaleUtils.toLocale(language);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19617);assertNotNull("valid locale", locale);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19618);assertEquals(language, locale.getLanguage());
        //country and variant are empty
        __CLR4_4_1f4tf4tldniggsw.R.inc(19619);assertTrue(locale.getCountry() == null || locale.getCountry().isEmpty());
        __CLR4_4_1f4tf4tldniggsw.R.inc(19620);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     */
    private void assertValidToLocale(final String localeString, final String language, final String country) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19621);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19622);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19623);assertNotNull("valid locale", locale);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19624);assertEquals(language, locale.getLanguage());
        __CLR4_4_1f4tf4tldniggsw.R.inc(19625);assertEquals(country, locale.getCountry());
        //variant is empty
        __CLR4_4_1f4tf4tldniggsw.R.inc(19626);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     * @param variant of the resulting Locale
     */
    private void assertValidToLocale(
            final String localeString, final String language, 
            final String country, final String variant) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19627);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19628);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19629);assertNotNull("valid locale", locale);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19630);assertEquals(language, locale.getLanguage());
        __CLR4_4_1f4tf4tldniggsw.R.inc(19631);assertEquals(country, locale.getCountry());
        __CLR4_4_1f4tf4tldniggsw.R.inc(19632);assertEquals(variant, locale.getVariant());
        
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Test toLocale() method.
     */
            

    /**
     * Test toLocale() method.
     */
            

    /**
     * Test toLocale() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Helper method for local lookups.
     *
     * @param locale  the input locale
     * @param defaultLocale  the input default locale
     * @param expected  expected results
     */
    private void assertLocaleLookupList(final Locale locale, final Locale defaultLocale, final Locale[] expected) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19633);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19634);final List<Locale> localeList = (((defaultLocale == null )&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19635)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19636)==0&false))?
                LocaleUtils.localeLookupList(locale) :
                LocaleUtils.localeLookupList(locale, defaultLocale);
        
        __CLR4_4_1f4tf4tldniggsw.R.inc(19637);assertEquals(expected.length, localeList.size());
        __CLR4_4_1f4tf4tldniggsw.R.inc(19638);assertEquals(Arrays.asList(expected), localeList);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19639);assertUnmodifiableCollection(localeList);
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test localeLookupList() method.
     */
            

    /**
     * Test localeLookupList() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleList() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Make sure the language by country is correct. It checks that 
     * the LocaleUtils.languagesByCountry(country) call contains the 
     * array of languages passed in. It may contain more due to JVM 
     * variations.
     *
     * @param country
     * @param languages array of languages that should be returned
     */
    private void assertLanguageByCountry(final String country, final String[] languages) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19640);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19641);final List<Locale> list = LocaleUtils.languagesByCountry(country);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19642);final List<Locale> list2 = LocaleUtils.languagesByCountry(country);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19643);assertNotNull(list);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19644);assertSame(list, list2);
        //search through langauges
        __CLR4_4_1f4tf4tldniggsw.R.inc(19645);for (final String language : languages) {{
            __CLR4_4_1f4tf4tldniggsw.R.inc(19646);final Iterator<Locale> iterator = list.iterator();
            __CLR4_4_1f4tf4tldniggsw.R.inc(19647);boolean found = false;
            // see if it was returned by the set
            __CLR4_4_1f4tf4tldniggsw.R.inc(19648);while ((((iterator.hasNext())&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19649)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19650)==0&false))) {{
                __CLR4_4_1f4tf4tldniggsw.R.inc(19651);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_4_1f4tf4tldniggsw.R.inc(19652);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_4_1f4tf4tldniggsw.R.inc(19653);assertEquals(country, locale.getCountry());
                __CLR4_4_1f4tf4tldniggsw.R.inc(19654);if ((((language.equals(locale.getLanguage()))&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19655)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19656)==0&false))) {{
                    __CLR4_4_1f4tf4tldniggsw.R.inc(19657);found = true;
                    __CLR4_4_1f4tf4tldniggsw.R.inc(19658);break;
                }
            }}
            }__CLR4_4_1f4tf4tldniggsw.R.inc(19659);if ((((!found)&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19660)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19661)==0&false))) {{
                __CLR4_4_1f4tf4tldniggsw.R.inc(19662);fail("Cound not find language: " + language
                        + " for country: " + country);
            }
        }}
        }__CLR4_4_1f4tf4tldniggsw.R.inc(19663);assertUnmodifiableCollection(list);
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Test languagesByCountry() method.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Make sure the country by language is correct. It checks that 
     * the LocaleUtils.countryByLanguage(language) call contains the 
     * array of countries passed in. It may contain more due to JVM 
     * variations.
     *
     *
     * @param language
     * @param countries array of countries that should be returned
     */
    private void assertCountriesByLanguage(final String language, final String[] countries) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19664);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19665);final List<Locale> list = LocaleUtils.countriesByLanguage(language);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19666);final List<Locale> list2 = LocaleUtils.countriesByLanguage(language);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19667);assertNotNull(list);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19668);assertSame(list, list2);
        //search through langauges
        __CLR4_4_1f4tf4tldniggsw.R.inc(19669);for (final String countrie : countries) {{
            __CLR4_4_1f4tf4tldniggsw.R.inc(19670);final Iterator<Locale> iterator = list.iterator();
            __CLR4_4_1f4tf4tldniggsw.R.inc(19671);boolean found = false;
            // see if it was returned by the set
            __CLR4_4_1f4tf4tldniggsw.R.inc(19672);while ((((iterator.hasNext())&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19673)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19674)==0&false))) {{
                __CLR4_4_1f4tf4tldniggsw.R.inc(19675);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_4_1f4tf4tldniggsw.R.inc(19676);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_4_1f4tf4tldniggsw.R.inc(19677);assertEquals(language, locale.getLanguage());
                __CLR4_4_1f4tf4tldniggsw.R.inc(19678);if ((((countrie.equals(locale.getCountry()))&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19679)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19680)==0&false))) {{
                    __CLR4_4_1f4tf4tldniggsw.R.inc(19681);found = true;
                    __CLR4_4_1f4tf4tldniggsw.R.inc(19682);break;
                }
            }}
            }__CLR4_4_1f4tf4tldniggsw.R.inc(19683);if ((((!found)&&(__CLR4_4_1f4tf4tldniggsw.R.iget(19684)!=0|true))||(__CLR4_4_1f4tf4tldniggsw.R.iget(19685)==0&false))) {{
                __CLR4_4_1f4tf4tldniggsw.R.inc(19686);fail("Cound not find language: " + countrie
                        + " for country: " + language);
            }
        }}
        }__CLR4_4_1f4tf4tldniggsw.R.inc(19687);assertUnmodifiableCollection(list);
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Test countriesByLanguage() method.
     */
    

    /**
     * @param coll  the collection to check
     */
    private static void assertUnmodifiableCollection(final Collection<?> coll) {try{__CLR4_4_1f4tf4tldniggsw.R.inc(19688);
        __CLR4_4_1f4tf4tldniggsw.R.inc(19689);try {
            __CLR4_4_1f4tf4tldniggsw.R.inc(19690);coll.add(null);
            __CLR4_4_1f4tf4tldniggsw.R.inc(19691);fail();
        } catch (final UnsupportedOperationException ex) {}
    }finally{__CLR4_4_1f4tf4tldniggsw.R.flushNeeded();}}

    /**
     * Tests #LANG-328 - only language+variant
     */
    

    /**
     * Tests #LANG-865, strings starting with an underscore.
     */
    

    
// Defects4J: flaky method
//     @Test
//     public void testParseAllLocales() {
//         Locale[] locales = Locale.getAvailableLocales();
//         int failures = 0;
//         for (Locale l : locales) {
//             // Check if it's possible to recreate the Locale using just the standard constructor
//             Locale locale = new Locale(l.getLanguage(), l.getCountry(), l.getVariant());
//             if (l.equals(locale)) { // it is possible for LocaleUtils.toLocale to handle these Locales
//                 String str = l.toString();
//                 // Look for the script/extension suffix
//                 int suff = str.indexOf("_#");
//                 if (suff == - 1) {
//                     suff = str.indexOf("#");
//                 }
//                 if (suff >= 0) { // we have a suffix
//                     try {
//                         LocaleUtils.toLocale(str); // shouuld cause IAE
//                         System.out.println("Should not have parsed: " + str);
//                         failures++;
//                         continue; // try next Locale
//                     } catch (IllegalArgumentException iae) {
//                         // expected; try without suffix
//                         str = str.substring(0, suff);
//                     }
//                 }
//                 Locale loc = LocaleUtils.toLocale(str);
//                 if (!l.equals(loc)) {
//                     System.out.println("Failed to parse: " + str);
//                     failures++;
//                 }                    
//             }
//         }
//         if (failures > 0) {
//             fail("Failed "+failures+" test(s)");
//         }
//     }

}
