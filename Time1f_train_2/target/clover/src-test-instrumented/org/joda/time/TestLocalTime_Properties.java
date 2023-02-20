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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1l9sl9sle6qsf0y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,27747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27568);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27569);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27570);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27571);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1l9sl9sle6qsf0y.R.inc(27573);try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27572);
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27574);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27575);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27576);zone = DateTimeZone.getDefault();
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27577);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27578);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27579);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27580);DateTimeZone.setDefault(zone);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27581);zone = null;
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMinute951() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf5e4vla6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute951",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf5e4vla6(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27582); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27583);LocalTime test1 = new LocalTime(TEST_TIME1); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27584);LocalTime test2 = new LocalTime(TEST_TIME2); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27585);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27586);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27587);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27588);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27589);test1.minuteOfHour().compareTo((ReadablePartial) null); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27590);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27591);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27592);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27593);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27594);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27595);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27596);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27597);test1.minuteOfHour().compareTo((ReadableInstant) null); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27598);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyGetHour973() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4iggnlan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour973",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4iggnlan(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27599); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27600);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27601);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27602);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27603);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27604);assertSame(test, test.hourOfDay().getLocalTime()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27605);assertEquals(10, test.hourOfDay().get()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27606);assertEquals("10", test.hourOfDay().getAsString()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27607);assertEquals("10", test.hourOfDay().getAsText()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27608);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27609);assertEquals("10", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27610);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27611);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27612);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27613);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27614);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertySetTextSecond974() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1ulb3lb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond974",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1ulb3lb3(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27615); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27616);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27617);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27618);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27619);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertySetMilli975() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zr2tolb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli975",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zr2tolb8(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27620); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27621);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27622);LocalTime copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27623);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27624);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27625);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27626);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27627);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27628);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27629);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27630);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyGetMinute980() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9xyujlbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute980",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9xyujlbj(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27631); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27632);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27633);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27634);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27635);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27636);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27637);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27638);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27639);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27640);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27641);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27642);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27643);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27644);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27645);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27646);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyPlusHour981() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m4afqslbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour981",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m4afqslbz(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27647); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27648);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27649);LocalTime copy = test.hourOfDay().addCopy(9); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27650);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27651);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27652);copy = test.hourOfDay().addCopy(0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27653);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27654);copy = test.hourOfDay().addCopy(13); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27655);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27656);copy = test.hourOfDay().addCopy(14); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27657);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27658);copy = test.hourOfDay().addCopy(-10); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27659);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27660);copy = test.hourOfDay().addCopy(-11); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27661);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyPlusNoWrapMinute982() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17aogfalce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute982",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17aogfalce(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27662); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27663);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27664);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27665);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27666);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27667);copy = test.minuteOfHour().addNoWrapToCopy(39); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27668);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27669);copy = test.minuteOfHour().addNoWrapToCopy(40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27670);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27671);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27672);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27673);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27674);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27675);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27676);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27677);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27678);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27679);copy = test.minuteOfHour().addNoWrapToCopy(-9); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27680);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27681);copy = test.minuteOfHour().addNoWrapToCopy(-19); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27682);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27683);copy = test.minuteOfHour().addNoWrapToCopy(-20); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27684);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27685);copy = test.minuteOfHour().addNoWrapToCopy(-21); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27686);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27687);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27688);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27689);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27690);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27691);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27692);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyPlusWrapFieldMinute983() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdh5x4ld9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMinute983",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdh5x4ld9(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27693); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27694);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27695);LocalTime copy = test.minuteOfHour().addWrapFieldToCopy(9); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27696);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27697);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27698);copy = test.minuteOfHour().addWrapFieldToCopy(49); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27699);check(copy, 10, 9, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27700);copy = test.minuteOfHour().addWrapFieldToCopy(-47); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27701);check(copy, 10, 33, 30, 40); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertySetSecond984() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4cej7ldi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond984",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4cej7ldi(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27702); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27703);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27704);LocalTime copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27705);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27706);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27707);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27708);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27709);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27710);try { 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27711);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1l9sl9sle6qsf0y.R.inc(27712);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour985() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ofu8zldt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour985",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ofu8zldt(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27713); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27714);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27715);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27716);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 


public void testPropertyRoundHour986() {__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceStart(getClass().getName(),27717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1id239vldx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9sl9sle6qsf0y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9sl9sle6qsf0y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour986",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1id239vldx(){try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27717); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27718);LocalTime test = new LocalTime(10, 20); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27719);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27720);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27721);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27722);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27723);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27724);test = new LocalTime(10, 40); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27725);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27726);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27727);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27728);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27729);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27730);test = new LocalTime(10, 30); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27731);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27732);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27733);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27734);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27735);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27736);test = new LocalTime(11, 30); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27737);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27738);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27739);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27740);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1l9sl9sle6qsf0y.R.inc(27741);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0); 
 }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1l9sl9sle6qsf0y.R.inc(27742);
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27743);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27744);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27745);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1l9sl9sle6qsf0y.R.inc(27746);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1l9sl9sle6qsf0y.R.flushNeeded();}}
}
