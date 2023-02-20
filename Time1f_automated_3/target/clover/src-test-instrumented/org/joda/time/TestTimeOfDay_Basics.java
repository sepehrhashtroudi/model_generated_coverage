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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1jr2jr2le6np4me{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25598);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25599);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25600);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25601);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1jr2jr2le6np4me.R.inc(25603);try{__CLR4_4_1jr2jr2le6np4me.R.inc(25602);
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25604);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25605);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25606);zone = DateTimeZone.getDefault();
        __CLR4_4_1jr2jr2le6np4me.R.inc(25607);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25608);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25609);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jr2jr2le6np4me.R.inc(25610);DateTimeZone.setDefault(zone);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25611);zone = null;
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGet4() {__CLR4_4_1jr2jr2le6np4me.R.globalSliceStart(getClass().getName(),25612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5fg4pjrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr2jr2le6np4me.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr2jr2le6np4me.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGet4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5fg4pjrg(){try{__CLR4_4_1jr2jr2le6np4me.R.inc(25612); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25613);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25614);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25615);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25616);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25617);try { 
         __CLR4_4_1jr2jr2le6np4me.R.inc(25618);test.get(null); 
         __CLR4_4_1jr2jr2le6np4me.R.inc(25619);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25620);try { 
         __CLR4_4_1jr2jr2le6np4me.R.inc(25621);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1jr2jr2le6np4me.R.inc(25622);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
public void testPlusSeconds_int486() {__CLR4_4_1jr2jr2le6np4me.R.globalSliceStart(getClass().getName(),25623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jtnptijrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr2jr2le6np4me.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr2jr2le6np4me.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jtnptijrr(){try{__CLR4_4_1jr2jr2le6np4me.R.inc(25623); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25624);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25625);TimeOfDay result = test.plusSeconds(1); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25626);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25627);assertEquals(expected, result); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25628);result = test.plusSeconds(0); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25629);assertSame(test, result); 
 }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
public void testMinusMillis_int487() {__CLR4_4_1jr2jr2le6np4me.R.globalSliceStart(getClass().getName(),25630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcev46jry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr2jr2le6np4me.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr2jr2le6np4me.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcev46jry(){try{__CLR4_4_1jr2jr2le6np4me.R.inc(25630); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25631);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25632);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25633);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25634);assertEquals(expected, result); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25635);result = test.minusMillis(0); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25636);assertSame(test, result); 
 }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
public void testToString_String642() {__CLR4_4_1jr2jr2le6np4me.R.globalSliceStart(getClass().getName(),25637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3e6bbjs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr2jr2le6np4me.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr2jr2le6np4me.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3e6bbjs5(){try{__CLR4_4_1jr2jr2le6np4me.R.inc(25637); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25638);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25639);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25640);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25641);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25642);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1jr2jr2le6np4me.R.inc(25643);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25644);
            __CLR4_4_1jr2jr2le6np4me.R.inc(25645);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25646);
            __CLR4_4_1jr2jr2le6np4me.R.inc(25647);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25648);
            __CLR4_4_1jr2jr2le6np4me.R.inc(25649);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1jr2jr2le6np4me.R.inc(25650);
        __CLR4_4_1jr2jr2le6np4me.R.inc(25651);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1jr2jr2le6np4me.R.inc(25652);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1jr2jr2le6np4me.R.inc(25653);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1jr2jr2le6np4me.R.inc(25654);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1jr2jr2le6np4me.R.flushNeeded();}}
}
