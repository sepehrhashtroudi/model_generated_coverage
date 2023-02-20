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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1i5ti5tle6nl8af{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23537);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23538);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23539);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23540);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1i5ti5tle6nl8af.R.inc(23542);try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23541);
    }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23543);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23544);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23545);zone = DateTimeZone.getDefault();
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23546);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23547);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23548);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23549);DateTimeZone.setDefault(zone);
        __CLR4_4_1i5ti5tle6nl8af.R.inc(23550);zone = null;
    }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor296() throws Throwable {__CLR4_4_1i5ti5tle6nl8af.R.globalSliceStart(getClass().getName(),23551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxm11ui67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ti5tle6nl8af.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ti5tle6nl8af.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxm11ui67() throws Throwable{try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23551); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23552);LocalDate test = new LocalDate(); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23553);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23554);assertEquals(1970, test.getYear()); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23555);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23556);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23557);assertEquals(test, LocalDate.now()); 
 }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}
public void testParse_noFormatter297() throws Throwable {__CLR4_4_1i5ti5tle6nl8af.R.globalSliceStart(getClass().getName(),23558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn334ci6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ti5tle6nl8af.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ti5tle6nl8af.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn334ci6e() throws Throwable{try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23558); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23559);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30")); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23560);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}
public void testParse_noFormatter298() throws Throwable {__CLR4_4_1i5ti5tle6nl8af.R.globalSliceStart(getClass().getName(),23561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw31wti6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ti5tle6nl8af.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ti5tle6nl8af.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw31wti6h() throws Throwable{try{__CLR4_4_1i5ti5tle6nl8af.R.inc(23561); 
     __CLR4_4_1i5ti5tle6nl8af.R.inc(23562);assertEquals(new LocalDate(2010, 6, 30, ISOChronology.getInstance(LONDON)), LocalDate.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); 
 }finally{__CLR4_4_1i5ti5tle6nl8af.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
