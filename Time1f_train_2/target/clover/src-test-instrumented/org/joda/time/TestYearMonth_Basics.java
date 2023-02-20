/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1p1vp1vle6qsfch{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32625,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32467);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32468);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32469);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32470);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1p1vp1vle6qsfch.R.inc(32472);try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32471);
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32473);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32474);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32475);zone = DateTimeZone.getDefault();
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32476);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32477);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32478);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32479);DateTimeZone.setDefault(zone);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32480);zone = null;
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCompareTo10() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lylt04p29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lylt04p29(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32481); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32482);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32483);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32484);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32485);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32486);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32487);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32488);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32489);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32490);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32491);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32492);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32493);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32494);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32495);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32496);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32497);Partial p = new Partial(types, values); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32498);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32499);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32500);test1.compareTo(null); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32501);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32502);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32503);test1.compareTo(new LocalTime()); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32504);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32505);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32506);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32507);new YearMonth(1970, 6).compareTo(partial); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32508);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testIsAfter_YM12() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uasf0lp31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uasf0lp31(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32509); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32510);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32511);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32512);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32513);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32514);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32515);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32516);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32517);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32518);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32519);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32520);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32521);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32522);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32523);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32524);new YearMonth(2005, 7).isAfter(null); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32525);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testWithChronologyRetainFields_invalidInNewChrono329() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwxa5zp3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwxa5zp3i(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32526); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32527);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32528);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32529);base.withChronologyRetainFields(ISO_UTC); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32530);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testSerialization330() throws Exception {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0sxnrp3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0sxnrp3n() throws Exception{try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32531); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32532);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32533);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32534);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32535);oos.writeObject(test); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32536);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32537);oos.close(); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32538);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32539);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32540);YearMonth result = (YearMonth) ois.readObject(); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32541);ois.close(); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32542);assertEquals(test, result); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32543);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32544);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32545);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testGetField331() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lcn4sep42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lcn4sep42(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32546); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32547);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32548);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32549);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32550);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32551);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32552);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32553);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono332() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftek8xp4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftek8xp4a(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32554); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32555);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32556);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32557);assertSame(base, test); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testWithField_same333() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1583c2xp4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1583c2xp4e(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32558); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32559);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32560);YearMonth result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32561);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32562);assertSame(test, result); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testWithField334() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ndsxzp4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ndsxzp4j(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32563); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32564);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32565);YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32566);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32567);assertEquals(new YearMonth(2006, 6), result); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testMinusYears_int335() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ywrmcp4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ywrmcp4o(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32568); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32569);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32570);YearMonth result = test.minusYears(1); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32571);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32572);assertEquals(expected, result); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32573);result = test.minusYears(0); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32574);assertSame(test, result); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testMinusMonths_int336() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgh8ykp4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgh8ykp4v(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32575); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32576);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32577);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32578);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32579);assertEquals(expected, result); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32580);result = test.minusMonths(0); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32581);assertSame(test, result); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testWithers337() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkk768p52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkk768p52(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32582); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32583);YearMonth test = new YearMonth(1970, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32584);check(test.withYear(2000), 2000, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32585);check(test.withMonthOfYear(2), 1970, 2); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32586);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32587);test.withMonthOfYear(0); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32588);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32589);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32590);test.withMonthOfYear(13); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32591);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testProperty338() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoaf4op5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoaf4op5c(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32592); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32593);YearMonth test = new YearMonth(2005, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32594);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32595);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32596);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32597);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32598);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32599);try { 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32600);test.property(null); 
         __CLR4_4_1p1vp1vle6qsfch.R.inc(32601);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testToString340() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3lvsop5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3lvsop5m(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32602); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32603);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32604);assertEquals("2002-06", test.toString()); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testToString_String341() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxu2ijp5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxu2ijp5p(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32605); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32606);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32607);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32608);assertEquals("2002-06", test.toString((String) null)); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 


public void testToString_String_Locale342() {__CLR4_4_1p1vp1vle6qsfch.R.globalSliceStart(getClass().getName(),32609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182n9o1p5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p1vp1vle6qsfch.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p1vp1vle6qsfch.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182n9o1p5t(){try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32609); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32610);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32611);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32612);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32613);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32614);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1p1vp1vle6qsfch.R.inc(32615);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32616);
            __CLR4_4_1p1vp1vle6qsfch.R.inc(32617);return COPTIC_UTC;
        }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32618);
            __CLR4_4_1p1vp1vle6qsfch.R.inc(32619);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32620);
            __CLR4_4_1p1vp1vle6qsfch.R.inc(32621);return new int[] {1970, 6};
        }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}
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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p1vp1vle6qsfch.R.inc(32622);
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32623);assertEquals(year, test.getYear());
        __CLR4_4_1p1vp1vle6qsfch.R.inc(32624);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p1vp1vle6qsfch.R.flushNeeded();}}
}
