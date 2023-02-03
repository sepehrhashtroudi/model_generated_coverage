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
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1nf1nf1lc8axe86{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30349);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30350);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30351);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30352);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1nf1nf1lc8axe86.R.inc(30354);try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30353);
    }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30355);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30356);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30357);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30358);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30359);originalLocale = Locale.getDefault();
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30360);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30361);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30362);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30363);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30364);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30365);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30366);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30367);Locale.setDefault(originalLocale);
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30368);originalDateTimeZone = null;
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30369);originalTimeZone = null;
        __CLR4_4_1nf1nf1lc8axe86.R.inc(30370);originalLocale = null;
    }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_RP_RI573() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132s5nbnfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132s5nbnfn() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30371); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30372);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30373);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30374);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_RI_RP3141() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rssm5tnfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rssm5tnfr() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30375); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30376);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30377);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30378);long result = TEST_TIME_NOW; 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30379);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30380);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30381);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30382);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30383);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30384);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_RI_RD4315() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161jd8zng1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161jd8zng1() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30385); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30386);long result = TEST_TIME_NOW; 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30387);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30388);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30389);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30390);MutableInterval test = new MutableInterval((ReadableInstant) null, dur); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30391);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30392);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_RI_RI1539() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icabbtng9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icabbtng9() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30393); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30394);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30395);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30396);MutableInterval test = new MutableInterval(dt1, dt2); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30397);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30398);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testParse_noFormatter640() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6dumqngf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6dumqngf() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30399); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30400);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30401);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30402);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30403);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30404);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_Object6765() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehv399ngl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6765",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehv399ngl() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30405); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30406);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L)); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30407);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30408); 
             __CLR4_4_1nf1nf1lc8axe86.R.inc(30409);return false; 
         }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30410); 
             __CLR4_4_1nf1nf1lc8axe86.R.inc(30411);interval.setChronology(chrono); 
             __CLR4_4_1nf1nf1lc8axe86.R.inc(30412);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30413); 
             __CLR4_4_1nf1nf1lc8axe86.R.inc(30414);return ReadableInterval.class; 
         }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 
     }; 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30415);try { 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30416);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30417);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30418);MutableInterval test = new MutableInterval(base); 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30419);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30420);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1nf1nf1lc8axe86.R.inc(30421);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_Object2793() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pl8honh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object2793",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pl8honh2() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30422); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30423);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30424);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30425);MutableInterval base = new MutableInterval(dt1, dt2); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30426);MutableInterval test = new MutableInterval(base); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30427);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30428);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_RI_RD1891() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmbjxznh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD1891",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmbjxznh9() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30429); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30430);long result = TEST_TIME_NOW; 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30431);result = ISOChronology.getInstance().months().add(result, 6); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30432);result = ISOChronology.getInstance().hours().add(result, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30433);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30434);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30435);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30436);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30437);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor1245() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ble3ynnhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ble3ynnhi() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30438); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30439);MutableInterval test = new MutableInterval(); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30440);assertEquals(0L, test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30441);assertEquals(0L, test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_Object_Chronology11304() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13saty5nhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology11304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13saty5nhm() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30442); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30443);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30444);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30445);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30446);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30447);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30448);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30449);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 


public void testConstructor_RD_RI11729() throws Throwable {__CLR4_4_1nf1nf1lc8axe86.R.globalSliceStart(getClass().getName(),30450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkk9konhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nf1nf1lc8axe86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nf1nf1lc8axe86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI11729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkk9konhu() throws Throwable{try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30450); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30451);long result = TEST_TIME_NOW; 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30452);result = ISOChronology.getInstance().months().add(result, -6); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30453);result = ISOChronology.getInstance().hours().add(result, -1); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30454);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30455);Duration dur = new Duration(TEST_TIME_NOW - result); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30456);MutableInterval test = new MutableInterval(dur, dt); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30457);assertEquals(result, test.getStartMillis()); 
     __CLR4_4_1nf1nf1lc8axe86.R.inc(30458);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}} 

    

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
        public Chronology getChronology() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30459);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30460);return ISOChronology.getInstance();
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30461);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30462);return 1234L;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30463);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30464);return new DateTime(1234L);
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30465);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30466);return 5678L;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30467);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30468);return new DateTime(5678L);
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30469);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30470);return (5678L - 1234L);
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30471);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30472);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30473);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30474);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30475);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30476);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30477);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30478);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30479);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30480);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30481);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30482);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30483);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30484);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30485);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30486);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30487);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30488);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30489);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30490);return false;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30491);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30492);return null;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30493);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30494);return null;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30495);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30496);return null;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1nf1nf1lc8axe86.R.inc(30497);
            __CLR4_4_1nf1nf1lc8axe86.R.inc(30498);return null;
        }finally{__CLR4_4_1nf1nf1lc8axe86.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
