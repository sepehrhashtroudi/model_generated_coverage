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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1j15j15le6np4j8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1j15j15le6np4j8.R.inc(24665);
        __CLR4_4_1j15j15le6np4j8.R.inc(24666);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j15j15le6np4j8.R.inc(24667);
        __CLR4_4_1j15j15le6np4j8.R.inc(24668);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1j15j15le6np4j8.R.inc(24670);try{__CLR4_4_1j15j15le6np4j8.R.inc(24669);
    }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j15j15le6np4j8.R.inc(24671);
        __CLR4_4_1j15j15le6np4j8.R.inc(24672);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j15j15le6np4j8.R.inc(24673);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j15j15le6np4j8.R.inc(24674);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j15j15le6np4j8.R.inc(24675);originalLocale = Locale.getDefault();
        __CLR4_4_1j15j15le6np4j8.R.inc(24676);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j15j15le6np4j8.R.inc(24677);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j15j15le6np4j8.R.inc(24678);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j15j15le6np4j8.R.inc(24679);
        __CLR4_4_1j15j15le6np4j8.R.inc(24680);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j15j15le6np4j8.R.inc(24681);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j15j15le6np4j8.R.inc(24682);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j15j15le6np4j8.R.inc(24683);Locale.setDefault(originalLocale);
        __CLR4_4_1j15j15le6np4j8.R.inc(24684);originalDateTimeZone = null;
        __CLR4_4_1j15j15le6np4j8.R.inc(24685);originalTimeZone = null;
        __CLR4_4_1j15j15le6np4j8.R.inc(24686);originalLocale = null;
    }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetMillis_RI1449() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huhe27j1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huhe27j1r(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24687); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24688);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24689);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24690);test.setMillis(setter); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24691);assertEquals(2002, test.getYear()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24692);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24693);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24694);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24695);assertEquals(7, test.getMinuteOfHour()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24696);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24697);assertEquals(11, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testSetMilli_RI1450() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6r2amj22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilli_RI1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6r2amj22(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24698); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24699);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24700);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24701);test.setMillis(setter); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24702);assertEquals(2002, test.getYear()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24703);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24704);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24705);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24706);assertEquals(7, test.getMinuteOfHour()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24707);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24708);assertEquals(11, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testSetMonthOfYear_int_dstOverlapWinter_addZero454() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhcdtqj2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhcdtqj2d(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24709); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24710);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24711);test.addHours(1); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24712);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24713);test.setMonthOfYear(303); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24714);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testSetDayOfWeek_int_dstOverlapWinter_addZero455() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17qjp02j2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int_dstOverlapWinter_addZero455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17qjp02j2j(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24715); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24716);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24717);test.addHours(1); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24718);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24719);test.setDayOfWeek(3); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24720);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testAddHours_int_dstOverlapSummer_addZero456() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pp49aj2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testAddHours_int_dstOverlapSummer_addZero456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pp49aj2p(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24721); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24722);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24723);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24724);test.addHours(0); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24725);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testSetMinuteOfHour_int1457() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cv3yslj2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int1457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cv3yslj2u(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24726); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24727);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24728);test.setMinuteOfHour(13); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24729);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
public void testSetSecondOfMinute_int1459() {__CLR4_4_1j15j15le6np4j8.R.globalSliceStart(getClass().getName(),24730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l70b7j2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j15j15le6np4j8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j15j15le6np4j8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int1459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l70b7j2y(){try{__CLR4_4_1j15j15le6np4j8.R.inc(24730); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24731);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24732);test.setSecondOfMinute(13); 
     __CLR4_4_1j15j15le6np4j8.R.inc(24733);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1j15j15le6np4j8.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
            

    

    //-----------------------------------------------------------------------
            

            

    //-----------------------------------------------------------------------
            

            

            

            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    
    
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
