/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional inparserion regarding copyright ownership.
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
package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Assert;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateParser}.
 *
 * @since 3.2
 */
public class FastDateParserTest {static class __CLR4_4_1gupgupldni852r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String SHORT_FORMAT_NOERA = "y/M/d/h/a/m/E/Z";
    private static final String LONG_FORMAT_NOERA = "yyyy/MMMM/dddd/hhhh/mmmm/aaaa/EEEE/ZZZZ";
    private static final String SHORT_FORMAT = "G/" + SHORT_FORMAT_NOERA;
    private static final String LONG_FORMAT = "GGGG/" + LONG_FORMAT_NOERA;

    private static final String yMdHmsSZ = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    private static final String DMY_DOT = "dd.MM.yyyy";
    private static final String YMD_SLASH = "yyyy/MM/dd";
    private static final String MDY_DASH = "MM-DD-yyyy";
    private static final String MDY_SLASH = "MM/DD/yyyy";

    private static final TimeZone REYKJAVIK = TimeZone.getTimeZone("Atlantic/Reykjavik");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    private static final Locale SWEDEN = new Locale("sv", "SE");

    DateParser getInstance(final String format) {try{__CLR4_4_1gupgupldni852r.R.inc(21841);
        __CLR4_4_1gupgupldni852r.R.inc(21842);return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    private DateParser getDateInstance(final int dateStyle, final Locale locale) {try{__CLR4_4_1gupgupldni852r.R.inc(21843);
        __CLR4_4_1gupgupldni852r.R.inc(21844);return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    private DateParser getInstance(final String format, final Locale locale) {try{__CLR4_4_1gupgupldni852r.R.inc(21845);
        __CLR4_4_1gupgupldni852r.R.inc(21846);return getInstance(format, TimeZone.getDefault(), locale);
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    private DateParser getInstance(final String format, final TimeZone timeZone) {try{__CLR4_4_1gupgupldni852r.R.inc(21847);
        __CLR4_4_1gupgupldni852r.R.inc(21848);return getInstance(format, timeZone, Locale.getDefault());
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    /**
     * Override this method in derived tests to change the construction of instances
     */
    protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1gupgupldni852r.R.inc(21849);
        __CLR4_4_1gupgupldni852r.R.inc(21850);return new FastDateParser(format, timeZone, locale);
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    

    
// Defects4J: flaky method
//     @Test
//     public void testParseZone() throws ParseException {
//         final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
//         cal.clear();
//         cal.set(2003, 6, 10, 16, 33, 20);
// 
//         final DateParser fdf = getInstance(yMdHmsSZ, NEW_YORK, Locale.US);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 -0500"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 GMT-05:00"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 Eastern Daylight Time"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 EDT"));
// 
//         cal.setTimeZone(TimeZone.getTimeZone("GMT-3"));
//         cal.set(2003, 1, 10, 9, 0, 0);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-02-10T09:00:00.000 -0300"));
// 
//         cal.setTimeZone(TimeZone.getTimeZone("GMT+5"));
//         cal.set(2003, 1, 10, 15, 5, 6);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-02-10T15:05:06.000 +0500"));
//     }

    

    

    

    

    

    

    

    

    

    

    

    private void testLocales(final String format, final boolean eraBC) throws Exception {try{__CLR4_4_1gupgupldni852r.R.inc(21851);

        __CLR4_4_1gupgupldni852r.R.inc(21852);final Calendar cal= Calendar.getInstance(GMT);
        __CLR4_4_1gupgupldni852r.R.inc(21853);cal.clear();
        __CLR4_4_1gupgupldni852r.R.inc(21854);cal.set(2003, 1, 10);
        __CLR4_4_1gupgupldni852r.R.inc(21855);if ((((eraBC)&&(__CLR4_4_1gupgupldni852r.R.iget(21856)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21857)==0&false))) {{
            __CLR4_4_1gupgupldni852r.R.inc(21858);cal.set(Calendar.ERA, GregorianCalendar.BC);
        }
        }__CLR4_4_1gupgupldni852r.R.inc(21859);for(final Locale locale : Locale.getAvailableLocales()) {{
            // ja_JP_JP cannot handle dates before 1868 properly
            __CLR4_4_1gupgupldni852r.R.inc(21860);if ((((eraBC && locale.equals(FastDateParser.JAPANESE_IMPERIAL))&&(__CLR4_4_1gupgupldni852r.R.iget(21861)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21862)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21863);continue;
            }
            }__CLR4_4_1gupgupldni852r.R.inc(21864);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
            __CLR4_4_1gupgupldni852r.R.inc(21865);final DateParser fdf = getInstance(format, locale);

            __CLR4_4_1gupgupldni852r.R.inc(21866);try {
                __CLR4_4_1gupgupldni852r.R.inc(21867);checkParse(locale, cal, sdf, fdf);
            } catch(final ParseException ex) {
                __CLR4_4_1gupgupldni852r.R.inc(21868);Assert.fail("Locale "+locale+ " failed with "+format+" era "+((((eraBC)&&(__CLR4_4_1gupgupldni852r.R.iget(21869)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21870)==0&false))?"BC":"AD")+"\n" + trimMessage(ex.toString()));
            }
        }
    }}finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    private String trimMessage(final String msg) {try{__CLR4_4_1gupgupldni852r.R.inc(21871);
        __CLR4_4_1gupgupldni852r.R.inc(21872);if ((((msg.length() < 100)&&(__CLR4_4_1gupgupldni852r.R.iget(21873)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21874)==0&false))) {{
            __CLR4_4_1gupgupldni852r.R.inc(21875);return msg;
        }
        }__CLR4_4_1gupgupldni852r.R.inc(21876);final int gmt = msg.indexOf("(GMT");
        __CLR4_4_1gupgupldni852r.R.inc(21877);if ((((gmt > 0)&&(__CLR4_4_1gupgupldni852r.R.iget(21878)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21879)==0&false))) {{
            __CLR4_4_1gupgupldni852r.R.inc(21880);return msg.substring(0, gmt+4)+"...)";
        }
        }__CLR4_4_1gupgupldni852r.R.inc(21881);return msg.substring(0, 100)+"...";
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    private void checkParse(final Locale locale, final Calendar cal, final SimpleDateFormat sdf, final DateParser fdf) throws ParseException {try{__CLR4_4_1gupgupldni852r.R.inc(21882);
        __CLR4_4_1gupgupldni852r.R.inc(21883);final String formattedDate= sdf.format(cal.getTime());
        __CLR4_4_1gupgupldni852r.R.inc(21884);final Date expectedTime = sdf.parse(formattedDate);
        __CLR4_4_1gupgupldni852r.R.inc(21885);final Date actualTime = fdf.parse(formattedDate);
        __CLR4_4_1gupgupldni852r.R.inc(21886);assertEquals(locale.toString()+" "+formattedDate
                +"\n",expectedTime, actualTime);
    }finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    

    

    

    

    

    private void testSdfAndFdp(final String format, final String date, final boolean shouldFail)
            throws Exception {try{__CLR4_4_1gupgupldni852r.R.inc(21887);
        __CLR4_4_1gupgupldni852r.R.inc(21888);final boolean debug = false;
        __CLR4_4_1gupgupldni852r.R.inc(21889);Date dfdp = null;
        __CLR4_4_1gupgupldni852r.R.inc(21890);Date dsdf = null;
        __CLR4_4_1gupgupldni852r.R.inc(21891);Throwable f = null;
        __CLR4_4_1gupgupldni852r.R.inc(21892);Throwable s = null;

        __CLR4_4_1gupgupldni852r.R.inc(21893);try {
            __CLR4_4_1gupgupldni852r.R.inc(21894);final SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
            __CLR4_4_1gupgupldni852r.R.inc(21895);sdf.setTimeZone(NEW_YORK);
            __CLR4_4_1gupgupldni852r.R.inc(21896);dsdf = sdf.parse(date);
            __CLR4_4_1gupgupldni852r.R.inc(21897);if ((((shouldFail)&&(__CLR4_4_1gupgupldni852r.R.iget(21898)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21899)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21900);Assert.fail("Expected SDF failure, but got " + dsdf + " for ["+format+","+date+"]");
            }
        }} catch (final Exception e) {
            __CLR4_4_1gupgupldni852r.R.inc(21901);s = e;
            __CLR4_4_1gupgupldni852r.R.inc(21902);if ((((!shouldFail)&&(__CLR4_4_1gupgupldni852r.R.iget(21903)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21904)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21905);throw e;
            }
            }__CLR4_4_1gupgupldni852r.R.inc(21906);if ((((debug)&&(__CLR4_4_1gupgupldni852r.R.iget(21907)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21908)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21909);System.out.println("sdf:"+format+"/"+date+"=>"+e);
            }
        }}

        __CLR4_4_1gupgupldni852r.R.inc(21910);try {
            __CLR4_4_1gupgupldni852r.R.inc(21911);final DateParser fdp = getInstance(format, NEW_YORK, Locale.US);
            __CLR4_4_1gupgupldni852r.R.inc(21912);dfdp = fdp.parse(date);
            __CLR4_4_1gupgupldni852r.R.inc(21913);if ((((shouldFail)&&(__CLR4_4_1gupgupldni852r.R.iget(21914)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21915)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21916);Assert.fail("Expected FDF failure, but got " + dfdp + " for ["+format+","+date+"] using "+((FastDateParser)fdp).getParsePattern());
            }
        }} catch (final Exception e) {
            __CLR4_4_1gupgupldni852r.R.inc(21917);f = e;
            __CLR4_4_1gupgupldni852r.R.inc(21918);if ((((!shouldFail)&&(__CLR4_4_1gupgupldni852r.R.iget(21919)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21920)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21921);throw e;
            }
            }__CLR4_4_1gupgupldni852r.R.inc(21922);if ((((debug)&&(__CLR4_4_1gupgupldni852r.R.iget(21923)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21924)==0&false))) {{
                __CLR4_4_1gupgupldni852r.R.inc(21925);System.out.println("fdf:"+format+"/"+date+"=>"+e);
            }
        }}
        // SDF and FDF should produce equivalent results
        __CLR4_4_1gupgupldni852r.R.inc(21926);assertTrue("Should both or neither throw Exceptions", (f==null)==(s==null));
        __CLR4_4_1gupgupldni852r.R.inc(21927);assertEquals("Parsed dates should be equal", dsdf, dfdp);
        __CLR4_4_1gupgupldni852r.R.inc(21928);if ((((debug)&&(__CLR4_4_1gupgupldni852r.R.iget(21929)!=0|true))||(__CLR4_4_1gupgupldni852r.R.iget(21930)==0&false))) {{
            __CLR4_4_1gupgupldni852r.R.inc(21931);System.out.println(format + "," + date + " => " + dsdf);
        }
    }}finally{__CLR4_4_1gupgupldni852r.R.flushNeeded();}}

    

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     * @throws ParseException
     */
    

    /**
     * Tests that pre-1000AD years get padded with yyyy
     * @throws ParseException
     */
    

    /**
     * @throws ParseException
     */
    

    

    

    

    

    

    

    
}
