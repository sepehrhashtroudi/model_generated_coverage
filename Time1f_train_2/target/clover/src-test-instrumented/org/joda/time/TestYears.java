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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears extends TestCase {static class __CLR4_4_1paupaule6qsfd1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1paupaule6qsfd1.R.inc(32790);
        __CLR4_4_1paupaule6qsfd1.R.inc(32791);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1paupaule6qsfd1.R.inc(32792);
        __CLR4_4_1paupaule6qsfd1.R.inc(32793);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1paupaule6qsfd1.R.inc(32795);try{__CLR4_4_1paupaule6qsfd1.R.inc(32794);
    }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1paupaule6qsfd1.R.inc(32796);
    }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1paupaule6qsfd1.R.inc(32797);
    }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_parseYears_String661() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7ts6qpb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7ts6qpb2(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32798); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32799);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32800);assertEquals(0, Years.parseYears("P0Y").getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32801);assertEquals(1, Years.parseYears("P1Y").getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32802);assertEquals(-3, Years.parseYears("P-3Y").getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32803);assertEquals(2, Years.parseYears("P2Y0M").getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32804);assertEquals(2, Years.parseYears("P2YT0H0M").getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32805);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32806);Years.parseYears("P1M1D"); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32807);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1paupaule6qsfd1.R.inc(32808);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32809);Years.parseYears("P1YT1H"); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32810);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testMultipliedBy_int662() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4g9pppbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4g9pppbf(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32811); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32812);Years test = Years.years(2); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32813);assertEquals(6, test.multipliedBy(3).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32814);assertEquals(2, test.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32815);assertEquals(-6, test.multipliedBy(-3).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32816);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32817);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32818);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32819);halfMax.multipliedBy(2); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32820);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testFactory_yearsIn_RInterval663() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3qm26pbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval663",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3qm26pbp(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32821); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32822);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32823);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32824);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32825);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32826);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32827);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32828);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32829);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testSerialization665() throws Exception {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy3hcupby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy3hcupby() throws Exception{try{__CLR4_4_1paupaule6qsfd1.R.inc(32830); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32831);Years test = Years.THREE; 
     __CLR4_4_1paupaule6qsfd1.R.inc(32832);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32833);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32834);oos.writeObject(test); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32835);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32836);oos.close(); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32837);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32838);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32839);Years result = (Years) ois.readObject(); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32840);ois.close(); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32841);assertSame(test, result); 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testGetFieldType666() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r82h5fpca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r82h5fpca(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32842); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32843);Years test = Years.years(20); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32844);assertEquals(DurationFieldType.years(), test.getFieldType()); 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testGetPeriodType667() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zuppcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zuppcd(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32845); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32846);Years test = Years.years(20); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32847);assertEquals(PeriodType.years(), test.getPeriodType()); 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testPlus_Years668() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9n5qcpcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9n5qcpcg(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32848); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32849);Years test2 = Years.years(2); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32850);Years test3 = Years.years(3); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32851);Years result = test2.plus(test3); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32852);assertEquals(2, test2.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32853);assertEquals(3, test3.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32854);assertEquals(5, result.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32855);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32856);assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32857);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32858);Years.MAX_VALUE.plus(Years.ONE); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32859);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testMinus_int669() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gabsz6pcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gabsz6pcs(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32860); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32861);Years test2 = Years.years(2); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32862);Years result = test2.minus(3); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32863);assertEquals(2, test2.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32864);assertEquals(-1, result.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32865);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32866);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32867);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32868);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testMinus_Years670() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t776prpd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years670",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t776prpd1(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32869); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32870);Years test2 = Years.years(2); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32871);Years test3 = Years.years(3); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32872);Years result = test2.minus(test3); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32873);assertEquals(2, test2.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32874);assertEquals(3, test3.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32875);assertEquals(-1, result.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32876);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32877);assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32878);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32879);Years.MIN_VALUE.minus(Years.ONE); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32880);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 


public void testDividedBy_int671() {__CLR4_4_1paupaule6qsfd1.R.globalSliceStart(getClass().getName(),32881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yc07ftpdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1paupaule6qsfd1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1paupaule6qsfd1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yc07ftpdd(){try{__CLR4_4_1paupaule6qsfd1.R.inc(32881); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32882);Years test = Years.years(12); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32883);assertEquals(6, test.dividedBy(2).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32884);assertEquals(12, test.getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32885);assertEquals(4, test.dividedBy(3).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32886);assertEquals(3, test.dividedBy(4).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32887);assertEquals(2, test.dividedBy(5).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32888);assertEquals(2, test.dividedBy(6).getYears()); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32889);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1paupaule6qsfd1.R.inc(32890);try { 
         __CLR4_4_1paupaule6qsfd1.R.inc(32891);Years.ONE.dividedBy(0); 
         __CLR4_4_1paupaule6qsfd1.R.inc(32892);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1paupaule6qsfd1.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
