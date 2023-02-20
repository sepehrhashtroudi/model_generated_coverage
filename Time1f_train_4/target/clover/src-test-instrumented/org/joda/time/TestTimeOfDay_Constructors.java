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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1oi5oi5le6rjd58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31757);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31758);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31759);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31760);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1oi5oi5le6rjd58.R.inc(31762);try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31761);
    }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31763);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31764);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31765);zone = DateTimeZone.getDefault();
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31766);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31767);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31768);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31769);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31770);DateTimeZone.setDefault(zone);
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31771);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1oi5oi5le6rjd58.R.inc(31772);zone = null;
    }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString21142() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgnos0oil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString21142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgnos0oil() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31773); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31774);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00"); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31775);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31776);assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31777);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31778);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31779);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testFactory_FromCalendarFields1143() throws Exception {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdxj02ois();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdxj02ois() throws Exception{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31780); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31781);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31782);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31783);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31784);assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31785);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31786);TimeOfDay.fromCalendarFields(null); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31787);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testFactory_FromDateFields_null1144() throws Exception {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3g0t1oj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null1144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3g0t1oj0() throws Exception{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31788); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31789);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31790);TimeOfDay.fromDateFields(null); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31791);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor1145() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gjf3koj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor1145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gjf3koj4() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31792); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31793);TimeOfDay test = new TimeOfDay(); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31794);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31795);assertEquals(10 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31796);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31797);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31798);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1146() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzcqmfojb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone1146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzcqmfojb() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31799); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31800);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31801);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31802);TimeOfDay test = new TimeOfDay(LONDON); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31803);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31804);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31805);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31806);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31807);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31808);test = new TimeOfDay(PARIS); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31809);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31810);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31811);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31812);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31813);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_long2_Chronology1149() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0ahj8ojq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0ahj8ojq() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31814); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31815);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31816);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31817);assertEquals(5 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31818);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31819);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31820);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_ObjectString11150() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpl9roojx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString11150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpl9roojx() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31821); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31822);TimeOfDay test = new TimeOfDay("10:20:30.040"); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31823);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31824);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31825);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31826);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31827);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1151() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpxrdhok4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_nullChronology1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpxrdhok4() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31828); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31829);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31830);TimeOfDay test = new TimeOfDay(date, null); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31831);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31832);assertEquals(1 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31833);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31834);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31835);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_int_int1152() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bv6wc4okc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int1152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bv6wc4okc() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31836); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31837);TimeOfDay test = new TimeOfDay(10, 20); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31838);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31839);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31840);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31841);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31842);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31843);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31844);new TimeOfDay(-1, 20); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31845);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31846);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31847);new TimeOfDay(24, 20); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31848);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31849);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31850);new TimeOfDay(10, -1); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31852);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31853);new TimeOfDay(10, 60); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31854);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_int_int_int1153() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhrz6lokv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int1153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhrz6lokv() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31855); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31856);TimeOfDay test = new TimeOfDay(10, 20, 30); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31857);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31858);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31859);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31860);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31861);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31862);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31863);new TimeOfDay(-1, 20, 30); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31864);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31865);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31866);new TimeOfDay(24, 20, 30); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31867);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31868);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31869);new TimeOfDay(10, -1, 30); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31870);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31871);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31872);new TimeOfDay(10, 60, 30); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31873);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31874);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31875);new TimeOfDay(10, 20, -1); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31876);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31877);try { 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31878);new TimeOfDay(10, 20, 60); 
         __CLR4_4_1oi5oi5le6rjd58.R.inc(31879);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullChronology1154() throws Throwable {__CLR4_4_1oi5oi5le6rjd58.R.globalSliceStart(getClass().getName(),31880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134wcpgolk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oi5oi5le6rjd58.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oi5oi5le6rjd58.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_nullChronology1154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134wcpgolk() throws Throwable{try{__CLR4_4_1oi5oi5le6rjd58.R.inc(31880); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31881);TimeOfDay test = new TimeOfDay(10, 20, 30, null); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31882);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31883);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31884);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31885);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1oi5oi5le6rjd58.R.inc(31886);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1oi5oi5le6rjd58.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test factory (long)
     */
    

    /**
     * Test factory (long, Chronology)
     */
    

    /**
     * Test factory (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object)
     */
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    

}
