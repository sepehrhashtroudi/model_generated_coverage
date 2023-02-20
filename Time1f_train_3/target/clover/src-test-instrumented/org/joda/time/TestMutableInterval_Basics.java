/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1mcwmcwle6rclhf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,29110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    
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

    public static void main(String[] args) {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28976);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28977);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28978);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28979);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1mcwmcwle6rclhf.R.inc(28981);try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28980);
    }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28982);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28983);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28984);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28985);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28986);originalLocale = Locale.getDefault();
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28987);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28988);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28989);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28990);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28991);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28992);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28993);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28994);Locale.setDefault(originalLocale);
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28995);originalDateTimeZone = null;
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28996);originalTimeZone = null;
        __CLR4_4_1mcwmcwle6rclhf.R.inc(28997);originalLocale = null;
    }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEqualsHashCode120() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),28998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144qagamdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testEqualsHashCode120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144qagamdi(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(28998); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(28999);MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29000);MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29001);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29002);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29003);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29004);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29005);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29006);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29007);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29008);MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29009);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29010);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29011);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29012);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29013);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29014);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29015);MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29016);assertEquals(true, test4.equals(test4)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29017);assertEquals(false, test1.equals(test4)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29018);assertEquals(false, test2.equals(test4)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29019);assertEquals(false, test4.equals(test1)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29020);assertEquals(false, test4.equals(test2)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29021);assertEquals(false, test1.hashCode() == test4.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29022);assertEquals(false, test2.hashCode() == test4.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29023);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29024);assertEquals(true, test1.equals(test5)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29025);assertEquals(true, test2.equals(test5)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29026);assertEquals(false, test3.equals(test5)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29027);assertEquals(true, test5.equals(test1)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29028);assertEquals(true, test5.equals(test2)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29029);assertEquals(false, test5.equals(test3)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29030);assertEquals(true, test1.hashCode() == test5.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29031);assertEquals(true, test2.hashCode() == test5.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29032);assertEquals(false, test3.hashCode() == test5.hashCode()); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29033);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29034);assertEquals(true, test1.equals(new MockInterval())); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29035);assertEquals(false, test1.equals(new DateTime(TEST_TIME1))); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testOverlaps_RInterval1155() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gl7fszmek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gl7fszmek(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29036); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29037);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29038);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29039);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29040);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29041);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29042);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29043);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29044);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29045);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29046);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29047);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29048);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29049);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29050);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29051);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29052);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29053);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29054);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29055);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29056);assertEquals(true, test.overlaps((ReadableInterval) null)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29057);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29058);assertEquals(false, empty.overlaps(empty)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29059);assertEquals(false, empty.overlaps(test)); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29060);assertEquals(false, test.overlaps(empty)); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testIsBefore_RI1158() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0ps8rmf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI1158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0ps8rmf9(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29061); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29062);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29063);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29064);assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29065);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29066);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29067);assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29068);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29069);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testIsBefore_RInterval1160() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvzvucmfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RInterval1160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvzvucmfi(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29070); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29071);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29072);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29073);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29074);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29075);assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29076);assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29077);assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29078);assertEquals(false, test.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testIsAfter_RInterval1164() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qod799mfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RInterval1164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qod799mfr(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29079); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29080);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29081);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29082);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29083);assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29084);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29085);assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29086);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29087);assertEquals(false, test.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testToInterval11165() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4r6m3mg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToInterval11165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4r6m3mg0(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29088); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29089);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29090);Interval result = test.toInterval(); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29091);assertEquals(test, result); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testToMutableInterval11166() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6r15mmg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval11166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6r15mmg4(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29092); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29093);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29094);MutableInterval result = test.toMutableInterval(); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29095);assertEquals(test, result); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29096);assertNotSame(test, result); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 


public void testCopy1431() {__CLR4_4_1mcwmcwle6rclhf.R.globalSliceStart(getClass().getName(),29097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzy5rmg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcwmcwle6rclhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcwmcwle6rclhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzy5rmg9(){try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29097); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29098);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29099);MutableInterval cloned = test.copy(); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29100);assertEquals(test, cloned); 
     __CLR4_4_1mcwmcwle6rclhf.R.inc(29101);assertNotSame(test, cloned); 
 }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1mcwmcwle6rclhf.R.inc(29103);try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29102);
        }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29104);
            __CLR4_4_1mcwmcwle6rclhf.R.inc(29105);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29106);
            __CLR4_4_1mcwmcwle6rclhf.R.inc(29107);return TEST_TIME1;
        }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mcwmcwle6rclhf.R.inc(29108);
            __CLR4_4_1mcwmcwle6rclhf.R.inc(29109);return TEST_TIME2;
        }finally{__CLR4_4_1mcwmcwle6rclhf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    


}
