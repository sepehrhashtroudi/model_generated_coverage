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
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1ha0ha0le6qe97f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22392);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22393);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22394);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22395);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1ha0ha0le6qe97f.R.inc(22397);try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22396);
    }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22398);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22399);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22400);zone = DateTimeZone.getDefault();
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22401);locale = Locale.getDefault();
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22402);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22403);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22404);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22405);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22406);DateTimeZone.setDefault(zone);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22407);Locale.setDefault(locale);
        __CLR4_4_1ha0ha0le6qe97f.R.inc(22408);zone = null;
    }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetDifferenceMonthOfYear924() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q81wmhah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear924",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q81wmhah(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22409); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22410);DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22411);DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22412);assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22413);assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22414);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22415);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear948() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157j4t4hao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear948",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157j4t4hao(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22416); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22417);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22418);DateMidnight copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22419);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22420);assertEquals(8, copy.getMonthOfYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22421);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek1401() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2qcarhau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfWeek1401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2qcarhau(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22422); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22423);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22424);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22425);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22426);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22427);assertSame(test, test.dayOfWeek().getDateMidnight()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22428);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22429);assertEquals("3", test.dayOfWeek().getAsString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22430);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22431);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22432);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22433);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22434);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22435);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22436);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22437);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22438);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22439);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22440);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22441);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22442);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22443);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22444);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22445);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22446);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1415() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7y9p6hbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra1415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7y9p6hbj(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22447); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22448);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22449);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22450);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22451);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22452);assertSame(test, test.centuryOfEra().getDateMidnight()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22453);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22454);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22455);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22456);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22457);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22458);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22459);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22460);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22461);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury1458() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2psmehby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury1458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2psmehby(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22462); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22463);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22464);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22465);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22466);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra1459() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbfw1zhc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra1459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbfw1zhc3(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22467); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22468);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22469);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22470);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22471);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyToIntervalYear1460() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsdwohc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear1460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsdwohc8(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22472); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22473);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22474);Interval testInterval = test.year().toInterval(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22475);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22476);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyGetWeekyear1461() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au98hxhcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear1461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au98hxhcd(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22477); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22478);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22479);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22480);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22481);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22482);assertSame(test, test.weekyear().getDateMidnight()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22483);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22484);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22485);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22486);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22487);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22488);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22489);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22490);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22491);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict1463() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq94r3hcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict1463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq94r3hcs(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22492); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22493);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22494);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22495);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22496);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22497);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22498);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22499);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22500);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22501);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyAddLongMonthOfYear1464() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkfh2yhd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear1464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkfh2yhd2(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22502); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22503);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22504);DateMidnight copy = test.monthOfYear().addToCopy(8L); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22505);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22506);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22507);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1465() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icgo6xhd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear1465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icgo6xhd8(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22508); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22509);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22510);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22511);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22512);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22513);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorMonthOfYear1466() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrg78shde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear1466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrg78shde(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22514); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22515);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22516);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22517);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22518);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22519);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22520);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22521);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22522);copy = test.monthOfYear().roundHalfFloorCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22523);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingMonthOfYear1467() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubryhohdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear1467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubryhohdo(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22524); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22525);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22526);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22527);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22528);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22529);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22530);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22531);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22532);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22533);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenMonthOfYear1468() {__CLR4_4_1ha0ha0le6qe97f.R.globalSliceStart(getClass().getName(),22534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwn2l0hdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha0ha0le6qe97f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha0ha0le6qe97f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear1468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwn2l0hdy(){try{__CLR4_4_1ha0ha0le6qe97f.R.inc(22534); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22535);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22536);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22537);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22538);test = new DateMidnight(2004, 9, 16); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22539);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22540);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22541);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22542);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22543);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22544);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22545);copy = test.monthOfYear().roundHalfEvenCopy(); 
     __CLR4_4_1ha0ha0le6qe97f.R.inc(22546);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ha0ha0le6qe97f.R.flushNeeded();}} 

    

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
