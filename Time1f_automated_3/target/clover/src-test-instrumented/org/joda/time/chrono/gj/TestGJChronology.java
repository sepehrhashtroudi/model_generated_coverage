/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.chrono.gj;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BaseChronology;

/**
 * A reference Gregorian/Julian chronology implementation, intended for testing
 * purposes only. Correctness is favored over performance. The key functions
 * for date calculations are based on ones provided in "Calendrical
 * Calculations", ISBN 0-521-77752-6.
 *
 * <p>In theory, this class can be used to test any other Gregorian/Julian
 * chronology as long as almost all datetime fields are implemented differently
 * between the two. Fields that would most likely be implemented the same are
 * not supported by this class.
 *
 * <p>Unsupported features
 * <ul>
 * <li>time zones
 * <li>time of day
 * <li>year of era
 * <li>year of century
 * <li>century of era
 * <li>era
 * </ul>
 *
 * @author Brian S O'Neill
 */
abstract class TestGJChronology extends BaseChronology {static class __CLR4_4_1kofkofle6np4qa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,26894,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

    /**
     * Divide with round-negative behavior.
     *
     * @param divisor must be positive
     */
    static long div(long dividend, long divisor) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26799);
        __CLR4_4_1kofkofle6np4qa.R.inc(26800);if ((((divisor < 0)&&(__CLR4_4_1kofkofle6np4qa.R.iget(26801)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26802)==0&false))) {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26803);throw new IllegalArgumentException("divisor must be positive: " + divisor);
        }
        }__CLR4_4_1kofkofle6np4qa.R.inc(26804);if ((((dividend >= 0)&&(__CLR4_4_1kofkofle6np4qa.R.iget(26805)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26806)==0&false))) {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26807);return dividend / divisor;
        } }else {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26808);return (dividend + 1) / divisor - 1;
        }
    }}finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * Modulus with round-negative behavior, result is always positive.
     *
     * @param divisor must be positive
     */
    static long mod(long dividend, long divisor) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26809);
        __CLR4_4_1kofkofle6np4qa.R.inc(26810);if ((((divisor < 0)&&(__CLR4_4_1kofkofle6np4qa.R.iget(26811)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26812)==0&false))) {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26813);throw new IllegalArgumentException("divisor must be positive: " + divisor);
        }
        }__CLR4_4_1kofkofle6np4qa.R.inc(26814);if ((((dividend >= 0)&&(__CLR4_4_1kofkofle6np4qa.R.iget(26815)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26816)==0&false))) {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26817);return dividend % divisor;
        } }else {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26818);return (dividend + 1) % divisor - 1 + divisor;
        }
    }}finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    static long amod(long dividend, long divisor) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26819);
        __CLR4_4_1kofkofle6np4qa.R.inc(26820);long mod = mod(dividend, divisor);
        __CLR4_4_1kofkofle6np4qa.R.inc(26821);return ((((mod == 0) )&&(__CLR4_4_1kofkofle6np4qa.R.iget(26822)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26823)==0&false))? divisor : mod;
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /** Milliseconds from 0001-01-01 to the epoch. */
    private final long iEpochMillis;

    public TestGJChronology(int epochYear, int epochMonth, int epochDay) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26824);
        __CLR4_4_1kofkofle6np4qa.R.inc(26825);iEpochMillis = fixedFromGJ(epochYear, epochMonth, epochDay) * MILLIS_PER_DAY;
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26826);
        __CLR4_4_1kofkofle6np4qa.R.inc(26827);return null;
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26828);
        __CLR4_4_1kofkofle6np4qa.R.inc(26829);return this;
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * Unsupported.
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26830);
        __CLR4_4_1kofkofle6np4qa.R.inc(26831);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long getTimeOnlyMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26832);
        __CLR4_4_1kofkofle6np4qa.R.inc(26833);return mod(millis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long getDateOnlyMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26834);
        __CLR4_4_1kofkofle6np4qa.R.inc(26835);return millis - mod(millis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DurationField days() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26836);
        __CLR4_4_1kofkofle6np4qa.R.inc(26837);return dayOfWeek().getDurationField();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField dayOfWeek() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26838);
        __CLR4_4_1kofkofle6np4qa.R.inc(26839);return new TestGJDayOfWeekField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField dayOfMonth() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26840);
        __CLR4_4_1kofkofle6np4qa.R.inc(26841);return new TestGJDayOfMonthField(this); 
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField dayOfYear() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26842);
        __CLR4_4_1kofkofle6np4qa.R.inc(26843);return new TestGJDayOfYearField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DurationField weeks() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26844);
        __CLR4_4_1kofkofle6np4qa.R.inc(26845);return weekOfWeekyear().getDurationField();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField weekOfWeekyear() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26846);
        __CLR4_4_1kofkofle6np4qa.R.inc(26847);return new TestGJWeekOfWeekyearField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DurationField weekyears() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26848);
        __CLR4_4_1kofkofle6np4qa.R.inc(26849);return weekyear().getDurationField();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField weekyear() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26850);
        __CLR4_4_1kofkofle6np4qa.R.inc(26851);return new TestGJWeekyearField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DurationField months() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26852);
        __CLR4_4_1kofkofle6np4qa.R.inc(26853);return monthOfYear().getDurationField();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField monthOfYear() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26854);
        __CLR4_4_1kofkofle6np4qa.R.inc(26855);return new TestGJMonthOfYearField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DurationField years() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26856);
        __CLR4_4_1kofkofle6np4qa.R.inc(26857);return year().getDurationField();
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    public DateTimeField year() {try{__CLR4_4_1kofkofle6np4qa.R.inc(26858);
        __CLR4_4_1kofkofle6np4qa.R.inc(26859);return new TestGJYearField(this);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    abstract long millisPerYear();

    abstract long millisPerMonth();

    abstract boolean isLeapYear(int year);

    /**
     * @return days from 0001-01-01
     */
    abstract long fixedFromGJ(int year, int monthOfYear, int dayOfMonth);

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    abstract int gjYearFromFixed(long date);

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    abstract int[] gjFromFixed(long date);

    abstract long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek);

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    abstract int[] isoFromFixed(long date);

    /**
     * @param millis milliseconds from epoch
     * @return days from 0001-01-01
     */
    long fixedFromMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26860);
        __CLR4_4_1kofkofle6np4qa.R.inc(26861);return div(millis + iEpochMillis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @param fixed days from 0001-01-01
     * @return milliseconds from epoch
     */
    long millisFromFixed(long fixed) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26862);
        __CLR4_4_1kofkofle6np4qa.R.inc(26863);return fixed * MILLIS_PER_DAY - iEpochMillis;
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @return milliseconds from epoch
     */
    long millisFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26864);
        __CLR4_4_1kofkofle6np4qa.R.inc(26865);return millisFromFixed(fixedFromGJ(year, monthOfYear, dayOfMonth));
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return gj year
     */
    int gjYearFromMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26866);
        __CLR4_4_1kofkofle6np4qa.R.inc(26867);return gjYearFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26868);
        __CLR4_4_1kofkofle6np4qa.R.inc(26869);return gjFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @return milliseconds from epoch
     */
    long millisFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26870);
        __CLR4_4_1kofkofle6np4qa.R.inc(26871);return millisFromFixed(fixedFromISO(weekyear, weekOfWeekyear, dayOfWeek));
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromMillis(long millis) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26872);
        __CLR4_4_1kofkofle6np4qa.R.inc(26873);return isoFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @param weekday 0=Sunday, 1=Monday, 2=Tuesday ... 6=Saturday, 7=Sunday
     * @param date days from 0001-01-01, on or before weekday
     */
    long weekdayOnOrBefore(long date, int weekday) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26874);
        __CLR4_4_1kofkofle6np4qa.R.inc(26875);return date - mod(date - mod(weekday, 7), 7);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long weekdayOnOrAfter(long date, int weekday) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26876);
        __CLR4_4_1kofkofle6np4qa.R.inc(26877);return weekdayOnOrBefore(date + 6, weekday);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long weekdayNearest(long date, int weekday) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26878);
        __CLR4_4_1kofkofle6np4qa.R.inc(26879);return weekdayOnOrBefore(date + 3, weekday);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long weekdayBefore(long date, int weekday) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26880);
        __CLR4_4_1kofkofle6np4qa.R.inc(26881);return weekdayOnOrBefore(date - 1, weekday);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long weekdayAfter(long date, int weekday) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26882);
        __CLR4_4_1kofkofle6np4qa.R.inc(26883);return weekdayOnOrBefore(date + 7, weekday);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long nthWeekday(int n, int weekday,
                    int year, int monthOfYear, int dayOfMonth)
    {try{__CLR4_4_1kofkofle6np4qa.R.inc(26884);
        __CLR4_4_1kofkofle6np4qa.R.inc(26885);if ((((n > 0)&&(__CLR4_4_1kofkofle6np4qa.R.iget(26886)!=0|true))||(__CLR4_4_1kofkofle6np4qa.R.iget(26887)==0&false))) {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26888);return 7 * n + weekdayBefore
                (fixedFromGJ(year, monthOfYear, dayOfMonth), weekday);
        } }else {{
            __CLR4_4_1kofkofle6np4qa.R.inc(26889);return 7 * n + weekdayAfter
                (fixedFromGJ(year, monthOfYear, dayOfMonth), weekday);
        }
    }}finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long firstWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26890);
        __CLR4_4_1kofkofle6np4qa.R.inc(26891);return nthWeekday(1, weekday, year, monthOfYear, dayOfMonth);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}

    long lastWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1kofkofle6np4qa.R.inc(26892);
        __CLR4_4_1kofkofle6np4qa.R.inc(26893);return nthWeekday(-1, weekday, year, monthOfYear, dayOfMonth);
    }finally{__CLR4_4_1kofkofle6np4qa.R.flushNeeded();}}
}
