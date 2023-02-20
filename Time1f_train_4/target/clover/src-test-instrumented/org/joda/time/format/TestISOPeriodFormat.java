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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormat extends TestCase {static class __CLR4_4_1u5hu5hle6rjdsf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,39167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

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

    public static void main(String[] args) {try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39077);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39078);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39079);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39080);return new TestSuite(TestISOPeriodFormat.class);
    }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}}

    public TestISOPeriodFormat(String name) {
        super(name);__CLR4_4_1u5hu5hle6rjdsf.R.inc(39082);try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39081);
    }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39083);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39084);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39085);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39086);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39087);originalLocale = Locale.getDefault();
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39088);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39089);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39090);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39091);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39092);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39093);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39094);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39095);Locale.setDefault(originalLocale);
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39096);originalDateTimeZone = null;
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39097);originalTimeZone = null;
        __CLR4_4_1u5hu5hle6rjdsf.R.inc(39098);originalLocale = null;
    }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatStandard_negative182() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3xwfwu63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard_negative182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3xwfwu63(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39099); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39100);Period p = new Period(-1, -2, -3, -4, -5, -6, -7, -8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39101);assertEquals("P-1Y-2M-3W-4DT-5H-6M-7.008S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39102);p = Period.years(-54); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39103);assertEquals("P-54Y", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39104);p = Period.seconds(4).withMillis(-8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39105);assertEquals("PT3.992S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39106);p = Period.seconds(-4).withMillis(8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39107);assertEquals("PT-3.992S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39108);p = Period.seconds(-23); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39109);assertEquals("PT-23S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39110);p = Period.millis(-8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39111);assertEquals("PT-0.008S", ISOPeriodFormat.standard().print(p)); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 


public void testSubclassableConstructor252() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7k57ku6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testSubclassableConstructor252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7k57ku6g(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39112); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39113);ISOPeriodFormat f = new ISOPeriodFormat() { 
     }; 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39114);assertNotNull(f); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 


public void testFormatAlternate254() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180b0knu6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternate254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180b0knu6j(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39115); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39116);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39117);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39118);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39119);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39120);p = new Period(0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39121);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39122);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39123);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39124);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39125);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39126);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39127);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 


public void testFormatAlternateExtended255() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkfovju6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtended255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkfovju6w(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39128); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39129);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39130);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39131);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39132);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39133);p = new Period(0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39134);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39135);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39136);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39137);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39138);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39139);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtended().print(DATE_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39140);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtended().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 


public void testFormatAlternateWithWeeks256() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epbqz2u79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateWithWeeks256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epbqz2u79(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39141); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39142);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39143);assertEquals("P0001W0304T050607.008", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39144);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39145);assertEquals("P0001W0304T050607", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39146);p = new Period(0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39147);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39148);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39149);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39150);assertEquals("P0001W0004T050607.008", ISOPeriodFormat.alternateWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39151);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39152);assertEquals("P0001W0304T000000", ISOPeriodFormat.alternateWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39153);assertEquals("P0000W0000T050607.008", ISOPeriodFormat.alternateWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 


public void testFormatAlternateExtendedWithWeeks257() {__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceStart(getClass().getName(),39154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16du98su7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u5hu5hle6rjdsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u5hu5hle6rjdsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtendedWithWeeks257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16du98su7m(){try{__CLR4_4_1u5hu5hle6rjdsf.R.inc(39154); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39155);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39156);assertEquals("P0001-W03-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39157);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39158);assertEquals("P0001-W03-04T05:06:07", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39159);p = new Period(0); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39160);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39161);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39162);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39163);assertEquals("P0001-W00-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39164);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39165);assertEquals("P0001-W03-04T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1u5hu5hle6rjdsf.R.inc(39166);assertEquals("P0000-W00-00T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1u5hu5hle6rjdsf.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
