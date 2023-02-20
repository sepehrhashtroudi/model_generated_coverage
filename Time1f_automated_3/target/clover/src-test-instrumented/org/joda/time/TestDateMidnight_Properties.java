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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1h11h11le6np4ba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1h11h11le6np4ba.R.inc(22069);
        __CLR4_4_1h11h11le6np4ba.R.inc(22070);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h11h11le6np4ba.R.inc(22071);
        __CLR4_4_1h11h11le6np4ba.R.inc(22072);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1h11h11le6np4ba.R.inc(22074);try{__CLR4_4_1h11h11le6np4ba.R.inc(22073);
    }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h11h11le6np4ba.R.inc(22075);
        __CLR4_4_1h11h11le6np4ba.R.inc(22076);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1h11h11le6np4ba.R.inc(22077);zone = DateTimeZone.getDefault();
        __CLR4_4_1h11h11le6np4ba.R.inc(22078);locale = Locale.getDefault();
        __CLR4_4_1h11h11le6np4ba.R.inc(22079);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h11h11le6np4ba.R.inc(22080);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h11h11le6np4ba.R.inc(22081);
        __CLR4_4_1h11h11le6np4ba.R.inc(22082);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h11h11le6np4ba.R.inc(22083);DateTimeZone.setDefault(zone);
        __CLR4_4_1h11h11le6np4ba.R.inc(22084);Locale.setDefault(locale);
        __CLR4_4_1h11h11le6np4ba.R.inc(22085);zone = null;
    }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetDifferenceHourOfDay397() {__CLR4_4_1h11h11le6np4ba.R.globalSliceStart(getClass().getName(),22086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebf20th1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6np4ba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6np4ba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceHourOfDay397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebf20th1i(){try{__CLR4_4_1h11h11le6np4ba.R.inc(22086); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22087);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22088);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22089);assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22090);assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22091);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22092);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22093);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22094);assertEquals(13, test.hourOfDay().getDifference(null)); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22095);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}
public void testPropertyToIntervalYear638() {__CLR4_4_1h11h11le6np4ba.R.globalSliceStart(getClass().getName(),22096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uiuqqh1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6np4ba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6np4ba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uiuqqh1s(){try{__CLR4_4_1h11h11le6np4ba.R.inc(22096); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22097);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22098);Interval testInterval = test.year().toInterval(); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22099);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22100);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}
public void testPropertyAddWrapFieldMonthOfYear640() {__CLR4_4_1h11h11le6np4ba.R.globalSliceStart(getClass().getName(),22101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tel3bvh1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6np4ba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6np4ba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tel3bvh1x(){try{__CLR4_4_1h11h11le6np4ba.R.inc(22101); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22102);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22103);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22104);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22105);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22106);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}
public void testPropertyRoundHalfEvenMonthOfYear641() {__CLR4_4_1h11h11le6np4ba.R.globalSliceStart(getClass().getName(),22107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwdd4qh23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6np4ba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6np4ba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwdd4qh23(){try{__CLR4_4_1h11h11le6np4ba.R.inc(22107); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22108);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22109);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22110);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22111);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22112);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22113);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22114);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22115);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h11h11le6np4ba.R.inc(22116);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h11h11le6np4ba.R.flushNeeded();}}
    

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
