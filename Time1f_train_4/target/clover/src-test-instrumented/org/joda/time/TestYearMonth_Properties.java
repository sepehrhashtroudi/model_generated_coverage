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
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1pcupcule6rjd8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pcupcule6rjd8v.R.inc(32862);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32863);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pcupcule6rjd8v.R.inc(32864);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32865);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1pcupcule6rjd8v.R.inc(32867);try{__CLR4_4_1pcupcule6rjd8v.R.inc(32866);
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pcupcule6rjd8v.R.inc(32868);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32869);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32870);zone = DateTimeZone.getDefault();
        __CLR4_4_1pcupcule6rjd8v.R.inc(32871);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32872);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1pcupcule6rjd8v.R.inc(32873);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pcupcule6rjd8v.R.inc(32874);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32875);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pcupcule6rjd8v.R.inc(32876);DateTimeZone.setDefault(zone);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32877);zone = null;
        __CLR4_4_1pcupcule6rjd8v.R.inc(32878);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32879);systemDefaultLocale = null;
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMonth5() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2d4phpdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2d4phpdc(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32880); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32881);YearMonth test1 = new YearMonth(TEST_TIME1); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32882);YearMonth test2 = new YearMonth(TEST_TIME2); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32883);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32884);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32885);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32886);try { 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32887);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32888);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32889);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32890);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32891);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32892);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32893);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32894);try { 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32895);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32896);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertySetMonth360() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnxtv3pdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnxtv3pdt(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32897); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32898);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32899);YearMonth copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32900);check(test, 1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32901);check(copy, 1972, 12); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32902);try { 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32903);test.monthOfYear().setCopy(13); 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32904);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32905);try { 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32906);test.monthOfYear().setCopy(0); 
         __CLR4_4_1pcupcule6rjd8v.R.inc(32907);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertySetTextYear374() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duxevmpe4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duxevmpe4(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32908); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32909);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32910);YearMonth copy = test.year().setCopy("12"); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32911);check(test, 1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32912);check(copy, 12, 6); 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeLenient377() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14drxcspe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14drxcspe9(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32913); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32914);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32915);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32916);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32917);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32918);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32919);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32920);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32921);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32922);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertyGetYear378() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh7c33pej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh7c33pej(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32923); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32924);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32925);assertSame(test.getChronology().year(), test.year().getField()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32926);assertEquals("year", test.year().getName()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32927);assertEquals("Property[year]", test.year().toString()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32928);assertSame(test, test.year().getReadablePartial()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32929);assertSame(test, test.year().getYearMonth()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32930);assertEquals(1972, test.year().get()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32931);assertEquals("1972", test.year().getAsString()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32932);assertEquals("1972", test.year().getAsText()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32933);assertEquals("1972", test.year().getAsText(Locale.FRENCH)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32934);assertEquals("1972", test.year().getAsShortText()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32935);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32936);assertEquals(test.getChronology().years(), test.year().getDurationField()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32937);assertEquals(null, test.year().getRangeDurationField()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32938);assertEquals(9, test.year().getMaximumTextLength(null)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32939);assertEquals(9, test.year().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonth379() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ir3zg2pf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ir3zg2pf0(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32940); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32941);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32942);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32943);check(test, 1972, 6); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32944);check(copy, 1972, 10); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32945);copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32946);check(copy, 1972, 2); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32947);copy = test.monthOfYear().addWrapFieldToCopy(-8); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32948);check(copy, 1972, 10); 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 


public void testPropertyEquals433() {__CLR4_4_1pcupcule6rjd8v.R.globalSliceStart(getClass().getName(),32949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqq7n9pf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcupcule6rjd8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcupcule6rjd8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqq7n9pf9(){try{__CLR4_4_1pcupcule6rjd8v.R.inc(32949); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32950);YearMonth test1 = new YearMonth(11, 11); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32951);YearMonth test2 = new YearMonth(11, 12); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32952);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32953);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32954);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32955);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32956);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32957);assertEquals(false, test1.year().equals(test1.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32958);assertEquals(true, test1.year().equals(test1.year())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32959);assertEquals(false, test1.year().equals(test2.monthOfYear())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32960);assertEquals(true, test1.year().equals(test2.year())); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32961);assertEquals(false, test1.monthOfYear().equals(null)); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32962);assertEquals(false, test1.monthOfYear().equals("any")); 
     __CLR4_4_1pcupcule6rjd8v.R.inc(32963);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear())); 
 }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1pcupcule6rjd8v.R.inc(32964);
        __CLR4_4_1pcupcule6rjd8v.R.inc(32965);assertEquals(year, test.getYear());
        __CLR4_4_1pcupcule6rjd8v.R.inc(32966);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1pcupcule6rjd8v.R.flushNeeded();}}
}
