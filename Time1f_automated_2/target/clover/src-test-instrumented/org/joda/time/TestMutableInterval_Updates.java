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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1iwliwlle6nl8di{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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

    public static void main(String[] args) {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24501);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24502);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24503);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24504);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1iwliwlle6nl8di.R.inc(24506);try{__CLR4_4_1iwliwlle6nl8di.R.inc(24505);
    }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24507);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24508);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24509);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iwliwlle6nl8di.R.inc(24510);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iwliwlle6nl8di.R.inc(24511);originalLocale = Locale.getDefault();
        __CLR4_4_1iwliwlle6nl8di.R.inc(24512);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24513);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iwliwlle6nl8di.R.inc(24514);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24515);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24516);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iwliwlle6nl8di.R.inc(24517);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24518);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24519);Locale.setDefault(originalLocale);
        __CLR4_4_1iwliwlle6nl8di.R.inc(24520);originalDateTimeZone = null;
        __CLR4_4_1iwliwlle6nl8di.R.inc(24521);originalTimeZone = null;
        __CLR4_4_1iwliwlle6nl8di.R.inc(24522);originalLocale = null;
    }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetInterval_RInterval1610() {__CLR4_4_1iwliwlle6nl8di.R.globalSliceStart(getClass().getName(),24523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvut88ix7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwliwlle6nl8di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwliwlle6nl8di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval1610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvut88ix7(){try{__CLR4_4_1iwliwlle6nl8di.R.inc(24523); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24524);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24525);test.setInterval(new Interval(TEST_TIME1, TEST_TIME2)); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24526);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24527);assertEquals(TEST_TIME1 + 1, test.getEndMillis()); 
 }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
public void testSetInterval_RInterval3611() {__CLR4_4_1iwliwlle6nl8di.R.globalSliceStart(getClass().getName(),24528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu82frixc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwliwlle6nl8di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwliwlle6nl8di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval3611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu82frixc(){try{__CLR4_4_1iwliwlle6nl8di.R.inc(24528); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24529);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24530);test.setInterval(null); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24531);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24532);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
public void testSetInterval_RInterval3612() {__CLR4_4_1iwliwlle6nl8di.R.globalSliceStart(getClass().getName(),24533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxw0qwixh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwliwlle6nl8di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwliwlle6nl8di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval3612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxw0qwixh(){try{__CLR4_4_1iwliwlle6nl8di.R.inc(24533); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24534);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24535);test.setInterval(null); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24536);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24537);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
public void testSetDurationBeforeEnd_RI3613() {__CLR4_4_1iwliwlle6nl8di.R.globalSliceStart(getClass().getName(),24538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3vtkaixm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwliwlle6nl8di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwliwlle6nl8di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI3613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3vtkaixm(){try{__CLR4_4_1iwliwlle6nl8di.R.inc(24538); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24539);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24540);test.setDurationBeforeEnd(null); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24541);assertEquals(TEST_TIME2, test.getStartMillis()); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24542);assertEquals(TEST_TIME2, test.getEndMillis()); 
 }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
public void testSetDurationAfterStart_RI3615() {__CLR4_4_1iwliwlle6nl8di.R.globalSliceStart(getClass().getName(),24543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tsofs6ixr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwliwlle6nl8di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwliwlle6nl8di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_RI3615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tsofs6ixr(){try{__CLR4_4_1iwliwlle6nl8di.R.inc(24543); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24544);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24545);test.setDurationAfterStart(null); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24546);assertEquals(TEST_TIME1, test.getStartMillis()); 
     __CLR4_4_1iwliwlle6nl8di.R.inc(24547);assertEquals(TEST_TIME1, test.getEndMillis()); 
 }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24548);
            __CLR4_4_1iwliwlle6nl8di.R.inc(24549);return ISOChronology.getInstance();
        }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24550);
            __CLR4_4_1iwliwlle6nl8di.R.inc(24551);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1iwliwlle6nl8di.R.inc(24552);
            __CLR4_4_1iwliwlle6nl8di.R.inc(24553);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1iwliwlle6nl8di.R.flushNeeded();}}
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
    

    

    

}
