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
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1iyyiyyle6o79xz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24586);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24587);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24588);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24589);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1iyyiyyle6o79xz.R.inc(24591);try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24590);
    }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24592);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24593);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24594);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24595);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24596);originalLocale = Locale.getDefault();
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24597);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24598);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24599);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24600);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24601);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24602);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24603);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24604);Locale.setDefault(originalLocale);
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24605);originalDateTimeZone = null;
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24606);originalTimeZone = null;
        __CLR4_4_1iyyiyyle6o79xz.R.inc(24607);originalLocale = null;
    }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RI3304() throws Throwable {__CLR4_4_1iyyiyyle6o79xz.R.globalSliceStart(getClass().getName(),24608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1223i4tizk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyyiyyle6o79xz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyyiyyle6o79xz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI3304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1223i4tizk() throws Throwable{try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24608); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24609);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24610);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24611);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
public void testSetInterval_RI_RI3576() {__CLR4_4_1iyyiyyle6o79xz.R.globalSliceStart(getClass().getName(),24612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia33vnizo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyyiyyle6o79xz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyyiyyle6o79xz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testSetInterval_RI_RI3576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia33vnizo(){try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24612); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24613);MutableInterval test = new MutableInterval(); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24614);test.setInterval(null, new Instant(TEST_TIME2)); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24615);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24616);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
public void testConstructor_RI_RI1577() throws Throwable {__CLR4_4_1iyyiyyle6o79xz.R.globalSliceStart(getClass().getName(),24617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bci419izt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyyiyyle6o79xz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyyiyyle6o79xz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bci419izt() throws Throwable{try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24617); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24618);long result = TEST_TIME_NOW; 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24619);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24620);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24621);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24622);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24623);MutableInterval test = new MutableInterval(dt, dt); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24624);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24625);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
public void testConstructor_Object4578() throws Throwable {__CLR4_4_1iyyiyyle6o79xz.R.globalSliceStart(getClass().getName(),24626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi22htj02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyyiyyle6o79xz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyyiyyle6o79xz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object4578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi22htj02() throws Throwable{try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24626); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24627);Interval base = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24628);MutableInterval test = new MutableInterval(base); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24629);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24630);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
public void testConstructor_Object4579() throws Throwable {__CLR4_4_1iyyiyyle6o79xz.R.globalSliceStart(getClass().getName(),24631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j923pcj07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyyiyyle6o79xz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyyiyyle6o79xz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object4579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j923pcj07() throws Throwable{try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24631); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24632);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L)); 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24633);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24634); 
             __CLR4_4_1iyyiyyle6o79xz.R.inc(24635);return false; 
         }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24636); 
             __CLR4_4_1iyyiyyle6o79xz.R.inc(24637);interval.setChronology(chrono); 
             __CLR4_4_1iyyiyyle6o79xz.R.inc(24638);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24639); 
             __CLR4_4_1iyyiyyle6o79xz.R.inc(24640);return ReadableInterval.class; 
         }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}} 
     }; 
     __CLR4_4_1iyyiyyle6o79xz.R.inc(24641);try { 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24642);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24643);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24644);MutableInterval test = new MutableInterval(base); 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24645);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24646);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1iyyiyyle6o79xz.R.inc(24647);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
    

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
        public Chronology getChronology() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24648);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24649);return ISOChronology.getInstance();
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24650);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24651);return 1234L;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24652);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24653);return new DateTime(1234L);
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24654);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24655);return 5678L;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24656);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24657);return new DateTime(5678L);
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24658);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24659);return (5678L - 1234L);
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24660);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24661);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24662);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24663);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24664);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24665);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24666);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24667);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24668);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24669);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24670);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24671);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24672);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24673);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24674);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24675);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24676);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24677);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24678);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24679);return false;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24680);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24681);return null;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24682);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24683);return null;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24684);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24685);return null;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1iyyiyyle6o79xz.R.inc(24686);
            __CLR4_4_1iyyiyyle6o79xz.R.inc(24687);return null;
        }finally{__CLR4_4_1iyyiyyle6o79xz.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
