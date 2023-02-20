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
public class TestCopticChronology extends TestCase {static class __CLR4_4_1pj0pj0le6qsfdy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,33279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33084);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33085);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33086);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33087);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33088);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1pj0pj0le6qsfdy.R.inc(33090);try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33089);
    }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33091);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33092);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33093);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33094);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33095);originalLocale = Locale.getDefault();
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33096);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33097);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33098);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33099);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33100);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33101);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33102);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33103);Locale.setDefault(originalLocale);
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33104);originalDateTimeZone = null;
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33105);originalTimeZone = null;
        __CLR4_4_1pj0pj0le6qsfdy.R.inc(33106);originalLocale = null;
    }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC275() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6k8etpjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6k8etpjn(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33107); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33108);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33109);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 


public void testEquality276() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ach3hwpjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ach3hwpjq(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33110); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33111);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33112);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33113);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33114);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33115);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 


public void testFactory_Zone277() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jp5svupjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jp5svupjw(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33116); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33117);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33118);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33119);assertEquals(LONDON, CopticChronology.getInstance(null).getZone()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33120);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 


public void testDurationFields278() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3tt23pk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3tt23pk1(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33121); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33122);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33123);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33124);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33125);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33126);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33127);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33128);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33129);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33130);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33131);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33132);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33133);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33134);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33135);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33136);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33137);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33138);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33139);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33140);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33141);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33142);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33143);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33144);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33145);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33146);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33147);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33148);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33149);assertEquals(false, coptic.weekyears().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33150);assertEquals(false, coptic.months().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33151);assertEquals(false, coptic.weeks().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33152);assertEquals(false, coptic.days().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33153);assertEquals(false, coptic.halfdays().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33154);assertEquals(true, coptic.hours().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33155);assertEquals(true, coptic.minutes().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33156);assertEquals(true, coptic.seconds().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33157);assertEquals(true, coptic.millis().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33158);final CopticChronology copticUTC = CopticChronology.getInstanceUTC(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33159);assertEquals(false, copticUTC.centuries().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33160);assertEquals(false, copticUTC.years().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33161);assertEquals(false, copticUTC.weekyears().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33162);assertEquals(false, copticUTC.months().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33163);assertEquals(true, copticUTC.weeks().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33164);assertEquals(true, copticUTC.days().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33165);assertEquals(true, copticUTC.halfdays().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33166);assertEquals(true, copticUTC.hours().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33167);assertEquals(true, copticUTC.minutes().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33168);assertEquals(true, copticUTC.seconds().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33169);assertEquals(true, copticUTC.millis().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33170);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33171);final CopticChronology copticGMT = CopticChronology.getInstance(gmt); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33172);assertEquals(false, copticGMT.centuries().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33173);assertEquals(false, copticGMT.years().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33174);assertEquals(false, copticGMT.weekyears().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33175);assertEquals(false, copticGMT.months().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33176);assertEquals(true, copticGMT.weeks().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33177);assertEquals(true, copticGMT.days().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33178);assertEquals(true, copticGMT.halfdays().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33179);assertEquals(true, copticGMT.hours().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33180);assertEquals(true, copticGMT.minutes().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33181);assertEquals(true, copticGMT.seconds().isPrecise()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33182);assertEquals(true, copticGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 


public void testSampleDate280() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oe51qfplr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oe51qfplr(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33183); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33184);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33185);assertEquals(CopticChronology.AM, dt.getEra()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33186);assertEquals(18, dt.getCenturyOfEra()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33187);assertEquals(20, dt.getYearOfCentury()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33188);assertEquals(1720, dt.getYearOfEra()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33189);assertEquals(1720, dt.getYear()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33190);Property fld = dt.year(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33191);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33192);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33193);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33194);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33195);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33196);fld = dt.monthOfYear(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33197);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33198);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33199);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33200);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33201);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33202);assertEquals(13, fld.getMaximumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33203);assertEquals(13, fld.getMaximumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33204);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33205);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33206);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33207);fld = dt.dayOfMonth(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33208);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33209);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33210);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33211);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33212);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33213);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33214);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33215);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33216);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33217);fld = dt.dayOfWeek(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33218);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33219);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33220);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33221);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33222);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33223);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33224);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33225);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33226);assertEquals(9 * 30 + 2, dt.getDayOfYear()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33227);fld = dt.dayOfYear(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33228);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33229);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33230);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33231);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33232);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33233);assertEquals(365, fld.getMaximumValue()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33234);assertEquals(366, fld.getMaximumValueOverall()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33235);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33236);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33237);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33238);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33239);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 


public void testDurationMonth500() {__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceStart(getClass().getName(),33240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nojempnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pj0pj0le6qsfdy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pj0pj0le6qsfdy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nojempnc(){try{__CLR4_4_1pj0pj0le6qsfdy.R.inc(33240); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33241);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33242);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33243);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33244);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33245);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33246);assertEquals(COPTIC_UTC.months(), fld); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33247);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33248);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33249);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33250);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33251);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33252);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33253);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33254);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33255);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33256);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33257);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33258);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33259);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33260);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33261);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33262);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33263);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33264);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33265);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33266);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33267);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33268);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33269);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33270);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33271);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33272);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33273);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33274);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33275);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33276);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33277);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1pj0pj0le6qsfdy.R.inc(33278);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1pj0pj0le6qsfdy.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
