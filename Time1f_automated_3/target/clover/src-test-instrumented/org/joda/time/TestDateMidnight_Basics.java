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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1gvvgvvle6np4av{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1gvvgvvle6np4av.R.inc(21883);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21884);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gvvgvvle6np4av.R.inc(21885);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21886);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1gvvgvvle6np4av.R.inc(21888);try{__CLR4_4_1gvvgvvle6np4av.R.inc(21887);
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gvvgvvle6np4av.R.inc(21889);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21890);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21891);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1gvvgvvle6np4av.R.inc(21892);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1gvvgvvle6np4av.R.inc(21893);originalLocale = Locale.getDefault();
        __CLR4_4_1gvvgvvle6np4av.R.inc(21894);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21895);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1gvvgvvle6np4av.R.inc(21896);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gvvgvvle6np4av.R.inc(21897);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21898);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gvvgvvle6np4av.R.inc(21899);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21900);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21901);Locale.setDefault(originalLocale);
        __CLR4_4_1gvvgvvle6np4av.R.inc(21902);originalDateTimeZone = null;
        __CLR4_4_1gvvgvvle6np4av.R.inc(21903);originalTimeZone = null;
        __CLR4_4_1gvvgvvle6np4av.R.inc(21904);originalLocale = null;
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetMonthOfYear_int_dstOverlapSummer_addZero97() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165x7udgwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testSetMonthOfYear_int_dstOverlapSummer_addZero97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165x7udgwh(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21905); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21906);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21907);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21908);test.setMonthOfYear(10); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21909);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testPropertySetMonthOfYear406() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mciw94gwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPropertySetMonthOfYear406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mciw94gwm(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21910); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21911);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21912);DateMidnight copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21913);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21914);assertEquals(12, copy.getMonthOfYear()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21915);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testPropertyCompareToMonthOfYear619() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6pbd6gws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPropertyCompareToMonthOfYear619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6pbd6gws(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21916); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21917);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21918);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21919);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21920);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21921);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21922);try { 
         __CLR4_4_1gvvgvvle6np4av.R.inc(21923);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1gvvgvvle6np4av.R.inc(21924);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21925);DateTime dt1 = new DateTime(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21926);DateTime dt2 = new DateTime(TEST_TIME2_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21927);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21928);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21929);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21930);try { 
         __CLR4_4_1gvvgvvle6np4av.R.inc(21931);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1gvvgvvle6np4av.R.inc(21932);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testConstructor_long_nullDateTimeZone620() throws Throwable {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwa7ghgx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testConstructor_long_nullDateTimeZone620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwa7ghgx9() throws Throwable{try{__CLR4_4_1gvvgvvle6np4av.R.inc(21933); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21934);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21935);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21936);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testConstructor_long1_Chronology621() throws Throwable {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1df50u5gxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testConstructor_long1_Chronology621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1df50u5gxd() throws Throwable{try{__CLR4_4_1gvvgvvle6np4av.R.inc(21937); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21938);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21939);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21940);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testWithZoneRetainFields_DateTimeZone1625() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pefcergxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone1625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pefcergxh(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21941); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21942);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21943);DateMidnight result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21944);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21945);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21946);assertEquals(PARIS, result.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21947);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21948);result = test.withZoneRetainFields(null); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21949);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21950);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21951);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21952);result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21953);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21954);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21955);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21956);result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21957);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21958);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21959);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21960);result = test.withZoneRetainFields(null); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21961);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21962);assertEquals(ISO_DEFAULT, result.getChronology()); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testWithFields_RPartial628() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128xu86gy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128xu86gy3(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21963); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21964);DateMidnight test = new DateMidnight(2004, 5, 6); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21965);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21966);DateMidnight expected = new DateMidnight(2003, 4, 5); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21967);assertEquals(expected, result); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21968);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21969);result = test.withFields(null); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21970);assertSame(test, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testWithFieldAdded1630() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1daxygpgyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded1630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1daxygpgyb(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21971); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21972);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21973);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21974);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21975);assertEquals(new DateMidnight(2010, 6, 9), result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testPlus_long631() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yq6kacgyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yq6kacgyg(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21976); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21977);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21978);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21979);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21980);assertEquals(expected, result); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21981);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21982);assertSame(test, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testPlusMonths_int632() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbkm5pgyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbkm5pgyn(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21983); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21984);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21985);DateMidnight result = test.plusMonths(1); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21986);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21987);assertEquals(expected, result); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21988);result = test.plusMonths(0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21989);assertSame(test, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testMinus_long633() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mjvnkgyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mjvnkgyu(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21990); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21991);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21992);DateMidnight result = test.minus(123456789L); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21993);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21994);assertEquals(expected, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testMinusMonths_int634() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),21995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jx8sdgyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jx8sdgyz(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(21995); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21996);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21997);DateMidnight result = test.minusMonths(1); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21998);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(21999);assertEquals(expected, result); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22000);result = test.minusMonths(0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22001);assertSame(test, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testMinusWeeks_int635() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),22002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0titqgz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0titqgz6(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(22002); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22003);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22004);DateMidnight result = test.minusWeeks(1); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22005);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22006);assertEquals(expected, result); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22007);result = test.minusWeeks(0); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22008);assertSame(test, result); 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
public void testWithers637() {__CLR4_4_1gvvgvvle6np4av.R.globalSliceStart(getClass().getName(),22009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g604kzgzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvvgvvle6np4av.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvvgvvle6np4av.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g604kzgzd(){try{__CLR4_4_1gvvgvvle6np4av.R.inc(22009); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22010);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22011);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22012);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22013);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22014);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22015);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22016);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22017);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22018);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22019);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22020);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22021);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22022);try { 
         __CLR4_4_1gvvgvvle6np4av.R.inc(22023);test.withMonthOfYear(0); 
         __CLR4_4_1gvvgvvle6np4av.R.inc(22024);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gvvgvvle6np4av.R.inc(22025);try { 
         __CLR4_4_1gvvgvvle6np4av.R.inc(22026);test.withMonthOfYear(13); 
         __CLR4_4_1gvvgvvle6np4av.R.inc(22027);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1gvvgvvle6np4av.R.inc(22028);
            __CLR4_4_1gvvgvvle6np4av.R.inc(22029);return null;
        }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1gvvgvvle6np4av.R.inc(22030);
            __CLR4_4_1gvvgvvle6np4av.R.inc(22031);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1gvvgvvle6np4av.R.inc(22032);
            __CLR4_4_1gvvgvvle6np4av.R.inc(22033);return ISO_DEFAULT;
        }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1gvvgvvle6np4av.R.inc(22034);
        __CLR4_4_1gvvgvvle6np4av.R.inc(22035);assertEquals(year, test.getYear());
        __CLR4_4_1gvvgvvle6np4av.R.inc(22036);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1gvvgvvle6np4av.R.inc(22037);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1gvvgvvle6np4av.R.flushNeeded();}}

}
