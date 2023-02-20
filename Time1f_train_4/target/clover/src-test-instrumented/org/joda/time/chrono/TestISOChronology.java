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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {static class __CLR4_4_1q5bq5ble6rjdcr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,34044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33887);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33888);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33889);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33890);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_1q5bq5ble6rjdcr.R.inc(33892);try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33891);
    }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33893);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33894);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33895);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33896);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33897);originalLocale = Locale.getDefault();
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33898);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33899);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33900);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33901);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33902);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33903);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33904);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33905);Locale.setDefault(originalLocale);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33906);originalDateTimeZone = null;
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33907);originalTimeZone = null;
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(33908);originalLocale = null;
    }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPartialDayOfYearAdd293() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),33909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4y2zxq5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testPartialDayOfYearAdd293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4y2zxq5x(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33909); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33910);Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33911);Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33912);assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33913);assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366))); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 


public void testFactory_Zone294() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),33914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzk3ttq62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzk3ttq62(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33914); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33915);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33916);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33917);assertEquals(LONDON, ISOChronology.getInstance(null).getZone()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33918);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 


public void testDurationFields296() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),33919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zkdexq67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDurationFields296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zkdexq67(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33919); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33920);final ISOChronology iso = ISOChronology.getInstance(); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33921);assertEquals("eras", iso.eras().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33922);assertEquals("centuries", iso.centuries().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33923);assertEquals("years", iso.years().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33924);assertEquals("weekyears", iso.weekyears().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33925);assertEquals("months", iso.months().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33926);assertEquals("weeks", iso.weeks().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33927);assertEquals("days", iso.days().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33928);assertEquals("halfdays", iso.halfdays().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33929);assertEquals("hours", iso.hours().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33930);assertEquals("minutes", iso.minutes().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33931);assertEquals("seconds", iso.seconds().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33932);assertEquals("millis", iso.millis().getName()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33933);assertEquals(false, iso.eras().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33934);assertEquals(true, iso.centuries().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33935);assertEquals(true, iso.years().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33936);assertEquals(true, iso.weekyears().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33937);assertEquals(true, iso.months().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33938);assertEquals(true, iso.weeks().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33939);assertEquals(true, iso.days().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33940);assertEquals(true, iso.halfdays().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33941);assertEquals(true, iso.hours().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33942);assertEquals(true, iso.minutes().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33943);assertEquals(true, iso.seconds().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33944);assertEquals(true, iso.millis().isSupported()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33945);assertEquals(false, iso.centuries().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33946);assertEquals(false, iso.years().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33947);assertEquals(false, iso.weekyears().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33948);assertEquals(false, iso.months().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33949);assertEquals(false, iso.weeks().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33950);assertEquals(false, iso.days().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33951);assertEquals(false, iso.halfdays().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33952);assertEquals(true, iso.hours().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33953);assertEquals(true, iso.minutes().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33954);assertEquals(true, iso.seconds().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33955);assertEquals(true, iso.millis().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33956);final ISOChronology isoUTC = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33957);assertEquals(false, isoUTC.centuries().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33958);assertEquals(false, isoUTC.years().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33959);assertEquals(false, isoUTC.weekyears().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33960);assertEquals(false, isoUTC.months().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33961);assertEquals(true, isoUTC.weeks().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33962);assertEquals(true, isoUTC.days().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33963);assertEquals(true, isoUTC.halfdays().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33964);assertEquals(true, isoUTC.hours().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33965);assertEquals(true, isoUTC.minutes().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33966);assertEquals(true, isoUTC.seconds().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33967);assertEquals(true, isoUTC.millis().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33968);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33969);final ISOChronology isoGMT = ISOChronology.getInstance(gmt); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33970);assertEquals(false, isoGMT.centuries().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33971);assertEquals(false, isoGMT.years().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33972);assertEquals(false, isoGMT.weekyears().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33973);assertEquals(false, isoGMT.months().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33974);assertEquals(true, isoGMT.weeks().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33975);assertEquals(true, isoGMT.days().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33976);assertEquals(true, isoGMT.halfdays().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33977);assertEquals(true, isoGMT.hours().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33978);assertEquals(true, isoGMT.minutes().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33979);assertEquals(true, isoGMT.seconds().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33980);assertEquals(true, isoGMT.millis().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33981);final DateTimeZone offset = DateTimeZone.forOffsetHours(1); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33982);final ISOChronology isoOffset1 = ISOChronology.getInstance(offset); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33983);assertEquals(false, isoOffset1.centuries().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33984);assertEquals(false, isoOffset1.years().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33985);assertEquals(false, isoOffset1.weekyears().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33986);assertEquals(false, isoOffset1.months().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33987);assertEquals(true, isoOffset1.weeks().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33988);assertEquals(true, isoOffset1.days().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33989);assertEquals(true, isoOffset1.halfdays().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33990);assertEquals(true, isoOffset1.hours().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33991);assertEquals(true, isoOffset1.minutes().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33992);assertEquals(true, isoOffset1.seconds().isPrecise()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33993);assertEquals(true, isoOffset1.millis().isPrecise()); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 


public void testWithZone297() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),33994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18m7bo3q8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18m7bo3q8a(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(33994); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33995);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33996);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33997);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33998);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(33999);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34000);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 


public void testToString298() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),34001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9lc86q8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testToString298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9lc86q8h(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(34001); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34002);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34003);assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34004);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34005);assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 


public void testMinYear1139() {__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceStart(getClass().getName(),34006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2daqyq8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q5bq5ble6rjdcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q5bq5ble6rjdcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2daqyq8m(){try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(34006); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34007);final ISOChronology chrono = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34008);final int minYear = chrono.year().getMinimumValue(); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34009);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34010);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34011);assertTrue(start.getMillis() < 0); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34012);assertTrue(end.getMillis() > start.getMillis()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34013);assertEquals(minYear, start.getYear()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34014);assertEquals(minYear, end.getYear()); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34015);long delta = end.getMillis() - start.getMillis(); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34016);long expectedDelta = ((((start.year().isLeap() )&&(__CLR4_4_1q5bq5ble6rjdcr.R.iget(34017)!=0|true))||(__CLR4_4_1q5bq5ble6rjdcr.R.iget(34018)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1; 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34019);assertEquals(expectedDelta, delta); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34020);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34021);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono)); 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34022);try { 
         __CLR4_4_1q5bq5ble6rjdcr.R.inc(34023);start.minusYears(1); 
         __CLR4_4_1q5bq5ble6rjdcr.R.inc(34024);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34025);try { 
         __CLR4_4_1q5bq5ble6rjdcr.R.inc(34026);end.minusYears(1); 
         __CLR4_4_1q5bq5ble6rjdcr.R.inc(34027);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1q5bq5ble6rjdcr.R.inc(34028);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE)); 
 }finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1q5bq5ble6rjdcr.R.inc(34029);
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34030);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34031);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34032);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34033);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34034);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34035);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34036);assertEquals(amt, diff);
        
        __CLR4_4_1q5bq5ble6rjdcr.R.inc(34037);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1q5bq5ble6rjdcr.R.iget(34038)!=0|true))||(__CLR4_4_1q5bq5ble6rjdcr.R.iget(34039)==0&false))) {{
            __CLR4_4_1q5bq5ble6rjdcr.R.inc(34040);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_1q5bq5ble6rjdcr.R.inc(34041);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_1q5bq5ble6rjdcr.R.inc(34042);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1q5bq5ble6rjdcr.R.inc(34043);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1q5bq5ble6rjdcr.R.flushNeeded();}}

    

    

    

}
