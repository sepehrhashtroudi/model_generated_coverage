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
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1pdjpdjle6qeaav{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32887);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32888);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32889);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32890);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1pdjpdjle6qeaav.R.inc(32892);try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32891);
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32893);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32894);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32895);zone = DateTimeZone.getDefault();
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32896);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32897);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32898);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32899);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32900);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32901);DateTimeZone.setDefault(zone);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32902);zone = null;
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32903);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32904);systemDefaultLocale = null;
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToMonth6() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbd3hype1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbd3hype1(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32905); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32906);YearMonth test1 = new YearMonth(TEST_TIME1); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32907);YearMonth test2 = new YearMonth(TEST_TIME2); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32908);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32909);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32910);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32911);try { 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32912);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32913);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32914);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32915);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32916);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32917);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32918);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32919);try { 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32920);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32921);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 


public void testPropertySetMonth352() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18g2uwipei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18g2uwipei(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32922); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32923);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32924);YearMonth copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32925);check(test, 1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32926);check(copy, 1972, 12); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32927);try { 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32928);test.monthOfYear().setCopy(13); 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32929);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32930);try { 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32931);test.monthOfYear().setCopy(0); 
         __CLR4_4_1pdjpdjle6qeaav.R.inc(32932);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 


public void testPropertySetTextYear368() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uxmi1pet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uxmi1pet(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32933); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32934);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32935);YearMonth copy = test.year().setCopy("12"); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32936);check(test, 1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32937);check(copy, 12, 6); 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 


public void testPropertyGetYear372() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z7jc9pey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z7jc9pey(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32938); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32939);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32940);assertSame(test.getChronology().year(), test.year().getField()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32941);assertEquals("year", test.year().getName()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32942);assertEquals("Property[year]", test.year().toString()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32943);assertSame(test, test.year().getReadablePartial()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32944);assertSame(test, test.year().getYearMonth()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32945);assertEquals(1972, test.year().get()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32946);assertEquals("1972", test.year().getAsString()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32947);assertEquals("1972", test.year().getAsText()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32948);assertEquals("1972", test.year().getAsText(Locale.FRENCH)); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32949);assertEquals("1972", test.year().getAsShortText()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32950);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32951);assertEquals(test.getChronology().years(), test.year().getDurationField()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32952);assertEquals(null, test.year().getRangeDurationField()); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32953);assertEquals(9, test.year().getMaximumTextLength(null)); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32954);assertEquals(9, test.year().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 


public void testPropertyAddMonth373() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qs80j4pff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qs80j4pff(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32955); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32956);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32957);YearMonth copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32958);check(test, 1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32959);check(copy, 1972, 12); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32960);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32961);check(copy, 1973, 1); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32962);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32963);check(copy, 1972, 1); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32964);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32965);check(copy, 1971, 12); 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonth374() {__CLR4_4_1pdjpdjle6qeaav.R.globalSliceStart(getClass().getName(),32966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12i45hppfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pdjpdjle6qeaav.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pdjpdjle6qeaav.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12i45hppfq(){try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32966); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32967);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32968);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32969);check(test, 1972, 6); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32970);check(copy, 1972, 10); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32971);copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32972);check(copy, 1972, 2); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32973);copy = test.monthOfYear().addWrapFieldToCopy(-8); 
     __CLR4_4_1pdjpdjle6qeaav.R.inc(32974);check(copy, 1972, 10); 
 }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1pdjpdjle6qeaav.R.inc(32975);
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32976);assertEquals(year, test.getYear());
        __CLR4_4_1pdjpdjle6qeaav.R.inc(32977);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1pdjpdjle6qeaav.R.flushNeeded();}}
}
