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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1j5yj5yle6nl8ei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
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

    public static void main(String[] args) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24838);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24839);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24840);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24841);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1j5yj5yle6nl8ei.R.inc(24843);try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24842);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24844);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24845);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24846);zone = DateTimeZone.getDefault();
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24847);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24848);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24849);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24850);DateTimeZone.setDefault(zone);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24851);zone = null;
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToString2274() {__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceStart(getClass().getName(),24852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phwzj2j6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5yj5yle6nl8ei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phwzj2j6c(){try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24852); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24853);Partial test = new Partial(); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24854);assertEquals("[]", test.toString()); 
 }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}
public void testToString5275() {__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceStart(getClass().getName(),24855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ov340j6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5yj5yle6nl8ei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ov340j6f(){try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24855); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24856);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24857);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24858);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24859);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}
public void testToString_String_Locale467() {__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceStart(getClass().getName(),24860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ale5v9j6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5yj5yle6nl8ei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ale5v9j6k(){try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24860); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24861);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24862);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24863);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24864);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24865);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}
public void testToString_String468() {__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceStart(getClass().getName(),24866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12x38qdj6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5yj5yle6nl8ei.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5yj5yle6nl8ei.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12x38qdj6q(){try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24866); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24867);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24868);assertEquals("05 \ufffd\ufffd", test.toString("MM HH")); 
     __CLR4_4_1j5yj5yle6nl8ei.R.inc(24869);assertEquals("--05-06", test.toString((String) null)); 
 }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24870);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24871);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24872);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24873);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24874);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24875);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24876);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24877);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24878);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24879);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1j5yj5yle6nl8ei.R.inc(24880);
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24881);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1j5yj5yle6nl8ei.R.inc(24882);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1j5yj5yle6nl8ei.R.flushNeeded();}}
}
