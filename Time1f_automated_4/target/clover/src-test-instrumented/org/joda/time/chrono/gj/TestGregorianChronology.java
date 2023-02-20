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
public final class TestGregorianChronology extends TestGJChronology {static class __CLR4_4_1ktdktdle6o7a7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs with an epoch of 1970-01-01.
     */
    public TestGregorianChronology() {
        super(1970, 1, 1);__CLR4_4_1ktdktdle6o7a7q.R.inc(26978);try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26977);
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    public TestGregorianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_1ktdktdle6o7a7q.R.inc(26980);try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26979);
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26981);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26982);return "TestGregorianChronology";
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26983);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26984);return (long)(365.2425 * MILLIS_PER_DAY);
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26985);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26986);return (long)(365.2425 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26987);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26988);if ((((mod(year, 4) == 0)&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(26989)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(26990)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(26991);int t = (int)mod(year, 400);
            __CLR4_4_1ktdktdle6o7a7q.R.inc(26992);if ((((t != 100 && t != 200 && t != 300)&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(26993)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(26994)==0&false))) {{
                __CLR4_4_1ktdktdle6o7a7q.R.inc(26995);return true;
            }
        }}
        }__CLR4_4_1ktdktdle6o7a7q.R.inc(26996);return false;
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(26997);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26998);long year_m1 = year - 1;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(26999);long f = 365 * year_m1 + div(year_m1, 4) - div(year_m1, 100)
            + div(year_m1, 400) + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27000);if ((((monthOfYear > 2)&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27001)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27002)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27003);f += (((isLeapYear(year) )&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27004)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27005)==0&false))? -1 : -2;
        }
        }__CLR4_4_1ktdktdle6o7a7q.R.inc(27006);return f;
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(27007);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27008);long d0 = date - 1;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27009);long n400 = div(d0, 146097);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27010);long d1 = mod(d0, 146097);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27011);long n100 = div(d1, 36524);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27012);long d2 = mod(d1, 36524);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27013);long n4 = div(d2, 1461);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27014);long d3 = mod(d2, 1461);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27015);long n1 = div(d3, 365);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27016);long year = 400 * n400 + 100 * n100 + 4 * n4 + n1;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27017);if ((((!(n100 == 4 || n1 == 4))&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27018)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27019)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27020);year += 1;
        }

        }__CLR4_4_1ktdktdle6o7a7q.R.inc(27021);int year_i = (int)year;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27022);if ((((year_i == year)&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27023)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27024)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27025);return year_i;
        } }else {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27026);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
    }}finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(27027);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27028);int year = gjYearFromFixed(date);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27029);long priorDays = date - fixedFromGJ(year, 1, 1);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27030);long correction;
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27031);if ((((date < fixedFromGJ(year, 3, 1))&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27032)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27033)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27034);correction = 0;
        } }else {__CLR4_4_1ktdktdle6o7a7q.R.inc(27035);if ((((isLeapYear(year))&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27036)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27037)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27038);correction = 1;
        } }else {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27039);correction = 2;
        }
        }}__CLR4_4_1ktdktdle6o7a7q.R.inc(27040);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27041);int day = (int)(date - fixedFromGJ(year, monthOfYear, 1) + 1);

        __CLR4_4_1ktdktdle6o7a7q.R.inc(27042);return new int[]{year, monthOfYear, day};
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(27043);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27044);return nthWeekday(weekOfWeekyear, 0, weekyear - 1, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_1ktdktdle6o7a7q.R.inc(27045);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27046);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27047);if ((((date >= fixedFromISO(weekyear + 1, 1, 1))&&(__CLR4_4_1ktdktdle6o7a7q.R.iget(27048)!=0|true))||(__CLR4_4_1ktdktdle6o7a7q.R.iget(27049)==0&false))) {{
            __CLR4_4_1ktdktdle6o7a7q.R.inc(27050);weekyear += 1;
        }
        }__CLR4_4_1ktdktdle6o7a7q.R.inc(27051);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27052);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_1ktdktdle6o7a7q.R.inc(27053);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_1ktdktdle6o7a7q.R.flushNeeded();}}
}
