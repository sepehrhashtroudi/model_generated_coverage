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
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1gvngvnle6ndpcj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
//    private long TEST_TIME_NOW_PARIS =
//            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
            
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
        
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21875);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21876);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21877);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21878);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1gvngvnle6ndpcj.R.inc(21880);try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21879);
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21881);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21882);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21883);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21884);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21885);originalLocale = Locale.getDefault();
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21886);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21887);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21888);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21889);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21890);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21891);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21892);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21893);Locale.setDefault(originalLocale);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21894);originalDateTimeZone = null;
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21895);originalTimeZone = null;
        __CLR4_4_1gvngvnle6ndpcj.R.inc(21896);originalLocale = null;
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithField2712() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utvoz5gw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField2712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utvoz5gw9(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21897); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21898);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21899);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21900);test.withField(null, 6); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21901);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testWithFieldAdded2713() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ara558gwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded2713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ara558gwe(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21902); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21903);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21904);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21905);test.withFieldAdded(null, 0); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21906);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testWithDurationAdded_long_int714() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzu7nagwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzu7nagwj(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21907); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21908);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21909);DateMidnight result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21910);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21911);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21912);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21913);assertSame(test, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21914);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21915);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21916);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21917);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21918);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21919);assertEquals(expected, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testWithDurationAdded_RD_int3715() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a78ficgww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RD_int3715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a78ficgww(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21920); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21921);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21922);DateMidnight result = test.withDurationAdded(new Duration(123456789L), -1); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21923);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21924);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21925);result = test.withDurationAdded(null, -1); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21926);assertSame(test, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testWithDurationAdded_RD_int716() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m50f86gx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RD_int716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m50f86gx3(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21927); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21928);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21929);DateMidnight result = test.withDurationAdded(new Duration(123456789L), -1); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21930);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21931);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21932);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21933);assertSame(test, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21934);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21935);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21936);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21937);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21938);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21939);assertEquals(expected, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testPlus_long717() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rn7ijgxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rn7ijgxg(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21940); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21941);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21942);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21943);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21944);assertEquals(expected, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testPlus_RD718() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atg1nkgxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atg1nkgxl(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21945); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21946);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21947);DateMidnight result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21948);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21949);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21950);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21951);assertSame(test, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testMinusYears_int719() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0w47ygxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0w47ygxs(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21952); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21953);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21954);DateMidnight result = test.minusYears(1); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21955);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21956);assertEquals(expected, result); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21957);result = test.minusYears(0); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21958);assertSame(test, result); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testProperty720() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg52s5gxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg52s5gxz(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21959); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21960);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21961);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21962);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21963);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21964);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21965);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21966);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21967);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21968);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21969);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21970);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21971);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21972);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21973);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21974);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21975);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21976);test.property(null); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21977);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testProperty721() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybz0eigyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybz0eigyi(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21978); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21979);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21980);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21981);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21982);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21983);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21984);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21985);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21986);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21987);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21988);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21989);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21990);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21991);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21992);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21993);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21994);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21995);test.property(null); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(21996);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testProperty722() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),21997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2z1m1gz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2z1m1gz1(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(21997); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21998);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(21999);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22000);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22001);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22002);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22003);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22004);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22005);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22006);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22007);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22008);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22009);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22010);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(22011);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(22012);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22013);try { 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(22014);test.property(null); 
         __CLR4_4_1gvngvnle6ndpcj.R.inc(22015);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testToLocalDate724() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),22016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ico6l0gzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ico6l0gzk(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22016); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22017);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22018);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22019);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
public void testPropertyGetWeekOfWeekyear727() {__CLR4_4_1gvngvnle6ndpcj.R.globalSliceStart(getClass().getName(),22020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o6160gzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvngvnle6ndpcj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvngvnle6ndpcj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPropertyGetWeekOfWeekyear727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o6160gzo(){try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22020); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22021);DateMidnight test = new DateMidnight(2004, 6, 7); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22022);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22023);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22024);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22025);assertSame(test, test.weekOfWeekyear().getDateMidnight()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22026);assertEquals(2004, test.weekOfWeekyear().get()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22027);assertEquals("2004", test.weekOfWeekyear().getAsText()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22028);assertEquals("2004", test.weekOfWeekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22029);assertEquals("2004", test.weekOfWeekyear().getAsShortText()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22030);assertEquals("2004", test.weekOfWeekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22031);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22032);assertEquals(null, test.weekOfWeekyear().getRangeDurationField()); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22033);assertEquals(9, test.weekOfWeekyear().getMaximumTextLength(null)); 
     __CLR4_4_1gvngvnle6ndpcj.R.inc(22034);assertEquals(9, test.weekOfWeekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22035);
            __CLR4_4_1gvngvnle6ndpcj.R.inc(22036);return null;
        }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22037);
            __CLR4_4_1gvngvnle6ndpcj.R.inc(22038);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22039);
            __CLR4_4_1gvngvnle6ndpcj.R.inc(22040);return ISO_DEFAULT;
        }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1gvngvnle6ndpcj.R.inc(22041);
        __CLR4_4_1gvngvnle6ndpcj.R.inc(22042);assertEquals(year, test.getYear());
        __CLR4_4_1gvngvnle6ndpcj.R.inc(22043);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1gvngvnle6ndpcj.R.inc(22044);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1gvngvnle6ndpcj.R.flushNeeded();}}

}
