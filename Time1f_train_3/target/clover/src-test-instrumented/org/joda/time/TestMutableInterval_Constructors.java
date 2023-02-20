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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1mgmmgmle6rcliu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,29233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29110);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29111);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29112);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29113);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1mgmmgmle6rcliu.R.inc(29115);try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29114);
    }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29116);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29117);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29118);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29119);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29120);originalLocale = Locale.getDefault();
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29121);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29122);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29123);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29124);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29125);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29126);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29127);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29128);Locale.setDefault(originalLocale);
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29129);originalDateTimeZone = null;
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29130);originalTimeZone = null;
        __CLR4_4_1mgmmgmle6rcliu.R.inc(29131);originalLocale = null;
    }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RI_RI1792() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkihdamh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1792",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkihdamh8() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29132); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29133);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29134);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29135);MutableInterval test = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29136);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29137);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_RI_RD4793() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kl04nmhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4793",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kl04nmhe() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29138); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29139);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29140);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29141);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29142);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29143);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29144);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29145);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_RP_RI5795() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swpukamhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI5795",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swpukamhm() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29146); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29147);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29148);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29149);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1797() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h57a9gmhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1797",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h57a9gmhq() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29150); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29151);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29152);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29153);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29154);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29155);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29156);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29157);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testParse_noFormatter1111() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6j54imhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6j54imhy() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29158); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29159);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29160);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29161);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29162);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29163);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor1416() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqk6jtmi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor1416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqk6jtmi4() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29164); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29165);MutableInterval test = new MutableInterval(); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29166);assertEquals(0L, test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29167);assertEquals(0L, test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_RI_RD11417() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1484q0ymi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD11417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1484q0ymi8() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29168); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29169);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29170);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29171);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29172);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29173);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29174);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29175);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29176);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_RD_RI11418() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1509gtxmih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI11418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1509gtxmih() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29177); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29178);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29179);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29180);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29181);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29182);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29183);MutableInterval test = new MutableInterval(dur, dt); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29184);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29185);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 


public void testConstructor_Object21419() throws Throwable {__CLR4_4_1mgmmgmle6rcliu.R.globalSliceStart(getClass().getName(),29186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he62kymiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgmmgmle6rcliu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgmmgmle6rcliu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object21419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he62kymiq() throws Throwable{try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29186); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29187);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29188);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29189);MutableInterval base = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29190);MutableInterval test = new MutableInterval(base); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29191);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgmmgmle6rcliu.R.inc(29192);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}} 

    

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
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29193);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29194);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29195);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29196);return 1234L;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29197);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29198);return new DateTime(1234L);
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29199);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29200);return 5678L;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29201);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29202);return new DateTime(5678L);
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29203);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29204);return (5678L - 1234L);
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29205);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29206);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29207);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29208);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29209);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29210);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29211);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29212);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29213);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29214);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29215);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29216);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29217);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29218);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29219);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29220);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29221);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29222);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29223);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29224);return false;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29225);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29226);return null;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29227);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29228);return null;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29229);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29230);return null;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1mgmmgmle6rcliu.R.inc(29231);
            __CLR4_4_1mgmmgmle6rcliu.R.inc(29232);return null;
        }finally{__CLR4_4_1mgmmgmle6rcliu.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
