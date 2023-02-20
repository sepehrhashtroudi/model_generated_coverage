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
public class TestPeriodType extends TestCase {static class __CLR4_4_1ngjngjle6rjczq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,30661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30403);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30404);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30405);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30406);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1ngjngjle6rjczq.R.inc(30408);try{__CLR4_4_1ngjngjle6rjczq.R.inc(30407);
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30409);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30410);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30411);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30412);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30413);originalLocale = Locale.getDefault();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30414);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30415);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ngjngjle6rjczq.R.inc(30416);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30417);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30418);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30419);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30420);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30421);Locale.setDefault(originalLocale);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30422);originalDateTimeZone = null;
        __CLR4_4_1ngjngjle6rjczq.R.inc(30423);originalTimeZone = null;
        __CLR4_4_1ngjngjle6rjczq.R.inc(30424);originalLocale = null;
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testYearWeekDayTime780() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nb5e1cnh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime780",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nb5e1cnh5() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30425); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30426);PeriodType type = PeriodType.yearWeekDayTime(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30427);assertEquals(7, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30428);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30429);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30430);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30431);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30432);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30433);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30434);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30435);assertEquals("YearWeekDayTime", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30436);assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30437);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30438);assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30439);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30440);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30441);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30442);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30443);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testWeeks783() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzvn1onho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWeeks783",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzvn1onho() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30444); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30445);PeriodType type = PeriodType.weeks(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30446);assertEquals(1, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30447);assertEquals(DurationFieldType.weeks(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30448);assertEquals("Weeks", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30449);assertEquals("PeriodType[Weeks]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30450);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30451);assertEquals(true, type == PeriodType.weeks()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30452);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30453);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30454);assertEquals(true, type.hashCode() == PeriodType.weeks().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30455);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30456);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testDays784() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmwkz3ni1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays784",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmwkz3ni1() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30457); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30458);PeriodType type = PeriodType.days(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30459);assertEquals(1, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30460);assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30461);assertEquals("Days", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30462);assertEquals("PeriodType[Days]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30463);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30464);assertEquals(true, type == PeriodType.days()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30465);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30466);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30467);assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30468);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30469);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields1785() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c7lkqnie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields1785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c7lkqnie() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30470); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30471);PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30472);assertSame(PeriodType.years(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30473);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30474);assertSame(PeriodType.months(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30475);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30476);assertSame(PeriodType.weeks(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30477);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30478);assertSame(PeriodType.days(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30479);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30480);assertSame(PeriodType.hours(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30481);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30482);assertSame(PeriodType.minutes(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30483);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30484);assertSame(PeriodType.seconds(), type); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30485);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30486);assertSame(PeriodType.millis(), type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testSeconds787() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134c0swniv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds787",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134c0swniv() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30487); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30488);PeriodType type = PeriodType.seconds(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30489);assertEquals(1, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30490);assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30491);assertEquals("Seconds", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30492);assertEquals("PeriodType[Seconds]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30493);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30494);assertEquals(true, type == PeriodType.seconds()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30495);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30496);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30497);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30498);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30499);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testMaskSeconds788() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jofzh9nj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds788",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jofzh9nj8() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30500); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30501);PeriodType type = PeriodType.standard().withSecondsRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30502);assertEquals(7, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30503);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30504);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30505);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30506);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30507);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30508);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30509);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30510);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30511);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30512);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30513);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30514);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30515);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30516);assertEquals("StandardNoSeconds", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30517);assertEquals("PeriodType[StandardNoSeconds]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30518);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields6789() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfhd6vnjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfhd6vnjr() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30519); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30520);DurationFieldType[] types = null; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30521);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30522);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30523);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30524);types = new DurationFieldType[0]; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30525);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30526);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30527);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30528);types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30529);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30530);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30531);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30532);types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30533);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30534);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30535);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields4790() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynzg6nnk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields4790",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynzg6nnk8() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30536); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30537);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30538);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30539);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30540);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30541);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields7791() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guxjrlnke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields7791",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guxjrlnke() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30542); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30543);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.months() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30544);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.seconds() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30545);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30546);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30547);assertEquals(false, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30548);assertEquals(false, type.equals(type2)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30549);assertEquals(false, type.hashCode() == type2.hashCode()); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields5792() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbave6nkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5792",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbave6nkm() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30550); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30551);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30552);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30553);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30554);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30555);try { 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30556);PeriodType.forFields(types); 
         __CLR4_4_1ngjngjle6rjczq.R.inc(30557);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testForFields2793() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymcu8anku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields2793",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymcu8anku() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30558); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30559);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.hours() }; 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30560);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30561);assertEquals(2, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30562);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30563);assertEquals(DurationFieldType.hours(), type.getFieldType(1)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30564);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30565);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30566);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30567);assertEquals(true, type == PeriodType.forFields(types)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30568);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30569);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30570);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30571);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30572);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testMaskYears794() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6jjk1nl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears794",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6jjk1nl9() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30573); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30574);PeriodType type = PeriodType.standard().withYearsRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30575);assertEquals(7, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30576);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30577);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30578);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30579);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30580);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30581);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30582);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30583);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30584);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30585);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30586);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30587);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30588);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30589);assertEquals("StandardNoYears", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30590);assertEquals("PeriodType[StandardNoYears]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30591);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testMaskTwice2795() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb6pjinls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2795",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb6pjinls() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30592); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30593);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30594);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30595);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30596);type = PeriodType.dayTime(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30597);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30598);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30599);type = PeriodType.dayTime(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30600);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30601);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30602);type = PeriodType.millis(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30603);type2 = type.withDaysRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30604);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30605);type = PeriodType.millis(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30606);type2 = type.withHoursRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30607);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30608);type = PeriodType.millis(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30609);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30610);assertEquals(true, type == type2); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30611);type = PeriodType.millis(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30612);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30613);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testMaskMillis796() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jinz1lnme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis796",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jinz1lnme() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30614); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30615);PeriodType type = PeriodType.standard().withMillisRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30616);assertEquals(7, type.size()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30617);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30618);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30619);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30620);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30621);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30622);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30623);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30624);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30625);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30626);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30627);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30628);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30629);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30630);assertEquals("StandardNoMillis", type.getName()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30631);assertEquals("PeriodType[StandardNoMillis]", type.toString()); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30632);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 


