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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1gw0gw0le6nl84r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,21967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21888);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21889);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21890);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21891);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1gw0gw0le6nl84r.R.inc(21893);try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21892);
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21894);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21895);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21896);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21897);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21898);originalLocale = Locale.getDefault();
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21899);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21900);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21901);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21902);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21903);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21904);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21905);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21906);Locale.setDefault(originalLocale);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21907);originalDateTimeZone = null;
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21908);originalTimeZone = null;
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21909);originalLocale = null;
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testEqualsHashCode_ISO132() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nr1a3gwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode_ISO132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nr1a3gwm(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21910); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21911);Chronology chrono1 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21912);Chronology chrono2 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21913);Chronology chrono3 = ISOChronology.getInstance(); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21914);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21915);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21916);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21917);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21918);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21919);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21920);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21921);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21922);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testConstructor616() throws Throwable {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwk722gwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testConstructor616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwk722gwz() throws Throwable{try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21923); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21924);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21925);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21926);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testWithField1617() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haptd8gx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField1617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haptd8gx3(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21927); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21928);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21929);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21930);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21931);assertEquals(new DateMidnight(2006, 6, 9), result); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testWithFieldAdded4618() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6m3legx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded4618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6m3legx8(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21932); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21933);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21934);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21935);assertSame(test, result); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testPlusWeeks_int619() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb8yqmgxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb8yqmgxc(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21936); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21937);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21938);DateMidnight result = test.plusWeeks(1); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21939);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21940);assertEquals(expected, result); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21941);result = test.plusWeeks(0); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21942);assertSame(test, result); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testMinus_RD620() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orpyjsgxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orpyjsgxj(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21943); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21944);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21945);DateMidnight result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21946);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21947);assertEquals(expected, result); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21948);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21949);assertSame(test, result); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
public void testMinus_RP621() {__CLR4_4_1gw0gw0le6nl84r.R.globalSliceStart(getClass().getName(),21950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7tlvhgxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gw0gw0le6nl84r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gw0gw0le6nl84r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7tlvhgxq(){try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21950); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21951);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21952);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21953);DateMidnight expected = new DateMidnight(2001, 3, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21954);assertEquals(expected, result); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21955);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1gw0gw0le6nl84r.R.inc(21956);assertSame(test, result); 
 }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21957);
            __CLR4_4_1gw0gw0le6nl84r.R.inc(21958);return null;
        }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21959);
            __CLR4_4_1gw0gw0le6nl84r.R.inc(21960);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21961);
            __CLR4_4_1gw0gw0le6nl84r.R.inc(21962);return ISO_DEFAULT;
        }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1gw0gw0le6nl84r.R.inc(21963);
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21964);assertEquals(year, test.getYear());
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21965);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1gw0gw0le6nl84r.R.inc(21966);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1gw0gw0le6nl84r.R.flushNeeded();}}

}
