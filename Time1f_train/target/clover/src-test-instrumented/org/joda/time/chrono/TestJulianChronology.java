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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {static class __CLR4_4_1rxirxilc8axerm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,36310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rxirxilc8axerm.R.inc(36198);
        __CLR4_4_1rxirxilc8axerm.R.inc(36199);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rxirxilc8axerm.R.inc(36200);
        __CLR4_4_1rxirxilc8axerm.R.inc(36201);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1rxirxilc8axerm.R.inc(36203);try{__CLR4_4_1rxirxilc8axerm.R.inc(36202);
    }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rxirxilc8axerm.R.inc(36204);
        __CLR4_4_1rxirxilc8axerm.R.inc(36205);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1rxirxilc8axerm.R.inc(36206);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1rxirxilc8axerm.R.inc(36207);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1rxirxilc8axerm.R.inc(36208);originalLocale = Locale.getDefault();
        __CLR4_4_1rxirxilc8axerm.R.inc(36209);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rxirxilc8axerm.R.inc(36210);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1rxirxilc8axerm.R.inc(36211);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rxirxilc8axerm.R.inc(36212);
        __CLR4_4_1rxirxilc8axerm.R.inc(36213);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1rxirxilc8axerm.R.inc(36214);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1rxirxilc8axerm.R.inc(36215);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1rxirxilc8axerm.R.inc(36216);Locale.setDefault(originalLocale);
        __CLR4_4_1rxirxilc8axerm.R.inc(36217);originalDateTimeZone = null;
        __CLR4_4_1rxirxilc8axerm.R.inc(36218);originalTimeZone = null;
        __CLR4_4_1rxirxilc8axerm.R.inc(36219);originalLocale = null;
    }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString274() {__CLR4_4_1rxirxilc8axerm.R.globalSliceStart(getClass().getName(),36220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lo6yi0ry4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rxirxilc8axerm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rxirxilc8axerm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lo6yi0ry4(){try{__CLR4_4_1rxirxilc8axerm.R.inc(36220); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36221);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36222);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36223);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36224);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36225);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}} 


public void testDurationFields350() {__CLR4_4_1rxirxilc8axerm.R.globalSliceStart(getClass().getName(),36226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmd8qrya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rxirxilc8axerm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rxirxilc8axerm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmd8qrya(){try{__CLR4_4_1rxirxilc8axerm.R.inc(36226); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36227);final JulianChronology julian = JulianChronology.getInstance(); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36228);assertEquals("eras", julian.eras().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36229);assertEquals("centuries", julian.centuries().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36230);assertEquals("years", julian.years().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36231);assertEquals("weekyears", julian.weekyears().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36232);assertEquals("months", julian.months().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36233);assertEquals("weeks", julian.weeks().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36234);assertEquals("days", julian.days().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36235);assertEquals("halfdays", julian.halfdays().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36236);assertEquals("hours", julian.hours().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36237);assertEquals("minutes", julian.minutes().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36238);assertEquals("seconds", julian.seconds().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36239);assertEquals("millis", julian.millis().getName()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36240);assertEquals(false, julian.eras().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36241);assertEquals(true, julian.centuries().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36242);assertEquals(true, julian.years().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36243);assertEquals(true, julian.weekyears().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36244);assertEquals(true, julian.months().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36245);assertEquals(true, julian.weeks().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36246);assertEquals(true, julian.days().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36247);assertEquals(true, julian.halfdays().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36248);assertEquals(true, julian.hours().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36249);assertEquals(true, julian.minutes().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36250);assertEquals(true, julian.seconds().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36251);assertEquals(true, julian.millis().isSupported()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36252);assertEquals(false, julian.centuries().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36253);assertEquals(false, julian.years().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36254);assertEquals(false, julian.weekyears().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36255);assertEquals(false, julian.months().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36256);assertEquals(false, julian.weeks().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36257);assertEquals(false, julian.days().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36258);assertEquals(false, julian.halfdays().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36259);assertEquals(true, julian.hours().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36260);assertEquals(true, julian.minutes().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36261);assertEquals(true, julian.seconds().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36262);assertEquals(true, julian.millis().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36263);final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36264);assertEquals(false, julianUTC.centuries().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36265);assertEquals(false, julianUTC.years().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36266);assertEquals(false, julianUTC.weekyears().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36267);assertEquals(false, julianUTC.months().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36268);assertEquals(true, julianUTC.weeks().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36269);assertEquals(true, julianUTC.days().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36270);assertEquals(true, julianUTC.halfdays().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36271);assertEquals(true, julianUTC.hours().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36272);assertEquals(true, julianUTC.minutes().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36273);assertEquals(true, julianUTC.seconds().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36274);assertEquals(true, julianUTC.millis().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36275);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36276);final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36277);assertEquals(false, julianGMT.centuries().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36278);assertEquals(false, julianGMT.years().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36279);assertEquals(false, julianGMT.weekyears().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36280);assertEquals(false, julianGMT.months().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36281);assertEquals(true, julianGMT.weeks().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36282);assertEquals(true, julianGMT.days().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36283);assertEquals(true, julianGMT.halfdays().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36284);assertEquals(true, julianGMT.hours().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36285);assertEquals(true, julianGMT.minutes().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36286);assertEquals(true, julianGMT.seconds().isPrecise()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36287);assertEquals(true, julianGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}} 


public void testWithZone358() {__CLR4_4_1rxirxilc8axerm.R.globalSliceStart(getClass().getName(),36288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wx53dls00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rxirxilc8axerm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rxirxilc8axerm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wx53dls00(){try{__CLR4_4_1rxirxilc8axerm.R.inc(36288); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36289);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36290);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36291);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36292);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36293);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36294);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}} 


public void testFactory_Zone_int701() {__CLR4_4_1rxirxilc8axerm.R.globalSliceStart(getClass().getName(),36295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5cdmss07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rxirxilc8axerm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rxirxilc8axerm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5cdmss07(){try{__CLR4_4_1rxirxilc8axerm.R.inc(36295); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36296);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36297);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36298);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36299);try { 
         __CLR4_4_1rxirxilc8axerm.R.inc(36300);JulianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1rxirxilc8axerm.R.inc(36301);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rxirxilc8axerm.R.inc(36302);try { 
         __CLR4_4_1rxirxilc8axerm.R.inc(36303);JulianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1rxirxilc8axerm.R.inc(36304);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}} 


public void testFactory_Zone1365() {__CLR4_4_1rxirxilc8axerm.R.globalSliceStart(getClass().getName(),36305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fws2x1s0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rxirxilc8axerm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rxirxilc8axerm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone1365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fws2x1s0h(){try{__CLR4_4_1rxirxilc8axerm.R.inc(36305); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36306);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36307);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36308);assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     __CLR4_4_1rxirxilc8axerm.R.inc(36309);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1rxirxilc8axerm.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
