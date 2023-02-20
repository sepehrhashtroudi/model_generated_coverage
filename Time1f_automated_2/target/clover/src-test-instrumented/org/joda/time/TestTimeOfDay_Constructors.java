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
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_1js8js8le6nl8h2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1js8js8le6nl8h2.R.inc(25640);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25641);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1js8js8le6nl8h2.R.inc(25642);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25643);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_1js8js8le6nl8h2.R.inc(25645);try{__CLR4_4_1js8js8le6nl8h2.R.inc(25644);
    }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1js8js8le6nl8h2.R.inc(25646);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25647);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25648);zone = DateTimeZone.getDefault();
        __CLR4_4_1js8js8le6nl8h2.R.inc(25649);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25650);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1js8js8le6nl8h2.R.inc(25651);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25652);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1js8js8le6nl8h2.R.inc(25653);DateTimeZone.setDefault(zone);
        __CLR4_4_1js8js8le6nl8h2.R.inc(25654);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1js8js8le6nl8h2.R.inc(25655);zone = null;
    }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
public void testConstructor_ObjectString3476() throws Throwable {__CLR4_4_1js8js8le6nl8h2.R.globalSliceStart(getClass().getName(),25656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynjoc2jso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js8js8le6nl8h2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js8js8le6nl8h2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString3476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynjoc2jso() throws Throwable{try{__CLR4_4_1js8js8le6nl8h2.R.inc(25656); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25657);TimeOfDay test = new TimeOfDay("T10:20"); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25658);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25659);assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25660);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25661);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1js8js8le6nl8h2.R.inc(25662);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1js8js8le6nl8h2.R.flushNeeded();}}
    

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
