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
public class ExtendedMessageFormatTest {static class __CLR4_4_1g26g26ldniggz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g26g26ldniggz5.R.inc(20814);
        __CLR4_4_1g26g26ldniggz5.R.inc(20815);registry.put("lower", new LowerCaseFormatFactory());
        __CLR4_4_1g26g26ldniggz5.R.inc(20816);registry.put("upper", new UpperCaseFormatFactory());
    }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    /**
     * Test extended formats.
     */
    

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
    private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20817);
        __CLR4_4_1g26g26ldniggz5.R.inc(20818);checkBuiltInFormat(pattern, null, args, locales);
    }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param registry FormatFactory registry to use
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale[] locales) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20819);
        __CLR4_4_1g26g26ldniggz5.R.inc(20820);checkBuiltInFormat(pattern, registry, args, (Locale) null);
        __CLR4_4_1g26g26ldniggz5.R.inc(20821);for (final Locale locale : locales) {{
            __CLR4_4_1g26g26ldniggz5.R.inc(20822);checkBuiltInFormat(pattern, registry, args, locale);
        }
    }}finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    /**
     * Create an ExtendedMessageFormat for the specified pattern and locale and check the
     * formated output matches the expected result for the parameters.
     * @param pattern string
     * @param registry map
     * @param args Object[]
     * @param locale Locale
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale locale) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20823);
        __CLR4_4_1g26g26ldniggz5.R.inc(20824);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1g26g26ldniggz5.R.inc(20825);buffer.append("Pattern=[");
        __CLR4_4_1g26g26ldniggz5.R.inc(20826);buffer.append(pattern);
        __CLR4_4_1g26g26ldniggz5.R.inc(20827);buffer.append("], locale=[");
        __CLR4_4_1g26g26ldniggz5.R.inc(20828);buffer.append(locale);
        __CLR4_4_1g26g26ldniggz5.R.inc(20829);buffer.append("]");
        __CLR4_4_1g26g26ldniggz5.R.inc(20830);final MessageFormat mf = createMessageFormat(pattern, locale);
        // System.out.println(buffer + ", result=[" + mf.format(args) +"]");
        __CLR4_4_1g26g26ldniggz5.R.inc(20831);ExtendedMessageFormat emf = null;
        __CLR4_4_1g26g26ldniggz5.R.inc(20832);if ((((locale == null)&&(__CLR4_4_1g26g26ldniggz5.R.iget(20833)!=0|true))||(__CLR4_4_1g26g26ldniggz5.R.iget(20834)==0&false))) {{
            __CLR4_4_1g26g26ldniggz5.R.inc(20835);emf = new ExtendedMessageFormat(pattern);
        } }else {{
            __CLR4_4_1g26g26ldniggz5.R.inc(20836);emf = new ExtendedMessageFormat(pattern, locale);
        }
        }__CLR4_4_1g26g26ldniggz5.R.inc(20837);assertEquals("format "    + buffer.toString(), mf.format(args), emf.format(args));
        __CLR4_4_1g26g26ldniggz5.R.inc(20838);assertPatternsEqual("toPattern " + buffer.toString(), mf.toPattern(),  emf.toPattern());
    }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    //can't trust what MessageFormat does with toPattern() pre 1.4:
    private void assertPatternsEqual(final String message, final String expected, final String actual) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20839);
        __CLR4_4_1g26g26ldniggz5.R.inc(20840);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_4_1g26g26ldniggz5.R.iget(20841)!=0|true))||(__CLR4_4_1g26g26ldniggz5.R.iget(20842)==0&false))) {{
            __CLR4_4_1g26g26ldniggz5.R.inc(20843);assertEquals(message, expected, actual);
        }
    }}finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    /**
     * Replace MessageFormat(String, Locale) constructor (not available until JDK 1.4).
     * @param pattern string
     * @param locale Locale
     * @return MessageFormat
     */
    private MessageFormat createMessageFormat(final String pattern, final Locale locale) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20844);
        __CLR4_4_1g26g26ldniggz5.R.inc(20845);final MessageFormat result = new MessageFormat(pattern);
        __CLR4_4_1g26g26ldniggz5.R.inc(20846);if ((((locale != null)&&(__CLR4_4_1g26g26ldniggz5.R.iget(20847)!=0|true))||(__CLR4_4_1g26g26ldniggz5.R.iget(20848)==0&false))) {{
            __CLR4_4_1g26g26ldniggz5.R.inc(20849);result.setLocale(locale);
            __CLR4_4_1g26g26ldniggz5.R.inc(20850);result.applyPattern(pattern);
        }
        }__CLR4_4_1g26g26ldniggz5.R.inc(20851);return result;
    }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}

    // ------------------------ Test Formats ------------------------

    /**
     * {@link Format} implementation which converts to lower case.
     */
    private static class LowerCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20852);
            __CLR4_4_1g26g26ldniggz5.R.inc(20853);return toAppendTo.append(((String)obj).toLowerCase());
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20854);__CLR4_4_1g26g26ldniggz5.R.inc(20855);throw new UnsupportedOperationException();}finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20856);
            __CLR4_4_1g26g26ldniggz5.R.inc(20857);return toAppendTo.append(((String)obj).toUpperCase());
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20858);__CLR4_4_1g26g26ldniggz5.R.inc(20859);throw new UnsupportedOperationException();}finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    private static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20860);
            __CLR4_4_1g26g26ldniggz5.R.inc(20861);return LOWER_INSTANCE;
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    private static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20862);
            __CLR4_4_1g26g26ldniggz5.R.inc(20863);return UPPER_INSTANCE;
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation to override date format "short" to "default".
     */
    private static class OverrideShortDateFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_4_1g26g26ldniggz5.R.inc(20864);
            __CLR4_4_1g26g26ldniggz5.R.inc(20865);return (((!"short".equals(arguments) )&&(__CLR4_4_1g26g26ldniggz5.R.iget(20866)!=0|true))||(__CLR4_4_1g26g26ldniggz5.R.iget(20867)==0&false))? null
                    : (((locale == null )&&(__CLR4_4_1g26g26ldniggz5.R.iget(20868)!=0|true))||(__CLR4_4_1g26g26ldniggz5.R.iget(20869)==0&false))? DateFormat
                            .getDateInstance(DateFormat.DEFAULT) : DateFormat
                            .getDateInstance(DateFormat.DEFAULT, locale);
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
    }

    /**
     * Alternative ExtendedMessageFormat impl.
     */
    private static class OtherExtendedMessageFormat extends ExtendedMessageFormat {
        public OtherExtendedMessageFormat(final String pattern, final Locale locale,
                final Map<String, ? extends FormatFactory> registry) {
            super(pattern, locale, registry);__CLR4_4_1g26g26ldniggz5.R.inc(20871);try{__CLR4_4_1g26g26ldniggz5.R.inc(20870);
        }finally{__CLR4_4_1g26g26ldniggz5.R.flushNeeded();}}
        
    }

}
