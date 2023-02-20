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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1km7km7le6rjcjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1km7km7le6rjcjs.R.inc(26719);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26720);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1km7km7le6rjcjs.R.inc(26721);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26722);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1km7km7le6rjcjs.R.inc(26724);try{__CLR4_4_1km7km7le6rjcjs.R.inc(26723);
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1km7km7le6rjcjs.R.inc(26725);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26726);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26727);zone = DateTimeZone.getDefault();
        __CLR4_4_1km7km7le6rjcjs.R.inc(26728);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26729);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1km7km7le6rjcjs.R.inc(26730);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1km7km7le6rjcjs.R.inc(26731);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26732);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1km7km7le6rjcjs.R.inc(26733);DateTimeZone.setDefault(zone);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26734);zone = null;
        __CLR4_4_1km7km7le6rjcjs.R.inc(26735);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1km7km7le6rjcjs.R.inc(26736);systemDefaultLocale = null;
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization189() throws Exception {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0yjy3kmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0yjy3kmp() throws Exception{try{__CLR4_4_1km7km7le6rjcjs.R.inc(26737); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26738);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26739);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26740);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26741);oos.writeObject(test); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26742);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26743);oos.close(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26744);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26745);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26746);LocalDate result = (LocalDate) ois.readObject(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26747);ois.close(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26748);assertEquals(test, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26749);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26750);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26751);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testGet_DateTimeFieldType191() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122nzaqkn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122nzaqkn4(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26752); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26753);LocalDate test = new LocalDate(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26754);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26755);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26756);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26757);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26758);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26759);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26760);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26761);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26762);test.get(null); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26763);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26764);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26765);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26766);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToInterval_Zone274() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehjjs3knj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehjjs3knj(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26767); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26768);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26769);Interval test = base.toInterval(TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26770);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26771);DateTime start = base.toDateTimeAtStartOfDay(TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26772);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26773);Interval expected = new Interval(start, end); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26774);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testGetters465() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dz1ptoknr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dz1ptoknr(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26775); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26776);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26777);assertEquals(1970, test.getYear()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26778);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26779);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26780);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26781);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26782);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26783);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26784);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26785);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26786);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26787);assertEquals(DateTimeConstants.AD, test.getEra()); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTimeAtStartOfDay494() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z4yooko4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z4yooko4(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26788); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26789);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26790);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26791);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26792);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTime_nullRI628() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r655ako9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r655ako9(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26793); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26794);LocalDate base = new LocalDate(2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26795);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26796);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26797);DateTime test = base.toDateTime((ReadableInstant) null); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26798);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26799);DateTime expected = dt; 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26800);expected = expected.year().setCopy(2005); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26801);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26802);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26803);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDate_springDST_2Hour40Savings716() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dp5kxbkok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dp5kxbkok(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26804); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26805);LocalDate base = new LocalDate(2007, 4, 2); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26806);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26807);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26808);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26809);TimeZone.setDefault(testZone); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26810);Date test = base.toDate(); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26811);check(base, 2007, 4, 2); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26812);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26813);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testGetValues718() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmh5s1kou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmh5s1kou(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26814); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26815);LocalDate test = new LocalDate(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26816);int[] values = test.getValues(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26817);assertEquals(1970, values[0]); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26818);assertEquals(6, values[1]); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26819);assertEquals(9, values[2]); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26820);assertNotSame(test.getValues(), test.getValues()); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testGetFieldType_int724() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ustvmokp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ustvmokp1(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26821); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26822);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26823);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26824);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26825);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26826);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26827);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26828);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26829);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testGetValue_int725() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxfrj8kpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int725",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxfrj8kpa(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26830); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26831);LocalDate test = new LocalDate(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26832);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26833);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26834);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26835);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26836);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26837);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26838);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType726() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wjb8iykpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wjb8iykpj(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26839); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26840);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26841);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26842);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26843);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26844);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26845);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26846);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26847);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26848);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26849);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26850);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26851);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26852);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26853);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26854);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToString_DTFormatter727() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7bslmkpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7bslmkpz(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26855); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26856);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26857);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26858);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType728() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy0cvlkq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy0cvlkq3(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26859); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26860);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26861);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26862);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26863);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26864);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26865);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26866);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26867);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26868);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26869);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testEqualsHashCodeStrict729() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blh4r4kqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blh4r4kqe(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26870); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26871);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26872);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26873);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26874);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26875);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26876);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26877);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26878);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26879);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDate_autumnDST730() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sxmcwkqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sxmcwkqo(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26880); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26881);LocalDate base = new LocalDate(2007, 10, 2); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26882);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26883);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26884);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26885);TimeZone.setDefault(testZone); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26886);Date test = base.toDate(); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26887);check(base, 2007, 10, 2); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26888);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26889);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateTimeAtMidnight731() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5eh7zkqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5eh7zkqy(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26890); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26891);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26892);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26893);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26894);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime732() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8ytqkr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8ytqkr3(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26895); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26896);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26897);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26898);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26899);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26900);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26901);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26902);expected = expected.year().setCopy(2005); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26903);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26904);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26905);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight733() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6cc31kre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6cc31kre(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26906); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26907);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26908);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26909);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26910);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToLocalDateTime_nullLocalTime734() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5f2gckrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5f2gckrj(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26911); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26912);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26913);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26914);base.toLocalDateTime((LocalTime) null); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26915);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToLocalDateTime_wrongChronologyLocalTime735() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bibg55kro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bibg55kro(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26916); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26917);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26918);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26919);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26920);base.toLocalDateTime(tod); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26921);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToLocalDateTime_LocalTime736() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppswpdkru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppswpdkru(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26922); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26923);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26924);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26925);LocalDateTime test = base.toLocalDateTime(tod); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26926);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26927);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26928);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTime_LocalTime737() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwiusfks1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwiusfks1(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26929); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26930);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26931);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26932);DateTime test = base.toDateTime(tod); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26933);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26934);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26935);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTime_LocalTime_nullZone738() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3aetqks8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3aetqks8(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26936); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26937);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26938);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26939);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26940);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26941);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26942);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToDateTime_wrongChronoLocalTime_Zone739() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l919u0ksf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l919u0ksf(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26943); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26944);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26945);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26946);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26947);base.toDateTime(tod, LONDON); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26948);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToInterval740() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnse60ksl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnse60ksl(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26949); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26950);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26951);Interval test = base.toInterval(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26952);check(base, 2005, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26953);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26954);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26955);Interval expected = new Interval(start, end); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26956);assertEquals(expected, test); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2741() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ygulgkst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ygulgkst(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26957); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26958);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26959);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26960);test.withField(null, 6); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26961);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3742() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157rekksy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157rekksy(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26962); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26963);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26964);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26965);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26966);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1743() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16b5k81kt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1743",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16b5k81kt3(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26967); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26968);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26969);LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26970);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26971);assertEquals(new LocalDate(2006, 6, 9), result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_2744() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vg1okt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vg1okt8(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26972); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26973);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26974);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26975);test.withFieldAdded(null, 0); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26976);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5745() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p26piektd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p26piektd(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26977); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26978);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26979);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26980);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(26981);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1746() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tt6qf3kti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1746",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tt6qf3kti(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26982); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26983);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26984);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26985);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26986);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testPlusYears_int747() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr0anbktn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int747",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr0anbktn(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26987); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26988);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26989);LocalDate result = test.plusYears(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26990);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26991);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26992);result = test.plusYears(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26993);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testPlusMonths_int748() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),26994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmjfe5ktu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int748",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmjfe5ktu(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(26994); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26995);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26996);LocalDate result = test.plusMonths(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26997);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26998);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(26999);result = test.plusMonths(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27000);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testPlusWeeks_int749() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbmzy8ku1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int749",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbmzy8ku1(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27001); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27002);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27003);LocalDate result = test.plusWeeks(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27004);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27005);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27006);result = test.plusWeeks(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27007);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testPlusDays_int750() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12q4yjeku8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int750",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12q4yjeku8(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27008); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27009);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27010);LocalDate result = test.plusDays(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27011);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27012);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27013);result = test.plusDays(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27014);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testMinus_RP751() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7fknvkuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP751",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7fknvkuf(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27015); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27016);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27017);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27018);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27019);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27020);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27021);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testMinusYears_int752() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lww53hkum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int752",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lww53hkum(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27022); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27023);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27024);LocalDate result = test.minusYears(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27025);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27026);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27027);result = test.minusYears(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27028);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testMinusMonths_int753() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fbnr9kut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fbnr9kut(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27029); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27030);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27031);LocalDate result = test.minusMonths(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27032);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27033);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27034);result = test.minusMonths(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27035);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testMinusWeeks_int754() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131kma4kv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131kma4kv0(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27036); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27037);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27038);LocalDate result = test.minusWeeks(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27039);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27040);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27041);result = test.minusWeeks(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27042);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testMinusDays_int755() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rk46vtkv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rk46vtkv7(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27043); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27044);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27045);LocalDate result = test.minusDays(1); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27046);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27047);assertEquals(expected, result); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27048);result = test.minusDays(0); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27049);assertSame(test, result); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testProperty756() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hh7ckve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hh7ckve(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27050); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27051);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27052);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27053);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27054);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27055);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27056);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27057);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27058);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27059);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27060);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27061);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27062);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27063);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27064);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27065);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27066);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27067);test.property(null); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27068);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testWithers757() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12fr6tukvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers757",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12fr6tukvx(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27069); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27070);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27071);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27072);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27073);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27074);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27075);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27076);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27077);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27078);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27079);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27080);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27081);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27082);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27083);test.withMonthOfYear(0); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27084);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27085);try { 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27086);test.withMonthOfYear(13); 
         __CLR4_4_1km7km7le6rjcjs.R.inc(27087);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 


public void testToString_String_Locale759() {__CLR4_4_1km7km7le6rjcjs.R.globalSliceStart(getClass().getName(),27088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j10volkwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1km7km7le6rjcjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1km7km7le6rjcjs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j10volkwg(){try{__CLR4_4_1km7km7le6rjcjs.R.inc(27088); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27089);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27090);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27091);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27092);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27093);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1km7km7le6rjcjs.R.inc(27094);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1km7km7le6rjcjs.R.inc(27095);
            __CLR4_4_1km7km7le6rjcjs.R.inc(27096);return COPTIC_UTC;
        }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1km7km7le6rjcjs.R.inc(27097);
            __CLR4_4_1km7km7le6rjcjs.R.inc(27098);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1km7km7le6rjcjs.R.inc(27099);
            __CLR4_4_1km7km7le6rjcjs.R.inc(27100);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1km7km7le6rjcjs.R.inc(27101);
        __CLR4_4_1km7km7le6rjcjs.R.inc(27102);assertEquals(hour, test.getYear());
        __CLR4_4_1km7km7le6rjcjs.R.inc(27103);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1km7km7le6rjcjs.R.inc(27104);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1km7km7le6rjcjs.R.flushNeeded();}}
}
