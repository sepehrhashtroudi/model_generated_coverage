/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1la9la9le6qe9qf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1la9la9le6qe9qf.R.inc(27585);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27586);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1la9la9le6qe9qf.R.inc(27587);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27588);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1la9la9le6qe9qf.R.inc(27590);try{__CLR4_4_1la9la9le6qe9qf.R.inc(27589);
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1la9la9le6qe9qf.R.inc(27591);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27592);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27593);zone = DateTimeZone.getDefault();
        __CLR4_4_1la9la9le6qe9qf.R.inc(27594);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1la9la9le6qe9qf.R.inc(27595);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27596);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1la9la9le6qe9qf.R.inc(27597);DateTimeZone.setDefault(zone);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27598);zone = null;
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetHour985() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3cdnulan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour985",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3cdnulan(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27599); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27600);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27601);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27602);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27603);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27604);assertSame(test, test.hourOfDay().getLocalTime()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27605);assertEquals(10, test.hourOfDay().get()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27606);assertEquals("10", test.hourOfDay().getAsString()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27607);assertEquals("10", test.hourOfDay().getAsText()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27608);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27609);assertEquals("10", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27610);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27611);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27612);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27613);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27614);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertySetTextSecond986() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h608telb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond986",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h608telb3(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27615); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27616);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27617);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27618);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27619);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertyGetMinute990() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12k32b0lb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute990",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12k32b0lb8(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27620); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27621);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27622);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27623);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27624);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27625);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27626);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27627);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27628);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27629);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27630);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27631);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27632);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27633);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27634);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27635);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertyPlusHour991() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6ypotlbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour991",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6ypotlbo(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27636); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27637);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27638);LocalTime copy = test.hourOfDay().addCopy(9); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27639);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27640);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27641);copy = test.hourOfDay().addCopy(0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27642);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27643);copy = test.hourOfDay().addCopy(13); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27644);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27645);copy = test.hourOfDay().addCopy(14); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27646);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27647);copy = test.hourOfDay().addCopy(-10); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27648);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27649);copy = test.hourOfDay().addCopy(-11); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27650);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertyPlusNoWrapMinute992() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mf6g49lc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute992",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mf6g49lc3(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27651); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27652);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27653);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27654);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27655);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27656);copy = test.minuteOfHour().addNoWrapToCopy(39); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27657);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27658);copy = test.minuteOfHour().addNoWrapToCopy(40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27659);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27660);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27661);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27662);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27663);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27664);try { 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27665);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40); 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27666);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27667);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27668);copy = test.minuteOfHour().addNoWrapToCopy(-9); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27669);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27670);copy = test.minuteOfHour().addNoWrapToCopy(-19); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27671);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27672);copy = test.minuteOfHour().addNoWrapToCopy(-20); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27673);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27674);copy = test.minuteOfHour().addNoWrapToCopy(-21); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27675);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27676);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27677);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27678);try { 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27679);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27680);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27681);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertyPlusWrapFieldMinute993() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxrzihlcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMinute993",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxrzihlcy(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27682); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27683);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27684);LocalTime copy = test.minuteOfHour().addWrapFieldToCopy(9); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27685);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27686);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27687);copy = test.minuteOfHour().addWrapFieldToCopy(49); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27688);check(copy, 10, 9, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27689);copy = test.minuteOfHour().addWrapFieldToCopy(-47); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27690);check(copy, 10, 33, 30, 40); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertySetSecond994() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glii0cld7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond994",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glii0cld7(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27691); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27692);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27693);LocalTime copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27694);check(test, 10, 20, 30, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27695);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27696);try { 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27697);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27698);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27699);try { 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27700);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1la9la9le6qe9qf.R.inc(27701);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 


public void testPropertyRoundHour995() {__CLR4_4_1la9la9le6qe9qf.R.globalSliceStart(getClass().getName(),27702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q770y7ldi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1la9la9le6qe9qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1la9la9le6qe9qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour995",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q770y7ldi(){try{__CLR4_4_1la9la9le6qe9qf.R.inc(27702); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27703);LocalTime test = new LocalTime(10, 20); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27704);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27705);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27706);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27707);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27708);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27709);test = new LocalTime(10, 40); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27710);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27711);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27712);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27713);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27714);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27715);test = new LocalTime(10, 30); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27716);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27717);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27718);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27719);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27720);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27721);test = new LocalTime(11, 30); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27722);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27723);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27724);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27725);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1la9la9le6qe9qf.R.inc(27726);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0); 
 }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1la9la9le6qe9qf.R.inc(27727);
        __CLR4_4_1la9la9le6qe9qf.R.inc(27728);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1la9la9le6qe9qf.R.inc(27729);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1la9la9le6qe9qf.R.inc(27730);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1la9la9le6qe9qf.R.inc(27731);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1la9la9le6qe9qf.R.flushNeeded();}}
}
