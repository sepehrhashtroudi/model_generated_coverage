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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1m8um8ule6qsf3z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28830);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28831);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28832);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28833);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1m8um8ule6qsf3z.R.inc(28835);try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28834);
    }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28836);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28837);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28838);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28839);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28840);originalLocale = Locale.getDefault();
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28841);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28842);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28843);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28844);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28845);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28846);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28847);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28848);Locale.setDefault(originalLocale);
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28849);originalDateTimeZone = null;
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28850);originalTimeZone = null;
        __CLR4_4_1m8um8ule6qsf3z.R.inc(28851);originalLocale = null;
    }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetMonthOfYear_int_dstOverlapSummer_addZero235() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tea8crm9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tea8crm9g(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28852); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28853);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28854);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28855);test.setMonthOfYear(10); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28856);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetDateTime_int_int_int_int_int_int_int1504() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127rek6m9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127rek6m9l(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28857); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28858);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28859);test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28860);assertEquals(2010, test.getYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28861);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28862);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28863);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28864);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28865);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28866);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapSummer_addZero614() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k564b1m9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k564b1m9v(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28867); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28868);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28869);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28870);test.setDayOfMonth(30); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28871);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone1902() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s681gdma0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1902",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s681gdma0(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28872); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28873);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28874);test.setZoneRetainFields(PARIS); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28875);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28876);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone31007() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i6jqkma5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone31007",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i6jqkma5(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28877); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28878);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28879);test.setZoneRetainFields(null); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28880);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28881);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetMillis_RI11015() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vckhnmaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI11015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vckhnmaa(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28882); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28883);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28884);test.setMillis(new Instant(TEST_TIME2)); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28885);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28886);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetZone_DateTimeZone11021() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dthpwmaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone11021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dthpwmaf(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28887); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28888);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28889);test.setZone(PARIS); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28890);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28891);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone21022() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbjjv0mak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone21022",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbjjv0mak(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28892); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28893);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28894);test.setZoneRetainFields(null); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28895);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28896);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int21023() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nvjhbmap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int21023",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nvjhbmap(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28897); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28898);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28899);try { 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28900);test.set(null, 0); 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28901);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28902);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetYear_int11025() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8urulmav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int11025",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8urulmav(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28903); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28904);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28905);test.setYear(2010); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28906);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetMonthOfYear_int_dstOverlapWinter_addZero1028() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sk362gmaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero1028",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sk362gmaz(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28907); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28908);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28909);test.addHours(1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28910);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28911);test.setMonthOfYear(10); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28912);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetWeekOfWeekyear_int21031() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164monumb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int21031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164monumb5(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28913); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28914);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28915);try { 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28916);test.setWeekOfWeekyear(53); 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28917);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28918);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetDayOfYear_int_dstOverlapWinter_addZero1034() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzsfkpmbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero1034",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzsfkpmbb(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28919); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28920);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28921);test.addHours(1); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28922);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28923);test.setDayOfYear(303); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28924);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetDayOfWeek_int11035() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3l3tambh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int11035",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3l3tambh(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28925); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28926);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28927);test.setDayOfWeek(5); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28928);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetHourOfDay_int21038() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0no7wmbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int21038",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0no7wmbl(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28929); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28930);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28931);try { 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28932);test.setHourOfDay(24); 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28933);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28934);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetMinuteOfHour_int21039() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgiuk1mbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int21039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgiuk1mbr(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28935); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28936);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28937);try { 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28938);test.setMinuteOfHour(60); 
         __CLR4_4_1m8um8ule6qsf3z.R.inc(28939);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28940);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetSecondOfDay_int11041() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqodr7mbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int11041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqodr7mbx(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28941); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28942);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28943);test.setSecondOfDay(13); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28944);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetSecondOfMinute_int11042() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4k2wmmc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int11042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4k2wmmc1(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28945); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28946);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28947);test.setSecondOfMinute(13); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28948);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetDate_RI_same1047() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v2cs6mc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same1047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v2cs6mc5(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28949); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28950);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28951);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28952);test.setDate(setter); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28953);assertEquals(2010, test.getYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28954);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28955);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28956);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28957);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28958);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28959);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetTime_RI11048() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6eatamcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI11048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6eatamcg(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28960); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28961);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28962);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28963);test.setTime(setter); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28964);assertEquals(2002, test.getYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28965);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28966);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28967);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28968);assertEquals(7, test.getMinuteOfHour()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28969);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28970);assertEquals(11, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 


public void testSetTime_int_int_int_int11049() {__CLR4_4_1m8um8ule6qsf3z.R.globalSliceStart(getClass().getName(),28971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14n7avzmcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8um8ule6qsf3z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8um8ule6qsf3z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int11049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14n7avzmcr(){try{__CLR4_4_1m8um8ule6qsf3z.R.inc(28971); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28972);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28973);test.setTime(5, 6, 7, 8); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28974);assertEquals(2002, test.getYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28975);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28976);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28977);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28978);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28979);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1m8um8ule6qsf3z.R.inc(28980);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8um8ule6qsf3z.R.flushNeeded();}} 

    

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
