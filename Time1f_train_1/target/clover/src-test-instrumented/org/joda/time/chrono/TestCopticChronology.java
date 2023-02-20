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
public class TestCopticChronology extends TestCase {static class __CLR4_4_1po5po5le6qeacj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33451,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1po5po5le6qeacj.R.inc(33269);
        __CLR4_4_1po5po5le6qeacj.R.inc(33270);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1po5po5le6qeacj.R.inc(33271);
        __CLR4_4_1po5po5le6qeacj.R.inc(33272);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1po5po5le6qeacj.R.inc(33273);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1po5po5le6qeacj.R.inc(33275);try{__CLR4_4_1po5po5le6qeacj.R.inc(33274);
    }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1po5po5le6qeacj.R.inc(33276);
        __CLR4_4_1po5po5le6qeacj.R.inc(33277);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1po5po5le6qeacj.R.inc(33278);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1po5po5le6qeacj.R.inc(33279);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1po5po5le6qeacj.R.inc(33280);originalLocale = Locale.getDefault();
        __CLR4_4_1po5po5le6qeacj.R.inc(33281);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1po5po5le6qeacj.R.inc(33282);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1po5po5le6qeacj.R.inc(33283);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1po5po5le6qeacj.R.inc(33284);
        __CLR4_4_1po5po5le6qeacj.R.inc(33285);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1po5po5le6qeacj.R.inc(33286);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1po5po5le6qeacj.R.inc(33287);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1po5po5le6qeacj.R.inc(33288);Locale.setDefault(originalLocale);
        __CLR4_4_1po5po5le6qeacj.R.inc(33289);originalDateTimeZone = null;
        __CLR4_4_1po5po5le6qeacj.R.inc(33290);originalTimeZone = null;
        __CLR4_4_1po5po5le6qeacj.R.inc(33291);originalLocale = null;
    }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_Zone297() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vak1rwpos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vak1rwpos(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33292); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33293);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33294);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33295);assertEquals(LONDON, CopticChronology.getInstance(null).getZone()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33296);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 


public void testDurationFields298() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ifk61pox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ifk61pox(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33297); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33298);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33299);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33300);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33301);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33302);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33303);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33304);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33305);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33306);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33307);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33308);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33309);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33310);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33311);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33312);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33313);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33314);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33315);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33316);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33317);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33318);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33319);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33320);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33321);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33322);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33323);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33324);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33325);assertEquals(false, coptic.weekyears().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33326);assertEquals(false, coptic.months().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33327);assertEquals(false, coptic.weeks().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33328);assertEquals(false, coptic.days().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33329);assertEquals(false, coptic.halfdays().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33330);assertEquals(true, coptic.hours().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33331);assertEquals(true, coptic.minutes().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33332);assertEquals(true, coptic.seconds().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33333);assertEquals(true, coptic.millis().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33334);final CopticChronology copticUTC = CopticChronology.getInstanceUTC(); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33335);assertEquals(false, copticUTC.centuries().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33336);assertEquals(false, copticUTC.years().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33337);assertEquals(false, copticUTC.weekyears().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33338);assertEquals(false, copticUTC.months().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33339);assertEquals(true, copticUTC.weeks().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33340);assertEquals(true, copticUTC.days().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33341);assertEquals(true, copticUTC.halfdays().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33342);assertEquals(true, copticUTC.hours().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33343);assertEquals(true, copticUTC.minutes().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33344);assertEquals(true, copticUTC.seconds().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33345);assertEquals(true, copticUTC.millis().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33346);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33347);final CopticChronology copticGMT = CopticChronology.getInstance(gmt); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33348);assertEquals(false, copticGMT.centuries().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33349);assertEquals(false, copticGMT.years().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33350);assertEquals(false, copticGMT.weekyears().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33351);assertEquals(false, copticGMT.months().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33352);assertEquals(true, copticGMT.weeks().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33353);assertEquals(true, copticGMT.days().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33354);assertEquals(true, copticGMT.halfdays().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33355);assertEquals(true, copticGMT.hours().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33356);assertEquals(true, copticGMT.minutes().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33357);assertEquals(true, copticGMT.seconds().isPrecise()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33358);assertEquals(true, copticGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 


public void testWithZone300() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2yaepqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2yaepqn(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33359); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33360);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33361);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33362);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33363);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33364);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33365);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 


public void testEra301() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc5wdjpqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc5wdjpqu(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33366); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33367);assertEquals(1, CopticChronology.AM); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33368);try { 
         __CLR4_4_1po5po5le6qeacj.R.inc(33369);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         __CLR4_4_1po5po5le6qeacj.R.inc(33370);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 


public void testDurationMonth521() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1902ti7pqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1902ti7pqz(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33371); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33372);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33373);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33374);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33375);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33376);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33377);assertEquals(COPTIC_UTC.months(), fld); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33378);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33379);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33380);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33381);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33382);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33383);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33384);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33385);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33386);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33387);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33388);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33389);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33390);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33391);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33392);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33393);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33394);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33395);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33396);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33397);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33398);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33399);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33400);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33401);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33402);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33403);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33404);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33405);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33406);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33407);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33408);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33409);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 


public void testDurationYear531() {__CLR4_4_1po5po5le6qeacj.R.globalSliceStart(getClass().getName(),33410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mj17vbps2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1po5po5le6qeacj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1po5po5le6qeacj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mj17vbps2(){try{__CLR4_4_1po5po5le6qeacj.R.inc(33410); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33411);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33412);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33413);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33414);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33415);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33416);DurationField fld = dt20.year().getDurationField(); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33417);assertEquals(COPTIC_UTC.years(), fld); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33418);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33419);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33420);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33421);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33422);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33423);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33424);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33425);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33426);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33427);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33428);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33429);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33430);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis()); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33431);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33432);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33433);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33434);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33435);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33436);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33437);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33438);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33439);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33440);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33441);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33442);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33443);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33444);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33445);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33446);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33447);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33448);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33449);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L)); 
     __CLR4_4_1po5po5le6qeacj.R.inc(33450);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L)); 
 }finally{__CLR4_4_1po5po5le6qeacj.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
