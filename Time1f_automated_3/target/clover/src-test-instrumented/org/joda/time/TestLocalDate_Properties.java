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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1ih4ih4le6np4h1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23944);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23945);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23946);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23947);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1ih4ih4le6np4h1.R.inc(23949);try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23948);
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23950);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23951);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23952);zone = DateTimeZone.getDefault();
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23953);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23954);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23955);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23956);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23957);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23958);DateTimeZone.setDefault(zone);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23959);zone = null;
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23960);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(23961);systemDefaultLocale = null;
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToDay289() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),23962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcajwpihm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToDay289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcajwpihm(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23962); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23963);LocalDate test1 = new LocalDate(TEST_TIME1); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23964);LocalDate test2 = new LocalDate(TEST_TIME2); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23965);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23966);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23967);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23968);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23969);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23970);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23971);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23972);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23973);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23974);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23975);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23976);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23977);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23978);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
public void testProperty295() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),23979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fq1j1uii3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testProperty295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fq1j1uii3(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23979); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23980);LocalDate test = new LocalDate(); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23981);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23982);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23983);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23984);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23985);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23986);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23987);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23988);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23989);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23990);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23991);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23992);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23993);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23994);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23995);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23996);test.property(null); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(23997);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
public void testIsSupported_DateTimeFieldType297() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),23998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nodnjpiim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testIsSupported_DateTimeFieldType297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nodnjpiim(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(23998); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(23999);LocalDate test = new LocalDate(COPTIC_PARIS); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24000);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24001);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24002);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24003);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24004);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24005);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24006);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24007);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24008);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24009);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24010);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24011);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24012);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24013);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
public void testPropertyAddWrapFieldToCopyYear313() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),24014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmv9yfij2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyYear313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmv9yfij2(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(24014); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24015);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24016);LocalDate copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24017);check(test, 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24018);check(copy, 1981, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24019);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24020);check(copy, 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24021);check(copy, 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24022);copy = test.year().addWrapFieldToCopy(292278993 - 1972); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24023);check(copy, 292278993, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24024);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(24025);test.year().addWrapFieldToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(24026);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24027);check(test, 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24028);copy = test.year().addWrapFieldToCopy(-1972); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24029);check(copy, 0, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24030);copy = test.year().addWrapFieldToCopy(-1973); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24031);check(copy, -1, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24032);try { 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(24033);test.year().addWrapFieldToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1ih4ih4le6np4h1.R.inc(24034);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24035);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
public void testPropertyWithMaximumValueDayOfMonth315() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),24036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3srkdijo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3srkdijo(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(24036); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24037);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24038);LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24039);check(test, 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24040);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
public void testPropertyWithMinimumValueDayOfMonth316() {__CLR4_4_1ih4ih4le6np4h1.R.globalSliceStart(getClass().getName(),24041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1enifwiijt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ih4ih4le6np4h1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ih4ih4le6np4h1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1enifwiijt(){try{__CLR4_4_1ih4ih4le6np4h1.R.inc(24041); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24042);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24043);check(test.dayOfMonth().withMinimumValue(), 1972, 6, 9); 
     __CLR4_4_1ih4ih4le6np4h1.R.inc(24044);check(test.dayOfMonth().withMaximumValue(), 1972, 6, 9); 
 }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1ih4ih4le6np4h1.R.inc(24045);
        __CLR4_4_1ih4ih4le6np4h1.R.inc(24046);assertEquals(year, test.getYear());
        __CLR4_4_1ih4ih4le6np4h1.R.inc(24047);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ih4ih4le6np4h1.R.inc(24048);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1ih4ih4le6np4h1.R.flushNeeded();}}
}
