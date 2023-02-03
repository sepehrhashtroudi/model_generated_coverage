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
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1hdjhdjlc8axdn6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,22733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22519);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22520);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22521);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22522);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1hdjhdjlc8axdn6.R.inc(22524);try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22523);
    }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22525);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22526);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22527);zone = DateTimeZone.getDefault();
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22528);locale = Locale.getDefault();
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22529);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22530);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22531);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22532);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22533);DateTimeZone.setDefault(zone);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22534);Locale.setDefault(locale);
        __CLR4_4_1hdjhdjlc8axdn6.R.inc(22535);zone = null;
    }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyWithMaximumValueDayOfMonth144() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131db0the0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueDayOfMonth144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131db0the0(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22536); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22537);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22538);DateMidnight copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22539);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22540);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyRoundCeilingMonthOfYear230() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9r0xkhe5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9r0xkhe5(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22541); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22542);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22543);DateMidnight copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22544);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetEra382() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198nhf5he9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198nhf5he9(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22545); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22546);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22547);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22548);assertEquals("era", test.era().getName()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22549);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22550);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22551);assertEquals(1, test.era().get()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22552);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22553);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22554);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22555);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22556);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22557);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22558);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22559);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22560);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22561);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear466() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127llchheq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127llchheq(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22562); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22563);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22564);DateMidnight copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22565);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22566);assertEquals(8, copy.getMonthOfYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22567);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict561() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1humob7hew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1humob7hew(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22568); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22569);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22570);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22571);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22572);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22573);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22574);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22575);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22576);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22577);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenMonthOfYear656() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125vycihf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125vycihf6(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22578); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22579);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22580);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22581);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22582);test = new DateMidnight(2004, 9, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22583);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22584);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22585);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22586);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22587);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22588);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22589);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22590);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra854() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qk01mhfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra854",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qk01mhfj(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22591); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22592);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22593);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22594);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22595);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22596);assertSame(test, test.centuryOfEra().getDateMidnight()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22597);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22598);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22599);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22600);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22601);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22602);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22603);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22604);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22605);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetWeekyear968() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8311ahfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear968",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8311ahfy(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22606); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22607);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22608);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22609);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22610);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22611);assertSame(test, test.weekyear().getDateMidnight()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22612);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22613);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22614);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22615);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22616);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22617);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22618);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22619);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22620);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorMonthOfYear976() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14b8hc3hgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear976",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14b8hc3hgd(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22621); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22622);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22623);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22624);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22625);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22626);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22627);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22628);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22629);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22630);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyToIntervalYear1033() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqe2yhgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear1033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqe2yhgn(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22631); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22632);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22633);Interval testInterval = test.year().toInterval(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22634);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22635);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear1137() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ry19wlhgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear1137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ry19wlhgs(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22636); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22637);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22638);DateMidnight copy = test.monthOfYear().addToCopy(8); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22639);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22640);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22641);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetDifferenceMonthOfYear1185() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1buocqchgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear1185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1buocqchgy(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22642); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22643);DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22644);DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22645);assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22646);assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22647);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22648);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek1313() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1klo6othh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfWeek1313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1klo6othh5(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22649); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22650);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22651);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22652);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22653);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22654);assertSame(test, test.dayOfWeek().getDateMidnight()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22655);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22656);assertEquals("3", test.dayOfWeek().getAsString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22657);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22658);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22659);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22660);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22661);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22662);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22663);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22664);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22665);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22666);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22667);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22668);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22669);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22670);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22671);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22672);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22673);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth1435() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onukifhhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth1435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onukifhhu(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22674); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22675);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22676);DateMidnight copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22677);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22678);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingMonthOfYear1468() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkrxa5hhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear1468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkrxa5hhz(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22679); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22680);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22681);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22682);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22683);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22684);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22685);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22686);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22687);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22688);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyRoundFloorMonthOfYear1518() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pg949thi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear1518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pg949thi9(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22689); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22690);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22691);DateMidnight copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22692);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra1529() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1224jjfhid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra1529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1224jjfhid(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22693); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22694);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22695);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22696);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22697);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyAddLongMonthOfYear1560() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbu0v7hii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear1560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbu0v7hii(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22698); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22699);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22700);DateMidnight copy = test.monthOfYear().addToCopy(8L); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22701);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22702);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22703);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury1568() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kde1oahio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury1568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kde1oahio(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22704); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22705);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22706);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22707);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22708);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyGetDayOfYear1672() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkrv7chit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfYear1672",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkrv7chit(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22709); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22710);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22711);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22712);assertEquals("dayOfYear", test.dayOfYear().getName()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22713);assertEquals("Property[dayOfYear]", test.dayOfYear().toString()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22714);assertSame(test, test.dayOfYear().getDateMidnight()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22715);assertEquals(161, test.dayOfYear().get()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22716);assertEquals("161", test.dayOfYear().getAsText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22717);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22718);assertEquals("161", test.dayOfYear().getAsShortText()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22719);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22720);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22721);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22722);assertEquals(3, test.dayOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22723);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22724);assertEquals(false, test.dayOfYear().isLeap()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22725);assertEquals(0, test.dayOfYear().getLeapAmount()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22726);assertEquals(null, test.dayOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1711() {__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceStart(getClass().getName(),22727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr119nhjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlc8axdn6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlc8axdn6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear1711",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr119nhjb(){try{__CLR4_4_1hdjhdjlc8axdn6.R.inc(22727); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22728);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22729);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22730);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22731);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1hdjhdjlc8axdn6.R.inc(22732);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1hdjhdjlc8axdn6.R.flushNeeded();}} 

    

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
