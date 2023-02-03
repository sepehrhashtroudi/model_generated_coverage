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
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1plcplclc8axeit{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1plcplclc8axeit.R.inc(33168);
        __CLR4_4_1plcplclc8axeit.R.inc(33169);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1plcplclc8axeit.R.inc(33170);
        __CLR4_4_1plcplclc8axeit.R.inc(33171);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1plcplclc8axeit.R.inc(33173);try{__CLR4_4_1plcplclc8axeit.R.inc(33172);
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1plcplclc8axeit.R.inc(33174);
        __CLR4_4_1plcplclc8axeit.R.inc(33175);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1plcplclc8axeit.R.inc(33176);zone = DateTimeZone.getDefault();
        __CLR4_4_1plcplclc8axeit.R.inc(33177);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1plcplclc8axeit.R.inc(33178);
        __CLR4_4_1plcplclc8axeit.R.inc(33179);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1plcplclc8axeit.R.inc(33180);DateTimeZone.setDefault(zone);
        __CLR4_4_1plcplclc8axeit.R.inc(33181);zone = null;
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithers121() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdl4dzplq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdl4dzplq(){try{__CLR4_4_1plcplclc8axeit.R.inc(33182); 
     __CLR4_4_1plcplclc8axeit.R.inc(33183);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33184);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33185);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33186);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33187);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1plcplclc8axeit.R.inc(33188);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33189);test.withHourOfDay(-1); 
         __CLR4_4_1plcplclc8axeit.R.inc(33190);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1plcplclc8axeit.R.inc(33191);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33192);test.withHourOfDay(24); 
         __CLR4_4_1plcplclc8axeit.R.inc(33193);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToDateTime_RI146() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14658fgpm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14658fgpm2(){try{__CLR4_4_1plcplclc8axeit.R.inc(33194); 
     __CLR4_4_1plcplclc8axeit.R.inc(33195);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33196);DateTime dt = new DateTime(0L); 
     __CLR4_4_1plcplclc8axeit.R.inc(33197);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33198);DateTime test = base.toDateTime(dt); 
     __CLR4_4_1plcplclc8axeit.R.inc(33199);check(base, 10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33200);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33201);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testMinus_RP312() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uh9acpma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uh9acpma(){try{__CLR4_4_1plcplclc8axeit.R.inc(33202); 
     __CLR4_4_1plcplclc8axeit.R.inc(33203);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33204);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33205);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33206);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33207);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1plcplclc8axeit.R.inc(33208);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToDateTimeToday_Zone463() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn4eiipmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn4eiipmh(){try{__CLR4_4_1plcplclc8axeit.R.inc(33209); 
     __CLR4_4_1plcplclc8axeit.R.inc(33210);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33211);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1plcplclc8axeit.R.inc(33212);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33213);DateTime test = base.toDateTimeToday(TOKYO); 
     __CLR4_4_1plcplclc8axeit.R.inc(33214);check(base, 10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33215);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     __CLR4_4_1plcplclc8axeit.R.inc(33216);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1plcplclc8axeit.R.inc(33217);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1plcplclc8axeit.R.inc(33218);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1plcplclc8axeit.R.inc(33219);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33220);assertEquals(expected, test); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithField4496() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxkllypmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField4496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxkllypmt(){try{__CLR4_4_1plcplclc8axeit.R.inc(33221); 
     __CLR4_4_1plcplclc8axeit.R.inc(33222);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33223);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1plcplclc8axeit.R.inc(33224);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono542() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13l6twmpmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13l6twmpmx(){try{__CLR4_4_1plcplclc8axeit.R.inc(33225); 
     __CLR4_4_1plcplclc8axeit.R.inc(33226);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33227);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1plcplclc8axeit.R.inc(33228);check(base, 10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33229);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33230);check(test, 10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33231);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testPlusMillis_int643() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rj5eyipn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int643",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rj5eyipn4(){try{__CLR4_4_1plcplclc8axeit.R.inc(33232); 
     __CLR4_4_1plcplclc8axeit.R.inc(33233);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33234);TimeOfDay result = test.plusMillis(1); 
     __CLR4_4_1plcplclc8axeit.R.inc(33235);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33236);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33237);result = test.plusMillis(0); 
     __CLR4_4_1plcplclc8axeit.R.inc(33238);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testMinusMinutes_int839() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4c2kspnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int839",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4c2kspnb(){try{__CLR4_4_1plcplclc8axeit.R.inc(33239); 
     __CLR4_4_1plcplclc8axeit.R.inc(33240);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33241);TimeOfDay result = test.minusMinutes(1); 
     __CLR4_4_1plcplclc8axeit.R.inc(33242);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33243);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33244);result = test.minusMinutes(0); 
     __CLR4_4_1plcplclc8axeit.R.inc(33245);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testMinusMillis_int848() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8sk8fpni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8sk8fpni(){try{__CLR4_4_1plcplclc8axeit.R.inc(33246); 
     __CLR4_4_1plcplclc8axeit.R.inc(33247);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33248);TimeOfDay result = test.minusMillis(1); 
     __CLR4_4_1plcplclc8axeit.R.inc(33249);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33250);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33251);result = test.minusMillis(0); 
     __CLR4_4_1plcplclc8axeit.R.inc(33252);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testGetField900() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhw5kapnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField900",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhw5kapnp(){try{__CLR4_4_1plcplclc8axeit.R.inc(33253); 
     __CLR4_4_1plcplclc8axeit.R.inc(33254);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33255);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33256);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33257);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33258);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33259);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33260);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1plcplclc8axeit.R.inc(33261);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33262);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToString907() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsu21jpnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString907",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsu21jpnz(){try{__CLR4_4_1plcplclc8axeit.R.inc(33263); 
     __CLR4_4_1plcplclc8axeit.R.inc(33264);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33265);assertEquals("T10:20:30.040", test.toString()); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testMinusSeconds_int922() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ca54kxpo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int922",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ca54kxpo2(){try{__CLR4_4_1plcplclc8axeit.R.inc(33266); 
     __CLR4_4_1plcplclc8axeit.R.inc(33267);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33268);TimeOfDay result = test.minusSeconds(1); 
     __CLR4_4_1plcplclc8axeit.R.inc(33269);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33270);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33271);result = test.minusSeconds(0); 
     __CLR4_4_1plcplclc8axeit.R.inc(33272);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testPlus_RP948() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rl371po9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP948",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rl371po9(){try{__CLR4_4_1plcplclc8axeit.R.inc(33273); 
     __CLR4_4_1plcplclc8axeit.R.inc(33274);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33275);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1plcplclc8axeit.R.inc(33276);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33277);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33278);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1plcplclc8axeit.R.inc(33279);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testProperty1034() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06wxapog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty1034",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06wxapog(){try{__CLR4_4_1plcplclc8axeit.R.inc(33280); 
     __CLR4_4_1plcplclc8axeit.R.inc(33281);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33282);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1plcplclc8axeit.R.inc(33283);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1plcplclc8axeit.R.inc(33284);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1plcplclc8axeit.R.inc(33285);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1plcplclc8axeit.R.inc(33286);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33287);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1plcplclc8axeit.R.inc(33288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1plcplclc8axeit.R.inc(33289);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33290);test.property(null); 
         __CLR4_4_1plcplclc8axeit.R.inc(33291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithFieldAdded31098() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crtujqpos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded31098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crtujqpos(){try{__CLR4_4_1plcplclc8axeit.R.inc(33292); 
     __CLR4_4_1plcplclc8axeit.R.inc(33293);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33294);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33295);test.withFieldAdded(null, 6); 
         __CLR4_4_1plcplclc8axeit.R.inc(33296);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithField11177() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148f216pox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField11177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148f216pox(){try{__CLR4_4_1plcplclc8axeit.R.inc(33297); 
     __CLR4_4_1plcplclc8axeit.R.inc(33298);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33299);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1plcplclc8axeit.R.inc(33300);assertEquals(new TimeOfDay(10, 20, 30, 40), test); 
     __CLR4_4_1plcplclc8axeit.R.inc(33301);assertEquals(new TimeOfDay(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToString_String1306() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13iqpltpp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String1306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13iqpltpp2(){try{__CLR4_4_1plcplclc8axeit.R.inc(33302); 
     __CLR4_4_1plcplclc8axeit.R.inc(33303);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33304);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1plcplclc8axeit.R.inc(33305);assertEquals("T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithField31310() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k92aftpp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField31310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k92aftpp6(){try{__CLR4_4_1plcplclc8axeit.R.inc(33306); 
     __CLR4_4_1plcplclc8axeit.R.inc(33307);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33308);try { 
         __CLR4_4_1plcplclc8axeit.R.inc(33309);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1plcplclc8axeit.R.inc(33310);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToDateTimeToday1436() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4iyxyppb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday1436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4iyxyppb(){try{__CLR4_4_1plcplclc8axeit.R.inc(33311); 
     __CLR4_4_1plcplclc8axeit.R.inc(33312);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33313);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1plcplclc8axeit.R.inc(33314);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33315);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1plcplclc8axeit.R.inc(33316);check(base, 10, 20, 30, 40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33317);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1plcplclc8axeit.R.inc(33318);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1plcplclc8axeit.R.inc(33319);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1plcplclc8axeit.R.inc(33320);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1plcplclc8axeit.R.inc(33321);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1plcplclc8axeit.R.inc(33322);assertEquals(expected, test); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testPlusSeconds_int1438() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1deqy5uppn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int1438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1deqy5uppn(){try{__CLR4_4_1plcplclc8axeit.R.inc(33323); 
     __CLR4_4_1plcplclc8axeit.R.inc(33324);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33325);TimeOfDay result = test.plusSeconds(1); 
     __CLR4_4_1plcplclc8axeit.R.inc(33326);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1plcplclc8axeit.R.inc(33327);assertEquals(expected, result); 
     __CLR4_4_1plcplclc8axeit.R.inc(33328);result = test.plusSeconds(0); 
     __CLR4_4_1plcplclc8axeit.R.inc(33329);assertSame(test, result); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testToLocalTime1500() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdf7eyppu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime1500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdf7eyppu(){try{__CLR4_4_1plcplclc8axeit.R.inc(33330); 
     __CLR4_4_1plcplclc8axeit.R.inc(33331);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1plcplclc8axeit.R.inc(33332);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1plcplclc8axeit.R.inc(33333);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1662() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adzbz6ppy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono1662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adzbz6ppy(){try{__CLR4_4_1plcplclc8axeit.R.inc(33334); 
     __CLR4_4_1plcplclc8axeit.R.inc(33335);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33336);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1plcplclc8axeit.R.inc(33337);assertSame(base, test); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 


public void testGetFieldTypes1674() {__CLR4_4_1plcplclc8axeit.R.globalSliceStart(getClass().getName(),33338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qpuk4pq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1plcplclc8axeit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1plcplclc8axeit.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes1674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qpuk4pq2(){try{__CLR4_4_1plcplclc8axeit.R.inc(33338); 
     __CLR4_4_1plcplclc8axeit.R.inc(33339);TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     __CLR4_4_1plcplclc8axeit.R.inc(33340);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1plcplclc8axeit.R.inc(33341);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1plcplclc8axeit.R.inc(33342);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1plcplclc8axeit.R.inc(33343);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     __CLR4_4_1plcplclc8axeit.R.inc(33344);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     __CLR4_4_1plcplclc8axeit.R.inc(33345);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1plcplclc8axeit.R.inc(33346);
            __CLR4_4_1plcplclc8axeit.R.inc(33347);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1plcplclc8axeit.R.inc(33348);
            __CLR4_4_1plcplclc8axeit.R.inc(33349);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1plcplclc8axeit.R.inc(33350);
            __CLR4_4_1plcplclc8axeit.R.inc(33351);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}
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
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1plcplclc8axeit.R.inc(33352);
        __CLR4_4_1plcplclc8axeit.R.inc(33353);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1plcplclc8axeit.R.inc(33354);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1plcplclc8axeit.R.inc(33355);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1plcplclc8axeit.R.inc(33356);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1plcplclc8axeit.R.flushNeeded();}}
}
