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
public class TestPeriodFormat extends TestCase {static class __CLR4_4_1u1wu1wle6qsfpu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,38986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale EN = new Locale("en");
    private static final Locale FR = new Locale("fr");
    private static final Locale PT = new Locale("pt");
    private static final Locale ES = new Locale("es");
    private static final Locale DE = new Locale("de");
    private static final Locale NL = new Locale("nl");
    private static final Locale DA = new Locale("da");
    private static final Locale JA = new Locale("ja");

    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38948);
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38949);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38950);
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38951);return new TestSuite(TestPeriodFormat.class);
    }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}}

    public TestPeriodFormat(String name) {
        super(name);__CLR4_4_1u1wu1wle6qsfpu.R.inc(38953);try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38952);
    }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38954);
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38955);originalLocale = Locale.getDefault();
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38956);Locale.setDefault(DE);
    }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38957);
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38958);Locale.setDefault(originalLocale);
        __CLR4_4_1u1wu1wle6qsfpu.R.inc(38959);originalLocale = null;
    }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_wordBased_nl_parseTwoFields77() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pv9mztu28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseTwoFields77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pv9mztu28(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38960); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38961);Period p = Period.days(2).withHours(5); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38962);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen en 5 uur")); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_wordBased_fr_formatStandard158() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le7r2vu2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatStandard158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le7r2vu2b(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38963); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38964);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38965);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p)); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_wordBased_es_parseTwoFields163() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1gy3u2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseTwoFields163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1gy3u2e(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38966); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38967);Period p = Period.days(2).withHours(5); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38968);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas y 5 horas")); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_getDefault_checkRedundantSeparator169() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg5lfmu2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_checkRedundantSeparator169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg5lfmu2h(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38969); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38970);try { 
         __CLR4_4_1u1wu1wle6qsfpu.R.inc(38971);PeriodFormat.getDefault().parsePeriod("2 days and 5 hours "); 
         __CLR4_4_1u1wu1wle6qsfpu.R.inc(38972);fail("No exception was caught"); 
     } catch (Exception e) { 
         __CLR4_4_1u1wu1wle6qsfpu.R.inc(38973);assertEquals(IllegalArgumentException.class, e.getClass()); 
     } 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void testSubclassableConstructor735() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jfg9iu2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.testSubclassableConstructor735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jfg9iu2m(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38974); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38975);PeriodFormat f = new PeriodFormat() { 
     }; 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38976);assertNotNull(f); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_wordBased_default736() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2xsw3u2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_default736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2xsw3u2p(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38977); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38978);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38979);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased().print(p)); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_wordBased_de_FormatOneField737() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvwk58u2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_FormatOneField737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvwk58u2s(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38980); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38981);Period p = Period.days(2); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38982);assertEquals("2 Tage", PeriodFormat.wordBased(DE).print(p)); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 


public void test_wordBased_nl_formatStandard738() {__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceStart(getClass().getName(),38983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prm0mnu2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u1wu1wle6qsfpu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u1wu1wle6qsfpu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatStandard738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prm0mnu2v(){try{__CLR4_4_1u1wu1wle6qsfpu.R.inc(38983); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38984);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     __CLR4_4_1u1wu1wle6qsfpu.R.inc(38985);assertEquals("1 dag, 5 uur, 6 minuten, 7 seconden en 8 milliseconden", PeriodFormat.wordBased(NL).print(p)); 
 }finally{__CLR4_4_1u1wu1wle6qsfpu.R.flushNeeded();}} 

    

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
