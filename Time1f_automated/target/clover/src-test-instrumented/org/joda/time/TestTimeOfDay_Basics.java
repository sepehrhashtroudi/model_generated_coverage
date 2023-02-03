/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1itaitalccietuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,24436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1itaitalccietuf.R.inc(24382);
        __CLR4_4_1itaitalccietuf.R.inc(24383);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1itaitalccietuf.R.inc(24384);
        __CLR4_4_1itaitalccietuf.R.inc(24385);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1itaitalccietuf.R.inc(24387);try{__CLR4_4_1itaitalccietuf.R.inc(24386);
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1itaitalccietuf.R.inc(24388);
        __CLR4_4_1itaitalccietuf.R.inc(24389);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1itaitalccietuf.R.inc(24390);zone = DateTimeZone.getDefault();
        __CLR4_4_1itaitalccietuf.R.inc(24391);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1itaitalccietuf.R.inc(24392);
        __CLR4_4_1itaitalccietuf.R.inc(24393);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1itaitalccietuf.R.inc(24394);DateTimeZone.setDefault(zone);
        __CLR4_4_1itaitalccietuf.R.inc(24395);zone = null;
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testDurationFields195() {__CLR4_4_1itaitalccietuf.R.globalSliceStart(getClass().getName(),24396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133pncbito();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itaitalccietuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itaitalccietuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testDurationFields195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133pncbito(){try{__CLR4_4_1itaitalccietuf.R.inc(24396); 
     __CLR4_4_1itaitalccietuf.R.inc(24397);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1itaitalccietuf.R.inc(24398);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24399);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24400);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24401);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24402);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24403);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24404);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24405);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24406);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24407);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24408);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24409);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1itaitalccietuf.R.inc(24410);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24411);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24412);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24413);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24414);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24415);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24416);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24417);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24418);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24419);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24420);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24421);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1itaitalccietuf.R.inc(24422);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1itaitalccietuf.R.inc(24423);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1itaitalccietuf.R.inc(24424);assertEquals(false, coptic.weekyears().isPrecise());
}finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1itaitalccietuf.R.inc(24425);
            __CLR4_4_1itaitalccietuf.R.inc(24426);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1itaitalccietuf.R.inc(24427);
            __CLR4_4_1itaitalccietuf.R.inc(24428);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1itaitalccietuf.R.inc(24429);
            __CLR4_4_1itaitalccietuf.R.inc(24430);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}
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
    

    

    // Removed as too complex
//    /**
//     * Merges two partial together, taking account of the different chronologies.
//     *
//     * @param main  the main partial
//     * @param base  the partial to use as a base to merge on top of
//     * @param instant  the instant to start from and to use for missing fields
//     * @return the merged instant
//     */
//    public long merge(ReadablePartial main, ReadablePartial base, long instant) {
//        DateTimeZone zone = main.getChronology().getZone();
//        instant = base.getChronology().withZone(zone).set(base, instant);
//        return set(main, instant);
//    }
//
//    //-----------------------------------------------------------------------
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields and using the default time zone.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology.
//     *
//     * @param date  the date to use, null means today
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date) {
//        return toDateTime(date, null);
//    }
//
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology and just assigns the fields.
//     *
//     * @param date  the date to use, null means today
//     * @param zone  the zone to get the DateTime in, null means default
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date, DateTimeZone zone) {
//        Chronology chrono = getChronology().withZone(zone);
//        if (date == null) {
//            DateTime dt = new DateTime(chrono);
//            return dt.withFields(this);
//        } else {
//            long millis = chrono.merge(this, date, DateTimeUtils.currentTimeMillis());
//            return new DateTime(millis, chrono);
//        }
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_TOKYO);
//        
//        DateTime test = base.toDateTime(ymd);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(TOKYO), COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_YMD_nullZone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1itaitalccietuf.R.inc(24431);
        __CLR4_4_1itaitalccietuf.R.inc(24432);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1itaitalccietuf.R.inc(24433);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1itaitalccietuf.R.inc(24434);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1itaitalccietuf.R.inc(24435);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1itaitalccietuf.R.flushNeeded();}}
}
