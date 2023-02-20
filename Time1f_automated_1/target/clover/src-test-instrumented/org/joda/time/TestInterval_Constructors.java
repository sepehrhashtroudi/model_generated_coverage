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
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1i49i49le6ndpj3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23481);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23482);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23483);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23484);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1i49i49le6ndpj3.R.inc(23486);try{__CLR4_4_1i49i49le6ndpj3.R.inc(23485);
    }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23487);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23488);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23489);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i49i49le6ndpj3.R.inc(23490);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i49i49le6ndpj3.R.inc(23491);originalLocale = Locale.getDefault();
        __CLR4_4_1i49i49le6ndpj3.R.inc(23492);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23493);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1i49i49le6ndpj3.R.inc(23494);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23495);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23496);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i49i49le6ndpj3.R.inc(23497);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23498);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23499);Locale.setDefault(originalLocale);
        __CLR4_4_1i49i49le6ndpj3.R.inc(23500);originalDateTimeZone = null;
        __CLR4_4_1i49i49le6ndpj3.R.inc(23501);originalTimeZone = null;
        __CLR4_4_1i49i49le6ndpj3.R.inc(23502);originalLocale = null;
    }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_Object_Chronology1114() throws Throwable {__CLR4_4_1i49i49le6ndpj3.R.globalSliceStart(getClass().getName(),23503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wahy3vi4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i49i49le6ndpj3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i49i49le6ndpj3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wahy3vi4v() throws Throwable{try{__CLR4_4_1i49i49le6ndpj3.R.inc(23503); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23504);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23505);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23506);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23507);Interval test = new Interval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23508);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23509);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23510);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
public void testConstructor_RI_RP3325() throws Throwable {__CLR4_4_1i49i49le6ndpj3.R.globalSliceStart(getClass().getName(),23511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwmphji53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i49i49le6ndpj3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i49i49le6ndpj3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP3325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwmphji53() throws Throwable{try{__CLR4_4_1i49i49le6ndpj3.R.inc(23511); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23512);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23513);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23514);long result = TEST_TIME_NOW; 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23515);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23516);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23517);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23518);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23519);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1i49i49le6ndpj3.R.inc(23520);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
    

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
        public Chronology getChronology() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23521);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23522);return ISOChronology.getInstance();
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23523);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23524);return 1234L;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23525);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23526);return new DateTime(1234L);
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23527);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23528);return 5678L;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23529);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23530);return new DateTime(5678L);
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23531);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23532);return (5678L - 1234L);
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23533);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23534);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23535);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23536);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23537);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23538);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23539);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23540);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23541);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23542);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23543);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23544);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23545);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23546);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23547);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23548);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23549);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23550);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23551);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23552);return false;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23553);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23554);return null;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23555);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23556);return null;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23557);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23558);return null;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1i49i49le6ndpj3.R.inc(23559);
            __CLR4_4_1i49i49le6ndpj3.R.inc(23560);return null;
        }finally{__CLR4_4_1i49i49le6ndpj3.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
