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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1kyckycle6qsf08{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,27484,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1kyckycle6qsf08.R.inc(27156);
        __CLR4_4_1kyckycle6qsf08.R.inc(27157);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27158);
        __CLR4_4_1kyckycle6qsf08.R.inc(27159);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1kyckycle6qsf08.R.inc(27161);try{__CLR4_4_1kyckycle6qsf08.R.inc(27160);
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kyckycle6qsf08.R.inc(27162);
        __CLR4_4_1kyckycle6qsf08.R.inc(27163);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kyckycle6qsf08.R.inc(27164);zone = DateTimeZone.getDefault();
        __CLR4_4_1kyckycle6qsf08.R.inc(27165);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kyckycle6qsf08.R.inc(27166);
        __CLR4_4_1kyckycle6qsf08.R.inc(27167);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kyckycle6qsf08.R.inc(27168);DateTimeZone.setDefault(zone);
        __CLR4_4_1kyckycle6qsf08.R.inc(27169);zone = null;
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsEqual_LocalTime14() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmfzz9kyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmfzz9kyq(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27170); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27171);LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27172);LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27173);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27174);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27175);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27176);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27177);LocalTime test2 = new LocalTime(10, 20, 35, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27178);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27179);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27180);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27181);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27182);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27183);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27184);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27185);new LocalTime(10, 20, 35, 40).isEqual(null); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27186);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testToString_DTFormatter15() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bniltwkz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bniltwkz7(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27187); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27188);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27189);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27190);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testPlus_RP114() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nt833qkzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nt833qkzb(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27191); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27192);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27193);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27194);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27195);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27196);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27197);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithers953() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ety228kzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers953",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ety228kzi(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27198); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27199);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27200);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27201);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27202);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27203);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27204);check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27205);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27206);test.withHourOfDay(-1); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27207);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyckycle6qsf08.R.inc(27208);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27209);test.withHourOfDay(24); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27210);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testSerialization955() throws Exception {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6bhrykzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6bhrykzv() throws Exception{try{__CLR4_4_1kyckycle6qsf08.R.inc(27211); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27212);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27213);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27214);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27215);oos.writeObject(test); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27216);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27217);oos.close(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27218);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27219);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27220);LocalTime result = (LocalTime) ois.readObject(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27221);ois.close(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27222);assertEquals(test, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27223);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27224);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27225);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testGetField_int956() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpj4p1l0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int956",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpj4p1l0a(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27226); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27227);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27228);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27229);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27230);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27231);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27232);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27233);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kyckycle6qsf08.R.inc(27234);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27235);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testGetValue_int957() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xa6z1hl0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int957",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xa6z1hl0k(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27236); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27237);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27238);assertEquals(10, test.getValue(0)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27239);assertEquals(20, test.getValue(1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27240);assertEquals(30, test.getValue(2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27241);assertEquals(40, test.getValue(3)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27242);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27243);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kyckycle6qsf08.R.inc(27244);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27245);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testGet_DateTimeFieldType958() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxmpphl0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType958",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxmpphl0u(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27246); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27247);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27248);assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27249);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27250);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27251);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27252);assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27253);assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27254);assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27255);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27256);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27257);test = new LocalTime(12, 30); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27258);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27259);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27260);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27261);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27262);test = new LocalTime(14, 30); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27263);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27264);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27265);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27266);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27267);test = new LocalTime(0, 30); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27268);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27269);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27270);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27271);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27272);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27273);test.get(null); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyckycle6qsf08.R.inc(27275);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27276);test.get(DateTimeFieldType.dayOfMonth()); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27277);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType959() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xk288l1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType959",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xk288l1q(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27278); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27279);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27280);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27281);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27282);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27283);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27284);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27285);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27286);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27287);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27288);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27289);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27290);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27291);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27292);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27293);DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27294); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27295);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27296); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27297);return null; 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1kyckycle6qsf08.R.inc(27298); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27299);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
     }; 
     __CLR4_4_1kyckycle6qsf08.R.inc(27300);assertEquals(false, test.isSupported(d)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27301);d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27302); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27303);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27304); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27305);return DurationFieldType.years(); 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1kyckycle6qsf08.R.inc(27306); 
             __CLR4_4_1kyckycle6qsf08.R.inc(27307);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 
     }; 
     __CLR4_4_1kyckycle6qsf08.R.inc(27308);assertEquals(false, test.isSupported(d)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testProperty960() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zn79vl2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zn79vl2l(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27309); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27310);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27311);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27312);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27313);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27314);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27315);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27316);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27317);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27318);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27319);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27320);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27321);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27322);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27323);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27324);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27325);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyckycle6qsf08.R.inc(27326);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27327);test.property(null); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27328);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testEqualsHashCode961() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvvrg1l35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode961",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvvrg1l35(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27329); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27330);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27331);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27332);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27333);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27334);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27335);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27336);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27337);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27338);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27339);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27340);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27341);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27342);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27343);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27344);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27345);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27346);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27347);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27348);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27349);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27350);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1962() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pf95mql3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1962",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pf95mql3r(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27351); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27352);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27353);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27354);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27355);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2963() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbkjmql3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_2963",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbkjmql3w(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27356); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27357);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27358);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27359);test.withField(null, 6); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3964() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197vxmql41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3964",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197vxmql41(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27361); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27362);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27363);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27364);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27365);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5965() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3tpuil46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_5965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3tpuil46(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27366); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27367);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27368);try { 
         __CLR4_4_1kyckycle6qsf08.R.inc(27369);test.withFieldAdded(DurationFieldType.days(), 6); 
         __CLR4_4_1kyckycle6qsf08.R.inc(27370);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4966() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1si51fgl4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_4966",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1si51fgl4b(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27371); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27372);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27373);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27374);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testPlusHours_int967() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18y1gnml4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int967",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18y1gnml4f(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27375); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27376);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27377);LocalTime result = test.plusHours(1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27378);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27379);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27380);result = test.plusHours(0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27381);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testPlusMillis_int968() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ps6xfkl4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int968",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ps6xfkl4m(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27382); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27383);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27384);LocalTime result = test.plusMillis(1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27385);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27386);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27387);result = test.plusMillis(0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27388);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testMinus_RP969() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmgrtwl4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP969",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmgrtwl4t(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27389); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27390);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27391);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27392);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27393);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27394);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27395);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testMinusHours_int970() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16x67zsl50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16x67zsl50(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27396); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27397);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27398);LocalTime result = test.minusHours(1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27399);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27400);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27401);result = test.minusHours(0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27402);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testMinusMillis_int971() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oherhil57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int971",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oherhil57(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27403); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27404);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27405);LocalTime result = test.minusMillis(1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27406);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27407);assertEquals(expected, result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27408);result = test.minusMillis(0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27409);assertSame(test, result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testGetters972() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14og5yzl5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters972",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14og5yzl5e(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27410); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27411);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27412);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27413);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27414);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27415);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27416);assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testToDateTimeTodayDefaultZone976() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bob6dnl5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone976",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bob6dnl5l(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27417); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27418);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27419);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27420);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27421);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27422);check(base, 10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27423);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27424);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27425);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27426);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27427);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27428);assertEquals(expected, test); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testToDateTimeToday_nullZone977() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ulrdzl5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone977",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ulrdzl5x(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27429); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27430);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27431);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27432);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27433);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27434);check(base, 10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27435);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27436);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27437);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27438);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27439);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27440);assertEquals(expected, test); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testToString_String978() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4i7hrl69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String978",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4i7hrl69(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27441); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27442);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27443);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27444);assertEquals("10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testToString_String_Locale979() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw4iatl6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale979",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw4iatl6d(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27445); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27446);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27447);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27448);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27449);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27450);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_8987() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgmpt5l6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8987",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgmpt5l6j(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27451); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27452);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27453);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27454);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27455);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27456);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27457);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27458);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27459);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27460);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27461);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27462);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27463);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType988() {__CLR4_4_1kyckycle6qsf08.R.globalSliceStart(getClass().getName(),27464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163vrirl6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyckycle6qsf08.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyckycle6qsf08.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType988",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163vrirl6w(){try{__CLR4_4_1kyckycle6qsf08.R.inc(27464); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27465);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27466);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27467);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27468);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27469);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27470);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27471);assertEquals(false, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1kyckycle6qsf08.R.inc(27472);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27473);
            __CLR4_4_1kyckycle6qsf08.R.inc(27474);return COPTIC_UTC;
        }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27475);
            __CLR4_4_1kyckycle6qsf08.R.inc(27476);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kyckycle6qsf08.R.inc(27477);
            __CLR4_4_1kyckycle6qsf08.R.inc(27478);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1kyckycle6qsf08.R.inc(27479);
        __CLR4_4_1kyckycle6qsf08.R.inc(27480);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kyckycle6qsf08.R.inc(27481);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kyckycle6qsf08.R.inc(27482);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kyckycle6qsf08.R.inc(27483);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1kyckycle6qsf08.R.flushNeeded();}}
}
