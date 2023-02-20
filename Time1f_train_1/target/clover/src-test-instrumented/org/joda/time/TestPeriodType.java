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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {static class __CLR4_4_1nfhnfhle6qea1i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,30659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30365);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30366);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30367);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30368);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1nfhnfhle6qea1i.R.inc(30370);try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30369);
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30371);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30372);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30373);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30374);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30375);originalLocale = Locale.getDefault();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30376);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30377);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30378);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30379);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30380);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30381);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30382);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30383);Locale.setDefault(originalLocale);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30384);originalDateTimeZone = null;
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30385);originalTimeZone = null;
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30386);originalLocale = null;
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testYearMonthDay759() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkwvplng3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkwvplng3() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30387); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30388);PeriodType type = PeriodType.yearMonthDay(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30389);assertEquals(3, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30390);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30391);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30392);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30393);assertEquals("YearMonthDay", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30394);assertEquals("PeriodType[YearMonthDay]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30395);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30396);assertEquals(true, type == PeriodType.yearMonthDay()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30397);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30398);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30399);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30400);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30401);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testYearWeekDayTime760() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywjmxengi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywjmxengi() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30402); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30403);PeriodType type = PeriodType.yearWeekDayTime(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30404);assertEquals(7, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30405);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30406);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30407);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30408);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30409);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30410);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30411);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30412);assertEquals("YearWeekDayTime", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30413);assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30414);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30415);assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30416);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30417);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30418);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30419);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30420);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testYearWeekDay762() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r59fnjnh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r59fnjnh1() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30421); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30422);PeriodType type = PeriodType.yearWeekDay(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30423);assertEquals(3, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30424);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30425);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30426);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30427);assertEquals("YearWeekDay", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30428);assertEquals("PeriodType[YearWeekDay]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30429);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30430);assertEquals(true, type == PeriodType.yearWeekDay()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30431);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30432);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30433);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30434);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30435);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testYearDayTime763() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lkjttnhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lkjttnhg() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30436); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30437);PeriodType type = PeriodType.yearDayTime(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30438);assertEquals(6, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30439);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30440);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30441);assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30442);assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30443);assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30444);assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30445);assertEquals("YearDayTime", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30446);assertEquals("PeriodType[YearDayTime]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30447);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30448);assertEquals(true, type == PeriodType.yearDayTime()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30449);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30450);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30451);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30452);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30453);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testYearDay764() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qbykxnhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qbykxnhy() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30454); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30455);PeriodType type = PeriodType.yearDay(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30456);assertEquals(2, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30457);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30458);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30459);assertEquals("YearDay", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30460);assertEquals("PeriodType[YearDay]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30461);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30462);assertEquals(true, type == PeriodType.yearDay()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30463);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30464);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30465);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30466);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30467);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testYears768() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9srgcnic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears768",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9srgcnic() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30468); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30469);PeriodType type = PeriodType.years(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30470);assertEquals(1, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30471);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30472);assertEquals("Years", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30473);assertEquals("PeriodType[Years]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30474);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30475);assertEquals(true, type == PeriodType.years()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30476);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30477);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30478);assertEquals(true, type.hashCode() == PeriodType.years().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30479);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30480);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testWeeks769() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxudaknip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWeeks769",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxudaknip() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30481); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30482);PeriodType type = PeriodType.weeks(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30483);assertEquals(1, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30484);assertEquals(DurationFieldType.weeks(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30485);assertEquals("Weeks", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30486);assertEquals("PeriodType[Weeks]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30487);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30488);assertEquals(true, type == PeriodType.weeks()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30489);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30490);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30491);assertEquals(true, type.hashCode() == PeriodType.weeks().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30492);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30493);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testSeconds770() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffxd3enj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds770",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffxd3enj2() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30494); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30495);PeriodType type = PeriodType.seconds(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30496);assertEquals(1, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30497);assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30498);assertEquals("Seconds", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30499);assertEquals("PeriodType[Seconds]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30500);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30501);assertEquals(true, type == PeriodType.seconds()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30502);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30503);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30504);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30505);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30506);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testMaskSeconds771() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wseollnjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds771",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wseollnjf() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30507); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30508);PeriodType type = PeriodType.standard().withSecondsRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30509);assertEquals(7, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30510);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30511);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30512);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30513);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30514);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30515);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30516);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30517);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30518);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30519);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30520);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30521);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30522);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30523);assertEquals("StandardNoSeconds", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30524);assertEquals("PeriodType[StandardNoSeconds]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30525);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testForFields6772() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16v7zalnjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6772",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16v7zalnjy() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30526); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30527);DurationFieldType[] types = null; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30528);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30529);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30530);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30531);types = new DurationFieldType[0]; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30532);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30533);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30534);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30535);types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30536);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30537);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30538);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30539);types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30540);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30541);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30542);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testForFields4773() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dblax6nkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields4773",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dblax6nkf() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30543); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30544);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30545);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30546);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30547);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30548);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testForFields7774() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hglhwnkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields7774",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hglhwnkl() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30549); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30550);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.months() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30551);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.seconds() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30552);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30553);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30554);assertEquals(false, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30555);assertEquals(false, type.equals(type2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30556);assertEquals(false, type.hashCode() == type2.hashCode()); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testForFields5775() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ywq4pnkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5775",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ywq4pnkt() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30557); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30558);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30559);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30560);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30561);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30562);try { 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30563);PeriodType.forFields(types); 
         __CLR4_4_1nfhnfhle6qea1i.R.inc(30564);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testForFields2776() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9yoytnl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields2776",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9yoytnl1() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30565); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30566);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.hours() }; 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30567);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30568);assertEquals(2, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30569);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30570);assertEquals(DurationFieldType.hours(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30571);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30572);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30573);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30574);assertEquals(true, type == PeriodType.forFields(types)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30575);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30576);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30577);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30578);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30579);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testIsSupported777() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2kl4knlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported777",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2kl4knlg() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30580); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30581);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30582);assertEquals(false, type.isSupported(DurationFieldType.years())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30583);assertEquals(false, type.isSupported(DurationFieldType.months())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30584);assertEquals(false, type.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30585);assertEquals(true, type.isSupported(DurationFieldType.days())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30586);assertEquals(true, type.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30587);assertEquals(true, type.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30588);assertEquals(true, type.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30589);assertEquals(false, type.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testMaskTwice2778() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1617fpznlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2778",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1617fpznlq() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30590); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30591);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30592);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30593);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30594);type = PeriodType.dayTime(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30595);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30596);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30597);type = PeriodType.dayTime(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30598);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30599);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30600);type = PeriodType.millis(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30601);type2 = type.withDaysRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30602);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30603);type = PeriodType.millis(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30604);type2 = type.withHoursRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30605);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30606);type = PeriodType.millis(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30607);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30608);assertEquals(true, type == type2); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30609);type = PeriodType.millis(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30610);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30611);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testMaskMinutes779() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168kcblnmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes779",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168kcblnmc() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30612); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30613);PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30614);assertEquals(7, type.size()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30615);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30616);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30617);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30618);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30619);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30620);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30621);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30622);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30623);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30624);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30625);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30626);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30627);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30628);assertEquals("StandardNoMinutes", type.getName()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30629);assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30630);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 


