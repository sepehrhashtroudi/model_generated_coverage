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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestChronology extends TestCase {static class __CLR4_4_1guagualccieth0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,21856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

//    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1guagualccieth0.R.inc(21826);
        __CLR4_4_1guagualccieth0.R.inc(21827);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1guagualccieth0.R.inc(21828);
        __CLR4_4_1guagualccieth0.R.inc(21829);return new TestSuite(TestChronology.class);
    }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}

    public TestChronology(String name) {
        super(name);__CLR4_4_1guagualccieth0.R.inc(21831);try{__CLR4_4_1guagualccieth0.R.inc(21830);
    }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1guagualccieth0.R.inc(21832);
        __CLR4_4_1guagualccieth0.R.inc(21833);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1guagualccieth0.R.inc(21834);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1guagualccieth0.R.inc(21835);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1guagualccieth0.R.inc(21836);originalLocale = Locale.getDefault();
        __CLR4_4_1guagualccieth0.R.inc(21837);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1guagualccieth0.R.inc(21838);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1guagualccieth0.R.inc(21839);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1guagualccieth0.R.inc(21840);
        __CLR4_4_1guagualccieth0.R.inc(21841);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1guagualccieth0.R.inc(21842);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1guagualccieth0.R.inc(21843);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1guagualccieth0.R.inc(21844);Locale.setDefault(originalLocale);
        __CLR4_4_1guagualccieth0.R.inc(21845);originalDateTimeZone = null;
        __CLR4_4_1guagualccieth0.R.inc(21846);originalTimeZone = null;
        __CLR4_4_1guagualccieth0.R.inc(21847);originalLocale = null;
    }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_setHourOfDay21() {__CLR4_4_1guagualccieth0.R.globalSliceStart(getClass().getName(),21848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxj4r2guw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1guagualccieth0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1guagualccieth0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.test_setHourOfDay21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxj4r2guw(){try{__CLR4_4_1guagualccieth0.R.inc(21848); 
     __CLR4_4_1guagualccieth0.R.inc(21849);Chronology zone = StrictChronology.getInstance(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1guagualccieth0.R.inc(21850);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     __CLR4_4_1guagualccieth0.R.inc(21851);assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1guagualccieth0.R.inc(21852);dt = dt.withHourOfDay(24); 
     __CLR4_4_1guagualccieth0.R.inc(21853);assertEquals("2007-01-02T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1guagualccieth0.R.inc(21854);dt = dt.withHourOfDay(-1); 
     __CLR4_4_1guagualccieth0.R.inc(21855);assertEquals("2007-01-01T23:00:00.000Z", dt.toString()); 
 }finally{__CLR4_4_1guagualccieth0.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
