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
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1k5kk5kle6ndpu0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26176,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26120);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26121);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26122);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26123);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1k5kk5kle6ndpu0.R.inc(26125);try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26124);
    }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26126);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26127);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26128);zone = DateTimeZone.getDefault();
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26129);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26130);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26131);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26132);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26133);DateTimeZone.setDefault(zone);
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26134);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1k5kk5kle6ndpu0.R.inc(26135);zone = null;
    }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
public void testFactory_FromCalendarFields555() throws Exception {__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceStart(getClass().getName(),26136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1864xx0k60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k5kk5kle6ndpu0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1864xx0k60() throws Exception{try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26136); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26137);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26138);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26139);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26140);assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
 }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}
public void testFactory_FromCalendarFields_null556() throws Exception {__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceStart(getClass().getName(),26141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyr7svk65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k5kk5kle6ndpu0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields_null556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyr7svk65() throws Exception{try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26141); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26142);try { 
         __CLR4_4_1k5kk5kle6ndpu0.R.inc(26143);TimeOfDay.fromCalendarFields((Calendar) null); 
         __CLR4_4_1k5kk5kle6ndpu0.R.inc(26144);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}
public void testFactory_FromCalendarFields557() throws Exception {__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceStart(getClass().getName(),26145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eo4vhyk69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k5kk5kle6ndpu0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eo4vhyk69() throws Exception{try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26145); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26146);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26147);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26148);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26149);assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26150);try { 
         __CLR4_4_1k5kk5kle6ndpu0.R.inc(26151);TimeOfDay.fromCalendarFields(null); 
         __CLR4_4_1k5kk5kle6ndpu0.R.inc(26152);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}
public void testConstructor_DateTimeZone558() throws Throwable {__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceStart(getClass().getName(),26153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1mq67k6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k5kk5kle6ndpu0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1mq67k6h() throws Throwable{try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26153); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26154);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26155);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26156);TimeOfDay test = new TimeOfDay(LONDON); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26157);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26158);assertEquals(10 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26159);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26160);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26161);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26162);test = new TimeOfDay(PARIS); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26163);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26164);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26165);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26166);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26167);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}
public void testConstructor_Object_Chronology559() throws Throwable {__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceStart(getClass().getName(),26168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3d2ovk6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k5kk5kle6ndpu0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k5kk5kle6ndpu0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_Chronology559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3d2ovk6w() throws Throwable{try{__CLR4_4_1k5kk5kle6ndpu0.R.inc(26168); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26169);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26170);TimeOfDay test = new TimeOfDay(date, JulianChronology.getInstance()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26171);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26172);assertEquals(5 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26173);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26174);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1k5kk5kle6ndpu0.R.inc(26175);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1k5kk5kle6ndpu0.R.flushNeeded();}}
    

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
