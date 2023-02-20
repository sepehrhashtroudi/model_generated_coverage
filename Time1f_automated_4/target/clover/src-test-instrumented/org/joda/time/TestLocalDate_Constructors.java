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
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1i9li9lle6o79tj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23714,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i9li9lle6o79tj.R.inc(23673);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23674);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i9li9lle6o79tj.R.inc(23675);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23676);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1i9li9lle6o79tj.R.inc(23678);try{__CLR4_4_1i9li9lle6o79tj.R.inc(23677);
    }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i9li9lle6o79tj.R.inc(23679);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23680);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23681);zone = DateTimeZone.getDefault();
        __CLR4_4_1i9li9lle6o79tj.R.inc(23682);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i9li9lle6o79tj.R.inc(23683);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23684);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i9li9lle6o79tj.R.inc(23685);DateTimeZone.setDefault(zone);
        __CLR4_4_1i9li9lle6o79tj.R.inc(23686);zone = null;
    }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_fromCalendarFields_Calendar272() throws Exception {__CLR4_4_1i9li9lle6o79tj.R.globalSliceStart(getClass().getName(),23687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbv4v3i9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9li9lle6o79tj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9li9lle6o79tj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_Calendar272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbv4v3i9z() throws Exception{try{__CLR4_4_1i9li9lle6o79tj.R.inc(23687); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23688);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23689);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23690);LocalDate expected = new LocalDate(1970, 2, 3); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23691);assertEquals(expected, LocalDate.fromCalendarFields(cal)); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23692);try { 
         __CLR4_4_1i9li9lle6o79tj.R.inc(23693);LocalDate.fromCalendarFields((Calendar) null); 
         __CLR4_4_1i9li9lle6o79tj.R.inc(23694);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}
public void testConstructor_nullDateTimeZone274() throws Throwable {__CLR4_4_1i9li9lle6o79tj.R.globalSliceStart(getClass().getName(),23695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mb8cmnia7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9li9lle6o79tj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9li9lle6o79tj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullDateTimeZone274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mb8cmnia7() throws Throwable{try{__CLR4_4_1i9li9lle6o79tj.R.inc(23695); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23696);LocalDate test = new LocalDate((DateTimeZone) null); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23697);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23698);assertEquals(1970, test.getYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23699);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23700);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}
public void testConstructor_DateTimeZone275() throws Throwable {__CLR4_4_1i9li9lle6o79tj.R.globalSliceStart(getClass().getName(),23701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1n94piad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9li9lle6o79tj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9li9lle6o79tj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1n94piad() throws Throwable{try{__CLR4_4_1i9li9lle6o79tj.R.inc(23701); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23702);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23703);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23704);LocalDate test = new LocalDate(LONDON); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23705);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23706);assertEquals(2005, test.getYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23707);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23708);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23709);test = new LocalDate(PARIS); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23710);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23711);assertEquals(2005, test.getYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23712);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1i9li9lle6o79tj.R.inc(23713);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1i9li9lle6o79tj.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
