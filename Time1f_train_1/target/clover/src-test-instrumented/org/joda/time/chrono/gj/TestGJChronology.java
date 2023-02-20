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
abstract class TestGJChronology extends BaseChronology {static class __CLR4_4_1qprqprle6qeagf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,34718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

    /**
     * Divide with round-negative behavior.
     *
     * @param divisor must be positive
     */
    static long div(long dividend, long divisor) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34623);
        __CLR4_4_1qprqprle6qeagf.R.inc(34624);if ((((divisor < 0)&&(__CLR4_4_1qprqprle6qeagf.R.iget(34625)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34626)==0&false))) {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34627);throw new IllegalArgumentException("divisor must be positive: " + divisor);
        }
        }__CLR4_4_1qprqprle6qeagf.R.inc(34628);if ((((dividend >= 0)&&(__CLR4_4_1qprqprle6qeagf.R.iget(34629)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34630)==0&false))) {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34631);return dividend / divisor;
        } }else {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34632);return (dividend + 1) / divisor - 1;
        }
    }}finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * Modulus with round-negative behavior, result is always positive.
     *
     * @param divisor must be positive
     */
    static long mod(long dividend, long divisor) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34633);
        __CLR4_4_1qprqprle6qeagf.R.inc(34634);if ((((divisor < 0)&&(__CLR4_4_1qprqprle6qeagf.R.iget(34635)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34636)==0&false))) {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34637);throw new IllegalArgumentException("divisor must be positive: " + divisor);
        }
        }__CLR4_4_1qprqprle6qeagf.R.inc(34638);if ((((dividend >= 0)&&(__CLR4_4_1qprqprle6qeagf.R.iget(34639)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34640)==0&false))) {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34641);return dividend % divisor;
        } }else {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34642);return (dividend + 1) % divisor - 1 + divisor;
        }
    }}finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    static long amod(long dividend, long divisor) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34643);
        __CLR4_4_1qprqprle6qeagf.R.inc(34644);long mod = mod(dividend, divisor);
        __CLR4_4_1qprqprle6qeagf.R.inc(34645);return ((((mod == 0) )&&(__CLR4_4_1qprqprle6qeagf.R.iget(34646)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34647)==0&false))? divisor : mod;
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /** Milliseconds from 0001-01-01 to the epoch. */
    private final long iEpochMillis;

    public TestGJChronology(int epochYear, int epochMonth, int epochDay) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34648);
        __CLR4_4_1qprqprle6qeagf.R.inc(34649);iEpochMillis = fixedFromGJ(epochYear, epochMonth, epochDay) * MILLIS_PER_DAY;
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34650);
        __CLR4_4_1qprqprle6qeagf.R.inc(34651);return null;
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34652);
        __CLR4_4_1qprqprle6qeagf.R.inc(34653);return this;
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * Unsupported.
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34654);
        __CLR4_4_1qprqprle6qeagf.R.inc(34655);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long getTimeOnlyMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34656);
        __CLR4_4_1qprqprle6qeagf.R.inc(34657);return mod(millis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long getDateOnlyMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34658);
        __CLR4_4_1qprqprle6qeagf.R.inc(34659);return millis - mod(millis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DurationField days() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34660);
        __CLR4_4_1qprqprle6qeagf.R.inc(34661);return dayOfWeek().getDurationField();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField dayOfWeek() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34662);
        __CLR4_4_1qprqprle6qeagf.R.inc(34663);return new TestGJDayOfWeekField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField dayOfMonth() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34664);
        __CLR4_4_1qprqprle6qeagf.R.inc(34665);return new TestGJDayOfMonthField(this); 
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField dayOfYear() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34666);
        __CLR4_4_1qprqprle6qeagf.R.inc(34667);return new TestGJDayOfYearField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DurationField weeks() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34668);
        __CLR4_4_1qprqprle6qeagf.R.inc(34669);return weekOfWeekyear().getDurationField();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField weekOfWeekyear() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34670);
        __CLR4_4_1qprqprle6qeagf.R.inc(34671);return new TestGJWeekOfWeekyearField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DurationField weekyears() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34672);
        __CLR4_4_1qprqprle6qeagf.R.inc(34673);return weekyear().getDurationField();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField weekyear() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34674);
        __CLR4_4_1qprqprle6qeagf.R.inc(34675);return new TestGJWeekyearField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DurationField months() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34676);
        __CLR4_4_1qprqprle6qeagf.R.inc(34677);return monthOfYear().getDurationField();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField monthOfYear() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34678);
        __CLR4_4_1qprqprle6qeagf.R.inc(34679);return new TestGJMonthOfYearField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DurationField years() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34680);
        __CLR4_4_1qprqprle6qeagf.R.inc(34681);return year().getDurationField();
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    public DateTimeField year() {try{__CLR4_4_1qprqprle6qeagf.R.inc(34682);
        __CLR4_4_1qprqprle6qeagf.R.inc(34683);return new TestGJYearField(this);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

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
    long fixedFromMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34684);
        __CLR4_4_1qprqprle6qeagf.R.inc(34685);return div(millis + iEpochMillis, MILLIS_PER_DAY);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @param fixed days from 0001-01-01
     * @return milliseconds from epoch
     */
    long millisFromFixed(long fixed) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34686);
        __CLR4_4_1qprqprle6qeagf.R.inc(34687);return fixed * MILLIS_PER_DAY - iEpochMillis;
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @return milliseconds from epoch
     */
    long millisFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34688);
        __CLR4_4_1qprqprle6qeagf.R.inc(34689);return millisFromFixed(fixedFromGJ(year, monthOfYear, dayOfMonth));
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return gj year
     */
    int gjYearFromMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34690);
        __CLR4_4_1qprqprle6qeagf.R.inc(34691);return gjYearFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34692);
        __CLR4_4_1qprqprle6qeagf.R.inc(34693);return gjFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @return milliseconds from epoch
     */
    long millisFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34694);
        __CLR4_4_1qprqprle6qeagf.R.inc(34695);return millisFromFixed(fixedFromISO(weekyear, weekOfWeekyear, dayOfWeek));
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @param millis milliseconds from epoch
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromMillis(long millis) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34696);
        __CLR4_4_1qprqprle6qeagf.R.inc(34697);return isoFromFixed(fixedFromMillis(millis));
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @param weekday 0=Sunday, 1=Monday, 2=Tuesday ... 6=Saturday, 7=Sunday
     * @param date days from 0001-01-01, on or before weekday
     */
    long weekdayOnOrBefore(long date, int weekday) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34698);
        __CLR4_4_1qprqprle6qeagf.R.inc(34699);return date - mod(date - mod(weekday, 7), 7);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long weekdayOnOrAfter(long date, int weekday) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34700);
        __CLR4_4_1qprqprle6qeagf.R.inc(34701);return weekdayOnOrBefore(date + 6, weekday);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long weekdayNearest(long date, int weekday) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34702);
        __CLR4_4_1qprqprle6qeagf.R.inc(34703);return weekdayOnOrBefore(date + 3, weekday);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long weekdayBefore(long date, int weekday) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34704);
        __CLR4_4_1qprqprle6qeagf.R.inc(34705);return weekdayOnOrBefore(date - 1, weekday);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long weekdayAfter(long date, int weekday) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34706);
        __CLR4_4_1qprqprle6qeagf.R.inc(34707);return weekdayOnOrBefore(date + 7, weekday);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long nthWeekday(int n, int weekday,
                    int year, int monthOfYear, int dayOfMonth)
    {try{__CLR4_4_1qprqprle6qeagf.R.inc(34708);
        __CLR4_4_1qprqprle6qeagf.R.inc(34709);if ((((n > 0)&&(__CLR4_4_1qprqprle6qeagf.R.iget(34710)!=0|true))||(__CLR4_4_1qprqprle6qeagf.R.iget(34711)==0&false))) {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34712);return 7 * n + weekdayBefore
                (fixedFromGJ(year, monthOfYear, dayOfMonth), weekday);
        } }else {{
            __CLR4_4_1qprqprle6qeagf.R.inc(34713);return 7 * n + weekdayAfter
                (fixedFromGJ(year, monthOfYear, dayOfMonth), weekday);
        }
    }}finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long firstWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34714);
        __CLR4_4_1qprqprle6qeagf.R.inc(34715);return nthWeekday(1, weekday, year, monthOfYear, dayOfMonth);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}

    long lastWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1qprqprle6qeagf.R.inc(34716);
        __CLR4_4_1qprqprle6qeagf.R.inc(34717);return nthWeekday(-1, weekday, year, monthOfYear, dayOfMonth);
    }finally{__CLR4_4_1qprqprle6qeagf.R.flushNeeded();}}
}
