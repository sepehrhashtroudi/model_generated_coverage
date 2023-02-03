/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1qpnqpnlc8axena{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1qpnqpnlc8axena.R.inc(34619);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34620);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qpnqpnlc8axena.R.inc(34621);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34622);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1qpnqpnlc8axena.R.inc(34624);try{__CLR4_4_1qpnqpnlc8axena.R.inc(34623);
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qpnqpnlc8axena.R.inc(34625);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34626);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34627);zone = DateTimeZone.getDefault();
        __CLR4_4_1qpnqpnlc8axena.R.inc(34628);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34629);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1qpnqpnlc8axena.R.inc(34630);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qpnqpnlc8axena.R.inc(34631);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34632);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qpnqpnlc8axena.R.inc(34633);DateTimeZone.setDefault(zone);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34634);zone = null;
        __CLR4_4_1qpnqpnlc8axena.R.inc(34635);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34636);systemDefaultLocale = null;
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMonth23() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoa3wvqq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoa3wvqq5(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34637); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34638);YearMonth test1 = new YearMonth(TEST_TIME1); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34639);YearMonth test2 = new YearMonth(TEST_TIME2); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34640);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34641);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34642);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34643);try { 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34644);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34645);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34646);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34647);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34648);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34649);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34650);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34651);try { 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34652);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34653);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertySetMonth167() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cch2ukqqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cch2ukqqm(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34654); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34655);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34656);YearMonth copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34657);check(test, 1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34658);check(copy, 1972, 12); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34659);try { 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34660);test.monthOfYear().setCopy(13); 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34661);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34662);try { 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34663);test.monthOfYear().setCopy(0); 
         __CLR4_4_1qpnqpnlc8axena.R.inc(34664);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertyAddMonth262() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141s5xtqqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141s5xtqqx(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34665); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34666);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34667);YearMonth copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34668);check(test, 1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34669);check(copy, 1972, 12); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34670);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34671);check(copy, 1973, 1); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34672);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34673);check(copy, 1972, 1); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34674);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34675);check(copy, 1971, 12); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertySetTextYear340() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9j3xrqr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9j3xrqr8(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34676); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34677);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34678);YearMonth copy = test.year().setCopy("12"); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34679);check(test, 1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34680);check(copy, 12, 6); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeLenient1065() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9d60rqrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9d60rqrd(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34681); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34682);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34683);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34684);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34685);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34686);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34687);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34688);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34689);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34690);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertyEquals1111() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dia3v7qrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dia3v7qrn(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34691); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34692);YearMonth test1 = new YearMonth(11, 11); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34693);YearMonth test2 = new YearMonth(11, 12); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34694);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34695);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34696);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34697);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34698);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34699);assertEquals(false, test1.year().equals(test1.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34700);assertEquals(true, test1.year().equals(test1.year())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34701);assertEquals(false, test1.year().equals(test2.monthOfYear())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34702);assertEquals(true, test1.year().equals(test2.year())); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34703);assertEquals(false, test1.monthOfYear().equals(null)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34704);assertEquals(false, test1.monthOfYear().equals("any")); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34705);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear())); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonth1296() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1168p9tqs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth1296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1168p9tqs2(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34706); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34707);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34708);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34709);check(test, 1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34710);check(copy, 1972, 10); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34711);copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34712);check(copy, 1972, 2); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34713);copy = test.monthOfYear().addWrapFieldToCopy(-8); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34714);check(copy, 1972, 10); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 


public void testPropertyGetYear1657() {__CLR4_4_1qpnqpnlc8axena.R.globalSliceStart(getClass().getName(),34715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6gdpiqsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qpnqpnlc8axena.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qpnqpnlc8axena.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear1657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6gdpiqsb(){try{__CLR4_4_1qpnqpnlc8axena.R.inc(34715); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34716);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34717);assertSame(test.getChronology().year(), test.year().getField()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34718);assertEquals("year", test.year().getName()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34719);assertEquals("Property[year]", test.year().toString()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34720);assertSame(test, test.year().getReadablePartial()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34721);assertSame(test, test.year().getYearMonth()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34722);assertEquals(1972, test.year().get()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34723);assertEquals("1972", test.year().getAsString()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34724);assertEquals("1972", test.year().getAsText()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34725);assertEquals("1972", test.year().getAsText(Locale.FRENCH)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34726);assertEquals("1972", test.year().getAsShortText()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34727);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34728);assertEquals(test.getChronology().years(), test.year().getDurationField()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34729);assertEquals(null, test.year().getRangeDurationField()); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34730);assertEquals(9, test.year().getMaximumTextLength(null)); 
     __CLR4_4_1qpnqpnlc8axena.R.inc(34731);assertEquals(9, test.year().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1qpnqpnlc8axena.R.inc(34732);
        __CLR4_4_1qpnqpnlc8axena.R.inc(34733);assertEquals(year, test.getYear());
        __CLR4_4_1qpnqpnlc8axena.R.inc(34734);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1qpnqpnlc8axena.R.flushNeeded();}}
}
