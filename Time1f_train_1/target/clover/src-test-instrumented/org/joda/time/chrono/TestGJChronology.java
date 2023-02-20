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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_1pz8pz8le6qeadp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33793,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33668);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33669);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33670);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33671);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1pz8pz8le6qeadp.R.inc(33673);try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33672);
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33674);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33675);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33676);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33677);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33678);originalLocale = Locale.getDefault();
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33679);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33680);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33681);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33682);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33683);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33684);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33685);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33686);Locale.setDefault(originalLocale);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33687);originalDateTimeZone = null;
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33688);originalTimeZone = null;
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33689);originalLocale = null;
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCutoverAddWeeks116() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129jce3pzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129jce3pzu(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33690); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33691);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33692);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33693);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33694);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1"); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testEquality117() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttkatupzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testEquality117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttkatupzz(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33695); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33696);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO)); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33697);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON)); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33698);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS)); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33699);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33700);assertSame(GJChronology.getInstance(), GJChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testSubtractDays118() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rz8taq05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rz8taq05(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33701); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33702);DateTime dt = new DateTime(1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin"))); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33703);YearMonthDay ymd = dt.toYearMonthDay(); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33704);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_1pz8pz8le6qeadp.R.iget(33705)!=0|true))||(__CLR4_4_1pz8pz8le6qeadp.R.iget(33706)==0&false))) {{ 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33707);ymd = ymd.minus(Period.days(1)); 
     } 
 }}finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testLeapYearRulesConstructionInvalid123() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9lubxq0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstructionInvalid123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9lubxq0c(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33708); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33709);try { 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33710);new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC()); 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33711);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testLeapYearRulesConstruction124() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz736xq0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz736xq0g(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33712); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33713);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33714);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33715);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33716);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testToString125() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mteplvq0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mteplvq0l(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33717); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33718);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33719);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33720);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33721);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33722);assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33723);assertEquals("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString()); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testCutoverAddWeekyears127() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185hj9kq0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185hj9kq0s(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33724); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33725);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33726);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33727);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33728);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33729);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33730);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7"); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testPartialGetAsText128() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3bfuwq0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3bfuwq0z(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33731); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33732);GJChronology chrono = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33733);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33734);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText()); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testMaximumValue131() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txarvxq13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txarvxq13(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33735); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33736);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance()); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33737);while ((((dt.getYear() < 1590)&&(__CLR4_4_1pz8pz8le6qeadp.R.iget(33738)!=0|true))||(__CLR4_4_1pz8pz8le6qeadp.R.iget(33739)==0&false))) {{ 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33740);dt = dt.plusDays(1); 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33741);YearMonthDay ymd = dt.toYearMonthDay(); 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33742);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue()); 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33743);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue()); 
         __CLR4_4_1pz8pz8le6qeadp.R.inc(33744);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue()); 
     } 
 }}finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testCutoverAddYears132() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4sbviq1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4sbviq1d(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33745); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33746);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33747);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33748);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33749);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33750);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33751);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33752);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33753);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33754);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33755);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33756);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33757);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33758);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33759);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33760);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 


public void testCutoverAddMonths136() {__CLR4_4_1pz8pz8le6qeadp.R.globalSliceStart(getClass().getName(),33761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c58tm3q1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pz8pz8le6qeadp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pz8pz8le6qeadp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c58tm3q1t(){try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33761); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33762);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33763);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33764);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33765);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33766);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33767);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33768);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33769);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33770);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33771);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33772);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33773);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33774);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15"); 
     __CLR4_4_1pz8pz8le6qeadp.R.inc(33775);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31"); 
 }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33776);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33777);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1pz8pz8le6qeadp.R.inc(33778);
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33779);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33780);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33781);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33782);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1pz8pz8le6qeadp.R.inc(33783);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33784);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33785);assertEquals(amt, diff);
        
        __CLR4_4_1pz8pz8le6qeadp.R.inc(33786);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1pz8pz8le6qeadp.R.iget(33787)!=0|true))||(__CLR4_4_1pz8pz8le6qeadp.R.iget(33788)==0&false))) {{
            __CLR4_4_1pz8pz8le6qeadp.R.inc(33789);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pz8pz8le6qeadp.R.inc(33790);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pz8pz8le6qeadp.R.inc(33791);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1pz8pz8le6qeadp.R.inc(33792);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1pz8pz8le6qeadp.R.flushNeeded();}}

    

    

    

    

    

}
