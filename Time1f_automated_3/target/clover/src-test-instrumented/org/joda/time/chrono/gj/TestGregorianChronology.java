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
public final class TestGregorianChronology extends TestGJChronology {static class __CLR4_4_1kwrkwrle6np4r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27176,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs with an epoch of 1970-01-01.
     */
    public TestGregorianChronology() {
        super(1970, 1, 1);__CLR4_4_1kwrkwrle6np4r7.R.inc(27100);try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27099);
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    public TestGregorianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1kwrkwrle6np4r7.R.inc(27102);try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27101);
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27103);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27104);return "TestGregorianChronology";
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27105);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27106);return (long)(365.2425 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27107);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27108);return (long)(365.2425 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27109);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27110);if ((((mod(year, 4) == 0)&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27111)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27112)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27113);int t = (int)mod(year, 400);
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27114);if ((((t != 100 && t != 200 && t != 300)&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27115)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27116)==0&false))) {{
                __CLR4_4_1kwrkwrle6np4r7.R.inc(27117);return true;
            }
        }}
        }__CLR4_4_1kwrkwrle6np4r7.R.inc(27118);return false;
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27119);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27120);long year_m1 = year - 1;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27121);long f = 365 * year_m1 + div(year_m1, 4) - div(year_m1, 100)
            + div(year_m1, 400) + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27122);if ((((monthOfYear > 2)&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27123)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27124)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27125);f += (((isLeapYear(year) )&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27126)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27127)==0&false))? -1 : -2;
        }
        }__CLR4_4_1kwrkwrle6np4r7.R.inc(27128);return f;
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27129);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27130);long d0 = date - 1;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27131);long n400 = div(d0, 146097);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27132);long d1 = mod(d0, 146097);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27133);long n100 = div(d1, 36524);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27134);long d2 = mod(d1, 36524);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27135);long n4 = div(d2, 1461);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27136);long d3 = mod(d2, 1461);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27137);long n1 = div(d3, 365);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27138);long year = 400 * n400 + 100 * n100 + 4 * n4 + n1;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27139);if ((((!(n100 == 4 || n1 == 4))&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27140)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27141)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27142);year += 1;
        }

        }__CLR4_4_1kwrkwrle6np4r7.R.inc(27143);int year_i = (int)year;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27144);if ((((year_i == year)&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27145)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27146)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27147);return year_i;
        } }else {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27148);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
    }}finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27149);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27150);int year = gjYearFromFixed(date);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27151);long priorDays = date - fixedFromGJ(year, 1, 1);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27152);long correction;
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27153);if ((((date < fixedFromGJ(year, 3, 1))&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27154)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27155)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27156);correction = 0;
        } }else {__CLR4_4_1kwrkwrle6np4r7.R.inc(27157);if ((((isLeapYear(year))&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27158)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27159)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27160);correction = 1;
        } }else {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27161);correction = 2;
        }
        }}__CLR4_4_1kwrkwrle6np4r7.R.inc(27162);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27163);int day = (int)(date - fixedFromGJ(year, monthOfYear, 1) + 1);

        __CLR4_4_1kwrkwrle6np4r7.R.inc(27164);return new int[]{year, monthOfYear, day};
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27165);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27166);return nthWeekday(weekOfWeekyear, 0, weekyear - 1, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1kwrkwrle6np4r7.R.inc(27167);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27168);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27169);if ((((date >= fixedFromISO(weekyear + 1, 1, 1))&&(__CLR4_4_1kwrkwrle6np4r7.R.iget(27170)!=0|true))||(__CLR4_4_1kwrkwrle6np4r7.R.iget(27171)==0&false))) {{
            __CLR4_4_1kwrkwrle6np4r7.R.inc(27172);weekyear += 1;
        }
        }__CLR4_4_1kwrkwrle6np4r7.R.inc(27173);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27174);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1kwrkwrle6np4r7.R.inc(27175);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1kwrkwrle6np4r7.R.flushNeeded();}}
}
