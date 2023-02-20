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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1hcvhcvle6np4cv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);
    
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22495);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22496);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22497);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22498);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1hcvhcvle6np4cv.R.inc(22500);try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22499);
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22501);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22502);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22503);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22504);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22505);originalLocale = Locale.getDefault();
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22506);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22507);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22508);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22509);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22510);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22511);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22512);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22513);Locale.setDefault(originalLocale);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22514);originalDateTimeZone = null;
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22515);originalTimeZone = null;
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22516);originalLocale = null;
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithField1228() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7jtf4hdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7jtf4hdh(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22517); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22518);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22519);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22520);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22521);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testPlus_RD229() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wto9zvhdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wto9zvhdm(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22522); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22523);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22524);DateTime result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22525);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22526);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22527);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22528);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testPlusWeeks_int231() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nvvh0hdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nvvh0hdt(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22529); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22530);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22531);DateTime result = test.plusWeeks(1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22532);DateTime expected = new DateTime(2002, 5, 10, 10, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22533);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22534);result = test.plusWeeks(0); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22535);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testBug3476684_adjustOffset_springGap232() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vha0zhe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testBug3476684_adjustOffset_springGap232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vha0zhe0(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22536); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22537);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22538);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22539);DateTime baseBefore = base.plusHours(1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22540);DateTime baseAfter = base.plusHours(2); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22541);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22542);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22543);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22544);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22545);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22546);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testPlusMinutes_int233() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1deijg6heb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1deijg6heb(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22547); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22548);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22549);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22550);DateTime expected = new DateTime(2003, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22551);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22552);result = test.plusMinutes(0); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22553);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testPlusMinutes_int234() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnii8nhei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnii8nhei(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22554); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22555);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22556);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22557);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22558);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22559);result = test.plusMinutes(0); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22560);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testMinus_RD237() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqvc3uhep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqvc3uhep(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22561); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22562);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22563);DateTime result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22564);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22565);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22566);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22567);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testMinusYears_int239() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3rbnbhew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3rbnbhew(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22568); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22569);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22570);DateTime result = test.minusYears(1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22571);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22572);assertEquals(expected, result); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22573);result = test.minusYears(0); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22574);assertSame(test, result); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void test_isSupported_DateTimeFieldType603() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hy9n3hf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.test_isSupported_DateTimeFieldType603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hy9n3hf3(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22575); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22576);Instant test = new Instant(); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22577);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22578);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22579);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22580);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22581);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22582);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22583);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22584);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22585);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22586);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22587);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22588);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22589);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22590);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testIsSupported604() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmdyi9hfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmdyi9hfj(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22591); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22592);Instant test = new Instant(); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22593);assertEquals(false, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22594);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22595);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22596);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22597);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22598);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22599);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22600);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22601);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22602);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22603);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22604);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22605);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22606);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testToMutableDateTimeISO607() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czt9wzhfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czt9wzhfz(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22607); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22608);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22609);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22610);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22611);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22612);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22613);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testIsAfterNow608() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jdg1bhg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jdg1bhg6(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22614); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22615);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isAfterNow()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22616);assertEquals(false, new Instant(TEST_TIME_NOW).isAfterNow()); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22617);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isAfterNow()); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
public void testIsAfter_RI609() {__CLR4_4_1hcvhcvle6np4cv.R.globalSliceStart(getClass().getName(),22618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rd54nkhga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hcvhcvle6np4cv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hcvhcvle6np4cv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rd54nkhga(){try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22618); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22619);Instant test1 = new Instant(TEST_TIME1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22620);Instant test1a = new Instant(TEST_TIME1); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22621);assertEquals(true, test1.isAfter(test1a)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22622);assertEquals(true, test1a.isAfter(test1)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22623);assertEquals(true, test1.isAfter(test1)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22624);assertEquals(true, test1a.isAfter(test1a)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22625);Instant test2 = new Instant(TEST_TIME2); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22626);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22627);assertEquals(false, test2.isAfter(test1)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22628);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22629);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22630);assertEquals(false, test3.isAfter(test1)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22631);assertEquals(true, test3.isAfter(test2)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22632);assertEquals(false, test2.isAfter(new MockInstant())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22633);assertEquals(true, test1.isAfter(new MockInstant())); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22634);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isAfter(null)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22635);assertEquals(true, new Instant(TEST_TIME_NOW).isAfter(null)); 
     __CLR4_4_1hcvhcvle6np4cv.R.inc(22636);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isAfter(null)); 
 }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22637);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22638);return null;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22639);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22640);return TEST_TIME1;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22641);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22642);return ISO_DEFAULT;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22643);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22644);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22645);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22646);return null;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22647);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22648);return this;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22649);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22650);return this;
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22651);
            __CLR4_4_1hcvhcvle6np4cv.R.inc(22652);return "";
        }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}
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
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------    
    
    
    
    
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------    
    
    
    
    
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1hcvhcvle6np4cv.R.inc(22653);
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22654);assertEquals(year, test.getYear());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22655);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22656);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22657);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22658);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22659);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1hcvhcvle6np4cv.R.inc(22660);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1hcvhcvle6np4cv.R.flushNeeded();}}

}
