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

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1iujiujle6o79x6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1iujiujle6o79x6.R.inc(24427);
        __CLR4_4_1iujiujle6o79x6.R.inc(24428);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iujiujle6o79x6.R.inc(24429);
        __CLR4_4_1iujiujle6o79x6.R.inc(24430);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1iujiujle6o79x6.R.inc(24432);try{__CLR4_4_1iujiujle6o79x6.R.inc(24431);
    }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iujiujle6o79x6.R.inc(24433);
        __CLR4_4_1iujiujle6o79x6.R.inc(24434);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iujiujle6o79x6.R.inc(24435);zone = DateTimeZone.getDefault();
        __CLR4_4_1iujiujle6o79x6.R.inc(24436);locale = Locale.getDefault();
        __CLR4_4_1iujiujle6o79x6.R.inc(24437);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iujiujle6o79x6.R.inc(24438);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iujiujle6o79x6.R.inc(24439);
        __CLR4_4_1iujiujle6o79x6.R.inc(24440);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iujiujle6o79x6.R.inc(24441);DateTimeZone.setDefault(zone);
        __CLR4_4_1iujiujle6o79x6.R.inc(24442);Locale.setDefault(locale);
        __CLR4_4_1iujiujle6o79x6.R.inc(24443);zone = null;
    }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertySetYear415() {__CLR4_4_1iujiujle6o79x6.R.globalSliceStart(getClass().getName(),24444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vivl3iv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iujiujle6o79x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iujiujle6o79x6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetYear415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vivl3iv0(){try{__CLR4_4_1iujiujle6o79x6.R.inc(24444); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24445);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24446);test.year().set(2010); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24447);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}
public void testPropertyAddWeekOfWeekyear416() {__CLR4_4_1iujiujle6o79x6.R.globalSliceStart(getClass().getName(),24448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16no4cqiv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iujiujle6o79x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iujiujle6o79x6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16no4cqiv4(){try{__CLR4_4_1iujiujle6o79x6.R.inc(24448); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24449);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24450);test.weekOfWeekyear().add(1); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24451);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}
public void testPropertyGetMillisOfSecond417() {__CLR4_4_1iujiujle6o79x6.R.globalSliceStart(getClass().getName(),24452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghch27iv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iujiujle6o79x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iujiujle6o79x6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghch27iv8(){try{__CLR4_4_1iujiujle6o79x6.R.inc(24452); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24453);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24454);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24455);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24456);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24457);assertEquals(48223, test.millisOfSecond().get()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24458);assertEquals("48223", test.millisOfSecond().getAsText()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24459);assertEquals("48223", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24460);assertEquals("48223", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24461);assertEquals("48223", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24462);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24463);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24464);assertEquals(8, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24465);assertEquals(8, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}
public void testPropertySetMonthOfYear418() {__CLR4_4_1iujiujle6o79x6.R.globalSliceStart(getClass().getName(),24466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgqbljivm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iujiujle6o79x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iujiujle6o79x6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetMonthOfYear418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgqbljivm(){try{__CLR4_4_1iujiujle6o79x6.R.inc(24466); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24467);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24468);test.monthOfYear().set(12); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24469);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24470);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24471);test.monthOfYear().set(0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24472);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24473);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24474);test.monthOfYear().set(12); 
     __CLR4_4_1iujiujle6o79x6.R.inc(24475);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1iujiujle6o79x6.R.flushNeeded();}}
    

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
