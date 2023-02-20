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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1oeooeole6qea6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31809,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oeooeole6qea6m.R.inc(31632);
        __CLR4_4_1oeooeole6qea6m.R.inc(31633);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oeooeole6qea6m.R.inc(31634);
        __CLR4_4_1oeooeole6qea6m.R.inc(31635);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1oeooeole6qea6m.R.inc(31637);try{__CLR4_4_1oeooeole6qea6m.R.inc(31636);
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oeooeole6qea6m.R.inc(31638);
        __CLR4_4_1oeooeole6qea6m.R.inc(31639);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oeooeole6qea6m.R.inc(31640);zone = DateTimeZone.getDefault();
        __CLR4_4_1oeooeole6qea6m.R.inc(31641);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oeooeole6qea6m.R.inc(31642);
        __CLR4_4_1oeooeole6qea6m.R.inc(31643);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oeooeole6qea6m.R.inc(31644);DateTimeZone.setDefault(zone);
        __CLR4_4_1oeooeole6qea6m.R.inc(31645);zone = null;
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithFieldAdded311() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2badgof2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2badgof2(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31646); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31647);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31648);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31649);test.withFieldAdded(null, 6); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31650);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testToDateTime_RI12() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2tgneof7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2tgneof7(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31651); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31652);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31653);DateTime dt = new DateTime(0L); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31654);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31655);DateTime test = base.toDateTime(dt); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31656);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31657);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31658);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testMinusMillis_int386() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c89l6soff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c89l6soff(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31659); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31660);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31661);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31662);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31663);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31664);result = test.minusMillis(0); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31665);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testSerialization483() throws Exception {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14eom0ofm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSerialization483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14eom0ofm() throws Exception{try{__CLR4_4_1oeooeole6qea6m.R.inc(31666); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31667);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31668);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31669);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31670);oos.writeObject(test); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31671);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31672);oos.close(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31673);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31674);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31675);TimeOfDay result = (TimeOfDay) ois.readObject(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31676);ois.close(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31677);assertEquals(test, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31678);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31679);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31680);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testGetField1134() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nhdy6og1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nhdy6og1(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31681); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31682);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31683);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31684);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31685);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31686);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31687);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31688);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1oeooeole6qea6m.R.inc(31689);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31690);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1142() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmgvdzogb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono1142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmgvdzogb(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31691); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31692);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31693);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31694);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31695);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31696);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31697);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testGetFieldTypes1143() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfx0onogi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfx0onogi(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31698); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31699);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31700);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31701);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31702);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31703);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31704);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31705);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testWithField31144() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdvuzsogq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField31144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdvuzsogq(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31706); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31707);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31708);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31709);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31710);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testWithField11145() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suvn9logv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField11145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suvn9logv(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31711); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31712);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31713);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31714);assertEquals(new TimeOfDay(10, 20, 30, 40), test); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31715);assertEquals(new TimeOfDay(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testMinusSeconds_int1146() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2fa1yoh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int1146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2fa1yoh0(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31716); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31717);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31718);TimeOfDay result = test.minusSeconds(1); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31719);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31720);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31721);result = test.minusSeconds(0); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31722);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testMinus_RP1147() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tk1nbdoh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP1147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tk1nbdoh7(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31723); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31724);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31725);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31726);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31727);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31728);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31729);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testPlusSeconds_int1148() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhy4oiohe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int1148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhy4oiohe(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31730); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31731);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31732);TimeOfDay result = test.plusSeconds(1); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31733);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31734);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31735);result = test.plusSeconds(0); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31736);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testPlusMillis_int1149() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hmx9qohl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hmx9qohl(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31737); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31738);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31739);TimeOfDay result = test.plusMillis(1); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31740);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31741);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31742);result = test.plusMillis(0); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31743);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testMinusMinutes_int1150() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncvzxvohs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int1150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncvzxvohs(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31744); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31745);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31746);TimeOfDay result = test.minusMinutes(1); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31747);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31748);assertEquals(expected, result); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31749);result = test.minusMinutes(0); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31750);assertSame(test, result); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testProperty1151() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19h1x7aohz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19h1x7aohz(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31751); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31752);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31753);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31754);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31755);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31756);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31757);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31758);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31759);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oeooeole6qea6m.R.inc(31760);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31761);test.property(null); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31762);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testToLocalTime1152() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1171wdroib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime1152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1171wdroib(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31763); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31764);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31765);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31766);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testToDateTimeToday1153() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6ow9qoif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday1153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6ow9qoif(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31767); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31768);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31769);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31770);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31771);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31772);check(base, 10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31773);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31774);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31775);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31776);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31777);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31778);assertEquals(expected, test); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testWithers1154() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6nwz0oir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers1154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6nwz0oir(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31779); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31780);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31781);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31782);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31783);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31784);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31785);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31786);test.withHourOfDay(-1); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31787);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oeooeole6qea6m.R.inc(31788);try { 
         __CLR4_4_1oeooeole6qea6m.R.inc(31789);test.withHourOfDay(24); 
         __CLR4_4_1oeooeole6qea6m.R.inc(31790);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testToString1158() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mcttkoj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString1158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mcttkoj3(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31791); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31792);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31793);assertEquals("T10:20:30.040", test.toString()); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 


public void testToString_String1470() {__CLR4_4_1oeooeole6qea6m.R.globalSliceStart(getClass().getName(),31794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6fm4roj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oeooeole6qea6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oeooeole6qea6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String1470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6fm4roj6(){try{__CLR4_4_1oeooeole6qea6m.R.inc(31794); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31795);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31796);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1oeooeole6qea6m.R.inc(31797);assertEquals("T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1oeooeole6qea6m.R.inc(31798);
            __CLR4_4_1oeooeole6qea6m.R.inc(31799);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1oeooeole6qea6m.R.inc(31800);
            __CLR4_4_1oeooeole6qea6m.R.inc(31801);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1oeooeole6qea6m.R.inc(31802);
            __CLR4_4_1oeooeole6qea6m.R.inc(31803);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1oeooeole6qea6m.R.inc(31804);
        __CLR4_4_1oeooeole6qea6m.R.inc(31805);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1oeooeole6qea6m.R.inc(31806);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1oeooeole6qea6m.R.inc(31807);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1oeooeole6qea6m.R.inc(31808);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1oeooeole6qea6m.R.flushNeeded();}}
}
