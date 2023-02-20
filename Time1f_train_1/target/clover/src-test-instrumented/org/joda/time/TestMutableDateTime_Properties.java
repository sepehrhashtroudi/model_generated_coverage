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
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1m59m59le6qe9uo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m59m59le6qe9uo.R.inc(28701);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28702);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m59m59le6qe9uo.R.inc(28703);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28704);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1m59m59le6qe9uo.R.inc(28706);try{__CLR4_4_1m59m59le6qe9uo.R.inc(28705);
    }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m59m59le6qe9uo.R.inc(28707);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28708);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28709);zone = DateTimeZone.getDefault();
        __CLR4_4_1m59m59le6qe9uo.R.inc(28710);locale = Locale.getDefault();
        __CLR4_4_1m59m59le6qe9uo.R.inc(28711);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28712);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m59m59le6qe9uo.R.inc(28713);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28714);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m59m59le6qe9uo.R.inc(28715);DateTimeZone.setDefault(zone);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28716);Locale.setDefault(locale);
        __CLR4_4_1m59m59le6qe9uo.R.inc(28717);zone = null;
    }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyRemainderHourOfDay262() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv2z66m5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv2z66m5q(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28718); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28719);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28720);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear438() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tyfauam5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tyfauam5t(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28721); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28722);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28723);test.monthOfYear().addWrapField(8); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28724);assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyToIntervalMonthOfYear442() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ib9hecm5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ib9hecm5x(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28725); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28726);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28727);Interval testInterval = test.monthOfYear().toInterval(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28728);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28729);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28730);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek955() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dr2g8m63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dr2g8m63(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28731); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28732);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28733);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28734);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28735);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28736);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28737);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28738);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28739);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28740);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28741);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28742);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28743);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28744);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28745);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28746);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28747);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28748);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28749);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28750);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28751);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28752);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28753);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetEra1055() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oh70rm6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oh70rm6q(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28754); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28755);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28756);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28757);assertEquals("era", test.era().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28758);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28759);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28760);assertEquals(1, test.era().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28761);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28762);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28763);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28764);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28765);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28766);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28767);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28768);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28769);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28770);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury1056() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yamugm77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yamugm77(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28771); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28772);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28773);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28774);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28775);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28776);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28777);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28778);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28779);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28780);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28781);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28782);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28783);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28784);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetYearOfEra1057() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ta65kpm7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra1057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ta65kpm7l(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28785); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28786);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28787);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28788);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28789);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28790);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28791);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28792);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28793);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28794);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28795);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28796);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28797);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28798);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetTextYear1058() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnvwxam7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear1058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnvwxam7z(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28799); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28800);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28801);test.year().set("1960"); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28802);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyAddWeekOfWeekyear1059() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gotfvkm83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear1059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gotfvkm83(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28803); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28804);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28805);test.weekOfWeekyear().add(1); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28806);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetTextDayOfYear1060() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icxw9km87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear1060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icxw9km87(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28807); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28808);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28809);test.dayOfYear().set("12"); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28810);assertEquals("2004-01-12T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetDayOfMonth1061() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wp6hdjm8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wp6hdjm8b(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28811); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28812);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28813);test.dayOfMonth().set(12); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28814);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetDayOfWeek1062() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ov4c4ym8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek1062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ov4c4ym8f(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28815); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28816);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28817);test.dayOfWeek().set(4); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28818);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay1063() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1wo7vm8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1wo7vm8j(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28819); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28820);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28821);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28822);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28823);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28824);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28825);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28826);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28827);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28828);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28829);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28830);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28831);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28832);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetMinuteOfHour1064() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pgo0hum8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour1064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pgo0hum8x(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28833); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28834);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28835);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28836);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28837);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28838);assertEquals(23, test.minuteOfHour().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28839);assertEquals("23", test.minuteOfHour().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28840);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28841);assertEquals("23", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28842);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28843);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28844);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28845);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28846);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay1065() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9r553m9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9r553m9b(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28847); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28848);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28849);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28850);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28851);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28852);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28853);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28854);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28855);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28856);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28857);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28858);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28859);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28860);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetMillisOfDay1066() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4wh4am9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay1066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4wh4am9p(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28861); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28862);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28863);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28864);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28865);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28866);assertEquals(48223053, test.millisOfDay().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28867);assertEquals("48223053", test.millisOfDay().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28868);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28869);assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28870);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28871);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28872);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28873);assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28874);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyGetMillisOfSecond1067() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136fm7bma3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond1067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136fm7bma3(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28875); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28876);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28877);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28878);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28879);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28880);assertEquals(53, test.millisOfSecond().get()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28881);assertEquals("53", test.millisOfSecond().getAsText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28882);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28883);assertEquals("53", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28884);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28885);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28886);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28887);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28888);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear1071() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1117ztgmah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear1071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1117ztgmah(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28889); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28890);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28891);test.monthOfYear().set("12"); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28892);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28893);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28894);test.monthOfYear().set("December"); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28895);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28896);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28897);test.monthOfYear().set("Dec"); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28898);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyRoundFloorHourOfDay1072() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_139r0u5mar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay1072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_139r0u5mar(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28899); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28900);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28901);test.hourOfDay().roundFloor(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28902);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyRoundCeilingHourOfDay1073() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8xqz7mav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay1073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8xqz7mav(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28903); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28904);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28905);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28906);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay1074() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neu172maz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay1074",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neu172maz(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28907); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28908);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28909);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28910);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28911);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28912);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28913);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28914);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28915);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28916);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay1075() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olnwgumb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olnwgumb9(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28917); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28918);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28919);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28920);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28921);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28922);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28923);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28924);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28925);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28926);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay1076() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13obfrimbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13obfrimbj(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28927); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28928);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28929);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28930);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28931);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28932);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28933);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28934);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28935);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28936);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28937);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28938);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28939);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear1233() {__CLR4_4_1m59m59le6qe9uo.R.globalSliceStart(getClass().getName(),28940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxwp6pmbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m59m59le6qe9uo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m59m59le6qe9uo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear1233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxwp6pmbw(){try{__CLR4_4_1m59m59le6qe9uo.R.inc(28940); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28941);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28942);test.weekOfWeekyear().set(4); 
     __CLR4_4_1m59m59le6qe9uo.R.inc(28943);assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m59m59le6qe9uo.R.flushNeeded();}} 

    

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
