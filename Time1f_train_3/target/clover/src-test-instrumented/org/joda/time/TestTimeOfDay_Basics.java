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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1oa3oa3le6rcm3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31467);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31468);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31469);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31470);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1oa3oa3le6rcm3g.R.inc(31472);try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31471);
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31473);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31474);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31475);zone = DateTimeZone.getDefault();
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31476);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31477);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31478);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31479);DateTimeZone.setDefault(zone);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31480);zone = null;
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP9() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf6d0xoah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf6d0xoah(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31481); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31482);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31483);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31484);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31485);assertEquals(expected, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31486);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31487);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testToDateTime_RI10() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xganqsoao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xganqsoao(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31488); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31489);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31490);DateTime dt = new DateTime(0L); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31491);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31492);DateTime test = base.toDateTime(dt); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31493);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31494);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31495);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testSerialization495() throws Exception {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1youj8noaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSerialization495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1youj8noaw() throws Exception{try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31496); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31497);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31498);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31499);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31500);oos.writeObject(test); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31501);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31502);oos.close(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31503);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31504);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31505);TimeOfDay result = (TimeOfDay) ois.readObject(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31506);ois.close(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31507);assertEquals(test, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31508);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31509);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31510);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testToDateTimeToday_Zone541() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18oks2hobb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18oks2hobb(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31511); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31512);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31513);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31514);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31515);DateTime test = base.toDateTimeToday(TOKYO); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31516);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31517);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31518);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31519);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31520);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31521);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31522);assertEquals(expected, test); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testGetField1124() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2dildobn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2dildobn(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31523); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31524);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31525);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31526);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31527);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31528);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31529);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31530);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31531);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31532);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1132() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sosa1mobx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono1132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sosa1mobx(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31533); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31534);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31535);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31536);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31537);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31538);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31539);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testGetFieldTypes1133() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svc4qyoc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svc4qyoc4(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31540); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31541);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31542);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31543);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31544);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31545);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31546);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31547);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1134() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19fs282occ();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19fs282occ(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31548); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31549);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31550);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31551);assertSame(base, test); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithField31135() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6d98aocg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField31135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6d98aocg(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31552); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31553);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31554);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31555);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31556);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithField11136() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpdgyhocl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField11136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpdgyhocl(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31557); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31558);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31559);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31560);assertEquals(new TimeOfDay(10, 20, 30, 40), test); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31561);assertEquals(new TimeOfDay(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithField41137() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzqzmrocq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField41137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzqzmrocq(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31562); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31563);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31564);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31565);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testMinusSeconds_int1138() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqtsylocu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqtsylocu(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31566); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31567);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31568);TimeOfDay result = test.minusSeconds(1); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31569);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31570);assertEquals(expected, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31571);result = test.minusSeconds(0); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31572);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testMinus_RP1139() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16c6ocsod1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16c6ocsod1(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31573); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31574);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31575);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31576);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31577);assertEquals(expected, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31578);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31579);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testPlusMillis_int1140() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrcrujod8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrcrujod8(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31580); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31581);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31582);TimeOfDay result = test.plusMillis(1); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31583);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31584);assertEquals(expected, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31585);result = test.plusMillis(0); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31586);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testMinusMinutes_int1141() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133yxt7odf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int1141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133yxt7odf(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31587); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31588);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31589);TimeOfDay result = test.minusMinutes(1); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31590);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31591);assertEquals(expected, result); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31592);result = test.minusMinutes(0); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31593);assertSame(test, result); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testProperty1142() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3770sodm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty1142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3770sodm(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31594); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31595);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31596);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31597);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31598);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31599);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31600);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31601);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31602);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31603);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31604);test.property(null); 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31605);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testToLocalTime1143() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9t1dbody();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9t1dbody(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31606); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31607);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31608);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31609);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testToDateTimeToday1144() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ba61hcoe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday1144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ba61hcoe2(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31610); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31611);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31612);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31613);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31614);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31615);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31616);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31617);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31618);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31619);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31620);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31621);assertEquals(expected, test); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testWithers1145() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idl792oee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers1145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idl792oee(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31622); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31623);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31624);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31625);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31626);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31627);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31628);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31629);test.withHourOfDay(-1); 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31630);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31631);try { 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31632);test.withHourOfDay(24); 
         __CLR4_4_1oa3oa3le6rcm3g.R.inc(31633);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 


public void testToString1149() {__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceStart(getClass().getName(),31634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u37rkmoeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa3oa3le6rcm3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa3oa3le6rcm3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u37rkmoeq(){try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31634); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31635);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oa3oa3le6rcm3g.R.inc(31636);assertEquals("T10:20:30.040", test.toString()); 
 }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31637);
            __CLR4_4_1oa3oa3le6rcm3g.R.inc(31638);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31639);
            __CLR4_4_1oa3oa3le6rcm3g.R.inc(31640);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31641);
            __CLR4_4_1oa3oa3le6rcm3g.R.inc(31642);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1oa3oa3le6rcm3g.R.inc(31643);
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31644);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31645);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31646);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1oa3oa3le6rcm3g.R.inc(31647);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1oa3oa3le6rcm3g.R.flushNeeded();}}
}
