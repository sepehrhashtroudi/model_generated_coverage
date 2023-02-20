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
public class TestJulianChronology extends TestCase {static class __CLR4_4_1qepqeple6qeafe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,34337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1qepqeple6qeafe.R.inc(34225);
        __CLR4_4_1qepqeple6qeafe.R.inc(34226);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qepqeple6qeafe.R.inc(34227);
        __CLR4_4_1qepqeple6qeafe.R.inc(34228);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1qepqeple6qeafe.R.inc(34230);try{__CLR4_4_1qepqeple6qeafe.R.inc(34229);
    }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qepqeple6qeafe.R.inc(34231);
        __CLR4_4_1qepqeple6qeafe.R.inc(34232);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qepqeple6qeafe.R.inc(34233);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1qepqeple6qeafe.R.inc(34234);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1qepqeple6qeafe.R.inc(34235);originalLocale = Locale.getDefault();
        __CLR4_4_1qepqeple6qeafe.R.inc(34236);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1qepqeple6qeafe.R.inc(34237);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1qepqeple6qeafe.R.inc(34238);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qepqeple6qeafe.R.inc(34239);
        __CLR4_4_1qepqeple6qeafe.R.inc(34240);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qepqeple6qeafe.R.inc(34241);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1qepqeple6qeafe.R.inc(34242);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1qepqeple6qeafe.R.inc(34243);Locale.setDefault(originalLocale);
        __CLR4_4_1qepqeple6qeafe.R.inc(34244);originalDateTimeZone = null;
        __CLR4_4_1qepqeple6qeafe.R.inc(34245);originalTimeZone = null;
        __CLR4_4_1qepqeple6qeafe.R.inc(34246);originalLocale = null;
    }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationFields255() {__CLR4_4_1qepqeple6qeafe.R.globalSliceStart(getClass().getName(),34247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy85kqqfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qepqeple6qeafe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qepqeple6qeafe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy85kqqfb(){try{__CLR4_4_1qepqeple6qeafe.R.inc(34247); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34248);final JulianChronology julian = JulianChronology.getInstance(); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34249);assertEquals("eras", julian.eras().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34250);assertEquals("centuries", julian.centuries().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34251);assertEquals("years", julian.years().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34252);assertEquals("weekyears", julian.weekyears().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34253);assertEquals("months", julian.months().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34254);assertEquals("weeks", julian.weeks().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34255);assertEquals("days", julian.days().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34256);assertEquals("halfdays", julian.halfdays().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34257);assertEquals("hours", julian.hours().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34258);assertEquals("minutes", julian.minutes().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34259);assertEquals("seconds", julian.seconds().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34260);assertEquals("millis", julian.millis().getName()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34261);assertEquals(false, julian.eras().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34262);assertEquals(true, julian.centuries().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34263);assertEquals(true, julian.years().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34264);assertEquals(true, julian.weekyears().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34265);assertEquals(true, julian.months().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34266);assertEquals(true, julian.weeks().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34267);assertEquals(true, julian.days().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34268);assertEquals(true, julian.halfdays().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34269);assertEquals(true, julian.hours().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34270);assertEquals(true, julian.minutes().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34271);assertEquals(true, julian.seconds().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34272);assertEquals(true, julian.millis().isSupported()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34273);assertEquals(false, julian.centuries().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34274);assertEquals(false, julian.years().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34275);assertEquals(false, julian.weekyears().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34276);assertEquals(false, julian.months().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34277);assertEquals(false, julian.weeks().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34278);assertEquals(false, julian.days().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34279);assertEquals(false, julian.halfdays().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34280);assertEquals(true, julian.hours().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34281);assertEquals(true, julian.minutes().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34282);assertEquals(true, julian.seconds().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34283);assertEquals(true, julian.millis().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34284);final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34285);assertEquals(false, julianUTC.centuries().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34286);assertEquals(false, julianUTC.years().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34287);assertEquals(false, julianUTC.weekyears().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34288);assertEquals(false, julianUTC.months().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34289);assertEquals(true, julianUTC.weeks().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34290);assertEquals(true, julianUTC.days().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34291);assertEquals(true, julianUTC.halfdays().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34292);assertEquals(true, julianUTC.hours().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34293);assertEquals(true, julianUTC.minutes().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34294);assertEquals(true, julianUTC.seconds().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34295);assertEquals(true, julianUTC.millis().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34296);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34297);final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34298);assertEquals(false, julianGMT.centuries().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34299);assertEquals(false, julianGMT.years().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34300);assertEquals(false, julianGMT.weekyears().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34301);assertEquals(false, julianGMT.months().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34302);assertEquals(true, julianGMT.weeks().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34303);assertEquals(true, julianGMT.days().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34304);assertEquals(true, julianGMT.halfdays().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34305);assertEquals(true, julianGMT.hours().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34306);assertEquals(true, julianGMT.minutes().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34307);assertEquals(true, julianGMT.seconds().isPrecise()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34308);assertEquals(true, julianGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}} 


public void testToString409() {__CLR4_4_1qepqeple6qeafe.R.globalSliceStart(getClass().getName(),34309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mko56qh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qepqeple6qeafe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qepqeple6qeafe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mko56qh1(){try{__CLR4_4_1qepqeple6qeafe.R.inc(34309); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34310);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34311);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34312);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34313);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34314);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}} 


public void testFactory_Zone410() {__CLR4_4_1qepqeple6qeafe.R.globalSliceStart(getClass().getName(),34315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxo7h5qh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qepqeple6qeafe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qepqeple6qeafe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxo7h5qh7(){try{__CLR4_4_1qepqeple6qeafe.R.inc(34315); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34316);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34317);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34318);assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34319);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}} 


public void testFactory_Zone_int411() {__CLR4_4_1qepqeple6qeafe.R.globalSliceStart(getClass().getName(),34320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z2li0qhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qepqeple6qeafe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qepqeple6qeafe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z2li0qhc(){try{__CLR4_4_1qepqeple6qeafe.R.inc(34320); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34321);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34322);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34323);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34324);try { 
         __CLR4_4_1qepqeple6qeafe.R.inc(34325);JulianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1qepqeple6qeafe.R.inc(34326);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qepqeple6qeafe.R.inc(34327);try { 
         __CLR4_4_1qepqeple6qeafe.R.inc(34328);JulianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1qepqeple6qeafe.R.inc(34329);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}} 


public void testWithZone413() {__CLR4_4_1qepqeple6qeafe.R.globalSliceStart(getClass().getName(),34330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xb0zmvqhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qepqeple6qeafe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qepqeple6qeafe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xb0zmvqhm(){try{__CLR4_4_1qepqeple6qeafe.R.inc(34330); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34331);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34332);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34333);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34334);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34335);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1qepqeple6qeafe.R.inc(34336);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1qepqeple6qeafe.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
