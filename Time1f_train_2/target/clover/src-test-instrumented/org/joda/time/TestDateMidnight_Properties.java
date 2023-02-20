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
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1h9zh9zle6qsenz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,22605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22391);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22392);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22393);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22394);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1h9zh9zle6qsenz.R.inc(22396);try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22395);
    }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22397);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22398);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22399);zone = DateTimeZone.getDefault();
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22400);locale = Locale.getDefault();
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22401);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22402);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22403);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22404);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22405);DateTimeZone.setDefault(zone);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22406);Locale.setDefault(locale);
        __CLR4_4_1h9zh9zle6qsenz.R.inc(22407);zone = null;
    }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetDifferenceMonthOfYear913() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc14qihag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear913",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc14qihag(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22408); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22409);DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22410);DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22411);assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22412);assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22413);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22414);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear933() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9sgachan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear933",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9sgachan(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22415); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22416);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22417);DateMidnight copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22418);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22419);assertEquals(8, copy.getMonthOfYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22420);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek1390() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15p50nchat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfWeek1390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15p50nchat(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22421); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22422);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22423);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22424);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22425);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22426);assertSame(test, test.dayOfWeek().getDateMidnight()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22427);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22428);assertEquals("3", test.dayOfWeek().getAsString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22429);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22430);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22431);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22432);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22433);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22434);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22435);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22436);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22437);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22438);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22439);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22440);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22441);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22442);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22443);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22444);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22445);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1407() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elatbdhbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elatbdhbi(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22446); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22447);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22448);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22449);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22450);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22451);assertSame(test, test.centuryOfEra().getDateMidnight()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22452);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22453);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22454);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22455);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22456);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22457);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22458);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22459);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22460);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyGetEra1452() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlxgt0hbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra1452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlxgt0hbx(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22461); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22462);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22463);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22464);assertEquals("era", test.era().getName()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22465);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22466);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22467);assertEquals(1, test.era().get()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22468);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22469);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22470);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22471);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22472);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22473);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22474);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22475);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22476);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22477);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury1453() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tpyo1hce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury1453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tpyo1hce(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22478); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22479);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22480);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22481);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22482);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra1454() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162g23mhcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra1454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162g23mhcj(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22483); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22484);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22485);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22486);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22487);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyToIntervalYear1455() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d52ooihco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d52ooihco(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22488); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22489);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22490);Interval testInterval = test.year().toInterval(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22491);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22492);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyGetWeekyear1456() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mlu39hct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mlu39hct(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22493); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22494);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22495);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22496);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22497);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22498);assertSame(test, test.weekyear().getDateMidnight()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22499);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22500);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22501);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22502);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22503);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22504);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22505);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22506);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22507);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyGetDayOfYear1457() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jbld9hd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfYear1457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jbld9hd8(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22508); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22509);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22510);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22511);assertEquals("dayOfYear", test.dayOfYear().getName()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22512);assertEquals("Property[dayOfYear]", test.dayOfYear().toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22513);assertSame(test, test.dayOfYear().getDateMidnight()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22514);assertEquals(161, test.dayOfYear().get()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22515);assertEquals("161", test.dayOfYear().getAsText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22516);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22517);assertEquals("161", test.dayOfYear().getAsShortText()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22518);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22519);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22520);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22521);assertEquals(3, test.dayOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22522);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22523);assertEquals(false, test.dayOfYear().isLeap()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22524);assertEquals(0, test.dayOfYear().getLeapAmount()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22525);assertEquals(null, test.dayOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth1458() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwkqbshdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueDayOfMonth1458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwkqbshdq(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22526); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22527);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22528);DateMidnight copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22529);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22530);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict1460() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh914ihdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict1460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh914ihdv(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22531); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22532);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22533);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22534);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22535);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22536);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22537);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22538);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22539);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22540);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear1461() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5y27zhe5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear1461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5y27zhe5(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22541); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22542);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22543);DateMidnight copy = test.monthOfYear().addToCopy(8); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22544);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22545);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22546);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyAddLongMonthOfYear1462() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2fenwheb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear1462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2fenwheb(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22547); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22548);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22549);DateMidnight copy = test.monthOfYear().addToCopy(8L); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22550);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22551);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22552);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1463() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ouglrvheh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear1463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ouglrvheh(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22553); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22554);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22555);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22556);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22557);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22558);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth1464() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19sdvnfhen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth1464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19sdvnfhen(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22559); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22560);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22561);DateMidnight copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22562);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22563);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyRoundFloorMonthOfYear1465() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1od6biwhes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear1465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1od6biwhes(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22564); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22565);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22566);DateMidnight copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22567);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyRoundCeilingMonthOfYear1466() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzf2a0hew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear1466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzf2a0hew(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22568); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22569);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22570);DateMidnight copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22571);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorMonthOfYear1467() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0g619hf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear1467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0g619hf0(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22572); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22573);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22574);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22575);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22576);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22577);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22578);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22579);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22580);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22581);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingMonthOfYear1468() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkrxa5hfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear1468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkrxa5hfa(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22582); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22583);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22584);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22585);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22586);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22587);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22588);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22589);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22590);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22591);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenMonthOfYear1469() {__CLR4_4_1h9zh9zle6qsenz.R.globalSliceStart(getClass().getName(),22592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnn3sjhfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9zh9zle6qsenz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9zh9zle6qsenz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear1469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnn3sjhfk(){try{__CLR4_4_1h9zh9zle6qsenz.R.inc(22592); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22593);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22594);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22595);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22596);test = new DateMidnight(2004, 9, 16); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22597);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22598);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22599);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22600);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22601);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22602);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22603);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1h9zh9zle6qsenz.R.inc(22604);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h9zh9zle6qsenz.R.flushNeeded();}} 

    

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
