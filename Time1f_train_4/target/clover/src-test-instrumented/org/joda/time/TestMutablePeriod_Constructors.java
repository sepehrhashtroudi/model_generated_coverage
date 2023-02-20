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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1msamsale6rjcuy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1msamsale6rjcuy.R.inc(29530);
        __CLR4_4_1msamsale6rjcuy.R.inc(29531);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1msamsale6rjcuy.R.inc(29532);
        __CLR4_4_1msamsale6rjcuy.R.inc(29533);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1msamsale6rjcuy.R.inc(29535);try{__CLR4_4_1msamsale6rjcuy.R.inc(29534);
    }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1msamsale6rjcuy.R.inc(29536);
        __CLR4_4_1msamsale6rjcuy.R.inc(29537);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1msamsale6rjcuy.R.inc(29538);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1msamsale6rjcuy.R.inc(29539);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1msamsale6rjcuy.R.inc(29540);originalLocale = Locale.getDefault();
        __CLR4_4_1msamsale6rjcuy.R.inc(29541);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1msamsale6rjcuy.R.inc(29542);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1msamsale6rjcuy.R.inc(29543);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1msamsale6rjcuy.R.inc(29544);
        __CLR4_4_1msamsale6rjcuy.R.inc(29545);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1msamsale6rjcuy.R.inc(29546);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1msamsale6rjcuy.R.inc(29547);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1msamsale6rjcuy.R.inc(29548);Locale.setDefault(originalLocale);
        __CLR4_4_1msamsale6rjcuy.R.inc(29549);originalDateTimeZone = null;
        __CLR4_4_1msamsale6rjcuy.R.inc(29550);originalTimeZone = null;
        __CLR4_4_1msamsale6rjcuy.R.inc(29551);originalLocale = null;
    }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_long_long_Chronology1306() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s33br2msw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology1306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s33br2msw() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29552); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29553);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29554);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29555);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29556);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29557);assertEquals(1, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29558);assertEquals(1, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29559);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29560);assertEquals(1, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29561);assertEquals(1, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29562);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29563);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29564);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_long_long1516() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c15gt4mt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c15gt4mt9() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29565); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29566);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29567);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29568);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29569);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29570);assertEquals(1, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29571);assertEquals(1, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29572);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29573);assertEquals(1, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29574);assertEquals(1, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29575);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29576);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29577);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_RI_RI5841() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2bzsfmtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5841",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2bzsfmtm() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29578); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29579);DateTime dt1 = null; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29580);DateTime dt2 = null; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29581);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29582);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29583);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29584);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29585);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29586);assertEquals(0, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29587);assertEquals(0, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29588);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29589);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29590);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_RI_RD_PeriodType1846() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twlwx3mtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType1846",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twlwx3mtz() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29591); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29592);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29593);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29594);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29595);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.yearDayTime()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29596);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29597);assertEquals(1, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29598);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29599);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29600);assertEquals(31, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29601);assertEquals(1, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29602);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29603);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29604);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testParse_noFormatter1190() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fg1t87mud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter1190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fg1t87mud() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29605); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29606);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 890), MutablePeriod.parse("P1Y2M3W4DT5H6M7.890S")); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology21198() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dw5jlkmuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology21198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dw5jlkmuf() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29607); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29608);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29609);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29610);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29611);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29612);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29613);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29614);assertEquals(4, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29615);assertEquals(5, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29616);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29617);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29618);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_RI_RI31199() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kq6i6mur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI31199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kq6i6mur() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29619); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29620);DateTime dt1 = null; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29621);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29622);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29623);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29624);assertEquals(3, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29625);assertEquals(1, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29626);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29627);assertEquals(1, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29628);assertEquals(0, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29629);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29630);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29631);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_RI_RI_PeriodType21200() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6hxugmv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType21200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6hxugmv4() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29632); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29633);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29634);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29635);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.dayTime()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29636);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29637);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29638);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29639);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29640);assertEquals(31, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29641);assertEquals(1, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29642);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29643);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29644);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_RI_RD21201() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7tvx4mvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD21201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7tvx4mvh() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29645); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29646);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29647);Duration dur = null; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29648);MutablePeriod test = new MutablePeriod(dt1, dur); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29649);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29650);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29651);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29652);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29653);assertEquals(0, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29654);assertEquals(0, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29655);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29656);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29657);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType41203() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144eurfmvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType41203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144eurfmvu() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29658); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29659);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29660);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29661);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29662);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29663);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29664);assertEquals(0, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29665);assertEquals(1, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29666);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29667);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29668);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 


public void testConstructor_Object_Chronology21204() throws Throwable {__CLR4_4_1msamsale6rjcuy.R.globalSliceStart(getClass().getName(),29669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ea5ecdmw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msamsale6rjcuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msamsale6rjcuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology21204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ea5ecdmw5() throws Throwable{try{__CLR4_4_1msamsale6rjcuy.R.inc(29669); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29670);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1msamsale6rjcuy.R.inc(29671);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29672);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29673);assertEquals(0, test.getYears()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29674);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29675);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29676);assertEquals(2, test.getDays()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29677);assertEquals(5, test.getHours()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29678);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29679);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1msamsale6rjcuy.R.inc(29680);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msamsale6rjcuy.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

}
