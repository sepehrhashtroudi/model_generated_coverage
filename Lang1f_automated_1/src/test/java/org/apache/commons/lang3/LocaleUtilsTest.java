/*
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
public class LocaleUtilsTest  {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_ZZZZ = new Locale("en", "US", "ZZZZ");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");



    @Before
    public void setUp() throws Exception {
        // Testing #LANG-304. Must be called before availableLocaleSet is called.
        LocaleUtils.isAvailableLocale(Locale.getDefault());
    }

    //-----------------------------------------------------------------------
    /**
     * Test that constructors are public, and work, etc.
     */
@Test
public void testToLocale_3Part166() { 
     assertValidToLocale("us_EN_A", "us", "EN", "A"); 
     if (SystemUtils.isJavaVersionAtLeast(JAVA_1_4)) { 
         assertValidToLocale("us_EN_a", "us", "EN", "a"); 
         assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFsafdFDsdfF"); 
     } else { 
         assertValidToLocale("us_EN_a", "us", "EN", "A"); 
         assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFSAFDFDSDFF"); 
     } 
     try { 
         LocaleUtils.toLocale("us_EN-a"); 
         fail("Should fail as not underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("uu_UU_"); 
         fail("Must be 3, 5 or 7+ in length"); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testLang865167() { 
     assertValidToLocale("_GB", "", "GB", ""); 
     assertValidToLocale("_GB_P", "", "GB", "P"); 
     assertValidToLocale("_GB_POSIX", "", "GB", "POSIX"); 
     try { 
         LocaleUtils.toLocale("_G"); 
         fail("Must be at least 3 chars if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_Gb"); 
         fail("Must be uppercase if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_gB"); 
         fail("Must be uppercase if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_1B"); 
         fail("Must be letter if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_G1"); 
         fail("Must be letter if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_GB_"); 
         fail("Must be at least 5 chars if starts with underscore"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         LocaleUtils.toLocale("_GBAP"); 
         fail("Must have underscore after the country if starts with underscore and is at least 5 chars"); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testLocaleLookupList168() { 
     assertCountriesByLanguage(null, new String[0]); 
     assertCountriesByLanguage("de", new String[] { "DE", "CH", "AT", "LU" }); 
     assertCountriesByLanguage("zz", new String[0]); 
     assertCountriesByLanguage("it", new String[] { "IT", "CH" }); 
 }
@Test
public void testLocaleLookupList170() { 
     final Set<Locale> set = LocaleUtils.availableLocaleSet(); 
     assertEquals(set.contains(LOCALE_EN), LocaleUtils.localeLookupList(LOCALE_EN, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_EN_US), LocaleUtils.localeLookupList(LOCALE_EN_US, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_EN_US_ZZZZ), LocaleUtils.localeLookupList(LOCALE_EN_US_ZZZZ, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_FR), LocaleUtils.localeLookupList(LOCALE_FR, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_FR_CA), LocaleUtils.localeLookupList(LOCALE_FR_CA, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_QQ), LocaleUtils.localeLookupList(LOCALE_QQ, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_QQ_ZZ), LocaleUtils.localeLookupList(LOCALE_QQ_ZZ, Locale.ENGLISH)); 
 }
@Test
public void testLocaleLookupList_Locale171() { 
     final Set<Locale> set = LocaleUtils.availableLocaleSet(); 
     assertEquals(set.contains(LOCALE_EN), LocaleUtils.localeLookupList(LOCALE_EN, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_EN_US), LocaleUtils.localeLookupList(LOCALE_EN_US, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_EN_US_ZZZZ), LocaleUtils.localeLookupList(LOCALE_EN_US_ZZZZ, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_FR), LocaleUtils.localeLookupList(LOCALE_FR, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_FR_CA), LocaleUtils.localeLookupList(LOCALE_FR_CA, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_QQ), LocaleUtils.localeLookupList(LOCALE_QQ, Locale.ENGLISH)); 
     assertEquals(set.contains(LOCALE_QQ_ZZ), LocaleUtils.localeLookupList(LOCALE_QQ_ZZ, Locale.ENGLISH)); 
 }
    

    //-----------------------------------------------------------------------
    /**
     * Pass in a valid language, test toLocale.
     *
     * @param language  the language string
     */
    private void assertValidToLocale(final String language) {
        final Locale locale = LocaleUtils.toLocale(language);
        assertNotNull("valid locale", locale);
        assertEquals(language, locale.getLanguage());
        //country and variant are empty
        assertTrue(locale.getCountry() == null || locale.getCountry().isEmpty());
        assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     */
    private void assertValidToLocale(final String localeString, final String language, final String country) {
        final Locale locale = LocaleUtils.toLocale(localeString);
        assertNotNull("valid locale", locale);
        assertEquals(language, locale.getLanguage());
        assertEquals(country, locale.getCountry());
        //variant is empty
        assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }

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
            final String country, final String variant) {
        final Locale locale = LocaleUtils.toLocale(localeString);
        assertNotNull("valid locale", locale);
        assertEquals(language, locale.getLanguage());
        assertEquals(country, locale.getCountry());
        assertEquals(variant, locale.getVariant());
        
    }

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
    private void assertLocaleLookupList(final Locale locale, final Locale defaultLocale, final Locale[] expected) {
        final List<Locale> localeList = defaultLocale == null ?
                LocaleUtils.localeLookupList(locale) :
                LocaleUtils.localeLookupList(locale, defaultLocale);
        
        assertEquals(expected.length, localeList.size());
        assertEquals(Arrays.asList(expected), localeList);
        assertUnmodifiableCollection(localeList);
    }

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
    private void assertLanguageByCountry(final String country, final String[] languages) {
        final List<Locale> list = LocaleUtils.languagesByCountry(country);
        final List<Locale> list2 = LocaleUtils.languagesByCountry(country);
        assertNotNull(list);
        assertSame(list, list2);
        //search through langauges
        for (final String language : languages) {
            final Iterator<Locale> iterator = list.iterator();
            boolean found = false;
            // see if it was returned by the set
            while (iterator.hasNext()) {
                final Locale locale = iterator.next();
                // should have an en empty variant
                assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                assertEquals(country, locale.getCountry());
                if (language.equals(locale.getLanguage())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                fail("Cound not find language: " + language
                        + " for country: " + country);
            }
        }
        assertUnmodifiableCollection(list);
    }

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
    private void assertCountriesByLanguage(final String language, final String[] countries) {
        final List<Locale> list = LocaleUtils.countriesByLanguage(language);
        final List<Locale> list2 = LocaleUtils.countriesByLanguage(language);
        assertNotNull(list);
        assertSame(list, list2);
        //search through langauges
        for (final String countrie : countries) {
            final Iterator<Locale> iterator = list.iterator();
            boolean found = false;
            // see if it was returned by the set
            while (iterator.hasNext()) {
                final Locale locale = iterator.next();
                // should have an en empty variant
                assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                assertEquals(language, locale.getLanguage());
                if (countrie.equals(locale.getCountry())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                fail("Cound not find language: " + countrie
                        + " for country: " + language);
            }
        }
        assertUnmodifiableCollection(list);
    }

    /**
     * Test countriesByLanguage() method.
     */
    

    /**
     * @param coll  the collection to check
     */
    private static void assertUnmodifiableCollection(final Collection<?> coll) {
        try {
            coll.add(null);
            fail();
        } catch (final UnsupportedOperationException ex) {}
    }

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