public void testEquals797() throws Exception {__CLR4_4_1ngjngjle6rjczq.R.globalSliceStart(getClass().getName(),30633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug1pv9nmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ngjngjle6rjczq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ngjngjle6rjczq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals797",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug1pv9nmx() throws Exception{try{__CLR4_4_1ngjngjle6rjczq.R.inc(30633); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30634);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30635);assertEquals(true, type.equals(type)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30636);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved())); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30637);assertEquals(false, type.equals(null)); 
     __CLR4_4_1ngjngjle6rjczq.R.inc(30638);assertEquals(false, type.equals("")); 
 }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30639);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30640);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30641);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30642);oos.writeObject(type);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30643);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30644);oos.close();
        
        __CLR4_4_1ngjngjle6rjczq.R.inc(30645);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30646);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30647);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30648);ois.close();
        
        __CLR4_4_1ngjngjle6rjczq.R.inc(30649);assertEquals(type, result);
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1ngjngjle6rjczq.R.inc(30650);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30651);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30652);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30653);oos.writeObject(type);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30654);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30655);oos.close();
        
        __CLR4_4_1ngjngjle6rjczq.R.inc(30656);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30657);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ngjngjle6rjczq.R.inc(30658);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1ngjngjle6rjczq.R.inc(30659);ois.close();
        
        __CLR4_4_1ngjngjle6rjczq.R.inc(30660);assertEquals(type, result);
    }finally{__CLR4_4_1ngjngjle6rjczq.R.flushNeeded();}}

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
