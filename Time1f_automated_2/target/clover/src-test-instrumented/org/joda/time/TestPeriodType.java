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
public class TestPeriodType extends TestCase {static class __CLR4_4_1j93j93le6nl8fa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25153,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j93j93le6nl8fa.R.inc(24951);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24952);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j93j93le6nl8fa.R.inc(24953);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24954);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1j93j93le6nl8fa.R.inc(24956);try{__CLR4_4_1j93j93le6nl8fa.R.inc(24955);
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j93j93le6nl8fa.R.inc(24957);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24958);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24959);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j93j93le6nl8fa.R.inc(24960);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j93j93le6nl8fa.R.inc(24961);originalLocale = Locale.getDefault();
        __CLR4_4_1j93j93le6nl8fa.R.inc(24962);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24963);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j93j93le6nl8fa.R.inc(24964);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j93j93le6nl8fa.R.inc(24965);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24966);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j93j93le6nl8fa.R.inc(24967);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24968);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24969);Locale.setDefault(originalLocale);
        __CLR4_4_1j93j93le6nl8fa.R.inc(24970);originalDateTimeZone = null;
        __CLR4_4_1j93j93le6nl8fa.R.inc(24971);originalTimeZone = null;
        __CLR4_4_1j93j93le6nl8fa.R.inc(24972);originalLocale = null;
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForFields6324() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),24973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n4azaj9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n4azaj9p() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(24973); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24974);DurationFieldType[] types = null; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24975);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24976);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24977);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24978);types = new DurationFieldType[0]; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24979);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24980);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24981);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24982);types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24983);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24984);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24985);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24986);types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24987);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24988);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24989);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testForFields5325() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),24990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fmk8ja6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fmk8ja6() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(24990); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24991);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24992);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24993);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24994);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24995);try { 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24996);PeriodType.forFields(types); 
         __CLR4_4_1j93j93le6nl8fa.R.inc(24997);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testForFields6326() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),24998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18548k8jae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18548k8jae() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(24998); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(24999);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25000);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25001);assertEquals(2, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25002);assertEquals(DurationFieldType.centuries(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25003);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25004);assertEquals("StandardNoYearsNoMonthsNoWeeksNoDaysNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25005);assertEquals("PeriodType[StandardNoYearsNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25006);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25007);assertEquals(true, type == PeriodType.forFields(types)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25008);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25009);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25010);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25011);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25012);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testName328() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vuhwjjat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testName328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vuhwjjat() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25013); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25014);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25015);assertEquals("dayTime", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25016);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25017);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25018);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25019);assertEquals("days", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25020);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25021);assertEquals("hours", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25022);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25023);assertEquals("minutes", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25024);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25025);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25026);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25027);assertEquals(true, type == PeriodType.dayTime()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25028);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25029);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25030);assertEquals(true, type.hashCode() == PeriodType.dayTime().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25031);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25032);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testToString331() {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad91yejbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testToString331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad91yejbd(){try{__CLR4_4_1j93j93le6nl8fa.R.inc(25033); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25034);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25035);assertEquals("PeriodType[dayTime]", type.toString()); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testMaskMonths333() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1i9knjbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMonths333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1i9knjbg() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25036); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25037);PeriodType type = PeriodType.standard().withMonthsRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25038);assertEquals(7, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25039);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25040);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25041);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25042);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25043);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25044);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25045);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25046);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25047);assertEquals(true, type.equals(PeriodType.standard().withMonthsRemoved())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25048);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25049);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25050);assertEquals(true, type.hashCode() == PeriodType.standard().withMonthsRemoved().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25051);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25052);assertEquals("StandardNoMonths", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25053);assertEquals("PeriodType[StandardNoMonths]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25054);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testMaskWeeks334() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1hy56jbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskWeeks334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1hy56jbz() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25055); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25056);PeriodType type = PeriodType.standard().withWeeksRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25057);assertEquals(7, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25058);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25059);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25060);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25061);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25062);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25063);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25064);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25065);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25066);assertEquals(true, type.equals(PeriodType.standard().withWeeksRemoved())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25067);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25068);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25069);assertEquals(true, type.hashCode() == PeriodType.standard().withWeeksRemoved().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25070);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25071);assertEquals("StandardNoWeeks", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25072);assertEquals("PeriodType[StandardNoWeeks]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25073);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testMaskDays335() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nymjtzjci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskDays335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nymjtzjci() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25074); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25075);PeriodType type = PeriodType.standard().withDaysRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25076);assertEquals(7, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25077);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25078);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25079);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25080);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25081);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25082);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25083);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25084);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25085);assertEquals(true, type.equals(PeriodType.standard().withDaysRemoved())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25086);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25087);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25088);assertEquals(true, type.hashCode() == PeriodType.standard().withDaysRemoved().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25089);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25090);assertEquals("StandardNoDays", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25091);assertEquals("PeriodType[StandardNoDays]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25092);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testMaskHours336() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9wxccjd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskHours336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9wxccjd1() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25093); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25094);PeriodType type = PeriodType.standard().withHoursRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25095);assertEquals(7, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25096);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25097);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25098);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25099);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25100);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25101);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25102);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25103);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25104);assertEquals(true, type.equals(PeriodType.standard().withHoursRemoved())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25105);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25106);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25107);assertEquals(true, type.hashCode() == PeriodType.standard().withHoursRemoved().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25108);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25109);assertEquals("StandardNoHours", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25110);assertEquals("PeriodType[StandardNoHours]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25111);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
public void testMaskSeconds337() throws Exception {__CLR4_4_1j93j93le6nl8fa.R.globalSliceStart(getClass().getName(),25112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifsddpjdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j93j93le6nl8fa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j93j93le6nl8fa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifsddpjdk() throws Exception{try{__CLR4_4_1j93j93le6nl8fa.R.inc(25112); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25113);PeriodType type = PeriodType.standard().withSecondsRemoved(); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25114);assertEquals(7, type.size()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25115);assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25116);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25117);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25118);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25119);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25120);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25121);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25122);assertEquals(true, type.equals(type)); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25123);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25124);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25125);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25126);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25127);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25128);assertEquals("StandardNoSeconds", type.getName()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25129);assertEquals("PeriodType[StandardNoSeconds]", type.toString()); 
     __CLR4_4_1j93j93le6nl8fa.R.inc(25130);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1j93j93le6nl8fa.R.inc(25131);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25132);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25133);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25134);oos.writeObject(type);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25135);byte[] bytes = baos.toByteArray();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25136);oos.close();
        
        __CLR4_4_1j93j93le6nl8fa.R.inc(25137);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25138);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25139);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25140);ois.close();
        
        __CLR4_4_1j93j93le6nl8fa.R.inc(25141);assertEquals(type, result);
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1j93j93le6nl8fa.R.inc(25142);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25143);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25144);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25145);oos.writeObject(type);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25146);byte[] bytes = baos.toByteArray();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25147);oos.close();
        
        __CLR4_4_1j93j93le6nl8fa.R.inc(25148);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25149);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1j93j93le6nl8fa.R.inc(25150);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1j93j93le6nl8fa.R.inc(25151);ois.close();
        
        __CLR4_4_1j93j93le6nl8fa.R.inc(25152);assertEquals(type, result);
    }finally{__CLR4_4_1j93j93le6nl8fa.R.flushNeeded();}}

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
