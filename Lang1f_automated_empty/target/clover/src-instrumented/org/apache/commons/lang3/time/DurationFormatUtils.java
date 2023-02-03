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
package org.apache.commons.lang3.time;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Duration formatting utilities and constants. The following table describes the tokens 
 * used in the pattern language for formatting. </p>
 * <table border="1">
 *  <tr><th>character</th><th>duration element</th></tr>
 *  <tr><td>y</td><td>years</td></tr>
 *  <tr><td>M</td><td>months</td></tr>
 *  <tr><td>d</td><td>days</td></tr>
 *  <tr><td>H</td><td>hours</td></tr>
 *  <tr><td>m</td><td>minutes</td></tr>
 *  <tr><td>s</td><td>seconds</td></tr>
 *  <tr><td>S</td><td>milliseconds</td></tr>
 * </table>
 *
 * @since 2.1
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DurationFormatUtils {public static class __CLR4_4_1dr3dr3ldnigghc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,18213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>DurationFormatUtils instances should NOT be constructed in standard programming.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public DurationFormatUtils() {
        super();__CLR4_4_1dr3dr3ldnigghc.R.inc(17824);try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17823);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Pattern used with <code>FastDateFormat</code> and <code>SimpleDateFormat</code>
     * for the ISO8601 period format used in durations.</p>
     * 
     * @see org.apache.commons.lang3.time.FastDateFormat
     * @see java.text.SimpleDateFormat
     */
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is ISO8601-like:
     * <i>H</i>:<i>m</i>:<i>s</i>.<i>S</i>.</p>
     * 
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     */
    public static String formatDurationHMS(final long durationMillis) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17825);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17826);return formatDuration(durationMillis, "H:mm:ss.SSS");
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO8601 period format.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * ISO format pattern, such as P7D6TH5M4.321S.</p>
     * 
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     */
    public static String formatDurationISO(final long durationMillis) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17827);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17828);return formatDuration(durationMillis, ISO_EXTENDED_FORMAT_PATTERN, false);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format, and padding with zeros and 
     * using the default timezone.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     */
    public static String formatDuration(final long durationMillis, final String format) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17829);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17830);return formatDuration(durationMillis, format, true);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional and 
     * the timezone may be specified.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @return the formatted duration, not null
     */
    public static String formatDuration(long durationMillis, final String format, final boolean padWithZeros) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17831);

        __CLR4_4_1dr3dr3ldnigghc.R.inc(17832);final Token[] tokens = lexx(format);

        __CLR4_4_1dr3dr3ldnigghc.R.inc(17833);int days         = 0;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17834);int hours        = 0;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17835);int minutes      = 0;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17836);int seconds      = 0;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17837);int milliseconds = 0;
        
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17838);if ((((Token.containsTokenWithValue(tokens, d) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17839)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17840)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17841);days = (int) (durationMillis / DateUtils.MILLIS_PER_DAY);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17842);durationMillis = durationMillis - (days * DateUtils.MILLIS_PER_DAY);
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17843);if ((((Token.containsTokenWithValue(tokens, H) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17844)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17845)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17846);hours = (int) (durationMillis / DateUtils.MILLIS_PER_HOUR);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17847);durationMillis = durationMillis - (hours * DateUtils.MILLIS_PER_HOUR);
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17848);if ((((Token.containsTokenWithValue(tokens, m) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17849)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17850)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17851);minutes = (int) (durationMillis / DateUtils.MILLIS_PER_MINUTE);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17852);durationMillis = durationMillis - (minutes * DateUtils.MILLIS_PER_MINUTE);
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17853);if ((((Token.containsTokenWithValue(tokens, s) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17854)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17855)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17856);seconds = (int) (durationMillis / DateUtils.MILLIS_PER_SECOND);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17857);durationMillis = durationMillis - (seconds * DateUtils.MILLIS_PER_SECOND);
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17858);if ((((Token.containsTokenWithValue(tokens, S) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17859)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17860)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17861);milliseconds = (int) durationMillis;
        }

        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17862);return format(tokens, 0, 0, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats an elapsed time into a plurialization correct string.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the elapsed time to report in milliseconds
     * @param suppressLeadingZeroElements  suppresses leading 0 elements
     * @param suppressTrailingZeroElements  suppresses trailing 0 elements
     * @return the formatted text in days/hours/minutes/seconds, not null
     */
    public static String formatDurationWords(
        final long durationMillis,
        final boolean suppressLeadingZeroElements,
        final boolean suppressTrailingZeroElements) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17863);

        // This method is generally replacable by the format method, but 
        // there are a series of tweaks and special cases that require 
        // trickery to replicate.
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17864);String duration = formatDuration(durationMillis, "d' days 'H' hours 'm' minutes 's' seconds'");
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17865);if ((((suppressLeadingZeroElements)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17866)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17867)==0&false))) {{
            // this is a temporary marker on the front. Like ^ in regexp.
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17868);duration = " " + duration;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17869);String tmp = StringUtils.replaceOnce(duration, " 0 days", "");
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17870);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17871)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17872)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17873);duration = tmp;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17874);tmp = StringUtils.replaceOnce(duration, " 0 hours", "");
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17875);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17876)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17877)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17878);duration = tmp;
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17879);tmp = StringUtils.replaceOnce(duration, " 0 minutes", "");
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17880);duration = tmp;
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17881);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17882)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17883)==0&false))) {{
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(17884);duration = StringUtils.replaceOnce(tmp, " 0 seconds", "");
                    }
                }}
            }}
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(17885);if ((((duration.length() != 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17886)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17887)==0&false))) {{
                // strip the space off again
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17888);duration = duration.substring(1);
            }
        }}
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17889);if ((((suppressTrailingZeroElements)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17890)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17891)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17892);String tmp = StringUtils.replaceOnce(duration, " 0 seconds", "");
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17893);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17894)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17895)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17896);duration = tmp;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17897);tmp = StringUtils.replaceOnce(duration, " 0 minutes", "");
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17898);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17899)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17900)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17901);duration = tmp;
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17902);tmp = StringUtils.replaceOnce(duration, " 0 hours", "");
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17903);if ((((tmp.length() != duration.length())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17904)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17905)==0&false))) {{
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(17906);duration = StringUtils.replaceOnce(tmp, " 0 days", "");
                    }
                }}
            }}
        }}
        // handle plurals
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17907);duration = " " + duration;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17908);duration = StringUtils.replaceOnce(duration, " 1 seconds", " 1 second");
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17909);duration = StringUtils.replaceOnce(duration, " 1 minutes", " 1 minute");
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17910);duration = StringUtils.replaceOnce(duration, " 1 hours", " 1 hour");
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17911);duration = StringUtils.replaceOnce(duration, " 1 days", " 1 day");
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17912);return duration.trim();
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO8601 period format.</p>
     * 
     * @param startMillis  the start of the duration to format
     * @param endMillis  the end of the duration to format
     * @return the formatted duration, not null
     */
    public static String formatPeriodISO(final long startMillis, final long endMillis) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17913);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17914);return formatPeriod(startMillis, endMillis, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional.
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17915);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17916);return formatPeriod(startMillis, endMillis, format, true, TimeZone.getDefault());
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional and 
     * the timezone may be specified. </p>
     *
     * <p>When calculating the difference between months/days, it chooses to 
     * calculate months first. So when working out the number of months and 
     * days between January 15th and March 10th, it choose 1 month and 
     * 23 days gained by choosing January->February = 1 month and then 
     * calculating days forwards, and not the 1 month and 26 days gained by 
     * choosing March -> February = 1 month and then calculating days 
     * backwards. </p>
     *
     * <p>For more control, the <a href="http://joda-time.sf.net/">Joda-Time</a>
     * library is recommended.</p>
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @param timezone  the millis are defined in
     * @return the formatted duration, not null
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format, final boolean padWithZeros, 
            final TimeZone timezone) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(17917);

        // Used to optimise for differences under 28 days and 
        // called formatDuration(millis, format); however this did not work 
        // over leap years. 
        // TODO: Compare performance to see if anything was lost by 
        // losing this optimisation. 
        
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17918);final Token[] tokens = lexx(format);

        // timezones get funky around 0, so normalizing everything to GMT 
        // stops the hours being off
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17919);final Calendar start = Calendar.getInstance(timezone);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17920);start.setTime(new Date(startMillis));
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17921);final Calendar end = Calendar.getInstance(timezone);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17922);end.setTime(new Date(endMillis));

        // initial estimates
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17923);int milliseconds = end.get(Calendar.MILLISECOND) - start.get(Calendar.MILLISECOND);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17924);int seconds = end.get(Calendar.SECOND) - start.get(Calendar.SECOND);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17925);int minutes = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17926);int hours = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17927);int days = end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17928);int months = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17929);int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);

        // each initial estimate is adjusted in case it is under 0
        __CLR4_4_1dr3dr3ldnigghc.R.inc(17930);while ((((milliseconds < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17931)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17932)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17933);milliseconds += 1000;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17934);seconds -= 1;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17935);while ((((seconds < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17936)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17937)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17938);seconds += 60;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17939);minutes -= 1;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17940);while ((((minutes < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17941)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17942)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17943);minutes += 60;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17944);hours -= 1;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17945);while ((((hours < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17946)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17947)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17948);hours += 24;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17949);days -= 1;
        }
       
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(17950);if ((((Token.containsTokenWithValue(tokens, M))&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17951)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17952)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(17953);while ((((days < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17954)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17955)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17956);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17957);months -= 1;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17958);start.add(Calendar.MONTH, 1);
            }

            }__CLR4_4_1dr3dr3ldnigghc.R.inc(17959);while ((((months < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17960)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17961)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17962);months += 12;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17963);years -= 1;
            }

            }__CLR4_4_1dr3dr3ldnigghc.R.inc(17964);if ((((!Token.containsTokenWithValue(tokens, y) && years != 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17965)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17966)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17967);while ((((years != 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17968)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17969)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17970);months += 12 * years;
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17971);years = 0;
                }
            }}
        }} }else {{
            // there are no M's in the format string

            __CLR4_4_1dr3dr3ldnigghc.R.inc(17972);if( (((!Token.containsTokenWithValue(tokens, y) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17973)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17974)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17975);int target = end.get(Calendar.YEAR);
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17976);if ((((months < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17977)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17978)==0&false))) {{
                    // target is end-year -1
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17979);target -= 1;
                }
                
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(17980);while ((((start.get(Calendar.YEAR) != target)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17981)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17982)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17983);days += start.getActualMaximum(Calendar.DAY_OF_YEAR) - start.get(Calendar.DAY_OF_YEAR);
                    
                    // Not sure I grok why this is needed, but the brutal tests show it is
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17984);if ((((start instanceof GregorianCalendar &&
                            start.get(Calendar.MONTH) == Calendar.FEBRUARY &&
                            start.get(Calendar.DAY_OF_MONTH) == 29)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17985)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17986)==0&false))) {{
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(17987);days += 1;
                    }
                    
                    }__CLR4_4_1dr3dr3ldnigghc.R.inc(17988);start.add(Calendar.YEAR, 1);
                    
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(17989);days += start.get(Calendar.DAY_OF_YEAR);
                }
                
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(17990);years = 0;
            }
            
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(17991);while( (((start.get(Calendar.MONTH) != end.get(Calendar.MONTH) )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17992)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17993)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17994);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_4_1dr3dr3ldnigghc.R.inc(17995);start.add(Calendar.MONTH, 1);
            }
            
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(17996);months = 0;            

            __CLR4_4_1dr3dr3ldnigghc.R.inc(17997);while ((((days < 0)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(17998)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(17999)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18000);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18001);months -= 1;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18002);start.add(Calendar.MONTH, 1);
            }
            
        }}

        // The rest of this code adds in values that 
        // aren't requested. This allows the user to ask for the 
        // number of months and get the real count and not just 0->11.

        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18003);if ((((!Token.containsTokenWithValue(tokens, d))&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18004)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18005)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18006);hours += 24 * days;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18007);days = 0;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18008);if ((((!Token.containsTokenWithValue(tokens, H))&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18009)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18010)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18011);minutes += 60 * hours;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18012);hours = 0;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18013);if ((((!Token.containsTokenWithValue(tokens, m))&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18014)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18015)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18016);seconds += 60 * minutes;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18017);minutes = 0;
        }
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18018);if ((((!Token.containsTokenWithValue(tokens, s))&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18019)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18020)==0&false))) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18021);milliseconds += 1000 * seconds;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18022);seconds = 0;
        }

        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18023);return format(tokens, years, months, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>The internal method to do the formatting.</p>
     * 
     * @param tokens  the tokens
     * @param years  the number of years
     * @param months  the number of months
     * @param days  the number of days
     * @param hours  the number of hours
     * @param minutes  the number of minutes
     * @param seconds  the number of seconds
     * @param milliseconds  the number of millis
     * @param padWithZeros  whether to pad
     * @return the formatted string
     */
    static String format(final Token[] tokens, final int years, final int months, final int days, final int hours, final int minutes, final int seconds,
            int milliseconds, final boolean padWithZeros) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18024);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18025);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18026);boolean lastOutputSeconds = false;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18027);final int sz = tokens.length;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18028);for (int i = 0; (((i < sz)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18029)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18030)==0&false)); i++) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18031);final Token token = tokens[i];
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18032);final Object value = token.getValue();
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18033);final int count = token.getCount();
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18034);if ((((value instanceof StringBuilder)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18035)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18036)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18037);buffer.append(value.toString());
            } }else {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18038);if ((((value == y)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18039)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18040)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18041);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18042)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18043)==0&false))? StringUtils.leftPad(Integer.toString(years), count, '0') : Integer
                            .toString(years));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18044);lastOutputSeconds = false;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18045);if ((((value == M)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18046)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18047)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18048);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18049)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18050)==0&false))? StringUtils.leftPad(Integer.toString(months), count, '0') : Integer
                            .toString(months));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18051);lastOutputSeconds = false;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18052);if ((((value == d)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18053)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18054)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18055);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18056)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18057)==0&false))? StringUtils.leftPad(Integer.toString(days), count, '0') : Integer
                            .toString(days));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18058);lastOutputSeconds = false;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18059);if ((((value == H)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18060)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18061)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18062);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18063)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18064)==0&false))? StringUtils.leftPad(Integer.toString(hours), count, '0') : Integer
                            .toString(hours));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18065);lastOutputSeconds = false;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18066);if ((((value == m)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18067)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18068)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18069);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18070)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18071)==0&false))? StringUtils.leftPad(Integer.toString(minutes), count, '0') : Integer
                            .toString(minutes));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18072);lastOutputSeconds = false;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18073);if ((((value == s)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18074)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18075)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18076);buffer.append((((padWithZeros )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18077)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18078)==0&false))? StringUtils.leftPad(Integer.toString(seconds), count, '0') : Integer
                            .toString(seconds));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18079);lastOutputSeconds = true;
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18080);if ((((value == S)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18081)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18082)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18083);if ((((lastOutputSeconds)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18084)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18085)==0&false))) {{
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(18086);milliseconds += 1000;
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(18087);final String str = (((padWithZeros
                                )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18088)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18089)==0&false))? StringUtils.leftPad(Integer.toString(milliseconds), count, '0')
                                : Integer.toString(milliseconds);
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(18090);buffer.append(str.substring(1));
                    } }else {{
                        __CLR4_4_1dr3dr3ldnigghc.R.inc(18091);buffer.append((((padWithZeros
                                )&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18092)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18093)==0&false))? StringUtils.leftPad(Integer.toString(milliseconds), count, '0')
                                : Integer.toString(milliseconds));
                    }
                    }__CLR4_4_1dr3dr3ldnigghc.R.inc(18094);lastOutputSeconds = false;
                }
            }}}}}}}}
        }}
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18095);return buffer.toString();
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    static final Object y = "y";
    static final Object M = "M";
    static final Object d = "d";
    static final Object H = "H";
    static final Object m = "m";
    static final Object s = "s";
    static final Object S = "S";
    
    /**
     * Parses a classic date format string into Tokens
     *
     * @param format  the format to parse, not null
     * @return array of Token[]
     */
    static Token[] lexx(final String format) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18096);
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18097);final char[] array = format.toCharArray();
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18098);final ArrayList<Token> list = new ArrayList<Token>(array.length);

        __CLR4_4_1dr3dr3ldnigghc.R.inc(18099);boolean inLiteral = false;
        // Although the buffer is stored in a Token, the Tokens are only
        // used internally, so cannot be accessed by other threads
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18100);StringBuilder buffer = null;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18101);Token previous = null;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18102);final int sz = array.length;
        __CLR4_4_1dr3dr3ldnigghc.R.inc(18103);for (int i = 0; (((i < sz)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18104)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18105)==0&false)); i++) {{
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18106);final char ch = array[i];
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18107);if ((((inLiteral && ch != '\'')&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18108)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18109)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18110);buffer.append(ch); // buffer can't be null if inLiteral is true
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18111);continue;
            }
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(18112);Object value = null;
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1dr3dr3ldnigghc.R.inc(18113);switch (ch) {
            // TODO: Need to handle escaping of '
            case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18114);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18115);if ((((inLiteral)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18116)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18117)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18118);buffer = null;
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18119);inLiteral = false;
                } }else {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18120);buffer = new StringBuilder();
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18121);list.add(new Token(buffer));
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18122);inLiteral = true;
                }
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(18123);break;
            case 'y':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18124);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18125);value = y;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18126);break;
            case 'M':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18127);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18128);value = M;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18129);break;
            case 'd':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18130);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18131);value = d;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18132);break;
            case 'H':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18133);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18134);value = H;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18135);break;
            case 'm':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18136);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18137);value = m;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18138);break;
            case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18139);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18140);value = s;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18141);break;
            case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18142);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18143);value = S;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18144);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1dr3dr3ldnigghc.R.inc(18145);__CLB4_4_1_bool0=true;}
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18146);if ((((buffer == null)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18147)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18148)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18149);buffer = new StringBuilder();
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18150);list.add(new Token(buffer));
                }
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(18151);buffer.append(ch);
            }

            __CLR4_4_1dr3dr3ldnigghc.R.inc(18152);if ((((value != null)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18153)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18154)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18155);if ((((previous != null && previous.getValue() == value)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18156)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18157)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18158);previous.increment();
                } }else {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18159);final Token token = new Token(value);
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18160);list.add(token);
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18161);previous = token;
                }
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(18162);buffer = null;
            }
        }}
        }__CLR4_4_1dr3dr3ldnigghc.R.inc(18163);return list.toArray(new Token[list.size()]);
    }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Element that is parsed from the format pattern.
     */
    static class Token {

        /**
         * Helper method to determine if a set of tokens contain a value
         *
         * @param tokens set to look in
         * @param value to look for
         * @return boolean <code>true</code> if contained
         */
        static boolean containsTokenWithValue(final Token[] tokens, final Object value) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18164);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18165);final int sz = tokens.length;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18166);for (int i = 0; (((i < sz)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18167)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18168)==0&false)); i++) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18169);if ((((tokens[i].getValue() == value)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18170)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18171)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18172);return true;
                }
            }}
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(18173);return false;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        private final Object value;
        private int count;

        /**
         * Wraps a token around a value. A value would be something like a 'Y'.
         *
         * @param value to wrap
         */
        Token(final Object value) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18174);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18175);this.value = value;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18176);this.count = 1;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Wraps a token around a repeated number of a value, for example it would 
         * store 'yyyy' as a value for y and a count of 4.
         *
         * @param value to wrap
         * @param count to wrap
         */
        Token(final Object value, final int count) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18177);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18178);this.value = value;
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18179);this.count = count;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Adds another one of the value
         */
        void increment() {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18180); 
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18181);count++;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Gets the current number of values represented
         *
         * @return int number of values represented
         */
        int getCount() {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18182);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18183);return count;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Gets the particular value this token represents.
         * 
         * @return Object value
         */
        Object getValue() {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18184);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18185);return value;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Supports equality of this Token to another Token.
         *
         * @param obj2 Object to consider equality of
         * @return boolean <code>true</code> if equal
         */
        @Override
        public boolean equals(final Object obj2) {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18186);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18187);if ((((obj2 instanceof Token)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18188)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18189)==0&false))) {{
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18190);final Token tok2 = (Token) obj2;
                __CLR4_4_1dr3dr3ldnigghc.R.inc(18191);if ((((this.value.getClass() != tok2.value.getClass())&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18192)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18193)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18194);return false;
                }
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(18195);if ((((this.count != tok2.count)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18196)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18197)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18198);return false;
                }
                }__CLR4_4_1dr3dr3ldnigghc.R.inc(18199);if ((((this.value instanceof StringBuilder)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18200)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18201)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18202);return this.value.toString().equals(tok2.value.toString());
                } }else {__CLR4_4_1dr3dr3ldnigghc.R.inc(18203);if ((((this.value instanceof Number)&&(__CLR4_4_1dr3dr3ldnigghc.R.iget(18204)!=0|true))||(__CLR4_4_1dr3dr3ldnigghc.R.iget(18205)==0&false))) {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18206);return this.value.equals(tok2.value);
                } }else {{
                    __CLR4_4_1dr3dr3ldnigghc.R.inc(18207);return this.value == tok2.value;
                }
            }}}
            }__CLR4_4_1dr3dr3ldnigghc.R.inc(18208);return false;
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Returns a hash code for the token equal to the 
         * hash code for the token's value. Thus 'TT' and 'TTTT' 
         * will have the same hash code. 
         *
         * @return The hash code for the token
         */
        @Override
        public int hashCode() {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18209);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18210);return this.value.hashCode();
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}

        /**
         * Represents this token as a String.
         *
         * @return String representation of the token
         */
        @Override
        public String toString() {try{__CLR4_4_1dr3dr3ldnigghc.R.inc(18211);
            __CLR4_4_1dr3dr3ldnigghc.R.inc(18212);return StringUtils.repeat(this.value.toString(), this.count);
        }finally{__CLR4_4_1dr3dr3ldnigghc.R.flushNeeded();}}
    }

}
