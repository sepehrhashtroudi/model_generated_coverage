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
public final class TestGregorianChronology extends TestGJChronology {static class __CLR4_4_1qtsqtsle6rcmqn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,34845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs with an epoch of 1970-01-01.
     */
    public TestGregorianChronology() {
        super(1970, 1, 1);__CLR4_4_1qtsqtsle6rcmqn.R.inc(34769);try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34768);
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    public TestGregorianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1qtsqtsle6rcmqn.R.inc(34771);try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34770);
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34772);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34773);return "TestGregorianChronology";
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34774);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34775);return (long)(365.2425 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34776);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34777);return (long)(365.2425 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34778);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34779);if ((((mod(year, 4) == 0)&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34780)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34781)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34782);int t = (int)mod(year, 400);
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34783);if ((((t != 100 && t != 200 && t != 300)&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34784)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34785)==0&false))) {{
                __CLR4_4_1qtsqtsle6rcmqn.R.inc(34786);return true;
            }
        }}
        }__CLR4_4_1qtsqtsle6rcmqn.R.inc(34787);return false;
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34788);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34789);long year_m1 = year - 1;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34790);long f = 365 * year_m1 + div(year_m1, 4) - div(year_m1, 100)
            + div(year_m1, 400) + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34791);if ((((monthOfYear > 2)&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34792)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34793)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34794);f += (((isLeapYear(year) )&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34795)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34796)==0&false))? -1 : -2;
        }
        }__CLR4_4_1qtsqtsle6rcmqn.R.inc(34797);return f;
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34798);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34799);long d0 = date - 1;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34800);long n400 = div(d0, 146097);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34801);long d1 = mod(d0, 146097);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34802);long n100 = div(d1, 36524);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34803);long d2 = mod(d1, 36524);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34804);long n4 = div(d2, 1461);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34805);long d3 = mod(d2, 1461);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34806);long n1 = div(d3, 365);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34807);long year = 400 * n400 + 100 * n100 + 4 * n4 + n1;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34808);if ((((!(n100 == 4 || n1 == 4))&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34809)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34810)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34811);year += 1;
        }

        }__CLR4_4_1qtsqtsle6rcmqn.R.inc(34812);int year_i = (int)year;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34813);if ((((year_i == year)&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34814)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34815)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34816);return year_i;
        } }else {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34817);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
    }}finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34818);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34819);int year = gjYearFromFixed(date);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34820);long priorDays = date - fixedFromGJ(year, 1, 1);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34821);long correction;
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34822);if ((((date < fixedFromGJ(year, 3, 1))&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34823)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34824)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34825);correction = 0;
        } }else {__CLR4_4_1qtsqtsle6rcmqn.R.inc(34826);if ((((isLeapYear(year))&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34827)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34828)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34829);correction = 1;
        } }else {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34830);correction = 2;
        }
        }}__CLR4_4_1qtsqtsle6rcmqn.R.inc(34831);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34832);int day = (int)(date - fixedFromGJ(year, monthOfYear, 1) + 1);

        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34833);return new int[]{year, monthOfYear, day};
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34834);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34835);return nthWeekday(weekOfWeekyear, 0, weekyear - 1, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1qtsqtsle6rcmqn.R.inc(34836);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34837);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34838);if ((((date >= fixedFromISO(weekyear + 1, 1, 1))&&(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34839)!=0|true))||(__CLR4_4_1qtsqtsle6rcmqn.R.iget(34840)==0&false))) {{
            __CLR4_4_1qtsqtsle6rcmqn.R.inc(34841);weekyear += 1;
        }
        }__CLR4_4_1qtsqtsle6rcmqn.R.inc(34842);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34843);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1qtsqtsle6rcmqn.R.inc(34844);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1qtsqtsle6rcmqn.R.flushNeeded();}}
}
