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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1hgchgcle6ndpfh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22620);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22621);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22622);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22623);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1hgchgcle6ndpfh.R.inc(22625);try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22624);
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22626);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22627);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22628);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22629);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22630);originalLocale = Locale.getDefault();
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22631);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22632);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22633);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22634);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22635);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22636);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22637);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22638);Locale.setDefault(originalLocale);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22639);originalDateTimeZone = null;
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22640);originalTimeZone = null;
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22641);originalLocale = null;
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithTime227() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x80inthgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x80inthgy(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22642); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22643);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22644);DateTime result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22645);DateTime expected = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22646);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22647);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22648);result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22649);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testWithTime228() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk3kiuhh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk3kiuhh6(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22650); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22651);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22652);DateTime result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22653);DateTime expected = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22654);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22655);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22656);result = test.withTime(0, 8, 7, 6); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22657);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testWithFieldAdded2229() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpr84hhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpr84hhe(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22658); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22659);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22660);try { 
         __CLR4_4_1hgchgcle6ndpfh.R.inc(22661);test.withFieldAdded(null, 0); 
         __CLR4_4_1hgchgcle6ndpfh.R.inc(22662);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testWithDurationAdded_long_int230() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u456lbhhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u456lbhhj(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22663); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22664);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22665);DateTime result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22666);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22667);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22668);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22669);assertSame(test, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22670);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22671);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22672);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22673);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22674);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22675);assertEquals(expected, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testWithDurationAdded_RD_int3231() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4d38vhhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int3231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4d38vhhw(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22676); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22677);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22678);DateTime result = test.withDurationAdded(new Duration(123456789L), -1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22679);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22680);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22681);result = test.withDurationAdded(null, -1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22682);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testWithDurationAdded_RD_int232() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187vrhnhi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187vrhnhi3(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22683); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22684);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22685);DateTime result = test.withDurationAdded(new Duration(123456789L), -1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22686);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22687);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22688);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22689);assertSame(test, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22690);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22691);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22692);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22693);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22694);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22695);assertEquals(expected, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testMinusMonths_int235() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lcbz16hig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lcbz16hig(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22696); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22697);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22698);DateTime result = test.minusMonths(1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22699);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22700);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22701);result = test.minusMonths(0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22702);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testMinusHours_int236() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h6pethin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h6pethin(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22703); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22704);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22705);DateTime result = test.minusHours(1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22706);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22707);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22708);result = test.minusHours(0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22709);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testMinusMinutes_int237() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gt7uz8hiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gt7uz8hiu(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22710); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22711);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22712);DateTime result = test.minusMinutes(1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22713);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22714);assertEquals(expected, result); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22715);result = test.minusMinutes(0); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22716);assertSame(test, result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testToLocalDateTime238() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txqcfvhj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txqcfvhj1(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22717); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22718);DateTime test = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22719);LocalDateTime result = test.toLocalDateTime(); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22720);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22721);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), result); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testToLocalTime240() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlo9sahj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlo9sahj6(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22722); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22723);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22724);LocalTime expected = new LocalTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22725);assertEquals(expected, base.toLocalTime()); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
public void testToMutableDateTime_DateTimeZone703() {__CLR4_4_1hgchgcle6ndpfh.R.globalSliceStart(getClass().getName(),22726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18asqy9hja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hgchgcle6ndpfh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hgchgcle6ndpfh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18asqy9hja(){try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22726); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22727);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22728);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22729);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22730);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22731);test = new Instant(TEST_TIME1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22732);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22733);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22734);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22735);test = new Instant(TEST_TIME1); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22736);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22737);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1hgchgcle6ndpfh.R.inc(22738);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22739);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22740);return null;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22741);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22742);return TEST_TIME1;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22743);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22744);return ISO_DEFAULT;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22745);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22746);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22747);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22748);return null;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22749);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22750);return this;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22751);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22752);return this;
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22753);
            __CLR4_4_1hgchgcle6ndpfh.R.inc(22754);return "";
        }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1hgchgcle6ndpfh.R.inc(22755);
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22756);assertEquals(year, test.getYear());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22757);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22758);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22759);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22760);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22761);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1hgchgcle6ndpfh.R.inc(22762);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1hgchgcle6ndpfh.R.flushNeeded();}}

}
