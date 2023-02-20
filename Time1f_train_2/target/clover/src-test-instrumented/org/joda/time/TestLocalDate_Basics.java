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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1kickicle6qseyx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,26934,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
//    private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
//    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
//    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kickicle6qseyx.R.inc(26580);
        __CLR4_4_1kickicle6qseyx.R.inc(26581);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kickicle6qseyx.R.inc(26582);
        __CLR4_4_1kickicle6qseyx.R.inc(26583);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1kickicle6qseyx.R.inc(26585);try{__CLR4_4_1kickicle6qseyx.R.inc(26584);
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kickicle6qseyx.R.inc(26586);
        __CLR4_4_1kickicle6qseyx.R.inc(26587);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kickicle6qseyx.R.inc(26588);zone = DateTimeZone.getDefault();
        __CLR4_4_1kickicle6qseyx.R.inc(26589);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kickicle6qseyx.R.inc(26590);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kickicle6qseyx.R.inc(26591);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kickicle6qseyx.R.inc(26592);
        __CLR4_4_1kickicle6qseyx.R.inc(26593);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kickicle6qseyx.R.inc(26594);DateTimeZone.setDefault(zone);
        __CLR4_4_1kickicle6qseyx.R.inc(26595);zone = null;
        __CLR4_4_1kickicle6qseyx.R.inc(26596);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kickicle6qseyx.R.inc(26597);systemDefaultLocale = null;
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP115() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk84b9kiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk84b9kiu(){try{__CLR4_4_1kickicle6qseyx.R.inc(26598); 
     __CLR4_4_1kickicle6qseyx.R.inc(26599);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26600);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26601);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26602);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26603);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kickicle6qseyx.R.inc(26604);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testSerialization170() throws Exception {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxw1ppkj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxw1ppkj1() throws Exception{try{__CLR4_4_1kickicle6qseyx.R.inc(26605); 
     __CLR4_4_1kickicle6qseyx.R.inc(26606);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26607);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26608);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1kickicle6qseyx.R.inc(26609);oos.writeObject(test); 
     __CLR4_4_1kickicle6qseyx.R.inc(26610);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26611);oos.close(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26612);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1kickicle6qseyx.R.inc(26613);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1kickicle6qseyx.R.inc(26614);LocalDate result = (LocalDate) ois.readObject(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26615);ois.close(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26616);assertEquals(test, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26617);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26618);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26619);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testGetters433() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wflqx1kjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wflqx1kjg(){try{__CLR4_4_1kickicle6qseyx.R.inc(26620); 
     __CLR4_4_1kickicle6qseyx.R.inc(26621);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1kickicle6qseyx.R.inc(26622);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26623);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26624);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26625);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26626);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26627);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26628);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26629);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26630);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26631);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26632);assertEquals(DateTimeConstants.AD, test.getEra()); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDateTimeAtStartOfDay457() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w46p4xkjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w46p4xkjt(){try{__CLR4_4_1kickicle6qseyx.R.inc(26633); 
     __CLR4_4_1kickicle6qseyx.R.inc(26634);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26635);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26636);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26637);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDateTime_nullRI599() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122oyo7kjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122oyo7kjy(){try{__CLR4_4_1kickicle6qseyx.R.inc(26638); 
     __CLR4_4_1kickicle6qseyx.R.inc(26639);LocalDate base = new LocalDate(2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26640);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     __CLR4_4_1kickicle6qseyx.R.inc(26641);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26642);DateTime test = base.toDateTime((ReadableInstant) null); 
     __CLR4_4_1kickicle6qseyx.R.inc(26643);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26644);DateTime expected = dt; 
     __CLR4_4_1kickicle6qseyx.R.inc(26645);expected = expected.year().setCopy(2005); 
     __CLR4_4_1kickicle6qseyx.R.inc(26646);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1kickicle6qseyx.R.inc(26647);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26648);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testGetValues689() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bayc94kk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues689",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bayc94kk9(){try{__CLR4_4_1kickicle6qseyx.R.inc(26649); 
     __CLR4_4_1kickicle6qseyx.R.inc(26650);LocalDate test = new LocalDate(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26651);int[] values = test.getValues(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26652);assertEquals(1970, values[0]); 
     __CLR4_4_1kickicle6qseyx.R.inc(26653);assertEquals(6, values[1]); 
     __CLR4_4_1kickicle6qseyx.R.inc(26654);assertEquals(9, values[2]); 
     __CLR4_4_1kickicle6qseyx.R.inc(26655);assertNotSame(test.getValues(), test.getValues()); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testGetFieldType_int695() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4cp5lkkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4cp5lkkg(){try{__CLR4_4_1kickicle6qseyx.R.inc(26656); 
     __CLR4_4_1kickicle6qseyx.R.inc(26657);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26658);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26659);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26660);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26661);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26662);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kickicle6qseyx.R.inc(26663);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26664);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testGetValue_int696() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8yl25kkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int696",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8yl25kkp(){try{__CLR4_4_1kickicle6qseyx.R.inc(26665); 
     __CLR4_4_1kickicle6qseyx.R.inc(26666);LocalDate test = new LocalDate(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26667);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26668);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26669);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26670);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26671);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kickicle6qseyx.R.inc(26672);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26673);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType698() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sysg7kkky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sysg7kkky(){try{__CLR4_4_1kickicle6qseyx.R.inc(26674); 
     __CLR4_4_1kickicle6qseyx.R.inc(26675);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26676);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26677);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26678);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26679);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26680);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26681);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26682);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26683);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26684);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26685);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26686);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26687);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26688);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26689);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToString_DTFormatter699() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x99h24kle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x99h24kle(){try{__CLR4_4_1kickicle6qseyx.R.inc(26690); 
     __CLR4_4_1kickicle6qseyx.R.inc(26691);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26692);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kickicle6qseyx.R.inc(26693);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType700() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijevfvkli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijevfvkli(){try{__CLR4_4_1kickicle6qseyx.R.inc(26694); 
     __CLR4_4_1kickicle6qseyx.R.inc(26695);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26696);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26697);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26698);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26699);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26700);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26701);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26702);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26703);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26704);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testEqualsHashCodeStrict701() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q02m6uklt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q02m6uklt(){try{__CLR4_4_1kickicle6qseyx.R.inc(26705); 
     __CLR4_4_1kickicle6qseyx.R.inc(26706);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26707);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26708);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26709);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26710);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26711);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26712);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26713);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26714);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDate_winter702() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umgyhjkm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umgyhjkm3(){try{__CLR4_4_1kickicle6qseyx.R.inc(26715); 
     __CLR4_4_1kickicle6qseyx.R.inc(26716);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26717);Date test = base.toDate(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26718);check(base, 2005, 1, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26719);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26720);gcal.clear(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26721);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1kickicle6qseyx.R.inc(26722);gcal.set(Calendar.MONTH, Calendar.JANUARY); 
     __CLR4_4_1kickicle6qseyx.R.inc(26723);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26724);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testIsEqual_LocalDate703() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtvqhdkmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtvqhdkmd(){try{__CLR4_4_1kickicle6qseyx.R.inc(26725); 
     __CLR4_4_1kickicle6qseyx.R.inc(26726);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kickicle6qseyx.R.inc(26727);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kickicle6qseyx.R.inc(26728);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26729);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26730);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26731);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26732);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1kickicle6qseyx.R.inc(26733);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26734);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26735);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26736);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26737);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26738);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26739);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26740);new LocalDate(2005, 7, 2).isEqual(null); 
         __CLR4_4_1kickicle6qseyx.R.inc(26741);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDate_autumnDST704() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xeeuhkmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST704",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xeeuhkmu(){try{__CLR4_4_1kickicle6qseyx.R.inc(26742); 
     __CLR4_4_1kickicle6qseyx.R.inc(26743);LocalDate base = new LocalDate(2007, 10, 2); 
     __CLR4_4_1kickicle6qseyx.R.inc(26744);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1kickicle6qseyx.R.inc(26745);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26746);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26747);TimeZone.setDefault(testZone); 
         __CLR4_4_1kickicle6qseyx.R.inc(26748);Date test = base.toDate(); 
         __CLR4_4_1kickicle6qseyx.R.inc(26749);check(base, 2007, 10, 2); 
         __CLR4_4_1kickicle6qseyx.R.inc(26750);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kickicle6qseyx.R.inc(26751);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime705() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xpq3skn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime705",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xpq3skn4(){try{__CLR4_4_1kickicle6qseyx.R.inc(26752); 
     __CLR4_4_1kickicle6qseyx.R.inc(26753);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26754);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26755);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kickicle6qseyx.R.inc(26756);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26757);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26758);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26759);expected = expected.year().setCopy(2005); 
     __CLR4_4_1kickicle6qseyx.R.inc(26760);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1kickicle6qseyx.R.inc(26761);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26762);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight706() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whaym1knf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whaym1knf(){try{__CLR4_4_1kickicle6qseyx.R.inc(26763); 
     __CLR4_4_1kickicle6qseyx.R.inc(26764);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26765);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26766);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26767);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToLocalDateTime_nullLocalTime707() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iivtqeknk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime707",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iivtqeknk(){try{__CLR4_4_1kickicle6qseyx.R.inc(26768); 
     __CLR4_4_1kickicle6qseyx.R.inc(26769);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26770);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26771);base.toLocalDateTime((LocalTime) null); 
         __CLR4_4_1kickicle6qseyx.R.inc(26772);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToLocalDateTime_LocalTime708() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xouf78knp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime708",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xouf78knp(){try{__CLR4_4_1kickicle6qseyx.R.inc(26773); 
     __CLR4_4_1kickicle6qseyx.R.inc(26774);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26775);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kickicle6qseyx.R.inc(26776);LocalDateTime test = base.toLocalDateTime(tod); 
     __CLR4_4_1kickicle6qseyx.R.inc(26777);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26778);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC); 
     __CLR4_4_1kickicle6qseyx.R.inc(26779);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDateTime_LocalTime709() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4h46knw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime709",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4h46knw(){try{__CLR4_4_1kickicle6qseyx.R.inc(26780); 
     __CLR4_4_1kickicle6qseyx.R.inc(26781);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26782);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kickicle6qseyx.R.inc(26783);DateTime test = base.toDateTime(tod); 
     __CLR4_4_1kickicle6qseyx.R.inc(26784);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26785);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26786);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToDateTime_LocalTime_nullZone710() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj85poko3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone710",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj85poko3(){try{__CLR4_4_1kickicle6qseyx.R.inc(26787); 
     __CLR4_4_1kickicle6qseyx.R.inc(26788);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26789);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kickicle6qseyx.R.inc(26790);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1kickicle6qseyx.R.inc(26791);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26792);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26793);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToInterval711() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhuyy4koa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval711",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhuyy4koa(){try{__CLR4_4_1kickicle6qseyx.R.inc(26794); 
     __CLR4_4_1kickicle6qseyx.R.inc(26795);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kickicle6qseyx.R.inc(26796);Interval test = base.toInterval(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26797);check(base, 2005, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26798);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1kickicle6qseyx.R.inc(26799);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26800);Interval expected = new Interval(start, end); 
     __CLR4_4_1kickicle6qseyx.R.inc(26801);assertEquals(expected, test); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3712() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz8w8xkoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz8w8xkoi(){try{__CLR4_4_1kickicle6qseyx.R.inc(26802); 
     __CLR4_4_1kickicle6qseyx.R.inc(26803);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26804);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26805);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1kickicle6qseyx.R.inc(26806);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1713() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofm7vikon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofm7vikon(){try{__CLR4_4_1kickicle6qseyx.R.inc(26807); 
     __CLR4_4_1kickicle6qseyx.R.inc(26808);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26809);LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1kickicle6qseyx.R.inc(26810);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1kickicle6qseyx.R.inc(26811);assertEquals(new LocalDate(2006, 6, 9), result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_2714() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ese7kos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ese7kos(){try{__CLR4_4_1kickicle6qseyx.R.inc(26812); 
     __CLR4_4_1kickicle6qseyx.R.inc(26813);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26814);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26815);test.withFieldAdded(null, 0); 
         __CLR4_4_1kickicle6qseyx.R.inc(26816);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4715() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzs1lqkox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzs1lqkox(){try{__CLR4_4_1kickicle6qseyx.R.inc(26817); 
     __CLR4_4_1kickicle6qseyx.R.inc(26818);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26819);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26820);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1716() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boq2rmkp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boq2rmkp1(){try{__CLR4_4_1kickicle6qseyx.R.inc(26821); 
     __CLR4_4_1kickicle6qseyx.R.inc(26822);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26823);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1kickicle6qseyx.R.inc(26824);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1kickicle6qseyx.R.inc(26825);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testPlusYears_int717() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mjmzukp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mjmzukp6(){try{__CLR4_4_1kickicle6qseyx.R.inc(26826); 
     __CLR4_4_1kickicle6qseyx.R.inc(26827);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26828);LocalDate result = test.plusYears(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26829);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26830);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26831);result = test.plusYears(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26832);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testPlusMonths_int718() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur031mkpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur031mkpd(){try{__CLR4_4_1kickicle6qseyx.R.inc(26833); 
     __CLR4_4_1kickicle6qseyx.R.inc(26834);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26835);LocalDate result = test.plusMonths(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26836);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26837);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26838);result = test.plusMonths(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26839);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testPlusDays_int719() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbgtm5kpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbgtm5kpk(){try{__CLR4_4_1kickicle6qseyx.R.inc(26840); 
     __CLR4_4_1kickicle6qseyx.R.inc(26841);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26842);LocalDate result = test.plusDays(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26843);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26844);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26845);result = test.plusDays(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26846);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testMinus_RP720() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19tyy7xkpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19tyy7xkpr(){try{__CLR4_4_1kickicle6qseyx.R.inc(26847); 
     __CLR4_4_1kickicle6qseyx.R.inc(26848);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26849);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26850);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26851);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26852);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1kickicle6qseyx.R.inc(26853);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testMinusYears_int721() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqrafpkpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqrafpkpy(){try{__CLR4_4_1kickicle6qseyx.R.inc(26854); 
     __CLR4_4_1kickicle6qseyx.R.inc(26855);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26856);LocalDate result = test.minusYears(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26857);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26858);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26859);result = test.minusYears(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26860);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testMinusWeeks_int722() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkvyybkq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkvyybkq5(){try{__CLR4_4_1kickicle6qseyx.R.inc(26861); 
     __CLR4_4_1kickicle6qseyx.R.inc(26862);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26863);LocalDate result = test.minusWeeks(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26864);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26865);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26866);result = test.minusWeeks(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26867);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testMinusDays_int723() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xnlnekqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xnlnekqc(){try{__CLR4_4_1kickicle6qseyx.R.inc(26868); 
     __CLR4_4_1kickicle6qseyx.R.inc(26869);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26870);LocalDate result = test.minusDays(1); 
     __CLR4_4_1kickicle6qseyx.R.inc(26871);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     __CLR4_4_1kickicle6qseyx.R.inc(26872);assertEquals(expected, result); 
     __CLR4_4_1kickicle6qseyx.R.inc(26873);result = test.minusDays(0); 
     __CLR4_4_1kickicle6qseyx.R.inc(26874);assertSame(test, result); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testProperty724() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1okz413kqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1okz413kqj(){try{__CLR4_4_1kickicle6qseyx.R.inc(26875); 
     __CLR4_4_1kickicle6qseyx.R.inc(26876);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     __CLR4_4_1kickicle6qseyx.R.inc(26877);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26878);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26879);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26880);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26881);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26882);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26883);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26884);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26885);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26886);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26887);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1kickicle6qseyx.R.inc(26888);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26889);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1kickicle6qseyx.R.inc(26890);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kickicle6qseyx.R.inc(26891);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26892);test.property(null); 
         __CLR4_4_1kickicle6qseyx.R.inc(26893);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testWithers725() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6peelkr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers725",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6peelkr2(){try{__CLR4_4_1kickicle6qseyx.R.inc(26894); 
     __CLR4_4_1kickicle6qseyx.R.inc(26895);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1kickicle6qseyx.R.inc(26896);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26897);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26898);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1kickicle6qseyx.R.inc(26899);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1kickicle6qseyx.R.inc(26900);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1kickicle6qseyx.R.inc(26901);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1kickicle6qseyx.R.inc(26902);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1kickicle6qseyx.R.inc(26903);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26904);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26905);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26906);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26907);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26908);test.withMonthOfYear(0); 
         __CLR4_4_1kickicle6qseyx.R.inc(26909);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kickicle6qseyx.R.inc(26910);try { 
         __CLR4_4_1kickicle6qseyx.R.inc(26911);test.withMonthOfYear(13); 
         __CLR4_4_1kickicle6qseyx.R.inc(26912);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToString_String728() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv56gikrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv56gikrl(){try{__CLR4_4_1kickicle6qseyx.R.inc(26913); 
     __CLR4_4_1kickicle6qseyx.R.inc(26914);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26915);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1kickicle6qseyx.R.inc(26916);assertEquals("2002-06-09", test.toString((String) null)); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 


public void testToString_String_Locale729() {__CLR4_4_1kickicle6qseyx.R.globalSliceStart(getClass().getName(),26917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvmin2krp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kickicle6qseyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kickicle6qseyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvmin2krp(){try{__CLR4_4_1kickicle6qseyx.R.inc(26917); 
     __CLR4_4_1kickicle6qseyx.R.inc(26918);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1kickicle6qseyx.R.inc(26919);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26920);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26921);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26922);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1kickicle6qseyx.R.inc(26923);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kickicle6qseyx.R.inc(26924);
            __CLR4_4_1kickicle6qseyx.R.inc(26925);return COPTIC_UTC;
        }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kickicle6qseyx.R.inc(26926);
            __CLR4_4_1kickicle6qseyx.R.inc(26927);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kickicle6qseyx.R.inc(26928);
            __CLR4_4_1kickicle6qseyx.R.inc(26929);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}
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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1kickicle6qseyx.R.inc(26930);
        __CLR4_4_1kickicle6qseyx.R.inc(26931);assertEquals(hour, test.getYear());
        __CLR4_4_1kickicle6qseyx.R.inc(26932);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1kickicle6qseyx.R.inc(26933);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1kickicle6qseyx.R.flushNeeded();}}
}
