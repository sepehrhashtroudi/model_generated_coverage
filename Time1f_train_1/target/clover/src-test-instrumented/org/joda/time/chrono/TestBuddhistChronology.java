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
import org.joda.time.Period;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_1pk7pk7le6qeabt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33269,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

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

    public static void main(String[] args) {try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33127);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33128);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33129);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33130);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33131);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_1pk7pk7le6qeabt.R.inc(33133);try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33132);
    }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33134);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33135);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33136);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33137);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33138);originalLocale = Locale.getDefault();
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33139);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33140);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33141);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33142);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33143);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33144);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33145);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33146);Locale.setDefault(originalLocale);
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33147);originalDateTimeZone = null;
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33148);originalTimeZone = null;
        __CLR4_4_1pk7pk7le6qeabt.R.inc(33149);originalLocale = null;
    }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testKeyYears153() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yhhpvpku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testKeyYears153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yhhpvpku(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33150); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33151);DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33152);DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33153);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33154);assertEquals(2513, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33155);assertEquals(2513, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33156);assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33157);bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33158);jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33159);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33160);assertEquals(2126, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33161);assertEquals(2126, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33162);assertEquals(2126, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33163);bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33164);jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33165);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33166);assertEquals(2125, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33167);assertEquals(2125, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33168);assertEquals(2125, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33169);bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33170);jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33171);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33172);assertEquals(544, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33173);assertEquals(544, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33174);assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33175);bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33176);jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33177);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33178);assertEquals(543, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33179);assertEquals(543, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33180);assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33181);bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33182);jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33183);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33184);assertEquals(1, bd.getYear()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33185);assertEquals(1, bd.getYearOfEra()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33186);assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear()); 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 


public void testEra408() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16q0tpbplv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16q0tpbplv(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33187); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33188);assertEquals(1, BuddhistChronology.BE); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33189);try { 
         __CLR4_4_1pk7pk7le6qeabt.R.inc(33190);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC); 
         __CLR4_4_1pk7pk7le6qeabt.R.inc(33191);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 


public void testWithUTC418() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhdmpipm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhdmpipm0(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33192); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33193);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33194);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33195);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33196);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 


public void testFactory_Zone419() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbbhn4pm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbbhn4pm5(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33197); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33198);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33199);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33200);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33201);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 


public void testDurationFields420() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koxprapma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDurationFields420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koxprapma(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33202); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33203);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33204);assertEquals("eras", buddhist.eras().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33205);assertEquals("centuries", buddhist.centuries().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33206);assertEquals("years", buddhist.years().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33207);assertEquals("weekyears", buddhist.weekyears().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33208);assertEquals("months", buddhist.months().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33209);assertEquals("weeks", buddhist.weeks().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33210);assertEquals("days", buddhist.days().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33211);assertEquals("halfdays", GregorianChronology.getInstance().halfdays().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33212);assertEquals("hours", buddhist.hours().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33213);assertEquals("minutes", buddhist.minutes().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33214);assertEquals("seconds", buddhist.seconds().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33215);assertEquals("millis", buddhist.millis().getName()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33216);assertEquals(false, buddhist.eras().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33217);assertEquals(true, buddhist.centuries().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33218);assertEquals(true, buddhist.years().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33219);assertEquals(true, buddhist.weekyears().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33220);assertEquals(true, buddhist.months().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33221);assertEquals(true, buddhist.weeks().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33222);assertEquals(true, buddhist.days().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33223);assertEquals(true, buddhist.halfdays().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33224);assertEquals(true, buddhist.hours().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33225);assertEquals(true, buddhist.minutes().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33226);assertEquals(true, buddhist.seconds().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33227);assertEquals(true, buddhist.millis().isSupported()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33228);assertEquals(false, buddhist.centuries().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33229);assertEquals(false, buddhist.years().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33230);assertEquals(false, buddhist.weekyears().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33231);assertEquals(false, buddhist.months().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33232);assertEquals(false, buddhist.weeks().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33233);assertEquals(false, buddhist.days().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33234);assertEquals(false, buddhist.halfdays().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33235);assertEquals(true, buddhist.hours().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33236);assertEquals(true, buddhist.minutes().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33237);assertEquals(true, buddhist.seconds().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33238);assertEquals(true, buddhist.millis().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33239);final BuddhistChronology buddhistUTC = BuddhistChronology.getInstanceUTC(); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33240);assertEquals(false, buddhistUTC.centuries().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33241);assertEquals(false, buddhistUTC.years().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33242);assertEquals(false, buddhistUTC.weekyears().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33243);assertEquals(false, buddhistUTC.months().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33244);assertEquals(true, buddhistUTC.weeks().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33245);assertEquals(true, buddhistUTC.days().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33246);assertEquals(true, buddhistUTC.halfdays().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33247);assertEquals(true, buddhistUTC.hours().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33248);assertEquals(true, buddhistUTC.minutes().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33249);assertEquals(true, buddhistUTC.seconds().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33250);assertEquals(true, buddhistUTC.millis().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33251);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33252);final BuddhistChronology buddhistGMT = BuddhistChronology.getInstance(gmt); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33253);assertEquals(false, buddhistGMT.centuries().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33254);assertEquals(false, buddhistGMT.years().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33255);assertEquals(false, buddhistGMT.weekyears().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33256);assertEquals(false, buddhistGMT.months().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33257);assertEquals(true, buddhistGMT.weeks().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33258);assertEquals(true, buddhistGMT.days().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33259);assertEquals(true, buddhistGMT.halfdays().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33260);assertEquals(true, buddhistGMT.hours().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33261);assertEquals(true, buddhistGMT.minutes().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33262);assertEquals(true, buddhistGMT.seconds().isPrecise()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33263);assertEquals(true, buddhistGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 


public void testToString423() {__CLR4_4_1pk7pk7le6qeabt.R.globalSliceStart(getClass().getName(),33264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb5c72po0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pk7pk7le6qeabt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pk7pk7le6qeabt.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb5c72po0(){try{__CLR4_4_1pk7pk7le6qeabt.R.inc(33264); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33265);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33266);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33267);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString()); 
     __CLR4_4_1pk7pk7le6qeabt.R.inc(33268);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1pk7pk7le6qeabt.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
