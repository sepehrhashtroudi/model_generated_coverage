/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1hbqhbqldl91174{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,22516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22454);
        __CLR4_4_1hbqhbqldl91174.R.inc(22455);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22456);
        __CLR4_4_1hbqhbqldl91174.R.inc(22457);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1hbqhbqldl91174.R.inc(22459);try{__CLR4_4_1hbqhbqldl91174.R.inc(22458);
    }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hbqhbqldl91174.R.inc(22460);
        __CLR4_4_1hbqhbqldl91174.R.inc(22461);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hbqhbqldl91174.R.inc(22462);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hbqhbqldl91174.R.inc(22463);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hbqhbqldl91174.R.inc(22464);originalLocale = Locale.getDefault();
        __CLR4_4_1hbqhbqldl91174.R.inc(22465);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hbqhbqldl91174.R.inc(22466);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hbqhbqldl91174.R.inc(22467);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hbqhbqldl91174.R.inc(22468);
        __CLR4_4_1hbqhbqldl91174.R.inc(22469);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hbqhbqldl91174.R.inc(22470);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hbqhbqldl91174.R.inc(22471);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hbqhbqldl91174.R.inc(22472);Locale.setDefault(originalLocale);
        __CLR4_4_1hbqhbqldl91174.R.inc(22473);originalDateTimeZone = null;
        __CLR4_4_1hbqhbqldl91174.R.inc(22474);originalTimeZone = null;
        __CLR4_4_1hbqhbqldl91174.R.inc(22475);originalLocale = null;
    }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}

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
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22476);
            __CLR4_4_1hbqhbqldl91174.R.inc(22477);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22478);
            __CLR4_4_1hbqhbqldl91174.R.inc(22479);return 1234L;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22480);
            __CLR4_4_1hbqhbqldl91174.R.inc(22481);return new DateTime(1234L);
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22482);
            __CLR4_4_1hbqhbqldl91174.R.inc(22483);return 5678L;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22484);
            __CLR4_4_1hbqhbqldl91174.R.inc(22485);return new DateTime(5678L);
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22486);
            __CLR4_4_1hbqhbqldl91174.R.inc(22487);return (5678L - 1234L);
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22488);
            __CLR4_4_1hbqhbqldl91174.R.inc(22489);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22490);
            __CLR4_4_1hbqhbqldl91174.R.inc(22491);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22492);
            __CLR4_4_1hbqhbqldl91174.R.inc(22493);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22494);
            __CLR4_4_1hbqhbqldl91174.R.inc(22495);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22496);
            __CLR4_4_1hbqhbqldl91174.R.inc(22497);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22498);
            __CLR4_4_1hbqhbqldl91174.R.inc(22499);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22500);
            __CLR4_4_1hbqhbqldl91174.R.inc(22501);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22502);
            __CLR4_4_1hbqhbqldl91174.R.inc(22503);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22504);
            __CLR4_4_1hbqhbqldl91174.R.inc(22505);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22506);
            __CLR4_4_1hbqhbqldl91174.R.inc(22507);return false;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22508);
            __CLR4_4_1hbqhbqldl91174.R.inc(22509);return null;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22510);
            __CLR4_4_1hbqhbqldl91174.R.inc(22511);return null;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1hbqhbqldl91174.R.inc(22512);
            __CLR4_4_1hbqhbqldl91174.R.inc(22513);return null;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1hbqhbqldl91174.R.inc(22514);
            __CLR4_4_1hbqhbqldl91174.R.inc(22515);return null;
        }finally{__CLR4_4_1hbqhbqldl91174.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
