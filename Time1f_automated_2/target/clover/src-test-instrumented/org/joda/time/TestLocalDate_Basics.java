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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1i0wi0wle6nl8a9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23360);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23361);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23362);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23363);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1i0wi0wle6nl8a9.R.inc(23365);try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23364);
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23366);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23367);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23368);zone = DateTimeZone.getDefault();
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23369);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23370);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23371);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23372);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23373);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23374);DateTimeZone.setDefault(zone);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23375);zone = null;
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23376);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23377);systemDefaultLocale = null;
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetWeekyear100() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mxi7si1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPropertyGetWeekyear100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mxi7si1e(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23378); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23379);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23380);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23381);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23382);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23383);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23384);assertEquals(4, test.weekyear().get()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23385);assertEquals("4", test.weekyear().getAsString()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23386);assertEquals("4", test.weekyear().getAsText()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23387);assertEquals("4", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23388);assertEquals("4", test.weekyear().getAsShortText()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23389);assertEquals("4", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23390);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23391);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23392);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23393);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testPropertyGetEra206() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irbzt2i1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPropertyGetEra206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irbzt2i1u(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23394); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23395);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23396);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23397);assertEquals("era", test.era().getName()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23398);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23399);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23400);assertEquals(1, test.era().get()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23401);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23402);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23403);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23404);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23405);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23406);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23407);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23408);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23409);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23410);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23411);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23412);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23413);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23414);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23415);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testFactory_fromDateFields_before1970299() throws Exception {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1kwsyi2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testFactory_fromDateFields_before1970299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1kwsyi2g() throws Exception{try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23416); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23417);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23418);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23419);LocalDate expected = new LocalDate(1969, 2, 3); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23420);assertEquals(expected, LocalDate.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testGet_DateTimeFieldType301() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egool9i2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egool9i2l(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23421); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23422);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23423);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23424);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23425);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23426);assertEquals(160, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23427);assertEquals(2, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23428);assertEquals(2, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23429);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23430);assertEquals(70, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23431);assertEquals(20, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23432);assertEquals(1970, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23433);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23434);assertEquals(1970, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23435);try { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23436);test.get(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23437);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23438);try { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23439);test.get(null); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23440);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToDate_autumnDST302() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vzkz3i35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vzkz3i35(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23441); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23442);LocalDate base = new LocalDate(2007, 10, 2); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23443);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23444);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23445);try { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23446);TimeZone.setDefault(testZone); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23447);Date test = base.toDate(); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23448);check(base, 2007, 10, 2); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23449);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23450);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToDateTimeAtMidnight303() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8gfu6i3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8gfu6i3f(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23451); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23452);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23453);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23454);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23455);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToDateTimeAtMidnight_nullZone304() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3oewni3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight_nullZone304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3oewni3k(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23456); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23457);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23458);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23459);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23460);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToLocalDateTime_LocalTime305() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wh9aa5i3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wh9aa5i3p(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23461); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23462);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23463);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23464);LocalDateTime test = base.toLocalDateTime(tod); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23465);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23466);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23467);assertEquals(expected, test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToDateTime_LocalTime_nullZone306() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ourtdbi3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ourtdbi3w(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23468); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23469);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23470);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23471);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23472);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23473);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23474);assertEquals(expected, test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToInterval_DateTimeZone307() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7tv6bi43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_DateTimeZone307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7tv6bi43(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23475); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23476);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23477);Interval test = base.toInterval(LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23478);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23479);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23480);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23481);Interval expected = new Interval(start, end); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23482);assertEquals(expected, test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testToInterval_DateTimeAtStartOfDay308() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svwsmci4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_DateTimeAtStartOfDay308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svwsmci4b(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23483); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23484);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23485);Interval test = base.toInterval(LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23486);check(base, 2005, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23487);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23488);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23489);Interval expected = new Interval(start, end); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23490);assertEquals(expected, test); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_1309() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q42k7vi4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q42k7vi4j(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23491); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23492);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23493);LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23494);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23495);assertEquals(new LocalDate(2006, 6, 9), result); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_2310() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksipl2i4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksipl2i4o(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23496); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23497);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23498);try { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23499);test.withField(null, 0); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23500);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_2311() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ttnh4i4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ttnh4i4t(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23501); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23502);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23503);try { 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23504);test.withFieldAdded(null, 0); 
         __CLR4_4_1i0wi0wle6nl8a9.R.inc(23505);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testPlusWeeks_int312() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdfeagi4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdfeagi4y(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23506); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23507);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23508);LocalDate result = test.plusWeeks(1); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23509);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23510);assertEquals(expected, result); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23511);result = test.plusWeeks(0); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23512);assertSame(test, result); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testPlusDays_int313() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wa1uwni55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wa1uwni55(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23513); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23514);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23515);LocalDate result = test.plusDays(1); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23516);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23517);assertEquals(expected, result); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23518);result = test.plusDays(0); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23519);assertSame(test, result); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
public void testMinusMonths_int314() {__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceStart(getClass().getName(),23520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjvk9oi5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0wi0wle6nl8a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0wi0wle6nl8a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjvk9oi5c(){try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23520); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23521);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23522);LocalDate result = test.minusMonths(1); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23523);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23524);assertEquals(expected, result); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23525);result = test.minusMonths(0); 
     __CLR4_4_1i0wi0wle6nl8a9.R.inc(23526);assertSame(test, result); 
 }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23527);
            __CLR4_4_1i0wi0wle6nl8a9.R.inc(23528);return COPTIC_UTC;
        }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23529);
            __CLR4_4_1i0wi0wle6nl8a9.R.inc(23530);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23531);
            __CLR4_4_1i0wi0wle6nl8a9.R.inc(23532);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1i0wi0wle6nl8a9.R.inc(23533);
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23534);assertEquals(hour, test.getYear());
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23535);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1i0wi0wle6nl8a9.R.inc(23536);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1i0wi0wle6nl8a9.R.flushNeeded();}}
}
