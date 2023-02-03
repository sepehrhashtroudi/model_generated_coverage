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

/**
 * A reference Gregorian chronology implementation, intended for testing
 * purposes only. Correctness is favored over performance. The key functions
 * for date calculations are based on ones provided in "Calendrical
 * Calculations", ISBN 0-521-77752-6.
 *
 * @author Brian S O'Neill
 */
public final class TestGregorianChronology extends TestGJChronology {static class __CLR4_4_1iw7iw7ldl911io{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,24564,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs with an epoch of 1970-01-01.
     */
    public TestGregorianChronology() {
        super(1970, 1, 1);__CLR4_4_1iw7iw7ldl911io.R.inc(24488);try{__CLR4_4_1iw7iw7ldl911io.R.inc(24487);
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    public TestGregorianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1iw7iw7ldl911io.R.inc(24490);try{__CLR4_4_1iw7iw7ldl911io.R.inc(24489);
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24491);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24492);return "TestGregorianChronology";
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24493);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24494);return (long)(365.2425 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24495);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24496);return (long)(365.2425 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24497);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24498);if ((((mod(year, 4) == 0)&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24499)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24500)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24501);int t = (int)mod(year, 400);
            __CLR4_4_1iw7iw7ldl911io.R.inc(24502);if ((((t != 100 && t != 200 && t != 300)&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24503)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24504)==0&false))) {{
                __CLR4_4_1iw7iw7ldl911io.R.inc(24505);return true;
            }
        }}
        }__CLR4_4_1iw7iw7ldl911io.R.inc(24506);return false;
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24507);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24508);long year_m1 = year - 1;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24509);long f = 365 * year_m1 + div(year_m1, 4) - div(year_m1, 100)
            + div(year_m1, 400) + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24510);if ((((monthOfYear > 2)&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24511)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24512)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24513);f += (((isLeapYear(year) )&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24514)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24515)==0&false))? -1 : -2;
        }
        }__CLR4_4_1iw7iw7ldl911io.R.inc(24516);return f;
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24517);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24518);long d0 = date - 1;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24519);long n400 = div(d0, 146097);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24520);long d1 = mod(d0, 146097);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24521);long n100 = div(d1, 36524);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24522);long d2 = mod(d1, 36524);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24523);long n4 = div(d2, 1461);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24524);long d3 = mod(d2, 1461);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24525);long n1 = div(d3, 365);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24526);long year = 400 * n400 + 100 * n100 + 4 * n4 + n1;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24527);if ((((!(n100 == 4 || n1 == 4))&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24528)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24529)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24530);year += 1;
        }

        }__CLR4_4_1iw7iw7ldl911io.R.inc(24531);int year_i = (int)year;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24532);if ((((year_i == year)&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24533)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24534)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24535);return year_i;
        } }else {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24536);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
    }}finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24537);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24538);int year = gjYearFromFixed(date);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24539);long priorDays = date - fixedFromGJ(year, 1, 1);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24540);long correction;
        __CLR4_4_1iw7iw7ldl911io.R.inc(24541);if ((((date < fixedFromGJ(year, 3, 1))&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24542)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24543)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24544);correction = 0;
        } }else {__CLR4_4_1iw7iw7ldl911io.R.inc(24545);if ((((isLeapYear(year))&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24546)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24547)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24548);correction = 1;
        } }else {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24549);correction = 2;
        }
        }}__CLR4_4_1iw7iw7ldl911io.R.inc(24550);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24551);int day = (int)(date - fixedFromGJ(year, monthOfYear, 1) + 1);

        __CLR4_4_1iw7iw7ldl911io.R.inc(24552);return new int[]{year, monthOfYear, day};
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24553);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24554);return nthWeekday(weekOfWeekyear, 0, weekyear - 1, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1iw7iw7ldl911io.R.inc(24555);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24556);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24557);if ((((date >= fixedFromISO(weekyear + 1, 1, 1))&&(__CLR4_4_1iw7iw7ldl911io.R.iget(24558)!=0|true))||(__CLR4_4_1iw7iw7ldl911io.R.iget(24559)==0&false))) {{
            __CLR4_4_1iw7iw7ldl911io.R.inc(24560);weekyear += 1;
        }
        }__CLR4_4_1iw7iw7ldl911io.R.inc(24561);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24562);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1iw7iw7ldl911io.R.inc(24563);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1iw7iw7ldl911io.R.flushNeeded();}}
}
