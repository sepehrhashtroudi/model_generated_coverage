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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1obxobxle6qsfaq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31700,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31533);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31534);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31535);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31536);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1obxobxle6qsfaq.R.inc(31538);try{__CLR4_4_1obxobxle6qsfaq.R.inc(31537);
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31539);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31540);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31541);zone = DateTimeZone.getDefault();
        __CLR4_4_1obxobxle6qsfaq.R.inc(31542);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31543);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31544);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1obxobxle6qsfaq.R.inc(31545);DateTimeZone.setDefault(zone);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31546);zone = null;
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_RP5() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of686tocb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of686tocb(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31547); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31548);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31549);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31550);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31551);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31552);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31553);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testWithFieldAdded36() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtetoooci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtetoooci(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31554); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31555);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31556);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31557);test.withFieldAdded(null, 6); 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31558);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testMinusMillis_int359() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ustwqocn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ustwqocn(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31559); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31560);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31561);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31562);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31563);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31564);result = test.minusMillis(0); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31565);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testSerialization458() throws Exception {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r2534ocu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSerialization458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r2534ocu() throws Exception{try{__CLR4_4_1obxobxle6qsfaq.R.inc(31566); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31567);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31568);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31569);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31570);oos.writeObject(test); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31571);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31572);oos.close(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31573);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31574);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31575);TimeOfDay result = (TimeOfDay) ois.readObject(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31576);ois.close(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31577);assertEquals(test, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31578);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31579);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31580);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testToDateTimeToday_Zone502() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hr7oi4od9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hr7oi4od9(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31581); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31582);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31583);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31584);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31585);DateTime test = base.toDateTimeToday(TOKYO); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31586);check(base, 10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31587);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31588);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31589);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31590);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31591);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31592);assertEquals(expected, test); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testGetField1126() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkdl0fodl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField1126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkdl0fodl(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31593); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31594);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31595);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31596);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31597);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31598);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31599);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31600);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31601);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31602);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1132() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sosa1modv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono1132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sosa1modv(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31603); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31604);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31605);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31606);check(base, 10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31607);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31608);check(test, 10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31609);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testGetFieldTypes1133() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svc4qyoe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svc4qyoe2(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31610); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31611);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31612);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31613);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31614);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31615);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31616);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31617);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1134() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19fs282oea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19fs282oea(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31618); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31619);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31620);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31621);assertSame(base, test); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testWithField31135() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6d98aoee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField31135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6d98aoee(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31622); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31623);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31624);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31625);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31626);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testWithField41136() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8qyf8oej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField41136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8qyf8oej(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31627); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31628);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31629);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31630);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testMinusSeconds_int1137() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhtu64oen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int1137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhtu64oen(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31631); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31632);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31633);TimeOfDay result = test.minusSeconds(1); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31634);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31635);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31636);result = test.minusSeconds(0); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31637);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testMinus_RP1138() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1336pkboeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1336pkboeu(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31638); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31639);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31640);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31641);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31642);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31643);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31644);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testPlusSeconds_int1139() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2azjkof1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2azjkof1(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31645); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31646);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31647);TimeOfDay result = test.plusSeconds(1); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31648);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31649);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31650);result = test.plusSeconds(0); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31651);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testPlusMillis_int1140() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrcrujof8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrcrujof8(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31652); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31653);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31654);TimeOfDay result = test.plusMillis(1); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31655);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31656);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31657);result = test.plusMillis(0); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31658);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testMinusMinutes_int1141() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133yxt7off();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int1141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133yxt7off(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31659); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31660);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31661);TimeOfDay result = test.minusMinutes(1); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31662);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31663);assertEquals(expected, result); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31664);result = test.minusMinutes(0); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31665);assertSame(test, result); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testProperty1142() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3770sofm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty1142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3770sofm(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31666); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31667);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31668);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31669);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31670);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31671);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31672);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31673);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31674);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31675);try { 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31676);test.property(null); 
         __CLR4_4_1obxobxle6qsfaq.R.inc(31677);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testToLocalTime1143() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9t1dbofy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9t1dbofy(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31678); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31679);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31680);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31681);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testToString1146() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6we13og2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString1146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6we13og2(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31682); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31683);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31684);assertEquals("T10:20:30.040", test.toString()); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 


public void testToString_String1470() {__CLR4_4_1obxobxle6qsfaq.R.globalSliceStart(getClass().getName(),31685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6fm4rog5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obxobxle6qsfaq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obxobxle6qsfaq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String1470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6fm4rog5(){try{__CLR4_4_1obxobxle6qsfaq.R.inc(31685); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31686);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31687);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1obxobxle6qsfaq.R.inc(31688);assertEquals("T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31689);
            __CLR4_4_1obxobxle6qsfaq.R.inc(31690);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31691);
            __CLR4_4_1obxobxle6qsfaq.R.inc(31692);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31693);
            __CLR4_4_1obxobxle6qsfaq.R.inc(31694);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1obxobxle6qsfaq.R.inc(31695);
        __CLR4_4_1obxobxle6qsfaq.R.inc(31696);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1obxobxle6qsfaq.R.inc(31697);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1obxobxle6qsfaq.R.inc(31698);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1obxobxle6qsfaq.R.inc(31699);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1obxobxle6qsfaq.R.flushNeeded();}}
}
