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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1odyodyle6rjd4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31606);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31607);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31608);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31609);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1odyodyle6rjd4v.R.inc(31611);try{__CLR4_4_1odyodyle6rjd4v.R.inc(31610);
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31612);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31613);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31614);zone = DateTimeZone.getDefault();
        __CLR4_4_1odyodyle6rjd4v.R.inc(31615);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31616);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31617);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1odyodyle6rjd4v.R.inc(31618);DateTimeZone.setDefault(zone);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31619);zone = null;
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP9() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf6d0xoec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf6d0xoec(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31620); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31621);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31622);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31623);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31624);assertEquals(expected, result); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31625);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31626);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithFieldAdded310() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbb95xoej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbb95xoej(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31627); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31628);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31629);try { 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31630);test.withFieldAdded(null, 6); 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31631);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testToDateTime_RI11() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybtffvoeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybtffvoeo(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31632); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31633);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31634);DateTime dt = new DateTime(0L); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31635);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31636);DateTime test = base.toDateTime(dt); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31637);check(base, 10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31638);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31639);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testMinusMillis_int390() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mg4ozhoew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mg4ozhoew(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31640); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31641);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31642);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31643);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31644);assertEquals(expected, result); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31645);result = test.minusMillis(0); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31646);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testToDateTimeToday_Zone535() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1peftg4of3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1peftg4of3(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31647); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31648);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31649);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31650);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31651);DateTime test = base.toDateTimeToday(TOKYO); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31652);check(base, 10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31653);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31654);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31655);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31656);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31657);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31658);assertEquals(expected, test); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testGetField1147() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwrv40off();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField1147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwrv40off(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31659); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31660);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31661);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31662);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31663);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31664);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31665);try { 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31666);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31667);try { 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31668);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1155() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qudxizofp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qudxizofp(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31669); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31670);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31671);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31672);check(base, 10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31673);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31674);check(test, 10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31675);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testGetFieldTypes1156() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0xs8bofw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes1156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0xs8bofw(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31676); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31677);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31678);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31679);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31680);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31681);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31682);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31683);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1157() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ldppfog4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono1157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ldppfog4(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31684); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31685);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31686);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31687);assertSame(base, test); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithField11158() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1alz5ndog8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField11158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1alz5ndog8(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31688); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31689);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31690);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31691);assertEquals(new TimeOfDay(10, 20, 30, 40), test); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31692);assertEquals(new TimeOfDay(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithField41159() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w35axvogd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField41159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w35axvogd(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31693); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31694);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31695);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31696);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testMinusSeconds_int1160() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvaqaaogh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int1160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvaqaaogh(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31697); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31698);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31699);TimeOfDay result = test.minusSeconds(1); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31700);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31701);assertEquals(expected, result); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31702);result = test.minusSeconds(0); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31703);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testPlusSeconds_int1161() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6rwv9ogo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int1161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6rwv9ogo(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31704); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31705);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31706);TimeOfDay result = test.plusSeconds(1); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31707);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31708);assertEquals(expected, result); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31709);result = test.plusSeconds(0); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31710);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testPlusMillis_int1162() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qur35nogv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int1162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qur35nogv(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31711); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31712);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31713);TimeOfDay result = test.plusMillis(1); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31714);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31715);assertEquals(expected, result); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31716);result = test.plusMillis(0); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31717);assertSame(test, result); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testToDateTimeToday1163() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4k95voh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday1163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4k95voh2(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31718); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31719);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31720);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31721);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31722);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31723);check(base, 10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31724);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31725);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31726);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31727);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31728);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31729);assertEquals(expected, test); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testWithers1164() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j6zkjohe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers1164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j6zkjohe(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31730); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31731);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31732);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31733);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31734);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31735);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31736);try { 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31737);test.withHourOfDay(-1); 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31738);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31739);try { 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31740);test.withHourOfDay(24); 
         __CLR4_4_1odyodyle6rjd4v.R.inc(31741);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 


public void testToString_String1471() {__CLR4_4_1odyodyle6rjd4v.R.globalSliceStart(getClass().getName(),31742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxfncaohq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1odyodyle6rjd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1odyodyle6rjd4v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String1471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxfncaohq(){try{__CLR4_4_1odyodyle6rjd4v.R.inc(31742); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31743);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31744);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1odyodyle6rjd4v.R.inc(31745);assertEquals("T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31746);
            __CLR4_4_1odyodyle6rjd4v.R.inc(31747);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31748);
            __CLR4_4_1odyodyle6rjd4v.R.inc(31749);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31750);
            __CLR4_4_1odyodyle6rjd4v.R.inc(31751);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1odyodyle6rjd4v.R.inc(31752);
        __CLR4_4_1odyodyle6rjd4v.R.inc(31753);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1odyodyle6rjd4v.R.inc(31754);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1odyodyle6rjd4v.R.inc(31755);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1odyodyle6rjd4v.R.inc(31756);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1odyodyle6rjd4v.R.flushNeeded();}}
}
