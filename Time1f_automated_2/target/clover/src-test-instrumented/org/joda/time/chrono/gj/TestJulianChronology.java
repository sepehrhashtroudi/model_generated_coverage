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

import org.joda.time.DateTimeField;

/**
 * A reference Julian chronology implementation, intended for testing purposes
 * only. Correctness is favored over performance. The key functions for date
 * calculations are based on ones provided in "Calendrical Calculations", ISBN
 * 0-521-77752-6.
 *
 * @author Brian S O'Neill
 */
public final class TestJulianChronology extends TestGJChronology {static class __CLR4_4_1l3fl3fle6nl8m5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,27436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long JULIAN_EPOCH;

    static {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27339);
        // Constant as defined in book.
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27340);JULIAN_EPOCH = new TestGregorianChronology().fixedFromGJ(0, 12, 30);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    /**
     * Constructs with an epoch of 1969-12-19.
     */
    public TestJulianChronology() {
        super(1969, 12, 19);__CLR4_4_1l3fl3fle6nl8m5.R.inc(27342);try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27341);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public TestJulianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1l3fl3fle6nl8m5.R.inc(27344);try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27343);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public DateTimeField dayOfMonth() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27345);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27346);return new TestJulianDayOfMonthField(this); 
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public DateTimeField weekyear() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27347);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27348);return new TestJulianWeekyearField(this);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public DateTimeField monthOfYear() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27349);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27350);return new TestJulianMonthOfYearField(this);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public DateTimeField year() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27351);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27352);return new TestJulianYearField(this);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27353);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27354);return "TestJulianChronology";
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27355);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27356);return (long)(365.25 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27357);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27358);return (long)(365.25 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27359);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27360);if ((((year == 0)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27361)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27362)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27363);throw new IllegalArgumentException("Illegal year: " + year);
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27364);return mod(year, 4) == ((((year > 0 )&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27365)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27366)==0&false))? 0 : 3);
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27367);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27368);if ((((year == 0)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27369)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27370)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27371);throw new IllegalArgumentException("Illegal year: " + year);
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27372);int y = ((((year < 0) )&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27373)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27374)==0&false))? year + 1 : year;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27375);long y_m1 = y - 1;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27376);long f = JULIAN_EPOCH - 1 + 365 * y_m1 + div(y_m1, 4)
            + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27377);if ((((monthOfYear > 2)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27378)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27379)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27380);f += (((isLeapYear(year) )&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27381)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27382)==0&false))? -1 : -2;
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27383);return f;
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27384);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27385);return gjFromFixed(date)[0];
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27386);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27387);long approx = div(4 * (date - JULIAN_EPOCH) + 1464, 1461);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27388);long year = ((((approx <= 0) )&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27389)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27390)==0&false))? approx - 1 : approx;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27391);int year_i = (int)year;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27392);if ((((year_i != year)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27393)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27394)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27395);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27396);long priorDays = date - fixedFromGJ(year_i, 1, 1);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27397);long correction;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27398);if ((((date < fixedFromGJ(year_i, 3, 1))&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27399)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27400)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27401);correction = 0;
        } }else {__CLR4_4_1l3fl3fle6nl8m5.R.inc(27402);if ((((isLeapYear(year_i))&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27403)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27404)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27405);correction = 1;
        } }else {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27406);correction = 2;
        }
        }}__CLR4_4_1l3fl3fle6nl8m5.R.inc(27407);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27408);int day = (int)(date - fixedFromGJ(year_i, monthOfYear, 1) + 1);

        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27409);return new int[]{year_i, monthOfYear, day};
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27410);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27411);if ((((weekyear == 0)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27412)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27413)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27414);throw new IllegalArgumentException("Illegal weekyear: " + weekyear);
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27415);if ((((weekyear == 1)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27416)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27417)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27418);weekyear = -1;
        } }else {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27419);weekyear--;
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27420);return nthWeekday(weekOfWeekyear, 0, weekyear, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1l3fl3fle6nl8m5.R.inc(27421);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27422);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27423);int nextWeekyear;
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27424);if ((((weekyear == -1)&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27425)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27426)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27427);nextWeekyear = 1;
        } }else {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27428);nextWeekyear = weekyear + 1;
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27429);if ((((date >= fixedFromISO(nextWeekyear, 1, 1))&&(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27430)!=0|true))||(__CLR4_4_1l3fl3fle6nl8m5.R.iget(27431)==0&false))) {{
            __CLR4_4_1l3fl3fle6nl8m5.R.inc(27432);weekyear = nextWeekyear;
        }
        }__CLR4_4_1l3fl3fle6nl8m5.R.inc(27433);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27434);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1l3fl3fle6nl8m5.R.inc(27435);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1l3fl3fle6nl8m5.R.flushNeeded();}}
}
