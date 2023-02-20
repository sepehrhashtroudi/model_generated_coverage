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
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1hzqhzqle6np4f9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23318);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23319);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23320);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23321);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1hzqhzqle6np4f9.R.inc(23323);try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23322);
    }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23324);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23325);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23326);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23327);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23328);originalLocale = Locale.getDefault();
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23329);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23330);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23331);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23332);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23333);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23334);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23335);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23336);Locale.setDefault(originalLocale);
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23337);originalDateTimeZone = null;
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23338);originalTimeZone = null;
        __CLR4_4_1hzqhzqle6np4f9.R.inc(23339);originalLocale = null;
    }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIntervalParse_noFormatter123() throws Throwable {__CLR4_4_1hzqhzqle6np4f9.R.globalSliceStart(getClass().getName(),23340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cel1fxi0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzqhzqle6np4f9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzqhzqle6np4f9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testIntervalParse_noFormatter123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cel1fxi0c() throws Throwable{try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23340); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23341);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23342);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23343);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23344);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23345);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
public void testConstructor_RI_RI1333() throws Throwable {__CLR4_4_1hzqhzqle6np4f9.R.globalSliceStart(getClass().getName(),23346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133zwb5i0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzqhzqle6np4f9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzqhzqle6np4f9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI1333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133zwb5i0i() throws Throwable{try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23346); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23347);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23348);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23349);MutableInterval test = new MutableInterval(dt1, dt2); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23350);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1hzqhzqle6np4f9.R.inc(23351);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
    

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
        public Chronology getChronology() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23352);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23353);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23354);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23355);return 1234L;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23356);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23357);return new DateTime(1234L);
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23358);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23359);return 5678L;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23360);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23361);return new DateTime(5678L);
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23362);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23363);return (5678L - 1234L);
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23364);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23365);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23366);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23367);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23368);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23369);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23370);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23371);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23372);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23373);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23374);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23375);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23376);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23377);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23378);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23379);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23380);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23381);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23382);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23383);return false;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23384);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23385);return null;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23386);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23387);return null;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23388);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23389);return null;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1hzqhzqle6np4f9.R.inc(23390);
            __CLR4_4_1hzqhzqle6np4f9.R.inc(23391);return null;
        }finally{__CLR4_4_1hzqhzqle6np4f9.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
