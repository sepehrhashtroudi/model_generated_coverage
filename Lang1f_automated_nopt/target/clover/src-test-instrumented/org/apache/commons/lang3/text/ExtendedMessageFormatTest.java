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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;

/**
 * Test case for {@link ExtendedMessageFormat}.
 *
 * @since 2.4
 * @version $Id$
 */
public class ExtendedMessageFormatTest {static class __CLR4_4_1gddgddldni850j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1gddgddldni850j.R.inc(21217);
        __CLR4_4_1gddgddldni850j.R.inc(21218);registry.put("lower", new LowerCaseFormatFactory());
        __CLR4_4_1gddgddldni850j.R.inc(21219);registry.put("upper", new UpperCaseFormatFactory());
    }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    /**
     * Test extended formats.
     */
@Test
public void testHashCode176() {__CLR4_4_1gddgddldni850j.R.globalSliceStart(getClass().getName(),21220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vbq2ygdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gddgddldni850j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gddgddldni850j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testHashCode176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vbq2ygdg(){try{__CLR4_4_1gddgddldni850j.R.inc(21220); __CLR4_4_1gddgddldni850j.R.inc(21221);ExtendedMessageFormat f1 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21222);ExtendedMessageFormat f2 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21223);ExtendedMessageFormat f3 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21224);ExtendedMessageFormat f4 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21225);assertEquals(f1.hashCode(), f2.hashCode()); __CLR4_4_1gddgddldni850j.R.inc(21226);assertEquals(f1.hashCode(), f3.hashCode()); __CLR4_4_1gddgddldni850j.R.inc(21227);assertEquals(f1.hashCode(), f4.hashCode()); }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
@Test
public void testEquals188() {__CLR4_4_1gddgddldni850j.R.globalSliceStart(getClass().getName(),21228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxbjjbgdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gddgddldni850j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gddgddldni850j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEquals188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxbjjbgdo(){try{__CLR4_4_1gddgddldni850j.R.inc(21228); __CLR4_4_1gddgddldni850j.R.inc(21229);ExtendedMessageFormat f1 = new ExtendedMessageFormat("Hello {0}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21230);ExtendedMessageFormat f2 = new ExtendedMessageFormat("Hello {1}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21231);ExtendedMessageFormat f3 = new ExtendedMessageFormat("Hello {2}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21232);assertTrue(f1.equals(f2)); __CLR4_4_1gddgddldni850j.R.inc(21233);assertTrue(f1.equals(f3)); __CLR4_4_1gddgddldni850j.R.inc(21234);assertFalse(f1.equals(null)); }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
@Test
public void testHashCode194() {__CLR4_4_1gddgddldni850j.R.globalSliceStart(getClass().getName(),21235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1982ge2gdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gddgddldni850j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gddgddldni850j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testHashCode194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1982ge2gdv(){try{__CLR4_4_1gddgddldni850j.R.inc(21235); __CLR4_4_1gddgddldni850j.R.inc(21236);ExtendedMessageFormat f1 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21237);ExtendedMessageFormat f2 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21238);ExtendedMessageFormat f3 = new ExtendedMessageFormat("{0}{1}{2}{3}"); __CLR4_4_1gddgddldni850j.R.inc(21239);assertEquals(f1.hashCode(), f2.hashCode()); __CLR4_4_1gddgddldni850j.R.inc(21240);assertEquals(f1.hashCode(), f3.hashCode()); }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
@Test
public void testEquals225() {__CLR4_4_1gddgddldni850j.R.globalSliceStart(getClass().getName(),21241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7gd05ge1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gddgddldni850j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gddgddldni850j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEquals225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7gd05ge1(){try{__CLR4_4_1gddgddldni850j.R.inc(21241); __CLR4_4_1gddgddldni850j.R.inc(21242);ExtendedMessageFormat f1 = new ExtendedMessageFormat("Hello {0}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21243);ExtendedMessageFormat f2 = new ExtendedMessageFormat("Hello {1}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21244);ExtendedMessageFormat f3 = new ExtendedMessageFormat("Hello {2}", Locale.ENGLISH); __CLR4_4_1gddgddldni850j.R.inc(21245);assertEquals(f1, f2); __CLR4_4_1gddgddldni850j.R.inc(21246);assertEquals(f1.hashCode(), f2.hashCode()); __CLR4_4_1gddgddldni850j.R.inc(21247);assertNotEquals(f1, null); __CLR4_4_1gddgddldni850j.R.inc(21248);assertNotEquals(f1.hashCode(), f3.hashCode()); }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    

    /**
     * Test Bug LANG-477 - out of memory error with escaped quote
     */
    

    /**
     * Test extended and built in formats.
     */
    

//    /**
//     * Test extended formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{1,lower}|2.0#{1,upper}}";
//        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
//        assertPatterns(null, pattern, emf.toPattern());
//        try {
//            assertEquals("one", emf.format(new Object[] {Integer.valueOf(1), "ONE"}));
//            assertEquals("TWO", emf.format(new Object[] {Integer.valueOf(2), "two"}));
//        } catch (IllegalArgumentException e) {
//            // currently sub-formats not supported
//        }
//    }

//    /**
//     * Test mixed extended and built-in formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedAndBuiltInWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{0} {1,lower} {2,number}|2.0#{0} {1,upper} {2,number,currency}}";
//        Object[] lowArgs  = new Object[] {Integer.valueOf(1), "Low",  Double.valueOf("1234.56")};
//        Object[] highArgs = new Object[] {Integer.valueOf(2), "High", Double.valueOf("9876.54")};
//        Locale[] availableLocales = ChoiceFormat.getAvailableLocales();
//        Locale[] testLocales = new Locale[availableLocales.length + 1];
//        testLocales[0] = null;
//        System.arraycopy(availableLocales, 0, testLocales, 1, availableLocales.length);
//        for (int i = 0; i < testLocales.length; i++) {
//            NumberFormat nf = null;
//            NumberFormat cf = null;
//            ExtendedMessageFormat emf = null;
//            if (testLocales[i] == null) {
//                nf = NumberFormat.getNumberInstance();
//                cf = NumberFormat.getCurrencyInstance();
//                emf = new ExtendedMessageFormat(pattern, registry);
//            } else {
//                nf = NumberFormat.getNumberInstance(testLocales[i]);
//                cf = NumberFormat.getCurrencyInstance(testLocales[i]);
//                emf = new ExtendedMessageFormat(pattern, testLocales[i], registry);
//            }
//            assertPatterns(null, pattern, emf.toPattern());
//            try {
//                String lowExpected = lowArgs[0] + " low "    + nf.format(lowArgs[2]);
//                String highExpected = highArgs[0] + " HIGH "  + cf.format(highArgs[2]);
//                assertEquals(lowExpected,  emf.format(lowArgs));
//                assertEquals(highExpected, emf.format(highArgs));
//            } catch (IllegalArgumentException e) {
//                // currently sub-formats not supported
//            }
//        }
//    }

    /**
     * Test the built in choice format.
     */
    

    /**
     * Test the built in date/time formats
     */
    

    

    /**
     * Test the built in number formats.
     */
    

    /**
     * Test equals() and hashcode.
     */
    

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales) {try{__CLR4_4_1gddgddldni850j.R.inc(21249);
        __CLR4_4_1gddgddldni850j.R.inc(21250);checkBuiltInFormat(pattern, null, args, locales);
    }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param registry FormatFactory registry to use
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale[] locales) {try{__CLR4_4_1gddgddldni850j.R.inc(21251);
        __CLR4_4_1gddgddldni850j.R.inc(21252);checkBuiltInFormat(pattern, registry, args, (Locale) null);
        __CLR4_4_1gddgddldni850j.R.inc(21253);for (final Locale locale : locales) {{
            __CLR4_4_1gddgddldni850j.R.inc(21254);checkBuiltInFormat(pattern, registry, args, locale);
        }
    }}finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    /**
     * Create an ExtendedMessageFormat for the specified pattern and locale and check the
     * formated output matches the expected result for the parameters.
     * @param pattern string
     * @param registry map
     * @param args Object[]
     * @param locale Locale
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale locale) {try{__CLR4_4_1gddgddldni850j.R.inc(21255);
        __CLR4_4_1gddgddldni850j.R.inc(21256);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1gddgddldni850j.R.inc(21257);buffer.append("Pattern=[");
        __CLR4_4_1gddgddldni850j.R.inc(21258);buffer.append(pattern);
        __CLR4_4_1gddgddldni850j.R.inc(21259);buffer.append("], locale=[");
        __CLR4_4_1gddgddldni850j.R.inc(21260);buffer.append(locale);
        __CLR4_4_1gddgddldni850j.R.inc(21261);buffer.append("]");
        __CLR4_4_1gddgddldni850j.R.inc(21262);final MessageFormat mf = createMessageFormat(pattern, locale);
        // System.out.println(buffer + ", result=[" + mf.format(args) +"]");
        __CLR4_4_1gddgddldni850j.R.inc(21263);ExtendedMessageFormat emf = null;
        __CLR4_4_1gddgddldni850j.R.inc(21264);if ((((locale == null)&&(__CLR4_4_1gddgddldni850j.R.iget(21265)!=0|true))||(__CLR4_4_1gddgddldni850j.R.iget(21266)==0&false))) {{
            __CLR4_4_1gddgddldni850j.R.inc(21267);emf = new ExtendedMessageFormat(pattern);
        } }else {{
            __CLR4_4_1gddgddldni850j.R.inc(21268);emf = new ExtendedMessageFormat(pattern, locale);
        }
        }__CLR4_4_1gddgddldni850j.R.inc(21269);assertEquals("format "    + buffer.toString(), mf.format(args), emf.format(args));
        __CLR4_4_1gddgddldni850j.R.inc(21270);assertPatternsEqual("toPattern " + buffer.toString(), mf.toPattern(),  emf.toPattern());
    }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    //can't trust what MessageFormat does with toPattern() pre 1.4:
    private void assertPatternsEqual(final String message, final String expected, final String actual) {try{__CLR4_4_1gddgddldni850j.R.inc(21271);
        __CLR4_4_1gddgddldni850j.R.inc(21272);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_4_1gddgddldni850j.R.iget(21273)!=0|true))||(__CLR4_4_1gddgddldni850j.R.iget(21274)==0&false))) {{
            __CLR4_4_1gddgddldni850j.R.inc(21275);assertEquals(message, expected, actual);
        }
    }}finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    /**
     * Replace MessageFormat(String, Locale) constructor (not available until JDK 1.4).
     * @param pattern string
     * @param locale Locale
     * @return MessageFormat
     */
    private MessageFormat createMessageFormat(final String pattern, final Locale locale) {try{__CLR4_4_1gddgddldni850j.R.inc(21276);
        __CLR4_4_1gddgddldni850j.R.inc(21277);final MessageFormat result = new MessageFormat(pattern);
        __CLR4_4_1gddgddldni850j.R.inc(21278);if ((((locale != null)&&(__CLR4_4_1gddgddldni850j.R.iget(21279)!=0|true))||(__CLR4_4_1gddgddldni850j.R.iget(21280)==0&false))) {{
            __CLR4_4_1gddgddldni850j.R.inc(21281);result.setLocale(locale);
            __CLR4_4_1gddgddldni850j.R.inc(21282);result.applyPattern(pattern);
        }
        }__CLR4_4_1gddgddldni850j.R.inc(21283);return result;
    }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}

    // ------------------------ Test Formats ------------------------

    /**
     * {@link Format} implementation which converts to lower case.
     */
    private static class LowerCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1gddgddldni850j.R.inc(21284);
            __CLR4_4_1gddgddldni850j.R.inc(21285);return toAppendTo.append(((String)obj).toLowerCase());
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1gddgddldni850j.R.inc(21286);__CLR4_4_1gddgddldni850j.R.inc(21287);throw new UnsupportedOperationException();}finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1gddgddldni850j.R.inc(21288);
            __CLR4_4_1gddgddldni850j.R.inc(21289);return toAppendTo.append(((String)obj).toUpperCase());
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1gddgddldni850j.R.inc(21290);__CLR4_4_1gddgddldni850j.R.inc(21291);throw new UnsupportedOperationException();}finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    private static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1gddgddldni850j.R.inc(21292);
            __CLR4_4_1gddgddldni850j.R.inc(21293);return LOWER_INSTANCE;
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    private static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1gddgddldni850j.R.inc(21294);
            __CLR4_4_1gddgddldni850j.R.inc(21295);return UPPER_INSTANCE;
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation to override date format "short" to "default".
     */
    private static class OverrideShortDateFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1gddgddldni850j.R.inc(21296);
            __CLR4_4_1gddgddldni850j.R.inc(21297);return (((!"short".equals(arguments) )&&(__CLR4_4_1gddgddldni850j.R.iget(21298)!=0|true))||(__CLR4_4_1gddgddldni850j.R.iget(21299)==0&false))? null
                    : (((locale == null )&&(__CLR4_4_1gddgddldni850j.R.iget(21300)!=0|true))||(__CLR4_4_1gddgddldni850j.R.iget(21301)==0&false))? DateFormat
                            .getDateInstance(DateFormat.DEFAULT) : DateFormat
                            .getDateInstance(DateFormat.DEFAULT, locale);
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
    }

    /**
     * Alternative ExtendedMessageFormat impl.
     */
    private static class OtherExtendedMessageFormat extends ExtendedMessageFormat {
        public OtherExtendedMessageFormat(final String pattern, final Locale locale,
                final Map<String, ? extends FormatFactory> registry) {
            super(pattern, locale, registry);__CLR4_4_1gddgddldni850j.R.inc(21303);try{__CLR4_4_1gddgddldni850j.R.inc(21302);
        }finally{__CLR4_4_1gddgddldni850j.R.flushNeeded();}}
        
    }

}
