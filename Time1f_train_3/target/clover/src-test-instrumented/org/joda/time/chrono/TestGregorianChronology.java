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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {static class __CLR4_4_1px0px0le6rcmip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,33635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1px0px0le6rcmip.R.inc(33588);
        __CLR4_4_1px0px0le6rcmip.R.inc(33589);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1px0px0le6rcmip.R.inc(33590);
        __CLR4_4_1px0px0le6rcmip.R.inc(33591);return new TestSuite(TestGregorianChronology.class);
    }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}}

    public TestGregorianChronology(String name) {
        super(name);__CLR4_4_1px0px0le6rcmip.R.inc(33593);try{__CLR4_4_1px0px0le6rcmip.R.inc(33592);
    }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1px0px0le6rcmip.R.inc(33594);
        __CLR4_4_1px0px0le6rcmip.R.inc(33595);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1px0px0le6rcmip.R.inc(33596);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1px0px0le6rcmip.R.inc(33597);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1px0px0le6rcmip.R.inc(33598);originalLocale = Locale.getDefault();
        __CLR4_4_1px0px0le6rcmip.R.inc(33599);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1px0px0le6rcmip.R.inc(33600);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1px0px0le6rcmip.R.inc(33601);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1px0px0le6rcmip.R.inc(33602);
        __CLR4_4_1px0px0le6rcmip.R.inc(33603);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1px0px0le6rcmip.R.inc(33604);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1px0px0le6rcmip.R.inc(33605);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1px0px0le6rcmip.R.inc(33606);Locale.setDefault(originalLocale);
        __CLR4_4_1px0px0le6rcmip.R.inc(33607);originalDateTimeZone = null;
        __CLR4_4_1px0px0le6rcmip.R.inc(33608);originalTimeZone = null;
        __CLR4_4_1px0px0le6rcmip.R.inc(33609);originalLocale = null;
    }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMaximumValue269() {__CLR4_4_1px0px0le6rcmip.R.globalSliceStart(getClass().getName(),33610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2ax89pxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1px0px0le6rcmip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1px0px0le6rcmip.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testMaximumValue269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2ax89pxm(){try{__CLR4_4_1px0px0le6rcmip.R.inc(33610); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33611);YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33612);DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33613);Chronology chrono = GregorianChronology.getInstance(); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33614);assertEquals(28, chrono.dayOfMonth().getMaximumValue(ymd1)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33615);assertEquals(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis())); 
 }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}} 


public void testToString817() {__CLR4_4_1px0px0le6rcmip.R.globalSliceStart(getClass().getName(),33616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1vjd3pxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1px0px0le6rcmip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1px0px0le6rcmip.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString817",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1vjd3pxs(){try{__CLR4_4_1px0px0le6rcmip.R.inc(33616); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33617);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33618);assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33619);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString()); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33620);assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33621);assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}} 


public void testEquality904() {__CLR4_4_1px0px0le6rcmip.R.globalSliceStart(getClass().getName(),33622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qq40zspxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1px0px0le6rcmip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1px0px0le6rcmip.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality904",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qq40zspxy(){try{__CLR4_4_1px0px0le6rcmip.R.inc(33622); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33623);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33624);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33625);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33626);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33627);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}} 


public void testWithZone905() {__CLR4_4_1px0px0le6rcmip.R.globalSliceStart(getClass().getName(),33628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tyn29py4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1px0px0le6rcmip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1px0px0le6rcmip.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithZone905",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tyn29py4(){try{__CLR4_4_1px0px0le6rcmip.R.inc(33628); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33629);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33630);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33631);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33632);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33633);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1px0px0le6rcmip.R.inc(33634);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1px0px0le6rcmip.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
