/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Period;

/**
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormat extends TestCase {static class __CLR4_4_1w3ew3elc8axf6c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,41634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale EN = new Locale("en");
    private static final Locale FR = new Locale("fr");
    private static final Locale PT = new Locale("pt");
    private static final Locale ES = new Locale("es");
    private static final Locale DE = new Locale("de");
    private static final Locale NL = new Locale("nl");
    private static final Locale DA = new Locale("da");
    private static final Locale JA = new Locale("ja");

    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41594);
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41595);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41596);
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41597);return new TestSuite(TestPeriodFormat.class);
    }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}}

    public TestPeriodFormat(String name) {
        super(name);__CLR4_4_1w3ew3elc8axf6c.R.inc(41599);try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41598);
    }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41600);
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41601);originalLocale = Locale.getDefault();
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41602);Locale.setDefault(DE);
    }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41603);
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41604);Locale.setDefault(originalLocale);
        __CLR4_4_1w3ew3elc8axf6c.R.inc(41605);originalLocale = null;
    }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_wordBased_nl_formatStandard57() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evo3srw3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatStandard57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evo3srw3q(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41606); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41607);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41608);assertEquals("1 dag, 5 uur, 6 minuten, 7 seconden en 8 milliseconden", PeriodFormat.wordBased(NL).print(p)); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_getDefault_cached187() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vv3jmw3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_cached187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vv3jmw3t(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41609); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41610);assertSame(PeriodFormat.getDefault(), PeriodFormat.getDefault()); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_wordBased_nl_parseTwoFields504() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzov0ww3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseTwoFields504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzov0ww3v(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41611); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41612);Period p = Period.days(2).withHours(5); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41613);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen en 5 uur")); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_wordBased_es_parseTwoFields617() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152dgv1w3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseTwoFields617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152dgv1w3y(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41614); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41615);Period p = Period.days(2).withHours(5); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41616);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas y 5 horas")); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void testSubclassableConstructor654() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8yz2yw41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.testSubclassableConstructor654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8yz2yw41(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41617); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41618);PeriodFormat f = new PeriodFormat() { 
     }; 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41619);assertNotNull(f); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_wordBased_de_FormatOneField1123() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bo60iw44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_FormatOneField1123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bo60iw44(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41620); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41621);Period p = Period.days(2); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41622);assertEquals("2 Tage", PeriodFormat.wordBased(DE).print(p)); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_wordBased_fr_formatStandard1373() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qh5jp3w47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatStandard1373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qh5jp3w47(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41623); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41624);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41625);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p)); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_wordBased_default1380() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bip4xw4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_default1380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bip4xw4a(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41626); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41627);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41628);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased().print(p)); 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 


public void test_getDefault_checkRedundantSeparator1767() {__CLR4_4_1w3ew3elc8axf6c.R.globalSliceStart(getClass().getName(),41629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bg1qp3w4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w3ew3elc8axf6c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w3ew3elc8axf6c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_checkRedundantSeparator1767",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bg1qp3w4d(){try{__CLR4_4_1w3ew3elc8axf6c.R.inc(41629); 
     __CLR4_4_1w3ew3elc8axf6c.R.inc(41630);try { 
         __CLR4_4_1w3ew3elc8axf6c.R.inc(41631);PeriodFormat.getDefault().parsePeriod("2 days and 5 hours "); 
         __CLR4_4_1w3ew3elc8axf6c.R.inc(41632);fail("No exception was caught"); 
     } catch (Exception e) { 
         __CLR4_4_1w3ew3elc8axf6c.R.inc(41633);assertEquals(IllegalArgumentException.class, e.getClass()); 
     } 
 }finally{__CLR4_4_1w3ew3elc8axf6c.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    // getDefault()
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
        
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased() - default locale (de)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale.FRENCH)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale pt)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale es)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale de)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale nl)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale da)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    // wordBased(Locale ja)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
       
    
    //-----------------------------------------------------------------------
    // Cross check languages
    //-----------------------------------------------------------------------
    

    

    

    

}
