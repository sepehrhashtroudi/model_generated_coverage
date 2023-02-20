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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {static class __CLR4_4_1plvplvle6rjdah{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,33435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1plvplvle6rjdah.R.inc(33187);
        __CLR4_4_1plvplvle6rjdah.R.inc(33188);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1plvplvle6rjdah.R.inc(33189);
        __CLR4_4_1plvplvle6rjdah.R.inc(33190);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1plvplvle6rjdah.R.inc(33191);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1plvplvle6rjdah.R.inc(33193);try{__CLR4_4_1plvplvle6rjdah.R.inc(33192);
    }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1plvplvle6rjdah.R.inc(33194);
        __CLR4_4_1plvplvle6rjdah.R.inc(33195);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1plvplvle6rjdah.R.inc(33196);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1plvplvle6rjdah.R.inc(33197);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1plvplvle6rjdah.R.inc(33198);originalLocale = Locale.getDefault();
        __CLR4_4_1plvplvle6rjdah.R.inc(33199);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1plvplvle6rjdah.R.inc(33200);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1plvplvle6rjdah.R.inc(33201);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1plvplvle6rjdah.R.inc(33202);
        __CLR4_4_1plvplvle6rjdah.R.inc(33203);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1plvplvle6rjdah.R.inc(33204);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1plvplvle6rjdah.R.inc(33205);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1plvplvle6rjdah.R.inc(33206);Locale.setDefault(originalLocale);
        __CLR4_4_1plvplvle6rjdah.R.inc(33207);originalDateTimeZone = null;
        __CLR4_4_1plvplvle6rjdah.R.inc(33208);originalTimeZone = null;
        __CLR4_4_1plvplvle6rjdah.R.inc(33209);originalLocale = null;
    }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC308() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hwt86pmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hwt86pmi(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33210); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33211);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33212);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testEquality309() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bzy53pml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bzy53pml(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33213); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33214);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33215);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33216);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33217);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33218);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testFactory_Zone310() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19stim2pmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19stim2pmr(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33219); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33220);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33221);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33222);assertEquals(LONDON, CopticChronology.getInstance(null).getZone()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33223);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testDurationFields311() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q063bvpmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q063bvpmw(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33224); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33225);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33226);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33227);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33228);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33229);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33230);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33231);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33232);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33233);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33234);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33235);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33236);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33237);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33238);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33239);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33240);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33241);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33242);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33243);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33244);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33245);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33246);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33247);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33248);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33249);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33250);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33251);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33252);assertEquals(false, coptic.weekyears().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33253);assertEquals(false, coptic.months().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33254);assertEquals(false, coptic.weeks().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33255);assertEquals(false, coptic.days().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33256);assertEquals(false, coptic.halfdays().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33257);assertEquals(true, coptic.hours().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33258);assertEquals(true, coptic.minutes().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33259);assertEquals(true, coptic.seconds().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33260);assertEquals(true, coptic.millis().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33261);final CopticChronology copticUTC = CopticChronology.getInstanceUTC(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33262);assertEquals(false, copticUTC.centuries().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33263);assertEquals(false, copticUTC.years().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33264);assertEquals(false, copticUTC.weekyears().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33265);assertEquals(false, copticUTC.months().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33266);assertEquals(true, copticUTC.weeks().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33267);assertEquals(true, copticUTC.days().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33268);assertEquals(true, copticUTC.halfdays().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33269);assertEquals(true, copticUTC.hours().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33270);assertEquals(true, copticUTC.minutes().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33271);assertEquals(true, copticUTC.seconds().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33272);assertEquals(true, copticUTC.millis().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33273);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33274);final CopticChronology copticGMT = CopticChronology.getInstance(gmt); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33275);assertEquals(false, copticGMT.centuries().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33276);assertEquals(false, copticGMT.years().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33277);assertEquals(false, copticGMT.weekyears().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33278);assertEquals(false, copticGMT.months().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33279);assertEquals(true, copticGMT.weeks().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33280);assertEquals(true, copticGMT.days().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33281);assertEquals(true, copticGMT.halfdays().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33282);assertEquals(true, copticGMT.hours().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33283);assertEquals(true, copticGMT.minutes().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33284);assertEquals(true, copticGMT.seconds().isPrecise()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33285);assertEquals(true, copticGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testWithZone313() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v66arspom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v66arspom(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33286); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33287);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33288);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33289);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33290);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33291);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33292);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testEra314() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4owjfpot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4owjfpot(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33293); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33294);assertEquals(1, CopticChronology.AM); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33295);try { 
         __CLR4_4_1plvplvle6rjdah.R.inc(33296);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         __CLR4_4_1plvplvle6rjdah.R.inc(33297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testSampleDate315() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgi10spoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgi10spoy(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33298); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33299);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33300);assertEquals(CopticChronology.AM, dt.getEra()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33301);assertEquals(18, dt.getCenturyOfEra()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33302);assertEquals(20, dt.getYearOfCentury()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33303);assertEquals(1720, dt.getYearOfEra()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33304);assertEquals(1720, dt.getYear()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33305);Property fld = dt.year(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33306);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33307);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33308);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33309);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33310);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33311);fld = dt.monthOfYear(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33312);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33313);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33314);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33315);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33316);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33317);assertEquals(13, fld.getMaximumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33318);assertEquals(13, fld.getMaximumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33319);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33320);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33321);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33322);fld = dt.dayOfMonth(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33323);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33324);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33325);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33326);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33327);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33328);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33329);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33330);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33331);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33332);fld = dt.dayOfWeek(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33333);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33334);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33335);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33336);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33337);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33338);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33339);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33340);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33341);assertEquals(9 * 30 + 2, dt.getDayOfYear()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33342);fld = dt.dayOfYear(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33343);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33344);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33345);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33346);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33347);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33348);assertEquals(365, fld.getMaximumValue()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33349);assertEquals(366, fld.getMaximumValueOverall()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33350);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33351);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33352);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33353);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33354);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testDurationMonth533() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7s0mapqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7s0mapqj(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33355); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33356);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33357);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33358);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33359);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33360);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33361);assertEquals(COPTIC_UTC.months(), fld); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33362);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33363);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33364);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33365);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33366);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33367);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33368);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33369);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33370);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33371);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33372);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33373);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33374);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33375);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33376);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33377);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33378);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33379);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33380);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33381);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33382);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33383);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33384);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33385);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33386);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33387);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33388);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33389);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33390);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33391);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33392);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33393);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 


public void testDurationYear543() {__CLR4_4_1plvplvle6rjdah.R.globalSliceStart(getClass().getName(),33394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ca7zzcprm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plvplvle6rjdah.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plvplvle6rjdah.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ca7zzcprm(){try{__CLR4_4_1plvplvle6rjdah.R.inc(33394); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33395);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33396);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33397);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33398);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33399);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33400);DurationField fld = dt20.year().getDurationField(); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33401);assertEquals(COPTIC_UTC.years(), fld); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33402);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33403);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33404);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33405);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33406);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33407);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33408);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33409);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33410);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33411);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33412);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33413);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33414);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis()); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33415);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33416);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33417);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33418);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33419);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33420);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33421);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33422);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33423);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33424);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33425);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33426);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33427);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33428);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33429);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33430);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33431);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33432);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33433);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L)); 
     __CLR4_4_1plvplvle6rjdah.R.inc(33434);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L)); 
 }finally{__CLR4_4_1plvplvle6rjdah.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
