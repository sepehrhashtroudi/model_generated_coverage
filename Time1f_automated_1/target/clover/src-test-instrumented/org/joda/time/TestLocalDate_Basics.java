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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1ifpifple6ndpky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24063,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ifpifple6ndpky.R.inc(23893);
        __CLR4_4_1ifpifple6ndpky.R.inc(23894);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ifpifple6ndpky.R.inc(23895);
        __CLR4_4_1ifpifple6ndpky.R.inc(23896);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1ifpifple6ndpky.R.inc(23898);try{__CLR4_4_1ifpifple6ndpky.R.inc(23897);
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ifpifple6ndpky.R.inc(23899);
        __CLR4_4_1ifpifple6ndpky.R.inc(23900);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ifpifple6ndpky.R.inc(23901);zone = DateTimeZone.getDefault();
        __CLR4_4_1ifpifple6ndpky.R.inc(23902);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ifpifple6ndpky.R.inc(23903);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ifpifple6ndpky.R.inc(23904);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ifpifple6ndpky.R.inc(23905);
        __CLR4_4_1ifpifple6ndpky.R.inc(23906);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ifpifple6ndpky.R.inc(23907);DateTimeZone.setDefault(zone);
        __CLR4_4_1ifpifple6ndpky.R.inc(23908);zone = null;
        __CLR4_4_1ifpifple6ndpky.R.inc(23909);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ifpifple6ndpky.R.inc(23910);systemDefaultLocale = null;
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_LocalDate_toDateMidnight_Gaza291() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i298u5ig7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.test_LocalDate_toDateMidnight_Gaza291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i298u5ig7(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23911); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23912);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23913);try { 
         __CLR4_4_1ifpifple6ndpky.R.inc(23914);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1ifpifple6ndpky.R.inc(23915);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1ifpifple6ndpky.R.inc(23916);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testPropertyGetDay292() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lv3rdxigd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPropertyGetDay292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lv3rdxigd(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23917); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23918);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23919);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23920);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23921);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23922);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23923);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23924);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23925);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23926);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23927);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23928);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23929);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23930);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23931);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23932);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToDateTimeAtStartOfDay293() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zudmdigt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zudmdigt(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23933); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23934);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23935);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23936);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23937);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23938);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23939);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23940);expected = expected.year().setCopy(2005); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23941);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23942);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23943);assertEquals(expected, test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToDateTimeAtStartOfDay294() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8uceuih4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8uceuih4(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23944); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23945);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23946);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23947);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23948);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToDateTimeAtStartOfDay_nullZone295() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sspp4xih9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_nullZone295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sspp4xih9(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23949); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23950);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23951);DateTime test = base.toDateTimeAtStartOfDay((DateTimeZone) null); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23952);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23953);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToDateTimeAtCurrentTime296() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bo6e0lihe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bo6e0lihe(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23954); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23955);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23956);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23957);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23958);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23959);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23960);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23961);expected = expected.year().setCopy(2005); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23962);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23963);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23964);assertEquals(expected, test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testToDateMidnight297() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tquap8ihp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tquap8ihp(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23965); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23966);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23967);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23968);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23969);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToLocalDateTime_nullLocalTime298() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9chn7ihu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9chn7ihu(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23970); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23971);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23972);try { 
         __CLR4_4_1ifpifple6ndpky.R.inc(23973);base.toLocalDateTime((LocalTime) null); 
         __CLR4_4_1ifpifple6ndpky.R.inc(23974);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToDateTime_LocalTime299() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tinuewihz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tinuewihz(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23975); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23976);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23977);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23978);DateTime test = base.toDateTime(tod); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23979);check(base, 2005, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23980);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, BUDDHIST_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23981);assertEquals(expected, test); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1301() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqpw9yii6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqpw9yii6(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23982); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23983);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23984);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23985);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23986);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_2302() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hn1a9yiib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hn1a9yiib(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23987); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23988);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23989);try { 
         __CLR4_4_1ifpifple6ndpky.R.inc(23990);test.withFieldAdded(null, 0); 
         __CLR4_4_1ifpifple6ndpky.R.inc(23991);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testPlusMonths_int303() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12unzvyiig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12unzvyiig(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23992); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23993);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23994);LocalDate result = test.plusMonths(1); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23995);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23996);assertEquals(expected, result); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23997);result = test.plusMonths(0); 
     __CLR4_4_1ifpifple6ndpky.R.inc(23998);assertSame(test, result); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testMinusYears_int304() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),23999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dejutmiin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dejutmiin(){try{__CLR4_4_1ifpifple6ndpky.R.inc(23999); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24000);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24001);LocalDate result = test.minusYears(1); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24002);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24003);assertEquals(expected, result); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24004);result = test.minusYears(0); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24005);assertSame(test, result); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testGetValues305() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),24006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh6uqhiiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh6uqhiiu(){try{__CLR4_4_1ifpifple6ndpky.R.inc(24006); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24007);LocalDate test = new LocalDate(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24008);int[] values = test.getValues(); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24009);assertEquals(1970, values[0]); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24010);assertEquals(6, values[1]); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24011);assertEquals(9, values[2]); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24012);assertNotSame(test.getValues(), test.getValues()); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testWithers307() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),24013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g3jirij1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g3jirij1(){try{__CLR4_4_1ifpifple6ndpky.R.inc(24013); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24014);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24015);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24016);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24017);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24018);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24019);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24020);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24021);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24022);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24023);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24024);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24025);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24026);try { 
         __CLR4_4_1ifpifple6ndpky.R.inc(24027);test.withMonthOfYear(0); 
         __CLR4_4_1ifpifple6ndpky.R.inc(24028);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ifpifple6ndpky.R.inc(24029);try { 
         __CLR4_4_1ifpifple6ndpky.R.inc(24030);test.withMonthOfYear(13); 
         __CLR4_4_1ifpifple6ndpky.R.inc(24031);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToString_String_Locale308() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),24032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9ohs5ijk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9ohs5ijk(){try{__CLR4_4_1ifpifple6ndpky.R.inc(24032); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24033);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24034);assertEquals("2002 \ufffd\ufffd", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24035);assertEquals("2002-06-09", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24036);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24037);assertEquals("2002-06-09", test.toString("EEE d/M", null)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24038);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToString_String_Locale309() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),24039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0oizoijr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0oizoijr(){try{__CLR4_4_1ifpifple6ndpky.R.inc(24039); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24040);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24041);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24042);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24043);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24044);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24045);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
public void testToString_String_Locale548() {__CLR4_4_1ifpifple6ndpky.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naxoopijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifpifple6ndpky.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifpifple6ndpky.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naxoopijy(){try{__CLR4_4_1ifpifple6ndpky.R.inc(24046); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24047);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24048);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24049);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24050);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24051);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1ifpifple6ndpky.R.inc(24052);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ifpifple6ndpky.R.inc(24053);
            __CLR4_4_1ifpifple6ndpky.R.inc(24054);return COPTIC_UTC;
        }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ifpifple6ndpky.R.inc(24055);
            __CLR4_4_1ifpifple6ndpky.R.inc(24056);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ifpifple6ndpky.R.inc(24057);
            __CLR4_4_1ifpifple6ndpky.R.inc(24058);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1ifpifple6ndpky.R.inc(24059);
        __CLR4_4_1ifpifple6ndpky.R.inc(24060);assertEquals(hour, test.getYear());
        __CLR4_4_1ifpifple6ndpky.R.inc(24061);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1ifpifple6ndpky.R.inc(24062);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1ifpifple6ndpky.R.flushNeeded();}}
}
