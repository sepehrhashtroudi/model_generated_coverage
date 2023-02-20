/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1ikfikfle6ndpl6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24094,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24063);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24064);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24065);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24066);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1ikfikfle6ndpl6.R.inc(24068);try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24067);
    }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24069);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24070);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24071);zone = DateTimeZone.getDefault();
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24072);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24073);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24074);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24075);DateTimeZone.setDefault(zone);
        __CLR4_4_1ikfikfle6ndpl6.R.inc(24076);zone = null;
    }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToMonth290() {__CLR4_4_1ikfikfle6ndpl6.R.globalSliceStart(getClass().getName(),24077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqlc7rikt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikfikfle6ndpl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikfikfle6ndpl6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testPropertyCompareToMonth290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqlc7rikt(){try{__CLR4_4_1ikfikfle6ndpl6.R.inc(24077); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24078);LocalDate test1 = new LocalDate(TEST_TIME1); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24079);LocalDate test2 = new LocalDate(TEST_TIME2); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24080);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24081);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24082);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24083);try { 
         __CLR4_4_1ikfikfle6ndpl6.R.inc(24084);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1ikfikfle6ndpl6.R.inc(24085);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24086);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24087);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24088);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24089);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24090);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1ikfikfle6ndpl6.R.inc(24091);try { 
         __CLR4_4_1ikfikfle6ndpl6.R.inc(24092);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ikfikfle6ndpl6.R.inc(24093);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ikfikfle6ndpl6.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
