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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1kjqkjqle6rcl3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,26977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26630);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26631);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26632);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26633);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1kjqkjqle6rcl3f.R.inc(26635);try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26634);
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26636);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26637);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26638);zone = DateTimeZone.getDefault();
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26639);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26640);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26641);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26642);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26643);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26644);DateTimeZone.setDefault(zone);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26645);zone = null;
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26646);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26647);systemDefaultLocale = null;
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP128() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwmolpkk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwmolpkk8(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26648); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26649);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26650);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26651);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26652);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26653);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26654);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testSerialization192() throws Exception {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wztoybkkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wztoybkkf() throws Exception{try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26655); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26656);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26657);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26658);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26659);oos.writeObject(test); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26660);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26661);oos.close(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26662);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26663);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26664);LocalDate result = (LocalDate) ois.readObject(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26665);ois.close(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26666);assertEquals(test, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26667);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26668);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26669);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testGet_DateTimeFieldType193() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18knwvokku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18knwvokku(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26670); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26671);LocalDate test = new LocalDate(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26672);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26673);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26674);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26675);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26676);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26677);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26678);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26679);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26680);test.get(null); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26681);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26682);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26683);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26684);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToInterval_Zone279() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rga6akl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rga6akl9(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26685); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26686);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26687);Interval test = base.toInterval(TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26688);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26689);DateTime start = base.toDateTimeAtStartOfDay(TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26690);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26691);Interval expected = new Interval(start, end); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26692);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testGetters468() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481tg9klh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481tg9klh(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26693); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26694);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26695);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26696);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26697);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26698);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26699);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26700);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26701);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26702);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26703);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26704);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26705);assertEquals(DateTimeConstants.AD, test.getEra()); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTimeAtStartOfDay494() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z4yooklu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z4yooklu(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26706); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26707);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26708);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26709);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26710);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTime_nullRI621() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kztme1klz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kztme1klz(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26711); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26712);LocalDate base = new LocalDate(2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26713);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26714);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26715);DateTime test = base.toDateTime((ReadableInstant) null); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26716);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26717);DateTime expected = dt; 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26718);expected = expected.year().setCopy(2005); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26719);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26720);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26721);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDate_springDST_2Hour40Savings706() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm3kiakma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm3kiakma(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26722); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26723);LocalDate base = new LocalDate(2007, 4, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26724);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26725);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26726);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26727);TimeZone.setDefault(testZone); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26728);Date test = base.toDate(); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26729);check(base, 2007, 4, 2); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26730);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26731);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testGetFieldType_int713() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1260zpckmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1260zpckmk(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26732); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26733);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26734);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26735);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26736);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26737);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26738);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26739);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26740);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType715() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ixy46kmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ixy46kmt(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26741); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26742);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26743);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26744);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26745);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26746);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26747);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26748);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26749);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26750);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26751);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26752);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26753);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26754);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26755);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26756);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToString_DTFormatter716() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118gx9mkn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118gx9mkn9(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26757); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26758);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26759);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26760);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDate_winter717() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k7n0bknd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k7n0bknd(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26761); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26762);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26763);Date test = base.toDate(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26764);check(base, 2005, 1, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26765);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26766);gcal.clear(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26767);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26768);gcal.set(Calendar.MONTH, Calendar.JANUARY); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26769);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26770);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testIsEqual_LocalDate718() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4z00jknn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4z00jknn(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26771); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26772);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26773);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26774);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26775);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26776);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26777);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26778);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26779);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26780);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26781);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26782);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26783);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26784);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26785);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26786);new LocalDate(2005, 7, 2).isEqual(null); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26787);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDate_autumnDST719() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wznqbpko4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wznqbpko4(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26788); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26789);LocalDate base = new LocalDate(2007, 10, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26790);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26791);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26792);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26793);TimeZone.setDefault(testZone); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26794);Date test = base.toDate(); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26795);check(base, 2007, 10, 2); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26796);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26797);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateTimeAtMidnight720() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwupf5koe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwupf5koe(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26798); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26799);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26800);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26801);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26802);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime721() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xj3u5qkoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xj3u5qkoj(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26803); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26804);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26805);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26806);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26807);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26808);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26809);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26810);expected = expected.year().setCopy(2005); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26811);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26812);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26813);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight722() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vwuk3kou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vwuk3kou(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26814); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26815);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26816);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26817);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26818);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToLocalDateTime_wrongChronologyLocalTime723() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naxrpikoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naxrpikoz(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26819); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26820);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26821);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26822);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26823);base.toLocalDateTime(tod); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26824);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToLocalDateTime_LocalTime724() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193gb5akp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193gb5akp5(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26825); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26826);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26827);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26828);LocalDateTime test = base.toLocalDateTime(tod); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26829);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26830);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26831);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTime_LocalTime725() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awqd28kpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime725",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awqd28kpc(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26832); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26833);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26834);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26835);DateTime test = base.toDateTime(tod); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26836);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26837);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26838);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTime_LocalTime_nullZone726() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pyt0xkpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pyt0xkpj(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26839); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26840);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26841);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26842);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26843);check(base, 2005, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26844);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26845);assertEquals(expected, test); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToDateTime_wrongChronoLocalTime_Zone727() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dk7y0nkpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dk7y0nkpq(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26846); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26847);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26848);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26849);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26850);base.toDateTime(tod, LONDON); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2728() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdx5txkpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdx5txkpw(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26852); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26853);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26854);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26855);test.withField(null, 6); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26856);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3729() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhlrtxkq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhlrtxkq1(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26857); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26858);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26859);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26860);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26861);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4730() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14um18pkq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14um18pkq6(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26862); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26863);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26864);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26865);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5731() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1392krbkqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1392krbkqa(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26866); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26867);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26868);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26869);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26870);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1732() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwo1ackqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwo1ackqf(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26871); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26872);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26873);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26874);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26875);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testPlusYears_int733() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyuh24kqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyuh24kqk(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26876); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26877);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26878);LocalDate result = test.plusYears(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26879);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26880);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26881);result = test.plusYears(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26882);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testPlusMonths_int734() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fopuvkkqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fopuvkkqr(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26883); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26884);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26885);LocalDate result = test.plusMonths(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26886);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26887);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26888);result = test.plusMonths(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26889);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testPlusWeeks_int735() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zmabhkqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zmabhkqy(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26890); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26891);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26892);LocalDate result = test.plusWeeks(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26893);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26894);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26895);result = test.plusWeeks(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26896);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testMinusYears_int736() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ohyyhkr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ohyyhkr5(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26897); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26898);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26899);LocalDate result = test.minusYears(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26900);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26901);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26902);result = test.minusYears(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26903);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testMinusMonths_int737() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h62gapkrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h62gapkrc(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26904); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26905);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26906);LocalDate result = test.minusMonths(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26907);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26908);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26909);result = test.minusMonths(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26910);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testMinusWeeks_int738() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmyqc2krj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmyqc2krj(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26911); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26912);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26913);LocalDate result = test.minusWeeks(1); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26914);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26915);assertEquals(expected, result); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26916);result = test.minusWeeks(0); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26917);assertSame(test, result); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testProperty739() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldvmgtkrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldvmgtkrq(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26918); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26919);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26920);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26921);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26922);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26923);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26924);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26925);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26926);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26927);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26928);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26929);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26930);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26931);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26932);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26933);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26934);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26935);test.property(null); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26936);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testWithers740() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l00kq4ks9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l00kq4ks9(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26937); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26938);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26939);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26940);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26941);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26942);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26943);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26944);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26945);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26946);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26947);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26948);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26949);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26950);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26951);test.withMonthOfYear(0); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26952);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26953);try { 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26954);test.withMonthOfYear(13); 
         __CLR4_4_1kjqkjqle6rcl3f.R.inc(26955);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToString_String742() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h88v6ekss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h88v6ekss(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26956); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26957);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26958);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26959);assertEquals("2002-06-09", test.toString((String) null)); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 


public void testToString_String_Locale743() {__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceStart(getClass().getName(),26960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s8h06ksw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kjqkjqle6rcl3f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kjqkjqle6rcl3f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale743",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s8h06ksw(){try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26960); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26961);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26962);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26963);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26964);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26965);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1kjqkjqle6rcl3f.R.inc(26966);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26967);
            __CLR4_4_1kjqkjqle6rcl3f.R.inc(26968);return COPTIC_UTC;
        }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26969);
            __CLR4_4_1kjqkjqle6rcl3f.R.inc(26970);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26971);
            __CLR4_4_1kjqkjqle6rcl3f.R.inc(26972);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1kjqkjqle6rcl3f.R.inc(26973);
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26974);assertEquals(hour, test.getYear());
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26975);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1kjqkjqle6rcl3f.R.inc(26976);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1kjqkjqle6rcl3f.R.flushNeeded();}}
}
