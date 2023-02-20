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
public class TestChronology extends TestCase {static class __CLR4_4_1gz8gz8le6qe95z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22004);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22005);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22006);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22007);return new TestSuite(TestChronology.class);
    }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}}

    public TestChronology(String name) {
        super(name);__CLR4_4_1gz8gz8le6qe95z.R.inc(22009);try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22008);
    }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22010);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22011);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22012);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22013);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22014);originalLocale = Locale.getDefault();
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22015);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22016);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22017);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22018);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22019);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22020);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22021);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22022);Locale.setDefault(originalLocale);
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22023);originalDateTimeZone = null;
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22024);originalTimeZone = null;
        __CLR4_4_1gz8gz8le6qe95z.R.inc(22025);originalLocale = null;
    }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEqualsHashCode_ISO289() {__CLR4_4_1gz8gz8le6qe95z.R.globalSliceStart(getClass().getName(),22026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihgg5kgzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz8gz8le6qe95z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz8gz8le6qe95z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_ISO289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihgg5kgzu(){try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22026); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22027);Chronology chrono1 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22028);Chronology chrono2 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22029);Chronology chrono3 = ISOChronology.getInstance(); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22030);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22031);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22032);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22033);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22034);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22035);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22036);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22037);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22038);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}} 


public void testToString499() {__CLR4_4_1gz8gz8le6qe95z.R.globalSliceStart(getClass().getName(),22039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1laar5vh07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz8gz8le6qe95z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz8gz8le6qe95z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testToString499",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1laar5vh07(){try{__CLR4_4_1gz8gz8le6qe95z.R.inc(22039); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22040);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22041);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22042);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22043);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22044);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22045);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22046);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22047);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22048);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22049);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22050);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22051);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22052);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1gz8gz8le6qe95z.R.inc(22053);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1gz8gz8le6qe95z.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
