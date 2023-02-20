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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1i0ci0cle6ndpit{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

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

    public static void main(String[] args) {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23340);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23341);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23342);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23343);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1i0ci0cle6ndpit.R.inc(23345);try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23344);
    }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23346);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23347);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23348);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23349);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23350);originalLocale = Locale.getDefault();
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23351);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23352);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23353);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23354);interval37 = new Interval(3, 7);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23355);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23356);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23357);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23358);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23359);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23360);Locale.setDefault(originalLocale);
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23361);originalDateTimeZone = null;
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23362);originalTimeZone = null;
        __CLR4_4_1i0ci0cle6ndpit.R.inc(23363);originalLocale = null;
    }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithDurationBeforeEnd4115() throws Throwable {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3tl60i10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3tl60i10() throws Throwable{try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23364); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23365);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23366);Interval test = base.withDurationBeforeEnd(base.toDuration()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23367);assertSame(base, test); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testWithPeriodAfterStart2116() throws Throwable {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18solhyi14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18solhyi14() throws Throwable{try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23368); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23369);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23370);Interval test = base.withPeriodAfterStart(null); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23371);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testContains_RI_null569() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3b9sui18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3b9sui18(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23372); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23373);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23374);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23375);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23376);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23377);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23378);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23379);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23380);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23381);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23382);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23383);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23384);assertEquals(false, interval37.contains((ReadableInstant) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsEqual_RInterval570() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ts2duji1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RInterval570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ts2duji1l(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23385); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23386);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23387);assertEquals(true, test.isEqual(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23388);assertEquals(true, test.isEqual(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23389);assertEquals(false, test.isEqual(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23390);assertEquals(false, test.isEqual(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23391);assertEquals(false, test.isEqual(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23392);assertEquals(false, test.isEqual(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23393);assertEquals(false, test.isEqual((ReadableInterval) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsBefore_RI571() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcomrpi1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcomrpi1u(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23394); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23395);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23396);assertEquals(false, test.isBefore(TEST_TIME1 - 1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23397);assertEquals(false, test.isBefore(TEST_TIME1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23398);assertEquals(false, test.isBefore(TEST_TIME1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23399);assertEquals(false, test.isBefore(TEST_TIME1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23400);assertEquals(false, test.isBefore(TEST_TIME1 + 1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23401);assertEquals(true, test.isBefore(TEST_TIME2)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23402);assertEquals(true, test.isBefore(TEST_TIME2 + 1)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23403);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsBefore_RI572() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3onz8i24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3onz8i24(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23404); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23405);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23406);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23407);assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23408);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23409);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23410);assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23411);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23412);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsBeforeNow573() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1catuali2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBeforeNow573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1catuali2d(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23413); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23414);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23415);assertEquals(false, test.isBeforeNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23416);assertEquals(false, test.isBeforeNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23417);assertEquals(false, test.isBeforeNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23418);assertEquals(false, test.isBeforeNow()); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsBefore_RI_null574() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj8liqi2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj8liqi2j(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23419); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23420);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23421);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23422);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23423);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23424);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23425);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23426);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23427);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23428);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23429);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23430);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23431);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsAfterNow576() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w3mt7i2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w3mt7i2w(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23432); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23433);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23434);assertEquals(true, interval37.isAfterNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23435);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23436);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23437);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23438);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23439);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23440);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23441);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23442);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23443);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23444);assertEquals(false, interval37.isAfterNow()); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testIsAfter_RI_null577() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4yapgi39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4yapgi39(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23445); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23446);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23447);assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23448);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23449);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23450);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23451);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23452);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23453);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23454);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23455);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23456);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23457);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testToString582() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uw24oi3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uw24oi3m(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23458); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23459);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23460);assertEquals("PT1H/2010-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23461);test = new Interval(TEST_TIME1 - 1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23462);assertEquals("PT1H/2010-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testToString584() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n3vgai3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n3vgai3r(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23463); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23464);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23465);assertEquals("PT1H/2010-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23466);test = new Interval(TEST_TIME1 - 1, TEST_TIME1); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23467);assertEquals("PT1H/2010-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
public void testToString585() {__CLR4_4_1i0ci0cle6ndpit.R.globalSliceStart(getClass().getName(),23468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14w3u8ri3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ci0cle6ndpit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ci0cle6ndpit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14w3u8ri3w(){try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23468); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23469);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23470);assertEquals("PT1S/PT2S", test.toString()); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23471);test = new Interval(TEST_TIME1 - 1, TEST_TIME1); 
     __CLR4_4_1i0ci0cle6ndpit.R.inc(23472);assertEquals("PT1S/PT2S", test.toString()); 
 }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1i0ci0cle6ndpit.R.inc(23474);try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23473);
        }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23475);
            __CLR4_4_1i0ci0cle6ndpit.R.inc(23476);return ISOChronology.getInstance();
        }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23477);
            __CLR4_4_1i0ci0cle6ndpit.R.inc(23478);return TEST_TIME1;
        }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1i0ci0cle6ndpit.R.inc(23479);
            __CLR4_4_1i0ci0cle6ndpit.R.inc(23480);return TEST_TIME2;
        }finally{__CLR4_4_1i0ci0cle6ndpit.R.flushNeeded();}}
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
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
