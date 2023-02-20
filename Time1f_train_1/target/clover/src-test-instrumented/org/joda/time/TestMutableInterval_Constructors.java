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
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1mj6mj6le6qe9wd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29202);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29203);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29204);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29205);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1mj6mj6le6qe9wd.R.inc(29207);try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29206);
    }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29208);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29209);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29210);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29211);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29212);originalLocale = Locale.getDefault();
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29213);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29214);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29215);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29216);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29217);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29218);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29219);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29220);Locale.setDefault(originalLocale);
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29221);originalDateTimeZone = null;
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29222);originalTimeZone = null;
        __CLR4_4_1mj6mj6le6qe9wd.R.inc(29223);originalLocale = null;
    }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RI_RP3435() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14odi6xmjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14odi6xmjs() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29224); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29225);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29226);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29227);long result = TEST_TIME_NOW; 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29228);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29229);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29230);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29231);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29232);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29233);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_RI_RI1795() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xplo8fmk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1795",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xplo8fmk2() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29234); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29235);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29236);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29237);MutableInterval test = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29238);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29239);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_RI_RD4797() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkkvajmk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4797",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkkvajmk8() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29240); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29241);long result = TEST_TIME_NOW; 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29242);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29243);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29244);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29245);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29246);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29247);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_RP_RI5798() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5py6vmkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI5798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5py6vmkg() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29248); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29249);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29250);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29251);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1800() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdbnn5mkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1800",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdbnn5mkk() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29252); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29253);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29254);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29255);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29256);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29257);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29258);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29259);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_Object6801() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y579wgmks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y579wgmks() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29260); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29261);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L)); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29262);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29263); 
             __CLR4_4_1mj6mj6le6qe9wd.R.inc(29264);return false; 
         }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29265); 
             __CLR4_4_1mj6mj6le6qe9wd.R.inc(29266);interval.setChronology(chrono); 
             __CLR4_4_1mj6mj6le6qe9wd.R.inc(29267);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29268); 
             __CLR4_4_1mj6mj6le6qe9wd.R.inc(29269);return ReadableInterval.class; 
         }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 
     }; 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29270);try { 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29271);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29272);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29273);MutableInterval test = new MutableInterval(base); 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29274);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29275);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1mj6mj6le6qe9wd.R.inc(29276);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testParse_noFormatter1120() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adpz3kml9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter1120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adpz3kml9() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29277); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29278);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29279);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29280);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29281);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29282);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor1416() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqk6jtmlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor1416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqk6jtmlf() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29283); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29284);MutableInterval test = new MutableInterval(); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29285);assertEquals(0L, test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29286);assertEquals(0L, test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_RI_RD11417() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1484q0ymlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD11417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1484q0ymlj() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29287); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29288);long result = TEST_TIME_NOW; 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29289);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29290);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29291);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29292);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29293);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29294);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29295);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_RD_RI11418() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1509gtxmls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI11418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1509gtxmls() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29296); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29297);long result = TEST_TIME_NOW; 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29298);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29299);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29300);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29301);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29302);MutableInterval test = new MutableInterval(dur, dt); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29303);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29304);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 


public void testConstructor_Object21419() throws Throwable {__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceStart(getClass().getName(),29305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he62kymm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mj6mj6le6qe9wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mj6mj6le6qe9wd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object21419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he62kymm1() throws Throwable{try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29305); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29306);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29307);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29308);MutableInterval base = new MutableInterval(dt1, dt2); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29309);MutableInterval test = new MutableInterval(base); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29310);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1mj6mj6le6qe9wd.R.inc(29311);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}} 

    

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
        public Chronology getChronology() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29312);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29313);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29314);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29315);return 1234L;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29316);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29317);return new DateTime(1234L);
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29318);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29319);return 5678L;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29320);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29321);return new DateTime(5678L);
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29322);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29323);return (5678L - 1234L);
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29324);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29325);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29326);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29327);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29328);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29329);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29330);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29331);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29332);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29333);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29334);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29335);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29336);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29337);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29338);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29339);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29340);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29341);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29342);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29343);return false;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29344);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29345);return null;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29346);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29347);return null;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29348);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29349);return null;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1mj6mj6le6qe9wd.R.inc(29350);
            __CLR4_4_1mj6mj6le6qe9wd.R.inc(29351);return null;
        }finally{__CLR4_4_1mj6mj6le6qe9wd.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
