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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1k0xk0xle6ndpts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25953);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25954);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25955);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25956);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1k0xk0xle6ndpts.R.inc(25958);try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25957);
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25959);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25960);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25961);zone = DateTimeZone.getDefault();
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25962);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25963);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25964);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25965);DateTimeZone.setDefault(zone);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(25966);zone = null;
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP1() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),25967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lhc5dk1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsContiguous_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lhc5dk1b(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25967); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25968);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25969);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25970);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25971);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25972);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25973);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25974);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25975);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25976);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25977);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25978);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25979);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25980);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25981);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25982);try { 
         __CLR4_4_1k0xk0xle6ndpts.R.inc(25983);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1k0xk0xle6ndpts.R.inc(25984);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPropertyAddHour129() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),25985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edwaank1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyAddHour129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edwaank1t(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(25985); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25986);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25987);TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25988);check(test, 10, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25989);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25990);copy = test.hourOfDay().addToCopy(0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25991);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25992);copy = test.hourOfDay().addToCopy(13); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25993);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25994);copy = test.hourOfDay().addToCopy(14); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25995);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25996);copy = test.hourOfDay().addToCopy(-10); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25997);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25998);copy = test.hourOfDay().addToCopy(-11); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(25999);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testMinusMillis_int130() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j38lbk28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j38lbk28(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26000); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26001);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26002);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26003);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26004);assertEquals(expected, result); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26005);result = test.minusMillis(0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26006);assertSame(test, result); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPropertyGetHourOfDay245() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbyj1kk2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyGetHourOfDay245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbyj1kk2f(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26007); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26008);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26009);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26010);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26011);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26012);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26013);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26014);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26015);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26016);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26017);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26018);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26019);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26020);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26021);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26022);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPropertyGetMinuteOfHour247() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzfnfik2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyGetMinuteOfHour247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzfnfik2v(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26023); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26024);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26025);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26026);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26027);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26028);assertSame(test, test.minuteOfHour().getDateTime()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26029);assertEquals(23, test.minuteOfHour().get()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26030);assertEquals("23", test.minuteOfHour().getAsString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26031);assertEquals("23", test.minuteOfHour().getAsText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26032);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26033);assertEquals("23", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26034);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26035);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26036);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26037);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26038);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPropertyGetMillisOfSecond249() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cethwek3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyGetMillisOfSecond249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cethwek3b(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26039); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26040);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26041);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26042);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26043);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26044);assertSame(test, test.millisOfSecond().getDateTime()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26045);assertEquals(53, test.millisOfSecond().get()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26046);assertEquals("53", test.millisOfSecond().getAsString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26047);assertEquals("53", test.millisOfSecond().getAsText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26048);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26049);assertEquals("53", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26050);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26051);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26052);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26053);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26054);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPropertyAddMonthOfYear251() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyafetk3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyAddMonthOfYear251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyafetk3r(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26055); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26056);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26057);DateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26058);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26059);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26060);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26061);assertEquals("2005-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26062);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26063);assertEquals("2004-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26064);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26065);assertEquals("2003-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26066);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26067);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26068);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26069);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26070);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26071);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26072);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26073);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26074);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26075);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26076);assertEquals("2003-02-28T00:00:00.000Z", copy.toString());
}finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}

public void testPropertyWithMinimumValueMillisOfDayDSTGap255() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ighk1lk4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPropertyWithMinimumValueMillisOfDayDSTGap255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ighk1lk4d(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26077); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26078);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26079);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26080);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26081);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testWithChronologyRetainFields_sameChrono562() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ynabmk4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ynabmk4i(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26082); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26083);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26084);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26085);assertSame(base, test); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testWithField4563() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172qna1k4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField4563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172qna1k4m(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26086); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26087);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26088);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26089);assertSame(test, result); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testPlus_RP564() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptkfsnk4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptkfsnk4q(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26090); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26091);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26092);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26093);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26094);assertEquals(expected, result); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26095);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26096);assertSame(test, result); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
public void testToDateTimeToday_nullZone568() {__CLR4_4_1k0xk0xle6ndpts.R.globalSliceStart(getClass().getName(),26097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2uewrk4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0xk0xle6ndpts.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0xk0xle6ndpts.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_nullZone568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2uewrk4x(){try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26097); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26098);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26099);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26100);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26101);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26102);check(base, 10, 20, 30, 40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26103);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26104);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26105);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26106);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26107);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1k0xk0xle6ndpts.R.inc(26108);assertEquals(expected, test); 
 }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26109);
            __CLR4_4_1k0xk0xle6ndpts.R.inc(26110);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26111);
            __CLR4_4_1k0xk0xle6ndpts.R.inc(26112);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26113);
            __CLR4_4_1k0xk0xle6ndpts.R.inc(26114);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
    }

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
    

    

    // Removed as too complex
//    /**
//     * Merges two partial together, taking account of the different chronologies.
//     *
//     * @param main  the main partial
//     * @param base  the partial to use as a base to merge on top of
//     * @param instant  the instant to start from and to use for missing fields
//     * @return the merged instant
//     */
//    public long merge(ReadablePartial main, ReadablePartial base, long instant) {
//        DateTimeZone zone = main.getChronology().getZone();
//        instant = base.getChronology().withZone(zone).set(base, instant);
//        return set(main, instant);
//    }
//
//    //-----------------------------------------------------------------------
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields and using the default time zone.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology.
//     *
//     * @param date  the date to use, null means today
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date) {
//        return toDateTime(date, null);
//    }
//
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology and just assigns the fields.
//     *
//     * @param date  the date to use, null means today
//     * @param zone  the zone to get the DateTime in, null means default
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date, DateTimeZone zone) {
//        Chronology chrono = getChronology().withZone(zone);
//        if (date == null) {
//            DateTime dt = new DateTime(chrono);
//            return dt.withFields(this);
//        } else {
//            long millis = chrono.merge(this, date, DateTimeUtils.currentTimeMillis());
//            return new DateTime(millis, chrono);
//        }
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_TOKYO);
//        
//        DateTime test = base.toDateTime(ymd);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(TOKYO), COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_YMD_nullZone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1k0xk0xle6ndpts.R.inc(26115);
        __CLR4_4_1k0xk0xle6ndpts.R.inc(26116);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1k0xk0xle6ndpts.R.inc(26117);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1k0xk0xle6ndpts.R.inc(26118);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1k0xk0xle6ndpts.R.inc(26119);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1k0xk0xle6ndpts.R.flushNeeded();}}
}
