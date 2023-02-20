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
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1hcohcole6rjc46{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,22651,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hcohcole6rjc46.R.inc(22488);
        __CLR4_4_1hcohcole6rjc46.R.inc(22489);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hcohcole6rjc46.R.inc(22490);
        __CLR4_4_1hcohcole6rjc46.R.inc(22491);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1hcohcole6rjc46.R.inc(22493);try{__CLR4_4_1hcohcole6rjc46.R.inc(22492);
    }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hcohcole6rjc46.R.inc(22494);
        __CLR4_4_1hcohcole6rjc46.R.inc(22495);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hcohcole6rjc46.R.inc(22496);zone = DateTimeZone.getDefault();
        __CLR4_4_1hcohcole6rjc46.R.inc(22497);locale = Locale.getDefault();
        __CLR4_4_1hcohcole6rjc46.R.inc(22498);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hcohcole6rjc46.R.inc(22499);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hcohcole6rjc46.R.inc(22500);
        __CLR4_4_1hcohcole6rjc46.R.inc(22501);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hcohcole6rjc46.R.inc(22502);DateTimeZone.setDefault(zone);
        __CLR4_4_1hcohcole6rjc46.R.inc(22503);Locale.setDefault(locale);
        __CLR4_4_1hcohcole6rjc46.R.inc(22504);zone = null;
    }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetDifferenceMonthOfYear938() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1hc6bhd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear938",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1hc6bhd5(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22505); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22506);DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22507);DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22508);assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22509);assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22510);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22511);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1411() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ot5x42hdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra1411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ot5x42hdc(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22512); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22513);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22514);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22515);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22516);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22517);assertSame(test, test.centuryOfEra().getDateMidnight()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22518);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22519);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22520);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22521);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22522);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22523);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22524);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22525);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22526);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyGetEra1455() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13uxkflhdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13uxkflhdr(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22527); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22528);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22529);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22530);assertEquals("era", test.era().getName()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22531);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22532);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22533);assertEquals(1, test.era().get()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22534);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22535);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22536);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22537);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22538);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22539);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22540);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22541);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22542);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22543);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyToIntervalYear1456() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19w2pw1he8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19w2pw1he8(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22544); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22545);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22546);Interval testInterval = test.year().toInterval(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22547);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22548);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyGetWeekyear1457() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me4p8hed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear1457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me4p8hed(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22549); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22550);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22551);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22552);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22553);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22554);assertSame(test, test.weekyear().getDateMidnight()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22555);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22556);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22557);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22558);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22559);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22560);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22561);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22562);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22563);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyGetDayOfYear1458() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csbk5qhes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfYear1458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csbk5qhes(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22564); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22565);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22566);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22567);assertEquals("dayOfYear", test.dayOfYear().getName()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22568);assertEquals("Property[dayOfYear]", test.dayOfYear().toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22569);assertSame(test, test.dayOfYear().getDateMidnight()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22570);assertEquals(161, test.dayOfYear().get()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22571);assertEquals("161", test.dayOfYear().getAsText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22572);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22573);assertEquals("161", test.dayOfYear().getAsShortText()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22574);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22575);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22576);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22577);assertEquals(3, test.dayOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22578);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22579);assertEquals(false, test.dayOfYear().isLeap()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22580);assertEquals(0, test.dayOfYear().getLeapAmount()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22581);assertEquals(null, test.dayOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth1459() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnkrjbhfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueDayOfMonth1459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnkrjbhfa(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22582); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22583);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22584);DateMidnight copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22585);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22586);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict1461() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p892c1hff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict1461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p892c1hff(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22587); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22588);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22589);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22590);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22591);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22592);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22593);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22594);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22595);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22596);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear1462() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ney10ghfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear1462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ney10ghfp(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22597); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22598);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22599);DateMidnight copy = test.monthOfYear().addToCopy(8); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22600);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22601);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22602);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyAddLongMonthOfYear1463() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ntffvfhfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear1463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ntffvfhfv(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22603); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22604);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22605);DateMidnight copy = test.monthOfYear().addToCopy(8L); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22606);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22607);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22608);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1464() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llgmzehg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear1464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llgmzehg1(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22609); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22610);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22611);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22612);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22613);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22614);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth1465() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jdwuyhg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth1465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jdwuyhg7(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22615); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22616);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22617);DateMidnight copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22618);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22619);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyRoundFloorMonthOfYear1466() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm6abdhgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear1466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm6abdhgc(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22620); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22621);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22622);DateMidnight copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22623);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyRoundCeilingMonthOfYear1467() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8f12hhgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear1467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8f12hhgg(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22624); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22625);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22626);DateMidnight copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22627);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorMonthOfYear1468() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrnx5ehgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear1468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrnx5ehgk(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22628); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22629);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22630);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22631);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22632);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22633);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22634);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22635);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22636);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22637);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenMonthOfYear1469() {__CLR4_4_1hcohcole6rjc46.R.globalSliceStart(getClass().getName(),22638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnn3sjhgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcohcole6rjc46.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcohcole6rjc46.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear1469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnn3sjhgu(){try{__CLR4_4_1hcohcole6rjc46.R.inc(22638); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22639);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22640);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22641);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22642);test = new DateMidnight(2004, 9, 16); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22643);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22644);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22645);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22646);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22647);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22648);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22649);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hcohcole6rjc46.R.inc(22650);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hcohcole6rjc46.R.flushNeeded();}} 

    

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
