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
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1he4he4le6o79o9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1he4he4le6o79o9.R.inc(22540);
        __CLR4_4_1he4he4le6o79o9.R.inc(22541);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1he4he4le6o79o9.R.inc(22542);
        __CLR4_4_1he4he4le6o79o9.R.inc(22543);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1he4he4le6o79o9.R.inc(22545);try{__CLR4_4_1he4he4le6o79o9.R.inc(22544);
    }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1he4he4le6o79o9.R.inc(22546);
        __CLR4_4_1he4he4le6o79o9.R.inc(22547);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1he4he4le6o79o9.R.inc(22548);zone = DateTimeZone.getDefault();
        __CLR4_4_1he4he4le6o79o9.R.inc(22549);locale = Locale.getDefault();
        __CLR4_4_1he4he4le6o79o9.R.inc(22550);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1he4he4le6o79o9.R.inc(22551);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1he4he4le6o79o9.R.inc(22552);
        __CLR4_4_1he4he4le6o79o9.R.inc(22553);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1he4he4le6o79o9.R.inc(22554);DateTimeZone.setDefault(zone);
        __CLR4_4_1he4he4le6o79o9.R.inc(22555);Locale.setDefault(locale);
        __CLR4_4_1he4he4le6o79o9.R.inc(22556);zone = null;
    }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetWeekyear240() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fopoffhel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fopoffhel(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22557); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22558);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22559);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22560);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22561);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22562);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22563);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22564);assertEquals("2004", test.weekyear().getAsString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22565);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22566);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22567);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22568);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22569);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22570);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22571);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22572);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertySetTextDayOfYear241() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yshaqhf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfYear241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yshaqhf1(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22573); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22574);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22575);DateTime copy = test.dayOfYear().setCopy("12"); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22576);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22577);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyEqualsHashCodeStrict242() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13eblylhf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13eblylhf6(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22578); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22579);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22580);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22581);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22582);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22583);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22584);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22585);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22586);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22587);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyGetMinute243() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flt9clhfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinute243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flt9clhfg(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22588); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22589);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22590);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22591);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22592);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22593);assertSame(test, test.minuteOfHour().getDateTime()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22594);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22595);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22596);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22597);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22598);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22599);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22600);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22601);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22602);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22603);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyAddYear244() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtj8lahfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddYear244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtj8lahfw(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22604); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22605);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22606);DateTime copy = test.year().addToCopy(9); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22607);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22608);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22609);copy = test.year().addToCopy(0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22610);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22611);copy = test.year().addToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22612);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22613);copy = test.year().addToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22614);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyGetMinute356() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3aokohg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinute356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3aokohg7(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22615); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22616);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22617);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22618);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22619);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22620);assertSame(test, test.minuteOfHour().getReadablePartial()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22621);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22622);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22623);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22624);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22625);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22626);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22627);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22628);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22629);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22630);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22631);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyGetMinute357() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euaps7hgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinute357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euaps7hgo(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22632); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22633);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22634);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22635);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22636);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22637);assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22638);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22639);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22640);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22641);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22642);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22643);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22644);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22645);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22646);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22647);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
public void testPropertyGetMaxMinValuesDayOfYear358() {__CLR4_4_1he4he4le6o79o9.R.globalSliceStart(getClass().getName(),22648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpduz8hh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1he4he4le6o79o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1he4he4le6o79o9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpduz8hh4(){try{__CLR4_4_1he4he4le6o79o9.R.inc(22648); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22649);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22650);assertEquals(1, test.dayOfYear().getMinimumValue()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22651);assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22652);assertEquals(366, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22653);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22654);test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22655);assertEquals(365, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1he4he4le6o79o9.R.inc(22656);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1he4he4le6o79o9.R.flushNeeded();}}
    

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
