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
public class TestISOPeriodFormat extends TestCase {static class __CLR4_4_1tywtywle6rcn5d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,38904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1tywtywle6rcn5d.R.inc(38840);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38841);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tywtywle6rcn5d.R.inc(38842);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38843);return new TestSuite(TestISOPeriodFormat.class);
    }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}}

    public TestISOPeriodFormat(String name) {
        super(name);__CLR4_4_1tywtywle6rcn5d.R.inc(38845);try{__CLR4_4_1tywtywle6rcn5d.R.inc(38844);
    }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tywtywle6rcn5d.R.inc(38846);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38847);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38848);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tywtywle6rcn5d.R.inc(38849);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tywtywle6rcn5d.R.inc(38850);originalLocale = Locale.getDefault();
        __CLR4_4_1tywtywle6rcn5d.R.inc(38851);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38852);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tywtywle6rcn5d.R.inc(38853);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tywtywle6rcn5d.R.inc(38854);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38855);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tywtywle6rcn5d.R.inc(38856);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38857);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38858);Locale.setDefault(originalLocale);
        __CLR4_4_1tywtywle6rcn5d.R.inc(38859);originalDateTimeZone = null;
        __CLR4_4_1tywtywle6rcn5d.R.inc(38860);originalTimeZone = null;
        __CLR4_4_1tywtywle6rcn5d.R.inc(38861);originalLocale = null;
    }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSubclassableConstructor256() {__CLR4_4_1tywtywle6rcn5d.R.globalSliceStart(getClass().getName(),38862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177ka1otzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tywtywle6rcn5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tywtywle6rcn5d.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testSubclassableConstructor256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177ka1otzi(){try{__CLR4_4_1tywtywle6rcn5d.R.inc(38862); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38863);ISOPeriodFormat f = new ISOPeriodFormat() { 
     }; 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38864);assertNotNull(f); 
 }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}} 


public void testFormatAlternate258() {__CLR4_4_1tywtywle6rcn5d.R.globalSliceStart(getClass().getName(),38865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0avqjtzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tywtywle6rcn5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tywtywle6rcn5d.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternate258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0avqjtzl(){try{__CLR4_4_1tywtywle6rcn5d.R.inc(38865); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38866);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38867);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38868);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38869);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38870);p = new Period(0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38871);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38872);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38873);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38874);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38875);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38876);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38877);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}} 


public void testFormatAlternateExtended259() {__CLR4_4_1tywtywle6rcn5d.R.globalSliceStart(getClass().getName(),38878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgohxptzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tywtywle6rcn5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tywtywle6rcn5d.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtended259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgohxptzy(){try{__CLR4_4_1tywtywle6rcn5d.R.inc(38878); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38879);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38880);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38881);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38882);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38883);p = new Period(0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38884);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38885);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38886);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38887);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38888);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38889);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtended().print(DATE_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38890);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtended().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}} 


public void testFormatAlternateWithWeeks260() {__CLR4_4_1tywtywle6rcn5d.R.globalSliceStart(getClass().getName(),38891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hgn6du0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tywtywle6rcn5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tywtywle6rcn5d.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateWithWeeks260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hgn6du0b(){try{__CLR4_4_1tywtywle6rcn5d.R.inc(38891); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38892);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38893);assertEquals("P0001W0304T050607.008", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38894);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38895);assertEquals("P0001W0304T050607", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38896);p = new Period(0); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38897);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38898);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38899);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38900);assertEquals("P0001W0004T050607.008", ISOPeriodFormat.alternateWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38901);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38902);assertEquals("P0001W0304T000000", ISOPeriodFormat.alternateWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1tywtywle6rcn5d.R.inc(38903);assertEquals("P0000W0000T050607.008", ISOPeriodFormat.alternateWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1tywtywle6rcn5d.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
