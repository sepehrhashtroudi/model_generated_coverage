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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1kkzkkzle6qe9nm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27000,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26675);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26676);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26677);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26678);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1kkzkkzle6qe9nm.R.inc(26680);try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26679);
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26681);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26682);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26683);zone = DateTimeZone.getDefault();
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26684);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26685);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26686);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26687);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26688);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26689);DateTimeZone.setDefault(zone);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26690);zone = null;
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26691);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26692);systemDefaultLocale = null;
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP135() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5md7bklh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5md7bklh(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26693); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26694);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26695);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26696);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26697);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26698);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26699);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testSerialization191() throws Exception {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqtq5uklo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqtq5uklo() throws Exception{try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26700); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26701);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26702);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26703);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26704);oos.writeObject(test); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26705);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26706);oos.close(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26707);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26708);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26709);LocalDate result = (LocalDate) ois.readObject(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26710);ois.close(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26711);assertEquals(test, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26712);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26713);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26714);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testGet_DateTimeFieldType193() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18knwvokm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18knwvokm3(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26715); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26716);LocalDate test = new LocalDate(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26717);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26718);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26719);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26720);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26721);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26722);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26723);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26724);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26725);test.get(null); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26726);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26727);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26728);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26729);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToInterval_Zone268() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7el5qkmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7el5qkmi(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26730); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26731);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26732);Interval test = base.toInterval(TOKYO); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26733);check(base, 2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26734);DateTime start = base.toDateTimeAtStartOfDay(TOKYO); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26735);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26736);Interval expected = new Interval(start, end); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26737);assertEquals(expected, test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToDateTime_nullRI613() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtfgmikmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtfgmikmq(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26738); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26739);LocalDate base = new LocalDate(2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26740);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26741);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26742);DateTime test = base.toDateTime((ReadableInstant) null); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26743);check(base, 2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26744);DateTime expected = dt; 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26745);expected = expected.year().setCopy(2005); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26746);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26747);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26748);assertEquals(expected, test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToDate_springDST_2Hour40Savings704() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l43mxckn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings704",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l43mxckn1(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26749); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26750);LocalDate base = new LocalDate(2007, 4, 2); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26751);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26752);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26753);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26754);TimeZone.setDefault(testZone); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26755);Date test = base.toDate(); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26756);check(base, 2007, 4, 2); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26757);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26758);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testGetValues706() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6s22mknb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6s22mknb(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26759); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26760);LocalDate test = new LocalDate(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26761);int[] values = test.getValues(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26762);assertEquals(1970, values[0]); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26763);assertEquals(6, values[1]); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26764);assertEquals(9, values[2]); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26765);assertNotSame(test.getValues(), test.getValues()); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testGetFieldType_int712() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15f0yhtkni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15f0yhtkni(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26766); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26767);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26768);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26769);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26770);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26771);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26772);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26773);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26774);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testGetValue_int713() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naf2l9knr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naf2l9knr(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26775); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26776);LocalDate test = new LocalDate(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26777);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26778);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26779);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26780);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26781);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26782);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26783);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType715() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ixy46ko0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ixy46ko0(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26784); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26785);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26786);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26787);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26788);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26789);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26790);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26791);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26792);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26793);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26794);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26795);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26796);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26797);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26798);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26799);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToString_DTFormatter716() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118gx9mkog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118gx9mkog(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26800); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26801);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26802);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26803);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType717() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uigfkok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uigfkok(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26804); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26805);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26806);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26807);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26808);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26809);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26810);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26811);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26812);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26813);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26814);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testEqualsHashCodeStrict718() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgs1w0kov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgs1w0kov(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26815); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26816);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26817);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26818);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26819);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26820);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26821);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26822);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26823);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26824);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToDate_winter719() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c27kl9kp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c27kl9kp5(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26825); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26826);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26827);Date test = base.toDate(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26828);check(base, 2005, 1, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26829);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26830);gcal.clear(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26831);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26832);gcal.set(Calendar.MONTH, Calendar.JANUARY); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26833);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26834);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testIsEqual_LocalDate720() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuu68akpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuu68akpf(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26835); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26836);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26837);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26838);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26839);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26840);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26841);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26842);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26843);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26844);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26845);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26846);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26847);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26848);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26849);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26850);new LocalDate(2005, 7, 2).isEqual(null); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateTimeAtMidnight721() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5uo7mkpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5uo7mkpw(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26852); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26853);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26854);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26855);check(base, 2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26856);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToLocalDateTime_nullLocalTime722() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onu5ebkq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onu5ebkq1(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26857); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26858);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26859);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26860);base.toLocalDateTime((LocalTime) null); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26861);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToLocalDateTime_wrongChronologyLocalTime723() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naxrpikq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naxrpikq6(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26862); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26863);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26864);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26865);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26866);base.toLocalDateTime(tod); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26867);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToDateTime_LocalTime_nullZone724() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11s14k1kqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11s14k1kqc(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26868); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26869);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26870);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26871);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26872);check(base, 2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26873);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26874);assertEquals(expected, test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToDateTime_wrongChronoLocalTime_Zone725() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17280fpkqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone725",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17280fpkqj(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26875); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26876);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26877);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26878);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26879);base.toDateTime(tod, LONDON); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26880);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToInterval726() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18flngwkqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18flngwkqp(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26881); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26882);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26883);Interval test = base.toInterval(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26884);check(base, 2005, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26885);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26886);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26887);Interval expected = new Interval(start, end); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26888);assertEquals(expected, test); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2727() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4x71gkqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4x71gkqx(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26889); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26890);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26891);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26892);test.withField(null, 6); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26893);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3728() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8lt1gkr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8lt1gkr2(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26894); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26895);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26896);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26897);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1729() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1os8hevkr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1os8hevkr7(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26899); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26900);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26901);LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26902);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26903);assertEquals(new LocalDate(2006, 6, 9), result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_2730() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejzbnrkrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejzbnrkrc(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26904); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26905);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26906);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26907);test.withFieldAdded(null, 0); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26908);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4731() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lm2g8krh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lm2g8krh(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26909); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26910);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26911);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26912);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5732() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16i2jjskrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16i2jjskrl(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26913); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26914);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26915);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26916);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26917);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testPlusYears_int733() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyuh24krq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyuh24krq(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26918); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26919);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26920);LocalDate result = test.plusYears(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26921);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26922);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26923);result = test.plusYears(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26924);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testPlusWeeks_int734() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qmbj0krx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qmbj0krx(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26925); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26926);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26927);LocalDate result = test.plusWeeks(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26928);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26929);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26930);result = test.plusWeeks(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26931);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testPlusDays_int735() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p494b1ks4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p494b1ks4(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26932); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26933);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26934);LocalDate result = test.plusDays(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26935);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26936);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26937);result = test.plusDays(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26938);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testMinus_RP736() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzaeguksb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzaeguksb(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26939); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26940);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26941);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26942);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26943);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26944);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26945);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testMinusMonths_int737() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h62gapksi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h62gapksi(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26946); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26947);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26948);LocalDate result = test.minusMonths(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26949);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26950);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26951);result = test.minusMonths(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26952);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testMinusWeeks_int738() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmyqc2ksp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmyqc2ksp(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26953); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26954);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26955);LocalDate result = test.minusWeeks(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26956);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26957);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26958);result = test.minusWeeks(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26959);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testMinusDays_int739() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivlr1dksw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivlr1dksw(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26960); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26961);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26962);LocalDate result = test.minusDays(1); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26963);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26964);assertEquals(expected, result); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26965);result = test.minusDays(0); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26966);assertSame(test, result); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testProperty740() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luqtw3kt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luqtw3kt3(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26967); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26968);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26969);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26970);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26971);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26972);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26973);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26974);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26975);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26976);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26977);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26978);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26979);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26980);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26981);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26982);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26983);try { 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26984);test.property(null); 
         __CLR4_4_1kkzkkzle6qe9nm.R.inc(26985);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 


public void testToString_String743() {__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceStart(getClass().getName(),26986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dz8wdxktm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkzkkzle6qe9nm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkzkkzle6qe9nm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String743",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dz8wdxktm(){try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26986); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26987);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26988);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1kkzkkzle6qe9nm.R.inc(26989);assertEquals("2002-06-09", test.toString((String) null)); 
 }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26990);
            __CLR4_4_1kkzkkzle6qe9nm.R.inc(26991);return COPTIC_UTC;
        }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26992);
            __CLR4_4_1kkzkkzle6qe9nm.R.inc(26993);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26994);
            __CLR4_4_1kkzkkzle6qe9nm.R.inc(26995);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1kkzkkzle6qe9nm.R.inc(26996);
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26997);assertEquals(hour, test.getYear());
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26998);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1kkzkkzle6qe9nm.R.inc(26999);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1kkzkkzle6qe9nm.R.flushNeeded();}}
}
