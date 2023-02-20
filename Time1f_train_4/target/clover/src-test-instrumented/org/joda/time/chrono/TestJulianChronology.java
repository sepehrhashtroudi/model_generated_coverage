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
public class TestJulianChronology extends TestCase {static class __CLR4_4_1qfpqfple6rjddq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,34358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1qfpqfple6rjddq.R.inc(34261);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34262);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qfpqfple6rjddq.R.inc(34263);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34264);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1qfpqfple6rjddq.R.inc(34266);try{__CLR4_4_1qfpqfple6rjddq.R.inc(34265);
    }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qfpqfple6rjddq.R.inc(34267);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34268);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34269);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1qfpqfple6rjddq.R.inc(34270);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1qfpqfple6rjddq.R.inc(34271);originalLocale = Locale.getDefault();
        __CLR4_4_1qfpqfple6rjddq.R.inc(34272);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34273);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1qfpqfple6rjddq.R.inc(34274);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qfpqfple6rjddq.R.inc(34275);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34276);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qfpqfple6rjddq.R.inc(34277);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34278);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34279);Locale.setDefault(originalLocale);
        __CLR4_4_1qfpqfple6rjddq.R.inc(34280);originalDateTimeZone = null;
        __CLR4_4_1qfpqfple6rjddq.R.inc(34281);originalTimeZone = null;
        __CLR4_4_1qfpqfple6rjddq.R.inc(34282);originalLocale = null;
    }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationFields259() {__CLR4_4_1qfpqfple6rjddq.R.globalSliceStart(getClass().getName(),34283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy80qmqgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qfpqfple6rjddq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qfpqfple6rjddq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy80qmqgb(){try{__CLR4_4_1qfpqfple6rjddq.R.inc(34283); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34284);final JulianChronology julian = JulianChronology.getInstance(); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34285);assertEquals("eras", julian.eras().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34286);assertEquals("centuries", julian.centuries().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34287);assertEquals("years", julian.years().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34288);assertEquals("weekyears", julian.weekyears().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34289);assertEquals("months", julian.months().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34290);assertEquals("weeks", julian.weeks().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34291);assertEquals("days", julian.days().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34292);assertEquals("halfdays", julian.halfdays().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34293);assertEquals("hours", julian.hours().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34294);assertEquals("minutes", julian.minutes().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34295);assertEquals("seconds", julian.seconds().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34296);assertEquals("millis", julian.millis().getName()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34297);assertEquals(false, julian.eras().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34298);assertEquals(true, julian.centuries().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34299);assertEquals(true, julian.years().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34300);assertEquals(true, julian.weekyears().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34301);assertEquals(true, julian.months().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34302);assertEquals(true, julian.weeks().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34303);assertEquals(true, julian.days().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34304);assertEquals(true, julian.halfdays().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34305);assertEquals(true, julian.hours().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34306);assertEquals(true, julian.minutes().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34307);assertEquals(true, julian.seconds().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34308);assertEquals(true, julian.millis().isSupported()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34309);assertEquals(false, julian.centuries().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34310);assertEquals(false, julian.years().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34311);assertEquals(false, julian.weekyears().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34312);assertEquals(false, julian.months().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34313);assertEquals(false, julian.weeks().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34314);assertEquals(false, julian.days().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34315);assertEquals(false, julian.halfdays().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34316);assertEquals(true, julian.hours().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34317);assertEquals(true, julian.minutes().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34318);assertEquals(true, julian.seconds().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34319);assertEquals(true, julian.millis().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34320);final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34321);assertEquals(false, julianUTC.centuries().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34322);assertEquals(false, julianUTC.years().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34323);assertEquals(false, julianUTC.weekyears().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34324);assertEquals(false, julianUTC.months().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34325);assertEquals(true, julianUTC.weeks().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34326);assertEquals(true, julianUTC.days().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34327);assertEquals(true, julianUTC.halfdays().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34328);assertEquals(true, julianUTC.hours().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34329);assertEquals(true, julianUTC.minutes().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34330);assertEquals(true, julianUTC.seconds().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34331);assertEquals(true, julianUTC.millis().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34332);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34333);final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34334);assertEquals(false, julianGMT.centuries().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34335);assertEquals(false, julianGMT.years().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34336);assertEquals(false, julianGMT.weekyears().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34337);assertEquals(false, julianGMT.months().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34338);assertEquals(true, julianGMT.weeks().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34339);assertEquals(true, julianGMT.days().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34340);assertEquals(true, julianGMT.halfdays().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34341);assertEquals(true, julianGMT.hours().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34342);assertEquals(true, julianGMT.minutes().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34343);assertEquals(true, julianGMT.seconds().isPrecise()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34344);assertEquals(true, julianGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}} 


public void testToString417() {__CLR4_4_1qfpqfple6rjddq.R.globalSliceStart(getClass().getName(),34345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilaatfqi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qfpqfple6rjddq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qfpqfple6rjddq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilaatfqi1(){try{__CLR4_4_1qfpqfple6rjddq.R.inc(34345); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34346);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34347);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34348);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34349);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34350);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}} 


public void testWithZone418() {__CLR4_4_1qfpqfple6rjddq.R.globalSliceStart(getClass().getName(),34351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h215oiqi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qfpqfple6rjddq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qfpqfple6rjddq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h215oiqi7(){try{__CLR4_4_1qfpqfple6rjddq.R.inc(34351); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34352);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34353);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34354);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34355);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34356);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1qfpqfple6rjddq.R.inc(34357);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1qfpqfple6rjddq.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
