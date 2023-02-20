/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestChronology extends TestCase {static class __CLR4_4_1gzlgzlle6rcka2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,22107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

//    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22017);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22018);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22019);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22020);return new TestSuite(TestChronology.class);
    }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}}

    public TestChronology(String name) {
        super(name);__CLR4_4_1gzlgzlle6rcka2.R.inc(22022);try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22021);
    }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22023);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22024);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22025);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22026);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22027);originalLocale = Locale.getDefault();
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22028);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22029);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22030);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22031);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22032);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22033);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22034);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22035);Locale.setDefault(originalLocale);
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22036);originalDateTimeZone = null;
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22037);originalTimeZone = null;
        __CLR4_4_1gzlgzlle6rcka2.R.inc(22038);originalLocale = null;
    }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEqualsHashCode_ISO301() {__CLR4_4_1gzlgzlle6rcka2.R.globalSliceStart(getClass().getName(),22039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yax1g7h07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzlgzlle6rcka2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzlgzlle6rcka2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_ISO301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yax1g7h07(){try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22039); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22040);Chronology chrono1 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22041);Chronology chrono2 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22042);Chronology chrono3 = ISOChronology.getInstance(); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22043);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22044);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22045);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22046);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22047);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22048);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22049);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22050);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22051);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}} 


public void testToString514() {__CLR4_4_1gzlgzlle6rcka2.R.globalSliceStart(getClass().getName(),22052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pfpkxh0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzlgzlle6rcka2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzlgzlle6rcka2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testToString514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pfpkxh0k(){try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22052); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22053);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22054);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22055);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22056);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22057);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22058);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22059);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22060);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22061);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22062);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22063);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22064);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22065);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22066);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}} 


public void testEqualsHashCode_Limit540() {__CLR4_4_1gzlgzlle6rcka2.R.globalSliceStart(getClass().getName(),22067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zwi7kh0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzlgzlle6rcka2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzlgzlle6rcka2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Limit540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zwi7kh0z(){try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22067); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22068);DateTime lower = new DateTime(0L); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22069);DateTime higherA = new DateTime(1000000L); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22070);DateTime higherB = new DateTime(2000000L); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22071);Chronology chrono1 = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherA); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22072);Chronology chrono2A = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherA); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22073);Chronology chrono2B = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherB); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22074);Chronology chrono3 = LimitChronology.getInstance(ISOChronology.getInstance(), lower, higherA); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22075);assertEquals(true, chrono1.equals(chrono2A)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22076);assertEquals(false, chrono1.equals(chrono2B)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22077);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22078);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22079);DateTime dt2A = new DateTime(0L, chrono2A); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22080);DateTime dt2B = new DateTime(0L, chrono2B); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22081);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22082);assertEquals(true, dt1.equals(dt2A)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22083);assertEquals(false, dt1.equals(dt2B)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22084);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22085);assertEquals(true, chrono1.hashCode() == chrono2A.hashCode()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22086);assertEquals(false, chrono1.hashCode() == chrono2B.hashCode()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22087);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}} 


public void testTest884() {__CLR4_4_1gzlgzlle6rcka2.R.globalSliceStart(getClass().getName(),22088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb67jrh1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzlgzlle6rcka2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzlgzlle6rcka2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testTest884",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb67jrh1k(){try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22088); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22089);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22090);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22091);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString()); 
 }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}} 


public void testEqualsHashCode_Zoned933() {__CLR4_4_1gzlgzlle6rcka2.R.globalSliceStart(getClass().getName(),22092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150efydh1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzlgzlle6rcka2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzlgzlle6rcka2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Zoned933",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150efydh1o(){try{__CLR4_4_1gzlgzlle6rcka2.R.inc(22092); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22093);DateTimeZone zoneA = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22094);DateTimeZone zoneB = DateTimeZone.forID("Asia/Tokyo"); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22095);Chronology chrono1 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneA); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22096);Chronology chrono2 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneA); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22097);Chronology chrono3 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneB); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22098);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22099);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22100);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22101);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22102);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22103);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22104);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22105);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1gzlgzlle6rcka2.R.inc(22106);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1gzlgzlle6rcka2.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
