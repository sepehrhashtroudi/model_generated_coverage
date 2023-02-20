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
public final class TestGregorianChronology extends TestGJChronology {static class __CLR4_4_1qzdqzdle6rjdfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,35046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs with an epoch of 1970-01-01.
     */
    public TestGregorianChronology() {
        super(1970, 1, 1);__CLR4_4_1qzdqzdle6rjdfs.R.inc(34970);try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34969);
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    public TestGregorianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1qzdqzdle6rjdfs.R.inc(34972);try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34971);
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34973);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34974);return "TestGregorianChronology";
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34975);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34976);return (long)(365.2425 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34977);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34978);return (long)(365.2425 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34979);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34980);if ((((mod(year, 4) == 0)&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34981)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34982)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(34983);int t = (int)mod(year, 400);
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(34984);if ((((t != 100 && t != 200 && t != 300)&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34985)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34986)==0&false))) {{
                __CLR4_4_1qzdqzdle6rjdfs.R.inc(34987);return true;
            }
        }}
        }__CLR4_4_1qzdqzdle6rjdfs.R.inc(34988);return false;
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34989);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34990);long year_m1 = year - 1;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34991);long f = 365 * year_m1 + div(year_m1, 4) - div(year_m1, 100)
            + div(year_m1, 400) + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(34992);if ((((monthOfYear > 2)&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34993)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34994)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(34995);f += (((isLeapYear(year) )&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34996)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(34997)==0&false))? -1 : -2;
        }
        }__CLR4_4_1qzdqzdle6rjdfs.R.inc(34998);return f;
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(34999);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35000);long d0 = date - 1;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35001);long n400 = div(d0, 146097);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35002);long d1 = mod(d0, 146097);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35003);long n100 = div(d1, 36524);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35004);long d2 = mod(d1, 36524);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35005);long n4 = div(d2, 1461);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35006);long d3 = mod(d2, 1461);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35007);long n1 = div(d3, 365);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35008);long year = 400 * n400 + 100 * n100 + 4 * n4 + n1;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35009);if ((((!(n100 == 4 || n1 == 4))&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35010)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35011)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35012);year += 1;
        }

        }__CLR4_4_1qzdqzdle6rjdfs.R.inc(35013);int year_i = (int)year;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35014);if ((((year_i == year)&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35015)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35016)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35017);return year_i;
        } }else {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35018);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
    }}finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(35019);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35020);int year = gjYearFromFixed(date);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35021);long priorDays = date - fixedFromGJ(year, 1, 1);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35022);long correction;
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35023);if ((((date < fixedFromGJ(year, 3, 1))&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35024)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35025)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35026);correction = 0;
        } }else {__CLR4_4_1qzdqzdle6rjdfs.R.inc(35027);if ((((isLeapYear(year))&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35028)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35029)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35030);correction = 1;
        } }else {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35031);correction = 2;
        }
        }}__CLR4_4_1qzdqzdle6rjdfs.R.inc(35032);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35033);int day = (int)(date - fixedFromGJ(year, monthOfYear, 1) + 1);

        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35034);return new int[]{year, monthOfYear, day};
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(35035);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35036);return nthWeekday(weekOfWeekyear, 0, weekyear - 1, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1qzdqzdle6rjdfs.R.inc(35037);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35038);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35039);if ((((date >= fixedFromISO(weekyear + 1, 1, 1))&&(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35040)!=0|true))||(__CLR4_4_1qzdqzdle6rjdfs.R.iget(35041)==0&false))) {{
            __CLR4_4_1qzdqzdle6rjdfs.R.inc(35042);weekyear += 1;
        }
        }__CLR4_4_1qzdqzdle6rjdfs.R.inc(35043);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35044);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1qzdqzdle6rjdfs.R.inc(35045);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1qzdqzdle6rjdfs.R.flushNeeded();}}
}
