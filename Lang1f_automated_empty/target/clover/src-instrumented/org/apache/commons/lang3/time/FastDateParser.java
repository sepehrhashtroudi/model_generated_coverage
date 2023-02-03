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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>FastDateParser is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>This class can be used as a direct replacement for
 * <code>SimpleDateFormat</code> in most parsing situations.
 * This class is especially useful in multi-threaded server environments.
 * <code>SimpleDateFormat</code> is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the
 * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4228335">bug</a>/RFE.
 * </p>
 *
 * <p>Only parsing is supported, but all patterns are compatible with
 * SimpleDateFormat.</p>
 *
 * <p>Timing tests indicate this class is as about as fast as SimpleDateFormat
 * in single thread applications and about 25% faster in multi-thread applications.</p>
 *
 * <p>Note that the code only handles Gregorian calendars. The following non-Gregorian
 * calendars use SimpleDateFormat internally, and so will be slower:
 * <ul>
 * <li>ja_JP_TH - Japanese Imperial</li>
 * <li>th_TH (any variant) - Thai Buddhist</li>
 * </ul>
 * </p>
 * @since 3.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDateParser implements DateParser, Serializable {public static class __CLR4_4_1e45e45ldniggiu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,18610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    static final Locale JAPANESE_IMPERIAL = new Locale("ja","JP","JP");

    // defining fields
    private final String pattern;
    private final TimeZone timeZone;
    private final Locale locale;

    // derived fields
    private transient Pattern parsePattern;
    private transient Strategy[] strategies;
    private transient int thisYear;

    // dynamic fields to communicate with Strategy
    private transient String currentFormatField;
    private transient Strategy nextStrategy;

    /**
     * <p>Constructs a new FastDateParser.</p>
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
     * @param locale non-null locale
     */
    protected FastDateParser(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18293);
        __CLR4_4_1e45e45ldniggiu.R.inc(18294);this.pattern = pattern;
        __CLR4_4_1e45e45ldniggiu.R.inc(18295);this.timeZone = timeZone;
        __CLR4_4_1e45e45ldniggiu.R.inc(18296);this.locale = locale;
        __CLR4_4_1e45e45ldniggiu.R.inc(18297);init();
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * Initialize derived fields from defining fields.
     * This is called from constructor and from readObject (de-serialization)
     */
    private void init() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18298);
        __CLR4_4_1e45e45ldniggiu.R.inc(18299);final Calendar definingCalendar = Calendar.getInstance(timeZone, locale);
        __CLR4_4_1e45e45ldniggiu.R.inc(18300);thisYear= definingCalendar.get(Calendar.YEAR);

        __CLR4_4_1e45e45ldniggiu.R.inc(18301);final StringBuilder regex= new StringBuilder();
        __CLR4_4_1e45e45ldniggiu.R.inc(18302);final List<Strategy> collector = new ArrayList<Strategy>();

        __CLR4_4_1e45e45ldniggiu.R.inc(18303);final Matcher patternMatcher= formatPattern.matcher(pattern);
        __CLR4_4_1e45e45ldniggiu.R.inc(18304);if((((!patternMatcher.lookingAt())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18305)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18306)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18307);throw new IllegalArgumentException(
                    "Illegal pattern character '" + pattern.charAt(patternMatcher.regionStart()) + "'");
        }

        }__CLR4_4_1e45e45ldniggiu.R.inc(18308);currentFormatField= patternMatcher.group();
        __CLR4_4_1e45e45ldniggiu.R.inc(18309);Strategy currentStrategy= getStrategy(currentFormatField, definingCalendar);
        __CLR4_4_1e45e45ldniggiu.R.inc(18310);for(;;) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18311);patternMatcher.region(patternMatcher.end(), patternMatcher.regionEnd());
            __CLR4_4_1e45e45ldniggiu.R.inc(18312);if((((!patternMatcher.lookingAt())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18313)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18314)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18315);nextStrategy = null;
                __CLR4_4_1e45e45ldniggiu.R.inc(18316);break;
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18317);final String nextFormatField= patternMatcher.group();
            __CLR4_4_1e45e45ldniggiu.R.inc(18318);nextStrategy = getStrategy(nextFormatField, definingCalendar);
            __CLR4_4_1e45e45ldniggiu.R.inc(18319);if((((currentStrategy.addRegex(this, regex))&&(__CLR4_4_1e45e45ldniggiu.R.iget(18320)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18321)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18322);collector.add(currentStrategy);
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18323);currentFormatField= nextFormatField;
            __CLR4_4_1e45e45ldniggiu.R.inc(18324);currentStrategy= nextStrategy;
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18325);if ((((patternMatcher.regionStart() != patternMatcher.regionEnd())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18326)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18327)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18328);throw new IllegalArgumentException("Failed to parse \""+pattern+"\" ; gave up at index "+patternMatcher.regionStart());
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18329);if((((currentStrategy.addRegex(this, regex))&&(__CLR4_4_1e45e45ldniggiu.R.iget(18330)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18331)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18332);collector.add(currentStrategy);
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18333);currentFormatField= null;
        __CLR4_4_1e45e45ldniggiu.R.inc(18334);strategies= collector.toArray(new Strategy[collector.size()]);
        __CLR4_4_1e45e45ldniggiu.R.inc(18335);parsePattern= Pattern.compile(regex.toString());
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18336);
        __CLR4_4_1e45e45ldniggiu.R.inc(18337);return pattern;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18338);
        __CLR4_4_1e45e45ldniggiu.R.inc(18339);return timeZone;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18340);
        __CLR4_4_1e45e45ldniggiu.R.inc(18341);return locale;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    // Give access to generated pattern for test code
    Pattern getParsePattern() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18342);
        __CLR4_4_1e45e45ldniggiu.R.inc(18343);return parsePattern;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compare another object for equality with this object.</p>
     *
     * @param obj  the object to compare to
     * @return <code>true</code>if equal to this instance
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18344);
        __CLR4_4_1e45e45ldniggiu.R.inc(18345);if ((((! (obj instanceof FastDateParser) )&&(__CLR4_4_1e45e45ldniggiu.R.iget(18346)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18347)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18348);return false;
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18349);final FastDateParser other = (FastDateParser) obj;
        __CLR4_4_1e45e45ldniggiu.R.inc(18350);return pattern.equals(other.pattern)
            && timeZone.equals(other.timeZone)
            && locale.equals(other.locale);
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * <p>Return a hashcode compatible with equals.</p>
     *
     * @return a hashcode compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18351);
        __CLR4_4_1e45e45ldniggiu.R.inc(18352);return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * <p>Get a string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18353);
        __CLR4_4_1e45e45ldniggiu.R.inc(18354);return "FastDateParser[" + pattern + "," + locale + "," + timeZone.getID() + "]";
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    // Serializing
    //-----------------------------------------------------------------------
    /**
     * Create the object after serialization. This implementation reinitializes the
     * transient properties.
     *
     * @param in ObjectInputStream from which the object is being deserialized.
     * @throws IOException if there is an IO issue.
     * @throws ClassNotFoundException if a class cannot be found.
     */
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_4_1e45e45ldniggiu.R.inc(18355);
        __CLR4_4_1e45e45ldniggiu.R.inc(18356);in.defaultReadObject();
        __CLR4_4_1e45e45ldniggiu.R.inc(18357);init();
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)
     */
    @Override
    public Object parseObject(final String source) throws ParseException {try{__CLR4_4_1e45e45ldniggiu.R.inc(18358);
        __CLR4_4_1e45e45ldniggiu.R.inc(18359);return parse(source);
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)
     */
    @Override
    public Date parse(final String source) throws ParseException {try{__CLR4_4_1e45e45ldniggiu.R.inc(18360);
        __CLR4_4_1e45e45ldniggiu.R.inc(18361);final Date date= parse(source, new ParsePosition(0));
        __CLR4_4_1e45e45ldniggiu.R.inc(18362);if((((date==null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18363)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18364)==0&false))) {{
            // Add a note re supported date range
            __CLR4_4_1e45e45ldniggiu.R.inc(18365);if ((((locale.equals(JAPANESE_IMPERIAL))&&(__CLR4_4_1e45e45ldniggiu.R.iget(18366)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18367)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18368);throw new ParseException(
                        "(The " +locale + " locale does not support dates before 1868 AD)\n" +
                                "Unparseable date: \""+source+"\" does not match "+parsePattern.pattern(), 0);
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18369);throw new ParseException("Unparseable date: \""+source+"\" does not match "+parsePattern.pattern(), 0);
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18370);return date;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18371);
        __CLR4_4_1e45e45ldniggiu.R.inc(18372);return parse(source, pos);
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Date parse(final String source, final ParsePosition pos) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18373);
        __CLR4_4_1e45e45ldniggiu.R.inc(18374);final int offset= pos.getIndex();
        __CLR4_4_1e45e45ldniggiu.R.inc(18375);final Matcher matcher= parsePattern.matcher(source.substring(offset));
        __CLR4_4_1e45e45ldniggiu.R.inc(18376);if((((!matcher.lookingAt())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18377)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18378)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18379);return null;
        }
        // timing tests indicate getting new instance is 19% faster than cloning
        }__CLR4_4_1e45e45ldniggiu.R.inc(18380);final Calendar cal= Calendar.getInstance(timeZone, locale);
        __CLR4_4_1e45e45ldniggiu.R.inc(18381);cal.clear();

        __CLR4_4_1e45e45ldniggiu.R.inc(18382);for(int i=0; (((i<strategies.length)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18383)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18384)==0&false));) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18385);final Strategy strategy= strategies[i++];
            __CLR4_4_1e45e45ldniggiu.R.inc(18386);strategy.setCalendar(this, cal, matcher.group(i));
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18387);pos.setIndex(offset+matcher.end());
        __CLR4_4_1e45e45ldniggiu.R.inc(18388);return cal.getTime();
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    // Support for strategies
    //-----------------------------------------------------------------------

    /**
     * Escape constant fields into regular expression
     * @param regex The destination regex
     * @param value The source field
     * @param unquote If true, replace two success quotes ('') with single quote (')
     * @return The <code>StringBuilder</code>
     */
    private static StringBuilder escapeRegex(final StringBuilder regex, final String value, final boolean unquote) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18389);
        __CLR4_4_1e45e45ldniggiu.R.inc(18390);regex.append("\\Q");
        __CLR4_4_1e45e45ldniggiu.R.inc(18391);for(int i= 0; (((i<value.length())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18392)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18393)==0&false)); ++i) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18394);char c= value.charAt(i);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1e45e45ldniggiu.R.inc(18395);switch(c) {
            case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_1e45e45ldniggiu.R.inc(18396);__CLB4_4_1_bool0=true;}
                __CLR4_4_1e45e45ldniggiu.R.inc(18397);if((((unquote)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18398)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18399)==0&false))) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18400);if((((++i==value.length())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18401)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18402)==0&false))) {{
                        __CLR4_4_1e45e45ldniggiu.R.inc(18403);return regex;
                    }
                    }__CLR4_4_1e45e45ldniggiu.R.inc(18404);c= value.charAt(i);
                }
                }__CLR4_4_1e45e45ldniggiu.R.inc(18405);break;
            case '\\':if (!__CLB4_4_1_bool0) {__CLR4_4_1e45e45ldniggiu.R.inc(18406);__CLB4_4_1_bool0=true;}
                __CLR4_4_1e45e45ldniggiu.R.inc(18407);if((((++i==value.length())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18408)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18409)==0&false))) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18410);break;
                }                
                /*
                 * If we have found \E, we replace it with \E\\E\Q, i.e. we stop the quoting,
                 * quote the \ in \E, then restart the quoting.
                 * 
                 * Otherwise we just output the two characters.
                 * In each case the initial \ needs to be output and the final char is done at the end
                 */
                }__CLR4_4_1e45e45ldniggiu.R.inc(18411);regex.append(c); // we always want the original \
                __CLR4_4_1e45e45ldniggiu.R.inc(18412);c = value.charAt(i); // Is it followed by E ?
                __CLR4_4_1e45e45ldniggiu.R.inc(18413);if ((((c == 'E')&&(__CLR4_4_1e45e45ldniggiu.R.iget(18414)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18415)==0&false))) {{ // \E detected
                  __CLR4_4_1e45e45ldniggiu.R.inc(18416);regex.append("E\\\\E\\"); // see comment above
                  __CLR4_4_1e45e45ldniggiu.R.inc(18417);c = 'Q'; // appended below
                }
                }__CLR4_4_1e45e45ldniggiu.R.inc(18418);break;
            }
            __CLR4_4_1e45e45ldniggiu.R.inc(18419);regex.append(c);
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18420);regex.append("\\E");
        __CLR4_4_1e45e45ldniggiu.R.inc(18421);return regex;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}


    /**
     * Get the short and long values displayed for a field
     * @param field The field of interest
     * @param definingCalendar The calendar to obtain the short and long values
     * @param locale The locale of display names
     * @return A Map of the field key / value pairs
     */
    private static Map<String, Integer> getDisplayNames(final int field, final Calendar definingCalendar, final Locale locale) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18422);
        __CLR4_4_1e45e45ldniggiu.R.inc(18423);return definingCalendar.getDisplayNames(field, Calendar.ALL_STYLES, locale);
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * Adjust dates to be within 80 years before and 20 years after instantiation
     * @param twoDigitYear The year to adjust
     * @return A value within -80 and +20 years from instantiation of this instance
     */
    int adjustYear(final int twoDigitYear) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18424);
        __CLR4_4_1e45e45ldniggiu.R.inc(18425);final int trial= twoDigitYear + thisYear - thisYear%100;
        __CLR4_4_1e45e45ldniggiu.R.inc(18426);if((((trial < thisYear+20)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18427)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18428)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18429);return trial;
        }
        }__CLR4_4_1e45e45ldniggiu.R.inc(18430);return trial-100;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * Is the next field a number?
     * @return true, if next field will be a number
     */
    boolean isNextNumber() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18431);
        __CLR4_4_1e45e45ldniggiu.R.inc(18432);return nextStrategy!=null && nextStrategy.isNumber();
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * What is the width of the current field?
     * @return The number of characters in the current format field
     */
    int getFieldWidth() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18433);
        __CLR4_4_1e45e45ldniggiu.R.inc(18434);return currentFormatField.length();
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * A strategy to parse a single field from the parsing pattern
     */
    private static abstract class Strategy {
        /**
         * Is this field a number?
         * The default implementation returns true.
         * 
         * @return true, if field is a number
         */
        boolean isNumber() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18435);
            __CLR4_4_1e45e45ldniggiu.R.inc(18436);return false;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
        /**
         * Set the Calendar with the parsed field.
         * 
         * The default implementation does nothing.
         * 
         * @param parser The parser calling this strategy
         * @param cal The <code>Calendar</code> to set
         * @param value The parsed field to translate and set in cal
         */
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18437);
            
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
        /**
         * Generate a <code>Pattern</code> regular expression to the <code>StringBuilder</code>
         * which will accept this field
         * @param parser The parser calling this strategy
         * @param regex The <code>StringBuilder</code> to append to
         * @return true, if this field will set the calendar;
         * false, if this field is a constant value
         */
        abstract boolean addRegex(FastDateParser parser, StringBuilder regex);
    }

    /**
     * A <code>Pattern</code> to parse the user supplied SimpleDateFormat pattern
     */
    private static final Pattern formatPattern= Pattern.compile(
            "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");

    /**
     * Obtain a Strategy given a field from a SimpleDateFormat pattern
     * @param formatField A sub-sequence of the SimpleDateFormat pattern
     * @param definingCalendar The calendar to obtain the short and long values
     * @return The Strategy that will handle parsing for the field
     */
    private Strategy getStrategy(String formatField, final Calendar definingCalendar) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18438);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1e45e45ldniggiu.R.inc(18439);switch(formatField.charAt(0)) {
        case '\'':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18440);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18441);if((((formatField.length()>2)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18442)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18443)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18444);formatField= formatField.substring(1, formatField.length()-1);
            }
            //$FALL-THROUGH$
        }default:if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18445);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18446);return new CopyQuotedStrategy(formatField);
        case 'D':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18447);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18448);return DAY_OF_YEAR_STRATEGY;
        case 'E':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18449);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18450);return getLocaleSpecificStrategy(Calendar.DAY_OF_WEEK, definingCalendar);
        case 'F':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18451);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18452);return DAY_OF_WEEK_IN_MONTH_STRATEGY;
        case 'G':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18453);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18454);return getLocaleSpecificStrategy(Calendar.ERA, definingCalendar);
        case 'H':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18455);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18456);return MODULO_HOUR_OF_DAY_STRATEGY;
        case 'K':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18457);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18458);return HOUR_STRATEGY;
        case 'M':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18459);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18460);return (((formatField.length()>=3 )&&(__CLR4_4_1e45e45ldniggiu.R.iget(18461)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18462)==0&false))?getLocaleSpecificStrategy(Calendar.MONTH, definingCalendar) :NUMBER_MONTH_STRATEGY;
        case 'S':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18463);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18464);return MILLISECOND_STRATEGY;
        case 'W':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18465);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18466);return WEEK_OF_MONTH_STRATEGY;
        case 'a':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18467);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18468);return getLocaleSpecificStrategy(Calendar.AM_PM, definingCalendar);
        case 'd':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18469);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18470);return DAY_OF_MONTH_STRATEGY;
        case 'h':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18471);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18472);return MODULO_HOUR_STRATEGY;
        case 'k':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18473);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18474);return HOUR_OF_DAY_STRATEGY;
        case 'm':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18475);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18476);return MINUTE_STRATEGY;
        case 's':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18477);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18478);return SECOND_STRATEGY;
        case 'w':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18479);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18480);return WEEK_OF_YEAR_STRATEGY;
        case 'y':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18481);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18482);return (((formatField.length()>2 )&&(__CLR4_4_1e45e45ldniggiu.R.iget(18483)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18484)==0&false))?LITERAL_YEAR_STRATEGY :ABBREVIATED_YEAR_STRATEGY;
        case 'Z':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18485);__CLB4_4_1_bool1=true;}
        case 'z':if (!__CLB4_4_1_bool1) {__CLR4_4_1e45e45ldniggiu.R.inc(18486);__CLB4_4_1_bool1=true;}
            __CLR4_4_1e45e45ldniggiu.R.inc(18487);return getLocaleSpecificStrategy(Calendar.ZONE_OFFSET, definingCalendar);
        }
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    @SuppressWarnings("unchecked") // OK because we are creating an array with no entries
    private static ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[Calendar.FIELD_COUNT];

    /**
     * Get a cache of Strategies for a particular field
     * @param field The Calendar field
     * @return a cache of Locale to Strategy
     */
    private static ConcurrentMap<Locale, Strategy> getCache(final int field) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18488);
        __CLR4_4_1e45e45ldniggiu.R.inc(18489);synchronized(caches) {
            __CLR4_4_1e45e45ldniggiu.R.inc(18490);if((((caches[field]==null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18491)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18492)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18493);caches[field]= new ConcurrentHashMap<Locale,Strategy>(3);
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18494);return caches[field];
        }
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * Construct a Strategy that parses a Text field
     * @param field The Calendar field
     * @param definingCalendar The calendar to obtain the short and long values
     * @return a TextStrategy for the field and Locale
     */
    private Strategy getLocaleSpecificStrategy(final int field, final Calendar definingCalendar) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18495);
        __CLR4_4_1e45e45ldniggiu.R.inc(18496);final ConcurrentMap<Locale,Strategy> cache = getCache(field);
        __CLR4_4_1e45e45ldniggiu.R.inc(18497);Strategy strategy= cache.get(locale);
        __CLR4_4_1e45e45ldniggiu.R.inc(18498);if((((strategy==null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18499)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18500)==0&false))) {{
            __CLR4_4_1e45e45ldniggiu.R.inc(18501);strategy= (((field==Calendar.ZONE_OFFSET
                    )&&(__CLR4_4_1e45e45ldniggiu.R.iget(18502)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18503)==0&false))? new TimeZoneStrategy(locale)
                    : new TextStrategy(field, definingCalendar, locale);
            __CLR4_4_1e45e45ldniggiu.R.inc(18504);final Strategy inCache= cache.putIfAbsent(locale, strategy);
            __CLR4_4_1e45e45ldniggiu.R.inc(18505);if((((inCache!=null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18506)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18507)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18508);return inCache;
            }
        }}
        }__CLR4_4_1e45e45ldniggiu.R.inc(18509);return strategy;
    }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

    /**
     * A strategy that copies the static or quoted field in the parsing pattern
     */
    private static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        /**
         * Construct a Strategy that ensures the formatField has literal text
         * @param formatField The literal text to match
         */
        CopyQuotedStrategy(final String formatField) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18510);
            __CLR4_4_1e45e45ldniggiu.R.inc(18511);this.formatField= formatField;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18512);
            __CLR4_4_1e45e45ldniggiu.R.inc(18513);char c= formatField.charAt(0);
            __CLR4_4_1e45e45ldniggiu.R.inc(18514);if((((c=='\'')&&(__CLR4_4_1e45e45ldniggiu.R.iget(18515)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18516)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18517);c= formatField.charAt(1);
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18518);return Character.isDigit(c);
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18519);
            __CLR4_4_1e45e45ldniggiu.R.inc(18520);escapeRegex(regex, formatField, true);
            __CLR4_4_1e45e45ldniggiu.R.inc(18521);return false;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    }

    /**
     * A strategy that handles a text field in the parsing pattern
     */
     private static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        /**
         * Construct a Strategy that parses a Text field
         * @param field  The Calendar field
         * @param definingCalendar  The Calendar to use
         * @param locale  The Locale to use
         */
        TextStrategy(final int field, final Calendar definingCalendar, final Locale locale) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18522);
            __CLR4_4_1e45e45ldniggiu.R.inc(18523);this.field= field;
            __CLR4_4_1e45e45ldniggiu.R.inc(18524);this.keyValues= getDisplayNames(field, definingCalendar, locale);
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18525);
            __CLR4_4_1e45e45ldniggiu.R.inc(18526);regex.append('(');
            __CLR4_4_1e45e45ldniggiu.R.inc(18527);for(final String textKeyValue : keyValues.keySet()) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18528);escapeRegex(regex, textKeyValue, false).append('|');
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18529);regex.setCharAt(regex.length()-1, ')');
            __CLR4_4_1e45e45ldniggiu.R.inc(18530);return true;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18531);
            __CLR4_4_1e45e45ldniggiu.R.inc(18532);final Integer iVal = keyValues.get(value);
            __CLR4_4_1e45e45ldniggiu.R.inc(18533);if((((iVal == null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18534)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18535)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18536);final StringBuilder sb= new StringBuilder(value);
                __CLR4_4_1e45e45ldniggiu.R.inc(18537);sb.append(" not in (");
                __CLR4_4_1e45e45ldniggiu.R.inc(18538);for(final String textKeyValue : keyValues.keySet()) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18539);sb.append(textKeyValue).append(' ');
                }
                }__CLR4_4_1e45e45ldniggiu.R.inc(18540);sb.setCharAt(sb.length()-1, ')');
                __CLR4_4_1e45e45ldniggiu.R.inc(18541);throw new IllegalArgumentException(sb.toString());
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18542);cal.set(field, iVal.intValue());
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    }


    /**
     * A strategy that handles a number field in the parsing pattern
     */
    private static class NumberStrategy extends Strategy {
        private final int field;

        /**
         * Construct a Strategy that parses a Number field
         * @param field The Calendar field
         */
        NumberStrategy(final int field) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18543);
             __CLR4_4_1e45e45ldniggiu.R.inc(18544);this.field= field;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_4_1e45e45ldniggiu.R.inc(18545);
            __CLR4_4_1e45e45ldniggiu.R.inc(18546);return true;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18547);
            __CLR4_4_1e45e45ldniggiu.R.inc(18548);if((((parser.isNextNumber())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18549)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18550)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18551);regex.append("(\\p{IsNd}{").append(parser.getFieldWidth()).append("}+)");
            }
            }else {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18552);regex.append("(\\p{IsNd}++)");
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18553);return true;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18554);
            __CLR4_4_1e45e45ldniggiu.R.inc(18555);cal.set(field, modify(Integer.parseInt(value)));
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * Make any modifications to parsed integer
         * @param iValue The parsed integer
         * @return The modified value
         */
        int modify(final int iValue) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18556);
            __CLR4_4_1e45e45ldniggiu.R.inc(18557);return iValue;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    }

    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR) {
        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18558);
            __CLR4_4_1e45e45ldniggiu.R.inc(18559);int iValue= Integer.parseInt(value);
            __CLR4_4_1e45e45ldniggiu.R.inc(18560);if((((iValue<100)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18561)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18562)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18563);iValue= parser.adjustYear(iValue);
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18564);cal.set(Calendar.YEAR, iValue);
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    };

    /**
     * A strategy that handles a timezone field in the parsing pattern
     */
    private static class TimeZoneStrategy extends Strategy {

        private final String validTimeZoneChars;
        private final SortedMap<String, TimeZone> tzNames= new TreeMap<String, TimeZone>(String.CASE_INSENSITIVE_ORDER);

        /**
         * Construct a Strategy that parses a TimeZone
         * @param locale The Locale
         */
        TimeZoneStrategy(final Locale locale) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18565);
            __CLR4_4_1e45e45ldniggiu.R.inc(18566);for(final String id : TimeZone.getAvailableIDs()) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18567);if((((id.startsWith("GMT"))&&(__CLR4_4_1e45e45ldniggiu.R.iget(18568)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18569)==0&false))) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18570);continue;
                }
                }__CLR4_4_1e45e45ldniggiu.R.inc(18571);final TimeZone tz= TimeZone.getTimeZone(id);
                __CLR4_4_1e45e45ldniggiu.R.inc(18572);tzNames.put(tz.getDisplayName(false, TimeZone.SHORT, locale), tz);
                __CLR4_4_1e45e45ldniggiu.R.inc(18573);tzNames.put(tz.getDisplayName(false, TimeZone.LONG, locale), tz);
                __CLR4_4_1e45e45ldniggiu.R.inc(18574);if((((tz.useDaylightTime())&&(__CLR4_4_1e45e45ldniggiu.R.iget(18575)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18576)==0&false))) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18577);tzNames.put(tz.getDisplayName(true, TimeZone.SHORT, locale), tz);
                    __CLR4_4_1e45e45ldniggiu.R.inc(18578);tzNames.put(tz.getDisplayName(true, TimeZone.LONG, locale), tz);
                }
            }}
            }__CLR4_4_1e45e45ldniggiu.R.inc(18579);final StringBuilder sb= new StringBuilder();
            __CLR4_4_1e45e45ldniggiu.R.inc(18580);sb.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            __CLR4_4_1e45e45ldniggiu.R.inc(18581);for(final String id : tzNames.keySet()) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18582);escapeRegex(sb, id, false).append('|');
            }
            }__CLR4_4_1e45e45ldniggiu.R.inc(18583);sb.setCharAt(sb.length()-1, ')');
            __CLR4_4_1e45e45ldniggiu.R.inc(18584);validTimeZoneChars= sb.toString();
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18585);
            __CLR4_4_1e45e45ldniggiu.R.inc(18586);regex.append(validTimeZoneChars);
            __CLR4_4_1e45e45ldniggiu.R.inc(18587);return true;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18588);
            __CLR4_4_1e45e45ldniggiu.R.inc(18589);TimeZone tz;
            __CLR4_4_1e45e45ldniggiu.R.inc(18590);if((((value.charAt(0)=='+' || value.charAt(0)=='-')&&(__CLR4_4_1e45e45ldniggiu.R.iget(18591)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18592)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18593);tz= TimeZone.getTimeZone("GMT"+value);
            }
            }else {__CLR4_4_1e45e45ldniggiu.R.inc(18594);if((((value.startsWith("GMT"))&&(__CLR4_4_1e45e45ldniggiu.R.iget(18595)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18596)==0&false))) {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18597);tz= TimeZone.getTimeZone(value);
            }
            }else {{
                __CLR4_4_1e45e45ldniggiu.R.inc(18598);tz= tzNames.get(value);
                __CLR4_4_1e45e45ldniggiu.R.inc(18599);if((((tz==null)&&(__CLR4_4_1e45e45ldniggiu.R.iget(18600)!=0|true))||(__CLR4_4_1e45e45ldniggiu.R.iget(18601)==0&false))) {{
                    __CLR4_4_1e45e45ldniggiu.R.inc(18602);throw new IllegalArgumentException(value + " is not a supported timezone name");
                }
            }}
            }}__CLR4_4_1e45e45ldniggiu.R.inc(18603);cal.setTimeZone(tz);
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    }

    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(Calendar.MONTH) {
        @Override
        int modify(final int iValue) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18604);
            __CLR4_4_1e45e45ldniggiu.R.inc(18605);return iValue-1;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_YEAR);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_MONTH);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.DAY_OF_YEAR);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_MONTH);
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_WEEK_IN_MONTH);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY);
    private static final Strategy MODULO_HOUR_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY) {
        @Override
        int modify(final int iValue) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18606);
            __CLR4_4_1e45e45ldniggiu.R.inc(18607);return iValue%24;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(Calendar.HOUR) {
        @Override
        int modify(final int iValue) {try{__CLR4_4_1e45e45ldniggiu.R.inc(18608);
            __CLR4_4_1e45e45ldniggiu.R.inc(18609);return iValue%12;
        }finally{__CLR4_4_1e45e45ldniggiu.R.flushNeeded();}}
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(Calendar.HOUR);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(Calendar.MINUTE);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(Calendar.SECOND);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(Calendar.MILLISECOND);
}
