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
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1nmxnmxlc8axe95{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30633);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30634);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30635);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30636);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1nmxnmxlc8axe95.R.inc(30638);try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30637);
    }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30639);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30640);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30641);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30642);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30643);originalLocale = Locale.getDefault();
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30644);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30645);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30646);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30647);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30648);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30649);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30650);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30651);Locale.setDefault(originalLocale);
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30652);originalDateTimeZone = null;
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30653);originalTimeZone = null;
        __CLR4_4_1nmxnmxlc8axe95.R.inc(30654);originalLocale = null;
    }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_4int1362() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgg5o7nnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_4int1362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgg5o7nnj() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30655); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30656);MutablePeriod test = new MutablePeriod(5, 6, 7, 8); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30657);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30658);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30659);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30660);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30661);assertEquals(0, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30662);assertEquals(5, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30663);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30664);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30665);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_Object_Chronology2450() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15g5u7vnnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology2450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15g5u7vnnu() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30666); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30667);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30668);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30669);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30670);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30671);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30672);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30673);assertEquals(2, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30674);assertEquals(5, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30675);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30676);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30677);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_long_Chronology2517() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn24wcno6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology2517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn24wcno6() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30678); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30679);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30680);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30681);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30682);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30683);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30684);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30685);assertEquals(4, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30686);assertEquals(5, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30687);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30688);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30689);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_RI_RD_PeriodType1642() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6bfhdnoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType1642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6bfhdnoi() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30690); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30691);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30692);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30693);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30694);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.yearDayTime()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30695);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30696);assertEquals(1, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30697);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30698);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30699);assertEquals(31, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30700);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30701);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30702);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30703);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology2687() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k432rqnow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology2687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k432rqnow() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30704); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30705);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30706);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30707);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30708);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30709);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30710);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30711);assertEquals(4, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30712);assertEquals(5, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30713);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30714);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30715);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_RI_RI5834() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3gzmbnp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5834",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3gzmbnp8() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30716); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30717);DateTime dt1 = null; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30718);DateTime dt2 = null; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30719);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30720);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30721);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30722);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30723);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30724);assertEquals(0, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30725);assertEquals(0, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30726);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30727);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30728);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType_Chronology1949() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ldsknnpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology1949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ldsknnpl() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30729); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30730);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30731);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30732);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30733);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30734);assertEquals(1, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30735);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30736);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30737);assertEquals(1, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30738);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30739);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30740);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30741);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType4965() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2t2flnpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType4965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2t2flnpy() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30742); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30743);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30744);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30745);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30746);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30747);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30748);assertEquals(0, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30749);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30750);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30751);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30752);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_long_long11049() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nziacnq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long11049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nziacnq9() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30753); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30754);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30755);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30756);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30757);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30758);assertEquals(1, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30759);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30760);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30761);assertEquals(1, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30762);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30763);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30764);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30765);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_RI_RI31425() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwya4onqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI31425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwya4onqm() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30766); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30767);DateTime dt1 = null; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30768);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30769);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30770);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30771);assertEquals(3, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30772);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30773);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30774);assertEquals(1, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30775);assertEquals(0, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30776);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30777);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30778);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType21509() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxnydwnqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType21509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxnydwnqz() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30779); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30780);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30781);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30782);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30783);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30784);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30785);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30786);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30787);assertEquals(31, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30788);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30789);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30790);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30791);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_RI_RI_PeriodType21685() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6m72hnrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType21685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6m72hnrc() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30792); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30793);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30794);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30795);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.dayTime()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30796);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30797);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30798);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30799);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30800);assertEquals(31, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30801);assertEquals(1, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30802);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30803);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30804);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 


public void testConstructor_RI_RD21738() throws Throwable {__CLR4_4_1nmxnmxlc8axe95.R.globalSliceStart(getClass().getName(),30805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1am376nnrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nmxnmxlc8axe95.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nmxnmxlc8axe95.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD21738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1am376nnrp() throws Throwable{try{__CLR4_4_1nmxnmxlc8axe95.R.inc(30805); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30806);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30807);Duration dur = null; 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30808);MutablePeriod test = new MutablePeriod(dt1, dur); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30809);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30810);assertEquals(0, test.getYears()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30811);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30812);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30813);assertEquals(0, test.getDays()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30814);assertEquals(0, test.getHours()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30815);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30816);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nmxnmxlc8axe95.R.inc(30817);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nmxnmxlc8axe95.R.flushNeeded();}} 

    

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
