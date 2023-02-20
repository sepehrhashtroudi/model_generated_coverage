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
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1p9kp9kle6rcmdf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32851,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32744);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32745);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32746);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32747);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1p9kp9kle6rcmdf.R.inc(32749);try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32748);
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32750);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32751);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32752);zone = DateTimeZone.getDefault();
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32753);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32754);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32755);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32756);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32757);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32758);DateTimeZone.setDefault(zone);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32759);zone = null;
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32760);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32761);systemDefaultLocale = null;
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMonth5() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2d4phpa2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2d4phpa2(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32762); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32763);YearMonth test1 = new YearMonth(TEST_TIME1); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32764);YearMonth test2 = new YearMonth(TEST_TIME2); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32765);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32766);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32767);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32768);try { 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32769);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32770);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32771);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32772);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32773);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32774);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32775);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32776);try { 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32777);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32778);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertySetMonth364() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd6cy5paj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd6cy5paj(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32779); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32780);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32781);YearMonth copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32782);check(test, 1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32783);check(copy, 1972, 12); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32784);try { 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32785);test.monthOfYear().setCopy(13); 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32786);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32787);try { 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32788);test.monthOfYear().setCopy(0); 
         __CLR4_4_1p9kp9kle6rcmdf.R.inc(32789);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertySetTextYear378() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quxa1ipau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quxa1ipau(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32790); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32791);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32792);YearMonth copy = test.year().setCopy("12"); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32793);check(test, 1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32794);check(copy, 12, 6); 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeLenient380() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12l37ngpaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12l37ngpaz(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32795); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32796);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32797);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32798);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32799);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32800);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32801);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32802);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32803);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32804);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertyGetYear381() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug2h3bpb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug2h3bpb9(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32805); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32806);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32807);assertSame(test.getChronology().year(), test.year().getField()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32808);assertEquals("year", test.year().getName()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32809);assertEquals("Property[year]", test.year().toString()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32810);assertSame(test, test.year().getReadablePartial()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32811);assertSame(test, test.year().getYearMonth()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32812);assertEquals(1972, test.year().get()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32813);assertEquals("1972", test.year().getAsString()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32814);assertEquals("1972", test.year().getAsText()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32815);assertEquals("1972", test.year().getAsText(Locale.FRENCH)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32816);assertEquals("1972", test.year().getAsShortText()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32817);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32818);assertEquals(test.getChronology().years(), test.year().getDurationField()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32819);assertEquals(null, test.year().getRangeDurationField()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32820);assertEquals(9, test.year().getMaximumTextLength(null)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32821);assertEquals(9, test.year().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertyAddMonth382() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hs13oypbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hs13oypbq(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32822); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32823);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32824);YearMonth copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32825);check(test, 1972, 6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32826);check(copy, 1972, 12); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32827);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32828);check(copy, 1973, 1); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32829);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32830);check(copy, 1972, 1); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32831);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32832);check(copy, 1971, 12); 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 


public void testPropertyEquals433() {__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceStart(getClass().getName(),32833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqq7n9pc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9kp9kle6rcmdf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9kp9kle6rcmdf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqq7n9pc1(){try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32833); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32834);YearMonth test1 = new YearMonth(11, 11); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32835);YearMonth test2 = new YearMonth(11, 12); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32836);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32837);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32838);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32839);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32840);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32841);assertEquals(false, test1.year().equals(test1.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32842);assertEquals(true, test1.year().equals(test1.year())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32843);assertEquals(false, test1.year().equals(test2.monthOfYear())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32844);assertEquals(true, test1.year().equals(test2.year())); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32845);assertEquals(false, test1.monthOfYear().equals(null)); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32846);assertEquals(false, test1.monthOfYear().equals("any")); 
     __CLR4_4_1p9kp9kle6rcmdf.R.inc(32847);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear())); 
 }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p9kp9kle6rcmdf.R.inc(32848);
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32849);assertEquals(year, test.getYear());
        __CLR4_4_1p9kp9kle6rcmdf.R.inc(32850);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p9kp9kle6rcmdf.R.flushNeeded();}}
}
