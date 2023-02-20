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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1p3zp3zle6qea9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32642,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32543);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32544);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32545);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32546);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1p3zp3zle6qea9p.R.inc(32548);try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32547);
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32549);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32550);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32551);zone = DateTimeZone.getDefault();
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32552);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32553);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32554);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32555);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32556);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32557);DateTimeZone.setDefault(zone);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32558);zone = null;
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32559);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32560);systemDefaultLocale = null;
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToYear25() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkfccgp4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToYear25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkfccgp4h(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32561); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32562);YearMonthDay test1 = new YearMonthDay(TEST_TIME1); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32563);YearMonthDay test2 = new YearMonthDay(TEST_TIME2); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32564);assertEquals(true, test1.year().compareTo(test2) < 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32565);assertEquals(true, test2.year().compareTo(test1) > 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32566);assertEquals(true, test1.year().compareTo(test1) == 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32567);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32568);test1.year().compareTo((ReadablePartial) null); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32569);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32570);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32571);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32572);assertEquals(true, test1.year().compareTo(dt2) < 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32573);assertEquals(true, test2.year().compareTo(dt1) > 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32574);assertEquals(true, test1.year().compareTo(dt1) == 0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32575);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32576);test1.year().compareTo((ReadableInstant) null); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32577);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertySetMonth29() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj99vxp4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj99vxp4y(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32578); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32579);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32580);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32581);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32582);check(copy, 1972, 12, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32583);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32584);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32585);check(copy, 1972, 2, 29); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32586);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32587);test.monthOfYear().setCopy(13); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32588);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32589);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32590);test.monthOfYear().setCopy(0); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32591);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertyAddYear50() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1738xy1p5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddYear50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1738xy1p5c(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32592); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32593);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32594);YearMonthDay copy = test.year().addToCopy(9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32595);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32596);check(copy, 1981, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32597);copy = test.year().addToCopy(0); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32598);check(copy, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32599);copy = test.year().addToCopy(292277023 - 1972); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32600);check(copy, 292277023, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32601);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32602);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32603);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32604);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32605);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32606);check(copy, 0, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32607);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32608);check(copy, -1, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32609);try { 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32610);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1p3zp3zle6qea9p.R.inc(32611);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32612);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertySetTextDay51() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0hsfrp5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0hsfrp5x(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32613); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32614);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32615);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32616);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32617);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth52() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6i2flp62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6i2flp62(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32618); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32619);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32620);YearMonthDay copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32621);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32622);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth53() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwqahup67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMinimumValueDayOfMonth53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwqahup67(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32623); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32624);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32625);YearMonthDay copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32626);check(test, 1972, 6, 9); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32627);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict500() {__CLR4_4_1p3zp3zle6qea9p.R.globalSliceStart(getClass().getName(),32628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dok3kip6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3zp3zle6qea9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3zp3zle6qea9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dok3kip6c(){try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32628); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32629);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32630);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32631);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32632);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32633);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32634);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32635);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32636);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1p3zp3zle6qea9p.R.inc(32637);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1p3zp3zle6qea9p.R.inc(32638);
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32639);assertEquals(year, test.getYear());
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32640);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1p3zp3zle6qea9p.R.inc(32641);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1p3zp3zle6qea9p.R.flushNeeded();}}
}
