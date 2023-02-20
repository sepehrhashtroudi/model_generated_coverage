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
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1m17m17le6rclec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28810,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m17m17le6rclec.R.inc(28555);
        __CLR4_4_1m17m17le6rclec.R.inc(28556);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m17m17le6rclec.R.inc(28557);
        __CLR4_4_1m17m17le6rclec.R.inc(28558);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1m17m17le6rclec.R.inc(28560);try{__CLR4_4_1m17m17le6rclec.R.inc(28559);
    }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m17m17le6rclec.R.inc(28561);
        __CLR4_4_1m17m17le6rclec.R.inc(28562);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m17m17le6rclec.R.inc(28563);zone = DateTimeZone.getDefault();
        __CLR4_4_1m17m17le6rclec.R.inc(28564);locale = Locale.getDefault();
        __CLR4_4_1m17m17le6rclec.R.inc(28565);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m17m17le6rclec.R.inc(28566);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m17m17le6rclec.R.inc(28567);
        __CLR4_4_1m17m17le6rclec.R.inc(28568);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m17m17le6rclec.R.inc(28569);DateTimeZone.setDefault(zone);
        __CLR4_4_1m17m17le6rclec.R.inc(28570);Locale.setDefault(locale);
        __CLR4_4_1m17m17le6rclec.R.inc(28571);zone = null;
    }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyRemainderHourOfDay270() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19crzsfm1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19crzsfm1o(){try{__CLR4_4_1m17m17le6rclec.R.inc(28572); 
     __CLR4_4_1m17m17le6rclec.R.inc(28573);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28574);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear445() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3tqyqm1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3tqyqm1r(){try{__CLR4_4_1m17m17le6rclec.R.inc(28575); 
     __CLR4_4_1m17m17le6rclec.R.inc(28576);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28577);test.monthOfYear().addWrapField(8); 
     __CLR4_4_1m17m17le6rclec.R.inc(28578);assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek942() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w33qgqm1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w33qgqm1v(){try{__CLR4_4_1m17m17le6rclec.R.inc(28579); 
     __CLR4_4_1m17m17le6rclec.R.inc(28580);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28581);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28582);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28583);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28584);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28585);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28586);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28587);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28588);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28589);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28590);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28591);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28592);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28593);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28594);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28595);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28596);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28597);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28598);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28599);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28600);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28601);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetEra1045() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p1dpism2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra1045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p1dpism2i(){try{__CLR4_4_1m17m17le6rclec.R.inc(28602); 
     __CLR4_4_1m17m17le6rclec.R.inc(28603);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28604);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28605);assertEquals("era", test.era().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28606);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28607);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28608);assertEquals(1, test.era().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28609);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28610);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28611);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28612);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28613);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28614);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28615);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28616);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28617);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28618);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1046() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13b2vswm2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra1046",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13b2vswm2z(){try{__CLR4_4_1m17m17le6rclec.R.inc(28619); 
     __CLR4_4_1m17m17le6rclec.R.inc(28620);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28621);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28622);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28623);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28624);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28625);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28626);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28627);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28628);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28629);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28630);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28631);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28632);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury1047() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rf5klim3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury1047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rf5klim3d(){try{__CLR4_4_1m17m17le6rclec.R.inc(28633); 
     __CLR4_4_1m17m17le6rclec.R.inc(28634);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28635);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28636);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28637);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28638);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28639);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28640);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28641);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28642);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28643);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28644);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28645);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28646);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetYearOfEra1048() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tb7tnm3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra1048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tb7tnm3r(){try{__CLR4_4_1m17m17le6rclec.R.inc(28647); 
     __CLR4_4_1m17m17le6rclec.R.inc(28648);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28649);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28650);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28651);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28652);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28653);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28654);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28655);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28656);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28657);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28658);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28659);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28660);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetTextYear1049() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1370z68m45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear1049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1370z68m45(){try{__CLR4_4_1m17m17le6rclec.R.inc(28661); 
     __CLR4_4_1m17m17le6rclec.R.inc(28662);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28663);test.year().set("1960"); 
     __CLR4_4_1m17m17le6rclec.R.inc(28664);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetWeekyear1050() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dl6vdrm49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear1050",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dl6vdrm49(){try{__CLR4_4_1m17m17le6rclec.R.inc(28665); 
     __CLR4_4_1m17m17le6rclec.R.inc(28666);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28667);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28668);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28669);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28670);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28671);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28672);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28673);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28674);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28675);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28676);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28677);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28678);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetTextDayOfYear1051() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7b7yim4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear1051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7b7yim4n(){try{__CLR4_4_1m17m17le6rclec.R.inc(28679); 
     __CLR4_4_1m17m17le6rclec.R.inc(28680);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28681);test.dayOfYear().set("12"); 
     __CLR4_4_1m17m17le6rclec.R.inc(28682);assertEquals("2004-01-12T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetDayOfMonth1052() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bv2mujm4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bv2mujm4r(){try{__CLR4_4_1m17m17le6rclec.R.inc(28683); 
     __CLR4_4_1m17m17le6rclec.R.inc(28684);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28685);test.dayOfMonth().set(12); 
     __CLR4_4_1m17m17le6rclec.R.inc(28686);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetDayOfWeek1053() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jp4s34m4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek1053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jp4s34m4v(){try{__CLR4_4_1m17m17le6rclec.R.inc(28687); 
     __CLR4_4_1m17m17le6rclec.R.inc(28688);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28689);test.dayOfWeek().set(4); 
     __CLR4_4_1m17m17le6rclec.R.inc(28690);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay1054() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19icg07m4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19icg07m4z(){try{__CLR4_4_1m17m17le6rclec.R.inc(28691); 
     __CLR4_4_1m17m17le6rclec.R.inc(28692);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m17m17le6rclec.R.inc(28693);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28694);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28695);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28696);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28697);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28698);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28699);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28700);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28701);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28702);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28703);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28704);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetMinuteOfHour1055() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1106x98m5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1106x98m5d(){try{__CLR4_4_1m17m17le6rclec.R.inc(28705); 
     __CLR4_4_1m17m17le6rclec.R.inc(28706);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m17m17le6rclec.R.inc(28707);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28708);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28709);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28710);assertEquals(23, test.minuteOfHour().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28711);assertEquals("23", test.minuteOfHour().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28712);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28713);assertEquals("23", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28714);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28715);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28716);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28717);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28718);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay1056() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f73slzm5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f73slzm5r(){try{__CLR4_4_1m17m17le6rclec.R.inc(28719); 
     __CLR4_4_1m17m17le6rclec.R.inc(28720);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m17m17le6rclec.R.inc(28721);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28722);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28723);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28724);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28725);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28726);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28727);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28728);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28729);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28730);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28731);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28732);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetMillisOfDay1057() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfcn3sm65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay1057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfcn3sm65(){try{__CLR4_4_1m17m17le6rclec.R.inc(28733); 
     __CLR4_4_1m17m17le6rclec.R.inc(28734);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m17m17le6rclec.R.inc(28735);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28736);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28737);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28738);assertEquals(48223053, test.millisOfDay().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28739);assertEquals("48223053", test.millisOfDay().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28740);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28741);assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28742);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28743);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28744);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28745);assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28746);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyGetMillisOfSecond1058() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nafbjrm6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond1058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nafbjrm6j(){try{__CLR4_4_1m17m17le6rclec.R.inc(28747); 
     __CLR4_4_1m17m17le6rclec.R.inc(28748);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m17m17le6rclec.R.inc(28749);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28750);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28751);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28752);assertEquals(53, test.millisOfSecond().get()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28753);assertEquals("53", test.millisOfSecond().getAsText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28754);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28755);assertEquals("53", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28756);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28757);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28758);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28759);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1m17m17le6rclec.R.inc(28760);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek1062() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzkeszm6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek1062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzkeszm6x(){try{__CLR4_4_1m17m17le6rclec.R.inc(28761); 
     __CLR4_4_1m17m17le6rclec.R.inc(28762);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28763);test.dayOfWeek().add(1L); 
     __CLR4_4_1m17m17le6rclec.R.inc(28764);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear1063() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o92ys1m71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o92ys1m71(){try{__CLR4_4_1m17m17le6rclec.R.inc(28765); 
     __CLR4_4_1m17m17le6rclec.R.inc(28766);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28767);test.monthOfYear().set("12"); 
     __CLR4_4_1m17m17le6rclec.R.inc(28768);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28769);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28770);test.monthOfYear().set("December"); 
     __CLR4_4_1m17m17le6rclec.R.inc(28771);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28772);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28773);test.monthOfYear().set("Dec"); 
     __CLR4_4_1m17m17le6rclec.R.inc(28774);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyRoundFloorHourOfDay1064() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy3y4gm7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay1064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy3y4gm7b(){try{__CLR4_4_1m17m17le6rclec.R.inc(28775); 
     __CLR4_4_1m17m17le6rclec.R.inc(28776);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28777);test.hourOfDay().roundFloor(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28778);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyRoundCeilingHourOfDay1065() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ckbc1cm7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ckbc1cm7f(){try{__CLR4_4_1m17m17le6rclec.R.inc(28779); 
     __CLR4_4_1m17m17le6rclec.R.inc(28780);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28781);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28782);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay1066() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oef1thm7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay1066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oef1thm7j(){try{__CLR4_4_1m17m17le6rclec.R.inc(28783); 
     __CLR4_4_1m17m17le6rclec.R.inc(28784);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28785);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28786);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28787);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m17m17le6rclec.R.inc(28788);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28789);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28790);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m17m17le6rclec.R.inc(28791);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28792);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay1067() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u56dikm7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay1067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u56dikm7t(){try{__CLR4_4_1m17m17le6rclec.R.inc(28793); 
     __CLR4_4_1m17m17le6rclec.R.inc(28794);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28795);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28796);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28797);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28798);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28799);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28800);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m17m17le6rclec.R.inc(28801);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28802);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m17m17le6rclec.R.inc(28803);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m17m17le6rclec.R.inc(28804);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m17m17le6rclec.R.inc(28805);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear1234() {__CLR4_4_1m17m17le6rclec.R.globalSliceStart(getClass().getName(),28806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aowqe8m86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m17m17le6rclec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m17m17le6rclec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear1234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aowqe8m86(){try{__CLR4_4_1m17m17le6rclec.R.inc(28806); 
     __CLR4_4_1m17m17le6rclec.R.inc(28807);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m17m17le6rclec.R.inc(28808);test.weekOfWeekyear().set(4); 
     __CLR4_4_1m17m17le6rclec.R.inc(28809);assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m17m17le6rclec.R.flushNeeded();}} 

    

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
