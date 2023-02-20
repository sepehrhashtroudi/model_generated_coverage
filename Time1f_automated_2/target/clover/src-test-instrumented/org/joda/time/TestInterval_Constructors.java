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
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1hrvhrvle6nl891{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23035);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23036);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23037);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23038);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1hrvhrvle6nl891.R.inc(23040);try{__CLR4_4_1hrvhrvle6nl891.R.inc(23039);
    }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23041);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23042);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23043);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hrvhrvle6nl891.R.inc(23044);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hrvhrvle6nl891.R.inc(23045);originalLocale = Locale.getDefault();
        __CLR4_4_1hrvhrvle6nl891.R.inc(23046);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23047);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hrvhrvle6nl891.R.inc(23048);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23049);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23050);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hrvhrvle6nl891.R.inc(23051);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23052);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23053);Locale.setDefault(originalLocale);
        __CLR4_4_1hrvhrvle6nl891.R.inc(23054);originalDateTimeZone = null;
        __CLR4_4_1hrvhrvle6nl891.R.inc(23055);originalTimeZone = null;
        __CLR4_4_1hrvhrvle6nl891.R.inc(23056);originalLocale = null;
    }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_Object3146() throws Throwable {__CLR4_4_1hrvhrvle6nl891.R.globalSliceStart(getClass().getName(),23057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlbihphsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrvhrvle6nl891.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrvhrvle6nl891.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object3146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlbihphsh() throws Throwable{try{__CLR4_4_1hrvhrvle6nl891.R.inc(23057); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23058);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23059);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23060);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23061);Interval test = new Interval(base); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23062);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23063);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1hrvhrvle6nl891.R.inc(23064);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
    

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
        public Chronology getChronology() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23065);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23066);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23067);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23068);return 1234L;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23069);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23070);return new DateTime(1234L);
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23071);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23072);return 5678L;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23073);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23074);return new DateTime(5678L);
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23075);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23076);return (5678L - 1234L);
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23077);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23078);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23079);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23080);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23081);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23082);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23083);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23084);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23085);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23086);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23087);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23088);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23089);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23090);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23091);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23092);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23093);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23094);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23095);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23096);return false;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23097);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23098);return null;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23099);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23100);return null;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23101);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23102);return null;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1hrvhrvle6nl891.R.inc(23103);
            __CLR4_4_1hrvhrvle6nl891.R.inc(23104);return null;
        }finally{__CLR4_4_1hrvhrvle6nl891.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
