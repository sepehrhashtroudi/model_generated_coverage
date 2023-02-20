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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1iqaiqale6ndpm3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24274);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24275);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24276);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24277);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1iqaiqale6ndpm3.R.inc(24279);try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24278);
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24280);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24281);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24282);zone = DateTimeZone.getDefault();
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24283);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24284);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24285);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24286);DateTimeZone.setDefault(zone);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24287);zone = null;
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToSecond461() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svr72hiqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToSecond461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svr72hiqo(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24288); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24289);LocalTime test1 = new LocalTime(TEST_TIME1); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24290);LocalTime test2 = new LocalTime(TEST_TIME2); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24291);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24292);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24293);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24294);try { 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24295);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24296);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24297);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24298);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24299);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24300);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24301);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24302);try { 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24303);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24304);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
public void testProperty465() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwwhjnir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testProperty465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwwhjnir5(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24305); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24306);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24307);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24308);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24309);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24310);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24311);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24312);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24313);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24314);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24315);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24316);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24317);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24318);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24319);try { 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24320);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24321);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24322);try { 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24323);test.property(null); 
         __CLR4_4_1iqaiqale6ndpm3.R.inc(24324);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
public void testPropertyGetMinute475() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2jl4airp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2jl4airp(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24325); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24326);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24327);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24328);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24329);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24330);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24331);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24332);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24333);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24334);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24335);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24336);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24337);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24338);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24339);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24340);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
public void testPropertySetTextSecond476() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vl7eqis5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vl7eqis5(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24341); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24342);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24343);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24344);check(test, 10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24345);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
public void testPropertyWithMaximumValueHour478() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b3oqiisa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaximumValueHour478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b3oqiisa(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24346); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24347);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24348);LocalTime copy = test.hourOfDay().withMaximumValue(); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24349);check(test, 10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24350);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
public void testPropertyWithMinimumValueHour479() {__CLR4_4_1iqaiqale6ndpm3.R.globalSliceStart(getClass().getName(),24351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1siukuhisf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqale6ndpm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqale6ndpm3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMinimumValueHour479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1siukuhisf(){try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24351); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24352);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24353);LocalTime copy = test.hourOfDay().withMinimumValue(); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24354);check(test, 10, 20, 30, 40); 
     __CLR4_4_1iqaiqale6ndpm3.R.inc(24355);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1iqaiqale6ndpm3.R.inc(24356);
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24357);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24358);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24359);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1iqaiqale6ndpm3.R.inc(24360);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1iqaiqale6ndpm3.R.flushNeeded();}}
}
