/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1kijkijlc8axdwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,26734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26587);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26588);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26589);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26590);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1kijkijlc8axdwx.R.inc(26592);try{__CLR4_4_1kijkijlc8axdwx.R.inc(26591);
    }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26593);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26594);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26595);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kijkijlc8axdwx.R.inc(26596);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kijkijlc8axdwx.R.inc(26597);originalLocale = Locale.getDefault();
        __CLR4_4_1kijkijlc8axdwx.R.inc(26598);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26599);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1kijkijlc8axdwx.R.inc(26600);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26601);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26602);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kijkijlc8axdwx.R.inc(26603);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26604);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26605);Locale.setDefault(originalLocale);
        __CLR4_4_1kijkijlc8axdwx.R.inc(26606);originalDateTimeZone = null;
        __CLR4_4_1kijkijlc8axdwx.R.inc(26607);originalTimeZone = null;
        __CLR4_4_1kijkijlc8axdwx.R.inc(26608);originalLocale = null;
    }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RI_RP6325() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ckruykj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP6325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ckruykj5() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26609); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26610);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26611);Interval test = new Interval(dt, (ReadablePeriod) null); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26612);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26613);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_RD_RI3599() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4zfbqkja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI3599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4zfbqkja() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26614); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26615);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26616);Interval test = new Interval((ReadableDuration) null, dt); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26617);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26618);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_long_long2646() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvg2t1kjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long2646",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvg2t1kjf() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26619); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26620);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26621);Interval test = new Interval(dt1.getMillis(), dt1.getMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26622);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26623);assertEquals(dt1.getMillis(), test.getEndMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26624);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_Object4759() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxd8jgkjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object4759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxd8jgkjl() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26625); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26626);MockInterval base = new MockInterval(); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26627);Interval test = new Interval(base); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26628);assertEquals(base.getStartMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26629);assertEquals(base.getEndMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_RI_RD4807() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3g9g5kjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD4807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3g9g5kjq() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26630); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26631);long result = TEST_TIME_NOW; 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26632);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26633);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26634);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26635);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26636);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26637);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_RI_RP71027() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w8fylkjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP71027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w8fylkjy() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26638); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26639);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26640);long result = TEST_TIME_NOW; 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26641);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26642);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26643);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26644);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26645);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_long_long_nullZone1132() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7r3tckk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullZone1132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7r3tckk6() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26646); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26647);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26648);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26649);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26650);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26651);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26652);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_Object61323() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sej87ekkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object61323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sej87ekkd() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26653); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26654);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L)); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26655);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26656); 
             __CLR4_4_1kijkijlc8axdwx.R.inc(26657);return false; 
         }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26658); 
             __CLR4_4_1kijkijlc8axdwx.R.inc(26659);interval.setChronology(chrono); 
             __CLR4_4_1kijkijlc8axdwx.R.inc(26660);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26661); 
             __CLR4_4_1kijkijlc8axdwx.R.inc(26662);return ReadableInterval.class; 
         }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 
     }; 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26663);try { 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26664);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26665);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26666);Interval test = new Interval(base); 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26667);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26668);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26669);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_RP_RI81530() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18l8eynkku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI81530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18l8eynkku() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26670); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26671);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26672);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26673);try { 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26674);new Interval(dur, dt); 
         __CLR4_4_1kijkijlc8axdwx.R.inc(26675);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_Object_Chronology21636() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ud784gkl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology21636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ud784gkl0() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26676); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26677);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26678);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26679);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26680);Interval test = new Interval(base, null); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26681);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26682);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26683);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testConstructor_RI_RI31654() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b6yzukl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI31654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b6yzukl8() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26684); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26685);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26686);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26687);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 


public void testParse_noFormatter1752() throws Throwable {__CLR4_4_1kijkijlc8axdwx.R.globalSliceStart(getClass().getName(),26688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fmgydklc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kijkijlc8axdwx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kijkijlc8axdwx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_noFormatter1752",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fmgydklc() throws Throwable{try{__CLR4_4_1kijkijlc8axdwx.R.inc(26688); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26689);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26690);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26691);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26692);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1kijkijlc8axdwx.R.inc(26693);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26694);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26695);return ISOChronology.getInstance();
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26696);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26697);return 1234L;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26698);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26699);return new DateTime(1234L);
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26700);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26701);return 5678L;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26702);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26703);return new DateTime(5678L);
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26704);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26705);return (5678L - 1234L);
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26706);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26707);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26708);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26709);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26710);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26711);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26712);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26713);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26714);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26715);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26716);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26717);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26718);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26719);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26720);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26721);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26722);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26723);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26724);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26725);return false;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26726);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26727);return null;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26728);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26729);return null;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26730);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26731);return null;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1kijkijlc8axdwx.R.inc(26732);
            __CLR4_4_1kijkijlc8axdwx.R.inc(26733);return null;
        }finally{__CLR4_4_1kijkijlc8axdwx.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
