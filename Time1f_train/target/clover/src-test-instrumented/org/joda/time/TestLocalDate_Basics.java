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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1l6dl6dlc8axe00{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,27862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27445);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27446);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27447);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27448);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1l6dl6dlc8axe00.R.inc(27450);try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27449);
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27451);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27452);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27453);zone = DateTimeZone.getDefault();
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27454);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27455);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27456);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27457);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27458);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27459);DateTimeZone.setDefault(zone);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27460);zone = null;
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27461);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27462);systemDefaultLocale = null;
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithFieldAdded_DurationFieldType_int_14() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1at1zvel6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1at1zvel6v(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27463); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27464);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27465);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27466);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27467);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTimeAtStartOfDay5() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1276fjyl70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1276fjyl70(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27468); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27469);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27470);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27471);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27472);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testSerialization9() throws Exception {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dljzq6l75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dljzq6l75() throws Exception{try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27473); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27474);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27475);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27476);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27477);oos.writeObject(test); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27478);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27479);oos.close(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27480);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27481);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27482);LocalDate result = (LocalDate) ois.readObject(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27483);ois.close(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27484);assertEquals(test, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27485);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27486);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27487);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testPlus_RP38() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4ls59l7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4ls59l7k(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27488); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27489);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27490);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27491);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27492);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27493);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27494);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testPlusWeeks_int64() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hvlygl7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int64",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hvlygl7r(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27495); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27496);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27497);LocalDate result = test.plusWeeks(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27498);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27499);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27500);result = test.plusWeeks(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27501);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testMinus_RP100() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8hcahl7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8hcahl7y(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27502); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27503);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27504);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27505);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27506);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27507);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27508);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToString_DTFormatter105() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ix9svwl85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ix9svwl85(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27509); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27510);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27511);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27512);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToInterval_Zone117() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6hs4ll89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6hs4ll89(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27513); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27514);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27515);Interval test = base.toInterval(TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27516);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27517);DateTime start = base.toDateTimeAtStartOfDay(TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27518);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27519);Interval expected = new Interval(start, end); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27520);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testMinusDays_int150() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o48i3yl8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o48i3yl8h(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27521); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27522);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27523);LocalDate result = test.minusDays(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27524);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27525);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27526);result = test.minusDays(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27527);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testPlusYears_int208() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1761uftl8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1761uftl8o(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27528); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27529);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27530);LocalDate result = test.plusYears(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27531);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27532);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27533);result = test.plusYears(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27534);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithers269() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lp8kpel8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lp8kpel8v(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27535); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27536);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27537);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27538);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27539);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27540);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27541);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27542);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27543);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27544);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27545);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27546);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27547);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27548);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27549);test.withMonthOfYear(0); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27550);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27551);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27552);test.withMonthOfYear(13); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27553);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testGet_DateTimeFieldType343() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1283vlxl9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1283vlxl9e(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27554); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27555);LocalDate test = new LocalDate(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27556);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27557);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27558);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27559);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27560);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27561);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27562);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27563);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27564);test.get(null); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27565);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27566);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27567);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27568);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToString_String392() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125roynl9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125roynl9t(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27569); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27570);LocalDate test = new LocalDate(2002, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27571);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27572);assertEquals("2002-06-09", test.toString((String) null)); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDate_autumnDST410() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f70p4fl9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f70p4fl9x(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27573); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27574);LocalDate base = new LocalDate(2007, 10, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27575);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27576);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27577);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27578);TimeZone.setDefault(testZone); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27579);Date test = base.toDate(); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27580);check(base, 2007, 10, 2); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27581);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27582);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testGetters414() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nr43dkla7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nr43dkla7(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27583); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27584);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27585);assertEquals(1970, test.getYear()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27586);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27587);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27588);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27589);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27590);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27591);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27592);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27593);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27594);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27595);assertEquals(DateTimeConstants.AD, test.getEra()); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1418() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11s2bbwlak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11s2bbwlak(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27596); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27597);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27598);LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27599);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27600);assertEquals(new LocalDate(2006, 6, 9), result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testMinusMonths_int424() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fw8a10lap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fw8a10lap(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27601); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27602);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27603);LocalDate result = test.minusMonths(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27604);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27605);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27606);result = test.minusMonths(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27607);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType464() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135s2iulaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135s2iulaw(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27608); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27609);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27610);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27611);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27612);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27613);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27614);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27615);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27616);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27617);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27618);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testProperty535() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnl513lb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnl513lb7(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27619); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27620);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27621);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27622);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27623);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27624);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27625);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27626);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27627);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27628);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27629);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27630);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27631);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27632);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27633);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27634);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27635);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27636);test.property(null); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27637);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testIsEqual_LocalDate553() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n13xzslbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n13xzslbq(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27638); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27639);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27640);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27641);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27642);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27643);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27644);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27645);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27646);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27647);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27648);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27649);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27650);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27651);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27652);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27653);new LocalDate(2005, 7, 2).isEqual(null); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27654);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateTimeAtMidnight615() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekubp2lc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekubp2lc7(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27655); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27656);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27657);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27658);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27659);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDate_springDST_2Hour40Savings618() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152ayhalcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152ayhalcc(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27660); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27661);LocalDate base = new LocalDate(2007, 4, 2); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27662);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27663);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27664);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27665);TimeZone.setDefault(testZone); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27666);Date test = base.toDate(); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27667);check(base, 2007, 4, 2); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27668);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27669);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testGetValues650() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccpcyalcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccpcyalcm(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27670); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27671);LocalDate test = new LocalDate(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27672);int[] values = test.getValues(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27673);assertEquals(1970, values[0]); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27674);assertEquals(6, values[1]); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27675);assertEquals(9, values[2]); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27676);assertNotSame(test.getValues(), test.getValues()); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5671() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsv85qlct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsv85qlct(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27677); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27678);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27679);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27680);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27681);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testMinusWeeks_int695() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erd7uglcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erd7uglcy(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27682); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27683);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27684);LocalDate result = test.minusWeeks(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27685);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27686);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27687);result = test.minusWeeks(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27688);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3753() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x42mqkld5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x42mqkld5(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27689); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27690);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27691);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27692);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27693);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testEqualsHashCodeStrict773() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1okeiqjlda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict773",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1okeiqjlda(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27694); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27695);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27696);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27697);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27698);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27699);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27700);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27701);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27702);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27703);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTime_LocalTime859() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4ruymldk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4ruymldk(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27704); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27705);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27706);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27707);DateTime test = base.toDateTime(tod); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27708);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27709);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27710);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime878() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dwcq3ldr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime878",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dwcq3ldr(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27711); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27712);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27713);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27714);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27715);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27716);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27717);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27718);expected = expected.year().setCopy(2005); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27719);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27720);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27721);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testGetFieldType_int1048() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125szaule2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int1048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125szaule2(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27722); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27723);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27724);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27725);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27726);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27727);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27728);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27729);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27730);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTime_LocalTime_nullZone1056() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ixljsleb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ixljsleb(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27731); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27732);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27733);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27734);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27735);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27736);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27737);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_21174() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8niarlei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_21174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8niarlei(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27738); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27739);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27740);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27741);test.withField(null, 6); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27742);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight1182() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceygx8len();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight1182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceygx8len(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27743); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27744);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27745);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27746);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27747);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToString_String_Locale1194() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172w815les();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale1194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172w815les(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27748); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27749);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27750);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27751);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27752);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27753);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27754);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_21225() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1xzw3lez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_21225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1xzw3lez(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27755); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27756);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27757);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27758);test.withFieldAdded(null, 0); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27759);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToLocalDateTime_wrongChronologyLocalTime1238() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqtknulf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqtknulf4(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27760); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27761);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27762);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27763);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27764);base.toLocalDateTime(tod); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27765);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testPlusDays_int1252() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4t5zslfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int1252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4t5zslfa(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27766); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27767);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27768);LocalDate result = test.plusDays(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27769);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27770);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27771);result = test.plusDays(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27772);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testPlusMonths_int1256() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfl0p4lfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int1256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfl0p4lfh(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27773); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27774);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27775);LocalDate result = test.plusMonths(1); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27776);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27777);assertEquals(expected, result); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27778);result = test.plusMonths(0); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27779);assertSame(test, result); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTime_nullRI1270() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybnfzelfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI1270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybnfzelfo(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27780); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27781);LocalDate base = new LocalDate(2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27782);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27783);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27784);DateTime test = base.toDateTime((ReadableInstant) null); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27785);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27786);DateTime expected = dt; 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27787);expected = expected.year().setCopy(2005); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27788);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27789);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27790);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1276() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su0hkdlfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType1276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su0hkdlfz(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27791); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27792);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27793);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27794);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27795);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27796);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27797);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27798);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27799);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27800);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27801);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27802);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27803);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27804);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27805);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27806);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToInterval1281() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuuuodlgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval1281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuuuodlgf(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27807); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27808);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27809);Interval test = base.toInterval(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27810);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27811);DateTime start = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27812);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27813);Interval expected = new Interval(start, end); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27814);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToLocalDateTime_LocalTime1357() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo69c3lgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime1357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo69c3lgn(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27815); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27816);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27817);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27818);LocalDateTime test = base.toLocalDateTime(tod); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27819);check(base, 2005, 6, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27820);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27821);assertEquals(expected, test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testGetValue_int1471() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utuucflgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int1471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utuucflgu(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27822); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27823);LocalDate test = new LocalDate(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27824);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27825);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27826);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27827);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27828);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27829);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27830);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToLocalDateTime_nullLocalTime1601() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13by2eglh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime1601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13by2eglh3(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27831); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27832);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27833);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27834);base.toLocalDateTime((LocalTime) null); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27835);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDate_winter1665() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddkm6slh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter1665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddkm6slh8(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27836); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27837);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27838);Date test = base.toDate(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27839);check(base, 2005, 1, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27840);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27841);gcal.clear(); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27842);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27843);gcal.set(Calendar.MONTH, Calendar.JANUARY); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27844);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27845);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 


public void testToDateTime_wrongChronoLocalTime_Zone1763() {__CLR4_4_1l6dl6dlc8axe00.R.globalSliceStart(getClass().getName(),27846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8m20alhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6dl6dlc8axe00.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6dl6dlc8axe00.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone1763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8m20alhi(){try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27846); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27847);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27848);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1l6dl6dlc8axe00.R.inc(27849);try { 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27850);base.toDateTime(tod, LONDON); 
         __CLR4_4_1l6dl6dlc8axe00.R.inc(27851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27852);
            __CLR4_4_1l6dl6dlc8axe00.R.inc(27853);return COPTIC_UTC;
        }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27854);
            __CLR4_4_1l6dl6dlc8axe00.R.inc(27855);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27856);
            __CLR4_4_1l6dl6dlc8axe00.R.inc(27857);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1l6dl6dlc8axe00.R.inc(27858);
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27859);assertEquals(hour, test.getYear());
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27860);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1l6dl6dlc8axe00.R.inc(27861);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1l6dl6dlc8axe00.R.flushNeeded();}}
}
