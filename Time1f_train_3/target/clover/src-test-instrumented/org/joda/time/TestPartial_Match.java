/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Match extends TestCase {static class __CLR4_4_1n9un9ule6rclty{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,30198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
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

    public static void main(String[] args) {try{__CLR4_4_1n9un9ule6rclty.R.inc(30162);
        __CLR4_4_1n9un9ule6rclty.R.inc(30163);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n9un9ule6rclty.R.inc(30164);
        __CLR4_4_1n9un9ule6rclty.R.inc(30165);return new TestSuite(TestPartial_Match.class);
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

    public TestPartial_Match(String name) {
        super(name);__CLR4_4_1n9un9ule6rclty.R.inc(30167);try{__CLR4_4_1n9un9ule6rclty.R.inc(30166);
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n9un9ule6rclty.R.inc(30168);
        __CLR4_4_1n9un9ule6rclty.R.inc(30169);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n9un9ule6rclty.R.inc(30170);zone = DateTimeZone.getDefault();
        __CLR4_4_1n9un9ule6rclty.R.inc(30171);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n9un9ule6rclty.R.inc(30172);
        __CLR4_4_1n9un9ule6rclty.R.inc(30173);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n9un9ule6rclty.R.inc(30174);DateTimeZone.setDefault(zone);
        __CLR4_4_1n9un9ule6rclty.R.inc(30175);zone = null;
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsMatch_Instant668() {__CLR4_4_1n9un9ule6rclty.R.globalSliceStart(getClass().getName(),30176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqql84na8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9un9ule6rclty.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9un9ule6rclty.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Match.testIsMatch_Instant668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqql84na8(){try{__CLR4_4_1n9un9ule6rclty.R.inc(30176); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30177);Partial test = createYMDwPartial(ISO_UTC, 2005, 7, 2); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30178);DateTime instant = new DateTime(2005, 7, 5, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30179);assertEquals(true, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30180);instant = new DateTime(2005, 7, 4, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30181);assertEquals(false, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30182);instant = new DateTime(2005, 7, 6, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30183);assertEquals(false, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30184);instant = new DateTime(2005, 7, 12, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30185);assertEquals(true, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30186);instant = new DateTime(2005, 7, 19, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30187);assertEquals(true, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30188);instant = new DateTime(2005, 7, 26, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30189);assertEquals(true, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30190);instant = new DateTime(2005, 8, 2, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30191);assertEquals(false, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30192);instant = new DateTime(2006, 7, 5, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30193);assertEquals(false, test.isMatch(instant)); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30194);instant = new DateTime(2005, 6, 5, 0, 0, 0, 0); 
     __CLR4_4_1n9un9ule6rclty.R.inc(30195);assertEquals(false, test.isMatch(instant)); 
 }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private Partial createYMDwPartial(Chronology chrono, int year, int month, int dow) {try{__CLR4_4_1n9un9ule6rclty.R.inc(30196);
        __CLR4_4_1n9un9ule6rclty.R.inc(30197);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.year(),
                    DateTimeFieldType.monthOfYear(),
                    DateTimeFieldType.dayOfWeek()},
            new int[] {year, month, dow},
            chrono);
    }finally{__CLR4_4_1n9un9ule6rclty.R.flushNeeded();}}

}
