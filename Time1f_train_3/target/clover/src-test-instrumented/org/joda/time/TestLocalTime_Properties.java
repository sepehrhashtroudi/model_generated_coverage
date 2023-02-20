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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1l7nl7nle6rcl82{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27491);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27492);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27493);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27494);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1l7nl7nle6rcl82.R.inc(27496);try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27495);
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27497);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27498);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27499);zone = DateTimeZone.getDefault();
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27500);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27501);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27502);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27503);DateTimeZone.setDefault(zone);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27504);zone = null;
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMinute951() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf5e4vl81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute951",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf5e4vl81(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27505); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27506);LocalTime test1 = new LocalTime(TEST_TIME1); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27507);LocalTime test2 = new LocalTime(TEST_TIME2); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27508);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27509);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27510);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27511);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27512);test1.minuteOfHour().compareTo((ReadablePartial) null); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27513);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27514);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27515);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27516);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27517);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27518);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27519);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27520);test1.minuteOfHour().compareTo((ReadableInstant) null); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27521);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertyGetHour973() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4iggnl8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour973",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4iggnl8i(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27522); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27523);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27524);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27525);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27526);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27527);assertSame(test, test.hourOfDay().getLocalTime()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27528);assertEquals(10, test.hourOfDay().get()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27529);assertEquals("10", test.hourOfDay().getAsString()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27530);assertEquals("10", test.hourOfDay().getAsText()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27531);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27532);assertEquals("10", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27533);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27534);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27535);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27536);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27537);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertySetTextSecond974() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1ulb3l8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond974",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1ulb3l8y(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27538); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27539);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27540);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27541);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27542);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertySetMilli975() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zr2tol93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli975",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zr2tol93(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27543); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27544);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27545);LocalTime copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27546);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27547);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27548);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27549);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27550);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27551);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27552);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27553);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertyPlusHour979() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ief9j1l9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour979",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ief9j1l9e(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27554); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27555);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27556);LocalTime copy = test.hourOfDay().addCopy(9); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27557);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27558);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27559);copy = test.hourOfDay().addCopy(0); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27560);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27561);copy = test.hourOfDay().addCopy(13); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27562);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27563);copy = test.hourOfDay().addCopy(14); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27564);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27565);copy = test.hourOfDay().addCopy(-10); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27566);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27567);copy = test.hourOfDay().addCopy(-11); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27568);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertyPlusNoWrapMinute980() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsoe08l9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute980",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsoe08l9t(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27569); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27570);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27571);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27572);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27573);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27574);copy = test.minuteOfHour().addNoWrapToCopy(39); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27575);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27576);copy = test.minuteOfHour().addNoWrapToCopy(40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27577);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27578);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27579);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27580);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27581);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27582);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27583);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27584);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27585);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27586);copy = test.minuteOfHour().addNoWrapToCopy(-9); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27587);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27588);copy = test.minuteOfHour().addNoWrapToCopy(-19); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27589);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27590);copy = test.minuteOfHour().addNoWrapToCopy(-20); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27591);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27592);copy = test.minuteOfHour().addNoWrapToCopy(-21); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27593);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27594);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27595);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27596);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27597);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27598);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27599);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertySetSecond981() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvcawmlao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond981",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvcawmlao(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27600); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27601);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27602);LocalTime copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27603);check(test, 10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27604);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27605);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27606);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27607);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27608);try { 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27609);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1l7nl7nle6rcl82.R.inc(27610);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour982() {__CLR4_4_1l7nl7nle6rcl82.R.globalSliceStart(getClass().getName(),27611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182k24glaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7nl7nle6rcl82.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7nl7nle6rcl82.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour982",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182k24glaz(){try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27611); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27612);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27613);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40); 
     __CLR4_4_1l7nl7nle6rcl82.R.inc(27614);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40); 
 }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1l7nl7nle6rcl82.R.inc(27615);
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27616);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27617);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27618);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1l7nl7nle6rcl82.R.inc(27619);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1l7nl7nle6rcl82.R.flushNeeded();}}
}