public void testEquals780() throws Exception {__CLR4_4_1nfhnfhle6qea1i.R.globalSliceStart(getClass().getName(),30631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvsbyznmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nfhnfhle6qea1i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nfhnfhle6qea1i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals780",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvsbyznmv() throws Exception{try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30631); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30632);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30633);assertEquals(true, type.equals(type)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30634);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved())); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30635);assertEquals(false, type.equals(null)); 
     __CLR4_4_1nfhnfhle6qea1i.R.inc(30636);assertEquals(false, type.equals("")); 
 }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30637);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30638);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30639);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30640);oos.writeObject(type);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30641);byte[] bytes = baos.toByteArray();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30642);oos.close();
        
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30643);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30644);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30645);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30646);ois.close();
        
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30647);assertEquals(type, result);
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1nfhnfhle6qea1i.R.inc(30648);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30649);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30650);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30651);oos.writeObject(type);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30652);byte[] bytes = baos.toByteArray();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30653);oos.close();
        
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30654);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30655);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30656);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30657);ois.close();
        
        __CLR4_4_1nfhnfhle6qea1i.R.inc(30658);assertEquals(type, result);
    }finally{__CLR4_4_1nfhnfhle6qea1i.R.flushNeeded();}}

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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    // ensure hash key distribution
    

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
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
