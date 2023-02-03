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
import java.util.Locale;
import java.util.TimeZone;

/**
 * TestCase for DateFormatUtils.
 *
 */
public class DateFormatUtilsTest {static class __CLR4_4_1glugluldni851m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
@Test
public void format() {__CLR4_4_1glugluldni851m.R.globalSliceStart(getClass().getName(),21522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9imjmglu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glugluldni851m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glugluldni851m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.format",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9imjmglu(){try{__CLR4_4_1glugluldni851m.R.inc(21522); __CLR4_4_1glugluldni851m.R.inc(21523);Locale locale = Locale.ENGLISH; __CLR4_4_1glugluldni851m.R.inc(21524);Calendar cal = Calendar.getInstance(); __CLR4_4_1glugluldni851m.R.inc(21525);cal.setTimeZone(TimeZone.getTimeZone("Europe/London")); __CLR4_4_1glugluldni851m.R.inc(21526);cal.setTimeZone(TimeZone.getTimeZone("Europe/London")); __CLR4_4_1glugluldni851m.R.inc(21527);String str = DateFormatUtils.format(cal, "yyyy MMM d HH:mm:ss Z", locale); __CLR4_4_1glugluldni851m.R.inc(21528);assertEquals("2013 MMM d HH:mm:ss Z", str); __CLR4_4_1glugluldni851m.R.inc(21529);str = DateFormatUtils.format(cal, "yyyy MMM d HH:mm:ss Z", locale); __CLR4_4_1glugluldni851m.R.inc(21530);assertEquals("2013 MMM d HH:mm:ss Z", str); }finally{__CLR4_4_1glugluldni851m.R.flushNeeded();}}
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    

    

    

    

    

    /*
    public void testLang312() {
        String pattern = "dd/MM/yyyy";
        String expected = "19/04/1948";
        TimeZone timeZone = TimeZone.getTimeZone("CET");
        Locale locale = Locale.GERMANY;

        // show Calendar is good
        Calendar cal = Calendar.getInstance(timeZone, locale);
        cal.set(1948, 3, 19);
        assertEquals(expected, DateFormatUtils.format( cal.getTime(), pattern, timeZone, locale ) );

        Date date = new Date(48, 3, 19);

        // test JDK
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern, locale);
        sdf.setTimeZone(timeZone);
// There's nothing we can do if the JDK fails, so just going to pring a warning in this case
//        assertEquals(expected, sdf.format( date ) );
        if( ! expected.equals( sdf.format( date ) ) ) {
            System.out.println("WARNING: JDK test failed - testLang312()");
        }

        // test Commons
        assertEquals(expected, DateFormatUtils.format( date, pattern, timeZone, locale ) );
    }
    */

}
