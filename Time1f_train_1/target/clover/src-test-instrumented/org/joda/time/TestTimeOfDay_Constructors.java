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
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1ojlojlle6qea70{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ojlojlle6qea70.R.inc(31809);
        __CLR4_4_1ojlojlle6qea70.R.inc(31810);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ojlojlle6qea70.R.inc(31811);
        __CLR4_4_1ojlojlle6qea70.R.inc(31812);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1ojlojlle6qea70.R.inc(31814);try{__CLR4_4_1ojlojlle6qea70.R.inc(31813);
    }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ojlojlle6qea70.R.inc(31815);
        __CLR4_4_1ojlojlle6qea70.R.inc(31816);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ojlojlle6qea70.R.inc(31817);zone = DateTimeZone.getDefault();
        __CLR4_4_1ojlojlle6qea70.R.inc(31818);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ojlojlle6qea70.R.inc(31819);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ojlojlle6qea70.R.inc(31820);
        __CLR4_4_1ojlojlle6qea70.R.inc(31821);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ojlojlle6qea70.R.inc(31822);DateTimeZone.setDefault(zone);
        __CLR4_4_1ojlojlle6qea70.R.inc(31823);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1ojlojlle6qea70.R.inc(31824);zone = null;
    }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString21125() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e827xnok1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString21125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e827xnok1() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31825); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31826);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00"); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31827);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31828);assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31829);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31830);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31831);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor2_Object_Chronology1126() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lo1zn6ok8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor2_Object_Chronology1126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lo1zn6ok8() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31832); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31833);TimeOfDay test = new TimeOfDay("T10:20"); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31834);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31835);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31836);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31837);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31838);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31839);new TimeOfDay("T1020"); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31840);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testFactory_FromDateFields_after19701130() throws Exception {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azyb46okh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_after19701130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azyb46okh() throws Exception{try{__CLR4_4_1ojlojlle6qea70.R.inc(31841); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31842);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31843);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31844);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31845);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testFactory_FromDateFields_null1131() throws Exception {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16des3xokm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null1131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16des3xokm() throws Exception{try{__CLR4_4_1ojlojlle6qea70.R.inc(31846); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31847);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31848);TimeOfDay.fromDateFields(null); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31849);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long11132() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lozk0zokq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long11132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lozk0zokq() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31850); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31851);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31852);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31853);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31854);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31855);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31856);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor1133() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcpsr3okx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcpsr3okx() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31857); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31858);TimeOfDay test = new TimeOfDay(); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31859);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31860);assertEquals(10 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31861);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31862);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31863);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor_long2_Chronology1136() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gkbdqol4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology1136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gkbdqol4() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31864); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31865);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31866);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31867);assertEquals(5 + OFFSET, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31868);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31869);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31870);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor_ObjectString11137() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmsqnpolb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString11137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmsqnpolb() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31871); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31872);TimeOfDay test = new TimeOfDay("10:20:30.040"); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31873);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31874);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31875);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31876);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31877);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor_int_int1138() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j875asoli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j875asoli() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31878); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31879);TimeOfDay test = new TimeOfDay(10, 20); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31880);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31881);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31882);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31883);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31884);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31885);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31886);new TimeOfDay(-1, 20); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31887);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31888);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31889);new TimeOfDay(24, 20); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31890);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31891);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31892);new TimeOfDay(10, -1); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31893);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31894);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31895);new TimeOfDay(10, 60); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31896);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor_int_int_int1139() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fy15nom1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fy15nom1() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31897); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31898);TimeOfDay test = new TimeOfDay(10, 20, 30); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31899);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31900);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31901);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31902);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31903);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31904);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31905);new TimeOfDay(-1, 20, 30); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31906);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31907);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31908);new TimeOfDay(24, 20, 30); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31909);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31910);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31911);new TimeOfDay(10, -1, 30); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31912);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31913);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31914);new TimeOfDay(10, 60, 30); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31915);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31916);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31917);new TimeOfDay(10, 20, -1); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31918);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ojlojlle6qea70.R.inc(31919);try { 
         __CLR4_4_1ojlojlle6qea70.R.inc(31920);new TimeOfDay(10, 20, 60); 
         __CLR4_4_1ojlojlle6qea70.R.inc(31921);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullChronology1140() throws Throwable {__CLR4_4_1ojlojlle6qea70.R.globalSliceStart(getClass().getName(),31922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6cxk9omq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ojlojlle6qea70.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ojlojlle6qea70.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_nullChronology1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6cxk9omq() throws Throwable{try{__CLR4_4_1ojlojlle6qea70.R.inc(31922); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31923);TimeOfDay test = new TimeOfDay(10, 20, 30, null); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31924);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31925);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31926);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31927);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1ojlojlle6qea70.R.inc(31928);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1ojlojlle6qea70.R.flushNeeded();}} 

    

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
