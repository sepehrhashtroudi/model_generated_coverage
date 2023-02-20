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
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1mgrmgrle6qsf4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,29255,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29115);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29116);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29117);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29118);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1mgrmgrle6qsf4t.R.inc(29120);try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29119);
    }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29121);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29122);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29123);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29124);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29125);originalLocale = Locale.getDefault();
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29126);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29127);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29128);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29129);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29130);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29131);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29132);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29133);Locale.setDefault(originalLocale);
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29134);originalDateTimeZone = null;
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29135);originalTimeZone = null;
        __CLR4_4_1mgrmgrle6qsf4t.R.inc(29136);originalLocale = null;
    }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RI_RP3412() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16irupkmhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16irupkmhd() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29137); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29138);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29139);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29140);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29141);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29142);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29143);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29144);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29145);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29146);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_RI_RI1782() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125cf69mhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1782",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125cf69mhn() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29147); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29148);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29149);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29150);MutableInterval test = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29151);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29152);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_RI_RD4784() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mw9xmfmht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4784",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mw9xmfmht() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29153); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29154);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29155);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29156);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29157);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29158);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29159);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29160);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1787() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o61v65mi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1787",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o61v65mi1() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29161); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29162);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29163);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29164);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29165);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29166);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29167);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29168);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_Object6788() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cngqqmmi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6788",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cngqqmmi9() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29169); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29170);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L)); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29171);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29172); 
             __CLR4_4_1mgrmgrle6qsf4t.R.inc(29173);return false; 
         }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29174); 
             __CLR4_4_1mgrmgrle6qsf4t.R.inc(29175);interval.setChronology(chrono); 
             __CLR4_4_1mgrmgrle6qsf4t.R.inc(29176);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29177); 
             __CLR4_4_1mgrmgrle6qsf4t.R.inc(29178);return ReadableInterval.class; 
         }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 
     }; 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29179);try { 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29180);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29181);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29182);MutableInterval test = new MutableInterval(base); 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29183);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29184);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1mgrmgrle6qsf4t.R.inc(29185);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor1408() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2owgqmiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor1408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2owgqmiq() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29186); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29187);MutableInterval test = new MutableInterval(); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29188);assertEquals(0L, test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29189);assertEquals(0L, test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_RI_RD11409() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfzozjmiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD11409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfzozjmiu() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29190); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29191);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29192);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29193);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29194);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29195);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29196);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29197);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29198);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_RD_RI11410() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzq9hvmj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI11410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzq9hvmj3() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29199); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29200);long result = TEST_TIME_NOW; 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29201);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29202);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29203);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29204);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29205);MutableInterval test = new MutableInterval(dur, dt); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29206);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29207);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 


public void testConstructor_Object21411() throws Throwable {__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceStart(getClass().getName(),29208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmy92emjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgrmgrle6qsf4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgrmgrle6qsf4t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object21411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmy92emjc() throws Throwable{try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29208); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29209);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29210);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29211);MutableInterval base = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29212);MutableInterval test = new MutableInterval(base); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29213);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mgrmgrle6qsf4t.R.inc(29214);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}} 

    

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
        public Chronology getChronology() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29215);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29216);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29217);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29218);return 1234L;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29219);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29220);return new DateTime(1234L);
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29221);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29222);return 5678L;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29223);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29224);return new DateTime(5678L);
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29225);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29226);return (5678L - 1234L);
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29227);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29228);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29229);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29230);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29231);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29232);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29233);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29234);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29235);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29236);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29237);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29238);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29239);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29240);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29241);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29242);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29243);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29244);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29245);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29246);return false;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29247);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29248);return null;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29249);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29250);return null;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29251);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29252);return null;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1mgrmgrle6qsf4t.R.inc(29253);
            __CLR4_4_1mgrmgrle6qsf4t.R.inc(29254);return null;
        }finally{__CLR4_4_1mgrmgrle6qsf4t.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
