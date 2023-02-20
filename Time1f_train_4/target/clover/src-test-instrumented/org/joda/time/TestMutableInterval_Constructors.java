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
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1ml3ml3le6rjct8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29271);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29272);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29273);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29274);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1ml3ml3le6rjct8.R.inc(29276);try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29275);
    }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29277);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29278);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29279);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29280);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29281);originalLocale = Locale.getDefault();
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29282);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29283);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29284);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29285);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29286);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29287);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29288);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29289);Locale.setDefault(originalLocale);
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29290);originalDateTimeZone = null;
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29291);originalTimeZone = null;
        __CLR4_4_1ml3ml3le6rjct8.R.inc(29292);originalLocale = null;
    }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RI_RP3444() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v58fxzmlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v58fxzmlp() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29293); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29294);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29295);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29296);long result = TEST_TIME_NOW; 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29297);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29298);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29299);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29300);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29301);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29302);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_RI_RD4815() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpstkemlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4815",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpstkemlz() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29303); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29304);long result = TEST_TIME_NOW; 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29305);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29306);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29307);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29308);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29309);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29310);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_RP_RI5817() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lu0dptmm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI5817",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lu0dptmm7() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29311); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29312);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29313);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29314);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1819() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xliy0nmmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1819",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xliy0nmmb() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29315); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29316);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29317);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29318);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29319);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29320);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29321);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29322);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_Object6820() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jat27xmmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jat27xmmj() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29323); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29324);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L)); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29325);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29326); 
             __CLR4_4_1ml3ml3le6rjct8.R.inc(29327);return false; 
         }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29328); 
             __CLR4_4_1ml3ml3le6rjct8.R.inc(29329);interval.setChronology(chrono); 
             __CLR4_4_1ml3ml3le6rjct8.R.inc(29330);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29331); 
             __CLR4_4_1ml3ml3le6rjct8.R.inc(29332);return ReadableInterval.class; 
         }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29333);try { 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29334);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29335);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29336);MutableInterval test = new MutableInterval(base); 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29337);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29338);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1ml3ml3le6rjct8.R.inc(29339);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testParse_noFormatter1137() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxzczumn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter1137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxzczumn0() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29340); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29341);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29342);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29343);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29344);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29345);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_RI_RD11412() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh4jzbmn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD11412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh4jzbmn6() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29346); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29347);long result = TEST_TIME_NOW; 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29348);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29349);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29350);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29351);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29352);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29353);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29354);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 


public void testConstructor_RD_RI11413() throws Throwable {__CLR4_4_1ml3ml3le6rjct8.R.globalSliceStart(getClass().getName(),29355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8qd4gmnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ml3ml3le6rjct8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ml3ml3le6rjct8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI11413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8qd4gmnf() throws Throwable{try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29355); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29356);long result = TEST_TIME_NOW; 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29357);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29358);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29359);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29360);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29361);MutableInterval test = new MutableInterval(dur, dt); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29362);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1ml3ml3le6rjct8.R.inc(29363);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}} 

    

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
        public Chronology getChronology() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29364);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29365);return ISOChronology.getInstance();
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29366);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29367);return 1234L;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29368);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29369);return new DateTime(1234L);
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29370);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29371);return 5678L;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29372);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29373);return new DateTime(5678L);
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29374);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29375);return (5678L - 1234L);
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29376);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29377);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29378);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29379);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29380);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29381);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29382);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29383);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29384);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29385);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29386);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29387);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29388);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29389);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29390);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29391);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29392);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29393);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29394);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29395);return false;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29396);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29397);return null;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29398);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29399);return null;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29400);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29401);return null;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1ml3ml3le6rjct8.R.inc(29402);
            __CLR4_4_1ml3ml3le6rjct8.R.inc(29403);return null;
        }finally{__CLR4_4_1ml3ml3le6rjct8.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
