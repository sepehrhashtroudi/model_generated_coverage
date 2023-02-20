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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1nulnulle6rclzz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1nulnulle6rclzz.R.inc(30909);
        __CLR4_4_1nulnulle6rclzz.R.inc(30910);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nulnulle6rclzz.R.inc(30911);
        __CLR4_4_1nulnulle6rclzz.R.inc(30912);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1nulnulle6rclzz.R.inc(30914);try{__CLR4_4_1nulnulle6rclzz.R.inc(30913);
    }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nulnulle6rclzz.R.inc(30915);
        __CLR4_4_1nulnulle6rclzz.R.inc(30916);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nulnulle6rclzz.R.inc(30917);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nulnulle6rclzz.R.inc(30918);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nulnulle6rclzz.R.inc(30919);originalLocale = Locale.getDefault();
        __CLR4_4_1nulnulle6rclzz.R.inc(30920);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nulnulle6rclzz.R.inc(30921);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nulnulle6rclzz.R.inc(30922);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nulnulle6rclzz.R.inc(30923);
        __CLR4_4_1nulnulle6rclzz.R.inc(30924);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nulnulle6rclzz.R.inc(30925);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nulnulle6rclzz.R.inc(30926);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nulnulle6rclzz.R.inc(30927);Locale.setDefault(originalLocale);
        __CLR4_4_1nulnulle6rclzz.R.inc(30928);originalDateTimeZone = null;
        __CLR4_4_1nulnulle6rclzz.R.inc(30929);originalTimeZone = null;
        __CLR4_4_1nulnulle6rclzz.R.inc(30930);originalLocale = null;
    }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference457() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j2gjinv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j2gjinv7() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30931); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30932);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nulnulle6rclzz.R.inc(30933);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30934);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30935);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(30936);Period.fieldDifference(start, end); 
         __CLR4_4_1nulnulle6rclzz.R.inc(30937);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference258() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1rt25nve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1rt25nve() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30938); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30939);YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30940);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(30941);Period.fieldDifference(ymd, (ReadablePartial) null); 
         __CLR4_4_1nulnulle6rclzz.R.inc(30942);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nulnulle6rclzz.R.inc(30943);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(30944);Period.fieldDifference((ReadablePartial) null, ymd); 
         __CLR4_4_1nulnulle6rclzz.R.inc(30945);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference359() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5x2zjnvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5x2zjnvm() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30946); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30947);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30948);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30949);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(30950);Period.fieldDifference(start, endTime); 
         __CLR4_4_1nulnulle6rclzz.R.inc(30951);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference160() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwho4znvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwho4znvs() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30952); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30953);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30954);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1nulnulle6rclzz.R.inc(30955);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30956);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30957);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30958);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30959);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30960);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30961);assertEquals(-2, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30962);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30963);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30964);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30965);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor161() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quw86jnw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quw86jnw6() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30966); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30967);Period test = new Period(); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30968);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30969);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30970);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30971);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30972);assertEquals(0, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30973);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30974);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30975);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30976);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_long_Chronology264() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn6v1pnwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn6v1pnwh() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30977); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30978);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nulnulle6rclzz.R.inc(30979);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30980);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30981);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30982);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30983);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30984);assertEquals(4, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30985);assertEquals(5, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30986);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30987);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30988);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology465() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),30989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyn1e2nwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyn1e2nwt() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(30989); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30990);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nulnulle6rclzz.R.inc(30991);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30992);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30993);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30994);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30995);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30996);assertEquals(0, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30997);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30998);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(30999);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31000);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_long_long266() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6whgvnx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6whgvnx5() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31001); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31002);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31003);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31004);Period test = new Period(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31005);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31006);assertEquals(1, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31007);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31008);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31009);assertEquals(1, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31010);assertEquals(1, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31011);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31012);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31013);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType267() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lghhqwnxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lghhqwnxi() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31014); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31015);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31016);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31017);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31018);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31019);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31020);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31021);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31022);assertEquals(31, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31023);assertEquals(1, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31024);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31025);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31026);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths70() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvt8txnxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths70",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvt8txnxv() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31027); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31028);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31029);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31030);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31031);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31032);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_RI_RD272() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163ojgvny1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163ojgvny1() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31033); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31034);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31035);Duration dur = null; 
     __CLR4_4_1nulnulle6rclzz.R.inc(31036);Period test = new Period(dt1, dur); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31037);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31038);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31039);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31040);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31041);assertEquals(0, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31042);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31043);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31044);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31045);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_RD_RI_PeriodType174() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1giyj20nye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1giyj20nye() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31046); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31047);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31048);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31049);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31050);Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31051);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31052);assertEquals(1, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31053);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31054);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31055);assertEquals(31, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31056);assertEquals(1, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31057);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31058);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31059);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType175() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrkrv6nys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrkrv6nys() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31060); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31061);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31062);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31063);assertEquals(1, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31064);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31065);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31066);assertEquals(3, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31067);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31068);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31069);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31070);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_RI_RI4446() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g123zjnz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g123zjnz3() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31071); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31072);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31073);DateTime dt2 = null; 
     __CLR4_4_1nulnulle6rclzz.R.inc(31074);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31075);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31076);assertEquals(-3, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31077);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31078);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31079);assertEquals(-1, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31080);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31081);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31082);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31083);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths447() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5nl3rnzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5nl3rnzg() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31084); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31085);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31086);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31087);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31088);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31089);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1448() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0rgsnnzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0rgsnnzm() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31090); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31091);LocalDate dt1 = new LocalDate(2004, 12, 29); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31092);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31093);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31094);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31095);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType3758() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1regpw2nzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1regpw2nzs() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31096); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31097);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31098);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31099);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31100);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31101);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31102);assertEquals(0, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31103);assertEquals(1, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31104);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31105);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31106);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType8821() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13q9c60o03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8821",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13q9c60o03() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31107); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31108);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31109);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31110);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(31111);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nulnulle6rclzz.R.inc(31112);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP4822() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy1vubo09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP4822",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy1vubo09() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31113); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31114);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31115);YearMonthDay dt2 = null; 
     __CLR4_4_1nulnulle6rclzz.R.inc(31116);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(31117);new Period(dt1, dt2); 
         __CLR4_4_1nulnulle6rclzz.R.inc(31118);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType7823() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dkmjfo0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType7823",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dkmjfo0f() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31119); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31120);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31121);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31122);try { 
         __CLR4_4_1nulnulle6rclzz.R.inc(31123);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nulnulle6rclzz.R.inc(31124);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType2826() throws Throwable {__CLR4_4_1nulnulle6rclzz.R.globalSliceStart(getClass().getName(),31125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147j7ezo0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nulnulle6rclzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nulnulle6rclzz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType2826",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147j7ezo0l() throws Throwable{try{__CLR4_4_1nulnulle6rclzz.R.inc(31125); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31126);Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31127);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31128);assertEquals(0, test.getYears()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31129);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31130);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31131);assertEquals(0, test.getDays()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31132);assertEquals(0, test.getHours()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31133);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31134);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nulnulle6rclzz.R.inc(31135);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nulnulle6rclzz.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
