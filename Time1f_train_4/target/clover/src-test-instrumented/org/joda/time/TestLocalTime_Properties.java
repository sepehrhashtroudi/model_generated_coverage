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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1ldfldfle6rjcmb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27699);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27700);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27701);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27702);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1ldfldfle6rjcmb.R.inc(27704);try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27703);
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27705);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27706);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27707);zone = DateTimeZone.getDefault();
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27708);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27709);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27710);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27711);DateTimeZone.setDefault(zone);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27712);zone = null;
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMinute979() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptqvklldt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute979",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptqvklldt(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27713); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27714);LocalTime test1 = new LocalTime(TEST_TIME1); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27715);LocalTime test2 = new LocalTime(TEST_TIME2); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27716);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27717);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27718);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27719);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27720);test1.minuteOfHour().compareTo((ReadablePartial) null); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27721);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27722);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27723);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27724);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27725);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27726);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27727);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27728);test1.minuteOfHour().compareTo((ReadableInstant) null); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27729);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyGetHour1003() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aehhlolea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour1003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aehhlolea(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27730); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27731);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27732);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27733);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27734);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27735);assertSame(test, test.hourOfDay().getLocalTime()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27736);assertEquals(10, test.hourOfDay().get()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27737);assertEquals("10", test.hourOfDay().getAsString()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27738);assertEquals("10", test.hourOfDay().getAsText()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27739);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27740);assertEquals("10", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27741);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27742);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27743);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27744);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27745);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertySetTextSecond1004() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9aflyleq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond1004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9aflyleq(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27746); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27747);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27748);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27749);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27750);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertySetMilli1005() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw2s65lev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli1005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw2s65lev(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27751); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27752);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27753);LocalTime copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27754);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27755);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27756);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27757);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27758);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27759);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27760);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27761);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyGetMinute1009() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xczx7ylf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute1009",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xczx7ylf6(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27762); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27763);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27764);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27765);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27766);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27767);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27768);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27769);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27770);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27771);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27772);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27773);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27774);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27775);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27776);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27777);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyPlusNoWrapMinute1010() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9s7i3lfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute1010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9s7i3lfm(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27778); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27779);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27780);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27781);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27782);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27783);copy = test.minuteOfHour().addNoWrapToCopy(39); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27784);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27785);copy = test.minuteOfHour().addNoWrapToCopy(40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27786);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27787);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27788);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27789);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27790);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27791);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27792);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27793);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27794);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27795);copy = test.minuteOfHour().addNoWrapToCopy(-9); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27796);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27797);copy = test.minuteOfHour().addNoWrapToCopy(-19); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27798);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27799);copy = test.minuteOfHour().addNoWrapToCopy(-20); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27800);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27801);copy = test.minuteOfHour().addNoWrapToCopy(-21); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27802);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27803);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27804);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27805);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27806);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27807);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27808);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyPlusWrapFieldMinute1011() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gli9s9lgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMinute1011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gli9s9lgh(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27809); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27810);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27811);LocalTime copy = test.minuteOfHour().addWrapFieldToCopy(9); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27812);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27813);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27814);copy = test.minuteOfHour().addWrapFieldToCopy(49); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27815);check(copy, 10, 9, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27816);copy = test.minuteOfHour().addWrapFieldToCopy(-47); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27817);check(copy, 10, 33, 30, 40); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertySetSecond1012() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdbriulgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond1012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdbriulgq(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27818); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27819);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27820);LocalTime copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27821);check(test, 10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27822);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27823);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27824);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27825);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27826);try { 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27827);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1ldfldfle6rjcmb.R.inc(27828);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour1013() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1si426alh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour1013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1si426alh1(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27829); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27830);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27831);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27832);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 


public void testPropertyRoundHour1014() {__CLR4_4_1ldfldfle6rjcmb.R.globalSliceStart(getClass().getName(),27833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0mid0lh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ldfldfle6rjcmb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ldfldfle6rjcmb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour1014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0mid0lh5(){try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27833); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27834);LocalTime test = new LocalTime(10, 20); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27835);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27836);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27837);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27838);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27839);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27840);test = new LocalTime(10, 40); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27841);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27842);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27843);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27844);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27845);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27846);test = new LocalTime(10, 30); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27847);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27848);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27849);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27850);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27851);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27852);test = new LocalTime(11, 30); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27853);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27854);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27855);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27856);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1ldfldfle6rjcmb.R.inc(27857);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0); 
 }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1ldfldfle6rjcmb.R.inc(27858);
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27859);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27860);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27861);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ldfldfle6rjcmb.R.inc(27862);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1ldfldfle6rjcmb.R.flushNeeded();}}
}
