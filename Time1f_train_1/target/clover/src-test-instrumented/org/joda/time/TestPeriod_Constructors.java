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
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1nzbnzble6qea4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nzbnzble6qea4n.R.inc(31079);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31080);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nzbnzble6qea4n.R.inc(31081);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31082);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1nzbnzble6qea4n.R.inc(31084);try{__CLR4_4_1nzbnzble6qea4n.R.inc(31083);
    }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nzbnzble6qea4n.R.inc(31085);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31086);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31087);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nzbnzble6qea4n.R.inc(31088);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nzbnzble6qea4n.R.inc(31089);originalLocale = Locale.getDefault();
        __CLR4_4_1nzbnzble6qea4n.R.inc(31090);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31091);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nzbnzble6qea4n.R.inc(31092);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nzbnzble6qea4n.R.inc(31093);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31094);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nzbnzble6qea4n.R.inc(31095);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31096);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31097);Locale.setDefault(originalLocale);
        __CLR4_4_1nzbnzble6qea4n.R.inc(31098);originalDateTimeZone = null;
        __CLR4_4_1nzbnzble6qea4n.R.inc(31099);originalTimeZone = null;
        __CLR4_4_1nzbnzble6qea4n.R.inc(31100);originalLocale = null;
    }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference464() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhxgpmnzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhxgpmnzx() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31101); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31102);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31103);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31104);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31105);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31106);Period.fieldDifference(start, end); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference265() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0mt89o04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0mt89o04() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31108); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31109);YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31110);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31111);Period.fieldDifference(ymd, (ReadablePartial) null); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31112);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31113);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31114);Period.fieldDifference((ReadablePartial) null, ymd); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31115);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference366() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4s35no0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4s35no0c() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31116); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31117);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31118);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31119);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31120);Period.fieldDifference(start, endTime); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31121);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testFactoryFieldDifference567() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v42o7yo0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v42o7yo0i() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31122); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31123);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31124);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31125);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31126);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31127);Period.fieldDifference(start, end); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31128);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference168() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4mnido0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4mnido0p() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31129); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31130);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31131);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31132);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31133);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31134);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31135);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31136);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31137);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31138);assertEquals(-2, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31139);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31140);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31141);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31142);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor169() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i683gto13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i683gto13() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31143); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31144);Period test = new Period(); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31145);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31146);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31147);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31148);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31149);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31150);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31151);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31152);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31153);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology473() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kum1mho1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kum1mho1e() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31154); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31155);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31156);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31157);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31158);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31159);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31160);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31161);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31162);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31163);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31164);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31165);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths75() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwaz6uo1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths75",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwaz6uo1q() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31166); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31167);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31168);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31169);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31170);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31171);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP277() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekzg3zo1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekzg3zo1w() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31172); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31173);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31174);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31175);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31176);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31177);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31178);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31179);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31180);assertEquals(1, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31181);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31182);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31183);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31184);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType278() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocjevco29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocjevco29() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31185); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31186);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31187);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31188);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31189);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31190);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31191);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31192);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31193);assertEquals(8, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31194);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31195);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31196);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31197);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_RI_RD279() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnb82go2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnb82go2m() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31198); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31199);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31200);Duration dur = null; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31201);Period test = new Period(dt1, dur); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31202);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31203);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31204);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31205);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31206);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31207);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31208);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31209);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31210);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_RD_RI281() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12et0v9o2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12et0v9o2z() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31211); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31212);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31213);Duration dur = null; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31214);Period test = new Period(dur, dt1); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31215);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31216);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31217);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31218);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31219);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31220);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31221);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31222);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31223);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_RD_RI_PeriodType182() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16owfwlo3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16owfwlo3c() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31224); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31225);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31226);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31227);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31228);Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31229);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31230);assertEquals(1, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31231);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31232);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31233);assertEquals(31, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31234);assertEquals(1, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31235);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31236);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31237);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType183() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ob5do3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ob5do3q() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31238); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31239);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31240);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31241);assertEquals(1, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31242);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31243);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31244);assertEquals(3, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31245);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31246);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31247);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31248);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_RI_RI4439() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z16xtho41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z16xtho41() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31249); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31250);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31251);DateTime dt2 = null; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31252);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31253);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31254);assertEquals(-3, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31255);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31256);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31257);assertEquals(-1, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31258);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31259);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31260);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31261);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths440() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4gpc2o4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4gpc2o4e() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31262); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31263);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31264);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31265);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31266);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31267);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1441() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9ctn6o4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9ctn6o4k() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31268); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31269);LocalDate dt1 = new LocalDate(2004, 12, 29); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31270);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31271);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31272);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31273);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType3758() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1regpw2o4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1regpw2o4q() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31274); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31275);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31276);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31277);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31278);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31279);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31280);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31281);assertEquals(1, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31282);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31283);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31284);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_Object3766() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136t4f5o51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3766",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136t4f5o51() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31285); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31286);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime())); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31287);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31288);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31289);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31290);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31291);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31292);assertEquals(1, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31293);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31294);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31295);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType8825() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gq97bwo5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8825",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gq97bwo5c() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31296); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31297);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31298);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31299);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31300);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31301);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP4826() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy1r07o5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP4826",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy1r07o5i() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31302); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31303);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31304);YearMonthDay dt2 = null; 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31305);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31306);new Period(dt1, dt2); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31307);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType6827() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1divuhso5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6827",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1divuhso5o() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31308); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31309);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31310);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31311);try { 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31312);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nzbnzble6qea4n.R.inc(31313);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType2831() throws Throwable {__CLR4_4_1nzbnzble6qea4n.R.globalSliceStart(getClass().getName(),31314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199bv67o5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nzbnzble6qea4n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nzbnzble6qea4n.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType2831",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199bv67o5u() throws Throwable{try{__CLR4_4_1nzbnzble6qea4n.R.inc(31314); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31315);Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31316);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31317);assertEquals(0, test.getYears()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31318);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31319);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31320);assertEquals(0, test.getDays()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31321);assertEquals(0, test.getHours()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31322);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31323);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nzbnzble6qea4n.R.inc(31324);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nzbnzble6qea4n.R.flushNeeded();}} 

    

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
