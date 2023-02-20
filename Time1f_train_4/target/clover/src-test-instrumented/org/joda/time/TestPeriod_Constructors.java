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
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1nz6nz6le6rjd32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31074);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31075);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31076);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31077);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1nz6nz6le6rjd32.R.inc(31079);try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31078);
    }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31080);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31081);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31082);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31083);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31084);originalLocale = Locale.getDefault();
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31085);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31086);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31087);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31088);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31089);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31090);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31091);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31092);Locale.setDefault(originalLocale);
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31093);originalDateTimeZone = null;
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31094);originalTimeZone = null;
        __CLR4_4_1nz6nz6le6rjd32.R.inc(31095);originalLocale = null;
    }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference461() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqxkc7nzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqxkc7nzs() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31096); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31097);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31098);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31099);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31100);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31101);Period.fieldDifference(start, end); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31102);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference262() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9mwuunzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9mwuunzz() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31103); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31104);YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31105);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31106);Period.fieldDifference(ymd, (ReadablePartial) null); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31108);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31109);Period.fieldDifference((ReadablePartial) null, ymd); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31110);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference363() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mds6s8o07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mds6s8o07() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31111); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31112);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31113);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31114);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31115);Period.fieldDifference(start, endTime); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31116);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testFactoryFieldDifference564() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld2rujo0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld2rujo0d() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31117); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31118);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31119);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31120);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31121);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31122);Period.fieldDifference(start, end); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31123);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference165() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5hi3co0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5hi3co0k() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31124); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31125);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31126);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31127);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31128);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31129);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31130);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31131);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31132);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31133);assertEquals(-2, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31134);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31135);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31136);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31137);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor166() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx7zu8o0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx7zu8o0y() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31138); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31139);Period test = new Period(); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31140);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31141);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31142);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31143);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31144);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31145);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31146);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31147);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31148);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_long_Chronology270() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xbto2o19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xbto2o19() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31149); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31150);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31151);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31152);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31153);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31154);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31155);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31156);assertEquals(4, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31157);assertEquals(5, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31158);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31159);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31160);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology471() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rclz7fo1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rclz7fo1l() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31161); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31162);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31163);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31164);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31165);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31166);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31167);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31168);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31169);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31170);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31171);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31172);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_long_long272() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh1g38o1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh1g38o1x() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31173); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31174);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31175);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31176);Period test = new Period(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31177);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31178);assertEquals(1, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31179);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31180);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31181);assertEquals(1, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31182);assertEquals(1, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31183);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31184);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31185);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType273() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qmgd9o2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qmgd9o2a() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31186); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31187);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31188);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31189);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31190);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31191);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31192);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31193);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31194);assertEquals(31, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31195);assertEquals(1, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31196);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31197);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31198);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP277() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekzg3zo2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekzg3zo2n() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31199); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31200);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31201);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31202);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31203);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31204);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31205);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31206);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31207);assertEquals(1, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31208);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31209);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31210);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31211);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType278() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocjevco30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocjevco30() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31212); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31213);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31214);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31215);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31216);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31217);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31218);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31219);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31220);assertEquals(8, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31221);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31222);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31223);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31224);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_RD_RI280() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6xx8o3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6xx8o3d() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31225); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31226);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31227);Duration dur = null; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31228);Period test = new Period(dur, dt1); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31229);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31230);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31231);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31232);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31233);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31234);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31235);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31236);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31237);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_RD_RI_PeriodType181() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fwh44o3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fwh44o3q() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31238); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31239);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31240);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31241);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31242);Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31243);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31244);assertEquals(1, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31245);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31246);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31247);assertEquals(31, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31248);assertEquals(1, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31249);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31250);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31251);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_RI_RI4447() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cs2572o44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cs2572o44() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31252); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31253);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31254);DateTime dt2 = null; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31255);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31256);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31257);assertEquals(-3, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31258);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31259);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31260);assertEquals(-1, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31261);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31262);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31263);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31264);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths448() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwnmbao4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwnmbao4h() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31265); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31266);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31267);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31268);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31269);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31270);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1449() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crri06o4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crri06o4n() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31271); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31272);LocalDate dt1 = new LocalDate(2004, 12, 29); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31273);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31274);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31275);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31276);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType3779() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j22fsho4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3779",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j22fsho4t() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31277); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31278);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31279);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31280);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31281);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31282);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31283);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31284);assertEquals(1, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31285);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31286);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31287);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_Object3782() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lekzmto54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3782",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lekzmto54() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31288); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31289);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime())); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31290);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31291);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31292);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31293);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31294);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31295);assertEquals(1, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31296);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31297);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31298);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType8842() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14m4xxlo5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8842",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14m4xxlo5f() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31299); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31300);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31301);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31302);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31303);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31304);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP4843() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lnlqqo5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP4843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lnlqqo5l() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31305); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31306);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31307);YearMonthDay dt2 = null; 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31308);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31309);new Period(dt1, dt2); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31310);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType6844() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tiarpo5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6844",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tiarpo5r() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31311); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31312);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31313);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31314);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31315);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31316);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType7845() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6b8bo5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType7845",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6b8bo5x() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31317); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31318);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31319);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31320);try { 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31321);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nz6nz6le6rjd32.R.inc(31322);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType2848() throws Throwable {__CLR4_4_1nz6nz6le6rjd32.R.globalSliceStart(getClass().getName(),31323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19axiq3o63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nz6nz6le6rjd32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nz6nz6le6rjd32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType2848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19axiq3o63() throws Throwable{try{__CLR4_4_1nz6nz6le6rjd32.R.inc(31323); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31324);Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31325);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31326);assertEquals(0, test.getYears()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31327);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31328);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31329);assertEquals(0, test.getDays()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31330);assertEquals(0, test.getHours()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31331);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31332);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nz6nz6le6rjd32.R.inc(31333);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nz6nz6le6rjd32.R.flushNeeded();}} 

    

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
