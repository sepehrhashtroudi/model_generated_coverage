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

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * TestCase for DurationFormatUtils.
 * 
 */
public class DurationFormatUtilsTest {static class __CLR4_4_1gscgscldni852b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21794,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    /**
     * Tests that "1 <unit>s" gets converted to "1 <unit>" but that "11 <unit>s" is left alone.
     */
    

    

    

    

    

    

    


    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38401
    

    // https://issues.apache.org/jira/browse/LANG-281
    

    

    // Testing the under a day range in DurationFormatUtils.formatPeriod
    

    // Attempting to test edge cases in DurationFormatUtils.formatPeriod
    
    
    
    
    private static final int FOUR_YEARS = 365 * 3 + 366;
    
    // Takes a minute to run, so generally turned off
//    public void testBrutally() {
//        Calendar c = Calendar.getInstance();
//        c.set(2004, 0, 1, 0, 0, 0);
//        for (int i=0; i < FOUR_YEARS; i++) {
//            bruteForce(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), "d", Calendar.DAY_OF_MONTH );
//            c.add(Calendar.DAY_OF_MONTH, 1);
//        }
//    }        
    
    private void bruteForce(final int year, final int month, final int day, final String format, final int calendarType) {try{__CLR4_4_1gscgscldni852b.R.inc(21756);
        __CLR4_4_1gscgscldni852b.R.inc(21757);final String msg = year + "-" + month + "-" + day + " to ";
        __CLR4_4_1gscgscldni852b.R.inc(21758);final Calendar c = Calendar.getInstance();
        __CLR4_4_1gscgscldni852b.R.inc(21759);c.set(year, month, day, 0, 0, 0);
        __CLR4_4_1gscgscldni852b.R.inc(21760);final int[] array1 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_4_1gscgscldni852b.R.inc(21761);final int[] array2 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_4_1gscgscldni852b.R.inc(21762);for (int i=0; (((i < FOUR_YEARS)&&(__CLR4_4_1gscgscldni852b.R.iget(21763)!=0|true))||(__CLR4_4_1gscgscldni852b.R.iget(21764)==0&false)); i++) {{
            __CLR4_4_1gscgscldni852b.R.inc(21765);array2[0] = c.get(Calendar.YEAR);
            __CLR4_4_1gscgscldni852b.R.inc(21766);array2[1] = c.get(Calendar.MONTH);
            __CLR4_4_1gscgscldni852b.R.inc(21767);array2[2] = c.get(Calendar.DAY_OF_MONTH);
            __CLR4_4_1gscgscldni852b.R.inc(21768);final String tmpMsg = msg + array2[0] + "-" + array2[1] + "-" + array2[2] + " at ";
            __CLR4_4_1gscgscldni852b.R.inc(21769);assertEqualDuration( tmpMsg + i, Integer.toString(i), array1, array2, format );
            __CLR4_4_1gscgscldni852b.R.inc(21770);c.add(calendarType, 1);
        }
    }}finally{__CLR4_4_1gscgscldni852b.R.flushNeeded();}}

    private void assertEqualDuration(final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_4_1gscgscldni852b.R.inc(21771);
        __CLR4_4_1gscgscldni852b.R.inc(21772);assertEqualDuration(null, expected, start, end, format);
    }finally{__CLR4_4_1gscgscldni852b.R.flushNeeded();}}
    private void assertEqualDuration(final String message, final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_4_1gscgscldni852b.R.inc(21773);
        __CLR4_4_1gscgscldni852b.R.inc(21774);final Calendar cal1 = Calendar.getInstance();
        __CLR4_4_1gscgscldni852b.R.inc(21775);cal1.set(start[0], start[1], start[2], start[3], start[4], start[5]);
        __CLR4_4_1gscgscldni852b.R.inc(21776);cal1.set(Calendar.MILLISECOND, 0);
        __CLR4_4_1gscgscldni852b.R.inc(21777);final Calendar cal2 = Calendar.getInstance();
        __CLR4_4_1gscgscldni852b.R.inc(21778);cal2.set(end[0], end[1], end[2], end[3], end[4], end[5]);
        __CLR4_4_1gscgscldni852b.R.inc(21779);cal2.set(Calendar.MILLISECOND, 0);
        __CLR4_4_1gscgscldni852b.R.inc(21780);final long milli1 = cal1.getTime().getTime();
        __CLR4_4_1gscgscldni852b.R.inc(21781);final long milli2 = cal2.getTime().getTime();
        __CLR4_4_1gscgscldni852b.R.inc(21782);final String result = DurationFormatUtils.formatPeriod(milli1, milli2, format);
        __CLR4_4_1gscgscldni852b.R.inc(21783);if ((((message == null)&&(__CLR4_4_1gscgscldni852b.R.iget(21784)!=0|true))||(__CLR4_4_1gscgscldni852b.R.iget(21785)==0&false))) {{
            __CLR4_4_1gscgscldni852b.R.inc(21786);assertEquals(expected, result);
        } }else {{
            __CLR4_4_1gscgscldni852b.R.inc(21787);assertEquals(message, expected, result);
        }
    }}finally{__CLR4_4_1gscgscldni852b.R.flushNeeded();}}

    private void assertArrayEquals(final DurationFormatUtils.Token[] obj1, final DurationFormatUtils.Token[] obj2) {try{__CLR4_4_1gscgscldni852b.R.inc(21788);
        __CLR4_4_1gscgscldni852b.R.inc(21789);assertEquals("Arrays are unequal length. ", obj1.length, obj2.length);
        __CLR4_4_1gscgscldni852b.R.inc(21790);for (int i = 0; (((i < obj1.length)&&(__CLR4_4_1gscgscldni852b.R.iget(21791)!=0|true))||(__CLR4_4_1gscgscldni852b.R.iget(21792)==0&false)); i++) {{
            __CLR4_4_1gscgscldni852b.R.inc(21793);assertTrue("Index " + i + " not equal, " + obj1[i] + " vs " + obj2[i], obj1[i].equals(obj2[i]));
        }
    }}finally{__CLR4_4_1gscgscldni852b.R.flushNeeded();}}

}
