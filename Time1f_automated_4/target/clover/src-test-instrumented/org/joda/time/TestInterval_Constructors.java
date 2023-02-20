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
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1hxlhxlle6o79rf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23241);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23242);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23243);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23244);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1hxlhxlle6o79rf.R.inc(23246);try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23245);
    }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23247);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23248);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23249);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23250);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23251);originalLocale = Locale.getDefault();
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23252);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23253);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23254);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23255);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23256);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23257);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23258);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23259);Locale.setDefault(originalLocale);
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23260);originalDateTimeZone = null;
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23261);originalTimeZone = null;
        __CLR4_4_1hxlhxlle6o79rf.R.inc(23262);originalLocale = null;
    }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RD1139() throws Throwable {__CLR4_4_1hxlhxlle6o79rf.R.globalSliceStart(getClass().getName(),23263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exaavkhy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxlhxlle6o79rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxlhxlle6o79rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exaavkhy7() throws Throwable{try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23263); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23264);long result = TEST_TIME_NOW; 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23265);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23266);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23267);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23268);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23269);Interval test = new Interval(dt, dur); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23270);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23271);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
public void testConstructor_RD_RI1140() throws Throwable {__CLR4_4_1hxlhxlle6o79rf.R.globalSliceStart(getClass().getName(),23272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t17iohyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxlhxlle6o79rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxlhxlle6o79rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t17iohyg() throws Throwable{try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23272); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23273);long result = TEST_TIME_NOW; 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23274);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23275);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23276);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23277);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23278);Interval test = new Interval(dur, dt); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23279);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23280);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
public void testConstructor_RI_RP3141() throws Throwable {__CLR4_4_1hxlhxlle6o79rf.R.globalSliceStart(getClass().getName(),23281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rssm5thyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxlhxlle6o79rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxlhxlle6o79rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP3141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rssm5thyp() throws Throwable{try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23281); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23282);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23283);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23284);long result = TEST_TIME_NOW; 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23285);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23286);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23287);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23288);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23289);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23290);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
public void testGet_DateTimeFieldType367() {__CLR4_4_1hxlhxlle6o79rf.R.globalSliceStart(getClass().getName(),23291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ti9c3hyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxlhxlle6o79rf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxlhxlle6o79rf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testGet_DateTimeFieldType367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ti9c3hyz(){try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23291); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23292);LocalDate test = new LocalDate(); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23293);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23294);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23295);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23296);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23297);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23298);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23299);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23300);try { 
         __CLR4_4_1hxlhxlle6o79rf.R.inc(23301);test.get(null); 
         __CLR4_4_1hxlhxlle6o79rf.R.inc(23302);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hxlhxlle6o79rf.R.inc(23303);try { 
         __CLR4_4_1hxlhxlle6o79rf.R.inc(23304);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1hxlhxlle6o79rf.R.inc(23305);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
    

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
        public Chronology getChronology() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23306);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23307);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23308);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23309);return 1234L;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23310);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23311);return new DateTime(1234L);
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23312);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23313);return 5678L;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23314);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23315);return new DateTime(5678L);
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23316);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23317);return (5678L - 1234L);
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23318);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23319);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23320);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23321);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23322);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23323);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23324);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23325);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23326);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23327);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23328);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23329);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23330);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23331);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23332);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23333);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23334);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23335);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23336);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23337);return false;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23338);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23339);return null;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23340);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23341);return null;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23342);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23343);return null;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1hxlhxlle6o79rf.R.inc(23344);
            __CLR4_4_1hxlhxlle6o79rf.R.inc(23345);return null;
        }finally{__CLR4_4_1hxlhxlle6o79rf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
