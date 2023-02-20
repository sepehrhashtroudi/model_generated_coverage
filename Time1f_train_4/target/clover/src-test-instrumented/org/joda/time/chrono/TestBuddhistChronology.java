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
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_1pjypjyle6rjd9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,33187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33118);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33119);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33120);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33121);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33122);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_1pjypjyle6rjd9p.R.inc(33124);try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33123);
    }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33125);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33126);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33127);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33128);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33129);originalLocale = Locale.getDefault();
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33130);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33131);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33132);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33133);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33134);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33135);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33136);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33137);Locale.setDefault(originalLocale);
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33138);originalDateTimeZone = null;
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33139);originalTimeZone = null;
        __CLR4_4_1pjypjyle6rjd9p.R.inc(33140);originalLocale = null;
    }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEra416() {__CLR4_4_1pjypjyle6rjd9p.R.globalSliceStart(getClass().getName(),33141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghu59apkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjypjyle6rjd9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjypjyle6rjd9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghu59apkl(){try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33141); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33142);assertEquals(1, BuddhistChronology.BE); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33143);try { 
         __CLR4_4_1pjypjyle6rjd9p.R.inc(33144);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC); 
         __CLR4_4_1pjypjyle6rjd9p.R.inc(33145);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}} 


public void testWithUTC424() {__CLR4_4_1pjypjyle6rjd9p.R.globalSliceStart(getClass().getName(),33146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtvdvzpkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjypjyle6rjd9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjypjyle6rjd9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtvdvzpkq(){try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33146); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33147);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33148);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33149);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33150);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}} 


public void testTimeFields425() {__CLR4_4_1pjypjyle6rjd9p.R.globalSliceStart(getClass().getName(),33151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ykf96pkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjypjyle6rjd9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjypjyle6rjd9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ykf96pkv(){try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33151); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33152);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33153);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33154);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33155);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33156);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33157);assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33158);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33159);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33160);assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33161);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33162);assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33163);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33164);assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33165);assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33166);assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33167);assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33168);assertEquals(true, buddhist.hourOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33169);assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33170);assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33171);assertEquals(true, buddhist.secondOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33172);assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33173);assertEquals(true, buddhist.millisOfDay().isSupported()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33174);assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}} 


public void testFactory_Zone426() {__CLR4_4_1pjypjyle6rjd9p.R.globalSliceStart(getClass().getName(),33175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqxk5wplj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjypjyle6rjd9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjypjyle6rjd9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqxk5wplj(){try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33175); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33176);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33177);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33178);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone()); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33179);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}} 


public void testWithZone428() {__CLR4_4_1pjypjyle6rjd9p.R.globalSliceStart(getClass().getName(),33180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cntqv1plo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pjypjyle6rjd9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pjypjyle6rjd9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithZone428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cntqv1plo(){try{__CLR4_4_1pjypjyle6rjd9p.R.inc(33180); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33181);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33182);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33183);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33184);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33185);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1pjypjyle6rjd9p.R.inc(33186);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1pjypjyle6rjd9p.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
