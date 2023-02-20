/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1ixuixule6o79xr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1ixuixule6o79xr.R.inc(24546);
        __CLR4_4_1ixuixule6o79xr.R.inc(24547);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ixuixule6o79xr.R.inc(24548);
        __CLR4_4_1ixuixule6o79xr.R.inc(24549);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1ixuixule6o79xr.R.inc(24551);try{__CLR4_4_1ixuixule6o79xr.R.inc(24550);
    }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ixuixule6o79xr.R.inc(24552);
        __CLR4_4_1ixuixule6o79xr.R.inc(24553);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ixuixule6o79xr.R.inc(24554);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ixuixule6o79xr.R.inc(24555);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ixuixule6o79xr.R.inc(24556);originalLocale = Locale.getDefault();
        __CLR4_4_1ixuixule6o79xr.R.inc(24557);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ixuixule6o79xr.R.inc(24558);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ixuixule6o79xr.R.inc(24559);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ixuixule6o79xr.R.inc(24560);
        __CLR4_4_1ixuixule6o79xr.R.inc(24561);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ixuixule6o79xr.R.inc(24562);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ixuixule6o79xr.R.inc(24563);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ixuixule6o79xr.R.inc(24564);Locale.setDefault(originalLocale);
        __CLR4_4_1ixuixule6o79xr.R.inc(24565);originalDateTimeZone = null;
        __CLR4_4_1ixuixule6o79xr.R.inc(24566);originalTimeZone = null;
        __CLR4_4_1ixuixule6o79xr.R.inc(24567);originalLocale = null;
    }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testCopy580() {__CLR4_4_1ixuixule6o79xr.R.globalSliceStart(getClass().getName(),24568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt57o3iyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ixuixule6o79xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ixuixule6o79xr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt57o3iyg(){try{__CLR4_4_1ixuixule6o79xr.R.inc(24568); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24569);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24570);MutableInterval result = test.copy(); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24571);assertEquals(true, test.equals(result)); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24572);assertEquals(true, test != result); 
 }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
public void testClone581() {__CLR4_4_1ixuixule6o79xr.R.globalSliceStart(getClass().getName(),24573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8ayh6iyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ixuixule6o79xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ixuixule6o79xr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testClone581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8ayh6iyl(){try{__CLR4_4_1ixuixule6o79xr.R.inc(24573); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24574);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24575);MutableInterval result = (MutableInterval) test.clone(); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24576);assertEquals(true, test.equals(result)); 
     __CLR4_4_1ixuixule6o79xr.R.inc(24577);assertEquals(true, test != result); 
 }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1ixuixule6o79xr.R.inc(24579);try{__CLR4_4_1ixuixule6o79xr.R.inc(24578);
        }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1ixuixule6o79xr.R.inc(24580);
            __CLR4_4_1ixuixule6o79xr.R.inc(24581);return ISOChronology.getInstance();
        }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1ixuixule6o79xr.R.inc(24582);
            __CLR4_4_1ixuixule6o79xr.R.inc(24583);return TEST_TIME1;
        }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1ixuixule6o79xr.R.inc(24584);
            __CLR4_4_1ixuixule6o79xr.R.inc(24585);return TEST_TIME2;
        }finally{__CLR4_4_1ixuixule6o79xr.R.flushNeeded();}}
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
    
    


}
